package com.bytedance.p263im.core.model;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p587a.C11211a;
import com.bytedance.p263im.core.internal.p587a.p588a.C11283p;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.internal.utils.C11431i;
import com.bytedance.p263im.core.internal.utils.C11432j;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.bytedance.p263im.core.p584a.C11205e;
import com.bytedance.p263im.core.p584a.p585a.C11194a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ParticipantMinIndex;
import com.bytedance.p263im.core.proto.ParticipantReadIndex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.model.a */
public final class C6417a implements C6433e {

    /* renamed from: e */
    private static C6417a f18765e;

    /* renamed from: a */
    public Map<String, Conversation> f18766a = new ConcurrentHashMap();

    /* renamed from: b */
    public boolean f18767b = false;

    /* renamed from: c */
    public Set<C6432c> f18768c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private Set<String> f18769d = new CopyOnWriteArraySet();

    /* renamed from: f */
    public final void mo15552f() {
        m20030m();
    }

    /* renamed from: a */
    public final void mo15535a(C6432c cVar) {
        if (cVar != null) {
            this.f18768c.add(cVar);
        }
    }

    /* renamed from: a */
    public final void mo15532a(int i, List<Long> list, Map<String, String> map, C11195b<Conversation> bVar) {
        m20018a(0, list, null, map, bVar);
    }

    /* renamed from: a */
    public final void mo15533a(long j, C11195b<Conversation> bVar) {
        m20021b(0, j, bVar);
    }

    /* renamed from: a */
    public final void mo15534a(Conversation conversation) {
        if (conversation != null) {
            m20027h(conversation.getConversationId());
            C11407f.m33601a().mo15534a(conversation);
            for (C6432c a : this.f18768c) {
                a.mo15534a(conversation);
            }
        }
    }

    /* renamed from: a */
    public final void mo15538a(Conversation... conversationArr) {
        if (conversationArr != null && conversationArr.length > 0) {
            mo15543b(conversationArr);
            for (Conversation conversation : conversationArr) {
                C11407f.m33601a().mo15540b(conversation);
                for (C6432c b : this.f18768c) {
                    b.mo15540b(conversation);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo15536a(String str, List<Member> list) {
        C11407f.m33601a().mo15536a(str, list);
        for (C6432c a : this.f18768c) {
            a.mo15536a(str, list);
        }
    }

    /* renamed from: a */
    public final void mo15537a(List<Member> list) {
        if (list != null && !list.isEmpty()) {
            C11407f.m33601a().mo15537a(list);
            for (C6432c a : this.f18768c) {
                a.mo15537a(list);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo15543b(Conversation... conversationArr) {
        if (conversationArr != null) {
            try {
                if (conversationArr.length > 0) {
                    for (Conversation conversation : conversationArr) {
                        this.f18766a.put(conversation.getConversationId(), conversation);
                    }
                }
            } finally {
            }
        }
        if (C11198c.m32777a().mo27248b().f30394D) {
            C11431i.m33701a().mo27483c();
        }
    }

    /* renamed from: e */
    public final synchronized Map<String, Conversation> mo15549e() {
        return this.f18766a;
    }

    /* renamed from: k */
    private synchronized List<Conversation> m20028k() {
        return m20029l();
    }

    /* renamed from: i */
    public final void mo15558i() {
        this.f18766a.clear();
        this.f18767b = false;
    }

    /* renamed from: a */
    public static C6417a m20015a() {
        if (f18765e == null) {
            synchronized (C6417a.class) {
                if (f18765e == null) {
                    f18765e = new C6417a();
                }
            }
        }
        return f18765e;
    }

    /* renamed from: m */
    private void m20030m() {
        if (this.f18767b) {
            C11404d.m33589c("Conversation List is Syncing");
            return;
        }
        this.f18767b = true;
        C11319e.m33191a(new C11318d() {
            /* renamed from: a */
            public final Object mo15560a() {
                C6417a.this.mo15557h();
                return Boolean.valueOf(true);
            }
        }, new C11317c() {
            /* renamed from: a */
            public final void mo15561a(Object obj) {
                if (!C6417a.this.f18768c.isEmpty()) {
                    C11404d.m33589c("syncConversionList onCallback");
                    for (C6432c a : C6417a.this.f18768c) {
                        a.mo15578a(C6417a.this.f18766a);
                    }
                }
                C6417a.this.f18767b = false;
            }
        });
    }

    /* renamed from: l */
    private synchronized List<Conversation> m20029l() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Conversation conversation : this.f18766a.values()) {
            C11198c.m32777a();
            arrayList.add(conversation);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized List<Conversation> mo15544c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Conversation conversation : m20028k()) {
            if (conversation != null && conversation.isGroupChat()) {
                arrayList.add(conversation);
            }
        }
        if (arrayList.size() > 0) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized List<Conversation> mo15547d() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Conversation conversation : m20028k()) {
            if (conversation != null && conversation.isMember()) {
                arrayList.add(conversation);
            }
        }
        if (arrayList.size() > 0) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void mo15555g() {
        if (C11198c.m32777a().mo27248b().f30394D) {
            C11319e.m33191a(new C11318d<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Boolean mo15560a() {
                    C11431i.m33701a();
                    List b = C11431i.m33702b();
                    if (b == null || b.size() <= 0) {
                        return Boolean.valueOf(false);
                    }
                    C6417a.this.mo15543b((Conversation[]) b.toArray(new Conversation[0]));
                    return Boolean.valueOf(true);
                }
            }, new C11317c<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(Boolean bool) {
                    if (!C6417a.this.f18768c.isEmpty() && bool.booleanValue()) {
                        C11404d.m33589c("snapshot onCallback");
                        for (C6432c a : C6417a.this.f18768c) {
                            a.mo15578a(C6417a.this.f18766a);
                        }
                    }
                }
            });
            return;
        }
        if (C11198c.m32777a().mo27248b().f30392B) {
            C11319e.m33191a(new C11318d<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Boolean mo15560a() {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C11368l.m33375a();
                    List a = C11368l.m33378a(C11198c.m32777a().mo27248b().f30393C);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        C11209d.m32830a("im_init_conversation_msg_duration", jSONObject, (JSONObject) null);
                    } catch (Exception unused) {
                    }
                    if (a.size() <= 0) {
                        return Boolean.valueOf(false);
                    }
                    C6417a.this.mo15543b((Conversation[]) a.toArray(new Conversation[0]));
                    return Boolean.valueOf(true);
                }
            }, new C11317c<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(Boolean bool) {
                    if (!C6417a.this.f18768c.isEmpty() && bool.booleanValue()) {
                        C11404d.m33589c("fastLoad onCallback");
                        for (C6432c a : C6417a.this.f18768c) {
                            a.mo15578a(C6417a.this.f18766a);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: j */
    public final synchronized void mo15559j() {
        C11432j.m33706a();
        if (!this.f18766a.isEmpty()) {
            for (String str : this.f18766a.keySet()) {
                Conversation conversation = (Conversation) this.f18766a.get(str);
                if (conversation.isWaitingInfo()) {
                    StringBuilder sb = new StringBuilder("retryWaitingInfoConversations - ");
                    sb.append(str);
                    C11404d.m33587b(sb.toString());
                    C11211a.m32838a(conversation.getInboxType(), str, conversation.getConversationShortId(), conversation.getConversationType(), conversation.getUpdatedTime());
                }
            }
            C11211a.m32841b();
        }
    }

    /* renamed from: b */
    public final synchronized List<Conversation> mo15539b() {
        List<Conversation> l;
        l = m20029l();
        if (l.size() > 0) {
            Collections.sort(l);
        }
        return l;
    }

    /* renamed from: h */
    public final void mo15557h() {
        long uptimeMillis = SystemClock.uptimeMillis();
        C11205e b = C11198c.m32777a().mo27248b();
        if (b != null) {
            C11375q.m33429a();
            C11375q.m33445c(b.f30399I);
        }
        C11368l.m33375a();
        List<Conversation> b2 = C11368l.m33383b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
            C11209d.m32830a("im_sync_conversation_list_duration", jSONObject, (JSONObject) null);
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Conversation conversation : b2) {
            if (!"0".equals(conversation.getConversationId())) {
                i++;
                if (C11198c.m32777a().mo27248b().f30409i != -1 && i >= C11198c.m32777a().mo27248b().f30409i) {
                    arrayList.add(conversation.getConversationId());
                }
                mo15543b(conversation);
            } else {
                C11404d.m33589c("syncConversionList dirty message");
                C11209d.m32826a("im_dirty_sync", conversation.getConversationId(), 1.0f);
            }
        }
        if (arrayList.size() > 0) {
            C11368l.m33375a();
            C11368l.m33382a((List<String>) arrayList);
        }
    }

    /* renamed from: c */
    public static void m20025c(String str) {
        C11283p.m33057a();
        C11283p.m33089d(str);
    }

    /* renamed from: d */
    public static void m20026d(String str) {
        C11283p.m33057a();
        C11283p.m33081b(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo15554f(String str) {
        this.f18769d.add(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo15556g(String str) {
        this.f18769d.remove(str);
    }

    /* renamed from: f */
    public final void mo15553f(Conversation conversation) {
        mo15543b(conversation);
    }

    /* renamed from: h */
    private void m20027h(String str) {
        this.f18766a.remove(str);
        if (C11198c.m32777a().mo27248b().f30394D) {
            C11431i.m33701a().mo27483c();
        }
    }

    /* renamed from: d */
    public final void mo15548d(Conversation conversation) {
        if (conversation != null) {
            C11407f.m33601a().mo15548d(conversation);
            for (C6432c d : this.f18768c) {
                d.mo15548d(conversation);
            }
        }
    }

    /* renamed from: e */
    public final void mo15550e(Conversation conversation) {
        if (conversation != null) {
            C11407f.m33601a().mo15550e(conversation);
            for (C6432c e : this.f18768c) {
                e.mo15550e(conversation);
            }
        }
    }

    /* renamed from: b */
    public static void m20023b(String str) {
        C11283p.m33057a();
        C11283p.m33087c(str);
    }

    /* renamed from: e */
    public final boolean mo15551e(String str) {
        if (TextUtils.isEmpty(str) || !this.f18769d.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo15545c(Conversation conversation) {
        if (conversation != null) {
            mo15543b(conversation);
            C11407f.m33601a().mo15545c(conversation);
            for (C6432c c : this.f18768c) {
                c.mo15545c(conversation);
            }
        }
    }

    /* renamed from: c */
    public final void mo15546c(List<String> list) {
        C11432j.m33706a();
        if (!this.f18766a.isEmpty() && list != null && !list.isEmpty()) {
            for (String str : list) {
                Conversation conversation = (Conversation) this.f18766a.get(str);
                StringBuilder sb = new StringBuilder("updateConversationListInfo - ");
                sb.append(str);
                C11404d.m33587b(sb.toString());
                if (conversation != null) {
                    C11211a.m32838a(conversation.getInboxType(), str, conversation.getConversationShortId(), conversation.getConversationType(), conversation.getUpdatedTime());
                }
            }
            C11211a.m32841b();
        }
    }

    /* renamed from: b */
    public final void mo15540b(Conversation conversation) {
        if (conversation != null) {
            mo15543b(conversation);
            C11407f.m33601a().mo15540b(conversation);
            for (C6432c b : this.f18768c) {
                b.mo15540b(conversation);
            }
        }
    }

    /* renamed from: a */
    public final Conversation mo15530a(String str) {
        return (Conversation) this.f18766a.get(str);
    }

    /* renamed from: b */
    public final void mo15541b(C6432c cVar) {
        if (cVar != null) {
            this.f18768c.remove(cVar);
        }
    }

    /* renamed from: b */
    public final void mo15542b(List<Member> list) {
        if (list != null && !list.isEmpty()) {
            C11407f.m33601a().mo15542b(list);
            for (C6432c b : this.f18768c) {
                b.mo15542b(list);
            }
        }
    }

    /* renamed from: b */
    private void m20022b(long j, C11195b<Conversation> bVar) {
        m20017a(0, j, bVar);
    }

    /* renamed from: a */
    private void m20016a(int i, long j) {
        String a = C6425b.m20075a(i, j);
        if (mo15530a(a) == null) {
            final Conversation conversation = new Conversation();
            conversation.setInboxType(i);
            conversation.setConversationId(a);
            conversation.setConversationType(C11203a.f30380a);
            conversation.setUpdatedTime(System.currentTimeMillis());
            conversation.setMemberCount(2);
            conversation.setIsMember(true);
            mo15545c(conversation);
            C11319e.m33191a(new C11318d<Conversation>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Conversation mo15560a() {
                    C11368l.m33375a();
                    C11368l.m33380a(conversation);
                    return null;
                }
            }, null);
        }
    }

    /* renamed from: b */
    public static void m20024b(String str, C11195b<List<ParticipantReadIndex>> bVar) {
        C11283p.m33057a();
        C11283p.m33088c(str, bVar);
    }

    /* renamed from: a */
    public static void m20019a(String str, C11195b<List<ParticipantMinIndex>> bVar) {
        C11283p.m33057a();
        C11283p.m33082b(str, bVar);
    }

    /* renamed from: a */
    public final long mo15529a(long j, C11390d dVar) {
        return m20020b(0, j, dVar);
    }

    /* renamed from: a */
    private static long m20014a(int i, long j, C11390d dVar) {
        C11283p.m33057a();
        return C11283p.m33054a(i, j, dVar);
    }

    /* renamed from: b */
    private void m20021b(int i, long j, C11195b<Conversation> bVar) {
        m20016a(0, j);
        m20022b(j, bVar);
    }

    /* renamed from: a */
    private static void m20017a(int i, long j, C11195b<Conversation> bVar) {
        C11283p.m33057a();
        C11283p.m33062a(0, j, bVar);
    }

    /* renamed from: b */
    private long m20020b(int i, long j, C11390d dVar) {
        m20016a(0, j);
        return m20014a(0, j, dVar);
    }

    /* renamed from: a */
    public final synchronized void mo15531a(int i, int i2, long j, C11194a<List<Conversation>> aVar) {
        C11283p.m33057a();
        C11283p.m33061a(i, 0, j, aVar);
    }

    /* renamed from: a */
    private static void m20018a(int i, List<Long> list, String str, Map<String, String> map, C11195b<Conversation> bVar) {
        C11283p.m33057a();
        C11283p.m33063a(i, list, (String) null, map, bVar);
    }
}
