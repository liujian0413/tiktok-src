package com.p280ss.android.ugc.aweme.shortvideo.presenter;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.medialib.model.CoverInfo;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.services.videoprocess.OnGetVideoCoverCallback;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.f */
public final class C40223f {
    /* renamed from: a */
    public static void m128537a(final String str, final int i, final OnGetVideoCoverCallback onGetVideoCoverCallback) {
        if (!TextUtils.isEmpty(str)) {
            if (i < 0) {
                i = 0;
            }
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    CoverInfo a = FFMpegManager.m64569a().mo51827a(str, 256, 256, i);
                    if (a != null && a.getData() != null) {
                        final Bitmap createBitmap = Bitmap.createBitmap(a.getData(), a.getWidth(), a.getHeight(), Config.ARGB_8888);
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                if (onGetVideoCoverCallback != null) {
                                    if (createBitmap != null) {
                                        onGetVideoCoverCallback.onGetVideoCoverSuccess(createBitmap);
                                        return;
                                    }
                                    onGetVideoCoverCallback.onGetVideoCoverFailed(-1);
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
