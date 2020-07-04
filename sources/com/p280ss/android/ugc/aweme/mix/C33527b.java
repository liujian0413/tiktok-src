package com.p280ss.android.ugc.aweme.mix;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.ext.list.C11556b;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.widget.C13031a;
import com.bytedance.widget.Widget;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26135a;
import com.p280ss.android.ugc.aweme.detail.operators.C26138ao;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailLoadStateManager.C26182a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.mix.b */
public final class C33527b implements C26134am, C26135a {

    /* renamed from: a */
    public FragmentActivity f87561a;

    /* renamed from: b */
    public boolean f87562b;

    /* renamed from: c */
    public final MixDetailViewModel f87563c;

    /* renamed from: d */
    private C11592h f87564d;

    /* renamed from: com.ss.android.ugc.aweme.mix.b$a */
    public static final class C33528a implements C11557c<Aweme, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f87565a;

        /* renamed from: b */
        final /* synthetic */ C7563m f87566b;

        /* renamed from: c */
        final /* synthetic */ C7563m f87567c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f87568d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f87569e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Aweme>, C7581n> f87570f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f87568d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f87569e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Aweme>, C7581n> mo29140c() {
            return this.f87570f;
        }

        public C33528a(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f87565a = bVar;
            this.f87566b = mVar;
            this.f87567c = mVar2;
            this.f87568d = bVar;
            this.f87569e = mVar;
            this.f87570f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.b$b */
    public static final class C33529b implements C11557c<Aweme, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f87571a;

        /* renamed from: b */
        final /* synthetic */ C7563m f87572b;

        /* renamed from: c */
        final /* synthetic */ C7563m f87573c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f87574d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f87575e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Aweme>, C7581n> f87576f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f87574d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f87575e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Aweme>, C7581n> mo29140c() {
            return this.f87576f;
        }

        public C33529b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f87571a = bVar;
            this.f87572b = mVar;
            this.f87573c = mVar2;
            this.f87574d = bVar;
            this.f87575e = mVar;
            this.f87576f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.b$c */
    static final class C33530c extends Lambda implements C7563m<C11585f, List<? extends Aweme>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C33527b f87577a;

        /* renamed from: b */
        final /* synthetic */ C25675c f87578b;

        C33530c(C33527b bVar, C25675c cVar) {
            this.f87577a = bVar;
            this.f87578b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108386a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108386a(C11585f fVar, List<? extends Aweme> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            fVar.mo29066a(this.f87577a.f87563c, new C7562b<MixDetailState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C33530c f87579a;

                {
                    this.f87579a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m108387a((MixDetailState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m108387a(MixDetailState mixDetailState) {
                    C7573i.m23587b(mixDetailState, "it");
                    C11556b bVar = ((C33567t) mixDetailState.getListState().getPayload()).f31254a;
                    this.f87579a.f87578b.mo59099a(mixDetailState.getListState().getList(), bVar.f31214a);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.b$d */
    static final class C33532d extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C33527b f87580a;

        /* renamed from: b */
        final /* synthetic */ C25675c f87581b;

        C33532d(C33527b bVar, C25675c cVar) {
            this.f87580a = bVar;
            this.f87581b = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m108388a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108388a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            fVar.mo29066a(this.f87580a.f87563c, new C7562b<MixDetailState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C33532d f87582a;

                {
                    this.f87582a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m108389a((MixDetailState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m108389a(MixDetailState mixDetailState) {
                    C7573i.m23587b(mixDetailState, "it");
                    if (mixDetailState.getPullType() != 2) {
                        this.f87582a.f87581b.aE_();
                    } else {
                        this.f87582a.f87581b.aD_();
                    }
                }
            });
            this.f87580a.f87562b = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.b$e */
    static final class C33534e extends Lambda implements C7563m<C11585f, List<? extends Aweme>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C33527b f87583a;

        /* renamed from: b */
        final /* synthetic */ C25675c f87584b;

        C33534e(C33527b bVar, C25675c cVar) {
            this.f87583a = bVar;
            this.f87584b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108390a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108390a(C11585f fVar, List<? extends Aweme> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            fVar.mo29066a(this.f87583a.f87563c, new C7562b<MixDetailState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C33534e f87585a;

                {
                    this.f87585a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m108391a((MixDetailState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m108391a(MixDetailState mixDetailState) {
                    C7573i.m23587b(mixDetailState, "it");
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    C7573i.m23582a((Object) stackTrace, "Throwable().stackTrace");
                    int length = stackTrace.length;
                    boolean z = false;
                    int i = 0;
                    while (i < length) {
                        StackTraceElement stackTraceElement = stackTrace[i];
                        C7573i.m23582a((Object) stackTraceElement, "it");
                        if (!TextUtils.equals(stackTraceElement.getClassName(), "SingleGeneratedAdapterObserver") || !TextUtils.equals(stackTraceElement.getMethodName(), "onStateChanged")) {
                            i++;
                        } else {
                            return;
                        }
                    }
                    List list = mixDetailState.getListState().getList();
                    if (mixDetailState.getPullType() != 2) {
                        if (((C33567t) mixDetailState.getListState().getPayload()).f87662c != 0) {
                            z = true;
                        }
                        this.f87585a.f87584b.mo59110c(list, z);
                    } else {
                        this.f87585a.f87584b.mo59108b(list, ((C33567t) mixDetailState.getListState().getPayload()).f87663d);
                    }
                    FragmentActivity fragmentActivity = this.f87585a.f87583a.f87561a;
                    if (fragmentActivity != null) {
                        C26182a.m86110a(fragmentActivity).f69053a.setValue(Boolean.valueOf(this.f87585a.f87583a.f87563c.f87529l));
                    }
                }
            });
            this.f87583a.f87562b = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.b$f */
    static final class C33536f extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C33527b f87586a;

        /* renamed from: b */
        final /* synthetic */ C25675c f87587b;

        C33536f(C33527b bVar, C25675c cVar) {
            this.f87586a = bVar;
            this.f87587b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m108392a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m108392a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "throwable");
            this.f87587b.mo59107b(new Exception(th));
            this.f87586a.f87562b = false;
        }
    }

    /* renamed from: a */
    public final int mo67682a(int i) {
        return 19;
    }

    /* renamed from: a */
    public final boolean mo67687a(String str) {
        C7573i.m23587b(str, "aid");
        return false;
    }

    /* renamed from: b */
    public final boolean mo67688b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo67689c() {
        return this.f87562b;
    }

    /* renamed from: d */
    public final boolean mo67699d() {
        return true;
    }

    /* renamed from: e */
    public final void mo67691e() {
    }

    /* renamed from: a */
    public final Object mo67683a() {
        return this.f87563c;
    }

    /* renamed from: f */
    public final boolean mo67692f() {
        boolean z;
        MixDetailViewModel mixDetailViewModel = this.f87563c;
        if (mixDetailViewModel != null) {
            z = mixDetailViewModel.f87528k;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo67693g() {
        boolean z;
        MixDetailViewModel mixDetailViewModel = this.f87563c;
        if (mixDetailViewModel != null) {
            z = mixDetailViewModel.f87529l;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public C33527b(MixDetailViewModel mixDetailViewModel) {
        this.f87563c = mixDetailViewModel;
    }

    /* renamed from: a */
    public final void mo67685a(C26138ao aoVar) {
        C7573i.m23587b(aoVar, "panel");
        C25675c cVar = aoVar;
        MixDetailViewModel mixDetailViewModel = this.f87563c;
        if (mixDetailViewModel != null) {
            ListMiddleware<MixDetailState, Aweme, C33567t> listMiddleware = mixDetailViewModel.f87523f;
            if (listMiddleware != null) {
                C11592h hVar = this.f87564d;
                if (hVar == null) {
                    C7573i.m23583a("jediView");
                }
                ListMiddleware.m33938a(listMiddleware, hVar, null, false, false, new C33528a(DetailMixOperator$bindView$$inlined$ListListener$1.INSTANCE, DetailMixOperator$bindView$$inlined$ListListener$2.INSTANCE, new C33530c(this, cVar)), new C33529b(new C33532d(this, cVar), new C33536f(this, cVar), new C33534e(this, cVar)), null, null, null, null, 974, null);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        C7573i.m23587b(fragment, "owner");
        if (this.f87563c == null) {
            return false;
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        this.f87561a = activity;
        FragmentActivity fragmentActivity = this.f87561a;
        if (fragmentActivity != null) {
            C26182a.m86110a(fragmentActivity).f69053a.setValue(Boolean.valueOf(this.f87563c.f87529l));
        }
        this.f87564d = new JediWidget();
        C13031a a = C13031a.f34476e.mo31608a(fragment, fragment.getView());
        C11592h hVar = this.f87564d;
        if (hVar == null) {
            C7573i.m23583a("jediView");
        }
        if (hVar != null) {
            a.mo31605a((Widget) hVar);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.widget.Widget");
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        C7573i.m23587b(feedParam, "feedParam");
        if (i != 4) {
            switch (i) {
                case 1:
                    MixDetailViewModel mixDetailViewModel = this.f87563c;
                    if (mixDetailViewModel != null) {
                        ListMiddleware<MixDetailState, Aweme, C33567t> listMiddleware = mixDetailViewModel.f87523f;
                        if (listMiddleware != null) {
                            listMiddleware.mo29082b();
                            break;
                        }
                    }
                    return;
                case 2:
                    MixDetailViewModel mixDetailViewModel2 = this.f87563c;
                    if (mixDetailViewModel2 != null) {
                        mixDetailViewModel2.mo85858a(1);
                        return;
                    }
                    break;
            }
        } else {
            MixDetailViewModel mixDetailViewModel3 = this.f87563c;
            if (mixDetailViewModel3 != null) {
                mixDetailViewModel3.mo85858a(2);
            }
        }
    }
}
