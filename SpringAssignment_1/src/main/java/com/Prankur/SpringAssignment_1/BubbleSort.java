package com.Prankur.SpringAssignment_1;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BubbleSort implements SortAlgorithm
{
    public int[] sort(int[] array)
    {
        //{implementation for bubble search}
        Arrays.sort(array);

        //return resulted array
        return array;
    }
}
