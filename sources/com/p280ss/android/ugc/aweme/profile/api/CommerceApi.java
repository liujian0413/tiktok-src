package com.p280ss.android.ugc.aweme.profile.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.ShopUserMessage;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.profile.api.CommerceApi */
public final class CommerceApi {

    /* renamed from: a */
    public static final IRetrofitService f93686a;

    /* renamed from: b */
    public static final IRetrofit f93687b;

    /* renamed from: c */
    public static final C35723a f93688c = new C35723a(null);

    /* renamed from: com.ss.android.ugc.aweme.profile.api.CommerceApi$RealApi */
    public interface RealApi {
        @C7730f(mo20420a = "/aweme/v2/shop/user/message/list/")
        C18253l<ShopUserMessage> getShopUserMessage();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.api.CommerceApi$a */
    public static final class C35723a {
        private C35723a() {
        }

        /* renamed from: a */
        public static ShopUserMessage m115436a() throws Exception {
            try {
                return (ShopUserMessage) ((RealApi) CommerceApi.f93687b.create(RealApi.class)).getShopUserMessage().get();
            } catch (ExecutionException e) {
                RuntimeException propagateCompatibleException = CommerceApi.f93686a.propagateCompatibleException(e);
                C7573i.m23582a((Object) propagateCompatibleException, "RETROFIT_SERVICE.propagateCompatibleException(e)");
                throw propagateCompatibleException;
            }
        }

        public /* synthetic */ C35723a(C7571f fVar) {
            this();
        }
    }

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        f93686a = iRetrofitService;
        f93687b = iRetrofitService.createNewRetrofit(Api.f60502b);
    }
}
