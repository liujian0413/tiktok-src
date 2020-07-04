package com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.following.model.C29567c;
import com.p280ss.android.ugc.aweme.following.model.C29573h;
import com.p280ss.android.ugc.aweme.following.model.C29575j;
import com.p280ss.android.ugc.aweme.following.repository.C29602d;
import com.p280ss.android.ugc.aweme.following.repository.C29607i;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
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

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel */
public final class FollowerRelationViewModel extends JediViewModel<FollowerRelationState> {

    /* renamed from: f */
    public static final C29826a f78387f = new C29826a(null);

    /* renamed from: c */
    public final C29602d f78388c = new C29602d();

    /* renamed from: d */
    public boolean f78389d = true;

    /* renamed from: e */
    public final ListMiddleware<FollowerRelationState, Object, C29607i> f78390e;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$a */
    public static final class C29826a {
        private C29826a() {
        }

        public /* synthetic */ C29826a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$b */
    static final class C29827b extends Lambda implements C7563m<FollowerRelationState, ListState<Object, C29607i>, FollowerRelationState> {

        /* renamed from: a */
        public static final C29827b f78391a = new C29827b();

        C29827b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m97601a((FollowerRelationState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static FollowerRelationState m97601a(FollowerRelationState followerRelationState, ListState<Object, C29607i> listState) {
            C7573i.m23587b(followerRelationState, "$receiver");
            C7573i.m23587b(listState, "it");
            return FollowerRelationState.copy$default(followerRelationState, null, null, null, listState, 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$c */
    static final class C29828c extends Lambda implements C7562b<FollowerRelationState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f78392a;

        C29828c(FollowerRelationViewModel followerRelationViewModel) {
            this.f78392a = followerRelationViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97602a((FollowerRelationState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97602a(FollowerRelationState followerRelationState) {
            C7573i.m23587b(followerRelationState, "it");
            final List arrayList = new ArrayList();
            CharSequence userId = followerRelationState.getUserId();
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            arrayList.add(new C29573h(8, TextUtils.equals(userId, f.getCurUserId())));
            this.f78392a.mo29038c(new C7562b<FollowerRelationState, FollowerRelationState>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public FollowerRelationState invoke(FollowerRelationState followerRelationState) {
                    C7573i.m23587b(followerRelationState, "$receiver");
                    return FollowerRelationState.copy$default(followerRelationState, null, null, null, ListState.copy$default(followerRelationState.getListState(), null, arrayList, null, null, null, 29, null), 7, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$d */
    static final class C29830d extends Lambda implements C7562b<FollowerRelationState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f78394a;

        C29830d(FollowerRelationViewModel followerRelationViewModel) {
            this.f78394a = followerRelationViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97604a((FollowerRelationState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97604a(FollowerRelationState followerRelationState) {
            C7573i.m23587b(followerRelationState, "it");
            ListMiddleware<FollowerRelationState, Object, C29607i> listMiddleware = this.f78394a.f78390e;
            int size = followerRelationState.getListState().getList().size();
            CharSequence userId = followerRelationState.getUserId();
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            listMiddleware.mo29084b(size, new C29573h(10, TextUtils.equals(userId, f.getCurUserId())));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$e */
    static final class C29831e extends Lambda implements C7562b<FollowerRelationState, C7492s<Pair<? extends List<? extends Object>, ? extends C29607i>>> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f78395a;

        C29831e(FollowerRelationViewModel followerRelationViewModel) {
            this.f78395a = followerRelationViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<Object>, C29607i>> invoke(FollowerRelationState followerRelationState) {
            final FollowerRelationState followerRelationState2 = followerRelationState;
            C7573i.m23587b(followerRelationState2, "it");
            this.f78395a.f78389d = true;
            C7492s<Pair<List<Object>, C29607i>> d = this.f78395a.f78388c.queryFollowerList(followerRelationState.getUserId(), followerRelationState.getSecUserId(), 0, 20, 0, FollowerRelationViewModel.m97591a(true, true), C43161e.m136882a(), C43161e.m136884b(), 0, 0).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C29831e f78396a;

                {
                    this.f78396a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<C29575j>, C29607i> apply(C29567c cVar) {
                    int i;
                    C7573i.m23587b(cVar, "resp");
                    List<User> list = cVar.f77906a;
                    C7573i.m23582a((Object) list, "resp.items");
                    Iterable<User> iterable = list;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (User user : iterable) {
                        C7573i.m23582a((Object) user, "user");
                        C29575j jVar = new C29575j(1, user, 0, null, 12, null);
                        arrayList.add(jVar);
                    }
                    List list2 = (List) arrayList;
                    boolean z = cVar.f77908c;
                    int i2 = cVar.f77912g;
                    long j = cVar.f77910e;
                    boolean z2 = cVar.f77913h;
                    int i3 = 1;
                    if (!this.f78396a.f78395a.f78389d) {
                        i3 = ((C29607i) followerRelationState2.getListState().getPayload()).f77978e + 1;
                    }
                    List<User> list3 = cVar.f77906a;
                    if (list3 != null) {
                        i = list3.size();
                    } else {
                        i = 0;
                    }
                    C29607i iVar = new C29607i(z, i2, j, z2, i3, i);
                    return C7579l.m23633a(list2, iVar);
                }
            });
            C7573i.m23582a((Object) d, "mFollowerRelationReposit…      )\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$f */
    static final class C29833f extends Lambda implements C7562b<FollowerRelationState, C7492s<Pair<? extends List<? extends Object>, ? extends C29607i>>> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f78398a;

        C29833f(FollowerRelationViewModel followerRelationViewModel) {
            this.f78398a = followerRelationViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<Object>, C29607i>> invoke(FollowerRelationState followerRelationState) {
            final FollowerRelationState followerRelationState2 = followerRelationState;
            C7573i.m23587b(followerRelationState2, "it");
            this.f78398a.f78389d = false;
            C7492s<Pair<List<Object>, C29607i>> d = this.f78398a.f78388c.queryFollowerList(followerRelationState.getUserId(), followerRelationState.getSecUserId(), ((C29607i) followerRelationState.getListState().getPayload()).f77976c, 20, ((C29607i) followerRelationState.getListState().getPayload()).f31255b, FollowerRelationViewModel.m97591a(false, ((C29607i) followerRelationState.getListState().getPayload()).f77977d), C43161e.m136882a(), C43161e.m136884b(), 0, 0).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C29833f f78399a;

                {
                    this.f78399a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<C29575j>, C29607i> apply(C29567c cVar) {
                    int i;
                    C7573i.m23587b(cVar, "resp");
                    List<User> list = cVar.f77906a;
                    C7573i.m23582a((Object) list, "resp.items");
                    Iterable<User> iterable = list;
                    Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                    for (User user : iterable) {
                        C7573i.m23582a((Object) user, "user");
                        C29575j jVar = new C29575j(1, user, 0, null, 12, null);
                        arrayList.add(jVar);
                    }
                    List list2 = (List) arrayList;
                    boolean z = cVar.f77908c;
                    int i2 = cVar.f77912g;
                    long j = cVar.f77910e;
                    boolean z2 = cVar.f77913h;
                    int i3 = 1;
                    if (!this.f78399a.f78398a.f78389d) {
                        i3 = ((C29607i) followerRelationState2.getListState().getPayload()).f77978e + 1;
                    }
                    List<User> list3 = cVar.f77906a;
                    if (list3 != null) {
                        i = list3.size();
                    } else {
                        i = 0;
                    }
                    C29607i iVar = new C29607i(z, i2, j, z2, i3, i);
                    return C7579l.m23633a(list2, iVar);
                }
            });
            C7573i.m23582a((Object) d, "mFollowerRelationReposit…      )\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$g */
    static final class C29835g extends Lambda implements C7563m<List<? extends Object>, List<? extends Object>, List<Object>> {

        /* renamed from: a */
        public static final C29835g f78401a = new C29835g();

        C29835g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m97609a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<Object> m97609a(List<? extends Object> list, List<? extends Object> list2) {
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

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$h */
    static final class C29836h extends Lambda implements C7562b<FollowerRelationState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationViewModel f78402a;

        /* renamed from: b */
        final /* synthetic */ String f78403b;

        C29836h(FollowerRelationViewModel followerRelationViewModel, String str) {
            this.f78402a = followerRelationViewModel;
            this.f78403b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97610a((FollowerRelationState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97610a(FollowerRelationState followerRelationState) {
            boolean z;
            C7573i.m23587b(followerRelationState, "it");
            Iterator it = followerRelationState.getListState().getList().iterator();
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (!(next instanceof C29575j) || !C7573i.m23585a((Object) ((C29575j) next).f77949b.getUid(), (Object) this.f78403b)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                List d = C7525m.m23509d((Collection<? extends T>) followerRelationState.getListState().getList());
                d.remove(i);
                Collection recommendList = followerRelationState.getRecommendList();
                if (recommendList == null || recommendList.isEmpty()) {
                    z2 = true;
                }
                if (!z2) {
                    d.addAll(followerRelationState.getRecommendList());
                }
                this.f78402a.f78390e.mo29081a(d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel$i */
    static final class C29837i extends Lambda implements C7562b<FollowerRelationState, FollowerRelationState> {

        /* renamed from: a */
        final /* synthetic */ List f78404a;

        C29837i(List list) {
            this.f78404a = list;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowerRelationState invoke(FollowerRelationState followerRelationState) {
            C7573i.m23587b(followerRelationState, "$receiver");
            return FollowerRelationState.copy$default(followerRelationState, null, null, this.f78404a, null, 11, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m97593i();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        m97592h();
    }

    /* renamed from: i */
    private static FollowerRelationState m97593i() {
        FollowerRelationState followerRelationState = new FollowerRelationState(null, null, null, null, 15, null);
        return followerRelationState;
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29036b(new C29828c(this));
    }

    /* renamed from: g */
    public final void mo75814g() {
        mo29036b(new C29830d(this));
    }

    public final void onCleared() {
        super.onCleared();
        this.f78388c.mo29370a();
    }

    /* renamed from: h */
    private final void m97592h() {
        ListMiddleware<FollowerRelationState, Object, C29607i> listMiddleware = this.f78390e;
        listMiddleware.mo29186a(C29851d.f78424a, (C7563m<? super S, ? super PROP, ? extends S>) C29827b.f78391a);
        mo29033a(listMiddleware);
    }

    public FollowerRelationViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C29831e(this), new C29833f(this), null, C29835g.f78401a, 4, null);
        this.f78390e = listMiddleware;
    }

    /* renamed from: a */
    public final void mo75811a(String str) {
        C7573i.m23587b(str, "uid");
        mo29036b(new C29836h(this, str));
    }

    /* renamed from: a */
    public final void mo75812a(List<? extends Object> list) {
        C7573i.m23587b(list, "recommendList");
        mo29038c(new C29837i(list));
    }

    /* renamed from: a */
    public static int m97591a(boolean z, boolean z2) {
        if (!C6399b.m19944t()) {
            C7213d a = C7213d.m22500a();
            C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
            if (!a.mo18786ay() || !z2) {
                return 1;
            }
            return 2;
        }
        C7213d a2 = C7213d.m22500a();
        C7573i.m23582a((Object) a2, "AbTestManager.getInstance()");
        if ((!a2.mo18786ay() || !z) && (z || !z2)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    public final boolean mo75813a(boolean z, int i, int i2) {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        if (!a.mo18786ay() || C6399b.m19944t()) {
            return false;
        }
        boolean z2 = true;
        if (!z || ((i != 1 || i2 >= 15) && (i != 2 || i2 >= 5))) {
            z2 = false;
        } else {
            this.f78390e.mo29085c();
        }
        return z2;
    }
}
