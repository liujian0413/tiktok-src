package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.C14793ay;
import java.nio.ByteBuffer;
import java.util.Arrays;

@C6505uv
public final class ajq extends aht implements SurfaceTextureListener, akp {

    /* renamed from: c */
    private final aik f40426c;

    /* renamed from: d */
    private final ail f40427d;

    /* renamed from: e */
    private final boolean f40428e;

    /* renamed from: f */
    private final aij f40429f;

    /* renamed from: g */
    private ahr f40430g;

    /* renamed from: h */
    private Surface f40431h;

    /* renamed from: i */
    private akh f40432i;

    /* renamed from: j */
    private String f40433j;

    /* renamed from: k */
    private String[] f40434k;

    /* renamed from: l */
    private boolean f40435l;

    /* renamed from: m */
    private int f40436m = 1;

    /* renamed from: n */
    private aii f40437n;

    /* renamed from: o */
    private final boolean f40438o;

    /* renamed from: p */
    private boolean f40439p;

    /* renamed from: q */
    private boolean f40440q;

    /* renamed from: r */
    private int f40441r;

    /* renamed from: s */
    private int f40442s;

    /* renamed from: t */
    private int f40443t;

    /* renamed from: u */
    private int f40444u;

    /* renamed from: v */
    private float f40445v;

    public ajq(Context context, ail ail, aik aik, boolean z, boolean z2, aij aij) {
        super(context);
        this.f40428e = z2;
        this.f40426c = aik;
        this.f40427d = ail;
        this.f40438o = z;
        this.f40429f = aij;
        setSurfaceTextureListener(this);
        this.f40427d.mo39478a(this);
    }

    /* renamed from: l */
    private final akh m46119l() {
        return new akh(this.f40426c.getContext(), this.f40429f);
    }

    /* renamed from: m */
    private final String m46120m() {
        return C14793ay.m42895a().mo39176b(this.f40426c.getContext(), this.f40426c.mo39472k().f45677a);
    }

    /* renamed from: n */
    private final boolean m46121n() {
        return this.f40432i != null && !this.f40435l;
    }

    /* renamed from: o */
    private final boolean m46122o() {
        return m46121n() && this.f40436m != 1;
    }

    /* renamed from: p */
    private final void m46123p() {
        if (this.f40432i == null && this.f40433j != null && this.f40431h != null) {
            if (this.f40433j.startsWith("cache:")) {
                alb a = this.f40426c.mo39459a(this.f40433j);
                if (a instanceof aly) {
                    this.f40432i = ((aly) a).mo39679c();
                } else if (a instanceof alx) {
                    alx alx = (alx) a;
                    String m = m46120m();
                    ByteBuffer c = alx.mo39678c();
                    boolean z = alx.f40616e;
                    String str = alx.f40615d;
                    if (str == null) {
                        acd.m45783e("Stream cache URL is null.");
                        return;
                    } else {
                        this.f40432i = m46119l();
                        this.f40432i.mo39626a(new Uri[]{Uri.parse(str)}, m, c, z);
                    }
                } else {
                    String str2 = "Stream cache miss: ";
                    String valueOf = String.valueOf(this.f40433j);
                    acd.m45783e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    return;
                }
            } else {
                this.f40432i = m46119l();
                String m2 = m46120m();
                Uri[] uriArr = new Uri[this.f40434k.length];
                for (int i = 0; i < this.f40434k.length; i++) {
                    uriArr[i] = Uri.parse(this.f40434k[i]);
                }
                this.f40432i.mo39625a(uriArr, m2);
            }
            this.f40432i.f40500c = this;
            m46117a(this.f40431h, false);
            this.f40436m = this.f40432i.f40499b.mo40848a();
            if (this.f40436m == 3) {
                m46124q();
            }
        }
    }

    /* renamed from: a */
    private final void m46117a(Surface surface, boolean z) {
        if (this.f40432i != null) {
            this.f40432i.mo39617a(surface, z);
        } else {
            acd.m45783e("Trying to set surface before player is initalized.");
        }
    }

    /* renamed from: a */
    private final void m46116a(float f, boolean z) {
        if (this.f40432i != null) {
            this.f40432i.mo39614a(f, z);
        } else {
            acd.m45783e("Trying to set volume before player is initalized.");
        }
    }

    /* renamed from: e */
    public final void mo39359e() {
        m46116a(this.f40242b.mo39486a(), false);
    }

    /* renamed from: q */
    private final void m46124q() {
        if (!this.f40439p) {
            this.f40439p = true;
            acl.f40003a.post(new ajr(this));
            mo39359e();
            this.f40427d.mo39477a();
            if (this.f40440q) {
                mo39357c();
            }
        }
    }

    /* renamed from: a */
    public final String mo39351a() {
        String valueOf = String.valueOf("ExoPlayer/3");
        String valueOf2 = String.valueOf(this.f40438o ? " spherical" : "");
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    public final void mo39354a(ahr ahr) {
        this.f40430g = ahr;
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.f40433j = str;
            this.f40434k = new String[]{str};
            m46123p();
        }
    }

    /* renamed from: a */
    public final void mo39402a(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.f40433j = str;
            this.f40434k = (String[]) Arrays.copyOf(strArr, strArr.length);
            m46123p();
        }
    }

    /* renamed from: c */
    public final void mo39357c() {
        if (m46122o()) {
            if (this.f40429f.f40311a) {
                m46126s();
            }
            this.f40432i.f40499b.mo40852a(true);
            this.f40427d.mo39481c();
            this.f40242b.mo39489b();
            this.f40241a.mo39441a();
            acl.f40003a.post(new aju(this));
            return;
        }
        this.f40440q = true;
    }

    /* renamed from: b */
    public final void mo39355b() {
        if (m46121n()) {
            this.f40432i.f40499b.mo40857c();
            if (this.f40432i != null) {
                m46117a((Surface) null, true);
                if (this.f40432i != null) {
                    this.f40432i.f40500c = null;
                    this.f40432i.mo39628c();
                    this.f40432i = null;
                }
                this.f40436m = 1;
                this.f40435l = false;
                this.f40439p = false;
                this.f40440q = false;
            }
        }
        this.f40427d.mo39482d();
        this.f40242b.mo39490c();
        this.f40427d.mo39479b();
    }

    /* renamed from: d */
    public final void mo39358d() {
        if (m46122o()) {
            if (this.f40429f.f40311a) {
                m46127t();
            }
            this.f40432i.f40499b.mo40852a(false);
            this.f40427d.mo39482d();
            this.f40242b.mo39490c();
            acl.f40003a.post(new ajv(this));
        }
    }

    /* renamed from: a */
    public final void mo39353a(int i) {
        if (m46122o()) {
            this.f40432i.f40499b.mo40849a((long) i);
        }
    }

    /* renamed from: c */
    public final void mo39403c(int i) {
        if (this.f40432i != null) {
            this.f40432i.f40498a.mo39602a(i);
        }
    }

    /* renamed from: d */
    public final void mo39404d(int i) {
        if (this.f40432i != null) {
            this.f40432i.f40498a.mo39607b(i);
        }
    }

    /* renamed from: e */
    public final void mo39405e(int i) {
        if (this.f40432i != null) {
            this.f40432i.f40498a.mo39609c(i);
        }
    }

    /* renamed from: f */
    public final void mo39406f(int i) {
        if (this.f40432i != null) {
            this.f40432i.f40498a.mo39611d(i);
        }
    }

    /* renamed from: g */
    public final void mo39407g(int i) {
        if (this.f40432i != null) {
            this.f40432i.mo39615a(i);
        }
    }

    /* renamed from: a */
    public final void mo39352a(float f, float f2) {
        if (this.f40437n != null) {
            this.f40437n.mo39451a(f, f2);
        }
    }

    public final int getCurrentPosition() {
        if (m46122o()) {
            return (int) this.f40432i.f40499b.mo40861g();
        }
        return 0;
    }

    public final int getDuration() {
        if (m46122o()) {
            return (int) this.f40432i.f40499b.mo40860f();
        }
        return 0;
    }

    public final int getVideoWidth() {
        return this.f40441r;
    }

    public final int getVideoHeight() {
        return this.f40442s;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f40445v != 0.0f && this.f40437n == null) {
            float f = (float) measuredWidth;
            float f2 = f / ((float) measuredHeight);
            if (this.f40445v > f2) {
                measuredHeight = (int) (f / this.f40445v);
            }
            if (this.f40445v < f2) {
                measuredWidth = (int) (((float) measuredHeight) * this.f40445v);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        if (this.f40437n != null) {
            this.f40437n.mo39452a(measuredWidth, measuredHeight);
        }
        if (VERSION.SDK_INT == 16) {
            if (((this.f40443t > 0 && this.f40443t != measuredWidth) || (this.f40444u > 0 && this.f40444u != measuredHeight)) && this.f40428e && m46121n()) {
                bks bks = this.f40432i.f40499b;
                if (bks.mo40861g() > 0 && !bks.mo40856b()) {
                    m46116a(0.0f, true);
                    bks.mo40852a(true);
                    long g = bks.mo40861g();
                    long a = C14793ay.m42901g().mo38684a();
                    while (m46121n() && bks.mo40861g() == g) {
                        if (C14793ay.m42901g().mo38684a() - a > 250) {
                            break;
                        }
                    }
                    bks.mo40852a(false);
                    mo39359e();
                }
            }
            this.f40443t = measuredWidth;
            this.f40444u = measuredHeight;
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f40438o) {
            this.f40437n = new aii(getContext());
            this.f40437n.mo39453a(surfaceTexture, i, i2);
            this.f40437n.start();
            SurfaceTexture c = this.f40437n.mo39455c();
            if (c != null) {
                surfaceTexture = c;
            } else {
                this.f40437n.mo39454b();
                this.f40437n = null;
            }
        }
        this.f40431h = new Surface(surfaceTexture);
        if (this.f40432i == null) {
            m46123p();
        } else {
            m46117a(this.f40431h, true);
            if (!this.f40429f.f40311a) {
                m46126s();
            }
        }
        if (this.f40441r == 0 || this.f40442s == 0) {
            m46118c(i, i2);
        } else {
            m46125r();
        }
        acl.f40003a.post(new ajw(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f40437n != null) {
            this.f40437n.mo39452a(i, i2);
        }
        acl.f40003a.post(new ajx(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f40427d.mo39480b(this);
        this.f40241a.mo39442a(surfaceTexture, this.f40430g);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo39358d();
        if (this.f40437n != null) {
            this.f40437n.mo39454b();
            this.f40437n = null;
        }
        if (this.f40432i != null) {
            m46127t();
            if (this.f40431h != null) {
                this.f40431h.release();
            }
            this.f40431h = null;
            m46117a((Surface) null, true);
        }
        acl.f40003a.post(new ajy(this));
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        acd.m45438a(sb.toString());
        acl.f40003a.post(new ajz(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: a */
    public final void mo39548a(boolean z, long j) {
        if (this.f40426c != null) {
            ago.f40189a.execute(new aka(this, z, j));
        }
    }

    /* renamed from: b */
    public final void mo39549b(int i) {
        if (this.f40436m != i) {
            this.f40436m = i;
            switch (i) {
                case 3:
                    m46124q();
                    return;
                case 4:
                    if (this.f40429f.f40311a) {
                        m46127t();
                    }
                    this.f40427d.mo39482d();
                    this.f40242b.mo39490c();
                    acl.f40003a.post(new ajs(this));
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo39545a(int i, int i2) {
        this.f40441r = i;
        this.f40442s = i2;
        m46125r();
    }

    /* renamed from: a */
    public final void mo39547a(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String str2 = "ExoPlayerAdapter error: ";
        String valueOf = String.valueOf(sb2);
        acd.m45783e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.f40435l = true;
        if (this.f40429f.f40311a) {
            m46127t();
        }
        acl.f40003a.post(new ajt(this, sb2));
    }

    /* renamed from: r */
    private final void m46125r() {
        m46118c(this.f40441r, this.f40442s);
    }

    /* renamed from: c */
    private final void m46118c(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.f40445v != f) {
            this.f40445v = f;
            requestLayout();
        }
    }

    /* renamed from: s */
    private final void m46126s() {
        if (this.f40432i != null) {
            this.f40432i.mo39622a(true);
        }
    }

    /* renamed from: t */
    private final void m46127t() {
        if (this.f40432i != null) {
            this.f40432i.mo39622a(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo39551b(boolean z, long j) {
        this.f40426c.mo39463a(z, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo39555h(int i) {
        if (this.f40430g != null) {
            this.f40430g.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo39552f() {
        if (this.f40430g != null) {
            this.f40430g.mo39394f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo39550b(int i, int i2) {
        if (this.f40430g != null) {
            this.f40430g.mo39388a(i, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo39553g() {
        if (this.f40430g != null) {
            this.f40430g.mo39387a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo39554h() {
        if (this.f40430g != null) {
            this.f40430g.mo39392d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo39556i() {
        if (this.f40430g != null) {
            this.f40430g.mo39391c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39546a(String str) {
        if (this.f40430g != null) {
            this.f40430g.mo39389a("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo39557j() {
        if (this.f40430g != null) {
            this.f40430g.mo39393e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo39558k() {
        if (this.f40430g != null) {
            this.f40430g.mo39390b();
        }
    }
}
