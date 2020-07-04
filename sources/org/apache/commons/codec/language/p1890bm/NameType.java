package org.apache.commons.codec.language.p1890bm;

/* renamed from: org.apache.commons.codec.language.bm.NameType */
public enum NameType {
    ASHKENAZI("ash"),
    GENERIC("gen"),
    SEPHARDIC("sep");
    
    private final String name;

    public final String getName() {
        return this.name;
    }

    private NameType(String str) {
        this.name = str;
    }
}
