package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1344b;

import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6937c;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1344b.C31663b.C31664a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b.d */
public final class C31667d extends C31662a<IMContact> {

    /* renamed from: b */
    public static final C31668a f82881b = new C31668a(null);

    /* renamed from: c */
    private final C31663b f82882c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b.d$a */
    public static final class C31668a {
        private C31668a() {
        }

        public /* synthetic */ C31668a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C31667d m102890a(C31690a aVar) {
            C7573i.m23587b(aVar, "parameters");
            return new C31667d(aVar);
        }
    }

    public C31667d(C31690a aVar) {
        C7573i.m23587b(aVar, "parameters");
        super(aVar);
        this.f82882c = C31664a.m102884a(aVar);
    }

    /* renamed from: a */
    private final boolean m102887a(IMConversation iMConversation) {
        if (this.f82877a.f82917d) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m102888a(IMUser iMUser) {
        int followStatus = iMUser.getFollowStatus();
        if (C6937c.f19628b.mo17969d() != 0 && followStatus != 1 && followStatus != 2) {
            return false;
        }
        if (this.f82877a.f82917d && followStatus != 2) {
            return false;
        }
        if (!this.f82877a.f82915b || !iMUser.isBlock()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo82449a(IMContact iMContact) {
        C7573i.m23587b(iMContact, "obj");
        if (!this.f82882c.mo82447a(iMContact)) {
            return false;
        }
        if (iMContact instanceof IMUser) {
            return m102888a((IMUser) iMContact);
        }
        if (iMContact instanceof IMConversation) {
            return m102887a((IMConversation) iMContact);
        }
        return false;
    }
}
