package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.MessageDirection */
public enum MessageDirection implements WireEnum {
    OLDER(1),
    NEWER(2),
    FROM_LATEST(3);
    
    public static final ProtoAdapter<MessageDirection> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.MessageDirection$ProtoAdapter_MessageDirection */
    static final class ProtoAdapter_MessageDirection extends EnumAdapter<MessageDirection> {
        ProtoAdapter_MessageDirection() {
            super(MessageDirection.class);
        }

        /* access modifiers changed from: protected */
        public final MessageDirection fromValue(int i) {
            return MessageDirection.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_MessageDirection();
    }

    public static MessageDirection fromValue(int i) {
        switch (i) {
            case 1:
                return OLDER;
            case 2:
                return NEWER;
            case 3:
                return FROM_LATEST;
            default:
                return null;
        }
    }

    private MessageDirection(int i) {
        this.value = i;
    }
}
