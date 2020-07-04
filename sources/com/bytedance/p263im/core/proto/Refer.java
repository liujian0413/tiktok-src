package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.Refer */
public enum Refer implements WireEnum {
    REFER_NOT_USED(0),
    ANDROID(1),
    IOS(2),
    PC(3),
    SERVER(4);
    
    public static final ProtoAdapter<Refer> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.Refer$ProtoAdapter_Refer */
    static final class ProtoAdapter_Refer extends EnumAdapter<Refer> {
        ProtoAdapter_Refer() {
            super(Refer.class);
        }

        /* access modifiers changed from: protected */
        public final Refer fromValue(int i) {
            return Refer.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_Refer();
    }

    public static Refer fromValue(int i) {
        switch (i) {
            case 0:
                return REFER_NOT_USED;
            case 1:
                return ANDROID;
            case 2:
                return IOS;
            case 3:
                return PC;
            case 4:
                return SERVER;
            default:
                return null;
        }
    }

    private Refer(int i) {
        this.value = i;
    }
}
