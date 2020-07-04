package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.util.Pair;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateSyncDelegate */
public final class ReadStateSyncDelegate extends AbsReadStateDelegate {

    /* renamed from: b */
    public static final C30721a f80449b = new C30721a(null);

    /* renamed from: d */
    private static final Integer[] f80450d = {Integer.valueOf(1), Integer.valueOf(1001), Integer.valueOf(1002)};

    /* renamed from: c */
    private boolean f80451c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateSyncDelegate$a */
    public static final class C30721a {
        private C30721a() {
        }

        public /* synthetic */ C30721a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ReadStateSyncDelegate$b */
    public final class C30722b implements C11195b<Pair<List<? extends Long>, List<? extends Long>>> {

        /* renamed from: a */
        public final Message f80452a;

        /* renamed from: b */
        final /* synthetic */ ReadStateSyncDelegate f80453b;

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            Object obj;
            StringBuilder sb = new StringBuilder("onFailure: error={");
            String str = null;
            if (gVar != null) {
                obj = Integer.valueOf(gVar.f30956a);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            if (gVar != null) {
                str = gVar.f30958c;
            }
            sb.append(str);
            sb.append('}');
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(Pair<List<Long>, List<Long>> pair) {
            boolean z;
            boolean z2;
            boolean z3;
            Object obj;
            boolean z4;
            this.f80453b.mo80468e();
            if (pair != null) {
                Collection collection = (Collection) pair.second;
                int i = 0;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && ReadStateSyncDelegate.m100061a(this.f80453b.f80333a, this.f80452a)) {
                    Collection collection2 = (Collection) pair.first;
                    if (collection2 == null || collection2.isEmpty()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C30739d dVar = this.f80453b.f80333a;
                        if (!ReadStateSyncDelegate.m100060a(this.f80452a)) {
                            i = -1;
                        }
                        dVar.mo80510a(i, null);
                        return;
                    }
                    List list = (List) pair.first;
                    if (list != null) {
                        int size = list.size();
                        Object obj2 = pair.second;
                        if (obj2 == null) {
                            C7573i.m23580a();
                        }
                        if (size == ((List) obj2).size()) {
                            this.f80453b.f80333a.mo80510a(2, null);
                            return;
                        }
                    }
                    if (this.f80453b.f80333a.mo80517e().isGroupChat()) {
                        List b = C31244a.m101818a().mo81799b(this.f80453b.f80333a.mo80517e().getConversationId());
                        Collection collection3 = b;
                        if (collection3 == null || collection3.isEmpty()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            List arrayList = new ArrayList();
                            Object obj3 = pair.first;
                            if (obj3 == null) {
                                C7573i.m23580a();
                            }
                            for (Number longValue : (Iterable) obj3) {
                                long longValue2 = longValue.longValue();
                                Iterator it = b.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    Member member = ((IMMember) obj).getMember();
                                    if (member == null || member.getUid() != longValue2) {
                                        z4 = false;
                                        continue;
                                    } else {
                                        z4 = true;
                                        continue;
                                    }
                                    if (z4) {
                                        break;
                                    }
                                }
                                IMMember iMMember = (IMMember) obj;
                                if (iMMember != null) {
                                    String memberDisplayName = iMMember.getMemberDisplayName();
                                    if (memberDisplayName != null) {
                                        arrayList.add(memberDisplayName);
                                    }
                                }
                            }
                            this.f80453b.f80333a.mo80510a(1, arrayList);
                        }
                    }
                }
            }
        }

        public C30722b(ReadStateSyncDelegate readStateSyncDelegate, Message message) {
            C7573i.m23587b(message, "message");
            this.f80453b = readStateSyncDelegate;
            this.f80452a = message;
        }
    }

    public final void onStop() {
        this.f80451c = false;
    }

    public final void onResume() {
        this.f80451c = true;
        m100059a(true);
    }

    /* renamed from: f */
    private final void m100063f() {
        C31052w wVar = (C31052w) this.f80333a.mo80515c().getValue();
        if (wVar != null && wVar.mo81526b()) {
            sendEmptyMessageDelayed(1, 200);
        }
    }

    /* renamed from: e */
    public final void mo80468e() {
        C31052w wVar = (C31052w) this.f80333a.mo80515c().getValue();
        if (wVar != null && wVar.mo81526b()) {
            sendEmptyMessageDelayed(0, 2000);
        }
    }

    /* renamed from: d */
    public final void mo80373d() {
        if (this.f80333a.mo80517e().isGroupChat()) {
            m100063f();
            return;
        }
        this.f80333a.mo80513a((Message) null);
        C30999u a = this.f80333a.mo80509a();
        if (a != null) {
            a.mo81391a();
        }
    }

    /* renamed from: a */
    public final void mo80370a() {
        Object obj;
        boolean z;
        if (!this.f80333a.mo80514b().isEmpty()) {
            if (!this.f80333a.mo80517e().isGroupChat()) {
                C30999u a = this.f80333a.mo80509a();
                if (a != null) {
                    a.mo81393a(!((Message) this.f80333a.mo80514b().get(0)).isSelf());
                }
            }
            Iterator it = this.f80333a.mo80514b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Message message = (Message) obj;
                if (!message.isSelf() || message.isDeleted() || C7519g.m23440b((T[]) f80450d, Integer.valueOf(message.getMsgType()))) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Message message2 = (Message) obj;
            if (message2 != null) {
                C30739d dVar = this.f80333a;
                if (dVar.mo80517e().isGroupChat() || dVar.mo80514b().indexOf(message2) == 0) {
                    if (m100060a(message2) && this.f80333a.mo80513a(message2)) {
                        m100063f();
                        mo80468e();
                    }
                    return;
                }
                if (dVar.mo80515c().getValue() != null) {
                    dVar.mo80513a((Message) null);
                    C30999u a2 = this.f80333a.mo80509a();
                    if (a2 != null) {
                        a2.mo81391a();
                    }
                }
            }
        }
    }

    public ReadStateSyncDelegate(C30739d dVar) {
        C7573i.m23587b(dVar, "dataCenter");
        super(dVar);
    }

    /* renamed from: a */
    public static boolean m100060a(Message message) {
        if ((message.getMsgId() <= 0 || message.getMsgStatus() != 2) && message.getMsgStatus() != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m100062b(Message message) {
        return C7573i.m23585a((Object) "1", (Object) (String) message.getExt().get("visible_code"));
    }

    public final void handleMessage(android.os.Message message) {
        if (message != null) {
            switch (message.what) {
                case 0:
                    removeMessages(0);
                    m100059a(true);
                    return;
                case 1:
                    removeMessages(1);
                    m100059a(false);
                    break;
            }
        }
    }

    /* renamed from: a */
    private final void m100059a(boolean z) {
        if (C30739d.m100136g()) {
            boolean z2 = true;
            if (!(this.f80333a.mo80517e().getSelectMsgType() == 1 || this.f80333a.mo80518f() == null)) {
                Conversation f = this.f80333a.mo80518f();
                if (f == null) {
                    C7573i.m23580a();
                }
                if (f.isMember()) {
                    C31052w wVar = (C31052w) this.f80333a.mo80515c().getValue();
                    if (wVar != null) {
                        if (!this.f80451c || !wVar.mo81526b()) {
                            z2 = false;
                        }
                        if (!z2) {
                            wVar = null;
                        }
                        if (wVar != null) {
                            if (m100062b(wVar.f81503d)) {
                                this.f80333a.mo80510a(3, null);
                            } else {
                                this.f80333a.mo80516d().mo27662a(wVar.f81503d, z, (C11195b<Pair<List<Long>, List<Long>>>) new C30722b<Pair<List<Long>, List<Long>>>(this, wVar.f81503d));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m100061a(C30739d dVar, Message message) {
        C31052w wVar = (C31052w) dVar.mo80515c().getValue();
        if (wVar == null || !C7573i.m23585a((Object) message, (Object) wVar.f81503d)) {
            return false;
        }
        return true;
    }
}
