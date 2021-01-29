package Application;

import Entities.Person;
import Others.SEXO;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio() {
        Scanner ler = new Scanner(System.in);
        Person primeiro = new Person("Cristiano Ronaldo", SEXO.MASCULINO, null);
        boolean cont = false;
        Person auxiliar;
        List <Person> people = new ArrayList<>();
        people.add(primeiro);
        do {
            cont=false;
            System.out.println("Write the name of the Person");
            String name = ler.nextLine();
            System.out.println("Write 'M' for male and 'F' for female");
            String sex = ler.next();
            SEXO se=null;
            if (sex.equalsIgnoreCase("M")) {
                se = SEXO.MASCULINO;
            } else if (sex.equalsIgnoreCase("F")) {
                se = SEXO.FEMININO;
            }else if(!(sex.equalsIgnoreCase("m")||sex.equalsIgnoreCase("f"))){
            cont=true;
                continue;
            }
             for(auxiliar = primeiro;auxiliar.getProxima()!=null;auxiliar=auxiliar.getProxima()){
             }
             Person p = new Person(name,se);
             people.add(p);
                     auxiliar.setProxima(p);
             
                     System.out.println("Want you add more one person?");
                     System.out.println("1 - yes");
                     System.out.println("2 - no");
                     int op = ler.nextInt();
                     if(op==1){
                         cont=true;
                     }else
                         cont=false;
                     ler.nextLine();
        } while (cont == true);
        
        
        Person auxfinal;
        System.out.println("\n\nPessoas cadastradas : ");
        for(auxfinal=(Person)people.get(0);
                auxfinal!=null;
                auxfinal = auxfinal.getProxima()){
        System.out.println(auxfinal.getNome());    
    
    
  } 
 }
}
