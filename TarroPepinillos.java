public class TarroPepinillos{
    private String nombreMarca;
    private int numeroPepinillos;
    private boolean tarroAbierto;
    
    public TarroPepinillos(int cantidadPepinillos, boolean abierto){
        nombreMarca = "Amapolas";
        numeroPepinillos = cantidadPepinillos;
        tarroAbierto = abierto;
    }
    
    public String getMarca(){
        return nombreMarca;
    }
    
    public int getNPepinillos(){
        return numeroPepinillos;
    }
    
    public boolean getEstado(){
        return tarroAbierto;
    }
    
    public void cambiarMarca(String nuevaMarca){
        nombreMarca = nuevaMarca;
    }
    
    public void añadirPepinillos(int nuevosPepinillos){
        numeroPepinillos = numeroPepinillos + nuevosPepinillos;
    }
    
    public void cambiarTapa(){
        if(tarroAbierto == true) {
            tarroAbierto = false;
        } else {
            tarroAbierto = true;
        }
    }
}
