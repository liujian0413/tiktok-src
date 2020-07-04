package com.p280ss.android.ugc.aweme.main.homepageImpl;

import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.feed.event.C28329l;
import com.p280ss.android.ugc.aweme.homepage.api.p1290ui.HomePageUIFrameService;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl */
public abstract class HomePageUIFrameServiceCommonImpl implements HomePageUIFrameService {
    public void setTitleTabVisibility(boolean z) {
        C42961az.m136380a(new C28329l(z, 1));
    }

    public void runInTabHostRunnable(AbsFragment absFragment) {
        C7573i.m23587b(absFragment, "fragment");
        if (absFragment.isViewValid()) {
            FragmentActivity activity = absFragment.getActivity();
            if (activity != null) {
                ((MainActivity) activity).refreshSlideSwitchCanScrollRight();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getTagForCurrentTabInMainPageFragment(com.p280ss.android.ugc.aweme.main.TabChangeManager r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r4 = "manager"
            kotlin.jvm.internal.C7573i.m23587b(r3, r4)
            java.lang.String r4 = "NOTIFICATION"
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r5)
            if (r4 != 0) goto L_0x0015
            java.lang.String r4 = "USER"
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r5)
            if (r4 == 0) goto L_0x0026
        L_0x0015:
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r0 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            boolean r4 = r4.isLogin()
            if (r4 != 0) goto L_0x0026
            r4 = 1
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            r0 = 0
            if (r4 == 0) goto L_0x003f
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r1 = com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            java.lang.String r0 = r0.handleUnlogin(r3, r5)
            java.lang.String r3 = "ServiceManager.get().get…eUnlogin(manager, setTag)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
        L_0x003f:
            if (r4 == 0) goto L_0x0042
            return r0
        L_0x0042:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.main.homepageImpl.HomePageUIFrameServiceCommonImpl.getTagForCurrentTabInMainPageFragment(com.ss.android.ugc.aweme.main.TabChangeManager, java.lang.String, java.lang.String):java.lang.String");
    }
}
