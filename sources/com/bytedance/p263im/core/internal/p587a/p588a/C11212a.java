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
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationAddParticipantsRequestBody.Builder;
import com.bytedance.p263im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.p263im.core.proto.ConversationOperationStatus;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.SecUidPair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.a.a */
final class C11212a extends C11280o<List<Member>> {

    /* renamed from: a */
    public long f30440a = -1;

    C11212a() {
        super(IMCMD.ADD_CONVERSATION_PARTICIPANTS.getValue());
    }

    C11212a(C11195b<List<Member>> bVar) {
        super(IMCMD.ADD_CONVERSATION_PARTICIPANTS.getValue(), bVar);
    }

    /* renamed from: a */
    public final void mo27264a(String str) {
        Conversation conversation = new Conversation();
        conversation.setConversationId(str);
        conversation.setConversationShortId(this.f30440a);
        conversation.setConversationType(C11203a.f30381b);
        conversation.setIsMember(true);
        C11368l.m33375a();
        C11368l.m33384b(conversation);
    }

    /* renamed from: a */
    public static Map<Long, String> m32857a(ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
        if (conversationAddParticipantsResponseBody == null) {
            return null;
        }
        List<SecUidPair> list = conversationAddParticipantsResponseBody.sec_success_participants;
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (SecUidPair secUidPair : list) {
            if (!(secUidPair == null || secUidPair.uid == null)) {
                hashMap.put(secUidPair.uid, secUidPair.sec_uid);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.conversation_add_participants_body == null || eVar.f30858g.body.conversation_add_participants_body.status == null || eVar.f30858g.body.conversation_add_participants_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        boolean z;
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            z = false;
        } else {
            z = true;
        }
        String str = (String) eVar.f30856e[0];
        final List list = (List) eVar.f30856e[1];
        int size = list.size();
        if (z) {
            final ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = eVar.f30858g.body.conversation_add_participants_body;
            final String str2 = str;
            final C11391e eVar2 = eVar;
            C112131 r4 = new C11318d<Pair<Conversation, List<Member>>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Pair<Conversation, List<Member>> mo15560a() {
                    int i;
                    if (conversationAddParticipantsResponseBody.failed_participants != null) {
                        list.removeAll(conversationAddParticipantsResponseBody.failed_participants);
                    }
                    C11369m.m33392a();
                    long c = C11369m.m33403c(str2);
                    Conversation a = C6417a.m20015a().mo15530a(str2);
                    if (C11212a.this.f30440a > 0 && a == null) {
                        C11212a.this.mo27264a(str2);
                    }
                    C11369m.m33392a();
                    String str = str2;
                    if (a == null) {
                        i = -1;
                    } else {
                        i = a.getConversationType();
                    }
                    C11369m.m33397a(str, i, C11401b.m33575a(str2, list, C11212a.m32857a(conversationAddParticipantsResponseBody), c));
                    C11368l.m33375a();
                    Conversation a2 = C11368l.m33377a(str2);
                    if (a2 != null) {
                        if (eVar2.f30858g != null) {
                            a2.setInboxType(eVar2.f30858g.inbox_type.intValue());
                        }
                        a2.setMemberCount(a2.getMemberCount() + list.size());
                        C11368l.m33375a();
                        C11368l.m33384b(a2);
                    }
                    C11369m.m33392a();
                    return new Pair<>(a2, C11369m.m33396a(str2, list));
                }
            };
            final C11391e eVar3 = eVar;
            final String str3 = str;
            final int i = size;
            final Runnable runnable2 = runnable;
            C112142 r42 = new C11317c<Pair<Conversation, List<Member>>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(Pair<Conversation, List<Member>> pair) {
                    if (pair.first != null) {
                        C6417a.m20015a().mo15540b((Conversation) pair.first);
                    }
                    C11212a.this.mo27304a(pair.second, eVar3);
                    C11407f.m33601a().mo15537a((List) pair.second);
                    C11209d.m32821a(eVar3, true).mo27257a("conversation_id", str3).mo27257a("total_count", Integer.valueOf(i)).mo27257a("count", Integer.valueOf(((List) pair.second).size())).mo27260b();
                    runnable2.run();
                }
            };
            C11319e.m33191a(r4, r42);
            return;
        }
        mo27305b(eVar);
        runnable.run();
        C11209d.m32821a(eVar, false).mo27257a("conversation_id", str).mo27257a("total_count", Integer.valueOf(size)).mo27260b();
    }

    /* renamed from: a */
    public final long mo27261a(String str, long j, List<Long> list, Map<String, String> map) {
        this.f30440a = j;
        return m32856a(str, j, list, C11203a.f30381b, 0, map, null);
    }

    /* renamed from: a */
    public final long mo27262a(String str, List<Long> list, Map<String, String> map, C11390d dVar) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        Conversation a = C6417a.m20015a().mo15530a(str);
        if (a == null) {
            return -1;
        }
        return m32856a(str, a.getConversationShortId(), list, a.getConversationType(), a.getInboxType(), map, null);
    }

    /* renamed from: a */
    private long m32856a(String str, long j, List<Long> list, int i, int i2, Map<String, String> map, C11390d dVar) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return -1;
        }
        Builder participants = new Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i)).participants(list);
        if (map != null) {
            participants.biz_ext(map);
        }
        return mo27301a(i2, new RequestBody.Builder().conversation_add_participants_body(participants.build()).build(), dVar, str, list);
    }
}
