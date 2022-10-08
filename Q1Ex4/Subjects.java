/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1ex4;

/**
 *
 * @author Monique Jhoienyl
 */
public class Subjects {
    int periods;
    String teacher, subject, day;
    
    
    public Subjects(int periods, String teacher, String subject, String day){
        this.periods = periods;
        this.teacher = teacher;
        this.subject = subject;
        this.day = day;
        System.out.println(day+"\n"+periods+"\n"+teacher+"\n"+subject+"\n");
    }
}
