package com.employee;
import java.util.*;

public class main {
    public static <employee> void main(String[] args) {
        LinkedList<employeedata> c = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        int ch;
        do {
            System.out.println("1.insert data");
            System.out.println("2.display the entries");
            System.out.println("3.search data");
            System.out.println("4.delete the data");
            System.out.println("5.update the data");
            System.out.println("Enter the details :");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter employeeid:");
                    int employeeid = s.nextInt();
                    System.out.println("enter employeename:");
                    String employeename = s1.nextLine();
                    System.out.println("enter position:");
                    String position = s1.nextLine();
                    System.out.println("enter joined date:");
                    String joineddate=s2.nextLine();

                    c.add(new employeedata(employeeid, employeename, position, joineddate));
                    break;

                case 2:
                    System.out.println("-------------------");
                    Iterator<employeedata> i = c.iterator();
                    while (i.hasNext()) {
                        employeedata e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("-------------------");
                    break;

                case 3:
                    boolean found = false;
                    System.out.println("enter employeeid to search:");
                    employeeid = s.nextInt();
                    System.out.println("-------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        employeedata e = i.next();
                        if (e.getEmployeeid() == employeeid) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    System.out.println("-------------------");
                    if (!found) {
                        System.out.println("record not found");
                    }
                    System.out.println("-------------------");
                    break;

                case 4:

                    found = false;
                    System.out.println("enter employeeid to delete:");
                    employeeid = s.nextInt();
                    System.out.println("-------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        employeedata e = i.next();
                        if (e.getEmployeeid() == employeeid) {
                            i.remove();
                            found = true;
                        }
                    }
                    System.out.println("-------------------");
                    if (!found) {
                        System.out.println("record not found");
                    } else {
                        System.out.println("record is deleted successfully...");
                    }
                    System.out.println("-------------------");
                    break;

                case 5:

                    found = false;
                    System.out.println("enter employeeid to update:");
                    employeeid = s.nextInt();
                    System.out.println("-------------------");
                    ListIterator<employeedata> li = c.listIterator();
                    while (li.hasNext()) {
                        employeedata e = li.next();
                        if (e.getEmployeeid() == employeeid) {
                            System.out.println("enter new name:");
                            employeename = s1.nextLine();
                            System.out.println("enter new position:");
                            position = s.nextLine();
                            System.out.println("enter entrytime");
                            joineddate= (s2.nextLine());

                            li.set(new employeedata(employeeid, employeename, position,joineddate));
                            found = true;
                        }
                    }
                    System.out.println("-------------------");
                    if (!found) {
                        System.out.println("record not found");
                    } else {
                        System.out.println("record is updated successfully...");
                    }
                    System.out.println("-------------------");
                    break;

            }
        } while (ch != 0) ;

    }
}
