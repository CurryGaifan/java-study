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
 *         &lt;element ref="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}NoReplyTimer" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:common-policy}ruleset" minOccurs="0"/>
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
    "noReplyTimer",
    "ruleset"
})
public class CommunicationDiversion
    extends SimservType
{

    @XmlElement(name = "NoReplyTimer", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
    protected Integer noReplyTimer;
    protected Ruleset ruleset;

    /**
     * 获取noReplyTimer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoReplyTimer() {
        return noReplyTimer;
    }

    /**
     * 设置noReplyTimer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoReplyTimer(Integer value) {
        this.noReplyTimer = value;
    }

    /**
     * 获取ruleset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Ruleset }
     *     
     */
    public Ruleset getRuleset() {
        return ruleset;
    }

    /**
     * 设置ruleset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Ruleset }
     *     
     */
    public void setRuleset(Ruleset value) {
        this.ruleset = value;
    }

}
