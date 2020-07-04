package android.arch.lifecycle;

import android.arch.p005a.p006a.C0002a;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.lifecycle.b */
public abstract class C0031b<T> {

    /* renamed from: a */
    public final Executor f61a;

    /* renamed from: b */
    public final LiveData<T> f62b;

    /* renamed from: c */
    public AtomicBoolean f63c = new AtomicBoolean(true);

    /* renamed from: d */
    public AtomicBoolean f64d = new AtomicBoolean(false);

    /* renamed from: e */
    final Runnable f65e = new Runnable() {
        public final void run() {
            boolean z;
            do {
                if (C0031b.this.f64d.compareAndSet(false, true)) {
                    Object obj = null;
                    z = false;
                    while (C0031b.this.f63c.compareAndSet(true, false)) {
                        try {
                            obj = C0031b.this.mo102b();
                            z = true;
                        } finally {
                            C0031b.this.f64d.set(false);
                        }
                    }
                    if (z) {
                        C0031b.this.f62b.postValue(obj);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (C0031b.this.f63c.get());
        }
    };

    /* renamed from: f */
    final Runnable f66f = new Runnable() {
        public final void run() {
            boolean hasActiveObservers = C0031b.this.f62b.hasActiveObservers();
            if (C0031b.this.f63c.compareAndSet(false, true) && hasActiveObservers) {
                C0031b.this.f61a.execute(C0031b.this.f65e);
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo102b();

    /* renamed from: a */
    public final void mo101a() {
        C0002a.m4a().mo20c(this.f66f);
    }

    public C0031b(Executor executor) {
        this.f61a = executor;
        this.f62b = new LiveData<T>() {
            /* access modifiers changed from: protected */
            public final void onActive() {
                C0031b.this.f61a.execute(C0031b.this.f65e);
            }
        };
    }
}
