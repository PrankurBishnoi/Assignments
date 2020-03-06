package com.Prankur.SpringAssignment_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchLooslyCoupled
{
    @Autowired
    private SortAlgorithm sortAlgorithm;

    //Constructor Injection
    public BinarySearchLooslyCoupled(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    //Setter Injection
//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearchImplementation(int array[], int numberToSearch)
    {
        //Sorting The Array
        //By interface
        array = sortAlgorithm.sort(array);
        System.out.println(sortAlgorithm);

        //Search the Array for element
        // {Some Code to search array}

        //Return the Result
        return 3; //index of the element
    }
}
