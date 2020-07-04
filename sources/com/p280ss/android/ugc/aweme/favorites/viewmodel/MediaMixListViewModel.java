package com.p280ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.base.arch.C23273a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.p280ss.android.ugc.aweme.favorites.api.ProfileCollectionJediApi;
import com.p280ss.android.ugc.aweme.favorites.api.ProfileCollectionJediApi.C27736a;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.mix.C33545g;
import com.p280ss.android.ugc.aweme.profile.C35735b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import org.greenrobot.eventbus.C7709l;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel */
public final class MediaMixListViewModel extends JediBaseViewModel<MediaMixState> {

    /* renamed from: j */
    public static final C27836a f73397j = new C27836a(null);

    /* renamed from: c */
    public ArrayList<Long> f73398c;

    /* renamed from: d */
    public ArrayList<String> f73399d;

    /* renamed from: e */
    public boolean f73400e;

    /* renamed from: f */
    public final ProfileCollectionJediApi f73401f = C27736a.m90938a();

    /* renamed from: g */
    public final Set<String> f73402g = new LinkedHashSet();

    /* renamed from: h */
    public final List<String> f73403h = new ArrayList();

    /* renamed from: i */
    public final ListMiddleware<MediaMixState, MixStruct, C23273a> f73404i = new ListMiddleware<>(new C27837b(this), new C27840c(this), C27843d.f73411a, C27844e.f73412a);

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$a */
    public static final class C27836a {
        private C27836a() {
        }

        public /* synthetic */ C27836a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$b */
    static final class C27837b extends Lambda implements C7562b<MediaMixState, C7492s<Pair<? extends List<? extends MixStruct>, ? extends C23273a>>> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f73405a;

        C27837b(MediaMixListViewModel mediaMixListViewModel) {
            this.f73405a = mediaMixListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
            if (r3 == null) goto L_0x004c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p346io.reactivex.C7492s<kotlin.Pair<java.util.List<com.p280ss.android.ugc.aweme.feed.model.MixStruct>, com.p280ss.android.ugc.aweme.base.arch.C23273a>> invoke(com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r5) {
            /*
                r4 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23587b(r5, r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r5 = r4.f73405a
                boolean r5 = r5.f73400e
                if (r5 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r5 = r4.f73405a
                com.ss.android.ugc.aweme.favorites.api.ProfileCollectionJediApi r5 = r5.f73401f
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r0 = r4.f73405a
                java.util.ArrayList<java.lang.Long> r0 = r0.f73398c
                if (r0 == 0) goto L_0x001a
                java.lang.String r0 = r0.toString()
                goto L_0x001b
            L_0x001a:
                r0 = 0
            L_0x001b:
                io.reactivex.s r5 = r5.getSearchMixCollection(r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$b$1 r0 = com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C27837b.C278381.f73406a
                kotlin.jvm.a.b r0 = (kotlin.jvm.p357a.C7562b) r0
                kotlin.jvm.a.b r0 = com.p280ss.android.ugc.aweme.profile.C35735b.m115463a(r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.b r1 = new com.ss.android.ugc.aweme.favorites.viewmodel.b
                r1.<init>(r0)
                io.reactivex.d.h r1 = (p346io.reactivex.p348d.C7327h) r1
                io.reactivex.s r5 = r5.mo19317d(r1)
                java.lang.String r0 = "api.getSearchMixCollecti…r)\n                    })"
                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                return r5
            L_0x0038:
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r5 = r4.f73405a
                com.ss.android.ugc.aweme.favorites.api.ProfileCollectionJediApi r5 = r5.f73401f
                r0 = 15
                r1 = 0
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r3 = r4.f73405a
                java.util.ArrayList<java.lang.String> r3 = r3.f73399d
                if (r3 == 0) goto L_0x004c
                java.lang.String r3 = r3.toString()
                if (r3 != 0) goto L_0x004e
            L_0x004c:
                java.lang.String r3 = ""
            L_0x004e:
                io.reactivex.s r5 = r5.getMixCollection(r0, r1, r3)
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$b$2 r0 = com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C27837b.C278392.f73407a
                kotlin.jvm.a.b r0 = (kotlin.jvm.p357a.C7562b) r0
                kotlin.jvm.a.b r0 = com.p280ss.android.ugc.aweme.profile.C35735b.m115463a(r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.b r1 = new com.ss.android.ugc.aweme.favorites.viewmodel.b
                r1.<init>(r0)
                io.reactivex.d.h r1 = (p346io.reactivex.p348d.C7327h) r1
                io.reactivex.s r5 = r5.mo19317d(r1)
                java.lang.String r0 = "api.getMixCollection(DEF…r)\n                    })"
                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C27837b.invoke(com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState):io.reactivex.s");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$c */
    static final class C27840c extends Lambda implements C7562b<MediaMixState, C7492s<Pair<? extends List<? extends MixStruct>, ? extends C23273a>>> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f73408a;

        C27840c(MediaMixListViewModel mediaMixListViewModel) {
            this.f73408a = mediaMixListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<MixStruct>, C23273a>> invoke(MediaMixState mediaMixState) {
            String str;
            C7573i.m23587b(mediaMixState, "it");
            if (this.f73408a.f73400e) {
                ProfileCollectionJediApi profileCollectionJediApi = this.f73408a.f73401f;
                ArrayList<Long> arrayList = this.f73408a.f73398c;
                if (arrayList != null) {
                    str = arrayList.toString();
                } else {
                    str = null;
                }
                C7492s<Pair<List<MixStruct>, C23273a>> d = profileCollectionJediApi.getSearchMixCollection(str).mo19317d((C7327h<? super T, ? extends R>) new C27860b<Object,Object>(C35735b.m115463a((C7562b<? super T, ? extends R>) C278411.f73409a)));
                C7573i.m23582a((Object) d, "api.getSearchMixCollecti…r)\n                    })");
                return d;
            }
            C7492s<Pair<List<MixStruct>, C23273a>> d2 = this.f73408a.f73401f.getMixCollection(15, ((C23273a) mediaMixState.getListState().getPayload()).f61307c, "").mo19317d((C7327h<? super T, ? extends R>) new C27860b<Object,Object>(C35735b.m115463a((C7562b<? super T, ? extends R>) C278422.f73410a)));
            C7573i.m23582a((Object) d2, "api.getMixCollection(DEF…r)\n                    })");
            return d2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$d */
    static final class C27843d extends Lambda implements C7563m<List<? extends MixStruct>, List<? extends MixStruct>, List<? extends MixStruct>> {

        /* renamed from: a */
        public static final C27843d f73411a = new C27843d();

        C27843d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m91269a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<MixStruct> m91269a(List<? extends MixStruct> list, List<? extends MixStruct> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "refresh");
            Iterable iterable = list2;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : iterable) {
                if (hashSet.add(((MixStruct) next).mixId)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$e */
    static final class C27844e extends Lambda implements C7563m<List<? extends MixStruct>, List<? extends MixStruct>, List<? extends MixStruct>> {

        /* renamed from: a */
        public static final C27844e f73412a = new C27844e();

        C27844e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m91270a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<MixStruct> m91270a(List<? extends MixStruct> list, List<? extends MixStruct> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            Iterable c = C7525m.m23506c((Collection<? extends T>) list, (Iterable<? extends T>) list2);
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : c) {
                if (hashSet.add(((MixStruct) next).mixId)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$f */
    static final class C27845f extends Lambda implements C7562b<MediaMixState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f73413a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f73414b;

        C27845f(MediaMixListViewModel mediaMixListViewModel, MixStruct mixStruct) {
            this.f73413a = mediaMixListViewModel;
            this.f73414b = mixStruct;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m91271a((MediaMixState) obj);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
            if (r4 == null) goto L_0x0066;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m91271a(com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r7) {
            /*
                r6 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23587b(r7, r0)
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r0 = r6.f73413a
                java.util.Set<java.lang.String> r0 = r0.f73402g
                com.ss.android.ugc.aweme.feed.model.MixStruct r1 = r6.f73414b
                java.lang.String r1 = r1.mixId
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L_0x0014
                return
            L_0x0014:
                java.lang.String r0 = "general_search"
                java.lang.String r1 = r7.getEnterFrom()
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x002e
                java.lang.String r0 = "general_search_aladdin_more"
                java.lang.String r1 = r7.getEnterMethod()
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x002e
                r0 = 1
                goto L_0x002f
            L_0x002e:
                r0 = 0
            L_0x002f:
                java.lang.String r1 = "show_compilation_entrance"
                com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r3 = "enter_from"
                if (r0 == 0) goto L_0x003e
                java.lang.String r4 = r7.getEnterFrom()
                goto L_0x0040
            L_0x003e:
                java.lang.String r4 = "favourite"
            L_0x0040:
                com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
                java.lang.String r3 = "enter_method"
                java.lang.String r4 = r7.getEnterMethod()
                com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
                java.lang.String r3 = "compilation_id"
                com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r6.f73414b
                java.lang.String r4 = r4.mixId
                com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
                java.lang.String r3 = "author_id"
                com.ss.android.ugc.aweme.feed.model.MixStruct r4 = r6.f73414b
                com.ss.android.ugc.aweme.profile.model.User r4 = r4.author
                if (r4 == 0) goto L_0x0066
                java.lang.String r4 = r4.getUid()
                if (r4 != 0) goto L_0x0068
            L_0x0066:
                java.lang.String r4 = ""
            L_0x0068:
                com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r2)
                if (r0 == 0) goto L_0x00ba
                r0 = 3
                java.lang.String r0 = com.p280ss.android.ugc.aweme.discover.mob.SearchContext.m87922a(r0)
                com.ss.android.ugc.aweme.feed.ae r1 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
                java.lang.String r1 = r1.mo71791a(r0)
                java.lang.String r2 = "search_result_show"
                com.ss.android.ugc.aweme.app.g.d r3 = new com.ss.android.ugc.aweme.app.g.d
                r3.<init>()
                java.lang.String r4 = "enter_from"
                java.lang.String r5 = "search_compilation_page"
                com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
                java.lang.String r4 = "token_type"
                java.lang.String r5 = "video_compilation"
                com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r4, r5)
                java.lang.String r4 = "search_id"
                com.ss.android.ugc.aweme.app.g.d r0 = r3.mo59973a(r4, r0)
                java.lang.String r3 = "search_keyword"
                java.lang.String r7 = r7.getSearchKeyword()
                com.ss.android.ugc.aweme.app.g.d r7 = r0.mo59973a(r3, r7)
                java.lang.String r0 = "log_pb"
                com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r0, r1)
                java.lang.String r0 = "is_aladdin"
                java.lang.String r1 = "1"
                com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r0, r1)
                java.util.Map<java.lang.String, java.lang.String> r7 = r7.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r2, r7)
            L_0x00ba:
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel r7 = r6.f73413a
                java.util.Set<java.lang.String> r7 = r7.f73402g
                com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r6.f73414b
                java.lang.String r0 = r0.mixId
                java.lang.String r1 = "mix.mixId"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                r7.add(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C27845f.m91271a(com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$g */
    static final class C27846g extends Lambda implements C7563m<MediaMixState, ListState<MixStruct, C23273a>, MediaMixState> {

        /* renamed from: a */
        public static final C27846g f73415a = new C27846g();

        C27846g() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m91272a((MediaMixState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static MediaMixState m91272a(MediaMixState mediaMixState, ListState<MixStruct, C23273a> listState) {
            C7573i.m23587b(mediaMixState, "$receiver");
            C7573i.m23587b(listState, "it");
            return MediaMixState.copy$default(mediaMixState, null, null, null, listState, 7, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel$h */
    static final class C27847h extends Lambda implements C7562b<MediaMixState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListViewModel f73416a;

        C27847h(MediaMixListViewModel mediaMixListViewModel) {
            this.f73416a = mediaMixListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m91273a((MediaMixState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91273a(MediaMixState mediaMixState) {
            C7573i.m23587b(mediaMixState, "state");
            for (String str : this.f73416a.f73403h) {
                int i = 0;
                for (Object next : mediaMixState.getListState().getList()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C7525m.m23465b();
                    }
                    if (C7573i.m23585a((Object) ((MixStruct) next).mixId, (Object) str)) {
                        this.f73416a.f73404i.mo29077a(i);
                    }
                    i = i2;
                }
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m91256g();
    }

    public final void onCleared() {
        super.onCleared();
        C42961az.m136383d(this);
    }

    /* renamed from: g */
    private static MediaMixState m91256g() {
        MediaMixState mediaMixState = new MediaMixState(null, null, null, null, 15, null);
        return mediaMixState;
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        this.f73404i.mo29186a(C27859a.f73432a, (C7563m<? super S, ? super PROP, ? extends S>) C27846g.f73415a);
        mo29033a(this.f73404i);
        C42961az.m136382c(this);
    }

    /* renamed from: f */
    public final void mo29069f() {
        if (this.f73403h.size() != 0) {
            mo29036b(new C27847h(this));
        }
    }

    /* renamed from: b */
    public final void mo71320b(ArrayList<String> arrayList) {
        C7573i.m23587b(arrayList, "pushMixIds");
        this.f73399d = arrayList;
    }

    /* renamed from: a */
    public final void mo71318a(MixStruct mixStruct) {
        C7573i.m23587b(mixStruct, "mix");
        mo29036b(new C27845f(this, mixStruct));
    }

    /* renamed from: a */
    public final void mo71319a(ArrayList<Long> arrayList) {
        C7573i.m23587b(arrayList, "mixIds");
        this.f73400e = true;
        this.f73398c = arrayList;
    }

    @C7709l
    public final void updateCollectStatus(C33545g gVar) {
        C7573i.m23587b(gVar, "mixAddCollectEvent");
        if (gVar.f87604b != 0) {
            Collection collection = this.f73403h;
            String str = gVar.f87603a;
            if (collection != null) {
                C7577n.m23621b(collection).remove(str);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
        } else if (!C7525m.m23496a((Iterable<? extends T>) this.f73403h, gVar.f87603a)) {
            List<String> list = this.f73403h;
            String str2 = gVar.f87603a;
            if (str2 != null) {
                list.add(str2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }
}
