package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.arch.p005a.p007b.C0008a;
import android.arch.p005a.p007b.C0009b.C0014d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.j */
public class C0044j extends Lifecycle {

    /* renamed from: a */
    private C0008a<C0042h, C0046a> f76a = new C0008a<>();

    /* renamed from: b */
    private State f77b;

    /* renamed from: c */
    private final WeakReference<C0043i> f78c;

    /* renamed from: d */
    private int f79d = 0;

    /* renamed from: e */
    private boolean f80e = false;

    /* renamed from: f */
    private boolean f81f = false;

    /* renamed from: g */
    private ArrayList<State> f82g = new ArrayList<>();

    /* renamed from: android.arch.lifecycle.j$a */
    static class C0046a {

        /* renamed from: a */
        State f85a;

        /* renamed from: b */
        GenericLifecycleObserver f86b;

        C0046a(C0042h hVar, State state) {
            this.f86b = C0048l.m114a((Object) hVar);
            this.f85a = state;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo118a(C0043i iVar, Event event) {
            State b = C0044j.m97b(event);
            this.f85a = C0044j.m95a(this.f85a, b);
            this.f86b.mo44a(iVar, event);
            this.f85a = b;
        }
    }

    /* renamed from: a */
    public State mo54a() {
        return this.f77b;
    }

    /* renamed from: c */
    private void m102c() {
        this.f82g.remove(this.f82g.size() - 1);
    }

    /* renamed from: b */
    private boolean m100b() {
        if (this.f76a.f16c == 0) {
            return true;
        }
        State state = ((C0046a) this.f76a.f14a.getValue()).f85a;
        State state2 = ((C0046a) this.f76a.f15b.getValue()).f85a;
        if (state == state2 && this.f77b == state2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m105d() {
        C0043i iVar = (C0043i) this.f78c.get();
        if (iVar != null) {
            while (!m100b()) {
                this.f81f = false;
                if (this.f77b.compareTo(((C0046a) this.f76a.f14a.getValue()).f85a) < 0) {
                    m99b(iVar);
                }
                C0013c<K, V> cVar = this.f76a.f15b;
                if (!this.f81f && cVar != null && this.f77b.compareTo(((C0046a) cVar.getValue()).f85a) > 0) {
                    m96a(iVar);
                }
            }
            this.f81f = false;
        }
    }

    /* renamed from: c */
    private void m103c(State state) {
        this.f82g.add(state);
    }

    /* renamed from: a */
    public final void mo116a(Event event) {
        m98b(m97b(event));
    }

    /* renamed from: b */
    public void mo56b(C0042h hVar) {
        this.f76a.mo23b(hVar);
    }

    /* renamed from: b */
    private void m98b(State state) {
        if (this.f77b != state) {
            this.f77b = state;
            if (this.f80e || this.f79d != 0) {
                this.f81f = true;
                return;
            }
            this.f80e = true;
            m105d();
            this.f80e = false;
        }
    }

    /* renamed from: a */
    public final void mo117a(State state) {
        m98b(state);
    }

    public C0044j(C0043i iVar) {
        this.f78c = new WeakReference<>(iVar);
        this.f77b = State.INITIALIZED;
    }

    /* renamed from: b */
    static State m97b(Event event) {
        switch (event) {
            case ON_CREATE:
            case ON_STOP:
                return State.CREATED;
            case ON_START:
            case ON_PAUSE:
                return State.STARTED;
            case ON_RESUME:
                return State.RESUMED;
            case ON_DESTROY:
                return State.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder("Unexpected event value ");
                sb.append(event);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private State mo84625c(C0042h hVar) {
        State state;
        Entry d = this.f76a.mo25d(hVar);
        State state2 = null;
        if (d != null) {
            state = ((C0046a) d.getValue()).f85a;
        } else {
            state = null;
        }
        if (!this.f82g.isEmpty()) {
            state2 = (State) this.f82g.get(this.f82g.size() - 1);
        }
        return m95a(m95a(this.f77b, state), state2);
    }

    /* renamed from: e */
    private static Event m106e(State state) {
        switch (state) {
            case INITIALIZED:
            case DESTROYED:
                return Event.ON_CREATE;
            case CREATED:
                return Event.ON_START;
            case STARTED:
                return Event.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                StringBuilder sb = new StringBuilder("Unexpected state value ");
                sb.append(state);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m96a(C0043i iVar) {
        C0014d b = this.f76a.mo28b();
        while (b.hasNext() && !this.f81f) {
            Entry entry = (Entry) b.next();
            C0046a aVar = (C0046a) entry.getValue();
            while (aVar.f85a.compareTo(this.f77b) < 0 && !this.f81f && this.f76a.mo24c(entry.getKey())) {
                m103c(aVar.f85a);
                aVar.mo118a(iVar, m106e(aVar.f85a));
                m102c();
            }
        }
    }

    /* renamed from: b */
    private void m99b(C0043i iVar) {
        Iterator a = this.f76a.mo26a();
        while (a.hasNext() && !this.f81f) {
            Entry entry = (Entry) a.next();
            C0046a aVar = (C0046a) entry.getValue();
            while (aVar.f85a.compareTo(this.f77b) > 0 && !this.f81f && this.f76a.mo24c(entry.getKey())) {
                Event d = m104d(aVar.f85a);
                m103c(m97b(d));
                aVar.mo118a(iVar, d);
                m102c();
            }
        }
    }

    /* renamed from: d */
    private static Event m104d(State state) {
        switch (state) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return Event.ON_DESTROY;
            case STARTED:
                return Event.ON_STOP;
            case RESUMED:
                return Event.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                StringBuilder sb = new StringBuilder("Unexpected state value ");
                sb.append(state);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo55a(C0042h hVar) {
        State state;
        boolean z;
        if (this.f77b == State.DESTROYED) {
            state = State.DESTROYED;
        } else {
            state = State.INITIALIZED;
        }
        C0046a aVar = new C0046a(hVar, state);
        if (((C0046a) this.f76a.mo22a(hVar, aVar)) == null) {
            C0043i iVar = (C0043i) this.f78c.get();
            if (iVar != null) {
                if (this.f79d != 0 || this.f80e) {
                    z = true;
                } else {
                    z = false;
                }
                State c = mo84625c(hVar);
                this.f79d++;
                while (aVar.f85a.compareTo(c) < 0 && this.f76a.mo24c(hVar)) {
                    m103c(aVar.f85a);
                    aVar.mo118a(iVar, m106e(aVar.f85a));
                    m102c();
                    c = mo84625c(hVar);
                }
                if (!z) {
                    m105d();
                }
                this.f79d--;
            }
        }
    }

    /* renamed from: a */
    static State m95a(State state, State state2) {
        if (state2 == null || state2.compareTo(state) >= 0) {
            return state;
        }
        return state2;
    }
}
