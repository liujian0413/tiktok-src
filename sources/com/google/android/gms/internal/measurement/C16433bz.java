package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.bz */
public final class C16433bz extends C16695r {

    /* renamed from: b */
    protected boolean f45998b;

    /* renamed from: c */
    protected int f45999c;

    /* renamed from: d */
    private String f46000d;

    /* renamed from: e */
    private String f46001e;

    /* renamed from: f */
    private int f46002f;

    /* renamed from: g */
    private boolean f46003g;

    /* renamed from: h */
    private boolean f46004h;

    public C16433bz(C16697t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42476a() {
        ApplicationInfo applicationInfo;
        Context h = mo43204h();
        try {
            applicationInfo = C16435ca.m53562a(h.getPackageManager(), h.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        } catch (NameNotFoundException e) {
            mo43198d("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            mo43200e("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (i > 0) {
                C16411bd bdVar = (C16411bd) new C16409bb(this.f46634a).mo42514a(i);
                if (bdVar != null) {
                    mo43190b("Loading global XML config values");
                    boolean z = false;
                    if (bdVar.f45949a != null) {
                        String str = bdVar.f45949a;
                        this.f46001e = str;
                        mo43191b("XML config - app name", str);
                    }
                    if (bdVar.f45950b != null) {
                        String str2 = bdVar.f45950b;
                        this.f46000d = str2;
                        mo43191b("XML config - app version", str2);
                    }
                    if (bdVar.f45951c != null) {
                        String lowerCase = bdVar.f45951c.toLowerCase(Locale.US);
                        int i2 = "verbose".equals(lowerCase) ? 0 : "info".equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : "error".equals(lowerCase) ? 3 : -1;
                        if (i2 >= 0) {
                            this.f46002f = i2;
                            mo43187a("XML config - log level", Integer.valueOf(i2));
                        }
                    }
                    if (bdVar.f45952d >= 0) {
                        int i3 = bdVar.f45952d;
                        this.f45999c = i3;
                        this.f45998b = true;
                        mo43191b("XML config - dispatch period (sec)", Integer.valueOf(i3));
                    }
                    if (bdVar.f45953e != -1) {
                        if (bdVar.f45953e == 1) {
                            z = true;
                        }
                        this.f46004h = z;
                        this.f46003g = true;
                        mo43191b("XML config - dry run", Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo42569b() {
        mo43214s();
        return this.f46000d;
    }

    /* renamed from: c */
    public final String mo42570c() {
        mo43214s();
        return this.f46001e;
    }

    /* renamed from: d */
    public final boolean mo42571d() {
        mo43214s();
        return false;
    }

    /* renamed from: e */
    public final boolean mo42572e() {
        mo43214s();
        return this.f46003g;
    }

    /* renamed from: f */
    public final boolean mo42573f() {
        mo43214s();
        return this.f46004h;
    }
}
