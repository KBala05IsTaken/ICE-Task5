package com.balafamily.movieticketsales.bexam;

// Main application for the Movie Ticket Sales Report.
public class MovieTicketSales20251BExam {

    public static void main(String[] args) {

        // Single-dimensional array storing movie names.
        String[] movies = {
            "Napoleon",
            "Oppenheimer"
        };

        // Array storing the names of the months.
        String[] months = {
            "JAN", "FEB", "MAR"
        };

        // Two-dimensional array storing ticket sales.
        // Each row represents a movie.
        // Each column represents a month.
        int[][] ticketSales = {
            {3000, 1500, 1700},
            {3500, 1200, 1600}
        };

        // Single-dimensional array storing total sales.
        int[] totalSales = new int[movies.length];

        // Create an object of the MovieTickets class.
        clsMovieTickets movieTickets = new clsMovieTickets();

        // Calculate total sales for each movie.
        for (int i = 0; i < movies.length; i++) {

            // Pass each movie's monthly sales to the method.
            totalSales[i] =
                movieTickets.TotalMovieSales(ticketSales[i]);
        }

        // Display the report heading.
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println();

        // Display the month headings.
        System.out.printf("%-20s", "");

        for (String month : months) {
            System.out.printf("%-15s", month);
        }

        System.out.println();

        // Display a separator line.
        System.out.println("-----------------------------------------------");

        // Display movie names and their monthly sales.
        for (int i = 0; i < movies.length; i++) {

            System.out.printf("%-20s", movies[i]);

            for (int j = 0; j < ticketSales[i].length; j++) {

                System.out.printf("%-15d", ticketSales[i][j]);
            }

            System.out.println();
        }

        System.out.println();

        // Display the total ticket sales for each movie.
        for (int i = 0; i < movies.length; i++) {

            System.out.println(
                "Total movie ticket sales for "
                + movies[i] + " " + totalSales[i]
            );
        }

        System.out.println();

        // Determine the top-performing movie.
        String topMovie = movieTickets.TopMovie(
            movies, totalSales
        );

        // Display the top-performing movie.
        System.out.println(
            "Top performing movie: " + topMovie
        );
    }
}

