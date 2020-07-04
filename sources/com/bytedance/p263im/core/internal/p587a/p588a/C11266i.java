package com.bytedance.p263im.core.internal.p587a.p588a;

import android.util.Pair;
import com.bytedance.p263im.core.internal.p587a.C11211a;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.p591a.C11324d;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationInfoV2;
import com.bytedance.p263im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.p263im.core.proto.GetConversationInfoV2RequestBody.Builder;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.a.i */
final class C11266i extends C11280o {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27278a() {
        return true;
    }

    private C11266i() {
        super(IMCMD.GET_CONVERSATION_INFO_LIST_V2.getValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27265a(C11391e eVar) {
        if (eVar.f30858g.body == null || eVar.f30858g.body.get_conversation_info_list_v2_body == null || eVar.f30858g.body.get_conversation_info_list_v2_body.conversation_info_list == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m33000a(int i, Map<String, MessageBody> map) {
        if (map != null && !map.isEmpty()) {
            while (true) {
                Map map2 = null;
                for (String str : map.keySet()) {
                    MessageBody messageBody = (MessageBody) map.get(str);
                    if (messageBody != null) {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(str, messageBody);
                        if (map2.size() == 100) {
                            new C11266i().m33001b(i, map2);
                        }
                    }
                }
                new C11266i().m33001b(i, map2);
                return;
            }
        }
    }

    /* renamed from: b */
    private void m33001b(int i, Map<String, MessageBody> map) {
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (MessageBody messageBody : map.values()) {
                arrayList.add(new Builder().conversation_id(messageBody.conversation_id).conversation_short_id(messageBody.conversation_short_id).conversation_type(messageBody.conversation_type).build());
            }
            mo27301a(i, new RequestBody.Builder().get_conversation_info_list_v2_body(new GetConversationInfoListV2RequestBody(arrayList)).build(), null, map);
        }
    }

    /* renamed from: c */
    private static void m33002c(final int i, final Map<String, MessageBody> map) {
        if (map != null && !map.isEmpty()) {
            if (C11198c.m32777a().mo27248b().f30423w) {
                C11319e.m33191a(new C11318d<List<Conversation>>() {
                    /* access modifiers changed from: private */
                    /* renamed from: b */
                    public List<Conversation> mo15560a() {
                        ArrayList arrayList = new ArrayList();
                        C11324d.m33206a();
                        C11324d.m33208a("GetConversationInfoListHandler.createTempConversations");
                        for (String str : map.keySet()) {
                            Conversation a = C11261h.m32984a(i, (MessageBody) map.get(str));
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        C11324d.m33206a();
                        C11324d.m33210b("GetConversationInfoListHandler.createTempConversations");
                        return arrayList;
                    }
                }, new C11317c<List<Conversation>>() {
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ void mo15561a(Object obj) {
                        m33012a((List) obj);
                    }

                    /* renamed from: a */
                    private static void m33012a(List<Conversation> list) {
                        if (list != null && !list.isEmpty()) {
                            C6417a.m20015a().mo15538a((Conversation[]) list.toArray(new Conversation[list.size()]));
                        }
                    }
                });
                return;
            }
            for (String str : map.keySet()) {
                C11211a.m32837a(i, (MessageBody) map.get(str));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27263a(final C11391e eVar, Runnable runnable) {
        final int intValue = eVar.f30857f.inbox_type.intValue();
        final Map map = (Map) eVar.f30856e[0];
        if (!eVar.mo27431g() || !mo27265a(eVar)) {
            C11211a.m32835a(intValue, 2);
            C11209d.m32821a(eVar, false).mo27260b();
            if (eVar.f30860i == -1000) {
                m33002c(intValue, map);
            }
            return;
        }
        final HashSet hashSet = new HashSet();
        final C11391e eVar2 = eVar;
        final int i = intValue;
        final HashSet hashSet2 = hashSet;
        C112671 r0 = new C11318d<List<Pair<Conversation, Boolean>>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public List<Pair<Conversation, Boolean>> mo15560a() {
                List<ConversationInfoV2> list = eVar2.f30858g.body.get_conversation_info_list_v2_body.conversation_info_list;
                if (list == null || list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (ConversationInfoV2 conversationInfoV2 : list) {
                    MessageBody messageBody = (MessageBody) map.get(conversationInfoV2.conversation_id);
                    if (messageBody != null) {
                        Pair a = C11261h.m32982a(i, messageBody.create_time.longValue(), conversationInfoV2);
                        if (!(a == null || a.first == null)) {
                            arrayList.add(a);
                            if (!(conversationInfoV2.first_page_participants == null || conversationInfoV2.first_page_participants.has_more == null || !conversationInfoV2.first_page_participants.has_more.booleanValue())) {
                                hashSet2.add(conversationInfoV2.conversation_id);
                            }
                        }
                    }
                }
                return arrayList;
            }
        };
        C11319e.m33191a(r0, new C11317c<List<Pair<Conversation, Boolean>>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(List<Pair<Conversation, Boolean>> list) {
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Pair pair : list) {
                        arrayList.add(pair.first);
                        if (((Boolean) pair.second).booleanValue() && hashSet.contains(((Conversation) pair.first).getConversationId())) {
                            new C11297t().mo27319a(((Conversation) pair.first).getConversationId(), (C11390d) null);
                        }
                    }
                    C6417a.m20015a().mo15538a((Conversation[]) arrayList.toArray(new Conversation[arrayList.size()]));
                }
                C11209d.m32821a(eVar, true).mo27260b();
                C11211a.m32835a(intValue, 1);
            }
        });
    }
}
