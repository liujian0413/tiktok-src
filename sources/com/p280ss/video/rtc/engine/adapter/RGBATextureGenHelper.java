package com.p280ss.video.rtc.engine.adapter;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p280ss.video.rtc.engine.utils.GLUtils;
import com.p280ss.video.rtc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.webrtc.GlUtil;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;
import org.webrtc.YuvConverter;

/* renamed from: com.ss.video.rtc.engine.adapter.RGBATextureGenHelper */
public class RGBATextureGenHelper {
    private FloatBuffer coordVertices = GlUtil.createFloatBuffer(this.coordVerticesFloatArray);
    private float[] coordVerticesFloatArray = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    private int framebufferID;
    private boolean hasGLInited = false;
    private EGLContext mEGLContext;
    private EGLConfig mEglConfig;
    private EGLDisplay mEglDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLSurface mEglSurface = EGL14.EGL_NO_SURFACE;
    private float[] mTransform = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    private YuvConverter mYuvConverter = new YuvConverter();
    private int programID;
    private FloatBuffer squareVerticesMatrix = GlUtil.createFloatBuffer(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
    private int textureUID;
    private int textureVID;
    private int textureYID;
    private int texturesRGBAID;
    private String vShaderStr = "attribute vec4 vPosition;attribute vec2 a_texCoord;uniform int mirror;varying vec2 tc;void main(){   gl_Position = vPosition;   if(mirror == 1)       tc = vec2(a_texCoord.s, a_texCoord.t);   else       tc = vec2(1.0-a_texCoord.s, a_texCoord.t);}";
    private String yuvFragmentShader = "precision mediump float;uniform sampler2D tex_y;uniform sampler2D tex_u;uniform sampler2D tex_v;varying vec2 tc;void main(){  vec4 c = vec4((texture2D(tex_y, tc).r - 16./255.) * 1.164);  vec4 U = vec4(texture2D(tex_u, tc).r - 128./255.);  vec4 V = vec4(texture2D(tex_v, tc).r - 128./255.);  c += V * vec4(1.596, -0.813, 0, 0);  c += U * vec4(0, -0.392, 2.017, 0);  c.a = 1.0;  gl_FragColor = c;}";

    public float[] getCoordVertices() {
        return this.coordVerticesFloatArray;
    }

    public float[] getDefaultCoordVerticesFloatArray() {
        return this.coordVerticesFloatArray;
    }

    public float[] getTransformMatrix() {
        return this.mTransform;
    }

    private boolean checkIsNotReleased() {
        if (this.mEglDisplay == EGL14.EGL_NO_DISPLAY || this.mEGLContext == EGL14.EGL_NO_CONTEXT || this.mEglConfig == null) {
            return false;
        }
        return true;
    }

    public void release() {
        if (!(!checkIsNotReleased() || this.mEglSurface == EGL14.EGL_NO_SURFACE || this.mEglDisplay == null)) {
            EGL14.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
            this.mEglSurface = EGL14.EGL_NO_SURFACE;
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.mEglDisplay, this.mEGLContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEglDisplay);
            this.mEGLContext = EGL14.EGL_NO_CONTEXT;
            this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
            this.mEglConfig = null;
        }
    }

    private int initProgram() {
        int glCreateProgram = GLES20.glCreateProgram();
        checkGLError("glCreateProgram");
        int loadShader = GLUtils.loadShader(35633, this.vShaderStr);
        checkGLError("loadShader");
        int loadShader2 = GLUtils.loadShader(35632, this.yuvFragmentShader);
        checkGLError("loadShader");
        GLES20.glAttachShader(glCreateProgram, loadShader);
        checkGLError("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        checkGLError("glAttachShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(loadShader2, 35713, iArr, 0);
        if (iArr[0] == 0) {
            LogUtil.m145279e("RGBATextureGenHelper", "Could not compile shader:");
            StringBuilder sb = new StringBuilder(" ");
            sb.append(GLES20.glGetShaderInfoLog(loadShader2));
            LogUtil.m145279e("RGBATextureGenHelper", sb.toString());
        }
        GLES20.glBindAttribLocation(glCreateProgram, 0, "vPosition");
        checkGLError("glBindAttribLocation vPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "a_texCoord");
        checkGLError("glBindAttribLocation vPosition");
        int[] iArr2 = new int[1];
        GLES20.glLinkProgram(glCreateProgram);
        checkGLError("glLinkProgram");
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        checkGLError("glGetProgramiv");
        if (iArr2[0] == 1) {
            return glCreateProgram;
        }
        LogUtil.m145279e("RGBATextureGenHelper", "Could not link program: ");
        LogUtil.m145279e("RGBATextureGenHelper", GLES20.glGetProgramInfoLog(glCreateProgram));
        checkGLError("glGetProgramInfoLog");
        GLES20.glDeleteProgram(glCreateProgram);
        checkGLError("glDeleteProgram");
        return 0;
    }

    public I420Buffer convert2YUV(TextureBuffer textureBuffer) {
        return this.mYuvConverter.convert(textureBuffer);
    }

    private void checkGLError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder("Error at ");
            sb.append(str);
            sb.append(" errcode:");
            sb.append(glGetError);
            LogUtil.m145279e("RGBATextureGenHelper", sb.toString());
        }
    }

    public RGBATextureGenHelper(EGLContext eGLContext) {
        this.mEGLContext = eGLContext;
    }

    public void prepareGLESEnv(int i, int i2) {
        if (!this.hasGLInited) {
            prepareGLESEnvInternal(i, i2);
        }
    }

    private void prepareGLESEnvInternal(int i, int i2) {
        this.hasGLInited = true;
        EGLContext eGLContext = this.mEGLContext;
        if (eGLContext != null) {
            int[] iArr = {12375, i, 12374, i2, 12344};
            this.mEglDisplay = GLUtils.getEglDisplay();
            this.mEglConfig = GLUtils.getEglConfig(this.mEglDisplay);
            this.mEglSurface = EGL14.eglCreatePbufferSurface(this.mEglDisplay, this.mEglConfig, iArr, 0);
            this.mEGLContext = GLUtils.createEglContext(this.mEglDisplay, this.mEglConfig, eGLContext);
            EGL14.eglMakeCurrent(this.mEglDisplay, this.mEglSurface, this.mEglSurface, this.mEGLContext);
            checkGLError("glActiveTexture");
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            this.textureYID = iArr2[0];
            checkGLError("glActiveTexture");
            int[] iArr3 = new int[1];
            GLES20.glGenTextures(1, iArr3, 0);
            checkGLError("glGenTextures");
            this.textureUID = iArr3[0];
            checkGLError("glActiveTexture");
            int[] iArr4 = new int[1];
            GLES20.glGenTextures(1, iArr4, 0);
            checkGLError("glGenTextures");
            this.textureVID = iArr4[0];
            GLES20.glActiveTexture(33987);
            checkGLError("glActiveTexture");
            int[] iArr5 = new int[1];
            GLES20.glGenTextures(1, iArr5, 0);
            this.texturesRGBAID = iArr5[0];
            checkGLError("glGenTextures");
            int[] iArr6 = new int[1];
            GLES20.glGenFramebuffers(1, iArr6, 0);
            checkGLError("glGenFramebuffers");
            this.framebufferID = iArr6[0];
            this.programID = initProgram();
        }
    }

    public int convertYUVByteBuffer2Texture(ByteBuffer byteBuffer, int i, int i2) {
        byte[] bArr = new byte[byteBuffer.capacity()];
        byteBuffer.position(0);
        byteBuffer.get(bArr);
        return convertYUVByteArray2Texture(bArr, i, i2);
    }

    public int convertYUVByteArray2Texture(byte[] bArr, int i, int i2) {
        prepareGLESEnv(i, i2);
        int i3 = i * i2;
        int length = (bArr.length - i3) / 2;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3);
        allocateDirect.order(ByteOrder.nativeOrder());
        allocateDirect.put(bArr, 0, i3);
        allocateDirect.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(length);
        allocateDirect2.order(ByteOrder.nativeOrder());
        allocateDirect2.put(bArr, i3, length);
        allocateDirect2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(length);
        allocateDirect3.order(ByteOrder.nativeOrder());
        allocateDirect3.put(bArr, i3 + length, length);
        allocateDirect3.position(0);
        return convertYUV2TextureInternal(allocateDirect, allocateDirect2, allocateDirect3, i, i2);
    }

    private int convertYUV2TextureInternal(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.textureYID);
        checkGLError("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6409, i, i2, 0, 6409, 5121, byteBuffer);
        checkGLError("glTexImage2D");
        GLES20.glTexParameteri(3553, VideoPreloadSizeExperiment.DEFAULT, 9729);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10241, 9729);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10242, 33071);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10243, 33071);
        checkGLError("glTexParameteri");
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.textureUID);
        checkGLError("glBindTexture");
        int i3 = i / 2;
        int i4 = i2 / 2;
        GLES20.glTexImage2D(3553, 0, 6409, i3, i4, 0, 6409, 5121, byteBuffer2);
        checkGLError("glTexImage2D");
        GLES20.glTexParameteri(3553, VideoPreloadSizeExperiment.DEFAULT, 9729);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10241, 9729);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10242, 33071);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10243, 33071);
        checkGLError("glTexParameteri");
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, this.textureVID);
        checkGLError("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6409, i3, i4, 0, 6409, 5121, byteBuffer3);
        checkGLError("glTexImage2D");
        GLES20.glTexParameteri(3553, VideoPreloadSizeExperiment.DEFAULT, 9729);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10241, 9729);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10242, 33071);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10243, 33071);
        checkGLError("glTexParameteri");
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, this.texturesRGBAID);
        checkGLError("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, i, i2, 0, 6407, 5121, null);
        checkGLError("glTexImage2D");
        GLES20.glTexParameteri(3553, VideoPreloadSizeExperiment.DEFAULT, 9729);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10241, 9729);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10242, 33071);
        checkGLError("glTexParameteri");
        GLES20.glTexParameteri(3553, 10243, 33071);
        checkGLError("glTexParameteri");
        GLES20.glUseProgram(this.programID);
        checkGLError("glUseProgram");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.programID, "mirror");
        checkGLError("glGetUniformLocation");
        GLES20.glUniform1i(glGetUniformLocation, 1);
        checkGLError("glUniform1i");
        FloatBuffer floatBuffer = this.squareVerticesMatrix;
        checkGLError("glGetAttribLocation vPosition");
        GLES20.glVertexAttribPointer(0, 2, 5126, true, 0, floatBuffer);
        checkGLError("glVertexAttribPointer squareVertices");
        GLES20.glEnableVertexAttribArray(0);
        checkGLError("glEnableVertexAttribArray squareVertices");
        checkGLError("glGetAttribLocation a_texCoord");
        GLES20.glVertexAttribPointer(1, 2, 5126, true, 0, this.coordVertices);
        checkGLError("glVertexAttribPointer coordVertices");
        GLES20.glEnableVertexAttribArray(1);
        checkGLError("glEnableVertexAttribArray coordVertices");
        GLES20.glBindFramebuffer(36160, this.framebufferID);
        checkGLError("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texturesRGBAID, 0);
        checkGLError("glFramebufferTexture2D");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        checkGLError("glClearColor");
        GLES20.glClear(16384);
        checkGLError("glClear");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.programID, "tex_y");
        checkGLError("glGetUniformLocation");
        GLES20.glActiveTexture(33984);
        checkGLError("glActiveTexture");
        GLES20.glBindTexture(3553, this.textureYID);
        checkGLError("glBindTexture textureYID");
        GLES20.glUniform1i(glGetUniformLocation2, 0);
        checkGLError("glUniform1i");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.programID, "tex_u");
        checkGLError("glGetUniformLocation");
        GLES20.glActiveTexture(33985);
        checkGLError("glActiveTexture");
        GLES20.glBindTexture(3553, this.textureUID);
        checkGLError("glBindTexture textureUID");
        GLES20.glUniform1i(glGetUniformLocation3, 1);
        checkGLError("glUniform1i");
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.programID, "tex_v");
        GLES20.glActiveTexture(33986);
        checkGLError("glActiveTexture");
        GLES20.glBindTexture(3553, this.textureVID);
        checkGLError("glBindTexture textureVID");
        GLES20.glUniform1i(glGetUniformLocation4, 2);
        checkGLError("glUniform1i");
        GLES20.glDrawArrays(5, 0, 4);
        checkGLError("glDrawArrays");
        GLES20.glBindFramebuffer(36160, 0);
        checkGLError("glUnBindFramebuffer");
        return this.texturesRGBAID;
    }
}
