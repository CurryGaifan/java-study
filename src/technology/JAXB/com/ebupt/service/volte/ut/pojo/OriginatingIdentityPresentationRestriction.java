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
 *         &lt;element name="default-behaviour" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="presentation-restricted"/>
 *               &lt;enumeration value="presentation-not-restricted"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
    "defaultBehaviour"
})
public class OriginatingIdentityPresentationRestriction
    extends SimservType
{

    @XmlElement(name = "default-behaviour", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", defaultValue = "presentation-restricted")
    protected String defaultBehaviour;

    /**
     * 获取defaultBehaviour属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultBehaviour() {
        return defaultBehaviour;
    }

    /**
     * 设置defaultBehaviour属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultBehaviour(String value) {
        this.defaultBehaviour = value;
    }

}
