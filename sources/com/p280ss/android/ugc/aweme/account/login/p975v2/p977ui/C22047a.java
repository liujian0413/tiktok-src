package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a */
public final class C22047a {

    /* renamed from: a */
    public String f58963a;

    /* renamed from: b */
    public String f58964b;

    /* renamed from: c */
    public boolean f58965c;

    /* renamed from: d */
    public String f58966d;

    /* renamed from: e */
    public String f58967e;

    /* renamed from: f */
    public boolean f58968f;

    /* renamed from: g */
    public String f58969g;

    /* renamed from: h */
    public boolean f58970h;

    /* renamed from: i */
    public boolean f58971i;

    public C22047a() {
        this(null, null, false, null, null, false, null, false, false, 511, null);
    }

    private C22047a(String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4) {
        this.f58963a = str;
        this.f58964b = str2;
        this.f58965c = z;
        this.f58966d = str3;
        this.f58967e = str4;
        this.f58968f = z2;
        this.f58969g = str5;
        this.f58970h = z3;
        this.f58971i = z4;
    }

    public /* synthetic */ C22047a(String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4, int i, C7571f fVar) {
        String str6;
        boolean z5;
        String str7;
        String str8;
        boolean z6;
        int i2 = i;
        String str9 = null;
        if ((i2 & 1) != 0) {
            str6 = null;
        } else {
            str6 = str;
        }
        boolean z7 = true;
        if ((i2 & 4) != 0) {
            z5 = true;
        } else {
            z5 = z;
        }
        if ((i2 & 8) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i2 & 16) != 0) {
            str8 = null;
        } else {
            str8 = str4;
        }
        boolean z8 = false;
        if ((i2 & 32) != 0) {
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i2 & 64) == 0) {
            str9 = str5;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
            z7 = z3;
        }
        if ((i2 & 256) == 0) {
            z8 = z4;
        }
        this(str6, null, z5, str7, str8, z6, str9, z7, z8);
    }
}
