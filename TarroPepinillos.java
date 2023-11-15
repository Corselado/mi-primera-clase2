public class TarroPepinillos{
    private String nombreMarca;
    private int numeroPepinillos;
    private boolean tarroAbierto;
    
    public TarroPepinillos(int cantidadPepinillos,String marca){
        nombreMarca = marca;
        numeroPepinillos = cantidadPepinillos;
        tarroAbierto = false;
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
    
    public void imprimirDetalles(){
        String estadoTarro;
        if(tarroAbierto == false){
            estadoTarro = "Cerrado";
        } else {
            estadoTarro = "Abierto";
        }
        System.out.println("Marca:" + nombreMarca + ", NPepinillos:" + numeroPepinillos + ", Tapon:" + estadoTarro); 
    }
    
    public String verDetalles(){
        String estadoTarro;
        if(tarroAbierto == false){
            estadoTarro = "Cerrado";
        } else {
            estadoTarro = "Abierto";
        }
        String detalles;
        detalles = ("Marca:" + nombreMarca + ", NPepinillos:" + numeroPepinillos + ", Tapon:" + estadoTarro);
        return detalles;
    }
}   
