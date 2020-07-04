package com.p280ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadManager$1 */
class AwesomeSplashPreloadManager$1 implements LegoTask {
    final /* synthetic */ C25054b this$0;
    final /* synthetic */ Aweme val$aweme;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        C7167b.m22380b().mo18647a().preloadMiniApp(this.val$aweme.getMicroAppInfo().getAppId(), this.val$aweme.getMicroAppInfo().getType());
    }

    AwesomeSplashPreloadManager$1(C25054b bVar, Aweme aweme) {
        this.this$0 = bVar;
        this.val$aweme = aweme;
    }
}
