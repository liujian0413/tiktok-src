package com.bytedance.p263im.core.proto;

import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyStatus */
public enum ModifyMessagePropertyStatus implements WireEnum {
    MODIFY_PROPERTY_SUCCESS(0),
    MODIFY_PROPERTY_REPEAT_REQUEST(1),
    MODIFY_PROPERTY_INVALID_LENGTH(2),
    MODIFY_PROPERTY_INVALID_REQUEST(3),
    MODIFY_PROPERTY_CALLBACK_ERROR(4),
    MODIFY_PROPERTY_INTERNAL_ERROR(VETransitionFilterParam.TransitionDuration_DEFAULT);
    
    public static final ProtoAdapter<ModifyMessagePropertyStatus> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.ModifyMessagePropertyStatus$ProtoAdapter_ModifyMessagePropertyStatus */
    static final class ProtoAdapter_ModifyMessagePropertyStatus extends EnumAdapter<ModifyMessagePropertyStatus> {
        ProtoAdapter_ModifyMessagePropertyStatus() {
            super(ModifyMessagePropertyStatus.class);
        }

        /* access modifiers changed from: protected */
        public final ModifyMessagePropertyStatus fromValue(int i) {
            return ModifyMessagePropertyStatus.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_ModifyMessagePropertyStatus();
    }

    public static ModifyMessagePropertyStatus fromValue(int i) {
        if (i == 500) {
            return MODIFY_PROPERTY_INTERNAL_ERROR;
        }
        switch (i) {
            case 0:
                return MODIFY_PROPERTY_SUCCESS;
            case 1:
                return MODIFY_PROPERTY_REPEAT_REQUEST;
            case 2:
                return MODIFY_PROPERTY_INVALID_LENGTH;
            case 3:
                return MODIFY_PROPERTY_INVALID_REQUEST;
            case 4:
                return MODIFY_PROPERTY_CALLBACK_ERROR;
            default:
                return null;
        }
    }

    private ModifyMessagePropertyStatus(int i) {
        this.value = i;
    }
}
