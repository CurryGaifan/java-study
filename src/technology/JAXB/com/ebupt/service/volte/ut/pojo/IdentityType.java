//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.12.16 时间 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>identityType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="identityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="one" type="{urn:ietf:params:xml:ns:common-policy}oneType"/>
 *         &lt;element name="many" type="{urn:ietf:params:xml:ns:common-policy}manyType"/>
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
@XmlType(name = "identityType", propOrder = {
    "oneOrManyOrAny"
})
public class IdentityType {

    @XmlElementRefs({
        @XmlElementRef(name = "one", namespace = "urn:ietf:params:xml:ns:common-policy", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "many", namespace = "urn:ietf:params:xml:ns:common-policy", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> oneOrManyOrAny;

    /**
     * Gets the value of the oneOrManyOrAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneOrManyOrAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneOrManyOrAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OneType }{@code >}
     * {@link Element }
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link ManyType }{@code >}
     * 
     * 
     */
    public List<Object> getOneOrManyOrAny() {
        if (oneOrManyOrAny == null) {
            oneOrManyOrAny = new ArrayList<Object>();
        }
        return this.oneOrManyOrAny;
    }

}
