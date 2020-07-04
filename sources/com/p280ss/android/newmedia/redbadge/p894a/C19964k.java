package com.p280ss.android.newmedia.redbadge.p894a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p280ss.android.newmedia.redbadge.C19953a;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import com.p280ss.android.newmedia.redbadge.p896c.C19981a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.k */
public class C19964k implements C19953a {
    /* renamed from: a */
    public final List<String> mo53458a() {
        return Arrays.asList(new String[]{"com.smartisanos.launcher", "com.smartisanos.home"});
    }

    /* renamed from: a */
    public final void mo53459a(Context context, ComponentName componentName, int i) throws RedBadgerException {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("com.smartisanos.launcher.new_message");
            intent.putExtra("extra_packagename", componentName.getPackageName());
            intent.putExtra("extra_componentname", componentName.getClassName());
            intent.putExtra("extra_message_count", i);
            if (C19981a.m65883a(context, intent)) {
                try {
                    context.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new RedBadgerException(th.getMessage());
                }
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("badge_num", i);
                try {
                    context.getContentResolver().call(Uri.parse("content://com.smartisanos.launcher.badge"), "updateMessageBadge", null, bundle);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder("unable to resolve intent: ");
                    sb.append(intent.toString());
                    throw new RedBadgerException(sb.toString());
                }
            }
        }
    }
}
