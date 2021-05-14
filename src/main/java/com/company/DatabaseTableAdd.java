package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class DatabaseTableAdd
{
    Scanner scan = new Scanner(System.in);
    String url = "jdbc:mysql://localhost:3306/hotel";
    String login = "root";
    String password = "Skitech228";

    public void Hotel_Room_Add() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                System.out.println("Input values Room ID,Price,Capacity,Room Tipe ID,Service_ID");
                String sql=("INSERT INTO hotel_room VALUES " +
                        "("+scan.nextInt()+","+scan.nextDouble()+","+scan.nextInt()+","+scan.nextInt()+","+scan.nextInt()+")");
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.execute();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Shift_Add() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                System.out.println("Input values Shift ID,Shift Name,Work Start Time('00:00:00'),Work End Time('00:00:00')");
                String sql=("INSERT INTO shift VALUES " +
                        "("+scan.nextInt()+","+scan.next()+","+scan.next()+","+scan.next()+")");
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.execute();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Staff_Add() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                System.out.println("Input values Passport Number,First Name,Second Name,Post ID,Working Days in format day,day,...,Shift ID");
                String sql=("INSERT INTO staff VALUES " +
                        "("+scan.nextInt()+","+scan.next()+","+scan.next() +","+scan.nextInt()+","+scan.next()+","+scan.nextInt()+")");
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.execute();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Visitor_Add() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                System.out.println("Input values Passport Number,First Name,Second Name,Patronymic,Phone Number");
                String sql=("INSERT INTO visitor VALUES " +
                        "("+scan.nextInt()+","+scan.next()+","+scan.next() +","+scan.next()+","+scan.next()+")");
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.execute();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Service_Add() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                System.out.println("Input values Service ID,Price,Service Name,Staff ID");
                String sql=("INSERT INTO service VALUES " +
                        "("+scan.nextInt()+","+scan.nextDouble()+","+scan.next() +","+scan.nextInt()+")");
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.execute();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Room_Tipe_Add() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                System.out.println("Input values Room Tipe ID,Tipe Title,Tipe Description(comma separated)");
                String sql=("INSERT INTO room_tipe VALUES " +
                        "("+scan.nextInt()+","+scan.next()+","+scan.next()+")");
                System.out.println(sql);
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.execute();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Pre_Order_Add() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                System.out.println("Input values Room ID,Visitor ID,Check-in Date в формате 'YYYY,MM,DD',Duration of Check-in");
                String sql=("INSERT INTO pre_order VALUES " +
                        "("+scan.nextInt()+","+scan.nextInt()+","+scan.next()+","+scan.nextInt()+")");
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.execute();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Post_Add() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                System.out.println("Input values Post ID,Post Description,Salary");
                String sql=("INSERT INTO post VALUES " +
                        "("+scan.nextInt()+","+scan.next()+","+scan.nextDouble()+")");
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.execute();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Occupied_Room_Add() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            try {
                System.out.println("Input values Room ID,Visitor ID,Check-in Date в формате 'YYYY,MM,DD',Duration of Check-in");
                String sql=("INSERT INTO occupied_room VALUES " +
                        "("+scan.nextInt()+","+scan.nextInt()+","+scan.next()+","+scan.nextInt()+")");
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.execute();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
