package com.p280ss.android.ugc.aweme.p313im.sdk.relations.model;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.p263im.core.model.Member;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31661b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31692e;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31641d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31641d.C31642a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMConversation;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel */
public final class RelationMemberListViewModel extends BaseMemberListViewModel<Object> implements C31641d<IMContact>, C31661b {

    /* renamed from: b */
    static final /* synthetic */ C7595j[] f83128b = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RelationMemberListViewModel.class), "mRelationModel", "getMRelationModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/core/SortWeightRelationModel;"))};

    /* renamed from: g */
    public static final C31775a f83129g = new C31775a(null);

    /* renamed from: c */
    public String f83130c;

    /* renamed from: d */
    public SharePackage f83131d;

    /* renamed from: e */
    public BaseContent f83132e;

    /* renamed from: f */
    public List<? extends IMContact> f83133f = C7525m.m23461a();

    /* renamed from: h */
    private final C7541d f83134h = C7546e.m23569a(new C31777c(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel$a */
    public static final class C31775a {
        private C31775a() {
        }

        public /* synthetic */ C31775a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel$b */
    static final class C31776b extends Lambda implements C7562b<List<? extends IMMember>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RelationMemberListViewModel f83135a;

        C31776b(RelationMemberListViewModel relationMemberListViewModel) {
            this.f83135a = relationMemberListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m103165a((List) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103165a(List<IMMember> list) {
            Object obj;
            if (list != null) {
                RelationMemberListViewModel relationMemberListViewModel = this.f83135a;
                Iterable<IMMember> iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (IMMember iMMember : iterable) {
                    IMUser user = iMMember.getUser();
                    if (user == null) {
                        user = new IMUser();
                        Member member = iMMember.getMember();
                        String str = null;
                        if (member != null) {
                            obj = Long.valueOf(member.getUid());
                        } else {
                            obj = null;
                        }
                        user.setUid(String.valueOf(obj));
                        Member member2 = iMMember.getMember();
                        if (member2 != null) {
                            str = member2.getAlias();
                        }
                        user.setNickName(str);
                    }
                    arrayList.add(user);
                }
                relationMemberListViewModel.mo82571a((List) arrayList);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel$c */
    static final class C31777c extends Lambda implements C7561a<C31692e> {

        /* renamed from: a */
        final /* synthetic */ RelationMemberListViewModel f83136a;

        C31777c(RelationMemberListViewModel relationMemberListViewModel) {
            this.f83136a = relationMemberListViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C31692e invoke() {
            int i;
            boolean z = false;
            if (this.f83136a.f83142j == 0 || this.f83136a.f83142j == 4) {
                i = 0;
                z = true;
            } else {
                i = 2;
            }
            C31692e eVar = new C31692e(new C31690a(i, z));
            eVar.mo82398a((C31641d<IMContact>) this.f83136a);
            eVar.mo82469a((C31661b) this.f83136a);
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel$d */
    static final class C31778d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f83137a;

        /* renamed from: b */
        final /* synthetic */ RelationMemberListViewModel f83138b;

        /* renamed from: c */
        final /* synthetic */ String f83139c;

        C31778d(List list, RelationMemberListViewModel relationMemberListViewModel, String str) {
            this.f83137a = list;
            this.f83138b = relationMemberListViewModel;
            this.f83139c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<IMUser> call() {
            return C6961d.m21657a().mo18023a(this.f83137a, this.f83139c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel$e */
    static final class C31779e<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ RelationMemberListViewModel f83140a;

        /* renamed from: b */
        final /* synthetic */ String f83141b;

        C31779e(RelationMemberListViewModel relationMemberListViewModel, String str) {
            this.f83140a = relationMemberListViewModel;
            this.f83141b = str;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m103168a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103168a(C1592h<List<IMUser>> hVar) {
            C7573i.m23582a((Object) hVar, "result");
            if (hVar.mo6882b()) {
                this.f83140a.f83144l.postValue(hVar.mo6890e());
            }
        }
    }

    /* renamed from: b */
    private final C31692e m103151b() {
        return (C31692e) this.f83134h.getValue();
    }

    /* renamed from: d */
    private final void m103153d() {
        String str = this.f83130c;
        if (str != null) {
            C31244a.m101818a().mo81792a(str, (C7562b<? super List<IMMember>, C7581n>) new C31776b<Object,C7581n>(this));
        }
        m103152c();
    }

    /* renamed from: a */
    public final void mo81882a() {
        int i = this.f83142j;
        if (i != 4) {
            switch (i) {
                case 0:
                case 1:
                    m103152c();
                    return;
            }
        } else {
            m103153d();
        }
    }

    public final void onCleared() {
        super.onCleared();
        m103151b().mo82401b();
        m103151b().mo82471i();
    }

    /* renamed from: c */
    private final void m103152c() {
        List c = m103151b().mo82404c();
        if (!c.isEmpty()) {
            mo82400a(c, m103151b().mo82405d());
        } else {
            m103151b().mo82406e();
        }
    }

    /* renamed from: a */
    public final void mo82571a(List<? extends IMContact> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f83133f = list;
    }

    /* renamed from: b */
    public final void mo82402b(Throwable th) {
        C7573i.m23587b(th, "t");
        C31642a.m102821a(this, th);
    }

    /* renamed from: c */
    public final void mo82446c(Throwable th) {
        C7573i.m23587b(th, "t");
        this.f83143k.postValue(new ArrayList());
        C6921a.m21559a(th);
    }

    /* renamed from: a */
    public final void mo82399a(Throwable th) {
        C7573i.m23587b(th, "t");
        this.f83143k.postValue(new ArrayList());
        C6921a.m21559a(th);
    }

    /* renamed from: b */
    public final void mo82572b(List<? extends IMContact> list) {
        C7573i.m23587b(list, "contactList");
        List d = C7525m.m23509d((Collection<? extends T>) mo82590o());
        for (IMContact iMContact : list) {
            if (d.contains(iMContact)) {
                d.remove(iMContact);
            } else {
                d.add(iMContact);
            }
        }
        this.f83148p.postValue(d);
    }

    /* renamed from: c */
    public final void mo82573c(List<? extends IMContact> list) {
        boolean z;
        C7573i.m23587b(list, "groupList");
        Iterable o = mo82590o();
        Collection arrayList = new ArrayList();
        for (Object next : o) {
            IMContact iMContact = (IMContact) next;
            if (!(iMContact instanceof IMConversation) || list.contains(iMContact)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        List d = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
        for (IMContact iMContact2 : list) {
            if (!d.contains(iMContact2)) {
                d.add(iMContact2);
            }
        }
        this.f83148p.postValue(d);
    }

    /* renamed from: a */
    public final void mo81883a(String str) {
        List list;
        if (str != null) {
            this.f83149q.postValue(str);
            switch (this.f83142j) {
                case 0:
                case 1:
                case 4:
                    m103151b().mo82470a(str);
                    break;
                case 5:
                case 6:
                    List list2 = (List) this.f83143k.getValue();
                    if (list2 != null) {
                        Iterable<IMContact> iterable = list2;
                        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                        for (IMContact iMContact : iterable) {
                            if (iMContact != null) {
                                arrayList.add((IMUser) iMContact);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                            }
                        }
                        list = (List) arrayList;
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        C1592h.m7853a((Callable<TResult>) new C31778d<TResult>(list, this, str)).mo6875a((C1591g<TResult, TContinuationResult>) new C31779e<TResult,TContinuationResult>(this, str));
                        break;
                    }
                    break;
            }
            if (str != null) {
                return;
            }
        }
        RelationMemberListViewModel relationMemberListViewModel = this;
        relationMemberListViewModel.f83149q.postValue("");
        relationMemberListViewModel.f83144l.postValue(C7525m.m23461a());
    }

    /* renamed from: a */
    public final void mo82445a(List<IMContact> list, String str) {
        C7573i.m23587b(list, "list");
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        this.f83144l.postValue(list);
    }

    /* renamed from: a */
    public final void mo82400a(List<IMContact> list, boolean z) {
        C7573i.m23587b(list, "list");
        this.f83143k.postValue(list);
        this.f83145m.postValue(C7579l.m23633a(m103151b().mo82466h(), m103151b().mo82462g()));
    }

    /* renamed from: b */
    public final void mo82403b(List<IMContact> list, boolean z) {
        C7573i.m23587b(list, "list");
        C31642a.m102822a(this, list, z);
    }
}
