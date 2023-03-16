//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 03:12:14 PM EAT 
//


package com.enat.multiAccountAPI.wsdl.chequepoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.enat.multiAccountAPI.wsdl.chequepoint package. 
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

    private final static QName _APIQueryResponse_QNAME = new QName("https://www.fintech-group.com/services/Finpay", "APIQueryResponse");
    private final static QName _APICheckStatusResponse_QNAME = new QName("https://www.fintech-group.com/services/Finpay", "APICheckStatusResponse");
    private final static QName _APIMakePaymentResponse_QNAME = new QName("https://www.fintech-group.com/services/Finpay", "APIMakePaymentResponse");
    private final static QName _APINotifyResponse_QNAME = new QName("https://www.fintech-group.com/services/Finpay", "APINotifyResponse");
    private final static QName _APISubmitACHTxnResponse_QNAME = new QName("https://www.fintech-group.com/services/Finpay", "APISubmitACHTxnResponse");
    private final static QName _APIFetchPenaltyListResponse_QNAME = new QName("https://www.fintech-group.com/services/Finpay", "APIFetchPenaltyListResponse");
    private final static QName _APIFetchPaymentListResponse_QNAME = new QName("https://www.fintech-group.com/services/Finpay", "APIFetchPaymentListResponse");
    private final static QName _APIGetAuthTokenResponse_QNAME = new QName("https://www.fintech-group.com/services/Finpay", "APIGetAuthTokenResponse");
    private final static QName _APIRetrievePenaltyResponse_QNAME = new QName("https://www.fintech-group.com/services/Finpay", "APIRetrievePenaltyResponse");
    private final static QName _APIVoidPaymentResponse_QNAME = new QName("https://www.fintech-group.com/services/Finpay", "APIVoidPaymentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.enat.multiAccountAPI.wsdl.chequepoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCountryRequest }
     * 
     */
    public GetCountryRequest createGetCountryRequest() {
        return new GetCountryRequest();
    }

    /**
     * Create an instance of {@link GetCountryResponse }
     * 
     */
    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link APIQueryResponse }
     * 
     */
    public APIQueryResponse createAPIQueryResponse() {
        return new APIQueryResponse();
    }

    /**
     * Create an instance of {@link CheckStatus }
     * 
     */
    public CheckStatus createCheckStatus() {
        return new CheckStatus();
    }

    /**
     * Create an instance of {@link CheckStatusResponse }
     * 
     */
    public CheckStatusResponse createCheckStatusResponse() {
        return new CheckStatusResponse();
    }

    /**
     * Create an instance of {@link APICheckStatusResponse }
     * 
     */
    public APICheckStatusResponse createAPICheckStatusResponse() {
        return new APICheckStatusResponse();
    }

    /**
     * Create an instance of {@link CheckStatusCH }
     * 
     */
    public CheckStatusCH createCheckStatusCH() {
        return new CheckStatusCH();
    }

    /**
     * Create an instance of {@link UtilAPICheckStatusRequest }
     * 
     */
    public UtilAPICheckStatusRequest createUtilAPICheckStatusRequest() {
        return new UtilAPICheckStatusRequest();
    }

    /**
     * Create an instance of {@link CheckStatusCHResponse }
     * 
     */
    public CheckStatusCHResponse createCheckStatusCHResponse() {
        return new CheckStatusCHResponse();
    }

    /**
     * Create an instance of {@link MakePayment }
     * 
     */
    public MakePayment createMakePayment() {
        return new MakePayment();
    }

    /**
     * Create an instance of {@link MakePaymentResponse }
     * 
     */
    public MakePaymentResponse createMakePaymentResponse() {
        return new MakePaymentResponse();
    }

    /**
     * Create an instance of {@link APIMakePaymentResponse }
     * 
     */
    public APIMakePaymentResponse createAPIMakePaymentResponse() {
        return new APIMakePaymentResponse();
    }

    /**
     * Create an instance of {@link NotifyAuthority }
     * 
     */
    public NotifyAuthority createNotifyAuthority() {
        return new NotifyAuthority();
    }

    /**
     * Create an instance of {@link NotifyAuthorityResponse }
     * 
     */
    public NotifyAuthorityResponse createNotifyAuthorityResponse() {
        return new NotifyAuthorityResponse();
    }

    /**
     * Create an instance of {@link APINotifyResponse }
     * 
     */
    public APINotifyResponse createAPINotifyResponse() {
        return new APINotifyResponse();
    }

    /**
     * Create an instance of {@link SubmitACHTxn }
     * 
     */
    public SubmitACHTxn createSubmitACHTxn() {
        return new SubmitACHTxn();
    }

    /**
     * Create an instance of {@link SubmitACHTxnResponse }
     * 
     */
    public SubmitACHTxnResponse createSubmitACHTxnResponse() {
        return new SubmitACHTxnResponse();
    }

    /**
     * Create an instance of {@link APISubmitACHTxnResponse }
     * 
     */
    public APISubmitACHTxnResponse createAPISubmitACHTxnResponse() {
        return new APISubmitACHTxnResponse();
    }

    /**
     * Create an instance of {@link SubmitTxn }
     * 
     */
    public SubmitTxn createSubmitTxn() {
        return new SubmitTxn();
    }

    /**
     * Create an instance of {@link UtilAPISubmitTxnRequest }
     * 
     */
    public UtilAPISubmitTxnRequest createUtilAPISubmitTxnRequest() {
        return new UtilAPISubmitTxnRequest();
    }

    /**
     * Create an instance of {@link SubmitTxnResponse }
     * 
     */
    public SubmitTxnResponse createSubmitTxnResponse() {
        return new SubmitTxnResponse();
    }

    /**
     * Create an instance of {@link APISubmitTxnResponse }
     * 
     */
    public APISubmitTxnResponse createAPISubmitTxnResponse() {
        return new APISubmitTxnResponse();
    }

    /**
     * Create an instance of {@link FetchPenaltyList }
     * 
     */
    public FetchPenaltyList createFetchPenaltyList() {
        return new FetchPenaltyList();
    }

    /**
     * Create an instance of {@link FetchPenaltyListResponse }
     * 
     */
    public FetchPenaltyListResponse createFetchPenaltyListResponse() {
        return new FetchPenaltyListResponse();
    }

    /**
     * Create an instance of {@link APIFetchPenaltyListResponse }
     * 
     */
    public APIFetchPenaltyListResponse createAPIFetchPenaltyListResponse() {
        return new APIFetchPenaltyListResponse();
    }

    /**
     * Create an instance of {@link FetchPaymentListByDriverID }
     * 
     */
    public FetchPaymentListByDriverID createFetchPaymentListByDriverID() {
        return new FetchPaymentListByDriverID();
    }

    /**
     * Create an instance of {@link FetchPaymentListByDriverIDResponse }
     * 
     */
    public FetchPaymentListByDriverIDResponse createFetchPaymentListByDriverIDResponse() {
        return new FetchPaymentListByDriverIDResponse();
    }

    /**
     * Create an instance of {@link APIFetchPaymentListResponse }
     * 
     */
    public APIFetchPaymentListResponse createAPIFetchPaymentListResponse() {
        return new APIFetchPaymentListResponse();
    }

    /**
     * Create an instance of {@link GetAuthToken }
     * 
     */
    public GetAuthToken createGetAuthToken() {
        return new GetAuthToken();
    }

    /**
     * Create an instance of {@link GetAuthTokenResponse }
     * 
     */
    public GetAuthTokenResponse createGetAuthTokenResponse() {
        return new GetAuthTokenResponse();
    }

    /**
     * Create an instance of {@link APIGetAuthTokenResponse }
     * 
     */
    public APIGetAuthTokenResponse createAPIGetAuthTokenResponse() {
        return new APIGetAuthTokenResponse();
    }

    /**
     * Create an instance of {@link DriverLookup }
     * 
     */
    public DriverLookup createDriverLookup() {
        return new DriverLookup();
    }

    /**
     * Create an instance of {@link UtilAPIDriverLookupRequest }
     * 
     */
    public UtilAPIDriverLookupRequest createUtilAPIDriverLookupRequest() {
        return new UtilAPIDriverLookupRequest();
    }

    /**
     * Create an instance of {@link DriverLookupResponse }
     * 
     */
    public DriverLookupResponse createDriverLookupResponse() {
        return new DriverLookupResponse();
    }

    /**
     * Create an instance of {@link APIDriverLookupResponse }
     * 
     */
    public APIDriverLookupResponse createAPIDriverLookupResponse() {
        return new APIDriverLookupResponse();
    }

    /**
     * Create an instance of {@link RegisterDriver }
     * 
     */
    public RegisterDriver createRegisterDriver() {
        return new RegisterDriver();
    }

    /**
     * Create an instance of {@link UtilAPIRegisterDriverRequest }
     * 
     */
    public UtilAPIRegisterDriverRequest createUtilAPIRegisterDriverRequest() {
        return new UtilAPIRegisterDriverRequest();
    }

    /**
     * Create an instance of {@link RegisterDriverResponse }
     * 
     */
    public RegisterDriverResponse createRegisterDriverResponse() {
        return new RegisterDriverResponse();
    }

    /**
     * Create an instance of {@link APIRegisterDriverResponse }
     * 
     */
    public APIRegisterDriverResponse createAPIRegisterDriverResponse() {
        return new APIRegisterDriverResponse();
    }

    /**
     * Create an instance of {@link RegisterPenalty }
     * 
     */
    public RegisterPenalty createRegisterPenalty() {
        return new RegisterPenalty();
    }

    /**
     * Create an instance of {@link UtilAPIRegisterPenaltyRequest }
     * 
     */
    public UtilAPIRegisterPenaltyRequest createUtilAPIRegisterPenaltyRequest() {
        return new UtilAPIRegisterPenaltyRequest();
    }

    /**
     * Create an instance of {@link RegisterPenaltyResponse }
     * 
     */
    public RegisterPenaltyResponse createRegisterPenaltyResponse() {
        return new RegisterPenaltyResponse();
    }

    /**
     * Create an instance of {@link APIRegisterPenaltyResponse }
     * 
     */
    public APIRegisterPenaltyResponse createAPIRegisterPenaltyResponse() {
        return new APIRegisterPenaltyResponse();
    }

    /**
     * Create an instance of {@link RetrievePenalty }
     * 
     */
    public RetrievePenalty createRetrievePenalty() {
        return new RetrievePenalty();
    }

    /**
     * Create an instance of {@link RetrievePenaltyResponse }
     * 
     */
    public RetrievePenaltyResponse createRetrievePenaltyResponse() {
        return new RetrievePenaltyResponse();
    }

    /**
     * Create an instance of {@link APIRetrievePenaltyResponse }
     * 
     */
    public APIRetrievePenaltyResponse createAPIRetrievePenaltyResponse() {
        return new APIRetrievePenaltyResponse();
    }

    /**
     * Create an instance of {@link SubmitPayment }
     * 
     */
    public SubmitPayment createSubmitPayment() {
        return new SubmitPayment();
    }

    /**
     * Create an instance of {@link UtilAPISubmitPaymentRequest }
     * 
     */
    public UtilAPISubmitPaymentRequest createUtilAPISubmitPaymentRequest() {
        return new UtilAPISubmitPaymentRequest();
    }

    /**
     * Create an instance of {@link SubmitPaymentResponse }
     * 
     */
    public SubmitPaymentResponse createSubmitPaymentResponse() {
        return new SubmitPaymentResponse();
    }

    /**
     * Create an instance of {@link APISubmitPaymentResponse }
     * 
     */
    public APISubmitPaymentResponse createAPISubmitPaymentResponse() {
        return new APISubmitPaymentResponse();
    }

    /**
     * Create an instance of {@link VoidPayment }
     * 
     */
    public VoidPayment createVoidPayment() {
        return new VoidPayment();
    }

    /**
     * Create an instance of {@link VoidPaymentResponse }
     * 
     */
    public VoidPaymentResponse createVoidPaymentResponse() {
        return new VoidPaymentResponse();
    }

    /**
     * Create an instance of {@link APIVoidPaymentResponse }
     * 
     */
    public APIVoidPaymentResponse createAPIVoidPaymentResponse() {
        return new APIVoidPaymentResponse();
    }

    /**
     * Create an instance of {@link QueryResponse2 }
     * 
     */
    public QueryResponse2 createQueryResponse2() {
        return new QueryResponse2();
    }

    /**
     * Create an instance of {@link UtilAPIQueryResponse }
     * 
     */
    public UtilAPIQueryResponse createUtilAPIQueryResponse() {
        return new UtilAPIQueryResponse();
    }

    /**
     * Create an instance of {@link CheckStatusResponse2 }
     * 
     */
    public CheckStatusResponse2 createCheckStatusResponse2() {
        return new CheckStatusResponse2();
    }

    /**
     * Create an instance of {@link UtilAPICheckStatusResponse }
     * 
     */
    public UtilAPICheckStatusResponse createUtilAPICheckStatusResponse() {
        return new UtilAPICheckStatusResponse();
    }

    /**
     * Create an instance of {@link MakePaymentResponse2 }
     * 
     */
    public MakePaymentResponse2 createMakePaymentResponse2() {
        return new MakePaymentResponse2();
    }

    /**
     * Create an instance of {@link UtilAPIMakePaymentResponse }
     * 
     */
    public UtilAPIMakePaymentResponse createUtilAPIMakePaymentResponse() {
        return new UtilAPIMakePaymentResponse();
    }

    /**
     * Create an instance of {@link NotifyResponse }
     * 
     */
    public NotifyResponse createNotifyResponse() {
        return new NotifyResponse();
    }

    /**
     * Create an instance of {@link UtilAPINotifyResponse }
     * 
     */
    public UtilAPINotifyResponse createUtilAPINotifyResponse() {
        return new UtilAPINotifyResponse();
    }

    /**
     * Create an instance of {@link SubmitACHTxnResponse2 }
     * 
     */
    public SubmitACHTxnResponse2 createSubmitACHTxnResponse2() {
        return new SubmitACHTxnResponse2();
    }

    /**
     * Create an instance of {@link UtilAPISubmitACHTxnResponse }
     * 
     */
    public UtilAPISubmitACHTxnResponse createUtilAPISubmitACHTxnResponse() {
        return new UtilAPISubmitACHTxnResponse();
    }

    /**
     * Create an instance of {@link SubmitTxnResponse2 }
     * 
     */
    public SubmitTxnResponse2 createSubmitTxnResponse2() {
        return new SubmitTxnResponse2();
    }

    /**
     * Create an instance of {@link UtilAPISubmitTxnResponse }
     * 
     */
    public UtilAPISubmitTxnResponse createUtilAPISubmitTxnResponse() {
        return new UtilAPISubmitTxnResponse();
    }

    /**
     * Create an instance of {@link FetchPenaltyListResponse2 }
     * 
     */
    public FetchPenaltyListResponse2 createFetchPenaltyListResponse2() {
        return new FetchPenaltyListResponse2();
    }

    /**
     * Create an instance of {@link ArrayOfUtilAPIFetchPenaltyListResponse }
     * 
     */
    public ArrayOfUtilAPIFetchPenaltyListResponse createArrayOfUtilAPIFetchPenaltyListResponse() {
        return new ArrayOfUtilAPIFetchPenaltyListResponse();
    }

    /**
     * Create an instance of {@link UtilAPIFetchPenaltyListResponse }
     * 
     */
    public UtilAPIFetchPenaltyListResponse createUtilAPIFetchPenaltyListResponse() {
        return new UtilAPIFetchPenaltyListResponse();
    }

    /**
     * Create an instance of {@link FetchPaymentListResponse }
     * 
     */
    public FetchPaymentListResponse createFetchPaymentListResponse() {
        return new FetchPaymentListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUtilAPIFetchPaymentListResponse }
     * 
     */
    public ArrayOfUtilAPIFetchPaymentListResponse createArrayOfUtilAPIFetchPaymentListResponse() {
        return new ArrayOfUtilAPIFetchPaymentListResponse();
    }

    /**
     * Create an instance of {@link UtilAPIFetchPaymentListResponse }
     * 
     */
    public UtilAPIFetchPaymentListResponse createUtilAPIFetchPaymentListResponse() {
        return new UtilAPIFetchPaymentListResponse();
    }

    /**
     * Create an instance of {@link GetAuthTokenResponse2 }
     * 
     */
    public GetAuthTokenResponse2 createGetAuthTokenResponse2() {
        return new GetAuthTokenResponse2();
    }

    /**
     * Create an instance of {@link UtilAPIGetAuthTokenResponse }
     * 
     */
    public UtilAPIGetAuthTokenResponse createUtilAPIGetAuthTokenResponse() {
        return new UtilAPIGetAuthTokenResponse();
    }

    /**
     * Create an instance of {@link DriverLookupResponse2 }
     * 
     */
    public DriverLookupResponse2 createDriverLookupResponse2() {
        return new DriverLookupResponse2();
    }

    /**
     * Create an instance of {@link ArrayOfUtilAPIDriverLookupResponse }
     * 
     */
    public ArrayOfUtilAPIDriverLookupResponse createArrayOfUtilAPIDriverLookupResponse() {
        return new ArrayOfUtilAPIDriverLookupResponse();
    }

    /**
     * Create an instance of {@link UtilAPIDriverLookupResponse }
     * 
     */
    public UtilAPIDriverLookupResponse createUtilAPIDriverLookupResponse() {
        return new UtilAPIDriverLookupResponse();
    }

    /**
     * Create an instance of {@link RegisterDriverResponse2 }
     * 
     */
    public RegisterDriverResponse2 createRegisterDriverResponse2() {
        return new RegisterDriverResponse2();
    }

    /**
     * Create an instance of {@link UtilAPIRegisterDriverResponse }
     * 
     */
    public UtilAPIRegisterDriverResponse createUtilAPIRegisterDriverResponse() {
        return new UtilAPIRegisterDriverResponse();
    }

    /**
     * Create an instance of {@link RegisterPenaltyResponse2 }
     * 
     */
    public RegisterPenaltyResponse2 createRegisterPenaltyResponse2() {
        return new RegisterPenaltyResponse2();
    }

    /**
     * Create an instance of {@link UtilAPIRegisterPenaltyResponse }
     * 
     */
    public UtilAPIRegisterPenaltyResponse createUtilAPIRegisterPenaltyResponse() {
        return new UtilAPIRegisterPenaltyResponse();
    }

    /**
     * Create an instance of {@link RetrievePenaltyResponse2 }
     * 
     */
    public RetrievePenaltyResponse2 createRetrievePenaltyResponse2() {
        return new RetrievePenaltyResponse2();
    }

    /**
     * Create an instance of {@link UtilAPIRetrievePenaltyResponse }
     * 
     */
    public UtilAPIRetrievePenaltyResponse createUtilAPIRetrievePenaltyResponse() {
        return new UtilAPIRetrievePenaltyResponse();
    }

    /**
     * Create an instance of {@link SubmitPaymentResponse2 }
     * 
     */
    public SubmitPaymentResponse2 createSubmitPaymentResponse2() {
        return new SubmitPaymentResponse2();
    }

    /**
     * Create an instance of {@link UtilAPISubmitPaymentResponse }
     * 
     */
    public UtilAPISubmitPaymentResponse createUtilAPISubmitPaymentResponse() {
        return new UtilAPISubmitPaymentResponse();
    }

    /**
     * Create an instance of {@link VoidPaymentResponse2 }
     * 
     */
    public VoidPaymentResponse2 createVoidPaymentResponse2() {
        return new VoidPaymentResponse2();
    }

    /**
     * Create an instance of {@link UtilAPIVoidPaymentResponse }
     * 
     */
    public UtilAPIVoidPaymentResponse createUtilAPIVoidPaymentResponse() {
        return new UtilAPIVoidPaymentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIQueryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APIQueryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.fintech-group.com/services/Finpay", name = "APIQueryResponse")
    public JAXBElement<APIQueryResponse> createAPIQueryResponse(APIQueryResponse value) {
        return new JAXBElement<APIQueryResponse>(_APIQueryResponse_QNAME, APIQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APICheckStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APICheckStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.fintech-group.com/services/Finpay", name = "APICheckStatusResponse")
    public JAXBElement<APICheckStatusResponse> createAPICheckStatusResponse(APICheckStatusResponse value) {
        return new JAXBElement<APICheckStatusResponse>(_APICheckStatusResponse_QNAME, APICheckStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIMakePaymentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APIMakePaymentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.fintech-group.com/services/Finpay", name = "APIMakePaymentResponse")
    public JAXBElement<APIMakePaymentResponse> createAPIMakePaymentResponse(APIMakePaymentResponse value) {
        return new JAXBElement<APIMakePaymentResponse>(_APIMakePaymentResponse_QNAME, APIMakePaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APINotifyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APINotifyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.fintech-group.com/services/Finpay", name = "APINotifyResponse")
    public JAXBElement<APINotifyResponse> createAPINotifyResponse(APINotifyResponse value) {
        return new JAXBElement<APINotifyResponse>(_APINotifyResponse_QNAME, APINotifyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APISubmitACHTxnResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APISubmitACHTxnResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.fintech-group.com/services/Finpay", name = "APISubmitACHTxnResponse")
    public JAXBElement<APISubmitACHTxnResponse> createAPISubmitACHTxnResponse(APISubmitACHTxnResponse value) {
        return new JAXBElement<APISubmitACHTxnResponse>(_APISubmitACHTxnResponse_QNAME, APISubmitACHTxnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIFetchPenaltyListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APIFetchPenaltyListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.fintech-group.com/services/Finpay", name = "APIFetchPenaltyListResponse")
    public JAXBElement<APIFetchPenaltyListResponse> createAPIFetchPenaltyListResponse(APIFetchPenaltyListResponse value) {
        return new JAXBElement<APIFetchPenaltyListResponse>(_APIFetchPenaltyListResponse_QNAME, APIFetchPenaltyListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIFetchPaymentListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APIFetchPaymentListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.fintech-group.com/services/Finpay", name = "APIFetchPaymentListResponse")
    public JAXBElement<APIFetchPaymentListResponse> createAPIFetchPaymentListResponse(APIFetchPaymentListResponse value) {
        return new JAXBElement<APIFetchPaymentListResponse>(_APIFetchPaymentListResponse_QNAME, APIFetchPaymentListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIGetAuthTokenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APIGetAuthTokenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.fintech-group.com/services/Finpay", name = "APIGetAuthTokenResponse")
    public JAXBElement<APIGetAuthTokenResponse> createAPIGetAuthTokenResponse(APIGetAuthTokenResponse value) {
        return new JAXBElement<APIGetAuthTokenResponse>(_APIGetAuthTokenResponse_QNAME, APIGetAuthTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIRetrievePenaltyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APIRetrievePenaltyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.fintech-group.com/services/Finpay", name = "APIRetrievePenaltyResponse")
    public JAXBElement<APIRetrievePenaltyResponse> createAPIRetrievePenaltyResponse(APIRetrievePenaltyResponse value) {
        return new JAXBElement<APIRetrievePenaltyResponse>(_APIRetrievePenaltyResponse_QNAME, APIRetrievePenaltyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIVoidPaymentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link APIVoidPaymentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "https://www.fintech-group.com/services/Finpay", name = "APIVoidPaymentResponse")
    public JAXBElement<APIVoidPaymentResponse> createAPIVoidPaymentResponse(APIVoidPaymentResponse value) {
        return new JAXBElement<APIVoidPaymentResponse>(_APIVoidPaymentResponse_QNAME, APIVoidPaymentResponse.class, null, value);
    }

}
