package com.p280ss.android.ugc.aweme.services;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.ss.android.ugc.aweme.services.PreloadVESoStatus */
public enum PreloadVESoStatus {
    UNLOAD,
    LOADING,
    LOADED;

    /* renamed from: com.ss.android.ugc.aweme.services.PreloadVESoStatus$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] iArr = new int[PreloadVESoStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[PreloadVESoStatus.UNLOAD.ordinal()] = 1;
            $EnumSwitchMapping$0[PreloadVESoStatus.LOADING.ordinal()] = 2;
            $EnumSwitchMapping$0[PreloadVESoStatus.LOADED.ordinal()] = 3;
        }
    }

    public final int toStatusCode() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return -1;
            case 2:
                return 0;
            case 3:
                return 1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
