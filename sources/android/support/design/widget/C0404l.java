package android.support.design.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: android.support.design.widget.l */
final class C0404l {

    /* renamed from: a */
    private static C0404l f1750a;

    /* renamed from: b */
    private final Object f1751b = new Object();

    /* renamed from: c */
    private final Handler f1752c = new Handler(Looper.getMainLooper(), new Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0404l.this.mo1861a((C0407b) message.obj);
            return true;
        }
    });

    /* renamed from: d */
    private C0407b f1753d;

    /* renamed from: e */
    private C0407b f1754e;

    /* renamed from: android.support.design.widget.l$a */
    interface C0406a {
        /* renamed from: a */
        void mo1300a();

        void dismiss(int i);
    }

    /* renamed from: android.support.design.widget.l$b */
    static class C0407b {

        /* renamed from: a */
        final WeakReference<C0406a> f1756a;

        /* renamed from: b */
        int f1757b;

        /* renamed from: c */
        boolean f1758c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo1869a(C0406a aVar) {
            if (aVar == null || this.f1756a.get() != aVar) {
                return false;
            }
            return true;
        }

        C0407b(int i, C0406a aVar) {
            this.f1756a = new WeakReference<>(aVar);
            this.f1757b = i;
        }
    }

    /* renamed from: a */
    static C0404l m1817a() {
        if (f1750a == null) {
            f1750a = new C0404l();
        }
        return f1750a;
    }

    private C0404l() {
    }

    /* renamed from: b */
    private void m1819b() {
        if (this.f1754e != null) {
            this.f1753d = this.f1754e;
            this.f1754e = null;
            C0406a aVar = (C0406a) this.f1753d.f1756a.get();
            if (aVar != null) {
                aVar.mo1300a();
                return;
            }
            this.f1753d = null;
        }
    }

    /* renamed from: g */
    private boolean m1821g(C0406a aVar) {
        if (this.f1753d == null || !this.f1753d.mo1869a(aVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private boolean m1822h(C0406a aVar) {
        if (this.f1754e == null || !this.f1754e.mo1869a(aVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo1866e(C0406a aVar) {
        boolean g;
        synchronized (this.f1751b) {
            g = m1821g(aVar);
        }
        return g;
    }

    /* renamed from: c */
    public final void mo1863c(C0406a aVar) {
        synchronized (this.f1751b) {
            if (m1821g(aVar) && !this.f1753d.f1758c) {
                this.f1753d.f1758c = true;
                this.f1752c.removeCallbacksAndMessages(this.f1753d);
            }
        }
    }

    /* renamed from: d */
    public final void mo1864d(C0406a aVar) {
        synchronized (this.f1751b) {
            if (m1821g(aVar) && this.f1753d.f1758c) {
                this.f1753d.f1758c = false;
                m1820b(this.f1753d);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo1867f(C0406a aVar) {
        boolean z;
        synchronized (this.f1751b) {
            if (!m1821g(aVar)) {
                if (!m1822h(aVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private void m1820b(C0407b bVar) {
        if (bVar.f1757b != -2) {
            int i = 2750;
            if (bVar.f1757b > 0) {
                i = bVar.f1757b;
            } else if (bVar.f1757b == -1) {
                i = 1500;
            }
            this.f1752c.removeCallbacksAndMessages(bVar);
            this.f1752c.sendMessageDelayed(Message.obtain(this.f1752c, 0, bVar), (long) i);
        }
    }

    /* renamed from: a */
    public final void mo1860a(C0406a aVar) {
        synchronized (this.f1751b) {
            if (m1821g(aVar)) {
                this.f1753d = null;
                if (this.f1754e != null) {
                    m1819b();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo1862b(C0406a aVar) {
        synchronized (this.f1751b) {
            if (m1821g(aVar)) {
                m1820b(this.f1753d);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1861a(C0407b bVar) {
        synchronized (this.f1751b) {
            if (this.f1753d == bVar || this.f1754e == bVar) {
                m1818a(bVar, 2);
            }
        }
    }

    /* renamed from: a */
    private boolean m1818a(C0407b bVar, int i) {
        C0406a aVar = (C0406a) bVar.f1756a.get();
        if (aVar == null) {
            return false;
        }
        this.f1752c.removeCallbacksAndMessages(bVar);
        aVar.dismiss(i);
        return true;
    }

    public final void dismiss(C0406a aVar, int i) {
        synchronized (this.f1751b) {
            if (m1821g(aVar)) {
                m1818a(this.f1753d, i);
            } else if (m1822h(aVar)) {
                m1818a(this.f1754e, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo1859a(int i, C0406a aVar) {
        synchronized (this.f1751b) {
            if (m1821g(aVar)) {
                this.f1753d.f1757b = i;
                this.f1752c.removeCallbacksAndMessages(this.f1753d);
                m1820b(this.f1753d);
                return;
            }
            if (m1822h(aVar)) {
                this.f1754e.f1757b = i;
            } else {
                this.f1754e = new C0407b(i, aVar);
            }
            if (this.f1753d == null || !m1818a(this.f1753d, 4)) {
                this.f1753d = null;
                m1819b();
            }
        }
    }
}
