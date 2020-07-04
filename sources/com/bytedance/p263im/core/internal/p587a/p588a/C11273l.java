package com.bytedance.p263im.core.internal.p587a.p588a;

import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11369m;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.p585a.C11194a;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationInfoV2;
import com.bytedance.p263im.core.proto.ConversationType;
import com.bytedance.p263im.core.proto.GetUserConversationListRequestBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import com.bytedance.p263im.core.proto.SortType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.a.l */
public final class C11273l extends C11280o<List<Conversation>> {

    /* renamed from: a */
    public int f30569a;

    public C11273l() {
        super(IMCMD.GET_USER_CONVERSATION_LIST.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.get_conversation_list_body == null || eVar.f30858g.body.get_conversation_list_body.list == null) {
            return false;
        }
        return true;
    }

    C11273l(C11194a<List<Conversation>> aVar, int i) {
        super(IMCMD.GET_USER_CONVERSATION_LIST.getValue(), aVar);
        this.f30569a = i;
    }

    /* renamed from: a */
    public final void mo27298a(int i, long j) {
        mo27301a(this.f30569a, new Builder().get_conversation_list_body(new GetUserConversationListRequestBody.Builder().con_type(ConversationType.fromValue(i)).cursor(Long.valueOf(j)).sort_type(SortType.JOIN_TIME).build()).build(), null, new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            C11209d.m32821a(eVar, false).mo27260b();
            mo27305b(eVar);
            return;
        }
        final List<ConversationInfoV2> list = eVar.f30858g.body.get_conversation_list_body.list;
        final boolean booleanValue = eVar.f30858g.body.get_conversation_list_body.has_more.booleanValue();
        final long longValue = eVar.f30858g.body.get_conversation_list_body.next_cursor.longValue();
        C112741 r0 = new C11318d<List<Conversation>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public List<Conversation> mo15560a() {
                int i;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (ConversationInfoV2 conversationInfoV2 : list) {
                    C11368l.m33375a();
                    Conversation a = C11368l.m33377a(conversationInfoV2.conversation_id);
                    if (a == null) {
                        C11369m.m33392a();
                        String str = conversationInfoV2.conversation_id;
                        if (conversationInfoV2.conversation_type == null) {
                            i = -1;
                        } else {
                            i = conversationInfoV2.conversation_type.intValue();
                        }
                        C11369m.m33401b(str, i, C11401b.m33574a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                        a = C11401b.m33564a(C11273l.this.f30569a, (Conversation) null, conversationInfoV2, 0);
                        C11368l.m33375a();
                        C11368l.m33380a(a);
                        C6417a.m20015a().mo15540b(a);
                    }
                    arrayList.add(a);
                }
                return arrayList;
            }
        };
        final C11391e eVar2 = eVar;
        C112752 r1 = new C11317c<List<Conversation>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(List<Conversation> list) {
                C11209d.m32821a(eVar2, true).mo27260b();
                C11273l.this.mo27303a(list, longValue, booleanValue);
            }
        };
        C11319e.m33191a(r0, r1);
    }
}
