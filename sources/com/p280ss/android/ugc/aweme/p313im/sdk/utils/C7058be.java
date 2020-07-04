package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.model.Attachment;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.C6432c;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.model.Message.C6416a;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.be */
public final class C7058be extends C6432c {

    /* renamed from: a */
    private static C31870ap<C7058be> f19873a = new C31870ap<C7058be>() {
        /* renamed from: c */
        private static C7058be m22018c() {
            return new C7058be();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo18004a() {
            return m22018c();
        }
    };

    /* renamed from: b */
    private Map<String, List<Pair<List<BaseContent>, Pair<Boolean, C7059a>>>> f19874b;

    /* renamed from: c */
    private Map<String, List<Pair<Boolean, Message>>> f19875c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.be$a */
    public interface C7059a {
        void onSend(Conversation conversation, List<Message> list);

        void onSendFailure(C11438g gVar);

        void onSendSuccess(Message message);
    }

    /* renamed from: a */
    public final void mo15534a(Conversation conversation) {
    }

    /* renamed from: a */
    public final void mo15536a(String str, List<Member> list) {
    }

    /* renamed from: a */
    public final void mo15537a(List<Member> list) {
    }

    /* renamed from: a */
    public final void mo15578a(Map<String, Conversation> map) {
    }

    /* renamed from: b */
    public final void mo15540b(Conversation conversation) {
    }

    /* renamed from: b */
    public final void mo15542b(List<Member> list) {
    }

    /* renamed from: d */
    public final void mo15548d(Conversation conversation) {
    }

    /* renamed from: e */
    public final void mo15550e(Conversation conversation) {
    }

    /* renamed from: a */
    public final void mo18263a(String str, BaseContent baseContent) {
        mo18264a(str, baseContent, (C7059a) null);
    }

    /* renamed from: a */
    public final void mo18264a(String str, BaseContent baseContent, C7059a aVar) {
        m21984a(str, Collections.singletonList(baseContent), aVar);
    }

    /* renamed from: a */
    private void m21989a(List<String> list, List<BaseContent> list2, C7059a aVar) {
        m21991a(list, list2, aVar, true, null);
    }

    /* renamed from: a */
    public final void mo18265a(List<String> list, List<BaseContent> list2) {
        m21989a(list, list2, (C7059a) null);
    }

    /* renamed from: a */
    public final void mo18266a(List<String> list, List<BaseContent> list2, C7059a aVar, List<Attachment> list3) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (String a : list) {
                m21986a(a, list2, aVar, false, list3);
            }
        }
    }

    /* renamed from: a */
    private void m21991a(List<String> list, List<BaseContent> list2, C7059a aVar, boolean z, List<Attachment> list3) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        m21986a(C6425b.m20076a(Long.valueOf(str).longValue()), list2, aVar, true, null);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m21990a(List<String> list, List<BaseContent> list2, C7059a aVar, boolean z) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (String a : list) {
                m21986a(a, list2, aVar, z, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo18262a(String str) {
        this.f19874b.remove(str);
        if (this.f19875c.containsKey(str)) {
            for (Pair pair : (List) this.f19875c.get(str)) {
                ((Message) pair.second).setMsgStatus(3);
                C31863ai.m103533b((Message) pair.second);
            }
        }
        this.f19875c.remove(str);
    }

    /* renamed from: a */
    public static C7058be m21980a() {
        return (C7058be) f19873a.mo82721b();
    }

    private C7058be() {
        this.f19874b = new HashMap();
        this.f19875c = new HashMap();
        C6417a.m20015a().mo15535a((C6432c) this);
    }

    /* renamed from: b */
    public final void mo18267b() {
        this.f19874b.clear();
        this.f19875c.clear();
    }

    /* renamed from: c */
    public final void mo15545c(Conversation conversation) {
        m21996f(conversation);
    }

    /* renamed from: c */
    private static void m21995c(List<Pair<Boolean, Message>> list) {
        if (list != null && !list.isEmpty()) {
            for (Pair pair : list) {
                if (((Boolean) pair.first).booleanValue()) {
                    C31863ai.m103535c((Message) pair.second);
                } else {
                    C31863ai.m103533b((Message) pair.second);
                }
            }
        }
    }

    /* renamed from: f */
    private void m21996f(Conversation conversation) {
        String conversationId = conversation.getConversationId();
        if (this.f19874b.containsKey(conversationId)) {
            boolean isTemp = conversation.isTemp();
            for (Pair pair : (List) this.f19874b.get(conversationId)) {
                m21983a((C7059a) ((Pair) pair.second).second, conversation, m21981a(conversation, (List) pair.first, ((Boolean) ((Pair) pair.second).first).booleanValue(), isTemp, (C7059a) ((Pair) pair.second).second, null));
            }
            this.f19874b.remove(conversationId);
            return;
        }
        if (this.f19875c.containsKey(conversationId)) {
            m21995c((List) this.f19875c.get(conversationId));
            this.f19875c.remove(conversationId);
        }
    }

    /* renamed from: c */
    public final void mo18273c(String str, List<BaseContent> list) {
        m21992b(str, list, (C7059a) null);
    }

    /* renamed from: a */
    private void m21982a(Message message, final C7059a aVar) {
        if (aVar != null) {
            C31863ai.m103530a(message, (C11195b<Message>) new C11195b<Message>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo18089a(Message message) {
                    aVar.onSendSuccess(message);
                }

                /* renamed from: a */
                public final void mo18088a(C11438g gVar) {
                    aVar.onSendFailure(gVar);
                }
            });
        } else {
            C31863ai.m103535c(message);
        }
    }

    /* renamed from: b */
    public final void mo18268b(String str, BaseContent baseContent) {
        mo18269b(str, baseContent, (C7059a) null);
    }

    /* renamed from: b */
    public final void mo18270b(String str, List<BaseContent> list) {
        m21984a(str, list, (C7059a) null);
    }

    /* renamed from: a */
    private static void m21988a(List<Attachment> list, String str) {
        if (list != null && !list.isEmpty()) {
            for (Attachment attachment : list) {
                if (attachment == null) {
                    attachment = new Attachment();
                }
                attachment.setMsgUuid(str);
            }
        }
    }

    /* renamed from: b */
    public final void mo18271b(List<String> list, List<BaseContent> list2) {
        m21990a(list, list2, (C7059a) null, true);
    }

    /* renamed from: a */
    private static void m21983a(C7059a aVar, Conversation conversation, List<Message> list) {
        if (aVar != null) {
            try {
                aVar.onSend(conversation, list);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private void m21994b(List<String> list, List<BaseContent> list2, C7059a aVar) {
        m21990a(list, list2, aVar, true);
    }

    /* renamed from: c */
    public final void mo18272c(String str, BaseContent baseContent, C7059a aVar) {
        m21993b(Collections.singletonList(str), baseContent, aVar);
    }

    /* renamed from: b */
    private void m21992b(String str, List<BaseContent> list, C7059a aVar) {
        m21994b(Collections.singletonList(str), list, (C7059a) null);
    }

    /* renamed from: b */
    private void m21993b(List<String> list, BaseContent baseContent, C7059a aVar) {
        m21990a(list, Collections.singletonList(baseContent), aVar, false);
    }

    /* renamed from: a */
    private void m21984a(String str, List<BaseContent> list, C7059a aVar) {
        m21989a(Collections.singletonList(str), list, aVar);
    }

    /* renamed from: b */
    public final void mo18269b(String str, BaseContent baseContent, C7059a aVar) {
        m21987a(Collections.singletonList(str), baseContent, aVar);
    }

    /* renamed from: a */
    private void m21987a(List<String> list, BaseContent baseContent, C7059a aVar) {
        m21994b(list, Collections.singletonList(baseContent), aVar);
    }

    /* renamed from: a */
    private void m21985a(String str, List<BaseContent> list, C7059a aVar, boolean z) {
        Pair pair = new Pair(list, new Pair(Boolean.valueOf(z), aVar));
        if (!this.f19874b.containsKey(str) || ((List) this.f19874b.get(str)).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(pair);
            this.f19874b.put(str, arrayList);
            return;
        }
        ((List) this.f19874b.get(str)).add(pair);
    }

    /* renamed from: a */
    private void m21986a(final String str, List<BaseContent> list, C7059a aVar, boolean z, List<Attachment> list2) {
        Conversation a = C6417a.m20015a().mo15530a(str);
        if (a != null) {
            m21983a(aVar, a, m21981a(a, list, z, false, aVar, list2));
            return;
        }
        String[] split = str.split(":");
        if (split.length > 1 && TextUtils.equals(split[1], String.valueOf(C11203a.f30380a))) {
            m21985a(str, list, aVar, z);
            C6417a.m20015a().mo15529a(C6425b.m20074a(str), (C11390d) new C11390d() {
                /* renamed from: b */
                public final void mo18275b(C11391e eVar) {
                    C7058be.this.mo18262a(str);
                }

                /* renamed from: a */
                public final void mo18274a(C11391e eVar) {
                    C6417a.m20015a();
                    C6417a.m20026d(str);
                }
            });
        }
    }

    /* renamed from: a */
    private List<Message> m21981a(Conversation conversation, List<BaseContent> list, boolean z, boolean z2, C7059a aVar, List<Attachment> list2) {
        long j;
        List<Attachment> list3 = list2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Message lastMessage = conversation.getLastMessage();
        if (lastMessage != null) {
            j = lastMessage.getOrderIndex() + 1;
        } else {
            j = 1;
        }
        for (BaseContent baseContent : list) {
            Message a = new C6416a().mo15526a(conversation).mo15525a(C31863ai.m103526a(baseContent)).mo15527a(C31913m.m103668a(baseContent)).mo15528a();
            a.setOrderIndex(j);
            m21988a(list3, a.getUuid());
            a.setAttachments(list3);
            StringBuilder sb = new StringBuilder();
            sb.append(baseContent.getSendStartTime());
            a.addLocalExt("send_time", sb.toString());
            j++;
            if (z2) {
                a.setMsgStatus(0);
                arrayList2.add(new Pair(Boolean.valueOf(z), a));
            } else if (z) {
                m21982a(a, aVar);
                arrayList.add(a);
            }
            C7059a aVar2 = aVar;
            C31863ai.m103533b(a);
            arrayList.add(a);
        }
        Conversation conversation2 = conversation;
        if (z2 && !arrayList2.isEmpty()) {
            this.f19875c.put(conversation.getConversationId(), arrayList2);
        }
        return arrayList;
    }
}
