package com.p280ss.android.newmedia.redbadge.p894a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p280ss.android.newmedia.redbadge.C19953a;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import com.p280ss.android.newmedia.redbadge.p896c.C19981a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.i */
public class C19962i implements C19953a {

    /* renamed from: a */
    private static int f54049a = -1;

    /* renamed from: b */
    private int f54050b = Integer.MIN_VALUE;

    /* renamed from: a */
    public final List<String> mo53458a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    /* renamed from: a */
    public final void mo53459a(Context context, ComponentName componentName, int i) throws RedBadgerException {
        if (context != null && componentName != null && this.f54050b != i && (this.f54050b <= 99 || i <= 99)) {
            this.f54050b = i;
            Intent intent = new Intent("com.oppo.unsettledevent");
            intent.putExtra("pakeageName", componentName.getPackageName());
            intent.putExtra("number", i);
            intent.putExtra("upgradeNumber", i);
            if (C19981a.m65883a(context, intent)) {
                try {
                    context.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new RedBadgerException(th.getMessage());
                }
            } else {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("app_badge_count", i);
                    context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", null, bundle);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder("unable to resolve intent: ");
                    sb.append(intent.toString());
                    throw new RedBadgerException(sb.toString());
                }
            }
        }
    }
}
