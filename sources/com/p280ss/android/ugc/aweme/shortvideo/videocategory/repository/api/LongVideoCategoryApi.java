package com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.api;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.api.LongVideoCategoryApi */
public final class LongVideoCategoryApi {

    /* renamed from: a */
    public static final C41607a f108111a = new C41607a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.api.LongVideoCategoryApi$Api */
    public interface Api {
        @C7730f(mo20420a = "/aweme/v1/aweme/category/")
        C18253l<C41608a> getLongVideoCategory(@C7744t(mo20436a = "app_language") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.api.LongVideoCategoryApi$a */
    public static final class C41607a {
        private C41607a() {
        }

        public /* synthetic */ C41607a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public static Api m132473a() {
        Object a = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C35574k.m114859a().mo70078L().getApiHost()).mo26430a().mo26435a(Api.class);
        C7573i.m23582a(a, "ServiceManager.get().get… .create(Api::class.java)");
        return (Api) a;
    }
}
