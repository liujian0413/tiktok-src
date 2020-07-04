package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ServerTier implements WireEnum {
    OPS_TIER(0),
    CRITICAL_TIER(1),
    BUSINESS_TIER(2);
    
    public static final ProtoAdapter<ServerTier> ADAPTER = null;
    private final int value;

    static final class ProtoAdapter_ServerTier extends EnumAdapter<ServerTier> {
        ProtoAdapter_ServerTier() {
            super(ServerTier.class);
        }

        /* access modifiers changed from: protected */
        public final ServerTier fromValue(int i) {
            return ServerTier.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_ServerTier();
    }

    public static ServerTier fromValue(int i) {
        switch (i) {
            case 0:
                return OPS_TIER;
            case 1:
                return CRITICAL_TIER;
            case 2:
                return BUSINESS_TIER;
            default:
                return null;
        }
    }

    private ServerTier(int i) {
        this.value = i;
    }
}
