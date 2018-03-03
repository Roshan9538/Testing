package com.roshan.src;

import java.io.File;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.Validator;
import javax.xml.bind.Marshaller.Listener;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.attachment.AttachmentMarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import javax.xml.validation.Schema;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.ContentHandler;

public class CreateXML {

	public static void main(String[] args) {
		
		
		try {
			
			Employee e= new Employee("Accenture");
			
			ArrayList<String> em= new ArrayList<>();
			em.add("Roshanmohapatra@gmail.com");
			em.add("roshanmohapatra8105.com");
			Student student = new Student(701058 , "Roshan",em, e);
			
	
			
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			//Document doc=builder.newDocument();
			
			JAXBContext context = JAXBContext.newInstance(Student.class);	
			Marshaller marsh= context.createMarshaller();
			marsh.setProperty(marsh.JAXB_FORMATTED_OUTPUT, true);
					marsh.marshal(student,System.out);
					System.out.println("done");
				
				
			
				
			
			
		} catch (ParserConfigurationException | JAXBException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
