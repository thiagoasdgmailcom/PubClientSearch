
package com.bdyu.sopacommunication.publicationsws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getAuthorByID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getAuthorByID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAuthorByID", propOrder = {
    "sid"
})
public class GetAuthorByID {

    @XmlElement(name = "sID")
    protected int sid;

    /**
     * Obtém o valor da propriedade sid.
     * 
     */
    public int getSID() {
        return sid;
    }

    /**
     * Define o valor da propriedade sid.
     * 
     */
    public void setSID(int value) {
        this.sid = value;
    }

}
