package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.TokenType */
public enum TokenType implements WireEnum {
    DEFAULT_TOKEN(0),
    APP_TOKEN(1),
    SERVER_TOKEN(2);
    
    public static final ProtoAdapter<TokenType> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.TokenType$ProtoAdapter_TokenType */
    static final class ProtoAdapter_TokenType extends EnumAdapter<TokenType> {
        ProtoAdapter_TokenType() {
            super(TokenType.class);
        }

        /* access modifiers changed from: protected */
        public final TokenType fromValue(int i) {
            return TokenType.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_TokenType();
    }

    public static TokenType fromValue(int i) {
        switch (i) {
            case 0:
                return DEFAULT_TOKEN;
            case 1:
                return APP_TOKEN;
            case 2:
                return SERVER_TOKEN;
            default:
                return null;
        }
    }

    private TokenType(int i) {
        this.value = i;
    }
}
