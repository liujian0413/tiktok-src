package com.squareup.picasso;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import com.squareup.picasso.Picasso.Priority;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.s */
public final class C18846s {

    /* renamed from: s */
    private static final long f50790s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f50791a;

    /* renamed from: b */
    long f50792b;

    /* renamed from: c */
    int f50793c;

    /* renamed from: d */
    public final Uri f50794d;

    /* renamed from: e */
    public final int f50795e;

    /* renamed from: f */
    public final String f50796f;

    /* renamed from: g */
    public final List<C18802aa> f50797g;

    /* renamed from: h */
    public final int f50798h;

    /* renamed from: i */
    public final int f50799i;

    /* renamed from: j */
    public final boolean f50800j;

    /* renamed from: k */
    public final boolean f50801k;

    /* renamed from: l */
    public final boolean f50802l;

    /* renamed from: m */
    public final float f50803m;

    /* renamed from: n */
    public final float f50804n;

    /* renamed from: o */
    public final float f50805o;

    /* renamed from: p */
    public final boolean f50806p;

    /* renamed from: q */
    public final Config f50807q;

    /* renamed from: r */
    public final Priority f50808r;

    /* renamed from: com.squareup.picasso.s$a */
    public static final class C18848a {

        /* renamed from: a */
        private Uri f50809a;

        /* renamed from: b */
        private int f50810b;

        /* renamed from: c */
        private String f50811c;

        /* renamed from: d */
        private int f50812d;

        /* renamed from: e */
        private int f50813e;

        /* renamed from: f */
        private boolean f50814f;

        /* renamed from: g */
        private boolean f50815g;

        /* renamed from: h */
        private boolean f50816h;

        /* renamed from: i */
        private float f50817i;

        /* renamed from: j */
        private float f50818j;

        /* renamed from: k */
        private float f50819k;

        /* renamed from: l */
        private boolean f50820l;

        /* renamed from: m */
        private List<C18802aa> f50821m;

        /* renamed from: n */
        private Config f50822n;

        /* renamed from: o */
        private Priority f50823o;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo50080a() {
            if (this.f50809a == null && this.f50810b == 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo50081b() {
            if (this.f50812d == 0 && this.f50813e == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final C18848a mo50082c() {
            if (!this.f50815g) {
                this.f50814f = true;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        /* renamed from: d */
        public final C18848a mo50083d() {
            if (!this.f50814f) {
                this.f50815g = true;
                return this;
            }
            throw new IllegalStateException("Center inside can not be used after calling centerCrop");
        }

        /* renamed from: e */
        public final C18846s mo50084e() {
            if (this.f50815g && this.f50814f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f50814f && this.f50812d == 0 && this.f50813e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.f50815g && this.f50812d == 0 && this.f50813e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f50823o == null) {
                    this.f50823o = Priority.NORMAL;
                }
                C18846s sVar = r2;
                C18846s sVar2 = new C18846s(this.f50809a, this.f50810b, this.f50811c, this.f50821m, this.f50812d, this.f50813e, this.f50814f, this.f50815g, this.f50816h, this.f50817i, this.f50818j, this.f50819k, this.f50820l, this.f50822n, this.f50823o);
                return sVar;
            }
        }

        /* renamed from: a */
        public final C18848a mo50078a(Config config) {
            this.f50822n = config;
            return this;
        }

        /* renamed from: a */
        public final C18848a mo50079a(C18802aa aaVar) {
            if (aaVar != null) {
                aaVar.mo50000a();
                if (this.f50821m == null) {
                    this.f50821m = new ArrayList(2);
                }
                this.f50821m.add(aaVar);
                return this;
            }
            throw new IllegalArgumentException("Transformation must not be null.");
        }

        /* renamed from: a */
        public final C18848a mo50077a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f50812d = i;
                this.f50813e = i2;
                return this;
            }
        }

        C18848a(Uri uri, int i, Config config) {
            this.f50809a = uri;
            this.f50810b = i;
            this.f50822n = config;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo50075g() {
        if (this.f50797g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo50072d() {
        if (this.f50798h == 0 && this.f50799i == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo50070b() {
        StringBuilder sb = new StringBuilder("[R");
        sb.append(this.f50791a);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo50071c() {
        if (this.f50794d != null) {
            return String.valueOf(this.f50794d.getPath());
        }
        return Integer.toHexString(this.f50795e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo50073e() {
        if (mo50074f() || mo50075g()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo50074f() {
        if (mo50072d() || this.f50803m != 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo50069a() {
        long nanoTime = System.nanoTime() - this.f50792b;
        if (nanoTime > f50790s) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo50070b());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo50070b());
        sb2.append('+');
        sb2.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
        sb2.append("ms");
        return sb2.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        if (this.f50795e > 0) {
            sb.append(this.f50795e);
        } else {
            sb.append(this.f50794d);
        }
        if (this.f50797g != null && !this.f50797g.isEmpty()) {
            for (C18802aa aaVar : this.f50797g) {
                sb.append(' ');
                sb.append(aaVar.mo50000a());
            }
        }
        if (this.f50796f != null) {
            sb.append(" stableKey(");
            sb.append(this.f50796f);
            sb.append(')');
        }
        if (this.f50798h > 0) {
            sb.append(" resize(");
            sb.append(this.f50798h);
            sb.append(',');
            sb.append(this.f50799i);
            sb.append(')');
        }
        if (this.f50800j) {
            sb.append(" centerCrop");
        }
        if (this.f50801k) {
            sb.append(" centerInside");
        }
        if (this.f50803m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f50803m);
            if (this.f50806p) {
                sb.append(" @ ");
                sb.append(this.f50804n);
                sb.append(',');
                sb.append(this.f50805o);
            }
            sb.append(')');
        }
        if (this.f50807q != null) {
            sb.append(' ');
            sb.append(this.f50807q);
        }
        sb.append('}');
        return sb.toString();
    }

    private C18846s(Uri uri, int i, String str, List<C18802aa> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Config config, Priority priority) {
        this.f50794d = uri;
        this.f50795e = i;
        this.f50796f = str;
        if (list == null) {
            this.f50797g = null;
        } else {
            this.f50797g = Collections.unmodifiableList(list);
        }
        this.f50798h = i2;
        this.f50799i = i3;
        this.f50800j = z;
        this.f50801k = z2;
        this.f50802l = z3;
        this.f50803m = f;
        this.f50804n = f2;
        this.f50805o = f3;
        this.f50806p = z4;
        this.f50807q = config;
        this.f50808r = priority;
    }
}
