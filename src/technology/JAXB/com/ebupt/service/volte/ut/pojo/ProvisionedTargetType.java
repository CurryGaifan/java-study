//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.12.16 时间 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>provisioned-target-type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="provisioned-target-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="any-target-type" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}empty-element-type"/>
 *         &lt;element name="telephony-type" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}empty-element-type"/>
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provisioned-target-type", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", propOrder = {
    "anyTargetType",
    "telephonyType",
    "any"
})
public class ProvisionedTargetType {

    @XmlElement(name = "any-target-type")
    protected EmptyElementType anyTargetType;
    @XmlElement(name = "telephony-type")
    protected EmptyElementType telephonyType;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * 获取anyTargetType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmptyElementType }
     *     
     */
    public EmptyElementType getAnyTargetType() {
        return anyTargetType;
    }

    /**
     * 设置anyTargetType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyElementType }
     *     
     */
    public void setAnyTargetType(EmptyElementType value) {
        this.anyTargetType = value;
    }

    /**
     * 获取telephonyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmptyElementType }
     *     
     */
    public EmptyElementType getTelephonyType() {
        return telephonyType;
    }

    /**
     * 设置telephonyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyElementType }
     *     
     */
    public void setTelephonyType(EmptyElementType value) {
        this.telephonyType = value;
    }

    /**
     * 获取any属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * 设置any属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
