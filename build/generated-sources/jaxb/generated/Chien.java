//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.5-2 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.02.11 à 02:15:59 PM CET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maitre" type="{}personne"/>
 *         &lt;element name="puces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nom",
    "maitre",
    "puces"
})
@XmlRootElement(name = "chien")
public class Chien {

    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected Personne maitre;
    protected int puces;

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété maitre.
     * 
     * @return
     *     possible object is
     *     {@link Personne }
     *     
     */
    public Personne getMaitre() {
        return maitre;
    }

    /**
     * Définit la valeur de la propriété maitre.
     * 
     * @param value
     *     allowed object is
     *     {@link Personne }
     *     
     */
    public void setMaitre(Personne value) {
        this.maitre = value;
    }

    /**
     * Obtient la valeur de la propriété puces.
     * 
     */
    public int getPuces() {
        return puces;
    }

    /**
     * Définit la valeur de la propriété puces.
     * 
     */
    public void setPuces(int value) {
        this.puces = value;
    }

}
