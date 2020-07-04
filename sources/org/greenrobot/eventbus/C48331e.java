package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: org.greenrobot.eventbus.e */
public final class C48331e extends Handler implements C48340k {

    /* renamed from: a */
    private final C48339j f123404a = new C48339j();

    /* renamed from: b */
    private final int f123405b = 10;

    /* renamed from: c */
    private final C7705c f123406c;

    /* renamed from: d */
    private boolean f123407d;

    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C48338i a = this.f123404a.mo121777a();
                if (a == null) {
                    synchronized (this) {
                        a = this.f123404a.mo121777a();
                        if (a == null) {
                            this.f123407d = false;
                            this.f123407d = false;
                            return;
                        }
                    }
                }
                this.f123406c.mo20390a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f123405b));
            if (sendMessage(obtainMessage())) {
                this.f123407d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f123407d = false;
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo121760a(C48345p pVar, Object obj) {
        C48338i a = C48338i.m149920a(pVar, obj);
        synchronized (this) {
            this.f123404a.mo121779a(a);
            if (!this.f123407d) {
                this.f123407d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    protected C48331e(C7705c cVar, Looper looper, int i) {
        super(looper);
        this.f123406c = cVar;
    }
}
