package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.o */
public final class C35126o extends BaseResponse {
    @C6593c(mo15949a = "poi_list")

    /* renamed from: a */
    public List<PoiStruct> f91883a;
    @C6593c(mo15949a = "has_more")

    /* renamed from: b */
    public boolean f91884b;
    @C6593c(mo15949a = "page")

    /* renamed from: c */
    public int f91885c;
    @C6593c(mo15949a = "current_loc")

    /* renamed from: d */
    public PoiStruct f91886d;
    @C6593c(mo15949a = "log_pb")

    /* renamed from: e */
    public LogPbBean f91887e;
    @C6593c(mo15949a = "poi_activity")

    /* renamed from: f */
    public PoiActivityStruct f91888f;
    @C6593c(mo15949a = "enable_global_search")

    /* renamed from: g */
    public boolean f91889g;
    @C6593c(mo15949a = "is_oversea")

    /* renamed from: h */
    public boolean f91890h;

    /* renamed from: a */
    public static C35126o m113337a(C35126o oVar) {
        C35126o oVar2 = new C35126o();
        oVar2.f91883a = oVar.f91883a;
        oVar2.f91884b = oVar.f91884b;
        oVar2.f91885c = oVar.f91885c;
        oVar2.f91886d = oVar.f91886d;
        oVar2.f91887e = oVar.f91887e;
        oVar2.f91888f = oVar.f91888f;
        oVar2.f91889g = oVar.f91889g;
        oVar2.f91890h = oVar.f91890h;
        return oVar2;
    }
}
