package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.NewMessageNotifyType */
public enum NewMessageNotifyType implements WireEnum {
    PER_USER(1),
    PER_CONVERSATION(2);
    
    public static final ProtoAdapter<NewMessageNotifyType> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.NewMessageNotifyType$ProtoAdapter_NewMessageNotifyType */
    static final class ProtoAdapter_NewMessageNotifyType extends EnumAdapter<NewMessageNotifyType> {
        ProtoAdapter_NewMessageNotifyType() {
            super(NewMessageNotifyType.class);
        }

        /* access modifiers changed from: protected */
        public final NewMessageNotifyType fromValue(int i) {
            return NewMessageNotifyType.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_NewMessageNotifyType();
    }

    public static NewMessageNotifyType fromValue(int i) {
        switch (i) {
            case 1:
                return PER_USER;
            case 2:
                return PER_CONVERSATION;
            default:
                return null;
        }
    }

    private NewMessageNotifyType(int i) {
        this.value = i;
    }
}
