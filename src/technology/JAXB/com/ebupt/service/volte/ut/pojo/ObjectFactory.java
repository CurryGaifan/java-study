//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.12.16 时间 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ebupt.service.volte.ut package. 
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

    private final static QName _IncomingCommunicationBarring_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "incoming-communication-barring");
    private final static QName _Anonymous_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "anonymous");
    private final static QName _RuleDeactivated_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "rule-deactivated");
    private final static QName _CommunicationDiversionServCap_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "communication-diversion-serv-cap");
    private final static QName _OtherIdentity_QNAME = new QName("urn:oma:xml:xdm:common-policy", "other-identity");
    private final static QName _CommunicationWaiting_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "communication-waiting");
    private final static QName _AnonymousRequest_QNAME = new QName("urn:oma:xml:xdm:common-policy", "anonymous-request");
    private final static QName _Roaming_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "roaming");
    private final static QName _CommunicationDiversion_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "communication-diversion");
    private final static QName _NoAnswer_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "no-answer");
    private final static QName _Allow_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "allow");
    private final static QName _OutgoingCommunicationBarring_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "outgoing-communication-barring");
    private final static QName _ForwardTo_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "forward-to");
    private final static QName _Busy_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "busy");
    private final static QName _TerminatingIdentityPresentation_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "terminating-identity-presentation");
    private final static QName _CommunicationBarringServCap_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "communication-barring-serv-cap");
    private final static QName _TerminatingIdentityPresentationRestriction_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "terminating-identity-presentation-restriction");
    private final static QName _CommunicationDiverted_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "communication-diverted");
    private final static QName _NotReachable_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "not-reachable");
    private final static QName _Media_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "media");
    private final static QName _InternationalExHC_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "international-exHC");
    private final static QName _NotRegistered_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "not-registered");
    private final static QName _International_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "international");
    private final static QName _AbsService_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "absService");
    private final static QName _OriginatingIdentityPresentation_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "originating-identity-presentation");
    private final static QName _PresenceStatus_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "presence-status");
    private final static QName _OriginatingIdentityPresentationRestriction_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "originating-identity-presentation-restriction");
    private final static QName _NoReplyTimer_QNAME = new QName("http://uri.etsi.org/ngn/params/xml/simservs/xcap", "NoReplyTimer");
    private final static QName _ConditionsTypeIdentity_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "identity");
    private final static QName _ConditionsTypeValidity_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "validity");
    private final static QName _ConditionsTypeSphere_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "sphere");
    private final static QName _ManyTypeExcept_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "except");
    private final static QName _IdentityTypeMany_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "many");
    private final static QName _IdentityTypeOne_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "one");
    private final static QName _ValidityTypeFrom_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "from");
    private final static QName _ValidityTypeUntil_QNAME = new QName("urn:ietf:params:xml:ns:common-policy", "until");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ebupt.service.volte.ut
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Simservs }
     * 
     */
    public Simservs createSimservs() {
        return new Simservs();
    }

    /**
     * Create an instance of {@link CommunicationBarringServCap }
     * 
     */
    public CommunicationBarringServCap createCommunicationBarringServCap() {
        return new CommunicationBarringServCap();
    }

    /**
     * Create an instance of {@link CommunicationDiversionServCap }
     * 
     */
    public CommunicationDiversionServCap createCommunicationDiversionServCap() {
        return new CommunicationDiversionServCap();
    }

    /**
     * Create an instance of {@link OutgoingCommunicationBarring }
     * 
     */
    public OutgoingCommunicationBarring createOutgoingCommunicationBarring() {
        return new OutgoingCommunicationBarring();
    }

    /**
     * Create an instance of {@link SimservType }
     * 
     */
    public SimservType createSimservType() {
        return new SimservType();
    }

    /**
     * Create an instance of {@link EmptyElementType }
     * 
     */
    public EmptyElementType createEmptyElementType() {
        return new EmptyElementType();
    }

    /**
     * Create an instance of {@link ForwardToType }
     * 
     */
    public ForwardToType createForwardToType() {
        return new ForwardToType();
    }

    /**
     * Create an instance of {@link Simservs.Extensions }
     * 
     */
    public Simservs.Extensions createSimservsExtensions() {
        return new Simservs.Extensions();
    }

    /**
     * Create an instance of {@link IncomingCommunicationBarring }
     * 
     */
    public IncomingCommunicationBarring createIncomingCommunicationBarring() {
        return new IncomingCommunicationBarring();
    }

    /**
     * Create an instance of {@link CommunicationDiversion }
     * 
     */
    public CommunicationDiversion createCommunicationDiversion() {
        return new CommunicationDiversion();
    }

    /**
     * Create an instance of {@link OriginatingIdentityPresentationRestriction }
     * 
     */
    public OriginatingIdentityPresentationRestriction createOriginatingIdentityPresentationRestriction() {
        return new OriginatingIdentityPresentationRestriction();
    }

    /**
     * Create an instance of {@link TerminatingIdentityPresentationRestriction }
     * 
     */
    public TerminatingIdentityPresentationRestriction createTerminatingIdentityPresentationRestriction() {
        return new TerminatingIdentityPresentationRestriction();
    }

    /**
     * Create an instance of {@link ProvisionedType }
     * 
     */
    public ProvisionedType createProvisionedType() {
        return new ProvisionedType();
    }

    /**
     * Create an instance of {@link ProvisionedTargetType }
     * 
     */
    public ProvisionedTargetType createProvisionedTargetType() {
        return new ProvisionedTargetType();
    }

    /**
     * Create an instance of {@link SupportedMediaType }
     * 
     */
    public SupportedMediaType createSupportedMediaType() {
        return new SupportedMediaType();
    }

    /**
     * Create an instance of {@link Ruleset }
     * 
     */
    public Ruleset createRuleset() {
        return new Ruleset();
    }

    /**
     * Create an instance of {@link RuleType }
     * 
     */
    public RuleType createRuleType() {
        return new RuleType();
    }

    /**
     * Create an instance of {@link SphereType }
     * 
     */
    public SphereType createSphereType() {
        return new SphereType();
    }

    /**
     * Create an instance of {@link IdentityType }
     * 
     */
    public IdentityType createIdentityType() {
        return new IdentityType();
    }

    /**
     * Create an instance of {@link ValidityType }
     * 
     */
    public ValidityType createValidityType() {
        return new ValidityType();
    }

    /**
     * Create an instance of {@link ManyType }
     * 
     */
    public ManyType createManyType() {
        return new ManyType();
    }

    /**
     * Create an instance of {@link OneType }
     * 
     */
    public OneType createOneType() {
        return new OneType();
    }

    /**
     * Create an instance of {@link ExtensibleType }
     * 
     */
    public ExtensibleType createExtensibleType() {
        return new ExtensibleType();
    }

    /**
     * Create an instance of {@link ConditionsType }
     * 
     */
    public ConditionsType createConditionsType() {
        return new ConditionsType();
    }

    /**
     * Create an instance of {@link ExceptType }
     * 
     */
    public ExceptType createExceptType() {
        return new ExceptType();
    }

    /**
     * Create an instance of {@link EmptyType }
     * 
     */
    public EmptyType createEmptyType() {
        return new EmptyType();
    }

    /**
     * Create an instance of {@link ExternalList }
     * 
     */
    public ExternalList createExternalList() {
        return new ExternalList();
    }

    /**
     * Create an instance of {@link AnchorType }
     * 
     */
    public AnchorType createAnchorType() {
        return new AnchorType();
    }

    /**
     * Create an instance of {@link CommunicationBarringServCap.ServCapConditions }
     * 
     */
    public CommunicationBarringServCap.ServCapConditions createCommunicationBarringServCapServCapConditions() {
        return new CommunicationBarringServCap.ServCapConditions();
    }

    /**
     * Create an instance of {@link CommunicationDiversionServCap.ServCapConditions }
     * 
     */
    public CommunicationDiversionServCap.ServCapConditions createCommunicationDiversionServCapServCapConditions() {
        return new CommunicationDiversionServCap.ServCapConditions();
    }

    /**
     * Create an instance of {@link CommunicationDiversionServCap.ServCapActions }
     * 
     */
    public CommunicationDiversionServCap.ServCapActions createCommunicationDiversionServCapServCapActions() {
        return new CommunicationDiversionServCap.ServCapActions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncomingCommunicationBarring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "incoming-communication-barring", substitutionHeadNamespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", substitutionHeadName = "absService")
    public JAXBElement<IncomingCommunicationBarring> createIncomingCommunicationBarring(IncomingCommunicationBarring value) {
        return new JAXBElement<IncomingCommunicationBarring>(_IncomingCommunicationBarring_QNAME, IncomingCommunicationBarring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "anonymous")
    public JAXBElement<EmptyElementType> createAnonymous(EmptyElementType value) {
        return new JAXBElement<EmptyElementType>(_Anonymous_QNAME, EmptyElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "rule-deactivated")
    public JAXBElement<EmptyElementType> createRuleDeactivated(EmptyElementType value) {
        return new JAXBElement<EmptyElementType>(_RuleDeactivated_QNAME, EmptyElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationDiversionServCap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "communication-diversion-serv-cap", substitutionHeadNamespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", substitutionHeadName = "absService")
    public JAXBElement<CommunicationDiversionServCap> createCommunicationDiversionServCap(CommunicationDiversionServCap value) {
        return new JAXBElement<CommunicationDiversionServCap>(_CommunicationDiversionServCap_QNAME, CommunicationDiversionServCap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oma:xml:xdm:common-policy", name = "other-identity")
    public JAXBElement<EmptyType> createOtherIdentity(EmptyType value) {
        return new JAXBElement<EmptyType>(_OtherIdentity_QNAME, EmptyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimservType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "communication-waiting", substitutionHeadNamespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", substitutionHeadName = "absService")
    public JAXBElement<SimservType> createCommunicationWaiting(SimservType value) {
        return new JAXBElement<SimservType>(_CommunicationWaiting_QNAME, SimservType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oma:xml:xdm:common-policy", name = "anonymous-request")
    public JAXBElement<EmptyType> createAnonymousRequest(EmptyType value) {
        return new JAXBElement<EmptyType>(_AnonymousRequest_QNAME, EmptyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "roaming")
    public JAXBElement<EmptyElementType> createRoaming(EmptyElementType value) {
        return new JAXBElement<EmptyElementType>(_Roaming_QNAME, EmptyElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationDiversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "communication-diversion", substitutionHeadNamespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", substitutionHeadName = "absService")
    public JAXBElement<CommunicationDiversion> createCommunicationDiversion(CommunicationDiversion value) {
        return new JAXBElement<CommunicationDiversion>(_CommunicationDiversion_QNAME, CommunicationDiversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "no-answer")
    public JAXBElement<EmptyElementType> createNoAnswer(EmptyElementType value) {
        return new JAXBElement<EmptyElementType>(_NoAnswer_QNAME, EmptyElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "allow")
    public JAXBElement<Boolean> createAllow(Boolean value) {
        return new JAXBElement<Boolean>(_Allow_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutgoingCommunicationBarring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "outgoing-communication-barring", substitutionHeadNamespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", substitutionHeadName = "absService")
    public JAXBElement<OutgoingCommunicationBarring> createOutgoingCommunicationBarring(OutgoingCommunicationBarring value) {
        return new JAXBElement<OutgoingCommunicationBarring>(_OutgoingCommunicationBarring_QNAME, OutgoingCommunicationBarring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardToType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "forward-to")
    public JAXBElement<ForwardToType> createForwardTo(ForwardToType value) {
        return new JAXBElement<ForwardToType>(_ForwardTo_QNAME, ForwardToType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "busy")
    public JAXBElement<EmptyElementType> createBusy(EmptyElementType value) {
        return new JAXBElement<EmptyElementType>(_Busy_QNAME, EmptyElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimservType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "terminating-identity-presentation", substitutionHeadNamespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", substitutionHeadName = "absService")
    public JAXBElement<SimservType> createTerminatingIdentityPresentation(SimservType value) {
        return new JAXBElement<SimservType>(_TerminatingIdentityPresentation_QNAME, SimservType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationBarringServCap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "communication-barring-serv-cap", substitutionHeadNamespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", substitutionHeadName = "absService")
    public JAXBElement<CommunicationBarringServCap> createCommunicationBarringServCap(CommunicationBarringServCap value) {
        return new JAXBElement<CommunicationBarringServCap>(_CommunicationBarringServCap_QNAME, CommunicationBarringServCap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminatingIdentityPresentationRestriction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "terminating-identity-presentation-restriction", substitutionHeadNamespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", substitutionHeadName = "absService")
    public JAXBElement<TerminatingIdentityPresentationRestriction> createTerminatingIdentityPresentationRestriction(TerminatingIdentityPresentationRestriction value) {
        return new JAXBElement<TerminatingIdentityPresentationRestriction>(_TerminatingIdentityPresentationRestriction_QNAME, TerminatingIdentityPresentationRestriction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "communication-diverted")
    public JAXBElement<EmptyElementType> createCommunicationDiverted(EmptyElementType value) {
        return new JAXBElement<EmptyElementType>(_CommunicationDiverted_QNAME, EmptyElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "not-reachable")
    public JAXBElement<EmptyElementType> createNotReachable(EmptyElementType value) {
        return new JAXBElement<EmptyElementType>(_NotReachable_QNAME, EmptyElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "media")
    public JAXBElement<String> createMedia(String value) {
        return new JAXBElement<String>(_Media_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "international-exHC")
    public JAXBElement<EmptyElementType> createInternationalExHC(EmptyElementType value) {
        return new JAXBElement<EmptyElementType>(_InternationalExHC_QNAME, EmptyElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "not-registered")
    public JAXBElement<EmptyElementType> createNotRegistered(EmptyElementType value) {
        return new JAXBElement<EmptyElementType>(_NotRegistered_QNAME, EmptyElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "international")
    public JAXBElement<EmptyElementType> createInternational(EmptyElementType value) {
        return new JAXBElement<EmptyElementType>(_International_QNAME, EmptyElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimservType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "absService")
    public JAXBElement<SimservType> createAbsService(SimservType value) {
        return new JAXBElement<SimservType>(_AbsService_QNAME, SimservType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimservType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "originating-identity-presentation", substitutionHeadNamespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", substitutionHeadName = "absService")
    public JAXBElement<SimservType> createOriginatingIdentityPresentation(SimservType value) {
        return new JAXBElement<SimservType>(_OriginatingIdentityPresentation_QNAME, SimservType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "presence-status")
    public JAXBElement<String> createPresenceStatus(String value) {
        return new JAXBElement<String>(_PresenceStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginatingIdentityPresentationRestriction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "originating-identity-presentation-restriction", substitutionHeadNamespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", substitutionHeadName = "absService")
    public JAXBElement<OriginatingIdentityPresentationRestriction> createOriginatingIdentityPresentationRestriction(OriginatingIdentityPresentationRestriction value) {
        return new JAXBElement<OriginatingIdentityPresentationRestriction>(_OriginatingIdentityPresentationRestriction_QNAME, OriginatingIdentityPresentationRestriction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", name = "NoReplyTimer")
    public JAXBElement<Integer> createNoReplyTimer(Integer value) {
        return new JAXBElement<Integer>(_NoReplyTimer_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "identity", scope = ConditionsType.class)
    public JAXBElement<IdentityType> createConditionsTypeIdentity(IdentityType value) {
        return new JAXBElement<IdentityType>(_ConditionsTypeIdentity_QNAME, IdentityType.class, ConditionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "validity", scope = ConditionsType.class)
    public JAXBElement<ValidityType> createConditionsTypeValidity(ValidityType value) {
        return new JAXBElement<ValidityType>(_ConditionsTypeValidity_QNAME, ValidityType.class, ConditionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SphereType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "sphere", scope = ConditionsType.class)
    public JAXBElement<SphereType> createConditionsTypeSphere(SphereType value) {
        return new JAXBElement<SphereType>(_ConditionsTypeSphere_QNAME, SphereType.class, ConditionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "except", scope = ManyType.class)
    public JAXBElement<ExceptType> createManyTypeExcept(ExceptType value) {
        return new JAXBElement<ExceptType>(_ManyTypeExcept_QNAME, ExceptType.class, ManyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "many", scope = IdentityType.class)
    public JAXBElement<ManyType> createIdentityTypeMany(ManyType value) {
        return new JAXBElement<ManyType>(_IdentityTypeMany_QNAME, ManyType.class, IdentityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "one", scope = IdentityType.class)
    public JAXBElement<OneType> createIdentityTypeOne(OneType value) {
        return new JAXBElement<OneType>(_IdentityTypeOne_QNAME, OneType.class, IdentityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "from", scope = ValidityType.class)
    public JAXBElement<XMLGregorianCalendar> createValidityTypeFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ValidityTypeFrom_QNAME, XMLGregorianCalendar.class, ValidityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:ietf:params:xml:ns:common-policy", name = "until", scope = ValidityType.class)
    public JAXBElement<XMLGregorianCalendar> createValidityTypeUntil(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ValidityTypeUntil_QNAME, XMLGregorianCalendar.class, ValidityType.class, value);
    }

}
