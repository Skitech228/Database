package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseTableUpdate
{
    Scanner scan = new Scanner(System.in);
    String url = "jdbc:mysql://localhost:3306/hotel";
    String login = "root";
    String password = "Skitech228";
    public void Hotel_Room_Update() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Enter the name of the updated field, the field value and the ID of the updated table");
                System.out.println("List of fields");
                String str = "Room_ID"+"\n" +
                        "Capacity"+"\n" +
                        "Price"+"\n" +
                        "Room_Tipe_ID"+"\n" +
                        "Service_ID";
                System.out.println(str);
                stmt.executeUpdate("Update hotel_room "+"SET "+scan.next()+"="+scan.next()
                        +" where Room_ID="+
                        scan.nextInt());
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Shift_Update() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Enter the name of the updated field, the field value and the ID of the updated table");
                System.out.println("List of fields");
                String str = "Shift_ID"+"\n" +
                        "Shift_Name"+"\n" +
                        "Work_Start_Time"+"\n" +
                        "Work_End_Time";
                System.out.println(str);
                stmt.executeUpdate("Update shift "+"SET "+scan.next()+"="+scan.next()
                        +" where Shift_ID="+
                        scan.nextInt());
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Staff_Update() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Enter the name of the updated field, the field value and the ID of the updated table");
                System.out.println("List of fields");
                String str = "Passport_Number" + "\n" +
                        "First_Name"+"\n" +
                        "Sekond_Name" + "\n" +
                        "Post_ID" + "\n" +
                        "Working_Days"+"\n" +
                        "Shift_ID" ;
                System.out.println(str);
                stmt.executeUpdate("Update staff "+"SET "+scan.next()+"="+scan.next()
                        +" where Passport_Number="+
                        scan.nextInt());
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Visitor_Update() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Enter the name of the updated field, the field value and the ID of the updated table");
                System.out.println("List of fields");
                String str = "Passport_Number" +"\n" +
                        "First_Name"+"\n" +
                        "Sekond_Name" +"\n" +
                        "Patronymic"+"\n" +
                        "Phone_Number";
                System.out.println(str);
                stmt.executeUpdate("Update visitor "+"SET "+scan.next()+"="+scan.next()
                        +" where Passport_Number="+
                        scan.nextInt());
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Service_Update() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Enter the name of the updated field, the field value and the ID of the updated table");
                System.out.println("List of fields");
                String str = "Service_ID"+"\n" +
                        "Price"+"\n" +
                        "Service_Name" +"\n" +
                        "Staff_ID";
                System.out.println(str);
                stmt.executeUpdate("Update service "+"SET "+scan.next()+"="+scan.next()
                        +" where Service_ID="+
                        scan.nextInt());
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Room_Tipe_Update() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Enter the name of the updated field, the field value and the ID of the updated table");
                System.out.println("List of fields");
                String str = "Room_Tipe_ID"+"\n" +
                        "Tipe_Title"+"\n" +
                        "Tipe_Description";
                System.out.println(str);
                stmt.executeUpdate("Update room_tipe "+"SET "+scan.next()+"="+scan.next()
                        +" where Room_Tipe_ID="+
                        scan.nextInt());
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Pre_Order_Update() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Enter the name of the updated field, the field value and the ID of the updated table");
                System.out.println("List of fields");
                String str = "Room_ID" + "\n" +
                        "Visitor_ID"+"\n" +
                        "Pre_Order_Date"+"\n" +
                        "Duration_of_Check_in";
                System.out.println(str);
                stmt.executeUpdate("Update pre_order "+"SET "+scan.next()+"="+scan.next()
                        +" where Room_ID="+
                        scan.nextInt());
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Post_Update() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Enter the name of the updated field, the field value and the ID of the updated table");
                System.out.println("List of fields");
                String str = "Post_ID"+"\n" +
                        "Post_Description"+"\n" +
                        "Salary";
                System.out.println(str);
                stmt.executeUpdate("Update post "+"SET "+scan.next()+"="+scan.next()
                        +" where Post_ID="+
                        scan.nextInt());
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Occupied_Room_Update() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                System.out.println("Enter the name of the updated field, the field value and the ID of the updated table");
                System.out.println("List of fields");
                String str = "Room_ID"+"\n"+
                        "Visitor_ID"+"\n"+
                        "Check_in_Date"+"\n" +
                        "Duration_of_Check_in";
                System.out.println(str);
                Statement stmt = con.createStatement();
                stmt.executeUpdate("Update occupied_room "+"SET "+scan.next()+"="+scan.next()
                        +" where Room_ID="+
                        scan.nextInt());
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
