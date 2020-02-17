package edu.pdx.cs410J.theLastOnes;

public class Flight {
    int start;
    int end;
    int price;

    Flight(int start,int duration, int price) {
        this.start = start;
        this.end = start + duration;
        this.price = price;
    }
}
