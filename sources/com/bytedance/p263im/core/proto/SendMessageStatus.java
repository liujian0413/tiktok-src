package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.SendMessageStatus */
public enum SendMessageStatus implements WireEnum {
    SEND_SUCCEED(0),
    USER_NOT_IN_CONVERSATION(1),
    CHECK_CONV_NOT_PASS(2),
    CHECK_MSG_NOT_PASS(3),
    CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE(4);
    
    public static final ProtoAdapter<SendMessageStatus> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.SendMessageStatus$ProtoAdapter_SendMessageStatus */
    static final class ProtoAdapter_SendMessageStatus extends EnumAdapter<SendMessageStatus> {
        ProtoAdapter_SendMessageStatus() {
            super(SendMessageStatus.class);
        }

        /* access modifiers changed from: protected */
        public final SendMessageStatus fromValue(int i) {
            return SendMessageStatus.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_SendMessageStatus();
    }

    public static SendMessageStatus fromValue(int i) {
        switch (i) {
            case 0:
                return SEND_SUCCEED;
            case 1:
                return USER_NOT_IN_CONVERSATION;
            case 2:
                return CHECK_CONV_NOT_PASS;
            case 3:
                return CHECK_MSG_NOT_PASS;
            case 4:
                return CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE;
            default:
                return null;
        }
    }

    private SendMessageStatus(int i) {
        this.value = i;
    }
}
