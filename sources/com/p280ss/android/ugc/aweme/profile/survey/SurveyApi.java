package com.p280ss.android.ugc.aweme.profile.survey;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1049ay.C23142a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.profile.survey.SurveyApi */
final class SurveyApi {

    /* renamed from: a */
    private static final boolean f94319a = C7163a.m22363a();

    /* renamed from: b */
    private static final SurveyRetrofit f94320b = ((SurveyRetrofit) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(SurveyRetrofit.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.survey.SurveyApi$SurveyRetrofit */
    interface SurveyRetrofit {
        @C7730f(mo20420a = "/aweme/v1/survey/get/")
        C1592h<C23142a> getSurveyData();

        @C7730f(mo20420a = "/aweme/v1/survey/record/")
        C1592h<Object> recordAnswer(@C7744t(mo20436a = "action_type") int i, @C7744t(mo20436a = "dialog_id") int i2, @C7744t(mo20436a = "original_id") int i3);
    }

    /* renamed from: a */
    static C1592h<C23142a> m116201a() {
        try {
            return f94320b.getSurveyData();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static C1592h<Object> m116202a(C36078c cVar) {
        try {
            return f94320b.recordAnswer(cVar.f94321a, cVar.f94322b, cVar.f94323c);
        } catch (Throwable unused) {
            return null;
        }
    }
}
