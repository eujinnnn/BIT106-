/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        int choice;
        
        Scanner sc = new Scanner(System.in);
        
        while (true){
            System.out.println("User Management: ");
            System.out.println("1. Edit User");
            System.out.println("2. View User Details");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            user userManage = new user();

            switch (choice){
                case 1:
                    user.editUser();
                    return;

                case 2:
                    user.viewUser();
                    return;

                default:
                    System.out.println("Enter the correct choice.");
                    break;
            }
        }
    }
}
