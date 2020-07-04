package com.p280ss.android.ttve.mediacodec;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.p280ss.android.ttve.common.C20443a;
import com.p280ss.android.ttve.common.C20446d;
import com.p280ss.android.ttve.common.C20451h;
import com.p280ss.android.ttve.common.C20453j;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p280ss.android.vesdk.C45251ab;
import com.p280ss.android.vesdk.C45372t;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder */
public class TEMediaCodecDecoder implements OnFrameAvailableListener {
    private static final int ERROR_EOF = -1;
    private static final int ERROR_FAIL = -2;
    private static final int ERROR_OK = 0;
    private static final int ERROR_UNUSUAL = -3;
    private static final String TAG = "TEMediaCodecDecoder";
    private static final String VIDEO_MIME_TYPE = "video/avc";
    private static String mPlatform;
    private static String mVersion;
    private static final boolean m_verbose = false;
    private final int MAX_DELAY_COUNT = 10;
    private final long MAX_SLEEP_MS = 0;
    private boolean m_bIsNeedReconfigure;
    private BufferInfo m_bufferInfo = new BufferInfo();
    private MediaCodec m_decoder = null;
    private boolean m_decoderStarted = false;
    private C20446d m_eglStateSaver = null;
    private ByteBuffer m_extraDataBuf;
    private MediaFormat m_format;
    private boolean m_frameAvailable = false;
    private final Object m_frameSyncObject = new Object();
    private HandlerThread m_handleThread = new HandlerThread("mediacodec_callback");
    private Handler m_handler;
    private int m_iCurCount = 0;
    private int m_iHeight;
    private int m_iOutputHeight;
    private int m_iOutputWidth;
    private int m_iWidth;
    private boolean m_inputBufferQueued = false;
    private int m_pendingInputFrameCount = 0;
    private ByteBuffer m_ppsBuf;
    private boolean m_sawInputEOS = false;
    private boolean m_sawOutputEOS = false;
    private C20451h m_sharedContext = null;
    private ByteBuffer m_spsBuf;
    private Surface m_surface;
    private int[] m_surfaceTexID = new int[1];
    private SurfaceTexture m_surfaceTexture;
    private C20453j m_textureDrawer = null;
    private C20458a m_textureRender = null;
    private long m_timestampOfCurTexFrame = Long.MIN_VALUE;
    private long m_timestampOfLastDecodedFrame = Long.MIN_VALUE;

    /* renamed from: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$a */
    static class C20458a {

        /* renamed from: a */
        private final float[] f55255a = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

        /* renamed from: b */
        private FloatBuffer f55256b = ByteBuffer.allocateDirect(this.f55255a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();

        /* renamed from: c */
        private float[] f55257c = new float[16];

        /* renamed from: d */
        private float[] f55258d = new float[16];

        /* renamed from: e */
        private int f55259e;

        /* renamed from: f */
        private int f55260f;

        /* renamed from: g */
        private int f55261g;

        /* renamed from: h */
        private int f55262h;

        /* renamed from: i */
        private int f55263i;

        /* renamed from: j */
        private int[] f55264j = new int[1];

        /* renamed from: b */
        public final void mo55089b() {
            if (this.f55259e != 0) {
                GLES20.glDeleteProgram(this.f55259e);
                this.f55259e = 0;
            }
            if (this.f55264j[0] != 0) {
                GLES20.glDeleteFramebuffers(1, this.f55264j, 0);
            }
        }

        /* renamed from: a */
        public final void mo55086a() {
            this.f55259e = m67880a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
            if (this.f55259e != 0) {
                this.f55262h = GLES20.glGetAttribLocation(this.f55259e, "aPosition");
                m67881a("glGetAttribLocation aPosition");
                if (this.f55262h != -1) {
                    this.f55263i = GLES20.glGetAttribLocation(this.f55259e, "aTextureCoord");
                    m67881a("glGetAttribLocation aTextureCoord");
                    if (this.f55263i != -1) {
                        this.f55260f = GLES20.glGetUniformLocation(this.f55259e, "uMVPMatrix");
                        m67881a("glGetUniformLocation uMVPMatrix");
                        if (this.f55260f != -1) {
                            this.f55261g = GLES20.glGetUniformLocation(this.f55259e, "uSTMatrix");
                            m67881a("glGetUniformLocation uSTMatrix");
                            if (this.f55261g != -1) {
                                GLES20.glGenFramebuffers(1, this.f55264j, 0);
                                m67881a("glGenFramebuffers");
                                return;
                            }
                            throw new RuntimeException("Could not get attrib location for uSTMatrix");
                        }
                        throw new RuntimeException("Could not get attrib location for uMVPMatrix");
                    }
                    throw new RuntimeException("Could not get attrib location for aTextureCoord");
                }
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
            throw new RuntimeException("failed creating program");
        }

        /* renamed from: a */
        private static void m67881a(String str) {
            do {
            } while (GLES20.glGetError() != 0);
        }

        public C20458a(SurfaceTexture surfaceTexture) {
            this.f55256b.put(this.f55255a).position(0);
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.f55258d);
            } else {
                Matrix.setIdentityM(this.f55258d, 0);
            }
        }

        /* renamed from: a */
        private int m67879a(int i, String str) {
            int glCreateShader = GLES20.glCreateShader(i);
            StringBuilder sb = new StringBuilder("glCreateShader type=");
            sb.append(i);
            m67881a(sb.toString());
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }

        /* renamed from: a */
        private int m67880a(String str, String str2) {
            int a = m67879a(35633, str);
            int i = 0;
            if (a == 0) {
                return 0;
            }
            int a2 = m67879a(35632, str2);
            if (a2 == 0) {
                return 0;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            m67881a("glCreateProgram");
            GLES20.glAttachShader(glCreateProgram, a);
            m67881a("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, a2);
            m67881a("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i = glCreateProgram;
            }
            return i;
        }

        /* renamed from: a */
        public final void mo55087a(int i, int i2, int i3, int i4) throws IOException {
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glBindTexture(3553, i4);
            m67881a("glBindTexture");
            GLES20.glBindFramebuffer(36160, this.f55264j[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i4, 0);
            m67881a("glFramebufferTexture2D");
            m67881a("onDrawFrame start");
            GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f55259e);
            m67881a("glUseProgram");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i3);
            m67881a("glBindTexture");
            this.f55256b.position(0);
            GLES20.glVertexAttribPointer(this.f55262h, 3, 5126, false, 20, this.f55256b);
            m67881a("glVertexAttribPointer maPosition");
            GLES20.glEnableVertexAttribArray(this.f55262h);
            m67881a("glEnableVertexAttribArray maPositionHandle");
            this.f55256b.position(3);
            GLES20.glVertexAttribPointer(this.f55263i, 2, 5126, false, 20, this.f55256b);
            m67881a("glVertexAttribPointer maTextureHandle");
            GLES20.glEnableVertexAttribArray(this.f55263i);
            m67881a("glEnableVertexAttribArray maTextureHandle");
            Matrix.setIdentityM(this.f55257c, 0);
            GLES20.glUniformMatrix4fv(this.f55260f, 1, false, this.f55257c, 0);
            GLES20.glUniformMatrix4fv(this.f55261g, 1, false, this.f55258d, 0);
            GLES20.glDrawArrays(5, 0, 4);
            m67881a("glDrawArrays");
            GLES20.glDisableVertexAttribArray(this.f55262h);
            GLES20.glDisableVertexAttribArray(this.f55263i);
            GLES20.glBindTexture(36197, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glFinish();
        }

        /* renamed from: a */
        public final void mo55088a(int i, int i2, int i3, int i4, int i5, int i6) {
            if (i > 0 && i2 > 0 && i4 >= i3 && i6 >= i5 && i6 <= i && i4 <= i2) {
                float f = (float) i;
                float f2 = (((float) i5) * 1.0f) / f;
                this.f55255a[3] = f2;
                float f3 = (float) i2;
                float f4 = (((float) i3) * 1.0f) / f3;
                this.f55255a[4] = f4;
                float f5 = (((float) i6) * 1.0f) / f;
                this.f55255a[8] = f5;
                this.f55255a[9] = f4;
                this.f55255a[13] = f2;
                float f6 = (((float) i4) * 1.0f) / f3;
                this.f55255a[14] = f6;
                this.f55255a[18] = f5;
                this.f55255a[19] = f6;
                this.f55256b.clear();
                this.f55256b.put(this.f55255a).position(0);
            }
        }
    }

    private boolean IsValid() {
        if (this.m_decoder != null) {
            return true;
        }
        return false;
    }

    private int restartDecoder() {
        stopDecoder();
        return startDecoder();
    }

    private boolean AwaitNewImage() {
        synchronized (this.m_frameSyncObject) {
            do {
                if (!this.m_frameAvailable) {
                    try {
                        this.m_frameSyncObject.wait(500);
                    } catch (InterruptedException unused) {
                        return false;
                    }
                } else {
                    this.m_frameAvailable = false;
                    return true;
                }
            } while (this.m_frameAvailable);
            return false;
        }
    }

    private void deleteTexture() {
        if (this.m_surfaceTexID[0] != 0) {
            GLES20.glDeleteTextures(1, this.m_surfaceTexID, 0);
            this.m_surfaceTexID[0] = 0;
        }
    }

    public int closeEncoder() {
        stopDecoder();
        if (this.m_textureDrawer != null) {
            this.m_textureDrawer.mo55059b();
            this.m_textureDrawer = null;
        }
        deleteTexture();
        return 0;
    }

    public static boolean IsInAndriodHardwareBlacklist() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str.compareTo("Meizu") == 0 && str2.compareTo("m2") == 0) {
            return true;
        }
        if (str.compareTo("Xiaomi") == 0 && str2.compareTo("MI 4W") == 0) {
            return true;
        }
        return false;
    }

    public static boolean IsInAndriodHardwareWhitelist() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str.compareTo("samsung") == 0 && str2.compareTo("GT-I9152") == 0) {
            return true;
        }
        if (str.compareTo("HUAWEI") == 0 && str2.compareTo("HUAWEI P6-C00") == 0) {
            return true;
        }
        return false;
    }

    private int createTexture() {
        GLES20.glGenTextures(1, this.m_surfaceTexID, 0);
        if (this.m_surfaceTexID[0] <= 0) {
            return 0;
        }
        GLES20.glBindTexture(36197, this.m_surfaceTexID[0]);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return this.m_surfaceTexID[0];
    }

    public static int getMaxMediaCodecVideoDecoderCount() {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21(VIDEO_MIME_TYPE);
        if (mediaCodecInfo21 == null) {
            C45372t.m143409d(TAG, "MediaCodecInfo is null!");
            return -2;
        }
        int maxSupportedInstances = mediaCodecInfo21.getCapabilitiesForType(VIDEO_MIME_TYPE).getMaxSupportedInstances();
        String str = TAG;
        StringBuilder sb = new StringBuilder("getMaxMediaCodecVideoDecoderCount ");
        sb.append(maxSupportedInstances);
        C45372t.m143403a(str, sb.toString());
        return maxSupportedInstances;
    }

    private int stopDecoder() {
        CleanupDecoder();
        this.m_handleThread.quit();
        if (this.m_textureRender != null) {
            this.m_textureRender.mo55089b();
            this.m_textureRender = null;
        }
        if (this.m_surface != null) {
            this.m_surface.release();
            this.m_surface = null;
        }
        if (this.m_surfaceTexture != null) {
            this.m_surfaceTexture.setOnFrameAvailableListener(null);
            this.m_surfaceTexture.release();
            this.m_surfaceTexture = null;
        }
        return 0;
    }

    public void CleanupDecoder() {
        if (this.m_decoder != null) {
            if (this.m_decoderStarted) {
                try {
                    if (this.m_inputBufferQueued) {
                        this.m_decoder.flush();
                        this.m_inputBufferQueued = false;
                    }
                    this.m_decoder.stop();
                } catch (Exception unused) {
                }
                this.m_decoderStarted = false;
            }
            this.m_decoder.release();
            this.m_decoder = null;
        }
        this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
        this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
        this.m_pendingInputFrameCount = 0;
        this.m_sawInputEOS = false;
        this.m_sawOutputEOS = false;
    }

    public int flushDecoder() {
        if (this.m_decoder != null) {
            try {
                if (!this.m_sawInputEOS) {
                    if (!this.m_sawOutputEOS) {
                        if (this.m_inputBufferQueued) {
                            this.m_decoder.flush();
                            this.m_inputBufferQueued = false;
                            this.m_pendingInputFrameCount = 0;
                            return 0;
                        }
                    }
                }
                CleanupDecoder();
                if (!SetupDecoder(VIDEO_MIME_TYPE)) {
                    return -2;
                }
                return 0;
            } catch (Exception unused) {
            }
        }
        return -3;
    }

    public boolean initTextureDrawer() {
        if (this.m_textureDrawer != null) {
            this.m_textureDrawer.mo55059b();
            this.m_textureDrawer = null;
        }
        this.m_textureDrawer = C20453j.m67857a();
        if (this.m_textureDrawer == null) {
            return false;
        }
        this.m_textureDrawer.mo55056a(0.0f);
        this.m_textureDrawer.mo55057a(1.0f, -1.0f);
        return true;
    }

    private int startDecoder() {
        if (IsValid()) {
            return -1;
        }
        if (C45251ab.f116419c) {
            tryGetPlatformAndVersion();
        }
        int i = this.m_surfaceTexID[0];
        if (i == 0) {
            i = createTexture();
        }
        if (i == 0) {
            return -1;
        }
        try {
            this.m_surfaceTexture = new SurfaceTexture(i);
            this.m_handleThread.start();
            this.m_handler = new Handler(this.m_handleThread.getLooper());
            this.m_surfaceTexture.setOnFrameAvailableListener(this, this.m_handler);
            this.m_surface = new Surface(this.m_surfaceTexture);
            this.m_textureRender = new C20458a(this.m_surfaceTexture);
            this.m_textureRender.mo55086a();
            if (SetupDecoder(VIDEO_MIME_TYPE)) {
                return 0;
            }
            stopDecoder();
            return -1;
        } catch (Exception unused) {
            stopDecoder();
            return -1;
        }
    }

    private void tryGetPlatformAndVersion() {
        if (mPlatform == null || mVersion == null) {
            String lowerCase = C20443a.m67835a().toLowerCase();
            if (lowerCase.contains("qualcomm")) {
                mPlatform = "qualcomm";
                if (lowerCase.contains("sdm660")) {
                    mVersion = "sdm660";
                } else if (lowerCase.contains("msm8994")) {
                    mVersion = "msm8994";
                } else if (lowerCase.contains("sdm845")) {
                    mVersion = "sdm845";
                } else if (lowerCase.contains("sm8150")) {
                    mVersion = "sm8150";
                } else {
                    mVersion = "";
                }
            }
        }
    }

    private int reconfigureMediaFormat() {
        MediaCodecInfo mediaCodecInfo;
        int i = 0;
        try {
            if (VERSION.SDK_INT >= 21) {
                mediaCodecInfo = getMediaCodecInfo21(VIDEO_MIME_TYPE);
            } else {
                mediaCodecInfo = getMediaCodecInfo(VIDEO_MIME_TYPE);
            }
            if (mediaCodecInfo == null) {
                C45372t.m143409d(TAG, "MediaCodecInfo is null!");
                return -2;
            } else if (!mediaCodecInfo.getCapabilitiesForType(VIDEO_MIME_TYPE).getVideoCapabilities().isSizeSupported(this.m_iWidth, this.m_iHeight)) {
                String str = TAG;
                StringBuilder sb = new StringBuilder("is not size support! width: ");
                sb.append(this.m_iWidth);
                sb.append(" height: ");
                sb.append(this.m_iHeight);
                C45372t.m143409d(str, sb.toString());
                return -3;
            } else {
                this.m_format = MediaFormat.createVideoFormat(VIDEO_MIME_TYPE, this.m_iWidth, this.m_iHeight);
                if (this.m_spsBuf != null) {
                    this.m_format.setByteBuffer("csd-0", this.m_spsBuf);
                }
                if (this.m_ppsBuf != null) {
                    this.m_format.setByteBuffer("csd-1", this.m_ppsBuf);
                }
                if (VERSION.SDK_INT == 16) {
                    this.m_format.setInteger("max-input-size", 0);
                }
                if (C45251ab.f116419c) {
                    int a = (((C20443a.m67834a(mVersion) * this.m_iOutputWidth) * this.m_iOutputHeight) / this.m_iWidth) / this.m_iHeight;
                    if (a > 0) {
                        this.m_format.setInteger("operating-rate", a);
                    }
                }
                return i;
            }
        } catch (Exception unused) {
            i = -1;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.m_frameSyncObject) {
            this.m_frameAvailable = true;
            this.m_frameSyncObject.notifyAll();
        }
    }

    private boolean SetupDecoder(String str) {
        try {
            this.m_decoder = MediaCodec.createDecoderByType(str);
            this.m_decoder.configure(this.m_format, this.m_surface, null, 0);
            this.m_decoder.start();
            this.m_decoderStarted = true;
            this.m_iCurCount = 0;
            return true;
        } catch (Exception unused) {
            CleanupDecoder();
            return false;
        }
    }

    private ByteBuffer getInputBufferByIdx(int i) {
        if (VERSION.SDK_INT >= 21) {
            return this.m_decoder.getInputBuffer(i);
        }
        return this.m_decoder.getInputBuffers()[i];
    }

    private static MediaCodecInfo getMediaCodecInfo(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private static MediaCodecInfo getMediaCodecInfo21(String str) {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null || codecInfos.length == 0) {
            return null;
        }
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                            return mediaCodecInfo;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public int getInfoByFlag(int[] iArr, int i) {
        if (i == 1) {
            iArr[0] = (int) (this.m_timestampOfLastDecodedFrame & -1);
            iArr[1] = (int) (-1 & (this.m_timestampOfLastDecodedFrame >> 32));
            return 2;
        } else if (i != 2) {
            return 0;
        } else {
            iArr[0] = (int) (this.m_timestampOfCurTexFrame & -1);
            iArr[1] = (int) (-1 & (this.m_timestampOfCurTexFrame >> 32));
            return 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x006c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int DecodeFrame2Surface(byte[] r18, int r19, long r20) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r4 = r19
            boolean r1 = r0.m_sawInputEOS
            r8 = 0
            r9 = 1
            if (r1 != 0) goto L_0x005a
            android.media.MediaCodec r1 = r0.m_decoder
            r2 = 30000(0x7530, double:1.4822E-319)
            int r1 = r1.dequeueInputBuffer(r2)
            r5 = 0
        L_0x0013:
            if (r1 >= 0) goto L_0x0025
            r6 = 5
            java.lang.Thread.sleep(r6, r8)     // Catch:{ InterruptedException -> 0x001a }
        L_0x001a:
            android.media.MediaCodec r1 = r0.m_decoder
            int r1 = r1.dequeueInputBuffer(r2)
            int r5 = r5 + r9
            r6 = 20
            if (r5 < r6) goto L_0x0013
        L_0x0025:
            r11 = r1
            if (r11 < 0) goto L_0x0058
            java.nio.ByteBuffer r1 = r0.getInputBufferByIdx(r11)
            if (r4 != 0) goto L_0x003c
            android.media.MediaCodec r10 = r0.m_decoder
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 4
            r10.queueInputBuffer(r11, r12, r13, r14, r16)
            r0.m_sawInputEOS = r9
            goto L_0x005a
        L_0x003c:
            r1.clear()
            r2 = r18
            r1.put(r2, r8, r4)
            android.media.MediaCodec r1 = r0.m_decoder
            r3 = 0
            r7 = 0
            r2 = r11
            r4 = r19
            r5 = r20
            r1.queueInputBuffer(r2, r3, r4, r5, r7)
            r0.m_inputBufferQueued = r9
            int r1 = r0.m_pendingInputFrameCount
            int r1 = r1 + r9
            r0.m_pendingInputFrameCount = r1
            goto L_0x005a
        L_0x0058:
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            boolean r2 = r0.m_sawOutputEOS
            if (r2 == 0) goto L_0x0063
            r2 = 600000(0x927c0, float:8.40779E-40)
            goto L_0x006c
        L_0x0063:
            int r2 = r0.m_pendingInputFrameCount
            r3 = 2
            if (r2 <= r3) goto L_0x006b
            r2 = 30000(0x7530, float:4.2039E-41)
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            android.media.MediaCodec r3 = r0.m_decoder
            android.media.MediaCodec$BufferInfo r4 = r0.m_bufferInfo
            long r5 = (long) r2
            int r3 = r3.dequeueOutputBuffer(r4, r5)
            r4 = -3
            if (r3 == r4) goto L_0x006c
            r5 = -2
            if (r3 != r5) goto L_0x00ab
            android.media.MediaCodec r3 = r0.m_decoder
            android.media.MediaFormat r3 = r3.getOutputFormat()
            java.lang.String r4 = "width"
            int r11 = r3.getInteger(r4)
            java.lang.String r4 = "height"
            int r12 = r3.getInteger(r4)
            java.lang.String r4 = "crop-left"
            int r15 = r3.getInteger(r4)
            java.lang.String r4 = "crop-right"
            int r16 = r3.getInteger(r4)
            java.lang.String r4 = "crop-top"
            int r13 = r3.getInteger(r4)
            java.lang.String r4 = "crop-bottom"
            int r14 = r3.getInteger(r4)
            com.ss.android.ttve.mediacodec.TEMediaCodecDecoder$a r10 = r0.m_textureRender
            r10.mo55088a(r11, r12, r13, r14, r15, r16)
            goto L_0x006c
        L_0x00ab:
            r2 = -1
            if (r3 == r2) goto L_0x00e8
            if (r3 >= 0) goto L_0x00b1
            return r5
        L_0x00b1:
            android.media.MediaCodec$BufferInfo r1 = r0.m_bufferInfo
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00bb
            r0.m_sawOutputEOS = r9
        L_0x00bb:
            boolean r1 = r0.m_sawOutputEOS
            if (r1 != 0) goto L_0x00cb
            android.media.MediaCodec$BufferInfo r1 = r0.m_bufferInfo
            long r6 = r1.presentationTimeUs
            r0.m_timestampOfLastDecodedFrame = r6
            int r1 = r0.m_pendingInputFrameCount
            int r1 = r1 - r9
            r0.m_pendingInputFrameCount = r1
            goto L_0x00cc
        L_0x00cb:
            r9 = 0
        L_0x00cc:
            android.media.MediaCodec r1 = r0.m_decoder
            r1.releaseOutputBuffer(r3, r9)
            if (r9 == 0) goto L_0x00e7
            boolean r1 = r17.AwaitNewImage()
            if (r1 == 0) goto L_0x00e6
            android.media.MediaCodec$BufferInfo r1 = r0.m_bufferInfo
            long r1 = r1.presentationTimeUs
            r0.m_timestampOfCurTexFrame = r1
        L_0x00df:
            int r1 = android.opengl.GLES20.glGetError()
            if (r1 != 0) goto L_0x00df
            return r8
        L_0x00e6:
            return r5
        L_0x00e7:
            return r2
        L_0x00e8:
            if (r1 == 0) goto L_0x00eb
            return r4
        L_0x00eb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttve.mediacodec.TEMediaCodecDecoder.DecodeFrame2Surface(byte[], int, long):int");
    }

    public int decodeFrame(byte[] bArr, int i, long j, int i2, int i3, int i4) throws IOException {
        int i5;
        this.m_iOutputWidth = i3;
        this.m_iOutputHeight = i4;
        if (this.m_eglStateSaver == null) {
            this.m_eglStateSaver = new C20446d();
            this.m_eglStateSaver.mo55040a();
        }
        if (!EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.f55207a)) {
            this.m_bIsNeedReconfigure = true;
        }
        if (this.m_bIsNeedReconfigure) {
            restartDecoder();
            this.m_bIsNeedReconfigure = false;
            this.m_eglStateSaver.mo55040a();
        }
        if (this.m_decoder == null) {
            return -2;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            i5 = DecodeFrame2Surface(bArr, i, j);
        } catch (IllegalStateException unused) {
            i5 = -2;
        }
        long currentTimeMillis2 = 0 - (System.currentTimeMillis() - currentTimeMillis);
        if (this.m_iCurCount < 10 && currentTimeMillis2 > 0) {
            try {
                Thread.sleep(currentTimeMillis2, 0);
            } catch (InterruptedException unused2) {
            }
            this.m_iCurCount++;
        }
        if (i5 == 0) {
            this.m_surfaceTexture.updateTexImage();
            if (this.m_textureRender != null && i2 > 0) {
                this.m_textureRender.mo55087a(this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i2);
            }
        }
        return i5;
    }

    public int initDecoder(int i, int i2, byte[] bArr, int i3, byte[] bArr2, int i4, int i5, int i6) {
        int encoder = setEncoder(i, i2, bArr, i3, bArr2, i4, i5, i6);
        if (this.m_bIsNeedReconfigure) {
            encoder = reconfigureMediaFormat();
        }
        if (encoder != 0) {
            return encoder;
        }
        if (this.m_eglStateSaver == null) {
            this.m_eglStateSaver = new C20446d();
            this.m_eglStateSaver.mo55040a();
        }
        if (this.m_bIsNeedReconfigure) {
            restartDecoder();
            this.m_bIsNeedReconfigure = false;
        }
        return encoder;
    }

    public int setEncoder(int i, int i2, byte[] bArr, int i3, byte[] bArr2, int i4, int i5, int i6) {
        this.m_iWidth = i;
        this.m_iHeight = i2;
        this.m_iOutputWidth = i5;
        this.m_iOutputHeight = i6;
        this.m_spsBuf = null;
        this.m_ppsBuf = null;
        if (i3 > 0) {
            this.m_spsBuf = ByteBuffer.wrap(bArr, 0, i3);
        }
        if (i4 > 0) {
            this.m_ppsBuf = ByteBuffer.wrap(bArr2, 0, i4);
        }
        this.m_bIsNeedReconfigure = true;
        return 0;
    }
}
