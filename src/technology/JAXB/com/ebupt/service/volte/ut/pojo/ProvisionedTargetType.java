//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.7 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2013.12.16 ʱ�� 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>provisioned-target-type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡanyTargetType���Ե�ֵ��
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
     * ����anyTargetType���Ե�ֵ��
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
     * ��ȡtelephonyType���Ե�ֵ��
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
     * ����telephonyType���Ե�ֵ��
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
