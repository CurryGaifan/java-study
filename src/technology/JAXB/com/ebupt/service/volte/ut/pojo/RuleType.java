//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.12.16 时间 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>ruleType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ruleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditions" type="{urn:ietf:params:xml:ns:common-policy}conditionsType" minOccurs="0"/>
 *         &lt;element name="actions" type="{urn:ietf:params:xml:ns:common-policy}extensibleType" minOccurs="0"/>
 *         &lt;element name="transformations" type="{urn:ietf:params:xml:ns:common-policy}extensibleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ruleType", propOrder = {
    "conditions",
    "actions",
    "transformations"
})
public class RuleType {

    protected ConditionsType conditions;
    protected ExtensibleType actions;
    protected ExtensibleType transformations;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * 获取conditions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ConditionsType }
     *     
     */
    public ConditionsType getConditions() {
        return conditions;
    }

    /**
     * 设置conditions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionsType }
     *     
     */
    public void setConditions(ConditionsType value) {
        this.conditions = value;
    }

    /**
     * 获取actions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtensibleType }
     *     
     */
    public ExtensibleType getActions() {
        return actions;
    }

    /**
     * 设置actions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensibleType }
     *     
     */
    public void setActions(ExtensibleType value) {
        this.actions = value;
    }

    /**
     * 获取transformations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtensibleType }
     *     
     */
    public ExtensibleType getTransformations() {
        return transformations;
    }

    /**
     * 设置transformations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensibleType }
     *     
     */
    public void setTransformations(ExtensibleType value) {
        this.transformations = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
