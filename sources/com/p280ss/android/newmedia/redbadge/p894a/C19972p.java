package com.p280ss.android.newmedia.redbadge.p894a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.p280ss.android.newmedia.redbadge.C19953a;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.p */
public class C19972p implements C19953a {

    /* renamed from: a */
    private final Uri f54057a = Uri.parse("content://com.android.badge/badge");

    /* renamed from: a */
    public final List<String> mo53458a() {
        return Collections.singletonList("com.zui.launcher");
    }

    /* renamed from: a */
    public final void mo53459a(Context context, ComponentName componentName, int i) throws RedBadgerException {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("app_badge_count", i);
                context.getContentResolver().call(this.f54057a, "setAppBadgeCount", null, bundle);
            } catch (Throwable th) {
                throw new RedBadgerException(th.getMessage());
            }
        }
    }
}
