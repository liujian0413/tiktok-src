package android.support.transition;

import android.animation.TimeInterpolator;
import android.support.transition.C0508m.C0513b;
import android.support.transition.C0508m.C0514c;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.transition.q */
public class C0520q extends C0508m {

    /* renamed from: a */
    int f2061a;

    /* renamed from: p */
    boolean f2062p = false;

    /* renamed from: q */
    private ArrayList<C0508m> f2063q = new ArrayList<>();

    /* renamed from: r */
    private boolean f2064r = true;

    /* renamed from: s */
    private int f2065s = 0;

    /* renamed from: android.support.transition.q$a */
    static class C0522a extends C0515n {

        /* renamed from: a */
        C0520q f2068a;

        C0522a(C0520q qVar) {
            this.f2068a = qVar;
        }

        /* renamed from: a */
        public final void mo2042a(C0508m mVar) {
            this.f2068a.f2061a--;
            if (this.f2068a.f2061a == 0) {
                this.f2068a.f2062p = false;
                this.f2068a.mo2138d();
            }
            mVar.mo2130b((C0514c) this);
        }

        /* renamed from: d */
        public final void mo2045d(C0508m mVar) {
            if (!this.f2068a.f2062p) {
                this.f2068a.mo2135c();
                this.f2068a.f2062p = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2124a(ViewGroup viewGroup, C0525t tVar, C0525t tVar2, ArrayList<C0524s> arrayList, ArrayList<C0524s> arrayList2) {
        long j = this.f2023c;
        int size = this.f2063q.size();
        for (int i = 0; i < size; i++) {
            C0508m mVar = (C0508m) this.f2063q.get(i);
            if (j > 0 && (this.f2064r || i == 0)) {
                long j2 = mVar.f2023c;
                if (j2 > 0) {
                    mVar.mo2129b(j2 + j);
                } else {
                    mVar.mo2129b(j);
                }
            }
            mVar.mo2124a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public final void mo1185a(C0524s sVar) {
        if (mo2127a(sVar.f2073b)) {
            Iterator it = this.f2063q.iterator();
            while (it.hasNext()) {
                C0508m mVar = (C0508m) it.next();
                if (mVar.mo2127a(sVar.f2073b)) {
                    mVar.mo1185a(sVar);
                    sVar.f2074c.add(mVar);
                }
            }
        }
    }

    /* renamed from: g */
    public final int mo2156g() {
        return this.f2063q.size();
    }

    /* renamed from: h */
    private void m2184h() {
        C0522a aVar = new C0522a(this);
        Iterator it = this.f2063q.iterator();
        while (it.hasNext()) {
            ((C0508m) it.next()).mo2117a((C0514c) aVar);
        }
        this.f2061a = this.f2063q.size();
    }

    /* renamed from: f */
    public final C0508m clone() {
        C0520q qVar = (C0520q) super.clone();
        qVar.f2063q = new ArrayList<>();
        int size = this.f2063q.size();
        for (int i = 0; i < size; i++) {
            qVar.mo2151a(((C0508m) this.f2063q.get(i)).clone());
        }
        return qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo2133b() {
        if (this.f2063q.isEmpty()) {
            mo2135c();
            mo2138d();
            return;
        }
        m2184h();
        if (!this.f2064r) {
            for (int i = 1; i < this.f2063q.size(); i++) {
                final C0508m mVar = (C0508m) this.f2063q.get(i);
                ((C0508m) this.f2063q.get(i - 1)).mo2117a((C0514c) new C0515n() {
                    /* renamed from: a */
                    public final void mo2042a(C0508m mVar) {
                        mVar.mo2133b();
                        mVar.mo2130b((C0514c) this);
                    }
                });
            }
            C0508m mVar2 = (C0508m) this.f2063q.get(0);
            if (mVar2 != null) {
                mVar2.mo2133b();
            }
            return;
        }
        Iterator it = this.f2063q.iterator();
        while (it.hasNext()) {
            ((C0508m) it.next()).mo2133b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C0520q mo2129b(long j) {
        return (C0520q) super.mo2129b(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C0520q mo2130b(C0514c cVar) {
        return (C0520q) super.mo2130b(cVar);
    }

    /* renamed from: c */
    public final C0520q mo2117a(C0514c cVar) {
        return (C0520q) super.mo2117a(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C0520q mo2128b(int i) {
        for (int i2 = 0; i2 < this.f2063q.size(); i2++) {
            ((C0508m) this.f2063q.get(i2)).mo2128b(i);
        }
        return (C0520q) super.mo2128b(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C0520q mo2131b(View view) {
        for (int i = 0; i < this.f2063q.size(); i++) {
            ((C0508m) this.f2063q.get(i)).mo2131b(view);
        }
        return (C0520q) super.mo2131b(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C0520q mo2134c(View view) {
        for (int i = 0; i < this.f2063q.size(); i++) {
            ((C0508m) this.f2063q.get(i)).mo2134c(view);
        }
        return (C0520q) super.mo2134c(view);
    }

    /* renamed from: c */
    public final C0508m mo2153c(int i) {
        if (i < 0 || i >= this.f2063q.size()) {
            return null;
        }
        return (C0508m) this.f2063q.get(i);
    }

    /* renamed from: e */
    public final void mo2141e(View view) {
        super.mo2141e(view);
        int size = this.f2063q.size();
        for (int i = 0; i < size; i++) {
            ((C0508m) this.f2063q.get(i)).mo2141e(view);
        }
    }

    /* renamed from: a */
    public final C0520q mo2150a(int i) {
        switch (i) {
            case 0:
                this.f2064r = true;
                break;
            case 1:
                this.f2064r = false;
                break;
            default:
                StringBuilder sb = new StringBuilder("Invalid parameter for TransitionSet ordering: ");
                sb.append(i);
                throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    /* renamed from: c */
    public final C0520q mo2115a(long j) {
        super.mo2115a(j);
        if (this.f2024d >= 0) {
            int size = this.f2063q.size();
            for (int i = 0; i < size; i++) {
                ((C0508m) this.f2063q.get(i)).mo2115a(j);
            }
        }
        return this;
    }

    /* renamed from: d */
    public final void mo2139d(View view) {
        super.mo2139d(view);
        int size = this.f2063q.size();
        for (int i = 0; i < size; i++) {
            ((C0508m) this.f2063q.get(i)).mo2139d(view);
        }
    }

    /* renamed from: a */
    public final C0520q mo2151a(C0508m mVar) {
        this.f2063q.add(mVar);
        mVar.f2030j = this;
        if (this.f2024d >= 0) {
            mVar.mo2115a(this.f2024d);
        }
        if ((this.f2065s & 1) != 0) {
            mVar.mo2116a(this.f2025e);
        }
        if ((this.f2065s & 2) != 0) {
            mVar.mo2122a(this.f2033m);
        }
        if ((this.f2065s & 4) != 0) {
            mVar.mo2120a(this.f2035o);
        }
        if ((this.f2065s & 8) != 0) {
            mVar.mo2121a(this.f2034n);
        }
        return this;
    }

    /* renamed from: b */
    public final C0520q mo2116a(TimeInterpolator timeInterpolator) {
        this.f2065s |= 1;
        if (this.f2063q != null) {
            int size = this.f2063q.size();
            for (int i = 0; i < size; i++) {
                ((C0508m) this.f2063q.get(i)).mo2116a(timeInterpolator);
            }
        }
        return (C0520q) super.mo2116a(timeInterpolator);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo2136c(C0524s sVar) {
        super.mo2136c(sVar);
        int size = this.f2063q.size();
        for (int i = 0; i < size; i++) {
            ((C0508m) this.f2063q.get(i)).mo2136c(sVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo2119a(String str) {
        String a = super.mo2119a(str);
        for (int i = 0; i < this.f2063q.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            C0508m mVar = (C0508m) this.f2063q.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(mVar.mo2119a(sb2.toString()));
            a = sb.toString();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo2120a(C0492f fVar) {
        super.mo2120a(fVar);
        this.f2065s |= 4;
        for (int i = 0; i < this.f2063q.size(); i++) {
            ((C0508m) this.f2063q.get(i)).mo2120a(fVar);
        }
    }

    /* renamed from: b */
    public final void mo1186b(C0524s sVar) {
        if (mo2127a(sVar.f2073b)) {
            Iterator it = this.f2063q.iterator();
            while (it.hasNext()) {
                C0508m mVar = (C0508m) it.next();
                if (mVar.mo2127a(sVar.f2073b)) {
                    mVar.mo1186b(sVar);
                    sVar.f2074c.add(mVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2121a(C0513b bVar) {
        super.mo2121a(bVar);
        this.f2065s |= 8;
        int size = this.f2063q.size();
        for (int i = 0; i < size; i++) {
            ((C0508m) this.f2063q.get(i)).mo2121a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo2122a(C0519p pVar) {
        super.mo2122a(pVar);
        this.f2065s |= 2;
        int size = this.f2063q.size();
        for (int i = 0; i < size; i++) {
            ((C0508m) this.f2063q.get(i)).mo2122a(pVar);
        }
    }
}
