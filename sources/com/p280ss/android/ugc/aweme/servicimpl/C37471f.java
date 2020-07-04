package com.p280ss.android.ugc.aweme.servicimpl;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.asve.recorder.camera.p925c.C20719d;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.p1053ba.C23162a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.shortvideo.C38427ad;
import com.p280ss.android.ugc.aweme.shortvideo.C39960gg;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38558e;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38562h;
import com.p280ss.android.ugc.aweme.tools.C42146am;
import com.p280ss.android.ugc.aweme.tools.C42152as;
import com.p280ss.android.ugc.aweme.tools.C42153at;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42342g;
import com.p280ss.android.ugc.aweme.tools.C42585u;
import com.p280ss.android.ugc.aweme.tools.C42587w;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44405d;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44779b;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44781c;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.f */
public final class C37471f {

    /* renamed from: a */
    public final C37476b f97789a = new C37476b();

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$a */
    public static final class C37472a {

        /* renamed from: a */
        private final LinkedList<C44779b> f97790a = new LinkedList<>();

        /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$a$a */
        static final class C37473a extends Lambda implements C7561a<Boolean> {

            /* renamed from: a */
            public static final C37473a f97791a = new C37473a();

            C37473a() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return Boolean.valueOf(true);
            }
        }

        /* renamed from: a */
        public final C37472a mo94791a(C44779b bVar, C7561a<Boolean> aVar) {
            C7573i.m23587b(bVar, "item");
            C7573i.m23587b(aVar, "predict");
            if (!((Boolean) aVar.invoke()).booleanValue()) {
                return this;
            }
            this.f97790a.addLast(bVar);
            return this;
        }

        /* renamed from: a */
        public final C44781c mo94792a(int i, C23162a aVar) {
            C44779b bVar;
            C7573i.m23587b(aVar, "modelFactory");
            int b = C35563c.f93231M.mo93306b(Property.VideoRecordToolbarConfigure);
            if (b == 1 || b == 3) {
                bVar = null;
            } else {
                bVar = aVar.mo60311j();
            }
            C44781c cVar = new C44781c(bVar);
            cVar.mo107236a(this.f97790a, i);
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$aa */
    static final class C37474aa extends Lambda implements C7563m<C44396a, C42152as, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97792a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97793b;

        C37474aa(C23162a aVar, C44781c cVar) {
            this.f97792a = aVar;
            this.f97793b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120157a((C44396a) obj, (C42152as) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120157a(C44396a aVar, C42152as asVar) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(asVar, "it");
            C44779b k = this.f97792a.mo60312k();
            if (asVar.f109679a) {
                if (asVar.f109680b) {
                    i = R.drawable.aql;
                } else {
                    i = R.drawable.aqm;
                }
                k.f115193b = i;
            } else {
                k.f115194c = false;
            }
            this.f97793b.mo107235a(k);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$ab */
    public static final class C37475ab implements C44396a {

        /* renamed from: a */
        final /* synthetic */ C43868d f97794a;

        /* access modifiers changed from: private */
        /* renamed from: f */
        public C11585f mo29191e() {
            return C44397a.m140506c(this);
        }

        /* renamed from: a */
        public final C11648k mo29060a() {
            return C44397a.m140503b(this);
        }

        /* renamed from: b */
        public final C11669s<C11585f> mo29067b() {
            return C44397a.m140509d(this);
        }

        /* renamed from: c */
        public final boolean mo29068c() {
            return C44397a.m140511e(this);
        }

        /* renamed from: d */
        public final C0043i mo29173d() {
            return C44397a.m140494a(this);
        }

        public final Lifecycle getLifecycle() {
            Lifecycle lifecycle = this.f97794a.mo106145d().getLifecycle();
            C7573i.m23582a((Object) lifecycle, "recordEnv.activity.lifecycle");
            return lifecycle;
        }

        C37475ab(C43868d dVar) {
            this.f97794a = dVar;
        }

        /* renamed from: a */
        public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
            C7573i.m23587b(vm1, "viewModel1");
            C7573i.m23587b(bVar, "block");
            return C44397a.m140500a(this, vm1, bVar);
        }

        /* renamed from: a */
        public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribe");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C44397a.m140496a(this, jediViewModel, vVar, mVar);
        }

        /* renamed from: b */
        public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: c */
        public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: d */
        public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: a */
        public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: a */
        public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(lVar2, "prop2");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(qVar, "subscriber");
            return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
        }

        /* renamed from: a */
        public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
            C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
            C7573i.m23587b(lVar, "prop");
            C7573i.m23587b(vVar, "config");
            return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
        }

        /* renamed from: a */
        public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(lVar2, "prop2");
            C7573i.m23587b(lVar3, "prop3");
            C7573i.m23587b(lVar4, "prop4");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(sVar, "subscriber");
            return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$b */
    static final class C37476b {

        /* renamed from: a */
        public boolean f97795a;

        /* renamed from: b */
        public boolean f97796b;

        /* renamed from: c */
        public boolean f97797c;

        /* renamed from: d */
        public boolean f97798d;

        /* renamed from: e */
        public boolean f97799e;

        /* renamed from: f */
        public boolean f97800f;
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$c */
    static final class C37477c extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C37471f f97801a;

        C37477c(C37471f fVar) {
            this.f97801a = fVar;
            super(0);
        }

        /* renamed from: a */
        private boolean m120173a() {
            return this.f97801a.f97789a.f97797c;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m120173a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$d */
    static final class C37478d extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C37478d f97802a = new C37478d();

        C37478d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m120174a());
        }

        /* renamed from: a */
        private static boolean m120174a() {
            switch (C35563c.f93231M.mo93306b(Property.VideoRecordToolbarConfigure)) {
                case 2:
                case 3:
                    return false;
                default:
                    return true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$e */
    static final class C37479e extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f97803a;

        C37479e(boolean z) {
            this.f97803a = z;
            super(0);
        }

        /* renamed from: a */
        private boolean m120175a() {
            if (!C6399b.m19946v() || this.f97803a) {
                return false;
            }
            return true;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m120175a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$f */
    static final class C37480f extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ boolean f97804a;

        C37480f(boolean z) {
            this.f97804a = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m120176a());
        }

        /* renamed from: a */
        private boolean m120176a() {
            if (!C6399b.m19946v() || (C6399b.m19946v() && this.f97804a)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$g */
    static final class C37481g extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43868d f97805a;

        C37481g(C43868d dVar) {
            this.f97805a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m120177a());
        }

        /* renamed from: a */
        private boolean m120177a() {
            if (!this.f97805a.mo106146e().mo96144e() || C35563c.f93230L.mo93343b(AVSettings.Property.DefaultMicrophoneState) == 3) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$h */
    static final class C37482h extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C37471f f97806a;

        C37482h(C37471f fVar) {
            this.f97806a = fVar;
            super(0);
        }

        /* renamed from: a */
        private boolean m120178a() {
            return this.f97806a.f97789a.f97798d;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m120178a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$i */
    static final class C37483i extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C37471f f97807a;

        C37483i(C37471f fVar) {
            this.f97807a = fVar;
            super(0);
        }

        /* renamed from: a */
        private boolean m120179a() {
            return this.f97807a.f97789a.f97799e;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m120179a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$j */
    static final class C37484j extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C37471f f97808a;

        C37484j(C37471f fVar) {
            this.f97808a = fVar;
            super(0);
        }

        /* renamed from: a */
        private boolean m120180a() {
            return this.f97808a.f97789a.f97800f;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m120180a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$k */
    static final class C37485k extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C37471f f97809a;

        C37485k(C37471f fVar) {
            this.f97809a = fVar;
            super(0);
        }

        /* renamed from: a */
        private boolean m120181a() {
            if (!this.f97809a.f97789a.f97796b) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m120181a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$l */
    static final class C37486l extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97810a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97811b;

        C37486l(C23162a aVar, C44781c cVar) {
            this.f97810a = aVar;
            this.f97811b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120182a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120182a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            C44779b b = this.f97810a.mo60303b();
            if (i == 0) {
                b.f115193b = R.drawable.aqf;
                if (b.f115198g > 0) {
                    b.f115198g = R.string.dvv;
                }
            } else {
                b.f115193b = R.drawable.aqe;
                if (b.f115198g > 0) {
                    b.f115198g = R.string.dvu;
                }
            }
            this.f97811b.mo107235a(b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$m */
    static final class C37487m extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97812a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97813b;

        C37487m(C23162a aVar, C44781c cVar) {
            this.f97812a = aVar;
            this.f97813b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120183a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120183a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            C44779b m = this.f97812a.mo60314m();
            if (z) {
                i = R.drawable.aqh;
            } else {
                i = R.drawable.aqg;
            }
            m.f115193b = i;
            m.f115198g = R.string.drx;
            this.f97813b.mo107235a(m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$n */
    static final class C37488n extends Lambda implements C7563m<C44396a, C42146am, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97814a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97815b;

        C37488n(C23162a aVar, C44781c cVar) {
            this.f97814a = aVar;
            this.f97815b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120184a((C44396a) obj, (C42146am) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120184a(C44396a aVar, C42146am amVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(amVar, "it");
            C44779b g = this.f97814a.mo60308g();
            switch (amVar.f109672a) {
                case 1:
                    g.f115193b = R.drawable.aqa;
                    break;
                case 2:
                    g.f115193b = R.drawable.aq_;
                    break;
                case 3:
                    g.f115194c = true;
                    break;
                case 4:
                    g.f115194c = false;
                    break;
            }
            this.f97815b.mo107235a(g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$o */
    static final class C37489o extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97816a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97817b;

        C37489o(C23162a aVar, C44781c cVar) {
            this.f97816a = aVar;
            this.f97817b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120185a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120185a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C44779b i = this.f97816a.mo60310i();
            if (i.f115194c != z) {
                i.f115194c = z;
                this.f97817b.mo107235a(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$p */
    static final class C37490p extends Lambda implements C7563m<C44396a, C42342g, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C37471f f97818a;

        /* renamed from: b */
        final /* synthetic */ C23162a f97819b;

        /* renamed from: c */
        final /* synthetic */ C44781c f97820c;

        /* renamed from: d */
        final /* synthetic */ C43868d f97821d;

        /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$p$a */
        static final class C37491a extends Lambda implements C7562b<Boolean, List<C44779b>> {

            /* renamed from: a */
            final /* synthetic */ List f97822a;

            /* renamed from: b */
            final /* synthetic */ List f97823b;

            C37491a(List list, List list2) {
                this.f97822a = list;
                this.f97823b = list2;
                super(1);
            }

            /* renamed from: a */
            private List<C44779b> m120187a(boolean z) {
                if (z) {
                    return this.f97822a;
                }
                return this.f97823b;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m120187a(((Boolean) obj).booleanValue());
            }
        }

        C37490p(C37471f fVar, C23162a aVar, C44781c cVar, C43868d dVar) {
            this.f97818a = fVar;
            this.f97819b = aVar;
            this.f97820c = cVar;
            this.f97821d = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120186a((C44396a) obj, (C42342g) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120186a(C44396a aVar, C42342g gVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(gVar, "it");
            if (this.f97818a.f97789a.f97795a != gVar.f110136a) {
                this.f97818a.f97789a.f97795a = gVar.f110136a;
                this.f97818a.f97789a.f97797c = gVar.f110138c;
                this.f97818a.f97789a.f97798d = gVar.f110137b;
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList();
                C7562b aVar2 = new C37491a(arrayList, arrayList2);
                if (this.f97818a.f97789a.f97795a) {
                    arrayList2.add(this.f97819b.mo60303b());
                    arrayList2.add(this.f97819b.mo60310i());
                    arrayList2.add(this.f97819b.mo60312k());
                    arrayList2.add(this.f97819b.mo60307f());
                    ((List) aVar2.invoke(Boolean.valueOf(this.f97818a.f97789a.f97797c))).add(this.f97819b.mo60314m());
                    ((List) aVar2.invoke(Boolean.valueOf(this.f97818a.f97789a.f97798d))).add(this.f97819b.mo60309h());
                } else {
                    arrayList.add(this.f97819b.mo60303b());
                    ((List) aVar2.invoke(Boolean.valueOf(this.f97818a.f97789a.f97799e))).add(this.f97819b.mo60310i());
                    ((List) aVar2.invoke(Boolean.valueOf(this.f97818a.f97789a.f97800f))).add(this.f97819b.mo60312k());
                    arrayList.add(this.f97819b.mo60307f());
                    ((List) aVar2.invoke(Boolean.valueOf(this.f97818a.f97789a.f97797c))).add(this.f97819b.mo60314m());
                    ((List) aVar2.invoke(Boolean.valueOf(this.f97818a.f97789a.f97798d))).add(this.f97819b.mo60309h());
                }
                this.f97820c.mo107233a(C37471f.m120150a(this.f97821d, this.f97818a.f97789a), arrayList, arrayList2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$q */
    static final class C37492q extends Lambda implements C7563m<C44396a, C42153at, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97824a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97825b;

        C37492q(C23162a aVar, C44781c cVar) {
            this.f97824a = aVar;
            this.f97825b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120188a((C44396a) obj, (C42153at) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120188a(C44396a aVar, C42153at atVar) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(atVar, "it");
            C44779b k = this.f97824a.mo60312k();
            if (atVar.f109684b) {
                i = R.drawable.aqm;
            } else {
                i = R.drawable.aql;
            }
            k.f115193b = i;
            k.f115194c = !atVar.f109683a;
            this.f97825b.mo107235a(k);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$r */
    static final class C37493r extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97826a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97827b;

        C37493r(C23162a aVar, C44781c cVar) {
            this.f97826a = aVar;
            this.f97827b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120189a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120189a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C44779b a = this.f97826a.mo60302a();
            if (a.f115194c != z || a.f115200i != z) {
                a.f115194c = z;
                a.f115200i = z;
                this.f97827b.mo107235a(a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$s */
    static final class C37494s extends Lambda implements C7563m<C44396a, C42587w, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C37471f f97828a;

        /* renamed from: b */
        final /* synthetic */ C43868d f97829b;

        /* renamed from: c */
        final /* synthetic */ C23162a f97830c;

        /* renamed from: d */
        final /* synthetic */ C44781c f97831d;

        /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$s$a */
        static final class C37495a extends Lambda implements C7562b<Boolean, List<C44779b>> {

            /* renamed from: a */
            final /* synthetic */ List f97832a;

            /* renamed from: b */
            final /* synthetic */ List f97833b;

            C37495a(List list, List list2) {
                this.f97832a = list;
                this.f97833b = list2;
                super(1);
            }

            /* renamed from: a */
            private List<C44779b> m120191a(boolean z) {
                if (z) {
                    return this.f97832a;
                }
                return this.f97833b;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m120191a(((Boolean) obj).booleanValue());
            }
        }

        C37494s(C37471f fVar, C43868d dVar, C23162a aVar, C44781c cVar) {
            this.f97828a = fVar;
            this.f97829b = dVar;
            this.f97830c = aVar;
            this.f97831d = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120190a((C44396a) obj, (C42587w) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120190a(C44396a aVar, C42587w wVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(wVar, "it");
            this.f97828a.f97789a.f97796b = wVar.f110740a;
            this.f97828a.f97789a.f97797c = this.f97829b.mo106152k().mo55994a(this.f97828a.f97789a.f97796b, this.f97828a.f97789a.f97795a);
            this.f97828a.f97789a.f97798d = this.f97829b.mo106151j().mo56027c(this.f97828a.f97789a.f97796b);
            C44779b l = this.f97830c.mo60313l();
            l.f115193b = R.drawable.aq6;
            this.f97831d.mo107235a(l);
            C44779b a = this.f97830c.mo60302a();
            a.f115196e = wVar.f110741b;
            this.f97831d.mo107235a(a);
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            C7562b aVar2 = new C37495a(arrayList, arrayList2);
            ((List) aVar2.invoke(Boolean.valueOf(this.f97828a.f97789a.f97798d))).add(this.f97830c.mo60309h());
            ((List) aVar2.invoke(Boolean.valueOf(!this.f97828a.f97789a.f97796b))).add(this.f97830c.mo60313l());
            ((List) aVar2.invoke(Boolean.valueOf(this.f97828a.f97789a.f97797c))).add(this.f97830c.mo60314m());
            this.f97831d.mo107233a(C37471f.m120150a(this.f97829b, this.f97828a.f97789a), arrayList, arrayList2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$t */
    static final class C37496t extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97834a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97835b;

        C37496t(C23162a aVar, C44781c cVar) {
            this.f97834a = aVar;
            this.f97835b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120192a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120192a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            C44779b c = this.f97834a.mo60304c();
            if (z) {
                i = R.drawable.apu;
            } else {
                i = R.drawable.apt;
            }
            c.f115193b = i;
            this.f97835b.mo107235a(c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$u */
    static final class C37497u extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C37471f f97836a;

        /* renamed from: b */
        final /* synthetic */ C23162a f97837b;

        /* renamed from: c */
        final /* synthetic */ C44781c f97838c;

        /* renamed from: d */
        final /* synthetic */ C43868d f97839d;

        C37497u(C37471f fVar, C23162a aVar, C44781c cVar, C43868d dVar) {
            this.f97836a = fVar;
            this.f97837b = aVar;
            this.f97838c = cVar;
            this.f97839d = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120193a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120193a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f97836a.f97789a.f97799e = true;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            arrayList.add(this.f97837b.mo60310i());
            this.f97838c.mo107233a(C37471f.m120150a(this.f97839d, this.f97836a.f97789a), arrayList, arrayList2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$v */
    static final class C37498v extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C37471f f97840a;

        /* renamed from: b */
        final /* synthetic */ C23162a f97841b;

        /* renamed from: c */
        final /* synthetic */ C44781c f97842c;

        /* renamed from: d */
        final /* synthetic */ C43868d f97843d;

        C37498v(C37471f fVar, C23162a aVar, C44781c cVar, C43868d dVar) {
            this.f97840a = fVar;
            this.f97841b = aVar;
            this.f97842c = cVar;
            this.f97843d = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120194a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120194a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            this.f97840a.f97789a.f97799e = false;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            arrayList2.add(this.f97841b.mo60310i());
            this.f97842c.mo107233a(C37471f.m120150a(this.f97843d, this.f97840a.f97789a), arrayList, arrayList2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$w */
    static final class C37499w extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97844a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97845b;

        C37499w(C23162a aVar, C44781c cVar) {
            this.f97844a = aVar;
            this.f97845b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120195a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120195a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C44779b a = this.f97844a.mo60302a();
            a.f115194c = z;
            this.f97845b.mo107235a(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$x */
    static final class C37500x extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97846a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97847b;

        C37500x(C23162a aVar, C44781c cVar) {
            this.f97846a = aVar;
            this.f97847b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120196a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120196a(C44396a aVar, int i) {
            int i2;
            C7573i.m23587b(aVar, "$receiver");
            C44779b f = this.f97846a.mo60307f();
            if (i == 10) {
                i2 = R.drawable.aqn;
            } else {
                i2 = R.drawable.aqo;
            }
            f.f115193b = i2;
            this.f97847b.mo107235a(f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$y */
    static final class C37501y extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C37471f f97848a;

        /* renamed from: b */
        final /* synthetic */ C23162a f97849b;

        /* renamed from: c */
        final /* synthetic */ C44781c f97850c;

        C37501y(C37471f fVar, C23162a aVar, C44781c cVar) {
            this.f97848a = fVar;
            this.f97849b = aVar;
            this.f97850c = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120197a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120197a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            C44779b h = this.f97849b.mo60309h();
            if (z) {
                i = R.drawable.apr;
            } else {
                i = R.drawable.apq;
            }
            h.f115193b = i;
            this.f97850c.mo107235a(h);
            if (!this.f97848a.f97789a.f97796b) {
                C44779b l = this.f97849b.mo60313l();
                l.f115193b = R.drawable.aq6;
                this.f97850c.mo107235a(l);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.f$z */
    static final class C37502z extends Lambda implements C7563m<C44396a, C42585u, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23162a f97851a;

        /* renamed from: b */
        final /* synthetic */ C44781c f97852b;

        C37502z(C23162a aVar, C44781c cVar) {
            this.f97851a = aVar;
            this.f97852b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m120198a((C44396a) obj, (C42585u) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120198a(C44396a aVar, C42585u uVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(uVar, "it");
            C44779b l = this.f97851a.mo60313l();
            int i = uVar.f110737a;
            if (i != 0) {
                switch (i) {
                    case 5:
                        l.f115194c = false;
                        break;
                    case 6:
                        l.f115194c = true;
                        break;
                    default:
                        l.f115193b = R.drawable.aq7;
                        break;
                }
            } else {
                l.f115193b = R.drawable.aq6;
            }
            this.f97852b.mo107235a(l);
        }
    }

    /* renamed from: a */
    public final C44781c mo94790a(C43868d dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C7573i.m23587b(dVar, "recordEnv");
        boolean a = C39960gg.m127843a(dVar.mo106145d());
        C23162a aVar = new C23162a(dVar, a);
        boolean z4 = false;
        if (!C23536f.m77298a() || !C23536f.m77300c()) {
            z = false;
        } else {
            z = true;
        }
        C37476b bVar = this.f97789a;
        if (new C38558e().mo96547a() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.f97796b = z2;
        this.f97789a.f97797c = dVar.mo106152k().mo55994a(this.f97789a.f97796b, this.f97789a.f97795a);
        C37476b bVar2 = this.f97789a;
        C20719d j = dVar.mo106151j();
        if (!j.mo56031g() || !j.mo56027c(this.f97789a.f97796b)) {
            z3 = false;
        } else {
            z3 = true;
        }
        bVar2.f97798d = z3;
        this.f97789a.f97799e = dVar.mo106146e().mo96141c();
        C37476b bVar3 = this.f97789a;
        if ((C38562h.m123246b() || C6399b.m19946v()) && !C38427ad.f99866a.mo96334e()) {
            z4 = true;
        }
        bVar3.f97800f = z4;
        C37472a aVar2 = new C37472a();
        aVar2.mo94791a(aVar.mo60302a(), (C7561a<Boolean>) C37478d.f97802a).mo94791a(aVar.mo60303b(), (C7561a<Boolean>) C37473a.f97791a).mo94791a(aVar.mo60304c(), (C7561a<Boolean>) new C37479e<Boolean>(z)).mo94791a(aVar.mo60305d(), (C7561a<Boolean>) C37473a.f97791a).mo94791a(aVar.mo60306e(), (C7561a<Boolean>) new C37480f<Boolean>(z)).mo94791a(aVar.mo60307f(), (C7561a<Boolean>) C37473a.f97791a).mo94791a(aVar.mo60308g(), (C7561a<Boolean>) new C37481g<Boolean>(dVar)).mo94791a(aVar.mo60309h(), (C7561a<Boolean>) new C37482h<Boolean>(this)).mo94791a(aVar.mo60310i(), (C7561a<Boolean>) new C37483i<Boolean>(this)).mo94791a(aVar.mo60312k(), (C7561a<Boolean>) new C37484j<Boolean>(this)).mo94791a(aVar.mo60313l(), (C7561a<Boolean>) new C37485k<Boolean>(this)).mo94791a(aVar.mo60314m(), (C7561a<Boolean>) new C37477c<Boolean>(this));
        m120151a(aVar2, a);
        C44781c a2 = aVar2.mo94792a(m120150a(dVar, this.f97789a), aVar);
        m120152a(dVar, a2, aVar);
        if (dVar.mo106146e().mo96142d() || dVar.mo106146e().mo96144e() || dVar.mo106146e().f99766b == 1 || dVar.mo106146e().f99766b == 2) {
            dVar.mo106141b().mo103594a((Object) this, (C42155av) new C42153at(dVar.mo106146e().f99745af, true));
        }
        if (dVar.mo106151j().mo56030f()) {
            dVar.mo106141b().mo103594a((Object) this, (C42155av) new C42585u(5));
        }
        return a2;
    }

    /* renamed from: a */
    public static int m120150a(C43868d dVar, C37476b bVar) {
        boolean z;
        int i;
        if (!dVar.mo106146e().mo96144e() || C35563c.f93230L.mo93343b(AVSettings.Property.DefaultMicrophoneState) == 3) {
            z = false;
        } else {
            z = true;
        }
        if (C6399b.m19946v()) {
            i = 6;
        } else {
            i = 5;
        }
        if (z) {
            i++;
        }
        if (bVar.f97798d) {
            i++;
        }
        if (bVar.f97799e) {
            i++;
        }
        return i + 1;
    }

    /* renamed from: a */
    private static void m120151a(C37472a aVar, boolean z) {
        try {
            Class cls = Class.forName("com.ss.android.ugc.toolbar.IsModeo");
            cls.getDeclaredMethod("addIcons", new Class[]{C37472a.class, Boolean.TYPE}).invoke(cls.newInstance(), new Object[]{aVar, Boolean.valueOf(z)});
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private final void m120152a(C43868d dVar, C44781c cVar, C23162a aVar) {
        JediViewModel a = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordToolbarViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…barViewModel::class.java)");
        RecordToolbarViewModel recordToolbarViewModel = (RecordToolbarViewModel) a;
        C11592h abVar = new C37475ab(dVar);
        BaseJediViewModel baseJediViewModel = recordToolbarViewModel;
        C44405d.m140520a(abVar, baseJediViewModel, C37503g.f97853a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37492q<Object,Object,C7581n>(aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37514r.f97864a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37501y<Object,Object,C7581n>(this, aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37516t.f97866a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37502z<Object,Object,C7581n>(aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37517u.f97867a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37474aa<Object,Object,C7581n>(aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37518v.f97868a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37486l<Object,Object,C7581n>(aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37504h.f97854a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37487m<Object,Object,C7581n>(aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37505i.f97855a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37488n<Object,Object,C7581n>(aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37506j.f97856a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37489o<Object,Object,C7581n>(aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37507k.f97857a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37490p<Object,Object,C7581n>(this, aVar, cVar, dVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37508l.f97858a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37493r<Object,Object,C7581n>(aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37509m.f97859a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37494s<Object,Object,C7581n>(this, dVar, aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37510n.f97860a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37496t<Object,Object,C7581n>(aVar, cVar));
        C44405d.m140520a(abVar, baseJediViewModel, C37511o.f97861a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37497u<Object,Object,C7581n>(this, aVar, cVar, dVar));
        C11592h hVar = abVar;
        C44405d.m140520a(hVar, baseJediViewModel, C37512p.f97862a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37498v<Object,Object,C7581n>(this, aVar, cVar, dVar));
        C44405d.m140520a(hVar, baseJediViewModel, C37513q.f97863a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37499w<Object,Object,C7581n>(aVar, cVar));
        C44405d.m140520a(hVar, baseJediViewModel, C37515s.f97865a, new C11672v<>(), (C7563m<? super C44396a, ? super A, C7581n>) new C37500x<Object,Object,C7581n>(aVar, cVar));
    }
}
