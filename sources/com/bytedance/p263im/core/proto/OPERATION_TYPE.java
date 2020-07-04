package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.OPERATION_TYPE */
public enum OPERATION_TYPE implements WireEnum {
    ADD_PROPERTY_ITEM(0),
    REMOVE_PROPERTY_ITEM(1),
    SET_PROPERTY(2),
    DEL_PROPERTY(3);
    
    public static final ProtoAdapter<OPERATION_TYPE> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.OPERATION_TYPE$ProtoAdapter_OPERATION_TYPE */
    static final class ProtoAdapter_OPERATION_TYPE extends EnumAdapter<OPERATION_TYPE> {
        ProtoAdapter_OPERATION_TYPE() {
            super(OPERATION_TYPE.class);
        }

        /* access modifiers changed from: protected */
        public final OPERATION_TYPE fromValue(int i) {
            return OPERATION_TYPE.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_OPERATION_TYPE();
    }

    public static OPERATION_TYPE fromValue(int i) {
        switch (i) {
            case 0:
                return ADD_PROPERTY_ITEM;
            case 1:
                return REMOVE_PROPERTY_ITEM;
            case 2:
                return SET_PROPERTY;
            case 3:
                return DEL_PROPERTY;
            default:
                return null;
        }
    }

    private OPERATION_TYPE(int i) {
        this.value = i;
    }
}
