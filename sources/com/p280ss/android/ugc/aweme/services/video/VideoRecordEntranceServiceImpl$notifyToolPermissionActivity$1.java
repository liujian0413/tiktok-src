package com.p280ss.android.ugc.aweme.services.video;

import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41548c;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1 */
public final class VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1 implements C35547a {
    final /* synthetic */ boolean $clearOld;
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $isBack2Main;
    final /* synthetic */ boolean $recreateSupport;

    public final void onCancel() {
    }

    public final void onSuccess() {
        C41548c.m132321a(this.$context, this.$intent, this.$recreateSupport, this.$clearOld, this.$isBack2Main);
    }

    VideoRecordEntranceServiceImpl$notifyToolPermissionActivity$1(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        this.$context = context;
        this.$intent = intent;
        this.$recreateSupport = z;
        this.$clearOld = z2;
        this.$isBack2Main = z3;
    }
}
