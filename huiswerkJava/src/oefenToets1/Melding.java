package oefenToets1;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class Melding {
    
    private String berichtTekst;
    private int niveau;
    private String dagAanduiding;
    private LocalDate aanmaakDatum;
    private DayOfWeek dagVanBericht;
    
    public Melding(String berichtTekst){
        this(berichtTekst,1);
    }

    public Melding(String berichtTekst, int niveau) {
        this.berichtTekst = berichtTekst;
        setNiveau(niveau);
        this.dagAanduiding = "vandaag";
        this.aanmaakDatum = LocalDate.now();
        this.dagVanBericht = aanmaakDatum.getDayOfWeek();
    }
    
    

    @Override
    public String toString() {
        return getNiveauAlsTekst() + ": " + berichtTekst + "(" + dagAanduiding + ", " + dagVanBericht + " " + aanmaakDatum + ")";
    }

    public void setNiveau(int niveau) {
        if(niveau <= 1){
            this.niveau = 1;
        }else if(niveau >= 3){
            this.niveau = 3;
        }else{
            this.niveau = niveau;
        }
    }

    public String getBerichtTekst() {
        return berichtTekst;
    }

    public int getNiveau() {
        return niveau;
    }

    public String getDagAanduiding() {
        return dagAanduiding;
    }

    public LocalDate getAanmaakdatum() {
        return aanmaakDatum;
    }

    public DayOfWeek getDagVanBericht() {
        return dagVanBericht;
    }
    
    public String getNiveauAlsTekst(){
        String melding;
        if(this.niveau == 1){
            melding = "Mededeling";
        }else if(this.niveau == 2){
            melding = "WAARSCHUWING";
        }else{
            melding = "NOODSITUATIE";
        }
        return melding;
    }
    
    public void setAangepasteDag(DayOfWeek aangepasteDag){
        int counter = 0;
        while(dagVanBericht.getValue() != aangepasteDag.getValue()){
            dagVanBericht = dagVanBericht.plus(1);
            counter++;
        }
        if(counter == 1){
            dagAanduiding = "morgen";
        }else{
            if(counter == 2){
                dagAanduiding = "overmorgen";
            }else if(counter == 3){
                dagAanduiding = "overovermorgen";
            }else if(counter == 4){
                dagAanduiding = "overoverovermorgen";
            }else if(counter == 5){
                dagAanduiding = "overoveroverovermorgen";
            }else if(counter == 6){
                dagAanduiding = "overoveroveroverovermorgen";
            }
        }
        this.dagVanBericht = aangepasteDag;
        
    }
}
