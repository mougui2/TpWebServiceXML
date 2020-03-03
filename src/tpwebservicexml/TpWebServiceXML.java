/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpwebservicexml;

import generated.Chien;
import generated.Personne;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Morgan
 */
public class TpWebServiceXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, JAXBException {
        JAXBContext jc = JAXBContext.newInstance("generated");
        Unmarshaller u = jc.createUnmarshaller();
        
        Chien mimi = (Chien) u.unmarshal(new FileInputStream("C:\\Users\\Morgan\\Downloads\\milou.xml"));
        System.out.println("nom du chien : " + mimi.getNom());
        Personne mait = mimi.getMaitre();
        System.out.println("nom du maitre : " + mait.getNom());
        System.out.println("adresse du maitre : " + mait.getAdresse());
        System.out.println("nombre de puces = " + mimi.getPuces());
        
        Marshaller m = jc.createMarshaller();
        mimi.setPuces(0);
        m.marshal(mimi, new File("C:\\Users\\Morgan\\Desktop\\cours epsi\\JEE\\TpWebServiceXML\\mimiPropre.xml"));
    }

}
