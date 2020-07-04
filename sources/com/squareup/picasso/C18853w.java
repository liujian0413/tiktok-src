package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.squareup.picasso.w */
final class C18853w {

    /* renamed from: a */
    final HandlerThread f50842a = new HandlerThread("Picasso-Stats", 10);

    /* renamed from: b */
    final C18822d f50843b;

    /* renamed from: c */
    final Handler f50844c;

    /* renamed from: d */
    long f50845d;

    /* renamed from: e */
    long f50846e;

    /* renamed from: f */
    long f50847f;

    /* renamed from: g */
    long f50848g;

    /* renamed from: h */
    long f50849h;

    /* renamed from: i */
    long f50850i;

    /* renamed from: j */
    long f50851j;

    /* renamed from: k */
    long f50852k;

    /* renamed from: l */
    int f50853l;

    /* renamed from: m */
    int f50854m;

    /* renamed from: n */
    int f50855n;

    /* renamed from: com.squareup.picasso.w$a */
    static class C18854a extends Handler {

        /* renamed from: a */
        private final C18853w f50856a;

        public final void handleMessage(final Message message) {
            switch (message.what) {
                case 0:
                    this.f50856a.mo50107c();
                    return;
                case 1:
                    this.f50856a.mo50109d();
                    return;
                case 2:
                    this.f50856a.mo50105b((long) message.arg1);
                    return;
                case 3:
                    this.f50856a.mo50108c((long) message.arg1);
                    return;
                case 4:
                    this.f50856a.mo50103a((Long) message.obj);
                    return;
                default:
                    Picasso.f50650a.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Unhandled stats message.");
                            sb.append(message.what);
                            throw new AssertionError(sb.toString());
                        }
                    });
                    return;
            }
        }

        public C18854a(Looper looper, C18853w wVar) {
            super(looper);
            this.f50856a = wVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50100a() {
        this.f50844c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50104b() {
        this.f50844c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo50107c() {
        this.f50845d++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo50109d() {
        this.f50846e++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C18856x mo50110e() {
        C18856x xVar = new C18856x(this.f50843b.mo50022b(), this.f50843b.mo50019a(), this.f50845d, this.f50846e, this.f50847f, this.f50848g, this.f50849h, this.f50850i, this.f50851j, this.f50852k, this.f50853l, this.f50854m, this.f50855n, System.currentTimeMillis());
        return xVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50102a(Bitmap bitmap) {
        m61590a(bitmap, 2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50106b(Bitmap bitmap) {
        m61590a(bitmap, 3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50105b(long j) {
        this.f50854m++;
        this.f50848g += j;
        this.f50851j = m61589a(this.f50854m, this.f50848g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo50108c(long j) {
        this.f50855n++;
        this.f50849h += j;
        this.f50852k = m61589a(this.f50854m, this.f50849h);
    }

    C18853w(C18822d dVar) {
        this.f50843b = dVar;
        this.f50842a.start();
        C18807ad.m61438a(this.f50842a.getLooper());
        this.f50844c = new C18854a(this.f50842a.getLooper(), this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50101a(long j) {
        this.f50844c.sendMessage(this.f50844c.obtainMessage(4, Long.valueOf(j)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50103a(Long l) {
        this.f50853l++;
        this.f50847f += l.longValue();
        this.f50850i = m61589a(this.f50853l, this.f50847f);
    }

    /* renamed from: a */
    private static long m61589a(int i, long j) {
        return j / ((long) i);
    }

    /* renamed from: a */
    private void m61590a(Bitmap bitmap, int i) {
        this.f50844c.sendMessage(this.f50844c.obtainMessage(i, C18807ad.m61427a(bitmap), 0));
    }
}
