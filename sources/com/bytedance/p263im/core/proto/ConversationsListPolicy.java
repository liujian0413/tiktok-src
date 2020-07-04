package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ConversationsListPolicy */
public enum ConversationsListPolicy implements WireEnum {
    ALL(1),
    HOT(2);
    
    public static final ProtoAdapter<ConversationsListPolicy> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.ConversationsListPolicy$ProtoAdapter_ConversationsListPolicy */
    static final class ProtoAdapter_ConversationsListPolicy extends EnumAdapter<ConversationsListPolicy> {
        ProtoAdapter_ConversationsListPolicy() {
            super(ConversationsListPolicy.class);
        }

        /* access modifiers changed from: protected */
        public final ConversationsListPolicy fromValue(int i) {
            return ConversationsListPolicy.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_ConversationsListPolicy();
    }

    public static ConversationsListPolicy fromValue(int i) {
        switch (i) {
            case 1:
                return ALL;
            case 2:
                return HOT;
            default:
                return null;
        }
    }

    private ConversationsListPolicy(int i) {
        this.value = i;
    }
}
