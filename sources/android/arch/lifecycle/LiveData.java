package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.p005a.p006a.C0002a;
import android.arch.p005a.p007b.C0009b;
import android.arch.p005a.p007b.C0009b.C0014d;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    public static final Object NOT_SET = new Object();
    public int mActiveCount = 0;
    private volatile Object mData = NOT_SET;
    public final Object mDataLock = new Object();
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C0009b<C0053p<T>, C0026b> mObservers = new C0009b<>();
    public volatile Object mPendingData = NOT_SET;
    private final Runnable mPostValueRunnable = new Runnable() {
        public final void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    };
    public int mVersion = -1;

    class LifecycleBoundObserver extends C0026b implements GenericLifecycleObserver {

        /* renamed from: a */
        final C0043i f44a;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo87b() {
            this.f44a.getLifecycle().mo56b(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo85a() {
            return this.f44a.getLifecycle().mo54a().isAtLeast(State.STARTED);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo86a(C0043i iVar) {
            if (this.f44a == iVar) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo44a(C0043i iVar, Event event) {
            if (this.f44a.getLifecycle().mo54a() == State.DESTROYED) {
                LiveData.this.removeObserver(this.f47c);
            } else {
                mo88a(mo85a());
            }
        }

        LifecycleBoundObserver(C0043i iVar, C0053p<T> pVar) {
            super(pVar);
            this.f44a = iVar;
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    class C0025a extends C0026b {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo85a() {
            return true;
        }

        C0025a(C0053p<T> pVar) {
            super(pVar);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$b */
    abstract class C0026b {

        /* renamed from: c */
        final C0053p<T> f47c;

        /* renamed from: d */
        boolean f48d;

        /* renamed from: e */
        int f49e = -1;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo85a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo86a(C0043i iVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo87b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo88a(boolean z) {
            boolean z2;
            if (z != this.f48d) {
                this.f48d = z;
                int i = 1;
                if (LiveData.this.mActiveCount == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LiveData liveData = LiveData.this;
                int i2 = liveData.mActiveCount;
                if (!this.f48d) {
                    i = -1;
                }
                liveData.mActiveCount = i2 + i;
                if (z2 && this.f48d) {
                    LiveData.this.onActive();
                }
                if (LiveData.this.mActiveCount == 0 && !this.f48d) {
                    LiveData.this.onInactive();
                }
                if (this.f48d) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        C0026b(C0053p<T> pVar) {
            this.f47c = pVar;
        }
    }

    /* access modifiers changed from: protected */
    public void onActive() {
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
    }

    public boolean hasActiveObservers() {
        if (this.mActiveCount > 0) {
            return true;
        }
        return false;
    }

    public T getValue() {
        T t = this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public boolean hasObservers() {
        if (this.mObservers.f16c > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z = true;
            } else {
                z = false;
            }
            this.mPendingData = t;
        }
        if (z) {
            C0002a.m4a().mo16b(this.mPostValueRunnable);
        }
    }

    public void removeObserver(C0053p<T> pVar) {
        assertMainThread("removeObserver");
        C0026b bVar = (C0026b) this.mObservers.mo23b(pVar);
        if (bVar != null) {
            bVar.mo87b();
            bVar.mo88a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue(null);
    }

    private static void assertMainThread(String str) {
        if (!C0002a.m4a().mo17d()) {
            StringBuilder sb = new StringBuilder("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background thread");
            throw new IllegalStateException(sb.toString());
        }
    }

    private void considerNotify(C0026b bVar) {
        if (bVar.f48d) {
            if (!bVar.mo85a()) {
                bVar.mo88a(false);
            } else if (bVar.f49e < this.mVersion) {
                bVar.f49e = this.mVersion;
                bVar.f47c.onChanged(this.mData);
            }
        }
    }

    public void dispatchingValue(C0026b bVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (bVar == null) {
                C0014d b = this.mObservers.mo28b();
                while (b.hasNext()) {
                    considerNotify((C0026b) ((Entry) b.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(bVar);
                bVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public void observeForever(C0053p<T> pVar) {
        C0025a aVar = new C0025a(pVar);
        C0026b bVar = (C0026b) this.mObservers.mo22a(pVar, aVar);
        if (bVar != null && (bVar instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (bVar == null) {
            aVar.mo88a(true);
        }
    }

    public void removeObservers(C0043i iVar) {
        assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (((C0026b) entry.getValue()).mo86a(iVar)) {
                removeObserver((C0053p) entry.getKey());
            }
        }
    }

    public void observe(C0043i iVar, C0053p<T> pVar) {
        if (iVar.getLifecycle().mo54a() != State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(iVar, pVar);
            C0026b bVar = (C0026b) this.mObservers.mo22a(pVar, lifecycleBoundObserver);
            if (bVar != null && !bVar.mo86a(iVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (bVar == null) {
                iVar.getLifecycle().mo55a(lifecycleBoundObserver);
            }
        }
    }
}
