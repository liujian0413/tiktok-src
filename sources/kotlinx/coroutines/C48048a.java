package kotlinx.coroutines;

import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: kotlinx.coroutines.a */
public abstract class C48048a<T> extends C48108bo implements C47919b<T>, C48056ad, C48100bi {

    /* renamed from: a */
    protected final C47924e f122898a;

    /* renamed from: c */
    private final C47924e f122899c = this.f122898a.plus(this);

    /* renamed from: e */
    private static void m148995e(Throwable th) {
        C7573i.m23587b(th, "exception");
    }

    /* renamed from: a */
    public final C47924e mo76163a() {
        return this.f122899c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo120253d() {
    }

    /* renamed from: e */
    public final void mo120254e() {
        mo120253d();
    }

    /* renamed from: f */
    public int mo120255f() {
        return 0;
    }

    public final C47924e getContext() {
        return this.f122899c;
    }

    /* renamed from: b */
    public final boolean mo120251b() {
        return super.mo120251b();
    }

    public final void ca_() {
        mo120335a((C48100bi) this.f122898a.get(C48100bi.f122964b));
    }

    /* renamed from: g */
    public String mo120256g() {
        String a = C48221x.m149606a(this.f122899c);
        if (a == null) {
            return super.mo120256g();
        }
        StringBuilder sb = new StringBuilder("\"");
        sb.append(a);
        sb.append("\":");
        sb.append(super.mo120256g());
        return sb.toString();
    }

    public final void resumeWith(Object obj) {
        mo120339a(C48218u.m149604a(obj), mo120255f());
    }

    /* renamed from: a */
    public final void mo120249a(Throwable th) {
        C7573i.m23587b(th, "exception");
        C48051aa.m149013a(this.f122898a, th, this);
    }

    public C48048a(C47924e eVar, boolean z) {
        C7573i.m23587b(eVar, "parentContext");
        super(z);
        this.f122898a = eVar;
    }

    /* renamed from: a */
    public void mo120248a(Object obj, int i, boolean z) {
        if (obj instanceof C48217t) {
            m148995e(((C48217t) obj).f123124a);
        }
    }

    /* renamed from: a */
    public final <R> void mo120250a(CoroutineStart coroutineStart, R r, C7563m<? super R, ? super C47919b<? super T>, ? extends Object> mVar) {
        C7573i.m23587b(coroutineStart, "start");
        C7573i.m23587b(mVar, "block");
        ca_();
        coroutineStart.invoke(mVar, r, this);
    }
}
