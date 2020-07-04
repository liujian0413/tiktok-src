package com.p280ss.android.ugc.aweme.p313im.sdk.group;

import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.C6433e;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.bytedance.p263im.core.model.ConversationSettingInfo;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.model.Message.C6416a;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.bytedance.p263im.core.p584a.p585a.C11194a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.p584a.p585a.C11196c;
import com.bytedance.p263im.core.proto.GroupRole;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupInviteContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupNoticeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupAnnouncementExtra;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupInviteCardInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31479j;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31089m;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a */
public final class C31243a {

    /* renamed from: b */
    public static final C7541d f81914b = C7546e.m23569a(C31245b.f81920a);

    /* renamed from: c */
    public static final C31244a f81915c = new C31244a(null);

    /* renamed from: a */
    public final ConcurrentHashMap<String, List<IMMember>> f81916a;

    /* renamed from: d */
    private final ConcurrentHashMap<String, Conversation> f81917d;

    /* renamed from: e */
    private final ConcurrentHashMap<String, C6425b> f81918e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$a */
    public static final class C31244a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f81919a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31244a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/im/sdk/group/GroupManager;"))};

        private C31244a() {
        }

        /* renamed from: a */
        public static C31243a m101818a() {
            return (C31243a) C31243a.f81914b.getValue();
        }

        public /* synthetic */ C31244a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$b */
    static final class C31245b extends Lambda implements C7561a<C31243a> {

        /* renamed from: a */
        public static final C31245b f81920a = new C31245b();

        C31245b() {
            super(0);
        }

        /* renamed from: a */
        private static C31243a m101819a() {
            return new C31243a(null);
        }

        public final /* synthetic */ Object invoke() {
            return m101819a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$c */
    public static final class C31246c implements C11196c<List<? extends Member>> {

        /* renamed from: a */
        final /* synthetic */ C31243a f81921a;

        /* renamed from: b */
        final /* synthetic */ String f81922b;

        /* renamed from: c */
        final /* synthetic */ C11196c f81923c;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(List<? extends Member> list) {
            this.f81921a.mo81794a(this.f81922b, list);
            C11196c cVar = this.f81923c;
            if (cVar != null) {
                cVar.mo18089a(list);
            }
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            C11196c cVar = this.f81923c;
            if (cVar != null) {
                cVar.mo18088a(gVar);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18090a(List<? extends Member> list, C11438g gVar) {
            this.f81921a.mo81794a(this.f81922b, list);
            C11196c cVar = this.f81923c;
            if (cVar != null) {
                cVar.mo18090a(list, gVar);
            }
        }

        C31246c(C31243a aVar, String str, C11196c cVar) {
            this.f81921a = aVar;
            this.f81922b = str;
            this.f81923c = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$d */
    public static final class C31247d implements C11196c<List<? extends Member>> {

        /* renamed from: a */
        final /* synthetic */ C31243a f81924a;

        /* renamed from: b */
        final /* synthetic */ String f81925b;

        /* renamed from: c */
        final /* synthetic */ C11196c f81926c;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(List<? extends Member> list) {
            this.f81924a.mo81794a(this.f81925b, list);
            C11196c cVar = this.f81926c;
            if (cVar != null) {
                cVar.mo18089a(list);
            }
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            C11196c cVar = this.f81926c;
            if (cVar != null) {
                cVar.mo18088a(gVar);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18090a(List<? extends Member> list, C11438g gVar) {
            this.f81924a.mo81794a(this.f81925b, list);
            C11196c cVar = this.f81926c;
            if (cVar != null) {
                cVar.mo18090a(list, gVar);
            }
        }

        C31247d(C31243a aVar, String str, C11196c cVar) {
            this.f81924a = aVar;
            this.f81925b = str;
            this.f81926c = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$e */
    public static final class C31248e implements C11196c<Conversation> {

        /* renamed from: a */
        final /* synthetic */ C7563m f81927a;

        C31248e(C7563m mVar) {
            this.f81927a = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(Conversation conversation) {
            C7563m mVar = this.f81927a;
            if (mVar != null) {
                mVar.invoke(conversation, null);
            }
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            C7563m mVar = this.f81927a;
            if (mVar != null) {
                mVar.invoke(null, gVar);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18090a(Conversation conversation, C11438g gVar) {
            C7563m mVar = this.f81927a;
            if (mVar != null) {
                mVar.invoke(conversation, gVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$f */
    public static final class C31249f implements C11195b<Member> {

        /* renamed from: a */
        final /* synthetic */ C7562b f81928a;

        C31249f(C7562b bVar) {
            this.f81928a = bVar;
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            this.f81928a.invoke(Integer.valueOf(GroupRole.ORDINARY.getValue()));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(Member member) {
            if (member != null) {
                this.f81928a.invoke(Integer.valueOf(member.getRole()));
                if (member != null) {
                    return;
                }
            }
            this.f81928a.invoke(Integer.valueOf(GroupRole.ORDINARY.getValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$g */
    public static final class C31250g extends C11194a<List<Conversation>> {

        /* renamed from: a */
        final /* synthetic */ C48007r f81929a;

        C31250g(C48007r rVar) {
            this.f81929a = rVar;
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            this.f81929a.invoke(null, Long.valueOf(-1), Boolean.valueOf(true), gVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo27242a(List<Conversation> list, long j, boolean z) {
            this.f81929a.invoke(list, Long.valueOf(j), Boolean.valueOf(z), null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$h */
    public static final class C31251h implements C6433e {

        /* renamed from: a */
        final /* synthetic */ C31243a f81930a;

        /* renamed from: b */
        final /* synthetic */ ObjectRef f81931b;

        /* renamed from: c */
        final /* synthetic */ String f81932c;

        /* renamed from: d */
        final /* synthetic */ C7562b f81933d;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$h$a */
        public static final class C31252a implements C11195b<List<? extends Member>> {

            /* renamed from: a */
            final /* synthetic */ C31251h f81934a;

            /* renamed from: a */
            public final void mo18088a(C11438g gVar) {
            }

            C31252a(C31251h hVar) {
                this.f81934a = hVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo18089a(List<? extends Member> list) {
                this.f81934a.f81930a.f81916a.put(this.f81934a.f81932c, C31243a.m101794a(list));
            }
        }

        /* renamed from: a */
        public final void mo15534a(Conversation conversation) {
            C7573i.m23587b(conversation, "conversation");
        }

        /* renamed from: c */
        public final void mo15545c(Conversation conversation) {
            C7573i.m23587b(conversation, "conversation");
        }

        /* renamed from: d */
        public final void mo15548d(Conversation conversation) {
            C7573i.m23587b(conversation, "conversation");
        }

        /* renamed from: a */
        public final void mo15537a(List<? extends Member> list) {
            C7573i.m23587b(list, "memberList");
            this.f81930a.mo81794a(this.f81932c, list);
        }

        /* renamed from: b */
        public final void mo15542b(List<? extends Member> list) {
            C7573i.m23587b(list, "memberList");
            this.f81930a.mo81800b(this.f81932c, list);
        }

        /* renamed from: e */
        public final void mo15550e(Conversation conversation) {
            C7573i.m23587b(conversation, "conversation");
            this.f81930a.f81916a.remove(this.f81932c);
        }

        /* renamed from: b */
        public final void mo15540b(Conversation conversation) {
            C7573i.m23587b(conversation, "conversation");
            ((C6425b) this.f81931b.element).mo15564a((C11195b<List<Member>>) new C31252a<List<Member>>(this));
        }

        /* renamed from: a */
        public final void mo15536a(String str, List<? extends Member> list) {
            C7573i.m23587b(str, "conversationId");
            List a = C31243a.m101794a(list);
            this.f81930a.f81916a.put(str, a);
            C7562b bVar = this.f81933d;
            if (bVar != null) {
                bVar.invoke(a);
            }
            this.f81930a.mo81801b(a);
        }

        C31251h(C31243a aVar, ObjectRef objectRef, String str, C7562b bVar) {
            this.f81930a = aVar;
            this.f81931b = objectRef;
            this.f81932c = str;
            this.f81933d = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$i */
    public static final class C31253i implements C11195b<Conversation> {
        C31253i() {
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18089a(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$j */
    public static final class C31254j implements C11195b<List<? extends Member>> {

        /* renamed from: a */
        final /* synthetic */ C31243a f81935a;

        /* renamed from: b */
        final /* synthetic */ String f81936b;

        /* renamed from: c */
        final /* synthetic */ C11195b f81937c;

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            this.f81937c.mo18088a(gVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(List<? extends Member> list) {
            boolean z;
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f81935a.mo81800b(this.f81936b, list);
                this.f81937c.mo18089a(list);
            }
        }

        C31254j(C31243a aVar, String str, C11195b bVar) {
            this.f81935a = aVar;
            this.f81936b = str;
            this.f81937c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a$k */
    public static final class C31255k extends C31089m {

        /* renamed from: a */
        final /* synthetic */ C31243a f81938a;

        /* renamed from: b */
        final /* synthetic */ List f81939b;

        /* renamed from: a */
        public final void mo81575a(C31479j jVar) {
            boolean z;
            C7573i.m23587b(jVar, "userInfo");
            Collection collection = this.f81939b;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f81938a.mo81797a(this.f81939b, jVar.f82433b);
            }
        }

        C31255k(C31243a aVar, List list) {
            this.f81938a = aVar;
            this.f81939b = list;
        }
    }

    /* renamed from: a */
    public final List<IMMember> mo81792a(String str, C7562b<? super List<IMMember>, C7581n> bVar) {
        C7573i.m23587b(str, "conversationId");
        List<IMMember> list = (List) this.f81916a.get(str);
        if (list == null) {
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = (C6425b) this.f81918e.get(str);
            if (((C6425b) objectRef.element) == null) {
                objectRef.element = new C6425b(str);
                this.f81918e.put(str, (C6425b) objectRef.element);
                ((C6425b) objectRef.element).mo15565a((C6433e) new C31251h(this, objectRef, str, bVar));
                ((C6425b) objectRef.element).mo15577c();
            }
        } else {
            mo81801b(list);
            if (bVar != null) {
                bVar.invoke(list);
            }
        }
        return list;
    }

    /* renamed from: a */
    public final void mo81797a(List<IMMember> list, int i) {
        C6961d.m21657a().mo18028a((Map<String, String>) m101800c(m101799b(list, i)), (C31089m) new C31255k(this, list));
    }

    /* renamed from: a */
    public final void mo81796a(String str, List<? extends IMUser> list, Map<String, String> map, C11196c<List<Member>> cVar) {
        C7573i.m23587b(list, "addMemberList");
        C7573i.m23587b(map, "map");
        if (str != null) {
            new C6425b(str).mo15568a((List<Long>) m101804d(list), map, (C11195b<List<Member>>) new C31246c<List<Member>>(this, str, cVar));
        }
    }

    /* renamed from: a */
    public final void mo81793a(String str, String str2, List<? extends IMUser> list, Map<String, String> map, C11196c<List<Member>> cVar) {
        C7573i.m23587b(list, "addMemberList");
        C7573i.m23587b(map, "map");
        CharSequence charSequence = str;
        boolean z = false;
        if (!(charSequence == null || charSequence.length() == 0)) {
            CharSequence charSequence2 = str2;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            }
            if (!z) {
                new C6425b(str).mo15563a(Long.parseLong(str2), m101804d(list), map, new C31247d(this, str, cVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo81794a(String str, List<? extends Member> list) {
        CharSequence charSequence = str;
        boolean z = true;
        if (!(charSequence == null || charSequence.length() == 0)) {
            Collection collection = list;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (!z) {
                List arrayList = new ArrayList();
                List b = mo81799b(str);
                if (b != null) {
                    Iterable iterable = b;
                    Collection arrayList2 = new ArrayList();
                    for (Object next : iterable) {
                        if (C7525m.m23496a((Iterable<? extends T>) list, ((IMMember) next).getMember())) {
                            arrayList2.add(next);
                        }
                    }
                    for (IMMember member : (List) arrayList2) {
                        arrayList.add(member.getMember());
                    }
                }
                List b2 = mo81799b(str);
                if (!(b2 instanceof ArrayList)) {
                    b2 = null;
                }
                ArrayList arrayList3 = (ArrayList) b2;
                if (arrayList3 != null) {
                    for (Member member2 : list) {
                        if (!arrayList.contains(member2)) {
                            IMMember iMMember = new IMMember();
                            iMMember.setUser(C6961d.m21657a().mo18022a(String.valueOf(member2.getUid()), false));
                            iMMember.setMember(member2);
                            arrayList3.add(iMMember);
                        }
                    }
                    this.f81916a.put(str, arrayList3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo81795a(String str, List<? extends IMUser> list, C11195b<List<Member>> bVar) {
        C7573i.m23587b(list, "removeMemberList");
        C7573i.m23587b(bVar, "removeCallback");
        if (str != null) {
            new C6425b(str).mo15575b(m101804d(list), null, new C31254j(this, str, bVar));
        }
    }

    /* renamed from: a */
    public final Integer mo81791a(String str, String str2) {
        C7573i.m23587b(str, "conversationId");
        C7573i.m23587b(str2, "uid");
        List b = mo81799b(str);
        if (b != null) {
            Iterable iterable = b;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                Member member = ((IMMember) next).getMember();
                if (C7573i.m23585a((Object) str2, member != null ? String.valueOf(member.getUid()) : null)) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            boolean z = true;
            if (list.size() != 1) {
                z = false;
            }
            if (!z) {
                list = null;
            }
            if (list != null) {
                IMMember iMMember = (IMMember) list.get(0);
                if (iMMember != null) {
                    Member member2 = iMMember.getMember();
                    if (member2 != null) {
                        return Integer.valueOf(member2.getRole());
                    }
                }
            }
        }
        return null;
    }

    private C31243a() {
        this.f81916a = new ConcurrentHashMap<>();
        this.f81917d = new ConcurrentHashMap<>();
        this.f81918e = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public static List<Conversation> m101793a() {
        C6417a a = C6417a.m20015a();
        C7573i.m23582a((Object) a, "ConversationListModel.inst()");
        List c = a.mo15544c();
        C7573i.m23582a((Object) c, "ConversationListModel.inst().groupConversationSync");
        Iterable iterable = c;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            Conversation conversation = (Conversation) next;
            C7573i.m23582a((Object) conversation, "it");
            if (conversation.isMember()) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public /* synthetic */ C31243a(C7571f fVar) {
        this();
    }

    /* renamed from: b */
    public final List<IMMember> mo81799b(String str) {
        C7573i.m23587b(str, "conversationId");
        return mo81792a(str, null);
    }

    /* renamed from: a */
    public static List<IMMember> m101794a(List<? extends Member> list) {
        List<IMMember> arrayList = new ArrayList<>();
        if (list != null) {
            for (Member member : list) {
                IMMember iMMember = new IMMember();
                iMMember.setUser(C6961d.m21657a().mo18022a(String.valueOf(member.getUid()), false));
                iMMember.setMember(member);
                if (member.getRole() == GroupRole.OWNER.getValue()) {
                    arrayList.add(0, iMMember);
                } else {
                    arrayList.add(iMMember);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static HashMap<String, String> m101800c(List<IMMember> list) {
        Object obj;
        HashMap<String, String> hashMap = new HashMap<>();
        if (list != null) {
            for (IMMember iMMember : list) {
                Member member = iMMember.getMember();
                String str = null;
                if (member != null) {
                    obj = Long.valueOf(member.getUid());
                } else {
                    obj = null;
                }
                String valueOf = String.valueOf(obj);
                Member member2 = iMMember.getMember();
                if (member2 != null) {
                    str = member2.getSecUid();
                }
                String valueOf2 = String.valueOf(str);
                if (!(valueOf == null || valueOf2 == null)) {
                    hashMap.put(valueOf, valueOf2);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    private static GroupAnnouncementExtra m101803d(Conversation conversation) {
        boolean z;
        C7573i.m23587b(conversation, "conversation");
        ConversationCoreInfo coreInfo = conversation.getCoreInfo();
        if (coreInfo != null) {
            CharSequence notice = coreInfo.getNotice();
            if (notice == null || notice.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                coreInfo = null;
            }
            if (coreInfo != null) {
                String str = (String) coreInfo.getExt().get("a:s_notice");
                if (str != null) {
                    try {
                        return (GroupAnnouncementExtra) C31913m.m103667a(str, GroupAnnouncementExtra.class);
                    } catch (Throwable th) {
                        C6921a.m21559a(th);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo81798b(Conversation conversation) {
        String str;
        boolean z;
        C7573i.m23587b(conversation, "conversation");
        ConversationCoreInfo coreInfo = conversation.getCoreInfo();
        if (coreInfo != null) {
            str = coreInfo.getNotice();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        GroupAnnouncementExtra d = m101803d(conversation);
        if (d == null) {
            return null;
        }
        long j = -1;
        ConversationSettingInfo settingInfo = conversation.getSettingInfo();
        if (settingInfo != null) {
            Map ext = settingInfo.getExt();
            if (ext != null) {
                String str2 = (String) ext.get("a:s_last_read_group_notice_time");
                if (str2 != null) {
                    try {
                        j = Long.parseLong(str2);
                    } catch (Exception e) {
                        C6921a.m21559a((Throwable) e);
                    }
                }
            }
        }
        if (j < d.getUpdateTime()) {
            return str;
        }
        return null;
    }

    /* renamed from: a */
    public static void m101796a(Conversation conversation) {
        C7573i.m23587b(conversation, "conversation");
        GroupNoticeContent groupNoticeContent = new GroupNoticeContent();
        groupNoticeContent.setType(100121);
        Message a = new C6416a().mo15526a(conversation).mo15527a(C31913m.m103668a(groupNoticeContent)).mo15525a(1001).mo15528a();
        C7573i.m23582a((Object) a, "it");
        a.setMsgStatus(5);
        C31863ai.m103533b(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m101801c(com.bytedance.p263im.core.model.Conversation r4) {
        /*
            java.lang.String r0 = "conversation"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a.m101818a()
            com.ss.android.ugc.aweme.im.sdk.group.model.GroupAnnouncementExtra r0 = m101803d(r4)
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            com.bytedance.im.core.model.ConversationSettingInfo r1 = r4.getSettingInfo()
            if (r1 == 0) goto L_0x0020
            java.util.Map r1 = r1.getExt()
            if (r1 == 0) goto L_0x0020
            java.util.Map r1 = kotlin.collections.C7507ae.m23402c(r1)
            goto L_0x0027
        L_0x0020:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
        L_0x0027:
            long r2 = r0.getUpdateTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = r0
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "a:s_last_read_group_notice_time"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r2, r3)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x007a
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            java.lang.String r0 = "a:s_last_read_group_notice_time"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.put(r0, r2)
            com.bytedance.im.core.model.ConversationSettingInfo r0 = r4.getSettingInfo()
            if (r0 == 0) goto L_0x0066
            r0.setExt(r1)
        L_0x0066:
            com.bytedance.im.core.model.b r0 = new com.bytedance.im.core.model.b
            java.lang.String r4 = r4.getConversationId()
            r0.<init>(r4)
            com.ss.android.ugc.aweme.im.sdk.group.a$i r4 = new com.ss.android.ugc.aweme.im.sdk.group.a$i
            r4.<init>()
            com.bytedance.im.core.a.a.b r4 = (com.bytedance.p263im.core.p584a.p585a.C11195b) r4
            r0.mo15569a(r1, r4)
            return
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.m101801c(com.bytedance.im.core.model.Conversation):void");
    }

    /* renamed from: d */
    private static ArrayList<Long> m101804d(List<? extends IMUser> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ArrayList<>();
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        for (IMUser uid : list) {
            String uid2 = uid.getUid();
            C7573i.m23582a((Object) uid2, "user.uid");
            arrayList.add(Long.valueOf(Long.parseLong(uid2)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo81801b(List<IMMember> list) {
        Long l;
        List arrayList = new ArrayList();
        if (list != null) {
            for (IMMember iMMember : list) {
                Member member = iMMember.getMember();
                if (member != null) {
                    l = Long.valueOf(member.getUid());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                iMMember.setUser(C6961d.m21657a().mo18022a(valueOf, false));
                if (iMMember.getUser() == null && valueOf != null) {
                    arrayList.add(iMMember);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            mo81797a(arrayList, 50);
        }
    }

    /* renamed from: c */
    public final boolean mo81802c(String str) {
        boolean z;
        boolean z2 = false;
        if (str == null) {
            return false;
        }
        List b = mo81799b(str);
        Collection collection = b;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        Iterator it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = true;
                break;
            }
            IMMember iMMember = (IMMember) it.next();
            IMUser user = iMMember.getUser();
            if ((user == null || !user.equals(IMUser.fromUser(C7074e.m22071c()))) && iMMember.getMember() != null) {
                Member member = iMMember.getMember();
                if (member == null) {
                    C7573i.m23580a();
                }
                if (member.getRole() != GroupRole.OWNER.getValue()) {
                    break;
                }
            }
        }
        return z2;
    }

    /* renamed from: a */
    public final Conversation mo81790a(String str) {
        C7573i.m23587b(str, "conversationId");
        Conversation conversation = (Conversation) this.f81917d.get(str);
        if (conversation != null) {
            return conversation;
        }
        C31243a aVar = this;
        Conversation a = C6417a.m20015a().mo15530a(str);
        if (a == null) {
            return null;
        }
        aVar.f81917d.put(str, a);
        return a;
    }

    /* renamed from: a */
    public static void m101795a(long j, C48007r<? super List<Conversation>, ? super Long, ? super Boolean, ? super C11438g, C7581n> rVar) {
        C7573i.m23587b(rVar, "callback");
        C6417a.m20015a().mo15531a(C11203a.f30381b, 0, j, (C11194a<List<Conversation>>) new C31250g<List<Conversation>>(rVar));
    }

    /* renamed from: b */
    private static List<IMMember> m101799b(List<IMMember> list, int i) {
        List<IMMember> arrayList = new ArrayList<>();
        if (list.size() > i) {
            arrayList.addAll(list.subList(0, i));
        } else {
            arrayList.addAll(list);
        }
        list.removeAll(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public final void mo81800b(String str, List<? extends Member> list) {
        boolean z;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                List b = mo81799b(str);
                if (b != null) {
                    Iterable iterable = b;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (!C7525m.m23496a((Iterable<? extends T>) list, ((IMMember) next).getMember())) {
                            arrayList.add(next);
                        }
                    }
                    this.f81916a.put(str, (List) arrayList);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m101802c(String str, List<String> list) {
        boolean z;
        C7573i.m23587b(str, "conversationId");
        C7573i.m23587b(list, "uidList");
        Conversation a = C6417a.m20015a().mo15530a(str);
        if (a != null) {
            GroupInviteCardInfo groupInviteCardInfo = new GroupInviteCardInfo();
            groupInviteCardInfo.setFromUserId(String.valueOf(C7074e.m22072d()));
            groupInviteCardInfo.setFromUserSecId(C31085i.m101389b(groupInviteCardInfo.getFromUserId()));
            groupInviteCardInfo.setConversationId(a.getConversationId());
            groupInviteCardInfo.setConversationShortId(String.valueOf(a.getConversationShortId()));
            groupInviteCardInfo.setMemberCount(a.getMemberCount());
            ConversationCoreInfo coreInfo = a.getCoreInfo();
            if (coreInfo != null) {
                CharSequence icon = coreInfo.getIcon();
                if (icon == null || icon.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(C7525m.m23464b((T[]) new String[]{coreInfo.getIcon(), coreInfo.getIcon(), coreInfo.getIcon()}));
                    groupInviteCardInfo.setGroupIcon(urlModel);
                }
                groupInviteCardInfo.setGroupName(coreInfo.getName());
            }
            C7058be.m21980a().mo18265a(list, C7525m.m23457a(GroupInviteContent.Companion.obtain(groupInviteCardInfo)));
        }
    }

    /* renamed from: a */
    public static void m101797a(String str, String str2, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "conversationId");
        C7573i.m23587b(str2, "uid");
        C7573i.m23587b(bVar, "callback");
        new C6425b(str).mo15567a(str, str2, (C11195b<Member>) new C31249f<Member>(bVar));
    }

    /* renamed from: a */
    public static void m101798a(List<? extends IMUser> list, Map<String, String> map, C7563m<? super Conversation, ? super C11438g, C7581n> mVar) {
        C7573i.m23587b(list, "userList");
        C7573i.m23587b(map, "map");
        C6417a a = C6417a.m20015a();
        Iterable<IMUser> iterable = list;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (IMUser uid : iterable) {
            String uid2 = uid.getUid();
            C7573i.m23582a((Object) uid2, "it.uid");
            arrayList.add(Long.valueOf(Long.parseLong(uid2)));
        }
        a.mo15532a(0, (List) arrayList, map, (C11195b<Conversation>) new C31248e<Conversation>(mVar));
    }
}
