//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.7 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2013.12.16 ʱ�� 02:52:35 PM CST 
//


package com.ebupt.service.volte.ut.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡnoReplyTimer���Ե�ֵ��
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
     * ����noReplyTimer���Ե�ֵ��
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
     * ��ȡruleset���Ե�ֵ��
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
     * ����ruleset���Ե�ֵ��
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
