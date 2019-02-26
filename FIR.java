package javaapplication3;

    
class FIR extends Abonent { 
    private String Shils;
    
       
    public void SetAbonent(String Abon, String NUM, String Shils){
    super.SetNAME(Abon);
    super.SetNUMBER(NUM);
    this.Shils = Shils;
    }
    

    public void GETAbonent(){
    System.out.println(super.GetNAME());
    System.out.println(super.GetNUMBER());
    System.out.println(Shils);
    }
       
}
