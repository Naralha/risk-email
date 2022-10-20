package io.sld.riskemailservice.domain.entity;

import java.io.Serializable;

import javax.validation.constraints.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * A Email.
 */
@Getter
@Setter
@NoArgsConstructor
public class Email implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    private String nVarNome;


    private String nVarDescricao;


    public Email nVarNome(String nVarNome){
        setNVarNome(nVarNome);
        return this;
    }
    public Email nVarDescricao(String nVarDescricao){
        setNVarDescricao(nVarDescricao);
        return this;
    }


    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Email{" +
            ", nVarNome='" + getNVarNome() + "'" +
            ", nVarDescricao='" + getNVarDescricao() + "'" +
            "}";
    }
}
