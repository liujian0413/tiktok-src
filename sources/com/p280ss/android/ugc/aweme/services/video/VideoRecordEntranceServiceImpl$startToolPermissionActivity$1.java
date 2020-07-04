package com.p280ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41548c;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$startToolPermissionActivity$1 */
public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$1 implements C35547a {
    final /* synthetic */ Activity $context;
    final /* synthetic */ Intent $intent;

    public final void onCancel() {
    }

    public final void onSuccess() {
        C41548c.m132322b(this.$context, this.$intent);
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$1(Activity activity, Intent intent) {
        this.$context = activity;
        this.$intent = intent;
    }
}
