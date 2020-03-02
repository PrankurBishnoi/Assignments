package com.im;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;

public class FirstTest {

    @Nested
    class Replace
    {
        @Test
        void shouldReturnMainStringWhenMainStringIsEmpty()
        {
            //given
            String mainString = " ";
            String subString = "abc";
            String replacementString = "xyz";

            //when
            First first = new First();
            String returnedString = first.replaceSubString(mainString,subString,replacementString);

            //then
            Assert.assertEquals(mainString,returnedString);
        }

        @Test
        void shouldReturnMainStringWhenSubStringIsNull()
        {
            //given
            String mainString = "abcdef";
            String subString = null;
            String replacementString = "xyz";

            //when
            First first = new First();
            String returnedString = first.replaceSubString(mainString,subString,replacementString);

            //then
            Assert.assertEquals(mainString,returnedString);
        }

        @Test
        void shouldReturnMainStringWhenReplaceStringIsNull()
        {
            //given
            String mainString = "abcdef";
            String subString = "abc";
            String replacementString = null;

            //when
            First first = new First();
            String returnedString = first.replaceSubString(mainString,subString,replacementString);

            //then
            Assert.assertEquals(mainString,returnedString);
        }

        @Test
        void shouldReturnMainStringWhenMainStringDoesntContainSubstring()
        {
            //given
            String mainString = " abcdef";
            String subString = "ghi";
            String replacementString = "xyz";

            //when
            First first = new First();
            String returnedString = first.replaceSubString(mainString,subString,replacementString);

            //then
            Assert.assertEquals(mainString,returnedString);
        }

        @Test
        void shouldReturnMainStringWhenMainStringContainSubstring()
        {
            //given
            String mainString = "abcdef";
            String subString = "def";
            String replacementString = "xyz";
            String expectedString = "abcxyz";

            //when
            First first = new First();
            String returnedString = first.replaceSubString(mainString,subString,replacementString);

            //then
            Assert.assertEquals(expectedString,returnedString);
        }
    }

    @Test
    void shouldReturn_Odd_Element_List()
    {
        //given
        int[] array = new int[]{1,3,5};

        //when
        First first = new First();
        List<Integer> returnedList = first.filterEvenElements(IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList()));
        Object[] array1 = returnedList.toArray();

        //then
        Assert.assertThat(array,is(array1));
    }

    @Test
    void should_Throw_Runtime_Exception_When_Value_is_Null()
    {
        //given
        List<BigDecimal> bigDecimals = Arrays.asList();

        //when
        First first = new First();
        Throwable throwable = assertThrows(RuntimeException.class,()-> first.calculateAverage(bigDecimals));

        //then
        System.out.println(throwable.getMessage());
    }

    @Test
    void should_Returned_Average_Of_BigDecimallist()
    {
        //given
        List<BigDecimal> bigDecimals = new ArrayList<>();
        bigDecimals.add(BigDecimal.valueOf(500000));
        bigDecimals.add(BigDecimal.valueOf(150000));
        bigDecimals.add(BigDecimal.valueOf(400000));
        BigDecimal expectedvalue = new BigDecimal("350000");

        //when
        First first = new First();
        BigDecimal returnedNumber = first.calculateAverage(bigDecimals);

        ///then
        Assert.assertEquals(expectedvalue,returnedNumber);
    }

    @Test
    void should_Returned_False_If_String_Is_Not_Palindrome()
    {
        //given
        String str = "abcd";

        //when
        First first = new First();
        boolean returnedValue = first.isPallindrome(str);

        //then
        Assert.assertFalse(returnedValue);
    }

    void should_Return_True_If_String_Is_Palindrome()
    {
        //given
        String str = "aaabbbaaa";

        //when
        First first = new First();
        boolean returnedvalue = first.isPallindrome(str);

        //then
        Assert.assertTrue(returnedvalue);
    }
}