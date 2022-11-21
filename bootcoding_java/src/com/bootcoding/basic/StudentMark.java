package com.bootcoding.basic;

public class StudentMark {
    public static void main(String[] args) {
        StudentMark sm=new StudentMark();
        Assignment s=sm.Convert("ramesh,76,68,88,55");
        System.out.println("Average Marks"+ s.getAverage());
        System.out.println("percent"+ s.getPercent());


    }


    public Assignment Convert(String text) {

        String[] tokens = text.split(",");
        Assignment student = new Assignment();
        student.setName(tokens[0]);
        student.setPhysic(Integer.parseInt(tokens[1]));
        student.setMaths(Integer.parseInt(tokens[2]));
        student.setChemistry(Integer.parseInt(tokens[3]));
        student.setHistory(Integer.parseInt(tokens[4]));

         int totalMarks= student.getPhysic()  +  student.getMaths() +
                 student.getChemistry() +student.getHistory();

         student.setAverage(totalMarks/4);
         student.setPercent(totalMarks*100/400);
         return student;

    }

}
