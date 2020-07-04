package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1344b;

import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1344b.C31663b.C31664a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b.c */
public final class C31665c extends C31662a<IMContact> {

    /* renamed from: b */
    public static final C31666a f82879b = new C31666a(null);

    /* renamed from: c */
    private final C31663b f82880c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b.c$a */
    public static final class C31666a {
        private C31666a() {
        }

        public /* synthetic */ C31666a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C31665c m102886a(C31690a aVar) {
            C7573i.m23587b(aVar, "parameters");
            return new C31665c(aVar);
        }
    }

    public C31665c(C31690a aVar) {
        C7573i.m23587b(aVar, "parameters");
        super(aVar);
        this.f82880c = C31664a.m102884a(aVar);
    }

    /* renamed from: a */
    public final boolean mo82448a(IMContact iMContact) {
        C7573i.m23587b(iMContact, "obj");
        return this.f82880c.mo82447a(iMContact);
    }
}
