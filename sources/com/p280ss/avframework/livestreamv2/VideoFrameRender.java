package com.p280ss.avframework.livestreamv2;

import android.opengl.Matrix;
import android.util.AndroidRuntimeException;
import com.p280ss.avframework.buffer.VideoFrame;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p280ss.avframework.opengl.GlRenderDrawer;
import com.p280ss.avframework.opengl.RendererCommon;

/* renamed from: com.ss.avframework.livestreamv2.VideoFrameRender */
public class VideoFrameRender {
    float[] mTexMatrix = new float[16];

    public VideoFrameRender() {
        Matrix.setIdentityM(this.mTexMatrix, 0);
    }

    public boolean drawFrame(VideoFrame videoFrame, GlRenderDrawer glRenderDrawer, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4) {
        android.graphics.Matrix matrix;
        float[] fArr3 = this.mTexMatrix;
        boolean z = videoFrame.getBuffer() instanceof TextureBuffer;
        Matrix.setIdentityM(this.mTexMatrix, 0);
        if (z) {
            matrix = ((TextureBuffer) videoFrame.getBuffer()).getTransformMatrix();
        } else {
            matrix = null;
        }
        Matrix.rotateM(this.mTexMatrix, 0, (float) videoFrame.getRotation(), 0.0f, 0.0f, 1.0f);
        if (fArr2 != null) {
            fArr3 = new float[16];
            Matrix.multiplyMM(fArr3, 0, this.mTexMatrix, 0, fArr2, 0);
        }
        if (matrix != null) {
            this.mTexMatrix = fArr3;
            fArr3 = new float[16];
            float[] fArr4 = fArr3;
            Matrix.multiplyMM(fArr4, 0, this.mTexMatrix, 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix), 0);
        }
        float[] fArr5 = fArr3;
        if (z) {
            TextureBuffer textureBuffer = (TextureBuffer) videoFrame.getBuffer();
            if (textureBuffer.getType() == Type.OES) {
                return glRenderDrawer.drawOes(textureBuffer.getTextureId(), fArr, fArr5, i, i2, i3, i4);
            }
            return glRenderDrawer.drawRgb(textureBuffer.getTextureId(), fArr, fArr5, i, i2, i3, i4);
        }
        throw new AndroidRuntimeException("Next version supports");
    }
}
