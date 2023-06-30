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


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.OutputStreamWriter;

public class User {
    private final String name;
    private final String surname;
    private String email;
    private String userName;
    private String password;
    private String address;
    private final String userFilePath;
    private final String postFilePath;
    private final File userFile;
    private final File postFile;
    
    public User(String name, String surname, String email, String userName, String password, int mode){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.userFilePath = this.email + ".txt";
        this.postFilePath = this.email + "_.posts.txt";
        this.userFile = new File(userFilePath);
        this.postFile = new File(postFilePath);
    }

    User(String name, String surName, String email, String password, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
    public void viewProfile(){
        try {
            Scanner scanner = new Scanner(this.postFile);
            while (scanner.hasNextLine()) {
                String post = scanner.nextLine();
                System.out.println(post);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Read error!");
    }
    }
    public void addPost(String post){
        try {
            FileOutputStream fos = new FileOutputStream(this.postFile,true);
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos))) {
                bw.write(post + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
    }
    }
    public void login(String pwd){
        if(this.userFile.exists())
        {
            String password = " ";
            try {
            Scanner sc = new Scanner(this.userFile);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] details = line.split(",");
                password = details[4];
            }

            if(pwd.equals(password))
            {
                System.out.println("Login was successful!");
            }
            else
            {
                System.out.println("Login was not successful!");
            }

        } catch (FileNotFoundException e) {         
            e.printStackTrace();
        }
        }
    }
    public void signUp(){
        try {
            FileOutputStream fos = new FileOutputStream(this.userFile);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            String line = this.name + "," + this.surname + "," + this.email + "," + this.userName + "," + this.password;
            bw.write(line);
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
    }
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

  
}

