package com.p280ss.android.ugc.aweme.services.videoprocess;

import android.graphics.Bitmap;

/* renamed from: com.ss.android.ugc.aweme.services.videoprocess.OnGetVideoCoverCallback */
public interface OnGetVideoCoverCallback {
    void onGetVideoCoverFailed(int i);

    void onGetVideoCoverSuccess(Bitmap bitmap);
}
