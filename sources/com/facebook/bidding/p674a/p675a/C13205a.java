package com.facebook.bidding.p674a.p675a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.facebook.bidding.a.a.a */
public final class C13205a {

    /* renamed from: a */
    public static final String f34999a = VERSION.RELEASE;

    /* renamed from: b */
    private final Context f35000b;

    public C13205a(Context context) {
        this.f35000b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static boolean m38595a(Context context) {
        return C7285c.m22838a(context, "SDKIDFA", 0).getBoolean("limitAdTracking", false);
    }

    /* renamed from: a */
    public final String mo32400a() {
        PendingIntent activity = PendingIntent.getActivity(this.f35000b, 0, new Intent(), 0);
        return activity == null ? "" : VERSION.SDK_INT >= 17 ? activity.getCreatorPackage() : activity.getTargetPackage();
    }

    /* renamed from: b */
    public final String mo32401b() {
        String str;
        try {
            str = this.f35000b.getPackageManager().getPackageInfo(mo32400a(), 0).versionName;
        } catch (NameNotFoundException unused) {
            str = null;
        }
        return !TextUtils.isEmpty(str) ? str : "";
    }

    /* renamed from: c */
    public final int mo32402c() {
        try {
            return this.f35000b.getPackageManager().getPackageInfo(mo32400a(), 0).versionCode;
        } catch (NameNotFoundException unused) {
            return 0;
        }
    }
}
