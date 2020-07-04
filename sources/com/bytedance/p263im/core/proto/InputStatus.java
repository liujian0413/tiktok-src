package com.bytedance.p263im.core.proto;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.InputStatus */
public enum InputStatus implements WireEnum {
    TYPING(3),
    CLEAR_INPUT(4);
    
    public static final ProtoAdapter<InputStatus> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.InputStatus$ProtoAdapter_InputStatus */
    static final class ProtoAdapter_InputStatus extends EnumAdapter<InputStatus> {
        ProtoAdapter_InputStatus() {
            super(InputStatus.class);
        }

        /* access modifiers changed from: protected */
        public final InputStatus fromValue(int i) {
            return InputStatus.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_InputStatus();
    }

    public static InputStatus fromValue(int i) {
        switch (i) {
            case 3:
                return TYPING;
            case 4:
                return CLEAR_INPUT;
            default:
                return null;
        }
    }

    private InputStatus(int i) {
        this.value = i;
    }
}
