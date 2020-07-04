package org.webrtc;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;

final /* synthetic */ class SurfaceTextureHelper$$Lambda$0 implements OnFrameAvailableListener {
    private final SurfaceTextureHelper arg$1;

    SurfaceTextureHelper$$Lambda$0(SurfaceTextureHelper surfaceTextureHelper) {
        this.arg$1 = surfaceTextureHelper;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.arg$1.lambda$new$0$SurfaceTextureHelper(surfaceTexture);
    }
}
