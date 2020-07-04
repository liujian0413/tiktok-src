package com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed;

import com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.FetchFeedDetectorManager.FeedNullNetNotifyUIHelper.ActionType;
import com.p280ss.android.ugc.network.observer.NetworkState;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b */
public final /* synthetic */ class C28565b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f75224a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f75225b;

    static {
        int[] iArr = new int[ActionType.values().length];
        f75224a = iArr;
        iArr[ActionType.SHOW_TOAST.ordinal()] = 1;
        f75224a[ActionType.SHOW_BAR.ordinal()] = 2;
        f75224a[ActionType.SHOW_NO_NET_SCREEN.ordinal()] = 3;
        int[] iArr2 = new int[NetworkState.values().length];
        f75225b = iArr2;
        iArr2[NetworkState.NETWORK_GOOD.ordinal()] = 1;
        f75225b[NetworkState.NO_NETWORK.ordinal()] = 2;
        f75225b[NetworkState.UNKNOWN_STATUS.ordinal()] = 3;
    }
}
