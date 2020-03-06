package com.Prankur.SpringAssignment_1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
@Primary
public class QuickSort implements SortAlgorithm
{
    public int[] sort(int[] array)
    {
        //{implementation for Quick search}
        Arrays.sort(array);

        //return resulted array
        return array;
    }
}
