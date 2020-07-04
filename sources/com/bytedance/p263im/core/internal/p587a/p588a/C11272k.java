package com.bytedance.p263im.core.internal.p587a.p588a;

import com.C1642a;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11403c;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.ParticipantReadIndex;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.a.k */
public final class C11272k extends C11280o<List<ParticipantReadIndex>> {
    public C11272k() {
        super(IMCMD.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue());
    }

    public C11272k(C11195b<List<ParticipantReadIndex>> bVar) {
        super(IMCMD.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar == null || eVar.f30858g == null || eVar.f30858g.body == null || eVar.f30858g.body.participants_read_index_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo27297a(String str) {
        Conversation a = C6417a.m20015a().mo15530a(str);
        if (a == null || a.isLocal()) {
            mo27305b(C11391e.m33515a(-1017));
            return;
        }
        RequestBody build = new Builder().participants_read_index_body(new GetConversationParticipantsReadIndexV3RequestBody.Builder().conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).conversation_id(a.getConversationId()).build()).build();
        mo27301a(a.getInboxType(), build, null, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        boolean z;
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            z = false;
        } else {
            z = true;
        }
        Conversation conversation = (Conversation) eVar.f30856e[0];
        String conversationId = conversation.getConversationId();
        if (z) {
            mo27302a(eVar.f30858g.body.participants_read_index_body.indexes);
            C11404d.m33582a(C1642a.m8034a("request readIndex result=%s", new Object[]{C11403c.f30887a.mo15979b((Object) eVar.f30858g.body.participants_read_index_body.indexes)}));
        } else {
            mo27305b(eVar);
            C11404d.m33582a("request readIndex error");
        }
        C11209d.m32821a(eVar, z).mo27257a("conversation_id", conversationId).mo27257a("conversation_type", Integer.valueOf(conversation.getConversationType())).mo27260b();
    }
}
