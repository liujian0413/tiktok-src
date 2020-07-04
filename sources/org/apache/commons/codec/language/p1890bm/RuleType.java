package org.apache.commons.codec.language.p1890bm;

/* renamed from: org.apache.commons.codec.language.bm.RuleType */
public enum RuleType {
    APPROX("approx"),
    EXACT("exact"),
    RULES("rules");
    
    private final String name;

    public final String getName() {
        return this.name;
    }

    private RuleType(String str) {
        this.name = str;
    }
}
