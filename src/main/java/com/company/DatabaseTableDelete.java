package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseTableDelete
{
    String url = "jdbc:mysql://localhost:3306/hotel";
    String login = "root";
    String password = "Skitech228";

    public void Hotel_Room_Delete() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Введите удаляемый ID");
                Scanner scan = new Scanner(System.in);
                int id = scan.nextInt();
                stmt.executeUpdate("DELETE FROM hotel_room WHERE Room_ID="+id);
                System.out.println("Successfully");
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Shift_Delete() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Введите удаляемый ID");
                Scanner scan = new Scanner(System.in);
                int id = scan.nextInt();
                stmt.executeUpdate("DELETE FROM shift WHERE Shift_ID="+id);
                System.out.println("Successfully");
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Staff_Delete() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Введите удаляемый ID");
                Scanner scan = new Scanner(System.in);
                int id = scan.nextInt();
                stmt.executeUpdate("DELETE FROM staff WHERE Passport_Number="+id);
                System.out.println("Successfully");
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Visitor_Delete() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Введите удаляемый ID");
                Scanner scan = new Scanner(System.in);
                int id = scan.nextInt();
                stmt.executeUpdate("DELETE FROM visitor WHERE Passport_Number="+id);
                System.out.println("Successfully");
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Service_Delete() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Введите удаляемый ID");
                Scanner scan = new Scanner(System.in);
                int id = scan.nextInt();
                stmt.executeUpdate("DELETE FROM service WHERE Service_ID="+id);
                System.out.println("Successfully");
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Room_Tipe_Delete() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Введите удаляемый ID");
                Scanner scan = new Scanner(System.in);
                int id = scan.nextInt();
                stmt.executeUpdate("DELETE FROM room_tipe WHERE Room_Tipe_ID="+id);
                System.out.println("Successfully");
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Pre_Order_Delete() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Введите удаляемый ID");
                Scanner scan = new Scanner(System.in);
                int id = scan.nextInt();
                stmt.executeUpdate("DELETE FROM pre_order WHERE Room_ID="+id);
                System.out.println("Successfully");
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Post_Delete() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Введите удаляемый ID");
                Scanner scan = new Scanner(System.in);
                int id = scan.nextInt();
                stmt.executeUpdate("DELETE FROM post WHERE Post_ID="+id);
                System.out.println("Successfully");
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Occupied_Room_Delete() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                System.out.println("Введите удаляемый ID");
                Scanner scan = new Scanner(System.in);
                int id = scan.nextInt();
                stmt.executeUpdate("DELETE FROM occupied_room WHERE Room_ID="+id);
                System.out.println("Successfully");
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
