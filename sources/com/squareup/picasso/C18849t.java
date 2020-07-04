package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.C18846s.C18848a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.t */
public final class C18849t {

    /* renamed from: a */
    private static final AtomicInteger f50824a = new AtomicInteger();

    /* renamed from: b */
    private final Picasso f50825b;

    /* renamed from: c */
    private final C18848a f50826c;

    /* renamed from: d */
    private boolean f50827d;

    /* renamed from: e */
    private boolean f50828e;

    /* renamed from: f */
    private boolean f50829f;

    /* renamed from: g */
    private int f50830g;

    /* renamed from: h */
    private int f50831h;

    /* renamed from: i */
    private int f50832i;

    /* renamed from: j */
    private int f50833j;

    /* renamed from: k */
    private Drawable f50834k;

    /* renamed from: l */
    private Drawable f50835l;

    /* renamed from: m */
    private Object f50836m;

    /* renamed from: a */
    public final C18849t mo50085a() {
        this.f50828e = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C18849t mo50096b() {
        this.f50828e = false;
        return this;
    }

    /* renamed from: a */
    public final void mo50095a(C18857y yVar) {
        long nanoTime = System.nanoTime();
        C18807ad.m61437a();
        if (!this.f50828e) {
            Drawable drawable = null;
            if (!this.f50826c.mo50080a()) {
                this.f50825b.mo49984a(yVar);
                if (this.f50829f) {
                    drawable = m61561e();
                }
                yVar.mo50116a(drawable);
                return;
            }
            C18846s a = m61560a(nanoTime);
            String a2 = C18807ad.m61435a(a);
            if (MemoryPolicy.shouldReadFromMemoryCache(this.f50832i)) {
                Bitmap b = this.f50825b.mo49986b(a2);
                if (b != null) {
                    this.f50825b.mo49984a(yVar);
                    yVar.mo50115a(b, LoadedFrom.MEMORY);
                    return;
                }
            }
            if (this.f50829f) {
                drawable = m61561e();
            }
            yVar.mo50116a(drawable);
            C18858z zVar = new C18858z(this.f50825b, yVar, a, this.f50832i, this.f50833j, this.f50835l, a2, this.f50836m, this.f50831h);
            this.f50825b.mo49982a((C18800a) zVar);
            return;
        }
        throw new IllegalStateException("Fit cannot be used with a Target.");
    }

    /* renamed from: a */
    public final void mo50094a(ImageView imageView, C18824e eVar) {
        ImageView imageView2 = imageView;
        C18824e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        C18807ad.m61437a();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f50826c.mo50080a()) {
            this.f50825b.mo49980a(imageView2);
            if (this.f50829f) {
                C18843q.m61541a(imageView2, m61561e());
            }
        } else {
            if (this.f50828e) {
                if (!this.f50826c.mo50081b()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f50829f) {
                            C18843q.m61541a(imageView2, m61561e());
                        }
                        this.f50825b.mo49981a(imageView2, new C18828h(this, imageView2, eVar2));
                        return;
                    }
                    this.f50826c.mo50077a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C18846s a = m61560a(nanoTime);
            String a2 = C18807ad.m61435a(a);
            if (MemoryPolicy.shouldReadFromMemoryCache(this.f50832i)) {
                Bitmap b = this.f50825b.mo49986b(a2);
                if (b != null) {
                    this.f50825b.mo49980a(imageView2);
                    C18843q.m61540a(imageView, this.f50825b.f50653d, b, LoadedFrom.MEMORY, this.f50827d, this.f50825b.f50661l);
                    if (this.f50825b.f50662m) {
                        a.mo50070b();
                        new StringBuilder("from ").append(LoadedFrom.MEMORY);
                    }
                    if (eVar2 != null) {
                        eVar.mo50023a();
                    }
                    return;
                }
            }
            if (this.f50829f) {
                C18843q.m61541a(imageView2, m61561e());
            }
            C18835k kVar = new C18835k(this.f50825b, imageView, a, this.f50832i, this.f50833j, this.f50831h, this.f50835l, a2, this.f50836m, eVar, this.f50827d);
            this.f50825b.mo49982a((C18800a) kVar);
        }
    }

    /* renamed from: c */
    public final C18849t mo50098c() {
        this.f50826c.mo50082c();
        return this;
    }

    /* renamed from: d */
    public final C18849t mo50099d() {
        this.f50826c.mo50083d();
        return this;
    }

    C18849t() {
        this.f50829f = true;
        this.f50826c = new C18848a(null, 0, null);
    }

    /* renamed from: e */
    private Drawable m61561e() {
        if (this.f50830g != 0) {
            return this.f50825b.f50653d.getResources().getDrawable(this.f50830g);
        }
        return this.f50834k;
    }

    /* renamed from: a */
    public final C18849t mo50088a(Config config) {
        this.f50826c.mo50078a(config);
        return this;
    }

    /* renamed from: a */
    public final C18849t mo50089a(Drawable drawable) {
        if (!this.f50829f) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (this.f50830g == 0) {
            this.f50834k = drawable;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    /* renamed from: b */
    public final C18849t mo50097b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        } else if (this.f50835l == null) {
            this.f50831h = i;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    /* renamed from: a */
    private C18846s m61560a(long j) {
        int andIncrement = f50824a.getAndIncrement();
        C18846s e = this.f50826c.mo50084e();
        e.f50791a = andIncrement;
        e.f50792b = j;
        boolean z = this.f50825b.f50662m;
        if (z) {
            e.mo50070b();
        }
        C18846s a = this.f50825b.mo49975a(e);
        if (a != e) {
            a.f50791a = andIncrement;
            a.f50792b = j;
            if (z) {
                a.mo50069a();
                new StringBuilder("into ").append(a);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final C18849t mo50086a(int i) {
        if (!this.f50829f) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.f50834k == null) {
            this.f50830g = i;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    /* renamed from: a */
    public final C18849t mo50092a(C18802aa aaVar) {
        this.f50826c.mo50079a(aaVar);
        return this;
    }

    /* renamed from: a */
    public final void mo50093a(ImageView imageView) {
        mo50094a(imageView, (C18824e) null);
    }

    /* renamed from: a */
    public final C18849t mo50087a(int i, int i2) {
        this.f50826c.mo50077a(i, i2);
        return this;
    }

    /* renamed from: a */
    public final C18849t mo50090a(MemoryPolicy memoryPolicy, MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy != null) {
            this.f50832i = memoryPolicy.index | this.f50832i;
            int i = 0;
            while (i <= 0) {
                MemoryPolicy memoryPolicy2 = memoryPolicyArr[0];
                if (memoryPolicy2 != null) {
                    this.f50832i = memoryPolicy2.index | this.f50832i;
                    i++;
                } else {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
            }
            return this;
        }
        throw new IllegalArgumentException("Memory policy cannot be null.");
    }

    /* renamed from: a */
    public final C18849t mo50091a(NetworkPolicy networkPolicy, NetworkPolicy... networkPolicyArr) {
        if (networkPolicy != null) {
            this.f50833j = networkPolicy.index | this.f50833j;
            int i = 0;
            while (i <= 0) {
                NetworkPolicy networkPolicy2 = networkPolicyArr[0];
                if (networkPolicy2 != null) {
                    this.f50833j = networkPolicy2.index | this.f50833j;
                    i++;
                } else {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
            }
            return this;
        }
        throw new IllegalArgumentException("Network policy cannot be null.");
    }

    C18849t(Picasso picasso, Uri uri, int i) {
        this.f50829f = true;
        if (!picasso.f50663n) {
            this.f50825b = picasso;
            this.f50826c = new C18848a(uri, i, picasso.f50660k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }
}
