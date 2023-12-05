public class TarroPepinillos{
    private String nombreMarca;
    private int numeroPepinillos;
    private boolean tarroAbierto;
    private boolean tarroRoto;
    private double decimal;
    
    public TarroPepinillos(int cantidadPepinillos,String marca){
        nombreMarca = marca;
        numeroPepinillos = cantidadPepinillos;
        tarroAbierto = false;
        tarroRoto = true;
        decimal = 3.45;
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
    
    public boolean getRotura(){
        return tarroRoto;
    }
    
    public double getDecimal(){
        return decimal;
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
    
    public void romperTarro(){
        if(tarroRoto == true) {
            tarroRoto = false;
        } else {
            tarroRoto = true;
        }
    }
    
    public void cambiarDecimal(double nuevoDecimal){
        decimal = nuevoDecimal;
    }
    
    public void imprimirDetalles(){
        String estadoTarro;
        if(tarroAbierto == false){
            estadoTarro = "Cerrado";
        } else {
            estadoTarro = "Abierto";
        }
        System.out.println("Marca:" + nombreMarca + ", NPepinillos:" + numeroPepinillos + 
        ", Tapon:" + estadoTarro + ", Tarro roto:" + tarroRoto + ", Decimal : " + decimal ); 
    }
    
    public String verDetalles(){
        String estadoTarro;
        if(tarroAbierto == false){
            estadoTarro = "Cerrado";
        } else {
            estadoTarro = "Abierto";
        }
        String detalles;
        detalles = ("Marca:" + nombreMarca + ", NPepinillos:" + numeroPepinillos + ", Tapon:" + 
        estadoTarro + ", Tarro roto:" + tarroRoto + ", Decimal : " + decimal );
        return detalles;
    }
}   
