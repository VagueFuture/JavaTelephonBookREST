package javaapplication3;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.*;
import java.nio.file.*;

public class JavaApplication3 {


    public static void main(String[] args) {
        telephonbook obj = new telephonbook();
        int index;
        int allur=0;
        int allfir=0;
        int key=0;
         Scanner in = new Scanner(System.in);
        ArrayList<UR> abonUR = new ArrayList<UR>();
        ArrayList<FIR> abonFIR = new ArrayList<FIR>();
        
        ArrayList<Call> abonCall = new ArrayList<Call>();
        ArrayList<Canf> abonCanf = new ArrayList<Canf>();
        
        while(key !=5){
            System.out.println("1) Добавить");
            System.out.println("2) Посмотреть");
            System.out.println("3) Удалить");
            System.out.println("4) Изменить");
            System.out.println("5) Выход");
            System.out.println("6) Max Double");
            System.out.println("7) Считать из CSV");
            System.out.println("8) Записать в CSV");
            System.out.println("9) Звонок");
            System.out.println("10) Конференция");
            System.out.println("11) Узнать время");
            System.out.println("12) Записать в MSQL");
	    System.out.println("13) Узнать размер базы");
	    System.out.println("14) Backup базы");
            key = in.nextInt();
            
            switch (key){
                case 1:{
                    System.out.println("_____________________");
                   // 
                    System.out.println("UR or FIR?  1,2");
                    index = in.nextInt();
                    if(index == 1){
                        System.out.println("Сколько добавить?");
                        index = in.nextInt();
                        obj.setAbonentsUR(allur,index, abonUR);
                    allur+=index;}
                    else
                    {
                        System.out.println("Сколько добавить?");
                        index = in.nextInt();
                        obj.setAbonentsFIR(allfir,index, abonFIR);
                    allfir+=index;}
                    
                    
                    System.out.println("_____________________");
                    break;
                }
                case 2:{
                    System.out.println("_____________________");
                    obj.getAbonentsUR(allur, abonUR);
                    obj.getAbonentsFIR(allfir, abonFIR);
                    System.out.println("_____________________");
                    break;
                }
                case 3:{
                   
                    System.out.println("UR or FIR?  1,2");
                    index = in.nextInt();
                    if(index == 1){
                        System.out.println("Какой номер?");
                        index = in.nextInt();
                        obj.removeAbonentsUR(index-1, abonUR);
                        obj.setAbonentsUR(allur,index, abonUR);
                    allur--;}
                    else
                    {
                        System.out.println("Какой номер?");
                        index = in.nextInt();
                        obj.removeAbonentsFIR(index-1, abonFIR);
                        obj.setAbonentsFIR(allfir,index, abonFIR);
                    allfir--;}
                    
                    
                    //index = in.nextInt();
                   // obj.removeAbonents(index-1, abon);
                    //all--;
                    System.out.println("Удалено");
                    break;
                }
                case 4:{
                    System.out.println("_____________________");
                    System.out.println("Какой?");
                    index = in.nextInt();
                   // obj.changAbonents(index-1, abon);
                    System.out.println("_____________________");
                    break;
                }
                 case 6:{
                    System.out.println("_____________________");
                    double mas[] = new double[10];
                    double max, min;
                    for(int i=0;i<10;i++){
                        mas[i] = i + 0.001;
                    }
                    max = 0.001;
                    for(int i=0;i<10;i++){
                        if(max<=mas[i]){
                            max = mas[i]; 
                        }
                    }
                    System.out.println("Max = "+max);
                    System.out.println("_____________________");
                    break;
                }
                 case 7:{
                    System.out.println("__________UR___________");
                    try(FileReader fr = new FileReader("BookUR.csv")){
                    int c;
                    while((c=fr.read())!= -1){
                       System.out.print((char)c);
                    }
                    fr.close();
                    }catch(IOException e){System.out.println(e.getMessage());}
                    System.out.println("__________FIR___________");
                    try(FileReader fr = new FileReader("BookFIR.csv")){
                    int c;
                    while((c=fr.read())!= -1){
                       System.out.print((char)c);
                    }
                    fr.close();
                    }catch(IOException e){System.out.println(e.getMessage());}
                    
                    System.out.println("_____________________");
                    break;
                }
                 case 8:{
                    System.out.println("__________UR___________");
                    try(FileWriter fr = new FileWriter("BookUR.csv",true)){
                    for(int i =0;i<allur;i++){
                       fr.write(i+";"+abonUR.get(i).GetNAME()+";"+abonUR.get(i).GetNUMBER());
                       fr.append('\n');
                    } 
                    fr.close();
                    }catch(IOException e){System.out.println(e.getMessage());}
                    System.out.println("__________FIR___________");
                    try(FileWriter fr = new FileWriter("BookFIR.csv",true)){
                     for(int i =0;i<allfir;i++){
                       fr.write(i+";"+abonFIR.get(i).GetNAME()+";"+abonFIR.get(i).GetNUMBER());
                       fr.append('\n');
                    } 
                    fr.close();
                    }catch(IOException e){System.out.println(e.getMessage());}
                    
                    System.out.println("_____________________");
                    break;
                }
                  case 9:{
                    System.out.println("_____________________");
                   
                    
                    System.out.println("_____________________");
                    break;
                }
                   case 10:{
                    System.out.println("_____________________");
                   
                   
                    System.out.println("_____________________");
                    break;
                }
                    case 11:{
                    System.out.println("_____________________");
             
                    
                    System.out.println("_____________________");
                    break;
                    }
                    case 12:{
                    System.out.println("_____________________");
             
                    try{
                     Connection Conn = DriverManager.getConnection("JDBC: mysql://Localhost:3306/java","root","G1T2A444");
                     if(Conn == null){}
                        Statement stmt = Conn.createStatement();
                        ResultSet rs = stmt.executeQuery("INSERT INTO users(name,phone,inn,snils) VALUE('ivan'+,+'88005553535'+,+'-'+,+'00001')");
                    }catch(SQLException e){System.out.println("Error");}
                    System.out.println("_____________________");
                    break;
                }
		case 13:{
                    System.out.println("_____________________");
             		long c = 0;
		try{
		    Path path1 = Paths.get("BookUR.csv");
                     c+= (long)Files.getAttribute(path1,"size");
                    }catch(Exception e){}
                    
                   
                    try{
                    Path path2 = Paths.get("BookFIR.csv");
                    c+= (long)Files.getAttribute(path2,"size");
                     }catch(IOException e){}
                    
                                        
		    
                    System.out.println("_____________________"+c);
                    break;
                    }

		    case 14:{
                    System.out.println("_____________________");
		    System.out.println("Введите куда");
try{ 
		    Path path3 = Paths.get("/home/artem/мусор/UR.csv");
		    

		    try{
		    Path path1 = Paths.get("BookUR.csv");
                    Files.copy(path1,path3);
                    }catch(Exception e){}
                    
                    Path path4 = Paths.get("/home/artem/мусор/FIR.csv");
                    try{
                    Path path2 = Paths.get("BookFIR.csv");
                    Files.copy(path2,path4,StandardCopyOption.REPLACE_EXISTING);
                     }catch(IOException e){}
                    
}catch(Exception e){ }                                    
		    
                    System.out.println("_____________________");
                    break;
                    }
            }
        }
    }
 
}
