/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class EmployeeDetailHistory {
    
    private ArrayList<EmployeeDetails> history;
    
    public EmployeeDetailHistory(){
        this.history = new ArrayList<EmployeeDetails>();
    }

    public ArrayList<EmployeeDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeDetails> history) {
        this.history = history;
    }
    
    public EmployeeDetails addNewEmployees(){
        EmployeeDetails newEmployees = new EmployeeDetails();
        history.add(newEmployees);
        return newEmployees;
    }
    
    public void deleteEmployee(EmployeeDetails ed){
        history.remove(ed);
    }
}
