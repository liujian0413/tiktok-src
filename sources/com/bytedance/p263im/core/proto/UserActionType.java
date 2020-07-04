package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.UserActionType */
public enum UserActionType implements WireEnum {
    ENTER_CONVERSATION(1),
    EXIT_CONVERSATION(2);
    
    public static final ProtoAdapter<UserActionType> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.UserActionType$ProtoAdapter_UserActionType */
    static final class ProtoAdapter_UserActionType extends EnumAdapter<UserActionType> {
        ProtoAdapter_UserActionType() {
            super(UserActionType.class);
        }

        /* access modifiers changed from: protected */
        public final UserActionType fromValue(int i) {
            return UserActionType.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_UserActionType();
    }

    public static UserActionType fromValue(int i) {
        switch (i) {
            case 1:
                return ENTER_CONVERSATION;
            case 2:
                return EXIT_CONVERSATION;
            default:
                return null;
        }
    }

    private UserActionType(int i) {
        this.value = i;
    }
}
