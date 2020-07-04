package com.p280ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11580m;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27695a;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27697b;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27709l;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28504t;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33460e;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel */
public final class ProfileCollectionViewModel extends JediViewModel<ProfileCollectionState> {

    /* renamed from: c */
    public final Set<String> f73417c = new LinkedHashSet();

    /* renamed from: d */
    public final Set<String> f73418d = new LinkedHashSet();

    /* renamed from: e */
    public boolean f73419e;

    /* renamed from: f */
    public final ListMiddleware<ProfileCollectionState, C27707j, C11583n> f73420f = new ListMiddleware<>(new C27853xebca41fb(this), null, new C27849b(this), C11580m.m34046b());

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel$a */
    static final class C27848a extends Lambda implements C7562b<C27709l, List<? extends C27707j>> {

        /* renamed from: a */
        public static final C27848a f73421a = new C27848a();

        C27848a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m91280a((C27709l) obj);
        }

        /* renamed from: a */
        private static List<C27707j> m91280a(C27709l lVar) {
            boolean z;
            C7573i.m23587b(lVar, "$receiver");
            Collection collection = lVar.f73065k;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C42961az.m136380a(new C28318an(39, Integer.valueOf((int) lVar.f73064j)));
            }
            List<C27697b> list = lVar.f73065k;
            if (list == null) {
                return C7525m.m23461a();
            }
            Iterable<C27697b> iterable = list;
            Collection arrayList = new ArrayList();
            for (C27697b bVar : iterable) {
                C27707j jVar = null;
                if (bVar.f73005a != 7 || C28504t.m93691a()) {
                    C27695a a = lVar.mo71169a(bVar.f73005a);
                    if (a != null) {
                        jVar = a.mo71145a(bVar.f73006b, bVar.f73005a);
                    }
                }
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            return (List) arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel$b */
    static final class C27849b extends Lambda implements C7563m<List<? extends C27707j>, List<? extends C27707j>, List<? extends C27707j>> {

        /* renamed from: a */
        final /* synthetic */ ProfileCollectionViewModel f73422a;

        C27849b(ProfileCollectionViewModel profileCollectionViewModel) {
            this.f73422a = profileCollectionViewModel;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<C27707j> invoke(List<C27707j> list, List<C27707j> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "refresh");
            if (list2.isEmpty()) {
                return list;
            }
            for (C27707j jVar : list2) {
                if (jVar.f73046d == 7 && this.f73422a.f73419e) {
                    jVar.f73050h = true;
                }
            }
            return list2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel$c */
    static final class C27850c extends Lambda implements C7562b<ProfileCollectionState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ProfileCollectionViewModel f73423a;

        /* renamed from: b */
        final /* synthetic */ C33460e f73424b;

        C27850c(ProfileCollectionViewModel profileCollectionViewModel, C33460e eVar) {
            this.f73423a = profileCollectionViewModel;
            this.f73424b = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m91282a((ProfileCollectionState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91282a(ProfileCollectionState profileCollectionState) {
            String str;
            C7573i.m23587b(profileCollectionState, "it");
            if (!this.f73423a.f73418d.contains(this.f73424b.f87343a)) {
                String str2 = "mp_show";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", "personal_collection").mo59973a("mp_id", this.f73424b.f87343a);
                String str3 = "_param_for_special";
                if (this.f73424b.f87347e == 2) {
                    str = "micro_game";
                } else {
                    str = "micro_app";
                }
                C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
                Set<String> set = this.f73423a.f73418d;
                String str4 = this.f73424b.f87343a;
                C7573i.m23582a((Object) str4, "mp.appId");
                set.add(str4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel$d */
    static final class C27851d extends Lambda implements C7562b<ProfileCollectionState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ProfileCollectionViewModel f73425a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f73426b;

        C27851d(ProfileCollectionViewModel profileCollectionViewModel, MixStruct mixStruct) {
            this.f73425a = profileCollectionViewModel;
            this.f73426b = mixStruct;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m91283a((ProfileCollectionState) obj);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
            if (r2 == null) goto L_0x003a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m91283a(com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState r4) {
            /*
                r3 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23587b(r4, r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel r4 = r3.f73425a
                java.util.Set<java.lang.String> r4 = r4.f73417c
                com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r3.f73426b
                java.lang.String r0 = r0.mixId
                boolean r4 = r4.contains(r0)
                if (r4 == 0) goto L_0x0014
                return
            L_0x0014:
                java.lang.String r4 = "show_compilation_entrance"
                com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "outer_favourite"
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "compilation_id"
                com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r3.f73426b
                java.lang.String r2 = r2.mixId
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.lang.String r1 = "author_id"
                com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r3.f73426b
                com.ss.android.ugc.aweme.profile.model.User r2 = r2.author
                if (r2 == 0) goto L_0x003a
                java.lang.String r2 = r2.getUid()
                if (r2 != 0) goto L_0x003c
            L_0x003a:
                java.lang.String r2 = ""
            L_0x003c:
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel r4 = r3.f73425a
                java.util.Set<java.lang.String> r4 = r4.f73417c
                com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r3.f73426b
                java.lang.String r0 = r0.mixId
                java.lang.String r1 = "mix.mixId"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                r4.add(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel.C27851d.m91283a(com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel$e */
    static final class C27852e extends Lambda implements C7563m<ProfileCollectionState, ListState<C27707j, C11583n>, ProfileCollectionState> {

        /* renamed from: a */
        public static final C27852e f73427a = new C27852e();

        C27852e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m91284a((ProfileCollectionState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static ProfileCollectionState m91284a(ProfileCollectionState profileCollectionState, ListState<C27707j, C11583n> listState) {
            C7573i.m23587b(profileCollectionState, "$receiver");
            C7573i.m23587b(listState, "it");
            return ProfileCollectionState.copy$default(profileCollectionState, null, listState, 1, null);
        }
    }

    /* renamed from: f */
    private static ProfileCollectionState m91275f() {
        return new ProfileCollectionState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m91275f();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        this.f73420f.mo29186a(C27861c.f73434a, (C7563m<? super S, ? super PROP, ? extends S>) C27852e.f73427a);
        mo29033a(this.f73420f);
    }

    /* renamed from: a */
    public final void mo71342a(MixStruct mixStruct) {
        C7573i.m23587b(mixStruct, "mix");
        mo29036b(new C27851d(this, mixStruct));
    }

    /* renamed from: b */
    public static void m91274b(C33460e eVar) {
        C7573i.m23587b(eVar, "mp");
        C7167b b = C7167b.m22380b();
        C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
        b.mo18647a().preloadMiniApp(eVar.f87343a, eVar.f87347e);
    }

    /* renamed from: a */
    public final void mo71343a(C33460e eVar) {
        C7573i.m23587b(eVar, "mp");
        mo29036b(new C27850c(this, eVar));
    }
}
