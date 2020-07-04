package com.p280ss.avframework.livestreamv2.core;

import android.graphics.Matrix;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.avframework.livestreamv2.IInputAudioStream;
import com.p280ss.avframework.livestreamv2.IInputVideoStream;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p280ss.avframework.livestreamv2.interact.audio.AudioClientFactory;
import com.p280ss.avframework.livestreamv2.interact.callback.DataCallback;
import com.p280ss.avframework.livestreamv2.interact.callback.QualityCallback;
import com.p280ss.avframework.livestreamv2.interact.callback.StateCallback;
import com.p280ss.avframework.livestreamv2.interact.callback.UserCallback;
import com.p280ss.avframework.livestreamv2.interact.controller.AnchorController.StreamMixer;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoOutputFormat;
import com.p280ss.avframework.livestreamv2.interact.video.VideoClientFactory;
import com.p280ss.avframework.opengl.RendererCommon;
import com.p280ss.avframework.utils.AVLog;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.Client */
public abstract class Client implements DataCallback, QualityCallback, StateCallback, UserCallback {
    private static String TAG = "com.ss.avframework.livestreamv2.core.Client";
    protected AudioClientFactory mAudioClientFactory;
    protected InteractConfig mConfig;
    private Listener mDummyListener;
    private Listener mListener;
    protected IInputAudioStream mOutAudioStream;
    protected IInputVideoStream mOutVideoStream;
    protected StreamMixer mStreamMixer;
    protected VideoClientFactory mVideoClientFactory;

    /* renamed from: com.ss.avframework.livestreamv2.core.Client$Listener */
    public interface Listener {
        void onError(Client client, int i, long j, Exception exc);

        void onInfo(Client client, int i, long j, Object... objArr);
    }

    public final InteractConfig getConfig() {
        return this.mConfig;
    }

    public abstract boolean isGuest();

    public void muteAllRemoteAudioStreams(boolean z) {
    }

    public void muteRemoteAudioStream(int i, boolean z) {
    }

    public void onLogMonitor(String str, JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    public void pause() {
    }

    /* access modifiers changed from: protected */
    public void resume() {
    }

    public void switchAudio(boolean z) {
    }

    public void onEndSuccess() {
        this.mListener.onInfo(this, 5, 0, new Object[0]);
    }

    public void onStartSuccess() {
        this.mListener.onInfo(this, 4, 0, new Object[0]);
    }

    public void start() {
        String str = TAG;
        StringBuilder sb = new StringBuilder("start ");
        sb.append(this);
        AVLog.ioi(str, sb.toString());
        if (this.mOutVideoStream != null) {
            this.mOutVideoStream.start();
        }
        if (this.mOutAudioStream != null) {
            this.mOutAudioStream.start();
        }
    }

    public synchronized void stop() {
        String str = TAG;
        StringBuilder sb = new StringBuilder("stop ");
        sb.append(this);
        AVLog.ioi(str, sb.toString());
        if (this.mOutVideoStream != null) {
            this.mOutVideoStream.stop();
        }
        if (this.mOutAudioStream != null) {
            this.mOutAudioStream.stop();
        }
    }

    public synchronized void dispose() {
        String str = TAG;
        StringBuilder sb = new StringBuilder("dispose ");
        sb.append(this);
        AVLog.ioi(str, sb.toString());
        if (this.mOutVideoStream != null) {
            this.mOutVideoStream.release();
        }
        if (this.mOutAudioStream != null) {
            this.mOutAudioStream.release();
        }
        this.mOutVideoStream = null;
        this.mOutAudioStream = null;
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder("~Dtor interact client ");
        sb2.append(this);
        AVLog.m143696d(str2, sb2.toString());
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    public void onStreamDelay(int i) {
        this.mListener.onInfo(this, 1, (long) i, new Object[0]);
    }

    public void onFirstRemoteAudioFrame(int i) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("onFirstRemoteAudioFrame ");
        sb.append(i);
        AVLog.ioi(str, sb.toString());
        this.mListener.onInfo(this, 10, (long) i, new Object[0]);
    }

    public void onUserJoined(int i) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("onUserJoined ");
        sb.append(i);
        AVLog.ioi(str, sb.toString());
        this.mListener.onInfo(this, 7, (long) i, new Object[0]);
    }

    public void onUserLeaved(int i) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("onUserLeaved ");
        sb.append(i);
        AVLog.ioi(str, sb.toString());
        this.mListener.onInfo(this, 8, (long) i, new Object[0]);
    }

    public void onError(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onError ");
        sb.append(str);
        AVLog.ioe(str2, sb.toString());
        this.mListener.onError(this, 14, 0, new Exception(str));
    }

    public void onWarn(String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onWarn ");
        sb.append(str);
        AVLog.iow(str2, sb.toString());
        this.mListener.onInfo(this, 6, 0, str);
    }

    public void onPushStreamQuality(long j, long j2) {
        this.mListener.onInfo(this, 2, j, Long.valueOf(j2));
    }

    public void onTalkStateUpdated(String[] strArr, boolean[] zArr) {
        this.mListener.onInfo(this, 9, 0, strArr, zArr);
    }

    public void onEndFailed(int i, String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onEndFailed code ");
        sb.append(i);
        sb.append(" msg: ");
        sb.append(str);
        AVLog.ioe(str2, sb.toString());
        this.mListener.onError(this, 13, (long) i, new Exception(str));
    }

    public void onFirstRemoteVideoFrame(int i, SurfaceView surfaceView) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("onFirstRemoteVideoFrame ");
        sb.append(i);
        AVLog.ioi(str, sb.toString());
        this.mListener.onInfo(this, 11, (long) i, surfaceView);
    }

    public void onStartFailed(int i, String str) {
        String str2 = TAG;
        StringBuilder sb = new StringBuilder("onStartFailed code ");
        sb.append(i);
        sb.append(" msg: ");
        sb.append(str);
        AVLog.ioe(str2, sb.toString());
        this.mListener.onError(this, 12, (long) i, new Exception(str));
    }

    public Client(InteractConfig interactConfig, VideoClientFactory videoClientFactory, AudioClientFactory audioClientFactory, IInputAudioStream iInputAudioStream, IInputVideoStream iInputVideoStream) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("Ctor interact client ");
        sb.append(this);
        AVLog.m143696d(str, sb.toString());
        this.mConfig = interactConfig;
        this.mVideoClientFactory = videoClientFactory;
        this.mAudioClientFactory = audioClientFactory;
        this.mOutAudioStream = iInputAudioStream;
        this.mOutVideoStream = iInputVideoStream;
        C455781 r4 = new Listener() {
            public void onError(Client client, int i, long j, Exception exc) {
            }

            public void onInfo(Client client, int i, long j, Object... objArr) {
            }
        };
        this.mDummyListener = r4;
        this.mListener = r4;
    }

    public void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        byteBuffer.position(0);
        IInputAudioStream iInputAudioStream = this.mOutAudioStream;
        if (iInputAudioStream != null) {
            AVLog.logToIODevice2(4, TAG, "onPlaybackAudioFrame", null, "Client.java:onPlaybackAudioFrame", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
            iInputAudioStream.pushAudioFrame(byteBuffer, i2, i3, 16, i * i3, j * 1000);
        }
    }

    public void onReceiveVideoBufferFrame(int i, ByteBuffer byteBuffer, VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, long j) {
        IInputVideoStream iInputVideoStream = this.mOutVideoStream;
        if (iInputVideoStream != null) {
            String str = TAG;
            StringBuilder sb = new StringBuilder("onReceiveVideoBufferFrame from interact id ");
            sb.append(i);
            AVLog.logToIODevice2(4, str, sb.toString(), null, "Client.java:onReceiveVideoBufferFrame", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
            iInputVideoStream.pushVideoFrame(byteBuffer, i2, i3, 0, j * 1000);
        }
    }

    public void onReceiveTextureFrame(int i, int i2, VideoOutputFormat videoOutputFormat, int i3, int i4, int i5, long j, float[] fArr) {
        IInputVideoStream iInputVideoStream = this.mOutVideoStream;
        if (iInputVideoStream != null) {
            String str = TAG;
            StringBuilder sb = new StringBuilder("onReceiveTextureFrame from interact id ");
            int i6 = i;
            sb.append(i);
            AVLog.logToIODevice2(4, str, sb.toString(), null, "Client.java:onReceiveTextureFrame", VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
            Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
            convertMatrixToAndroidGraphicsMatrix.preTranslate(0.5f, 0.5f);
            convertMatrixToAndroidGraphicsMatrix.preRotate((float) (i5 + NormalGiftView.ALPHA_180));
            convertMatrixToAndroidGraphicsMatrix.preScale(-1.0f, 1.0f);
            convertMatrixToAndroidGraphicsMatrix.preTranslate(-0.5f, -0.5f);
            iInputVideoStream.pushVideoFrame(i2, false, i3, i4, 0, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix), j * 1000);
        }
    }
}
