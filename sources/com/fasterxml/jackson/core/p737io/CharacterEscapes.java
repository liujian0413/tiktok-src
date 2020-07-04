package com.fasterxml.jackson.core.p737io;

import com.fasterxml.jackson.core.C14670f;
import java.io.Serializable;

/* renamed from: com.fasterxml.jackson.core.io.CharacterEscapes */
public abstract class CharacterEscapes implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract int[] getEscapeCodesForAscii();

    public abstract C14670f getEscapeSequence(int i);

    public static int[] standardAsciiEscapesForJSON() {
        int[] c = C14673b.m42439c();
        int[] iArr = new int[c.length];
        System.arraycopy(c, 0, iArr, 0, c.length);
        return iArr;
    }
}
