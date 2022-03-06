package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author Elena Dopico
 */
public class Aro {


    /**
    * Coordenada X
    */
    private int coordenadaX;
    /**
    * Coordenada Y
    */
    private int coordenadaY;
    /**
    * Radio
    */
    private double radio;
    /**
    * Límite mínimo de radio
    */
    private static final double LIMITERADIO = 0.0;

    /**
    * Constructor sin parámetros para la clase Aro
    */
    public Aro() {
    }

    /**
    * Constructor para la clase Aro que asigna los valores de la coordenada X,
    * la coordenada Y y el radio. 
    * @param valorX valor de la coordenada X
    * @param valorY valor de la coordenada Y
    * @param valorRadio valor del radio
    */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }


    /**
    * Obtiene el valor del diámetro
    * @return diámetro
    */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
    * Obtiene el valor de la circunferencia
    * @return circunferencia
    */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
    * Obtiene el valor de la superficie
    * @return superficie
    */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
    * Obtiene una representación del objecto en formato string
    * @return string que representa el objecto
    */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }
    
    /**
    * Traslada el centro
    * @param trasladarX valor que se suma a la coordenada X
    * @param trasladarY valor que se suma a la coordenada Y
    */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

    /**
    * Obtiene el valor de la coordenada X
    * @return Coordenada X
    */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
    * Establece el valor de la coordenada X
    * @param coordenadaX Coordenada X
    */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
    * Obtiene el valor de la coordenada Y
    * @return Coordenada Y
    */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
    * Establece el valor de la coordenada Y
    * @param coordenadaY Coordenada X
    */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
    * Obtiene el valor del radio
    * @return radio
    */
    public double getRadio() {
        return radio;
    }

    /**
    * Establece el valor del radio
    * @param radio radio
    */
    public void setRadio(double radio) {
        this.radio=(radio < LIMITERADIO ? LIMITERADIO : radio);
    }
}