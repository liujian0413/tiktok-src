package com.p280ss.android.ugc.aweme.tools.beauty;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.g */
public final class C42186g {

    /* renamed from: a */
    public static final C42186g f109750a = new C42186g();

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.g$a */
    public static final class C42187a {

        /* renamed from: a */
        public boolean f109751a;

        /* renamed from: b */
        public int f109752b;

        /* renamed from: c */
        public int f109753c;

        /* renamed from: d */
        public int f109754d;

        /* renamed from: e */
        public int f109755e;

        /* renamed from: f */
        public int f109756f;

        /* renamed from: g */
        public int f109757g;

        /* renamed from: h */
        public int f109758h;

        public C42187a() {
            this(false, 0, 0, 0, 0, 0, 0, 0, NormalGiftView.ALPHA_255, null);
        }

        private C42187a(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f109751a = z;
            this.f109752b = i;
            this.f109753c = i2;
            this.f109754d = i3;
            this.f109755e = i4;
            this.f109756f = i5;
            this.f109757g = i6;
            this.f109758h = i7;
        }

        public /* synthetic */ C42187a(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C7571f fVar) {
            boolean z2;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13 = i8;
            int i14 = 0;
            if ((i13 & 1) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            int i15 = 100;
            if ((i13 & 2) != 0) {
                i9 = 100;
            } else {
                i9 = i;
            }
            if ((i13 & 4) != 0) {
                i10 = 100;
            } else {
                i10 = i2;
            }
            if ((i13 & 16) == 0) {
                i15 = i4;
            }
            if ((i13 & 32) != 0) {
                i11 = 0;
            } else {
                i11 = i5;
            }
            if ((i13 & 64) != 0) {
                i12 = 0;
            } else {
                i12 = i6;
            }
            if ((i13 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
                i14 = i7;
            }
            this(z2, i9, i10, 0, i15, i11, i12, i14);
        }
    }

    private C42186g() {
    }

    /* renamed from: a */
    public static float m134210a(C42187a aVar) {
        C7573i.m23587b(aVar, "data");
        if (!aVar.f109751a) {
            return ((float) (aVar.f109755e * aVar.f109758h)) / 100.0f;
        }
        if (((float) aVar.f109758h) >= ((float) aVar.f109752b) / 2.0f) {
            return (((((float) aVar.f109758h) - (((float) aVar.f109752b) / 2.0f)) * 2.0f) * ((float) aVar.f109755e)) / 100.0f;
        }
        return ((((((float) aVar.f109752b) / 2.0f) - ((float) aVar.f109758h)) * 2.0f) * ((float) aVar.f109756f)) / 100.0f;
    }

    /* renamed from: b */
    public static C42187a m134211b(C42187a aVar) {
        C7573i.m23587b(aVar, "data");
        C42187a aVar2 = new C42187a(false, 0, 0, 0, 0, 0, 0, 0, NormalGiftView.ALPHA_255, null);
        if (aVar.f109751a) {
            aVar2.f109753c = 50;
            aVar2.f109754d = -50;
            if (aVar.f109757g >= 0) {
                aVar2.f109758h = (int) (((((float) aVar.f109757g) / ((float) aVar.f109755e)) * 50.0f) + 50.0f);
            } else {
                aVar2.f109758h = (int) (50.0f - ((((float) aVar.f109757g) / ((float) aVar.f109756f)) * 50.0f));
            }
        } else {
            aVar2.f109753c = 100;
            aVar2.f109754d = 0;
            aVar2.f109758h = (int) ((((float) aVar.f109757g) / ((float) aVar.f109755e)) * 100.0f);
        }
        return aVar2;
    }
}
