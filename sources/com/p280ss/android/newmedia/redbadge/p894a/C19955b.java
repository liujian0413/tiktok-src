package com.p280ss.android.newmedia.redbadge.p894a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p280ss.android.newmedia.redbadge.C19953a;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import com.p280ss.android.newmedia.redbadge.p896c.C19981a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.b */
public class C19955b implements C19953a {
    /* renamed from: a */
    public final List<String> mo53458a() {
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }

    /* renamed from: a */
    public final void mo53459a(Context context, ComponentName componentName, int i) throws RedBadgerException {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
            intent.putExtra("package", componentName.getPackageName());
            intent.putExtra("count", i);
            intent.putExtra("badgecount", i);
            intent.putExtra("class", componentName.getClassName());
            context.sendBroadcast(intent);
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
