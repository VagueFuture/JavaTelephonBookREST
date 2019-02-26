package javaapplication3;

import java.util.ArrayList;


public class Canf {
   ArrayList<String> Callers = new ArrayList<String>();
   int time;
   int i;
   
   public void SetCanf(ArrayList<String> callers, int time){
           this.Callers.addAll(callers);
           this.time = time;
   }
   
   public void GetCanf (){
       System.out.println("Говорили: "+this.Callers.get(Callers.size()));
       System.out.println("Их время: "+this.time);
   }
   
      public ArrayList<String> GetNames (){
         return Callers;
   }
      
    public int GetTime (){
       return this.time;
   }
}
