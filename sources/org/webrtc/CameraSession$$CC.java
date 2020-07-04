package org.webrtc;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import org.webrtc.VideoFrame.TextureBuffer;

public abstract /* synthetic */ class CameraSession$$CC {
    public static int getDeviceOrientation$$STATIC$$(Context context) {
        switch (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 1:
                return 90;
            case 2:
                return NormalGiftView.ALPHA_180;
            case 3:
                return 270;
            default:
                return 0;
        }
    }

    public static TextureBuffer createTextureBufferWithModifiedTransformMatrix$$STATIC$$(TextureBufferImpl textureBufferImpl, boolean z, int i) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate((float) i);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }
}
