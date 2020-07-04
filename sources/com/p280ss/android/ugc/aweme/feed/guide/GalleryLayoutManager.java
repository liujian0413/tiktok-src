package com.p280ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.support.p029v7.widget.C1343ah;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.LinearSnapHelper;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1287r.C1288a;
import android.support.p029v7.widget.RecyclerView.C1287r.C1289b;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager */
public class GalleryLayoutManager extends C1273i implements C1289b {

    /* renamed from: a */
    public int f74738a;

    /* renamed from: b */
    View f74739b;

    /* renamed from: c */
    public LinearSnapHelper f74740c;

    /* renamed from: d */
    public boolean f74741d;

    /* renamed from: e */
    public int f74742e;

    /* renamed from: f */
    public C28368d f74743f;

    /* renamed from: g */
    public ArrayList<C28367c> f74744g;

    /* renamed from: h */
    RecyclerView f74745h;

    /* renamed from: i */
    public int f74746i;

    /* renamed from: j */
    private int f74747j;

    /* renamed from: k */
    private int f74748k;

    /* renamed from: l */
    private boolean f74749l;

    /* renamed from: m */
    private int f74750m;

    /* renamed from: n */
    private C28369e f74751n;

    /* renamed from: o */
    private C28366b f74752o;

    /* renamed from: p */
    private C1343ah f74753p;

    /* renamed from: q */
    private C1343ah f74754q;

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$LayoutParams */
    public static class LayoutParams extends android.support.p029v7.widget.RecyclerView.LayoutParams {
        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$a */
    class C28365a extends LinearSmoothScroller {
        /* renamed from: b */
        private int m93271b(View view) {
            C1273i iVar = this.f4994h;
            if (iVar == null || !iVar.mo5438e()) {
                return 0;
            }
            android.support.p029v7.widget.RecyclerView.LayoutParams layoutParams = (android.support.p029v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            int g = iVar.mo5787g(view) - layoutParams.leftMargin;
            int i = iVar.mo5791i(view) + layoutParams.rightMargin;
            return ((int) (((float) ((iVar.f4957I - iVar.mo5803v()) - iVar.mo5801t())) / 2.0f)) - (g + ((int) (((float) (i - g)) / 2.0f)));
        }

        /* renamed from: c */
        private int m93272c(View view) {
            C1273i iVar = this.f4994h;
            if (iVar == null || !iVar.mo5441f()) {
                return 0;
            }
            android.support.p029v7.widget.RecyclerView.LayoutParams layoutParams = (android.support.p029v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
            int h = iVar.mo5789h(view) - layoutParams.topMargin;
            int j = iVar.mo5793j(view) + layoutParams.bottomMargin;
            return ((int) (((float) ((iVar.f4958J - iVar.mo5804w()) - iVar.mo5802u())) / 2.0f)) - (h + ((int) (((float) (j - h)) / 2.0f)));
        }

        C28365a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final void mo5470a(View view, C1290s sVar, C1288a aVar) {
            int b = m93271b(view);
            int c = m93272c(view);
            int a = mo5465a((int) Math.sqrt((double) ((b * b) + (c * c))));
            if (a > 0) {
                aVar.mo5864a(-b, -c, a, this.f4784b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$b */
    class C28366b extends C1281m {

        /* renamed from: a */
        int f74756a;

        /* renamed from: b */
        boolean f74757b;

        private C28366b() {
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            this.f74756a = i;
            if (this.f74756a == 0) {
                GalleryLayoutManager.this.f74746i = 0;
                View a = GalleryLayoutManager.this.f74740c.mo5475a(recyclerView.getLayoutManager());
                if (a != null) {
                    recyclerView.getLayoutManager();
                    int c = C1273i.m6060c(a);
                    if (c != GalleryLayoutManager.this.f74738a) {
                        if (GalleryLayoutManager.this.f74739b != null) {
                            GalleryLayoutManager.this.f74739b.setSelected(false);
                        }
                        GalleryLayoutManager.this.f74739b = a;
                        GalleryLayoutManager.this.f74739b.setSelected(true);
                        GalleryLayoutManager.this.f74738a = c;
                        if (GalleryLayoutManager.this.f74744g != null) {
                            GalleryLayoutManager.this.mo72056a(recyclerView, a, GalleryLayoutManager.this.f74738a);
                        }
                    } else if (!GalleryLayoutManager.this.f74741d && GalleryLayoutManager.this.f74744g != null && this.f74757b) {
                        this.f74757b = false;
                        GalleryLayoutManager.this.mo72056a(recyclerView, a, GalleryLayoutManager.this.f74738a);
                    }
                }
                return;
            }
            GalleryLayoutManager.this.f74746i = 2;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            View a = GalleryLayoutManager.this.f74740c.mo5475a(recyclerView.getLayoutManager());
            if (a != null) {
                recyclerView.getLayoutManager();
                int c = C1273i.m6060c(a);
                if (c != GalleryLayoutManager.this.f74738a) {
                    if (GalleryLayoutManager.this.f74739b != null) {
                        GalleryLayoutManager.this.f74739b.setSelected(false);
                    }
                    GalleryLayoutManager.this.f74739b = a;
                    GalleryLayoutManager.this.f74739b.setSelected(true);
                    GalleryLayoutManager.this.f74738a = c;
                    if (!GalleryLayoutManager.this.f74741d && this.f74756a != 0) {
                        this.f74757b = true;
                    } else if (GalleryLayoutManager.this.f74744g != null) {
                        GalleryLayoutManager.this.mo72056a(recyclerView, a, GalleryLayoutManager.this.f74738a);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$c */
    public interface C28367c {
        /* renamed from: a */
        void mo71616a(RecyclerView recyclerView, View view, int i);

        /* renamed from: h */
        void mo71625h();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$d */
    public interface C28368d {
        /* renamed from: a */
        void mo72060a(GalleryLayoutManager galleryLayoutManager, View view, float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$e */
    class C28369e {

        /* renamed from: a */
        SparseArray<Rect> f74759a = new SparseArray<>();

        /* renamed from: b */
        int f74760b = 0;

        C28369e() {
        }
    }

    /* renamed from: a */
    public final boolean mo5368a(int i) {
        return this.f74738a >= 0 && this.f74738a == i && this.f74745h != null && !this.f74745h.mo5613l();
    }

    /* renamed from: a */
    public final void mo72057a(C28367c cVar) {
        this.f74744g.add(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo72056a(RecyclerView recyclerView, View view, int i) {
        Iterator it = this.f74744g.iterator();
        while (it.hasNext()) {
            ((C28367c) it.next()).mo71616a(recyclerView, view, i);
        }
    }

    /* renamed from: j */
    private int m93248j() {
        return (this.f4957I - mo5803v()) - mo5801t();
    }

    /* renamed from: k */
    private int m93249k() {
        return (this.f4958J - mo5804w()) - mo5802u();
    }

    /* renamed from: l */
    private C28369e m93250l() {
        if (this.f74751n == null) {
            this.f74751n = new C28369e();
        }
        return this.f74751n;
    }

    /* renamed from: m */
    private C1343ah m93251m() {
        if (this.f74742e == 0) {
            if (this.f74753p == null) {
                this.f74753p = C1343ah.m6624a((C1273i) this);
            }
            return this.f74753p;
        }
        if (this.f74754q == null) {
            this.f74754q = C1343ah.m6626b((C1273i) this);
        }
        return this.f74754q;
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5363a() {
        if (this.f74742e == 1) {
            return new LayoutParams(-1, -2);
        }
        return new LayoutParams(-2, -1);
    }

    /* renamed from: e */
    public final boolean mo5438e() {
        if (this.f74745h == null || this.f74745h.mo5613l() || !this.f74749l || this.f74742e != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo5441f() {
        if (this.f74745h == null || this.f74745h.mo5613l() || !this.f74749l || this.f74742e != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo72059g() {
        Iterator it = this.f74744g.iterator();
        while (it.hasNext()) {
            ((C28367c) it.next()).mo71625h();
        }
    }

    /* renamed from: h */
    private void m93247h() {
        if (this.f74751n != null) {
            this.f74751n.f74759a.clear();
        }
        if (this.f74738a != -1) {
            this.f74750m = this.f74738a;
        }
        this.f74750m = Math.min(Math.max(0, this.f74750m), mo5744A() - 1);
        this.f74748k = this.f74750m;
        this.f74747j = this.f74750m;
        this.f74738a = -1;
        if (this.f74739b != null) {
            this.f74739b.setSelected(false);
            this.f74739b = null;
        }
    }

    /* renamed from: a */
    public final boolean mo5380a(android.support.p029v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: b */
    public final void mo72058b(C28367c cVar) {
        this.f74744g.remove(cVar);
    }

    /* renamed from: f */
    private int m93246f(int i) {
        if (mo5800s() != 0 && i >= this.f74748k) {
            return 1;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo5427b(int i) {
        if (this.f74745h != null && i >= 0) {
            mo5422a(this.f74745h, (C1290s) null, i);
        }
    }

    /* renamed from: d */
    public final PointF mo5434d(int i) {
        int f = m93246f(i);
        PointF pointF = new PointF();
        if (f == 0) {
            return null;
        }
        if (this.f74742e == 0) {
            pointF.x = (float) f;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) f;
        }
        return pointF;
    }

    public GalleryLayoutManager(int i) {
        this.f74747j = 1;
        this.f74749l = true;
        this.f74738a = -1;
        this.f74740c = new LinearSnapHelper();
        this.f74752o = new C28366b();
        this.f74741d = false;
        this.f74742e = 0;
        this.f74744g = new ArrayList<>();
        this.f74746i = 0;
        this.f74742e = 0;
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5365a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5364a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    private float m93234a(View view, float f) {
        int i;
        int b = m93237b(view, f);
        if (this.f74742e == 0) {
            i = view.getWidth();
        } else {
            i = view.getHeight();
        }
        return Math.max(-1.0f, Math.min(1.0f, (((float) b) * 1.0f) / ((float) i)));
    }

    /* renamed from: b */
    private int m93237b(View view, float f) {
        C1343ah m = m93251m();
        int d = ((m.mo6270d() - m.mo6268c()) / 2) + m.mo6268c();
        if (this.f74742e == 0) {
            return (int) (((((float) (view.getWidth() / 2)) - f) + ((float) view.getLeft())) - ((float) d));
        }
        return (int) (((((float) (view.getHeight() / 2)) - f) + ((float) view.getTop())) - ((float) d));
    }

    /* renamed from: d */
    private void m93243d(C1284o oVar, C1290s sVar) {
        mo5753a(oVar);
        int c = m93251m().mo6268c();
        int d = m93251m().mo6270d();
        int i = this.f74750m;
        Rect rect = new Rect();
        int k = m93249k();
        View c2 = oVar.mo5848c(this.f74750m);
        mo5776b(c2, 0);
        mo5769a_(c2, 0, 0);
        int e = m6063e(c2);
        int f = m6064f(c2);
        int u = (int) (((float) mo5802u()) + (((float) (k - f)) / 2.0f));
        int t = (int) (((float) mo5801t()) + (((float) (m93248j() - e)) / 2.0f));
        rect.set(t, u, e + t, f + u);
        m6050a(c2, rect.left, rect.top, rect.right, rect.bottom);
        if (m93250l().f74759a.get(i) == null) {
            m93250l().f74759a.put(i, rect);
        } else {
            ((Rect) m93250l().f74759a.get(i)).set(rect);
        }
        this.f74748k = i;
        this.f74747j = i;
        int g = mo5787g(c2);
        int i2 = mo5791i(c2);
        m93235a(oVar, this.f74750m - 1, g, c);
        m93238b(oVar, this.f74750m + 1, i2, d);
    }

    /* renamed from: e */
    private void m93245e(C1284o oVar, C1290s sVar) {
        mo5753a(oVar);
        int c = m93251m().mo6268c();
        int d = m93251m().mo6270d();
        int i = this.f74750m;
        Rect rect = new Rect();
        int j = m93248j();
        View c2 = oVar.mo5848c(this.f74750m);
        mo5776b(c2, 0);
        mo5769a_(c2, 0, 0);
        int e = m6063e(c2);
        int f = m6064f(c2);
        int t = (int) (((float) mo5801t()) + (((float) (j - e)) / 2.0f));
        int u = (int) (((float) mo5802u()) + (((float) (m93249k() - f)) / 2.0f));
        rect.set(t, u, e + t, f + u);
        m6050a(c2, rect.left, rect.top, rect.right, rect.bottom);
        if (m93250l().f74759a.get(i) == null) {
            m93250l().f74759a.put(i, rect);
        } else {
            ((Rect) m93250l().f74759a.get(i)).set(rect);
        }
        this.f74748k = i;
        this.f74747j = i;
        int h = mo5789h(c2);
        int j2 = mo5793j(c2);
        m93240c(oVar, this.f74750m - 1, h, c);
        m93242d(oVar, this.f74750m + 1, j2, d);
    }

    /* renamed from: c */
    public final void mo5385c(C1284o oVar, C1290s sVar) {
        if (mo5744A() == 0) {
            m93247h();
            mo5753a(oVar);
        } else if (!sVar.f5010g) {
            if (sVar.mo5870b() == 0 || sVar.f5009f) {
                if (mo5800s() == 0 || sVar.f5009f) {
                    m93247h();
                }
                this.f74750m = Math.min(Math.max(0, this.f74750m), mo5744A() - 1);
                mo5753a(oVar);
                m93236a(oVar, sVar, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo72055a(RecyclerView recyclerView, int i) {
        if (recyclerView != null) {
            this.f74745h = recyclerView;
            this.f74750m = Math.max(0, 0);
            recyclerView.setLayoutManager(this);
            this.f74740c.mo6007a(recyclerView);
            recyclerView.mo5528a((C1281m) this.f74752o);
            return;
        }
        throw new IllegalArgumentException("The attach RecycleView must not null!!");
    }

    /* renamed from: b */
    public final void mo5383b(RecyclerView recyclerView, int i, int i2) {
        super.mo5383b(recyclerView, i, i2);
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        C28365a aVar = new C28365a(recyclerView.getContext());
        aVar.f4993g = i;
        mo5755a((C1287r) aVar);
    }

    /* renamed from: a */
    private void m93236a(C1284o oVar, C1290s sVar, int i) {
        if (this.f74742e == 0) {
            m93243d(oVar, sVar);
        } else {
            m93245e(oVar, sVar);
        }
        if (this.f74743f != null) {
            for (int i2 = 0; i2 < mo5800s(); i2++) {
                View g = mo5788g(i2);
                this.f74743f.mo72060a(this, g, m93234a(g, 0.0f));
            }
        }
        this.f74752o.onScrolled(this.f74745h, 0, 0);
    }

    /* renamed from: b */
    private void m93239b(C1284o oVar, C1290s sVar, int i) {
        if (mo5744A() != 0) {
            if (this.f74742e == 0) {
                m93244d(oVar, sVar, i);
            } else {
                m93241c(oVar, sVar, i);
            }
            if (this.f74743f != null) {
                for (int i2 = 0; i2 < mo5800s(); i2++) {
                    View g = mo5788g(i2);
                    this.f74743f.mo72060a(this, g, m93234a(g, (float) i));
                }
            }
        }
    }

    /* renamed from: c */
    private void m93241c(C1284o oVar, C1290s sVar, int i) {
        int i2;
        int i3;
        C1284o oVar2 = oVar;
        int c = m93251m().mo6268c();
        int d = m93251m().mo6270d();
        int i4 = 0;
        if (mo5800s() > 0) {
            if (i < 0) {
                for (int s = mo5800s() - 1; s >= 0; s--) {
                    View g = mo5788g(s);
                    if (mo5789h(g) - i <= d) {
                        break;
                    }
                    mo5759a(g, oVar2);
                    this.f74747j--;
                }
            } else {
                int i5 = 0;
                for (int i6 = 0; i6 < mo5800s(); i6++) {
                    View g2 = mo5788g(i6 + i5);
                    if (mo5793j(g2) - i >= c) {
                        break;
                    }
                    mo5759a(g2, oVar2);
                    this.f74748k++;
                    i5--;
                }
            }
        }
        int i7 = this.f74748k;
        int j = m93248j();
        int i8 = -1;
        if (i >= 0) {
            if (mo5800s() != 0) {
                View g3 = mo5788g(mo5800s() - 1);
                i7 = m6060c(g3) + 1;
                i3 = mo5793j(g3);
            } else {
                i3 = -1;
            }
            int i9 = i3;
            int i10 = i7;
            while (i10 < mo5744A() && i9 < d + i) {
                Rect rect = (Rect) m93250l().f74759a.get(i10);
                View c2 = oVar2.mo5848c(i10);
                mo5775b(c2);
                if (rect == null) {
                    rect = new Rect();
                    m93250l().f74759a.put(i10, rect);
                }
                mo5769a_(c2, i4, i4);
                int e = m6063e(c2);
                int f = m6064f(c2);
                int t = (int) (((float) mo5801t()) + (((float) (j - e)) / 2.0f));
                if (i9 == -1 && i7 == 0) {
                    int u = (int) (((float) mo5802u()) + (((float) (m93249k() - f)) / 2.0f));
                    rect.set(t, u, e + t, f + u);
                } else {
                    rect.set(t, i9, e + t, f + i9);
                }
                m6050a(c2, rect.left, rect.top, rect.right, rect.bottom);
                i9 = rect.bottom;
                this.f74747j = i10;
                i10++;
                i4 = 0;
            }
            return;
        }
        if (mo5800s() > 0) {
            View g4 = mo5788g(0);
            i2 = m6060c(g4) - 1;
            i8 = mo5789h(g4);
        } else {
            i2 = i7;
        }
        while (i2 >= 0 && i8 > c + i) {
            Rect rect2 = (Rect) m93250l().f74759a.get(i2);
            View c3 = oVar2.mo5848c(i2);
            mo5776b(c3, 0);
            if (rect2 == null) {
                rect2 = new Rect();
                m93250l().f74759a.put(i2, rect2);
            }
            mo5769a_(c3, 0, 0);
            int e2 = m6063e(c3);
            int t2 = (int) (((float) mo5801t()) + (((float) (j - e2)) / 2.0f));
            rect2.set(t2, i8 - m6064f(c3), e2 + t2, i8);
            m6050a(c3, rect2.left, rect2.top, rect2.right, rect2.bottom);
            i8 = rect2.top;
            this.f74748k = i2;
            i2--;
        }
    }

    /* renamed from: d */
    private void m93244d(C1284o oVar, C1290s sVar, int i) {
        int i2;
        int i3;
        C1284o oVar2 = oVar;
        int c = m93251m().mo6268c();
        int d = m93251m().mo6270d();
        int i4 = 0;
        if (mo5800s() > 0) {
            if (i >= 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < mo5800s(); i6++) {
                    View g = mo5788g(i6 + i5);
                    if (mo5791i(g) - i >= c) {
                        break;
                    }
                    mo5759a(g, oVar2);
                    this.f74748k++;
                    i5--;
                }
            } else {
                for (int s = mo5800s() - 1; s >= 0; s--) {
                    View g2 = mo5788g(s);
                    if (mo5787g(g2) - i > d) {
                        mo5759a(g2, oVar2);
                        this.f74747j--;
                    }
                }
            }
        }
        int i7 = this.f74748k;
        int k = m93249k();
        int i8 = -1;
        if (i >= 0) {
            if (mo5800s() != 0) {
                View g3 = mo5788g(mo5800s() - 1);
                i7 = m6060c(g3) + 1;
                i3 = mo5791i(g3);
            } else {
                i3 = -1;
            }
            int i9 = i3;
            int i10 = i7;
            while (i10 < mo5744A() && i9 < d + i) {
                Rect rect = (Rect) m93250l().f74759a.get(i10);
                View c2 = oVar2.mo5848c(i10);
                mo5775b(c2);
                if (rect == null) {
                    rect = new Rect();
                    m93250l().f74759a.put(i10, rect);
                }
                mo5769a_(c2, i4, i4);
                int e = m6063e(c2);
                int f = m6064f(c2);
                int u = (int) (((float) mo5802u()) + (((float) (k - f)) / 2.0f));
                if (i9 == -1 && i7 == 0) {
                    int t = (int) (((float) mo5801t()) + (((float) (m93248j() - e)) / 2.0f));
                    rect.set(t, u, e + t, f + u);
                } else {
                    rect.set(i9, u, e + i9, f + u);
                }
                m6050a(c2, rect.left, rect.top, rect.right, rect.bottom);
                i9 = rect.right;
                this.f74747j = i10;
                i10++;
                i4 = 0;
            }
            return;
        }
        if (mo5800s() > 0) {
            View g4 = mo5788g(0);
            i2 = m6060c(g4) - 1;
            i8 = mo5787g(g4);
        } else {
            i2 = i7;
        }
        while (i2 >= 0 && i8 > c + i) {
            Rect rect2 = (Rect) m93250l().f74759a.get(i2);
            View c3 = oVar2.mo5848c(i2);
            mo5776b(c3, 0);
            if (rect2 == null) {
                rect2 = new Rect();
                m93250l().f74759a.put(i2, rect2);
            }
            mo5769a_(c3, 0, 0);
            int e2 = m6063e(c3);
            int f2 = m6064f(c3);
            int u2 = (int) (((float) mo5802u()) + (((float) (k - f2)) / 2.0f));
            rect2.set(i8 - e2, u2, i8, f2 + u2);
            m6050a(c3, rect2.left, rect2.top, rect2.right, rect2.bottom);
            i8 = rect2.left;
            this.f74748k = i2;
            i2--;
        }
    }

    /* renamed from: a */
    public final int mo5361a(int i, C1284o oVar, C1290s sVar) {
        if (mo5800s() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int d = ((m93251m().mo6270d() - m93251m().mo6268c()) / 2) + m93251m().mo6268c();
        if (i > 0) {
            if (m6060c(mo5788g(mo5800s() - 1)) == mo5744A() - 1) {
                View g = mo5788g(mo5800s() - 1);
                i2 = -Math.max(0, Math.min(i, (((g.getRight() - g.getLeft()) / 2) + g.getLeft()) - d));
            }
        } else if (this.f74748k == 0) {
            View g2 = mo5788g(0);
            i2 = -Math.min(0, Math.max(i, (((g2.getRight() - g2.getLeft()) / 2) + g2.getLeft()) - d));
        }
        int i3 = -i2;
        m93250l().f74760b = i3;
        m93239b(oVar, sVar, i3);
        mo5790h(i2);
        return i3;
    }

    /* renamed from: b */
    public final int mo5381b(int i, C1284o oVar, C1290s sVar) {
        if (mo5800s() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int d = ((m93251m().mo6270d() - m93251m().mo6268c()) / 2) + m93251m().mo6268c();
        if (i > 0) {
            if (m6060c(mo5788g(mo5800s() - 1)) == mo5744A() - 1) {
                View g = mo5788g(mo5800s() - 1);
                i2 = -Math.max(0, Math.min(i, (((mo5793j(g) - mo5789h(g)) / 2) + mo5789h(g)) - d));
            }
        } else if (this.f74748k == 0) {
            View g2 = mo5788g(0);
            i2 = -Math.min(0, Math.max(i, (((mo5793j(g2) - mo5789h(g2)) / 2) + mo5789h(g2)) - d));
        }
        int i3 = -i2;
        m93250l().f74760b = i3;
        m93239b(oVar, sVar, i3);
        mo5792i(i2);
        return i3;
    }

    /* renamed from: a */
    private void m93235a(C1284o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int k = m93249k();
        while (i >= 0 && i2 > i3) {
            View c = oVar.mo5848c(i);
            mo5776b(c, 0);
            mo5769a_(c, 0, 0);
            int e = m6063e(c);
            int f = m6064f(c);
            int u = (int) (((float) mo5802u()) + (((float) (k - f)) / 2.0f));
            rect.set(i2 - e, u, i2, f + u);
            m6050a(c, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            this.f74748k = i;
            if (m93250l().f74759a.get(i) == null) {
                m93250l().f74759a.put(i, rect);
            } else {
                ((Rect) m93250l().f74759a.get(i)).set(rect);
            }
            i--;
        }
    }

    /* renamed from: b */
    private void m93238b(C1284o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int k = m93249k();
        while (i < mo5744A() && i2 < i3) {
            View c = oVar.mo5848c(i);
            mo5775b(c);
            mo5769a_(c, 0, 0);
            int e = m6063e(c);
            int f = m6064f(c);
            int u = (int) (((float) mo5802u()) + (((float) (k - f)) / 2.0f));
            rect.set(i2, u, e + i2, f + u);
            m6050a(c, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            this.f74747j = i;
            if (m93250l().f74759a.get(i) == null) {
                m93250l().f74759a.put(i, rect);
            } else {
                ((Rect) m93250l().f74759a.get(i)).set(rect);
            }
            i++;
        }
    }

    /* renamed from: c */
    private void m93240c(C1284o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int j = m93248j();
        while (i >= 0 && i2 > i3) {
            View c = oVar.mo5848c(i);
            mo5776b(c, 0);
            mo5769a_(c, 0, 0);
            int e = m6063e(c);
            int t = (int) (((float) mo5801t()) + (((float) (j - e)) / 2.0f));
            rect.set(t, i2 - m6064f(c), e + t, i2);
            m6050a(c, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            this.f74748k = i;
            if (m93250l().f74759a.get(i) == null) {
                m93250l().f74759a.put(i, rect);
            } else {
                ((Rect) m93250l().f74759a.get(i)).set(rect);
            }
            i--;
        }
    }

    /* renamed from: d */
    private void m93242d(C1284o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int j = m93248j();
        while (i < mo5744A() && i2 < i3) {
            View c = oVar.mo5848c(i);
            mo5775b(c);
            mo5769a_(c, 0, 0);
            int e = m6063e(c);
            int t = (int) (((float) mo5801t()) + (((float) (j - e)) / 2.0f));
            rect.set(t, i2, e + t, m6064f(c) + i2);
            m6050a(c, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            this.f74747j = i;
            if (m93250l().f74759a.get(i) == null) {
                m93250l().f74759a.put(i, rect);
            } else {
                ((Rect) m93250l().f74759a.get(i)).set(rect);
            }
            i++;
        }
    }
}
