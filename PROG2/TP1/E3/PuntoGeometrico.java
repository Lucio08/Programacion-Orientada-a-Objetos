package TP1.E3;

public class PuntoGeometrico {
    private double x;
    private double y;

    public PuntoGeometrico(double x, double y) {
    this.setX(x);
    this.setY(y) ;
    }
    public PuntoGeometrico() {
    this(0, 0); // llama al de arriba con valores fijos

}

// metodos
    public void desplazarPuntos(double x, double y){
        setX(getX()+x);
        setY(getY()+y);
    }

     public double euclidea(double x,double y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));//pow eleva al numero despues de la coma y sqrt calcula la raiz cuadrada
    }
    public String toString(){
        return "x:" + this.getX() +"  y:" + this.getY();
        //return "x:" + x +"  y:" + y;
    }


    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }


    
}
