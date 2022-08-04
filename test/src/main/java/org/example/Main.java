package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //GUI
//        String name = JOptionPane.showInputDialog("enter your name");
//        JOptionPane.showMessageDialog(null,"hello" +name);
          //.Math
//        double x;
//        double y;
//        double z;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter side x: ");
//        x = scanner.nextDouble();
//        System.out.println("Enter side y: ");
//        y = scanner.nextDouble();
//        z = Math.sqrt((x*x)+(y*y));
//        System.out.println("the answer is " + z);
          //Switch/case
        String day = JOptionPane.showInputDialog("Enter a day");

         switch(day) {
            case "Sunday":JOptionPane.showMessageDialog(null,"Its sunday");
            break;
            case "Monday": JOptionPane.showMessageDialog(null,"Its Monday");
            break;
            case "Tuesday": JOptionPane.showMessageDialog(null,"Its Tuesday");
            break;
            case "Wednesday": JOptionPane.showMessageDialog(null,"Its Wednesday");
             break;
             case "Thursday": JOptionPane.showMessageDialog(null,"Its Thursday");
             break;
             case "Friday": JOptionPane.showMessageDialog(null,"Its Friday");
             break;
             default: JOptionPane.showMessageDialog(null,"That is not a day");
        }
    }
}