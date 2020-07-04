package com.p280ss.android.ugc.aweme.beauty;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.beauty.k */
public final class C23542k {

    /* renamed from: a */
    public boolean f62125a;

    /* renamed from: b */
    public int f62126b;

    /* renamed from: c */
    public int f62127c;

    /* renamed from: d */
    public int f62128d;

    /* renamed from: e */
    public int f62129e;

    /* renamed from: f */
    public int f62130f;

    /* renamed from: g */
    public int f62131g;

    /* renamed from: h */
    public int f62132h;

    public C23542k() {
        this(false, 0, 0, 0, 0, 0, 0, 0, NormalGiftView.ALPHA_255, null);
    }

    private C23542k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f62125a = z;
        this.f62126b = i;
        this.f62127c = i2;
        this.f62128d = i3;
        this.f62129e = i4;
        this.f62130f = i5;
        this.f62131g = i6;
        this.f62132h = i7;
    }

    public /* synthetic */ C23542k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C7571f fVar) {
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12 = i8;
        int i13 = 0;
        if ((i12 & 1) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        int i14 = 100;
        if ((i12 & 2) != 0) {
            i9 = 100;
        } else {
            i9 = i;
        }
        if ((i12 & 4) != 0) {
            i10 = 100;
        } else {
            i10 = i2;
        }
        if ((i12 & 16) == 0) {
            i14 = i4;
        }
        if ((i12 & 32) != 0) {
            i11 = 0;
        } else {
            i11 = i5;
        }
        if ((i12 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
            i13 = i7;
        }
        this(z2, i9, i10, 0, i14, i11, 0, i13);
    }
}
