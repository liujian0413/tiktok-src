package com.p280ss.android.newmedia.redbadge.p894a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.newmedia.redbadge.C19953a;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import com.p280ss.android.newmedia.redbadge.p896c.C19981a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.d */
public final class C19957d implements C19953a {
    /* renamed from: a */
    public final List<String> mo53458a() {
        return new ArrayList(0);
    }

    /* renamed from: a */
    static boolean m65805a(Context context) {
        return C19981a.m65883a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"));
    }

    /* renamed from: a */
    public final void mo53459a(Context context, ComponentName componentName, int i) throws RedBadgerException {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i);
            intent.putExtra("badge_count_package_name", componentName.getPackageName());
            intent.putExtra("badge_count_class_name", componentName.getClassName());
            if (C19981a.m65883a(context, intent)) {
                try {
                    context.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new RedBadgerException(th.getMessage());
                }
            } else {
                StringBuilder sb = new StringBuilder("unable to resolve intent: ");
                sb.append(intent.toString());
                throw new RedBadgerException(sb.toString());
            }
        }
    }
}
