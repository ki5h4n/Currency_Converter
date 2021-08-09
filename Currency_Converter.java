package com.lolypolystar;
import java.util.Scanner;
public class Currency_Converter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("1. Rupees To Euro");
        System.out.println("2. Rupees To USD");
        System.out.println("3. Rupees To Pound");

        System.out.println("Choose One From The Options");

        int exchange = obj.nextInt();

        switch (exchange) {
                case 1: {
                    System.out.println("Enter The Number Of Rupees : ");
                    double rs_to_e = obj.nextDouble();
                    if (rs_to_e >= 0) {
                        System.out.println(rs_to_e + "Rupees is" + rs_to_e * 0.01148400788 + "Euro");
                    } else {
                        System.out.println("Please Put in positive numbers!");
                    }
                    break;
                }


                case 2: {
                    System.out.println("Enter The Number Of Rupees : ");
                    double rupees_to_usd = obj.nextDouble();
                    if (rupees_to_usd >= 0) {
                        System.out.println(rupees_to_usd + "is " + rupees_to_usd * 0.015152 + " USD ");
                    } else {
                        System.out.println("Please Put a Positive Number : ");
                    }
                    break;
                }


                case 3: {
                    System.out.println("Enter The Number Of Rupees : ");
                    double rupees_to_p = obj.nextDouble();
                    if (rupees_to_p >= 0) {
                        System.out.println(rupees_to_p + "is " + rupees_to_p * 1.28 + "Pounds");
                    } else {
                        System.out.println("Please Enter Positive Number");
                    }
                    break;
                }
        }
    }

}








