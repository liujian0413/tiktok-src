package com.p280ss.android.ttvecamera;

/* renamed from: com.ss.android.ttvecamera.TECameraFrame */
public final class TECameraFrame {

    /* renamed from: a */
    public long f55418a;

    /* renamed from: b */
    private int f55419b;

    /* renamed from: c */
    private int f55420c;

    /* renamed from: d */
    private C20510c f55421d;

    /* renamed from: com.ss.android.ttvecamera.TECameraFrame$ETEPixelFormat */
    public enum ETEPixelFormat {
        PIXEL_FORMAT_YUV420,
        PIXEL_FORMAT_YUV420P,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_YUYV422,
        PIXEL_FORMAT_YUV422P,
        PIXEL_FORMAT_UYVY422,
        PIXEL_FORMAT_GRAY8,
        PIXEL_FORMAT_RGB8,
        PIXEL_FORMAT_BGR8,
        PIXEL_FORMAT_ARGB8,
        PIXEL_FORMAT_RGBA8,
        PIXEL_FORMAT_BGRA8,
        PIXEL_FORMAT_OpenGL_GRAY,
        PIXEL_FORMAT_OpenGL_RGB8,
        PIXEL_FORMAT_OpenGL_RGBA8,
        PIXEL_FORMAT_OpenGL_OES,
        PIXEL_FORMAT_JPEG,
        PIXEL_FORMAT_BUFFER,
        PIXEL_FORMAT_Count
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraFrame$a */
    public static class C20508a extends C20510c {

        /* renamed from: a */
        public int f55423a;

        /* renamed from: b */
        public byte[] f55424b;

        public C20508a(int i, int i2, long j, byte[] bArr, int i3, ETEPixelFormat eTEPixelFormat, int i4) {
            super(i, i2, j, i4);
            this.f55429e = 2;
            this.f55430f = i3;
            this.f55428d = eTEPixelFormat;
            this.f55424b = bArr;
            this.f55423a = i * i2 * 4;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraFrame$b */
    public static class C20509b extends C20510c {

        /* renamed from: a */
        public int f55425a;

        /* renamed from: b */
        public float[] f55426b;

        public C20509b(int i, int i2, long j, int i3, int i4, float[] fArr, ETEPixelFormat eTEPixelFormat, int i5) {
            super(i, i2, j, i5);
            this.f55429e = 1;
            this.f55425a = i3;
            this.f55430f = i4;
            this.f55426b = fArr;
            this.f55428d = eTEPixelFormat;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraFrame$c */
    public static class C20510c {

        /* renamed from: c */
        public TEFrameSizei f55427c;

        /* renamed from: d */
        public ETEPixelFormat f55428d;

        /* renamed from: e */
        public int f55429e;

        /* renamed from: f */
        public int f55430f;

        /* renamed from: g */
        public long f55431g;

        /* renamed from: h */
        public int f55432h;

        public C20510c(int i, int i2, long j) {
            this(0, 0, 0, 0);
        }

        public C20510c(int i, int i2, long j, int i3) {
            this.f55427c = new TEFrameSizei(i, i2);
            this.f55431g = j;
            this.f55432h = i3;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraFrame$d */
    public static class C20511d extends C20510c {

        /* renamed from: a */
        public C20654n f55433a;

        public C20511d(int i, int i2, long j, C20654n nVar, int i3, ETEPixelFormat eTEPixelFormat, int i4) {
            super(i, i2, j, i4);
            this.f55429e = 3;
            this.f55430f = i3;
            this.f55428d = eTEPixelFormat;
            this.f55433a = nVar;
        }
    }

    /* renamed from: d */
    public final int mo55510d() {
        return this.f55421d.f55430f;
    }

    /* renamed from: f */
    public final TEFrameSizei mo55512f() {
        return this.f55421d.f55427c;
    }

    /* renamed from: g */
    public final ETEPixelFormat mo55513g() {
        return this.f55421d.f55428d;
    }

    /* renamed from: h */
    public final int mo55514h() {
        return this.f55421d.f55429e;
    }

    /* renamed from: i */
    public final int mo55515i() {
        return this.f55421d.f55432h;
    }

    /* renamed from: a */
    public final byte[] mo55507a() {
        if (this.f55421d instanceof C20508a) {
            return ((C20508a) this.f55421d).f55424b;
        }
        return null;
    }

    /* renamed from: b */
    public final int mo55508b() {
        if (this.f55421d instanceof C20509b) {
            return ((C20509b) this.f55421d).f55425a;
        }
        return 0;
    }

    /* renamed from: c */
    public final C20654n mo55509c() {
        if (this.f55421d instanceof C20511d) {
            return ((C20511d) this.f55421d).f55433a;
        }
        return null;
    }

    /* renamed from: e */
    public final float[] mo55511e() {
        if (this.f55421d instanceof C20509b) {
            return ((C20509b) this.f55421d).f55426b;
        }
        return null;
    }

    /* renamed from: a */
    public static int m68015a(ETEPixelFormat eTEPixelFormat) {
        switch (eTEPixelFormat) {
            case PIXEL_FORMAT_YUV420:
                return 35;
            case PIXEL_FORMAT_YUV420P:
                return 842094169;
            case PIXEL_FORMAT_NV21:
                return 17;
            case PIXEL_FORMAT_YUV422P:
                return 16;
            case PIXEL_FORMAT_YUYV422:
            case PIXEL_FORMAT_UYVY422:
                return 39;
            case PIXEL_FORMAT_RGB8:
                return 41;
            case PIXEL_FORMAT_RGBA8:
                return 42;
            case PIXEL_FORMAT_JPEG:
                return 256;
            default:
                return 0;
        }
    }

    public TECameraFrame(int i, int i2, long j) {
        this.f55421d = new C20510c(0, 0, 0);
        this.f55419b = i;
        this.f55420c = i2;
        this.f55418a = j;
    }

    public TECameraFrame(C20654n nVar, ETEPixelFormat eTEPixelFormat, int i, int i2) {
        this(i, i2, 0);
        mo55505a(nVar, 0, eTEPixelFormat, 0);
    }

    public TECameraFrame(byte[] bArr, ETEPixelFormat eTEPixelFormat, int i, int i2) {
        this(i, i2, 0);
        mo55506a(bArr, 0, eTEPixelFormat, 0);
    }

    /* renamed from: a */
    public final void mo55505a(C20654n nVar, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        C20511d dVar = new C20511d(this.f55419b, this.f55420c, this.f55418a, nVar, i, eTEPixelFormat, i2);
        this.f55421d = dVar;
    }

    /* renamed from: a */
    public final void mo55506a(byte[] bArr, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        C20508a aVar = new C20508a(this.f55419b, this.f55420c, this.f55418a, bArr, i, eTEPixelFormat, i2);
        this.f55421d = aVar;
    }

    /* renamed from: a */
    public final void mo55504a(int i, int i2, float[] fArr, ETEPixelFormat eTEPixelFormat, int i3) {
        C20509b bVar = new C20509b(this.f55419b, this.f55420c, this.f55418a, i, i2, fArr, eTEPixelFormat, i3);
        this.f55421d = bVar;
    }
}
