package ar.edu.unlam.pb1.trabajoPractico09.dominio;

public class Usuario {
	private String usuario;
    private String contrasena;
    private boolean estaLogeado;

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.estaLogeado = false;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public boolean estaLogeado() {
        return this.estaLogeado;
    }

    public void login(String contrasenaActual) {
        if (this.contrasena.equals(contrasenaActual)) {
            this.estaLogeado = true;
        }
    }

    public void deslogearse() {
        this.estaLogeado = false;
    }
}
