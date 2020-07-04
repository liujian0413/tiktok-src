package com.bytedance.p263im.core.internal.p587a.p588a;

import android.util.Pair;
import com.bytedance.p263im.core.internal.p587a.C11211a;
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
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationParticipantsListRequestBody;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.ParticipantsPage;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.a.t */
final class C11297t extends C11280o<List<Member>> {

    /* renamed from: a */
    public List<Member> f30620a = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27278a() {
        return true;
    }

    C11297t() {
        super(IMCMD.CONVERSATION_PARTICIPANTS_LIST.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.conversation_participants_body == null || eVar.f30858g.body.conversation_participants_body.participants_page == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final long mo27319a(String str, C11390d dVar) {
        return m33132a(str, 0, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(final C11391e eVar, final Runnable runnable) {
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            mo27305b(eVar);
            runnable.run();
            C11209d.m32821a(eVar, false).mo27260b();
        } else {
            ParticipantsPage participantsPage = eVar.f30858g.body.conversation_participants_body.participants_page;
            final String str = (String) eVar.f30856e[0];
            this.f30620a.addAll(C11401b.m33574a(str, participantsPage.participants));
            if (participantsPage.has_more.booleanValue()) {
                m33132a(str, participantsPage.cursor.longValue(), eVar.f30855d);
            } else {
                C11319e.m33191a(new C11318d<Pair<Conversation, List<Member>>>() {
                    /* access modifiers changed from: private */
                    /* renamed from: b */
                    public Pair<Conversation, List<Member>> mo15560a() {
                        int i;
                        Conversation a = C6417a.m20015a().mo15530a(str);
                        C11369m.m33392a();
                        C11369m.m33404d(str);
                        C11369m.m33392a();
                        String str = str;
                        if (a == null) {
                            i = -1;
                        } else {
                            i = a.getConversationType();
                        }
                        C11369m.m33397a(str, i, C11297t.this.f30620a);
                        C11368l.m33375a();
                        return new Pair<>(C11368l.m33377a(str), C11297t.this.f30620a);
                    }
                }, new C11317c<Pair<Conversation, List<Member>>>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo15561a(Pair<Conversation, List<Member>> pair) {
                        if (pair.second != null && !((List) pair.second).isEmpty()) {
                            C11407f.m33601a().mo15536a(str, (List) pair.second);
                        }
                        if (pair.first != null) {
                            C6417a.m20015a().mo15540b((Conversation) pair.first);
                        }
                        C11211a.m32854g(str);
                        C11297t.this.mo27302a(pair.second);
                        runnable.run();
                        C11209d.m32821a(eVar, true).mo27260b();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private long m33132a(String str, long j, C11390d dVar) {
        if (C11211a.m32850e(str)) {
            return -1;
        }
        C11211a.m32851f(str);
        Conversation a = C6417a.m20015a().mo15530a(str);
        RequestBody build = new Builder().conversation_participants_body(new ConversationParticipantsListRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).cursor(Long.valueOf(j)).build()).build();
        return mo27301a(a.getInboxType(), build, dVar, str, Long.valueOf(j));
    }
}
