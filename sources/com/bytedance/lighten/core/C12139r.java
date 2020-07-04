package com.bytedance.lighten.core;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.lighten.core.p610a.C12092a;
import com.bytedance.lighten.core.p612c.C12107e;
import com.bytedance.lighten.core.p612c.C12112j;
import com.bytedance.lighten.core.p612c.C12113k;
import com.bytedance.lighten.core.p612c.C12115m;
import com.bytedance.lighten.core.p613d.C12123c;
import java.util.Collections;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.lighten.core.r */
public final class C12139r {

    /* renamed from: O */
    public static final C12139r f32299O = new C12139r(new C12092a(Collections.emptyList())).m35324a(Uri.parse(""));

    /* renamed from: A */
    public ImagePiplinePriority f32300A = ImagePiplinePriority.MEDIUM;

    /* renamed from: B */
    public String f32301B;

    /* renamed from: C */
    public Executor f32302C;

    /* renamed from: D */
    public CacheChoice f32303D = CacheChoice.DEFAULT;

    /* renamed from: E */
    public C12128i f32304E;

    /* renamed from: F */
    public ImageView f32305F;

    /* renamed from: G */
    public C12112j f32306G;

    /* renamed from: H */
    public C12113k f32307H;

    /* renamed from: I */
    public C12115m f32308I;

    /* renamed from: J */
    public boolean f32309J;

    /* renamed from: K */
    public boolean f32310K;

    /* renamed from: L */
    public C12092a f32311L;

    /* renamed from: M */
    public int f32312M = C12091a.f32189a.f32190b;

    /* renamed from: N */
    public C12107e f32313N;

    /* renamed from: a */
    public Uri f32314a;

    /* renamed from: b */
    public Context f32315b;

    /* renamed from: c */
    public boolean f32316c;

    /* renamed from: d */
    public boolean f32317d = true;

    /* renamed from: e */
    public boolean f32318e;

    /* renamed from: f */
    public int f32319f = -1;

    /* renamed from: g */
    public boolean f32320g;

    /* renamed from: h */
    public int f32321h = -1;

    /* renamed from: i */
    public int f32322i = -1;

    /* renamed from: j */
    public int f32323j = -1;

    /* renamed from: k */
    public int f32324k = -1;

    /* renamed from: l */
    public int f32325l = -1;

    /* renamed from: m */
    public int f32326m = -1;

    /* renamed from: n */
    public Drawable f32327n;

    /* renamed from: o */
    public ScaleType f32328o;

    /* renamed from: p */
    public int f32329p = -1;

    /* renamed from: q */
    public ScaleType f32330q;

    /* renamed from: r */
    public Drawable f32331r;

    /* renamed from: s */
    public int f32332s;

    /* renamed from: t */
    public ScaleType f32333t;

    /* renamed from: u */
    public Config f32334u;

    /* renamed from: v */
    public ScaleType f32335v;

    /* renamed from: w */
    public CircleOptions f32336w;

    /* renamed from: x */
    public C12096b f32337x;

    /* renamed from: y */
    public C12117d f32338y;

    /* renamed from: z */
    public C12140s f32339z;

    /* renamed from: a */
    public final C12139r mo29846a(boolean z) {
        this.f32316c = true;
        return this;
    }

    /* renamed from: a */
    public final C12139r mo29847a(int[] iArr) {
        if (iArr.length == 2) {
            this.f32321h = iArr[0];
            this.f32322i = iArr[1];
            return this;
        }
        throw new IllegalArgumentException("Lighten:the array size must be 2, first is width, second is height");
    }

    /* renamed from: a */
    public final C12139r mo29845a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f32301B = str;
        }
        return this;
    }

    /* renamed from: a */
    public final C12139r mo29844a(C12128i iVar) {
        this.f32304E = iVar;
        return this;
    }

    /* renamed from: a */
    public final void mo29848a() {
        if (this.f32304E == null && this.f32305F == null) {
            throw new IllegalArgumentException("Lighten:needs SmartImageView to display, use with(view)");
        } else if (!m35329g()) {
            C12133n.m35303a(m35325c());
        }
    }

    /* renamed from: a */
    public final void mo29849a(C12112j jVar) {
        if (this.f32304E == null && this.f32305F == null) {
            throw new IllegalArgumentException("Lighten:needs SmartImageView to display, use with(view)");
        } else if (!m35329g()) {
            this.f32306G = jVar;
            C12133n.m35303a(m35325c());
        }
    }

    /* renamed from: a */
    public final void mo29850a(C12115m mVar) {
        if (!m35329g()) {
            this.f32308I = mVar;
            C12133n.m35306b(m35325c());
        }
    }

    /* renamed from: c */
    private C12138q m35325c() {
        m35326d();
        m35327e();
        m35328f();
        return new C12138q(this);
    }

    /* renamed from: d */
    private void m35326d() {
        if (this.f32334u == null) {
            this.f32334u = C12133n.m35297a().f32224b;
        }
        if (this.f32319f == -1) {
            this.f32319f = C12133n.m35297a().f32225c;
        }
    }

    /* renamed from: g */
    private boolean m35329g() {
        if (this.f32314a != null || (this.f32311L != null && !this.f32311L.mo29784a())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo29854b() {
        if (!m35329g()) {
            C12133n.m35306b(m35325c());
        }
    }

    /* renamed from: e */
    private void m35327e() {
        if (this.f32315b == null) {
            if (this.f32304E instanceof View) {
                this.f32315b = ((View) this.f32304E).getContext();
                if (!(this.f32315b instanceof Activity)) {
                    if (this.f32315b instanceof ContextWrapper) {
                        this.f32315b = ((ContextWrapper) this.f32315b).getBaseContext();
                    }
                } else {
                    return;
                }
            } else if (this.f32305F != null) {
                this.f32315b = this.f32305F.getContext();
                if (!(this.f32315b instanceof Activity)) {
                    if (this.f32315b instanceof ContextWrapper) {
                        this.f32315b = ((ContextWrapper) this.f32315b).getBaseContext();
                    }
                } else {
                    return;
                }
            }
            if (this.f32315b == null) {
                this.f32315b = C12133n.m35297a().f32223a;
            }
        }
    }

    /* renamed from: f */
    private void m35328f() {
        String str = "";
        if (this.f32315b != null && (this.f32315b instanceof Activity)) {
            str = ((Activity) this.f32315b).getClass().getSimpleName();
        }
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(this.f32301B)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("-");
                sb.append(this.f32301B);
                this.f32301B = sb.toString();
            } else {
                this.f32301B = str;
            }
        }
        TextUtils.isEmpty(this.f32301B);
    }

    /* renamed from: a */
    private C12139r m35324a(Uri uri) {
        this.f32314a = uri;
        return this;
    }

    /* renamed from: c */
    public final C12139r mo29855c(boolean z) {
        this.f32310K = z;
        return this;
    }

    /* renamed from: a */
    public final C12139r mo29835a(int i) {
        this.f32325l = i;
        return this;
    }

    /* renamed from: b */
    public final C12139r mo29852b(boolean z) {
        this.f32309J = true;
        if (this.f32309J) {
            this.f32319f = 1;
        }
        return this;
    }

    /* renamed from: b */
    public final C12139r mo29853b(int[] iArr) {
        if (iArr.length == 2) {
            this.f32323j = iArr[0];
            this.f32324k = iArr[1];
            return this;
        }
        throw new IllegalArgumentException("Lighten:the array size must be 2, first is width, second is height");
    }

    public C12139r(Uri uri) {
        this.f32314a = uri;
    }

    /* renamed from: a */
    public final C12139r mo29838a(Activity activity) {
        this.f32315b = activity;
        return this;
    }

    public C12139r(C12092a aVar) {
        this.f32311L = aVar;
    }

    /* renamed from: a */
    public final C12139r mo29839a(Context context) {
        this.f32315b = context;
        return this;
    }

    public C12139r(String str) {
        this.f32314a = C12123c.m35293a(str);
    }

    /* renamed from: a */
    public final C12139r mo29840a(Config config) {
        this.f32334u = config;
        return this;
    }

    /* renamed from: a */
    public final C12139r mo29841a(FragmentActivity fragmentActivity) {
        this.f32315b = fragmentActivity;
        return this;
    }

    /* renamed from: a */
    public final C12139r mo29842a(CircleOptions circleOptions) {
        this.f32336w = circleOptions;
        return this;
    }

    /* renamed from: a */
    public final C12139r mo29843a(ImagePiplinePriority imagePiplinePriority) {
        this.f32300A = imagePiplinePriority;
        return this;
    }

    /* renamed from: b */
    public final C12139r mo29851b(int i, int i2) {
        this.f32323j = i;
        this.f32324k = i2;
        return this;
    }

    /* renamed from: a */
    public final C12139r mo29836a(int i, int i2) {
        this.f32321h = i;
        this.f32322i = i2;
        return this;
    }

    /* renamed from: a */
    public final C12139r mo29837a(int i, C12107e eVar) {
        this.f32312M = i;
        this.f32313N = eVar;
        return this;
    }
}
