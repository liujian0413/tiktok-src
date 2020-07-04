package com.bytedance.android.livesdkapi.message;

public enum PieceType {
    UNKNOWN(0, ""),
    STRING(1, "string"),
    USER(11, "user"),
    GIFT(12, "gift"),
    HEART(13, "heart"),
    PATTERN_REF(14, "pref");
    
    private int pieceType;
    private String tag;

    public final int getPieceType() {
        return this.pieceType;
    }

    public final String getTag() {
        return this.tag;
    }

    private PieceType(int i, String str) {
        this.pieceType = i;
        this.tag = str;
    }
}
