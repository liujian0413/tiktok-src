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
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import p045cn.p046a.p047a.p048a.C1617a;
import p045cn.p046a.p047a.p048a.C1627c;
import p045cn.p046a.p047a.p048a.C1627c.C1628a;
import p045cn.p046a.p047a.p048a.C1627c.C1629b;
import p045cn.p046a.p047a.p048a.C1627c.C1630c;
import p045cn.p046a.p047a.p048a.C1627c.C1631d;
import p045cn.p046a.p047a.p048a.C1627c.C1632e;
import p045cn.p046a.p047a.p048a.C1627c.C1633f;
import p045cn.p046a.p047a.p048a.C1627c.C1634g;
import p045cn.p046a.p047a.p048a.C1636d;
import p045cn.p046a.p047a.p048a.C1637e;
import p045cn.p046a.p047a.p048a.C1638f;

/* renamed from: com.ss.ttvideoengine.k */
public class C46129k implements MediaPlayer {

    /* renamed from: p */
    private static boolean f118031p;

    /* renamed from: a */
    public boolean f118032a;

    /* renamed from: b */
    public String f118033b = "";

    /* renamed from: c */
    public OnPreparedListener f118034c;

    /* renamed from: d */
    public OnSeekCompleteListener f118035d;

    /* renamed from: e */
    public OnBufferingUpdateListener f118036e;

    /* renamed from: f */
    public OnCompletionListener f118037f;

    /* renamed from: g */
    public OnErrorListener f118038g;

    /* renamed from: h */
    public OnExternInfoListener f118039h;

    /* renamed from: i */
    public OnVideoSizeChangedListener f118040i;

    /* renamed from: j */
    public OnLogListener f118041j;

    /* renamed from: k */
    public OnInfoListener f118042k;

    /* renamed from: l */
    public OnScreenshotListener f118043l;

    /* renamed from: m */
    public MediaPlayer f118044m;

    /* renamed from: n */
    private C1637e f118045n;

    /* renamed from: o */
    private MediaPlayerClient f118046o;

    public void prevClose() {
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) throws IllegalArgumentException, IOException {
    }

    public void setDataSource(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IllegalArgumentException, IOException {
    }

    public void setOnSARChangedListener(onSARChangedListener onsarchangedlistener) {
    }

    public void switchStream(int i, int i2) {
    }

    /* renamed from: a */
    public static boolean m144558a() {
        if (f118031p) {
            return true;
        }
        try {
            Class.forName("cn.org.mediakit.player.MKPlayerAdapter");
            f118031p = true;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public int getPlayerType() {
        if (this.f118045n == null && this.f118046o != null) {
            return 3;
        }
        return 0;
    }

    public boolean isMute() {
        if (this.f118045n == null && this.f118046o != null) {
            this.f118046o.isMute();
        }
        return false;
    }

    public boolean isOSPlayer() {
        if (this.f118045n != null || this.f118046o == null) {
            return true;
        }
        return false;
    }

    public int getCurrentPosition() {
        if (this.f118045n != null) {
            return this.f118045n.mo7002h();
        }
        if (this.f118046o != null) {
            return this.f118046o.getCurrentPosition();
        }
        return 0;
    }

    public String getDataSource() {
        if (this.f118045n == null && this.f118046o != null) {
            return this.f118046o.getDataSource();
        }
        return null;
    }

    public int getDuration() {
        if (this.f118045n != null) {
            return this.f118045n.mo7005k();
        }
        if (this.f118046o != null) {
            return this.f118046o.getDuration();
        }
        return 0;
    }

    public TrackInfo[] getTrackInfo() {
        if (this.f118045n != null) {
            this.f118045n.mo7009o();
            return null;
        }
        if (this.f118046o != null) {
            this.f118045n.mo7009o();
        }
        return null;
    }

    public int getVideoHeight() {
        if (this.f118045n != null) {
            return this.f118045n.mo7003i();
        }
        if (this.f118046o != null) {
            return this.f118046o.getVideoHeight();
        }
        return 0;
    }

    public int getVideoType() {
        if (this.f118045n == null && this.f118046o != null) {
            return this.f118046o.getVideoType();
        }
        return 0;
    }

    public int getVideoWidth() {
        if (this.f118045n != null) {
            return this.f118045n.mo7004j();
        }
        if (this.f118046o != null) {
            return this.f118046o.getVideoWidth();
        }
        return 0;
    }

    public boolean isLooping() {
        if (this.f118045n != null) {
            return this.f118045n.mo7007m();
        }
        if (this.f118046o != null) {
            return this.f118046o.isLooping();
        }
        return false;
    }

    public boolean isPlaying() {
        if (this.f118045n != null) {
            return this.f118045n.mo7006l();
        }
        if (this.f118046o != null) {
            return this.f118046o.isPlaying();
        }
        return false;
    }

    public void pause() {
        if (this.f118045n != null) {
            this.f118045n.mo6995c();
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.pause();
        }
    }

    public void prepare() {
        if (this.f118045n != null) {
            this.f118045n.mo7000f();
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.prepare();
        }
    }

    public void prepareAsync() {
        if (this.f118045n != null) {
            this.f118045n.mo7001g();
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.prepareAsync();
        }
    }

    public void release() {
        if (this.f118045n != null) {
            this.f118045n.mo6974a();
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.release();
        }
    }

    public void releaseAsync() {
        if (this.f118045n != null) {
            this.f118045n.mo7008n();
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.releaseAsync();
        }
    }

    public void reset() {
        if (this.f118045n != null) {
            this.f118045n.mo6998d();
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.reset();
        }
    }

    public void start() {
        if (this.f118045n != null) {
            this.f118045n.mo6992b();
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.start();
        }
    }

    public void stop() {
        if (this.f118045n != null) {
            this.f118045n.mo6999e();
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.stop();
        }
    }

    public void selectTrack(int i) {
        if (this.f118045n != null) {
            this.f118045n.mo6993b(i);
        }
    }

    public void setIsMute(boolean z) {
        if (this.f118045n == null && this.f118046o != null) {
            this.f118046o.setIsMute(z);
        }
    }

    public void setPanoVideoControlModel(int i) {
        if (this.f118045n == null && this.f118046o != null) {
            this.f118046o.setPanoVideoControlModel(i);
        }
    }

    public void deselectTrack(int i) {
        if (this.f118045n != null) {
            this.f118045n.mo6996c(i);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.deselectTrack(i);
        }
    }

    public int getSelectedTrack(int i) {
        if (this.f118045n != null) {
            this.f118045n.mo6997d(i);
        } else if (this.f118046o != null) {
            this.f118046o.getSelectedTrack(i);
        }
        return 0;
    }

    public String getStringOption(int i) {
        if (this.f118045n == null && this.f118046o != null) {
            return this.f118046o.getStringOption(i);
        }
        return null;
    }

    public void seekTo(int i) {
        if (this.f118045n != null) {
            this.f118045n.mo6976a(i);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.seekTo(i);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.f118045n != null) {
            this.f118045n.mo6981a(surfaceHolder);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setDisplay(surfaceHolder);
        }
    }

    public void setLooping(boolean z) {
        if (this.f118045n != null) {
            this.f118045n.mo6991a(z);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setLooping(z);
        }
    }

    public void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        if (this.f118045n != null) {
            this.f118036e = onBufferingUpdateListener;
            this.f118045n.mo6982a((C1628a) new C1628a() {
                /* renamed from: a */
                public final void mo7019a(C1627c cVar, int i) {
                    C46129k.this.f118036e.onBufferingUpdate(C46129k.this.f118044m, i);
                }
            });
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setOnBufferingUpdateListener(onBufferingUpdateListener);
        }
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        if (this.f118045n != null) {
            this.f118037f = onCompletionListener;
            this.f118045n.mo6983a((C1629b) new C1629b() {
                /* renamed from: a */
                public final void mo7020a(C1627c cVar) {
                    C46129k.this.f118037f.onCompletion(C46129k.this.f118044m);
                }
            });
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setOnCompletionListener(onCompletionListener);
        }
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        if (this.f118045n != null) {
            this.f118038g = onErrorListener;
            this.f118045n.mo6984a((C1630c) new C1630c() {
                /* renamed from: a */
                public final boolean mo7021a(C1627c cVar, int i, int i2) {
                    return C46129k.this.f118038g.onError(C46129k.this.f118044m, i, i2);
                }
            });
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setOnErrorListener(onErrorListener);
        }
    }

    public void setOnExternInfoListener(OnExternInfoListener onExternInfoListener) {
        if (this.f118045n != null) {
            this.f118039h = onExternInfoListener;
            new Object() {
            };
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setOnExternInfoListener(onExternInfoListener);
        }
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        if (this.f118045n != null) {
            this.f118042k = onInfoListener;
            this.f118045n.mo6985a((C1631d) new C1631d() {
                /* renamed from: a */
                public final boolean mo7022a(C1627c cVar, int i, int i2) {
                    return C46129k.this.f118042k.onInfo(C46129k.this.f118044m, i, i2);
                }
            });
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setOnInfoListener(onInfoListener);
        }
    }

    public void setOnLogListener(OnLogListener onLogListener) {
        if (this.f118045n != null) {
            this.f118041j = onLogListener;
            new Object() {
            };
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setOnLogListener(onLogListener);
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        if (this.f118045n != null) {
            this.f118034c = onPreparedListener;
            this.f118045n.mo6986a((C1632e) new C1632e() {
                /* renamed from: a */
                public final void mo7023a(C1627c cVar) {
                    C46129k.this.f118034c.onPrepared(C46129k.this.f118044m);
                }
            });
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        if (this.f118045n != null) {
            this.f118035d = onSeekCompleteListener;
            this.f118045n.mo6987a((C1633f) new C1633f() {
                /* renamed from: a */
                public final void mo7024a(C1627c cVar) {
                    C46129k.this.f118035d.onSeekComplete(C46129k.this.f118044m);
                }
            });
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setOnSeekCompleteListener(onSeekCompleteListener);
        }
    }

    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (this.f118045n != null) {
            this.f118040i = onVideoSizeChangedListener;
            this.f118045n.mo6988a((C1634g) new C1634g() {
                /* renamed from: a */
                public final void mo7025a(C1627c cVar, int i, int i2) {
                    C46129k.this.f118040i.onVideoSizeChanged(C46129k.this.f118044m, i, i2);
                }
            });
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
        }
    }

    public void setScreenOnWhilePlaying(boolean z) {
        if (this.f118045n != null) {
            this.f118045n.mo6994b(z);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setScreenOnWhilePlaying(z);
        }
    }

    public void setSurface(Surface surface) {
        if (surface != null && !surface.isValid()) {
            return;
        }
        if (this.f118045n != null) {
            this.f118045n.mo6980a(surface);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setSurface(surface);
        }
    }

    public void takeScreenshot(OnScreenshotListener onScreenshotListener) {
        if (this.f118045n != null) {
            this.f118043l = onScreenshotListener;
            new Object() {
            };
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.takeScreenshot(onScreenshotListener);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        if (this.f118045n != null) {
            C1636d dVar = new C1636d();
            dVar.mo7027a(playbackParams.getAudioFallbackMode());
            dVar.mo7026a(playbackParams.getPitch());
            dVar.mo7028b(playbackParams.getSpeed());
            this.f118045n.mo6989a(dVar);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setPlaybackParams(playbackParams);
        }
    }

    public void setDataSource(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f118045n != null) {
            this.f118045n.mo6990a(str);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setDataSource(str);
        }
    }

    public void rotateCamera(float f, float f2) {
        if (this.f118045n == null && this.f118046o != null) {
            this.f118046o.rotateCamera(f, f2);
        }
    }

    public void setCacheFile(String str, int i) {
        if (this.f118045n == null && this.f118046o != null) {
            this.f118046o.setCacheFile(str, i);
        }
    }

    public int setFloatOption(int i, float f) {
        if (this.f118045n == null && this.f118046o != null) {
            this.f118046o.setFloatOption(i, f);
        }
        return 0;
    }

    public void setIntOption(int i, int i2) {
        if (this.f118045n == null && this.f118046o != null) {
            this.f118046o.setIntOption(i, i2);
        }
    }

    public void setStringOption(int i, String str) {
        if (this.f118045n == null && this.f118046o != null) {
            this.f118046o.setStringOption(i, str);
        }
    }

    public float getFloatOption(int i, float f) {
        if (this.f118045n != null) {
            return C1637e.m7987a(i, f);
        }
        if (this.f118046o != null) {
            return this.f118046o.getFloatOption(i, f);
        }
        return f;
    }

    public long getLongOption(int i, long j) {
        if (this.f118045n != null) {
            return C1637e.m7989a(i, j);
        }
        if (this.f118046o != null) {
            return this.f118046o.getLongOption(i, j);
        }
        return j;
    }

    public void setDataSource(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f118045n != null) {
            this.f118045n.mo6978a(context, uri);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setDataSource(context, uri);
        }
    }

    public long setLongOption(int i, long j) {
        if (this.f118045n == null && this.f118046o != null) {
            return (long) this.f118046o.setLongOption(i, j);
        }
        return -1;
    }

    public void setVolume(float f, float f2) {
        if (this.f118045n != null) {
            this.f118045n.mo6975a(f, f2);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setVolume(f, f2);
        }
    }

    public void setWakeMode(Context context, int i) {
        if (this.f118045n != null) {
            this.f118045n.mo6977a(context, i);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setWakeMode(context, i);
        }
    }

    public int getIntOption(int i, int i2) {
        if (this.f118045n != null) {
            int a = C1637e.m7988a(i, i2);
            if (i == 141) {
                if (i2 == 1) {
                    return 0;
                }
                if (i2 == 2) {
                    return 1;
                }
            }
            return a;
        } else if (this.f118046o != null) {
            return this.f118046o.getIntOption(i, i2);
        } else {
            return i2;
        }
    }

    /* renamed from: a */
    public static MediaPlayer m144557a(Context context, int i) {
        C46129k kVar = new C46129k();
        kVar.f118044m = kVar;
        synchronized (C46129k.class) {
            if (C1638f.m8029a()) {
                if (!TTVideoEngine.isForceUseLitePlayer()) {
                    try {
                        Class cls = Class.forName("cn.org.mediakit.player.MKPlayerAdapter");
                        Method declaredMethod = cls.getDeclaredMethod("create", new Class[]{C1627c.class, Context.class});
                        declaredMethod.setAccessible(true);
                        kVar.f118045n = (C1637e) declaredMethod.invoke(cls, new Object[]{null, context});
                        f118031p = true;
                        C46123h.m144545a("MediaPlayerWrapperVer3", "using 3.0 player");
                    } catch (Throwable th) {
                        kVar.f118032a = true;
                        kVar.f118033b = th.toString();
                    }
                }
                if (kVar.f118045n == null && i != 1) {
                    try {
                        Class cls2 = Class.forName("com.ss.ttmplayer.player.TTPlayerClient");
                        Method declaredMethod2 = cls2.getDeclaredMethod("create", new Class[]{MediaPlayer.class, Context.class});
                        declaredMethod2.setAccessible(true);
                        kVar.f118046o = (MediaPlayerClient) declaredMethod2.invoke(cls2, new Object[]{kVar, context});
                    } catch (Throwable th2) {
                        kVar.f118032a = true;
                        kVar.f118033b = th2.toString();
                    }
                }
            }
            if (kVar.f118045n == null && kVar.f118046o == null) {
                kVar.f118045n = C1617a.m7932a((C1627c) null, context);
            }
        }
        return kVar;
    }

    public void mouseEvent(int i, int i2, int i3) {
        if (this.f118045n == null && this.f118046o != null) {
            this.f118046o.mouseEvent(i, i2, i3);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        if (this.f118045n != null) {
            this.f118045n.mo6979a(context, uri, map);
            return;
        }
        if (this.f118046o != null) {
            this.f118046o.setDataSource(context, uri, map);
        }
    }
}
