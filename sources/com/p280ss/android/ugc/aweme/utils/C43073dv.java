package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.dv */
public final class C43073dv {

    /* renamed from: a */
    private static MessageQueue f111678a;

    /* renamed from: b */
    private static Field f111679b;

    /* renamed from: c */
    private static Field f111680c;

    /* renamed from: d */
    private static Field f111681d;

    /* renamed from: e */
    private static Field f111682e;

    /* renamed from: f */
    private static boolean f111683f = C6399b.m19944t();

    /* renamed from: g */
    private static boolean f111684g = C6384b.m19835a().mo15292a(RushAB.class, true, "catch_crash_activity", C6384b.m19835a().mo15295d().catch_crash_activity, true);

    /* renamed from: a */
    private static MessageQueue m136649a() {
        if (f111678a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f111678a = Looper.myQueue();
            } else if (VERSION.SDK_INT >= 23) {
                f111678a = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f111678a = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable unused) {
                }
            }
        }
        return f111678a;
    }

    /* renamed from: b */
    public static void m136653b(Activity activity) {
        if (f111683f && !activity.isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            m136651a(activity);
        }
    }

    /* renamed from: a */
    private static IBinder m136647a(Message message) {
        if (VERSION.SDK_INT >= 24) {
            try {
                if (f111680c == null) {
                    f111680c = Class.forName("com.android.internal.os.SomeArgs").getDeclaredField("arg1");
                }
                return (IBinder) f111680c.get(message.obj);
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
    private static Message m136652b(Message message) {
        if (f111682e == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f111682e = declaredField;
                declaredField.setAccessible(true);
                return (Message) f111682e.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) f111682e.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: c */
    private static IBinder m136654c(Activity activity) {
        if (f111679b == null) {
            try {
                Field declaredField = Class.forName("android.app.Activity").getDeclaredField("mToken");
                f111679b = declaredField;
                declaredField.setAccessible(true);
                return (IBinder) f111679b.get(activity);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (IBinder) f111679b.get(activity);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Message m136648a(MessageQueue messageQueue) {
        if (f111681d == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f111681d = declaredField;
                declaredField.setAccessible(true);
                return (Message) f111681d.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) f111681d.get(messageQueue);
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
    private static java.util.List<android.os.Message> m136650a(int r5) {
        /*
            android.os.MessageQueue r5 = m136649a()
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            monitor-enter(r5)
            android.os.Message r3 = m136648a(r5)     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0017
            monitor-exit(r5)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0017:
            if (r3 == 0) goto L_0x0028
            int r0 = r2 + 1
            r4 = 100
            if (r2 >= r4) goto L_0x0028
            r1.add(r3)     // Catch:{ all -> 0x002a }
            android.os.Message r3 = m136652b(r3)     // Catch:{ all -> 0x002a }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C43073dv.m136650a(int):java.util.List");
    }

    /* renamed from: a */
    public static void m136651a(Activity activity) {
        if (f111684g && activity != null && !activity.isFinishing() && VERSION.SDK_INT < 28 && VERSION.SDK_INT > 18) {
            long uptimeMillis = SystemClock.uptimeMillis();
            List<Message> a = m136650a(100);
            if (a != null) {
                for (Message message : a) {
                    if (message.what == 109 && message.getWhen() - uptimeMillis < -9000 && m136647a(message) != null && m136647a(message) == m136654c(activity)) {
                        activity.finish();
                        return;
                    }
                }
            }
        }
    }
}
