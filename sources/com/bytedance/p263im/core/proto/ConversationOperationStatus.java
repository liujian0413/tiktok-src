package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ConversationOperationStatus */
public enum ConversationOperationStatus implements WireEnum {
    OP_SUCCEED(0),
    REJECTED(1),
    PARTLY_REJECTED(2);
    
    public static final ProtoAdapter<ConversationOperationStatus> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.ConversationOperationStatus$ProtoAdapter_ConversationOperationStatus */
    static final class ProtoAdapter_ConversationOperationStatus extends EnumAdapter<ConversationOperationStatus> {
        ProtoAdapter_ConversationOperationStatus() {
            super(ConversationOperationStatus.class);
        }

        /* access modifiers changed from: protected */
        public final ConversationOperationStatus fromValue(int i) {
            return ConversationOperationStatus.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_ConversationOperationStatus();
    }

    public static ConversationOperationStatus fromValue(int i) {
        switch (i) {
            case 0:
                return OP_SUCCEED;
            case 1:
                return REJECTED;
            case 2:
                return PARTLY_REJECTED;
            default:
                return null;
        }
    }

    private ConversationOperationStatus(int i) {
        this.value = i;
    }
}
