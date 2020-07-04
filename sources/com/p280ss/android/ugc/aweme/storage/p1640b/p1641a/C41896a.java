package com.p280ss.android.ugc.aweme.storage.p1640b.p1641a;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.C27312d;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7513am;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.storage.b.a.a */
public final class C41896a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f108974a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41896a.class), "sizeFactory", "getSizeFactory()Lcom/ss/android/ugc/aweme/storage/helper/draft/DraftSizeCalculatorFactory;"))};

    /* renamed from: b */
    private C27311c f108975b;

    /* renamed from: c */
    private final C7541d f108976c = C7546e.m23570a(new C41901b());

    /* renamed from: c */
    private final C41901b m133244c() {
        return (C41901b) this.f108976c.getValue();
    }

    /* renamed from: a */
    public final long mo102934a() {
        C27311c cVar = this.f108975b;
        if (cVar == null || !cVar.mo70243c()) {
            return 0;
        }
        m133244c();
        return C41901b.m133262a(cVar).mo102940d();
    }

    /* renamed from: b */
    public final Set<String> mo102936b() {
        C27311c cVar = this.f108975b;
        if (cVar == null) {
            return C7513am.m23408a();
        }
        if (!cVar.mo70243c()) {
            return C7513am.m23408a();
        }
        return C27312d.m89564c(cVar);
    }

    /* renamed from: a */
    public final void mo102935a(C27311c cVar) {
        C7573i.m23587b(cVar, "source");
        this.f108975b = cVar;
    }
}
