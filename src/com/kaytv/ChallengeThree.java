package com.kaytv;

public class ChallengeThree {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 8);
        double area = triangleA.findArea();
        System.out.println(area);

        Student studentA = new Student("Kay", "Van", 2024, 3.0, "TV");
        Student studentB = new Student("Keith", "Van", 2024, 3.2, "Computers");
        studentA.upGraduationYear();
        System.out.println(studentA.firstName + " is graduating in " + studentA.graduateYear);
    }
}
