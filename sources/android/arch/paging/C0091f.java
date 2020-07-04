package android.arch.paging;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.arch.paging.f */
public abstract class C0091f<Key, Value> extends C0078b<Key, Value> {

    /* renamed from: a */
    private final Object f176a = new Object();

    /* renamed from: b */
    private Key f177b = null;

    /* renamed from: c */
    private Key f178c = null;

    /* renamed from: android.arch.paging.f$a */
    public static abstract class C0092a<Key, Value> {
        /* renamed from: a */
        public abstract void mo199a(List<Value> list, Key key);
    }

    /* renamed from: android.arch.paging.f$b */
    static class C0093b<Key, Value> extends C0092a<Key, Value> {

        /* renamed from: a */
        final C0086c<Value> f179a;

        /* renamed from: b */
        private final C0091f<Key, Value> f180b;

        /* renamed from: a */
        public final void mo199a(List<Value> list, Key key) {
            if (!this.f179a.mo190a()) {
                if (this.f179a.f153a == 1) {
                    this.f180b.mo198b(key);
                } else {
                    this.f180b.mo196a(key);
                }
                this.f179a.mo188a(new C0098g<>(list, 0, 0, 0));
            }
        }

        C0093b(C0091f<Key, Value> fVar, int i, Executor executor, C0099a<Value> aVar) {
            this.f179a = new C0086c<>(fVar, i, executor, aVar);
            this.f180b = fVar;
        }
    }

    /* renamed from: android.arch.paging.f$c */
    public static abstract class C0094c<Key, Value> {
        /* renamed from: a */
        public abstract void mo200a(List<Value> list, Key key, Key key2);
    }

    /* renamed from: android.arch.paging.f$d */
    static class C0095d<Key, Value> extends C0094c<Key, Value> {

        /* renamed from: a */
        final C0086c<Value> f181a;

        /* renamed from: b */
        private final C0091f<Key, Value> f182b;

        /* renamed from: c */
        private final boolean f183c;

        C0095d(C0091f<Key, Value> fVar, boolean z, C0099a<Value> aVar) {
            this.f181a = new C0086c<>(fVar, 0, null, aVar);
            this.f182b = fVar;
            this.f183c = z;
        }

        /* renamed from: a */
        public final void mo200a(List<Value> list, Key key, Key key2) {
            if (!this.f181a.mo190a()) {
                this.f182b.mo197a(null, key2);
                this.f181a.mo188a(new C0098g<>(list, 0, 0, 0));
            }
        }
    }

    /* renamed from: android.arch.paging.f$e */
    public static class C0096e<Key> {

        /* renamed from: a */
        public final int f184a;

        /* renamed from: b */
        public final boolean f185b;

        public C0096e(int i, boolean z) {
            this.f184a = i;
            this.f185b = z;
        }
    }

    /* renamed from: android.arch.paging.f$f */
    public static class C0097f<Key> {

        /* renamed from: a */
        public final Key f186a;

        /* renamed from: b */
        public final int f187b;

        public C0097f(Key key, int i) {
            this.f186a = key;
            this.f187b = i;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Key mo164a(int i, Value value) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo194a(C0096e<Key> eVar, C0094c<Key, Value> cVar);

    /* renamed from: a */
    public abstract void mo195a(C0097f<Key> fVar, C0092a<Key, Value> aVar);

    /* renamed from: d */
    private Key m207d() {
        Key key;
        synchronized (this.f176a) {
            key = this.f178c;
        }
        return key;
    }

    /* renamed from: e */
    private Key m208e() {
        Key key;
        synchronized (this.f176a) {
            key = this.f177b;
        }
        return key;
    }

    /* renamed from: b */
    public final void mo198b(Key key) {
        synchronized (this.f176a) {
            this.f177b = key;
        }
    }

    /* renamed from: a */
    public final void mo196a(Key key) {
        synchronized (this.f176a) {
            this.f178c = key;
        }
    }

    /* renamed from: a */
    public final void mo197a(Key key, Key key2) {
        synchronized (this.f176a) {
            this.f178c = key;
            this.f177b = key2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo165a(int i, Value value, int i2, Executor executor, C0099a<Value> aVar) {
        Object e = m208e();
        if (e != null) {
            mo195a(new C0097f<>(e, i2), (C0092a<Key, Value>) new C0093b<Key,Value>(this, 1, executor, aVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo168b(int i, Value value, int i2, Executor executor, C0099a<Value> aVar) {
        Object d = m207d();
        if (d != null) {
            new C0097f(d, i2);
            new C0093b(this, 2, executor, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo166a(Key key, int i, int i2, boolean z, Executor executor, C0099a<Value> aVar) {
        C0095d dVar = new C0095d(this, z, aVar);
        mo194a(new C0096e<>(i, z), (C0094c<Key, Value>) dVar);
        dVar.f181a.mo189a(executor);
    }
}
