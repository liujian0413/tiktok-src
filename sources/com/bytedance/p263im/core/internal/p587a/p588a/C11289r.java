package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationLeaveRequestBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;

/* renamed from: com.bytedance.im.core.internal.a.a.r */
final class C11289r extends C11280o<String> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        return true;
    }

    C11289r() {
        super(IMCMD.LEAVE_CONVERSATION.getValue());
    }

    C11289r(C11195b<String> bVar) {
        super(IMCMD.LEAVE_CONVERSATION.getValue(), bVar);
    }

    /* renamed from: a */
    public final long mo27316a(String str, C11390d dVar) {
        return m33110a(str, null, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        final String str = (String) eVar.f30856e[0];
        final boolean booleanValue = ((Boolean) eVar.f30856e[1]).booleanValue();
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            mo27305b(eVar);
            runnable.run();
            C11209d.m32821a(eVar, false).mo27257a("conversation_id", str).mo27260b();
            return;
        }
        C112901 r0 = new C11318d<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Boolean mo15560a() {
                C11368l.m33375a();
                C11368l.m33390d(str);
                return Boolean.valueOf(true);
            }
        };
        final Runnable runnable2 = runnable;
        final C11391e eVar2 = eVar;
        C112912 r2 = new C11317c<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Boolean bool) {
                if (bool.booleanValue()) {
                    Conversation a = C6417a.m20015a().mo15530a(str);
                    C6417a.m20015a().mo15534a(a);
                    if (a != null && booleanValue) {
                        new C11255f().mo27290a(a.getInboxType(), str, a.getConversationShortId(), a.getConversationType(), a.getLastMessageIndex());
                    }
                    C11289r.this.mo27302a(str);
                }
                runnable2.run();
                C11209d.m32821a(eVar2, true).mo27257a("conversation_id", str).mo27260b();
            }
        };
        C11319e.m33191a(r0, r2);
    }

    /* renamed from: a */
    private long m33110a(String str, C11390d dVar, boolean z) {
        Conversation a = C6417a.m20015a().mo15530a(str);
        RequestBody build = new Builder().leave_conversation_body(new ConversationLeaveRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).build()).build();
        return mo27301a(a.getInboxType(), build, dVar, str, Boolean.valueOf(true));
    }
}
