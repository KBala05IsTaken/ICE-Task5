/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balafamily.movieticketsales.bexam;

/**
 *
 * @author KhanyisaB
 */

// MovieTickets implements the IMovieTickets interface.
public class clsMovieTickets implements IMovieTickets {

    // Calculates the total sales for one movie.
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {

        int total = 0;

        // Loop through the array and add all sales.
        for (int sales : movieTicketSales) {
            total += sales;
        }

        return total;
    }

    // Finds the movie with the highest total sales.
    @Override
    public String TopMovie(String[] movies, int[] totalSales) {

        // Assume the first movie has the highest sales.
        int highestIndex = 0;

        // Compare the sales of the remaining movies.
        for (int i = 1; i < totalSales.length; i++) {

            if (totalSales[i] > totalSales[highestIndex]) {
                highestIndex = i;
            }
        }

        // Return the name of the top-performing movie.
        return movies[highestIndex];
    }
}
