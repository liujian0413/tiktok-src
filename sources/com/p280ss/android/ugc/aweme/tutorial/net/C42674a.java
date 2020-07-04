package com.p280ss.android.ugc.aweme.tutorial.net;

import android.arch.lifecycle.C0052o;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p280ss.android.ugc.aweme.tutorial.p1683a.C42670e;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.ss.android.ugc.aweme.tutorial.net.a */
public final class C42674a {

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$a */
    static final class C42675a<T, R> implements C7327h<Throwable, C7496w<? extends T>> {

        /* renamed from: a */
        public static final C42675a f110938a = new C42675a();

        C42675a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m135527a((Throwable) obj);
        }

        /* renamed from: a */
        private static C7492s<T> m135527a(Throwable th) {
            C7573i.m23587b(th, "it");
            return C7492s.m23303c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$b */
    static final class C42676b<T> implements C7495v<T> {

        /* renamed from: a */
        final /* synthetic */ int f110939a;

        /* renamed from: b */
        final /* synthetic */ int f110940b;

        /* renamed from: c */
        final /* synthetic */ int f110941c;

        C42676b(int i, int i2, int i3) {
            this.f110939a = i;
            this.f110940b = i2;
            this.f110941c = i3;
        }

        public final void subscribe(C47870u<C42670e> uVar) {
            C7573i.m23587b(uVar, "emitter");
            C42670e a = C42684b.f110952a.mo104285a(this.f110939a, this.f110940b, this.f110941c);
            if (C6311g.m19574b(a.f110929d)) {
                uVar.mo19239a((Object) a);
                uVar.mo19238a();
                return;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$c */
    static final class C42677c<T, R> implements C7327h<Throwable, C7496w<? extends C42670e>> {

        /* renamed from: a */
        public static final C42677c f110942a = new C42677c();

        C42677c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m135528a((Throwable) obj);
        }

        /* renamed from: a */
        private static C7492s<C42670e> m135528a(Throwable th) {
            C7573i.m23587b(th, "it");
            return C7492s.m23303c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$d */
    static final class C42678d<T, R> implements C7327h<Throwable, C7496w<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ C7492s f110943a;

        C42678d(C7492s sVar) {
            this.f110943a = sVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<T> apply(Throwable th) {
            C7573i.m23587b(th, "it");
            return this.f110943a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$e */
    public static final class C42679e implements C7498y<C42670e> {

        /* renamed from: a */
        final /* synthetic */ C0052o f110944a;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        C42679e(C0052o oVar) {
            this.f110944a = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(C42670e eVar) {
            C7573i.m23587b(eVar, "t");
            this.f110944a.setValue(LiveDataWrapper.m109599a(eVar));
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f110944a.setValue(LiveDataWrapper.m109600a(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$f */
    static final class C42680f<T> implements C7496w<C42670e> {

        /* renamed from: a */
        public static final C42680f f110945a = new C42680f();

        C42680f() {
        }

        /* renamed from: a */
        public final void mo19189a(C7498y<? super C42670e> yVar) {
            C7573i.m23587b(yVar, "it");
            yVar.onError(new NoSuchElementException());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$g */
    public static final class C42681g implements C7498y<C42670e> {

        /* renamed from: a */
        final /* synthetic */ int f110946a;

        /* renamed from: b */
        final /* synthetic */ C0052o f110947b;

        public final void onComplete() {
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
            this.f110947b.setValue(LiveDataWrapper.m109600a(th));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(C42670e eVar) {
            C7573i.m23587b(eVar, "t");
            eVar.f110930e = this.f110946a;
            this.f110947b.setValue(LiveDataWrapper.m109599a(eVar));
        }

        C42681g(int i, C0052o oVar) {
            this.f110946a = i;
            this.f110947b = oVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$h */
    static final class C42682h<T> implements C7326g<C42670e> {

        /* renamed from: a */
        final /* synthetic */ int f110948a;

        /* renamed from: b */
        final /* synthetic */ int f110949b;

        /* renamed from: c */
        final /* synthetic */ int f110950c;

        C42682h(int i, int i2, int i3) {
            this.f110948a = i;
            this.f110949b = i2;
            this.f110950c = i3;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C42670e eVar) {
            C42684b bVar = C42684b.f110952a;
            C7573i.m23582a((Object) eVar, "it");
            bVar.mo104286a(eVar, this.f110948a, this.f110949b, this.f110950c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.net.a$i */
    static final class C42683i<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C42683i f110951a = new C42683i();

        C42683i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: a */
    private static <T> C7492s<T> m135523a(C7492s<T> sVar, C7492s<T> sVar2) {
        C7492s<T> a = C7492s.m23283a((C7496w<? extends T>) sVar, (C7496w<? extends T>) sVar2.mo19322e((C7327h<? super Throwable, ? extends C7496w<? extends T>>) C42675a.f110938a));
        C7573i.m23582a((Object) a, "Observable.concat(cache,…le.empty<T>()\n        }))");
        return a;
    }

    /* renamed from: b */
    private static <T> C7492s<T> m135525b(C7492s<T> sVar, C7492s<T> sVar2) {
        C7492s<T> e = sVar2.mo19322e((C7327h<? super Throwable, ? extends C7496w<? extends T>>) new C42678d<Object,Object>(sVar));
        C7573i.m23582a((Object) e, "net.onErrorResumeNext(Fu…         cache\n        })");
        return e;
    }

    /* renamed from: b */
    private static C7492s<C42670e> m135524b(int i, int i2, int i3) {
        C7492s<C42670e> e = C7492s.m23282a((C7495v<T>) new C42676b<T>(i, i2, i3)).mo19304b(C7333a.m23044b()).mo19322e((C7327h<? super Throwable, ? extends C7496w<? extends T>>) C42677c.f110942a);
        C7573i.m23582a((Object) e, "Observable.create<Tutori…nse>()\n                })");
        return e;
    }

    /* renamed from: a */
    public static C0052o<LiveDataWrapper<C42670e>> m135522a(int i, int i2, int i3) {
        C0052o<LiveDataWrapper<C42670e>> oVar = new C0052o<>();
        ((TutorialListRequest) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(TutorialVideoApiManager.f89507a).mo26430a().mo26435a(TutorialListRequest.class)).getTutorialList(i, 0, i3).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C42679e<Object>(oVar));
        return oVar;
    }

    /* renamed from: a */
    public final C0052o<LiveDataWrapper<C42670e>> mo104284a(int i, int i2, int i3, int i4) {
        C7492s sVar;
        C0052o<LiveDataWrapper<C42670e>> oVar = new C0052o<>();
        oVar.setValue(LiveDataWrapper.m109595a());
        C7492s b = m135524b(i, i2, i3);
        C7492s b2 = ((TutorialListRequest) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(TutorialVideoApiManager.f89507a).mo26430a().mo26435a(TutorialListRequest.class)).getTutorialList(i, i2, i3).mo19304b(C7333a.m23044b());
        C7486b a = C7486b.m23223a();
        C7573i.m23582a((Object) a, "PublishSubject.create()");
        b2.mo19189a((C7498y<? super T>) a);
        a.mo19280a((C7326g<? super T>) new C42682h<Object>(i, i2, i3), (C7326g<? super Throwable>) C42683i.f110951a);
        if (i2 == 0) {
            sVar = m135523a(b, a);
        } else {
            sVar = m135525b(b, a);
        }
        sVar.mo19294a(C47549a.m148327a()).mo19318d((C7496w<? extends T>) C42680f.f110945a).mo19189a((C7498y<? super T>) new C42681g<Object>(i4, oVar));
        return oVar;
    }
}
