//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.7 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2013.12.16 ʱ�� 02:52:35 PM CST 
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
 * <p>supported-media-type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡallMedia���Ե�ֵ��
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
     * ����allMedia���Ե�ֵ��
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
     * ��ȡnoMedia���Ե�ֵ��
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
     * ����noMedia���Ե�ֵ��
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
     * ��ȡany���Ե�ֵ��
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
     * ����any���Ե�ֵ��
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
