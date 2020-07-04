package com.bytedance.p263im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p263im.core.model.C11436d;
import com.bytedance.p263im.core.model.C11437f;
import com.bytedance.p263im.core.model.C11439h;
import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.C6433e;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.model.PropertyMsg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.im.core.internal.utils.f */
public class C11407f implements C11436d, C6433e, C11437f, C11439h {

    /* renamed from: d */
    private static C11407f f30890d;

    /* renamed from: a */
    public C11439h f30891a;

    /* renamed from: b */
    public C6433e f30892b;

    /* renamed from: c */
    public C11437f f30893c;

    /* renamed from: e */
    private Map<String, List<C6433e>> f30894e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<String, List<C11439h>> f30895f = new ConcurrentHashMap();

    /* renamed from: g */
    private Map<String, List<C11436d>> f30896g = new ConcurrentHashMap();

    /* renamed from: com.bytedance.im.core.internal.utils.f$a */
    interface C11428a<T> {
        /* renamed from: a */
        void mo27469a(T t);
    }

    /* renamed from: a */
    public final void mo27454a(boolean z) {
    }

    /* renamed from: d */
    public final void mo27463d(List<Message> list) {
    }

    /* renamed from: e */
    public final void mo27464e(List<Message> list) {
    }

    /* renamed from: a */
    public final void mo27450a(C11443k kVar) {
        mo27452a(kVar.f30971b, (C11439h) kVar);
    }

    /* renamed from: a */
    public final void mo27452a(String str, C11439h hVar) {
        List list = (List) this.f30895f.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        if (!list.contains(hVar)) {
            list.add(hVar);
        }
        this.f30895f.put(str, list);
    }

    /* renamed from: a */
    public final void mo27451a(String str, C11436d dVar) {
        List list = (List) this.f30896g.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        if (!list.contains(dVar)) {
            list.add(dVar);
        }
        this.f30896g.put(str, list);
    }

    /* renamed from: a */
    public final void mo15536a(final String str, final List<Member> list) {
        if (!TextUtils.isEmpty(str)) {
            m33605b(str, (C11428a<C6433e>) new C11428a<C6433e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C6433e eVar) {
                    eVar.mo15536a(str, list);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo15537a(final List<Member> list) {
        if (list != null && !list.isEmpty()) {
            m33605b(((Member) list.get(0)).getConversationId(), (C11428a<C6433e>) new C11428a<C6433e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C6433e eVar) {
                    eVar.mo15537a(list);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo15542b(final List<Member> list) {
        if (list != null && !list.isEmpty()) {
            m33605b(((Member) list.get(0)).getConversationId(), (C11428a<C6433e>) new C11428a<C6433e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C6433e eVar) {
                    eVar.mo15542b(list);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo27461b(String str, final List<Message> list) {
        if (!TextUtils.isEmpty(str)) {
            m33603a(str, (C11428a<C11439h>) new C11428a<C11439h>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C11439h hVar) {
                    hVar.mo27464e(list);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo27453a(String str, final boolean z) {
        m33603a(str, (C11428a<C11439h>) new C11428a<C11439h>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo27469a(C11439h hVar) {
                hVar.mo27454a(z);
            }
        });
    }

    private C11407f() {
    }

    /* renamed from: a */
    public static C11407f m33601a() {
        if (f30890d == null) {
            synchronized (C11407f.class) {
                if (f30890d == null) {
                    f30890d = new C11407f();
                }
            }
        }
        return f30890d;
    }

    /* renamed from: a */
    public final void mo27449a(C11437f fVar) {
        this.f30893c = null;
    }

    /* renamed from: a */
    public final void mo27448a(C6425b bVar) {
        m33604a(bVar.f18778a, (C6433e) bVar);
    }

    /* renamed from: b */
    public final void mo27457b(C6425b bVar) {
        m33606b(bVar.f18778a, (C6433e) bVar);
    }

    /* renamed from: a */
    private void m33602a(C11428a<C11437f> aVar) {
        if (this.f30893c != null) {
            aVar.mo27469a(this.f30893c);
        }
    }

    /* renamed from: b */
    public final void mo27458b(C11443k kVar) {
        mo27460b(kVar.f30971b, (C11439h) kVar);
    }

    /* renamed from: c */
    public final void mo15545c(final Conversation conversation) {
        if (conversation != null && !TextUtils.isEmpty(conversation.getConversationId())) {
            m33605b(conversation.getConversationId(), (C11428a<C6433e>) new C11428a<C6433e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C6433e eVar) {
                    eVar.mo15545c(conversation);
                }
            });
        }
    }

    /* renamed from: d */
    public final void mo15548d(final Conversation conversation) {
        if (conversation != null && !TextUtils.isEmpty(conversation.getConversationId())) {
            m33605b(conversation.getConversationId(), (C11428a<C6433e>) new C11428a<C6433e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C6433e eVar) {
                    eVar.mo15548d(conversation);
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo15550e(final Conversation conversation) {
        if (conversation != null && !TextUtils.isEmpty(conversation.getConversationId())) {
            m33605b(conversation.getConversationId(), (C11428a<C6433e>) new C11428a<C6433e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C6433e eVar) {
                    eVar.mo15550e(conversation);
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo27465f(final Conversation conversation) {
        if (conversation != null && !TextUtils.isEmpty(conversation.getConversationId())) {
            m33607c(conversation.getConversationId(), new C11428a<C11436d>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C11436d dVar) {
                    dVar.mo27465f(conversation);
                }
            });
        }
    }

    /* renamed from: h */
    public final void mo27468h(final List<Member> list) {
        if (list != null && !list.isEmpty()) {
            m33602a((C11428a<C11437f>) new C11428a<C11437f>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C11437f fVar) {
                    fVar.mo27468h(list);
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo27466f(final List<Message> list) {
        if (list != null && !list.isEmpty()) {
            m33603a(((Message) list.get(0)).getConversationId(), (C11428a<C11439h>) new C11428a<C11439h>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C11439h hVar) {
                    hVar.mo27466f(list);
                }
            });
        }
    }

    /* renamed from: g */
    public final void mo27467g(final List<PropertyMsg> list) {
        if (list != null && !list.isEmpty()) {
            PropertyMsg propertyMsg = (PropertyMsg) list.get(0);
            if (propertyMsg != null && !TextUtils.isEmpty(propertyMsg.getConversationId())) {
                m33603a(propertyMsg.getConversationId(), (C11428a<C11439h>) new C11428a<C11439h>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void mo27469a(C11439h hVar) {
                        hVar.mo27467g(list);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public final void mo27462c(final List<Message> list) {
        if (list != null && !list.isEmpty()) {
            m33603a(((Message) list.get(0)).getConversationId(), (C11428a<C11439h>) new C11428a<C11439h>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C11439h hVar) {
                    hVar.mo27462c(list);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo15540b(final Conversation conversation) {
        if (conversation != null && !TextUtils.isEmpty(conversation.getConversationId())) {
            m33605b(conversation.getConversationId(), (C11428a<C6433e>) new C11428a<C6433e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C6433e eVar) {
                    eVar.mo15540b(conversation);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo27456b(final Message message) {
        if (message != null && !TextUtils.isEmpty(message.getConversationId())) {
            m33603a(message.getConversationId(), (C11428a<C11439h>) new C11428a<C11439h>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C11439h hVar) {
                    hVar.mo27456b(message);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo15534a(final Conversation conversation) {
        if (conversation != null && !TextUtils.isEmpty(conversation.getConversationId())) {
            m33605b(conversation.getConversationId(), (C11428a<C6433e>) new C11428a<C6433e>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C6433e eVar) {
                    eVar.mo15534a(conversation);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo27447a(final Message message) {
        if (message != null && !TextUtils.isEmpty(message.getConversationId())) {
            m33603a(message.getConversationId(), (C11428a<C11439h>) new C11428a<C11439h>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C11439h hVar) {
                    hVar.mo27447a(message);
                }
            });
        }
    }

    /* renamed from: b */
    private void m33606b(String str, C6433e eVar) {
        List list = (List) this.f30894e.get(str);
        list.remove(eVar);
        this.f30894e.put(str, list);
    }

    /* renamed from: a */
    private void m33603a(String str, C11428a<C11439h> aVar) {
        List<C11439h> list = (List) this.f30895f.get(str);
        if (list != null) {
            for (C11439h a : list) {
                aVar.mo27469a(a);
            }
        }
        if (this.f30891a != null) {
            aVar.mo27469a(this.f30891a);
        }
    }

    /* renamed from: b */
    private void m33605b(String str, C11428a<C6433e> aVar) {
        List list = (List) this.f30894e.get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                aVar.mo27469a(list.get(i));
            }
        }
        if (this.f30892b != null) {
            aVar.mo27469a(this.f30892b);
        }
    }

    /* renamed from: c */
    private void m33607c(String str, C11428a<C11436d> aVar) {
        List list = (List) this.f30896g.get(str);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                C11436d dVar = (C11436d) list.get(i);
                if (dVar != null) {
                    aVar.mo27469a(dVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m33604a(String str, C6433e eVar) {
        List list = (List) this.f30894e.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        if (!list.contains(eVar)) {
            list.add(eVar);
        }
        this.f30894e.put(str, list);
    }

    /* renamed from: b */
    public final void mo27455b(final int i, final Message message) {
        if (message != null && !TextUtils.isEmpty(message.getConversationId())) {
            m33603a(message.getConversationId(), (C11428a<C11439h>) new C11428a<C11439h>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C11439h hVar) {
                    hVar.mo27455b(i, message);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo27445a(final int i, final Message message) {
        if (message != null && !TextUtils.isEmpty(message.getConversationId())) {
            m33603a(message.getConversationId(), (C11428a<C11439h>) new C11428a<C11439h>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C11439h hVar) {
                    hVar.mo27445a(i, message);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo27446a(final int i, final PropertyMsg propertyMsg) {
        if (propertyMsg != null && !TextUtils.isEmpty(propertyMsg.getConversationId())) {
            m33603a(propertyMsg.getConversationId(), (C11428a<C11439h>) new C11428a<C11439h>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo27469a(C11439h hVar) {
                    hVar.mo27446a(i, propertyMsg);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo27459b(String str, C11436d dVar) {
        List list = (List) this.f30896g.get(str);
        if (list != null) {
            list.remove(dVar);
        }
        this.f30896g.put(str, list);
    }

    /* renamed from: b */
    public final void mo27460b(String str, C11439h hVar) {
        List list = (List) this.f30895f.get(str);
        list.remove(hVar);
        this.f30895f.put(str, list);
    }
}
