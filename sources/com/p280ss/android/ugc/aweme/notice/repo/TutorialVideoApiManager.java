package com.p280ss.android.ugc.aweme.notice.repo;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager */
public final class TutorialVideoApiManager {

    /* renamed from: a */
    public static final String f89507a = f89507a;

    /* renamed from: b */
    public static final TutorialVideoApi f89508b;

    /* renamed from: c */
    public static final C34345a f89509c = new C34345a(null);

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager$TutorialVideoApi */
    public interface TutorialVideoApi {
        @C7730f(mo20420a = "/aweme/v1/tutorial/video/")
        C1592h<TutorialVideoResp> getTutorialVideoAndPoint(@C7744t(mo20436a = "mark_read") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager$a */
    public static final class C34345a {
        private C34345a() {
        }

        /* renamed from: a */
        private static TutorialVideoApi m111059a() {
            return TutorialVideoApiManager.f89508b;
        }

        public /* synthetic */ C34345a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final C1592h<TutorialVideoResp> mo87203a(int i) {
            return m111059a().getTutorialVideoAndPoint(i);
        }
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f89507a).create(TutorialVideoApi.class);
        C7573i.m23582a(create, "ServiceManager.get()\n   …rialVideoApi::class.java)");
        f89508b = (TutorialVideoApi) create;
    }
}
