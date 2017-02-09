/*//Cecilia Gutierrez de Lara Hernandez-A01410404-IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.t02.p1;
import java.util.Scanner;
/**
 *
 * @author cecigutierrez
 */
public class SPP2CGutierrezdeLaraHT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double sue,pago;
    int cate,he;
    Scanner kb= new Scanner(System.in);
        
    System.out.println("Introduzca su sueldo");
    sue=kb.nextDouble();
    System.out.println("Introduzca su categoria");
    cate=kb.nextInt();
    System.out.println("Introduzca el numero de horas extra");
    he=kb.nextInt();
    
    switch (cate){
        case 1 :
        pago=sue+(he*30);
            System.out.println("El pago final es de $"+pago);
            break;
        case 2:
        pago= sue+(he*38);
            System.out.println("El pago final es de $"+pago);
            break;
        case 3:
            pago=sue+(he*50);
            System.out.println("El pago final es de $"+pago);
            break;
        case 4:
            pago=sue+(he*70);
            System.out.println("El pago final es de $" +pago);
            break;
        case 5:
            pago=sue+(he*77);
            System.out.println("El pago final es de $" +pago);
            break;
        case 6:
            pago=sue+(he*80);
            System.out.println("El pago final es de $" +pago);
            break;
        case 7:
            pago=sue+(he*95);
            System.out.println("El pago final es de $" +pago);
            break;
        case 8:
            pago=sue+(he*100);
            System.out.println("El pago final es de $" +pago);
            break;
        
        default:
                System.out.println("No se puede realizar el calculo, introduzca una categoria valida");
              
            
          
            
            
    
            
            }
    }
    
}
