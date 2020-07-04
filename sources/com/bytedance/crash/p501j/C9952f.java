package com.bytedance.crash.p501j;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Printer;
import android.util.SparseArray;
import com.bytedance.crash.p491b.C9862e;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.crash.j.f */
public class C9952f implements Callback {

    /* renamed from: a */
    public static Printer f27158a;

    /* renamed from: b */
    public static final Printer f27159b = new Printer() {
        public final void println(String str) {
            if (str != null) {
                if (str.charAt(0) == '>') {
                    C9952f.m29447a().mo24575a(str);
                } else if (str.charAt(0) == '<') {
                    C9952f.m29447a().mo24578b(str);
                }
                if (!(C9952f.f27158a == null || C9952f.f27158a == C9952f.f27159b)) {
                    C9952f.f27158a.println(str);
                }
            }
        }
    };

    /* renamed from: d */
    private static C9952f f27160d;

    /* renamed from: c */
    public boolean f27161c = false;

    /* renamed from: e */
    private Handler f27162e = new Handler(C9954g.m29459a().getLooper(), this);

    /* renamed from: f */
    private int f27163f;

    /* renamed from: g */
    private long f27164g = -1;

    /* renamed from: h */
    private long f27165h = -1;

    /* renamed from: i */
    private final SparseArray<List<Runnable>> f27166i = new SparseArray<>();

    /* renamed from: j */
    private final List<Printer> f27167j = new ArrayList();

    /* renamed from: k */
    private final List<Printer> f27168k = new ArrayList();

    /* renamed from: a */
    public static C9952f m29447a() {
        if (f27160d == null) {
            synchronized (C9952f.class) {
                if (f27160d == null) {
                    f27160d = new C9952f();
                }
            }
        }
        return f27160d;
    }

    /* renamed from: d */
    private static Printer m29451d() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo24576b() {
        if (!this.f27161c) {
            this.f27161c = true;
            Printer d = m29451d();
            f27158a = d;
            if (d == f27159b) {
                f27158a = null;
            }
            Looper.getMainLooper().setMessageLogging(f27159b);
        }
    }

    /* renamed from: c */
    public final boolean mo24579c() {
        if (this.f27165h == -1 || SystemClock.uptimeMillis() - this.f27165h <= DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
            return false;
        }
        return true;
    }

    private C9952f() {
        mo24576b();
    }

    /* renamed from: a */
    public final void mo24574a(Printer printer) {
        this.f27168k.add(printer);
    }

    /* renamed from: b */
    public final synchronized void mo24577b(Printer printer) {
        this.f27167j.add(printer);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo24578b(String str) {
        this.f27165h = SystemClock.uptimeMillis();
        try {
            this.f27162e.removeMessages(2);
            m29450a(this.f27168k, str);
            this.f27162e.sendEmptyMessage(1);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m29449a(List<? extends Runnable> list) {
        if (list != null && !list.isEmpty()) {
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Runnable) list.get(i)).run();
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean handleMessage(Message message) {
        try {
            if (this.f27162e.hasMessages(0)) {
                return true;
            }
            switch (message.what) {
                case 0:
                    this.f27163f = 0;
                    if (this.f27166i.size() != 0 && this.f27166i.keyAt(0) == 0) {
                        m29449a((List) this.f27166i.valueAt(0));
                        this.f27163f++;
                        break;
                    }
                case 1:
                    this.f27162e.removeMessages(2);
                    if (this.f27166i.size() != 0 && this.f27166i.keyAt(this.f27166i.size() - 1) == 0) {
                        m29449a((List) this.f27166i.get(Integer.MAX_VALUE));
                    }
                    return true;
                case 2:
                    m29449a((List) this.f27166i.valueAt(this.f27163f));
                    this.f27163f++;
                    break;
            }
            if (this.f27163f >= this.f27166i.size()) {
                return true;
            }
            long keyAt = (long) this.f27166i.keyAt(this.f27163f);
            if (keyAt != 2147483647L) {
                this.f27162e.sendEmptyMessageAtTime(2, this.f27164g + keyAt);
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24575a(String str) {
        C9862e.m29105a(false);
        this.f27164g = SystemClock.uptimeMillis();
        this.f27165h = -1;
        try {
            m29450a(this.f27167j, str);
            this.f27162e.sendEmptyMessage(0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo24573a(long j, Runnable runnable) {
        m29448a(DouPlusShareGuideExperiment.MIN_VALID_DURATION, runnable, 1, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m29450a(java.util.List<? extends android.util.Printer> r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0024
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x000a
            goto L_0x0024
        L_0x000a:
            int r0 = r4.size()     // Catch:{ Exception -> 0x001f }
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x001d
            java.lang.Object r2 = r4.get(r1)     // Catch:{ Exception -> 0x001f }
            android.util.Printer r2 = (android.util.Printer) r2     // Catch:{ Exception -> 0x001f }
            r2.println(r5)     // Catch:{ Exception -> 0x001f }
            int r1 = r1 + 1
            goto L_0x000f
        L_0x001d:
            monitor-exit(r3)
            return
        L_0x001f:
            monitor-exit(r3)
            return
        L_0x0021:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0024:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p501j.C9952f.m29450a(java.util.List, java.lang.String):void");
    }

    /* renamed from: a */
    private void m29448a(long j, Runnable runnable, int i, long j2) {
        if (j >= 0) {
            for (int i2 = 0; i2 <= 0; i2++) {
                int i3 = (int) j;
                List list = (List) this.f27166i.get(i3);
                if (list == null) {
                    synchronized (this.f27166i) {
                        list = (List) this.f27166i.get(i3);
                        if (list == null) {
                            list = new ArrayList();
                            this.f27166i.put(i3, list);
                        }
                    }
                }
                list.add(runnable);
            }
        }
    }
}
