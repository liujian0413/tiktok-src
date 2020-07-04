package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MarkStrangerAllConversationReadRequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;

/* renamed from: com.bytedance.im.core.internal.a.a.u */
final class C11300u extends C11280o<Boolean> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27278a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27320b() {
        mo27301a(0, new Builder().mark_stranger_all_conversation_read_body(new MarkStrangerAllConversationReadRequestBody.Builder().build()).build(), null, new Object[0]);
    }

    C11300u(C11195b<Boolean> bVar) {
        super(IMCMD.MARK_ALL_STRANGER_CONVERSATIONS_READ.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        if (eVar.mo27431g()) {
            mo27302a(Boolean.valueOf(true));
        } else {
            mo27305b(eVar);
        }
    }
}
