package controlador;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danilo
 */
public class Reloj_fecha implements Runnable{
String hora, minutos, segundos, dias, meses, anios, dia_sem,mes_act;
    Calendar calendario;
    Thread h1;
     Thread h2;
    
   public Reloj_fecha(){
        h1 = new Thread(this);
        h1.start();
         h2 = new Thread(this);
        h2.start();
       
   }
    
    
    
    
    
    
    
    
    @Override
    public void run() {
         Thread ct= Thread.currentThread();
        
        while(ct==h1){
            calcula();
            String fecha="'"+anios+"-"+meses+"-"+dias+"'";
            String horass= "'"+hora+":"+minutos+":"+segundos+"'";
          Main.p.cro.txt_fh. setText( dia_sem+" "+dias+" de "+mes_act+" del "+anios+"    "+hora+":"+minutos+":"+segundos);
         // Main.p.cro.consutarTabla_Salidad_Actividades(fecha ,horass);
          Main.p.cro.fecha_general=fecha;
          Main.p.cro.hora_general=horass;
          
//            lblReloj.setText(hora+":"+minutos+":"+segundos+" "+dias);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
        Thread ctt= Thread.currentThread();
        
        while(ctt==h2){
            calcula();
            String fecha="'"+anios+"-"+meses+"-"+dias+"'";
            String horass= "'"+hora+":"+minutos+":"+segundos+"'";
         // Main.p.cro.txt_fh. setText( dia_sem+" "+dias+" de "+mes_act+" del "+anios+"    "+hora+":"+minutos);
          Main.p.cro.consutarTabla_Salidad_Actividades(fecha ,horass);
          Main.p.cro.fecha_general=fecha;
          Main.p.cro.hora_general=horass;
          
//            lblReloj.setText(hora+":"+minutos+":"+segundos+" "+dias);
            try{
                Thread.sleep(50000);
            }catch(InterruptedException e){}
        }
       
        
        
        
        
        
        
        
    }
    
    
    
    
    
   private void calcula() {
       try {
         Calendar fecha = Calendar.getInstance();
        int hora_sistema = fecha.get(Calendar.HOUR_OF_DAY);
	 int minuto_sistema = fecha.get(Calendar.MINUTE);
         int segundo=fecha.get(Calendar.SECOND);
         String Dia=String.valueOf(fecha.get(Calendar.THURSDAY));
         String mes=String.valueOf(fecha.get(Calendar.MONTH)+1);
         String anio=String.valueOf(fecha.get(Calendar.YEAR));
         
         
         		String[] strDays = new String[]{

						"Domingo",

						"Lunes",

						"Martes",

						"Miercoles",

						"Jueves",

						"Viernes",

						"Sabado"};
                        
                        String[] strMes = new String[]{

						"Enero",

						"Febrero",

						"Marzo",

						"Abril",

						"Mayo",

						"Junio",

						"Julio",
                                                "Agosto",
                                                "Septiembre",
                                                "Octubre",
                                                "Noviembre",
                                                "Diciembre"
                        };

 

		// El dia de la semana inicia en el 1 mientras que el array empieza en el 0

		String dia_semana=   strDays[fecha.get(Calendar.DAY_OF_WEEK) - 1];
         
         String mes_actual=strMes[Integer.parseInt(mes)-1];
         
         
         
         
                     String minuto2="";
                     if(minuto_sistema<10){
                         minuto2="0"+String.valueOf(minuto_sistema);
                     }else{
                        minuto2= String.valueOf(minuto_sistema);
                     }
                     String Dia2="";
                     if(Integer.parseInt(Dia)<10){
                        Dia2="0"+String.valueOf(Dia);
                     }else{
                        Dia2=String.valueOf(Dia);
                     }
                     String mes2 ="";
                     if(Integer.parseInt(mes)<10){
                        mes2="0"+String.valueOf(mes);
                     }else{
                        mes2=String.valueOf(mes);
                     }
                     
                     
                     hora=String.valueOf(hora_sistema);
                     minutos=minuto2;
                     segundos=String.valueOf(segundo);
                     dias=Dia2;
                     meses=mes2;
                     anios=anio;
                     dia_sem=dia_semana;
                     mes_act=mes_actual;
    
    
    
    
    
    
      
       } catch (Exception e) {
           
       }
        
    
   }}
