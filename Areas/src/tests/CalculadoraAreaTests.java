package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.CalculadoraArea;

class CalculadoraAreaTests {

	@Test
    void testCalcularAreaCuadrado() {
        double areaEspera = 16.0;
        double areaObtiene = CalculadoraArea.calcularAreaCuadrado(4.0);
        assertEquals(areaEspera, areaObtiene);
    }

    @Test
    void testCalcularAreaRectangulo() {
        double areaEspera = 15.0;
        double areaObtiene = CalculadoraArea.calcularAreaRectangulo(5.0, 3.0);
        assertEquals(areaEspera, areaObtiene);
    }

    @Test
    void testCalcularAreaTriangulo() {
        double areaEspera = 12.0;
        double areaObtiene = CalculadoraArea.calcularAreaTriangulo(6.0, 4.0);
        assertEquals(areaEspera, areaObtiene);
    }

    @Test
    void testCalcularAreaCirculo() {
        double areaEspera = Math.PI * 9;
        double areaObtiene = CalculadoraArea.calcularAreaCirculo(3.0);
        assertEquals(areaEspera, areaObtiene, 0.0001);
    }

    @Test
    void testCalcularAreaCuadradoConLadoNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	CalculadoraArea.calcularAreaCuadrado(-4.0);
        });
        assertEquals("El lado debe ser mayor que 0", exception.getMessage());
    }

    @Test
    void testCalcularAreaRectanguloConAnchoCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	CalculadoraArea.calcularAreaRectangulo(5.0, 0.0);
        });
        assertEquals("El largo y el ancho deben ser mayores que 0", exception.getMessage());
    }

    @Test
    void testCalcularAreaTrianguloConAlturaNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	CalculadoraArea.calcularAreaTriangulo(6.0, -4.0);
        });
        assertEquals("La base y la altura deben ser mayores que 0", exception.getMessage());
    }

    @Test
    void testCalcularAreaCirculoConRadioCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        	CalculadoraArea.calcularAreaCirculo(0.0);
        });
        assertEquals("El radio debe ser mayor que 0", exception.getMessage());
    }

}
