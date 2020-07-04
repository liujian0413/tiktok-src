package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.internal.C15267r;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

@C6505uv
public final class ahv extends FrameLayout implements ahr {

    /* renamed from: a */
    private final aik f40243a;

    /* renamed from: b */
    private final FrameLayout f40244b;

    /* renamed from: c */
    private final C15600ck f40245c;

    /* renamed from: d */
    private final aim f40246d;

    /* renamed from: e */
    private final long f40247e;

    /* renamed from: f */
    private aht f40248f;

    /* renamed from: g */
    private boolean f40249g;

    /* renamed from: h */
    private boolean f40250h;

    /* renamed from: i */
    private boolean f40251i;

    /* renamed from: j */
    private boolean f40252j;

    /* renamed from: k */
    private long f40253k;

    /* renamed from: l */
    private long f40254l;

    /* renamed from: m */
    private String f40255m;

    /* renamed from: n */
    private String[] f40256n;

    /* renamed from: o */
    private Bitmap f40257o;

    /* renamed from: p */
    private ImageView f40258p;

    /* renamed from: q */
    private boolean f40259q;

    /* renamed from: a */
    public static void m45926a(aik aik) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        aik.mo39809a("onVideoEvent", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m45928a(aik aik, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        aik.mo39809a("onVideoEvent", (Map) hashMap);
    }

    /* renamed from: a */
    public static void m45927a(aik aik, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        aik.mo39809a("onVideoEvent", (Map) hashMap);
    }

    public ahv(Context context, aik aik, int i, boolean z, C15600ck ckVar, aij aij) {
        Context context2 = context;
        super(context);
        aik aik2 = aik;
        this.f40243a = aik2;
        C15600ck ckVar2 = ckVar;
        this.f40245c = ckVar2;
        this.f40244b = new FrameLayout(context);
        addView(this.f40244b, new LayoutParams(-1, -1));
        C15267r.m44384a(aik.mo39467e());
        this.f40248f = aik.mo39467e().f38329b.mo39408a(context, aik2, i, z, ckVar2, aij);
        if (this.f40248f != null) {
            this.f40244b.addView(this.f40248f, new LayoutParams(-1, -1, 17));
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f44036z)).booleanValue()) {
                mo39426m();
            }
        }
        this.f40258p = new ImageView(context);
        this.f40247e = ((Long) bym.m50299d().mo41272a(C15585bw.f43730D)).longValue();
        this.f40252j = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43728B)).booleanValue();
        if (this.f40245c != null) {
            this.f40245c.mo41458a("spinner_used", this.f40252j ? "1" : "0");
        }
        this.f40246d = new aim(this);
        if (this.f40248f != null) {
            this.f40248f.mo39354a((ahr) this);
        }
        if (this.f40248f == null) {
            mo39389a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: a */
    public final void mo39411a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            LayoutParams layoutParams = new LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.f40244b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo39413a(String str, String[] strArr) {
        this.f40255m = str;
        this.f40256n = strArr;
    }

    /* renamed from: a */
    public final void mo39409a(float f, float f2) {
        if (this.f40248f != null) {
            this.f40248f.mo39352a(f, f2);
        }
    }

    /* renamed from: h */
    public final void mo39421h() {
        if (this.f40248f != null) {
            if (!TextUtils.isEmpty(this.f40255m)) {
                this.f40248f.mo39402a(this.f40255m, this.f40256n);
            } else {
                m45929b("no_src", new String[0]);
            }
        }
    }

    /* renamed from: i */
    public final void mo39422i() {
        if (this.f40248f != null) {
            this.f40248f.mo39358d();
        }
    }

    /* renamed from: j */
    public final void mo39423j() {
        if (this.f40248f != null) {
            this.f40248f.mo39357c();
        }
    }

    /* renamed from: a */
    public final void mo39410a(int i) {
        if (this.f40248f != null) {
            this.f40248f.mo39353a(i);
        }
    }

    /* renamed from: k */
    public final void mo39424k() {
        if (this.f40248f != null) {
            aht aht = this.f40248f;
            aht.f40242b.mo39488a(true);
            aht.mo39359e();
        }
    }

    /* renamed from: l */
    public final void mo39425l() {
        if (this.f40248f != null) {
            aht aht = this.f40248f;
            aht.f40242b.mo39488a(false);
            aht.mo39359e();
        }
    }

    public final void setVolume(float f) {
        if (this.f40248f != null) {
            aht aht = this.f40248f;
            aht.f40242b.mo39487a(f);
            aht.mo39359e();
        }
    }

    /* renamed from: b */
    public final void mo39415b(int i) {
        this.f40248f.mo39403c(i);
    }

    /* renamed from: c */
    public final void mo39416c(int i) {
        this.f40248f.mo39404d(i);
    }

    /* renamed from: d */
    public final void mo39417d(int i) {
        this.f40248f.mo39405e(i);
    }

    /* renamed from: e */
    public final void mo39418e(int i) {
        this.f40248f.mo39406f(i);
    }

    /* renamed from: f */
    public final void mo39419f(int i) {
        this.f40248f.mo39407g(i);
    }

    /* renamed from: a */
    public final void mo39412a(MotionEvent motionEvent) {
        if (this.f40248f != null) {
            this.f40248f.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: m */
    public final void mo39426m() {
        if (this.f40248f != null) {
            TextView textView = new TextView(this.f40248f.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.f40248f.mo39351a());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f40244b.addView(textView, new LayoutParams(-2, -2, 17));
            this.f40244b.bringChildToFront(textView);
        }
    }

    /* renamed from: a */
    public final void mo39387a() {
        this.f40246d.mo39484b();
        acl.f40003a.post(new ahy(this));
    }

    /* renamed from: b */
    public final void mo39390b() {
        if (this.f40248f != null && this.f40254l == 0) {
            m45929b("canplaythrough", "duration", String.valueOf(((float) this.f40248f.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f40248f.getVideoWidth()), "videoHeight", String.valueOf(this.f40248f.getVideoHeight()));
        }
    }

    /* renamed from: c */
    public final void mo39391c() {
        if (this.f40243a.mo39466d() != null && !this.f40250h) {
            this.f40251i = (this.f40243a.mo39466d().getWindow().getAttributes().flags & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0;
            if (!this.f40251i) {
                this.f40243a.mo39466d().getWindow().addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                this.f40250h = true;
            }
        }
        this.f40249g = true;
    }

    /* renamed from: d */
    public final void mo39392d() {
        m45929b("pause", new String[0]);
        m45931q();
        this.f40249g = false;
    }

    /* renamed from: e */
    public final void mo39393e() {
        m45929b("ended", new String[0]);
        m45931q();
    }

    /* renamed from: a */
    public final void mo39389a(String str, String str2) {
        m45929b("error", "what", str, "extra", str2);
    }

    /* renamed from: f */
    public final void mo39394f() {
        if (this.f40259q && this.f40257o != null && !m45930p()) {
            this.f40258p.setImageBitmap(this.f40257o);
            this.f40258p.invalidate();
            this.f40244b.addView(this.f40258p, new LayoutParams(-1, -1));
            this.f40244b.bringChildToFront(this.f40258p);
        }
        this.f40246d.mo39483a();
        this.f40254l = this.f40253k;
        acl.f40003a.post(new ahz(this));
    }

    /* renamed from: n */
    public final void mo39427n() {
        this.f40246d.mo39483a();
        if (this.f40248f != null) {
            this.f40248f.mo39355b();
        }
        m45931q();
    }

    public final void finalize() throws Throwable {
        try {
            this.f40246d.mo39483a();
            if (this.f40248f != null) {
                aht aht = this.f40248f;
                Executor executor = ago.f40189a;
                aht.getClass();
                executor.execute(ahw.m45960a(aht));
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo39428o() {
        if (this.f40248f != null) {
            long currentPosition = (long) this.f40248f.getCurrentPosition();
            if (this.f40253k != currentPosition && currentPosition > 0) {
                m45929b("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.f40253k = currentPosition;
            }
        }
    }

    /* renamed from: g */
    public final void mo39395g() {
        if (this.f40249g && m45930p()) {
            this.f40244b.removeView(this.f40258p);
        }
        if (this.f40257o != null) {
            long b = C14793ay.m42901g().mo38685b();
            if (this.f40248f.getBitmap(this.f40257o) != null) {
                this.f40259q = true;
            }
            long b2 = C14793ay.m42901g().mo38685b() - b;
            if (acd.m45439a()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(b2);
                sb.append("ms");
                acd.m45438a(sb.toString());
            }
            if (b2 > this.f40247e) {
                acd.m45783e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f40252j = false;
                this.f40257o = null;
                if (this.f40245c != null) {
                    this.f40245c.mo41458a("spinner_jank", Long.toString(b2));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo39388a(int i, int i2) {
        if (this.f40252j) {
            int max = Math.max(i / ((Integer) bym.m50299d().mo41272a(C15585bw.f43729C)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) bym.m50299d().mo41272a(C15585bw.f43729C)).intValue(), 1);
            if (this.f40257o == null || this.f40257o.getWidth() != max || this.f40257o.getHeight() != max2) {
                this.f40257o = Bitmap.createBitmap(max, max2, Config.ARGB_8888);
                this.f40259q = false;
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f40246d.mo39484b();
        } else {
            this.f40246d.mo39483a();
            this.f40254l = this.f40253k;
        }
        acl.f40003a.post(new ahx(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f40246d.mo39484b();
            z = true;
        } else {
            this.f40246d.mo39483a();
            this.f40254l = this.f40253k;
            z = false;
        }
        acl.f40003a.post(new aia(this, z));
    }

    /* renamed from: p */
    private final boolean m45930p() {
        return this.f40258p.getParent() != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m45929b(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f40243a.mo39809a("onVideoEvent", (Map) hashMap);
    }

    /* renamed from: q */
    private final void m45931q() {
        if (this.f40243a.mo39466d() != null && this.f40250h && !this.f40251i) {
            this.f40243a.mo39466d().getWindow().clearFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            this.f40250h = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39414a(boolean z) {
        m45929b("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }
}
