package ClassesEMetodos;

import java.util.Scanner;

public class ClassAluno {
Scanner entrada = new Scanner(System.in);

    String name;
    int age;
    double grade;

    void setData(){

        System.out.println("Coloque o nome do aluno");
        name = entrada.next();

        System.out.println("Coloque a idade do aluno");
        age = entrada.nextInt();

        System.out.println("Coloque a nota do aluno");
        grade = entrada.nextInt();


    }

    void ShowData(){
        System.out.println("Os dados do aluno : " + name +  age +  grade);
    }

    boolean isApproved(){
        if (grade >= 6){
            return true;
        }else{
            return false;
        }
    }
}
