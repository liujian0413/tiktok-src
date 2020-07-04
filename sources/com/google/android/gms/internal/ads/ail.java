package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.C1642a;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.concurrent.TimeUnit;

@C6505uv
public final class ail {

    /* renamed from: a */
    private final Context f40321a;

    /* renamed from: b */
    private final String f40322b;

    /* renamed from: c */
    private final zzbgz f40323c;

    /* renamed from: d */
    private final C15598ci f40324d;

    /* renamed from: e */
    private final C15600ck f40325e;

    /* renamed from: f */
    private final adw f40326f = new adz().mo39244a("min_1", Double.MIN_VALUE, 1.0d).mo39244a("1_5", 1.0d, 5.0d).mo39244a("5_10", 5.0d, 10.0d).mo39244a("10_20", 10.0d, 20.0d).mo39244a("20_30", 20.0d, 30.0d).mo39244a("30_max", 30.0d, Double.MAX_VALUE).mo39243a();

    /* renamed from: g */
    private final long[] f40327g;

    /* renamed from: h */
    private final String[] f40328h;

    /* renamed from: i */
    private boolean f40329i = false;

    /* renamed from: j */
    private boolean f40330j = false;

    /* renamed from: k */
    private boolean f40331k = false;

    /* renamed from: l */
    private boolean f40332l = false;

    /* renamed from: m */
    private boolean f40333m;

    /* renamed from: n */
    private aht f40334n;

    /* renamed from: o */
    private boolean f40335o;

    /* renamed from: p */
    private boolean f40336p;

    /* renamed from: q */
    private long f40337q = -1;

    public ail(Context context, zzbgz zzbgz, String str, C15600ck ckVar, C15598ci ciVar) {
        this.f40321a = context;
        this.f40323c = zzbgz;
        this.f40322b = str;
        this.f40325e = ckVar;
        this.f40324d = ciVar;
        String str2 = (String) bym.m50299d().mo41272a(C15585bw.f44034x);
        if (str2 == null) {
            this.f40328h = new String[0];
            this.f40327g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f40328h = new String[split.length];
        this.f40327g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f40327g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                acd.m45780c("Unable to parse frame hash target time number.", e);
                this.f40327g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo39478a(aht aht) {
        C15593cd.m50346a(this.f40325e, this.f40324d, "vpc2");
        this.f40329i = true;
        if (this.f40325e != null) {
            this.f40325e.mo41458a("vpn", aht.mo39351a());
        }
        this.f40334n = aht;
    }

    /* renamed from: a */
    public final void mo39477a() {
        if (this.f40329i && !this.f40330j) {
            C15593cd.m50346a(this.f40325e, this.f40324d, "vfr2");
            this.f40330j = true;
        }
    }

    /* renamed from: b */
    public final void mo39479b() {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f44033w)).booleanValue() && !this.f40335o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f40322b);
            bundle.putString("player", this.f40334n.mo39351a());
            for (ady ady : this.f40326f.mo39238a()) {
                String valueOf = String.valueOf("fps_c_");
                String valueOf2 = String.valueOf(ady.f40080a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(ady.f40082c));
                String valueOf3 = String.valueOf("fps_p_");
                String valueOf4 = String.valueOf(ady.f40080a);
                bundle.putString(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), Double.toString(ady.f40081b));
            }
            for (int i = 0; i < this.f40327g.length; i++) {
                String str = this.f40328h[i];
                if (str != null) {
                    String valueOf5 = String.valueOf(Long.valueOf(this.f40327g[i]));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 3);
                    sb.append("fh_");
                    sb.append(valueOf5);
                    bundle.putString(sb.toString(), str);
                }
            }
            C14793ay.m42895a().mo39172a(this.f40321a, this.f40323c.f45677a, "gmob-apps", bundle, true);
            this.f40335o = true;
        }
    }

    /* renamed from: b */
    public final void mo39480b(aht aht) {
        if (this.f40331k && !this.f40332l) {
            if (acd.m45439a() && !this.f40332l) {
                acd.m45438a("VideoMetricsMixin first frame");
            }
            C15593cd.m50346a(this.f40325e, this.f40324d, "vff2");
            this.f40332l = true;
        }
        long c = C14793ay.m42901g().mo38686c();
        if (this.f40333m && this.f40336p && this.f40337q != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d = (double) (c - this.f40337q);
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.f40326f.mo39239a(nanos / d);
        }
        this.f40336p = this.f40333m;
        this.f40337q = c;
        long longValue = ((Long) bym.m50299d().mo41272a(C15585bw.f44035y)).longValue();
        long currentPosition = (long) aht.getCurrentPosition();
        int i = 0;
        while (i < this.f40328h.length) {
            if (this.f40328h[i] != null || longValue <= Math.abs(currentPosition - this.f40327g[i])) {
                aht aht2 = aht;
                i++;
            } else {
                String[] strArr = this.f40328h;
                int i2 = 8;
                Bitmap bitmap = aht.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3);
                        i4++;
                        j3--;
                        i2 = 8;
                    }
                    i3++;
                    j = j3;
                    i2 = 8;
                }
                strArr[i] = C1642a.m8034a("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo39481c() {
        this.f40333m = true;
        if (this.f40330j && !this.f40331k) {
            C15593cd.m50346a(this.f40325e, this.f40324d, "vfp2");
            this.f40331k = true;
        }
    }

    /* renamed from: d */
    public final void mo39482d() {
        this.f40333m = false;
    }
}
