package com.javademo.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuentas")
public class CuentaEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuenta")
    private long id;
    @Column(name = "clave")
    private long clave;
    public CuentaEntity() {
    }
    public CuentaEntity(long id, long clave) {
        this.id = id;
        this.clave = clave;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getClave() {
        return clave;
    }
    public void setClave(long clave) {
        this.clave = clave;
    }

   

}
