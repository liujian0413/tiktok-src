package com.bytedance.p263im.core.internal.p587a.p588a;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11369m;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationOperationStatus;
import com.bytedance.p263im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.p263im.core.proto.CreateConversationV2RequestBody.Builder;
import com.bytedance.p263im.core.proto.CreateConversationV2ResponseBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bytedance.im.core.internal.a.a.e */
final class C11252e extends C11280o<Conversation> {
    C11252e() {
        super(IMCMD.CREATE_CONVERSATION_V2.getValue());
    }

    C11252e(C11195b<Conversation> bVar) {
        super(IMCMD.CREATE_CONVERSATION_V2.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.create_conversation_v2_body == null || eVar.f30858g.body.create_conversation_v2_body.status == null || eVar.f30858g.body.create_conversation_v2_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || eVar.f30858g.body.create_conversation_v2_body.conversation == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(final C11391e eVar, final Runnable runnable) {
        boolean z;
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final CreateConversationV2ResponseBody createConversationV2ResponseBody = eVar.f30858g.body.create_conversation_v2_body;
            C11319e.m33191a(new C11318d<Conversation>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Conversation mo15560a() {
                    boolean z;
                    int i;
                    boolean z2;
                    C11368l.m33375a();
                    Conversation a = C11368l.m33377a(createConversationV2ResponseBody.conversation.conversation_id);
                    if (a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C11369m.m33392a();
                    String str = createConversationV2ResponseBody.conversation.conversation_id;
                    if (createConversationV2ResponseBody.conversation.conversation_type == null) {
                        i = -1;
                    } else {
                        i = createConversationV2ResponseBody.conversation.conversation_type.intValue();
                    }
                    C11369m.m33397a(str, i, C11401b.m33574a(createConversationV2ResponseBody.conversation.conversation_id, createConversationV2ResponseBody.conversation.first_page_participants.participants));
                    Conversation a2 = C11401b.m33564a(eVar.f30858g.inbox_type.intValue(), a, createConversationV2ResponseBody.conversation, System.currentTimeMillis());
                    a2.setUpdatedTime(System.currentTimeMillis());
                    if (z) {
                        C11368l.m33375a();
                        z2 = C11368l.m33384b(a2);
                    } else {
                        C11368l.m33375a();
                        z2 = C11368l.m33380a(a2);
                    }
                    if (z2) {
                        return a2;
                    }
                    return null;
                }
            }, new C11317c<Conversation>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(Conversation conversation) {
                    if (conversation != null) {
                        C6417a.m20015a().mo15545c(conversation);
                        C11252e.this.mo27304a(conversation, eVar);
                    } else {
                        C11252e.this.mo27305b(C11391e.m33515a(-3001));
                    }
                    runnable.run();
                    C11209d.m32821a(eVar, true).mo27257a("conversation_id", createConversationV2ResponseBody.conversation.conversation_id).mo27257a("conversation_type", createConversationV2ResponseBody.conversation.conversation_type).mo27257a("total_count", createConversationV2ResponseBody.conversation.participants_count).mo27260b();
                }
            });
            return;
        }
        mo27305b(eVar);
        runnable.run();
        C11209d.m32821a(eVar, false).mo27260b();
    }

    /* renamed from: a */
    public final long mo27288a(int i, long j, C11390d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(C11198c.m32777a().f30372b.mo27230a()));
        arrayList.add(Long.valueOf(j));
        return m32955a(i, C11203a.f30380a, arrayList, null, null, dVar);
    }

    /* renamed from: a */
    public final long mo27289a(int i, List<Long> list, String str, Map<String, String> map, C11390d dVar) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        if (!list.contains(Long.valueOf(C11198c.m32777a().f30372b.mo27230a()))) {
            list.add(0, Long.valueOf(C11198c.m32777a().f30372b.mo27230a()));
        }
        return m32955a(i, C11203a.f30381b, list, str, map, null);
    }

    /* renamed from: a */
    private long m32955a(int i, int i2, List<Long> list, String str, Map<String, String> map, C11390d dVar) {
        CreateConversationV2RequestBody createConversationV2RequestBody;
        if (list.contains(Long.valueOf(-1)) && C11404d.m33586a()) {
            throw new IllegalArgumentException("id is invalid");
        } else if (list.contains(Long.valueOf(-1))) {
            if (dVar != null) {
                dVar.mo18275b(C11391e.m33515a(-1015));
            }
            mo27305b(C11391e.m33515a(-1015));
            return -1;
        } else {
            Builder participants = new Builder().conversation_type(Integer.valueOf(i2)).participants(list);
            if (map != null) {
                participants.biz_ext(map);
            }
            if (i2 == C11203a.f30380a) {
                createConversationV2RequestBody = participants.build();
            } else {
                boolean z = !TextUtils.isEmpty(str);
                Builder persistent = participants.persistent(Boolean.valueOf(z));
                if (!z) {
                    str = UUID.randomUUID().toString();
                }
                createConversationV2RequestBody = persistent.idempotent_id(str).build();
            }
            return mo27301a(i, new RequestBody.Builder().create_conversation_v2_body(createConversationV2RequestBody).build(), dVar, new Object[0]);
        }
    }
}
