package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import com.bytedance.p263im.core.model.C11443k;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.ReadStateViewModel.C30723a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d */
public final class C30739d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f80485a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30739d.class), "reporter", "getReporter()Lcom/ss/android/ugc/aweme/im/sdk/chat/ReadStateReporter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30739d.class), "messageList", "getMessageList()Ljava/util/List;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C30739d.class), "spotReadState", "getSpotReadState()Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;"))};

    /* renamed from: b */
    public C11443k f80486b;

    /* renamed from: c */
    public SessionInfo f80487c;

    /* renamed from: d */
    private final C7541d f80488d = C7546e.m23569a(new C30741b(this));

    /* renamed from: e */
    private final C7541d f80489e = C7546e.m23569a(C30740a.f80491a);

    /* renamed from: f */
    private final C7541d f80490f = C7546e.m23569a(C30742c.f80493a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d$a */
    static final class C30740a extends Lambda implements C7561a<List<Message>> {

        /* renamed from: a */
        public static final C30740a f80491a = new C30740a();

        C30740a() {
            super(0);
        }

        /* renamed from: a */
        private static List<Message> m100148a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m100148a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d$b */
    static final class C30741b extends Lambda implements C7561a<C30999u> {

        /* renamed from: a */
        final /* synthetic */ C30739d f80492a;

        C30741b(C30739d dVar) {
            this.f80492a = dVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C30999u invoke() {
            Conversation f = this.f80492a.mo80518f();
            if (f != null) {
                return new C30999u(f);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d$c */
    static final class C30742c extends Lambda implements C7561a<C23084b<C31052w>> {

        /* renamed from: a */
        public static final C30742c f80493a = new C30742c();

        C30742c() {
            super(0);
        }

        /* renamed from: a */
        private static C23084b<C31052w> m100150a() {
            return new C23084b<>();
        }

        public final /* synthetic */ Object invoke() {
            return m100150a();
        }
    }

    /* renamed from: a */
    public final C30999u mo80509a() {
        return (C30999u) this.f80488d.getValue();
    }

    /* renamed from: b */
    public final List<Message> mo80514b() {
        return (List) this.f80489e.getValue();
    }

    /* renamed from: c */
    public final C23084b<C31052w> mo80515c() {
        return (C23084b) this.f80490f.getValue();
    }

    /* renamed from: g */
    public static boolean m100136g() {
        return C30723a.m100093a();
    }

    /* renamed from: h */
    private final void m100137h() {
        mo80515c().setValue(mo80515c().getValue());
    }

    /* renamed from: d */
    public final C11443k mo80516d() {
        C11443k kVar = this.f80486b;
        if (kVar == null) {
            C7573i.m23583a("messageModel");
        }
        return kVar;
    }

    /* renamed from: e */
    public final SessionInfo mo80517e() {
        SessionInfo sessionInfo = this.f80487c;
        if (sessionInfo == null) {
            C7573i.m23583a("sessionInfo");
        }
        return sessionInfo;
    }

    /* renamed from: f */
    public final Conversation mo80518f() {
        C6417a a = C6417a.m20015a();
        SessionInfo sessionInfo = this.f80487c;
        if (sessionInfo == null) {
            C7573i.m23583a("sessionInfo");
        }
        return a.mo15530a(sessionInfo.getConversationId());
    }

    /* renamed from: a */
    public final void mo80511a(C11443k kVar) {
        C7573i.m23587b(kVar, "<set-?>");
        this.f80486b = kVar;
    }

    /* renamed from: a */
    public final void mo80512a(SessionInfo sessionInfo) {
        C7573i.m23587b(sessionInfo, "<set-?>");
        this.f80487c = sessionInfo;
    }

    /* renamed from: a */
    public final boolean mo80513a(Message message) {
        if (message == null) {
            mo80515c().setValue(null);
            return true;
        }
        if (mo80515c().getValue() != null) {
            Object value = mo80515c().getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (C7573i.m23585a((Object) message, (Object) ((C31052w) value).f81503d)) {
                Object value2 = mo80515c().getValue();
                if (value2 == null) {
                    C7573i.m23580a();
                }
                ((C31052w) value2).mo81525a(message);
                return false;
            }
        }
        C23084b c = mo80515c();
        SessionInfo sessionInfo = this.f80487c;
        if (sessionInfo == null) {
            C7573i.m23583a("sessionInfo");
        }
        c.setValue(new C31052w(message, sessionInfo));
        return true;
    }

    /* renamed from: a */
    public final void mo80510a(int i, List<String> list) {
        boolean z;
        C31052w wVar = (C31052w) mo80515c().getValue();
        if (wVar != null) {
            wVar.f81502c = i;
            wVar.mo81524a().clear();
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                wVar.mo81524a().addAll(collection);
            }
            m100137h();
            C30999u a = mo80509a();
            if (a != null) {
                a.mo81392a(wVar.f81503d, i);
            }
        }
    }
}
