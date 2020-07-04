package com.p280ss.android.ugc.aweme.shortvideo.transition;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.graphics.Bitmap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder */
public class VideoCoverBitmapHolder implements C0042h {

    /* renamed from: a */
    public static Bitmap f107006a;

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (f107006a != null) {
            f107006a = null;
        }
    }

    /* renamed from: a */
    public static void m131308a(Bitmap bitmap) {
        f107006a = bitmap;
    }
}
