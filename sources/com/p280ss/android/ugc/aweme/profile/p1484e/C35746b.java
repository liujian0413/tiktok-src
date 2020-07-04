package com.p280ss.android.ugc.aweme.profile.p1484e;

import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C30241a;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.e.b */
public final class C35746b {

    /* renamed from: com.ss.android.ugc.aweme.profile.e.b$a */
    static final class C35747a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Aweme f93707a;

        C35747a(Aweme aweme) {
            this.f93707a = aweme;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0054  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f93707a
                java.lang.String r2 = r0.getAuthorUid()
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f93707a
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
                java.lang.String r1 = "aweme.author"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                java.lang.String r3 = r0.getSecUid()
                java.lang.String r8 = "profile_preload"
                r1 = 1
                r4 = 0
                r5 = 0
                r7 = 20
                com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = com.p280ss.android.ugc.aweme.profile.api.AwemeApi.m115425a(r1, r2, r3, r4, r5, r7, r8)
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f93707a
                java.lang.String r1 = r1.getAuthorUid()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x004e
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f93707a
                java.lang.String r1 = r1.getAuthorUid()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                com.ss.android.ugc.aweme.IAccountService r4 = com.p280ss.android.ugc.aweme.account.C6861a.m21332a()
                com.ss.android.ugc.aweme.IAccountUserService r4 = r4.userService()
                java.lang.String r5 = "AccountProxyService.get().userService()"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)
                java.lang.String r4 = r4.getCurUserId()
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r1 = android.text.TextUtils.equals(r1, r4)
                if (r1 == 0) goto L_0x004e
                r1 = 1
                goto L_0x004f
            L_0x004e:
                r1 = 0
            L_0x004f:
                if (r1 == 0) goto L_0x0054
                r1 = 1000(0x3e8, float:1.401E-42)
                goto L_0x0056
            L_0x0054:
                r1 = 2000(0x7d0, float:2.803E-42)
            L_0x0056:
                com.p280ss.android.ugc.aweme.profile.presenter.C36018b.m116026a(r0, r2, r3, r1)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1484e.C35746b.C35747a.call():java.lang.Void");
        }
    }

    /* renamed from: a */
    public static final void m115475a(FragmentActivity fragmentActivity, String str) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(str, "pageName");
        Aweme aweme = C30241a.m98909a(fragmentActivity).f79567f;
        if (C6399b.m19944t() && aweme != null && !aweme.getIsPreloadScroll() && TextUtils.equals(str, "page_profile")) {
            aweme.setIsPreloadScroll(true);
            C1592h.m7853a((Callable<TResult>) new C35747a<TResult>(aweme));
        }
    }
}
