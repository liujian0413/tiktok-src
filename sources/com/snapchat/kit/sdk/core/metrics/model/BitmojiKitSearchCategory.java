package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BitmojiKitSearchCategory implements WireEnum {
    UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY(0),
    TEXT(1),
    AUTOCOMPLETE(2),
    PROGRAMMED_PILLS(3);
    
    public static final ProtoAdapter<BitmojiKitSearchCategory> ADAPTER = null;
    private final int value;

    static final class ProtoAdapter_BitmojiKitSearchCategory extends EnumAdapter<BitmojiKitSearchCategory> {
        ProtoAdapter_BitmojiKitSearchCategory() {
            super(BitmojiKitSearchCategory.class);
        }

        /* access modifiers changed from: protected */
        public final BitmojiKitSearchCategory fromValue(int i) {
            return BitmojiKitSearchCategory.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_BitmojiKitSearchCategory();
    }

    public static BitmojiKitSearchCategory fromValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY;
            case 1:
                return TEXT;
            case 2:
                return AUTOCOMPLETE;
            case 3:
                return PROGRAMMED_PILLS;
            default:
                return null;
        }
    }

    private BitmojiKitSearchCategory(int i) {
        this.value = i;
    }
}
