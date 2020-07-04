package com.p280ss.ttm.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p280ss.ttm.player.MediaPlayer.OnBufferingUpdateListener;
import com.p280ss.ttm.player.MediaPlayer.OnCompletionListener;
import com.p280ss.ttm.player.MediaPlayer.OnErrorListener;
import com.p280ss.ttm.player.MediaPlayer.OnExternInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnInfoListener;
import com.p280ss.ttm.player.MediaPlayer.OnPreparedListener;
import com.p280ss.ttm.player.MediaPlayer.OnScreenshotListener;
import com.p280ss.ttm.player.MediaPlayer.OnSeekCompleteListener;
import com.p280ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener;
import com.p280ss.ttm.player.MediaPlayer.TrackInfo;
import com.p280ss.ttm.player.MediaPlayer.onSARChangedListener;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.ttm.player.OSPlayerClient */
public class OSPlayerClient extends MediaPlayerClient {
    protected OnBufferingUpdateListener mOnBufferingUpdateListener;
    protected OnCompletionListener mOnCompletionListener;
    protected OnErrorListener mOnErrorListener;
    protected OnInfoListener mOnInfoListener;
    protected OnPreparedListener mOnPreparedListener;
    protected OnSeekCompleteListener mOnSeekCompleteListener;
    protected OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private MediaPlayer mPlayer;
    private MediaPlayer mWrapper;

    /* renamed from: com.ss.ttm.player.OSPlayerClient$WrapOnBufferingUpdateListener */
    static class WrapOnBufferingUpdateListener implements MediaPlayer.OnBufferingUpdateListener {
        private OnBufferingUpdateListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onBufferingUpdateListener;
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            this.mListener.onBufferingUpdate(this.mWrapper, i);
        }
    }

    /* renamed from: com.ss.ttm.player.OSPlayerClient$WrapOnCompletionListener */
    static class WrapOnCompletionListener implements MediaPlayer.OnCompletionListener {
        private OnCompletionListener mListener;
        private MediaPlayer mWrapper;

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.mListener.onCompletion(this.mWrapper);
        }

        public WrapOnCompletionListener(OnCompletionListener onCompletionListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onCompletionListener;
        }
    }

    /* renamed from: com.ss.ttm.player.OSPlayerClient$WrapOnErrorListener */
    static class WrapOnErrorListener implements MediaPlayer.OnErrorListener {
        private OnErrorListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnErrorListener(OnErrorListener onErrorListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onErrorListener;
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return this.mListener.onError(this.mWrapper, i, i2);
        }
    }

    /* renamed from: com.ss.ttm.player.OSPlayerClient$WrapOnInfoListener */
    static class WrapOnInfoListener implements MediaPlayer.OnInfoListener {
        private OnInfoListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnInfoListener(OnInfoListener onInfoListener, MediaPlayer mediaPlayer) {
            this.mWrapper = mediaPlayer;
            this.mListener = onInfoListener;
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            return this.mListener.onInfo(this.mWrapper, i, i2);
        }
    }

    /* renamed from: com.ss.ttm.player.OSPlayerClient$WrapOnPreparedListener */
    static class WrapOnPreparedListener implements MediaPlayer.OnPreparedListener {
        private OnPreparedListener mListener;
        private MediaPlayer mWrapper;

        public void onPrepared(MediaPlayer mediaPlayer) {
            this.mListener.onPrepared(this.mWrapper);
        }

        public WrapOnPreparedListener(OnPreparedListener onPreparedListener, MediaPlayer mediaPlayer) {
            this.mListener = onPreparedListener;
            this.mWrapper = mediaPlayer;
        }
    }

    /* renamed from: com.ss.ttm.player.OSPlayerClient$WrapOnSeekCompleteListener */
    static class WrapOnSeekCompleteListener implements MediaPlayer.OnSeekCompleteListener {
        private OnSeekCompleteListener mListener;
        private MediaPlayer mWrapper;

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            this.mListener.onSeekComplete(this.mWrapper);
        }

        public WrapOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener, MediaPlayer mediaPlayer) {
            this.mListener = onSeekCompleteListener;
            this.mWrapper = mediaPlayer;
        }
    }

    /* renamed from: com.ss.ttm.player.OSPlayerClient$WrapOnVideoSizeChangedListener */
    static class WrapOnVideoSizeChangedListener implements MediaPlayer.OnVideoSizeChangedListener {
        private OnVideoSizeChangedListener mListener;
        private MediaPlayer mWrapper;

        public WrapOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener, MediaPlayer mediaPlayer) {
            this.mListener = onVideoSizeChangedListener;
            this.mWrapper = mediaPlayer;
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            this.mListener.onVideoSizeChanged(this.mWrapper, i, i2);
        }
    }

    public int getType() {
        return 0;
    }

    public void prevClose() {
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
    }

    public void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
    }

    public void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
    }

    public void switchStream(int i, int i2) {
    }

    public void takeScreenshot(OnScreenshotListener onScreenshotListener) {
    }

    public int getCurrentPosition() {
        if (this.mPlayer != null) {
            return this.mPlayer.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (this.mPlayer != null) {
            return this.mPlayer.getDuration();
        }
        return 0;
    }

    public int getVideoHeight() {
        if (this.mPlayer != null) {
            return this.mPlayer.getVideoHeight();
        }
        return 0;
    }

    public int getVideoWidth() {
        if (this.mPlayer != null) {
            return this.mPlayer.getVideoWidth();
        }
        return 0;
    }

    public boolean isLooping() {
        if (this.mPlayer != null) {
            return this.mPlayer.isLooping();
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.mPlayer != null) {
            return this.mPlayer.isPlaying();
        }
        return false;
    }

    public void pause() {
        if (this.mPlayer != null) {
            this.mPlayer.pause();
        }
    }

    public void prepare() {
        if (this.mPlayer != null) {
            try {
                this.mPlayer.prepare();
            } catch (IllegalStateException unused) {
            } catch (IOException unused2) {
            }
        }
    }

    public void prepareAsync() {
        if (this.mPlayer != null) {
            this.mPlayer.prepareAsync();
        }
    }

    public void release() {
        if (this.mPlayer != null) {
            this.mPlayer.release();
        }
    }

    public void releaseAsync() {
        new Thread(new Runnable() {
            public void run() {
                OSPlayerClient.this.release();
            }
        }).start();
    }

    public void reset() {
        if (this.mPlayer != null) {
            this.mPlayer.reset();
        }
    }

    public void start() {
        if (this.mPlayer != null) {
            this.mPlayer.start();
        }
    }

    public void stop() {
        if (this.mPlayer != null) {
            this.mPlayer.stop();
        }
    }

    public TrackInfo[] getTrackInfo() {
        if (this.mPlayer != null) {
            MediaPlayer.TrackInfo[] trackInfo = this.mPlayer.getTrackInfo();
            if (trackInfo != null) {
                TrackInfo[] trackInfoArr = new TrackInfo[trackInfo.length];
                int length = trackInfo.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    trackInfoArr[i2] = new TrackInfo(trackInfo[i]);
                    i++;
                    i2 = i3;
                }
            }
        }
        return null;
    }

    public void setSurface(Surface surface) {
        this.mPlayer.setSurface(surface);
    }

    public void deselectTrack(int i) {
        if (this.mPlayer != null) {
            this.mPlayer.deselectTrack(i);
        }
    }

    public int getSelectedTrack(int i) {
        if (this.mPlayer != null) {
            return this.mPlayer.getSelectedTrack(i);
        }
        return -1;
    }

    public void seekTo(int i) {
        if (this.mPlayer != null) {
            this.mPlayer.seekTo(i);
        }
    }

    public void setLooping(boolean z) {
        if (this.mPlayer != null) {
            this.mPlayer.setLooping(z);
        }
    }

    public void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
        this.mPlayer.setOnBufferingUpdateListener(new WrapOnBufferingUpdateListener(onBufferingUpdateListener, this.mWrapper));
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
        this.mPlayer.setOnCompletionListener(new WrapOnCompletionListener(onCompletionListener, this.mWrapper));
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
        this.mPlayer.setOnErrorListener(new WrapOnErrorListener(onErrorListener, this.mWrapper));
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
        this.mPlayer.setOnInfoListener(new WrapOnInfoListener(onInfoListener, this.mWrapper));
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
        this.mPlayer.setOnPreparedListener(new WrapOnPreparedListener(onPreparedListener, this.mWrapper));
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        this.mPlayer.setOnSeekCompleteListener(new WrapOnSeekCompleteListener(onSeekCompleteListener, this.mWrapper));
    }

    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mPlayer.setOnVideoSizeChangedListener(new WrapOnVideoSizeChangedListener(onVideoSizeChangedListener, this.mWrapper));
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.mPlayer != null) {
            this.mPlayer.setScreenOnWhilePlaying(z);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.mPlayer != null && surfaceHolder != null && surfaceHolder.getSurface().isValid()) {
            try {
                this.mPlayer.setDisplay(surfaceHolder);
            } catch (Exception unused) {
            }
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.mPlayer.setDataSource(str);
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        PlaybackParams playbackParams2 = new PlaybackParams();
        playbackParams2.setSpeed(playbackParams.getSpeed());
        playbackParams2.setAudioFallbackMode(playbackParams.getAudioFallbackMode());
        playbackParams2.setPitch(playbackParams.getPitch());
        if (this.mPlayer != null) {
            this.mPlayer.setPlaybackParams(playbackParams2);
        }
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.mPlayer.setDataSource(context, uri);
    }

    public void setWakeMode(Context context, int i) {
        this.mPlayer.setWakeMode(context, i);
    }

    public void setVolume(float f, float f2) {
        if (this.mPlayer != null) {
            this.mPlayer.setVolume(f, f2);
        }
    }

    public static final synchronized OSPlayerClient create(MediaPlayer mediaPlayer, Context context) {
        OSPlayerClient oSPlayerClient;
        synchronized (OSPlayerClient.class) {
            oSPlayerClient = new OSPlayerClient();
            oSPlayerClient.mPlayer = new MediaPlayer();
            oSPlayerClient.mWrapper = mediaPlayer;
        }
        return oSPlayerClient;
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.mPlayer.setDataSource(context, uri, map);
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        this.mPlayer.setDataSource(fileDescriptor, j, j2);
    }
}
