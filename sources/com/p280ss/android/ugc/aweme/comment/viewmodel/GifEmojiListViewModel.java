package com.p280ss.android.ugc.aweme.comment.viewmodel;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11556b;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p280ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p280ss.android.ugc.aweme.comment.repo.C24214c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
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
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel */
public final class GifEmojiListViewModel extends JediViewModel<GifEmojiListState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f64263c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GifEmojiListViewModel.class), "mSearchTask", "getMSearchTask()Lio/reactivex/Observable;"))};

    /* renamed from: g */
    public static final C24345a f64264g = new C24345a(null);

    /* renamed from: d */
    public final C24214c f64265d = new C24214c();

    /* renamed from: e */
    public C7321c f64266e;

    /* renamed from: f */
    public final ListMiddleware<GifEmojiListState, GifEmoji, C11583n> f64267f;

    /* renamed from: h */
    private final C7541d f64268h = C7546e.m23568a(LazyThreadSafetyMode.NONE, C24346b.f64269a);

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$a */
    public static final class C24345a {
        private C24345a() {
        }

        public /* synthetic */ C24345a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$b */
    static final class C24346b extends Lambda implements C7561a<C7492s<Long>> {

        /* renamed from: a */
        public static final C24346b f64269a = new C24346b();

        C24346b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m80058a();
        }

        /* renamed from: a */
        private static C7492s<Long> m80058a() {
            return C7492s.m23295b(200, TimeUnit.MILLISECONDS).mo19304b(C7333a.m23044b()).mo19294a(C7333a.m23044b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$c */
    static final class C24347c extends Lambda implements C7562b<GifEmojiListState, C7492s<Pair<? extends List<? extends GifEmoji>, ? extends C11583n>>> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiListViewModel f64270a;

        C24347c(GifEmojiListViewModel gifEmojiListViewModel) {
            this.f64270a = gifEmojiListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<GifEmoji>, C11583n>> invoke(GifEmojiListState gifEmojiListState) {
            C7573i.m23587b(gifEmojiListState, "state");
            C7492s<Pair<List<GifEmoji>, C11583n>> d = this.f64270a.f64265d.mo62927a(gifEmojiListState.getKeyword(), 0).mo19317d((C7327h<? super T, ? extends R>) C243481.f64271a);
            C7573i.m23582a((Object) d, "mRepo.searchGifList(stat…or = 0)\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$d */
    static final class C24349d extends Lambda implements C7562b<GifEmojiListState, C7492s<Pair<? extends List<? extends GifEmoji>, ? extends C11583n>>> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiListViewModel f64272a;

        C24349d(GifEmojiListViewModel gifEmojiListViewModel) {
            this.f64272a = gifEmojiListViewModel;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<Pair<List<GifEmoji>, C11583n>> invoke(GifEmojiListState gifEmojiListState) {
            C7573i.m23587b(gifEmojiListState, "state");
            C7492s<Pair<List<GifEmoji>, C11583n>> d = this.f64272a.f64265d.mo62927a(gifEmojiListState.getKeyword(), gifEmojiListState.getListState().getPayload().f31255b).mo19317d((C7327h<? super T, ? extends R>) C243501.f64273a);
            C7573i.m23582a((Object) d, "mRepo.searchGifList(stat…      }\n                }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$e */
    static final class C24351e extends Lambda implements C7563m<GifEmojiListState, ListState<GifEmoji, C11583n>, GifEmojiListState> {

        /* renamed from: a */
        public static final C24351e f64274a = new C24351e();

        C24351e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m80063a((GifEmojiListState) obj, (ListState) obj2);
        }

        /* renamed from: a */
        private static GifEmojiListState m80063a(GifEmojiListState gifEmojiListState, ListState<GifEmoji, C11583n> listState) {
            C7573i.m23587b(gifEmojiListState, "$receiver");
            C7573i.m23587b(listState, "it");
            return GifEmojiListState.copy$default(gifEmojiListState, null, listState, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$f */
    static final class C24352f extends Lambda implements C7562b<GifEmojiListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiListViewModel f64275a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f64276b;

        C24352f(GifEmojiListViewModel gifEmojiListViewModel, CharSequence charSequence) {
            this.f64275a = gifEmojiListViewModel;
            this.f64276b = charSequence;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m80064a((GifEmojiListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80064a(GifEmojiListState gifEmojiListState) {
            C7573i.m23587b(gifEmojiListState, "it");
            if (!C7573i.m23585a((Object) this.f64276b, (Object) gifEmojiListState.getKeyword())) {
                this.f64275a.mo29038c(new C7562b<GifEmojiListState, GifEmojiListState>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C24352f f64277a;

                    {
                        this.f64277a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public GifEmojiListState invoke(GifEmojiListState gifEmojiListState) {
                        C7573i.m23587b(gifEmojiListState, "$receiver");
                        return GifEmojiListState.copy$default(gifEmojiListState, String.valueOf(this.f64277a.f64276b), null, 2, null);
                    }
                });
                C7321c cVar = this.f64275a.f64266e;
                if (cVar != null && !cVar.isDisposed()) {
                    cVar.dispose();
                }
                this.f64275a.f64266e = this.f64275a.mo29069f().mo19325f((C7326g<? super T>) new C7326g<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C24352f f64278a;

                    {
                        this.f64278a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Long l) {
                        this.f64278a.f64275a.f64267f.mo29082b();
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel$g */
    static final class C24355g extends Lambda implements C7562b<GifEmojiListState, GifEmojiListState> {

        /* renamed from: a */
        public static final C24355g f64279a = new C24355g();

        C24355g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m80067a((GifEmojiListState) obj);
        }

        /* renamed from: a */
        private static GifEmojiListState m80067a(GifEmojiListState gifEmojiListState) {
            C7573i.m23587b(gifEmojiListState, "$receiver");
            return GifEmojiListState.copy$default(gifEmojiListState, null, ListState.copy$default(gifEmojiListState.getListState(), null, C7525m.m23461a(), null, null, new C11556b(true), 13, null), 1, null);
        }
    }

    /* renamed from: f */
    public final C7492s<Long> mo29069f() {
        return (C7492s) this.f64268h.getValue();
    }

    /* renamed from: h */
    private static GifEmojiListState m80052h() {
        return new GifEmojiListState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m80052h();
    }

    /* renamed from: d */
    public final void mo29039d() {
        super.mo29039d();
        ListMiddleware<GifEmojiListState, GifEmoji, C11583n> listMiddleware = this.f64267f;
        listMiddleware.mo29186a(C24356a.f64280a, (C7563m<? super S, ? super PROP, ? extends S>) C24351e.f64274a);
        mo29033a(listMiddleware);
    }

    /* renamed from: g */
    public final void mo63254g() {
        C7321c cVar = this.f64266e;
        if (cVar != null && !cVar.isDisposed()) {
            cVar.dispose();
        }
        mo29038c(C24355g.f64279a);
    }

    public GifEmojiListViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new C24347c(this), new C24349d(this), null, null, 12, null);
        this.f64267f = listMiddleware;
    }

    /* renamed from: a */
    public final void mo63253a(CharSequence charSequence) {
        mo29036b(new C24352f(this, charSequence));
    }
}
