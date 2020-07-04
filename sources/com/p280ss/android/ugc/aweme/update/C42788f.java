package com.p280ss.android.ugc.aweme.update;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.p022v4.app.NotificationCompat.C0575b;
import android.widget.RemoteViews;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.update.f */
public final class C42788f {
    /* renamed from: a */
    public static Notification m135807a(Context context, C0575b bVar, String str, String str2, int i) {
        if (VERSION.SDK_INT >= 14) {
            bVar.mo2530a((CharSequence) str).mo2542c((CharSequence) str2).mo2521a(100, i, false);
        }
        Notification b = bVar.mo2534b();
        if (VERSION.SDK_INT < 14) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.ajr);
            remoteViews.setProgressBar(R.id.cky, 100, i, false);
            remoteViews.setTextViewText(R.id.cla, str2);
            remoteViews.setTextViewText(R.id.title, str);
            b.contentView = remoteViews;
        }
        return b;
    }

    /* renamed from: a */
    public static Notification m135806a(Context context, C0575b bVar, int i, Bitmap bitmap, String str, String str2, String str3, int i2, PendingIntent pendingIntent) {
        bVar.mo2519a(17301633).mo2545d((CharSequence) str).mo2523a(System.currentTimeMillis()).mo2532a(true).mo2524a(pendingIntent);
        return m135807a(context, bVar, str2, str3, i2);
    }
}
