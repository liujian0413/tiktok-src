package com.facebook.common.p685b;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.common.b.h */
public abstract class C13284h<T> implements Runnable {

    /* renamed from: a */
    protected final AtomicInteger f35179a = new AtomicInteger(0);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32533a(Exception exc) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32534a(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32535b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo32536b(T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo32537c() throws Exception;

    /* renamed from: a */
    public final void mo32532a() {
        if (this.f35179a.compareAndSet(0, 2)) {
            mo32535b();
        }
    }

    public final void run() {
        if (this.f35179a.compareAndSet(0, 1)) {
            try {
                Object c = mo32537c();
                this.f35179a.set(3);
                try {
                    mo32534a((T) c);
                } finally {
                    mo32536b(c);
                }
            } catch (Exception e) {
                this.f35179a.set(4);
                mo32533a(e);
            }
        }
    }
}
