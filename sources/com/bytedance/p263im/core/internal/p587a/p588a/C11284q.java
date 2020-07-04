package com.bytedance.p263im.core.internal.p587a.p588a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.p263im.core.internal.p587a.C11211a;
import com.bytedance.p263im.core.internal.p589b.C11314a;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11369m;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.internal.utils.C11430h;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationInfoV2;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.MessagesPerUserInitV2RequestBody;
import com.bytedance.p263im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.a.a.q */
final class C11284q extends C11280o {

    /* renamed from: a */
    public int f30591a;

    /* renamed from: b */
    private boolean f30592b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27278a() {
        return true;
    }

    /* renamed from: b */
    public final void mo27315b() {
        m33096b(false);
    }

    /* renamed from: c */
    private void m33097c() {
        C11319e.m33191a(new C11318d<Object>() {
            /* renamed from: a */
            public final Object mo15560a() {
                C11375q.m33429a();
                return Boolean.valueOf(C11375q.m33441b(C11198c.m32777a().f30372b.mo27230a()));
            }
        }, new C11317c<Object>() {
            /* renamed from: a */
            public final void mo15561a(Object obj) {
                C11198c.m32777a();
                C11284q.this.mo27314a(C11198c.m32777a().mo27248b().f30400J);
            }
        });
    }

    C11284q(int i) {
        super(IMCMD.GET_MESSAGES_BY_USER_INIT_V2.getValue());
        this.f30591a = i;
    }

    /* renamed from: a */
    public final void mo27313a(long j) {
        mo27301a(this.f30591a, new Builder().messages_per_user_init_v2_body(new MessagesPerUserInitV2RequestBody(Long.valueOf(j))).build(), null, new Object[0]);
    }

    /* renamed from: b */
    private void m33096b(boolean z) {
        this.f30592b = false;
        if (!C11211a.m32852f(this.f30591a)) {
            if (C11430h.m33685a().mo27479c(this.f30591a)) {
                m33097c();
                return;
            }
            C11211a.m32834a(this.f30591a);
            C11211a.m32853g(this.f30591a);
            C11198c.m32777a();
            mo27313a(C11430h.m33685a().mo27480d(this.f30591a));
            C11209d.m32826a("im_total_pull", "get_session", 1.0f);
        }
    }

    /* renamed from: a */
    public final void mo27314a(boolean z) {
        C11211a.m32855h(this.f30591a);
        C6417a.m20015a().mo15552f();
        if (this.f30592b) {
            C11211a.m32841b();
            return;
        }
        C11283p.m33057a();
        C11283p.m33079b(this.f30591a);
        if (z) {
            C11283p.m33057a();
            C11283p.m33060a(this.f30591a, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.messages_per_user_init_v2_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(final C11391e eVar, Runnable runnable) {
        boolean z;
        long j;
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            final MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody = eVar.f30858g.body.messages_per_user_init_v2_body;
            if (C11430h.m33685a().mo27470a(this.f30591a) == -1) {
                C11430h a = C11430h.m33685a();
                int i = this.f30591a;
                if (messagesPerUserInitV2ResponseBody.per_user_cursor != null) {
                    j = messagesPerUserInitV2ResponseBody.per_user_cursor.longValue();
                } else {
                    j = 0;
                }
                a.mo27471a(i, j);
            }
            C11319e.m33192a(new C11318d<Pair<Long, Long>>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Pair<Long, Long> mo15560a() {
                    return C11284q.m33095a(eVar.f30858g.inbox_type.intValue(), messagesPerUserInitV2ResponseBody);
                }
            }, new C11317c<Pair<Long, Long>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(Pair<Long, Long> pair) {
                    C11198c.m32777a();
                    ((Long) pair.first).longValue();
                    ((Long) pair.second).longValue();
                    if (!messagesPerUserInitV2ResponseBody.has_more.booleanValue() || messagesPerUserInitV2ResponseBody.next_cursor == null) {
                        C11430h.m33685a().mo27472a(C11284q.this.f30591a, true);
                        C11198c.m32777a();
                        C11284q.this.mo27314a(true);
                    } else {
                        C11430h.m33685a().mo27478c(C11284q.this.f30591a, messagesPerUserInitV2ResponseBody.next_cursor.longValue());
                        C11284q.this.mo27313a(messagesPerUserInitV2ResponseBody.next_cursor.longValue());
                    }
                    if (C11198c.m32777a().mo27248b().f30420t == 1) {
                        C11211a.m32841b();
                    }
                    C11209d.m32821a(eVar, true).mo27260b();
                }
            }, C11314a.m33183c());
            return;
        }
        C11198c.m32777a();
        mo27314a(true);
        C11209d.m32821a(eVar, false).mo27260b();
    }

    /* renamed from: a */
    public static Pair<Long, Long> m33095a(int i, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
        long j;
        int i2;
        int i3 = i;
        MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody2 = messagesPerUserInitV2ResponseBody;
        C11324d.m33206a();
        C11324d.m33208a("IMInitHandler.doInit(int,ResponseBody)");
        long j2 = Long.MAX_VALUE;
        if (messagesPerUserInitV2ResponseBody2.messages != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            j = 0;
            for (MessageBody messageBody : messagesPerUserInitV2ResponseBody2.messages) {
                if (C11308y.m33162a(messageBody, true, 2) != null) {
                    C11211a.m32837a(i3, messageBody);
                }
                if (messageBody != null) {
                    j2 = Math.min(j2, messageBody.create_time.longValue());
                    j = Math.max(j, messageBody.create_time.longValue());
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                jSONObject.put("msg_count", messagesPerUserInitV2ResponseBody2.messages.size());
                jSONObject.put("msg_source", 2);
                C11209d.m32830a("im_save_msg_list_duration", jSONObject, (JSONObject) null);
            } catch (Exception unused) {
            }
        } else {
            j = 0;
        }
        if (messagesPerUserInitV2ResponseBody2.conversations != null) {
            for (ConversationInfoV2 conversationInfoV2 : messagesPerUserInitV2ResponseBody2.conversations) {
                C11369m.m33392a();
                String str = conversationInfoV2.conversation_id;
                if (conversationInfoV2.conversation_type == null) {
                    i2 = -1;
                } else {
                    i2 = conversationInfoV2.conversation_type.intValue();
                }
                C11369m.m33401b(str, i2, C11401b.m33574a(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                Conversation a = C11401b.m33564a(i3, (Conversation) null, conversationInfoV2, 0);
                C11368l.m33375a();
                C11368l.m33380a(a);
                C11211a.m32842b(i3, conversationInfoV2.conversation_id);
                if (conversationInfoV2.first_page_participants.has_more != null && conversationInfoV2.first_page_participants.has_more.booleanValue()) {
                    C11211a.m32839a(conversationInfoV2.conversation_id);
                }
            }
        }
        C11324d.m33206a();
        C11324d.m33210b("IMInitHandler.doInit(int,ResponseBody)");
        return new Pair<>(Long.valueOf(j2), Long.valueOf(j));
    }
}
