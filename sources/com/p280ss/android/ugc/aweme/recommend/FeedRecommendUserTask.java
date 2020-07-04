package com.p280ss.android.ugc.aweme.recommend;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.FeedRecommendUserTask */
public final class FeedRecommendUserTask implements LegoTask {
    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public final void run(Context context) {
        if (!TimeLockRuler.isTeenModeON()) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                if ((FeedRecommendUserTestMode.isTestMode() || FeedRecommendUserViewStyle.isEnabled()) && !C6399b.m19944t() && !C37132d.m119370b() && !TimeLockRuler.isTeenModeON()) {
                    IAccountUserService f2 = C6861a.m21337f();
                    C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                    if (f2.isLogin() && C37137e.m119380a()) {
                        C37132d.m119371c();
                    }
                }
            }
        }
    }
}
