package shark;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C7581n;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import shark.C48747i.C48752c;

/* renamed from: shark.t */
public final class C48857t {

    /* renamed from: a */
    public final LinkedHashSet<String> f124211a = new LinkedHashSet<>();

    /* renamed from: b */
    public final Set<String> f124212b = new LinkedHashSet();

    /* renamed from: c */
    public final Set<String> f124213c = new LinkedHashSet();

    /* renamed from: d */
    public final Set<String> f124214d = new LinkedHashSet();

    /* renamed from: e */
    public final C48747i f124215e;

    public C48857t(C48747i iVar) {
        C7573i.m23587b(iVar, "heapObject");
        this.f124215e = iVar;
    }

    /* renamed from: a */
    public final void mo123609a(String str, C7563m<? super C48857t, ? super C48752c, C7581n> mVar) {
        C7573i.m23587b(str, "expectedClassName");
        C7573i.m23587b(mVar, "block");
        C48747i iVar = this.f124215e;
        if ((iVar instanceof C48752c) && ((C48752c) iVar).mo123493a(str)) {
            mVar.invoke(this, iVar);
        }
    }

    /* renamed from: a */
    public final void mo123610a(C7584c<? extends Object> cVar, C7563m<? super C48857t, ? super C48752c, C7581n> mVar) {
        C7573i.m23587b(cVar, "expectedClass");
        C7573i.m23587b(mVar, "block");
        String name = C7560a.m23571a(cVar).getName();
        C7573i.m23582a((Object) name, "expectedClass.java.name");
        mo123609a(name, mVar);
    }
}
