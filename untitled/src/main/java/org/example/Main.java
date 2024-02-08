package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Datos del jugador
        String nickName;
        String nickNameBD = "anuelaa";
        String contrasena;
        String contrasenaBD = "anuel1aa";
        Integer nivelVida = 70;
        Integer contadorSkills = 0;
        Integer contadorDisparos = 0;
        Integer precioSkillVida = 100000;
        Integer danoDisparo = -5;
        String juego1="Free Fire";
        String juego2="Fifa24";
        String juegoSeleccionado;
        boolean estaMuerto=false;


        Scanner lea = new Scanner(System.in);

        //Proceso

        System.out.println("******INGRESANDO*******");
        System.out.println("******BIENVENIDO*******");
        System.out.println("------------------------");

        System.out.println("Digita tu nickName: ");
        nickName = lea.nextLine();

        System.out.println("Digita tu contrasena: ");
        contrasena = lea.nextLine();

        //Rutina para verificar el perfil

        if (nickName.equals(nickNameBD) && contrasena.equals(contrasenaBD)) {

            System.out.println("Bienvenido a PSPLUS:  " +nickName);
            //Rutina para iniciar el juego

            System.out.println("Seleccione un juego:  ");
            juegoSeleccionado=lea.nextLine();

            if (juegoSeleccionado.equals(juego1)){
                //Entramos a free fire

                do {
                    //Random (disparar o no)

                    Random random=new Random();
                    int disparo=random.nextInt(2);

                    if (disparo==1){
                        //le dieron
                        contadorDisparos=contadorDisparos+1;
                        nivelVida=nivelVida-5;
                        System.out.println("Te dispararon y tu vida quedo en: "+nivelVida);
                        if (nivelVida==0){
                            estaMuerto=true;
                        }


                    }else{
                        //no le dieron
                        System.out.println("Esquivo la bala...");
                        contadorDisparos=0;
                    }
                }while (estaMuerto==false);

                System.out.println("Te mataron!!");

            }else{
                System.out.println("Servidores no disponibles ");
            }



        }else{
            System.out.println("Usuario no encontrado...");
        }



    }
}