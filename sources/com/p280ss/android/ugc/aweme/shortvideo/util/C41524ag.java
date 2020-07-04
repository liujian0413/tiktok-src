package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ag */
public final class C41524ag {

    /* renamed from: a */
    private static MessageQueue f107987a;

    /* renamed from: b */
    private static Field f107988b;

    /* renamed from: c */
    private static Field f107989c;

    /* renamed from: d */
    private static Field f107990d;

    /* renamed from: e */
    private static Field f107991e;

    /* renamed from: f */
    private static boolean f107992f = C6399b.m19944t();

    /* renamed from: g */
    private static boolean f107993g = C35574k.m114859a().mo70096k().mo93305a(Property.EnableRushLooper);

    /* renamed from: a */
    private static MessageQueue m132260a() {
        if (f107987a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f107987a = Looper.myQueue();
            } else if (VERSION.SDK_INT >= 23) {
                f107987a = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f107987a = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable unused) {
                }
            }
        }
        return f107987a;
    }

    /* renamed from: b */
    public static void m132264b(Activity activity) {
        if (f107992f && !activity.isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            m132262a(activity);
        }
    }

    /* renamed from: a */
    private static IBinder m132258a(Message message) {
        if (VERSION.SDK_INT >= 24) {
            try {
                if (f107989c == null) {
                    f107989c = Class.forName("com.android.internal.os.SomeArgs").getDeclaredField("arg1");
                }
                return (IBinder) f107989c.get(message.obj);
            } catch (Exception unused) {
            }
        } else {
            if (message.obj instanceof IBinder) {
                return (IBinder) message.obj;
            }
            return null;
        }
    }

    /* renamed from: b */
    private static Message m132263b(Message message) {
        if (f107991e == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f107991e = declaredField;
                declaredField.setAccessible(true);
                return (Message) f107991e.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) f107991e.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: c */
    private static IBinder m132265c(Activity activity) {
        if (f107988b == null) {
            try {
                Field declaredField = Class.forName("android.app.Activity").getDeclaredField("mToken");
                f107988b = declaredField;
                declaredField.setAccessible(true);
                return (IBinder) f107988b.get(activity);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (IBinder) f107988b.get(activity);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Message m132259a(MessageQueue messageQueue) {
        if (f107990d == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f107990d = declaredField;
                declaredField.setAccessible(true);
                return (Message) f107990d.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) f107990d.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<android.os.Message> m132261a(int r5) {
        /*
            android.os.MessageQueue r5 = m132260a()
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            monitor-enter(r5)
            android.os.Message r3 = m132259a(r5)     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0017
            monitor-exit(r5)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0017:
            if (r3 == 0) goto L_0x0028
            int r0 = r2 + 1
            r4 = 100
            if (r2 >= r4) goto L_0x0028
            r1.add(r3)     // Catch:{ all -> 0x002a }
            android.os.Message r3 = m132263b(r3)     // Catch:{ all -> 0x002a }
            r2 = r0
            goto L_0x0017
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x002a }
            return r1
        L_0x002a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.util.C41524ag.m132261a(int):java.util.List");
    }

    /* renamed from: a */
    public static void m132262a(Activity activity) {
        if (f107993g && activity != null && !activity.isFinishing() && VERSION.SDK_INT < 28 && VERSION.SDK_INT > 18) {
            long uptimeMillis = SystemClock.uptimeMillis();
            List<Message> a = m132261a(100);
            if (a != null) {
                for (Message message : a) {
                    if (message.what == 109 && message.getWhen() - uptimeMillis < -9000 && m132258a(message) != null && m132258a(message) == m132265c(activity)) {
                        activity.finish();
                        return;
                    }
                }
            }
        }
    }
}
