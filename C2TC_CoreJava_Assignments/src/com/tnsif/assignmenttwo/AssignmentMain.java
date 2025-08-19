package com.tnsif.assignmenttwo;

import com.tnsif.assignmenttwo.student.Student;
import com.tnsif.assignmenttwo.commission.Commission;

public class AssignmentMain {
    public static void main(String[] args) {

        // Step 1: Create Student object (default constructor runs)
        Student s1 = new Student();

        // Step 2: Create Commission object and call methods
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}

