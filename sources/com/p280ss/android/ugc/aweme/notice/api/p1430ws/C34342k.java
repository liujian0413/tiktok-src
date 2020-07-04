package com.p280ss.android.ugc.aweme.notice.api.p1430ws;

import com.bytedance.common.wschannel.event.ConnectionState;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.k */
public final /* synthetic */ class C34342k {

    /* renamed from: a */
    public static final /* synthetic */ int[] f89505a;

    static {
        int[] iArr = new int[ConnectionState.values().length];
        f89505a = iArr;
        iArr[ConnectionState.CONNECTED.ordinal()] = 1;
        f89505a[ConnectionState.CONNECT_CLOSED.ordinal()] = 2;
        f89505a[ConnectionState.CONNECT_FAILED.ordinal()] = 3;
        f89505a[ConnectionState.CONNECTING.ordinal()] = 4;
    }
}
