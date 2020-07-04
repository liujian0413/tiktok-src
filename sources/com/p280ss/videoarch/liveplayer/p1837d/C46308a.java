package com.p280ss.videoarch.liveplayer.p1837d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.p280ss.videoarch.liveplayer.log.C46334a;
import com.p280ss.videoarch.liveplayer.log.LiveError;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.videoarch.liveplayer.d.a */
public final class C46308a {

    /* renamed from: f */
    private static final SparseIntArray f118971f = new SparseIntArray();

    /* renamed from: g */
    private static final SparseArray<String> f118972g = new SparseArray<>();

    /* renamed from: h */
    private static final SparseArray<String> f118973h = new SparseArray<>();

    /* renamed from: i */
    private static final SparseArray<String> f118974i = new SparseArray<>();

    /* renamed from: a */
    public final C46310a f118975a;

    /* renamed from: b */
    public final long f118976b;

    /* renamed from: c */
    public long f118977c;

    /* renamed from: d */
    public String f118978d = null;

    /* renamed from: e */
    public final Handler f118979e = new Handler(Looper.myLooper()) {
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 10001:
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - C46308a.this.f118977c < C46308a.this.f118976b) {
                        C46308a.this.f118975a.mo115069a(false);
                        C46308a.this.f118979e.sendEmptyMessageDelayed(10001, 10000);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("stallTime", Long.valueOf(currentTimeMillis - C46308a.this.f118977c));
                    C46308a.this.mo115060a(-1, new LiveError(-107, "Stall retry timeout", hashMap));
                    return;
                case 10002:
                    C46308a.this.mo115060a(2, null);
                    break;
            }
        }
    };

    /* renamed from: j */
    private long f118980j = 10000;

    /* renamed from: k */
    private AtomicInteger f118981k = new AtomicInteger(0);

    /* renamed from: l */
    private int f118982l = 7;

    /* renamed from: m */
    private boolean f118983m = false;

    /* renamed from: n */
    private long f118984n = 0;

    /* renamed from: o */
    private boolean f118985o = false;

    /* renamed from: p */
    private boolean f118986p = false;

    /* renamed from: q */
    private C46334a f118987q;

    /* renamed from: com.ss.videoarch.liveplayer.d.a$a */
    public interface C46310a {
        /* renamed from: a */
        void mo115067a();

        /* renamed from: a */
        void mo115068a(LiveError liveError);

        /* renamed from: a */
        void mo115069a(boolean z);

        /* renamed from: b */
        void mo115070b();
    }

    /* renamed from: b */
    public final void mo115063b() {
        this.f118986p = true;
    }

    /* renamed from: c */
    public final void mo115064c() {
        this.f118986p = false;
    }

    /* renamed from: a */
    public final int mo115059a() {
        return this.f118981k.get();
    }

    /* renamed from: d */
    public final void mo115065d() {
        this.f118981k.set(0);
        this.f118977c = 0;
        this.f118982l = 7;
        this.f118983m = false;
        this.f118984n = 0;
        this.f118985o = false;
        this.f118979e.removeCallbacksAndMessages(null);
    }

    static {
        f118971f.put(-105, 0);
        f118971f.put(-100, 0);
        f118971f.put(-102, 3);
        f118971f.put(-106, 3);
        f118971f.put(-107, 3);
        f118971f.put(-104, 0);
        f118971f.put(-108, 3);
        f118971f.put(-109, 3);
        f118971f.put(-113, 3);
        f118971f.put(-114, 3);
        f118972g.put(-499988, "media player: setting uri is null error");
        f118972g.put(-499987, "media player: setting uri is error");
        f118972g.put(-499986, "media player: url is not mp4 error");
        f118972g.put(-499985, "media player: invalid data error");
        f118972g.put(-499899, "media player: http bad request error");
        f118972g.put(-499898, "media player: http unauthorized error");
        f118972g.put(-499897, "media player: http forbidden error");
        f118972g.put(-499896, "media player: http not found error");
        f118972g.put(-499894, "media player: http other 4xx error");
        f118972g.put(-499893, "media player: http server error");
        f118972g.put(-499891, "media player: http content type invalid");
        f118972g.put(251658241, "media info http redirect");
        f118972g.put(-499799, "media player: tcp failed to resolve hostname");
        f118972g.put(-499795, "media player: tcp send data failed");
        f118972g.put(-499794, "media player: tcp receive data failed");
        f118972g.put(-499793, "media player: tcp read network timeout");
        f118972g.put(-499792, "media player: tcp write network timeout");
        f118973h.put(-499999, "media player setting is null");
        f118973h.put(-499997, "media player start decoder error");
        f118973h.put(-499996, "media player open decoder error");
        f118973h.put(-499992, "media player open outlet error");
        f118973h.put(-499991, "media player start outputer error");
        f118973h.put(-499990, "media player start outlet error");
        f118973h.put(-499989, "media player open device error");
        f118973h.put(1, "android media player unknown");
        f118974i.put(-1, "not retry, report to application");
        f118974i.put(1, "try next url from live info");
        f118974i.put(2, "reset player");
        f118974i.put(0, "try to send live info api request again");
    }

    /* renamed from: b */
    private void m145356b(LiveError liveError) {
        int i = this.f118982l - 1;
        this.f118982l = i;
        if (i >= 0) {
            this.f118987q.mo115132a(liveError.code, liveError.getInfoJSON());
        }
    }

    /* renamed from: a */
    private void m145355a(int i) {
        if (!this.f118983m || (this.f118983m && System.currentTimeMillis() - this.f118984n >= 1000)) {
            this.f118987q.mo115142b(i);
            this.f118987q.mo115130a(i);
            this.f118983m = true;
            this.f118984n = System.currentTimeMillis();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115061a(com.p280ss.videoarch.liveplayer.log.LiveError r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onError error="
            r0.<init>(r1)
            r0.append(r7)
            boolean r0 = r6.f118986p
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            boolean r0 = r6.f118985o
            r1 = -116(0xffffffffffffff8c, float:NaN)
            if (r0 == 0) goto L_0x001a
            int r0 = r7.code
            if (r0 != r1) goto L_0x001a
            return
        L_0x001a:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f118981k
            r0.incrementAndGet()
            int r0 = r7.code
            r2 = 1
            if (r0 == r1) goto L_0x0026
            r6.f118985o = r2
        L_0x0026:
            java.util.Map r0 = r7.info
            java.util.concurrent.atomic.AtomicInteger r1 = r6.f118981k
            int r1 = r1.get()
            r3 = 700(0x2bc, float:9.81E-43)
            r4 = 3
            if (r1 <= r3) goto L_0x0035
            r2 = -1
            goto L_0x0068
        L_0x0035:
            int r1 = r7.code
            r3 = -103(0xffffffffffffff99, float:NaN)
            if (r1 != r3) goto L_0x0067
            r1 = 0
            java.lang.String r3 = "internalCode"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ NumberFormatException -> 0x004b }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ NumberFormatException -> 0x004b }
            int r3 = r3.intValue()     // Catch:{ NumberFormatException -> 0x004b }
            r7.code = r3     // Catch:{ NumberFormatException -> 0x004c }
            goto L_0x0053
        L_0x004b:
            r3 = 0
        L_0x004c:
            java.lang.String r1 = "retryError"
            java.lang.String r5 = "error while get player internal error code"
            r0.put(r1, r5)
        L_0x0053:
            android.util.SparseArray<java.lang.String> r1 = f118972g
            int r1 = r1.indexOfKey(r3)
            if (r1 < 0) goto L_0x0067
            java.lang.String r1 = "playErrorReason"
            android.util.SparseArray<java.lang.String> r5 = f118972g
            java.lang.Object r3 = r5.get(r3)
            r0.put(r1, r3)
            goto L_0x0068
        L_0x0067:
            r2 = 3
        L_0x0068:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f118981k
            int r0 = r0.get()
            if (r0 <= r4) goto L_0x007d
            java.lang.String r0 = r6.f118978d
            if (r0 == 0) goto L_0x007d
            com.ss.videoarch.liveplayer.b.b r0 = com.p280ss.videoarch.liveplayer.p1835b.C46291b.m145323a()
            java.lang.String r1 = r6.f118978d
            r0.mo115045b(r1)
        L_0x007d:
            r6.mo115060a(r2, r7)
            r6.m145356b(r7)
            int r7 = r7.code
            r6.m145355a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.videoarch.liveplayer.p1837d.C46308a.mo115061a(com.ss.videoarch.liveplayer.log.LiveError):void");
    }

    /* renamed from: a */
    public final void mo115062a(boolean z) {
        new StringBuilder("onStall ").append(z);
        if (z) {
            this.f118977c = System.currentTimeMillis();
            if (!this.f118979e.hasMessages(10001)) {
                this.f118979e.sendEmptyMessageDelayed(10001, 10000);
            }
            m145355a(-115);
            return;
        }
        mo115065d();
    }

    /* renamed from: a */
    public final void mo115060a(int i, LiveError liveError) {
        long j;
        new StringBuilder("handleRetryForError action=").append(i);
        switch (i) {
            case -1:
                this.f118975a.mo115068a(liveError);
                return;
            case 0:
                this.f118975a.mo115067a();
                return;
            case 1:
                this.f118975a.mo115070b();
                return;
            case 2:
                this.f118975a.mo115069a(false);
                return;
            case 3:
                if (!this.f118979e.hasMessages(10002)) {
                    new StringBuilder("start ").append(this.f118981k);
                    Handler handler = this.f118979e;
                    if (this.f118981k.get() > 3) {
                        j = 10000;
                    } else {
                        j = (long) (this.f118981k.get() * this.f118981k.get() * 1000);
                    }
                    handler.sendEmptyMessageDelayed(10002, j);
                    break;
                }
                break;
        }
    }

    public C46308a(C46310a aVar, int i, long j, C46334a aVar2) {
        this.f118975a = aVar;
        this.f118976b = (long) (i * 1000);
        this.f118980j = j;
        this.f118981k.set(0);
        this.f118987q = aVar2;
    }
}
