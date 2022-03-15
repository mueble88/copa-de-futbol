
package copadefutbol;

public class Jornada {
    private Partido[] partidos;
   
    public Jornada(){       
    }
    
    public Jornada(int cantidadPartidos){
        this.partidos = new Partido[cantidadPartidos];
    }
    
    public void SetJornada(Partido[] partidos){
        this.partidos = partidos;
    }
    
    public Partido[] getJornada(){
        return partidos;
    }

    public Partido[] getPartidos() {
        return partidos;
    }

    public void setPartidos(Partido[] partidos) {
        this.partidos = partidos;
    }
    
    public void agregarPartido(int posicion , Partido partido){
        partidos[posicion] = partido;
    }
    
    public void imprimir(){
        for(int i = 0; i < partidos.length; i++){
            partidos[i].print();
        }
    }
    
    public void imprimirMarcadores(){
        for (int i = 0; i < partidos.length; i++) {
            partidos[i].imprimirResultado();
        }
    }
}
