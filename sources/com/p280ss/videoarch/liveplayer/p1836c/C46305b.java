package com.p280ss.videoarch.liveplayer.p1836c;

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
import com.p280ss.ttm.player.PlaybackParams;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.videoarch.liveplayer.c.b */
public final class C46305b implements MediaPlayer {

    /* renamed from: a */
    private MediaPlayerClient f118966a;

    public final void selectTrack(int i) {
    }

    public final void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
    }

    public final void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
    }

    public final void switchStream(int i, int i2) {
    }

    public final int getCurrentPosition() {
        if (this.f118966a != null) {
            return this.f118966a.getCurrentPosition();
        }
        return 0;
    }

    public final String getDataSource() {
        if (this.f118966a != null) {
            return this.f118966a.getDataSource();
        }
        return null;
    }

    public final int getDuration() {
        if (this.f118966a != null) {
            return this.f118966a.getDuration();
        }
        return 0;
    }

    public final int getPlayerType() {
        if (this.f118966a != null) {
            return this.f118966a.getType();
        }
        return 0;
    }

    public final TrackInfo[] getTrackInfo() {
        if (this.f118966a != null) {
            return this.f118966a.getTrackInfo();
        }
        return null;
    }

    public final int getVideoHeight() {
        if (this.f118966a != null) {
            return this.f118966a.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoType() {
        if (this.f118966a != null) {
            return this.f118966a.getVideoType();
        }
        return 0;
    }

    public final int getVideoWidth() {
        if (this.f118966a != null) {
            return this.f118966a.getVideoWidth();
        }
        return 0;
    }

    public final boolean isLooping() {
        if (this.f118966a != null) {
            return this.f118966a.isLooping();
        }
        return false;
    }

    public final boolean isMute() {
        if (this.f118966a != null) {
            return this.f118966a.isMute();
        }
        return false;
    }

    public final boolean isPlaying() {
        if (this.f118966a != null) {
            return this.f118966a.isPlaying();
        }
        return false;
    }

    public final void pause() {
        if (this.f118966a != null) {
            this.f118966a.pause();
        }
    }

    public final void prepare() {
        if (this.f118966a != null) {
            this.f118966a.prepare();
        }
    }

    public final void prepareAsync() {
        if (this.f118966a != null) {
            this.f118966a.prepareAsync();
        }
    }

    public final void prevClose() {
        if (this.f118966a != null) {
            this.f118966a.prevClose();
        }
    }

    public final void release() {
        if (this.f118966a != null) {
            this.f118966a.release();
        }
    }

    public final void releaseAsync() {
        if (this.f118966a != null) {
            this.f118966a.releaseAsync();
        }
    }

    public final void reset() {
        if (this.f118966a != null) {
            this.f118966a.reset();
        }
    }

    public final void start() {
        if (this.f118966a != null) {
            this.f118966a.start();
        }
    }

    public final void stop() {
        if (this.f118966a != null) {
            this.f118966a.stop();
        }
    }

    public final boolean isOSPlayer() {
        if (this.f118966a == null || this.f118966a.getType() == 0) {
            return true;
        }
        return false;
    }

    public final void deselectTrack(int i) {
        if (this.f118966a != null) {
            this.f118966a.deselectTrack(i);
        }
    }

    public final int getSelectedTrack(int i) {
        if (this.f118966a != null) {
            return this.f118966a.getSelectedTrack(i);
        }
        return -1;
    }

    public final String getStringOption(int i) {
        if (this.f118966a != null) {
            return this.f118966a.getStringOption(i);
        }
        return null;
    }

    public final void seekTo(int i) {
        if (this.f118966a != null) {
            this.f118966a.seekTo(i);
        }
    }

    public final void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.f118966a != null) {
            this.f118966a.setDisplay(surfaceHolder);
        }
    }

    public final void setIsMute(boolean z) {
        if (this.f118966a != null) {
            this.f118966a.setIsMute(z);
        }
    }

    public final void setLooping(boolean z) {
        if (this.f118966a != null) {
            this.f118966a.setLooping(z);
        }
    }

    public final void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        if (this.f118966a != null) {
            this.f118966a.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public final void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        if (this.f118966a != null) {
            this.f118966a.setOnCompletionListener(onCompletionListener);
        }
    }

    public final void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.f118966a != null) {
            this.f118966a.setOnErrorListener(onErrorListener);
        }
    }

    public final void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
        if (this.f118966a != null) {
            this.f118966a.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public final void setOnInfoListener(OnInfoListener onInfoListener) {
        if (this.f118966a != null) {
            this.f118966a.setOnInfoListener(onInfoListener);
        }
    }

    public final void setOnLogListener(OnLogListener onLogListener) {
        if (this.f118966a != null) {
            this.f118966a.setOnLogListener(onLogListener);
        }
    }

    public final void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.f118966a != null) {
            this.f118966a.setOnPreparedListener(onPreparedListener);
        }
    }

    public final void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
        if (this.f118966a != null) {
            this.f118966a.setOnSARChangedListener(onsarchangedlistener);
        }
    }

    public final void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        if (this.f118966a != null) {
            this.f118966a.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public final void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (this.f118966a != null) {
            this.f118966a.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public final void setPanoVideoControlModel(int i) {
        if (this.f118966a != null) {
            this.f118966a.setPanoVideoControlModel(i);
        }
    }

    public final void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.f118966a != null) {
            this.f118966a.setPlaybackParams(playbackParams);
        }
    }

    public final void setScreenOnWhilePlaying(boolean z) {
        if (this.f118966a != null) {
            this.f118966a.setScreenOnWhilePlaying(z);
        }
    }

    public final void takeScreenshot(OnScreenshotListener onScreenshotListener) {
        if (this.f118966a != null) {
            this.f118966a.takeScreenshot(onScreenshotListener);
        }
    }

    public final void setSurface(Surface surface) {
        if (this.f118966a != null && surface != null && surface.isValid()) {
            this.f118966a.setSurface(surface);
        }
    }

    public final void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f118966a != null) {
            this.f118966a.setDataSource(str);
        }
    }

    public final float getFloatOption(int i, float f) {
        if (this.f118966a != null) {
            return this.f118966a.getFloatOption(i, f);
        }
        return f;
    }

    public final int getIntOption(int i, int i2) {
        if (this.f118966a != null) {
            return this.f118966a.getIntOption(i, i2);
        }
        return i2;
    }

    public final long getLongOption(int i, long j) {
        if (this.f118966a != null) {
            return this.f118966a.getLongOption(i, j);
        }
        return j;
    }

    public final void rotateCamera(float f, float f2) {
        if (this.f118966a != null) {
            this.f118966a.rotateCamera(f, f2);
        }
    }

    public final void setCacheFile(String str, int i) {
        if (this.f118966a != null) {
            this.f118966a.setCacheFile(str, i);
        }
    }

    public final void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f118966a != null) {
            this.f118966a.setDataSource(context, uri);
        }
    }

    public final int setFloatOption(int i, float f) {
        if (this.f118966a != null) {
            return this.f118966a.setFloatOption(i, f);
        }
        return -1;
    }

    public final void setIntOption(int i, int i2) {
        if (this.f118966a != null) {
            this.f118966a.setIntOption(i, i2);
        }
    }

    public final long setLongOption(int i, long j) {
        if (this.f118966a != null) {
            return (long) this.f118966a.setLongOption(i, j);
        }
        return -1;
    }

    public final void setStringOption(int i, String str) {
        if (this.f118966a != null) {
            this.f118966a.setStringOption(i, str);
        }
    }

    public final void setVolume(float f, float f2) {
        if (this.f118966a != null) {
            this.f118966a.setVolume(f, f2);
        }
    }

    public final void setWakeMode(Context context, int i) {
        if (this.f118966a != null) {
            this.f118966a.setWakeMode(context, i);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0065 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.ttm.player.MediaPlayer m145350a(android.content.Context r9, int r10) {
        /*
            com.ss.videoarch.liveplayer.c.b r0 = new com.ss.videoarch.liveplayer.c.b
            r0.<init>()
            java.lang.Class<com.ss.videoarch.liveplayer.c.b> r1 = com.p280ss.videoarch.liveplayer.p1836c.C46305b.class
            monitor-enter(r1)
            boolean r2 = com.p280ss.ttm.player.TTPlayerConfiger.isOnTTPlayer()     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x0065
            r2 = 0
            r3 = 2
            r4 = 1
            java.lang.String r5 = "com.ss.ttm.player.TTPlayerClient"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Throwable -> 0x0038 }
            java.lang.String r6 = "create"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x0038 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r8 = com.p280ss.ttm.player.MediaPlayer.class
            r7[r2] = r8     // Catch:{ Throwable -> 0x0038 }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r4] = r8     // Catch:{ Throwable -> 0x0038 }
            java.lang.reflect.Method r6 = r5.getDeclaredMethod(r6, r7)     // Catch:{ Throwable -> 0x0038 }
            r6.setAccessible(r4)     // Catch:{ Throwable -> 0x0038 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x0038 }
            r7[r2] = r0     // Catch:{ Throwable -> 0x0038 }
            r7[r4] = r9     // Catch:{ Throwable -> 0x0038 }
            java.lang.Object r5 = r6.invoke(r5, r7)     // Catch:{ Throwable -> 0x0038 }
            com.ss.ttm.player.MediaPlayerClient r5 = (com.p280ss.ttm.player.MediaPlayerClient) r5     // Catch:{ Throwable -> 0x0038 }
            r0.f118966a = r5     // Catch:{ Throwable -> 0x0038 }
        L_0x0038:
            com.ss.ttm.player.MediaPlayerClient r5 = r0.f118966a     // Catch:{ all -> 0x0071 }
            if (r5 != 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            java.lang.String r10 = "com.ss.ttmplayer.player.TTPlayerClient"
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = "create"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x0065 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r7 = com.p280ss.ttm.player.MediaPlayer.class
            r6[r2] = r7     // Catch:{ Throwable -> 0x0065 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch:{ Throwable -> 0x0065 }
            java.lang.reflect.Method r5 = r10.getDeclaredMethod(r5, r6)     // Catch:{ Throwable -> 0x0065 }
            r5.setAccessible(r4)     // Catch:{ Throwable -> 0x0065 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x0065 }
            r3[r2] = r0     // Catch:{ Throwable -> 0x0065 }
            r3[r4] = r9     // Catch:{ Throwable -> 0x0065 }
            java.lang.Object r10 = r5.invoke(r10, r3)     // Catch:{ Throwable -> 0x0065 }
            com.ss.ttm.player.MediaPlayerClient r10 = (com.p280ss.ttm.player.MediaPlayerClient) r10     // Catch:{ Throwable -> 0x0065 }
            r0.f118966a = r10     // Catch:{ Throwable -> 0x0065 }
        L_0x0065:
            com.ss.ttm.player.MediaPlayerClient r10 = r0.f118966a     // Catch:{ all -> 0x0071 }
            if (r10 != 0) goto L_0x006f
            com.ss.ttm.player.OSPlayerClient r9 = com.p280ss.ttm.player.OSPlayerClient.create(r0, r9)     // Catch:{ all -> 0x0071 }
            r0.f118966a = r9     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            return r0
        L_0x0071:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0071 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.videoarch.liveplayer.p1836c.C46305b.m145350a(android.content.Context, int):com.ss.ttm.player.MediaPlayer");
    }

    public final void mouseEvent(int i, int i2, int i3) {
        if (this.f118966a != null) {
            this.f118966a.mouseEvent(i, i2, i3);
        }
    }

    public final void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f118966a != null) {
            this.f118966a.setDataSource(context, uri, map);
        }
    }
}
