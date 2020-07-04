package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1344b;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b.b */
public final class C31663b extends C31662a<IMContact> {

    /* renamed from: b */
    public static final C31664a f82878b = new C31664a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b.b$a */
    public static final class C31664a {
        private C31664a() {
        }

        public /* synthetic */ C31664a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C31663b m102884a(C31690a aVar) {
            C7573i.m23587b(aVar, "parameters");
            return new C31663b(aVar);
        }
    }

    public C31663b(C31690a aVar) {
        C7573i.m23587b(aVar, "parameters");
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo82447a(IMContact iMContact) {
        C7573i.m23587b(iMContact, "obj");
        if (!C6399b.m19944t() || !this.f82877a.mo82463a() || !(iMContact instanceof IMUser) || ((IMUser) iMContact).getShareStatus() != 2) {
            return true;
        }
        return false;
    }
}
