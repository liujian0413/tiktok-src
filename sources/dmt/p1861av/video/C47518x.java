package dmt.p1861av.video;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import kotlin.jvm.internal.C7571f;

/* renamed from: dmt.av.video.x */
public final class C47518x {

    /* renamed from: l */
    public static final C47519a f121983l = new C47519a(null);

    /* renamed from: a */
    public int f121984a;

    /* renamed from: b */
    public int f121985b;

    /* renamed from: c */
    public int f121986c;

    /* renamed from: d */
    public int f121987d;

    /* renamed from: e */
    public int f121988e;

    /* renamed from: f */
    public boolean f121989f;

    /* renamed from: g */
    public boolean f121990g;

    /* renamed from: h */
    public int f121991h;

    /* renamed from: i */
    public int f121992i;

    /* renamed from: j */
    public final boolean f121993j;

    /* renamed from: k */
    public final boolean f121994k;

    /* renamed from: dmt.av.video.x$a */
    public static final class C47519a {
        private C47519a() {
        }

        public /* synthetic */ C47519a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C47518x m148310a(int i, int i2, int i3, int i4, int i5, int i6) {
            C47518x xVar = new C47518x(0, i, false, false, 12, null);
            return xVar.mo119638a(i5).mo119642c(i6).mo119643d(i2).mo119644e(i3).mo119640b(i4);
        }

        /* renamed from: a */
        public static C47518x m148311a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
            C47518x xVar = new C47518x(0, i, false, false, 12, null);
            return xVar.mo119638a(i5).mo119642c(i6).mo119643d(i2).mo119644e(i3).mo119640b(i4).mo119639a(z).mo119641b(z2);
        }

        /* renamed from: a */
        private static C47518x m148312a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4) {
            return new C47518x(1, i, z, z2).mo119638a(i5).mo119642c(i6).mo119643d(i2).mo119644e(i3).mo119640b(i4).mo119639a(z3).mo119641b(z4);
        }

        /* renamed from: a */
        public static /* synthetic */ C47518x m148313a(C47519a aVar, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, int i7, Object obj) {
            boolean z5;
            boolean z6;
            boolean z7;
            int i8 = i7;
            if ((i8 & 64) != 0) {
                z5 = true;
            } else {
                z5 = z;
            }
            if ((i8 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
                z6 = false;
            } else {
                z6 = z2;
            }
            if ((i8 & 256) != 0) {
                z7 = false;
            } else {
                z7 = z3;
            }
            return m148312a(i, i2, i3, i4, i5, i6, z5, z6, z7, false);
        }
    }

    /* renamed from: a */
    public static final C47518x m148299a(int i, int i2, int i3, int i4, int i5, int i6) {
        return C47519a.m148313a(f121983l, i, i2, i3, i4, i5, 0, false, false, false, false, 960, null);
    }

    /* renamed from: a */
    public static final C47518x m148300a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        return C47519a.m148311a(i, i2, i3, i4, i5, 0, z, true);
    }

    /* renamed from: a */
    public static final C47518x m148301a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        return C47519a.m148313a(f121983l, i, 0, i3, i4, i5, 0, true, false, z3, false, 512, null);
    }

    /* renamed from: b */
    public static final C47518x m148302b(int i, int i2, int i3, int i4, int i5, int i6) {
        return C47519a.m148310a(i, i2, i3, i4, i5, 0);
    }

    /* renamed from: a */
    public final C47518x mo119638a(int i) {
        this.f121984a = i;
        return this;
    }

    /* renamed from: b */
    public final C47518x mo119640b(int i) {
        this.f121988e = i;
        return this;
    }

    /* renamed from: c */
    public final C47518x mo119642c(int i) {
        this.f121985b = i;
        return this;
    }

    /* renamed from: d */
    public final C47518x mo119643d(int i) {
        this.f121986c = i;
        return this;
    }

    /* renamed from: e */
    public final C47518x mo119644e(int i) {
        this.f121987d = i;
        return this;
    }

    /* renamed from: a */
    public final C47518x mo119639a(boolean z) {
        this.f121989f = z;
        return this;
    }

    /* renamed from: b */
    public final C47518x mo119641b(boolean z) {
        this.f121990g = z;
        return this;
    }

    public C47518x(int i, int i2, boolean z, boolean z2) {
        this.f121991h = i;
        this.f121992i = i2;
        this.f121993j = z;
        this.f121994k = z2;
    }

    public /* synthetic */ C47518x(int i, int i2, boolean z, boolean z2, int i3, C7571f fVar) {
        this(0, i2, true, false);
    }
}
