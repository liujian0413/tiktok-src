package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.C46825e;
import com.twitter.sdk.android.core.C46938j;
import com.twitter.sdk.android.core.C46939k;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.C46875m;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.ad */
public final class C46904ad {

    /* renamed from: a */
    private static C46898a f120273a;

    /* renamed from: a */
    public static C46898a m146705a() {
        return f120273a;
    }

    /* renamed from: a */
    public static void m146706a(Context context, C46939k<? extends C46938j<TwitterAuthToken>> kVar, C46825e eVar, C46875m mVar, String str, String str2) {
        C46898a aVar = new C46898a(context, kVar, eVar, mVar, C46898a.m146694a(str, str2));
        f120273a = aVar;
    }
}
