package com.bytedance.android.live.wallet.fragment;

import com.bytedance.android.livesdkapi.host.PayChannel;

/* renamed from: com.bytedance.android.live.wallet.fragment.a */
public final /* synthetic */ class C3800a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f11288a;

    static {
        int[] iArr = new int[PayChannel.values().length];
        f11288a = iArr;
        iArr[PayChannel.GOOGLE.ordinal()] = 1;
        f11288a[PayChannel.ONECARD.ordinal()] = 2;
        f11288a[PayChannel.MASTERCARD.ordinal()] = 3;
        f11288a[PayChannel.VISA.ordinal()] = 4;
        f11288a[PayChannel.BOKU.ordinal()] = 5;
        f11288a[PayChannel.HUOLI.ordinal()] = 6;
    }
}
