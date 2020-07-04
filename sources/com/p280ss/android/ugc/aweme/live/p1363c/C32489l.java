package com.p280ss.android.ugc.aweme.live.p1363c;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.share.C9388a;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostShare.C9431a;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.C38065a;
import com.p280ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.p280ss.android.ugc.aweme.sharer.C38343b;

/* renamed from: com.ss.android.ugc.aweme.live.c.l */
public final class C32489l implements IHostShare {
    public final boolean isShareAvailable(String str, Activity activity) {
        C38343b a = C38065a.m121467a(str, activity);
        if (a == null || !a.mo95743a(activity)) {
            return false;
        }
        return true;
    }

    public final void getShortUrl(String str, C9431a aVar) {
        String str2 = (String) C37984ap.m121302b().shortUrl(str).mo19271a();
        if (aVar != null) {
            aVar.mo22112a(str2);
        }
    }

    public final void showShareDialog(Activity activity, C9389b bVar, C9388a aVar) {
        LiveSharePackage.m122020a(activity, bVar, aVar);
    }

    public final void share(Activity activity, C9389b bVar, C9388a aVar) {
        C38343b a = C38065a.m121467a(bVar.f25818a, activity);
        if (a != null && a.mo95743a(activity)) {
            if (a.mo71406a(LiveSharePackage.m122019a(bVar, (Context) activity, aVar).mo18860a(a), (Context) activity)) {
                aVar.mo11626a(bVar.f25818a, "link");
                return;
            }
            aVar.mo11627a(new Throwable());
        }
    }

    public final void showReportDialog(Activity activity, C9389b bVar, String str) {
        if (bVar != null) {
            ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(activity, str, String.valueOf(bVar.f25843z), String.valueOf(bVar.f25814A), null);
        }
    }
}
