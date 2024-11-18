package doshilosdemo1;

public class DosHilosDemo1 {

/* HariA eta HariB izeneko bi hari sortzen dira.
* Start() metodoari dei egiten zaio, abian jar daitezen.
* Metodo honek, besteak beste, run() metodoa deitzen dio */

    public static void main(String[] args) {
        SimpleHilo hilo1=new SimpleHilo("HiloA");
        SimpleHilo hilo2=new SimpleHilo("HiloB");
       
        hilo1.start();
        hilo2.start();
        
    }
}

// Programa honek 2 hari sortzen ditu eta exekutatzen ditu paraleloki, ondoren erakusten du kontsolan hariaren izena beraz ordena beti aldatu 
// egingo da sistemaren arabera  azknekik 10 aldiz exekutatu ondoren haria etenduko da

