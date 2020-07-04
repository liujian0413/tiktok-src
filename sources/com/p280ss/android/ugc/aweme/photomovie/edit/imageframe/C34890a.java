package com.p280ss.android.ugc.aweme.photomovie.edit.imageframe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p280ss.android.ugc.aweme.shortvideo.p1573g.C39914a;
import com.p280ss.android.ugc.aweme.shortvideo.p1573g.C39915b;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.a */
public final class C34890a implements C34896a {

    /* renamed from: a */
    public final C39915b f90996a;

    /* renamed from: b */
    public final C34894b f90997b;

    /* renamed from: c */
    public final File[] f90998c;

    /* renamed from: d */
    public C34893b f90999d;

    /* renamed from: e */
    public boolean f91000e;

    /* renamed from: f */
    private final Handler f91001f;

    /* renamed from: g */
    private final boolean f91002g;

    /* renamed from: h */
    private final long f91003h;

    /* renamed from: i */
    private final int f91004i;

    /* renamed from: j */
    private final int f91005j;

    /* renamed from: k */
    private final float f91006k;

    /* renamed from: l */
    private final int f91007l;

    /* renamed from: m */
    private final int[] f91008m;

    /* renamed from: n */
    private final Resources f91009n;

    /* renamed from: o */
    private int f91010o;

    /* renamed from: p */
    private boolean f91011p;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.a$a */
    public static class C34892a {

        /* renamed from: a */
        public final Context f91013a;

        /* renamed from: b */
        public boolean f91014b;

        /* renamed from: c */
        public long f91015c = 50;

        /* renamed from: d */
        public int f91016d;

        /* renamed from: e */
        public int f91017e;

        /* renamed from: f */
        public float f91018f;

        /* renamed from: g */
        public File[] f91019g;

        /* renamed from: h */
        public int[] f91020h;

        /* renamed from: i */
        public C34893b f91021i;

        /* renamed from: a */
        public final C34890a mo88437a() {
            return new C34890a(this);
        }

        /* renamed from: a */
        public final C34892a mo88435a(C34893b bVar) {
            this.f91021i = bVar;
            return this;
        }

        /* renamed from: a */
        public final C34892a mo88433a(float f) {
            this.f91018f = 1.0f;
            return this;
        }

        /* renamed from: a */
        public final C34892a mo88434a(long j) {
            this.f91015c = 80;
            return this;
        }

        /* renamed from: a */
        public final C34892a mo88436a(boolean z) {
            this.f91014b = false;
            return this;
        }

        public C34892a(Context context, int[] iArr) {
            if (iArr.length != 0) {
                this.f91013a = context;
                this.f91020h = iArr;
                return;
            }
            throw new IllegalArgumentException("resource is empty");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.imageframe.a$b */
    public interface C34893b {
        /* renamed from: a */
        void mo88423a(BitmapDrawable bitmapDrawable, C39915b bVar);

        /* renamed from: b */
        void mo88425b();
    }

    /* renamed from: b */
    public final void mo88431b() {
        if (this.f91000e) {
            this.f91000e = false;
            this.f91010o = 0;
            this.f91011p = false;
            this.f90999d = null;
            this.f90997b.f91024c.removeCallbacksAndMessages(null);
            this.f90997b.mo88439b(this);
            m112469a(this.f90997b);
            this.f91001f.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: c */
    private void m112471c() {
        if (this.f91010o < this.f90998c.length) {
            File file = this.f90998c[this.f91010o];
            if (!file.isFile() || !m112470a(file)) {
                this.f91010o++;
                m112471c();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            BitmapDrawable a = C39914a.m127684a(this.f91009n, file.getAbsolutePath(), this.f91004i, this.f91005j, this.f91006k, this.f91007l, this.f90996a);
            long currentTimeMillis2 = this.f91003h - (System.currentTimeMillis() - currentTimeMillis);
            if (currentTimeMillis2 < 0) {
                currentTimeMillis2 = 0;
            }
            if (this.f91010o == 0 && !this.f91011p) {
                currentTimeMillis2 = 0;
            }
            this.f91001f.sendMessageDelayed(Message.obtain(this.f91001f, 2, a), currentTimeMillis2);
            if (this.f91011p) {
                this.f91011p = false;
            }
            this.f91010o++;
        } else if (this.f91002g) {
            this.f91010o = 0;
            this.f91011p = true;
            m112471c();
        } else {
            this.f91001f.sendEmptyMessage(3);
        }
    }

    /* renamed from: d */
    private void m112472d() {
        if (this.f91010o < this.f91008m.length) {
            int i = this.f91008m[this.f91010o];
            long currentTimeMillis = System.currentTimeMillis();
            BitmapDrawable a = C39914a.m127682a(this.f91009n, i, this.f91004i, this.f91005j, this.f91006k, this.f91007l, this.f90996a);
            long currentTimeMillis2 = this.f91003h - (System.currentTimeMillis() - currentTimeMillis);
            if (currentTimeMillis2 < 0) {
                currentTimeMillis2 = 0;
            }
            if (this.f91010o == 0 && !this.f91011p) {
                currentTimeMillis2 = 0;
            }
            this.f91001f.sendMessageDelayed(Message.obtain(this.f91001f, 2, a), currentTimeMillis2);
            if (this.f91011p) {
                this.f91011p = false;
            }
            this.f91010o++;
        } else if (this.f91002g) {
            this.f91010o = 0;
            this.f91011p = true;
            m112472d();
        } else {
            this.f91001f.sendEmptyMessage(3);
        }
    }

    /* renamed from: a */
    public final void mo88429a() {
        if (!this.f91000e) {
            this.f91000e = true;
            if (this.f90998c != null) {
                this.f90997b.f91024c.sendEmptyMessage(0);
            } else if (this.f91008m != null) {
                this.f90997b.f91024c.sendEmptyMessage(1);
            }
        }
    }

    /* renamed from: a */
    private static void m112469a(C34894b bVar) {
        try {
            Looper looper = bVar.getLooper();
            if (looper != null) {
                if (VERSION.SDK_INT >= 18) {
                    looper.quitSafely();
                    return;
                }
                looper.quit();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static boolean m112470a(File file) {
        if (file.getName().endsWith("png") || file.getName().endsWith("jpg")) {
            return true;
        }
        return false;
    }

    private C34890a(C34892a aVar) {
        this.f90996a = C39915b.m127686a();
        this.f90997b = new C34894b();
        this.f91001f = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                int i;
                switch (message.what) {
                    case 2:
                        if (C34890a.this.f90999d != null) {
                            C34890a.this.f90999d.mo88423a((BitmapDrawable) message.obj, C34890a.this.f90996a);
                        }
                        if (C34890a.this.f91000e) {
                            Handler handler = C34890a.this.f90997b.f91024c;
                            if (C34890a.this.f90998c != null) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            handler.sendEmptyMessage(i);
                            return;
                        }
                        break;
                    case 3:
                        if (C34890a.this.f90999d != null) {
                            C34890a.this.f90999d.mo88425b();
                        }
                        C34890a.this.mo88431b();
                        break;
                }
            }
        };
        this.f90997b.mo88438a(this);
        this.f91002g = aVar.f91014b;
        this.f91003h = aVar.f91015c;
        this.f91004i = aVar.f91016d;
        this.f91005j = aVar.f91017e;
        this.f91006k = aVar.f91018f;
        this.f91007l = aVar.f91013a.getResources().getDisplayMetrics().densityDpi;
        this.f90998c = aVar.f91019g;
        this.f91008m = aVar.f91020h;
        this.f91009n = aVar.f91013a.getResources();
        this.f90999d = aVar.f91021i;
    }

    /* renamed from: a */
    public final void mo88430a(Message message) {
        if (message.what == 0) {
            m112471c();
            return;
        }
        if (message.what == 1) {
            m112472d();
        }
    }
}
