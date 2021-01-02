package controller;

import model.Beeing;
import model.Child;
import view.Console;

import java.util.Scanner;

public class Controller {

    Beeing[]beeings;
    Scanner sc=new Scanner(System.in);

    public Controller(){
        beeings=new Beeing[200];

    }
    public void registerChild(){
        new Console().createChildDialog();

        String name=sc.next();

        String address=sc.next();
        Child child1= new Child(name,address);
        insertBeeingIntoArray(child1);

    }
    public void insertBeeingIntoArray(Beeing beeingToInsert){


        for (int i=0;i<beeings.length;i++){
            if(beeings[i]==null){

                beeings[i]=beeingToInsert;
                break;

            }
        }



    }

    public void printArray(){
        for (int i=0;i<beeings.length;i++){
           if (beeings[i]!=null){

               System.out.println("name:"+beeings[i].data[0]+" address:"+beeings[i].data[1]);
           }
        }

    }
}
