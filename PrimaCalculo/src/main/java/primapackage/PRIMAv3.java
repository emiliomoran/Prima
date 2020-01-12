package primapackage;


public class PRIMAv3 {
	private int tarifa_basica = 500;
	private int reduccion_conductor_seguro = 0;
	private double factor_edad = 0;
//	private Scanner scan;
	private int edad_conductor;
	private int puntos_licencia;
	/**
	 * @param args
	 */
	public PRIMAv3(int edad_conductor, int puntos_licencia) {
		this.edad_conductor = edad_conductor;
		this.puntos_licencia = puntos_licencia;
	}
		
	public int calcula_prima() {								
		System.out.println("Cálculo de Prima");
				
//			Scanner scan = new Scanner(System.in);
//			System.out.print("Edad del conductor: ");
//		    int edad_conductor = scan.nextInt();
//		    System.out.print("Punto en licencia del conductor: ");
//		    int puntos_licencia = scan.nextInt();
//		    scan.close();
		    if(edad_conductor<18 || edad_conductor >90 || puntos_licencia<=0 || puntos_licencia>30) {
		    	System.out.println("No cumplen con los requisitos.");
		    	return -1;		    
		    }else {
		    	if(edad_conductor<25) {
			    	factor_edad = 2.8;
			    	if((30 - puntos_licencia)<=1) {
			    		reduccion_conductor_seguro = 50;
			    	}
			    }else if(edad_conductor>=25 && edad_conductor<35) {
			    	factor_edad = 1.8;
			    	if((30 - puntos_licencia)<=3) {
			    		reduccion_conductor_seguro = 50;
			    	}
			    }else if(edad_conductor>=35 && edad_conductor<45) {
			    	factor_edad = 1.0;
			    	if((30 - puntos_licencia)<=5) {
			    		reduccion_conductor_seguro = 100;
			    	}
			    }else if(edad_conductor>=45 && edad_conductor<65) {
			    	factor_edad = 0.8;
			    	if((30 - puntos_licencia)<=7) {
			    		reduccion_conductor_seguro = 150;
			    	}
			    }else {
			    	factor_edad = 1.5;
			    	if((30 - puntos_licencia)<=5) {
			    		reduccion_conductor_seguro = 200;
			    	}
			    }
			    
			    int prima = (int) ((tarifa_basica*factor_edad) - reduccion_conductor_seguro);
			    
			    System.out.println("Prima: "+ prima);
			    return prima;
		    }		
	}
}