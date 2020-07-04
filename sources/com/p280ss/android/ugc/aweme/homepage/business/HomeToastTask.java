package com.p280ss.android.ugc.aweme.homepage.business;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.main.C32903bh;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.homepage.business.HomeToastTask */
public final class HomeToastTask implements LegoTask {
    private final boolean isShowABToast;

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public HomeToastTask(boolean z) {
        this.isShowABToast = z;
    }

    public final void run(Context context) {
        String str;
        C6921a.m21555a("ToastTask");
        long c = C6887b.m21436b().mo16910c(context, "red_point_count");
        if (c > 0) {
            if ((C6399b.m19945u() && !C32903bh.m106495a()) || (C6399b.m19944t() && !C43122ff.m136767b())) {
                if (context != null) {
                    str = context.getString(R.string.ddt, new Object[]{Long.valueOf(c)});
                } else {
                    str = null;
                }
                C10761a.m31410e(context, str).mo25750a();
            }
            C6877n.m21407a("log_red_badge", "click", C6869c.m21381a().mo16887a("count", String.valueOf(c)).mo16888b());
            C6907h.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("click").setValue(String.valueOf(c)));
            C6887b.m21436b().mo16899a(context, "red_point_count", 0);
        }
    }
}
