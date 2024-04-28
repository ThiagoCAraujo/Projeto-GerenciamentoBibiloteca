package entities;

public class Conta extends Cliente{
    private Cliente[] usuarios;

    public Conta() {
        this.usuarios = new Cliente[0];
    }

    public boolean adicionarUsuario(String usuario, String senha) {
        for (Cliente user : usuarios) {
            if (user.getUsuario().equals(usuario)) {
                return false;
            }
        }
        Cliente novoUsuario = new Cliente(usuario, senha);
        Cliente[] temp = new Cliente[usuarios.length + 1];
        System.arraycopy(usuarios, 0, temp, 0, usuarios.length);
        temp[temp.length - 1] = novoUsuario;
        usuarios = temp;
        return true;
    }

    public Cliente fazerLogin(String usuario, String senha) {
        for (Cliente user : usuarios) {
            if (user.getUsuario().equals(usuario) && user.getSenha().equals(senha)) {
                return user;
            }
        }
        return null;
    }

}
