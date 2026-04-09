package com.senati.gotagota.entity;

import jakarta.persistence.*;

// @Entity le dice a Hibernate que esta clase representa una tabla de 80
@Entity
// @Table indica el nombre exacto de table en MYSQL o MariaDB
@Table(name = "Cliente")
public class Cliente {
    // @Id marca este campo como la clave primaria de la tabla
    // @GenerateValue hace que el 10 se genere automaticamente (AutoIncrement)
    // @Column(name="cliente_id") indica el nombre exacto de la columna  en mysql
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private long id;
    // nullable=false significa que este campo no pude estar vacio en la DB
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private  String apellido;
    //unique=true significa que no puede haber dos clientes con el mismo DNI
    //length=8 significa limita el campo a 8 caracteres
    @Column(nullable = false,unique = true,length = 8)
    private  String DNI;
    //Sin anotaciones ( @ ) extra: columna normal, puede ser nula
    private String telefono;
    private String direccion;
    //GETTER a SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
