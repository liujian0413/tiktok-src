package com.p280ss.android.ugc.aweme.nearby;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28504t;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;

/* renamed from: com.ss.android.ugc.aweme.nearby.b */
public final class C34035b implements C34034a {
    /* renamed from: a */
    public final void mo86704a() {
        C26612d.m87397c();
    }

    /* renamed from: b */
    public final boolean mo86709b() {
        return C28504t.m93695b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0.isUnderNearbyTab() == false) goto L_0x0013;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo86710b(android.app.Activity r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.main.MainActivity
            if (r0 == 0) goto L_0x0013
            r0 = r3
            com.ss.android.ugc.aweme.main.MainActivity r0 = (com.p280ss.android.ugc.aweme.main.MainActivity) r0
            boolean r1 = r0.isUnderMainTab()
            if (r1 != 0) goto L_0x0017
            boolean r0 = r0.isUnderNearbyTab()
            if (r0 != 0) goto L_0x0017
        L_0x0013:
            boolean r3 = r3 instanceof com.p280ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity
            if (r3 == 0) goto L_0x0019
        L_0x0017:
            r3 = 1
            return r3
        L_0x0019:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.nearby.C34035b.mo86710b(android.app.Activity):boolean");
    }

    /* renamed from: a */
    public final boolean mo86708a(Activity activity) {
        if (!(activity instanceof MainActivity) || !((MainActivity) activity).isUnderMainTab()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo86707a(Context context, User user) {
        UserProfileActivity.m117387a(context, user);
    }

    /* renamed from: a */
    public final void mo86706a(Context context, Aweme aweme, TextView textView) {
        C28504t.m93694b(context, aweme, textView);
    }

    /* renamed from: a */
    public final void mo86705a(Context context, Aweme aweme, ImageView imageView, String str, int i) {
        C28504t.m93687a(context, aweme, imageView, str, 0);
    }
}
