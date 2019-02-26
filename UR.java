package javaapplication3;

class UR extends Abonent {
        private String INN;
        
       
    public void SetAbonent(String Abon, String NUM, String INN){
    super.SetNAME(Abon);
    super.SetNUMBER(NUM);
    this.INN = INN;
    }
    

    public void GETAbonent(){
    System.out.println(super.GetNAME());
    System.out.println(super.GetNUMBER());
    System.out.println(INN);
    }
       
}
