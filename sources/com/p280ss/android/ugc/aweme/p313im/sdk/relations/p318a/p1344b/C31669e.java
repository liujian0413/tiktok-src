package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1344b;

import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6937c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30733a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31256a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b.e */
public final class C31669e extends C31662a<Conversation> {

    /* renamed from: b */
    public static final C31670a f82883b = new C31670a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b.e$a */
    public static final class C31670a {
        private C31670a() {
        }

        public /* synthetic */ C31670a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C31669e m102892a(C31690a aVar) {
            C7573i.m23587b(aVar, "parameters");
            return new C31669e(aVar);
        }
    }

    public C31669e(C31690a aVar) {
        C7573i.m23587b(aVar, "parameters");
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo82450a(Conversation conversation) {
        C7573i.m23587b(conversation, "obj");
        Message lastMessage = conversation.getLastMessage();
        if (lastMessage == null) {
            return false;
        }
        if (C6937c.f19628b.mo17969d() != 0 && this.f82877a.mo82464b() && lastMessage.getMsgType() == 15) {
            return false;
        }
        if ((!conversation.isGroupChat() || !C31256a.m101858a(conversation)) && !C30733a.m100117b(conversation)) {
            return true;
        }
        return false;
    }
}
