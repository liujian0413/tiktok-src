package com.p280ss.android.ugc.aweme.music.p1410ui.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1413c.C33950c;
import java.util.Collection;
import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel */
public final class SimilarMusicListViewModel extends JediViewModel<SimilarMusicListState> {

    /* renamed from: c */
    public boolean f88698c = true;

    /* renamed from: d */
    public final C33950c f88699d = new C33950c();

    /* renamed from: e */
    public final ListMiddleware<SimilarMusicListState, C34015d, C34012a> f88700e = new ListMiddleware<>(new C34005a(this), new C34007b(this), C34009c.f88707a, C34010d.f88708a);

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel$a */
    static final class C34005a extends Lambda implements C7562b<SimilarMusicListState, C7492s<Pair<? extends List<? extends C34015d>, ? extends C34012a>>> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewModel f88701a;

        C34005a(SimilarMusicListViewModel similarMusicListViewModel) {
            this.f88701a = similarMusicListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<C34015d>, C34012a>> invoke(final SimilarMusicListState similarMusicListState) {
            C7573i.m23587b(similarMusicListState, "state");
            this.f88701a.f88698c = true;
            C7492s<Pair<List<C34015d>, C34012a>> d = C33950c.m109405a(this.f88701a.f88699d, similarMusicListState.getMusicId(), 0, 0, 0, 14, null).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C34005a f88702a;

                {
                    this.f88702a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<C34015d>, C34012a> apply(C34013b bVar) {
                    int i;
                    C7573i.m23587b(bVar, "it");
                    List<C34015d> list = bVar.f88714c;
                    if (list == null) {
                        list = C7525m.m23461a();
                    }
                    boolean z = bVar.f88713b;
                    int i2 = bVar.f88712a;
                    int i3 = 1;
                    if (!this.f88702a.f88701a.f88698c) {
                        i3 = 1 + ((C34012a) similarMusicListState.getListState().getPayload()).f88710c;
                    }
                    List<C34015d> list2 = bVar.f88714c;
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    return C7579l.m23633a(list, new C34012a(z, i2, i3, i));
                }
            });
            C7573i.m23582a((Object) d, "mRepo.getRecommendMusicA…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel$b */
    static final class C34007b extends Lambda implements C7562b<SimilarMusicListState, C7492s<Pair<? extends List<? extends C34015d>, ? extends C34012a>>> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewModel f88704a;

        C34007b(SimilarMusicListViewModel similarMusicListViewModel) {
            this.f88704a = similarMusicListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<C34015d>, C34012a>> invoke(final SimilarMusicListState similarMusicListState) {
            C7573i.m23587b(similarMusicListState, "state");
            this.f88704a.f88698c = false;
            C7492s<Pair<List<C34015d>, C34012a>> d = C33950c.m109405a(this.f88704a.f88699d, similarMusicListState.getMusicId(), (long) ((C34012a) similarMusicListState.getListState().getPayload()).f31255b, 0, 0, 12, null).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C34007b f88705a;

                {
                    this.f88705a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<C34015d>, C34012a> apply(C34013b bVar) {
                    int i;
                    C7573i.m23587b(bVar, "it");
                    List<C34015d> list = bVar.f88714c;
                    if (list == null) {
                        list = C7525m.m23461a();
                    }
                    boolean z = bVar.f88713b;
                    int i2 = bVar.f88712a;
                    int i3 = 1;
                    if (!this.f88705a.f88704a.f88698c) {
                        i3 = 1 + ((C34012a) similarMusicListState.getListState().getPayload()).f88710c;
                    }
                    List<C34015d> list2 = bVar.f88714c;
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    return C7579l.m23633a(list, new C34012a(z, i2, i3, i));
                }
            });
            C7573i.m23582a((Object) d, "mRepo.getRecommendMusicA…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel$c */
    static final class C34009c extends Lambda implements C7563m<List<? extends C34015d>, List<? extends C34015d>, List<? extends C34015d>> {

        /* renamed from: a */
        public static final C34009c f88707a = new C34009c();

        C34009c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m109541a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<C34015d> m109541a(List<C34015d> list, List<C34015d> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "refresh");
            return C7525m.m23522l(list2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel$d */
    static final class C34010d extends Lambda implements C7563m<List<? extends C34015d>, List<? extends C34015d>, List<? extends C34015d>> {

        /* renamed from: a */
        public static final C34010d f88708a = new C34010d();

        C34010d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m109542a((List) obj, (List) obj2);
        }

        /* renamed from: a */
        private static List<C34015d> m109542a(List<C34015d> list, List<C34015d> list2) {
            C7573i.m23587b(list, "list");
            C7573i.m23587b(list2, "loadMore");
            return C7525m.m23522l(C7525m.m23506c((Collection<? extends T>) list, (Iterable<? extends T>) list2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel$e */
    static final class C34011e extends Lambda implements C7563m<SimilarMusicListState, ListState<C34015d, C34012a>, SimilarMusicListState> {

        /* renamed from: a */
        public static final C34011e f88709a = new C34011e();

        C34011e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m109543a((SimilarMusicListState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static SimilarMusicListState m109543a(SimilarMusicListState similarMusicListState, ListState<C34015d, C34012a> listState) {
            C7573i.m23587b(similarMusicListState, "$receiver");
            C7573i.m23587b(listState, "it");
            return SimilarMusicListState.copy$default(similarMusicListState, null, listState, 1, null);
        }
    }

    /* renamed from: f */
    private static SimilarMusicListState m109533f() {
        return new SimilarMusicListState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m109533f();
    }

    public final void onCleared() {
        super.onCleared();
        this.f88699d.mo29370a();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        ListMiddleware<SimilarMusicListState, C34015d, C34012a> listMiddleware = this.f88700e;
        listMiddleware.mo29186a(C34014c.f88716a, (C7563m<? super S, ? super PROP, ? extends S>) C34011e.f88709a);
        mo29033a(listMiddleware);
        this.f88700e.mo29082b();
    }

    /* renamed from: a */
    public final boolean mo86666a(boolean z, int i, int i2) {
        if (!z || i != 1 || i2 >= 10) {
            return false;
        }
        this.f88700e.mo29085c();
        return true;
    }
}
