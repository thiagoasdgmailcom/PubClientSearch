
package com.bdyu.sopacommunication.publicationsws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de publication complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="publication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pAuthorList" type="{http://publicationsws.sopacommunication.bdyu.com/}author" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageStart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publishYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publication", propOrder = {
    "pAuthorList",
    "id",
    "pageEnd",
    "pageStart",
    "publishYear",
    "title"
})
public class Publication {

    @XmlElement(nillable = true)
    protected List<Author> pAuthorList;
    @XmlElement(name = "ID")
    protected int id;
    protected int pageEnd;
    protected int pageStart;
    protected int publishYear;
    protected String title;

    /**
     * Gets the value of the pAuthorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pAuthorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAuthorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Author }
     * 
     * 
     */
    public List<Author> getPAuthorList() {
        if (pAuthorList == null) {
            pAuthorList = new ArrayList<Author>();
        }
        return this.pAuthorList;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade pageEnd.
     * 
     */
    public int getPageEnd() {
        return pageEnd;
    }

    /**
     * Define o valor da propriedade pageEnd.
     * 
     */
    public void setPageEnd(int value) {
        this.pageEnd = value;
    }

    /**
     * Obtém o valor da propriedade pageStart.
     * 
     */
    public int getPageStart() {
        return pageStart;
    }

    /**
     * Define o valor da propriedade pageStart.
     * 
     */
    public void setPageStart(int value) {
        this.pageStart = value;
    }

    /**
     * Obtém o valor da propriedade publishYear.
     * 
     */
    public int getPublishYear() {
        return publishYear;
    }

    /**
     * Define o valor da propriedade publishYear.
     * 
     */
    public void setPublishYear(int value) {
        this.publishYear = value;
    }

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
