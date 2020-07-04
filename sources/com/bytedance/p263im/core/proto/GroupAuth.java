package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.GroupAuth */
public enum GroupAuth implements WireEnum {
    UPDATE_GROUP_NAME(0),
    RECALL_ORDINARY_MESSAGE(1),
    RECALL_MANAGER_MESSAGE(2),
    ADD_PARTICIPANT(3),
    REMOVE_PARTICIPANT(4),
    SET_MANAGER(5),
    DISSOLVE_GROUP(6),
    PUBLISH_NOTICE(7);
    
    public static final ProtoAdapter<GroupAuth> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.GroupAuth$ProtoAdapter_GroupAuth */
    static final class ProtoAdapter_GroupAuth extends EnumAdapter<GroupAuth> {
        ProtoAdapter_GroupAuth() {
            super(GroupAuth.class);
        }

        /* access modifiers changed from: protected */
        public final GroupAuth fromValue(int i) {
            return GroupAuth.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_GroupAuth();
    }

    public static GroupAuth fromValue(int i) {
        switch (i) {
            case 0:
                return UPDATE_GROUP_NAME;
            case 1:
                return RECALL_ORDINARY_MESSAGE;
            case 2:
                return RECALL_MANAGER_MESSAGE;
            case 3:
                return ADD_PARTICIPANT;
            case 4:
                return REMOVE_PARTICIPANT;
            case 5:
                return SET_MANAGER;
            case 6:
                return DISSOLVE_GROUP;
            case 7:
                return PUBLISH_NOTICE;
            default:
                return null;
        }
    }

    private GroupAuth(int i) {
        this.value = i;
    }
}
