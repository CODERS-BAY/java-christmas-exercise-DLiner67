package model;

public class Beeing {

    public String[]data;

    public Beeing() {
        data=new String[2];
        // TODO Auto-generated constructor stub
    }
    public Beeing(String name,String address){
        this();
        data[0]=name;
        data[1]=address;

    }
}
