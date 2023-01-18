import javax.swing.JOptionPane;

public class BatallaDificilJugadorComputadora {
    public static InstruccionesDeJuego getIdj() {
		return idj;
	}

	public static void setIdj(InstruccionesDeJuego idj) {
		BatallaDificilJugadorComputadora.idj = idj;
	}

	public static Tableros getT() {
		return t;
	}

	public static void setT(Tableros t) {
		BatallaDificilJugadorComputadora.t = t;
	}

	public static CombateJugador getCj() {
		return cj;
	}

	public static void setCj(CombateJugador cj) {
		BatallaDificilJugadorComputadora.cj = cj;
	}

	public static CombateDificilComputadora getCdc() {
		return cdc;
	}

	public static void setCdc(CombateDificilComputadora cdc) {
		BatallaDificilJugadorComputadora.cdc = cdc;
	}

	public static CombateFacilComputadora getCfc() {
		return cfc;
	}

	public static void setCfc(CombateFacilComputadora cfc) {
		BatallaDificilJugadorComputadora.cfc = cfc;
	}

	public static MetodosUtiles getMu() {
		return mu;
	}

	public static void setMu(MetodosUtiles mu) {
		BatallaDificilJugadorComputadora.mu = mu;
	}

	static InstruccionesDeJuego idj = new InstruccionesDeJuego();
    static Tableros t = new Tableros();
    static CombateJugador cj = new CombateJugador();
    static CombateDificilComputadora cdc = new CombateDificilComputadora();
    static CombateFacilComputadora cfc = new CombateFacilComputadora();
    static MetodosUtiles mu = new MetodosUtiles();
    
    public static void batallaJugadorComputadora(){
        while (t.verificarSiGanoElJugador()==false && t.verificarSiGanoLaComputadora()==false) {
            if (mu.getTurnoRandom()==0) {
                cj.generarAtaqueJugador();
                if (t.verificarSiGanoElJugador()==false) {
                    cdc.generarAtaqueComputadora();
                }
            }else if(mu.getTurnoRandom()==1){
                cdc.generarAtaqueComputadora();
                if (t.verificarSiGanoLaComputadora()==false) {
                    cj.generarAtaqueJugador();
                }
            }
            if (t.verificarSiGanoElJugador()==true) {
                JOptionPane.showMessageDialog(null,"Felicidades "+idj.getNombreUsuario()+", ganaste","Juego terminado",JOptionPane.INFORMATION_MESSAGE);
                break;
            }else if (t.verificarSiGanoLaComputadora()==true) {
                JOptionPane.showMessageDialog(null,"Lo sentimos "+idj.getNombreUsuario()+", perdiste","Juego terminado",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
    
}