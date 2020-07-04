package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ParticipantRole */
public enum ParticipantRole implements WireEnum {
    PARTICIPANT_ROLE_NORMAL(0),
    PARTICIPANT_ROLE_OWNER(1),
    PARTICIPANT_ROLE_ADMIN(2),
    PARTICIPANT_ROLE_VISITOR(3);
    
    public static final ProtoAdapter<ParticipantRole> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.ParticipantRole$ProtoAdapter_ParticipantRole */
    static final class ProtoAdapter_ParticipantRole extends EnumAdapter<ParticipantRole> {
        ProtoAdapter_ParticipantRole() {
            super(ParticipantRole.class);
        }

        /* access modifiers changed from: protected */
        public final ParticipantRole fromValue(int i) {
            return ParticipantRole.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_ParticipantRole();
    }

    public static ParticipantRole fromValue(int i) {
        switch (i) {
            case 0:
                return PARTICIPANT_ROLE_NORMAL;
            case 1:
                return PARTICIPANT_ROLE_OWNER;
            case 2:
                return PARTICIPANT_ROLE_ADMIN;
            case 3:
                return PARTICIPANT_ROLE_VISITOR;
            default:
                return null;
        }
    }

    private ParticipantRole(int i) {
        this.value = i;
    }
}
