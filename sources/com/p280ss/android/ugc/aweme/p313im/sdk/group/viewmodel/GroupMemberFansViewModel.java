package com.p280ss.android.ugc.aweme.p313im.sdk.group.viewmodel;

import android.os.Handler;
import com.bytedance.p263im.core.model.Member;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.following.model.C29567c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.group.model.IMMember;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.C31243a.C31244a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.C31268a;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.SearchUser;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.select.BaseMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
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
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7496w;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel */
public final class GroupMemberFansViewModel extends BaseMemberListViewModel<IMContact> implements C31326a<User> {

    /* renamed from: b */
    static final /* synthetic */ C7595j[] f82052b = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupMemberFansViewModel.class), "searchTask", "getSearchTask()Ljava/lang/Runnable;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GroupMemberFansViewModel.class), "searchHandler", "getSearchHandler()Landroid/os/Handler;"))};

    /* renamed from: g */
    public static final C31305a f82053g = new C31305a(null);

    /* renamed from: c */
    public String f82054c;

    /* renamed from: d */
    public List<? extends IMContact> f82055d = C7525m.m23461a();

    /* renamed from: e */
    public boolean f82056e;

    /* renamed from: f */
    public final C31327b f82057f = new C31327b();

    /* renamed from: h */
    private C25674b<C25673a<User, C29567c>> f82058h;

    /* renamed from: i */
    private final C7541d f82059i = C7546e.m23569a(new C31315k(this));

    /* renamed from: r */
    private final C7541d f82060r = C7546e.m23569a(C31314j.f82081a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$a */
    public static final class C31305a {
        private C31305a() {
        }

        public /* synthetic */ C31305a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$b */
    static final class C31306b extends Lambda implements C7562b<List<? extends IMMember>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82061a;

        C31306b(GroupMemberFansViewModel groupMemberFansViewModel) {
            this.f82061a = groupMemberFansViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m101986a((List) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101986a(List<IMMember> list) {
            Object obj;
            if (list != null) {
                GroupMemberFansViewModel groupMemberFansViewModel = this.f82061a;
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
                groupMemberFansViewModel.mo81888a((List) arrayList);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$c */
    static final class C31307c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82062a;

        /* renamed from: b */
        final /* synthetic */ boolean f82063b;

        /* renamed from: c */
        final /* synthetic */ List f82064c;

        C31307c(GroupMemberFansViewModel groupMemberFansViewModel, boolean z, List list) {
            this.f82062a = groupMemberFansViewModel;
            this.f82063b = z;
            this.f82064c = list;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m101987a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101987a() {
            List list;
            this.f82062a.f82056e = this.f82063b;
            List list2 = this.f82064c;
            if (list2 != null) {
                Iterable<User> iterable = list2;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (User fromUser : iterable) {
                    IMUser fromUser2 = IMUser.fromUser(fromUser);
                    if (fromUser2 != null) {
                        arrayList.add(fromUser2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMContact");
                    }
                }
                list = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
            } else {
                list = new ArrayList();
            }
            this.f82062a.f83143k.setValue(list);
            this.f82062a.mo81553e(list, this.f82063b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$d */
    static final class C31308d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82065a;

        /* renamed from: b */
        final /* synthetic */ boolean f82066b;

        /* renamed from: c */
        final /* synthetic */ List f82067c;

        C31308d(GroupMemberFansViewModel groupMemberFansViewModel, boolean z, List list) {
            this.f82065a = groupMemberFansViewModel;
            this.f82066b = z;
            this.f82067c = list;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m101988a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101988a() {
            List list;
            this.f82065a.f82056e = this.f82066b;
            List list2 = this.f82067c;
            if (list2 != null) {
                Iterable<User> iterable = list2;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (User fromUser : iterable) {
                    IMUser fromUser2 = IMUser.fromUser(fromUser);
                    if (fromUser2 != null) {
                        arrayList.add(fromUser2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMContact");
                    }
                }
                list = C7525m.m23509d((Collection<? extends T>) (List) arrayList);
            } else {
                list = null;
            }
            this.f82065a.f83143k.setValue(list);
            this.f82065a.mo81551d(list, this.f82066b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$e */
    static final class C31309e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82068a;

        /* renamed from: b */
        final /* synthetic */ Throwable f82069b;

        C31309e(GroupMemberFansViewModel groupMemberFansViewModel, Throwable th) {
            this.f82068a = groupMemberFansViewModel;
            this.f82069b = th;
            super(0);
        }

        /* renamed from: a */
        private void m101989a() {
            this.f82068a.mo81549a_(this.f82069b);
        }

        public final /* synthetic */ Object invoke() {
            m101989a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$f */
    static final class C31310f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82070a;

        /* renamed from: b */
        final /* synthetic */ Throwable f82071b;

        C31310f(GroupMemberFansViewModel groupMemberFansViewModel, Throwable th) {
            this.f82070a = groupMemberFansViewModel;
            this.f82071b = th;
            super(0);
        }

        /* renamed from: a */
        private void m101990a() {
            this.f82070a.mo81550b_(this.f82071b);
        }

        public final /* synthetic */ Object invoke() {
            m101990a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$g */
    static final class C31311g extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82072a;

        /* renamed from: b */
        final /* synthetic */ List f82073b;

        /* renamed from: c */
        final /* synthetic */ boolean f82074c;

        C31311g(GroupMemberFansViewModel groupMemberFansViewModel, List list, boolean z) {
            this.f82072a = groupMemberFansViewModel;
            this.f82073b = list;
            this.f82074c = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m101991a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101991a() {
            List list;
            List list2 = (List) this.f82072a.f83144l.getValue();
            if (list2 != null) {
                list = C7525m.m23509d((Collection<? extends T>) list2);
            } else {
                list = new ArrayList();
            }
            List list3 = this.f82073b;
            if (list3 == null) {
                list3 = new ArrayList();
            }
            list.addAll(list3);
            this.f82072a.f83144l.setValue(list);
            this.f82072a.mo81553e(list, this.f82074c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$h */
    static final class C31312h extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82075a;

        /* renamed from: b */
        final /* synthetic */ List f82076b;

        /* renamed from: c */
        final /* synthetic */ boolean f82077c;

        C31312h(GroupMemberFansViewModel groupMemberFansViewModel, List list, boolean z) {
            this.f82075a = groupMemberFansViewModel;
            this.f82076b = list;
            this.f82077c = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m101992a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101992a() {
            this.f82075a.f83144l.setValue(this.f82076b);
            this.f82075a.mo81551d(this.f82076b, this.f82077c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$i */
    public static final class C31313i implements C47557ad<C31268a> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82078a;

        /* renamed from: b */
        final /* synthetic */ String f82079b;

        /* renamed from: c */
        final /* synthetic */ int f82080c;

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            C6921a.m21559a(th);
            if (!(!C7573i.m23585a((Object) this.f82079b, (Object) this.f82078a.f82057f.f82097a))) {
                if (this.f82080c > 0) {
                    this.f82078a.mo81890d(th);
                } else {
                    this.f82078a.mo81889c(th);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(C31268a aVar) {
            List list;
            boolean z;
            C7573i.m23587b(aVar, "response");
            if (!(!C7573i.m23585a((Object) this.f82079b, (Object) this.f82078a.f82057f.f82097a))) {
                this.f82078a.f82057f.f82098b = aVar.f81965b;
                List<SearchUser> list2 = aVar.f81964a;
                if (list2 != null) {
                    Iterable iterable = list2;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (((SearchUser) next).getUser() != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<SearchUser> iterable2 = (List) arrayList;
                    Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable2, 10));
                    for (SearchUser user : iterable2) {
                        User user2 = user.getUser();
                        if (user2 == null) {
                            C7573i.m23580a();
                        }
                        IMUser fromUser = IMUser.fromUser(user2);
                        if (fromUser != null) {
                            arrayList2.add(fromUser);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMContact");
                        }
                    }
                    list = C7525m.m23509d((Collection<? extends T>) (List) arrayList2);
                } else {
                    list = null;
                }
                if (this.f82080c > 0) {
                    this.f82078a.mo81892g(list, aVar.f81966c);
                } else {
                    this.f82078a.mo81891f(list, aVar.f81966c);
                }
            }
        }

        C31313i(GroupMemberFansViewModel groupMemberFansViewModel, String str, int i) {
            this.f82078a = groupMemberFansViewModel;
            this.f82079b = str;
            this.f82080c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$j */
    static final class C31314j extends Lambda implements C7561a<Handler> {

        /* renamed from: a */
        public static final C31314j f82081a = new C31314j();

        C31314j() {
            super(0);
        }

        /* renamed from: a */
        private static Handler m101994a() {
            return new Handler();
        }

        public final /* synthetic */ Object invoke() {
            return m101994a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$k */
    static final class C31315k extends Lambda implements C7561a<Runnable> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82082a;

        C31315k(GroupMemberFansViewModel groupMemberFansViewModel) {
            this.f82082a = groupMemberFansViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Runnable invoke() {
            return new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C31315k f82083a;

                {
                    this.f82083a = r1;
                }

                public final void run() {
                    this.f82083a.f82082a.mo81887a(this.f82083a.f82082a.f82057f.f82097a, this.f82083a.f82082a.f82057f.f82098b);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$l */
    static final class C31317l extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82084a;

        C31317l(GroupMemberFansViewModel groupMemberFansViewModel) {
            this.f82084a = groupMemberFansViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m101996a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101996a() {
            this.f82084a.mo81551d(new ArrayList(), false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$m */
    static final class C31318m extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82085a;

        /* renamed from: b */
        final /* synthetic */ Exception f82086b;

        C31318m(GroupMemberFansViewModel groupMemberFansViewModel, Exception exc) {
            this.f82085a = groupMemberFansViewModel;
            this.f82086b = exc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m101997a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101997a() {
            this.f82085a.mo81549a_(this.f82086b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupMemberFansViewModel$n */
    static final class C31319n extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ GroupMemberFansViewModel f82087a;

        /* renamed from: b */
        final /* synthetic */ Exception f82088b;

        C31319n(GroupMemberFansViewModel groupMemberFansViewModel, Exception exc) {
            this.f82087a = groupMemberFansViewModel;
            this.f82088b = exc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m101998a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m101998a() {
            this.f82087a.mo81550b_(this.f82088b);
        }
    }

    /* renamed from: v */
    private final Runnable m101967v() {
        return (Runnable) this.f82059i.getValue();
    }

    /* renamed from: w */
    private final Handler m101968w() {
        return (Handler) this.f82060r.getValue();
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        mo81558j();
    }

    public final void aD_() {
        mo81559k();
    }

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<User> list, boolean z) {
    }

    public final void ae_() {
        m101962a((C7561a<C7581n>) new C31317l<C7581n>(this));
    }

    /* renamed from: t */
    private final void m101965t() {
        String str = this.f82054c;
        if (str != null) {
            C31244a.m101818a().mo81792a(str, (C7562b<? super List<IMMember>, C7581n>) new C31306b<Object,C7581n>(this));
        }
    }

    /* renamed from: l */
    public final void mo81893l() {
        Integer num = (Integer) this.f83147o.getValue();
        if (num != null && num.intValue() == 0) {
            C25674b u = m101966u();
            if (u != null) {
                u.mo56976a(Integer.valueOf(4));
            }
        } else {
            m101969x();
        }
    }

    /* renamed from: x */
    private final void m101969x() {
        boolean z;
        C31327b bVar = this.f82057f;
        boolean z2 = false;
        if (bVar.f82097a.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && bVar.f82098b > 0) {
            z2 = true;
        }
        if (!z2) {
            bVar = null;
        }
        if (bVar != null) {
            mo81559k();
            mo81887a(bVar.f82097a, bVar.f82098b);
            return;
        }
        StringBuilder sb = new StringBuilder("loadMoreSearchFollowers param invalid: ");
        sb.append(this.f82057f.f82097a);
        sb.append(", ");
        sb.append(this.f82057f.f82098b);
    }

    /* renamed from: a */
    public final void mo81882a() {
        boolean z;
        List list;
        Collection collection = (Collection) this.f83143k.getValue();
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m101965t();
            C25674b u = m101966u();
            if (u != null) {
                u.mo56976a(Integer.valueOf(1));
            }
        } else {
            this.f83143k.postValue(this.f83143k.getValue());
            List list2 = (List) this.f83143k.getValue();
            if (list2 != null) {
                list = C7525m.m23509d((Collection<? extends T>) list2);
            } else {
                list = null;
            }
            mo81551d(list, this.f82056e);
        }
    }

    /* renamed from: u */
    private final C25674b<C25673a<User, C29567c>> m101966u() {
        String str;
        String str2;
        boolean z;
        if (this.f82058h != null) {
            return this.f82058h;
        }
        User c = C7074e.m22071c();
        if (c != null) {
            CharSequence uid = c.getUid();
            boolean z2 = false;
            if (uid == null || uid.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                CharSequence secUid = c.getSecUid();
                if (secUid == null || secUid.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    C6956a a = C6956a.m21632a();
                    C7573i.m23582a((Object) a, "AwemeImManager.instance()");
                    C25673a followerFetchModel = a.mo18009f().getFollowerFetchModel(c.getUid(), c.getSecUid());
                    if (followerFetchModel == null) {
                        C6921a.m21555a("GroupFansViewModel validateFollowPresenter model null");
                        return null;
                    }
                    this.f82058h = new C25674b<>();
                    C25674b<C25673a<User, C29567c>> bVar = this.f82058h;
                    if (bVar == null) {
                        C7573i.m23580a();
                    }
                    bVar.mo66536a(followerFetchModel);
                    C25674b<C25673a<User, C29567c>> bVar2 = this.f82058h;
                    if (bVar2 == null) {
                        C7573i.m23580a();
                    }
                    bVar2.mo66537a(this);
                    return this.f82058h;
                }
            }
        }
        StringBuilder sb = new StringBuilder("GroupFansViewModel validateFollowPresenter uid or secUid null: ");
        if (c != null) {
            str = c.getUid();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", ");
        if (c != null) {
            str2 = c.getSecUid();
        } else {
            str2 = null;
        }
        sb.append(str2);
        C6921a.m21555a(sb.toString());
        return null;
    }

    /* renamed from: a */
    public final void mo81883a(String str) {
        m101963b(str);
    }

    /* renamed from: a */
    public final void mo81888a(List<? extends IMContact> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f82055d = list;
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        m101962a((C7561a<C7581n>) new C31318m<C7581n>(this, exc));
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        m101962a((C7561a<C7581n>) new C31319n<C7581n>(this, exc));
    }

    /* renamed from: c */
    public final void mo81889c(Throwable th) {
        m101964b((C7561a<C7581n>) new C31309e<C7581n>(this, th));
    }

    /* renamed from: d */
    public final void mo81890d(Throwable th) {
        m101964b((C7561a<C7581n>) new C31310f<C7581n>(this, th));
    }

    /* renamed from: a */
    private final void m101962a(C7561a<C7581n> aVar) {
        Integer num = (Integer) this.f83147o.getValue();
        if (num != null && num.intValue() == 0) {
            aVar.invoke();
        }
    }

    /* renamed from: b */
    private final void m101964b(C7561a<C7581n> aVar) {
        Integer num = (Integer) this.f83147o.getValue();
        if (num != null && 1 == num.intValue()) {
            aVar.invoke();
        }
    }

    /* renamed from: b */
    private final void m101963b(String str) {
        boolean z;
        GroupMemberFansViewModel groupMemberFansViewModel;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            groupMemberFansViewModel = this;
        } else {
            groupMemberFansViewModel = null;
        }
        if (groupMemberFansViewModel == null) {
            this.f83149q.setValue(str);
            C31327b bVar = this.f82057f;
            if (str == null) {
                C7573i.m23580a();
            }
            bVar.mo81898a(str);
            this.f82057f.f82098b = 0;
            mo81558j();
            m101968w().removeCallbacks(m101967v());
            m101968w().postDelayed(m101967v(), 150);
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<User> list, boolean z) {
        m101962a((C7561a<C7581n>) new C31308d<C7581n>(this, z, list));
    }

    /* renamed from: f */
    public final void mo81891f(List<IMContact> list, boolean z) {
        m101964b((C7561a<C7581n>) new C31312h<C7581n>(this, list, z));
    }

    /* renamed from: g */
    public final void mo81892g(List<IMContact> list, boolean z) {
        m101964b((C7561a<C7581n>) new C31311g<C7581n>(this, list, z));
    }

    /* renamed from: a */
    public final void mo81887a(String str, int i) {
        C7319aa.m22929a((C7496w<? extends T>) C7077s.m22143a(str, i)).mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19137b((C47557ad<? super T>) new C31313i<Object>(this, str, i));
    }

    /* renamed from: b */
    public final void mo59108b(List<User> list, boolean z) {
        m101962a((C7561a<C7581n>) new C31307c<C7581n>(this, z, list));
    }
}
