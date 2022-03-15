/*

 */
package copadefutbol;


public class Partido {
    private int id;
    private EquipoDeFutbol local;
    private EquipoDeFutbol visitante;
    private int golesLocal;
    private int golesVisitante;
    private boolean partidoJugado = false;

    public Partido() {
    }
    
    public Partido(int id, EquipoDeFutbol local, EquipoDeFutbol visitante) {
        this.local = local;
        this.visitante = visitante;
        this.id = id;
    }

    
    public EquipoDeFutbol getLocal() {
        return local;
    }

    public void setLocal(EquipoDeFutbol local) {
        this.local = local;
    }

    public EquipoDeFutbol getVisitante() {
        return visitante;
    }

    public void setVisitante(EquipoDeFutbol visitante) {
        this.visitante = visitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }   

    public boolean isPartidoJugado() {
        return partidoJugado;
    }

    public void setPartidoJugado(boolean partidoJugado) {
        this.partidoJugado = partidoJugado;
    }
     
    
    public void print(){
        System.out.println(" ID "+ id + ". " + local.getNombre() + " [ VS ] " + visitante.getNombre());
        System.out.println("_____________________________________________________");
    }
    
    public void imprimirResultado(){
        System.out.println("Partido #" +id);
        System.out.println(local.getNombre());
        System.out.println("Goles local: " + golesLocal);
        System.out.println(visitante.getNombre());
        System.out.println("Goles visitante: " +golesVisitante);
    }
    
    public int puntosEquipo(){
        int puntos = 0;
        if (golesLocal > golesVisitante) {
            puntos = puntos + 3;
            return puntos;
        }else{
            if(golesVisitante > golesLocal){
                puntos = puntos + 3;
                return puntos;
            }else{
                puntos = puntos + 1;
                return puntos;
            }
        }
    }
    
    
}
