package com.p280ss.android.ugc.aweme.commercialize.api;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.commercialize.model.C25000i;
import com.p280ss.android.ugc.aweme.commercialize.model.C25001j;
import com.p280ss.android.ugc.aweme.commercialize.model.DouplusToastStruct;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi */
public final class CommerceSettingsApi {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f64777a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommerceSettingsApi.class), "api", "getApi()Lcom/ss/android/ugc/aweme/commercialize/api/CommerceSettingsApi$IApi;"))};

    /* renamed from: b */
    public static final CommerceSettingsApi f64778b = new CommerceSettingsApi();

    /* renamed from: c */
    private static final C7541d f64779c = C7546e.m23569a(C24540a.f64781a);

    /* renamed from: d */
    private static C25000i f64780d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi$IApi */
    interface IApi {
        @C7730f(mo20420a = "/aweme/v1/commerce/settings")
        C18253l<C25000i> getSettings();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi$a */
    static final class C24540a extends Lambda implements C7561a<IApi> {

        /* renamed from: a */
        public static final C24540a f64781a = new C24540a();

        C24540a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m80557a();
        }

        /* renamed from: a */
        private static IApi m80557a() {
            return (IApi) C24542a.m80568a(IApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi$b */
    static final class C24541b<V> implements Callable<C7581n> {

        /* renamed from: a */
        public static final C24541b f64782a = new C24541b();

        C24541b() {
        }

        /* renamed from: a */
        private static void m80558a() {
            CommerceSettingsApi.f64778b.mo64344c();
        }

        public final /* synthetic */ Object call() {
            m80558a();
            return C7581n.f20898a;
        }
    }

    private CommerceSettingsApi() {
    }

    /* renamed from: a */
    public static final C25000i m80550a() {
        return f64780d;
    }

    /* renamed from: e */
    private final IApi m80555e() {
        return (IApi) f64779c.getValue();
    }

    /* renamed from: d */
    public static final DouplusToastStruct m80554d() {
        C25000i iVar = f64780d;
        if (iVar != null) {
            return iVar.f65920d;
        }
        return null;
    }

    /* renamed from: b */
    public static final void m80553b() {
        if (f64780d == null) {
            C1592h.m7855a((Callable<TResult>) C24541b.f64782a, (Executor) C7258h.m22730c());
        }
    }

    /* renamed from: c */
    public final synchronized void mo64344c() {
        if (f64780d == null) {
            try {
                f64780d = (C25000i) m80555e().getSettings().get();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static final void m80552a(C25000i iVar) {
        f64780d = iVar;
    }

    /* renamed from: a */
    public static final C25001j m80551a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C25000i iVar = f64780d;
        if (iVar != null) {
            C25001j[] jVarArr = iVar.f65919c;
            if (jVarArr != null) {
                for (C25001j jVar : jVarArr) {
                    if (C7573i.m23585a((Object) jVar.f65923a, (Object) str)) {
                        return jVar;
                    }
                }
            }
        }
        return null;
    }
}
