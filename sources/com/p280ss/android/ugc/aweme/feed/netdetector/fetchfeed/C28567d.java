package com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed;

import com.p280ss.android.ugc.network.observer.NetworkState;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.d */
public final /* synthetic */ class C28567d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f75226a;

    static {
        int[] iArr = new int[NetworkState.values().length];
        f75226a = iArr;
        iArr[NetworkState.NETWORK_GOOD.ordinal()] = 1;
        f75226a[NetworkState.UNKNOWN_STATUS.ordinal()] = 2;
        f75226a[NetworkState.NO_NETWORK.ordinal()] = 3;
    }
}
