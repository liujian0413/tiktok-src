package com.p280ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41548c;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$startToolPermissionActivity$3 */
public final class VideoRecordEntranceServiceImpl$startToolPermissionActivity$3 implements C35547a {
    final /* synthetic */ boolean $clearOld;
    final /* synthetic */ Activity $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $isBack2Main;
    final /* synthetic */ boolean $recreateSupport;

    public final void onCancel() {
    }

    public final void onSuccess() {
        C41548c.m132319a(this.$context, this.$intent, this.$recreateSupport, this.$clearOld, this.$isBack2Main);
    }

    VideoRecordEntranceServiceImpl$startToolPermissionActivity$3(Activity activity, Intent intent, boolean z, boolean z2, boolean z3) {
        this.$context = activity;
        this.$intent = intent;
        this.$recreateSupport = z;
        this.$clearOld = z2;
        this.$isBack2Main = z3;
    }
}
