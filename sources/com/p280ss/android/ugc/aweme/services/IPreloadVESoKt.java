package com.p280ss.android.ugc.aweme.services;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader.LoadStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.IPreloadVESoKt */
public final class IPreloadVESoKt {

    /* renamed from: com.ss.android.ugc.aweme.services.IPreloadVESoKt$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LoadStatus.NOT_LOAD.ordinal()] = 1;
            $EnumSwitchMapping$0[LoadStatus.LOADING.ordinal()] = 2;
            $EnumSwitchMapping$0[LoadStatus.LOADED.ordinal()] = 3;
        }
    }

    public static final int toStatusCode(LoadStatus loadStatus) {
        C7573i.m23587b(loadStatus, "loadStatus");
        switch (WhenMappings.$EnumSwitchMapping$0[loadStatus.ordinal()]) {
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
