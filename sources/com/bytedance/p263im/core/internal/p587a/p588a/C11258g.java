package com.bytedance.p263im.core.internal.p587a.p588a;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.proto.DeleteMessageRequestBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody.Builder;

/* renamed from: com.bytedance.im.core.internal.a.a.g */
final class C11258g extends C11280o<Message> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        return true;
    }

    C11258g() {
        super(IMCMD.DELETE_MESSAGE.getValue());
    }

    /* renamed from: a */
    public final void mo27292a(Message message) {
        mo27293a(message, false);
    }

    C11258g(C11195b<Message> bVar) {
        super(IMCMD.DELETE_MESSAGE.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: a */
    public final void mo27293a(final Message message, boolean z) {
        final String uuid = message.getUuid();
        final String conversationId = message.getConversationId();
        if (!TextUtils.isEmpty(uuid) && !TextUtils.isEmpty(conversationId)) {
            Conversation a = C6417a.m20015a().mo15530a(conversationId);
            if (a != null && message.getMsgId() > 0 && !z) {
                m32973a(a.getInboxType(), conversationId, message.getConversationShortId(), message.getConversationType(), message.getMsgId());
            }
            C11319e.m33191a(new C11318d<Conversation>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Conversation mo15560a() {
                    C11375q.m33429a();
                    boolean a = C11375q.m33438a(uuid);
                    Conversation a2 = C6417a.m20015a().mo15530a(conversationId);
                    if (!a || a2 == null || ((a2.getLastMessage() == null || !uuid.equals(a2.getLastMessage().getUuid())) && !message.isMention())) {
                        return null;
                    }
                    C11368l.m33375a();
                    return C11368l.m33377a(conversationId);
                }
            }, new C11317c<Conversation>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(Conversation conversation) {
                    if (conversation != null) {
                        C6417a.m20015a().mo15540b(conversation);
                        C11258g.this.mo27302a(message);
                        return;
                    }
                    C11258g.this.mo27305b(C11391e.m33515a(-3001));
                }
            });
            C11407f.m33601a().mo27447a(message);
        }
    }

    /* renamed from: a */
    private void m32973a(int i, String str, long j, int i2, long j2) {
        mo27301a(i, new Builder().delete_message_body(new DeleteMessageRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).message_id(Long.valueOf(j2)).build()).build(), null, new Object[0]);
    }
}
