package healthycoderapp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import java.lang.ArithmeticException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;

class BMICalculatorTest {

    @Nested
    class is_diet_reccomended
    {
        @ParameterizedTest
        @CsvSource(value = {"83.0, 1.77", "80.0, 1.72", "90.0, 1.75"})
        void should_return_true_when_dietReccomended(Double coderWeight, Double coderHeight)
        {
            //given
            double weight = coderWeight;
            double height = coderHeight;

            //when
            boolean recommended = BMICalculator.isDietRecommended(weight,height);

            //then
            assertTrue(recommended);
        }
        @Test
        void should_return_false_when_diet_Not_Reccomended()
        {
            //given
            double weight = 59;
            double height = 1.73;

            //when
            boolean recommended = BMICalculator.isDietRecommended(weight,height);

            //then
            assertFalse(recommended);
        }

        @Test
        void should_Throws_exception_when_HeightZero()
        {
            //given
            double weight = 59.0;
            double height = 0.0;

            //when
            Executable executable =  () -> BMICalculator.isDietRecommended(weight,height);

            //then
            assertThrows(ArithmeticException.class, executable);
        }

        @Test
        void should_return_Coder_with_worst_BMI_when_coderlist_notEmpty()
        {
            //given
            List<Coder> coders = new ArrayList<>();
            coders.add(new Coder(1.80,60.0));
            coders.add(new Coder(1.82,98.0));
            coders.add(new Coder(1.82,64.0));

            //when
            Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

            //then
            assertAll(
                    () ->   assertEquals(1.82,coderWorstBMI.getHeight()),
                    () -> assertEquals(98.0, coderWorstBMI.getWeight())
            );
        }
    }
    @Test
    void should_return_Null_Worst_BMI_when_CoderListEmpty()
    {
        //given
        List<Coder> coders = new ArrayList<>();

        //when
        Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

        //then
        assertNull(coderWorstBMI);
    }
    @Test
    void should_return_correct_BMI_Score_Array()
    {
        //given
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80,60.0));
        coders.add(new Coder(1.82,98.0));
        coders.add(new Coder(1.82,64.7));
        double[] expected = {18.52,29.59,19.53};

        //when
        double[] BMIScores = BMICalculator.getBMIScores(coders);

        //then
        assertArrayEquals(expected, BMIScores);
    }

    @Test
    void should_return_BMI_When_Height_Not_ZeroCalculate_BMI()
    {
        //given
        double height = 1.89;
        double weight = 100.45;
        double expected = 28.12;

        //when
        double actual = BMICalculator.calculateBMI(new Coder(height,weight));

        //then
        assertEquals(expected,actual);

    }
}