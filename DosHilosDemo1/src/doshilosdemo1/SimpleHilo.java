package doshilosdemo1;

public class SimpleHilo extends Thread {
	 
    //Eraikitzaile horrek super()-az deitzen dio jaraunsle duen klasearen eraikitzaileari
    public SimpleHilo(String nombre)
    {
        super (nombre);
    }

    // run() metodoan hariaren ataza kodetuko dugu
    // Hariak 10 aldiz inprimatuko du bere izena
    public void run() {
        for (int i=0; i<10;i++) {
            System.out.println(i+"."+getName());
        }
        System.out.println(getName()+ " haria amaitu da");
    }
   
}
