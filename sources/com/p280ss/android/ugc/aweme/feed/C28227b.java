package com.p280ss.android.ugc.aweme.feed;

import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28442a;

/* renamed from: com.ss.android.ugc.aweme.feed.b */
public final class C28227b {

    /* renamed from: a */
    private static C28442a f74353a;

    /* renamed from: a */
    public static void m92771a(int i, String str, int i2) {
        if (f74353a == null) {
            f74353a = new C28442a();
        }
        switch (i) {
            case 0:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(0));
                return;
            case 1:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(1));
                return;
            case 2:
            case 7:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(2));
                return;
            case 1000:
            case AdError.SERVER_ERROR_CODE /*2000*/:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(3));
                return;
            case 1001:
            case AdError.INTERNAL_ERROR_CODE /*2001*/:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(4));
                return;
            case 3002:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(5));
                return;
            case 3003:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(9));
                return;
            case 4000:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(6));
                return;
            case 4001:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(8));
                return;
            case 5000:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(7));
                return;
            case 8000:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(20));
                return;
            default:
                f74353a.sendRequest(str, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(i2));
                return;
        }
    }
}
