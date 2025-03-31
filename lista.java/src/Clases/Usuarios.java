package Clases;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    private String nombre;
    private String nickname;
    private String clave;
    private static List<Usuarios> usuarios = new ArrayList<>();

    public Usuarios(String nombre, String nickname, String clave) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.clave = clave;
    }

    public void guardarUsuario() {
        usuarios.add(this); // Agrega la instancia actual a la lista
    }

    public static List<Usuarios> listarUsuarios() {
        return usuarios;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public static void eliminarUsuario(String nickname) {
    usuarios.removeIf(usuario -> usuario.getNickname().equals(nickname));
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nickname: " + nickname;
    }
    
}
