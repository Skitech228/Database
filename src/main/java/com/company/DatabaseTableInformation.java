package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTableInformation
{
    String url = "jdbc:mysql://localhost:3306/hotel";
    String login = "root";
    String password = "Skitech228";

    public void Hotel_Room_Information() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM hotel_room");
                while (rs.next()) {
                    String str = "Room_ID" + ":" + rs.getString(1)+"\n" +
                    "Capacity"+":" + rs.getString(2)+"\n" +
                    "Price" + ":" + rs.getString(3)+"\n" +
                    "Room_Tipe_ID"+":" + rs.getString(4)+"\n" +
                    "Service_ID" + ":" + rs.getString(5);
                    System.out.println(str);
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Shift_Information() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM shift");
                while (rs.next()) {
                    String str = "Shift_ID" + ":" + rs.getString(1)+"\n" +
                            "Shift_Name"+":" + rs.getString(2)+"\n" +
                            "Work_Start_Time" + ":" + rs.getString(3)+"\n" +
                            "Work_End_Time"+":" + rs.getString(4);
                    System.out.println(str);
                    System.out.println();
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Staff_Information() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM staff");
                while (rs.next()) {
                    String str = "Passport_Number" + ":" + rs.getString(1)+"\n" +
                            "First_Name"+":" + rs.getString(2)+"\n" +
                            "Sekond_Name" + ":" + rs.getString(3)+"\n" +
                            "Post_ID" + ":" + rs.getString(4)+"\n" +
                            "Working_Days" + ":" + rs.getString(5)+"\n" +
                            "Shift_ID" + ":" + rs.getString(6);
                    System.out.println(str);
                    System.out.println();
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Visitor_Information() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM visitor");
                while (rs.next()) {
                    String str = "Passport_Number" + ":" + rs.getString(1)+"\n" +
                            "First_Name"+":" + rs.getString(2)+"\n" +
                            "Sekond_Name" + ":" + rs.getString(3)+"\n" +
                            "Patronymic"+":" + rs.getString(4)+"\n" +
                            "Phone_Number"+":" + rs.getString(5);
                    System.out.println(str);
                    System.out.println();
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Service_Information() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM service");
                while (rs.next()) {
                    String str = "Service_ID" + ":" + rs.getString(1)+"\n" +
                            "Price"+":" + rs.getString(2)+"\n" +
                            "Service_Name" + ":" + rs.getString(3)+"\n" +
                            "Staff_ID"+":" + rs.getString(4);
                    System.out.println(str);
                    System.out.println();
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Room_Tipe_Information() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM room_tipe");
                while (rs.next()) {
                    String str = "Room_Tipe_ID" + ":" + rs.getString(1)+"\n" +
                            "Tipe_Title"+":" + rs.getString(2)+"\n" +
                            "Tipe_Description" + ":" + rs.getString(3);
                    System.out.println(str);
                    System.out.println();
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Pre_Order_Information() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM pre_order");
                while (rs.next()) {
                    String str = "Room_ID" + ":" + rs.getString(1)+"\n" +
                            "Visitor_ID"+":" + rs.getString(2)+"\n" +
                            "Pre_Order_Date" + ":" + rs.getString(3)+"\n" +
                            "Duration_of_Check_in"+":" + rs.getString(4);
                    System.out.println(str);
                    System.out.println();
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Post_Information() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM post");
                while (rs.next()) {
                    String str = "Post_ID" + ":" + rs.getString(1)+"\n" +
                            "Post_Description"+":" + rs.getString(2)+"\n" +
                            "Salary" + ":" + rs.getString(3);
                    System.out.println(str);
                    System.out.println();
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Occupied_Room_Information() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM occupied_room");
                while (rs.next()) {
                    String str = "Room_ID" + ":" + rs.getString(1)+"\n" +
                            "Visitor_ID"+":" + rs.getString(2)+"\n" +
                            "Check_in_Date" + ":" + rs.getString(3)+"\n" +
                            "Duration_of_Check_in"+":" + rs.getString(4);
                    System.out.println(str);
                    System.out.println();
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
