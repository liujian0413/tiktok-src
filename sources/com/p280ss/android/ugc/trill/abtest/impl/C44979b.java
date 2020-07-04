package com.p280ss.android.ugc.trill.abtest.impl;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.app.NotificationCompat.C0575b;
import com.p280ss.android.ugc.aweme.R$drawable;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.trill.abtest.C44973a;
import com.p280ss.android.ugc.trill.app.TrillApplication;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.abtest.impl.b */
public final class C44979b extends C44973a<Boolean> {
    /* renamed from: a */
    public final /* synthetic */ Object mo107490a() {
        return m141932c();
    }

    /* renamed from: c */
    private static Boolean m141932c() {
        if (C7163a.m22363a()) {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: b */
    private static void m141931b() {
        if (VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) TrillApplication.m21341a().getSystemService("notification");
            if (notificationManager.getNotificationChannel("AttractUserWithoutLoginHome") != null) {
                notificationManager.deleteNotificationChannel("AttractUserWithoutLoginHome");
            }
        }
    }

    /* renamed from: a */
    private static void m141929a(String str) {
        C6907h.onEvent(MobClick.obtain().setLabelName(str).setEventName("recall_push"));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean mo107492a(Boolean bool) {
        m141931b();
        if (C21115b.m71197a().isLogin() || ((Boolean) C23060u.m75742a().mo60037G().mo59877d()).booleanValue() || !bool.booleanValue()) {
            return false;
        }
        NotificationManager notificationManager = (NotificationManager) TrillApplication.m21341a().getSystemService("notification");
        Intent intent = new Intent(TrillApplication.m21341a(), NotificationBroadcastReceiver.class);
        intent.setAction("notification_clicked");
        intent.putExtra("type", 1);
        PendingIntent broadcast = PendingIntent.getBroadcast(TrillApplication.m21341a(), 0, intent, 1073741824);
        if (VERSION.SDK_INT >= 26) {
            m141928a(notificationManager, "other_channel", TrillApplication.m21341a().getString(R.string.dro), 4);
        }
        C0575b bVar = new C0575b(TrillApplication.m21341a(), "other_channel");
        if (VERSION.SDK_INT > 20) {
            bVar.mo2519a((int) R.drawable.status_icon_l);
        } else {
            bVar.mo2519a((int) R.drawable.status_icon);
        }
        Drawable drawable = TrillApplication.m21341a().getResources().getDrawable(R$drawable.icon);
        Bitmap bitmap = null;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        }
        bVar.mo2526a(bitmap).mo2530a((CharSequence) TrillApplication.m21341a().getString(R.string.jj)).mo2537b((CharSequence) TrillApplication.m21341a().getString(R.string.lw));
        bVar.mo2524a(broadcast);
        if (notificationManager != null) {
            notificationManager.notify(1, bVar.mo2534b());
        }
        C23060u.m75742a().mo60037G().mo59871a(Boolean.valueOf(true));
        m141929a("show");
        return true;
    }

    /* renamed from: a */
    private static void m141928a(NotificationManager notificationManager, String str, String str2, int i) {
        if (VERSION.SDK_INT >= 26 && notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLightColor(-16711936);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
