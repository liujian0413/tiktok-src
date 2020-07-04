package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.GroupRole */
public enum GroupRole implements WireEnum {
    ORDINARY(0),
    OWNER(1),
    MANAGER(2),
    VISITOR(3);
    
    public static final ProtoAdapter<GroupRole> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.GroupRole$ProtoAdapter_GroupRole */
    static final class ProtoAdapter_GroupRole extends EnumAdapter<GroupRole> {
        ProtoAdapter_GroupRole() {
            super(GroupRole.class);
        }

        /* access modifiers changed from: protected */
        public final GroupRole fromValue(int i) {
            return GroupRole.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_GroupRole();
    }

    public static GroupRole fromValue(int i) {
        switch (i) {
            case 0:
                return ORDINARY;
            case 1:
                return OWNER;
            case 2:
                return MANAGER;
            case 3:
                return VISITOR;
            default:
                return null;
        }
    }

    private GroupRole(int i) {
        this.value = i;
    }
}
