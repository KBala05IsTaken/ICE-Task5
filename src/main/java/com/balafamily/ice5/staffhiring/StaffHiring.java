/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balafamily.ice5.staffhiring;

/**
 *
 * @author KhanyisaB
 */
public class StaffHiring extends clsStaff
{
    public StaffHiring(int StaffNumber, String StaffLocation)
    {
        super(StaffNumber, StaffLocation);
    }
    
    public void PrintStaffHiring()
    {
        System.out.println("STAFF HIRING REPORT");
        System.out.println("**************************************************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getHiringStaffProcess());
    }
}
