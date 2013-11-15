//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.15 at 01:41:48 PM CET 
//


package fuse.esb.examples.jmsderbyjta.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for User0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contactInfo" type="{}ContactInfo" minOccurs="0"/>
 *         &lt;element name="adresses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="address" type="{}Address" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User0", propOrder = {
    "id",
    "contactInfo",
    "adresses",
    "userName",
    "user"
})
@Entity(name = "User0")
@Table(name = "USER0")
@Inheritance(strategy = InheritanceType.JOINED)
public class User0
    implements Equals, HashCode
{

    protected int id;
    protected ContactInfo contactInfo;
    protected User0 .Adresses adresses;
    @XmlElement(name = "user_name")
    protected String userName;
    protected String user;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the id property.
     * 
     */
    @Basic
    @Column(name = "ID", precision = 10, scale = 0)
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    @ManyToOne(targetEntity = ContactInfo.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONTACTINFO_USER0_HJID")
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the adresses property.
     * 
     * @return
     *     possible object is
     *     {@link User0 .Adresses }
     *     
     */
    @ManyToOne(targetEntity = User0 .Adresses.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADRESSES_USER0_HJID")
    public User0 .Adresses getAdresses() {
        return adresses;
    }

    /**
     * Sets the value of the adresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link User0 .Adresses }
     *     
     */
    public void setAdresses(User0 .Adresses value) {
        this.adresses = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "USERNAME", length = 255)
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "USER_", length = 255)
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof User0)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final User0 that = ((User0) object);
        {
            int lhsId;
            lhsId = (true?this.getId(): 0);
            int rhsId;
            rhsId = (true?that.getId(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            ContactInfo lhsContactInfo;
            lhsContactInfo = this.getContactInfo();
            ContactInfo rhsContactInfo;
            rhsContactInfo = that.getContactInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactInfo", lhsContactInfo), LocatorUtils.property(thatLocator, "contactInfo", rhsContactInfo), lhsContactInfo, rhsContactInfo)) {
                return false;
            }
        }
        {
            User0 .Adresses lhsAdresses;
            lhsAdresses = this.getAdresses();
            User0 .Adresses rhsAdresses;
            rhsAdresses = that.getAdresses();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adresses", lhsAdresses), LocatorUtils.property(thatLocator, "adresses", rhsAdresses), lhsAdresses, rhsAdresses)) {
                return false;
            }
        }
        {
            String lhsUserName;
            lhsUserName = this.getUserName();
            String rhsUserName;
            rhsUserName = that.getUserName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userName", lhsUserName), LocatorUtils.property(thatLocator, "userName", rhsUserName), lhsUserName, rhsUserName)) {
                return false;
            }
        }
        {
            String lhsUser;
            lhsUser = this.getUser();
            String rhsUser;
            rhsUser = that.getUser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "user", lhsUser), LocatorUtils.property(thatLocator, "user", rhsUser), lhsUser, rhsUser)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            int theId;
            theId = (true?this.getId(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            ContactInfo theContactInfo;
            theContactInfo = this.getContactInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactInfo", theContactInfo), currentHashCode, theContactInfo);
        }
        {
            User0 .Adresses theAdresses;
            theAdresses = this.getAdresses();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adresses", theAdresses), currentHashCode, theAdresses);
        }
        {
            String theUserName;
            theUserName = this.getUserName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userName", theUserName), currentHashCode, theUserName);
        }
        {
            String theUser;
            theUser = this.getUser();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "user", theUser), currentHashCode, theUser);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="address" type="{}Address" maxOccurs="unbounded" minOccurs="0"/>
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
        "address"
    })
    @Entity(name = "User0$Adresses")
    @Table(name = "ADRESSES")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class Adresses
        implements Equals, HashCode
    {

        protected List<Address> address;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Address }
         * 
         * 
         */
        @OneToMany(targetEntity = Address.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "ADDRESS_ADRESSES_HJID")
        public List<Address> getAddress() {
            if (address == null) {
                address = new ArrayList<Address>();
            }
            return this.address;
        }

        /**
         * 
         * 
         */
        public void setAddress(List<Address> address) {
            this.address = address;
        }

        /**
         * Gets the value of the hjid property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "HJID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getHjid() {
            return hjid;
        }

        /**
         * Sets the value of the hjid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof User0 .Adresses)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final User0 .Adresses that = ((User0 .Adresses) object);
            {
                List<Address> lhsAddress;
                lhsAddress = (((this.address!= null)&&(!this.address.isEmpty()))?this.getAddress():null);
                List<Address> rhsAddress;
                rhsAddress = (((that.address!= null)&&(!that.address.isEmpty()))?that.getAddress():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                List<Address> theAddress;
                theAddress = (((this.address!= null)&&(!this.address.isEmpty()))?this.getAddress():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }

}
