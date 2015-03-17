//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.7 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2013.12.16 ʱ�� 02:52:35 PM CST 
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
 * <p>conditionsType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="conditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="identity" type="{urn:ietf:params:xml:ns:common-policy}identityType" minOccurs="0"/>
 *         &lt;element name="sphere" type="{urn:ietf:params:xml:ns:common-policy}sphereType" minOccurs="0"/>
 *         &lt;element name="validity" type="{urn:ietf:params:xml:ns:common-policy}validityType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conditionsType", propOrder = {
    "identityOrSphereOrValidity"
})
public class ConditionsType {

    @XmlElementRefs({
        @XmlElementRef(name = "validity", namespace = "urn:ietf:params:xml:ns:common-policy", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sphere", namespace = "urn:ietf:params:xml:ns:common-policy", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "identity", namespace = "urn:ietf:params:xml:ns:common-policy", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> identityOrSphereOrValidity;

    /**
     * Gets the value of the identityOrSphereOrValidity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityOrSphereOrValidity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityOrSphereOrValidity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link IdentityType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidityType }{@code >}
     * {@link JAXBElement }{@code <}{@link SphereType }{@code >}
     * 
     * 
     */
    public List<Object> getIdentityOrSphereOrValidity() {
        if (identityOrSphereOrValidity == null) {
            identityOrSphereOrValidity = new ArrayList<Object>();
        }
        return this.identityOrSphereOrValidity;
    }

}
