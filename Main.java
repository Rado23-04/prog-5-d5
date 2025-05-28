import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Parfum> parfums = new ArrayList<>();
        parfums.add(new Parfum("Vanille", 2500.00, 5));
        parfums.add(new Parfum("Chocolat", 3000.00, 0));
        parfums.add(new Parfum("Noisette", 2000.00, 3));

        MachineCafe machineCafe = new MachineCafe(parfums);
        User user = new User(7500.00);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the coffee machine!");
        boolean continuer = true;

        while (continuer) {
            System.out.println("\nYour Balance : " + user.getBalance());
            machineCafe.ShowParfumList();

            System.out.print("Enter Parfum name (or 'out') : ");
            String nomParfum = scanner.nextLine();

            if (nomParfum.equalsIgnoreCase("out")) {
                continuer = false;
                break;
            }

            System.out.print("How many coffee do you want ");
            int quantite;

            try {
                quantite = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            machineCafe.BuyCoffee(user, nomParfum, quantite);
        }

        System.out.println("Thanks for using the coffee machine!");
        scanner.close();
    }
}
