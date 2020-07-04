package com.soundcloud.android.crop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES10;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.crop.C18741c.C18743b;
import com.soundcloud.android.crop.ImageViewTouchBase.C18734a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;

public class CropImageActivity extends C18741c {

    /* renamed from: a */
    public final Handler f50555a = new Handler();

    /* renamed from: b */
    public int f50556b;

    /* renamed from: c */
    public int f50557c;

    /* renamed from: d */
    public boolean f50558d;

    /* renamed from: e */
    public C18744d f50559e;

    /* renamed from: f */
    public CropImageView f50560f;

    /* renamed from: g */
    public C18738b f50561g;

    /* renamed from: h */
    private int f50562h;

    /* renamed from: i */
    private int f50563i;

    /* renamed from: j */
    private int f50564j;

    /* renamed from: k */
    private Uri f50565k;

    /* renamed from: l */
    private Uri f50566l;

    /* renamed from: m */
    private int f50567m;

    /* renamed from: com.soundcloud.android.crop.CropImageActivity$a */
    class C18730a {
        /* renamed from: b */
        public final void mo49242b() {
            CropImageActivity.this.f50555a.post(new Runnable() {
                public final void run() {
                    C18730a.this.mo49241a();
                    CropImageActivity.this.f50560f.invalidate();
                    if (CropImageActivity.this.f50560f.f50580a.size() == 1) {
                        CropImageActivity.this.f50561g = (C18738b) CropImageActivity.this.f50560f.f50580a.get(0);
                        CropImageActivity.this.f50561g.f50617d = true;
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo49241a() {
            int i;
            if (CropImageActivity.this.f50559e != null) {
                C18738b bVar = new C18738b(CropImageActivity.this.f50560f);
                int c = CropImageActivity.this.f50559e.mo49281c();
                int b = CropImageActivity.this.f50559e.mo49280b();
                boolean z = false;
                Rect rect = new Rect(0, 0, c, b);
                int min = (Math.min(c, b) * 4) / 5;
                if (CropImageActivity.this.f50556b == 0 || CropImageActivity.this.f50557c == 0) {
                    i = min;
                } else if (CropImageActivity.this.f50556b > CropImageActivity.this.f50557c) {
                    i = (CropImageActivity.this.f50557c * min) / CropImageActivity.this.f50556b;
                } else {
                    i = min;
                    min = (CropImageActivity.this.f50556b * min) / CropImageActivity.this.f50557c;
                }
                int i2 = (c - min) / 2;
                int i3 = (b - i) / 2;
                RectF rectF = new RectF((float) i2, (float) i3, (float) (i2 + min), (float) (i3 + i));
                Matrix unrotatedMatrix = CropImageActivity.this.f50560f.getUnrotatedMatrix();
                if (!(CropImageActivity.this.f50556b == 0 || CropImageActivity.this.f50557c == 0)) {
                    z = true;
                }
                bVar.mo49275a(unrotatedMatrix, rect, rectF, z);
                CropImageActivity.this.f50560f.mo49248a(bVar);
            }
        }

        private C18730a() {
        }
    }

    public boolean onSearchRequested() {
        return false;
    }

    /* renamed from: e */
    private int m61312e() {
        int f = m61313f();
        if (f == 0) {
            return 2048;
        }
        return Math.min(f, 4096);
    }

    /* renamed from: f */
    private static int m61313f() {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        return iArr[0];
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f50559e != null) {
            this.f50559e.mo49282d();
        }
    }

    /* renamed from: b */
    private void m61307b() {
        requestWindowFeature(1);
        if (VERSION.SDK_INT >= 19) {
            getWindow().clearFlags(67108864);
        }
    }

    /* renamed from: h */
    private void m61315h() {
        this.f50560f.mo49244a();
        if (this.f50559e != null) {
            this.f50559e.mo49282d();
        }
        System.gc();
    }

    /* renamed from: c */
    private void m61310c() {
        setContentView(R.layout.ix);
        this.f50560f = (CropImageView) findViewById(R.id.a5_);
        this.f50560f.f50582c = this;
        this.f50560f.setRecycler(new C18734a() {
            /* renamed from: a */
            public final void mo49234a(Bitmap bitmap) {
                bitmap.recycle();
                System.gc();
            }
        });
        findViewById(R.id.ps).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CropImageActivity.this.setResult(0);
                CropImageActivity.this.finish();
            }
        });
        findViewById(R.id.q2).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                CropImageActivity.this.mo49227a();
            }
        });
    }

    /* renamed from: g */
    private void m61314g() {
        if (!isFinishing()) {
            this.f50560f.mo49249a(this.f50559e, true);
            C18735a.m61352a(this, null, getResources().getString(R.string.aly), new Runnable() {
                public final void run() {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    CropImageActivity.this.f50555a.post(new Runnable() {
                        public final void run() {
                            if (CropImageActivity.this.f50560f.getScale() == 1.0f) {
                                CropImageActivity.this.f50560f.mo49259b();
                            }
                            countDownLatch.countDown();
                        }
                    });
                    try {
                        countDownLatch.await();
                        new C18730a().mo49242b();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }, this.f50555a);
        }
    }

    /* renamed from: a */
    public final void mo49227a() {
        if (this.f50561g != null && !this.f50558d) {
            this.f50558d = true;
            Rect a = this.f50561g.mo49271a((float) this.f50567m);
            int width = a.width();
            int height = a.height();
            if (this.f50562h > 0 && this.f50563i > 0 && (width > this.f50562h || height > this.f50563i)) {
                float f = ((float) width) / ((float) height);
                if (((float) this.f50562h) / ((float) this.f50563i) > f) {
                    height = this.f50563i;
                    width = (int) ((((float) this.f50563i) * f) + 0.5f);
                } else {
                    int i = this.f50562h;
                    height = (int) ((((float) this.f50562h) / f) + 0.5f);
                    width = i;
                }
            }
            try {
                Bitmap a2 = m61305a(a, width, height);
                if (a2 != null) {
                    this.f50560f.mo49249a(new C18744d(a2, this.f50564j), true);
                    this.f50560f.mo49259b();
                    this.f50560f.f50580a.clear();
                }
                m61308b(a2);
            } catch (IllegalArgumentException e) {
                m61306a((Throwable) e);
                finish();
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x00a1=Splitter:B:24:0x00a1, B:18:0x0088=Splitter:B:18:0x0088} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m61311d() {
        /*
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0034
            java.lang.String r2 = "aspect_x"
            int r2 = r1.getInt(r2)
            r5.f50556b = r2
            java.lang.String r2 = "aspect_y"
            int r2 = r1.getInt(r2)
            r5.f50557c = r2
            java.lang.String r2 = "max_x"
            int r2 = r1.getInt(r2)
            r5.f50562h = r2
            java.lang.String r2 = "max_y"
            int r2 = r1.getInt(r2)
            r5.f50563i = r2
            java.lang.String r2 = "output"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            r5.f50566l = r1
        L_0x0034:
            android.net.Uri r0 = r0.getData()
            r5.f50565k = r0
            android.net.Uri r0 = r5.f50565k
            if (r0 == 0) goto L_0x00bb
            android.content.ContentResolver r0 = r5.getContentResolver()
            android.net.Uri r1 = r5.f50565k
            java.io.File r0 = com.soundcloud.android.crop.C18735a.m61350a(r5, r0, r1)
            int r0 = com.soundcloud.android.crop.C18735a.m61349a(r0)
            r5.f50564j = r0
            r0 = 0
            android.net.Uri r1 = r5.f50565k     // Catch:{ IOException -> 0x009d, OutOfMemoryError -> 0x0084, all -> 0x007f }
            int r1 = r5.m61304a(r1)     // Catch:{ IOException -> 0x009d, OutOfMemoryError -> 0x0084, all -> 0x007f }
            r5.f50567m = r1     // Catch:{ IOException -> 0x009d, OutOfMemoryError -> 0x0084, all -> 0x007f }
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch:{ IOException -> 0x009d, OutOfMemoryError -> 0x0084, all -> 0x007f }
            android.net.Uri r2 = r5.f50565k     // Catch:{ IOException -> 0x009d, OutOfMemoryError -> 0x0084, all -> 0x007f }
            java.io.InputStream r1 = r1.openInputStream(r2)     // Catch:{ IOException -> 0x009d, OutOfMemoryError -> 0x0084, all -> 0x007f }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x007d, OutOfMemoryError -> 0x007b }
            r2.<init>()     // Catch:{ IOException -> 0x007d, OutOfMemoryError -> 0x007b }
            int r3 = r5.f50567m     // Catch:{ IOException -> 0x007d, OutOfMemoryError -> 0x007b }
            r2.inSampleSize = r3     // Catch:{ IOException -> 0x007d, OutOfMemoryError -> 0x007b }
            com.soundcloud.android.crop.d r3 = new com.soundcloud.android.crop.d     // Catch:{ IOException -> 0x007d, OutOfMemoryError -> 0x007b }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch:{ IOException -> 0x007d, OutOfMemoryError -> 0x007b }
            int r2 = r5.f50564j     // Catch:{ IOException -> 0x007d, OutOfMemoryError -> 0x007b }
            r3.<init>(r0, r2)     // Catch:{ IOException -> 0x007d, OutOfMemoryError -> 0x007b }
            r5.f50559e = r3     // Catch:{ IOException -> 0x007d, OutOfMemoryError -> 0x007b }
            com.soundcloud.android.crop.C18735a.m61353a(r1)
            return
        L_0x007b:
            r0 = move-exception
            goto L_0x0088
        L_0x007d:
            r0 = move-exception
            goto L_0x00a1
        L_0x007f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x00b7
        L_0x0084:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0088:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "OOM reading image: "
            r2.<init>(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x00b6 }
            r2.append(r3)     // Catch:{ all -> 0x00b6 }
            r5.m61306a(r0)     // Catch:{ all -> 0x00b6 }
            com.soundcloud.android.crop.C18735a.m61353a(r1)
            return
        L_0x009d:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x00a1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "Error reading image: "
            r2.<init>(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x00b6 }
            r2.append(r3)     // Catch:{ all -> 0x00b6 }
            r5.m61306a(r0)     // Catch:{ all -> 0x00b6 }
            com.soundcloud.android.crop.C18735a.m61353a(r1)
            return
        L_0x00b6:
            r0 = move-exception
        L_0x00b7:
            com.soundcloud.android.crop.C18735a.m61353a(r1)
            throw r0
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.soundcloud.android.crop.CropImageActivity.m61311d():void");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49229a(C18743b bVar) {
        super.mo49229a(bVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo49230b(C18743b bVar) {
        super.mo49230b(bVar);
    }

    /* renamed from: b */
    private void m61309b(Uri uri) {
        setResult(-1, new Intent().putExtra("output", uri));
    }

    /* renamed from: a */
    private void m61306a(Throwable th) {
        setResult(404, new Intent().putExtra("error", th));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m61307b();
        m61310c();
        m61311d();
        if (this.f50559e == null) {
            finish();
        } else {
            m61314g();
        }
    }

    /* renamed from: a */
    private int m61304a(Uri uri) throws IOException {
        Options options = new Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStream = null;
        try {
            InputStream openInputStream = getContentResolver().openInputStream(uri);
            try {
                BitmapFactory.decodeStream(openInputStream, null, options);
                C18735a.m61353a((Closeable) openInputStream);
                int e = m61312e();
                while (true) {
                    if (options.outHeight / i <= e && options.outWidth / i <= e) {
                        return i;
                    }
                    i <<= 1;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = openInputStream;
                C18735a.m61353a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C18735a.m61353a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: b */
    private void m61308b(final Bitmap bitmap) {
        if (bitmap != null) {
            C18735a.m61352a(this, null, getResources().getString(R.string.alx), new Runnable() {
                public final void run() {
                    CropImageActivity.this.mo49228a(bitmap);
                }
            }, this.f50555a);
        } else {
            finish();
        }
    }

    /* renamed from: a */
    public final void mo49228a(final Bitmap bitmap) {
        if (this.f50566l != null) {
            OutputStream outputStream = null;
            try {
                OutputStream openOutputStream = getContentResolver().openOutputStream(this.f50566l);
                if (openOutputStream != null) {
                    try {
                        bitmap.compress(CompressFormat.JPEG, 90, openOutputStream);
                    } catch (IOException e) {
                        OutputStream outputStream2 = openOutputStream;
                        e = e;
                        outputStream = outputStream2;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = openOutputStream;
                        C18735a.m61353a((Closeable) outputStream);
                        throw th;
                    }
                }
                C18735a.m61353a((Closeable) openOutputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    m61306a((Throwable) e);
                    new StringBuilder("Cannot open file: ").append(this.f50566l);
                    C18735a.m61353a((Closeable) outputStream);
                    C18735a.m61354a(C18735a.m61350a(this, getContentResolver(), this.f50565k), C18735a.m61350a(this, getContentResolver(), this.f50566l));
                    m61309b(this.f50566l);
                    this.f50555a.post(new Runnable() {
                        public final void run() {
                            CropImageActivity.this.f50560f.mo49244a();
                            bitmap.recycle();
                        }
                    });
                    finish();
                } catch (Throwable th2) {
                    th = th2;
                    C18735a.m61353a((Closeable) outputStream);
                    throw th;
                }
            }
            C18735a.m61354a(C18735a.m61350a(this, getContentResolver(), this.f50565k), C18735a.m61350a(this, getContentResolver(), this.f50566l));
            m61309b(this.f50566l);
        }
        this.f50555a.post(new Runnable() {
            public final void run() {
                CropImageActivity.this.f50560f.mo49244a();
                bitmap.recycle();
            }
        });
        finish();
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r5v14, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r5v15, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r10v0, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r0v20, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        r0 = e;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        r0 = e;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e9, code lost:
        r0 = th;
        r4 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v1
      assigns: []
      uses: []
      mth insns count: 144
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0015] */
    /* JADX WARNING: Unknown variable types count: 21 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m61305a(android.graphics.Rect r18, int r19, int r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            r17.m61315h()
            r3 = 0
            android.content.ContentResolver r4 = r17.getContentResolver()     // Catch:{ IOException -> 0x010a, OutOfMemoryError -> 0x00f6 }
            android.net.Uri r5 = r1.f50565k     // Catch:{ IOException -> 0x010a, OutOfMemoryError -> 0x00f6 }
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch:{ IOException -> 0x010a, OutOfMemoryError -> 0x00f6 }
            r5 = 0
            android.graphics.BitmapRegionDecoder r5 = android.graphics.BitmapRegionDecoder.newInstance(r4, r5)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r6 = r5.getWidth()     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r7 = r5.getHeight()     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r8 = r1.f50564j     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            if (r8 == 0) goto L_0x0066
            android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r8.<init>()     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r9 = r1.f50564j     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r9 = -r9
            float r9 = (float) r9     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r8.setRotate(r9)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            android.graphics.RectF r9 = new android.graphics.RectF     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r9.<init>()     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            android.graphics.RectF r10 = new android.graphics.RectF     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r11 = r18
            r10.<init>(r11)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r8.mapRect(r9, r10)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            float r8 = r9.left     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0049
            float r8 = (float) r6     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            goto L_0x004a
        L_0x0049:
            r8 = 0
        L_0x004a:
            float r11 = r9.top     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x0051
            float r10 = (float) r7     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
        L_0x0051:
            r9.offset(r8, r10)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            float r10 = r9.left     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r10 = (int) r10     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            float r11 = r9.top     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r11 = (int) r11     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            float r12 = r9.right     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r12 = (int) r12     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            float r9 = r9.bottom     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r9 = (int) r9     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r8.<init>(r10, r11, r12, r9)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            goto L_0x0069
        L_0x0066:
            r11 = r18
            r8 = r11
        L_0x0069:
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch:{ IllegalArgumentException -> 0x00b5 }
            r9.<init>()     // Catch:{ IllegalArgumentException -> 0x00b5 }
            android.graphics.Bitmap r5 = r5.decodeRegion(r8, r9)     // Catch:{ IllegalArgumentException -> 0x00b5 }
            int r3 = r8.width()     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            if (r3 > r0) goto L_0x0081
            int r3 = r8.height()     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            if (r3 <= r2) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r0 = r5
            goto L_0x00a8
        L_0x0081:
            android.graphics.Matrix r15 = new android.graphics.Matrix     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            r15.<init>()     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            float r0 = (float) r0     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            int r3 = r8.width()     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            float r3 = (float) r3     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            float r0 = r0 / r3
            float r2 = (float) r2     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            int r3 = r8.height()     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            float r3 = (float) r3     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            float r2 = r2 / r3
            r15.postScale(r0, r2)     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            r11 = 0
            r12 = 0
            int r13 = r5.getWidth()     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            int r14 = r5.getHeight()     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
            r16 = 1
            r10 = r5
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IllegalArgumentException -> 0x00b2, IOException -> 0x00b0, OutOfMemoryError -> 0x00ae, all -> 0x00e9 }
        L_0x00a8:
            com.soundcloud.android.crop.C18735a.m61353a(r4)
            r5 = r0
            goto L_0x0120
        L_0x00ae:
            r0 = move-exception
            goto L_0x00ed
        L_0x00b0:
            r0 = move-exception
            goto L_0x00f1
        L_0x00b2:
            r0 = move-exception
            r3 = r5
            goto L_0x00b6
        L_0x00b5:
            r0 = move-exception
        L_0x00b6:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            java.lang.String r9 = "Rectangle "
            r5.<init>(r9)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r5.append(r8)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            java.lang.String r8 = " is outside of the image ("
            r5.append(r8)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r5.append(r6)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            java.lang.String r6 = ","
            r5.append(r6)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r5.append(r7)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            java.lang.String r6 = ","
            r5.append(r6)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            int r6 = r1.f50564j     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r5.append(r6)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
            throw r2     // Catch:{ IOException -> 0x00ef, OutOfMemoryError -> 0x00eb, all -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            goto L_0x0121
        L_0x00eb:
            r0 = move-exception
            r5 = r3
        L_0x00ed:
            r3 = r4
            goto L_0x00f8
        L_0x00ef:
            r0 = move-exception
            r5 = r3
        L_0x00f1:
            r3 = r4
            goto L_0x010c
        L_0x00f3:
            r0 = move-exception
            r4 = r3
            goto L_0x0121
        L_0x00f6:
            r0 = move-exception
            r5 = r3
        L_0x00f8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "OOM cropping image: "
            r2.<init>(r4)     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x00f3 }
            r2.append(r4)     // Catch:{ all -> 0x00f3 }
            r1.m61306a(r0)     // Catch:{ all -> 0x00f3 }
            goto L_0x011d
        L_0x010a:
            r0 = move-exception
            r5 = r3
        L_0x010c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "Error cropping image: "
            r2.<init>(r4)     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x00f3 }
            r2.append(r4)     // Catch:{ all -> 0x00f3 }
            r1.m61306a(r0)     // Catch:{ all -> 0x00f3 }
        L_0x011d:
            com.soundcloud.android.crop.C18735a.m61353a(r3)
        L_0x0120:
            return r5
        L_0x0121:
            com.soundcloud.android.crop.C18735a.m61353a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.soundcloud.android.crop.CropImageActivity.m61305a(android.graphics.Rect, int, int):android.graphics.Bitmap");
    }
}
