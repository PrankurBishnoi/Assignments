package healthycoderapp;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DietPlannerTest {

    private DietPlanner dietPlanner;

    @BeforeEach
    void setup()
    {
        this.dietPlanner = new DietPlanner(20,30,50);
    }

    @Test
    void should_Return_CorrectDietPlan_When_correctCoder()
    {
        //given
        Coder coder = new Coder(1.82,75.0,26,Gender.MALE);
        DietPlan expected = new DietPlan(2202, 110,73,275);

        //when
        DietPlan actual = dietPlanner.calculateDiet(coder);

        //then
        assertAll(
                () -> assertEquals(expected.getCalories(),actual.getCalories()),
                () -> assertEquals(expected.getProtein(),actual.getProtein()),
                () -> assertEquals(expected.getFat(),actual.getFat()),
                () -> assertEquals(expected.getCarbohydrate(),actual.getCarbohydrate())
        );
    }

    @Test
    void shouldReturn_Correct_BMR_When_Correct_Coder()
    {
        //given
        double height = 1.89;
        double weight = 100.45;
        int expectedBMR = 2374;

        //when
        Coder coder = new Coder(height,weight);
        int returnedBMR = dietPlanner.calculateBMR(coder);

        //then
        assertEquals(expectedBMR,returnedBMR);

    }

}