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
 *                   &lt;element name="serv-cap-communication-diverted" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-external-list" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-identity" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-international" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-international-exHC" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-media" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}supported-media-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-other-identity" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-presence-status" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-roaming" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-rule-deactivated" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
 *                   &lt;element name="serv-cap-validity" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
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
    "servCapConditions"
})
public class CommunicationBarringServCap
    extends SimservType
{

    @XmlElement(name = "serv-cap-conditions", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
    protected CommunicationBarringServCap.ServCapConditions servCapConditions;

    /**
     * ��ȡservCapConditions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CommunicationBarringServCap.ServCapConditions }
     *     
     */
    public CommunicationBarringServCap.ServCapConditions getServCapConditions() {
        return servCapConditions;
    }

    /**
     * ����servCapConditions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationBarringServCap.ServCapConditions }
     *     
     */
    public void setServCapConditions(CommunicationBarringServCap.ServCapConditions value) {
        this.servCapConditions = value;
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
     *         &lt;element name="serv-cap-communication-diverted" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-external-list" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-identity" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-international" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-international-exHC" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-media" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}supported-media-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-other-identity" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-presence-status" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
     *         &lt;element name="serv-cap-roaming" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}provisioned-type" minOccurs="0"/>
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
        "servCapCommunicationDiverted",
        "servCapExternalList",
        "servCapIdentity",
        "servCapInternational",
        "servCapInternationalExHC",
        "servCapMedia",
        "servCapOtherIdentity",
        "servCapPresenceStatus",
        "servCapRoaming",
        "servCapRuleDeactivated",
        "servCapValidity"
    })
    public static class ServCapConditions {

        @XmlElement(name = "serv-cap-anonymous", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapAnonymous;
        @XmlElement(name = "serv-cap-communication-diverted", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapCommunicationDiverted;
        @XmlElement(name = "serv-cap-external-list", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapExternalList;
        @XmlElement(name = "serv-cap-identity", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapIdentity;
        @XmlElement(name = "serv-cap-international", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapInternational;
        @XmlElement(name = "serv-cap-international-exHC", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapInternationalExHC;
        @XmlElement(name = "serv-cap-media", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected SupportedMediaType servCapMedia;
        @XmlElement(name = "serv-cap-other-identity", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapOtherIdentity;
        @XmlElement(name = "serv-cap-presence-status", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapPresenceStatus;
        @XmlElement(name = "serv-cap-roaming", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
        protected ProvisionedType servCapRoaming;
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
         * ��ȡservCapCommunicationDiverted���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapCommunicationDiverted() {
            return servCapCommunicationDiverted;
        }

        /**
         * ����servCapCommunicationDiverted���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapCommunicationDiverted(ProvisionedType value) {
            this.servCapCommunicationDiverted = value;
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
         * ��ȡservCapInternational���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapInternational() {
            return servCapInternational;
        }

        /**
         * ����servCapInternational���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapInternational(ProvisionedType value) {
            this.servCapInternational = value;
        }

        /**
         * ��ȡservCapInternationalExHC���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapInternationalExHC() {
            return servCapInternationalExHC;
        }

        /**
         * ����servCapInternationalExHC���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapInternationalExHC(ProvisionedType value) {
            this.servCapInternationalExHC = value;
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
         * ��ȡservCapOtherIdentity���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapOtherIdentity() {
            return servCapOtherIdentity;
        }

        /**
         * ����servCapOtherIdentity���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapOtherIdentity(ProvisionedType value) {
            this.servCapOtherIdentity = value;
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
         * ��ȡservCapRoaming���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProvisionedType }
         *     
         */
        public ProvisionedType getServCapRoaming() {
            return servCapRoaming;
        }

        /**
         * ����servCapRoaming���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProvisionedType }
         *     
         */
        public void setServCapRoaming(ProvisionedType value) {
            this.servCapRoaming = value;
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
