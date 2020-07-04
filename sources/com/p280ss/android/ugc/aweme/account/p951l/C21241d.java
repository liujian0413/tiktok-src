package com.p280ss.android.ugc.aweme.account.p951l;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.p280ss.android.ugc.aweme.C21671bd;

/* renamed from: com.ss.android.ugc.aweme.account.l.d */
public final class C21241d {
    /* renamed from: a */
    public static boolean m71496a() {
        return m71497a(C21671bd.m72532b());
    }

    /* renamed from: b */
    public static int m71498b(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context.getApplicationContext());
        } catch (Exception unused) {
            return 1;
        }
    }

    /* renamed from: a */
    public static boolean m71497a(Context context) {
        if (m71498b(context) == 0) {
            return true;
        }
        return false;
    }
}
