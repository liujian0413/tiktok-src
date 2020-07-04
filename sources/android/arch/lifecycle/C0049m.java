package android.arch.lifecycle;

import android.arch.p005a.p007b.C0009b;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.m */
public class C0049m<T> extends C0052o<T> {

    /* renamed from: a */
    private C0009b<LiveData<?>, C0050a<?>> f89a = new C0009b<>();

    /* renamed from: android.arch.lifecycle.m$a */
    static class C0050a<V> implements C0053p<V> {

        /* renamed from: a */
        final LiveData<V> f90a;

        /* renamed from: b */
        final C0053p<V> f91b;

        /* renamed from: c */
        int f92c = -1;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo121a() {
            this.f90a.observeForever(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo122b() {
            this.f90a.removeObserver(this);
        }

        public final void onChanged(V v) {
            if (this.f92c != this.f90a.mVersion) {
                this.f92c = this.f90a.mVersion;
                this.f91b.onChanged(v);
            }
        }

        C0050a(LiveData<V> liveData, C0053p<V> pVar) {
            this.f90a = liveData;
            this.f91b = pVar;
        }
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        Iterator it = this.f89a.iterator();
        while (it.hasNext()) {
            ((C0050a) ((Entry) it.next()).getValue()).mo121a();
        }
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
        Iterator it = this.f89a.iterator();
        while (it.hasNext()) {
            ((C0050a) ((Entry) it.next()).getValue()).mo122b();
        }
    }

    /* renamed from: a */
    public final <S> void mo120a(LiveData<S> liveData, C0053p<S> pVar) {
        C0050a aVar = new C0050a(liveData, pVar);
        C0050a aVar2 = (C0050a) this.f89a.mo22a(liveData, aVar);
        if (aVar2 == null || aVar2.f91b == pVar) {
            if (aVar2 == null && hasActiveObservers()) {
                aVar.mo121a();
            }
            return;
        }
        throw new IllegalArgumentException("This source was already added with the different observer");
    }
}
