package com.Prankur.SpringAssignment_1;

public class BinarySearchTightlyCoupled
{
    public int binarySearchImplementation(int array[],int numberToSearch)
    {
        //Sorting The Array
        // Bubble Sort implementation
        BubbleSort bubbleSort = new BubbleSort();
        array = bubbleSort.sort(array);
        // Quick Sort Implementation
        QuickSort quickSort = new QuickSort();
        array = quickSort.sort(array);

        //Search the Array for element
        // {Some Code to search array}

        //Return the Result
        return 3; //index of the element
    }
}
