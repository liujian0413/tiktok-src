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

/* renamed from: com.ss.ttm.player.TTMediaPlayer */
public class TTMediaPlayer implements MediaPlayer {
    protected MediaPlayerClient mClient;
    protected int mPlayerType;

    static {
        TTVersion.saveVersionInfo();
    }

    public void selectTrack(int i) {
    }

    public int getCurrentPosition() {
        if (this.mClient != null) {
            return this.mClient.getCurrentPosition();
        }
        return 0;
    }

    public String getDataSource() {
        if (this.mClient != null) {
            return this.mClient.getDataSource();
        }
        return null;
    }

    public int getDuration() {
        if (this.mClient != null) {
            return this.mClient.getDuration();
        }
        return 0;
    }

    public int getPlayerType() {
        if (this.mClient != null) {
            return this.mClient.getType();
        }
        return 0;
    }

    public TrackInfo[] getTrackInfo() {
        if (this.mClient != null) {
            return this.mClient.getTrackInfo();
        }
        return null;
    }

    public int getVideoHeight() {
        if (this.mClient != null) {
            return this.mClient.getVideoHeight();
        }
        return 0;
    }

    public int getVideoType() {
        if (this.mClient != null) {
            return this.mClient.getVideoType();
        }
        return 0;
    }

    public int getVideoWidth() {
        if (this.mClient != null) {
            return this.mClient.getVideoWidth();
        }
        return 0;
    }

    public boolean isLooping() {
        if (this.mClient != null) {
            return this.mClient.isLooping();
        }
        return false;
    }

    public boolean isMute() {
        if (this.mClient != null) {
            return this.mClient.isMute();
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.mClient != null) {
            return this.mClient.isPlaying();
        }
        return false;
    }

    public void pause() {
        if (this.mClient != null) {
            this.mClient.pause();
        }
    }

    public void prepare() {
        if (this.mClient != null) {
            this.mClient.prepare();
        }
    }

    public void prepareAsync() {
        if (this.mClient != null) {
            this.mClient.prepareAsync();
        }
    }

    public void prevClose() {
        if (this.mClient != null) {
            this.mClient.prevClose();
        }
    }

    public void release() {
        if (this.mClient != null) {
            this.mClient.release();
        }
    }

    public void releaseAsync() {
        if (this.mClient != null) {
            this.mClient.releaseAsync();
        }
    }

    public void reset() {
        if (this.mClient != null) {
            this.mClient.reset();
        }
    }

    public void start() {
        if (this.mClient != null) {
            this.mClient.start();
        }
    }

    public void stop() {
        if (this.mClient != null) {
            this.mClient.stop();
        }
    }

    public boolean isOSPlayer() {
        if (this.mClient == null || this.mClient.getType() == 0) {
            return true;
        }
        return false;
    }

    public void deselectTrack(int i) {
        if (this.mClient != null) {
            this.mClient.setIntOption(65, (i << 8) | 0);
        }
    }

    public int getSelectedTrack(int i) {
        if (this.mClient != null) {
            return this.mClient.getSelectedTrack(i);
        }
        return -1;
    }

    public String getStringOption(int i) {
        if (this.mClient != null) {
            return this.mClient.getStringOption(i);
        }
        return null;
    }

    public void seekTo(int i) {
        if (this.mClient != null) {
            this.mClient.seekTo(i);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.mClient != null) {
            this.mClient.setDisplay(surfaceHolder);
        }
    }

    public void setIsMute(boolean z) {
        if (this.mClient != null) {
            this.mClient.setIsMute(z);
        }
    }

    public void setLooping(boolean z) {
        if (this.mClient != null) {
            this.mClient.setLooping(z);
        }
    }

    public void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        if (this.mClient != null) {
            this.mClient.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        if (this.mClient != null) {
            this.mClient.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.mClient != null) {
            this.mClient.setOnErrorListener(onErrorListener);
        }
    }

    public void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
        if (this.mClient != null) {
            this.mClient.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        if (this.mClient != null) {
            this.mClient.setOnInfoListener(onInfoListener);
        }
    }

    public void setOnLogListener(OnLogListener onLogListener) {
        if (this.mClient != null) {
            this.mClient.setOnLogListener(onLogListener);
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.mClient != null) {
            this.mClient.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
        if (this.mClient != null) {
            this.mClient.setOnSARChangedListener(onsarchangedlistener);
        }
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        if (this.mClient != null) {
            this.mClient.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (this.mClient != null) {
            this.mClient.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (this.mClient != null) {
            this.mClient.setPanoVideoControlModel(i);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.mClient != null) {
            this.mClient.setPlaybackParams(playbackParams);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.mClient != null) {
            this.mClient.setScreenOnWhilePlaying(z);
        }
    }

    public void takeScreenshot(OnScreenshotListener onScreenshotListener) {
        if (this.mClient != null) {
            this.mClient.takeScreenshot(onScreenshotListener);
        }
    }

    public void setSurface(Surface surface) {
        if (surface != null && surface.isValid() && this.mClient != null) {
            this.mClient.setSurface(surface);
        }
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
        if (this.mClient != null) {
            this.mClient.setDataSource(iMediaDataSource);
        }
    }

    public void setUnSupportSampleRates(int[] iArr) {
        if (!isOSPlayer()) {
            int length = iArr.length;
            if (length > 0) {
                int length2 = MEDIA_PLAYER_SUPPORT_SAMPLERATES.length;
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            break;
                        } else if (MEDIA_PLAYER_SUPPORT_SAMPLERATES[i3] == iArr[i2]) {
                            i |= 1 << i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (this.mClient != null) {
                    this.mClient.setIntOption(111, i);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e A[Catch:{ Throwable -> 0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0043 A[SYNTHETIC, Splitter:B:28:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized com.p280ss.ttm.player.TTMediaPlayer create(android.content.Context r7) {
        /*
            java.lang.Class<com.ss.ttm.player.TTMediaPlayer> r0 = com.p280ss.ttm.player.TTMediaPlayer.class
            monitor-enter(r0)
            com.ss.ttm.player.TTMediaPlayer r1 = new com.ss.ttm.player.TTMediaPlayer     // Catch:{ all -> 0x0047 }
            r1.<init>()     // Catch:{ all -> 0x0047 }
            com.p280ss.ttm.player.TTPlayerConfiger.isPrintInfo()     // Catch:{ all -> 0x0047 }
            r2 = 11
            r3 = 0
            r4 = 0
            boolean r5 = com.p280ss.ttm.player.TTPlayerConfiger.isOnTTPlayer()     // Catch:{ Throwable -> 0x0020 }
            if (r5 != 0) goto L_0x001b
            boolean r5 = com.p280ss.ttm.player.TTPlayerConfiger.getValue(r2, r3)     // Catch:{ Throwable -> 0x0020 }
            if (r5 == 0) goto L_0x002b
        L_0x001b:
            com.ss.ttm.player.TTPlayerClient r5 = com.p280ss.ttm.player.TTPlayerClient.create(r1, r7, r4)     // Catch:{ Throwable -> 0x0020 }
            goto L_0x002c
        L_0x0020:
            r5 = 7
            boolean r6 = com.p280ss.ttm.player.TTPlayerConfiger.getValue(r5, r3)     // Catch:{ all -> 0x0047 }
            if (r6 != 0) goto L_0x002b
            r6 = 1
            com.p280ss.ttm.player.TTPlayerConfiger.setValue(r5, r6)     // Catch:{ all -> 0x0047 }
        L_0x002b:
            r5 = r4
        L_0x002c:
            if (r5 != 0) goto L_0x003f
            com.p280ss.ttm.player.TTPlayerConfiger.isPrintInfo()     // Catch:{ all -> 0x0047 }
            boolean r2 = com.p280ss.ttm.player.TTPlayerConfiger.getValue(r2, r3)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0039
            monitor-exit(r0)
            return r4
        L_0x0039:
            com.ss.ttm.player.OSPlayerClient r5 = com.p280ss.ttm.player.OSPlayerClient.create(r1, r7)     // Catch:{ all -> 0x0047 }
            r1.mPlayerType = r3     // Catch:{ all -> 0x0047 }
        L_0x003f:
            if (r5 != 0) goto L_0x0043
            monitor-exit(r0)
            return r4
        L_0x0043:
            r1.mClient = r5     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)
            return r1
        L_0x0047:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.TTMediaPlayer.create(android.content.Context):com.ss.ttm.player.TTMediaPlayer");
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.mClient != null) {
            this.mClient.setDataSource(str);
        }
    }

    public float getFloatOption(int i, float f) {
        if (this.mClient != null) {
            return this.mClient.getFloatOption(i, f);
        }
        return f;
    }

    public int getIntOption(int i, int i2) {
        if (this.mClient != null) {
            return this.mClient.getIntOption(i, i2);
        }
        return i2;
    }

    public long getLongOption(int i, long j) {
        if (this.mClient != null) {
            return this.mClient.getLongOption(i, j);
        }
        return j;
    }

    public void rotateCamera(float f, float f2) {
        if (this.mClient != null) {
            this.mClient.rotateCamera(f, f2);
        }
    }

    public void setCacheFile(String str, int i) {
        if (this.mClient != null) {
            this.mClient.setCacheFile(str, i);
        }
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.mClient != null) {
            this.mClient.setDataSource(context, uri);
        }
    }

    public int setFloatOption(int i, float f) {
        if (this.mClient != null) {
            return this.mClient.setFloatOption(i, f);
        }
        return -1;
    }

    public void setIntOption(int i, int i2) {
        if (this.mClient != null) {
            this.mClient.setIntOption(i, i2);
        }
    }

    public long setLongOption(int i, long j) {
        if (this.mClient != null) {
            return (long) this.mClient.setLongOption(i, j);
        }
        return -1;
    }

    public void setStringOption(int i, String str) {
        if (this.mClient != null) {
            this.mClient.setStringOption(i, str);
        }
    }

    public void setVolume(float f, float f2) {
        if (this.mClient != null) {
            this.mClient.setVolume(f, f2);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (this.mClient != null) {
            this.mClient.setWakeMode(context, i);
        }
    }

    public void switchStream(int i, int i2) {
        if (this.mClient != null) {
            this.mClient.switchStream(i, i2);
        }
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (this.mClient != null) {
            this.mClient.mouseEvent(i, i2, i3);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.mClient != null) {
            this.mClient.setDataSource(context, uri, map);
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        if (this.mClient != null) {
            this.mClient.setDataSource(fileDescriptor, j, j2);
        }
    }
}
