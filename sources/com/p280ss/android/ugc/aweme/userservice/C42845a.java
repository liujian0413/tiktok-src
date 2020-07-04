package com.p280ss.android.ugc.aweme.userservice;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p601c.C11786e;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.livedata.C23352a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import com.p280ss.android.ugc.aweme.userservice.jedi.C42847a;
import com.p280ss.android.ugc.aweme.userservice.jedi.p1690a.C42860h;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.userservice.a */
public final class C42845a implements C42846a {

    /* renamed from: a */
    private C42860h f111324a = C42847a.m136031b();

    /* renamed from: a */
    public final C11750c<String, User> mo104552a() {
        return C42847a.m136030a();
    }

    /* renamed from: b */
    public final C23084b<FollowStatus> mo104556b() {
        return C23352a.m76612a().mo60651a("#FollowStatus", FollowStatus.class);
    }

    /* renamed from: b */
    public final C7492s<BaseResponse> mo104557b(String str) {
        return this.f111324a.mo104566a(str);
    }

    /* renamed from: a */
    public final C7492s<C11786e<User>> mo104555a(String str) {
        return this.f111324a.mo104568b(str);
    }

    /* renamed from: a */
    public final C7319aa<FollowStatus> mo104554a(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        return this.f111324a.mo104565a(str, str2, i, i2, i3, str3, i4);
    }

    /* renamed from: a */
    public final FollowStatus mo104553a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4) throws Exception {
        return CommonFollowApi.m136016a(str, str2, i, i2, i3, str3, i4, str4);
    }
}
