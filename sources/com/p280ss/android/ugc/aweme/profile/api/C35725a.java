package com.p280ss.android.ugc.aweme.profile.api;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.api.a */
final /* synthetic */ class C35725a implements Callable {

    /* renamed from: a */
    private final ActivityLinkApi f93692a;

    C35725a(ActivityLinkApi activityLinkApi) {
        this.f93692a = activityLinkApi;
    }

    public final Object call() {
        return ActivityLinkManager.m115412a(this.f93692a);
    }
}
