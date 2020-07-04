package com.bytedance.android.livesdk.gift.effect.video.p388a;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p280ss.ttm.player.IMediaDataSource;
import com.p280ss.ttm.player.MediaPlayer;
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
import com.p280ss.ttm.player.MediaPlayerClient;
import com.p280ss.ttm.player.OSPlayerClient;
import com.p280ss.ttm.player.PlaybackParams;
import com.p280ss.ttm.player.TTPlayerConfiger;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.a.d */
public class C8073d implements MediaPlayer {

    /* renamed from: d */
    private static boolean f22017d;

    /* renamed from: a */
    public boolean f22018a;

    /* renamed from: b */
    public String f22019b = "";

    /* renamed from: c */
    private MediaPlayerClient f22020c;

    public void selectTrack(int i) {
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
    }

    public void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
    }

    public void switchStream(int i, int i2) {
    }

    public int getCurrentPosition() {
        if (this.f22020c != null) {
            return this.f22020c.getCurrentPosition();
        }
        return 0;
    }

    public String getDataSource() {
        if (this.f22020c != null) {
            return this.f22020c.getDataSource();
        }
        return null;
    }

    public int getDuration() {
        if (this.f22020c != null) {
            return this.f22020c.getDuration();
        }
        return 0;
    }

    public int getPlayerType() {
        if (this.f22020c != null) {
            return this.f22020c.getType();
        }
        return 0;
    }

    public TrackInfo[] getTrackInfo() {
        if (this.f22020c != null) {
            this.f22020c.getTrackInfo();
        }
        return null;
    }

    public int getVideoHeight() {
        if (this.f22020c != null) {
            return this.f22020c.getVideoHeight();
        }
        return 0;
    }

    public int getVideoType() {
        if (this.f22020c != null) {
            return this.f22020c.getVideoType();
        }
        return 0;
    }

    public int getVideoWidth() {
        if (this.f22020c != null) {
            return this.f22020c.getVideoWidth();
        }
        return 0;
    }

    public boolean isLooping() {
        if (this.f22020c != null) {
            return this.f22020c.isLooping();
        }
        return false;
    }

    public boolean isMute() {
        if (this.f22020c != null) {
            return this.f22020c.isMute();
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.f22020c != null) {
            return this.f22020c.isPlaying();
        }
        return false;
    }

    public void pause() {
        if (this.f22020c != null) {
            this.f22020c.pause();
        }
    }

    public void prepare() {
        if (this.f22020c != null) {
            this.f22020c.prepare();
        }
    }

    public void prepareAsync() {
        if (this.f22020c != null) {
            this.f22020c.prepareAsync();
        }
    }

    public void prevClose() {
        if (this.f22020c != null) {
            this.f22020c.prevClose();
        }
    }

    public void release() {
        if (this.f22020c != null) {
            this.f22020c.release();
        }
    }

    public void releaseAsync() {
        if (this.f22020c != null) {
            this.f22020c.releaseAsync();
        }
    }

    public void reset() {
        if (this.f22020c != null) {
            this.f22020c.reset();
        }
    }

    public void start() {
        if (this.f22020c != null) {
            this.f22020c.start();
        }
    }

    public void stop() {
        if (this.f22020c != null) {
            this.f22020c.stop();
        }
    }

    public boolean isOSPlayer() {
        if (this.f22020c == null || this.f22020c.getType() == 0) {
            return true;
        }
        return false;
    }

    public void deselectTrack(int i) {
        if (this.f22020c != null) {
            this.f22020c.deselectTrack(i);
        }
    }

    public int getSelectedTrack(int i) {
        if (this.f22020c != null) {
            this.f22020c.getSelectedTrack(i);
        }
        return 0;
    }

    public String getStringOption(int i) {
        if (this.f22020c != null) {
            return this.f22020c.getStringOption(i);
        }
        return null;
    }

    public void seekTo(int i) {
        if (this.f22020c != null) {
            this.f22020c.seekTo(i);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.f22020c != null) {
            this.f22020c.setDisplay(surfaceHolder);
        }
    }

    public void setIsMute(boolean z) {
        if (this.f22020c != null) {
            this.f22020c.setIsMute(z);
        }
    }

    public void setLooping(boolean z) {
        if (this.f22020c != null) {
            this.f22020c.setLooping(z);
        }
    }

    public void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        if (this.f22020c != null) {
            this.f22020c.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        if (this.f22020c != null) {
            this.f22020c.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.f22020c != null) {
            this.f22020c.setOnErrorListener(onErrorListener);
        }
    }

    public void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
        if (this.f22020c != null) {
            this.f22020c.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        if (this.f22020c != null) {
            this.f22020c.setOnInfoListener(onInfoListener);
        }
    }

    public void setOnLogListener(OnLogListener onLogListener) {
        if (this.f22020c != null) {
            this.f22020c.setOnLogListener(onLogListener);
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.f22020c != null) {
            this.f22020c.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        if (this.f22020c != null) {
            this.f22020c.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (this.f22020c != null) {
            this.f22020c.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (this.f22020c != null) {
            this.f22020c.setPanoVideoControlModel(i);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.f22020c != null) {
            this.f22020c.setPlaybackParams(playbackParams);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.f22020c != null) {
            this.f22020c.setScreenOnWhilePlaying(z);
        }
    }

    public void takeScreenshot(OnScreenshotListener onScreenshotListener) {
        if (this.f22020c != null) {
            this.f22020c.takeScreenshot(onScreenshotListener);
        }
    }

    public void setSurface(Surface surface) {
        if ((surface == null || surface.isValid()) && this.f22020c != null) {
            this.f22020c.setSurface(surface);
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f22020c != null) {
            this.f22020c.setDataSource(str);
        }
    }

    /* renamed from: a */
    public static MediaPlayer m24770a(Context context) {
        C8073d dVar = new C8073d();
        synchronized (C8073d.class) {
            if (TTPlayerConfiger.isOnTTPlayer()) {
                try {
                    Class cls = Class.forName("com.ss.ttm.player.TTPlayerClient");
                    Method declaredMethod = cls.getDeclaredMethod("create", new Class[]{MediaPlayer.class, Context.class});
                    declaredMethod.setAccessible(true);
                    dVar.f22020c = (MediaPlayerClient) declaredMethod.invoke(cls, new Object[]{dVar, context});
                    f22017d = true;
                } catch (Throwable th) {
                    dVar.f22018a = true;
                    dVar.f22019b = th.toString();
                }
                if (dVar.f22020c == null) {
                    try {
                        Class cls2 = Class.forName("com.ss.ttmplayer.player.TTPlayerClient");
                        Method declaredMethod2 = cls2.getDeclaredMethod("create", new Class[]{MediaPlayer.class, Context.class});
                        declaredMethod2.setAccessible(true);
                        dVar.f22020c = (MediaPlayerClient) declaredMethod2.invoke(cls2, new Object[]{dVar, context});
                    } catch (Throwable th2) {
                        dVar.f22018a = true;
                        dVar.f22019b = th2.toString();
                    }
                }
            }
            if (dVar.f22020c == null) {
                dVar.f22020c = OSPlayerClient.create(dVar, context);
            }
        }
        return dVar;
    }

    public float getFloatOption(int i, float f) {
        if (this.f22020c != null) {
            return this.f22020c.getFloatOption(i, f);
        }
        return f;
    }

    public int getIntOption(int i, int i2) {
        if (this.f22020c != null) {
            return this.f22020c.getIntOption(i, i2);
        }
        return i2;
    }

    public long getLongOption(int i, long j) {
        if (this.f22020c != null) {
            return this.f22020c.getLongOption(i, j);
        }
        return j;
    }

    public void rotateCamera(float f, float f2) {
        if (this.f22020c != null) {
            this.f22020c.rotateCamera(f, f2);
        }
    }

    public void setCacheFile(String str, int i) {
        if (this.f22020c != null) {
            this.f22020c.setCacheFile(str, i);
        }
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f22020c != null) {
            this.f22020c.setDataSource(context, uri);
        }
    }

    public int setFloatOption(int i, float f) {
        if (this.f22020c != null) {
            this.f22020c.setFloatOption(i, f);
        }
        return 0;
    }

    public void setIntOption(int i, int i2) {
        if (this.f22020c != null) {
            this.f22020c.setIntOption(i, i2);
        }
    }

    public long setLongOption(int i, long j) {
        if (this.f22020c != null) {
            return (long) this.f22020c.setLongOption(i, j);
        }
        return -1;
    }

    public void setStringOption(int i, String str) {
        if (this.f22020c != null) {
            this.f22020c.setStringOption(i, str);
        }
    }

    public void setVolume(float f, float f2) {
        if (this.f22020c != null) {
            this.f22020c.setVolume(f, f2);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (this.f22020c != null) {
            this.f22020c.setWakeMode(context, i);
        }
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (this.f22020c != null) {
            this.f22020c.mouseEvent(i, i2, i3);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f22020c != null) {
            this.f22020c.setDataSource(context, uri, map);
        }
    }
}
