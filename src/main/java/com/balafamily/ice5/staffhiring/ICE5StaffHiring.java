/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.balafamily.ice5.staffhiring;
import java.util.Scanner;


/**
 *
 * @author KhanyisaB
 */
public class ICE5StaffHiring {

    public static void main(String[] args) 
    {
        Scanner scnInput = new Scanner(System.in);
        String Hiring;
        int numStaff;
        
        System.out.println("Enter the current Staff number: ");
        numStaff = scnInput.nextInt();
        System.out.println("Enter the staff hiring location: ");
        Hiring = scnInput.nextLine();
        scnInput.next();

        StaffHiring objHir = new StaffHiring(numStaff, Hiring);
        objHir.PrintStaffHiring();
    }
}
