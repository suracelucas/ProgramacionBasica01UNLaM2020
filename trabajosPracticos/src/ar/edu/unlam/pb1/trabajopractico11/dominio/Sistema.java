package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class Sistema {
	 private String nombre;
	    private Usuario[] usuarios;
	    private int ultimaPosicion;

	    private static int MAXIMA_CANTIDAD_USUARIOS = 500;

	    public Sistema(String nombre) {
	        this.nombre = nombre;
	        this.usuarios = new Usuario[MAXIMA_CANTIDAD_USUARIOS];
	        this.ultimaPosicion = 0;
	    }

	    public void ingresarNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void agregarUsuario(String usuario, String contrasena) {
	        if (this.ultimaPosicion < MAXIMA_CANTIDAD_USUARIOS) {
	            this.usuarios[this.ultimaPosicion] = new Usuario(usuario, contrasena);
	            this.ultimaPosicion++;
	            this.ordernarUsuarios();
	        }
	    }

	    public boolean loguearUsuario(String usuarioActual, String contrasena) {
	        boolean resultado = false;

	        for (int i = 0; i < this.ultimaPosicion; i++) {
	            Usuario usuario = this.usuarios[i];
	            if (usuarioActual.equalsIgnoreCase(usuario.getUsuario())) {
	                usuario.login(contrasena);
	                resultado = usuario.estaLogeado();
	                break;
	            }
	        }

	        return resultado;
	    }

	    public void desloguearUsuario(String usuarioActual, String contrasena) {
	        for (int i = 0; i < this.ultimaPosicion; i++) {
	            Usuario usuario = this.usuarios[i];
	            if (usuarioActual.equalsIgnoreCase(usuario.getUsuario()) && usuario.estaLogeado()) {
	                usuario.deslogearse();
	                break;
	            }
	        }
	    }

	    private void ordernarUsuarios() {
	        Usuario auxiliar;
	        for (int i = 1; i <= this.ultimaPosicion; i++) {
	            for (int j = 0; j < this.ultimaPosicion - 1; j++) {
	                if (this.ordernarPorUsuario(this.usuarios[j], this.usuarios[j + 1])) {
	                    auxiliar = this.usuarios[j + 1];
	                    this.usuarios[j + 1] = this.usuarios[j];
	                    this.usuarios[j] = auxiliar;
	                }
	            }
	        }
	    }

	    private boolean ordernarPorUsuario(Usuario usuarioUno, Usuario usuarioDos) {
	        String nombreUsuarioUno, nombreUsuarioDos;

	        if (usuarioUno == null || usuarioDos == null) {
	            return false;
	        }

	        nombreUsuarioUno = usuarioUno.getUsuario();
	        nombreUsuarioDos = usuarioDos.getUsuario();

	        if (nombreUsuarioUno.length() <= 0 || nombreUsuarioDos.length() <= 0) {
	            return false;
	        }

	        return nombreUsuarioUno.compareTo(nombreUsuarioDos) > 0;
	    }

	    public String toString() {
	        String mensaje = "";

	        for (int i = 0; i < this.ultimaPosicion; i++) {
	            mensaje += this.usuarios[i].getUsuario() + "\n";
	        }

	        return mensaje;
	    }
}
