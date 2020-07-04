package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.webrtc.RendererCommon.GlDrawer;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;

public class VideoFrameDrawer {
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private final float[] dstPoints = new float[6];
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private final Matrix renderMatrix = new Matrix();
    private final Point renderSize = new Point();
    private int renderWidth;
    private final YuvUploader yuvUploader = new YuvUploader();

    static class YuvUploader {
        private ByteBuffer copyBuffer;
        private int[] yuvTextures;

        private YuvUploader() {
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            if (this.yuvTextures != null) {
                GLES20.glDeleteTextures(3, this.yuvTextures, 0);
                this.yuvTextures = null;
            }
        }

        public int[] uploadFromBuffer(I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            int i3 = i / 2;
            int[] iArr2 = {i, i3, i3};
            int i4 = i2 / 2;
            int[] iArr3 = {i2, i4, i4};
            int i5 = 0;
            for (int i6 = 0; i6 < 3; i6++) {
                if (iArr[i6] > iArr2[i6]) {
                    i5 = Math.max(i5, iArr2[i6] * iArr3[i6]);
                }
            }
            if (i5 > 0 && (this.copyBuffer == null || this.copyBuffer.capacity() < i5)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i5);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i7 = 0; i7 < 3; i7++) {
                    this.yuvTextures[i7] = GlUtil.generateTexture(3553);
                }
            }
            for (int i8 = 0; i8 < 3; i8++) {
                GLES20.glActiveTexture(33984 + i8);
                GLES20.glBindTexture(3553, this.yuvTextures[i8]);
                if (iArr[i8] == iArr2[i8]) {
                    byteBuffer = byteBufferArr[i8];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i8], iArr[i8], this.copyBuffer, iArr2[i8], iArr2[i8], iArr3[i8]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i8], iArr3[i8], 0, 6409, 5121, byteBuffer);
            }
            return this.yuvTextures;
        }
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    public void drawFrame(VideoFrame videoFrame, GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public void drawFrame(VideoFrame videoFrame, GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    private void calculateTransformedRenderSize(int i, int i2, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i;
            this.renderHeight = i2;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i3 = 0; i3 < 3; i3++) {
            float[] fArr = this.dstPoints;
            int i4 = i3 * 2;
            int i5 = i4 + 0;
            fArr[i5] = fArr[i5] * ((float) i);
            float[] fArr2 = this.dstPoints;
            int i6 = i4 + 1;
            fArr2[i6] = fArr2[i6] * ((float) i2);
        }
        this.renderWidth = distance(this.dstPoints[0], this.dstPoints[1], this.dstPoints[2], this.dstPoints[3]);
        this.renderHeight = distance(this.dstPoints[0], this.dstPoints[1], this.dstPoints[4], this.dstPoints[5]);
    }

    private static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot((double) (f3 - f), (double) (f4 - f2)));
    }

    public void drawFrame(VideoFrame videoFrame, GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4) {
        VideoFrame videoFrame2 = videoFrame;
        Matrix matrix2 = matrix;
        try {
            calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
            boolean z = videoFrame.getBuffer() instanceof TextureBuffer;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate((float) videoFrame.getRotation());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix2 != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (z) {
                this.lastI420Frame = null;
                drawTexture(glDrawer, (TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4);
                return;
            }
            if (videoFrame2 != this.lastI420Frame) {
                this.lastI420Frame = videoFrame2;
                I420Buffer i420 = videoFrame.getBuffer().toI420();
                this.yuvUploader.uploadFromBuffer(i420);
                i420.release();
            }
            glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4);
        } catch (Exception e) {
            Logging.m150052w("VideoFrameDrawer", "draw frame error", e);
        }
    }

    static void drawTexture(GlDrawer glDrawer, TextureBuffer textureBuffer, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        Matrix matrix3 = matrix;
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        switch (textureBuffer.getType()) {
            case OES:
                glDrawer.drawOes(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
                return;
            case RGB:
                glDrawer.drawRgb(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
                return;
            default:
                throw new RuntimeException("Unknown texture type.");
        }
    }
}
