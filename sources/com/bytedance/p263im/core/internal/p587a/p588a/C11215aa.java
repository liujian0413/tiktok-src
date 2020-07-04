package com.bytedance.p263im.core.internal.p587a.p588a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11369m;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationOperationStatus;
import com.bytedance.p263im.core.proto.ConversationRemoveParticipantsRequestBody.Builder;
import com.bytedance.p263im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.a.aa */
final class C11215aa extends C11280o<List<Member>> {
    C11215aa() {
        super(IMCMD.REMOVE_CONVERSATION_PARTICIPANTS.getValue());
    }

    C11215aa(C11195b<List<Member>> bVar) {
        super(IMCMD.REMOVE_CONVERSATION_PARTICIPANTS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.conversation_remove_participants_body == null || eVar.f30858g.body.conversation_remove_participants_body.status == null || eVar.f30858g.body.conversation_remove_participants_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<Member> m32867a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l : list) {
            if (l != null) {
                Member member = new Member();
                member.setUid(l.longValue());
                member.setConversationId(str);
                arrayList.add(member);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(final C11391e eVar, final Runnable runnable) {
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            mo27305b(eVar);
            runnable.run();
            C11209d.m32821a(eVar, false).mo27260b();
            return;
        }
        final String str = (String) eVar.f30856e[0];
        final List list = (List) eVar.f30856e[1];
        final ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody = eVar.f30858g.body.conversation_remove_participants_body;
        C11319e.m33191a(new C11318d<Pair<Conversation, List<Member>>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Pair<Conversation, List<Member>> mo15560a() {
                if (conversationRemoveParticipantsResponseBody.failed_participants != null) {
                    list.removeAll(conversationRemoveParticipantsResponseBody.failed_participants);
                }
                if (list.size() <= 0) {
                    return null;
                }
                C11369m.m33392a();
                List a = C11369m.m33396a(str, list);
                C11369m.m33392a();
                int b = C11369m.m33398b(str, list);
                C11368l.m33375a();
                Conversation a2 = C11368l.m33377a(str);
                if (a2 != null && b > 0) {
                    a2.setMemberCount(Math.max(0, a2.getMemberCount() - b));
                    C11368l.m33375a();
                    C11368l.m33384b(a2);
                }
                if (a == null || a.isEmpty()) {
                    a = C11215aa.m32867a(str, list);
                }
                return new Pair<>(a2, a);
            }
        }, new C11317c<Pair<Conversation, List<Member>>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Pair<Conversation, List<Member>> pair) {
                List list;
                if (pair != null) {
                    if (pair.first != null) {
                        C6417a.m20015a().mo15540b((Conversation) pair.first);
                    }
                    C11407f.m33601a().mo15542b((List) pair.second);
                    C11209d.m32821a(eVar, true).mo27260b();
                }
                C11215aa aaVar = C11215aa.this;
                if (pair != null) {
                    list = (List) pair.second;
                } else {
                    list = null;
                }
                aaVar.mo27302a(list);
                runnable.run();
            }
        });
    }

    /* renamed from: a */
    public final long mo27266a(String str, List<Long> list, Map<String, String> map, C11390d dVar) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        Conversation a = C6417a.m20015a().mo15530a(str);
        Builder participants = new Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).participants(list);
        if (map != null) {
            participants.biz_ext(map);
        }
        RequestBody build = new RequestBody.Builder().conversation_remove_participants_body(participants.build()).build();
        return mo27301a(a.getInboxType(), build, null, str, list);
    }
}
