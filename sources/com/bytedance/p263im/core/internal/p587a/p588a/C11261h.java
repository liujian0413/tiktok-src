package com.bytedance.p263im.core.internal.p587a.p588a;

import android.util.Pair;
import com.bytedance.p263im.core.internal.p587a.C11211a;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11369m;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationInfoV2;
import com.bytedance.p263im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.im.core.internal.a.a.h */
final class C11261h extends C11280o<Conversation> {
    C11261h() {
        super(IMCMD.GET_CONVERSATION_INFO_V2.getValue());
    }

    /* renamed from: a */
    public final void mo27295a(String str) {
        Conversation a = C6417a.m20015a().mo15530a(str);
        if (a == null || a.isTemp()) {
            mo27305b(C11391e.m33515a(-1017));
        } else if (C11211a.m32844b(str)) {
            StringBuilder sb = new StringBuilder("Get Conversation Info running: ");
            sb.append(str);
            C11404d.m33589c(sb.toString());
            mo27305b(C11391e.m33515a(-1018));
        } else {
            RequestBody build = new Builder().get_conversation_info_v2_body(new GetConversationInfoV2RequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).build()).build();
            mo27301a(a.getInboxType(), build, null, str, Long.valueOf(a.getConversationShortId()), Integer.valueOf(a.getConversationType()), Long.valueOf(a.getUpdatedTime()));
            C11211a.m32845c(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.get_conversation_info_v2_body == null || eVar.f30858g.body.get_conversation_info_v2_body.conversation_info == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static Conversation m32984a(int i, MessageBody messageBody) {
        return m32986b(i, messageBody.conversation_id, messageBody.conversation_short_id.longValue(), messageBody.conversation_type.intValue(), messageBody.create_time.longValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        int intValue = eVar.f30857f.inbox_type.intValue();
        String str = (String) eVar.f30856e[0];
        boolean z = true;
        long longValue = ((Long) eVar.f30856e[1]).longValue();
        int intValue2 = ((Integer) eVar.f30856e[2]).intValue();
        long longValue2 = ((Long) eVar.f30856e[3]).longValue();
        C11211a.m32848d(str);
        StringBuilder sb = new StringBuilder("Get Conversation Info finish: ");
        sb.append(str);
        C11404d.m33589c(sb.toString());
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            z = false;
        }
        if (z) {
            ConversationInfoV2 conversationInfoV2 = eVar.f30858g.body.get_conversation_info_v2_body.conversation_info;
            final int i = intValue;
            final long j = longValue2;
            final ConversationInfoV2 conversationInfoV22 = conversationInfoV2;
            C112621 r1 = new C11318d<Pair<Conversation, Boolean>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Pair<Conversation, Boolean> mo15560a() {
                    return C11261h.m32982a(i, j, conversationInfoV22);
                }
            };
            final ConversationInfoV2 conversationInfoV23 = conversationInfoV2;
            final int i2 = intValue;
            final String str2 = str;
            final C11391e eVar2 = eVar;
            final Runnable runnable2 = runnable;
            C112632 r12 = new C11317c<Pair<Conversation, Boolean>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(Pair<Conversation, Boolean> pair) {
                    if (pair != null) {
                        C6417a.m20015a().mo15540b((Conversation) pair.first);
                        if (((Boolean) pair.second).booleanValue() && conversationInfoV23.first_page_participants.has_more != null && conversationInfoV23.first_page_participants.has_more.booleanValue()) {
                            new C11297t().mo27319a(((Conversation) pair.first).getConversationId(), (C11390d) null);
                        }
                        C11261h.this.mo27302a(pair.first);
                        C11211a.m32842b(i2, str2);
                        C11209d.m32821a(eVar2, true).mo27257a("conversation_id", str2).mo27260b();
                    } else {
                        C11261h.this.mo27305b(C11391e.m33515a(-3001));
                    }
                    runnable2.run();
                }
            };
            C11319e.m33191a(r1, r12);
            return;
        }
        mo27305b(eVar);
        runnable.run();
        C11209d.m32821a(eVar, false).mo27257a("conversation_id", str).mo27260b();
        if (eVar.f30860i == -1000) {
            m32987c(intValue, str, longValue, intValue2, longValue2);
        }
    }

    /* renamed from: a */
    static Pair<Conversation, Boolean> m32982a(int i, long j, ConversationInfoV2 conversationInfoV2) {
        return m32983a(i, j, conversationInfoV2, true);
    }

    /* renamed from: a */
    private static Pair<Conversation, Boolean> m32983a(int i, long j, ConversationInfoV2 conversationInfoV2, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        C11368l.m33375a();
        Conversation a = C11368l.m33377a(conversationInfoV2.conversation_id);
        if (a != null && !a.isMember() && conversationInfoV2.is_participant != null && !conversationInfoV2.is_participant.booleanValue()) {
            return null;
        }
        C11369m.m33392a();
        C11369m.m33404d(conversationInfoV2.conversation_id);
        C11369m.m33392a();
        String str = conversationInfoV2.conversation_id;
        if (conversationInfoV2.conversation_type == null) {
            i2 = -1;
        } else {
            i2 = conversationInfoV2.conversation_type.intValue();
        }
        C11369m.m33397a(str, i2, C11401b.m33574a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
        Conversation a2 = C11401b.m33564a(i, a, conversationInfoV2, j);
        if (a == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C11368l.m33375a();
            z3 = C11368l.m33380a(a2);
        } else {
            C11368l.m33375a();
            z3 = C11368l.m33384b(a2);
        }
        if (z3) {
            return new Pair<>(a2, Boolean.valueOf(z2));
        }
        return null;
    }

    /* renamed from: c */
    private static void m32987c(int i, String str, long j, int i2, long j2) {
        if (C11198c.m32777a().mo27248b().f30423w) {
            final int i3 = i;
            final String str2 = str;
            final long j3 = j;
            final int i4 = i2;
            final long j4 = j2;
            C112643 r1 = new C11318d<Conversation>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Conversation mo15560a() {
                    return C11261h.m32986b(i3, str2, j3, i4, j4);
                }
            };
            C11319e.m33191a(r1, new C11317c<Conversation>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo15561a(Object obj) {
                    m32998a((Conversation) obj);
                }

                /* renamed from: a */
                private static void m32998a(Conversation conversation) {
                    if (conversation != null) {
                        C6417a.m20015a().mo15540b(conversation);
                    }
                }
            });
            return;
        }
        C11211a.m32838a(i, str, j, i2, j2);
    }

    /* renamed from: a */
    public final synchronized void mo27294a(int i, String str, long j, int i2, long j2) {
        try {
            m32985a(i, str, j, i2, j2, false);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public static Conversation m32986b(int i, String str, long j, int i2, long j2) {
        C11368l.m33375a();
        if (C11368l.m33385b(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("create local conversation for net error: convId=");
        sb.append(str);
        sb.append(", shortId=");
        sb.append(j);
        sb.append(", type=");
        sb.append(i2);
        sb.append(", time=");
        sb.append(j2);
        C11404d.m33587b(sb.toString());
        Conversation conversation = new Conversation();
        conversation.setInboxType(i);
        conversation.setConversationId(str);
        conversation.setConversationShortId(j);
        conversation.setConversationType(i2);
        conversation.setUpdatedTime(j2);
        if (conversation.isSingleChat()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(C11198c.m32777a().f30372b.mo27230a()));
            arrayList.add(Long.valueOf(C6425b.m20074a(str)));
            conversation.setMemberIds(arrayList);
            conversation.setMemberCount(2);
        }
        conversation.setIsMember(true);
        conversation.setLastMessageIndex(C11375q.m33429a().mo27397g(str));
        C11375q.m33429a();
        conversation.setLastMessage(C11375q.m33450h(str));
        HashMap hashMap = new HashMap();
        hashMap.put("s:conv_wait_info", "1");
        conversation.setLocalExt(hashMap);
        C11368l.m33375a();
        if (C11368l.m33380a(conversation)) {
            return conversation;
        }
        return null;
    }

    /* renamed from: a */
    private synchronized void m32985a(int i, String str, long j, int i2, long j2, boolean z) {
        if (C11211a.m32844b(str)) {
            StringBuilder sb = new StringBuilder("Get Conversation Info running: ");
            sb.append(str);
            C11404d.m33589c(sb.toString());
            return;
        }
        mo27301a(i, new Builder().get_conversation_info_v2_body(new GetConversationInfoV2RequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).build()).build(), null, str, Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2));
        C11211a.m32845c(str);
    }
}
