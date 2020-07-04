package com.p280ss.ttm.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.ttm.player.MediaPlayer */
public interface MediaPlayer {
    public static final int MEDIA_PLAYER_OPTION_HTTP_LOAD_PER_PERCENT = 18;
    public static final int MEDIA_PLAYER_OPTION_HTTP_RECONNECT = 7;
    public static final int MEDIA_PLAYER_OPTION_HTTP_TIMEOUT = 9;
    public static final int MEDIA_PLAYER_OPTION_USE_CODEC_POOL = 400;
    public static final int[] MEDIA_PLAYER_SUPPORT_SAMPLERATES = TTPlayerKeys.SupportSampleRates;

    /* renamed from: com.ss.ttm.player.MediaPlayer$OnBufferingUpdateListener */
    public interface OnBufferingUpdateListener {
        void onBufferingUpdate(MediaPlayer mediaPlayer, int i);
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$OnCompletionListener */
    public interface OnCompletionListener {
        void onCompletion(MediaPlayer mediaPlayer);
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$OnErrorListener */
    public interface OnErrorListener {
        boolean onError(MediaPlayer mediaPlayer, int i, int i2);
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$OnExternInfoListener */
    public interface OnExternInfoListener {
        void onExternInfo(MediaPlayer mediaPlayer, int i, String str);
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$OnInfoListener */
    public interface OnInfoListener {
        boolean onInfo(MediaPlayer mediaPlayer, int i, int i2);
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$OnLogListener */
    public interface OnLogListener {
        void onLogInfo(MediaPlayer mediaPlayer, String str);
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$OnPreparedListener */
    public interface OnPreparedListener {
        void onPrepared(MediaPlayer mediaPlayer);
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$OnScreenshotListener */
    public interface OnScreenshotListener {
        void onTakeScreenShotCompletion(Bitmap bitmap);
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$OnSeekCompleteListener */
    public interface OnSeekCompleteListener {
        void onSeekComplete(MediaPlayer mediaPlayer);
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$OnVideoSizeChangedListener */
    public interface OnVideoSizeChangedListener {
        void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2);
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$TrackInfo */
    public static class TrackInfo {
        private MediaFormat mFormat;
        private String mLanguage;
        private int mStreamType;

        public MediaFormat getFormat() {
            return this.mFormat;
        }

        public String getLanguage() {
            return this.mLanguage;
        }

        public int getTrackType() {
            return this.mStreamType;
        }

        public TrackInfo(android.media.MediaPlayer.TrackInfo trackInfo) {
            this.mStreamType = trackInfo.getTrackType();
            this.mLanguage = trackInfo.getLanguage();
            if (this.mStreamType == 2) {
                this.mFormat = MediaFormat.createAudioFormat(trackInfo.getFormat());
            } else if (this.mStreamType == 1) {
                this.mFormat = MediaFormat.createVideoFormat(trackInfo.getFormat());
            } else {
                if (this.mStreamType == 4) {
                    this.mFormat = MediaFormat.createSubtitleFormat(trackInfo.getFormat());
                }
            }
        }

        public TrackInfo(int i, MediaFormat mediaFormat) {
            this.mFormat = mediaFormat;
            if (i == 1) {
                this.mStreamType = 2;
            } else if (i == 0) {
                this.mStreamType = 1;
            } else if (i == 2) {
                this.mStreamType = 4;
            }
            this.mLanguage = "zh-cn";
        }
    }

    /* renamed from: com.ss.ttm.player.MediaPlayer$onSARChangedListener */
    public interface onSARChangedListener {
        void onSARChanged(MediaPlayer mediaPlayer, int i, int i2);
    }

    void deselectTrack(int i);

    int getCurrentPosition();

    String getDataSource();

    int getDuration();

    float getFloatOption(int i, float f);

    int getIntOption(int i, int i2);

    long getLongOption(int i, long j);

    int getPlayerType();

    int getSelectedTrack(int i);

    String getStringOption(int i);

    TrackInfo[] getTrackInfo();

    int getVideoHeight();

    int getVideoType();

    int getVideoWidth();

    boolean isLooping();

    boolean isMute();

    boolean isOSPlayer();

    boolean isPlaying();

    void mouseEvent(int i, int i2, int i3);

    void pause();

    void prepare();

    void prepareAsync();

    void prevClose();

    void release();

    void releaseAsync();

    void reset();

    void rotateCamera(float f, float f2);

    void seekTo(int i);

    void selectTrack(int i);

    void setCacheFile(String str, int i);

    void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException;

    void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException;

    void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException;

    void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException;

    void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException;

    void setDisplay(SurfaceHolder surfaceHolder);

    int setFloatOption(int i, float f);

    void setIntOption(int i, int i2);

    void setIsMute(boolean z);

    long setLongOption(int i, long j);

    void setLooping(boolean z);

    void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener);

    void setOnCompletionListener(OnCompletionListener onCompletionListener);

    void setOnErrorListener(OnErrorListener onErrorListener);

    void setOnExternInfoListener(OnExternInfoListener onExternInfoListener);

    void setOnInfoListener(OnInfoListener onInfoListener);

    void setOnLogListener(OnLogListener onLogListener);

    void setOnPreparedListener(OnPreparedListener onPreparedListener);

    void setOnSARChangedListener(onSARChangedListener onsarchangedlistener);

    void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener);

    void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener);

    void setPanoVideoControlModel(int i);

    void setPlaybackParams(PlaybackParams playbackParams);

    void setScreenOnWhilePlaying(boolean z);

    void setStringOption(int i, String str);

    void setSurface(Surface surface);

    void setVolume(float f, float f2);

    void setWakeMode(Context context, int i);

    void start();

    void stop();

    void switchStream(int i, int i2);

    void takeScreenshot(OnScreenshotListener onScreenshotListener);
}
