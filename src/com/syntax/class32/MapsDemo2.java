package com.syntax.class32;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsDemo2 {

    public static void main(String[] args) {
        Person jackObj = new Person("Jack", 321, 20);
        Person missyObj = new Person("Missy", 123, 26);

        Map<Integer, Person> peopleInUS = new HashMap<>();
        peopleInUS.put(321, jackObj);
        peopleInUS.put(123, missyObj);

        System.out.println(peopleInUS.get(123).name); //can return name, SSN and age
        System.out.println(peopleInUS);

    }

}
