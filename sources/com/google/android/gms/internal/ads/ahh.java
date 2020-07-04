package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.C14793ay;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@C6505uv
public final class ahh extends aht implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {

    /* renamed from: c */
    private static final Map<Integer, String> f40211c = new HashMap();

    /* renamed from: d */
    private final ail f40212d;

    /* renamed from: e */
    private final boolean f40213e;

    /* renamed from: f */
    private int f40214f;

    /* renamed from: g */
    private int f40215g;

    /* renamed from: h */
    private MediaPlayer f40216h;

    /* renamed from: i */
    private Uri f40217i;

    /* renamed from: j */
    private int f40218j;

    /* renamed from: k */
    private int f40219k;

    /* renamed from: l */
    private int f40220l;

    /* renamed from: m */
    private int f40221m;

    /* renamed from: n */
    private int f40222n;

    /* renamed from: o */
    private aii f40223o;

    /* renamed from: p */
    private boolean f40224p;

    /* renamed from: q */
    private int f40225q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ahr f40226r;

    public ahh(Context context, boolean z, boolean z2, aij aij, ail ail) {
        super(context);
        setSurfaceTextureListener(this);
        this.f40212d = ail;
        this.f40224p = z;
        this.f40213e = z2;
        this.f40212d.mo39478a(this);
    }

    /* renamed from: a */
    public final String mo39351a() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.f40224p ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    /* renamed from: a */
    public final void mo39354a(ahr ahr) {
        this.f40226r = ahr;
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzwr a = zzwr.m53213a(parse);
        if (a == null || a.f45767a != null) {
            if (a != null) {
                parse = Uri.parse(a.f45767a);
            }
            this.f40217i = parse;
            this.f40225q = 0;
            m45874f();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: b */
    public final void mo39355b() {
        acd.m45438a("AdMediaPlayerView stop");
        if (this.f40216h != null) {
            this.f40216h.stop();
            this.f40216h.release();
            this.f40216h = null;
            m45876h(0);
            this.f40215g = 0;
        }
        this.f40212d.mo39479b();
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        acd.m45438a(sb.toString());
        this.f40218j = mediaPlayer.getVideoWidth();
        this.f40219k = mediaPlayer.getVideoHeight();
        if (this.f40218j != 0 && this.f40219k != 0) {
            requestLayout();
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        acd.m45438a("AdMediaPlayerView prepared");
        m45876h(2);
        this.f40212d.mo39477a();
        acl.f40003a.post(new ahj(this));
        this.f40218j = mediaPlayer.getVideoWidth();
        this.f40219k = mediaPlayer.getVideoHeight();
        if (this.f40225q != 0) {
            mo39353a(this.f40225q);
        }
        m45875g();
        int i = this.f40218j;
        int i2 = this.f40219k;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        acd.m45781d(sb.toString());
        if (this.f40215g == 3) {
            mo39357c();
        }
        mo39359e();
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        acd.m45438a("AdMediaPlayerView completion");
        m45876h(5);
        this.f40215g = 5;
        acl.f40003a.post(new ahk(this));
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f40211c.get(Integer.valueOf(i));
        String str2 = (String) f40211c.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        acd.m45438a(sb.toString());
        return true;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f40211c.get(Integer.valueOf(i));
        String str2 = (String) f40211c.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        acd.m45783e(sb.toString());
        m45876h(-1);
        this.f40215g = -1;
        acl.f40003a.post(new ahl(this, str, str2));
        return true;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f40220l = i;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        acd.m45438a("AdMediaPlayerView surface created");
        m45874f();
        acl.f40003a.post(new ahm(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        acd.m45438a("AdMediaPlayerView surface changed");
        boolean z = false;
        boolean z2 = this.f40215g == 3;
        if (this.f40218j == i && this.f40219k == i2) {
            z = true;
        }
        if (this.f40216h != null && z2 && z) {
            if (this.f40225q != 0) {
                mo39353a(this.f40225q);
            }
            mo39357c();
        }
        if (this.f40223o != null) {
            this.f40223o.mo39452a(i, i2);
        }
        acl.f40003a.post(new ahn(this, i, i2));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        acd.m45438a("AdMediaPlayerView surface destroyed");
        if (this.f40216h != null && this.f40225q == 0) {
            this.f40225q = this.f40216h.getCurrentPosition();
        }
        if (this.f40223o != null) {
            this.f40223o.mo39454b();
        }
        acl.f40003a.post(new aho(this));
        m45873a(true);
        return true;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f40212d.mo39480b(this);
        this.f40241a.mo39442a(surfaceTexture, this.f40226r);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        acd.m45438a(sb.toString());
        acl.f40003a.post(new ahi(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r1 > r6) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f40218j
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.f40219k
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.f40218j
            if (r2 <= 0) goto L_0x0096
            int r2 = r5.f40219k
            if (r2 <= 0) goto L_0x0096
            com.google.android.gms.internal.ads.aii r2 = r5.f40223o
            if (r2 != 0) goto L_0x0096
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0055
            if (r1 != r2) goto L_0x0055
            int r0 = r5.f40218j
            int r0 = r0 * r7
            int r1 = r5.f40219k
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x0042
            int r6 = r5.f40218j
            int r6 = r6 * r7
            int r0 = r5.f40219k
            int r0 = r6 / r0
            r6 = r0
            goto L_0x0098
        L_0x0042:
            int r0 = r5.f40218j
            int r0 = r0 * r7
            int r1 = r5.f40219k
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0098
            int r7 = r5.f40219k
            int r7 = r7 * r6
            int r0 = r5.f40218j
            int r1 = r7 / r0
            goto L_0x0097
        L_0x0055:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0067
            int r0 = r5.f40219k
            int r0 = r0 * r6
            int r2 = r5.f40218j
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0065
            if (r0 <= r7) goto L_0x0065
            goto L_0x0098
        L_0x0065:
            r7 = r0
            goto L_0x0098
        L_0x0067:
            if (r1 != r2) goto L_0x0077
            int r1 = r5.f40218j
            int r1 = r1 * r7
            int r2 = r5.f40219k
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0075
            if (r1 <= r6) goto L_0x0075
            goto L_0x0098
        L_0x0075:
            r6 = r1
            goto L_0x0098
        L_0x0077:
            int r2 = r5.f40218j
            int r4 = r5.f40219k
            if (r1 != r3) goto L_0x0087
            if (r4 <= r7) goto L_0x0087
            int r1 = r5.f40218j
            int r1 = r1 * r7
            int r2 = r5.f40219k
            int r1 = r1 / r2
            goto L_0x0089
        L_0x0087:
            r1 = r2
            r7 = r4
        L_0x0089:
            if (r0 != r3) goto L_0x0075
            if (r1 <= r6) goto L_0x0075
            int r7 = r5.f40219k
            int r7 = r7 * r6
            int r0 = r5.f40218j
            int r1 = r7 / r0
            goto L_0x0097
        L_0x0096:
            r6 = r0
        L_0x0097:
            r7 = r1
        L_0x0098:
            r5.setMeasuredDimension(r6, r7)
            com.google.android.gms.internal.ads.aii r0 = r5.f40223o
            if (r0 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.aii r0 = r5.f40223o
            r0.mo39452a(r6, r7)
        L_0x00a4:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 != r1) goto L_0x00c1
            int r0 = r5.f40221m
            if (r0 <= 0) goto L_0x00b2
            int r0 = r5.f40221m
            if (r0 != r6) goto L_0x00ba
        L_0x00b2:
            int r0 = r5.f40222n
            if (r0 <= 0) goto L_0x00bd
            int r0 = r5.f40222n
            if (r0 == r7) goto L_0x00bd
        L_0x00ba:
            r5.m45875g()
        L_0x00bd:
            r5.f40221m = r6
            r5.f40222n = r7
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ahh.onMeasure(int, int):void");
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    /* renamed from: f */
    private final void m45874f() {
        acd.m45438a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f40217i != null && surfaceTexture != null) {
            m45873a(false);
            try {
                this.f40216h = new MediaPlayer();
                this.f40216h.setOnBufferingUpdateListener(this);
                this.f40216h.setOnCompletionListener(this);
                this.f40216h.setOnErrorListener(this);
                this.f40216h.setOnInfoListener(this);
                this.f40216h.setOnPreparedListener(this);
                this.f40216h.setOnVideoSizeChangedListener(this);
                this.f40220l = 0;
                if (this.f40224p) {
                    this.f40223o = new aii(getContext());
                    this.f40223o.mo39453a(surfaceTexture, getWidth(), getHeight());
                    this.f40223o.start();
                    SurfaceTexture c = this.f40223o.mo39455c();
                    if (c != null) {
                        surfaceTexture = c;
                    } else {
                        this.f40223o.mo39454b();
                        this.f40223o = null;
                    }
                }
                this.f40216h.setDataSource(getContext(), this.f40217i);
                this.f40216h.setSurface(new Surface(surfaceTexture));
                this.f40216h.setAudioStreamType(3);
                this.f40216h.setScreenOnWhilePlaying(true);
                this.f40216h.prepareAsync();
                m45876h(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.f40217i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                acd.m45780c(sb.toString(), e);
                onError(this.f40216h, 1, 0);
            }
        }
    }

    /* renamed from: g */
    private final void m45875g() {
        if (this.f40213e && m45877h() && this.f40216h.getCurrentPosition() > 0 && this.f40215g != 3) {
            acd.m45438a("AdMediaPlayerView nudging MediaPlayer");
            m45872a(0.0f);
            this.f40216h.start();
            int currentPosition = this.f40216h.getCurrentPosition();
            long a = C14793ay.m42901g().mo38684a();
            while (m45877h() && this.f40216h.getCurrentPosition() == currentPosition) {
                if (C14793ay.m42901g().mo38684a() - a > 250) {
                    break;
                }
            }
            this.f40216h.pause();
            mo39359e();
        }
    }

    /* renamed from: a */
    private final void m45873a(boolean z) {
        acd.m45438a("AdMediaPlayerView release");
        if (this.f40223o != null) {
            this.f40223o.mo39454b();
            this.f40223o = null;
        }
        if (this.f40216h != null) {
            this.f40216h.reset();
            this.f40216h.release();
            this.f40216h = null;
            m45876h(0);
            if (z) {
                this.f40215g = 0;
                this.f40215g = 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo39357c() {
        acd.m45438a("AdMediaPlayerView play");
        if (m45877h()) {
            this.f40216h.start();
            m45876h(3);
            this.f40241a.mo39441a();
            acl.f40003a.post(new ahp(this));
        }
        this.f40215g = 3;
    }

    /* renamed from: d */
    public final void mo39358d() {
        acd.m45438a("AdMediaPlayerView pause");
        if (m45877h() && this.f40216h.isPlaying()) {
            this.f40216h.pause();
            m45876h(4);
            acl.f40003a.post(new ahq(this));
        }
        this.f40215g = 4;
    }

    public final int getDuration() {
        if (m45877h()) {
            return this.f40216h.getDuration();
        }
        return -1;
    }

    public final int getCurrentPosition() {
        if (m45877h()) {
            return this.f40216h.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo39353a(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        acd.m45438a(sb.toString());
        if (m45877h()) {
            this.f40216h.seekTo(i);
            this.f40225q = 0;
            return;
        }
        this.f40225q = i;
    }

    /* renamed from: h */
    private final boolean m45877h() {
        return (this.f40216h == null || this.f40214f == -1 || this.f40214f == 0 || this.f40214f == 1) ? false : true;
    }

    /* renamed from: a */
    public final void mo39352a(float f, float f2) {
        if (this.f40223o != null) {
            this.f40223o.mo39451a(f, f2);
        }
    }

    public final int getVideoWidth() {
        if (this.f40216h != null) {
            return this.f40216h.getVideoWidth();
        }
        return 0;
    }

    public final int getVideoHeight() {
        if (this.f40216h != null) {
            return this.f40216h.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo39359e() {
        m45872a(this.f40242b.mo39486a());
    }

    /* renamed from: a */
    private final void m45872a(float f) {
        if (this.f40216h != null) {
            try {
                this.f40216h.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            acd.m45783e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* renamed from: h */
    private final void m45876h(int i) {
        if (i == 3) {
            this.f40212d.mo39481c();
            this.f40242b.mo39489b();
        } else if (this.f40214f == 3) {
            this.f40212d.mo39482d();
            this.f40242b.mo39490c();
        }
        this.f40214f = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo39356b(int i) {
        if (this.f40226r != null) {
            this.f40226r.onWindowVisibilityChanged(i);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f40211c.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            f40211c.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            f40211c.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            f40211c.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            f40211c.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f40211c.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        f40211c.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        f40211c.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        f40211c.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f40211c.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        f40211c.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        f40211c.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        f40211c.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        f40211c.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            f40211c.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f40211c.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }
}
