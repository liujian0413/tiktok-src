package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import com.bytedance.p263im.core.model.C11439h;
import com.bytedance.p263im.core.model.C11440j;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareAwemeContent;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e.C32010a;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e.C32011b;
import com.p280ss.android.ugc.aweme.p313im.service.C32009e.C32012c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.h */
public final class C30754h extends C30752g implements C32009e {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f80513a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30754h.class), "blackAwemeIds", "getBlackAwemeIds()Ljava/util/HashSet;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30754h.class), "reversedCache", "getReversedCache()Ljava/util/List;"))};

    /* renamed from: b */
    public static final C30755a f80514b = new C30755a(null);

    /* renamed from: c */
    private final C7541d f80515c = C7546e.m23569a(C30756b.f80525a);

    /* renamed from: d */
    private final List<Message> f80516d;

    /* renamed from: e */
    private final C7541d f80517e = C7546e.m23569a(C30757c.f80526a);

    /* renamed from: f */
    private C11440j f80518f;

    /* renamed from: g */
    private int f80519g;

    /* renamed from: h */
    private final long f80520h;

    /* renamed from: i */
    private boolean f80521i;

    /* renamed from: j */
    private boolean f80522j;

    /* renamed from: k */
    private C32010a f80523k;

    /* renamed from: l */
    private final String f80524l;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.h$a */
    public static final class C30755a {
        private C30755a() {
        }

        public /* synthetic */ C30755a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.h$b */
    static final class C30756b extends Lambda implements C7561a<HashSet<String>> {

        /* renamed from: a */
        public static final C30756b f80525a = new C30756b();

        C30756b() {
            super(0);
        }

        /* renamed from: a */
        private static HashSet<String> m100189a() {
            return new HashSet<>();
        }

        public final /* synthetic */ Object invoke() {
            return m100189a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.h$c */
    static final class C30757c extends Lambda implements C7561a<List<Message>> {

        /* renamed from: a */
        public static final C30757c f80526a = new C30757c();

        C30757c() {
            super(0);
        }

        /* renamed from: a */
        private static List<Message> m100190a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m100190a();
        }
    }

    /* renamed from: c */
    private final HashSet<String> m100176c() {
        return (HashSet) this.f80515c.getValue();
    }

    /* renamed from: d */
    private final List<Message> m100177d() {
        return (List) this.f80517e.getValue();
    }

    /* renamed from: f */
    private final void m100179f() {
        this.f80519g = 0;
    }

    /* renamed from: e */
    private final boolean m100178e() {
        if (this.f80519g != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo80540a() {
        C11440j jVar = this.f80518f;
        if (jVar != null) {
            jVar.mo27654a();
        }
        m100177d().clear();
        m100179f();
        this.f80523k = null;
    }

    /* renamed from: b */
    public final void mo80544b() {
        if (!m100178e()) {
            List a = m100172a(this.f80520h, 1);
            boolean z = false;
            if ((!a.isEmpty()) && (!m100177d().isEmpty()) && m100177d().indexOf(C7525m.m23515h(a)) < m100177d().size() - 1) {
                z = true;
            }
            C32010a aVar = this.f80523k;
            if (aVar != null) {
                aVar.mo67696a(m100171a(a, z));
            }
        }
    }

    /* renamed from: a */
    public final void mo80543a(String str) {
        C7573i.m23587b(str, "aid");
        m100176c().add(str);
    }

    /* renamed from: b */
    private final void m100174b(List<Message> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m100177d().addAll(0, collection);
        }
    }

    /* renamed from: d */
    public final void mo27463d(List<Message> list) {
        Integer num;
        StringBuilder sb = new StringBuilder("onQueryMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
    }

    /* renamed from: a */
    private final void m100173a(List<Message> list) {
        boolean z;
        m100177d().clear();
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m100177d().addAll(C7525m.m23512f((Iterable<? extends T>) list));
        }
    }

    /* renamed from: c */
    private final int m100175c(long j) {
        int i = 0;
        for (Object next : m100177d()) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            if (((Message) next).getIndex() == j) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: h */
    private static List<Message> m100180h(List<Message> list) {
        boolean z;
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ArrayList<>();
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            Message message = (Message) next;
            if ((message.getMsgType() == 8 || message.getMsgType() == 12) && !message.isRecalled() && !message.isDeleted()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return C7525m.m23509d((Collection<? extends T>) (List) arrayList);
    }

    /* renamed from: e */
    public final void mo27464e(List<Message> list) {
        Integer num;
        boolean z;
        StringBuilder sb = new StringBuilder("onLoadMore: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append(", ");
        sb.append(m100177d().size());
        Collection collection = list;
        boolean z2 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && list.size() >= 7) {
            z2 = true;
        }
        this.f80522j = z2;
        List f = C7525m.m23512f((Iterable<? extends T>) m100180h(list));
        m100174b(f);
        C32010a aVar = this.f80523k;
        if (aVar != null) {
            aVar.mo67697b(m100171a(f, this.f80522j));
        }
        m100179f();
    }

    /* renamed from: a */
    public final void mo80541a(long j) {
        if (!m100178e()) {
            List a = m100172a(j, 3);
            boolean z = false;
            if ((!a.isEmpty()) && (!m100177d().isEmpty()) && m100177d().indexOf(C7525m.m23515h(a)) < m100177d().size() - 1) {
                z = true;
            }
            C32010a aVar = this.f80523k;
            if (aVar != null) {
                aVar.mo67698c(m100171a(a, z));
            }
        }
    }

    /* renamed from: b */
    public final void mo80545b(long j) {
        if (!m100178e()) {
            List a = m100172a(j, 2);
            if (!a.isEmpty()) {
                C32010a aVar = this.f80523k;
                if (aVar != null) {
                    aVar.mo67697b(m100171a(a, true));
                    return;
                }
                return;
            }
            if (this.f80522j) {
                this.f80519g = 2;
                C11440j jVar = this.f80518f;
                if (jVar != null) {
                    jVar.mo27656b();
                }
            } else {
                C32010a aVar2 = this.f80523k;
                if (aVar2 != null) {
                    aVar2.mo67697b(m100171a(null, false));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo80542a(C32010a aVar) {
        C7573i.m23587b(aVar, "callback");
        C11440j jVar = new C11440j(this.f80524l, new int[]{8, 12}, 7);
        jVar.mo27655a((C11439h) this);
        jVar.f30964d.addAll(this.f80516d);
        this.f80518f = jVar;
        m100173a(this.f80516d);
        this.f80521i = true;
        this.f80522j = true;
        this.f80523k = aVar;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.bytedance.p263im.core.model.Message> m100172a(long r3, int r5) {
        /*
            r2 = this;
            java.util.List r0 = r2.m100177d()
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0012
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            return r3
        L_0x0012:
            int r3 = r2.m100175c(r3)
            if (r3 >= 0) goto L_0x0020
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            return r3
        L_0x0020:
            java.util.List r4 = r2.m100177d()
            int r4 = r4.size()
            r0 = -1
            r1 = 0
            switch(r5) {
                case 1: goto L_0x0044;
                case 2: goto L_0x003b;
                case 3: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x005c
        L_0x002e:
            int r5 = r4 + -1
            if (r3 == r5) goto L_0x005c
            int r0 = r3 + 1
            int r3 = r0 + 7
            int r3 = java.lang.Math.min(r3, r4)
            goto L_0x005d
        L_0x003b:
            if (r3 == 0) goto L_0x005c
            int r4 = r3 + -7
            int r0 = java.lang.Math.max(r1, r4)
            goto L_0x005d
        L_0x0044:
            int r3 = r3 + -3
            int r3 = java.lang.Math.max(r1, r3)
            int r5 = r3 + 7
            int r4 = java.lang.Math.min(r5, r4)
            int r5 = r4 + -7
            int r5 = java.lang.Math.max(r1, r5)
            int r0 = java.lang.Math.min(r3, r5)
            r3 = r4
            goto L_0x005d
        L_0x005c:
            r3 = -1
        L_0x005d:
            if (r0 < 0) goto L_0x006b
            if (r3 >= 0) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            java.util.List r4 = r2.m100177d()
            java.util.List r3 = r4.subList(r0, r3)
            return r3
        L_0x006b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30754h.m100172a(long, int):java.util.List");
    }

    /* renamed from: a */
    private final C32012c m100171a(List<Message> list, boolean z) {
        Integer num;
        boolean z2;
        StringBuilder sb = new StringBuilder("packResponse: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        sb.append(num);
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return new C32012c(C7525m.m23461a(), z);
        }
        Iterable<Message> iterable = list;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (Message message : iterable) {
            Long valueOf = Long.valueOf(message.getIndex());
            BaseContent parse = MessageViewType.valueOf(message).parse(message);
            C7573i.m23582a((Object) parse, "MessageViewType.valueOf(it).parse(it)");
            arrayList.add(new Pair(valueOf, parse));
        }
        Iterable iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable2) {
            if (((Pair) next).getSecond() instanceof ShareAwemeContent) {
                arrayList2.add(next);
            }
        }
        Iterable<Pair> iterable3 = (List) arrayList2;
        Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable3, 10));
        for (Pair pair : iterable3) {
            Object second = pair.getSecond();
            if (second != null) {
                String itemId = ((ShareAwemeContent) second).getItemId();
                C7573i.m23582a((Object) itemId, "(it.second as ShareAwemeContent).itemId");
                arrayList3.add(new C32011b(itemId, ((Number) pair.getFirst()).longValue()));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeContent");
            }
        }
        Iterable iterable4 = (List) arrayList3;
        Collection arrayList4 = new ArrayList();
        for (Object next2 : iterable4) {
            if (!m100176c().contains(((C32011b) next2).f83727a)) {
                arrayList4.add(next2);
            }
        }
        return new C32012c((List) arrayList4, z);
    }

    public C30754h(String str, Message message, List<Message> list) {
        C7573i.m23587b(str, "sessionId");
        C7573i.m23587b(message, "curMessage");
        C7573i.m23587b(list, "originMessages");
        this.f80524l = str;
        this.f80520h = message.getIndex();
        this.f80521i = true;
        this.f80522j = true;
        this.f80516d = m100180h(list);
    }
}
