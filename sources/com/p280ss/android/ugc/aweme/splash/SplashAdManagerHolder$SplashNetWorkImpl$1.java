package com.p280ss.android.ugc.aweme.splash;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;

/* renamed from: com.ss.android.ugc.aweme.splash.SplashAdManagerHolder$SplashNetWorkImpl$1 */
class SplashAdManagerHolder$SplashNetWorkImpl$1 implements LegoTask {
    final /* synthetic */ C41735b this$0;
    final /* synthetic */ String val$microUrl;

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    public void run(Context context) {
        C7167b.m22380b().mo18647a().preloadMiniApp(this.val$microUrl);
    }

    SplashAdManagerHolder$SplashNetWorkImpl$1(C41735b bVar, String str) {
        this.this$0 = bVar;
        this.val$microUrl = str;
    }
}
