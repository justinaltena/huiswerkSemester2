/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerkjava;

/**
 *
 * @author W10
 */
public class Auto {
    private String merk = "merk onbekend";
    private String type = "";
    private int pk = 20;
    private boolean opgevoerd;

    public Auto() {
        this.merk = merk;
        this.type = type;
        this.pk = pk;
        this.opgevoerd = false;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public int getPk() {
        return pk;
    }

    public boolean isOpgevoerd() {
        return opgevoerd;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    @Override
    public String toString() {
        if(isOpgevoerd() == true){
            return merk + " " + type + "(" + pk + "pk, is al een keer opgevoerd";
        }else{
        return merk + " " + type + "(" + pk + "pk, maximaal op te voeren met "+ this.berekenOpvoerMogelijkheid() +")";
        }
    }
    
    public void voerOp(int extraPk){
        System.out.println(merk + " opvoeren met " + extraPk + " pk");
        if (extraPk > (this.berekenOpvoerMogelijkheid()) & isOpgevoerd() == false) {
            System.out.println(extraPk + " is te veel, maximaal " + this.berekenOpvoerMogelijkheid());
        } else if(isOpgevoerd() == true){
            System.out.println(isOpgevoerd());
            System.out.println("deze auto is al een keer opgevoerd)");
        }else {
            this.pk += extraPk;
            this.opgevoerd = true;
            System.out.println("resultaat: "+ this.toString());
        }

    }
    
    public int berekenOpvoerMogelijkheid(){
        if(isOpgevoerd() == false){
            return (this.pk -20);
        }
        else{
            return 0;
        }
        
    }
}
