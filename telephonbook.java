package javaapplication3;
import java.util.ArrayList;
import java.util.Scanner;

public class telephonbook {
    
    
  public void setAbonentsUR(int all,int index, ArrayList<UR> abon){
      Scanner in = new Scanner(System.in);

      for(int i =all;i< all+index;i++){
          abon.add(new UR());
      }
      
        for(int i =all;i< all+index;i++){
            int j =i+1;
            System.out.println("№"+j);
         abon.get(i).SetAbonent(in.next(), in.next(),in.next());
      }
    
}
  
    public void setAbonentsFIR(int all,int index, ArrayList<FIR> abon){
      Scanner in = new Scanner(System.in);

      for(int i =all;i< all+index;i++){
          abon.add(new FIR());
      }
      
        for(int i =all;i< all+index;i++){
            int j =i+1;
            System.out.println("№"+j);
         abon.get(i).SetAbonent(in.next(), in.next(),in.next());
      }
    
}
  
  public void getAbonentsFIR (int index,ArrayList<FIR> abon){
        
      for(int i =0;i< index;i++){
          System.out.print(i+1+") ");
         abon.get(i).GETAbonent();
      }
  }
  
    public void getAbonentsUR (int index,ArrayList<UR> abon){
        
      for(int i =0;i< index;i++){
          System.out.print(i+1+") ");
         abon.get(i).GETAbonent();
      }
  }
  
    public void changAbonentsUR (int index,ArrayList<UR> abon){
        Scanner in = new Scanner(System.in); 
        abon.get(index).SetAbonent(in.next(), in.next(), in.next());   
  }
    
    public void changAbonentsFIR (int index,ArrayList<FIR> abon){
        Scanner in = new Scanner(System.in); 
        abon.get(index).SetAbonent(in.next(), in.next(), in.next());   
  }
    
     public void removeAbonentsUR (int index,ArrayList<UR> abon){
        abon.remove(index);   
  }
     
     public void removeAbonentsFIR (int index,ArrayList<FIR> abon){
        abon.remove(index);   
  }
     
     public void FindHim (String name){
         Scanner in = new Scanner(System.in);
         Statistik obj = new Statistik();
        ArrayList<Call> Call = new ArrayList<Call>();
        ArrayList<Canf> Canf = new ArrayList<Canf>();
        obj.GetHIMtime(in.next(),Call,Canf);
  }
     
     public void Calls (String name1, String name2,int time,ArrayList<Call> call){
         Scanner in = new Scanner(System.in); 
        call.get(1).SetCall(name1,name2,time) ;
  }

}

