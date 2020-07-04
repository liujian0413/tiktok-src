package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11374p;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11405e;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RecallMessageRequestBody;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.a.z */
final class C11311z extends C11280o<Message> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        return true;
    }

    C11311z() {
        super(IMCMD.RECALL_MESSAGE.getValue());
    }

    /* renamed from: b */
    private void m33173b(final Message message) {
        C11319e.m33191a(new C11318d<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Boolean mo15560a() {
                Map ext = message.getExt();
                ext.put("s:is_recalled", "true");
                message.putExt(ext);
                List mentionIds = message.getMentionIds();
                if (mentionIds != null && !mentionIds.isEmpty()) {
                    C11374p.m33421a();
                    if (C11374p.m33424a(message.getUuid())) {
                        C6417a a = C6417a.m20015a();
                        C11368l.m33375a();
                        a.mo15540b(C11368l.m33377a(message.getConversationId()));
                    }
                }
                return Boolean.valueOf(C11375q.m33429a().mo27396a(message));
            }
        }, new C11317c<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Boolean bool) {
                if (bool.booleanValue()) {
                    C11311z.this.mo27302a(message);
                    C11407f.m33601a().mo27456b(message);
                    return;
                }
                C11311z.this.mo27305b(C11391e.m33515a(-3001));
            }
        });
    }

    C11311z(C11195b<Message> bVar) {
        super(IMCMD.RECALL_MESSAGE.getValue(), bVar);
    }

    /* renamed from: a */
    public final void mo27324a(Message message) {
        if (message.isSelf()) {
            if (C11405e.m33600d(message)) {
                Conversation a = C6417a.m20015a().mo15530a(message.getConversationId());
                RequestBody build = new Builder().recall_message_body(new RecallMessageRequestBody.Builder().conversation_id(message.getConversationId()).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).server_message_id(Long.valueOf(message.getMsgId())).build()).build();
                mo27301a(a.getInboxType(), build, null, message);
                return;
            }
            m33173b(message);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        Message message = (Message) eVar.f30856e[0];
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            mo27305b(eVar);
        } else {
            m33173b(message);
        }
    }
}
