import java.util.Scanner;

class ViajeMarco {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        final double VELOCIDAD_MAXIMA = 15;
        final double VELOCIDAD_MINIMA = 10;
        final double TIEMPO_MAXIMO = 10;
        final double TIEMPO_MINIMO = 8;
        final double PROBABILIDAD_LLUVIA_FUERTE = 0.1;
        final double PROBABILIDAD_LLUVIA_NORMAL = 0.4;
        final double PROBABILIDAD_MONO_ESCAPA = 0.15;
        final double PROBABILIDAD_MONO_CANSA = 0.25;

         double velocidadMarco , tiempoMarco , avanceMarco;
         double distanciaMarcoMadre = 350;
         double probabilidadLluvia;
         double probabilidadSeCansa, probabilidadSeEscapa;
         boolean seHanEncontrado = false;
         int dias = 0;


        while (!seHanEncontrado) {
            dias++;
        System.out.println("La distancia con la madre es: " + distanciaMarcoMadre);
        System.out.println("DIA"+dias);
        probabilidadLluvia = Math.random();

         probabilidadLluvia = Math.random();
         probabilidadSeCansa = Math.random();
         probabilidadSeEscapa = Math.random();

         velocidadMarco = (Math.random()*(VELOCIDAD_MAXIMA-VELOCIDAD_MINIMA)+VELOCIDAD_MINIMA);

         if (probabilidadLluvia >= PROBABILIDAD_LLUVIA_FUERTE) {
            System.out.println("Lluvia fuerte");
            velocidadMarco = velocidadMarco*0.25;
        } else if (probabilidadLluvia >= PROBABILIDAD_LLUVIA_NORMAL) {
            System.out.println("Lluvia fina");
            velocidadMarco = velocidadMarco*0.75;
        } else {
            System.out.println("Buen tiempo");
            
        }
        
          if (probabilidadSeCansa<PROBABILIDAD_MONO_CANSA)  {
            System.out.println("El mono se cansa");
            velocidadMarco = velocidadMarco * 0.9;
          }
        

         tiempoMarco = (Math.random()*(TIEMPO_MAXIMO-TIEMPO_MINIMO)+TIEMPO_MINIMO);


         if (probabilidadSeEscapa<PROBABILIDAD_MONO_ESCAPA){
            System.err.println("El mono se escapa");
            tiempoMarco = tiempoMarco - 2;
         }
         avanceMarco = velocidadMarco*tiempoMarco;

         System.out.println("Avanza: " + avanceMarco);
         distanciaMarcoMadre = distanciaMarcoMadre - avanceMarco + 80;
         seHanEncontrado = !(distanciaMarcoMadre>0);}

         entrada.nextLine();
    

         entrada.close();
        }
 }
