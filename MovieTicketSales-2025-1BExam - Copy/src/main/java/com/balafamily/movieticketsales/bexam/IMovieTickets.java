/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.balafamily.movieticketsales.bexam;

/**
 *
 * @author KhanyisaB
 */
// Interface containing the methods required
// for calculating movie ticket sales.
public interface IMovieTickets {

    // Calculates and returns the total sales
    // from the monthly ticket sales array.
    int TotalMovieSales(int[] movieTicketSales);

    // Determines and returns the movie with
    // the highest total ticket sales.
    String TopMovie(String[] movies, int[] totalSales);
}
