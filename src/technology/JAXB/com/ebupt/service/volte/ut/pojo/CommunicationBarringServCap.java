//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.12.16 时间 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取servCapConditions属性的值。
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
     * 设置servCapConditions属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取servCapAnonymous属性的值。
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
         * 设置servCapAnonymous属性的值。
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
         * 获取servCapCommunicationDiverted属性的值。
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
         * 设置servCapCommunicationDiverted属性的值。
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
         * 获取servCapExternalList属性的值。
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
         * 设置servCapExternalList属性的值。
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
         * 获取servCapIdentity属性的值。
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
         * 设置servCapIdentity属性的值。
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
         * 获取servCapInternational属性的值。
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
         * 设置servCapInternational属性的值。
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
         * 获取servCapInternationalExHC属性的值。
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
         * 设置servCapInternationalExHC属性的值。
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
         * 获取servCapMedia属性的值。
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
         * 设置servCapMedia属性的值。
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
         * 获取servCapOtherIdentity属性的值。
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
         * 设置servCapOtherIdentity属性的值。
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
         * 获取servCapPresenceStatus属性的值。
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
         * 设置servCapPresenceStatus属性的值。
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
         * 获取servCapRoaming属性的值。
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
         * 设置servCapRoaming属性的值。
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
         * 获取servCapRuleDeactivated属性的值。
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
         * 设置servCapRuleDeactivated属性的值。
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
         * 获取servCapValidity属性的值。
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
         * 设置servCapValidity属性的值。
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
