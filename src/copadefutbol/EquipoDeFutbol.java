/*
-------------------------Equipos de Futbol------------------------
1,ÁGUILAS DORADAS FUTBOL CLUB,Colombia,2008,Francesco Stifano
2,ALIANZA PETROLERA,Colombia,null,Hubert Bodhert
3,AMÉRICA DE CALI,Colombia,1927,Juan Carlos Osorio
4,ATLÉTICO BUCARAMANGA,Colombia,1949,Sergio Iván Novoa
5,ATLÉTICO HUILA,Colombia,1990,Alberto Rujana
6,ATLÉTICO JUNIOR,Colombia,1924,Arturo Reyes
7,ATLÉTICO NACIONAL,Colombia,1947,Alejandro Restrepo
8,DEPORTES QUINDÍO,Colombia,1951,Oscar Quintabani
9,DEPORTES TOLIMA,Colombia,1958,Hernán Torres 
10,DEPORTIVO CALI,Colombia,null,Rafael Dudamel
11,DEPORTIVO PASTO,Colombia,1949,Flavio Torres
12,DEPORTIVO PEREIRA,Colombia,1944,José Alexis Márquez
13,ENVIGADO F.C.,Colombia,1989,José Alberto Suárez
14,INDEPENDIENTE MEDELLÍN,Colombia,1913,Julio Comesana
15,INDEPENDIENTE SANTA FE,Colombia,1941,Grigori Méndez
16,JAGUARES DE CÓRDOBA,Colombia,2012,Cesar Torres
17,LA EQUIDAD,Colombia,1982,Alexis García
18,MILLONARIOS,Colombia,1946,Alberto Gamero
19,ONCE CALDAS,Colombia,1947,Diego Andrés Corredor
20,PATRIOTAS BOYACÁ F.C.,Colombia,2003,Juan David Nino
 */
package copadefutbol;

public class EquipoDeFutbol {
    private int id;
    private String nombre;
    private String pais;
    private int inicio;
    private String tecnico;
    
    public EquipoDeFutbol(){
        //constructor vacio
    }

    public EquipoDeFutbol(int id, String nombre, String pais, int inicio, String tecnico) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.inicio = inicio;
        this.tecnico = tecnico;
    }
    
    public EquipoDeFutbol(int goles, int puntos){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String equipo) {
        this.nombre = equipo;
    }
    

    public void imprimirDatos(){       
        System.out.println("  Identificadión: | " +id);
        System.out.println("Equipo de Futbol: | " +nombre);
        System.out.println("            País: | " +pais);
        System.out.println(" Fecha de Inicio: | " +inicio);
        System.out.println("         Técnico: | " +tecnico);       
        System.out.println("_______________________________________________________");   
    }
   
    
}
