package domix.talks.error.handling.security;

/**
 * Contrato de los servicios de seguridad.
 */
public interface LoginService {

    /**
     * Intenta realizar un login con las credenciales proporcionadas.
     *
     * @param username El identificador del usuario.
     * @param password El password proporcionado.
     * @return true si las credenciales son correctas.
     */
    boolean isLoginValid(String username, char[] password);
}
