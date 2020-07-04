package androidx.work.impl.p033a.p034a;

import androidx.work.impl.p033a.C1467a;
import androidx.work.impl.p033a.p035b.C1482d;
import androidx.work.impl.p036b.C1501g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.a.a.c */
public abstract class C1470c<T> implements C1467a<T> {

    /* renamed from: a */
    private final List<String> f5682a = new ArrayList();

    /* renamed from: b */
    private T f5683b;

    /* renamed from: c */
    private C1482d<T> f5684c;

    /* renamed from: d */
    private C1471a f5685d;

    /* renamed from: androidx.work.impl.a.a.c$a */
    public interface C1471a {
        /* renamed from: b */
        void mo6715b(List<String> list);

        /* renamed from: c */
        void mo6716c(List<String> list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo6709a(C1501g gVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract boolean mo6710b(T t);

    /* renamed from: a */
    public final void mo6711a() {
        if (!this.f5682a.isEmpty()) {
            this.f5682a.clear();
            this.f5684c.mo6728b(this);
        }
    }

    /* renamed from: b */
    private void m7363b() {
        if (!this.f5682a.isEmpty() && this.f5685d != null) {
            if (this.f5683b == null || mo6710b(this.f5683b)) {
                this.f5685d.mo6716c(this.f5682a);
            } else {
                this.f5685d.mo6715b(this.f5682a);
            }
        }
    }

    /* renamed from: a */
    public final void mo6708a(T t) {
        this.f5683b = t;
        m7363b();
    }

    C1470c(C1482d<T> dVar) {
        this.f5684c = dVar;
    }

    /* renamed from: a */
    public final void mo6712a(C1471a aVar) {
        if (this.f5685d != aVar) {
            this.f5685d = aVar;
            m7363b();
        }
    }

    /* renamed from: a */
    public final void mo6713a(List<C1501g> list) {
        this.f5682a.clear();
        for (C1501g gVar : list) {
            if (mo6709a(gVar)) {
                this.f5682a.add(gVar.f5734a);
            }
        }
        if (this.f5682a.isEmpty()) {
            this.f5684c.mo6728b(this);
        } else {
            this.f5684c.mo6726a((C1467a<T>) this);
        }
        m7363b();
    }

    /* renamed from: a */
    public final boolean mo6714a(String str) {
        if (this.f5683b == null || !mo6710b(this.f5683b) || !this.f5682a.contains(str)) {
            return false;
        }
        return true;
    }
}
