
package javaapplication3;

import java.util.ArrayList;


public class Statistik {
    String Who;
    int HimTime;
    
    public void GetHIMtime(String Name,ArrayList<Call> cals,ArrayList<Canf> Canf){
        HimTime = 0;
        Who = Name;
        for(int i =0;i<cals.size();i++){
            if(Name == cals.get(i).GetNAME()){
                HimTime+=cals.get(i).GetTIME();
            }
        }
        for(int i =0;i<Canf.size();i++){
            for(int j =0;j<Canf.get(i).GetNames().size();j++)
            if(Name == Canf.get(i).GetNames().get(j)){
                HimTime+=Canf.get(i).GetTime();
            }
        }
        System.out.println("Его время в разговорах"+HimTime);
    }
}
