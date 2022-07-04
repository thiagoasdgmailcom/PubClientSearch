
package com.bdyu.sopacommunication.publicationsws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bdyu.sopacommunication.publicationsws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPublicationsFromTitle_QNAME = new QName("http://publicationsws.sopacommunication.bdyu.com/", "getPublicationsFromTitle");
    private final static QName _GetPublicationsCountFromTitleResponse_QNAME = new QName("http://publicationsws.sopacommunication.bdyu.com/", "getPublicationsCountFromTitleResponse");
    private final static QName _GetPublicationsCountFromTitle_QNAME = new QName("http://publicationsws.sopacommunication.bdyu.com/", "getPublicationsCountFromTitle");
    private final static QName _GetAuthorByID_QNAME = new QName("http://publicationsws.sopacommunication.bdyu.com/", "getAuthorByID");
    private final static QName _GetPublicationsStringFromTitle_QNAME = new QName("http://publicationsws.sopacommunication.bdyu.com/", "getPublicationsStringFromTitle");
    private final static QName _GetPublicationsFromTitleResponse_QNAME = new QName("http://publicationsws.sopacommunication.bdyu.com/", "getPublicationsFromTitleResponse");
    private final static QName _GetAuthorByIDResponse_QNAME = new QName("http://publicationsws.sopacommunication.bdyu.com/", "getAuthorByIDResponse");
    private final static QName _GetPublicationsStringFromTitleResponse_QNAME = new QName("http://publicationsws.sopacommunication.bdyu.com/", "getPublicationsStringFromTitleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bdyu.sopacommunication.publicationsws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPublicationsCountFromTitleResponse }
     * 
     */
    public GetPublicationsCountFromTitleResponse createGetPublicationsCountFromTitleResponse() {
        return new GetPublicationsCountFromTitleResponse();
    }

    /**
     * Create an instance of {@link GetPublicationsFromTitle }
     * 
     */
    public GetPublicationsFromTitle createGetPublicationsFromTitle() {
        return new GetPublicationsFromTitle();
    }

    /**
     * Create an instance of {@link GetAuthorByID }
     * 
     */
    public GetAuthorByID createGetAuthorByID() {
        return new GetAuthorByID();
    }

    /**
     * Create an instance of {@link GetPublicationsCountFromTitle }
     * 
     */
    public GetPublicationsCountFromTitle createGetPublicationsCountFromTitle() {
        return new GetPublicationsCountFromTitle();
    }

    /**
     * Create an instance of {@link GetAuthorByIDResponse }
     * 
     */
    public GetAuthorByIDResponse createGetAuthorByIDResponse() {
        return new GetAuthorByIDResponse();
    }

    /**
     * Create an instance of {@link GetPublicationsStringFromTitleResponse }
     * 
     */
    public GetPublicationsStringFromTitleResponse createGetPublicationsStringFromTitleResponse() {
        return new GetPublicationsStringFromTitleResponse();
    }

    /**
     * Create an instance of {@link GetPublicationsFromTitleResponse }
     * 
     */
    public GetPublicationsFromTitleResponse createGetPublicationsFromTitleResponse() {
        return new GetPublicationsFromTitleResponse();
    }

    /**
     * Create an instance of {@link GetPublicationsStringFromTitle }
     * 
     */
    public GetPublicationsStringFromTitle createGetPublicationsStringFromTitle() {
        return new GetPublicationsStringFromTitle();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Publication }
     * 
     */
    public Publication createPublication() {
        return new Publication();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicationsFromTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publicationsws.sopacommunication.bdyu.com/", name = "getPublicationsFromTitle")
    public JAXBElement<GetPublicationsFromTitle> createGetPublicationsFromTitle(GetPublicationsFromTitle value) {
        return new JAXBElement<GetPublicationsFromTitle>(_GetPublicationsFromTitle_QNAME, GetPublicationsFromTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicationsCountFromTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publicationsws.sopacommunication.bdyu.com/", name = "getPublicationsCountFromTitleResponse")
    public JAXBElement<GetPublicationsCountFromTitleResponse> createGetPublicationsCountFromTitleResponse(GetPublicationsCountFromTitleResponse value) {
        return new JAXBElement<GetPublicationsCountFromTitleResponse>(_GetPublicationsCountFromTitleResponse_QNAME, GetPublicationsCountFromTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicationsCountFromTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publicationsws.sopacommunication.bdyu.com/", name = "getPublicationsCountFromTitle")
    public JAXBElement<GetPublicationsCountFromTitle> createGetPublicationsCountFromTitle(GetPublicationsCountFromTitle value) {
        return new JAXBElement<GetPublicationsCountFromTitle>(_GetPublicationsCountFromTitle_QNAME, GetPublicationsCountFromTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publicationsws.sopacommunication.bdyu.com/", name = "getAuthorByID")
    public JAXBElement<GetAuthorByID> createGetAuthorByID(GetAuthorByID value) {
        return new JAXBElement<GetAuthorByID>(_GetAuthorByID_QNAME, GetAuthorByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicationsStringFromTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publicationsws.sopacommunication.bdyu.com/", name = "getPublicationsStringFromTitle")
    public JAXBElement<GetPublicationsStringFromTitle> createGetPublicationsStringFromTitle(GetPublicationsStringFromTitle value) {
        return new JAXBElement<GetPublicationsStringFromTitle>(_GetPublicationsStringFromTitle_QNAME, GetPublicationsStringFromTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicationsFromTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publicationsws.sopacommunication.bdyu.com/", name = "getPublicationsFromTitleResponse")
    public JAXBElement<GetPublicationsFromTitleResponse> createGetPublicationsFromTitleResponse(GetPublicationsFromTitleResponse value) {
        return new JAXBElement<GetPublicationsFromTitleResponse>(_GetPublicationsFromTitleResponse_QNAME, GetPublicationsFromTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publicationsws.sopacommunication.bdyu.com/", name = "getAuthorByIDResponse")
    public JAXBElement<GetAuthorByIDResponse> createGetAuthorByIDResponse(GetAuthorByIDResponse value) {
        return new JAXBElement<GetAuthorByIDResponse>(_GetAuthorByIDResponse_QNAME, GetAuthorByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicationsStringFromTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://publicationsws.sopacommunication.bdyu.com/", name = "getPublicationsStringFromTitleResponse")
    public JAXBElement<GetPublicationsStringFromTitleResponse> createGetPublicationsStringFromTitleResponse(GetPublicationsStringFromTitleResponse value) {
        return new JAXBElement<GetPublicationsStringFromTitleResponse>(_GetPublicationsStringFromTitleResponse_QNAME, GetPublicationsStringFromTitleResponse.class, null, value);
    }

}
