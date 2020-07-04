package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BitmojiKitPermissionUpdateStatus implements WireEnum {
    UNKNOWN_BITMOJI_KIT_PERMISSION_UPDATE_STATUS(0),
    BITMOJI_PERMISSION_ON(1),
    BITMOJI_PERMISSION_OFF(2),
    BITMOJI_REAUTH_ERROR(3);
    
    public static final ProtoAdapter<BitmojiKitPermissionUpdateStatus> ADAPTER = null;
    private final int value;

    static final class ProtoAdapter_BitmojiKitPermissionUpdateStatus extends EnumAdapter<BitmojiKitPermissionUpdateStatus> {
        ProtoAdapter_BitmojiKitPermissionUpdateStatus() {
            super(BitmojiKitPermissionUpdateStatus.class);
        }

        /* access modifiers changed from: protected */
        public final BitmojiKitPermissionUpdateStatus fromValue(int i) {
            return BitmojiKitPermissionUpdateStatus.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_BitmojiKitPermissionUpdateStatus();
    }

    public static BitmojiKitPermissionUpdateStatus fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BITMOJI_KIT_PERMISSION_UPDATE_STATUS;
            case 1:
                return BITMOJI_PERMISSION_ON;
            case 2:
                return BITMOJI_PERMISSION_OFF;
            case 3:
                return BITMOJI_REAUTH_ERROR;
            default:
                return null;
        }
    }

    private BitmojiKitPermissionUpdateStatus(int i) {
        this.value = i;
    }
}
