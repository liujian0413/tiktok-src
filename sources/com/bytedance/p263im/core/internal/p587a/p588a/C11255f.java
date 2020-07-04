package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.p587a.C11211a;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.proto.DeleteConversationRequestBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody.Builder;

/* renamed from: com.bytedance.im.core.internal.a.a.f */
final class C11255f extends C11280o<String> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        return true;
    }

    C11255f() {
        super(IMCMD.MARK_CONVERSATION_DELETE.getValue());
    }

    /* renamed from: a */
    public final void mo27291a(String str) {
        m32964a(str, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: a */
    private void m32964a(final String str, boolean z) {
        Conversation a = C6417a.m20015a().mo15530a(str);
        if (a != null && !a.isTemp()) {
            mo27290a(a.getInboxType(), str, a.getConversationShortId(), a.getConversationType(), a.getLastMessageIndex());
        }
        C11319e.m33191a(new C11318d<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Boolean mo15560a() {
                C11368l.m33375a();
                return Boolean.valueOf(C11368l.m33390d(str));
            }
        }, new C11317c<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Boolean bool) {
                if (bool.booleanValue()) {
                    C11255f.this.mo27302a(str);
                } else {
                    C11255f.this.mo27305b(C11391e.m33515a(-3001));
                }
            }
        });
        C6417a.m20015a().mo15534a(a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27290a(int i, String str, long j, int i2, long j2) {
        C11211a.m32842b(i, str);
        mo27301a(i, new Builder().delete_conversation_body(new DeleteConversationRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).last_message_index(Long.valueOf(j2)).build()).build(), null, new Object[0]);
    }
}
