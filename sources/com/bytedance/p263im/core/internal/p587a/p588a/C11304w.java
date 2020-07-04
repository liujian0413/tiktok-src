package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11374p;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MarkConversationReadNotify;
import com.bytedance.p263im.core.proto.ResponseBody;

/* renamed from: com.bytedance.im.core.internal.a.a.w */
final class C11304w extends C11240b {
    C11304w() {
        super(IMCMD.MARK_READ_NOTIFY.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27275a(int i, ResponseBody responseBody) {
        final MarkConversationReadNotify markConversationReadNotify = responseBody.mark_conversation_read_notify;
        C11319e.m33191a(new C11318d<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Conversation mo15560a() {
                long j;
                C11368l.m33375a();
                Conversation a = C11368l.m33377a(markConversationReadNotify.conversation_id);
                if (a == null || markConversationReadNotify.read_index.longValue() <= a.getReadIndex()) {
                    return null;
                }
                long unreadCount = a.getUnreadCount();
                C11375q.m33429a();
                long a2 = unreadCount - C11375q.m33428a(a.getConversationId(), a.getReadIndex(), markConversationReadNotify.read_index.longValue(), C11198c.m32777a().f30372b.mo27230a());
                if (a2 >= 0) {
                    j = a2;
                } else {
                    j = 0;
                }
                a.setUnreadCount(j);
                a.setReadIndex(markConversationReadNotify.read_index.longValue());
                if (a2 <= 0) {
                    C11374p.m33421a();
                    C11374p.m33426b(markConversationReadNotify.conversation_id);
                    a.setMentionMessages(null);
                } else {
                    C11374p.m33421a();
                    a.setMentionMessages(C11374p.m33422a(markConversationReadNotify.conversation_id, markConversationReadNotify.read_index.longValue()));
                }
                C11368l.m33375a();
                if (C11368l.m33384b(a)) {
                    return a;
                }
                return null;
            }
        }, new C11317c<Conversation>() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo15561a(Object obj) {
                m33156a((Conversation) obj);
            }

            /* renamed from: a */
            private static void m33156a(Conversation conversation) {
                if (conversation != null) {
                    C6417a.m20015a().mo15540b(conversation);
                }
            }
        });
    }
}
