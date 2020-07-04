package com.p280ss.android.ugc.aweme.userservice.jedi.p1690a;

import com.bytedance.jedi.model.p602d.C11789a;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.userservice.CommonFollowApi;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.f */
public final class C42858f extends C11789a<String, Integer, String, BaseResponse> {
    /* renamed from: a */
    private static String m136052a(String str) {
        C7573i.m23587b(str, "req");
        return str;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo29352b(Object obj) {
        return m136052a((String) obj);
    }

    /* renamed from: b */
    private static C7492s<BaseResponse> m136053b(String str) {
        C7573i.m23587b(str, "req");
        C7492s<BaseResponse> a = CommonFollowApi.m136017a(str);
        C7573i.m23582a((Object) a, "CommonFollowApi.removeFollower(req)");
        return a;
    }

    /* renamed from: a */
    public final /* synthetic */ C7492s mo29350a(Object obj) {
        return m136053b((String) obj);
    }

    /* renamed from: a */
    private static Integer m136051a(String str, BaseResponse baseResponse) {
        C7573i.m23587b(str, "req");
        C7573i.m23587b(baseResponse, "resp");
        return Integer.valueOf(baseResponse.status_code);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo29351a(Object obj, Object obj2) {
        return m136051a((String) obj, (BaseResponse) obj2);
    }
}
