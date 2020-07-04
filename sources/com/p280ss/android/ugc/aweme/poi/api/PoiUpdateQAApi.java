package com.p280ss.android.ugc.aweme.poi.api;

import com.p280ss.android.ugc.aweme.poi.bean.UpdateQAResponse;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.PoiUpdateQAApi */
public interface PoiUpdateQAApi {

    /* renamed from: a */
    public static final C35059a f91694a = C35059a.f91695a;

    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiUpdateQAApi$a */
    public static final class C35059a {

        /* renamed from: a */
        static final /* synthetic */ C35059a f91695a = new C35059a();

        private C35059a() {
        }
    }

    @C7730f(mo20420a = "/aweme/v1/poi/detail/question/")
    C7492s<UpdateQAResponse> updateQA(@C7744t(mo20436a = "poi_id") String str, @C7744t(mo20436a = "question_id") String str2);
}
