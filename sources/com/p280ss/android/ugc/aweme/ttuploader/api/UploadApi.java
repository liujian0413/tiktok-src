package com.p280ss.android.ugc.aweme.ttuploader.api;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.ttuploader.model.C42648a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7728d;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.ttuploader.api.UploadApi */
public interface UploadApi {

    /* renamed from: a */
    public static final C42631a f110797a = C42631a.f110798a;

    /* renamed from: com.ss.android.ugc.aweme.ttuploader.api.UploadApi$a */
    public static final class C42631a {

        /* renamed from: a */
        static final /* synthetic */ C42631a f110798a = new C42631a();

        private C42631a() {
        }

        /* renamed from: a */
        public static UploadApi m135443a() {
            Object a = new RetrofitFactory().createBuilder(Api.f60502b).mo26430a().mo26435a(UploadApi.class);
            C7573i.m23582a(a, "RetrofitFactory().create…te(UploadApi::class.java)");
            return (UploadApi) a;
        }
    }

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/upload/authkey/")
    C7492s<C42648a> refreshUploadConfig(@C7728d LinkedHashMap<String, String> linkedHashMap);
}
