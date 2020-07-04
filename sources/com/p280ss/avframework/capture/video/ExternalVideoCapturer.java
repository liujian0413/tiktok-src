package com.p280ss.avframework.capture.video;

import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.avframework.buffer.JavaI420Buffer;
import com.p280ss.avframework.buffer.TextureBufferImpl;
import com.p280ss.avframework.buffer.TextureBufferImpl.ToI420Interface;
import com.p280ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p280ss.avframework.buffer.VideoFrame.stRoiInfo;
import com.p280ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver;
import com.p280ss.avframework.opengl.GlUtil;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.opengl.YuvConverter;
import com.p280ss.avframework.utils.AVLog;
import com.p280ss.avframework.utils.ThreadUtils;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.capture.video.ExternalVideoCapturer */
public class ExternalVideoCapturer extends VideoCapturer implements ToI420Interface {
    protected boolean mBufferAlreadyReturn = true;
    protected int mFps;
    public Handler mHandler;
    protected boolean mHorizontalMirror;
    public int mOutHeight;
    public int mOutWidth;
    public boolean mSigBufferMode;
    protected int mStatus;
    protected boolean mVerticalMirror;
    private VideoCapturerObserver mVideoCapturerObserver;
    public YuvConverter mYuvConverter;

    public int status() {
        return this.mStatus;
    }

    /* access modifiers changed from: protected */
    public void returnTexture() {
        this.mBufferAlreadyReturn = true;
        if (this.mStatus != 1) {
            stop();
        }
    }

    public void stop() {
        this.mStatus = 2;
        this.mVideoCapturerObserver.onVideoCapturerStoped();
    }

    public synchronized void release() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                ExternalVideoCapturer.this.mStatus = 2;
                ExternalVideoCapturer.this.mYuvConverter.release();
                ExternalVideoCapturer.this.mYuvConverter = null;
            }
        });
        super.release();
    }

    public void enableSigalMode(boolean z) {
        this.mSigBufferMode = z;
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mHorizontalMirror;
        }
        return this.mVerticalMirror;
    }

    public I420Buffer toI420(final TextureBuffer textureBuffer) {
        final I420Buffer[] i420BufferArr = {null};
        if (this.mStatus != 1) {
            AVLog.m143697e("ExternalVideoCapturer", "VideoCapturer already release.");
            boolean nativeIsOpenGlThread = GlUtil.nativeIsOpenGlThread();
            if (!nativeIsOpenGlThread) {
                GlUtil.nativeAttachThreadToOpenGl();
            }
            YuvConverter yuvConverter = new YuvConverter();
            i420BufferArr[0] = yuvConverter.convert(textureBuffer);
            yuvConverter.release();
            if (!nativeIsOpenGlThread) {
                GlUtil.nativeDetachThreadToOpenGl();
            }
            return i420BufferArr[0];
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (ExternalVideoCapturer.this.mYuvConverter != null) {
                    i420BufferArr[0] = ExternalVideoCapturer.this.mYuvConverter.convert(textureBuffer);
                }
            }
        });
        return i420BufferArr[0];
    }

    public void enableMirror(boolean z, boolean z2) {
        if (z2) {
            this.mHorizontalMirror = z;
        } else {
            this.mVerticalMirror = z;
        }
    }

    public ExternalVideoCapturer(VideoCapturerObserver videoCapturerObserver, Handler handler) {
        this.mVideoCapturerObserver = videoCapturerObserver;
        this.mHandler = handler;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                ExternalVideoCapturer.this.mYuvConverter = new YuvConverter();
            }
        });
    }

    public void start(int i, int i2, int i3) {
        this.mOutHeight = i2;
        this.mOutWidth = i;
        this.mFps = i3;
        this.mStatus = 1;
        this.mVideoCapturerObserver.onVideoCapturerStarted();
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        final ByteBuffer byteBuffer2 = byteBuffer;
        final JavaI420Buffer[] javaI420BufferArr = {null};
        final int i4 = (i + 1) / 2;
        int i5 = (i * i2) + 0;
        int i6 = ((i2 + 1) / 2) * i4;
        int i7 = i5 + i6;
        byteBuffer2.position(0);
        byteBuffer2.limit(i5);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer2.position(i5);
        byteBuffer2.limit(i7);
        ByteBuffer slice2 = byteBuffer.slice();
        byteBuffer2.position(i7);
        byteBuffer2.limit(i7 + i6);
        ByteBuffer slice3 = byteBuffer.slice();
        final int[] iArr = {0};
        Handler handler = this.mHandler;
        final int i8 = i;
        final int i9 = i2;
        final ByteBuffer byteBuffer3 = slice;
        final ByteBuffer byteBuffer4 = slice2;
        final ByteBuffer byteBuffer5 = slice3;
        final long j2 = j;
        C454763 r0 = new Runnable() {
            public void run() {
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    iArr[0] = -1;
                } else if (ExternalVideoCapturer.this.mBufferAlreadyReturn || !ExternalVideoCapturer.this.mSigBufferMode) {
                    if (byteBuffer2.isDirect()) {
                        javaI420BufferArr[0] = JavaI420Buffer.wrap(i8, i9, byteBuffer3, i8, byteBuffer4, i4, byteBuffer5, i4, new Runnable() {
                            public void run() {
                                ExternalVideoCapturer.this.mBufferAlreadyReturn = true;
                            }
                        });
                    } else {
                        javaI420BufferArr[0] = JavaI420Buffer.allocate(i8, i9);
                        javaI420BufferArr[0].getDataY().put(byteBuffer3);
                        javaI420BufferArr[0].getDataU().put(byteBuffer4);
                        javaI420BufferArr[0].getDataV().put(byteBuffer5);
                    }
                    if (javaI420BufferArr[0] != null) {
                        ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                        iArr[0] = ExternalVideoCapturer.this.onFrame(javaI420BufferArr[0], i8, i9, 0, j2);
                        javaI420BufferArr[0].release();
                    }
                } else {
                    iArr[0] = -1;
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r0);
        return -1;
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, Matrix matrix, long j, Bundle bundle) {
        int[] iArr = {0};
        Handler handler = this.mHandler;
        final int[] iArr2 = iArr;
        final Bundle bundle2 = bundle;
        final boolean z2 = z;
        final int i4 = i2;
        final int i5 = i3;
        final int i6 = i;
        final Matrix matrix2 = matrix;
        C454784 r13 = r1;
        final long j2 = j;
        C454784 r1 = new Runnable() {
            public void run() {
                Type type;
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    StringBuilder sb = new StringBuilder("mStatus ");
                    sb.append(ExternalVideoCapturer.this.mStatus);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder("ExternalVideoCapturer pushVideoFrame texture return: ");
                    sb3.append(sb2);
                    String sb4 = sb3.toString();
                    StringBuilder sb5 = new StringBuilder("ExternalVideoCapturer.java:pushVideoFrame1: ");
                    sb5.append(sb2);
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", sb4, null, sb5.toString(), VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                    iArr2[0] = -1;
                } else if (ExternalVideoCapturer.this.mBufferAlreadyReturn || !ExternalVideoCapturer.this.mSigBufferMode) {
                    stRoiInfo stroiinfo = null;
                    if (bundle2 != null) {
                        stroiinfo = new stRoiInfo(((Integer) bundle2.get("roi_center_pos_x")).intValue(), ((Integer) bundle2.get("roi_center_pos_y")).intValue(), ((Integer) bundle2.get("roi_width")).intValue(), ((Integer) bundle2.get("roi_height")).intValue(), ((Float) bundle2.get("roi_yaw")).floatValue(), ((Float) bundle2.get("roi_pitch")).floatValue(), ((Float) bundle2.get("roi_roll")).floatValue());
                    }
                    if (z2) {
                        type = Type.OES;
                    } else {
                        type = Type.RGB;
                    }
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i4, i5, type, i6, matrix2, this, (Runnable) new Runnable() {
                        public void run() {
                            ExternalVideoCapturer.this.mHandler.post(new Runnable() {
                                public void run() {
                                    ExternalVideoCapturer.this.returnTexture();
                                }
                            });
                        }
                    });
                    textureBufferImpl.setROIInfo(stroiinfo);
                    ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                    iArr2[0] = ExternalVideoCapturer.this.onFrame(textureBufferImpl, i4, i5, 0, j2);
                    textureBufferImpl.release();
                } else {
                    StringBuilder sb6 = new StringBuilder("!mBufferAlreadyReturn ");
                    sb6.append(true ^ ExternalVideoCapturer.this.mBufferAlreadyReturn);
                    sb6.append(", mSigBufferMode ");
                    sb6.append(ExternalVideoCapturer.this.mSigBufferMode);
                    String sb7 = sb6.toString();
                    StringBuilder sb8 = new StringBuilder("ExternalVideoCapturer pushVideoFrame texture return: ");
                    sb8.append(sb7);
                    String sb9 = sb8.toString();
                    StringBuilder sb10 = new StringBuilder("ExternalVideoCapturer.java:pushVideoFrame2: ");
                    sb10.append(sb7);
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", sb9, null, sb10.toString(), VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                    iArr2[0] = -2;
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r13);
        return iArr[0];
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        int[] iArr = {0};
        final int[] iArr2 = iArr;
        final float[] fArr2 = fArr;
        final int i5 = i4;
        final int i6 = i2;
        final int i7 = i3;
        final Bundle bundle2 = bundle;
        final boolean z2 = z;
        final int i8 = i;
        Handler handler = this.mHandler;
        C454815 r15 = r1;
        final long j2 = j;
        C454815 r1 = new Runnable() {
            public void run() {
                Matrix matrix;
                float f;
                stRoiInfo stroiinfo;
                Type type;
                if (ExternalVideoCapturer.this.mStatus != 1) {
                    StringBuilder sb = new StringBuilder("mStatus ");
                    sb.append(ExternalVideoCapturer.this.mStatus);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder("ExternalVideoCapturer pushVideoFrame texture return: ");
                    sb3.append(sb2);
                    String sb4 = sb3.toString();
                    StringBuilder sb5 = new StringBuilder("ExternalVideoCapturer.java:pushVideoFrame1: ");
                    sb5.append(sb2);
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", sb4, null, sb5.toString(), VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                    iArr2[0] = -1;
                } else if (ExternalVideoCapturer.this.mBufferAlreadyReturn || !ExternalVideoCapturer.this.mSigBufferMode) {
                    if (fArr2 != null) {
                        matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr2);
                    } else {
                        matrix = null;
                    }
                    int i = i5;
                    Matrix matrix2 = new Matrix();
                    matrix2.reset();
                    int i2 = i6;
                    int i3 = i7;
                    if (i % NormalGiftView.ALPHA_180 != 0) {
                        i2 = i7;
                        i3 = i6;
                    }
                    int i4 = i2;
                    int i5 = i3;
                    matrix2.preTranslate(0.5f, 0.5f);
                    matrix2.preRotate((float) (-i));
                    float f2 = 1.0f;
                    if (ExternalVideoCapturer.this.mHorizontalMirror) {
                        f = -1.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (ExternalVideoCapturer.this.mVerticalMirror) {
                        f2 = -1.0f;
                    }
                    matrix2.preScale(f, f2);
                    matrix2.preTranslate(-0.5f, -0.5f);
                    if (matrix != null) {
                        matrix2.preConcat(matrix);
                    }
                    if (bundle2 != null) {
                        stroiinfo = new stRoiInfo(((Integer) bundle2.get("roi_center_pos_x")).intValue(), ((Integer) bundle2.get("roi_center_pos_y")).intValue(), ((Integer) bundle2.get("roi_width")).intValue(), ((Integer) bundle2.get("roi_height")).intValue(), ((Float) bundle2.get("roi_yaw")).floatValue(), ((Float) bundle2.get("roi_pitch")).floatValue(), ((Float) bundle2.get("roi_roll")).floatValue());
                    } else {
                        stroiinfo = null;
                    }
                    if (z2) {
                        type = Type.OES;
                    } else {
                        type = Type.RGB;
                    }
                    TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i4, i5, type, i8, matrix2, this, (Runnable) new Runnable() {
                        public void run() {
                            ExternalVideoCapturer.this.mHandler.post(new Runnable() {
                                public void run() {
                                    ExternalVideoCapturer.this.returnTexture();
                                }
                            });
                        }
                    });
                    textureBufferImpl.setROIInfo(stroiinfo);
                    ExternalVideoCapturer.this.mBufferAlreadyReturn = false;
                    iArr2[0] = ExternalVideoCapturer.this.onFrame(textureBufferImpl, i4, i5, 0, j2);
                    textureBufferImpl.release();
                } else {
                    StringBuilder sb6 = new StringBuilder("!mBufferAlreadyReturn ");
                    sb6.append(true ^ ExternalVideoCapturer.this.mBufferAlreadyReturn);
                    sb6.append(", mSigBufferMode ");
                    sb6.append(ExternalVideoCapturer.this.mSigBufferMode);
                    String sb7 = sb6.toString();
                    StringBuilder sb8 = new StringBuilder("ExternalVideoCapturer pushVideoFrame texture return: ");
                    sb8.append(sb7);
                    String sb9 = sb8.toString();
                    StringBuilder sb10 = new StringBuilder("ExternalVideoCapturer.java:pushVideoFrame2: ");
                    sb10.append(sb7);
                    AVLog.logToIODevice2(5, "ExternalVideoCapturer", sb9, null, sb10.toString(), VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                    iArr2[0] = -2;
                }
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r15);
        return iArr[0];
    }
}
