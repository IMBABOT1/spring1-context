package ru.geekbrains.spring1.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.spring1.context.configs.AppConfig;
import ru.geekbrains.spring1.context.temp.Cart;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);

    private static void addOreDeleteProduct(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Cart cart = context.getBean(Cart.class);

        while (true) {
            System.out.println("set number to add product");
            System.out.println("press /end to exit");

            String line = scanner.nextLine();
            if (line.equals("/end")) {
                break;
            } else if (line.equals("/add1")) {
                cart.addProductById(1l);
                System.out.println(cart.findAll());
            } else if (line.equals("/add2")) {
                cart.addProductById(2l);
                System.out.println(cart.findAll());
            } else if (line.equals("/add3")) {
                cart.addProductById(3l);
                System.out.println(cart.findAll());
            } else if (line.equals("/add4")) {
                cart.addProductById(4l);
                System.out.println(cart.findAll());
            } else if (line.equals("/add5")) {
                cart.addProductById(5l);
                System.out.println(cart.findAll());
            } else if (line.equals("/dell1")) {
                cart.deleteProductByID(1l);
                System.out.println(cart.findAll());
            } else if (line.equals("/dell2")) {
                cart.deleteProductByID(2l);
                System.out.println(cart.findAll());
            } else if (line.equals("/dell3")) {
                cart.deleteProductByID(3l);
                System.out.println(cart.findAll());
            } else if (line.equals("/dell4")) {
                cart.deleteProductByID(4l);
                System.out.println(cart.findAll());
            } else if (line.equals("/dell5")) {
                cart.deleteProductByID(5l);
                System.out.println(cart.findAll());
            } else {
                addOreDeleteProduct();
            }
        }
    }

    public static void main(String[] args) {
        addOreDeleteProduct();

    }
}

