/*
Realizar un algoritmo que tenga un Menú de Opciones
donde desarrolle las siguientes opciones:

1. Algoritmo Operaciones.

2. Algoritmo Determina la definitiva
de un alumno e indica si gano o perdió.

3. Algoritmo que calcula el total a pagar 
por concepto de una compra a una persona si tiene 25% descuento.

4. Algoritmo 13 de Ejercicio Condicionales.

5. Algoritmo 14 de Ejercicio Condicionales.

6. Salir.

Para realizar este trabajo necesitas comprender: Estructura Selectiva Switch y Estructura repetitiva Do-While
 */
package proyectoconswitch;

import javax.swing.JOptionPane;


public class ProyectoConSwitch {

   
    public static void main(String[] args) {
     double n1=0,n2=0,suma=0,resta=0,mul=0,div=0,aco_suma=0,con_suma=0,pro_suma=0,aco_resta=0,con_resta=0,pro_resta=0,aco_mul=0,con_mul=0,pro_mul=0,aco_div=0,con_div=0,pro_div=0;
     double nt1=0,nt2=0,nt3=0,not1=0,not2=0,not3=0,def=0,aco_def=0,con_def=0,pro_def=0;
     double cr=0,des=0,tpa=0,aco_tpa=0,con_tpa=0,pro_tpa=0;
     double horastrb=0,vlhr=0,sl=0,sa=0,aco_sa=0,con_sa=0,pro_sa=0;
     double tc=0,tp=0,dc=0,aco_tp=0,con_tp=0,pro_tp=0;
     int opcion=0;
     String cb = "color";
     String bl = "blanca";
     String vr = "verde";
     String amr = "amarilla";
     String az = "azul";
     String rj = "roja";
        
     do {
        opcion=Integer.parseInt(JOptionPane.showInputDialog("---------ELIGA SU OPCION------\n"   
         + "1.------Realizar Operaciones Básicas de las Matemáticas\n"
         + "2.------Calcular mi definitiva(Gané o perdi)\n"
         + "3.------Descuento en mi compra del 25%(total a pagar)\n"       
         + "4.------Pago de mis horas extras trabajadas\n"       
         + "5.------Promocion según el color de la bolita\n"
         + "6.------Salir\n"      
         + "\n"
         + "INGRESE SU OPCION\n")); 
        
       switch (opcion){
           case 1:
           n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primer numero para hacer las operaciones"));
           n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su segundo numero para hacer las operaciones"));
           suma=n1+n2;
           resta=n1-n2;
           mul=n1*n2;
           if (n2!=0){
           div=n1/n2;}
           JOptionPane.showMessageDialog(null, "-----RESULTADOS----\n"
            + "1.El resultado de la suma es : "+suma+"\n"
            + "1.El resultado de la resta es : "+resta+"\n"
            + "1.El resultado de la multiplicacion es : "+mul+"\n"
            + "4.El resultado de la division es : "+div+"\n");
           aco_suma=aco_suma+suma;
           con_suma=con_suma+1;
           aco_resta=aco_resta+resta;
           con_resta=con_resta+1;
           aco_mul=aco_mul+mul;
           con_mul=con_mul+1;
           aco_div=aco_div+div;
           con_div=con_div+1;
           break;
           
           case 2:
            nt1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primera nota"));
            nt2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su segunda nota"));
            nt3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su tercera nota"));
            not1=nt1*0.3;
            not2=nt2*0.3;
            not3=nt3*0.4;
            def=not1+not2+not3;
            if(def>=3.0)  {
              JOptionPane.showMessageDialog(null, "Ganó su materia :)");
              aco_def=aco_def+def;
              con_def=con_def+1;
             } 
            else {
               JOptionPane.showMessageDialog(null, "Perdiste la materia :(");
             }
            break;
            
           case 3:
            cr=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la compra realizada"));   
            des=cr*0.25;
            tpa=cr-des;
             JOptionPane.showMessageDialog(null, "El total de la compra realizada con el 25% de descuento es: "+tpa+"\n"); 
              aco_tpa=aco_tpa+tpa;
              con_tpa=con_tpa+1;
            break;
            
           case 4:
             horastrb=Double.parseDouble(JOptionPane.showInputDialog("Ingrese sus horas trabajadas"));  
             vlhr=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de las horas")); 
               if(horastrb>=40){
                  sa=horastrb*vlhr;
                  JOptionPane.showMessageDialog(null, "El dinero que recibirá es :"+sa+"\n");
                   aco_sa=aco_sa+sa;
                   con_sa=con_sa+1;
                   } else if (horastrb>=40&horastrb<=8){      
                   sl=vlhr*2;
                   sa=vlhr*sl;
                   JOptionPane.showMessageDialog(null, "El dinero que recibirá es :"+sa+"\n");
                    aco_sa=aco_sa+sa;
                    con_sa=con_sa+1;
                      } else if(horastrb>=8){ 
                          sl=vlhr*3;
                           sa=horastrb*sl;
                             JOptionPane.showMessageDialog(null, "El dinero que recibirá es :"+sa+"\n");
                              aco_sa=aco_sa+sa;
                              con_sa=con_sa+1;
                  }
             break;
           
           case 5: 
             tc=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de la compra")); 
             cb=String.format(JOptionPane.showInputDialog("Ingrese el color de la bolita"));  
               
             if(bl.equals(cb))
                 {
                 
                 tp=tc;
                 JOptionPane.showMessageDialog(null, "El total a pagar es :"+tp+"\n");
                 aco_tp=aco_tp+tp;
                 con_tp=con_tp+1;
                 } 
                else if(vr.equals(cb)) 
                  {  
                  dc=tc*0.10;
                  tp=tc-dc;
                   JOptionPane.showMessageDialog(null, "El total a pagar es :"+tp+"\n");
                    aco_tp=aco_tp+tp;
                    con_tp=con_tp+1;
                   } 
                  else if(amr.equals(cb))
                    {    
                   dc=tc*0.25;
                   tp=tc-dc;
                     JOptionPane.showMessageDialog(null, "El total a pagar es :"+tp+"\n");
                      aco_tp=aco_tp+tp;
                      con_tp=con_tp+1;
                    } 
                    else if(az.equals(cb))
                    {        
                   dc=tc*0.5;
                   tp=tc-dc;
                   JOptionPane.showMessageDialog(null, "El total a pagar es :"+tp+"\n");
                    aco_tp=aco_tp+tp;
                    con_tp=con_tp+1;
                    }
                    else if (rj.equals(cb))
                     {
                     dc=tc-tc;   
                     JOptionPane.showMessageDialog(null, "El total a pagar es :"+dc+"\n");
                     aco_tp=aco_tp+tp;
                     con_tp=con_tp+1;
                     }
                 
                 break;
                
                     default:
                 JOptionPane.showMessageDialog(null, "Favor verifique el valor ingresado");
                } 
                
       }while(opcion!=0);
         if(con_suma==0){
         JOptionPane.showMessageDialog(null, "NO se realizo la operacion SUMA");
         }else
             {
                pro_suma=aco_suma/con_suma;
             }
                if(con_resta==0){
                JOptionPane.showMessageDialog(null, "NO se realizo la operacion RESTA");
                }else 
                {
                 pro_resta=aco_resta/con_resta;
                } 
                      if(con_mul==0){
                      JOptionPane.showMessageDialog(null, "NO se realizo la operacion MULTIPLICACION");
                      }else
                      {
                       pro_mul=aco_mul/con_mul;           
                      }
                           if(con_div==0){
                           JOptionPane.showMessageDialog(null, "NO se realizo la operacion DIVISION");
                           }else
                           {
                           pro_div=aco_div/con_div;
                           }
                                 if(con_def==0){
                                 JOptionPane.showMessageDialog(null, "NO se obtuvo su definitiva");
                                 }else
                                 {
                                 pro_def=aco_def/con_def;
                                 } 
                                      if(con_tpa==0){
                                      JOptionPane.showMessageDialog(null, "NO se realizo el descuento");
                                      }else
                                      {
                                      pro_tpa=aco_tpa/con_tpa;
                                      }
                                          if(con_sa==0){
                                          JOptionPane.showMessageDialog(null, "NO se pudo obtener su salario");
                                          }else
                                          {
                                          pro_sa=aco_sa/con_sa;
                                          }
                                               if(con_tp==0){
                                               JOptionPane.showMessageDialog(null, "NO se pudo obtener el total a pagar");
                                               }else
                                               {
                                                pro_tp=aco_tp/con_tp;
                                               }

           JOptionPane.showMessageDialog(null, "----------------------RESULTADOS-----------\n"
             + "--ACOMULADOS--\n"
             + "Acomulado de la suma..:"+aco_suma+"\n"
             + "Acomulado de la resta..:"+aco_resta+"\n"
             + "Acomulado de la multiplicacion..:"+aco_mul+"\n"
             + "Acomulado de la division..:"+aco_div+"\n"
             + "Acomulado de la definitiva..:"+aco_def+"\n"
             + "Acomulado del descuento..:"+aco_tpa+"\n"
             + "Acomulado del salario..:"+aco_sa+"\n"
             + "Acomulado del total a pagar..:"+aco_tp+"\n"
                   
             + "--CONTADORES O CANTIDAD DE VECES--\n"
             + "Cantidad de sumas..:"+con_suma+"\n"
             + "Cantidad de restas..:"+con_resta+"\n"
             + "Cantidad de multiplicaciones..:"+con_mul+"\n"
             + "Cantidad de divisiones..:"+con_div+"\n"
             + "Cantidad de la definitiva..:"+con_def+"\n"
             + "Cantidad descuento..:"+con_tpa+"\n"
             + "Cantidad salario..:"+con_sa+"\n"
             + "Cantidad total a pagar..:"+con_tp+"\n"    
      
             + "--PROMEDIOS--\n"
             + "Promedio de sumas..:"+pro_suma+"\n"
             + "Promedio de restas..:"+pro_resta+"\n"     
             + "Promedio de multiplicaion..:"+pro_mul+"\n"
             + "Promedio de division ..:"+pro_div+"\n"
             + "Promedio de la definitiva..:"+pro_def+"\n"
             + "Promedio descuento..:"+pro_tpa+"\n"
             + "Promedio salario..:"+pro_sa+"\n"
             + "Promedio total pagar..:"+pro_tp+"\n");
                 
                   
    
  
 
} 
 } 
 