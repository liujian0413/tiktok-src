package kotlinx.coroutines;

import kotlin.coroutines.C47918a;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47920c;
import kotlin.coroutines.C47920c.C47921a;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.y */
public abstract class C48222y extends C47918a implements C47920c {
    /* renamed from: a */
    public abstract void mo83489a(C47924e eVar, Runnable runnable);

    /* renamed from: a */
    public boolean mo83490a(C47924e eVar) {
        C7573i.m23587b(eVar, "context");
        return true;
    }

    public C48222y() {
        super(C47920c.f122777a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C48059ag.m149023b(this));
        sb.append('@');
        sb.append(C48059ag.m149021a((Object) this));
        return sb.toString();
    }

    /* renamed from: a */
    public final <T> C47919b<T> mo120140a(C47919b<? super T> bVar) {
        C7573i.m23587b(bVar, "continuation");
        return new C48076ao<>(this, bVar);
    }

    /* renamed from: b */
    public final void mo120141b(C47919b<?> bVar) {
        C7573i.m23587b(bVar, "continuation");
        C47921a.m148863a((C47920c) this, bVar);
    }

    public <E extends C47927b> E get(C47929c<E> cVar) {
        C7573i.m23587b(cVar, "key");
        return C47921a.m148862a((C47920c) this, cVar);
    }

    public C47924e minusKey(C47929c<?> cVar) {
        C7573i.m23587b(cVar, "key");
        return C47921a.m148864b(this, cVar);
    }
}
