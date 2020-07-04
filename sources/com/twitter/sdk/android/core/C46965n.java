package com.twitter.sdk.android.core;

import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.google.gson.C6717s;
import com.twitter.sdk.android.core.internal.C46892r;
import com.twitter.sdk.android.core.internal.p1845a.C46857e;
import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.C46946c;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import com.twitter.sdk.android.core.services.AccountService;
import com.twitter.sdk.android.core.services.FavoriteService;
import com.twitter.sdk.android.core.services.MediaService;
import com.twitter.sdk.android.core.services.SearchService;
import com.twitter.sdk.android.core.services.StatusesService;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.OkHttpClient;
import retrofit2.C48479e.C48480a;
import retrofit2.C48517m;
import retrofit2.C48517m.C48519a;
import retrofit2.p1899a.p1900a.C48469a;

/* renamed from: com.twitter.sdk.android.core.n */
public final class C46965n {

    /* renamed from: a */
    final ConcurrentHashMap<Class, Object> f120497a;

    /* renamed from: b */
    final C48517m f120498b;

    /* renamed from: g */
    private static ConcurrentHashMap m146838g() {
        return new ConcurrentHashMap();
    }

    /* renamed from: a */
    public final AccountService mo118095a() {
        return (AccountService) m146835a(AccountService.class);
    }

    /* renamed from: b */
    public final FavoriteService mo118096b() {
        return (FavoriteService) m146835a(FavoriteService.class);
    }

    /* renamed from: c */
    public final StatusesService mo118097c() {
        return (StatusesService) m146835a(StatusesService.class);
    }

    /* renamed from: d */
    public final SearchService mo118098d() {
        return (SearchService) m146835a(SearchService.class);
    }

    /* renamed from: e */
    public final MediaService mo118099e() {
        return (MediaService) m146835a(MediaService.class);
    }

    public C46965n() {
        this(C46857e.m146565a(C46969q.m146847a().mo118104c()), new C46892r());
    }

    /* renamed from: f */
    private static C6600e m146837f() {
        return new C6607f().mo15985a((C6717s) new SafeListAdapter()).mo15985a((C6717s) new SafeMapAdapter()).mo15986a(C46946c.class, new BindingValuesAdapter()).mo15992f();
    }

    /* renamed from: a */
    private <T> T m146835a(Class<T> cls) {
        if (!this.f120497a.contains(cls)) {
            this.f120497a.putIfAbsent(cls, this.f120498b.mo123312a(cls));
        }
        return this.f120497a.get(cls);
    }

    public C46965n(C46972t tVar) {
        this(C46857e.m146566a((C46938j<? extends TwitterAuthToken>) tVar, C46969q.m146847a().f120513e), new C46892r());
    }

    private C46965n(OkHttpClient okHttpClient, C46892r rVar) {
        this.f120497a = m146838g();
        this.f120498b = m146836a(okHttpClient, rVar);
    }

    /* renamed from: a */
    private C48517m m146836a(OkHttpClient okHttpClient, C46892r rVar) {
        return new C48519a().mo123320a(okHttpClient).mo123319a(rVar.f120234a).mo123322a((C48480a) C48469a.m150167a(m146837f())).mo123323a();
    }
}
