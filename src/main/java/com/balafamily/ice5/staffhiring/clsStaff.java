/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balafamily.ice5.staffhiring;

/**
 *
 * @author KhanyisaB
 */
public abstract class clsStaff 
{
    private int StaffNumber;
    private String StaffLocation;
    private String StaffHiringProcess;
    
    public clsStaff(int StaffNumber, String StaffLocation)
    {
        this.StaffNumber = StaffNumber;
        this.StaffLocation = StaffLocation;     
    }
    
    public int getStaffNumber()
    {
        return StaffNumber;
    }
    
    public String getStaffLocation()
    {
        return StaffLocation;
    }
    
    public String getHiringStaffProcess()
    {
        return StaffHiringProcess;
    }
    
}
