package com.p280ss.ttm.player;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p280ss.ttm.player.MediaPlayer.OnBufferingUpdateListener;
import com.p280ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p280ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p280ss.ttm.player.MediaPlayer.OnExternInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnLogListener;
import com.p280ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p280ss.ttm.player.MediaPlayer.OnScreenshotListener;
import com.p280ss.ttm.player.MediaPlayer.OnSeekCompleteListener;
import com.p280ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p280ss.ttm.player.MediaPlayer.TrackInfo;
import com.p280ss.ttm.player.MediaPlayer.onSARChangedListener;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.ttm.player.MediaPlayerClient */
public abstract class MediaPlayerClient {
    public abstract void deselectTrack(int i);

    public abstract int getCurrentPosition();

    public String getDataSource() {
        return null;
    }

    public double getDoubleOption(int i, double d) {
        return d;
    }

    public abstract int getDuration();

    public float getFloatOption(int i, float f) {
        return f;
    }

    public int getIntOption(int i, int i2) {
        return i2;
    }

    public long getLongOption(int i, long j) {
        return j;
    }

    public abstract int getSelectedTrack(int i);

    public String getStringOption(int i) {
        return null;
    }

    public abstract TrackInfo[] getTrackInfo();

    public abstract int getType();

    public abstract int getVideoHeight();

    public int getVideoType() {
        return 0;
    }

    public abstract int getVideoWidth();

    public abstract boolean isLooping();

    public boolean isMute() {
        return false;
    }

    public abstract boolean isPlaying();

    public void mouseEvent(int i, int i2, int i3) {
    }

    public abstract void pause();

    public abstract void prepare();

    public abstract void prepareAsync();

    public abstract void prevClose();

    public abstract void release();

    public abstract void releaseAsync();

    public abstract void reset();

    public void rotateCamera(float f, float f2) {
    }

    public abstract void seekTo(int i);

    public void setCacheFile(String str, int i) {
    }

    public abstract void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException;

    public abstract void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException;

    public abstract void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException;

    public abstract void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException;

    public abstract void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException;

    public abstract void setDisplay(SurfaceHolder surfaceHolder);

    public int setDoubleOption(int i, double d) {
        return -1;
    }

    public int setFloatOption(int i, float f) {
        return -1;
    }

    public int setIntOption(int i, int i2) {
        return -1;
    }

    public void setIsMute(boolean z) {
    }

    public int setLongOption(int i, long j) {
        return -1;
    }

    public abstract void setLooping(boolean z);

    public abstract void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener);

    public abstract void setOnCompletionListener(OnCompletionListener onCompletionListener);

    public abstract void setOnErrorListener(OnErrorListener onErrorListener);

    public abstract void setOnExternInfoListener(OnExternInfoListener onExternInfoListener);

    public abstract void setOnInfoListener(OnInfoListener onInfoListener);

    public void setOnLogListener(OnLogListener onLogListener) {
    }

    public abstract void setOnPreparedListener(OnPreparedListener onPreparedListener);

    public abstract void setOnSARChangedListener(onSARChangedListener onsarchangedlistener);

    public abstract void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener);

    public abstract void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener);

    public void setPanoVideoControlModel(int i) {
    }

    public abstract void setPlaybackParams(PlaybackParams playbackParams);

    public abstract void setScreenOnWhilePlaying(boolean z);

    public int setStringOption(int i, String str) {
        return -1;
    }

    public abstract void setSurface(Surface surface);

    public abstract void setVolume(float f, float f2);

    public abstract void setWakeMode(Context context, int i);

    public abstract void start();

    public abstract void stop();

    public abstract void switchStream(int i, int i2);

    public abstract void takeScreenshot(OnScreenshotListener onScreenshotListener);
}
