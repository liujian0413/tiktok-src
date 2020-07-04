package com.p280ss.android.ugc.aweme.feed;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;

/* renamed from: com.ss.android.ugc.aweme.feed.s */
public final class C28676s {

    /* renamed from: a */
    private static long f75547a;

    /* renamed from: a */
    private static boolean m94346a(long j) {
        if (f75547a == j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m94345a(Context context, User user, Rect rect, String str, Bundle bundle) {
        if (m94346a(user.roomId)) {
            BusinessComponentServiceUtils.getLiveAllService().mo103108a(context);
        } else {
            BusinessComponentServiceUtils.getLiveAllService().mo103109a(context, user, (Rect) null, str, bundle);
        }
    }
}
