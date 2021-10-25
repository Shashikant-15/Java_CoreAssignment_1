package assign_11;


import java.util.Objects;
import java.util.Scanner;

public class Coffee_shop_Method {

        static String str;
        static int price;
        static  int token_no;

        void Cashier()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("============::: Coffee Shop :::=========");
            System.out.println("We are Having these Flavours for the Coffee:");
            System.out.println("MORGAN REASE =======> 40Rs\n" +
                    " Ristretto: =======> 30 Rs\n" +
                    " Piccolo Latte =======> 60 Rs\n" +
                    " Macchiato ========> 20 Rs\n" +
                    " Antoccino =========> 50 Rs");
            System.out.println("Enter Your Order :");
            str=sc.nextLine();
            System.out.println("Please pay the price of "+str+"flavour:");
            price = sc.nextInt();

        }
        void Customer()
        {
            if ((Objects.equals(str, "MORGAN REASE")) && (price == 20))
            {
                token_no=51;
                System.out.println("Your Token no is :"+token_no);
                System.out.println("please Wait 2 min for Your order :");
            }
            else if((Objects.equals(str, "Ristretto")) &&(price == 30))
            {   token_no=101;
                System.out.println("Your Token no is  :"+token_no);
                System.out.println("please Wait 3 min for Your order :");
            }
            else if((Objects.equals(str, "Piccolo Latte"))&&(price == 40))
            {
                token_no=121;
                System.out.println("Your Token no is :"+token_no);
                System.out.println("please Wait 2 min for Your order :");
            }
            else if((Objects.equals(str, "Macchiato"))&&(price ==50))
            {
                token_no=211;
                System.out.println("Your Token no is  :"+token_no);
                System.out.println("please Wait 4 min for Your order :");
            }
            else if((Objects.equals(str, "Antoccino"))&&(price == 60))
            {
                token_no=351;
                System.out.println("Your Token no is :"+token_no);
                System.out.println("please Wait 3 min for Your order :");
            }
            else
            {
                System.out.println("Either Your choice is not available in our store or you have not paid right amount  :");
            }

        }
        void Barista() {
            if (token_no == 51) {
                System.out.println("please collect Your Order"+str);
                System.out.println("You have paid Rs"+ price +" for Your Order");
            }
            if (token_no == 101) {
                System.out.println("please collect Your Order"+str);
                System.out.println("You have paid Rs"+ price +" for Your Order");
            }
            if (token_no == 121) {
                System.out.println("please collect Your Order"+str);
                System.out.println("You have paid Rs"+ price +" for Your Order");
            }
            if (token_no == 211) {
                System.out.println("please collect Your Order"+str);
                System.out.println("You have paid Rs"+ price +" for Your Order");
            }
            if (token_no == 351) {
                System.out.println("please collect Your Order :"+str);
                System.out.println("You have paid Rs "+ price +" for Your Order");
            }
        }
    }

