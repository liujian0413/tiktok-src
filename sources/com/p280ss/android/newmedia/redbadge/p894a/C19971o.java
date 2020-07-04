package com.p280ss.android.newmedia.redbadge.p894a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.p280ss.android.newmedia.redbadge.C19953a;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.o */
public class C19971o implements C19953a {
    /* renamed from: a */
    public final List<String> mo53458a() {
        return new ArrayList(0);
    }

    /* renamed from: a */
    public final void mo53459a(Context context, ComponentName componentName, int i) throws RedBadgerException {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            bundle.putString("app_badge_component_name", componentName.flattenToString());
            try {
                context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", null, bundle);
            } catch (Throwable th) {
                throw new RedBadgerException(th.getMessage());
            }
        }
    }
}
