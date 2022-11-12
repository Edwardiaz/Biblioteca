/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jorge Díaz
 */
@Entity
@Table(name = "permisos_por_rol")
@NamedQueries({
    @NamedQuery(name = "PermisosPorRol.findAll", query = "SELECT p FROM PermisosPorRol p")})
public class PermisosPorRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "codigo_privilegio", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Privilegios codigoPrivilegio;
    @JoinColumn(name = "codigo_rol", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Rol codigoRol;

    public PermisosPorRol() {
    }

    public PermisosPorRol(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Privilegios getCodigoPrivilegio() {
        return codigoPrivilegio;
    }

    public void setCodigoPrivilegio(Privilegios codigoPrivilegio) {
        this.codigoPrivilegio = codigoPrivilegio;
    }

    public Rol getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(Rol codigoRol) {
        this.codigoRol = codigoRol;
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
        if (!(object instanceof PermisosPorRol)) {
            return false;
        }
        PermisosPorRol other = (PermisosPorRol) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PermisosPorRol[ id=" + id + " ]";
    }
    
}
