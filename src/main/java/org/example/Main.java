package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarando variables
        String nombreUsuario, apellidosUsuario, edadUsuario;
        short puntajeUsuario;
        int usoTarjetaUltimoMes;
        double montoComprasAseo, montoComprasAlimentos, montoComprasOtrosProductos;
        Scanner datosTeclado = new Scanner(System.in);


        //Inicializando variables
        System.out.println("Querido usuario ingrese los siguientes datos que le vamos a pedir");

        System.out.print("Ingrese su nombre: ");
        nombreUsuario=datosTeclado.nextLine();

        System.out.print("Ingrese su apellido: ");
        apellidosUsuario=datosTeclado.nextLine();

        System.out.print("Ingrese su edad: ");
        edadUsuario=datosTeclado.nextLine();

        System.out.print("Querido usuario ingrese el numero de puntaje al que pertenece y recuerde que elpuntaje va de 1 a 9: ");
        puntajeUsuario = datosTeclado.nextByte();

        System.out.print("Querido usuario ingrese el numero de veces que uso la tarjeta de credito el ultimo mes: ");
        usoTarjetaUltimoMes=datosTeclado.nextInt();

        System.out.print("Querido usuario ingrese el monto de pesos colombianos gastados en productos de aseo: ");
        montoComprasAseo=datosTeclado.nextDouble();

        System.out.print("Querido usuario ingrese el monto de pesos colombianos gastados en productos alimentcios: ");
        montoComprasAlimentos=datosTeclado.nextDouble();

        System.out.print("Querido usuario ingrese el monto de pesos colombianos gastados en otros productos: ");
        montoComprasOtrosProductos=datosTeclado.nextDouble();


        //Declarando variables y haciendo operaciones
        double totalDeudaUsuario = montoComprasAseo + montoComprasAlimentos + montoComprasOtrosProductos;
        double totalDeudaUsuarioDescuento;
        double descuentoUsuario;


        //Proceso logico
        if (puntajeUsuario == 1){
            descuentoUsuario = totalDeudaUsuario*0.25;
            totalDeudaUsuarioDescuento = totalDeudaUsuario - descuentoUsuario;
            System.out.println("Querido " +nombreUsuario +" usted realizo un total de " + usoTarjetaUltimoMes+ " usos con su tarjeta el ultimo mes");
            System.out.println("Querido "+nombreUsuario+ " usted tiene un 25% de descuento y su total a pagar es: " + totalDeudaUsuarioDescuento+ " $");

        } else if (puntajeUsuario == 2) {
            descuentoUsuario = totalDeudaUsuario*0.20;
            totalDeudaUsuarioDescuento = totalDeudaUsuario - descuentoUsuario;
            System.out.println("Querido " +nombreUsuario +" usted realizo un total de " + usoTarjetaUltimoMes+ " usos con su tarjeta el ultimo mes");
            System.out.println("Querido "+nombreUsuario+ " usted tiene un 20% de descuento y su total a pagar es: " + totalDeudaUsuarioDescuento+ " $");

        } else if (puntajeUsuario == 3) {
            descuentoUsuario = totalDeudaUsuario*0.15;
            totalDeudaUsuarioDescuento = totalDeudaUsuario - descuentoUsuario;
            System.out.println("Querido " +nombreUsuario +" usted realizo un total de " + usoTarjetaUltimoMes+ " usos con su tarjeta el ultimo mes");
            System.out.println("Querido "+nombreUsuario+ " usted tiene un 15% de descuento y su total a pagar es: " + totalDeudaUsuarioDescuento+ " $");

        } else if (puntajeUsuario == 4) {
            descuentoUsuario = totalDeudaUsuario*0.10;
            totalDeudaUsuarioDescuento = totalDeudaUsuario - descuentoUsuario;
            System.out.println("Querido " +nombreUsuario +" usted realizo un total de " + usoTarjetaUltimoMes+ " usos con su tarjeta el ultimo mes");
            System.out.println("Querido "+nombreUsuario+ " usted tiene un 10% de descuento y su total a pagar es: " + totalDeudaUsuarioDescuento+ " $");

        }else {
            System.out.println("Querido usuario usted realizo un total de " + usoTarjetaUltimoMes+ " usos con su tarjeta el ultimo mes");
            System.out.println("Querido "+nombreUsuario+ " lamentablemente no tienes ningun descuento y su total a pagar es: " + totalDeudaUsuario+ " $");

        }

    }
}