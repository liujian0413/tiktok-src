package com.p280ss.avframework.livestreamv2.interact.render.crop;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import com.p280ss.avframework.buffer.GlTextureFrameBuffer;
import com.p280ss.avframework.livestreamv2.interact.render.ImageFrame;
import com.p280ss.avframework.livestreamv2.interact.render.opengl.EglBase;
import com.p280ss.avframework.opengl.GlShader;
import com.p280ss.avframework.opengl.GlUtil;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.utils.ThreadUtils;
import java.nio.FloatBuffer;

/* renamed from: com.ss.avframework.livestreamv2.interact.render.crop.Texture2DProcessor */
public class Texture2DProcessor {
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private EglBase eglBase;
    private int inPosLocation;
    private int inTcLocation;
    private GlShader shader;
    private GlTextureFrameBuffer targetFrameBuffer;
    private int texMatrixLocation;
    private Handler threadHandler;
    private int viewportHeight;
    private int viewportWidth;

    private GlShader createShader() {
        return new GlShader("varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\ngl_Position = in_pos;\ntc = (tex_mat * in_tc).xy;\n}\n", "precision mediump float;\nvarying vec2 tc;\nuniform sampler2D s_texture;\nvoid main() {  gl_FragColor = texture2D(s_texture, tc);\n}");
    }

    public void release() {
        if (this.shader != null) {
            this.shader.release();
            this.shader = null;
        }
    }

    private float[] getFinalGLMatrix(ImageFrame imageFrame) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(imageFrame.getTransfromMatrix());
        convertMatrixToAndroidGraphicsMatrix.preConcat(matrix);
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix);
    }

    /* access modifiers changed from: 0000 */
    public ImageFrame pushImage(ImageFrame imageFrame) {
        ThreadUtils.invokeAtFrontUninterruptibly(this.threadHandler, (Runnable) new Texture2DProcessor$$Lambda$0(this, imageFrame, getFinalGLMatrix(imageFrame)));
        imageFrame.setTextureID(this.targetFrameBuffer.getTextureId());
        imageFrame.setWidth(this.viewportWidth);
        imageFrame.setHeight(this.viewportHeight);
        imageFrame.setTransfromMatrix(ImageFrame.ANDROID_DEFAULT_TRANSFORM_MATRIX);
        return imageFrame;
    }

    private void prepareShader(float[] fArr) {
        if (this.shader == null) {
            this.shader = createShader();
            this.shader.useProgram();
            GLES20.glUniform1i(this.shader.getUniformLocation("s_texture"), 0);
            this.texMatrixLocation = this.shader.getUniformLocation("tex_mat");
            this.inPosLocation = this.shader.getAttribLocation("in_pos");
            this.inTcLocation = this.shader.getAttribLocation("in_tc");
        }
        this.shader.useProgram();
        GLES20.glEnableVertexAttribArray(this.inPosLocation);
        GLES20.glVertexAttribPointer(this.inPosLocation, 2, 5126, false, 0, FULL_RECTANGLE_BUFFER);
        GLES20.glEnableVertexAttribArray(this.inTcLocation);
        GLES20.glVertexAttribPointer(this.inTcLocation, 2, 5126, false, 0, FULL_RECTANGLE_TEXTURE_BUFFER);
        GLES20.glUniformMatrix4fv(this.texMatrixLocation, 1, false, fArr, 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$pushImage$0$Texture2DProcessor(ImageFrame imageFrame, float[] fArr) {
        drawTexture(imageFrame.getTextureID(), fArr);
    }

    private void drawTexture(int i, float[] fArr) {
        if (this.targetFrameBuffer != null) {
            prepareShader(fArr);
            GLES20.glBindFramebuffer(36160, this.targetFrameBuffer.getFrameBufferId());
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.targetFrameBuffer.getTextureId(), 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i);
            GLES20.glViewport(0, 0, this.viewportWidth, this.viewportHeight);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            this.eglBase.swapBuffers();
        }
    }

    Texture2DProcessor(int i, int i2, Handler handler, EglBase eglBase2, GlTextureFrameBuffer glTextureFrameBuffer) {
        this.viewportWidth = i;
        this.viewportHeight = i2;
        this.threadHandler = handler;
        this.targetFrameBuffer = glTextureFrameBuffer;
        this.eglBase = eglBase2;
    }
}
