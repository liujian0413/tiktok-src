package p346io.reactivex.p1865a;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.a.a */
public abstract class C47546a implements C7321c {

    /* renamed from: a */
    private final AtomicBoolean f121998a = new AtomicBoolean();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10168a();

    public final boolean isDisposed() {
        return this.f121998a.get();
    }

    public final void dispose() {
        if (this.f121998a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo10168a();
                return;
            }
            C47549a.m148327a().mo19335a(new Runnable() {
                public final void run() {
                    C47546a.this.mo10168a();
                }
            });
        }
    }
}
