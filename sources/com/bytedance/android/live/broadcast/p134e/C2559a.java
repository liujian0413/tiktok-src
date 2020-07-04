package com.bytedance.android.live.broadcast.p134e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.log.C8444d;
import com.facebook.common.p685b.C13275a;
import com.facebook.common.references.C13326a;
import com.facebook.datasource.C13346c;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.p718e.C13639b;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.broadcast.e.a */
public final class C2559a extends HandlerThread implements Callback {

    /* renamed from: a */
    public Bitmap f8215a;

    /* renamed from: b */
    private int[] f8216b = {R.drawable.blo, R.drawable.blp, R.drawable.blq, R.drawable.blr, R.drawable.bls, R.drawable.blt, R.drawable.blu, R.drawable.blv, R.drawable.blw, R.drawable.blx, R.drawable.bly, R.drawable.blz, R.drawable.bm0, R.drawable.bm1, R.drawable.bm2};

    /* renamed from: c */
    private Surface f8217c;

    /* renamed from: d */
    private C2561a f8218d;

    /* renamed from: e */
    private int f8219e = -1;

    /* renamed from: f */
    private Bitmap f8220f;

    /* renamed from: g */
    private Bitmap f8221g;

    /* renamed from: h */
    private Bitmap[] f8222h;

    /* renamed from: i */
    private Paint f8223i;

    /* renamed from: j */
    private Paint f8224j;

    /* renamed from: k */
    private int f8225k;

    /* renamed from: l */
    private Rect f8226l;

    /* renamed from: m */
    private Rect f8227m;

    /* renamed from: n */
    private Rect f8228n;

    /* renamed from: o */
    private Handler f8229o;

    /* renamed from: p */
    private boolean f8230p;

    /* renamed from: com.bytedance.android.live.broadcast.e.a$a */
    public static class C2561a {

        /* renamed from: a */
        public String f8232a;

        /* renamed from: b */
        public int f8233b;

        /* renamed from: c */
        public int f8234c;
    }

    /* renamed from: b */
    public final void mo9157b() {
        if (this.f8229o != null) {
            this.f8229o.sendEmptyMessage(234);
        }
    }

    public final boolean quitSafely() {
        boolean quitSafely = super.quitSafely();
        if (this.f8229o != null) {
            this.f8229o.sendEmptyMessage(235);
        }
        return quitSafely;
    }

    /* access modifiers changed from: protected */
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f8229o = new Handler(getLooper(), this);
        mo9156a();
        m10524d();
    }

    /* renamed from: d */
    private void m10524d() {
        C13622l.m40095a().mo33208d().mo33172a(ImageRequest.fromUri(this.f8218d.f8232a), (Object) null).mo32633a(new C13639b() {
            public final void onFailureImpl(C13346c<C13326a<C13645c>> cVar) {
            }

            /* renamed from: a */
            public final void mo9161a(Bitmap bitmap) {
                if (bitmap != null) {
                    if (C2559a.this.f8215a != null) {
                        C2559a.this.f8215a.recycle();
                    }
                    C2559a.this.f8215a = bitmap.copy(Config.ARGB_8888, false);
                    C2559a.this.mo9156a();
                }
            }
        }, C13275a.m38815a());
    }

    /* renamed from: e */
    private void m10525e() {
        Bitmap[] bitmapArr;
        this.f8230p = true;
        if (this.f8215a != null && !this.f8215a.isRecycled()) {
            this.f8215a.recycle();
            this.f8215a = null;
        }
        if (this.f8220f != null && !this.f8220f.isRecycled()) {
            this.f8220f.recycle();
            this.f8220f = null;
        }
        if (this.f8221g != null && !this.f8221g.isRecycled()) {
            this.f8221g.recycle();
            this.f8221g = null;
        }
        if (this.f8222h != null) {
            for (Bitmap bitmap : this.f8222h) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            this.f8222h = null;
        }
        this.f8217c.release();
        this.f8217c = null;
    }

    /* renamed from: c */
    private void m10523c() {
        if (!this.f8230p) {
            try {
                if (this.f8217c.isValid()) {
                    Canvas lockCanvas = this.f8217c.lockCanvas(this.f8226l);
                    if (lockCanvas != null) {
                        if (this.f8220f.isRecycled() && this.f8215a != null && !this.f8215a.isRecycled()) {
                            this.f8220f = Bitmap.createScaledBitmap(this.f8215a, this.f8218d.f8233b, this.f8218d.f8234c, false);
                        }
                        lockCanvas.drawBitmap(this.f8220f, null, this.f8226l, null);
                        lockCanvas.drawRect(this.f8226l, this.f8224j);
                        if (this.f8219e >= 0) {
                            Bitmap[] bitmapArr = this.f8222h;
                            int i = this.f8219e;
                            this.f8219e = i + 1;
                            Bitmap bitmap = bitmapArr[i];
                            if (bitmap != null && !bitmap.isRecycled()) {
                                lockCanvas.drawBitmap(bitmap, null, this.f8228n, this.f8223i);
                            }
                            if (this.f8219e >= this.f8225k) {
                                this.f8219e = -1;
                            }
                        }
                        if (this.f8221g != null && !this.f8221g.isRecycled()) {
                            lockCanvas.drawBitmap(this.f8221g, null, this.f8227m, this.f8223i);
                        }
                        this.f8217c.unlockCanvasAndPost(lockCanvas);
                        if (this.f8229o != null) {
                            this.f8229o.sendEmptyMessageDelayed(233, 130);
                        }
                    }
                }
            } catch (Exception e) {
                C8444d.m25673b();
                C8444d.m11969a(6, e.getStackTrace());
            }
        }
    }

    /* renamed from: a */
    public final void mo9156a() {
        try {
            if (this.f8220f != null && !this.f8220f.isRecycled()) {
                this.f8220f.recycle();
            }
            this.f8220f = Bitmap.createScaledBitmap(this.f8215a, this.f8218d.f8233b, this.f8218d.f8234c, false);
            NativeBlurFilter.iterativeBoxBlur(this.f8220f, 3, 10);
            if (this.f8221g != null && !this.f8221g.isRecycled()) {
                this.f8221g.recycle();
            }
            int i = (int) (((float) this.f8218d.f8233b) * 0.41935483f);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f8215a, i, i, false);
            this.f8221g = C3358ac.m12514a(createScaledBitmap);
            createScaledBitmap.recycle();
            this.f8225k = this.f8216b.length;
            this.f8222h = new Bitmap[this.f8225k];
            Resources resources = C3358ac.m12528e().getResources();
            for (int i2 = 0; i2 < this.f8225k; i2++) {
                this.f8222h[i2] = BitmapFactory.decodeResource(resources, this.f8216b[i2]);
            }
            if (this.f8229o != null) {
                this.f8229o.sendEmptyMessage(233);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 233:
                m10523c();
                break;
            case 234:
                if (this.f8219e < 0) {
                    this.f8219e = 0;
                    break;
                }
                break;
            case 235:
                m10525e();
                break;
        }
        return true;
    }

    public C2559a(Surface surface, C2561a aVar) {
        super("AudioEffectDrewThread");
        this.f8217c = surface;
        this.f8218d = aVar;
        this.f8226l = new Rect(0, 0, aVar.f8233b, aVar.f8234c);
        int i = (int) (((float) aVar.f8233b) * 0.41935483f);
        int i2 = (aVar.f8233b - i) / 2;
        int i3 = (aVar.f8234c - i) / 2;
        this.f8227m = new Rect(i2, i3, i2 + i, i + i3);
        int i4 = (int) (((float) aVar.f8233b) * 0.5645161f);
        int i5 = (aVar.f8233b - i4) / 2;
        int i6 = (aVar.f8234c - i4) / 2;
        this.f8228n = new Rect(i5, i6, i5 + i4, i4 + i6);
        this.f8223i = new Paint(1);
        this.f8223i.setAntiAlias(true);
        this.f8223i.setFilterBitmap(true);
        this.f8223i.setDither(true);
        this.f8224j = new Paint(1);
        this.f8224j.setAntiAlias(true);
        this.f8224j.setFilterBitmap(true);
        this.f8224j.setDither(true);
        this.f8224j.setColor(Color.parseColor("#80000000"));
        this.f8215a = BitmapFactory.decodeResource(C3358ac.m12528e().getResources(), R.drawable.c61);
    }
}
