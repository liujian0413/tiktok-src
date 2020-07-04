package com.p280ss.android.ugc.aweme.commercialize.api;

import android.text.TextUtils;
import com.google.common.util.concurrent.C18253l;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.Serializable;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi */
public final class DouPlusRefundApi {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi$IApi */
    public interface IApi {
        @C7730f(mo20420a = "/aweme/v2/douplus/refund/check/")
        C18253l<Response> check(@C7744t(mo20436a = "sec_uid") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi$Response */
    public static class Response implements Serializable {
        @C6593c(mo15949a = "can_refund")
        public boolean canRefund;
        @C6593c(mo15949a = "url")
        public String url;

        public boolean hasUrl() {
            if (!TextUtils.isEmpty(this.url)) {
                return true;
            }
            return false;
        }

        public String getFullUrl() {
            if (!hasUrl()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Api.f60502b);
            sb.append(this.url);
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static C18253l<Response> m80562a(String str) {
        return ((IApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(IApi.class)).check(str);
    }
}
