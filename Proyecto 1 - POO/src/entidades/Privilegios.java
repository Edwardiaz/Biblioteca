/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jorge Díaz
 */
@Entity
@Table(name = "privilegios")
@NamedQueries({
    @NamedQuery(name = "Privilegios.findAll", query = "SELECT p FROM Privilegios p")})
public class Privilegios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "guardar")
    private int guardar;
    @Basic(optional = false)
    @Column(name = "actualizar")
    private int actualizar;
    @Basic(optional = false)
    @Column(name = "borrar")
    private int borrar;
    @Basic(optional = false)
    @Column(name = "consultar")
    private int consultar;
    @Basic(optional = false)
    @Column(name = "prestar")
    private int prestar;
    @Basic(optional = false)
    @Column(name = "numero_prestamos")
    private int numeroPrestamos;
    @Basic(optional = false)
    @Column(name = "tiempo_prestamo")
    private int tiempoPrestamo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoPrivilegio")
    private List<PermisosPorRol> permisosPorRolList;

    public Privilegios() {
    }

    public Privilegios(Integer id) {
        this.id = id;
    }

    public Privilegios(Integer id, int guardar, int actualizar, int borrar, int consultar, int prestar, int numeroPrestamos, int tiempoPrestamo) {
        this.id = id;
        this.guardar = guardar;
        this.actualizar = actualizar;
        this.borrar = borrar;
        this.consultar = consultar;
        this.prestar = prestar;
        this.numeroPrestamos = numeroPrestamos;
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getGuardar() {
        return guardar;
    }

    public void setGuardar(int guardar) {
        this.guardar = guardar;
    }

    public int getActualizar() {
        return actualizar;
    }

    public void setActualizar(int actualizar) {
        this.actualizar = actualizar;
    }

    public int getBorrar() {
        return borrar;
    }

    public void setBorrar(int borrar) {
        this.borrar = borrar;
    }

    public int getConsultar() {
        return consultar;
    }

    public void setConsultar(int consultar) {
        this.consultar = consultar;
    }

    public int getPrestar() {
        return prestar;
    }

    public void setPrestar(int prestar) {
        this.prestar = prestar;
    }

    public int getNumeroPrestamos() {
        return numeroPrestamos;
    }

    public void setNumeroPrestamos(int numeroPrestamos) {
        this.numeroPrestamos = numeroPrestamos;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(int tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public List<PermisosPorRol> getPermisosPorRolList() {
        return permisosPorRolList;
    }

    public void setPermisosPorRolList(List<PermisosPorRol> permisosPorRolList) {
        this.permisosPorRolList = permisosPorRolList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Privilegios)) {
            return false;
        }
        Privilegios other = (Privilegios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Privilegios[ id=" + id + " ]";
    }
    
}
