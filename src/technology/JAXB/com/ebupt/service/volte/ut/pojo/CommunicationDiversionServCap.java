//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.7 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2013.12.16 ʱ�� 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}simservType">
 *       &lt;sequence>
 *         &lt;element name="serv-cap-conditions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serv-cap-anonymous" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-busy" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-external-list" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-identity" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-media" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}supported-media-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-not-registered" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-no-answer" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-not-reachable" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-presence-status" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-rule-deactivated" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-validity" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serv-cap-actions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serv-cap-target" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-target-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-notify-caller" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-notify-served-user" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-notify-served-user-on-outbound-call" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-reveal-identity-to-caller" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-reveal-served-user-identity-to-caller" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-reveal-identity-to-target" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "servCapConditions",
    "servCapActions"
})
public class CommunicationDiversionServCap
    extends SimservType
{

    @XmlElement(name = "serv-cap-conditions", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
    protected CommunicationDiversionServCap.ServCapConditions servCapConditions;
    @XmlElement(name = "serv-cap-actions", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
    protected CommunicationDiversionServCap.ServCapActions servCapActions;

    /**
     * ��ȡservCapConditions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommunicationDiversionServCap.ServCapConditions }
     *     
     */
    public CommunicationDiversionServCap.ServCapConditions getServCapConditions() {
        return servCapConditions;
    }

    /**
     * ����servCapConditions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationDiversionServCap.ServCapConditions }
     *     
     */
    public void setServCapConditions(CommunicationDiversionServCap.ServCapConditions value) {
        this.servCapConditions = value;
    }

    /**
     * ��ȡservCapActions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommunicationDiversionServCap.ServCapActions }
     *     
     */
    public CommunicationDiversionServCap.ServCapActions getServCapActions() {
        return servCapActions;
    }

    /**
     * ����servCapActions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationDiversionServCap.ServCapActions }
     *     
     */
    public void setServCapActions(CommunicationDiversionServCap.ServCapActions value) {
        this.servCapActions = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="serv-cap-target" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-target-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-notify-caller" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-notify-served-user" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-notify-served-user-on-outbound-call" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-reveal-identity-to-caller" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-reveal-served-user-identity-to-caller" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-reveal-identity-to-target" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "servCapTarget",
        "servCapNotifyCaller",
        "servCapNotifyServedUser",
        "servCapNotifyServedUserOnOutboundCall",
        "servCapRevealIdentityToCaller",
        "servCapRevealServedUserIdentityToCaller",
        "servCapRevealIdentityToTarget"
    })
    public static class ServCapActions {

        @XmlElement(name = "serv-cap-target", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedTargetType servCapTarget;
        @XmlElement(name = "serv-cap-notify-caller", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapNotifyCaller;
        @XmlElement(name = "serv-cap-notify-served-user", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapNotifyServedUser;
        @XmlElement(name = "serv-cap-notify-served-user-on-outbound-call", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapNotifyServedUserOnOutboundCall;
        @XmlElement(name = "serv-cap-reveal-identity-to-caller", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapRevealIdentityToCaller;
        @XmlElement(name = "serv-cap-reveal-served-user-identity-to-caller", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapRevealServedUserIdentityToCaller;
        @XmlElement(name = "serv-cap-reveal-identity-to-target", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapRevealIdentityToTarget;

        /**
         * ��ȡservCapTarget���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedTargetType }
         *     
         */
        public ProvisionedTargetType getServCapTarget() {
            return servCapTarget;
        }

        /**
         * ����servCapTarget���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedTargetType }
         *     
         */
        public void setServCapTarget(ProvisionedTargetType value) {
            this.servCapTarget = value;
        }

        /**
         * ��ȡservCapNotifyCaller���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapNotifyCaller() {
            return servCapNotifyCaller;
        }

        /**
         * ����servCapNotifyCaller���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapNotifyCaller(ProvisionedType value) {
            this.servCapNotifyCaller = value;
        }

        /**
         * ��ȡservCapNotifyServedUser���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapNotifyServedUser() {
            return servCapNotifyServedUser;
        }

        /**
         * ����servCapNotifyServedUser���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapNotifyServedUser(ProvisionedType value) {
            this.servCapNotifyServedUser = value;
        }

        /**
         * ��ȡservCapNotifyServedUserOnOutboundCall���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapNotifyServedUserOnOutboundCall() {
            return servCapNotifyServedUserOnOutboundCall;
        }

        /**
         * ����servCapNotifyServedUserOnOutboundCall���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapNotifyServedUserOnOutboundCall(ProvisionedType value) {
            this.servCapNotifyServedUserOnOutboundCall = value;
        }

        /**
         * ��ȡservCapRevealIdentityToCaller���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapRevealIdentityToCaller() {
            return servCapRevealIdentityToCaller;
        }

        /**
         * ����servCapRevealIdentityToCaller���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapRevealIdentityToCaller(ProvisionedType value) {
            this.servCapRevealIdentityToCaller = value;
        }

        /**
         * ��ȡservCapRevealServedUserIdentityToCaller���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapRevealServedUserIdentityToCaller() {
            return servCapRevealServedUserIdentityToCaller;
        }

        /**
         * ����servCapRevealServedUserIdentityToCaller���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapRevealServedUserIdentityToCaller(ProvisionedType value) {
            this.servCapRevealServedUserIdentityToCaller = value;
        }

        /**
         * ��ȡservCapRevealIdentityToTarget���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapRevealIdentityToTarget() {
            return servCapRevealIdentityToTarget;
        }

        /**
         * ����servCapRevealIdentityToTarget���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapRevealIdentityToTarget(ProvisionedType value) {
            this.servCapRevealIdentityToTarget = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="serv-cap-anonymous" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-busy" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-external-list" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-identity" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-media" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}supported-media-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-not-registered" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-no-answer" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-not-reachable" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-presence-status" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-rule-deactivated" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-validity" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "servCapAnonymous",
        "servCapBusy",
        "servCapExternalList",
        "servCapIdentity",
        "servCapMedia",
        "servCapNotRegistered",
        "servCapNoAnswer",
        "servCapNotReachable",
        "servCapPresenceStatus",
        "servCapRuleDeactivated",
        "servCapValidity"
    })
    public static class ServCapConditions {

        @XmlElement(name = "serv-cap-anonymous", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapAnonymous;
        @XmlElement(name = "serv-cap-busy", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapBusy;
        @XmlElement(name = "serv-cap-external-list", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapExternalList;
        @XmlElement(name = "serv-cap-identity", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapIdentity;
        @XmlElement(name = "serv-cap-media", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected SupportedMediaType servCapMedia;
        @XmlElement(name = "serv-cap-not-registered", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapNotRegistered;
        @XmlElement(name = "serv-cap-no-answer", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapNoAnswer;
        @XmlElement(name = "serv-cap-not-reachable", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapNotReachable;
        @XmlElement(name = "serv-cap-presence-status", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapPresenceStatus;
        @XmlElement(name = "serv-cap-rule-deactivated", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapRuleDeactivated;
        @XmlElement(name = "serv-cap-validity", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapValidity;

        /**
         * ��ȡservCapAnonymous���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapAnonymous() {
            return servCapAnonymous;
        }

        /**
         * ����servCapAnonymous���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapAnonymous(ProvisionedType value) {
            this.servCapAnonymous = value;
        }

        /**
         * ��ȡservCapBusy���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapBusy() {
            return servCapBusy;
        }

        /**
         * ����servCapBusy���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapBusy(ProvisionedType value) {
            this.servCapBusy = value;
        }

        /**
         * ��ȡservCapExternalList���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapExternalList() {
            return servCapExternalList;
        }

        /**
         * ����servCapExternalList���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapExternalList(ProvisionedType value) {
            this.servCapExternalList = value;
        }

        /**
         * ��ȡservCapIdentity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapIdentity() {
            return servCapIdentity;
        }

        /**
         * ����servCapIdentity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapIdentity(ProvisionedType value) {
            this.servCapIdentity = value;
        }

        /**
         * ��ȡservCapMedia���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link SupportedMediaType }
         *     
         */
        public SupportedMediaType getServCapMedia() {
            return servCapMedia;
        }

        /**
         * ����servCapMedia���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link SupportedMediaType }
         *     
         */
        public void setServCapMedia(SupportedMediaType value) {
            this.servCapMedia = value;
        }

        /**
         * ��ȡservCapNotRegistered���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapNotRegistered() {
            return servCapNotRegistered;
        }

        /**
         * ����servCapNotRegistered���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapNotRegistered(ProvisionedType value) {
            this.servCapNotRegistered = value;
        }

        /**
         * ��ȡservCapNoAnswer���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapNoAnswer() {
            return servCapNoAnswer;
        }

        /**
         * ����servCapNoAnswer���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapNoAnswer(ProvisionedType value) {
            this.servCapNoAnswer = value;
        }

        /**
         * ��ȡservCapNotReachable���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapNotReachable() {
            return servCapNotReachable;
        }

        /**
         * ����servCapNotReachable���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapNotReachable(ProvisionedType value) {
            this.servCapNotReachable = value;
        }

        /**
         * ��ȡservCapPresenceStatus���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapPresenceStatus() {
            return servCapPresenceStatus;
        }

        /**
         * ����servCapPresenceStatus���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapPresenceStatus(ProvisionedType value) {
            this.servCapPresenceStatus = value;
        }

        /**
         * ��ȡservCapRuleDeactivated���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapRuleDeactivated() {
            return servCapRuleDeactivated;
        }

        /**
         * ����servCapRuleDeactivated���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapRuleDeactivated(ProvisionedType value) {
            this.servCapRuleDeactivated = value;
        }

        /**
         * ��ȡservCapValidity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapValidity() {
            return servCapValidity;
        }

        /**
         * ����servCapValidity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapValidity(ProvisionedType value) {
            this.servCapValidity = value;
        }

    }

}
