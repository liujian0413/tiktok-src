package com.p280ss.android.ugc.trill.share.helo;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.trill.share.helo.p1770c.C45147a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.trill.share.helo.HeloApiManager */
public final class HeloApiManager {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f115960a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(HeloApiManager.class), "heloApi", "getHeloApi()Lcom/ss/android/ugc/trill/share/helo/HeloApiManager$HeloShareApi;"))};

    /* renamed from: b */
    public static final C7541d f115961b = C7546e.m23569a(C45121b.f115965a);

    /* renamed from: c */
    public static final C45120a f115962c = new C45120a(null);

    /* renamed from: d */
    private final C7541d f115963d;

    /* renamed from: com.ss.android.ugc.trill.share.helo.HeloApiManager$HeloShareApi */
    public interface HeloShareApi {
        @C7730f(mo20420a = "/aweme/v1/user/settings/")
        C7492s<C45147a> fetchUserHeloConfiguration();
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.HeloApiManager$a */
    public static final class C45120a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f115964a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C45120a.class), "instance", "getInstance()Lcom/ss/android/ugc/trill/share/helo/HeloApiManager;"))};

        private C45120a() {
        }

        /* renamed from: a */
        public static HeloApiManager m142281a() {
            return (HeloApiManager) HeloApiManager.f115961b.getValue();
        }

        public /* synthetic */ C45120a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.HeloApiManager$b */
    static final class C45121b extends Lambda implements C7561a<HeloApiManager> {

        /* renamed from: a */
        public static final C45121b f115965a = new C45121b();

        C45121b() {
            super(0);
        }

        /* renamed from: a */
        private static HeloApiManager m142282a() {
            return new HeloApiManager(null);
        }

        public final /* synthetic */ Object invoke() {
            return m142282a();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.helo.HeloApiManager$c */
    static final class C45122c extends Lambda implements C7561a<HeloShareApi> {

        /* renamed from: a */
        public static final C45122c f115966a = new C45122c();

        C45122c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m142283a();
        }

        /* renamed from: a */
        private static HeloShareApi m142283a() {
            return (HeloShareApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(HeloShareApi.class);
        }
    }

    /* renamed from: a */
    public final HeloShareApi mo107682a() {
        return (HeloShareApi) this.f115963d.getValue();
    }

    private HeloApiManager() {
        this.f115963d = C7546e.m23569a(C45122c.f115966a);
    }

    public /* synthetic */ HeloApiManager(C7571f fVar) {
        this();
    }
}
