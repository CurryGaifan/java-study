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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>forward-to-type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtarget���Ե�ֵ��
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
     * ����target���Ե�ֵ��
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
     * ��ȡnotifyCaller���Ե�ֵ��
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
     * ����notifyCaller���Ե�ֵ��
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
     * ��ȡrevealIdentityToCaller���Ե�ֵ��
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
     * ����revealIdentityToCaller���Ե�ֵ��
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
     * ��ȡrevealServedUserIdentityToCaller���Ե�ֵ��
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
     * ����revealServedUserIdentityToCaller���Ե�ֵ��
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
     * ��ȡnotifyServedUser���Ե�ֵ��
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
     * ����notifyServedUser���Ե�ֵ��
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
     * ��ȡnotifyServedUserOnOutboundCall���Ե�ֵ��
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
     * ����notifyServedUserOnOutboundCall���Ե�ֵ��
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
     * ��ȡrevealIdentityToTarget���Ե�ֵ��
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
     * ����revealIdentityToTarget���Ե�ֵ��
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
