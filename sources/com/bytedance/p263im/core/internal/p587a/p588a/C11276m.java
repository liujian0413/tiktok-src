package com.bytedance.p263im.core.internal.p587a.p588a;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.p263im.core.internal.p587a.C11211a;
import com.bytedance.p263im.core.internal.p589b.C11314a;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11405e;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.internal.utils.C11430h;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.MessagesPerUserRequestBody;
import com.bytedance.p263im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.p263im.core.proto.RequestBody.Builder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.a.a.m */
final class C11276m extends C11280o {

    /* renamed from: a */
    public int f30576a;

    /* renamed from: b */
    public int f30577b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27278a() {
        return true;
    }

    C11276m(int i) {
        super(IMCMD.GET_MESSAGES_BY_USER.getValue());
        this.f30576a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.messages_per_user_body == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo27299a(int i) {
        if (!C11211a.m32846c(this.f30576a) && !C11211a.m32852f(this.f30576a)) {
            this.f30577b = i;
            if (i != 1) {
                C11198c.m32777a();
            }
            C11211a.m32847d(this.f30576a);
            mo27301a(this.f30576a, new Builder().messages_per_user_body(new MessagesPerUserRequestBody.Builder().cursor(Long.valueOf(C11430h.m33685a().mo27470a(this.f30576a))).build()).build(), null, new Object[0]);
        }
    }

    /* renamed from: a */
    private void m33027a(final List<MessageBody> list, final boolean z) {
        C11319e.m33192a(new C11318d<Map<String, List<Message>>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Map<String, List<Message>> mo15560a() {
                C11324d.m33206a();
                C11324d.m33208a("GetMsgByUserHandler.saveMsg(List)");
                HashMap hashMap = new HashMap();
                long uptimeMillis = SystemClock.uptimeMillis();
                Iterator it = list.iterator();
                while (true) {
                    Message message = null;
                    if (it.hasNext()) {
                        MessageBody messageBody = (MessageBody) it.next();
                        String str = messageBody.conversation_id;
                        Pair a = C11308y.m33163a(messageBody, false, new Pair<>("s:msg_get_by_pull", "1"), 3);
                        if (a != null) {
                            message = (Message) a.first;
                        }
                        if (message != null) {
                            if (hashMap.containsKey(str)) {
                                ((List) hashMap.get(str)).add(message);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(message);
                                hashMap.put(str, arrayList);
                            }
                        }
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                jSONObject.put("msg_count", list.size());
                jSONObject.put("msg_source", 3);
                C11209d.m32830a("im_save_msg_list_duration", jSONObject, (JSONObject) null);
                for (String str2 : hashMap.keySet()) {
                    List list = (List) hashMap.get(str2);
                    if (list != null && !list.isEmpty()) {
                        Message message2 = (Message) list.get(list.size() - 1);
                        C11368l.m33375a();
                        Conversation a2 = C11368l.m33377a(str2);
                        if (a2 == null) {
                            C11211a.m32836a(C11276m.this.f30576a, message2);
                        } else {
                            C11375q.m33429a();
                            Conversation conversation = a2;
                            C11308y.m33165a(conversation, message2.getIndex(), C11375q.m33428a(str2, a2.getReadIndex(), Long.MAX_VALUE, C11198c.m32777a().f30372b.mo27230a()), C11405e.m33599c(message2));
                        }
                    }
                }
                C11324d.m33206a();
                C11324d.m33210b("GetMsgByUserHandler.saveMsg(List)");
                return hashMap;
            }
        }, new C11317c<Map<String, List<Message>>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Map<String, List<Message>> map) {
                if (map != null && !map.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : map.keySet()) {
                        C11407f.m33601a().mo27462c((List) map.get(str));
                        List a = C11405e.m33594a(str, (List) map.get(str));
                        if (a != null) {
                            arrayList.addAll(a);
                        }
                        if (!C11211a.m32840a(C11276m.this.f30576a, str)) {
                            C6417a.m20015a().mo15540b(C6417a.m20015a().mo15530a(str));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C11198c.m32777a().f30372b.mo27234a((List<Message>) arrayList);
                    }
                }
                if (C11198c.m32777a().mo27248b().f30420t == 1 || !(C11276m.this.f30577b == 0 || C11276m.this.f30577b == 1)) {
                    C11211a.m32841b();
                    return;
                }
                if (!z && C11198c.m32777a().mo27248b().f30420t == 2) {
                    if (C11211a.m32843b(C11276m.this.f30576a)) {
                        C11211a.m32841b();
                        return;
                    }
                    C11211a.m32835a(C11276m.this.f30576a, 1);
                }
            }
        }, C11314a.m33183c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(C11391e eVar, Runnable runnable) {
        boolean z;
        boolean z2 = false;
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            MessagesPerUserResponseBody messagesPerUserResponseBody = eVar.f30858g.body.messages_per_user_body;
            C11430h.m33685a().mo27471a(this.f30576a, messagesPerUserResponseBody.next_cursor.longValue());
            if (messagesPerUserResponseBody.messages != null && messagesPerUserResponseBody.messages.size() > 0) {
                z2 = true;
            }
            if (z2) {
                m33027a(messagesPerUserResponseBody.messages, messagesPerUserResponseBody.has_more.booleanValue());
            }
            C11211a.m32849e(this.f30576a);
            if (messagesPerUserResponseBody.has_more.booleanValue()) {
                mo27299a(1);
            } else {
                C11283p.m33057a();
                C11283p.m33079b(this.f30576a);
                if (!z2 && C11198c.m32777a().mo27248b().f30420t == 2) {
                    if (C11211a.m32843b(this.f30576a)) {
                        C11211a.m32841b();
                    } else {
                        C11211a.m32835a(this.f30576a, 1);
                    }
                }
                C11198c.m32777a();
                C6417a.m20015a().mo15559j();
                C11209d.m32821a(eVar, true).mo27260b();
            }
        } else {
            C11211a.m32849e(this.f30576a);
            C11211a.m32835a(this.f30576a, 2);
            C11198c.m32777a();
            C11209d.m32821a(eVar, false).mo27260b();
        }
    }
}
