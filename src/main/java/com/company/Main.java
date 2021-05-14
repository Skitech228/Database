package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     int mainMenuSwitcher=0;
     while(mainMenuSwitcher!=5)
     {
         System.out.println("Select an action" + "\n");
         System.out.println("1:Add");
         System.out.println("2:Delete");
         System.out.println("3:Update");
         System.out.println("4:Show Information");
         System.out.println("5:Exit");
         mainMenuSwitcher = scan.nextInt();
         switch (mainMenuSwitcher)
         {
             case 1:
             {
                 int infoSwitcher = 0;
                 while (infoSwitcher != 10)
                 {
                     DatabaseTableAdd add = new DatabaseTableAdd();
                     System.out.println("Select a table to add information" + "\n");
                     System.out.println("1:Hotel Room");
                     System.out.println("2:Shift");
                     System.out.println("3:Occupied Room");
                     System.out.println("4:Post");
                     System.out.println("5:Pre Order");
                     System.out.println("6:Room Tipe");
                     System.out.println("7:Service");
                     System.out.println("8:Visitor");
                     System.out.println("9:Staff");
                     System.out.println("10:Exit");
                     System.out.println();
                     infoSwitcher = scan.nextInt();
                     System.out.println();
                     switch (infoSwitcher) {
                         case 1: {
                             add.Hotel_Room_Add();
                             break;
                         }
                         case 2: {
                             add.Shift_Add();
                             break;
                         }
                         case 3: {
                             add.Occupied_Room_Add();
                             break;
                         }
                         case 4: {
                             add.Post_Add();
                             break;
                         }
                         case 5: {
                             add.Pre_Order_Add();
                             break;
                         }
                         case 6: {
                             add.Room_Tipe_Add();
                             break;
                         }
                         case 7: {
                             add.Service_Add();
                             break;
                         }
                         case 8: {
                             add.Visitor_Add();
                             break;
                         }
                         case 9: {
                             add.Staff_Add();
                             break;
                         }
                     }
                 }
                 break;
             }
             case 2:
             {
                 DatabaseTableDelete tableDelete = new DatabaseTableDelete();
                 int infoSwitcher = 0;
                 while (infoSwitcher != 10)
                 {
                     System.out.println("Select a table to delete information" + "\n");
                     System.out.println("1:Hotel Room");
                     System.out.println("2:Shift");
                     System.out.println("3:Occupied Room");
                     System.out.println("4:Post");
                     System.out.println("5:Pre Order");
                     System.out.println("6:Room Tipe");
                     System.out.println("7:Service");
                     System.out.println("8:Visitor");
                     System.out.println("9:Staff");
                     System.out.println("10:Exit");
                     System.out.println();
                     infoSwitcher = scan.nextInt();
                     System.out.println();
                     switch (infoSwitcher) {
                         case 1: {
                             tableDelete.Hotel_Room_Delete();
                             break;
                         }
                         case 2: {
                             tableDelete.Shift_Delete();
                             break;
                         }
                         case 3: {
                             tableDelete.Occupied_Room_Delete();
                             break;
                         }
                         case 4: {
                             tableDelete.Post_Delete();
                             break;
                         }
                         case 5: {
                             tableDelete.Pre_Order_Delete();
                             break;
                         }
                         case 6: {
                             tableDelete.Room_Tipe_Delete();
                             break;
                         }
                         case 7: {
                             tableDelete.Service_Delete();
                             break;
                         }
                         case 8: {
                             tableDelete.Visitor_Delete();
                             break;
                         }
                         case 9: {
                             tableDelete.Staff_Delete();
                             break;
                         }
                     }
                 }
                 break;
             }
             case 3:
             {
                 int infoSwitcher = 0;
                 while (infoSwitcher != 10)
                 {
                     DatabaseTableUpdate tableUpdate = new DatabaseTableUpdate();
                     System.out.println("Select a table to update information" + "\n");
                     System.out.println("1:Hotel Room");
                     System.out.println("2:Shift");
                     System.out.println("3:Occupied Room");
                     System.out.println("4:Post");
                     System.out.println("5:Pre Order");
                     System.out.println("6:Room Tipe");
                     System.out.println("7:Service");
                     System.out.println("8:Visitor");
                     System.out.println("9:Staff");
                     System.out.println("10:Exit");
                     System.out.println();
                     infoSwitcher = scan.nextInt();
                     System.out.println();
                     switch (infoSwitcher) {
                         case 1: {
                             tableUpdate.Hotel_Room_Update();
                             break;
                         }
                         case 2: {
                             tableUpdate.Shift_Update();
                             break;
                         }
                         case 3: {
                             tableUpdate.Occupied_Room_Update();
                             break;
                         }
                         case 4: {
                             tableUpdate.Post_Update();
                             break;
                         }
                         case 5: {
                             tableUpdate.Pre_Order_Update();
                             break;
                         }
                         case 6: {
                             tableUpdate.Room_Tipe_Update();
                             break;
                         }
                         case 7: {
                             tableUpdate.Service_Update();
                             break;
                         }
                         case 8: {
                             tableUpdate.Visitor_Update();
                             break;
                         }
                         case 9: {
                             tableUpdate.Staff_Update();
                             break;
                         }
                     }
                 }
                 break;
             }
             case 4:
             {
                 DatabaseTableInformation tableInformation = new DatabaseTableInformation();
                 int infoSwitcher = 0;
                 while (infoSwitcher != 10) {
                     System.out.println("Select a table to display information" + "\n");
                     System.out.println("1:Hotel Room");
                     System.out.println("2:Shift");
                     System.out.println("3:Occupied Room");
                     System.out.println("4:Post");
                     System.out.println("5:Pre Order");
                     System.out.println("6:Room Tipe");
                     System.out.println("7:Service");
                     System.out.println("8:Visitor");
                     System.out.println("9:Staff");
                     System.out.println("10:Exit");
                     System.out.println();
                     infoSwitcher = scan.nextInt();
                     System.out.println();
                     switch (infoSwitcher) {
                         case 1: {
                             tableInformation.Hotel_Room_Information();
                             break;
                         }
                         case 2: {
                             tableInformation.Shift_Information();
                             break;
                         }
                         case 3: {
                             tableInformation.Occupied_Room_Information();
                             break;
                         }
                         case 4: {
                             tableInformation.Post_Information();
                             break;
                         }
                         case 5: {
                             tableInformation.Pre_Order_Information();
                             break;
                         }
                         case 6: {
                             tableInformation.Room_Tipe_Information();
                             break;
                         }
                         case 7: {
                             tableInformation.Service_Information();
                             break;
                         }
                         case 8: {
                             tableInformation.Visitor_Information();
                             break;
                         }
                         case 9: {
                             tableInformation.Staff_Information();
                             break;
                         }
                     }
             }
                 break;
             }
         }
     }
    }
}
