package Homework33;

import Homework33.Soda;

public class Main {


        public static void main(String[] args) {

            Soda Dushes = new Soda("Sandora", "pear", "Gas");
            System.out.println(Dushes);
            System.out.println(Dushes.getTaste());
            Dushes.setTaste("apple");
            System.out.println(Dushes.getTaste());




        }
    }

