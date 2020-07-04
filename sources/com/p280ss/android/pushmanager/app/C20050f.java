package com.p280ss.android.pushmanager.app;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.ugc.aweme.lancet.I18nLancet;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.app.f */
final class C20050f {
    /* renamed from: a */
    static String m66034a() {
        if (!TextUtils.isEmpty(I18nLancet.f84337a)) {
            return I18nLancet.f84337a;
        }
        String b = C19826j.m65470b();
        I18nLancet.f84337a = b;
        return b;
    }

    /* renamed from: a */
    static Map m66035a(C20047d dVar) {
        Map d = dVar.mo53675d();
        NotificationManager notificationManager = (NotificationManager) C6399b.m19921a().getSystemService("notification");
        if (VERSION.SDK_INT >= 26 && notificationManager != null) {
            for (NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                d.put(notificationChannel.getId(), String.valueOf(notificationChannel.getImportance()));
            }
        }
        return d;
    }
}
