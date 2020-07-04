package com.p280ss.avframework.livestreamv2.effectcamera.render;

import android.opengl.GLES20;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p280ss.avframework.livestreamv2.effectcamera.utils.OpenGLUtils;
import com.p280ss.avframework.livestreamv2.effectcamera.utils.TextureRotationUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.render.PreRender */
public class PreRender {
    private ArrayList<HashMap<String, Integer>> mArrayPrograms = new ArrayList<HashMap<String, Integer>>(2) {
        {
            for (int i = 0; i < 2; i++) {
                HashMap hashMap = new HashMap();
                hashMap.put("program", Integer.valueOf(0));
                hashMap.put("position", Integer.valueOf(-1));
                hashMap.put("inputImageTexture", Integer.valueOf(-1));
                hashMap.put("inputTextureCoordinate", Integer.valueOf(-1));
                add(hashMap);
            }
        }
    };
    private int[] mFrameBufferTextures;
    private int[] mFrameBuffers;
    private final FloatBuffer mGLCubeBuffer = ByteBuffer.allocateDirect(TextureRotationUtil.CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    private FloatBuffer mGLPreviewTextureBuffer;
    private final FloatBuffer mGLSaveTextureBuffer;
    private final FloatBuffer mGLTextureBuffer;
    private boolean mIsInitialized;
    int mSourceHeight;
    int mSourceWidth;
    int mTargetHeight;
    int mTargetWidth;
    private FloatBuffer mTextureBuffer;
    private FloatBuffer mVertexBuffer;
    private int mViewPortHeight;
    private int mViewPortWidth;

    public void destroyFrameBuffers() {
        if (this.mFrameBufferTextures != null) {
            GLES20.glDeleteTextures(2, this.mFrameBufferTextures, 0);
            this.mFrameBufferTextures = null;
        }
        if (this.mFrameBuffers != null) {
            GLES20.glDeleteFramebuffers(2, this.mFrameBuffers, 0);
            this.mFrameBuffers = null;
        }
    }

    public final void destroy() {
        this.mIsInitialized = false;
        this.mViewPortWidth = 0;
        this.mViewPortHeight = 0;
        destroyFrameBuffers();
        GLES20.glDeleteProgram(((Integer) ((HashMap) this.mArrayPrograms.get(0)).get("program")).intValue());
        ((HashMap) this.mArrayPrograms.get(0)).put("program", Integer.valueOf(0));
        GLES20.glDeleteProgram(((Integer) ((HashMap) this.mArrayPrograms.get(1)).get("program")).intValue());
        ((HashMap) this.mArrayPrograms.get(1)).put("program", Integer.valueOf(0));
    }

    public PreRender() {
        this.mGLCubeBuffer.put(TextureRotationUtil.CUBE).position(0);
        this.mGLTextureBuffer = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mGLTextureBuffer.put(TextureRotationUtil.TEXTURE_NO_ROTATION).position(0);
        this.mGLPreviewTextureBuffer = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mGLPreviewTextureBuffer.put(TextureRotationUtil.TEXTURE_NO_ROTATION).position(0);
        this.mVertexBuffer = ByteBuffer.allocateDirect(TextureRotationUtil.CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mVertexBuffer.put(TextureRotationUtil.CUBE).position(0);
        this.mGLSaveTextureBuffer = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mGLSaveTextureBuffer.put(TextureRotationUtil.getRotation(0, false, true)).position(0);
    }

    public int onDrawFrame(int i) {
        calculatePreview(this.mSourceWidth, this.mSourceHeight, this.mTargetWidth, this.mTargetHeight, false, false);
        if (!this.mIsInitialized) {
            return -1;
        }
        GLES20.glUseProgram(((Integer) ((HashMap) this.mArrayPrograms.get(1)).get("program")).intValue());
        this.mVertexBuffer.position(0);
        int intValue = ((Integer) ((HashMap) this.mArrayPrograms.get(1)).get("position")).intValue();
        GLES20.glVertexAttribPointer(intValue, 2, 5126, false, 0, this.mVertexBuffer);
        GLES20.glEnableVertexAttribArray(intValue);
        this.mGLPreviewTextureBuffer.position(0);
        int intValue2 = ((Integer) ((HashMap) this.mArrayPrograms.get(1)).get("inputTextureCoordinate")).intValue();
        GLES20.glVertexAttribPointer(intValue2, 2, 5126, false, 0, this.mGLPreviewTextureBuffer);
        GLES20.glEnableVertexAttribArray(intValue2);
        if (i != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glUniform1i(((Integer) ((HashMap) this.mArrayPrograms.get(1)).get("inputImageTexture")).intValue(), 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(intValue);
        GLES20.glDisableVertexAttribArray(intValue2);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, 0);
        return 1;
    }

    public int preProcess(int i) {
        if (this.mFrameBuffers == null || !this.mIsInitialized) {
            return -2;
        }
        GLES20.glUseProgram(((Integer) ((HashMap) this.mArrayPrograms.get(0)).get("program")).intValue());
        OpenGLUtils.checkGlError("glUseProgram");
        this.mGLCubeBuffer.position(0);
        int intValue = ((Integer) ((HashMap) this.mArrayPrograms.get(0)).get("position")).intValue();
        GLES20.glVertexAttribPointer(intValue, 2, 5126, false, 0, this.mGLCubeBuffer);
        GLES20.glEnableVertexAttribArray(intValue);
        this.mTextureBuffer.position(0);
        int intValue2 = ((Integer) ((HashMap) this.mArrayPrograms.get(0)).get("inputTextureCoordinate")).intValue();
        GLES20.glVertexAttribPointer(intValue2, 2, 5126, false, 0, this.mTextureBuffer);
        GLES20.glEnableVertexAttribArray(intValue2);
        if (i != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(((Integer) ((HashMap) this.mArrayPrograms.get(0)).get("inputImageTexture")).intValue(), 0);
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBuffers[0]);
        OpenGLUtils.checkGlError("glBindFramebuffer");
        GLES20.glViewport(0, 0, this.mViewPortWidth, this.mViewPortHeight);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(intValue);
        GLES20.glDisableVertexAttribArray(intValue2);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glUseProgram(0);
        return this.mFrameBufferTextures[0];
    }

    public void changeWidthHeight(int i, int i2) {
        if (this.mViewPortWidth != i || this.mViewPortHeight != i2) {
            destroy();
            init(i, i2);
        }
    }

    private void initFrameBuffers(int i, int i2) {
        destroyFrameBuffers();
        if (this.mFrameBuffers == null) {
            this.mFrameBuffers = new int[2];
            this.mFrameBufferTextures = new int[2];
            GLES20.glGenFramebuffers(2, this.mFrameBuffers, 0);
            GLES20.glGenTextures(2, this.mFrameBufferTextures, 0);
            bindFrameBuffer(this.mFrameBufferTextures[0], this.mFrameBuffers[0], i, i2);
            bindFrameBuffer(this.mFrameBufferTextures[1], this.mFrameBuffers[1], i, i2);
        }
    }

    public void adjustTextureBuffer(int i, boolean z) {
        float[] rotation = TextureRotationUtil.getRotation(i, true, z);
        if (this.mTextureBuffer == null) {
            this.mTextureBuffer = ByteBuffer.allocateDirect(rotation.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.mTextureBuffer.clear();
        this.mTextureBuffer.put(rotation).position(0);
    }

    public void init(int i, int i2) {
        if (this.mViewPortWidth != i || this.mViewPortHeight != i2) {
            initProgram("#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\n\nvoid main()\n{\n\tgl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", (HashMap) this.mArrayPrograms.get(0));
            initProgram("precision mediump float;\nvarying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}", (HashMap) this.mArrayPrograms.get(1));
            this.mViewPortWidth = i;
            this.mViewPortHeight = i2;
            initFrameBuffers(i, i2);
            this.mIsInitialized = true;
        }
    }

    private void initProgram(String str, HashMap<String, Integer> hashMap) {
        if (((Integer) hashMap.get("program")).intValue() == 0) {
            int loadProgram = OpenGLUtils.loadProgram("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nvarying vec2 textureCoordinate;\n\nvoid main()\n{\n\ttextureCoordinate = inputTextureCoordinate.xy;\n\tgl_Position = position;\n}", str);
            hashMap.put("program", Integer.valueOf(loadProgram));
            hashMap.put("position", Integer.valueOf(GLES20.glGetAttribLocation(loadProgram, "position")));
            hashMap.put("inputImageTexture", Integer.valueOf(GLES20.glGetUniformLocation(loadProgram, "inputImageTexture")));
            hashMap.put("inputTextureCoordinate", Integer.valueOf(GLES20.glGetAttribLocation(loadProgram, "inputTextureCoordinate")));
        }
    }

    public int saveTextureToFrameBuffer(int i, ByteBuffer byteBuffer) {
        int i2 = i;
        if (this.mFrameBuffers == null) {
            return -1;
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBuffers[1]);
        GLES20.glViewport(0, 0, this.mViewPortWidth, this.mViewPortHeight);
        GLES20.glUseProgram(((Integer) ((HashMap) this.mArrayPrograms.get(1)).get("program")).intValue());
        if (!this.mIsInitialized) {
            return -1;
        }
        this.mGLCubeBuffer.position(0);
        int intValue = ((Integer) ((HashMap) this.mArrayPrograms.get(1)).get("position")).intValue();
        GLES20.glVertexAttribPointer(intValue, 2, 5126, false, 0, this.mGLCubeBuffer);
        GLES20.glEnableVertexAttribArray(intValue);
        this.mGLSaveTextureBuffer.position(0);
        int intValue2 = ((Integer) ((HashMap) this.mArrayPrograms.get(1)).get("inputTextureCoordinate")).intValue();
        GLES20.glVertexAttribPointer(intValue2, 2, 5126, false, 0, this.mGLSaveTextureBuffer);
        GLES20.glEnableVertexAttribArray(intValue2);
        if (i2 != -1) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i2);
            GLES20.glUniform1i(((Integer) ((HashMap) this.mArrayPrograms.get(1)).get("inputImageTexture")).intValue(), 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        if (byteBuffer != null) {
            GLES20.glReadPixels(0, 0, this.mViewPortWidth, this.mViewPortHeight, 6408, 5121, byteBuffer);
        }
        GLES20.glDisableVertexAttribArray(intValue);
        GLES20.glDisableVertexAttribArray(intValue2);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        return this.mFrameBufferTextures[1];
    }

    public void calculatePreviewTextureBuffer(int i, int i2, int i3, int i4) {
        if (this.mGLPreviewTextureBuffer == null) {
            this.mGLPreviewTextureBuffer = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.mGLPreviewTextureBuffer.clear();
        this.mGLPreviewTextureBuffer.put(TextureRotationUtil.TEXTURE_NO_ROTATION).position(0);
        this.mSourceWidth = i3;
        this.mSourceHeight = i4;
        this.mTargetWidth = i;
        this.mTargetHeight = i2;
    }

    private void bindFrameBuffer(int i, int i2, int i3, int i4) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexImage2D(3553, 0, 6408, i3, i4, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glBindFramebuffer(36160, i2);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public void calculateVertexBuffer(int i, int i2, int i3, int i4) {
        float f = (float) i;
        float f2 = (float) i3;
        float f3 = (float) i2;
        float f4 = (float) i4;
        float max = Math.max(f / f2, f3 / f4);
        float round = ((float) Math.round(f2 * max)) / f;
        float round2 = ((float) Math.round(f4 * max)) / f3;
        float[] fArr = {TextureRotationUtil.CUBE[0] / round2, TextureRotationUtil.CUBE[1] / round, TextureRotationUtil.CUBE[2] / round2, TextureRotationUtil.CUBE[3] / round, TextureRotationUtil.CUBE[4] / round2, TextureRotationUtil.CUBE[5] / round, TextureRotationUtil.CUBE[6] / round2, TextureRotationUtil.CUBE[7] / round};
        if (this.mVertexBuffer == null) {
            this.mVertexBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.mVertexBuffer.clear();
        this.mVertexBuffer.put(fArr).position(0);
    }

    public void calculatePreview(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        float f = ((float) i) / ((float) i2);
        float f2 = (float) i3;
        float f3 = (float) i4;
        float f4 = f2 / f3;
        int i6 = 0;
        if (f > f4) {
            int i7 = (int) (f3 * f);
            i3 = i7;
            i6 = -((i7 - i3) / 2);
        } else if (f < f4) {
            int i8 = (int) (f2 / f);
            i5 = -((i8 - i4) / 2);
            i4 = i8;
            GLES20.glViewport(i6, i5, i3, i4);
        }
        i5 = 0;
        GLES20.glViewport(i6, i5, i3, i4);
    }
}
