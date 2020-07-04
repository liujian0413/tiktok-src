package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11374p;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MarkConversationReadRequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;

/* renamed from: com.bytedance.im.core.internal.a.a.v */
final class C11301v extends C11280o {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        return true;
    }

    C11301v() {
        super(IMCMD.MARK_CONVERSATION_READ_V3.getValue());
    }

    /* renamed from: a */
    public final void mo27322a(final String str) {
        C11319e.m33191a(new C11318d<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Conversation mo15560a() {
                C11368l.m33375a();
                Conversation a = C11368l.m33377a(str);
                C11374p.m33421a();
                C11374p.m33426b(str);
                if (a == null) {
                    return null;
                }
                if (a.getLastMessageIndex() <= a.getReadIndex() && a.getUnreadCount() == 0) {
                    return null;
                }
                a.setUnreadCount(0);
                a.setReadIndex(a.getLastMessageIndex());
                a.setMentionMessages(null);
                C11368l.m33375a();
                boolean b = C11368l.m33384b(a);
                if (b) {
                    C11375q.m33429a();
                    C11375q.m33451i(str);
                }
                if (b) {
                    return a;
                }
                return null;
            }
        }, new C11317c<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Conversation conversation) {
                if (conversation != null) {
                    C6417a.m20015a().mo15540b(conversation);
                    C11301v.this.mo27321a(conversation);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo27321a(Conversation conversation) {
        mo27301a(conversation.getInboxType(), new Builder().mark_conversation_read_body(new MarkConversationReadRequestBody.Builder().conversation_id(conversation.getConversationId()).conversation_short_id(Long.valueOf(conversation.getConversationShortId())).conversation_type(Integer.valueOf(conversation.getConversationType())).read_message_index(Long.valueOf(conversation.getReadIndex())).build()).build(), null, new Object[0]);
    }
}
