package com.ebupt.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.XMLGregorianCalendar;

import com.ebupt.service.volte.ut.pojo.AnchorType;
import com.ebupt.service.volte.ut.pojo.CommunicationDiversion;
import com.ebupt.service.volte.ut.pojo.ConditionsType;
import com.ebupt.service.volte.ut.pojo.ExtensibleType;
import com.ebupt.service.volte.ut.pojo.ExternalList;
import com.ebupt.service.volte.ut.pojo.ObjectFactory;
import com.ebupt.service.volte.ut.pojo.RuleType;
import com.ebupt.service.volte.ut.pojo.Ruleset;
import com.ebupt.service.volte.ut.pojo.Simservs;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

public class Test {
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		CommunicationDiversion cdiv  = new CommunicationDiversion();
		ObjectFactory ob = new ObjectFactory();
		cdiv.setActive(true);
		cdiv.setNoReplyTimer(180);
		Ruleset value = new Ruleset();
		RuleType e = new RuleType();
//		e.setId("call-forwarding-unconditional");
		ConditionsType cd = ob.createConditionsType();
		cd.getIdentityOrSphereOrValidity().add(ob.createBusy(ob.createEmptyElementType()));
//		cd.getIdentityOrSphereOrValidity().add("Rule-Deactived");
//		ValidityType vt = ob.createValidityType();
		GregorianCalendar gc1 = new GregorianCalendar(2013,12,15);
		GregorianCalendar gc2 = new GregorianCalendar(2013,12,16);
		
		JAXBElement<XMLGregorianCalendar> fu1 = ob.createValidityTypeFrom( new XMLGregorianCalendarImpl(gc1 ));
		JAXBElement<XMLGregorianCalendar> fu2 = ob.createValidityTypeUntil( new XMLGregorianCalendarImpl(gc2 ));
//		vt.getFromAndUntil().add(fu1 );
//		vt.getFromAndUntil().add(fu2 );
//		cd.getIdentityOrSphereOrValidity().add(vt);
		
		AnchorType at = ob.createAnchorType();
		at.setAnc("123@ebupt.com");
		ExternalList el = ob.createExternalList();
		el.getEntry().add(at);
		cd.getIdentityOrSphereOrValidity().add(el);
		e.setConditions(cd );
		ExtensibleType a = new ExtensibleType();
		JAXBElement<Boolean> al = ob.createAllow(false);
		a.getAny().add(al);
		e.setActions(a );
		value.getRule().add(e );
		cdiv.setRuleset(value );
		 Simservs s = ob.createSimservs();
		s.getAbsService().add(ob.createCommunicationDiversion(cdiv));
		JAXBContext jc = JAXBContext.newInstance(CommunicationDiversion.class);  
		Marshaller  marshaller = jc.createMarshaller(); 
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//		marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new PreferredMapper());  
//		Writer wr = new StringWriter();
//		marshaller.marshal(value, new FileOutputStream("src/test.xml"));
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();  
		//向OutPutStream中写入，如 message.writeTo(baos);  
		marshaller.marshal(e, baos);
		String str = baos.toString();  
		System.out.println(str);
		
		Unmarshaller  unmarshaller = jc.createUnmarshaller(); 
//		unmarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes()); 
		Ruleset rs = (Ruleset)unmarshaller.unmarshal(bais);
		
		JAXBElement<Boolean> asdsafd = (JAXBElement<Boolean>)rs.getRule().get(0).getActions().getAny().get(0);
		
		System.out.println(asdsafd.getValue());
		
	}
	
//	public static class PreferredMapper extends NamespacePrefixMapper {  
//        @Override  
//        public String getPreferredPrefix(String namespaceUri,  
//                String suggestion, boolean requirePrefix) {  
//            return "pre";  
//        }  
//  
//          
//    }  

}
