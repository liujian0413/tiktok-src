package com.p280ss.android.ugc.aweme.services.video;

import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41548c;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$startToolPermissionActivity$2 */
public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$2 implements C35547a {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;

    public final void onCancel() {
    }

    public final void onSuccess() {
        C41548c.m132320a(this.$context, this.$intent);
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$2(Context context, Intent intent) {
        this.$context = context;
        this.$intent = intent;
    }
}
