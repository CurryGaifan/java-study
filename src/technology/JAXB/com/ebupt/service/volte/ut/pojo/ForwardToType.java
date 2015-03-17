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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>forward-to-type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="forward-to-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="notify-caller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reveal-identity-to-caller" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}reveal-URI-options-type" minOccurs="0"/>
 *         &lt;element name="reveal-served-user-identity-to-caller" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}reveal-URI-options-type" minOccurs="0"/>
 *         &lt;element name="notify-served-user" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notify-served-user-on-outbound-call" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reveal-identity-to-target" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}reveal-URI-options-type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forward-to-type", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", propOrder = {
    "target",
    "notifyCaller",
    "revealIdentityToCaller",
    "revealServedUserIdentityToCaller",
    "notifyServedUser",
    "notifyServedUserOnOutboundCall",
    "revealIdentityToTarget"
})
public class ForwardToType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String target;
    @XmlElement(name = "notify-caller", defaultValue = "true")
    protected Boolean notifyCaller;
    @XmlElement(name = "reveal-identity-to-caller", defaultValue = "true")
    protected RevealURIOptionsType revealIdentityToCaller;
    @XmlElement(name = "reveal-served-user-identity-to-caller", defaultValue = "true")
    protected RevealURIOptionsType revealServedUserIdentityToCaller;
    @XmlElement(name = "notify-served-user", defaultValue = "false")
    protected Boolean notifyServedUser;
    @XmlElement(name = "notify-served-user-on-outbound-call", defaultValue = "false")
    protected Boolean notifyServedUserOnOutboundCall;
    @XmlElement(name = "reveal-identity-to-target", defaultValue = "true")
    protected RevealURIOptionsType revealIdentityToTarget;

    /**
     * 获取target属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置target属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * 获取notifyCaller属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyCaller() {
        return notifyCaller;
    }

    /**
     * 设置notifyCaller属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyCaller(Boolean value) {
        this.notifyCaller = value;
    }

    /**
     * 获取revealIdentityToCaller属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevealURIOptionsType }
     *     
     */
    public RevealURIOptionsType getRevealIdentityToCaller() {
        return revealIdentityToCaller;
    }

    /**
     * 设置revealIdentityToCaller属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevealURIOptionsType }
     *     
     */
    public void setRevealIdentityToCaller(RevealURIOptionsType value) {
        this.revealIdentityToCaller = value;
    }

    /**
     * 获取revealServedUserIdentityToCaller属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevealURIOptionsType }
     *     
     */
    public RevealURIOptionsType getRevealServedUserIdentityToCaller() {
        return revealServedUserIdentityToCaller;
    }

    /**
     * 设置revealServedUserIdentityToCaller属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevealURIOptionsType }
     *     
     */
    public void setRevealServedUserIdentityToCaller(RevealURIOptionsType value) {
        this.revealServedUserIdentityToCaller = value;
    }

    /**
     * 获取notifyServedUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyServedUser() {
        return notifyServedUser;
    }

    /**
     * 设置notifyServedUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyServedUser(Boolean value) {
        this.notifyServedUser = value;
    }

    /**
     * 获取notifyServedUserOnOutboundCall属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotifyServedUserOnOutboundCall() {
        return notifyServedUserOnOutboundCall;
    }

    /**
     * 设置notifyServedUserOnOutboundCall属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotifyServedUserOnOutboundCall(Boolean value) {
        this.notifyServedUserOnOutboundCall = value;
    }

    /**
     * 获取revealIdentityToTarget属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RevealURIOptionsType }
     *     
     */
    public RevealURIOptionsType getRevealIdentityToTarget() {
        return revealIdentityToTarget;
    }

    /**
     * 设置revealIdentityToTarget属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RevealURIOptionsType }
     *     
     */
    public void setRevealIdentityToTarget(RevealURIOptionsType value) {
        this.revealIdentityToTarget = value;
    }

}
