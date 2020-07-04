package com.p280ss.android.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.common.util.C6773c;
import com.p280ss.android.common.util.C6775g;
import com.p280ss.android.download.p856a.C19364e;
import com.p280ss.android.download.p856a.C19365f;
import com.p280ss.android.download.p856a.C19368h;
import com.p280ss.android.download.p856a.C19368h.C19369a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.LinkedList;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.image.h */
public final class C19592h implements C6310a {

    /* renamed from: a */
    static final Bitmap f52981a = Bitmap.createBitmap(1, 1, Config.RGB_565);

    /* renamed from: b */
    final Object f52982b;

    /* renamed from: c */
    final LinkedList<C19597b> f52983c;

    /* renamed from: d */
    final WeakHashMap<ImageView, Object> f52984d;

    /* renamed from: e */
    public C19364e<String, Bitmap> f52985e;

    /* renamed from: f */
    C19365f<String, Bitmap> f52986f;

    /* renamed from: g */
    C19369a<String, ImageInfo, Boolean, ImageView, C19596a> f52987g;

    /* renamed from: h */
    C19368h<String, ImageInfo, Boolean, ImageView, C19596a> f52988h;

    /* renamed from: i */
    final boolean f52989i;

    /* renamed from: j */
    protected final int f52990j;

    /* renamed from: k */
    final int f52991k;

    /* renamed from: l */
    final int f52992l;

    /* renamed from: m */
    final C6773c<String> f52993m;

    /* renamed from: n */
    final C6309f f52994n;

    /* renamed from: o */
    final Context f52995o;

    /* renamed from: p */
    final C6775g f52996p;

    /* renamed from: q */
    final C6813b f52997q;

    /* renamed from: r */
    final Resources f52998r;

    /* renamed from: s */
    LoadImagePolicy f52999s;

    /* renamed from: t */
    boolean f53000t;

    /* renamed from: u */
    boolean f53001u;

    /* renamed from: v */
    public boolean f53002v;

    /* renamed from: com.ss.android.image.h$a */
    static class C19596a {

        /* renamed from: a */
        public final boolean f53017a = true;

        /* renamed from: b */
        public final Bitmap f53018b;

        public C19596a(Bitmap bitmap) {
            this.f53018b = bitmap;
        }
    }

    /* renamed from: com.ss.android.image.h$b */
    static class C19597b extends Drawable {

        /* renamed from: a */
        final Drawable f53019a;

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final int getIntrinsicHeight() {
            if (this.f53019a != null) {
                return this.f53019a.getIntrinsicHeight();
            }
            return 0;
        }

        public final int getIntrinsicWidth() {
            if (this.f53019a != null) {
                return this.f53019a.getIntrinsicWidth();
            }
            return 0;
        }

        public C19597b(Drawable drawable) {
            this.f53019a = drawable;
        }

        /* access modifiers changed from: protected */
        public final boolean onLevelChange(int i) {
            if (this.f53019a == null) {
                return false;
            }
            this.f53019a.setLevel(i);
            invalidateSelf();
            return true;
        }

        public final void draw(Canvas canvas) {
            if (this.f53019a != null && this.f53019a.getLevel() > 0) {
                this.f53019a.draw(canvas);
            }
        }

        /* access modifiers changed from: protected */
        public final void onBoundsChange(Rect rect) {
            if (this.f53019a != null) {
                int intrinsicWidth = this.f53019a.getIntrinsicWidth();
                int intrinsicHeight = this.f53019a.getIntrinsicHeight();
                int width = rect.width();
                int height = rect.height();
                if (width > 0 && height > 0 && intrinsicWidth > 0 && intrinsicHeight > 0) {
                    int i = rect.left + ((width - intrinsicWidth) / 2);
                    int i2 = rect.top + ((height - intrinsicHeight) / 2);
                    this.f53019a.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51768a() {
        this.f53000t = true;
        this.f53001u = true;
        this.f52988h.mo51330d();
    }

    /* renamed from: b */
    public final void mo51772b() {
        this.f53001u = false;
        this.f52988h.mo51329c();
        this.f52986f.mo51340a(8);
    }

    /* renamed from: c */
    public final void mo51773c() {
        this.f53000t = false;
        this.f52984d.clear();
        this.f52988h.mo51328b();
        this.f52986f.mo51339a();
        if (this.f52996p != null) {
            this.f52996p.mo16567a();
        }
    }

    /* renamed from: a */
    public final Bitmap mo51766a(String str) {
        String a = C6306c.m19561a(str);
        if (a == null) {
            return null;
        }
        Bitmap bitmap = (Bitmap) this.f52986f.mo51337a(a);
        if (bitmap != null || this.f52985e == null) {
            return bitmap;
        }
        return (Bitmap) this.f52985e.mo51337a(a);
    }

    /* renamed from: a */
    private void m64536a(ImageView imageView) {
        if (imageView != null) {
            this.f52984d.remove(imageView);
            if (this.f52992l > 0) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof C19597b) {
                    this.f52983c.add((C19597b) drawable);
                    imageView.setImageDrawable(null);
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        if (this.f53000t && message.what == 100) {
            String str = null;
            if (message.obj instanceof String) {
                str = (String) message.obj;
            }
            if (!C6319n.m19593a(str)) {
                int i = message.arg1;
                if (i < 0) {
                    i = 0;
                }
                if (i > 99) {
                    i = 99;
                }
                int i2 = i * 100;
                for (ImageView imageView : this.f52984d.keySet()) {
                    if (imageView != null && str.equals(imageView.getTag())) {
                        Drawable drawable = imageView.getDrawable();
                        if (drawable instanceof C19597b) {
                            drawable.setLevel(i2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51769a(ImageView imageView, ImageInfo imageInfo, boolean z) {
        Object obj;
        if (this.f53000t && imageView != null) {
            m64536a(imageView);
            C19597b bVar = null;
            if (imageInfo != null) {
                obj = imageInfo.mKey;
            } else {
                obj = null;
            }
            imageView.setTag(obj);
            Drawable background = imageView.getBackground();
            if (obj == null) {
                if (background != null) {
                    background.setLevel(1);
                }
                return;
            }
            Bitmap bitmap = (Bitmap) this.f52986f.mo51337a(obj);
            if (bitmap == null && this.f52985e != null) {
                bitmap = (Bitmap) this.f52985e.mo51337a(obj);
            }
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                if (background != null) {
                    background.setLevel(2);
                }
                return;
            }
            if (background != null) {
                background.setLevel(0);
            }
            if (this.f52992l > 0) {
                if (!this.f52983c.isEmpty()) {
                    bVar = (C19597b) this.f52983c.removeLast();
                }
                if (bVar == null) {
                    bVar = new C19597b(this.f52998r.getDrawable(this.f52992l));
                }
                imageView.setImageDrawable(bVar);
                bVar.setLevel(0);
            }
            this.f52984d.put(imageView, this.f52982b);
            this.f52988h.mo51326a(obj, imageInfo, Boolean.valueOf(false), imageView);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011e A[Catch:{ Throwable -> 0x018a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011f A[Catch:{ Throwable -> 0x018a }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.image.C19592h.C19596a mo51767a(java.lang.String r31, com.p280ss.android.image.ImageInfo r32, boolean r33) {
        /*
            r30 = this;
            r13 = r30
            r14 = r31
            r15 = r32
            r16 = 0
            com.ss.android.image.b r0 = r13.f52997q     // Catch:{ Throwable -> 0x018a }
            java.lang.String r0 = r0.mo16652c(r14)     // Catch:{ Throwable -> 0x018a }
            com.ss.android.image.b r1 = r13.f52997q     // Catch:{ Throwable -> 0x018a }
            java.lang.String r1 = r1.mo16654e(r14)     // Catch:{ Throwable -> 0x018a }
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x018a }
            r12.<init>(r0)     // Catch:{ Throwable -> 0x018a }
            java.lang.StringBuffer r11 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x018a }
            r11.<init>(r1)     // Catch:{ Throwable -> 0x018a }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x018a }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x018a }
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x018a }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x018a }
            boolean r1 = r2.isFile()     // Catch:{ Throwable -> 0x018a }
            r10 = 1
            r9 = 0
            if (r1 != 0) goto L_0x0039
            boolean r0 = r0.isFile()     // Catch:{ Throwable -> 0x018a }
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            android.content.Context r1 = r13.f52995o     // Catch:{ Throwable -> 0x018a }
            com.ss.android.common.util.NetworkUtils$NetworkType r1 = com.p280ss.android.common.util.NetworkUtils.getNetworkType(r1)     // Catch:{ Throwable -> 0x018a }
            if (r0 != 0) goto L_0x0054
            if (r33 != 0) goto L_0x004e
            com.ss.android.common.util.NetworkUtils$NetworkType r2 = com.p280ss.android.common.util.NetworkUtils.NetworkType.WIFI     // Catch:{ Throwable -> 0x018a }
            if (r1 == r2) goto L_0x004e
            com.ss.android.image.LoadImagePolicy r2 = r13.f52999s     // Catch:{ Throwable -> 0x018a }
            com.ss.android.image.LoadImagePolicy r3 = com.p280ss.android.image.LoadImagePolicy.ALWAYS     // Catch:{ Throwable -> 0x018a }
            if (r2 != r3) goto L_0x0054
        L_0x004e:
            com.ss.android.common.util.NetworkUtils$NetworkType r2 = com.p280ss.android.common.util.NetworkUtils.NetworkType.NONE     // Catch:{ Throwable -> 0x018a }
            if (r1 == r2) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            if (r0 != 0) goto L_0x010f
            if (r1 == 0) goto L_0x010f
            com.ss.android.image.b r0 = r13.f52997q     // Catch:{ Throwable -> 0x018a }
            java.lang.String r4 = r0.mo16647a(r14)     // Catch:{ Throwable -> 0x018a }
            com.ss.android.image.b r0 = r13.f52997q     // Catch:{ Throwable -> 0x018a }
            java.lang.String r5 = r0.mo16653d(r14)     // Catch:{ Throwable -> 0x018a }
            java.lang.String r6 = com.p280ss.android.image.C6813b.m21186b(r31)     // Catch:{ Throwable -> 0x018a }
            java.lang.StringBuffer r8 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x018a }
            r8.<init>(r4)     // Catch:{ Throwable -> 0x018a }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x018a }
            r7.<init>(r5)     // Catch:{ Throwable -> 0x018a }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x018a }
            r3.<init>(r6)     // Catch:{ Throwable -> 0x018a }
            java.lang.String r2 = r32.getExtraKey()     // Catch:{ Throwable -> 0x018a }
            com.ss.android.image.b r0 = r13.f52997q     // Catch:{ Throwable -> 0x018a }
            java.lang.String r17 = r0.mo16652c(r2)     // Catch:{ Throwable -> 0x018a }
            com.ss.android.image.b r0 = r13.f52997q     // Catch:{ Throwable -> 0x018a }
            java.lang.String r18 = r0.mo16654e(r2)     // Catch:{ Throwable -> 0x018a }
            com.ss.android.image.b r0 = r13.f52997q     // Catch:{ Throwable -> 0x018a }
            java.lang.String r19 = r0.mo16647a(r2)     // Catch:{ Throwable -> 0x018a }
            com.ss.android.image.b r0 = r13.f52997q     // Catch:{ Throwable -> 0x018a }
            java.lang.String r20 = r0.mo16653d(r2)     // Catch:{ Throwable -> 0x018a }
            java.lang.String r21 = com.p280ss.android.image.C6813b.m21186b(r2)     // Catch:{ Throwable -> 0x018a }
            boolean r0 = r13.f53002v     // Catch:{ Throwable -> 0x018a }
            if (r0 == 0) goto L_0x00a1
            com.ss.android.common.util.c<java.lang.String> r0 = r13.f52993m     // Catch:{ Throwable -> 0x018a }
            r22 = r0
            goto L_0x00a3
        L_0x00a1:
            r22 = r16
        L_0x00a3:
            boolean r0 = r15.mIsVideo     // Catch:{ Throwable -> 0x018a }
            if (r0 == 0) goto L_0x00f8
            android.content.Context r6 = r13.f52995o     // Catch:{ Throwable -> 0x018a }
            r23 = -1
            java.lang.String r5 = r15.mUri     // Catch:{ Throwable -> 0x018a }
            java.lang.String r4 = r15.mUrlList     // Catch:{ Throwable -> 0x018a }
            com.ss.android.common.util.g r1 = r13.f52996p     // Catch:{ Throwable -> 0x018a }
            com.ss.android.image.h$3 r24 = new com.ss.android.image.h$3     // Catch:{ Throwable -> 0x018a }
            r0 = r24
            r25 = r1
            r1 = r30
            r26 = r3
            r3 = r8
            r27 = r4
            r4 = r19
            r19 = r5
            r5 = r7
            r28 = r6
            r6 = r20
            r20 = r7
            r7 = r26
            r29 = r8
            r8 = r21
            r14 = 0
            r9 = r12
            r14 = 1
            r10 = r17
            r17 = r11
            r21 = r12
            r12 = r18
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Throwable -> 0x018a }
            r0 = r28
            r1 = r23
            r2 = r19
            r3 = r27
            r4 = r29
            r5 = r20
            r6 = r26
            r7 = r22
            r8 = r31
            r9 = r25
            r10 = r24
            boolean r0 = com.p280ss.android.image.C19589e.m64527a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x018a }
            goto L_0x0114
        L_0x00f8:
            r17 = r11
            r21 = r12
            r14 = 1
            android.content.Context r0 = r13.f52995o     // Catch:{ Throwable -> 0x018a }
            r1 = -1
            java.lang.String r2 = r15.mUri     // Catch:{ Throwable -> 0x018a }
            java.lang.String r3 = r15.mUrlList     // Catch:{ Throwable -> 0x018a }
            com.ss.android.common.util.g r9 = r13.f52996p     // Catch:{ Throwable -> 0x018a }
            r7 = r22
            r8 = r31
            boolean r0 = com.p280ss.android.image.C19589e.m64526a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x018a }
            goto L_0x0114
        L_0x010f:
            r17 = r11
            r21 = r12
            r14 = 1
        L_0x0114:
            java.lang.String r1 = r21.toString()     // Catch:{ Throwable -> 0x018a }
            java.lang.String r2 = r17.toString()     // Catch:{ Throwable -> 0x018a }
            if (r0 != 0) goto L_0x011f
            return r16
        L_0x011f:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x018a }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x018a }
            boolean r3 = r0.isFile()     // Catch:{ Throwable -> 0x018a }
            if (r3 != 0) goto L_0x0130
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x018a }
            r0.<init>(r2)     // Catch:{ Throwable -> 0x018a }
            r1 = r2
        L_0x0130:
            boolean r0 = r0.isFile()     // Catch:{ Throwable -> 0x018a }
            if (r0 != 0) goto L_0x0137
            return r16
        L_0x0137:
            int r0 = r13.f52990j     // Catch:{ Throwable -> 0x018a }
            int r2 = r13.f52991k     // Catch:{ Throwable -> 0x018a }
            if (r15 == 0) goto L_0x0147
            boolean r3 = r32.isFixedDisplaySize()     // Catch:{ Throwable -> 0x018a }
            if (r3 == 0) goto L_0x0147
            int r0 = r15.mWidth     // Catch:{ Throwable -> 0x018a }
            int r2 = r15.mHeight     // Catch:{ Throwable -> 0x018a }
        L_0x0147:
            boolean r3 = r13.f52989i     // Catch:{ Throwable -> 0x018a }
            boolean r4 = r15.mNeedAlpha     // Catch:{ Throwable -> 0x018a }
            android.graphics.Bitmap r0 = m64535a(r3, r0, r2, r1, r4)     // Catch:{ Throwable -> 0x018a }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x018a }
            r1.<init>()     // Catch:{ Throwable -> 0x018a }
            boolean r2 = r15.mNeedAlpha     // Catch:{ Throwable -> 0x018a }
            if (r2 == 0) goto L_0x015b
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Throwable -> 0x018a }
            goto L_0x015d
        L_0x015b:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Throwable -> 0x018a }
        L_0x015d:
            r3 = 80
            r0.compress(r2, r3, r1)     // Catch:{ Throwable -> 0x018a }
            r0.recycle()     // Catch:{ Throwable -> 0x018a }
            byte[] r0 = r1.toByteArray()     // Catch:{ Throwable -> 0x018a }
            r1.close()     // Catch:{ Throwable -> 0x018a }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ Throwable -> 0x018a }
            r1.<init>()     // Catch:{ Throwable -> 0x018a }
            r1.inPurgeable = r14     // Catch:{ Throwable -> 0x018a }
            boolean r2 = r15.mNeedAlpha     // Catch:{ Throwable -> 0x018a }
            if (r2 == 0) goto L_0x017a
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Throwable -> 0x018a }
            goto L_0x017c
        L_0x017a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ Throwable -> 0x018a }
        L_0x017c:
            r1.inPreferredConfig = r2     // Catch:{ Throwable -> 0x018a }
            int r2 = r0.length     // Catch:{ Throwable -> 0x018a }
            r3 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r2, r1)     // Catch:{ Throwable -> 0x018a }
            com.ss.android.image.h$a r1 = new com.ss.android.image.h$a     // Catch:{ Throwable -> 0x018a }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x018a }
            return r1
        L_0x018a:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.image.C19592h.mo51767a(java.lang.String, com.ss.android.image.ImageInfo, boolean):com.ss.android.image.h$a");
    }

    /* renamed from: a */
    public final void mo51770a(ImageView imageView, String str, String str2) {
        mo51769a(imageView, new ImageInfo(str, null), false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51771a(String str, ImageInfo imageInfo, Collection<ImageView> collection, C19596a aVar) {
        Bitmap bitmap;
        if (this.f53000t && str != null && collection != null) {
            if (aVar != null) {
                bitmap = aVar.f53018b;
            } else {
                bitmap = null;
            }
            boolean z = false;
            for (ImageView imageView : collection) {
                if (str.equals(imageView.getTag())) {
                    Drawable background = imageView.getBackground();
                    m64536a(imageView);
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                        if (background != null) {
                            background.setLevel(2);
                        }
                    } else {
                        imageView.setImageDrawable(null);
                        if (background != null) {
                            background.setLevel(1);
                        }
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    this.f52984d.remove(imageView);
                    z = true;
                }
            }
            if (z && bitmap != null) {
                this.f52986f.mo51338a(str, bitmap);
                if (this.f52985e != null) {
                    this.f52985e.mo51338a(str, bitmap);
                }
            }
        }
    }

    /* renamed from: a */
    private static Bitmap m64535a(boolean z, int i, int i2, String str, boolean z2) {
        Bitmap bitmap;
        Config config;
        Bitmap createBitmap;
        if (!z) {
            if (z2) {
                config = Config.ARGB_8888;
            } else {
                config = null;
            }
            bitmap = BitmapUtils.getBitmapFromSD(str, 1000, i2, config);
            if (i <= 0 || bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = (float) i2;
            float f2 = (float) height;
            if (((int) (((f * 1.0f) * ((float) width)) / f2)) > i) {
                int i3 = (int) (((f2 * 1.0f) * ((float) i)) / f);
                createBitmap = Bitmap.createBitmap(bitmap, (width - i3) / 2, 0, i3, height);
            }
            return bitmap;
        } else if (i2 <= 0) {
            try {
                return BitmapUtils.loadBitmap(i, str, z2);
            } catch (Exception unused) {
                bitmap = null;
            }
        } else {
            bitmap = BitmapUtils.getBitmapFromSD(str, i, z2);
            if (bitmap == null) {
                return null;
            }
            try {
                int width2 = bitmap.getWidth();
                float f3 = (float) i;
                float f4 = (float) width2;
                if (((int) (((f3 * 1.0f) * ((float) bitmap.getHeight())) / f4)) > i2) {
                    createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, (int) (((f4 * 1.0f) * ((float) i2)) / f3));
                }
            } catch (Exception unused2) {
            }
            return bitmap;
        }
        bitmap = createBitmap;
        return bitmap;
    }

    public C19592h(Context context, C6775g gVar, int i, int i2, int i3, C6813b bVar, int i4, int i5, int i6) {
        this(context, gVar, 4, 4, 4, bVar, i4, i5, R.drawable.ws, true);
    }

    private C19592h(Context context, C6775g gVar, int i, int i2, int i3, C6813b bVar, int i4, int i5, int i6, boolean z) {
        this.f52982b = new Object();
        this.f52983c = new LinkedList<>();
        this.f52984d = new WeakHashMap<>();
        this.f52985e = null;
        this.f52994n = new C6309f(Looper.getMainLooper(), this);
        this.f52995o = context.getApplicationContext();
        this.f52998r = this.f52995o.getResources();
        this.f52990j = i4;
        this.f52991k = i5;
        this.f52996p = gVar;
        this.f52997q = bVar;
        this.f52999s = LoadImagePolicy.ALWAYS;
        this.f52992l = i6;
        this.f52989i = true;
        if (this.f52990j > 0) {
            this.f52993m = new C6773c<String>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo16566a(int i, String str) {
                    if (str != null) {
                        Message obtainMessage = C19592h.this.f52994n.obtainMessage(100);
                        obtainMessage.arg1 = i;
                        obtainMessage.obj = str;
                        C19592h.this.f52994n.sendMessage(obtainMessage);
                    }
                }
            };
            this.f52986f = new C19365f<>(i);
            this.f52987g = new C19369a<String, ImageInfo, Boolean, ImageView, C19596a>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C19596a mo51341a(String str, ImageInfo imageInfo, Boolean bool) {
                    return C19592h.this.mo51767a(str, imageInfo, bool.booleanValue());
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo51342a(String str, ImageInfo imageInfo, Boolean bool, Collection<ImageView> collection, C19596a aVar) {
                    C19592h.this.mo51771a(str, imageInfo, collection, aVar);
                }
            };
            this.f52988h = new C19368h<>(i2, i3, this.f52987g);
            this.f53000t = true;
            this.f53001u = true;
            return;
        }
        throw new IllegalArgumentException("fitWidth but maxWidth is not positive");
    }
}
