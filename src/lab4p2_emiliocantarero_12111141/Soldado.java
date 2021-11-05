
package lab4p2_emiliocantarero_12111141;

public abstract class Soldado {
    private String nombre, rango;
    private int edad, tiempo;
    private float vida;

    public Soldado() {
    }

    public Soldado(String nombre, String rango, int edad, int tiempo, float vida) {
        this.nombre = nombre;
        this.rango = rango;
        this.edad = edad;
        this.tiempo = tiempo;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", rango=" + rango + ", edad=" + edad + ", tiempo=" + tiempo + ", vida=" + vida + '}';
    }
    
    public abstract float ataque();
    
    
}
