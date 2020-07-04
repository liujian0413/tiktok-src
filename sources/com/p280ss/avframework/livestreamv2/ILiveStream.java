package com.p280ss.avframework.livestreamv2;

import android.content.Intent;
import android.os.Bundle;
import com.p280ss.avframework.engine.VideoSink;
import com.p280ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.p280ss.avframework.livestreamv2.filter.IAudioFilterManager;
import com.p280ss.avframework.livestreamv2.filter.IFilterManager;
import com.p280ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.p280ss.optimizer.live.sdk.dns.C45914d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.ILiveStream */
public interface ILiveStream {

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$CatchVideoCallback */
    public interface CatchVideoCallback {
        void onComplete();

        void onError(int i, String str);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$IAudioFrameAvailableListener */
    public interface IAudioFrameAvailableListener {
        void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$ILiveStreamDataListener */
    public interface ILiveStreamDataListener {
        void onData(int i, int i2, int i3);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$ILiveStreamErrorListener */
    public interface ILiveStreamErrorListener {
        void onError(int i, int i2, Exception exc);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$ILiveStreamInfoListener */
    public interface ILiveStreamInfoListener {
        void onInfo(int i, int i2, int i3);
    }

    /* renamed from: com.ss.avframework.livestreamv2.ILiveStream$ITextureFrameAvailableListener */
    public interface ITextureFrameAvailableListener {
        void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr);
    }

    int addSeiField(String str, Object obj, int i);

    boolean audioMute();

    void catchVideo(Bundle bundle, CatchVideoCallback catchVideoCallback);

    IInputAudioStream createInputAudioStream();

    IInputVideoStream createInputVideoStream();

    void enableMirror(boolean z, boolean z2);

    void enableMixer(boolean z, boolean z2);

    IAudioFilterManager getAudioFilterMgr();

    IFilterManager getFilterMgr();

    boolean getLiveStreamInfo(LiveStreamReport liveStreamReport);

    LiveStreamOption getOption();

    IInputAudioStream getOriginInputAudioStream();

    IInputVideoStream getOriginInputVideoStream();

    IRecorderManager getRecorderMgr();

    String getVersion();

    IVideoCapturerControl getVideoCapturerControl();

    IFilterManager getVideoFilterMgr();

    boolean isEnableMixer(boolean z);

    boolean isMirror(boolean z);

    void pause();

    int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j);

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j);

    int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle);

    int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    void release();

    void resume();

    int sendSeiMsg(String str);

    void setAudioFrameAvailableListener(IAudioFrameAvailableListener iAudioFrameAvailableListener);

    void setAudioMute(boolean z);

    void setBackGroundPhotoPath(Object obj);

    void setDataListener(ILiveStreamDataListener iLiveStreamDataListener);

    void setDns(C45914d dVar);

    void setErrorListener(ILiveStreamErrorListener iLiveStreamErrorListener);

    void setInfoListener(ILiveStreamInfoListener iLiveStreamInfoListener);

    void setOption(LiveStreamOption liveStreamOption);

    void setRenderSink(VideoSink videoSink);

    void setScreenIntent(Intent intent);

    void setTextureFrameAvailableListener(ITextureFrameAvailableListener iTextureFrameAvailableListener);

    void setTimeInterval(int i);

    void start(String str);

    void start(List<String> list);

    void startAudioCapture();

    void startCaptureSource();

    void startVideoCapture();

    void stop();

    void stopAudioCapture();

    void stopCaptureSource();

    void stopVideoCapture();

    void switchAudioCapture(int i);

    void switchVideoCapture(int i);
}
