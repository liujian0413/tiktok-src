package com.bytedance.p263im.core.internal.p587a.p588a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.p263im.core.internal.p589b.C11314a;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.MessageDirection;
import com.bytedance.p263im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.p263im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.p263im.core.proto.RequestBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.a.a.s */
final class C11292s extends C11280o {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27278a() {
        return true;
    }

    C11292s() {
        super(IMCMD.GET_MESSAGES_BY_CONVERSATION.getValue());
    }

    /* renamed from: a */
    public final void mo27318a(final String str) {
        final Conversation a = C6417a.m20015a().mo15530a(str);
        if (a == null || !a.hasMore() || a.isLocal()) {
            C11407f.m33601a().mo27461b(str, null);
        } else {
            C11319e.m33192a(new C11318d<Long>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Long mo15560a() {
                    C11375q.m33429a();
                    Message f = C11375q.m33449f(str);
                    if (f == null) {
                        return Long.valueOf(a.getLastMessageIndex());
                    }
                    return Long.valueOf(f.getIndex());
                }
            }, new C11317c<Long>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(Long l) {
                    if (l.longValue() == -1) {
                        C11407f.m33601a().mo27461b(str, null);
                    } else {
                        C11292s.this.mo27317a(a, l.longValue());
                    }
                }
            }, C11314a.m33183c());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.messages_in_conversation_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            C11209d.m32821a(eVar, false).mo27260b();
            return;
        }
        String str = (String) eVar.f30856e[0];
        MessagesInConversationResponseBody messagesInConversationResponseBody = eVar.f30858g.body.messages_in_conversation_body;
        m33118a(str, messagesInConversationResponseBody.messages, messagesInConversationResponseBody.has_more.booleanValue());
        C11209d.m32821a(eVar, true).mo27260b();
    }

    /* renamed from: a */
    public final void mo27317a(Conversation conversation, long j) {
        RequestBody build = new Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(conversation.getConversationId()).conversation_short_id(Long.valueOf(conversation.getConversationShortId())).conversation_type(Integer.valueOf(conversation.getConversationType())).direction(MessageDirection.OLDER).anchor_index(Long.valueOf(j)).build()).build();
        mo27301a(conversation.getInboxType(), build, null, conversation.getConversationId());
    }

    /* renamed from: a */
    private void m33118a(final String str, final List<MessageBody> list, final boolean z) {
        C11319e.m33192a(new C11318d<List<Message>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public List<Message> mo15560a() {
                int i;
                C11324d.m33206a();
                C11324d.m33208a("LoadHistoryHandler.saveMsg(String,List,boolean)");
                ArrayList arrayList = new ArrayList();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (list != null) {
                    for (MessageBody a : list) {
                        Pair a2 = C11308y.m33162a(a, true, 1);
                        if (!(a2 == null || a2.first == null)) {
                            arrayList.add(a2.first);
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                    String str = "msg_count";
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = 0;
                    }
                    jSONObject.put(str, i);
                    jSONObject.put("msg_source", 1);
                    C11209d.m32830a("im_save_msg_list_duration", jSONObject, (JSONObject) null);
                } catch (Exception unused) {
                }
                if (!z) {
                    C11308y.m33167a(str);
                }
                C11324d.m33206a();
                C11324d.m33210b("LoadHistoryHandler.saveMsg(String,List,boolean)");
                Collections.sort(arrayList);
                return arrayList;
            }
        }, new C11317c<List<Message>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(List<Message> list) {
                C11407f.m33601a().mo27461b(str, list);
            }
        }, C11314a.m33183c());
    }
}
