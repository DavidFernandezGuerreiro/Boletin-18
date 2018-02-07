
package boletin.pkg18;

/**
 *
 * @author dfernandezguerreiro
 */
public class Correo {
    private String contidoCorreo;
    private boolean leido;

    public Correo() {
    }

    public Correo(String contidoCorreo, boolean leido) {
        this.contidoCorreo=contidoCorreo;
        this.leido=leido;
    }

    public String getContidoCorreo() {
        return contidoCorreo;
    }

    public void setContidoCorreo(String contidoCorreo) {
        this.contidoCorreo=contidoCorreo;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido=leido;
    }

    @Override
    public String toString() {
        return "Contido Correo: "+contidoCorreo+", leido: "+leido;
    }
}
