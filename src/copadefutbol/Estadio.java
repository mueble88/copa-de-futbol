/*
-----------------------------Nombres de Estadios-----------------------------
1,Estadio Deportivo Cali,Palmira,Valle del Cuaca,2008,52000,Deportivo Cali
2,Roberto Meléndez,Barranquilla,Atlántico,1986,50000,Junior
3,Atanacio Girardot,Medellín,Antioquia,1953,48700,I. Medellín y Atlético Nacional
4,Estadio Alberto Grisales,Rionegro,Antioquia,1992,14000,Rionegro Aguilas
5,Olímpoco Pascual Guerrero,Cali,Valle del Cauca,1937,42000,América Atlético F.C
6,Palogrande,Manizales,Caldas,1994,41000,Once Caldas
7,El Campín,Bogotá,Bogotá,1938,40000,Santa Fe y Millonarios
8,Manuel Murillo Toro,Ibagué,Tolima,1955,30000,Deportes Tolima
9,Alfonso López,Bucaramanga,Santander,1941,28000,Atlético Bucaramanga
10,Departamental Libertad,Pasto,Nariño,1954,20000,Deportivo Pasto
11,Hernán Ramírez Villegas,Pereira,Risaralda,1971,30300,Deportivo pereira
12,Guillermo Plazas Alcid,Neiva,Huila,1980,5000,Atlético Huila
13,Centenario de Armenia,Armenia,Quindío,1988,20710,Deprotes Quindío
14,La Independencia,Tunja,Boyacá,1970,20630,Patriotas
15,Daniel Villa Zapata,Barrancabermeja,Santander,1990,10400,Alianza Petrolera
16,Polideportivo Sur,Envigado,Antioquia,1992,14000,Envigado F.C.
17,Jaraguay,Montería,Córdoba,2012,12000,Jaguares F.C.
18,Metropolitano de Techo,Bogotá,Bogotá,1959,10000,La Equidad
 */
package copadefutbol;

public class Estadio {
    private int id;
    private String estadio;
    private String ciudad;
    private String departamento;
    private int inaguracion;
    private int aforo;
    private String equipo;
    
    public Estadio(){
     //constructor vacio   
    }
     
    public Estadio(int id, String estadio, String ciudad, String departamento, int inaguracion, int aforo, String equipo){
        this.id = id;
        this.estadio = estadio;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.inaguracion = inaguracion;
        this.aforo = aforo;
        this.equipo = equipo;
    }
    
    public void imprimirDatos(){       
        System.out.println("Identificadión: | " +id);
        System.out.println("       Estadio: | " +estadio);
        System.out.println("        Ciudad: | " +ciudad);
        System.out.println("  Departamento: | " +departamento);
        System.out.println("   Inaguración: | " +inaguracion);
        System.out.println("         Aforo: | " +aforo+ " mil Personas");
        System.out.println("        Equipo: | " +equipo);
        System.out.println("_______________________________________________________");   
    }
       
}
