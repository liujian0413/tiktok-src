package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.MessagePropertyType */
public enum MessagePropertyType implements WireEnum {
    REACTION(0),
    SYNC(1);
    
    public static final ProtoAdapter<MessagePropertyType> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.MessagePropertyType$ProtoAdapter_MessagePropertyType */
    static final class ProtoAdapter_MessagePropertyType extends EnumAdapter<MessagePropertyType> {
        ProtoAdapter_MessagePropertyType() {
            super(MessagePropertyType.class);
        }

        /* access modifiers changed from: protected */
        public final MessagePropertyType fromValue(int i) {
            return MessagePropertyType.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_MessagePropertyType();
    }

    public static MessagePropertyType fromValue(int i) {
        switch (i) {
            case 0:
                return REACTION;
            case 1:
                return SYNC;
            default:
                return null;
        }
    }

    private MessagePropertyType(int i) {
        this.value = i;
    }
}
