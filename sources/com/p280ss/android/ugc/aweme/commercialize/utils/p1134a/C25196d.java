package com.p280ss.android.ugc.aweme.commercialize.utils.p1134a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25194c.C25195a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25183a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25185c;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25186d;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25187e;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25192f;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d */
public final class C25196d {

    /* renamed from: a */
    public static final C25196d f66490a = new C25196d();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$a */
    public static final class C25197a extends C25187e {

        /* renamed from: a */
        final /* synthetic */ Context f66491a;

        /* renamed from: b */
        final /* synthetic */ C7561a f66492b;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$a$a */
        static final class C25198a implements C25372a {

            /* renamed from: a */
            final /* synthetic */ C25197a f66493a;

            /* renamed from: b */
            final /* synthetic */ C25175a f66494b;

            C25198a(C25197a aVar, C25175a aVar2) {
                this.f66493a = aVar;
                this.f66494b = aVar2;
            }

            /* renamed from: a */
            public final void mo61517a(boolean z) {
                String str;
                C24961b a = C24958f.m81905a().mo65266a(this.f66494b.f66434e.f66455a);
                if (z) {
                    str = "deeplink_success";
                } else {
                    str = "deeplink_failed";
                }
                a.mo65276b(str).mo65264a(Long.valueOf(this.f66494b.f66430a.f66438b)).mo65286h(this.f66494b.f66430a.f66439c).mo65275b(Long.valueOf(this.f66494b.f66430a.f66440d)).mo65283e(this.f66494b.f66434e.f66456b).mo65270a(this.f66493a.f66491a);
            }
        }

        C25197a(Context context, C7561a aVar) {
            this.f66491a = context;
            this.f66492b = aVar;
        }

        /* renamed from: a */
        public final void mo65814a(boolean z, C25175a aVar) {
            C7573i.m23587b(aVar, "params");
            super.mo65814a(z, aVar);
            if (z) {
                C24958f.m81905a().mo65266a(aVar.f66434e.f66455a).mo65276b("open_url_app").mo65264a(Long.valueOf(aVar.f66430a.f66438b)).mo65286h(aVar.f66430a.f66439c).mo65275b(Long.valueOf(aVar.f66430a.f66440d)).mo65283e(aVar.f66434e.f66456b).mo65270a(this.f66491a);
                C25371n.m83440a((C25372a) new C25198a(this, aVar));
                this.f66492b.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$b */
    public static final class C25199b extends C25183a {

        /* renamed from: a */
        final /* synthetic */ C7561a f66495a;

        /* renamed from: a */
        public final boolean mo65817a() {
            return true;
        }

        /* renamed from: b */
        public final boolean mo65818b() {
            this.f66495a.invoke();
            return true;
        }

        C25199b(C7561a aVar) {
            this.f66495a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$c */
    public static final class C25200c extends C25187e {

        /* renamed from: a */
        final /* synthetic */ Context f66496a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$c$a */
        static final class C25201a implements C25372a {

            /* renamed from: a */
            final /* synthetic */ C25200c f66497a;

            /* renamed from: b */
            final /* synthetic */ C25175a f66498b;

            C25201a(C25200c cVar, C25175a aVar) {
                this.f66497a = cVar;
                this.f66498b = aVar;
            }

            /* renamed from: a */
            public final void mo61517a(boolean z) {
                String str;
                C24961b a = C24958f.m81905a().mo65266a(this.f66498b.f66434e.f66455a);
                if (z) {
                    str = "deeplink_success";
                } else {
                    str = "deeplink_failed";
                }
                a.mo65276b(str).mo65264a(Long.valueOf(this.f66498b.f66430a.f66438b)).mo65286h(this.f66498b.f66430a.f66439c).mo65275b(Long.valueOf(this.f66498b.f66430a.f66440d)).mo65283e(this.f66498b.f66434e.f66456b).mo65270a(this.f66497a.f66496a);
            }
        }

        C25200c(Context context) {
            this.f66496a = context;
        }

        /* renamed from: a */
        public final void mo65814a(boolean z, C25175a aVar) {
            C7573i.m23587b(aVar, "params");
            super.mo65814a(z, aVar);
            if (z) {
                C24958f.m81905a().mo65266a(aVar.f66434e.f66455a).mo65276b("open_url_app").mo65264a(Long.valueOf(aVar.f66430a.f66438b)).mo65286h(aVar.f66430a.f66439c).mo65275b(Long.valueOf(aVar.f66430a.f66440d)).mo65283e(aVar.f66434e.f66456b).mo65270a(this.f66496a);
                C25371n.m83440a((C25372a) new C25201a(this, aVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.d$d */
    public static final class C25202d extends C25192f {

        /* renamed from: a */
        final /* synthetic */ Context f66499a;

        C25202d(Context context) {
            this.f66499a = context;
        }

        /* renamed from: a */
        public final void mo65814a(boolean z, C25175a aVar) {
            C7573i.m23587b(aVar, "params");
            super.mo65814a(z, aVar);
            if (z) {
                C24958f.m81905a().mo65266a(aVar.f66434e.f66455a).mo65276b("open_url_h5").mo65264a(Long.valueOf(aVar.f66430a.f66438b)).mo65286h(aVar.f66430a.f66439c).mo65275b(Long.valueOf(aVar.f66430a.f66440d)).mo65283e(aVar.f66434e.f66456b).mo65270a(this.f66499a);
            }
        }
    }

    private C25196d() {
    }

    /* renamed from: a */
    public static final C25211g m82879a(Context context, C25175a aVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "params");
        return new C25195a().mo65825a(aVar).mo65823a(context).mo65824a((C25183a) new C25185c()).mo65824a((C25183a) new C25200c(context)).mo65824a((C25183a) new C25186d()).mo65824a((C25183a) new C25202d(context)).f66489a;
    }

    /* renamed from: a */
    public static final C25211g m82880a(Context context, C25175a aVar, C7561a<C7581n> aVar2, C7561a<C7581n> aVar3) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "params");
        C7573i.m23587b(aVar2, "openUrlHandleCallback");
        C7573i.m23587b(aVar3, "downloadCallback");
        return new C25195a().mo65825a(aVar).mo65823a(context).mo65824a((C25183a) new C25197a(context, aVar2)).mo65824a((C25183a) new C25199b(aVar3)).f66489a;
    }
}
