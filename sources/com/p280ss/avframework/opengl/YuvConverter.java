package com.p280ss.avframework.opengl;

import android.opengl.GLES20;
import com.p280ss.avframework.buffer.GlTextureFrameBuffer;
import com.p280ss.avframework.buffer.JavaI420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p280ss.avframework.utils.JniCommon;
import com.p280ss.avframework.utils.ThreadUtils.ThreadChecker;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* renamed from: com.ss.avframework.opengl.YuvConverter */
public class YuvConverter {
    private static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private int coeffsLoc;
    private boolean released = false;
    private GlShader shader;
    private Type shaderTextureType;
    private int texMatrixLoc;
    private final GlTextureFrameBuffer textureFrameBuffer;
    private final ThreadChecker threadChecker = new ThreadChecker();
    private int xUnitLoc;

    public YuvConverter() {
        this.threadChecker.checkIsOnValidThread();
        this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
    }

    private void setupVertexAttribArray() {
        this.shader.setVertexAttribArray("in_pos", 2, DEVICE_RECTANGLE);
        this.shader.setVertexAttribArray("in_tc", 2, TEXTURE_RECTANGLE);
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        if (this.shader != null) {
            this.shader.release();
        }
        this.textureFrameBuffer.release();
    }

    private void initShader(Type type) {
        String str;
        if (this.shader != null) {
            this.shader.release();
        }
        switch (type) {
            case OES:
                str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
                break;
            case RGB:
                str = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
                break;
            default:
                throw new IllegalArgumentException("Unsupported texture type.");
        }
        this.shaderTextureType = type;
        this.shader = new GlShader("varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n", str);
        this.shader.useProgram();
        this.texMatrixLoc = this.shader.getUniformLocation("texMatrix");
        this.xUnitLoc = this.shader.getUniformLocation("xUnit");
        this.coeffsLoc = this.shader.getUniformLocation("coeffs");
        GLES20.glUniform1i(this.shader.getUniformLocation("tex"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        setupVertexAttribArray();
    }

    public I420Buffer convert(TextureBuffer textureBuffer) {
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((height + i2 + 1) * i);
        convert(nativeAllocateByteBuffer, width, height, i, textureBuffer.getTextureId(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix()), textureBuffer.getType());
        int i3 = (i * height) + 0;
        int i4 = (i / 2) + i3;
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i3);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i3);
        int i5 = i2 * i;
        nativeAllocateByteBuffer.limit(i3 + i5);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i4);
        nativeAllocateByteBuffer.limit(i4 + i5);
        return JavaI420Buffer.wrap(width, height, slice, i, slice2, i, nativeAllocateByteBuffer.slice(), i, new Runnable() {
            public void run() {
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
            }
        });
    }

    public void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr) {
        convert(byteBuffer, i, i2, i3, i4, fArr, Type.OES);
    }

    private void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr, Type type) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Type type2 = type;
        this.threadChecker.checkIsOnValidThread();
        if (!this.released) {
            if (type2 != this.shaderTextureType) {
                initShader(type2);
            }
            this.shader.useProgram();
            setupVertexAttribArray();
            if (i7 % 8 != 0) {
                throw new IllegalArgumentException("Invalid stride, must be a multiple of 8");
            } else if (i7 >= i5) {
                int i8 = (i5 + 3) / 4;
                int i9 = (i5 + 7) / 8;
                int i10 = (i6 + 1) / 2;
                int i11 = i6 + i10;
                if (byteBuffer.capacity() >= i7 * i11) {
                    float[] multiplyMatrices = RendererCommon.multiplyMatrices(fArr, RendererCommon.verticalFlipMatrix());
                    int i12 = i7 / 4;
                    this.textureFrameBuffer.setSize(i12, i11);
                    GLES20.glBindFramebuffer(36160, this.textureFrameBuffer.getFrameBufferId());
                    GlUtil.checkNoGLES2Error("glBindFramebuffer");
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(type.getGlTarget(), i4);
                    GLES20.glUniformMatrix4fv(this.texMatrixLoc, 1, false, multiplyMatrices, 0);
                    GLES20.glViewport(0, 0, i8, i6);
                    float f = (float) i5;
                    GLES20.glUniform2f(this.xUnitLoc, multiplyMatrices[0] / f, multiplyMatrices[1] / f);
                    GLES20.glUniform4f(this.coeffsLoc, 0.299f, 0.587f, 0.114f, 0.0f);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glViewport(0, i6, i9, i10);
                    GLES20.glUniform2f(this.xUnitLoc, (multiplyMatrices[0] * 2.0f) / f, (multiplyMatrices[1] * 2.0f) / f);
                    GLES20.glUniform4f(this.coeffsLoc, -0.169f, -0.331f, 0.499f, 0.5f);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glViewport(i7 / 8, i6, i9, i10);
                    GLES20.glUniform4f(this.coeffsLoc, 0.499f, -0.418f, -0.0813f, 0.5f);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glReadPixels(0, 0, i12, i11, 6408, 5121, byteBuffer);
                    GlUtil.checkNoGLES2Error("YuvConverter.convert");
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glBindTexture(3553, 0);
                    GLES20.glBindTexture(type.getGlTarget(), 0);
                    return;
                }
                throw new IllegalArgumentException("YuvConverter.convert called with too small buffer");
            } else {
                throw new IllegalArgumentException("Invalid stride, must >= width");
            }
        } else {
            throw new IllegalStateException("YuvConverter.convert called on released object");
        }
    }
}
