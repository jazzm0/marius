package com.sap;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

//https://www.hackerrank.com/challenges/reduced-string/

public class SuperReducedString {

    static String superReducedString(String s) {
        return "";
    }

    @Test
    public void testA() {
        assertThat(superReducedString("aaabccddd"), is("abd"));
    }

    @Test
    public void testB() {
        assertThat(superReducedString("aa"), is("Empty String"));
    }

    @Test
    public void testC() {
        assertThat(superReducedString("baab"), is("Empty String"));
    }


    @Test
    public void testD() {
        assertThat(superReducedString("ppffccmmssnnhhbbmmggxxaaooeeqqeennffzzaaeeyyaaggggeessvvssggbbccnnrrjjxxuuzzbbjjrruuaaccaaoommkkkkxx"), is("Empty String"));
    }
}

