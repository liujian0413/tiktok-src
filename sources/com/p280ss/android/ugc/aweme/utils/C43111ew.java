package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainFragment;
import com.p280ss.android.ugc.aweme.services.IAVService;

/* renamed from: com.ss.android.ugc.aweme.utils.ew */
public final class C43111ew {
    /* renamed from: c */
    private static boolean m136738c(Context context) {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isVideoPublishPreviewActivity(context);
    }

    /* renamed from: d */
    private static boolean m136739d(Context context) {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).recordActivityService().instanceOfVideoRecordActivity(context);
    }

    /* renamed from: a */
    public static boolean m136736a(Context context) {
        if (context != null && (context instanceof MainActivity)) {
            MainActivity mainActivity = (MainActivity) context;
            if ((mainActivity.getCurFragment() instanceof MainFragment) && ScrollSwitchStateManager.m98918a((FragmentActivity) mainActivity).mo79723b("page_feed")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m136737b(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof DetailActivity) {
            ScrollSwitchStateManager a = ScrollSwitchStateManager.m98918a((FragmentActivity) (DetailActivity) context);
            if (!a.mo79717a() || a.mo79723b("page_feed")) {
                return true;
            }
            return false;
        } else if (m136739d(context) || m136738c(context)) {
            return true;
        } else {
            return false;
        }
    }
}
