package javaapplication3;

public class Call extends Abonent {
String HE, HIM;
int time;

public void SetCall(String Abon1,String Abon2,int time){
    this.HE = Abon1;
    this.HIM = Abon2;
    this.time = time;
}

public void GetCall(){
    System.out.println("Кто звонил: "+this.HE);
    System.out.println("Кому звонил: "+this.HIM);
    System.out.println("Сколько говорили сек: "+this.time);
}
}
