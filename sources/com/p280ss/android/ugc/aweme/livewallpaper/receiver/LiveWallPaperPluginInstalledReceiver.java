package com.p280ss.android.ugc.aweme.livewallpaper.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32577e;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.receiver.LiveWallPaperPluginInstalledReceiver */
public class LiveWallPaperPluginInstalledReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private void m105647a() {
        if (!C6399b.m19944t()) {
            C1592h.m7853a((Callable<TResult>) new Callable<Void>() {
                public final /* synthetic */ Object call() throws Exception {
                    return m105648a();
                }

                /* renamed from: a */
                private static Void m105648a() {
                    String f = C32577e.m105510f();
                    if (!TextUtils.isEmpty(f)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(f);
                        sb.append(File.separator);
                        sb.append("livewallpaper-release");
                        C7276d.m22816c(sb.toString());
                    }
                    return null;
                }
            });
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && context != null && "android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) && "package:com.zhiliao.musically.livewallpaper".equals(intent.getDataString())) {
            m105647a();
            C32577e.m105485a();
        }
    }
}
