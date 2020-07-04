package com.p280ss.avframework.livestreamv2.interact.callback;

import android.view.SurfaceView;
import com.p280ss.avframework.livestreamv2.interact.model.Config.VideoOutputFormat;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.interact.callback.EngineCallback */
public interface EngineCallback {
    void onDestroyFailed(int i, String str);

    void onDestroySuccess();

    void onError(String str);

    void onFirstRemoteAudioFrame(int i);

    void onFirstRemoteVideoFrame(int i, SurfaceView surfaceView);

    void onInitFailed(int i, String str);

    void onInitSuccess();

    void onLogReport(String str, JSONObject jSONObject);

    void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    void onPushStreamQuality(long j, long j2);

    void onReceiveTextureFrame(int i, int i2, VideoOutputFormat videoOutputFormat, int i3, int i4, int i5, long j, float[] fArr);

    void onReceiveVideoBufferFrame(int i, ByteBuffer byteBuffer, VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, long j);

    void onStartFailed(int i, String str);

    void onStartSuccess();

    void onStopFailed(int i, String str);

    void onStopSuccess();

    void onStreamDelay(int i);

    void onTalkStateUpdated(String[] strArr, boolean[] zArr);

    void onUserJoined(int i);

    void onUserLeaved(int i);

    void onWarn(String str);
}
