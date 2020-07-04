package com.p280ss.android.ugc.networkspeed;

import android.os.SystemClock;
import com.p280ss.android.ugc.networkspeed.IntelligentSpeedAlgorithm.IntelligentSpeedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.networkspeed.d */
public class C44903d {

    /* renamed from: c */
    public static int f115471c = 10;

    /* renamed from: h */
    private static final Lock f115472h = new ReentrantLock();

    /* renamed from: j */
    private static volatile C44903d f115473j;

    /* renamed from: a */
    public double f115474a = -1.0d;

    /* renamed from: b */
    public C44905e f115475b;

    /* renamed from: d */
    public C44904a f115476d = this.f115481k;

    /* renamed from: e */
    private double f115477e = -1.0d;

    /* renamed from: f */
    private Queue<C44905e> f115478f = new ArrayBlockingQueue(f115471c);

    /* renamed from: g */
    private C44905e[] f115479g = new C44905e[f115471c];

    /* renamed from: i */
    private final List<Object> f115480i = new ArrayList();

    /* renamed from: k */
    private C44904a f115481k = new C44900b();

    /* renamed from: com.ss.android.ugc.networkspeed.d$a */
    public interface C44904a {
        /* renamed from: a */
        double mo86732a(Queue<C44905e> queue, C44905e[] eVarArr);

        /* renamed from: b */
        double mo86733b(Queue<C44905e> queue, C44905e[] eVarArr) throws IntelligentSpeedException;
    }

    /* renamed from: a */
    public static C44903d m141655a() {
        if (f115473j == null) {
            synchronized (C44903d.class) {
                if (f115473j == null) {
                    f115473j = new C44903d();
                }
            }
        }
        return f115473j;
    }

    /* renamed from: f */
    public static int m141656f() {
        double b = m141655a().mo107377b();
        if (b == -1.0d) {
            return -1;
        }
        return (int) ((b / 8.0d) / 1000.0d);
    }

    /* renamed from: e */
    public final void mo107380e() {
        this.f115477e = -1.0d;
        synchronized (this.f115480i) {
            Iterator it = this.f115480i.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        f115472h.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r2 = -1.0d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0012 A[ExcHandler: all (r0v6 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double mo107378c() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r0 = f115472h
            r0.lock()
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            com.ss.android.ugc.networkspeed.d$a r2 = r5.f115476d     // Catch:{ Throwable -> 0x0014, all -> 0x0012 }
            java.util.Queue<com.ss.android.ugc.networkspeed.e> r3 = r5.f115478f     // Catch:{ Throwable -> 0x0014, all -> 0x0012 }
            com.ss.android.ugc.networkspeed.e[] r4 = r5.f115479g     // Catch:{ Throwable -> 0x0014, all -> 0x0012 }
            double r2 = r2.mo86733b(r3, r4)     // Catch:{ Throwable -> 0x0014, all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r0 = move-exception
            goto L_0x002b
        L_0x0014:
            r2 = r0
        L_0x0015:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0031
            com.ss.android.ugc.networkspeed.d$a r0 = r5.f115481k     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            com.ss.android.ugc.networkspeed.d$a r1 = r5.f115476d     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            if (r0 == r1) goto L_0x0031
            com.ss.android.ugc.networkspeed.d$a r0 = r5.f115481k     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            java.util.Queue<com.ss.android.ugc.networkspeed.e> r1 = r5.f115478f     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            com.ss.android.ugc.networkspeed.e[] r4 = r5.f115479g     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            double r0 = r0.mo86733b(r1, r4)     // Catch:{ Throwable -> 0x0031, all -> 0x0012 }
            r2 = r0
            goto L_0x0031
        L_0x002b:
            java.util.concurrent.locks.Lock r1 = f115472h
            r1.unlock()
            throw r0
        L_0x0031:
            java.util.concurrent.locks.Lock r0 = f115472h
            r0.unlock()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.networkspeed.C44903d.mo107378c():double");
    }

    /* renamed from: b */
    public final double mo107377b() {
        double d = this.f115477e;
        if (this.f115477e == -1.0d) {
            f115472h.lock();
            try {
                if (this.f115477e == -1.0d) {
                    d = this.f115476d.mo86732a(this.f115478f, this.f115479g);
                    if (d == -1.0d && this.f115481k != this.f115476d) {
                        d = this.f115481k.mo86732a(this.f115478f, this.f115479g);
                    }
                    this.f115477e = d;
                } else {
                    d = this.f115477e;
                }
            } finally {
                f115472h.unlock();
            }
        }
        if (d > 0.001d || this.f115474a <= 0.001d) {
            return d;
        }
        return this.f115474a;
    }

    /* renamed from: d */
    public final C44905e[] mo107379d() {
        f115472h.lock();
        try {
            if (this.f115478f != null) {
                C44905e[] eVarArr = new C44905e[this.f115478f.size()];
                int i = 0;
                for (C44905e eVar : this.f115478f) {
                    int i2 = i + 1;
                    C44905e eVar2 = new C44905e(eVar.f115483b, eVar.f115484c, eVar.f115485d, eVar.f115486e);
                    eVarArr[i] = eVar2;
                    i = i2;
                }
                return eVarArr;
            }
            f115472h.unlock();
            return null;
        } finally {
            f115472h.unlock();
        }
    }

    /* renamed from: a */
    public final void mo107376a(int i) {
        if (i > 0 && i != this.f115478f.size()) {
            f115472h.lock();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
                arrayBlockingQueue.addAll(this.f115478f);
                this.f115479g = new C44905e[i];
                this.f115478f = arrayBlockingQueue;
            } catch (Exception unused) {
            } catch (Throwable th) {
                f115472h.unlock();
                throw th;
            }
            f115472h.unlock();
        }
    }

    /* renamed from: a */
    public final void mo107375a(double d, double d2, long j) {
        C44905e eVar;
        f115472h.lock();
        try {
            if (this.f115475b != null) {
                eVar = this.f115475b;
                eVar.f115483b = d;
                eVar.f115484c = d2;
                eVar.f115485d = j;
                eVar.f115486e = SystemClock.elapsedRealtime();
            } else {
                double d3 = d;
                double d4 = d2;
                long j2 = j;
                eVar = new C44905e(d, d2, j, SystemClock.elapsedRealtime());
            }
            if (!this.f115478f.offer(eVar)) {
                this.f115475b = (C44905e) this.f115478f.poll();
                this.f115478f.offer(eVar);
            }
        } finally {
            mo107380e();
            f115472h.unlock();
        }
    }
}
