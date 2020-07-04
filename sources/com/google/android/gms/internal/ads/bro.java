package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.brp;
import java.io.IOException;

final class bro<T extends brp> extends Handler implements Runnable {

    /* renamed from: a */
    public final int f43355a;

    /* renamed from: b */
    private final T f43356b;

    /* renamed from: c */
    private final brn<T> f43357c;

    /* renamed from: d */
    private final long f43358d;

    /* renamed from: e */
    private IOException f43359e;

    /* renamed from: f */
    private int f43360f;

    /* renamed from: g */
    private volatile Thread f43361g;

    /* renamed from: h */
    private volatile boolean f43362h;

    /* renamed from: i */
    private final /* synthetic */ brm f43363i;

    public bro(brm brm, Looper looper, T t, brn<T> brn, int i, long j) {
        this.f43363i = brm;
        super(looper);
        this.f43356b = t;
        this.f43357c = brn;
        this.f43355a = i;
        this.f43358d = j;
    }

    /* renamed from: a */
    public final void mo41206a(long j) {
        brr.m49873b(this.f43363i.f43353b == null);
        this.f43363i.f43353b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m49859a();
        }
    }

    /* renamed from: a */
    public final void mo41207a(boolean z) {
        this.f43362h = z;
        this.f43359e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f43356b.mo41105a();
            if (this.f43361g != null) {
                this.f43361g.interrupt();
            }
        }
        if (z) {
            m49860b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f43357c.mo41093a(this.f43356b, elapsedRealtime, elapsedRealtime - this.f43358d, true);
        }
    }

    public final void run() {
        try {
            this.f43361g = Thread.currentThread();
            if (!this.f43356b.mo41107b()) {
                String str = "load:";
                String valueOf = String.valueOf(this.f43356b.getClass().getSimpleName());
                bse.m49930a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                this.f43356b.mo41108c();
                bse.m49929a();
            }
            if (!this.f43362h) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f43362h) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            brr.m49873b(this.f43356b.mo41107b());
            if (!this.f43362h) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            if (!this.f43362h) {
                obtainMessage(3, new zzsh(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.f43362h) {
                obtainMessage(3, new zzsh(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.f43362h) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            bse.m49929a();
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        int i;
        if (!this.f43362h) {
            if (message.what == 0) {
                m49859a();
            } else if (message.what != 4) {
                m49860b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f43358d;
                if (this.f43356b.mo41107b()) {
                    this.f43357c.mo41093a(this.f43356b, elapsedRealtime, j, false);
                    return;
                }
                switch (message.what) {
                    case 1:
                        this.f43357c.mo41093a(this.f43356b, elapsedRealtime, j, false);
                        return;
                    case 2:
                        this.f43357c.mo41092a(this.f43356b, elapsedRealtime, j);
                        return;
                    case 3:
                        this.f43359e = (IOException) message.obj;
                        int a = this.f43357c.mo41088a(this.f43356b, elapsedRealtime, j, this.f43359e);
                        if (a != 3) {
                            if (a != 2) {
                                if (a == 1) {
                                    i = 1;
                                } else {
                                    i = this.f43360f + 1;
                                }
                                this.f43360f = i;
                                mo41206a((long) Math.min((this.f43360f - 1) * 1000, 5000));
                                break;
                            }
                        } else {
                            this.f43363i.f43354c = this.f43359e;
                            return;
                        }
                        break;
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    /* renamed from: a */
    private final void m49859a() {
        this.f43359e = null;
        this.f43363i.f43352a.execute(this.f43363i.f43353b);
    }

    /* renamed from: b */
    private final void m49860b() {
        this.f43363i.f43353b = null;
    }
}
