package com.esliceu.puncher.parser.model;


import javax.xml.bind.annotation.*;

@XmlRootElement(name = "PROFESSORS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="PROFESSOR")
public class Teacher {

    @XmlAttribute(name="codi")
    private String code;

    @XmlAttribute(name="nom")
    private String name;

    @XmlAttribute(name="ap1")
    private String firstSurname;

    @XmlAttribute(name="ap2")
    private String secondSurname;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

}

