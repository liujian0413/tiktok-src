package com.p280ss.android.image;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ies.uikit.p578c.C11014a;
import com.p280ss.android.common.util.C6775g;
import com.p280ss.android.download.p856a.C19365f;
import com.p280ss.android.download.p856a.C19368h;
import com.p280ss.android.download.p856a.C19368h.C19369a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.image.a */
public final class C19577a {

    /* renamed from: a */
    protected C19365f<String, Bitmap> f52951a;

    /* renamed from: b */
    protected C19369a<String, ImageInfo, Void, ImageView, Bitmap> f52952b;

    /* renamed from: c */
    protected C19368h<String, ImageInfo, Void, ImageView, Bitmap> f52953c;

    /* renamed from: d */
    public volatile boolean f52954d;

    /* renamed from: e */
    boolean f52955e;

    /* renamed from: f */
    boolean f52956f;

    /* renamed from: g */
    public Drawable f52957g;

    /* renamed from: h */
    private final int f52958h;

    /* renamed from: i */
    private Drawable f52959i;

    /* renamed from: j */
    private final int f52960j;

    /* renamed from: k */
    private final C6775g f52961k;

    /* renamed from: l */
    private final boolean f52962l;

    /* renamed from: m */
    private final C6813b f52963m;

    /* renamed from: n */
    private final C19579a f52964n;

    /* renamed from: com.ss.android.image.a$a */
    public interface C19579a {
        /* renamed from: a */
        Bitmap mo51755a(Bitmap bitmap);
    }

    /* renamed from: com.ss.android.image.a$b */
    public static class C19580b implements C19579a {

        /* renamed from: a */
        private final int f52966a;

        /* renamed from: b */
        private final boolean f52967b;

        /* renamed from: a */
        public final Bitmap mo51755a(Bitmap bitmap) {
            if (this.f52966a <= 0) {
                return bitmap;
            }
            if (this.f52967b) {
                return C6813b.m21185b(bitmap, this.f52966a);
            }
            return C6813b.m21178a(bitmap, this.f52966a);
        }

        public C19580b(int i, boolean z) {
            this.f52966a = i;
            this.f52967b = z;
        }
    }

    /* renamed from: b */
    public final void mo51753b() {
        this.f52956f = false;
        this.f52953c.mo51329c();
        this.f52951a.mo51340a(8);
    }

    /* renamed from: a */
    public final void mo51750a() {
        this.f52955e = true;
        this.f52956f = true;
        this.f52953c.mo51330d();
    }

    /* renamed from: c */
    public final void mo51754c() {
        this.f52955e = false;
        this.f52953c.mo51328b();
        if (this.f52961k != null) {
            this.f52961k.mo16567a();
        }
    }

    /* renamed from: a */
    private void m64497a(ImageView imageView) {
        if (this.f52958h > 0) {
            if (this.f52962l) {
                imageView.setBackgroundResource(this.f52958h);
            } else {
                imageView.setImageResource(this.f52958h);
            }
        } else if (this.f52957g == null) {
            if (this.f52959i != null) {
                imageView.setBackgroundDrawable(this.f52959i);
            }
        } else if (this.f52962l) {
            C11014a.m32281a((View) imageView, this.f52957g);
        } else {
            imageView.setImageDrawable(this.f52957g);
        }
    }

    /* renamed from: a */
    public final void mo51751a(ImageView imageView, String str) {
        m64499a(imageView, str, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bitmap mo51749a(String str, ImageInfo imageInfo) {
        try {
            String c = this.f52963m.mo16652c(str);
            String e = this.f52963m.mo16654e(str);
            File file = new File(c);
            File file2 = new File(e);
            boolean z = false;
            if (file.isFile() || file2.isFile()) {
                z = true;
            }
            if (!z && this.f52954d) {
                String a = this.f52963m.mo16647a(str);
                String b = C6813b.m21186b(str);
                z = C19589e.m64525a(this.f52963m.f19428l, 512000, imageInfo.mUri, imageInfo.mUrlList, a, this.f52963m.mo16653d(str), b, null, this.f52961k);
            }
            if (!z) {
                return null;
            }
            if (!new File(c).isFile()) {
                c = e;
            }
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(c, this.f52960j, this.f52960j);
            if (bitmapFromSD != null) {
                if (this.f52964n != null) {
                    return this.f52964n.mo51755a(bitmapFromSD);
                }
                return bitmapFromSD;
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m64499a(ImageView imageView, String str, boolean z) {
        m64498a(imageView, new ImageInfo(str, null), false);
    }

    /* renamed from: a */
    private void m64498a(ImageView imageView, ImageInfo imageInfo, boolean z) {
        if (imageView != null) {
            String str = imageInfo.mKey;
            this.f52959i = imageView.getBackground();
            imageView.setTag(str);
            if (str == null) {
                m64497a(imageView);
                return;
            }
            Bitmap bitmap = (Bitmap) this.f52951a.mo51337a(str);
            if (bitmap == null || z) {
                m64497a(imageView);
                this.f52953c.mo51326a(str, imageInfo, null, imageView);
                return;
            }
            if (this.f52962l) {
                C11014a.m32281a((View) imageView, (Drawable) new BitmapDrawable(imageView.getResources(), bitmap));
            } else {
                imageView.setImageBitmap(bitmap);
                imageView.setBackgroundDrawable(null);
            }
            new ArrayList().add(imageView);
            imageView.setTag(null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo51752a(String str, ImageInfo imageInfo, Collection<ImageView> collection, Bitmap bitmap) {
        if (this.f52955e && str != null && collection != null && bitmap != null) {
            if (bitmap != null) {
                this.f52951a.mo51338a(str, bitmap);
            }
            for (ImageView imageView : collection) {
                if (str.equals(imageView.getTag())) {
                    if (this.f52962l) {
                        imageView.setBackgroundDrawable(new BitmapDrawable(imageView.getResources(), bitmap));
                    } else {
                        imageView.setImageBitmap(bitmap);
                        if (bitmap != null) {
                            imageView.setBackgroundDrawable(null);
                        }
                    }
                    imageView.setTag(null);
                }
            }
        }
    }

    public C19577a(int i, C6775g gVar, C6813b bVar, int i2, boolean z, int i3) {
        this(R.drawable.bk0, gVar, bVar, i2, false, i3, false);
    }

    private C19577a(int i, C6775g gVar, C6813b bVar, int i2, boolean z, C19579a aVar) {
        this(i, gVar, bVar, i2, z, aVar, 16, 2);
    }

    public C19577a(int i, C6775g gVar, C6813b bVar, int i2, boolean z, int i3, boolean z2) {
        this(i, gVar, bVar, i2, z, (C19579a) new C19580b(i3, z2));
    }

    private C19577a(int i, C6775g gVar, C6813b bVar, int i2, boolean z, C19579a aVar, int i3, int i4) {
        this.f52958h = i;
        this.f52960j = i2;
        this.f52961k = gVar;
        this.f52963m = bVar;
        this.f52962l = z;
        this.f52964n = aVar;
        this.f52951a = new C19365f<>(32);
        this.f52952b = new C19369a<String, ImageInfo, Void, ImageView, Bitmap>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Bitmap mo51341a(String str, ImageInfo imageInfo, Void voidR) {
                return C19577a.this.mo51749a(str, imageInfo);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo51342a(String str, ImageInfo imageInfo, Void voidR, Collection<ImageView> collection, Bitmap bitmap) {
                C19577a.this.mo51752a(str, imageInfo, collection, bitmap);
            }
        };
        this.f52953c = new C19368h<>(16, 2, this.f52952b);
        this.f52954d = true;
        this.f52955e = true;
        this.f52956f = true;
    }
}
