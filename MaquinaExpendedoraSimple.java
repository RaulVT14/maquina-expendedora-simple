public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;
    // Vaciado del dinero total acumulado
    private int vaciarDepositoDinero;

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    public MaquinaExpendedoraSimple() {
        precioBillete = 12;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = "Madrid";
    }
    
    /**
     * Crea un maquina expendedora de billetes de tren con el
     * precio del billete y el destino dados.
     */
    public MaquinaExpendedoraSimple(int precioDelBillete, String destino) {
        precioBillete = precioDelBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "León";
        estacionDestino = destino;
        
        
        
    }
    
    /**
     * Permite vaciar todo el dinero acumulado
     */
    public void vaciarDepositoDinero() {
        totalDineroAcumulado = 0;
    }
    
    /**
     * Permite reducir el valor del precio en una cantidad
     * pasada como parámetro
     */
    public void setReducirPrecioBillete(int cantidadDescuento) {
        precioBillete = precioBillete - cantidadDescuento;
    }
    
    /**
     * Permite cambiar el valor del precio
     * del billete 
     */
    public void setPrecioBillete(int precioDelBillete) {
        precioBillete = precioDelBillete;
    }

    /**
     * Devuelve el dinero total acumulado
     */
    public int getTotalDineroAcumulado() {
        return totalDineroAcumulado;
    }
     
    
    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }

    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }

    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        balanceClienteActual = balanceClienteActual + cantidadIntroducida;
    }

    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        System.out.println("##################");
        System.out.println("# Billete de tren:");
        System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
        System.out.println("# " + precioBillete + " euros.");
        System.out.println("##################");
        System.out.println();

        // Actualiza el total de dinero acumulado en la maquina
        totalDineroAcumulado = totalDineroAcumulado + balanceClienteActual;
        // Queda preparada para el proximo cliente
        balanceClienteActual = 0;
    }
}
