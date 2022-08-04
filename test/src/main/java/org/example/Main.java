package org.example;

import javax.swing.*;
import java.util.ArrayList;
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
//        String day = JOptionPane.showInputDialog("Enter a day");
//
//         switch(day) {
//            case "Sunday":JOptionPane.showMessageDialog(null,"Its sunday");
//            break;
//            case "Monday": JOptionPane.showMessageDialog(null,"Its Monday");
//            break;
//            case "Tuesday": JOptionPane.showMessageDialog(null,"Its Tuesday");
//            break;
//            case "Wednesday": JOptionPane.showMessageDialog(null,"Its Wednesday");
//             break;
//             case "Thursday": JOptionPane.showMessageDialog(null,"Its Thursday");
//             break;
//             case "Friday": JOptionPane.showMessageDialog(null,"Its Friday");
//             break;
//             default: JOptionPane.showMessageDialog(null,"That is not a day");
//        }
           //nested loops
//        Scanner scanner = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol ="";
//
//        System.out.println("Enter # of rows ");
//        rows = scanner.nextInt();
//        System.out.println("Enter # of columns ");
//        columns = scanner.nextInt();
//        System.out.println("Choose a symbol ");
//        symbol = scanner.next();
//        for(int i=1; i<=rows;i++){
//            System.out.println();
//            for (int j=1; j<=columns;j++){
//                System.out.print(symbol);
//            }
//        }
              //2d arrays
//        String[][] cars = new String[3][3];
//
//        cars[0][0] = "Camaro";
//        cars[0][1] = "Corvette";
//        cars[0][2] = "Silverado";
//        cars[1][0] = "Mustang";
//        cars[1][1] = "Ranger";
//        cars[1][2] = "F-150";
//        cars[2][0] = "Ferrari";
//        cars[2][1] = "Lambo";
//        cars[2][2] = "Tesla";
//        for(int i=0; i< cars.length;i++){
//            System.out.println();
//            for (int j=0; j<cars[i].length;j++){
//                System.out.print(cars[i][j]+" ");
//            }
//        }
               //ArrayList
//        ArrayList<String> food = new ArrayList<String>();
//         food.add("pizza");
//         food.add("hamburger");
//         food.add("hotdog");
//
//         food.set(0,"sushi");
//         food.remove(2);
//         food.clear();
//
//         for (int i=0; i<food.size();i++){
//             System.out.println(food.get(i));
//         }
            //2d ArrayList
//        ArrayList<ArrayList<String>> groceryList =new ArrayList();
//
//        ArrayList<String> bakeryList =new ArrayList();
//        bakeryList.add("pasta");
//        bakeryList.add("garlic bread");
//        bakeryList.add("donuts");
//
//        ArrayList<String> produceList =new ArrayList();
//        produceList.add("tomatoes");
//        produceList.add("zucchini");
//        produceList.add("peppers");
//
//        ArrayList<String> drinkList =new ArrayList();
//        drinkList.add("soda");
//        drinkList.add("water");
//
//        groceryList.add(bakeryList);
//        groceryList.add(produceList);
//        groceryList.add(drinkList);
//
//        System.out.println(groceryList);

        //for-each loop

        ArrayList<String> animals =new ArrayList<String>();
        animals.add("dog");
        animals.add("cat");
        animals.add("rat");
        animals.add("bat");
        for (String i: animals) {
            System.out.println(i);
        }







    }
}