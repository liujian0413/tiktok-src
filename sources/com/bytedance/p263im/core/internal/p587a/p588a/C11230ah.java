package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11367k;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationCoreInfo;
import com.bytedance.p263im.core.proto.ConversationOperationStatus;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import com.bytedance.p263im.core.proto.SetConversationCoreInfoRequestBody;

/* renamed from: com.bytedance.im.core.internal.a.a.ah */
final class C11230ah extends C11280o<Conversation> {
    C11230ah() {
        super(IMCMD.SET_CONVERSATION_CORE_INFO.getValue());
    }

    C11230ah(C11195b<Conversation> bVar) {
        super(IMCMD.SET_CONVERSATION_CORE_INFO.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.set_conversation_core_info_body == null || eVar.f30858g.body.set_conversation_core_info_body.status == null || eVar.f30858g.body.set_conversation_core_info_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || eVar.f30858g.body.set_conversation_core_info_body.conversation_core_info == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        final String str = (String) eVar.f30856e[0];
        final String str2 = (String) eVar.f30856e[1];
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            mo27305b(eVar);
            runnable.run();
            C11209d.m32821a(eVar, false).mo27257a("conversation_id", str).mo27257a("keys", str2).mo27260b();
            return;
        }
        final ConversationCoreInfo conversationCoreInfo = eVar.f30858g.body.set_conversation_core_info_body.conversation_core_info;
        C112311 r1 = new C11318d<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Conversation mo15560a() {
                C11367k.m33368a();
                com.bytedance.p263im.core.model.ConversationCoreInfo a = C11401b.m33565a(conversationCoreInfo.conversation_id, C11367k.m33370a(conversationCoreInfo.conversation_id), conversationCoreInfo);
                C11367k.m33368a();
                if (!C11367k.m33372a(a)) {
                    return null;
                }
                C11368l.m33375a();
                return C11368l.m33377a(conversationCoreInfo.conversation_id);
            }
        };
        final C11391e eVar2 = eVar;
        final Runnable runnable2 = runnable;
        C112322 r2 = new C11317c<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Conversation conversation) {
                if (conversation != null) {
                    C6417a.m20015a().mo15540b(conversation);
                    C11230ah.this.mo27302a(conversation);
                    C11209d.m32821a(eVar2, true).mo27257a("conversation_id", str).mo27257a("keys", str2).mo27260b();
                } else {
                    C11230ah.this.mo27305b(C11391e.m33515a(-3001));
                    C11209d.m32821a(eVar2, false).mo27257a("conversation_id", str).mo27257a("keys", str2).mo27260b();
                }
                runnable2.run();
            }
        };
        C11319e.m33191a(r1, r2);
    }

    /* renamed from: a */
    public final long mo27271a(String str, String str2, C11390d dVar) {
        Conversation a = C6417a.m20015a().mo15530a(str);
        RequestBody build = new Builder().set_conversation_core_info_body(new SetConversationCoreInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).name(str2).is_name_set(Boolean.valueOf(true)).build()).build();
        return mo27301a(a.getInboxType(), build, null, str, "s:name");
    }

    /* renamed from: b */
    public final long mo27272b(String str, String str2, C11390d dVar) {
        Conversation a = C6417a.m20015a().mo15530a(str);
        RequestBody build = new Builder().set_conversation_core_info_body(new SetConversationCoreInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).notice(str2).is_notice_set(Boolean.valueOf(true)).build()).build();
        return mo27301a(a.getInboxType(), build, null, str, "s:notice");
    }
}
