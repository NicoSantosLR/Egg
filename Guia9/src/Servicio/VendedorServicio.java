package Servicio;

import Entidad.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio { //Nueva clase
    /*
    A continuacion generamos un metodo que retorna un objeto de tipo 
    vendedor(altaVendedor ()).Para ello importo la entidad Vendedor 
    para avisarle que va a ser usado en la pestaña de servicio.
    */
    Scanner leer = new Scanner(System.in);
    public Vendedor  altaVendedor (){
   /*Instanciamos un objeto de tipo vendedor, tomando el constructor 
   vacio del Objeto en Entidades : public Vendedor() , linea 26.
   */
       Vendedor v1 = new Vendedor();
       /*
       Aqui V1 contiene todos los atributos pero estan vacios.
       Entonces lleno los atributos utilizando el Scanner para pedir
       informacion por pantalla.*/
       
       System.out.println("Ingrese el nombre del vendedor");
       v1.setNombre (leer.next());
       System.out.println("Ingrese el DNI del vendedor");
       v1.setDni(leer.nextInt());
       System.out.println("Ingrese el el sueldo basico del vendedor");
       v1.setSueldoBasico(leer.nextDouble());
       System.out.println("Ingrese el dia que comenzo a trabajar");
       int dia = leer.nextInt();
       System.out.println("Ingrese el mes que comenzo a trabajar");
       int mes = leer.nextInt();
       System.out.println("Ingrese el año que comenzo a trabajar");
       int anio = leer.nextInt();
       Date fecha = new Date(anio-1900,mes-1,dia);
       v1.setFechaInicio(fecha);
       /*
       En este caso no se Settean los valores de las comisiones o del 
       sueldo mensual porque se necesita ralizar un calculo.
       */
       return v1;//Retorna el objeto V1 con todos loa atributos cargados.
    }
    /*
    A continuacion creamos un metodo  "void" (el cual no retorna nada)
    para calcular las comisiones y el sueldo total.
    */
    public void SueldoMensual(Vendedor v1){
        /*
        Aqui por parametro pasamos el objeto en el cual quiero que se 
        realicen los calculos
        */
    //Scanner leer = new Scanner(System.in); //no esta en el video 
    // lo puse porque sino me daba error, consultar
    // con compañeros.
          
    System.out.println("Ingrese  las ventas totales del vendedor");
    Double ventas = leer.nextDouble();
    v1.setComisiones(ventas*0.15);//calculo comision
    // a continuacion calculo sueldo mensual.
    v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
            
    System.out.println("El sueldo mensual del vendedor  "
    +v1.getNombre()+"   es de $  "+v1.getSueldoMensual());
    //Informo por pantalla.
    }
    /*
    A continuacion creamos un metodo  "void" (el cual no retorna nada) 
    para calcular los dias de vacaciones.
    */
    public void vacaciones (Vendedor v1){
     Date hoy = new Date ();
     // A continuacion calculamos antiguedad.
     int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
     /* A continuacion en funcion de la antiguedad calculo dias de 
     vacaciones utilizando un condicional */
     if (antiguedad<5) {
         System.out.println("Le corresponde 14 dias de vacaciones");
     }else if (antiguedad<10){
         System.out.println("Le corresponde 21 dias de vacaciones");
     }else if (antiguedad<20){
         System.out.println("Le corresponde 28 dias de vacaciones");
     }else if (antiguedad>20){
         System.out.println("Le corresponde 35 dias de vacaciones");
     }else{
         System.out.println("El empleado tiene vacaciones proporcionales");
     }
 }
}