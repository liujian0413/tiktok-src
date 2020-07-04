package com.p280ss.android.ugc.aweme.p339sp;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.sp.c */
public class C7228c {

    /* renamed from: a */
    private static final String f20206a = "c";

    /* renamed from: b */
    private static final Object f20207b = new Object();

    /* renamed from: c */
    private static Object f20208c = new Object();

    /* renamed from: d */
    private static final LinkedList<Runnable> f20209d = new LinkedList<>();

    /* renamed from: e */
    private static Handler f20210e = null;

    /* renamed from: f */
    private static final LinkedList<Runnable> f20211f = new LinkedList<>();

    /* renamed from: g */
    private static boolean f20212g = true;

    /* renamed from: h */
    private static final C7226a f20213h = new C7226a(16);

    /* renamed from: i */
    private static int f20214i = 0;

    /* renamed from: com.ss.android.ugc.aweme.sp.c$a */
    static class C7229a extends Handler {
        C7229a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                C7228c.m22661b();
            }
        }
    }

    /* renamed from: a */
    public static boolean m22660a() {
        boolean z;
        synchronized (f20207b) {
            z = !f20211f.isEmpty();
        }
        return z;
    }

    /* renamed from: b */
    public static void m22661b() {
        LinkedList linkedList;
        synchronized (f20208c) {
            synchronized (f20207b) {
                linkedList = (LinkedList) f20211f.clone();
                f20211f.clear();
                m22663c().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    /* renamed from: c */
    private static Handler m22663c() {
        Handler handler;
        synchronized (f20207b) {
            if (f20210e == null) {
                HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                handlerThread.start();
                f20210e = new C7229a(handlerThread.getLooper());
            }
            handler = f20210e;
        }
        return handler;
    }

    /* renamed from: a */
    public static void m22658a(Runnable runnable) {
        synchronized (f20207b) {
            f20209d.add(runnable);
        }
    }

    /* renamed from: b */
    public static void m22662b(Runnable runnable) {
        synchronized (f20207b) {
            f20209d.remove(runnable);
        }
    }

    /* renamed from: a */
    public static void m22659a(Runnable runnable, boolean z) {
        Handler c = m22663c();
        synchronized (f20207b) {
            f20211f.add(runnable);
            if (!z || !f20212g) {
                c.sendEmptyMessage(1);
            } else {
                c.sendEmptyMessageDelayed(1, 100);
            }
        }
    }
}
