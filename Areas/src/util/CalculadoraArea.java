package util;

public class CalculadoraArea {
	
	/**
     * Calcula el área de un cuadrado dado el lado.
     *
     * @param lado el lado del cuadrado.
     * @return el área del cuadrado.
     * @throws IllegalArgumentException si el lado es menor o igual a 0.
     */
    public static double calcularAreaCuadrado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado debe ser mayor que 0");
        }
        return lado * lado;
    }

    /**
     * Calcula el área de un rectángulo dado el largo y el ancho.
     *
     * @param largo el largo del rectángulo.
     * @param ancho el ancho del rectángulo.
     * @return el área del rectángulo.
     * @throws IllegalArgumentException si el largo o el ancho es menor o igual a 0.
     */
    public static double calcularAreaRectangulo(double largo, double ancho) {
        if (largo <= 0 || ancho <= 0) {
            throw new IllegalArgumentException("El largo y el ancho deben ser mayores que 0");
        }
        return largo * ancho;
    }

    /**
     * Calcula el área de un triángulo dado la base y la altura.
     *
     * @param base la base del triángulo.
     * @param altura la altura del triángulo.
     * @return el área del triángulo.
     * @throws IllegalArgumentException si la base o la altura es menor o igual a 0.
     */
    public static double calcularAreaTriangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura deben ser mayores que 0");
        }
        return (base * altura) / 2;
    }

    /**
     * Calcula el área de un círculo dado el radio.
     *
     * @param radio el radio del círculo.
     * @return el área del círculo.
     * @throws IllegalArgumentException si el radio es menor o igual a 0.
     */
    public static double calcularAreaCirculo(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que 0");
        }
        return Math.PI * radio * radio;
    }

}
