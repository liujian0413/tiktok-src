package com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.following.model.C29570e;
import com.p280ss.android.ugc.aweme.following.model.C29573h;
import com.p280ss.android.ugc.aweme.following.model.C29575j;
import com.p280ss.android.ugc.aweme.following.repository.C29603e;
import com.p280ss.android.ugc.aweme.following.repository.C29607i;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel */
public final class FollowingRelationViewModel extends JediViewModel<FollowingRelationState> {

    /* renamed from: f */
    public static final C29838a f78405f = new C29838a(null);

    /* renamed from: c */
    public final C29603e f78406c = new C29603e();

    /* renamed from: d */
    public boolean f78407d = true;

    /* renamed from: e */
    public final ListMiddleware<FollowingRelationState, Object, C29607i> f78408e;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$a */
    public static final class C29838a {
        private C29838a() {
        }

        public /* synthetic */ C29838a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$b */
    static final class C29839b extends Lambda implements C7563m<FollowingRelationState, ListState<Object, C29607i>, FollowingRelationState> {

        /* renamed from: a */
        public static final C29839b f78409a = new C29839b();

        C29839b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m97621a((FollowingRelationState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static FollowingRelationState m97621a(FollowingRelationState followingRelationState, ListState<Object, C29607i> listState) {
            C7573i.m23587b(followingRelationState, "$receiver");
            C7573i.m23587b(listState, "it");
            return FollowingRelationState.copy$default(followingRelationState, null, null, false, null, listState, 15, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$c */
    static final class C29840c extends Lambda implements C7562b<FollowingRelationState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f78410a;

        C29840c(FollowingRelationViewModel followingRelationViewModel) {
            this.f78410a = followingRelationViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97622a((FollowingRelationState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97622a(FollowingRelationState followingRelationState) {
            C7573i.m23587b(followingRelationState, "it");
            this.f78410a.f78408e.mo29084b(followingRelationState.getListState().getList().size(), new C29573h(9, followingRelationState.isSelf()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$d */
    static final class C29841d extends Lambda implements C7562b<FollowingRelationState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f78411a;

        C29841d(FollowingRelationViewModel followingRelationViewModel) {
            this.f78411a = followingRelationViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97623a((FollowingRelationState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97623a(FollowingRelationState followingRelationState) {
            C7573i.m23587b(followingRelationState, "it");
            this.f78411a.f78408e.mo29084b(0, new C29573h(7, followingRelationState.isSelf()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$e */
    static final class C29842e extends Lambda implements C7562b<FollowingRelationState, C7492s<Pair<? extends List<? extends Object>, ? extends C29607i>>> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f78412a;

        C29842e(FollowingRelationViewModel followingRelationViewModel) {
            this.f78412a = followingRelationViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<Object>, C29607i>> invoke(final FollowingRelationState followingRelationState) {
            C7573i.m23587b(followingRelationState, "it");
            this.f78412a.f78407d = true;
            C7492s<Pair<List<Object>, C29607i>> d = this.f78412a.f78406c.mo75616a(followingRelationState.getUserId(), followingRelationState.getSecUserId(), 0, 20, 0, FollowingRelationViewModel.m97612a(true, followingRelationState.isSelf(), true), C43161e.m136882a(), C43161e.m136884b()).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C29842e f78413a;

                {
                    this.f78413a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<C29575j>, C29607i> apply(C29570e eVar) {
                    int i;
                    C7573i.m23587b(eVar, "resp");
                    List<User> list = eVar.f77931a;
                    C7573i.m23582a((Object) list, "resp.items");
                    Iterable<User> iterable = list;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (User user : iterable) {
                        C7573i.m23582a((Object) user, "user");
                        C29575j jVar = new C29575j(0, user, 0, null, 12, null);
                        arrayList.add(jVar);
                    }
                    List list2 = (List) arrayList;
                    boolean z = eVar.f77933c;
                    int i2 = eVar.f77936f;
                    long j = eVar.f77935e;
                    boolean z2 = eVar.f77937g;
                    int i3 = 1;
                    if (!this.f78413a.f78412a.f78407d) {
                        i3 = ((C29607i) followingRelationState.getListState().getPayload()).f77978e + 1;
                    }
                    List<User> list3 = eVar.f77931a;
                    if (list3 != null) {
                        i = list3.size();
                    } else {
                        i = 0;
                    }
                    C29607i iVar = new C29607i(z, i2, j, z2, i3, i);
                    return C7579l.m23633a(list2, iVar);
                }
            });
            C7573i.m23582a((Object) d, "mRepo.queryFollowingList…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$f */
    static final class C29844f extends Lambda implements C7562b<FollowingRelationState, C7492s<Pair<? extends List<? extends Object>, ? extends C29607i>>> {

        /* renamed from: a */
        final /* synthetic */ FollowingRelationViewModel f78415a;

        C29844f(FollowingRelationViewModel followingRelationViewModel) {
            this.f78415a = followingRelationViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<Object>, C29607i>> invoke(final FollowingRelationState followingRelationState) {
            C7573i.m23587b(followingRelationState, "it");
            this.f78415a.f78407d = false;
            C7492s<Pair<List<Object>, C29607i>> d = this.f78415a.f78406c.mo75616a(followingRelationState.getUserId(), followingRelationState.getSecUserId(), ((C29607i) followingRelationState.getListState().getPayload()).f77976c, 20, ((C29607i) followingRelationState.getListState().getPayload()).f31255b, FollowingRelationViewModel.m97612a(false, followingRelationState.isSelf(), ((C29607i) followingRelationState.getListState().getPayload()).f77977d), C43161e.m136882a(), C43161e.m136884b()).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C29844f f78416a;

                {
                    this.f78416a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<C29575j>, C29607i> apply(C29570e eVar) {
                    int i;
                    C7573i.m23587b(eVar, "resp");
                    List<User> list = eVar.f77931a;
                    C7573i.m23582a((Object) list, "resp.items");
                    Iterable<User> iterable = list;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (User user : iterable) {
                        C7573i.m23582a((Object) user, "user");
                        C29575j jVar = new C29575j(0, user, 0, null, 12, null);
                        arrayList.add(jVar);
                    }
                    List list2 = (List) arrayList;
                    boolean z = eVar.f77933c;
                    int i2 = eVar.f77936f;
                    long j = eVar.f77935e;
                    boolean z2 = eVar.f77937g;
                    int i3 = 1;
                    if (!this.f78416a.f78415a.f78407d) {
                        i3 = ((C29607i) followingRelationState.getListState().getPayload()).f77978e + 1;
                    }
                    List<User> list3 = eVar.f77931a;
                    if (list3 != null) {
                        i = list3.size();
                    } else {
                        i = 0;
                    }
                    C29607i iVar = new C29607i(z, i2, j, z2, i3, i);
                    return C7579l.m23633a(list2, iVar);
                }
            });
            C7573i.m23582a((Object) d, "mRepo.queryFollowingList…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$g */
    static final class C29846g extends Lambda implements C7563m<List<? extends Object>, List<? extends Object>, List<Object>> {

        /* renamed from: a */
        public static final C29846g f78418a = new C29846g();

        C29846g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m97628a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<Object> m97628a(List<? extends Object> list, List<? extends Object> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            HashSet hashSet = new HashSet();
            List<Object> arrayList = new ArrayList<>();
            int i = 0;
            for (Object next : list) {
                if (next instanceof C29575j) {
                    C29575j jVar = (C29575j) next;
                    if (hashSet.add(jVar.f77949b.getUid())) {
                        int i2 = i + 1;
                        arrayList.add(C29575j.m97120a(jVar.f77948a, jVar.f77949b, i, jVar.f77951d));
                        i = i2;
                    }
                }
                arrayList.add(next);
            }
            int i3 = i;
            for (Object next2 : list2) {
                if (next2 != null) {
                    C29575j jVar2 = (C29575j) next2;
                    if (hashSet.add(jVar2.f77949b.getUid())) {
                        int i4 = i3 + 1;
                        arrayList.add(C29575j.m97120a(jVar2.f77948a, jVar2.f77949b, i3, jVar2.f77951d));
                        i3 = i4;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.following.model.RelationUser");
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel$h */
    static final class C29847h extends Lambda implements C7562b<FollowingRelationState, FollowingRelationState> {

        /* renamed from: a */
        final /* synthetic */ List f78419a;

        C29847h(List list) {
            this.f78419a = list;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowingRelationState invoke(FollowingRelationState followingRelationState) {
            C7573i.m23587b(followingRelationState, "$receiver");
            return FollowingRelationState.copy$default(followingRelationState, null, null, false, this.f78419a, null, 23, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m97614i();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        m97613h();
    }

    /* renamed from: i */
    private static FollowingRelationState m97614i() {
        FollowingRelationState followingRelationState = new FollowingRelationState(null, null, false, null, null, 31, null);
        return followingRelationState;
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29036b(new C29841d(this));
    }

    /* renamed from: g */
    public final void mo75831g() {
        mo29036b(new C29840c(this));
    }

    public final void onCleared() {
        super.onCleared();
        this.f78406c.mo29370a();
    }

    /* renamed from: h */
    private final void m97613h() {
        ListMiddleware<FollowingRelationState, Object, C29607i> listMiddleware = this.f78408e;
        listMiddleware.mo29186a(C29852e.f78425a, (C7563m<? super S, ? super PROP, ? extends S>) C29839b.f78409a);
        mo29033a(listMiddleware);
    }

    public FollowingRelationViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C29842e(this), new C29844f(this), null, C29846g.f78418a, 4, null);
        this.f78408e = listMiddleware;
    }

    /* renamed from: a */
    public final void mo75829a(List<? extends Object> list) {
        C7573i.m23587b(list, "recommendList");
        mo29038c(new C29847h(list));
    }

    /* renamed from: a */
    public static int m97612a(boolean z, boolean z2, boolean z3) {
        int i = 2;
        if (!C6399b.m19944t()) {
            C7213d a = C7213d.m22500a();
            C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
            if (a.mo18786ay() && z3) {
                return 2;
            }
            i = 1;
        } else if (z) {
            C7213d a2 = C7213d.m22500a();
            C7573i.m23582a((Object) a2, "AbTestManager.getInstance()");
            if (a2.mo18786ay()) {
                return 2;
            }
            return 1;
        } else if (z3) {
            return i;
        } else {
            return 1;
        }
        return i;
    }

    /* renamed from: a */
    public final boolean mo75830a(boolean z, int i, int i2) {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        if (!a.mo18786ay() || C6399b.m19944t()) {
            return false;
        }
        boolean z2 = true;
        if (!z || ((i != 1 || i2 >= 15) && (i != 2 || i2 >= 5))) {
            z2 = false;
        } else {
            this.f78408e.mo29085c();
        }
        return z2;
    }
}
