package com.company;

public class Ward {
    public Ward(){

    }
    public Ward( int num_of_seats, int aty_of_fre_beds, String surname){
        this.num_of_seats = num_of_seats;
        this.surname = surname;
        this.aty_of_fre_beds = aty_of_fre_beds;


    }
    public int num_of_seats;
    public int aty_of_fre_beds;
    public String surname;

    public int getNum_of_seats(){
        return num_of_seats;
    }

    public void setNum_of_seats(int num_of_seats){
        this.num_of_seats = num_of_seats;
    }

    public int getAty_of_fre_beds(){
        return aty_of_fre_beds;
    }

    public void setAty_of_fre_beds(int aty_of_fre_beds){
        this.aty_of_fre_beds =aty_of_fre_beds;
    }
    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname =surname;
    }


    }




