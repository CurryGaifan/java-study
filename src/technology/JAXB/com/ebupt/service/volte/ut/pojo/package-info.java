

//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.7 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2013.12.16 ʱ�� 02:52:35 PM CST 
//

//@javax.xml.bind.annotation.XmlSchema(namespace = "urn:ietf:params:xml:ns:common-policy", elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED)

@javax.xml.bind.annotation.XmlSchema(
xmlns = {
    @XmlNs(namespaceURI = "http://uri.etsi.org/ngn/params/xml/simservs/xcap", prefix = ""),
    @XmlNs(namespaceURI = "urn:ietf:params:xml:ns:common-policy", prefix = "cp"),
    @XmlNs(namespaceURI = "urn:oma:xml:xdm:common-policy", prefix = "ocp")
},
namespace = "http://uri.etsi.org/ngn/params/xml/simservs/xcap",
elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED,
attributeFormDefault = javax.xml.bind.annotation.XmlNsForm.UNQUALIFIED)
package com.ebupt.service.volte.ut.pojo;
import javax.xml.bind.annotation.XmlNs;