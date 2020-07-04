package com.p280ss.android.ugc.aweme.commercialize.utils.p1134a;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25175a.C25176a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25183a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.c */
public final class C25194c implements C25211g {

    /* renamed from: a */
    public Context f66486a;

    /* renamed from: b */
    public List<C25183a> f66487b;

    /* renamed from: c */
    public C25175a f66488c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.c$a */
    public static final class C25195a {

        /* renamed from: a */
        public C25194c f66489a;

        public C25195a() {
            C25194c cVar = new C25194c(null, null, null, 7, null);
            this.f66489a = cVar;
        }

        /* renamed from: a */
        public final C25195a mo65823a(Context context) {
            C25195a aVar = this;
            if (context != null) {
                aVar.f66489a.mo65820a(context);
            }
            return aVar;
        }

        /* renamed from: a */
        public final C25195a mo65824a(C25183a aVar) {
            C7573i.m23587b(aVar, "handler");
            C25195a aVar2 = this;
            aVar2.f66489a.f66487b.add(aVar);
            return aVar2;
        }

        /* renamed from: a */
        public final C25195a mo65825a(C25175a aVar) {
            C7573i.m23587b(aVar, "params");
            C25195a aVar2 = this;
            aVar2.f66489a.mo65821a(aVar);
            return aVar2;
        }
    }

    private C25194c() {
        this(null, null, null, 7, null);
    }

    /* renamed from: a */
    public final boolean mo65822a() {
        for (C25183a aVar : this.f66487b) {
            aVar.mo65812a(this.f66486a);
            aVar.mo65813a(this.f66488c);
            if (aVar.mo65817a()) {
                boolean b = aVar.mo65818b();
                aVar.mo65814a(b, this.f66488c);
                if (b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo65820a(Context context) {
        C7573i.m23587b(context, "<set-?>");
        this.f66486a = context;
    }

    /* renamed from: a */
    public final void mo65821a(C25175a aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f66488c = aVar;
    }

    private C25194c(Context context, List<C25183a> list, C25175a aVar) {
        this.f66486a = context;
        this.f66487b = list;
        this.f66488c = aVar;
    }

    /* synthetic */ C25194c(Context context, List list, C25175a aVar, int i, C7571f fVar) {
        this(C6399b.m19921a(), new ArrayList(), new C25176a().f66436a);
    }
}
