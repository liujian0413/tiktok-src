package com.p280ss.android.ugc.aweme.shortvideo.senor.defult;

import android.content.Context;
import android.view.OrientationEventListener;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.defult.a */
public final class C40329a extends OrientationEventListener {

    /* renamed from: a */
    private final C20707b f104740a;

    public final void onOrientationChanged(int i) {
        if (i <= 45 || i > 315) {
            i = 0;
        }
        if (i > 45 && i <= 135) {
            i = 90;
        }
        if (i > 135 && i <= 225) {
            i = NormalGiftView.ALPHA_180;
        }
        if (i > 225) {
            i = 270;
        }
        this.f104740a.mo55929a(0.0f, 0.0f, (float) i);
    }

    public C40329a(Context context, C20707b bVar) {
        super(context);
        this.f104740a = bVar;
    }
}
