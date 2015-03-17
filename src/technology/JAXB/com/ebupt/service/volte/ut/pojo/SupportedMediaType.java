//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.12.16 时间 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>supported-media-type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="supported-media-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="all-media" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}empty-element-type"/>
 *         &lt;element name="no-media" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}empty-element-type"/>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element name="media" type="{http://uri.etsi.org/ngn/params/xml/simservs/xcap}media-type"/>
 *         &lt;/sequence>
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
@XmlType(name = "supported-media-type", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", propOrder = {
    "allMedia",
    "noMedia",
    "media",
    "any"
})
public class SupportedMediaType {

    @XmlElement(name = "all-media")
    protected EmptyElementType allMedia;
    @XmlElement(name = "no-media")
    protected EmptyElementType noMedia;
    protected List<String> media;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * 获取allMedia属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmptyElementType }
     *     
     */
    public EmptyElementType getAllMedia() {
        return allMedia;
    }

    /**
     * 设置allMedia属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyElementType }
     *     
     */
    public void setAllMedia(EmptyElementType value) {
        this.allMedia = value;
    }

    /**
     * 获取noMedia属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmptyElementType }
     *     
     */
    public EmptyElementType getNoMedia() {
        return noMedia;
    }

    /**
     * 设置noMedia属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyElementType }
     *     
     */
    public void setNoMedia(EmptyElementType value) {
        this.noMedia = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMedia() {
        if (media == null) {
            media = new ArrayList<String>();
        }
        return this.media;
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
