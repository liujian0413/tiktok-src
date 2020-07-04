package com.p280ss.ttvideoengine;

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

/* renamed from: com.ss.ttvideoengine.j */
public class C46128j implements MediaPlayer {

    /* renamed from: d */
    private static boolean f118027d;

    /* renamed from: a */
    public boolean f118028a;

    /* renamed from: b */
    public String f118029b = "";

    /* renamed from: c */
    private MediaPlayerClient f118030c;

    public void selectTrack(int i) {
    }

    public void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
    }

    /* renamed from: a */
    public static boolean m144555a() {
        if (f118027d) {
            return true;
        }
        try {
            Class.forName("com.ss.ttm.player.TTPlayerClient");
            f118027d = true;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public int getCurrentPosition() {
        if (this.f118030c != null) {
            return this.f118030c.getCurrentPosition();
        }
        return 0;
    }

    public String getDataSource() {
        if (this.f118030c != null) {
            return this.f118030c.getDataSource();
        }
        return null;
    }

    public int getDuration() {
        if (this.f118030c != null) {
            return this.f118030c.getDuration();
        }
        return 0;
    }

    public int getPlayerType() {
        if (this.f118030c != null) {
            return this.f118030c.getType();
        }
        return 0;
    }

    public TrackInfo[] getTrackInfo() {
        if (this.f118030c != null) {
            this.f118030c.getTrackInfo();
        }
        return null;
    }

    public int getVideoHeight() {
        if (this.f118030c != null) {
            return this.f118030c.getVideoHeight();
        }
        return 0;
    }

    public int getVideoType() {
        if (this.f118030c != null) {
            return this.f118030c.getVideoType();
        }
        return 0;
    }

    public int getVideoWidth() {
        if (this.f118030c != null) {
            return this.f118030c.getVideoWidth();
        }
        return 0;
    }

    public boolean isLooping() {
        if (this.f118030c != null) {
            return this.f118030c.isLooping();
        }
        return false;
    }

    public boolean isMute() {
        if (this.f118030c != null) {
            return this.f118030c.isMute();
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.f118030c != null) {
            return this.f118030c.isPlaying();
        }
        return false;
    }

    public void pause() {
        if (this.f118030c != null) {
            this.f118030c.pause();
        }
    }

    public void prepare() {
        if (this.f118030c != null) {
            this.f118030c.prepare();
        }
    }

    public void prepareAsync() {
        if (this.f118030c != null) {
            this.f118030c.prepareAsync();
        }
    }

    public void prevClose() {
        if (this.f118030c != null) {
            this.f118030c.prevClose();
        }
    }

    public void release() {
        if (this.f118030c != null) {
            this.f118030c.release();
        }
    }

    public void releaseAsync() {
        if (this.f118030c != null) {
            this.f118030c.releaseAsync();
        }
    }

    public void reset() {
        if (this.f118030c != null) {
            this.f118030c.reset();
        }
    }

    public void start() {
        if (this.f118030c != null) {
            this.f118030c.start();
        }
    }

    public void stop() {
        if (this.f118030c != null) {
            this.f118030c.stop();
        }
    }

    /* renamed from: b */
    public static String m144556b() {
        try {
            return Class.forName("com.ss.ttmplugin.player.TTVersion").getField("VERSION_NAME").get(null).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public boolean isOSPlayer() {
        if (this.f118030c == null || this.f118030c.getType() == 0) {
            return true;
        }
        return false;
    }

    public void deselectTrack(int i) {
        if (this.f118030c != null) {
            this.f118030c.deselectTrack(i);
        }
    }

    public int getSelectedTrack(int i) {
        if (this.f118030c != null) {
            this.f118030c.getSelectedTrack(i);
        }
        return 0;
    }

    public String getStringOption(int i) {
        if (this.f118030c != null) {
            return this.f118030c.getStringOption(i);
        }
        return null;
    }

    public void seekTo(int i) {
        if (this.f118030c != null) {
            this.f118030c.seekTo(i);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.f118030c != null) {
            this.f118030c.setDisplay(surfaceHolder);
        }
    }

    public void setIsMute(boolean z) {
        if (this.f118030c != null) {
            this.f118030c.setIsMute(z);
        }
    }

    public void setLooping(boolean z) {
        if (this.f118030c != null) {
            this.f118030c.setLooping(z);
        }
    }

    public void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        if (this.f118030c != null) {
            this.f118030c.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        if (this.f118030c != null) {
            this.f118030c.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.f118030c != null) {
            this.f118030c.setOnErrorListener(onErrorListener);
        }
    }

    public void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
        if (this.f118030c != null) {
            this.f118030c.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        if (this.f118030c != null) {
            this.f118030c.setOnInfoListener(onInfoListener);
        }
    }

    public void setOnLogListener(OnLogListener onLogListener) {
        if (this.f118030c != null) {
            this.f118030c.setOnLogListener(onLogListener);
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.f118030c != null) {
            this.f118030c.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        if (this.f118030c != null) {
            this.f118030c.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (this.f118030c != null) {
            this.f118030c.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (this.f118030c != null) {
            this.f118030c.setPanoVideoControlModel(i);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.f118030c != null) {
            this.f118030c.setPlaybackParams(playbackParams);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.f118030c != null) {
            this.f118030c.setScreenOnWhilePlaying(z);
        }
    }

    public void takeScreenshot(OnScreenshotListener onScreenshotListener) {
        if (this.f118030c != null) {
            this.f118030c.takeScreenshot(onScreenshotListener);
        }
    }

    public void setSurface(Surface surface) {
        if ((surface == null || surface.isValid()) && this.f118030c != null) {
            this.f118030c.setSurface(surface);
        }
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
        if (this.f118030c != null) {
            this.f118030c.setDataSource(iMediaDataSource);
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f118030c != null) {
            this.f118030c.setDataSource(str);
        }
    }

    public float getFloatOption(int i, float f) {
        if (this.f118030c != null) {
            return this.f118030c.getFloatOption(i, f);
        }
        return f;
    }

    public int getIntOption(int i, int i2) {
        if (this.f118030c != null) {
            return this.f118030c.getIntOption(i, i2);
        }
        return i2;
    }

    public long getLongOption(int i, long j) {
        if (this.f118030c != null) {
            return this.f118030c.getLongOption(i, j);
        }
        return j;
    }

    public void rotateCamera(float f, float f2) {
        if (this.f118030c != null) {
            this.f118030c.rotateCamera(f, f2);
        }
    }

    public void setCacheFile(String str, int i) {
        if (this.f118030c != null) {
            this.f118030c.setCacheFile(str, i);
        }
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f118030c != null) {
            this.f118030c.setDataSource(context, uri);
        }
    }

    public int setFloatOption(int i, float f) {
        if (this.f118030c != null) {
            this.f118030c.setFloatOption(i, f);
        }
        return 0;
    }

    public void setIntOption(int i, int i2) {
        if (this.f118030c != null) {
            this.f118030c.setIntOption(i, i2);
        }
    }

    public long setLongOption(int i, long j) {
        if (this.f118030c != null) {
            return (long) this.f118030c.setLongOption(i, j);
        }
        return -1;
    }

    public void setStringOption(int i, String str) {
        if (this.f118030c != null) {
            this.f118030c.setStringOption(i, str);
        }
    }

    public void setVolume(float f, float f2) {
        if (this.f118030c != null) {
            this.f118030c.setVolume(f, f2);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (this.f118030c != null) {
            this.f118030c.setWakeMode(context, i);
        }
    }

    public void switchStream(int i, int i2) {
        if (this.f118030c != null) {
            this.f118030c.switchStream(i, i2);
        }
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (this.f118030c != null) {
            this.f118030c.mouseEvent(i, i2, i3);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f118030c != null) {
            this.f118030c.setDataSource(context, uri, map);
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
        if (this.f118030c != null) {
            this.f118030c.setDataSource(fileDescriptor, j, j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7 A[Catch:{ Throwable -> 0x00d5, all -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018d A[Catch:{ Throwable -> 0x00d5, all -> 0x0083 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.ttm.player.MediaPlayer m144554a(android.content.Context r10, int r11, java.util.HashMap<java.lang.Integer, java.lang.Integer> r12) {
        /*
            com.ss.ttvideoengine.j r0 = new com.ss.ttvideoengine.j
            r0.<init>()
            java.lang.Class<com.ss.ttvideoengine.j> r1 = com.p280ss.ttvideoengine.C46128j.class
            monitor-enter(r1)
            r2 = 10
            r3 = 7
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r12 == 0) goto L_0x0086
            r8 = 100
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Object r8 = r12.get(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0083 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0083 }
            if (r8 != r7) goto L_0x0086
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0083 }
            java.lang.Object r8 = r12.get(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0083 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x0086
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0083 }
            java.lang.Object r8 = r12.get(r8)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0083 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0083 }
            if (r8 != r7) goto L_0x006f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0083 }
            java.lang.Object r3 = r12.get(r3)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0083 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0083 }
            if (r3 != r7) goto L_0x006f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0083 }
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0083 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0083 }
            if (r2 < r4) goto L_0x006f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0083 }
            r12.put(r2, r3)     // Catch:{ all -> 0x0083 }
            goto L_0x00a1
        L_0x006f:
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0083 }
            java.lang.Object r2 = r12.get(r2)     // Catch:{ all -> 0x0083 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0083 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0083 }
            if (r2 != 0) goto L_0x00a1
            goto L_0x0189
        L_0x0083:
            r10 = move-exception
            goto L_0x0195
        L_0x0086:
            boolean r8 = com.p280ss.ttm.player.TTPlayerConfiger.isOnTTPlayer()     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x00a1
            boolean r8 = com.p280ss.ttm.player.TTPlayerConfiger.getValue(r5, r6)     // Catch:{ all -> 0x0083 }
            if (r8 == 0) goto L_0x0189
            int r3 = com.p280ss.ttm.player.TTPlayerConfiger.getValue(r3, r6)     // Catch:{ all -> 0x0083 }
            if (r3 == r7) goto L_0x009e
            int r2 = com.p280ss.ttm.player.TTPlayerConfiger.getValue(r2, r6)     // Catch:{ all -> 0x0083 }
            if (r2 < r4) goto L_0x0189
        L_0x009e:
            com.p280ss.ttm.player.TTPlayerConfiger.setValue(r5, r6)     // Catch:{ all -> 0x0083 }
        L_0x00a1:
            boolean r2 = com.p280ss.ttvideoengine.TTVideoEngine.isForceUseLitePlayer()     // Catch:{ all -> 0x0083 }
            if (r2 != 0) goto L_0x0152
            boolean r2 = com.p280ss.ttvideoengine.TTVideoEngine.isForceUsePluginPlayer()     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x00de
            java.lang.String r2 = "com.ss.ttmplugin.player.TTPlayerClient"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x00d5 }
            java.lang.String r3 = "create"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x00d5 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r9 = com.p280ss.ttm.player.MediaPlayer.class
            r8[r6] = r9     // Catch:{ Throwable -> 0x00d5 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r7] = r9     // Catch:{ Throwable -> 0x00d5 }
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r8)     // Catch:{ Throwable -> 0x00d5 }
            r3.setAccessible(r7)     // Catch:{ Throwable -> 0x00d5 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x00d5 }
            r8[r6] = r0     // Catch:{ Throwable -> 0x00d5 }
            r8[r7] = r10     // Catch:{ Throwable -> 0x00d5 }
            java.lang.Object r2 = r3.invoke(r2, r8)     // Catch:{ Throwable -> 0x00d5 }
            com.ss.ttm.player.MediaPlayerClient r2 = (com.p280ss.ttm.player.MediaPlayerClient) r2     // Catch:{ Throwable -> 0x00d5 }
            r0.f118030c = r2     // Catch:{ Throwable -> 0x00d5 }
            goto L_0x00de
        L_0x00d5:
            r2 = move-exception
            r0.f118028a = r7     // Catch:{ all -> 0x0083 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0083 }
            r0.f118029b = r2     // Catch:{ all -> 0x0083 }
        L_0x00de:
            com.ss.ttm.player.MediaPlayerClient r2 = r0.f118030c     // Catch:{ all -> 0x0083 }
            if (r2 != 0) goto L_0x0189
            java.lang.String r2 = "com.ss.ttm.player.TTPlayerClient"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x0112 }
            java.lang.String r3 = "create"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0112 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r9 = com.p280ss.ttm.player.MediaPlayer.class
            r8[r6] = r9     // Catch:{ Throwable -> 0x0112 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r7] = r9     // Catch:{ Throwable -> 0x0112 }
            java.lang.Class<java.util.HashMap> r9 = java.util.HashMap.class
            r8[r5] = r9     // Catch:{ Throwable -> 0x0112 }
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r8)     // Catch:{ Throwable -> 0x0112 }
            r3.setAccessible(r7)     // Catch:{ Throwable -> 0x0112 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0112 }
            r4[r6] = r0     // Catch:{ Throwable -> 0x0112 }
            r4[r7] = r10     // Catch:{ Throwable -> 0x0112 }
            r4[r5] = r12     // Catch:{ Throwable -> 0x0112 }
            java.lang.Object r12 = r3.invoke(r2, r4)     // Catch:{ Throwable -> 0x0112 }
            com.ss.ttm.player.MediaPlayerClient r12 = (com.p280ss.ttm.player.MediaPlayerClient) r12     // Catch:{ Throwable -> 0x0112 }
            r0.f118030c = r12     // Catch:{ Throwable -> 0x0112 }
            f118027d = r7     // Catch:{ Throwable -> 0x0112 }
            goto L_0x011b
        L_0x0112:
            r12 = move-exception
            r0.f118028a = r7     // Catch:{ all -> 0x0083 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0083 }
            r0.f118029b = r12     // Catch:{ all -> 0x0083 }
        L_0x011b:
            com.ss.ttm.player.MediaPlayerClient r12 = r0.f118030c     // Catch:{ all -> 0x0083 }
            if (r12 != 0) goto L_0x0152
            java.lang.String r12 = "com.ss.ttm.player.TTPlayerClient"
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch:{ Throwable -> 0x0149 }
            java.lang.String r2 = "create"
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x0149 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r4 = com.p280ss.ttm.player.MediaPlayer.class
            r3[r6] = r4     // Catch:{ Throwable -> 0x0149 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r7] = r4     // Catch:{ Throwable -> 0x0149 }
            java.lang.reflect.Method r2 = r12.getDeclaredMethod(r2, r3)     // Catch:{ Throwable -> 0x0149 }
            r2.setAccessible(r7)     // Catch:{ Throwable -> 0x0149 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0149 }
            r3[r6] = r0     // Catch:{ Throwable -> 0x0149 }
            r3[r7] = r10     // Catch:{ Throwable -> 0x0149 }
            java.lang.Object r12 = r2.invoke(r12, r3)     // Catch:{ Throwable -> 0x0149 }
            com.ss.ttm.player.MediaPlayerClient r12 = (com.p280ss.ttm.player.MediaPlayerClient) r12     // Catch:{ Throwable -> 0x0149 }
            r0.f118030c = r12     // Catch:{ Throwable -> 0x0149 }
            f118027d = r7     // Catch:{ Throwable -> 0x0149 }
            goto L_0x0152
        L_0x0149:
            r12 = move-exception
            r0.f118028a = r7     // Catch:{ all -> 0x0083 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0083 }
            r0.f118029b = r12     // Catch:{ all -> 0x0083 }
        L_0x0152:
            com.ss.ttm.player.MediaPlayerClient r12 = r0.f118030c     // Catch:{ all -> 0x0083 }
            if (r12 != 0) goto L_0x0189
            if (r11 == r7) goto L_0x0189
            java.lang.String r11 = "com.ss.ttmplayer.player.TTPlayerClient"
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ Throwable -> 0x0180 }
            java.lang.String r12 = "create"
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x0180 }
            java.lang.Class<com.ss.ttm.player.MediaPlayer> r3 = com.p280ss.ttm.player.MediaPlayer.class
            r2[r6] = r3     // Catch:{ Throwable -> 0x0180 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r7] = r3     // Catch:{ Throwable -> 0x0180 }
            java.lang.reflect.Method r12 = r11.getDeclaredMethod(r12, r2)     // Catch:{ Throwable -> 0x0180 }
            r12.setAccessible(r7)     // Catch:{ Throwable -> 0x0180 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0180 }
            r2[r6] = r0     // Catch:{ Throwable -> 0x0180 }
            r2[r7] = r10     // Catch:{ Throwable -> 0x0180 }
            java.lang.Object r11 = r12.invoke(r11, r2)     // Catch:{ Throwable -> 0x0180 }
            com.ss.ttm.player.MediaPlayerClient r11 = (com.p280ss.ttm.player.MediaPlayerClient) r11     // Catch:{ Throwable -> 0x0180 }
            r0.f118030c = r11     // Catch:{ Throwable -> 0x0180 }
            goto L_0x0189
        L_0x0180:
            r11 = move-exception
            r0.f118028a = r7     // Catch:{ all -> 0x0083 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0083 }
            r0.f118029b = r11     // Catch:{ all -> 0x0083 }
        L_0x0189:
            com.ss.ttm.player.MediaPlayerClient r11 = r0.f118030c     // Catch:{ all -> 0x0083 }
            if (r11 != 0) goto L_0x0193
            com.ss.ttm.player.OSPlayerClient r10 = com.p280ss.ttm.player.OSPlayerClient.create(r0, r10)     // Catch:{ all -> 0x0083 }
            r0.f118030c = r10     // Catch:{ all -> 0x0083 }
        L_0x0193:
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            return r0
        L_0x0195:
            monitor-exit(r1)     // Catch:{ all -> 0x0083 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.C46128j.m144554a(android.content.Context, int, java.util.HashMap):com.ss.ttm.player.MediaPlayer");
    }
}
