package com.example.demo.model;

import org.hibernate.type.descriptor.sql.BitTypeDescriptor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Numero {
    private String codigoTermo;
    private String tipoTermo;
    private BitTypeDescriptor flagAceite;
    public String getCodigoTermo() {
        return codigoTermo;
    }

    public void setCodigoTermo(String codigoTermo) {
        this.codigoTermo = codigoTermo;
    }

    public String getTipoTermo() {
        return tipoTermo;
    }

    public void setTipoTermo(String tipoTermo) {
        this.tipoTermo = tipoTermo;
    }

    public BitTypeDescriptor getFlagAceite() {
        return flagAceite;
    }

    public void setFlagAceite(BitTypeDescriptor flagAceite) {
        this.flagAceite = flagAceite;
    }
}
