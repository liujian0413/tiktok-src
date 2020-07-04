package com.p280ss.android.ugc.aweme.profile.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import com.p280ss.android.ugc.aweme.profile.api.ActivityLinkManager;
import com.p280ss.android.ugc.aweme.profile.api.NewUserApiManager;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import com.p280ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p280ss.android.ugc.aweme.viewmodel.Resource;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.MyProfileViewModel */
public class MyProfileViewModel extends C0063u {

    /* renamed from: a */
    public C0052o<Resource<NewUserCount>> f96537a = new C0052o<>();

    /* renamed from: b */
    public C0052o<Resource<ActivityLinkResponse>> f96538b = new C0052o<>();

    /* renamed from: c */
    public C0052o<Boolean> f96539c = new C0052o<>();

    /* renamed from: a */
    public final void mo93148a() {
        NewUserApiManager.m115438a(this.f96537a);
    }

    /* renamed from: b */
    public final void mo93149b() {
        ActivityLinkManager.m115417a(this.f96538b);
    }
}
