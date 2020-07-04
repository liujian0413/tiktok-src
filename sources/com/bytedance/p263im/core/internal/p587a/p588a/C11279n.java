package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.model.C11469m;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.p585a.C11194a;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.GetStrangerConversationListRequestBody.Builder;
import com.bytedance.p263im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.a.n */
final class C11279n extends C11280o<List<Conversation>> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27278a() {
        return true;
    }

    C11279n(C11194a<List<Conversation>> aVar) {
        super(IMCMD.GET_STRANGER_CONVERSATION_LIST.getValue(), aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.get_stranger_conversation_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27300a(long j, long j2) {
        boolean z;
        if (j2 <= 0) {
            j2 = 50;
        }
        Builder cursor = new Builder().count(Long.valueOf(j2)).cursor(Long.valueOf(j));
        if (j == 0) {
            z = true;
        } else {
            z = false;
        }
        mo27301a(0, new RequestBody.Builder().get_stranger_conversation_body(cursor.show_total_unread(Boolean.valueOf(z)).build()).build(), null, new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        long j;
        boolean z;
        int i = 0;
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            C11209d.m32821a(eVar, false).mo27260b();
            mo27305b(eVar);
            return;
        }
        GetStrangerConversationListResponseBody getStrangerConversationListResponseBody = eVar.f30858g.body.get_stranger_conversation_body;
        List a = C11401b.m33576a(getStrangerConversationListResponseBody.conversation_list);
        if (getStrangerConversationListResponseBody.next_cursor != null) {
            j = getStrangerConversationListResponseBody.next_cursor.longValue();
        } else {
            j = -1;
        }
        if (getStrangerConversationListResponseBody.has_more != null) {
            z = getStrangerConversationListResponseBody.has_more.booleanValue();
        } else {
            z = false;
        }
        mo27303a(a, j, z);
        C11469m a2 = C11469m.m33840a();
        if (getStrangerConversationListResponseBody.total_unread != null) {
            i = getStrangerConversationListResponseBody.total_unread.intValue();
        }
        a2.mo27685a(i);
        C11209d.m32821a(eVar, true).mo27260b();
    }
}
