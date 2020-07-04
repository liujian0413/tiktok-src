package com.google.thirdparty.publicsuffix;

public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');
    
    public final char innerNodeCode;
    public final char leafNodeCode;

    static PublicSuffixType fromIsPrivate(boolean z) {
        if (z) {
            return PRIVATE;
        }
        return REGISTRY;
    }

    static PublicSuffixType fromCode(char c) {
        PublicSuffixType[] values;
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.innerNodeCode == c || publicSuffixType.leafNodeCode == c) {
                return publicSuffixType;
            }
        }
        StringBuilder sb = new StringBuilder("No enum corresponding to given code: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    private PublicSuffixType(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }
}
