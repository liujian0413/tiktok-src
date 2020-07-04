package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.C14793ay;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.SideEffectFree;

@C6505uv
public final class aiw extends aht implements SurfaceTextureListener {

    /* renamed from: A */
    private int f40362A;

    /* renamed from: B */
    private final bgk f40363B = new ajk(this);

    /* renamed from: C */
    private final bhj f40364C = new ajl(this);

    /* renamed from: D */
    private final bgt f40365D = new ajm(this);

    /* renamed from: c */
    private float f40366c;

    /* renamed from: d */
    private final aik f40367d;

    /* renamed from: e */
    private final Context f40368e;

    /* renamed from: f */
    private final int f40369f;

    /* renamed from: g */
    private final ail f40370g;

    /* renamed from: h */
    private final boolean f40371h;

    /* renamed from: i */
    private final aij f40372i;

    /* renamed from: j */
    private ahr f40373j;

    /* renamed from: k */
    private Surface f40374k;

    /* renamed from: l */
    private aip f40375l;

    /* renamed from: m */
    private bgh f40376m;

    /* renamed from: n */
    private bhf f40377n;

    /* renamed from: o */
    private bgq f40378o;

    /* renamed from: p */
    private String f40379p;

    /* renamed from: q */
    private boolean f40380q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f40381r = 1;

    /* renamed from: s */
    private aii f40382s;

    /* renamed from: t */
    private boolean f40383t;

    /* renamed from: u */
    private boolean f40384u;

    /* renamed from: v */
    private boolean f40385v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f40386w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f40387x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public float f40388y;

    /* renamed from: z */
    private int f40389z;

    public aiw(Context context, ail ail, aik aik, int i, boolean z, boolean z2, aij aij) {
        super(context);
        this.f40368e = context;
        this.f40371h = z2;
        this.f40367d = aik;
        this.f40369f = i;
        this.f40370g = ail;
        this.f40383t = z;
        this.f40372i = aij;
        setSurfaceTextureListener(this);
        this.f40370g.mo39478a(this);
    }

    @EnsuresNonNullIf(expression = {"mPlayer"}, result = true)
    /* renamed from: l */
    private final boolean m46067l() {
        return this.f40376m != null && !this.f40380q;
    }

    @EnsuresNonNullIf(expression = {"mPlayer"}, result = true)
    /* renamed from: m */
    private final boolean m46068m() {
        return m46067l() && this.f40381r != 1;
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [com.google.android.gms.internal.ads.bgo] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m46069n() {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.bgh r0 = r12.f40376m
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = r12.f40379p
            if (r0 == 0) goto L_0x021e
            android.view.Surface r0 = r12.f40374k
            if (r0 == 0) goto L_0x021e
            java.lang.String r0 = r12.f40379p
            java.lang.String r1 = "cache:"
            boolean r0 = r0.startsWith(r1)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x012b
            com.google.android.gms.internal.ads.aik r0 = r12.f40367d
            java.lang.String r3 = r12.f40379p
            com.google.android.gms.internal.ads.alb r0 = r0.mo39459a(r3)
            if (r0 == 0) goto L_0x0039
            boolean r3 = r0 instanceof com.google.android.gms.internal.ads.alt
            if (r3 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.alt r0 = (com.google.android.gms.internal.ads.alt) r0
            r0.mo39674c()
            com.google.android.gms.internal.ads.aip r2 = r0.f40607d
            com.google.android.gms.internal.ads.bgk r0 = r12.f40363B
            com.google.android.gms.internal.ads.bhj r3 = r12.f40364C
            com.google.android.gms.internal.ads.bgt r4 = r12.f40365D
            r2.mo39493a(r0, r3, r4)
            goto L_0x01d0
        L_0x0039:
            boolean r3 = r0 instanceof com.google.android.gms.internal.ads.alo
            if (r3 == 0) goto L_0x010d
            com.google.android.gms.internal.ads.alo r0 = (com.google.android.gms.internal.ads.alo) r0
            java.nio.ByteBuffer r3 = r0.mo39670c()
            java.lang.String r4 = r0.f40594d
            boolean r0 = r0.f40595e
            com.google.android.gms.internal.ads.aip r5 = new com.google.android.gms.internal.ads.aip
            r5.<init>()
            java.lang.String r6 = "video/webm"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.bjh r2 = new com.google.android.gms.internal.ads.bjh
            r2.<init>()
        L_0x0059:
            r9 = r2
            goto L_0x0061
        L_0x005b:
            com.google.android.gms.internal.ads.biv r2 = new com.google.android.gms.internal.ads.biv
            r2.<init>()
            goto L_0x0059
        L_0x0061:
            if (r0 == 0) goto L_0x0087
            int r0 = r3.limit()
            if (r0 <= 0) goto L_0x0087
            int r0 = r3.limit()
            byte[] r0 = new byte[r0]
            r3.get(r0)
            com.google.android.gms.internal.ads.bjo r8 = new com.google.android.gms.internal.ads.bjo
            r8.<init>(r0)
            com.google.android.gms.internal.ads.big r0 = new com.google.android.gms.internal.ads.big
            android.net.Uri r7 = android.net.Uri.parse(r4)
            r10 = 2
            com.google.android.gms.internal.ads.aij r2 = r12.f40372i
            int r11 = r2.f40313c
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00f4
        L_0x0087:
            com.google.android.gms.internal.ads.acl r0 = com.google.android.gms.ads.internal.C14793ay.m42895a()
            com.google.android.gms.internal.ads.aik r2 = r12.f40367d
            android.content.Context r2 = r2.getContext()
            com.google.android.gms.internal.ads.aik r6 = r12.f40367d
            com.google.android.gms.internal.ads.zzbgz r6 = r6.mo39472k()
            java.lang.String r6 = r6.f45677a
            java.lang.String r0 = r0.mo39176b(r2, r6)
            com.google.android.gms.internal.ads.bju r2 = new com.google.android.gms.internal.ads.bju
            com.google.android.gms.internal.ads.aik r6 = r12.f40367d
            android.content.Context r6 = r6.getContext()
            r2.<init>(r6, r0)
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15585bw.f43898cm
            com.google.android.gms.internal.ads.bt r6 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r0 = r6.mo41272a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c7
            com.google.android.gms.internal.ads.ajn r0 = new com.google.android.gms.internal.ads.ajn
            android.content.Context r6 = r12.f40368e
            com.google.android.gms.internal.ads.aiy r7 = new com.google.android.gms.internal.ads.aiy
            r7.<init>(r12)
            r0.<init>(r6, r2, r7)
            goto L_0x00c8
        L_0x00c7:
            r0 = r2
        L_0x00c8:
            int r2 = r3.limit()
            if (r2 <= 0) goto L_0x00e4
            int r2 = r3.limit()
            byte[] r2 = new byte[r2]
            r3.get(r2)
            com.google.android.gms.internal.ads.bjo r3 = new com.google.android.gms.internal.ads.bjo
            r3.<init>(r2)
            com.google.android.gms.internal.ads.ajp r6 = new com.google.android.gms.internal.ads.ajp
            int r2 = r2.length
            r6.<init>(r3, r2, r0)
            r8 = r6
            goto L_0x00e5
        L_0x00e4:
            r8 = r0
        L_0x00e5:
            com.google.android.gms.internal.ads.big r0 = new com.google.android.gms.internal.ads.big
            android.net.Uri r7 = android.net.Uri.parse(r4)
            r10 = 2
            com.google.android.gms.internal.ads.aij r2 = r12.f40372i
            int r11 = r2.f40313c
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x00f4:
            com.google.android.gms.internal.ads.bgk r2 = r12.f40363B
            com.google.android.gms.internal.ads.bhj r3 = r12.f40364C
            com.google.android.gms.internal.ads.bgt r4 = r12.f40365D
            r5.mo39493a(r2, r3, r4)
            boolean r0 = r5.mo39494a(r0)
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "AdExoPlayerHelper Error"
            java.lang.String r2 = "Prepare from ByteBuffer failed."
            r12.m46061b(r0, r2)
        L_0x010a:
            r2 = r5
            goto L_0x01d0
        L_0x010d:
            java.lang.String r0 = "Source is MD5 but not found in cache. Source: "
            java.lang.String r3 = r12.f40379p
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0120
            java.lang.String r0 = r0.concat(r3)
            goto L_0x0126
        L_0x0120:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r0 = r3
        L_0x0126:
            com.google.android.gms.internal.ads.acd.m45783e(r0)
            goto L_0x01d0
        L_0x012b:
            int r0 = r12.f40369f
            r3 = 2
            r4 = 1
            if (r0 != r4) goto L_0x0144
            com.google.android.gms.internal.ads.bgo r0 = new com.google.android.gms.internal.ads.bgo
            com.google.android.gms.internal.ads.aik r4 = r12.f40367d
            android.content.Context r4 = r4.getContext()
            java.lang.String r5 = r12.f40379p
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r0.<init>(r4, r5, r2, r3)
            goto L_0x01b5
        L_0x0144:
            int r0 = r12.f40369f
            if (r0 != r3) goto L_0x0149
            goto L_0x014a
        L_0x0149:
            r4 = 0
        L_0x014a:
            com.google.android.gms.common.internal.C15267r.m44394b(r4)
            com.google.android.gms.internal.ads.acl r0 = com.google.android.gms.ads.internal.C14793ay.m42895a()
            com.google.android.gms.internal.ads.aik r3 = r12.f40367d
            android.content.Context r3 = r3.getContext()
            com.google.android.gms.internal.ads.aik r4 = r12.f40367d
            com.google.android.gms.internal.ads.zzbgz r4 = r4.mo39472k()
            java.lang.String r4 = r4.f45677a
            java.lang.String r0 = r0.mo39176b(r3, r4)
            com.google.android.gms.internal.ads.bju r3 = new com.google.android.gms.internal.ads.bju
            com.google.android.gms.internal.ads.aik r4 = r12.f40367d
            android.content.Context r4 = r4.getContext()
            r3.<init>(r4, r0)
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15585bw.f43898cm
            com.google.android.gms.internal.ads.bt r4 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r0 = r4.mo41272a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x018e
            com.google.android.gms.internal.ads.ajn r0 = new com.google.android.gms.internal.ads.ajn
            android.content.Context r4 = r12.f40368e
            com.google.android.gms.internal.ads.aix r5 = new com.google.android.gms.internal.ads.aix
            r5.<init>(r12)
            r0.<init>(r4, r3, r5)
            r8 = r0
            goto L_0x018f
        L_0x018e:
            r8 = r3
        L_0x018f:
            java.lang.String r0 = "video/webm"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x019e
            com.google.android.gms.internal.ads.bjh r0 = new com.google.android.gms.internal.ads.bjh
            r0.<init>()
        L_0x019c:
            r9 = r0
            goto L_0x01a4
        L_0x019e:
            com.google.android.gms.internal.ads.biv r0 = new com.google.android.gms.internal.ads.biv
            r0.<init>()
            goto L_0x019c
        L_0x01a4:
            com.google.android.gms.internal.ads.big r0 = new com.google.android.gms.internal.ads.big
            java.lang.String r2 = r12.f40379p
            android.net.Uri r7 = android.net.Uri.parse(r2)
            r10 = 2
            com.google.android.gms.internal.ads.aij r2 = r12.f40372i
            int r11 = r2.f40313c
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x01b5:
            com.google.android.gms.internal.ads.aip r2 = new com.google.android.gms.internal.ads.aip
            r2.<init>()
            com.google.android.gms.internal.ads.bgk r3 = r12.f40363B
            com.google.android.gms.internal.ads.bhj r4 = r12.f40364C
            com.google.android.gms.internal.ads.bgt r5 = r12.f40365D
            r2.mo39493a(r3, r4, r5)
            boolean r0 = r2.mo39494a(r0)
            if (r0 != 0) goto L_0x01d0
            java.lang.String r0 = "AdExoPlayerHelper Error"
            java.lang.String r3 = "Prepare failed."
            r12.m46061b(r0, r3)
        L_0x01d0:
            r12.f40375l = r2
            com.google.android.gms.internal.ads.aip r0 = r12.f40375l
            if (r0 != 0) goto L_0x01f3
            java.lang.String r0 = "AdExoPlayerHelper is null. Source: "
            java.lang.String r1 = r12.f40379p
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x01e9
            java.lang.String r0 = r0.concat(r1)
            goto L_0x01ef
        L_0x01e9:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x01ef:
            com.google.android.gms.internal.ads.acd.m45783e(r0)
            return
        L_0x01f3:
            com.google.android.gms.internal.ads.aip r0 = r12.f40375l
            com.google.android.gms.internal.ads.bgh r0 = r0.f40348a
            r12.f40376m = r0
            com.google.android.gms.internal.ads.aip r0 = r12.f40375l
            com.google.android.gms.internal.ads.bhf r0 = r0.f40349b
            r12.f40377n = r0
            com.google.android.gms.internal.ads.aip r0 = r12.f40375l
            com.google.android.gms.internal.ads.bgq r0 = r0.f40350c
            r12.f40378o = r0
            com.google.android.gms.internal.ads.bgh r0 = r12.f40376m
            if (r0 == 0) goto L_0x021e
            android.view.Surface r0 = r12.f40374k
            r12.m46056a(r0, r1)
            com.google.android.gms.internal.ads.bgh r0 = r12.f40376m
            int r0 = r0.mo40605a()
            r12.f40381r = r0
            int r0 = r12.f40381r
            r1 = 4
            if (r0 != r1) goto L_0x021e
            r12.m46070o()
        L_0x021e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aiw.m46069n():void");
    }

    @SideEffectFree
    /* renamed from: a */
    private final void m46056a(Surface surface, boolean z) {
        if (this.f40376m == null || this.f40377n == null) {
            acd.m45783e("Trying to set surface before player and renderers are initalized.");
        } else if (z) {
            this.f40376m.mo40612b(this.f40377n, 1, surface);
        } else {
            this.f40376m.mo40608a(this.f40377n, 1, surface);
        }
    }

    @SideEffectFree
    /* renamed from: a */
    private final void m46054a(float f, boolean z) {
        if (this.f40376m == null || this.f40378o == null) {
            acd.m45783e("Trying to set volume before player and renderers are initalized.");
        } else if (z) {
            this.f40376m.mo40612b(this.f40378o, 1, Float.valueOf(f));
        } else {
            this.f40376m.mo40608a(this.f40378o, 1, Float.valueOf(f));
        }
    }

    /* renamed from: e */
    public final void mo39359e() {
        m46054a(this.f40242b.mo39486a(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m46055a(int i, int i2, float f) {
        float f2 = i2 == 0 ? 1.0f : (((float) i) * f) / ((float) i2);
        if (this.f40366c != f2) {
            this.f40366c = f2;
            requestLayout();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m46070o() {
        if (!this.f40384u) {
            this.f40384u = true;
            acd.m45438a("Video is ready.");
            acl.f40003a.post(new ajc(this));
            mo39359e();
            this.f40370g.mo39477a();
            if (this.f40385v) {
                mo39357c();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m46071p() {
        acd.m45438a("Video ended.");
        if (this.f40372i.f40311a) {
            m46073r();
        }
        this.f40370g.mo39482d();
        this.f40242b.mo39490c();
        acl.f40003a.post(new ajd(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m46061b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19 + String.valueOf(str2).length());
        sb.append("Error received: ");
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        acd.m45783e(sb.toString());
        this.f40380q = true;
        if (this.f40372i.f40311a) {
            m46073r();
        }
        acl.f40003a.post(new aje(this, str, str2));
    }

    /* renamed from: a */
    public final String mo39351a() {
        String str;
        if (this.f40369f == 1) {
            str = "/Framework";
        } else if (this.f40369f == 2) {
            StringBuilder sb = new StringBuilder(String.valueOf(null).length() + 12);
            sb.append("/Extractor(");
            sb.append(null);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "/Unknown";
        }
        String str2 = this.f40383t ? " spherical" : "";
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length());
        sb2.append("ExoPlayer/1");
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo39354a(ahr ahr) {
        this.f40373j = ahr;
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.f40379p = str;
            m46069n();
            return;
        }
        acd.m45783e("Path is null.");
    }

    /* renamed from: c */
    public final void mo39357c() {
        if (m46068m()) {
            if (this.f40372i.f40311a) {
                m46072q();
            }
            this.f40376m.mo40610a(true);
            this.f40370g.mo39481c();
            this.f40242b.mo39489b();
            this.f40241a.mo39441a();
            acl.f40003a.post(new ajf(this));
            return;
        }
        this.f40385v = true;
    }

    /* renamed from: b */
    public final void mo39355b() {
        if (m46067l()) {
            this.f40376m.mo40614c();
            if (this.f40376m != null) {
                m46056a((Surface) null, true);
                if (this.f40375l != null) {
                    this.f40375l.mo39495c();
                    this.f40375l = null;
                }
                this.f40376m = null;
                this.f40377n = null;
                this.f40378o = null;
                this.f40381r = 1;
                this.f40380q = false;
                this.f40384u = false;
                this.f40385v = false;
            }
        }
        this.f40370g.mo39482d();
        this.f40242b.mo39490c();
        this.f40370g.mo39479b();
    }

    /* renamed from: d */
    public final void mo39358d() {
        if (m46068m()) {
            if (this.f40372i.f40311a) {
                m46073r();
            }
            this.f40376m.mo40610a(false);
            this.f40370g.mo39482d();
            this.f40242b.mo39490c();
            acl.f40003a.post(new ajg(this));
        }
    }

    /* renamed from: a */
    public final void mo39353a(int i) {
        if (m46068m()) {
            this.f40376m.mo40607a((long) i);
        }
    }

    /* renamed from: a */
    public final void mo39352a(float f, float f2) {
        if (this.f40382s != null) {
            this.f40382s.mo39451a(f, f2);
        }
    }

    public final int getCurrentPosition() {
        if (m46068m()) {
            return (int) this.f40376m.mo40617f();
        }
        return 0;
    }

    public final int getDuration() {
        if (m46068m()) {
            return (int) this.f40376m.mo40616e();
        }
        return 0;
    }

    public final int getVideoWidth() {
        return this.f40386w;
    }

    public final int getVideoHeight() {
        return this.f40387x;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f40366c != 0.0f && this.f40382s == null) {
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            float f3 = (this.f40366c / (f / f2)) - 1.0f;
            if (f3 > 0.01f) {
                measuredHeight = (int) (f / this.f40366c);
            } else if (f3 < -0.01f) {
                measuredWidth = (int) (f2 * this.f40366c);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        if (this.f40382s != null) {
            this.f40382s.mo39452a(measuredWidth, measuredHeight);
        }
        if (VERSION.SDK_INT == 16) {
            if (((this.f40389z > 0 && this.f40389z != measuredWidth) || (this.f40362A > 0 && this.f40362A != measuredHeight)) && this.f40371h && m46067l() && this.f40376m.mo40617f() > 0 && !this.f40376m.mo40613b()) {
                m46054a(0.0f, true);
                this.f40376m.mo40610a(true);
                long f4 = this.f40376m.mo40617f();
                long a = C14793ay.m42901g().mo38684a();
                while (m46067l() && this.f40376m.mo40617f() == f4) {
                    if (C14793ay.m42901g().mo38684a() - a > 250) {
                        break;
                    }
                }
                if (m46067l()) {
                    this.f40376m.mo40610a(false);
                }
                mo39359e();
            }
            this.f40389z = measuredWidth;
            this.f40362A = measuredHeight;
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f40383t) {
            this.f40382s = new aii(getContext());
            this.f40382s.mo39453a(surfaceTexture, i, i2);
            this.f40382s.start();
            SurfaceTexture c = this.f40382s.mo39455c();
            if (c != null) {
                surfaceTexture = c;
            } else {
                this.f40382s.mo39454b();
                this.f40382s = null;
            }
        }
        this.f40374k = new Surface(surfaceTexture);
        if (this.f40376m == null) {
            m46069n();
        } else {
            m46056a(this.f40374k, true);
            if (!this.f40372i.f40311a) {
                m46072q();
            }
        }
        float f = 1.0f;
        if (!(this.f40386w == 0 || this.f40387x == 0)) {
            i = this.f40386w;
            i2 = this.f40387x;
            f = this.f40388y;
        }
        m46055a(i, i2, f);
        acl.f40003a.post(new ajh(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f40382s != null) {
            this.f40382s.mo39452a(i, i2);
        }
        acl.f40003a.post(new aji(this, i, i2));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        acd.m45438a("Surface destroyed");
        mo39358d();
        if (this.f40382s != null) {
            this.f40382s.mo39454b();
            this.f40382s = null;
        }
        if (this.f40376m != null) {
            m46073r();
            if (this.f40374k != null) {
                this.f40374k.release();
            }
            this.f40374k = null;
            m46056a((Surface) null, true);
        }
        acl.f40003a.post(new ajj(this));
        return true;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f40370g.mo39480b(this);
        this.f40241a.mo39442a(surfaceTexture, this.f40373j);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView1 window visibility changed to ");
        sb.append(i);
        acd.m45438a(sb.toString());
        acl.f40003a.post(new aiz(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: q */
    private final void m46072q() {
        if (this.f40376m != null) {
            this.f40376m.mo40606a(0, true);
        }
    }

    /* renamed from: r */
    private final void m46073r() {
        if (this.f40376m != null) {
            this.f40376m.mo40606a(0, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo39516b(int i) {
        if (this.f40373j != null) {
            this.f40373j.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo39518f() {
        if (this.f40373j != null) {
            this.f40373j.mo39394f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39513a(int i, int i2) {
        if (this.f40373j != null) {
            this.f40373j.mo39388a(i, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo39519g() {
        if (this.f40373j != null) {
            this.f40373j.mo39387a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo39520h() {
        if (this.f40373j != null) {
            this.f40373j.mo39392d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo39521i() {
        if (this.f40373j != null) {
            this.f40373j.mo39391c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39514a(String str, String str2) {
        if (this.f40373j != null) {
            this.f40373j.mo39389a(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo39522j() {
        if (this.f40373j != null) {
            this.f40373j.mo39393e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo39523k() {
        if (this.f40373j != null) {
            this.f40373j.mo39390b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39515a(boolean z, long j) {
        this.f40367d.mo39463a(z, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo39517b(boolean z, long j) {
        this.f40367d.mo39463a(z, j);
    }
}
