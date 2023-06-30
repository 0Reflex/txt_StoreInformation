/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package txt_StoreInformation;

/**
 *
 * @author Emine
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    

import java.util.Scanner;

public class Test {
    
     public static void post(User u , String p) {
     u.addPost(p);
     }

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        User user = new User ("Emine", "Aydın", "Emineaydn@gmail.com", "Relax", "123123", 1);
        System.out.println("Wellome!!!");
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter surname: ");
        String surName = input.nextLine();
        System.out.println("Enter email: ");
        String email = input.nextLine();
        System.out.println("Enter username: ");
        String userName = input.nextLine();
        System.out.println("Enter password: ");
        String password = input.nextLine();
        user.login("123123");       
        
       user.signUp();
        user.addPost("post-1");
        user.addPost("post-2");
        user.addPost("AIRPLANE");
        user.addPost("COMPUTER");
        user.viewProfile();

    }
    
}

    
