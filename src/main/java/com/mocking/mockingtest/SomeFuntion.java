package com.mocking.mockingtest;

public class SomeFuntion {
    private DataService dataService;

    public SomeFuntion(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int[] data = dataService.retrieveAllData();
        for (int i : data) {
            if (i > greatest) {
                greatest = i;
            }
        }
        return greatest;
    }

    int findSmallest() {
        int smallest = 1;
        int[] data = dataService.smalldata();
        for (int i : data) {
            if (i <= smallest) {
                smallest = i;
            }
        }
        return smallest;
    }
}
