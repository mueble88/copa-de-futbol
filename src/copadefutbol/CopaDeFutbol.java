/*
Hacer un programa que haga una copa de futbol:
-ingresar archivos con nombres de equipos de futbol
-ingresar archivos con los nombres de estadios
-el programa debe hacer toda una copa con sus fechas, y que no se repita ningun partido
 */
package copadefutbol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class CopaDeFutbol {
    public static Estadio[] datosEstadio;
    public static int cantidadEstadios;
    public static EquipoDeFutbol[] datosEquipo;
    public static int cantidadEquipos = 0;
    public static int contadorCaso1 = 0;
    public static int contadorCaso2 = 0;
    public static Jornada[] jornadas;
    public static int cantidadJornadas = 0;
    public static int posicionPartido = 0;
    public static int posicionJornada =0;
    
    public static void main(String[] args) {
        int seleccionDeMenu = -1;
        int seleccionDePartidos = 0;
        int seleccionJornadas = 0;
        System.out.println("_______________COPA DE FUTBOL AGUILA_______________");
        System.out.println("_______________CANTIDAD DE ESTADIOS________________");
        System.out.println("El tope de estadios es de 18 estadios para la copa" );
        System.out.print("Ingrese cantidad de estadios: ");
        cantidadEstadios = Integer.valueOf(leerLinea());
        if(cantidadEstadios < 19 && cantidadEstadios > 0){
            datosEstadio = new Estadio[cantidadEstadios];  
        }else{
            System.out.println("___________[ ERROR ]____________");
            System.out.println("El número ingresado no es valido");
        }
             
        menuDePartidos();
        seleccionDePartidos = Integer.valueOf(leerLinea());
        if(seleccionDePartidos < 10 && seleccionDePartidos >0){
            switch(seleccionDePartidos){
                case 1:
                    cantidadEquipos  = 4;
                    datosEquipo = new EquipoDeFutbol[cantidadEquipos];
                    System.out.println("__________________________________________");  
                    break;
                case 2:
                    cantidadEquipos  = 6;
                    datosEquipo = new EquipoDeFutbol[cantidadEquipos];
                    System.out.println("__________________________________________");
                    break;
                case 3:
                    cantidadEquipos  = 8;
                    datosEquipo = new EquipoDeFutbol[cantidadEquipos];
                    System.out.println("__________________________________________");
                    break;
                case 4:
                    cantidadEquipos  = 10;
                    datosEquipo = new EquipoDeFutbol[cantidadEquipos];
                    System.out.println("__________________________________________");
                    break;
                case 5:
                    cantidadEquipos  = 12;
                    datosEquipo = new EquipoDeFutbol[cantidadEquipos];
                    System.out.println("__________________________________________");
                    break;
                case 6:
                    cantidadEquipos  = 14;
                    datosEquipo = new EquipoDeFutbol[cantidadEquipos];
                    System.out.println("__________________________________________");
                    break;
                case 7:
                    cantidadEquipos  = 16;
                    datosEquipo = new EquipoDeFutbol[cantidadEquipos];
                    System.out.println("__________________________________________"); 
                    break;
                case 8:
                    cantidadEquipos  = 18;
                    datosEquipo = new EquipoDeFutbol[cantidadEquipos];
                    System.out.println("__________________________________________");
                    break;
                case 9:
                    cantidadEquipos  = 20;
                    datosEquipo = new EquipoDeFutbol[cantidadEquipos];
                    System.out.println("__________________________________________");
                    break;
            }
        }else{
            System.out.println("___________[ ERROR ]____________");
            System.out.println("El número ingresado no es valido");
        }       
        
        
        menuJornada(); 
        System.out.println("Ingrese la cantidad de jornadas que se van ajugar ");
        System.out.println("NOTA: Solo se pueden ingresar como maximo 6 jornadas ");
        System.out.print("Cantidad Jornadas: ");
        cantidadJornadas = Integer.valueOf(leerLinea());    
        if(cantidadJornadas <= 6 && cantidadJornadas >0){
            jornadas = new Jornada[cantidadJornadas];
            System.out.println("______________________________________________");         
        }else{
            System.out.println("___________[ ERROR ]____________");
            System.out.println("El número ingresado no es valido");
        }
 
        if(cantidadEstadios <= 18 && cantidadEstadios > 0 && cantidadEquipos <= 20 && cantidadEquipos > 0){
            //menu: se hace la valoracion segun el numero que ingrese el usuario
            while(seleccionDeMenu != 0){
                mostrarMenu();
                seleccionDeMenu = Integer.valueOf(leerLinea());
                if (seleccionDeMenu < 7 && seleccionDeMenu >=0) {
                   switch(seleccionDeMenu){
                       case 1:
                           ingresarDatosEstadios();
                           break;
                       case 2:
                           ingresarDatosEquipos();
                           break;
                       case 3:
                           ingresarJornadas();
                           break;
                       case 4:
                           ingresarResultados();
                           break;
                       case 5:
                           verMarcadores();
                           break;
                       case 6:
                           verPosiciones();
                           break;
                       default:
                           System.out.println("[ SALIR ]");
                           break;
                   } 
                }else{
                    System.out.println("_____________[ ERROR ]_____________");
                    System.out.println("El número ingresado no es valido");
                    System.out.println("por favor ingrese nuevamente al menu");
                    System.out.println("____________________________________");
                }
            }
        }else{
            System.out.println("_____________[ ERROR ]_____________");
            System.out.println("Los datos ingresados no son validos");
        }
    }
    
    //metodo de menu de los partidos, el usuario escoge la cantidad de equipos que van a jugar 
    public static void menuDePartidos(){
        System.out.println("_______CREA CALENDARIO DE EQUIPOS_______");
        System.out.println("");
        System.out.println("       digite [1] para 4 Equipos");
        System.out.println("       digite [2] para 6 Equipos");
        System.out.println("       digite [3] para 8 Equipos");
        System.out.println("       digite [4] para 10 Equipos");
        System.out.println("       digite [5] para 12 Equipos");
        System.out.println("       digite [6] para 14 Equipos");
        System.out.println("       digite [7] para 16 Equipos");
        System.out.println("       digite [8] para 18 Equipos");
        System.out.println("       digite [9] para 20 Equipos");
        System.out.println("_________________________________________");
    }
    
    //metodo del menu de las jornadas, el usuario escoge la cantidad de jornadas que quiere para la copa 
    public static void menuJornada(){
        System.out.println("_______CANTIDAD DE FECHAS A JUGAR_______");
        System.out.println("Digite [2] para 2 jornadas de juego");
        System.out.println("Digite [3] para 3 jornadas de juego");
        System.out.println("Digite [4] para 4 jornadas de juego");
        System.out.println("Digite [5] para 5 jornadas de juego");
        System.out.println("Digite [6] para 6 jornadas de juego");
        System.out.println("_________________________________________");
    }
    
    //metodo para mostrar al usuario que numero debe ingresar para poder hacer la valoracion del menu 
    public static void mostrarMenu(){
        System.out.println("");
        System.out.println("________________________ MENU ________________________");
        System.out.println("Digite [1] para cargar los Estadios de Futbol");
        System.out.println("Digite [2] para cargar los Equipos de futbol");       
        System.out.println("Digite [3] para ver las jornadas de los partidos");
        System.out.println("Digite [4] para poner los marcadores de los partidos");
        System.out.println("Digite [5] para ver los resultados de los partidos");
        System.out.println("Digite [6] para ver las posisciones de los equipos");
        System.out.println("Digite [0]cero para salir");
        System.out.println("______________________________________________________");
    }
    
    
    //metodo del caso 1 para ingresar los datos automaticamente de los estadios, 
    //trae un archivo de un bloc de notas con la lista hecha
    public static void ingresarDatosEstadios(){
        int posicion = 0;
        int id;
        String estadio;
        String ciudad;
        String departamento;
        int inaguracion;
        int aforo;
        String equipo;
        int puestoArray1 = 0;
        int puestoArray2 = 1;
        int puestoArray3 = 2;
        int puestoArray4 = 3;
        int puestoArray5 = 4;
        int puestoArray6 = 5;
        int puestoArray7 = 6;
        if (contadorCaso1 < 1) {
            try {
                File myObj = new File("C:\\Users\\camil\\Desktop\\carpetaDeHoy\\CopaDeFutbol\\nombresDeEstadio.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    /*System.out.println(data);*/
                    String cortarDatos[] = data.split(",");
                    if (posicion < cantidadEstadios) {
                        id = Integer.parseInt(cortarDatos[puestoArray1]);
                        estadio = (cortarDatos[puestoArray2]);
                        ciudad = (cortarDatos[puestoArray3]);
                        departamento = (cortarDatos[puestoArray4]);
                        inaguracion = Integer.parseInt(cortarDatos[puestoArray5]);
                        aforo = Integer.parseInt(cortarDatos[puestoArray6]);
                        equipo = (cortarDatos[puestoArray7]);
                        datosEstadio[posicion] = new Estadio(id, estadio, ciudad, departamento, inaguracion, aforo, equipo);
                        posicion++;
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            contadorCaso1++;
        }else{
            System.out.println("____________________ ALERTA ____________________ ");
            System.out.println("Ya estan ingresados todos los datos de los estadios");
        }
        imprimirDatosEstadio();
    }
    
    
    public static void ingresarDatosEquipos(){
        int posicion = 0;
        int id;
        String equipo;
        String pais;
        int inicio;
        String tecnico;
        int puestoArray1 = 0;
        int puestoArray2 = 1;
        int puestoArray3 = 2;
        int puestoArray4 = 3;
        int puestoArray5 = 4;
        if (contadorCaso2 < 1) {
            try {
                File myObj = new File("C:\\Users\\camil\\Desktop\\carpetaDeHoy\\CopaDeFutbol\\equiposDeFutbol.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    /*System.out.println(data);*/
                    String cortarDatos[] = data.split(",");
                    if (posicion < cantidadEquipos) {
                        id = Integer.parseInt(cortarDatos[puestoArray1]);
                        equipo = (cortarDatos[puestoArray2]);
                        pais = (cortarDatos[puestoArray3]);
                        inicio = Integer.parseInt(cortarDatos[puestoArray4]); 
                        tecnico = (cortarDatos[puestoArray5]);
                        datosEquipo[posicion] = new EquipoDeFutbol(id, equipo, pais, inicio, tecnico);
                        posicion++;
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            contadorCaso2++;
        }else{
            System.out.println("____________________ ALERTA ____________________ ");
            System.out.println("Ya estan ingresados todos los datos de los equipos de futbol");
        }
        imprimirDatosEquipos();
    }
    

    //metodo que ingresa las jornadas de la copa
    public static void ingresarJornadas(){
        desordenarEquipos(datosEquipo);
        for (int i = 0; i < jornadas.length; i++) {
            Jornada jornada = new Jornada(cantidadEquipos/2);
            for (int j = 0; j < cantidadEquipos / 2; j++) {
               Partido partido = new Partido((i * 100 + j+1),datosEquipo[j*2],datosEquipo[j*2+1]);
               jornada.agregarPartido(j, partido);  
            }
            jornadas[i] = jornada;
            ordenarALoCamilo(datosEquipo);
        }
        imprimirJornadas();
    }
    
    public static void ingresarResultados(){
        int golesLocal = 0;
        int golesVisitante = 0;       
        int idPartido = 0;
        System.out.println("______ Digitar Resultados ______");
        System.out.print("Digite el número de identificación del partido: ");
        idPartido = Integer.valueOf(leerLinea());
        Partido partidoSeleccionado = encontrarPartido(idPartido);
        if ( partidoSeleccionado != null){
            System.out.println("Equipo local: " + partidoSeleccionado.getLocal().getNombre());
            System.out.print("Goles del equipo local: " );
            golesLocal = Integer.valueOf(leerLinea());               
            System.out.println("Equipo visitante: " + partidoSeleccionado.getVisitante().getNombre());
            System.out.print("Goles del equipo visitante: " );
            golesVisitante = Integer.valueOf(leerLinea());
            partidoSeleccionado.setGolesLocal(golesLocal);
            partidoSeleccionado.setGolesVisitante(golesVisitante);
            partidoSeleccionado.setPartidoJugado(true);
        }else{
            System.out.println("El número del partido no es valido");
        }
    }
    
    
    //metodo para comparar el id de los partidos y me retorne el partido encontrado o si no null
    public static Partido encontrarPartido(int idPartido){ 
        for (int i = 0; i < jornadas.length; i++) {
            for (int j = 0; j < jornadas[i].getPartidos().length; j++) {
                if ( jornadas[i].getPartidos()[j].getId() == idPartido   ){
                    return jornadas[i].getPartidos()[j];
                }
            }
        }
        return null;     
    }        
    
    
    //metodo para dar las posiciones segun sus puntos 
    public static void verPosiciones(){
        int puntosGanador = 3;
        int puntosEmpate = 1;
        String[] equipo = new String[datosEquipo.length];
        int[] puntos = new int[datosEquipo.length];
        int[] goles = new int[datosEquipo.length];
        int[] golesEnContra = new int[datosEquipo.length];
        
        for (int i = 0; i < datosEquipo.length; i++) {
            for (int j = 0; j < jornadas.length; j++) {
                for (int k = 0; k < jornadas[j].getPartidos().length; k++) {
                    Partido partidoActual = jornadas[j].getPartidos()[k];
                    if(partidoActual.isPartidoJugado()){
                        if (partidoActual.getLocal().getId() == datosEquipo[i].getId()) {
                            goles[i] = partidoActual.getGolesLocal();
                            golesEnContra[i]= partidoActual.getGolesVisitante();
                            if (partidoActual.getGolesLocal() > partidoActual.getGolesVisitante()) {
                                puntos[i] = puntos[i] + puntosGanador;
                            }else if(partidoActual.getGolesLocal() == partidoActual.getGolesVisitante()){
                                puntos[i] = puntos[i] + puntosEmpate;
                            }
                        }
                        if (partidoActual.getVisitante().getId() == datosEquipo[i].getId()) {
                            goles[i] = partidoActual.getGolesVisitante();
                            golesEnContra[i] = partidoActual.getGolesLocal();
                            if (partidoActual.getGolesLocal() < partidoActual.getGolesVisitante()) {
                                puntos[i] = puntos[i] + puntosGanador;
                            }else if(partidoActual.getGolesLocal() == partidoActual.getGolesVisitante()){
                                puntos[i] = puntos[i] + puntosEmpate;
                            }
                        }
                    }
                }
            }
        }
        //ya tenemos los calculos ahora solo debemos imprimir 
        for (int i = 0; i < datosEquipo.length; i++) {
            System.out.println("Equipo:" +datosEquipo[i].getNombre() + " Pts " + puntos[i] + " GF " + goles[i] + " GC " + golesEnContra[i]);           
        }

        
        
        
        /*for (int i = 0; i < jornadas.length; i++) {
            for (int j = 0; j < jornadas[i].getPartidos().length ; j++) {
                if(jornadas[i].getPartidos()[j].isPartidoJugado()==true){
                for (int k = 0; k < jornadas.length; k++) { 
                    if(jornadas[i].getPartidos()[j].getLocal().getNombre().compareTo()){
                }                 
                    equipo[k] = jornadas[i].getPartidos()[j].getLocal().getNombre();
                    equipo[k+1] = jornadas[i].getPartidos()[j].getVisitante().getNombre();
                    goles[k] = jornadas[i].getPartidos()[j].getGolesLocal();
                    goles[k+1] = jornadas[i].getPartidos()[j].getGolesVisitante();
                    golesEnContra[k] = jornadas[i].getPartidos()[j].getGolesVisitante();
                    golesEnContra[k+1] = jornadas[i].getPartidos()[j].getGolesLocal();

                    if(jornadas[i].getPartidos()[j].getGolesLocal() > jornadas[i].getPartidos()[j].getGolesVisitante()){
                        puntos[k] = puntosGanador;
                        puntos[k+1] = puntosPerdedor;
                    }else
                        if (jornadas[i].getPartidos()[j].getGolesLocal() < jornadas[i].getPartidos()[j].getGolesVisitante()) {
                        puntos[k] = puntosPerdedor;
                        puntos[k+1] = puntosGanador;
                    }else{
                        puntos[k] = puntosEmpate;
                        puntos[k+1] = puntosEmpate;  
                    }
                }
            }
        } */
    }
    
    
    //metodo para ver las posicones de los equipos
    public static void imprimirPosiciones(){
        
    }
    
    
    //metodo para imprimir los marcadores de los partidos 
    public static void verMarcadores(){
        System.out.println("__________ Marcadores ___________ ");
        for (int i = 0; i < datosEquipo.length; i++) {
            jornadas[i].imprimirMarcadores();
        }
    }
    
    
    
    //metodo para imprimir todos los datos de los estadios
    public static void imprimirDatosEstadio(){
        System.out.println("__________ DATOS DE LOS ESTADIOS DE COLOMBIA __________ ");
        for (int i = 0; i < datosEstadio.length; i++) {
            datosEstadio[i].imprimirDatos();
        }
    }
    
    //metodo para imprimir todos los datos de los equipos de futbol
    public static void imprimirDatosEquipos(){
        System.out.println("__________ DATOS DE LOS EQUIPOS DE FUTBOL __________ ");
        for (int i = 0; i < datosEquipo.length; i++) {
            datosEquipo[i].imprimirDatos();
        }
    }
    
    
    //metodo de imprimir las jornadas de la copa 
    public static void imprimirJornadas(){
        for (int i = 0; i < cantidadJornadas; i++) {
            System.out.println("_______ JORNADA "+(i+1)+ " ________");
            jornadas[i].imprimir();
        }
    }
    
    
    //metodo para leer los datos entrada
    public static String leerLinea(){
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            String a = br.readLine();
            return a;
        }catch(IOException ex){
            return "";
        }
    }
    
    public static void desordenarEquipos(EquipoDeFutbol[] array) {
        Random random = new Random();
        int count = array.length;
        for (int i = count; i > 1; i--) {
            swap(array, i - 1, random.nextInt(i));
        }
    }

    private static void swap(EquipoDeFutbol[] array, int i, int j) {
        EquipoDeFutbol temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void ordenarALoCamilo(EquipoDeFutbol[] array){
        int posicion0=0;
        int posicionMedio = array.length/2;
        for (int i = 0; i < posicionMedio; i++) {
            swap(array, i, i*2);
        }
        for(int i = 0; i + posicionMedio +(2*i) < array.length; i++){
            swap(array, i + posicionMedio, i + posicionMedio +(2*i) );
        }
    }
}
