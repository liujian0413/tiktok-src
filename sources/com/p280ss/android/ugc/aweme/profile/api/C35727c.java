package com.p280ss.android.ugc.aweme.profile.api;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.api.c */
final /* synthetic */ class C35727c implements Callable {

    /* renamed from: a */
    private final ActivityLinkApi f93694a;

    /* renamed from: b */
    private final String f93695b;

    C35727c(ActivityLinkApi activityLinkApi, String str) {
        this.f93694a = activityLinkApi;
        this.f93695b = str;
    }

    public final Object call() {
        return ActivityLinkManager.m115413a(this.f93694a, this.f93695b);
    }
}
