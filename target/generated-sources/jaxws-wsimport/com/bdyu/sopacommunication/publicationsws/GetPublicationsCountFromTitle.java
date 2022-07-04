
package com.bdyu.sopacommunication.publicationsws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getPublicationsCountFromTitle complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getPublicationsCountFromTitle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPublicationsCountFromTitle", propOrder = {
    "sTitle"
})
public class GetPublicationsCountFromTitle {

    protected String sTitle;

    /**
     * Obtém o valor da propriedade sTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTitle() {
        return sTitle;
    }

    /**
     * Define o valor da propriedade sTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTitle(String value) {
        this.sTitle = value;
    }

}
