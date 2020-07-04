package com.p280ss.android.ugc.aweme.services;

import android.arch.lifecycle.C0052o;
import com.p280ss.android.ugc.aweme.services.ISDKService.VideoSplitMessage;
import com.p280ss.android.vesdk.VEListener.C45215k;

/* renamed from: com.ss.android.ugc.aweme.services.SDKServiceImpl$split$1 */
public final class SDKServiceImpl$split$1 implements C45215k {
    final /* synthetic */ C0052o $splitResult;

    public final void onCompileProgress(float f) {
    }

    public final void onCompileDone() {
        this.$splitResult.postValue(new VideoSplitMessage(1));
    }

    SDKServiceImpl$split$1(C0052o oVar) {
        this.$splitResult = oVar;
    }

    public final void onCompileError(int i, int i2, float f, String str) {
        this.$splitResult.postValue(new VideoSplitMessage(-1));
    }
}
