/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.Manager;
import model.*;

/**
 *
 * @author A
 */
public class Main {

    public static void main(String[] args) {
        Country c = new Country();
        
        new Manager(c).run();
    }
    
}