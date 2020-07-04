package com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.p1623a.p1624a;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.a.a.c */
public final class C41600c<T> extends C41598a<T> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f108099a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41600c.class), "mRepo", "getMRepo()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    private final C7541d f108100b = C7546e.m23570a(Keva.getRepoFromSp(C6399b.m19921a(), this.f108101c, 0));

    /* renamed from: c */
    private final String f108101c;

    /* renamed from: d */
    private final int f108102d;

    /* renamed from: e */
    private final Class<T> f108103e;

    /* renamed from: e */
    private final Keva m132454e() {
        return (Keva) this.f108100b.getValue();
    }

    /* renamed from: a */
    public final int mo102225a() {
        return this.f108102d;
    }

    /* renamed from: d */
    public final void mo102228d() {
        m132454e().clear();
    }

    /* renamed from: b */
    public final int mo102226b() {
        return m132454e().count();
    }

    /* renamed from: c */
    public final List<T> mo102227c() {
        String string = m132454e().getString(this.f108101c, "");
        C6597a parameterized = C6597a.getParameterized(List.class, this.f108103e);
        C7573i.m23582a((Object) parameterized, "TypeToken.getParameteriz…::class.java, actualType)");
        List<T> list = (List) C35574k.m114859a().mo70085S().mo15975a(string, parameterized.type);
        if (list == null) {
            return C7525m.m23461a();
        }
        return list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo102224b(T t) {
        Iterable c = mo102227c();
        Collection arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                Object next = it.next();
                if (next != null && !C7573i.m23585a(next, (Object) t)) {
                    z = false;
                }
                if (!z) {
                    arrayList.add(next);
                }
            } else {
                List d = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
                d.add(0, t);
                C6597a parameterized = C6597a.getParameterized(List.class, this.f108103e);
                C7573i.m23582a((Object) parameterized, "TypeToken.getParameteriz…::class.java, actualType)");
                m132454e().storeString(this.f108101c, C35574k.m114859a().mo70085S().mo15980b(C7525m.m23505c((Iterable<? extends T>) d, this.f108102d), parameterized.type));
                return true;
            }
        }
    }

    public C41600c(String str, int i, Class<T> cls) {
        C7573i.m23587b(str, "repoName");
        C7573i.m23587b(cls, "actualType");
        this.f108101c = str;
        this.f108102d = i;
        this.f108103e = cls;
    }
}
