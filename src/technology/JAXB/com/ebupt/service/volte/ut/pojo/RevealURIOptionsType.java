//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.7 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2013.12.16 ʱ�� 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>reveal-URI-options-type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="reveal-URI-options-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="false"/>
 *     &lt;enumeration value="not-reveal-GRUU"/>
 *     &lt;enumeration value="true"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reveal-URI-options-type", namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap")
@XmlEnum
public enum RevealURIOptionsType {

    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("not-reveal-GRUU")
    NOT_REVEAL_GRUU("not-reveal-GRUU"),
    @XmlEnumValue("true")
    TRUE("true");
    private final String value;

    RevealURIOptionsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RevealURIOptionsType fromValue(String v) {
        for (RevealURIOptionsType c: RevealURIOptionsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
