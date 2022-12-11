
package ru.turaev.soapclient.ws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for people complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="people"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="children" type="{http://services.ws.sample/}people" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="countOfCars" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://services.ws.sample/}localDate" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://services.ws.sample/}gender" minOccurs="0"/&gt;
 *         &lt;element name="hasWork" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "people", propOrder = {
    "children",
    "countOfCars",
    "dateOfBirth",
    "gender",
    "hasWork",
    "height",
    "name",
    "surname"
})
public class People {

    @XmlElement(nillable = true)
    protected List<People> children;
    protected int countOfCars;
    protected LocalDate dateOfBirth;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    protected boolean hasWork;
    protected double height;
    protected String name;
    protected String surname;

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link People }
     * 
     * 
     */
    public List<People> getChildren() {
        if (children == null) {
            children = new ArrayList<People>();
        }
        return this.children;
    }

    /**
     * Gets the value of the countOfCars property.
     * 
     */
    public int getCountOfCars() {
        return countOfCars;
    }

    /**
     * Sets the value of the countOfCars property.
     * 
     */
    public void setCountOfCars(int value) {
        this.countOfCars = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setDateOfBirth(LocalDate value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the hasWork property.
     * 
     */
    public boolean isHasWork() {
        return hasWork;
    }

    /**
     * Sets the value of the hasWork property.
     * 
     */
    public void setHasWork(boolean value) {
        this.hasWork = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

}
