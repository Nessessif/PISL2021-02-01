//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.14 at 09:25:28 PM MSK 
//


package com.xledbd.clients;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for city.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="city"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Minsk"/&gt;
 *     &lt;enumeration value="Brest"/&gt;
 *     &lt;enumeration value="Grodno"/&gt;
 *     &lt;enumeration value="Vitebsk"/&gt;
 *     &lt;enumeration value="Mogilev"/&gt;
 *     &lt;enumeration value="Gomel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "city")
@XmlEnum
public enum City {

    @XmlEnumValue("Minsk")
    MINSK("Minsk"),
    @XmlEnumValue("Brest")
    BREST("Brest"),
    @XmlEnumValue("Grodno")
    GRODNO("Grodno"),
    @XmlEnumValue("Vitebsk")
    VITEBSK("Vitebsk"),
    @XmlEnumValue("Mogilev")
    MOGILEV("Mogilev"),
    @XmlEnumValue("Gomel")
    GOMEL("Gomel");
    private final String value;

    City(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static City fromValue(String v) {
        for (City c: City.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
