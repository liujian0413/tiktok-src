package com.p280ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.arch.C23273a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.profile.C35735b;
import com.p280ss.android.ugc.aweme.profile.adapter.MediaMixAdapter.C35690a;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeListApi;
import com.p280ss.android.ugc.aweme.profile.jedi.aweme.AwemeListApi.C35830a;
import com.p280ss.android.ugc.aweme.profile.model.MediaMixList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel */
public final class MediaMixListViewModel extends JediBaseViewModel<MediaMixListState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f96517c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaMixListViewModel.class), "awemeListApi", "getAwemeListApi()Lcom/ss/android/ugc/aweme/profile/jedi/aweme/AwemeListApi;"))};

    /* renamed from: f */
    public static AwemeListApi f96518f;

    /* renamed from: g */
    public static final C36779a f96519g = new C36779a(null);

    /* renamed from: d */
    public final Set<String> f96520d = new LinkedHashSet();

    /* renamed from: e */
    public final ListMiddleware<MediaMixListState, MixStruct, C23273a> f96521e;

    /* renamed from: h */
    private final C7541d f96522h = C7546e.m23569a(C36781b.f96525a);

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$a */
    public static final class C36779a {

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$a$a */
        static final class C36780a<T, R> implements C7327h<T, C7496w<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ String f96523a;

            /* renamed from: b */
            final /* synthetic */ String f96524b;

            C36780a(String str, String str2) {
                this.f96523a = str;
                this.f96524b = str2;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7492s<MediaMixList> apply(MediaMixList mediaMixList) {
                boolean z;
                C7573i.m23587b(mediaMixList, "it");
                Collection collection = mediaMixList.mixInfos;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || mediaMixList.hasMore != 1) {
                    return C7492s.m23301b(mediaMixList);
                }
                return C36779a.m118546a(MediaMixListViewModel.f96519g, this.f96523a, this.f96524b, 0, mediaMixList.cursor, 4, null);
            }
        }

        private C36779a() {
        }

        public /* synthetic */ C36779a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private C7492s<MediaMixList> m118547a(String str, String str2, int i, long j) {
            String str3;
            C7573i.m23587b(str, "uid");
            if (MediaMixListViewModel.f96518f == null) {
                MediaMixListViewModel.f96518f = C35830a.m115658a();
            }
            if (str2 == null) {
                StringBuilder sb = new StringBuilder("sec_uid == null, uid = ");
                sb.append(str);
                C6921a.m21555a(sb.toString());
            }
            AwemeListApi awemeListApi = MediaMixListViewModel.f96518f;
            if (awemeListApi == null) {
                C7573i.m23583a("mAwemeListApi");
            }
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            C7492s<MediaMixList> a = awemeListApi.getMediaMixList(str, str3, i, j).mo19304b(C7333a.m23044b()).mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) new C36780a<Object,Object>(str, str2));
            C7573i.m23582a((Object) a, "mAwemeListApi.getMediaMi…it)\n                    }");
            return a;
        }

        /* renamed from: a */
        public static /* synthetic */ C7492s m118546a(C36779a aVar, String str, String str2, int i, long j, int i2, Object obj) {
            int i3;
            if ((i2 & 4) != 0) {
                i3 = 15;
            } else {
                i3 = i;
            }
            if ((i2 & 8) != 0) {
                j = 0;
            }
            return aVar.m118547a(str, str2, i3, j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$b */
    static final class C36781b extends Lambda implements C7561a<AwemeListApi> {

        /* renamed from: a */
        public static final C36781b f96525a = new C36781b();

        C36781b() {
            super(0);
        }

        /* renamed from: a */
        private static AwemeListApi m118549a() {
            return C35830a.m115658a();
        }

        public final /* synthetic */ Object invoke() {
            return m118549a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$c */
    static final class C36782c extends Lambda implements C7562b<MediaMixListState, C7492s<Pair<? extends List<? extends MixStruct>, ? extends C23273a>>> {

        /* renamed from: a */
        public static final C36782c f96526a = new C36782c();

        C36782c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m118550a((MediaMixListState) obj);
        }

        /* renamed from: a */
        private static C7492s<Pair<List<MixStruct>, C23273a>> m118550a(MediaMixListState mediaMixListState) {
            C7573i.m23587b(mediaMixListState, "it");
            C7492s<Pair<List<MixStruct>, C23273a>> d = C7492s.m23301b(mediaMixListState.getMediaMixOfFirstPage()).mo19317d((C7327h<? super T, ? extends R>) new C36807c<Object,Object>(C35735b.m115463a((C7562b<? super T, ? extends R>) C367831.f96527a)));
            C7573i.m23582a((Object) d, "Observable.just(it.media…\n            }\n        })");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$d */
    static final class C36784d extends Lambda implements C7562b<MediaMixListState, C7492s<Pair<? extends List<? extends MixStruct>, ? extends C23273a>>> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f96528a;

        C36784d(MediaMixListViewModel mediaMixListViewModel) {
            this.f96528a = mediaMixListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<MixStruct>, C23273a>> invoke(MediaMixListState mediaMixListState) {
            C7573i.m23587b(mediaMixListState, "it");
            C7492s<Pair<List<MixStruct>, C23273a>> d = this.f96528a.mo29069f().getMediaMixList(mediaMixListState.getUid(), mediaMixListState.getSuid(), 15, ((C23273a) mediaMixListState.getListState().getPayload()).f61307c).mo19304b(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) new C36807c<Object,Object>(C35735b.m115463a((C7562b<? super T, ? extends R>) C367851.f96529a)));
            C7573i.m23582a((Object) d, "awemeListApi.getMediaMix…     }\n                })");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$e */
    static final class C36786e extends Lambda implements C7563m<List<? extends MixStruct>, List<? extends MixStruct>, List<? extends MixStruct>> {

        /* renamed from: a */
        public static final C36786e f96530a = new C36786e();

        C36786e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m118554a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<MixStruct> m118554a(List<? extends MixStruct> list, List<? extends MixStruct> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            if (((MixStruct) C7525m.m23517i(list)) == C35690a.m115372a()) {
                return C7525m.m23506c((Collection<? extends T>) list.subList(0, list.size() - 1), (Iterable<? extends T>) list2);
            }
            return C7525m.m23506c((Collection<? extends T>) list, (Iterable<? extends T>) list2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$f */
    static final class C36787f extends Lambda implements C7562b<MediaMixListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f96531a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f96532b;

        C36787f(MediaMixListViewModel mediaMixListViewModel, MixStruct mixStruct) {
            this.f96531a = mediaMixListViewModel;
            this.f96532b = mixStruct;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m118555a((MediaMixListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m118555a(MediaMixListState mediaMixListState) {
            C7573i.m23587b(mediaMixListState, "it");
            if (!this.f96531a.f96520d.contains(this.f96532b.mixId)) {
                C6907h.m21524a("show_compilation_entrance", (Map) C22984d.m75611a().mo59973a("enter_from", mediaMixListState.getEnterFrom()).mo59973a("compilation_id", this.f96532b.mixId).mo59973a("author_id", mediaMixListState.getUid()).f60753a);
                Set<String> set = this.f96531a.f96520d;
                String str = this.f96532b.mixId;
                C7573i.m23582a((Object) str, "item.mixId");
                set.add(str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel$g */
    static final class C36788g extends Lambda implements C7563m<MediaMixListState, ListState<MixStruct, C23273a>, MediaMixListState> {

        /* renamed from: a */
        public static final C36788g f96533a = new C36788g();

        C36788g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m118556a((MediaMixListState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static MediaMixListState m118556a(MediaMixListState mediaMixListState, ListState<MixStruct, C23273a> listState) {
            C7573i.m23587b(mediaMixListState, "$receiver");
            C7573i.m23587b(listState, "it");
            return MediaMixListState.copy$default(mediaMixListState, null, null, null, null, listState, 15, null);
        }
    }

    /* renamed from: a */
    public static final C7492s<MediaMixList> m118538a(String str, String str2) {
        return C36779a.m118546a(f96519g, str, str2, 0, 0, 12, null);
    }

    /* renamed from: f */
    public final AwemeListApi mo29069f() {
        return (AwemeListApi) this.f96522h.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m118539g();
    }

    /* renamed from: g */
    private static MediaMixListState m118539g() {
        MediaMixListState mediaMixListState = new MediaMixListState(null, null, null, null, null, 31, null);
        return mediaMixListState;
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        this.f96521e.mo29186a(C36806b.f96553a, (C7563m<? super S, ? super PROP, ? extends S>) C36788g.f96533a);
        mo29033a(this.f96521e);
    }

    public MediaMixListViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(C36782c.f96526a, new C36784d(this), null, C36786e.f96530a, 4, null);
        this.f96521e = listMiddleware;
    }

    /* renamed from: a */
    public final void mo93121a(MixStruct mixStruct) {
        C7573i.m23587b(mixStruct, "item");
        mo29036b(new C36787f(this, mixStruct));
    }

    /* renamed from: f */
    public final void mo93122f(C7562b<? super MediaMixListState, MediaMixListState> bVar) {
        C7573i.m23587b(bVar, "reducer");
        mo29038c(bVar);
    }
}
