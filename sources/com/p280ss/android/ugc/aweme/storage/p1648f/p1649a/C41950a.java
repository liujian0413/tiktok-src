package com.p280ss.android.ugc.aweme.storage.p1648f.p1649a;

import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.storage.exception.UnregisteredPersistedWhiteListException;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41911c;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41941d;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.storage.f.a.a */
public abstract class C41950a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f109017a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41950a.class), "mRepo", "getMRepo()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C41951a f109018b = new C41951a(null);

    /* renamed from: c */
    private AtomicBoolean f109019c = new AtomicBoolean(false);

    /* renamed from: d */
    private final C7541d f109020d = C7546e.m23570a(Keva.getRepo(m133414c()));

    /* renamed from: e */
    private final LinkedHashSet<String> f109021e = new LinkedHashSet<>(8);

    /* renamed from: com.ss.android.ugc.aweme.storage.f.a.a$a */
    public static final class C41951a {
        private C41951a() {
        }

        public /* synthetic */ C41951a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    private final Keva m133413b() {
        return (Keva) this.f109020d.getValue();
    }

    /* renamed from: c */
    private static String m133414c() {
        return "av-storage-white-list";
    }

    /* renamed from: a */
    public final Set<String> mo102971a() {
        m133416e();
        return this.f109021e;
    }

    /* renamed from: d */
    private final String m133415d() {
        return String.valueOf(getClass().getName().hashCode());
    }

    /* renamed from: e */
    private final void m133416e() {
        if (!this.f109019c.get()) {
            m133417f();
            m133418g();
            this.f109019c.set(true);
        }
    }

    /* renamed from: f */
    private final void m133417f() {
        C41941d d = C35574k.m114859a().mo70094i().mo102933d();
        String name = getClass().getName();
        C7573i.m23582a((Object) name, "javaClass.name");
        if (!d.mo102968a(name) && C41911c.f108992a.mo102947c()) {
            throw new UnregisteredPersistedWhiteListException(null, 1, null);
        }
    }

    /* renamed from: g */
    private final void m133418g() {
        this.f109021e.clear();
        String[] stringArray = m133413b().getStringArray(m133415d(), new String[0]);
        C7573i.m23582a((Object) stringArray, "array");
        for (String add : C7519g.m23444c((T[]) stringArray)) {
            this.f109021e.add(add);
        }
    }
}
