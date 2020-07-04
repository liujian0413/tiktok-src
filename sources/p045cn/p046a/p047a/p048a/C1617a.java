package p045cn.p046a.p047a.p048a;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer.TrackInfo;
import android.media.PlaybackParams;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.Map;
import p045cn.p046a.p047a.p048a.C1627c.C1628a;
import p045cn.p046a.p047a.p048a.C1627c.C1629b;
import p045cn.p046a.p047a.p048a.C1627c.C1630c;
import p045cn.p046a.p047a.p048a.C1627c.C1631d;
import p045cn.p046a.p047a.p048a.C1627c.C1632e;
import p045cn.p046a.p047a.p048a.C1627c.C1633f;
import p045cn.p046a.p047a.p048a.C1627c.C1634g;
import p045cn.p046a.p047a.p048a.C1627c.C1635h;

/* renamed from: cn.a.a.a.a */
public final class C1617a extends C1637e {

    /* renamed from: a */
    protected C1631d f6031a;

    /* renamed from: b */
    protected C1630c f6032b;

    /* renamed from: c */
    protected C1632e f6033c;

    /* renamed from: d */
    protected C1629b f6034d;

    /* renamed from: e */
    protected C1633f f6035e;

    /* renamed from: f */
    protected C1628a f6036f;

    /* renamed from: g */
    private MediaPlayer f6037g;

    /* renamed from: h */
    private C1627c f6038h;

    /* renamed from: cn.a.a.a.a$a */
    static class C1619a implements OnBufferingUpdateListener {

        /* renamed from: a */
        private C1628a f6040a;

        /* renamed from: b */
        private C1627c f6041b;

        public C1619a(C1628a aVar, C1627c cVar) {
            this.f6041b = cVar;
            this.f6040a = aVar;
        }

        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            this.f6040a.mo7019a(this.f6041b, i);
        }
    }

    /* renamed from: cn.a.a.a.a$b */
    static class C1620b implements OnCompletionListener {

        /* renamed from: a */
        private C1629b f6042a;

        /* renamed from: b */
        private C1627c f6043b;

        public final void onCompletion(MediaPlayer mediaPlayer) {
            this.f6042a.mo7020a(this.f6043b);
        }

        public C1620b(C1629b bVar, C1627c cVar) {
            this.f6043b = cVar;
            this.f6042a = bVar;
        }
    }

    /* renamed from: cn.a.a.a.a$c */
    static class C1621c implements OnErrorListener {

        /* renamed from: a */
        private C1630c f6044a;

        /* renamed from: b */
        private C1627c f6045b;

        public C1621c(C1630c cVar, C1627c cVar2) {
            this.f6045b = cVar2;
            this.f6044a = cVar;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return this.f6044a.mo7021a(this.f6045b, i, i2);
        }
    }

    /* renamed from: cn.a.a.a.a$d */
    static class C1622d implements OnInfoListener {

        /* renamed from: a */
        private C1631d f6046a;

        /* renamed from: b */
        private C1627c f6047b;

        public C1622d(C1631d dVar, C1627c cVar) {
            this.f6047b = cVar;
            this.f6046a = dVar;
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            return this.f6046a.mo7022a(this.f6047b, i, i2);
        }
    }

    /* renamed from: cn.a.a.a.a$e */
    static class C1623e implements OnPreparedListener {

        /* renamed from: a */
        private C1632e f6048a;

        /* renamed from: b */
        private C1627c f6049b;

        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.f6048a.mo7023a(this.f6049b);
        }

        public C1623e(C1632e eVar, C1627c cVar) {
            this.f6048a = eVar;
            this.f6049b = cVar;
        }
    }

    /* renamed from: cn.a.a.a.a$f */
    static class C1624f implements OnSeekCompleteListener {

        /* renamed from: a */
        private C1633f f6050a;

        /* renamed from: b */
        private C1627c f6051b;

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            this.f6050a.mo7024a(this.f6051b);
        }

        public C1624f(C1633f fVar, C1627c cVar) {
            this.f6050a = fVar;
            this.f6051b = cVar;
        }
    }

    /* renamed from: cn.a.a.a.a$g */
    static class C1625g implements OnVideoSizeChangedListener {

        /* renamed from: a */
        private C1634g f6052a;

        /* renamed from: b */
        private C1627c f6053b;

        public C1625g(C1634g gVar, C1627c cVar) {
            this.f6052a = gVar;
            this.f6053b = cVar;
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            this.f6052a.mo7025a(this.f6053b, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo6991a(boolean z) {
        if (this.f6037g != null) {
            this.f6037g.setLooping(z);
        }
    }

    /* renamed from: a */
    public final void mo6982a(C1628a aVar) {
        this.f6036f = aVar;
        this.f6037g.setOnBufferingUpdateListener(new C1619a(aVar, this.f6038h));
    }

    /* renamed from: a */
    public final void mo6983a(C1629b bVar) {
        this.f6034d = bVar;
        this.f6037g.setOnCompletionListener(new C1620b(bVar, this.f6038h));
    }

    /* renamed from: a */
    public final void mo6984a(C1630c cVar) {
        this.f6032b = cVar;
        this.f6037g.setOnErrorListener(new C1621c(cVar, this.f6038h));
    }

    /* renamed from: a */
    public final void mo6985a(C1631d dVar) {
        this.f6031a = dVar;
        this.f6037g.setOnInfoListener(new C1622d(dVar, this.f6038h));
    }

    /* renamed from: a */
    public final void mo6986a(C1632e eVar) {
        this.f6033c = eVar;
        this.f6037g.setOnPreparedListener(new C1623e(eVar, this.f6038h));
    }

    /* renamed from: a */
    public final void mo6987a(C1633f fVar) {
        this.f6035e = fVar;
        this.f6037g.setOnSeekCompleteListener(new C1624f(fVar, this.f6038h));
    }

    /* renamed from: a */
    public final void mo6988a(C1634g gVar) {
        this.f6037g.setOnVideoSizeChangedListener(new C1625g(gVar, this.f6038h));
    }

    /* renamed from: a */
    public final void mo6990a(String str) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.f6037g.setDataSource(str);
    }

    /* renamed from: a */
    public final void mo6989a(C1636d dVar) {
        PlaybackParams playbackParams = new PlaybackParams();
        dVar.mo7028b(dVar.f6061d);
        dVar.mo7027a(dVar.f6059b);
        dVar.mo7026a(dVar.f6060c);
        if (this.f6037g != null) {
            this.f6037g.setPlaybackParams(playbackParams);
        }
    }

    /* renamed from: a */
    public final void mo6974a() {
        if (this.f6037g != null) {
            this.f6037g.release();
        }
    }

    /* renamed from: b */
    public final void mo6992b() {
        if (this.f6037g != null) {
            this.f6037g.start();
        }
    }

    /* renamed from: c */
    public final void mo6995c() {
        if (this.f6037g != null) {
            this.f6037g.pause();
        }
    }

    /* renamed from: e */
    public final void mo6999e() {
        if (this.f6037g != null) {
            this.f6037g.stop();
        }
    }

    /* renamed from: f */
    public final void mo7000f() {
        if (this.f6037g != null) {
            try {
                this.f6037g.prepare();
            } catch (IllegalStateException unused) {
            } catch (IOException unused2) {
            }
        }
    }

    /* renamed from: g */
    public final void mo7001g() {
        if (this.f6037g != null) {
            this.f6037g.prepareAsync();
        }
    }

    /* renamed from: h */
    public final int mo7002h() {
        if (this.f6037g != null) {
            return this.f6037g.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo7003i() {
        if (this.f6037g != null) {
            return this.f6037g.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: j */
    public final int mo7004j() {
        if (this.f6037g != null) {
            return this.f6037g.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: k */
    public final int mo7005k() {
        if (this.f6037g != null) {
            return this.f6037g.getDuration();
        }
        return 0;
    }

    /* renamed from: l */
    public final boolean mo7006l() {
        if (this.f6037g != null) {
            return this.f6037g.isPlaying();
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo7007m() {
        if (this.f6037g != null) {
            return this.f6037g.isLooping();
        }
        return false;
    }

    /* renamed from: n */
    public final void mo7008n() {
        new Thread(new Runnable() {
            public final void run() {
                C1617a.this.mo6974a();
            }
        }).start();
    }

    /* renamed from: d */
    public final void mo6998d() {
        if (this.f6037g != null) {
            this.f6037g.reset();
        }
    }

    /* renamed from: o */
    public final C1635h[] mo7009o() {
        if (this.f6037g != null) {
            TrackInfo[] trackInfo = this.f6037g.getTrackInfo();
            if (trackInfo != null) {
                C1635h[] hVarArr = new C1635h[trackInfo.length];
                int length = trackInfo.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    hVarArr[i2] = new C1635h(trackInfo[i]);
                    i++;
                    i2 = i3;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public final int mo6997d(int i) {
        if (this.f6037g != null) {
            return this.f6037g.getSelectedTrack(i);
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo6993b(int i) {
        if (this.f6037g != null) {
            this.f6037g.selectTrack(i);
        }
    }

    /* renamed from: c */
    public final void mo6996c(int i) {
        if (this.f6037g != null) {
            this.f6037g.deselectTrack(i);
        }
    }

    /* renamed from: b */
    public final void mo6994b(boolean z) {
        if (this.f6037g != null) {
            this.f6037g.setScreenOnWhilePlaying(z);
        }
    }

    /* renamed from: a */
    public final void mo6976a(int i) {
        if (this.f6037g != null) {
            this.f6037g.seekTo(i);
        }
    }

    /* renamed from: a */
    public final void mo6980a(Surface surface) {
        this.f6037g.setSurface(surface);
    }

    /* renamed from: a */
    public final void mo6981a(SurfaceHolder surfaceHolder) {
        if (this.f6037g != null && surfaceHolder != null && surfaceHolder.getSurface().isValid()) {
            try {
                this.f6037g.setDisplay(surfaceHolder);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo6977a(Context context, int i) {
        this.f6037g.setWakeMode(context, i);
    }

    /* renamed from: a */
    public static final synchronized C1617a m7932a(C1627c cVar, Context context) {
        C1617a aVar;
        synchronized (C1617a.class) {
            aVar = new C1617a();
            aVar.f6037g = new MediaPlayer();
            aVar.f6038h = null;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo6975a(float f, float f2) {
        if (this.f6037g != null) {
            this.f6037g.setVolume(f, f2);
        }
    }

    /* renamed from: a */
    public final void mo6978a(Context context, Uri uri) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.f6037g.setDataSource(context, uri);
    }

    /* renamed from: a */
    public final void mo6979a(Context context, Uri uri, Map<String, String> map) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        this.f6037g.setDataSource(context, uri, map);
    }
}
