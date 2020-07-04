package com.p280ss.android.ugc.aweme.account.login.p975v2.network;

import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.network.C22208c;
import com.p280ss.android.ugc.aweme.user.C42811c;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import org.p361a.C48293c;
import org.p361a.C7704b;
import p346io.reactivex.C47597i;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p1873k.C47852a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.i */
public final class C22025i {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f58892a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C22025i.class), "checkMap", "getCheckMap()Ljava/util/HashMap;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C22025i.class), "commitMap", "getCommitMap()Ljava/util/HashMap;"))};

    /* renamed from: b */
    private C47852a<C21912a> f58893b;

    /* renamed from: c */
    private C7321c f58894c;

    /* renamed from: d */
    private final C7541d f58895d = C7546e.m23569a(C22026a.f58898a);

    /* renamed from: e */
    private final C7541d f58896e = C7546e.m23569a(C22027b.f58899a);

    /* renamed from: f */
    private final C7327h<String, C7704b<C21912a>> f58897f = C22031f.f58904a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.i$a */
    static final class C22026a extends Lambda implements C7561a<HashMap<String, String>> {

        /* renamed from: a */
        public static final C22026a f58898a = new C22026a();

        C22026a() {
            super(0);
        }

        /* renamed from: a */
        private static HashMap<String, String> m73311a() {
            return new HashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m73311a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.i$b */
    static final class C22027b extends Lambda implements C7561a<HashMap<String, String>> {

        /* renamed from: a */
        public static final C22027b f58899a = new C22027b();

        C22027b() {
            super(0);
        }

        /* renamed from: a */
        private static HashMap<String, String> m73312a() {
            return new HashMap<>();
        }

        public final /* synthetic */ Object invoke() {
            return m73312a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.i$c */
    static final class C22028c<T> implements C7326g<C21929c> {

        /* renamed from: a */
        final /* synthetic */ String f58900a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58901b;

        C22028c(String str, BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58900a = str;
            this.f58901b = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C21929c cVar) {
            String str;
            String str2 = this.f58900a;
            C21928b bVar = cVar.f58666b;
            if (bVar != null) {
                str = bVar.f58664c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C21928b bVar2 = cVar.f58666b;
                if (bVar2 == null) {
                    C7573i.m23580a();
                }
                str2 = bVar2.f58664c;
                if (str2 == null) {
                    C7573i.m23580a();
                }
            }
            C42811c.m135845a().mo104468c(str2);
            FragmentActivity activity = this.f58901b.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.i$d */
    static final class C22029d<T> implements C7326g<C21929c> {

        /* renamed from: a */
        public static final C22029d f58902a = new C22029d();

        C22029d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.i$e */
    static final class C22030e<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C22030e f58903a = new C22030e();

        C22030e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.i$f */
    static final class C22031f<T, R> implements C7327h<String, C7704b<C21912a>> {

        /* renamed from: a */
        public static final C22031f f58904a = new C22031f();

        C22031f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m73314a((String) obj);
        }

        /* renamed from: a */
        private static C7704b<C21912a> m73314a(final String str) {
            C7573i.m23587b(str, "response");
            return new C7704b<C21912a>() {
                /* renamed from: a */
                public final void mo19155a(C48293c<? super C21912a> cVar) {
                    cVar.onNext((C21912a) C22208c.f59306b.mo58581a().mo15974a(str, C21912a.class));
                }
            };
        }
    }

    /* renamed from: b */
    private final HashMap<String, String> m73306b() {
        return (HashMap) this.f58895d.getValue();
    }

    /* renamed from: c */
    private final HashMap<String, String> m73307c() {
        return (HashMap) this.f58896e.getValue();
    }

    /* renamed from: a */
    public final void mo58383a() {
        if (this.f58893b != null) {
            C47852a<C21912a> aVar = this.f58893b;
            if (aVar == null) {
                C7573i.m23580a();
            }
            if (!aVar.isDisposed()) {
                C47852a<C21912a> aVar2 = this.f58893b;
                if (aVar2 == null) {
                    C7573i.m23580a();
                }
                aVar2.dispose();
            }
        }
        if (this.f58894c != null) {
            C7321c cVar = this.f58894c;
            if (cVar == null) {
                C7573i.m23580a();
            }
            if (!cVar.isDisposed()) {
                C7321c cVar2 = this.f58894c;
                if (cVar2 == null) {
                    C7573i.m23580a();
                }
                cVar2.dispose();
            }
        }
    }

    /* renamed from: a */
    public final void mo58385a(String str, C47852a<C21912a> aVar) {
        C7573i.m23587b(str, "name");
        C7573i.m23587b(aVar, "observer");
        mo58383a();
        this.f58893b = aVar;
        m73306b().put("unique_id", str);
        C22208c.m73675a("/aweme/v1/unique/id/check/", (Map<String, String>) m73306b()).mo19149a(this.f58897f).mo19152a(C47549a.m148327a()).mo19154a((C47597i<? super T>) aVar);
    }

    /* renamed from: a */
    public final void mo58384a(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "name");
        C7573i.m23587b(str2, "platForm");
        mo58383a();
        m73307c().put("login_name", str);
        this.f58894c = C21931e.m73157a(baseAccountFlowFragment, (Map<String, String>) m73307c(), str2).mo19157b((C7326g<? super T>) new C22028c<Object>(str, baseAccountFlowFragment)).mo19142a((C7326g<? super T>) C22029d.f58902a, (C7326g<? super Throwable>) C22030e.f58903a);
    }
}
