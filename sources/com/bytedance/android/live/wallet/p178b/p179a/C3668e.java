package com.bytedance.android.live.wallet.p178b.p179a;

import com.bytedance.android.livesdkapi.host.PayChannel;

/* renamed from: com.bytedance.android.live.wallet.b.a.e */
public final /* synthetic */ class C3668e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f10933a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f10934b;

    static {
        int[] iArr = new int[PayChannel.values().length];
        f10933a = iArr;
        iArr[PayChannel.ONECARD.ordinal()] = 1;
        f10933a[PayChannel.MASTERCARD.ordinal()] = 2;
        f10933a[PayChannel.VISA.ordinal()] = 3;
        f10933a[PayChannel.BOKU.ordinal()] = 4;
        int[] iArr2 = new int[PayChannel.values().length];
        f10934b = iArr2;
        iArr2[PayChannel.GOOGLE.ordinal()] = 1;
        f10934b[PayChannel.ONECARD.ordinal()] = 2;
        f10934b[PayChannel.MASTERCARD.ordinal()] = 3;
        f10934b[PayChannel.VISA.ordinal()] = 4;
        f10934b[PayChannel.BOKU.ordinal()] = 5;
        f10934b[PayChannel.HUOLI.ordinal()] = 6;
    }
}
