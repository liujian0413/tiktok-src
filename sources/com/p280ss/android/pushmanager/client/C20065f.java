package com.p280ss.android.pushmanager.client;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.C6317k;
import com.bytedance.common.utility.p254b.C6304f;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.app.C20047d;
import com.p280ss.android.pushmanager.setting.C20090b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.client.f */
public final class C20065f {

    /* renamed from: a */
    private static List<NotificationChannel> f54264a;

    /* renamed from: a */
    public static String m66064a() {
        return "push";
    }

    /* renamed from: a */
    static void m66067a(final Context context) {
        C6304f.submitRunnable(new Runnable() {
            public final void run() {
                if (!C20090b.m66187a().mo53795v() || C20065f.m66071b(context)) {
                    C20065f.m66069a(context, C20090b.m66187a().mo53768c());
                }
            }
        });
    }

    /* renamed from: b */
    public static boolean m66071b(Context context) {
        boolean z;
        if (C20090b.m66187a().mo53797x() != C19826j.m65475d(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        return m66073d(context);
    }

    /* renamed from: c */
    public static List<NotificationChannel> m66072c(Context context) {
        if (f54264a == null || f54264a.isEmpty()) {
            try {
                f54264a = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannels();
            } catch (Throwable unused) {
                f54264a = Collections.emptyList();
            }
        }
        return f54264a;
    }

    /* renamed from: d */
    private static boolean m66073d(Context context) {
        try {
            List c = m66072c(context);
            String G = C20090b.m66187a().mo53751G();
            if (TextUtils.isEmpty(G)) {
                if (c != null) {
                    if (!c.isEmpty()) {
                        return true;
                    }
                }
                return false;
            } else if (!m66070a(c, m66065a(new JSONArray(G)))) {
                return true;
            } else {
                return false;
            }
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Map<String, NotificationChannel> m66065a(JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("id");
            NotificationChannel notificationChannel = new NotificationChannel(optString, optJSONObject.optString("name"), optJSONObject.optInt("importance", -1));
            notificationChannel.setBypassDnd(optJSONObject.optBoolean("bypassDnd"));
            notificationChannel.setLockscreenVisibility(optJSONObject.optInt("lockscreenVisibility", -1));
            notificationChannel.enableLights(optJSONObject.optBoolean("lights"));
            notificationChannel.enableVibration(optJSONObject.optBoolean("vibration"));
            hashMap.put(optString, notificationChannel);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONArray m66066a(List<NotificationChannel> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        for (NotificationChannel notificationChannel : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", notificationChannel.getId());
                jSONObject.put("name", notificationChannel.getName());
                jSONObject.put("importance", notificationChannel.getImportance());
                jSONObject.put("bypassDnd", notificationChannel.canBypassDnd());
                jSONObject.put("lockscreenVisibility", notificationChannel.getLockscreenVisibility());
                jSONObject.put("lights", notificationChannel.shouldShowLights());
                jSONObject.put("vibration", notificationChannel.shouldVibrate());
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    static void m66068a(final Context context, final String str) {
        C6304f.submitRunnable(new Runnable() {
            public final void run() {
                if (VERSION.SDK_INT >= 26) {
                    String a = C20065f.m66064a();
                    String str = str;
                    if (TextUtils.isEmpty(str)) {
                        str = context.getString(R.string.d_n);
                    }
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null && notificationManager.getNotificationChannel(a) == null) {
                        NotificationChannel notificationChannel = new NotificationChannel(a, str, 4);
                        notificationChannel.setShowBadge(true);
                        notificationChannel.enableVibration(true);
                        notificationChannel.enableLights(true);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    static void m66069a(final Context context, final boolean z) {
        if (!C20069g.m66074a(context)) {
            C20090b.m66187a().mo53779g(false);
            return;
        }
        C200672 r0 = new Runnable() {
            public final void run() {
                String str;
                JSONArray jSONArray;
                int d = C19826j.m65475d(context);
                Map c = C20047d.m66018a().mo53674c();
                String str2 = "notice";
                if (z) {
                    str = "0";
                } else {
                    str = "1";
                }
                c.put(str2, str);
                StringBuilder sb = new StringBuilder();
                sb.append(d);
                c.put("system_notify_status", sb.toString());
                String a = C19826j.m65467a(C20074g.m66111f(), c);
                try {
                    if (VERSION.SDK_INT >= 26) {
                        jSONArray = C20065f.m66066a(C20065f.m66072c(context));
                    } else {
                        jSONArray = new JSONArray();
                    }
                    String a2 = C6317k.m19580a().mo15155a(a, jSONArray.toString().getBytes("UTF-8"), true, "application/json; charset=utf-8", false);
                    if (!TextUtils.isEmpty(a2)) {
                        if ("success".equals(new JSONObject(a2).optString("message"))) {
                            C20090b.m66187a().mo53779g(true);
                            C20090b.m66187a().mo53760b(d);
                            C20090b.m66187a().mo53781h(jSONArray.toString());
                            return;
                        }
                    }
                    C20090b.m66187a().mo53779g(false);
                } catch (Exception unused) {
                    C20090b.m66187a().mo53779g(false);
                }
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C6304f.submitRunnable(r0);
        } else {
            r0.run();
        }
    }

    /* renamed from: a */
    private static boolean m66070a(List<NotificationChannel> list, Map<String, NotificationChannel> map) {
        if (list.size() != map.size()) {
            return false;
        }
        for (NotificationChannel notificationChannel : list) {
            NotificationChannel notificationChannel2 = (NotificationChannel) map.get(notificationChannel.getId());
            if (notificationChannel2 == null || notificationChannel2.getImportance() != notificationChannel.getImportance() || notificationChannel2.getLockscreenVisibility() != notificationChannel.getLockscreenVisibility() || notificationChannel2.canBypassDnd() != notificationChannel.canBypassDnd() || notificationChannel2.shouldShowLights() != notificationChannel.shouldShowLights()) {
                return false;
            }
            if (notificationChannel2.shouldVibrate() != notificationChannel.shouldVibrate()) {
                return false;
            }
        }
        return true;
    }
}
