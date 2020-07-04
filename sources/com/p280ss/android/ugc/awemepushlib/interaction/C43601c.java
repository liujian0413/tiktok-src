package com.p280ss.android.ugc.awemepushlib.interaction;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.awemepushapi.PushSettingExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.c */
public final class C43601c {

    /* renamed from: a */
    public static final Map<String, Integer> f112847a = new HashMap<String, Integer>() {
        {
            put("digg_push", Integer.valueOf(R.string.drh));
            put("comment_push", Integer.valueOf(R.string.drd));
            put("follow_push", Integer.valueOf(R.string.drf));
            put("mention_push", Integer.valueOf(R.string.drk));
            put("im_push", Integer.valueOf(R.string.dre));
            put("follow_new_video_push", Integer.valueOf(R.string.dru));
            put("recommend_video_push", Integer.valueOf(R.string.drv));
            put("live_push", Integer.valueOf(R.string.dri));
            put("other_channel", Integer.valueOf(R.string.dro));
        }
    };

    /* renamed from: c */
    public static void m138172c(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        m138167a(notificationManager, "com.ss.android.ugc.aweme.server", "Notification");
        m138168a(notificationManager, "com.ss.android.ugc.aweme.server.important.low", "Notification", 2);
        for (Entry key : f112847a.entrySet()) {
            m138166a(notificationManager, (String) key.getKey());
        }
    }

    /* renamed from: a */
    public static void m138169a(Context context) {
        if (VERSION.SDK_INT >= 26 && context != null) {
            if (C6384b.m19835a().mo15292a(PushSettingExperiment.class, false, "enable_notification_category", C6384b.m19835a().mo15295d().enable_notification_category, false)) {
                m138171b(context);
            } else {
                m138172c(context);
            }
        }
    }

    /* renamed from: b */
    public static void m138171b(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        for (Entry entry : f112847a.entrySet()) {
            m138167a(notificationManager, (String) entry.getKey(), context.getString(((Integer) entry.getValue()).intValue()));
        }
        m138166a(notificationManager, "com.ss.android.ugc.aweme.server");
        m138166a(notificationManager, "com.ss.android.ugc.aweme.server.important.low");
    }

    /* renamed from: a */
    private static void m138166a(NotificationManager notificationManager, String str) {
        if (!(VERSION.SDK_INT < 26 || notificationManager == null || notificationManager.getNotificationChannel(str) == null)) {
            notificationManager.deleteNotificationChannel(str);
        }
    }

    /* renamed from: a */
    public static boolean m138170a(Context context, String str) {
        if (VERSION.SDK_INT < 26 || context == null || ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m138167a(NotificationManager notificationManager, String str, String str2) {
        m138168a(notificationManager, str, str2, 4);
    }

    /* renamed from: a */
    private static void m138168a(NotificationManager notificationManager, String str, String str2, int i) {
        if (VERSION.SDK_INT >= 26 && notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLightColor(-16711936);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
