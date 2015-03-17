//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.12.16 时间 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


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
 *         &lt;element ref="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}absService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "absService",
    "extensions"
})
@XmlRootElement(name = "simservs", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
public class Simservs {

    @XmlElementRef(name = "absService", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends SimservType>> absService;
    @XmlElement(namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
    protected Simservs.Extensions extensions;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the absService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the absService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbsService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SimservType }{@code >}
     * {@link JAXBElement }{@code <}{@link IncomingCommunicationBarring }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminatingIdentityPresentationRestriction }{@code >}
     * {@link JAXBElement }{@code <}{@link SimservType }{@code >}
     * {@link JAXBElement }{@code <}{@link CommunicationDiversionServCap }{@code >}
     * {@link JAXBElement }{@code <}{@link SimservType }{@code >}
     * {@link JAXBElement }{@code <}{@link OriginatingIdentityPresentationRestriction }{@code >}
     * {@link JAXBElement }{@code <}{@link OutgoingCommunicationBarring }{@code >}
     * {@link JAXBElement }{@code <}{@link SimservType }{@code >}
     * {@link JAXBElement }{@code <}{@link CommunicationBarringServCap }{@code >}
     * {@link JAXBElement }{@code <}{@link CommunicationDiversion }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends SimservType>> getAbsService() {
        if (absService == null) {
            absService = new ArrayList<JAXBElement<? extends SimservType>>();
        }
        return this.absService;
    }

    /**
     * 获取extensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Simservs.Extensions }
     *     
     */
    public Simservs.Extensions getExtensions() {
        return extensions;
    }

    /**
     * 设置extensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Simservs.Extensions }
     *     
     */
    public void setExtensions(Simservs.Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
     *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    public static class Extensions {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
