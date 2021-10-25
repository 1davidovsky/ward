package com.company;

public class Ward1 {
    public Ward1(){

    }
    public Ward1( int num_of_seats1, int aty_of_fre_beds1, String surname1){
        this.num_of_seats1 = num_of_seats1;
        this.surname1 = surname1;
        this.aty_of_fre_beds1 = aty_of_fre_beds1;


    }
    public int num_of_seats1;
    public int aty_of_fre_beds1;
    public String surname1;

    public int getNum_of_seats1(){
        return num_of_seats1;
    }

    public void setNum_of_seats1(int num_of_seats1){
        this.num_of_seats1 = num_of_seats1;
    }

    public int getAty_of_fre_beds1(){
        return aty_of_fre_beds1;
    }

    public void setAty_of_fre_beds1(int aty_of_fre_beds1){
        this.aty_of_fre_beds1 =aty_of_fre_beds1;
    }
    public String getSurname1(){
        return surname1;
    }

    public void setSurname1(String surname1){
        this.surname1 =surname1;
    }


}
