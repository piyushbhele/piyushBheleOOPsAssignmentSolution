package com.greatlearning.model;

public class DriverMain {
    public static void main(String[] args) {

     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of your department");
        System.out.println("1. Admin Department");
        System.out.println("2. HR department");
        System.out.println("3. Tech department");
        int num;
        num = sc.nextInt();
        if(num == 1) */

//        admin department
        SuperDepartment superdepartment = new AdminDepartment();
        System.out.println("Welcome to " + superdepartment.departmentName());
        System.out.println("Task for today : "+superdepartment.getTodaysWork());
        System.out.println("Work deadline : "+superdepartment.getWorkDeadline());
        System.out.println(superdepartment.isTodayAHoliday());
        System.out.println();

//        }
//        else if(num == 2) {

//        hr department
        SuperDepartment superdepartment1 = new HrDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        System.out.println("Welcome to " + superdepartment1.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println("Task for today : "+superdepartment1.getTodaysWork());
        System.out.println("Work deadline : "+superdepartment1.getWorkDeadline());
        System.out.println(superdepartment1.isTodayAHoliday());
        System.out.println();

//        }
//        else if(num ==3) {

//        tech department
        SuperDepartment superDepartment2 = new TechDepartment();
        TechDepartment techDepartment = new TechDepartment();
        System.out.println("Welcome to " + superDepartment2.departmentName());
        System.out.println("Task for today : "+superDepartment2.getTodaysWork());
        System.out.println("Work deadline : "+superDepartment2.getWorkDeadline());
        System.out.println("Stack info : "+techDepartment.getTechStackInformation());
        System.out.println(superDepartment2.isTodayAHoliday());

//        }
//        else
//            System.out.println("Enter a correct number");
    }
}
