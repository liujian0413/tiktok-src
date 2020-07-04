package com.bytedance.android.livesdkapi.host.hotsoon;

import android.app.Activity;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.livesdkapi.depend.share.C9388a;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.android.livesdkapi.host.IHostShare.C9431a;
import com.bytedance.android.livesdkapi.host.p453a.C9448i;

public interface IHostShareForHS extends C2324b, C9448i {
    void getShortUrl(String str, C9431a aVar);

    boolean isShareAvailable(String str, Activity activity);

    void share(Activity activity, C9389b bVar, C9388a aVar);

    void showReportDialog(Activity activity, C9389b bVar, String str);

    void showShareDialog(Activity activity, C9389b bVar, C9388a aVar);
}
