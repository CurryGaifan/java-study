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
     * 获取servCapConditions属性的值。
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
     * 设置servCapConditions属性的值。
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
     * 获取servCapActions属性的值。
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
     * 设置servCapActions属性的值。
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
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
         * 获取servCapTarget属性的值。
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
         * 设置servCapTarget属性的值。
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
         * 获取servCapNotifyCaller属性的值。
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
         * 设置servCapNotifyCaller属性的值。
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
         * 获取servCapNotifyServedUser属性的值。
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
         * 设置servCapNotifyServedUser属性的值。
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
         * 获取servCapNotifyServedUserOnOutboundCall属性的值。
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
         * 设置servCapNotifyServedUserOnOutboundCall属性的值。
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
         * 获取servCapRevealIdentityToCaller属性的值。
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
         * 设置servCapRevealIdentityToCaller属性的值。
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
         * 获取servCapRevealServedUserIdentityToCaller属性的值。
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
         * 设置servCapRevealServedUserIdentityToCaller属性的值。
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
         * 获取servCapRevealIdentityToTarget属性的值。
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
         * 设置servCapRevealIdentityToTarget属性的值。
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
         * 获取servCapBusy属性的值。
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
         * 设置servCapBusy属性的值。
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
         * 获取servCapNotRegistered属性的值。
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
         * 设置servCapNotRegistered属性的值。
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
         * 获取servCapNoAnswer属性的值。
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
         * 设置servCapNoAnswer属性的值。
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
         * 获取servCapNotReachable属性的值。
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
         * 设置servCapNotReachable属性的值。
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
