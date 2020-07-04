package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11403c;
import com.bytedance.p263im.core.model.C11472n;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MessageType;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import com.bytedance.p263im.core.proto.SendMessageRequestBody;

/* renamed from: com.bytedance.im.core.internal.a.a.ac */
public final class C11219ac extends C11280o<Boolean> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        return true;
    }

    public C11219ac() {
        super(IMCMD.SEND_MESSAGE.getValue());
    }

    public C11219ac(C11195b<Boolean> bVar) {
        super(IMCMD.SEND_MESSAGE.getValue(), bVar);
    }

    /* renamed from: a */
    public final void mo27268a(C11472n nVar) {
        if (nVar == null || !nVar.mo27691a()) {
            mo27305b(C11391e.m33515a(-1015));
            return;
        }
        Conversation a = C6417a.m20015a().mo15530a(nVar.f31041b);
        if (a == null) {
            mo27305b(C11391e.m33515a(-1017));
            return;
        }
        try {
            mo27301a(a.getInboxType(), new Builder().send_message_body(new SendMessageRequestBody.Builder().conversation_id(a.getConversationId()).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).content(C11403c.f30887a.mo15979b((Object) nVar)).message_type(Integer.valueOf(MessageType.MESSAGE_TYPE_USER_ACTION.getValue())).ticket(a.getTicket()).build()).build(), null, new Object[0]);
        } catch (Exception unused) {
            mo27305b(C11391e.m33515a(-1015));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        runnable.run();
        mo27302a(Boolean.valueOf(true));
    }
}
