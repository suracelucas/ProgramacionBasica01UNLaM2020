package ar.edu.unlam.pb1.trabajoPractico09.dominio;

public class Sistema {
    private String nombre;
    private Usuario[] usuarios;
    private int usuarioActual;

    private static int MAXIMA_CANTIDAD_USUARIOS = 500;

    public Sistema(String nombre) {
        this.nombre = nombre;
        this.usuarios = new Usuario[MAXIMA_CANTIDAD_USUARIOS];
        this.usuarioActual = 0;
    }

    public void ingresarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarUsuario(String usuario, String contrasena) {
        if (this.usuarioActual < MAXIMA_CANTIDAD_USUARIOS) {
            this.usuarios[this.usuarioActual] = new Usuario(usuario, contrasena);
            this.usuarioActual++;
        }
    }

    public boolean loguearUsuario(String usuarioActual, String contrasena) {
        boolean resultado = false;

        for (int i = 0; i < this.usuarioActual; i++) {
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
        for (int i = 0; i < this.usuarioActual; i++) {
            Usuario usuario = this.usuarios[i];
            if (usuarioActual.equalsIgnoreCase(usuario.getUsuario()) && usuario.estaLogeado()) {
                usuario.deslogearse();
                break;
            }
        }
    }
}