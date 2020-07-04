package com.p280ss.android.ugc.aweme.app;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import com.facebook.common.internal.C13310j;
import com.facebook.imagepipeline.p716c.C13586q;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.ss.android.ugc.aweme.app.af */
public final class C22772af implements C13310j<C13586q> {

    /* renamed from: a */
    private ActivityManager f60463a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C13586q mo29879b() {
        int c = m75157c();
        if (VERSION.SDK_INT >= 19) {
            C13586q qVar = new C13586q(c, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, c / 12, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return qVar;
        }
        C13586q qVar2 = new C13586q(c, 256, c / 8, Integer.MAX_VALUE, Integer.MAX_VALUE);
        return qVar2;
    }

    /* renamed from: c */
    private int m75157c() {
        int min = Math.min(this.f60463a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        return min / 4;
    }

    public C22772af(ActivityManager activityManager) {
        this.f60463a = activityManager;
    }
}
