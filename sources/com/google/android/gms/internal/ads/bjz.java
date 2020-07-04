package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;

final class bjz extends Handler implements Runnable {

    /* renamed from: a */
    private final bka f42367a;

    /* renamed from: b */
    private final bjx f42368b;

    /* renamed from: c */
    private final int f42369c;

    /* renamed from: d */
    private volatile Thread f42370d;

    /* renamed from: e */
    private final /* synthetic */ bjw f42371e;

    public bjz(bjw bjw, Looper looper, bka bka, bjx bjx, int i) {
        this.f42371e = bjw;
        super(looper);
        this.f42367a = bka;
        this.f42368b = bjx;
    }

    /* renamed from: a */
    public final void mo40803a() {
        this.f42367a.mo40754a();
        if (this.f42370d != null) {
            this.f42370d.interrupt();
        }
    }

    public final void run() {
        try {
            this.f42370d = Thread.currentThread();
            if (this.f42369c > 0) {
                Thread.sleep((long) this.f42369c);
            }
            if (!this.f42367a.mo40755b()) {
                this.f42367a.mo40756c();
            }
            sendEmptyMessage(0);
        } catch (IOException e) {
            obtainMessage(1, e).sendToTarget();
        } catch (InterruptedException unused) {
            bke.m49060b(this.f42367a.mo40755b());
            sendEmptyMessage(0);
        } catch (Exception e2) {
            obtainMessage(1, new zzkc(e2)).sendToTarget();
        } catch (Error e3) {
            obtainMessage(2, e3).sendToTarget();
            throw e3;
        }
    }

    public final void handleMessage(Message message) {
        if (message.what != 2) {
            this.f42371e.f42361a = false;
            this.f42371e.f42363c = null;
            if (this.f42367a.mo40755b()) {
                this.f42368b.mo40753b(this.f42367a);
                return;
            }
            switch (message.what) {
                case 0:
                    this.f42368b.mo40751a(this.f42367a);
                    return;
                case 1:
                    this.f42368b.mo40752a(this.f42367a, (IOException) message.obj);
                    break;
            }
            return;
        }
        throw ((Error) message.obj);
    }
}
