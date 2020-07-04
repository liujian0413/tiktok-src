package com.p280ss.android.ugc.aweme.profile.api;

import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.main.guide.C33040a.C33041a;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import com.p280ss.android.ugc.aweme.viewmodel.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.ActivityLinkManager */
public final class ActivityLinkManager {

    /* renamed from: a */
    private static Map<String, ActivityLinkResponse> f93674a = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.profile.api.ActivityLinkManager$ActivityLinkApi */
    interface ActivityLinkApi {
        @C7730f(mo20420a = "/aweme/v1/activity/profile_link/")
        C18253l<ActivityLinkResponse> getLinkInfo();

        @C7730f(mo20420a = "/aweme/v1/activity/profile_link/")
        C18253l<ActivityLinkResponse> getLinkInfo(@C7744t(mo20436a = "sec_uid") String str, @C7744t(mo20436a = "show_other_banner") boolean z);
    }

    /* renamed from: a */
    public static boolean m115421a(Context context) {
        C32961dd ddVar = (C32961dd) C23336d.m76560a(context, C32961dd.class);
        if (ddVar == null) {
            return false;
        }
        return TextUtils.equals(ddVar.mo60467e(""), "true");
    }

    /* renamed from: a */
    static final /* synthetic */ ActivityLinkResponse m115412a(ActivityLinkApi activityLinkApi) throws Exception {
        return (ActivityLinkResponse) activityLinkApi.getLinkInfo().get();
    }

    /* renamed from: b */
    public static void m115422b(Context context) {
        C32961dd ddVar = (C32961dd) C23336d.m76560a(context, C32961dd.class);
        if (ddVar != null) {
            ddVar.mo60469f("true");
        }
    }

    /* renamed from: c */
    public static void m115423c(Context context) {
        C1592h.m7853a((Callable<TResult>) new C35729e<TResult>(context));
    }

    /* renamed from: a */
    private static ActivityLinkResponse m115414a(String str) {
        return (ActivityLinkResponse) f93674a.get(str);
    }

    /* renamed from: d */
    static final /* synthetic */ Boolean m115424d(Context context) throws Exception {
        if (!((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().mo59877d()).booleanValue()) {
            C32961dd ddVar = (C32961dd) C23336d.m76560a(context, C32961dd.class);
            if (ddVar != null) {
                ddVar.mo60459b("");
                ddVar.mo60469f("");
                ddVar.mo60465d("");
                ddVar.mo60478j(false);
            }
            C33041a.m106716a().mo84730a(context);
        }
        return Boolean.valueOf(true);
    }

    /* renamed from: a */
    public static void m115417a(C0052o<Resource<ActivityLinkResponse>> oVar) {
        C1592h.m7853a((Callable<TResult>) new C35725a<TResult>((ActivityLinkApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(ActivityLinkApi.class))).mo6876a((C1591g<TResult, TContinuationResult>) new C35726b<TResult,TContinuationResult>(oVar), C1592h.f5958b);
    }

    /* renamed from: a */
    private static void m115420a(String str, ActivityLinkResponse activityLinkResponse) {
        f93674a.put(str, activityLinkResponse);
    }

    /* renamed from: a */
    static final /* synthetic */ ActivityLinkResponse m115413a(ActivityLinkApi activityLinkApi, String str) throws Exception {
        return (ActivityLinkResponse) activityLinkApi.getLinkInfo(str, true).get();
    }

    /* renamed from: a */
    static final /* synthetic */ Void m115415a(C0052o oVar, C1592h hVar) throws Exception {
        if (hVar.mo6889d()) {
            oVar.setValue(Resource.m137531a(hVar.mo6891f()));
        } else {
            oVar.setValue(Resource.m137532a(hVar.mo6890e()));
        }
        return null;
    }

    /* renamed from: a */
    private static void m115418a(C0052o<Resource<ActivityLinkResponse>> oVar, String str) {
        C1592h.m7853a((Callable<TResult>) new C35727c<TResult>((ActivityLinkApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(ActivityLinkApi.class), str)).mo6876a((C1591g<TResult, TContinuationResult>) new C35728d<TResult,TContinuationResult>(oVar, str), C1592h.f5958b);
    }

    /* renamed from: a */
    public static void m115419a(String str, C0052o<Resource<ActivityLinkResponse>> oVar) {
        if (m115414a(str) != null) {
            oVar.setValue(Resource.m137532a(m115414a(str)));
        } else {
            m115418a(oVar, str);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Void m115416a(C0052o oVar, String str, C1592h hVar) throws Exception {
        if (hVar.mo6889d()) {
            oVar.setValue(Resource.m137531a(hVar.mo6891f()));
        } else {
            oVar.setValue(Resource.m137532a(hVar.mo6890e()));
            m115420a(str, (ActivityLinkResponse) hVar.mo6890e());
        }
        return null;
    }
}
