package android.support.p029v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1273i.C1276a;
import android.support.p029v7.widget.RecyclerView.C1273i.C1277b;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1287r.C1289b;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.support.p029v7.widget.helper.ItemTouchHelper.C1411d;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.widget.LinearLayoutManager */
public class LinearLayoutManager extends C1273i implements C1289b, C1411d {

    /* renamed from: a */
    private C1245c f4744a;

    /* renamed from: b */
    private boolean f4745b;

    /* renamed from: c */
    private final C1244b f4746c;

    /* renamed from: i */
    public int f4747i;

    /* renamed from: j */
    C1343ah f4748j;

    /* renamed from: k */
    public boolean f4749k;

    /* renamed from: l */
    boolean f4750l;

    /* renamed from: m */
    public boolean f4751m;

    /* renamed from: n */
    public boolean f4752n;

    /* renamed from: o */
    int f4753o;

    /* renamed from: p */
    int f4754p;

    /* renamed from: q */
    public boolean f4755q;

    /* renamed from: r */
    SavedState f4756r;

    /* renamed from: s */
    final C1243a f4757s;

    /* renamed from: t */
    public int f4758t;

    /* renamed from: android.support.v7.widget.LinearLayoutManager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m5764a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m5763a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m5763a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m5764a(i);
            }
        };

        /* renamed from: a */
        int f4759a;

        /* renamed from: b */
        int f4760b;

        /* renamed from: c */
        boolean f4761c;

        public SavedState() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5450b() {
            this.f4759a = -1;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo5449a() {
            if (this.f4759a >= 0) {
                return true;
            }
            return false;
        }

        public SavedState(SavedState savedState) {
            this.f4759a = savedState.f4759a;
            this.f4760b = savedState.f4760b;
            this.f4761c = savedState.f4761c;
        }

        SavedState(Parcel parcel) {
            this.f4759a = parcel.readInt();
            this.f4760b = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f4761c = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4759a);
            parcel.writeInt(this.f4760b);
            parcel.writeInt(this.f4761c ? 1 : 0);
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$a */
    static class C1243a {

        /* renamed from: a */
        C1343ah f4762a;

        /* renamed from: b */
        int f4763b;

        /* renamed from: c */
        int f4764c;

        /* renamed from: d */
        boolean f4765d;

        /* renamed from: e */
        boolean f4766e;

        C1243a() {
            mo5455a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5455a() {
            this.f4763b = -1;
            this.f4764c = Integer.MIN_VALUE;
            this.f4765d = false;
            this.f4766e = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5457b() {
            int i;
            if (this.f4765d) {
                i = this.f4762a.mo6270d();
            } else {
                i = this.f4762a.mo6268c();
            }
            this.f4764c = i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f4763b);
            sb.append(", mCoordinate=");
            sb.append(this.f4764c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f4765d);
            sb.append(", mValid=");
            sb.append(this.f4766e);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        static boolean m5765a(View view, C1290s sVar) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams.bl_() || layoutParams.bn_() < 0 || layoutParams.bn_() >= sVar.mo5870b()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final void mo5458b(View view, int i) {
            if (this.f4765d) {
                this.f4764c = this.f4762a.mo6267b(view) + this.f4762a.mo6266b();
            } else {
                this.f4764c = this.f4762a.mo6263a(view);
            }
            this.f4763b = i;
        }

        /* renamed from: a */
        public final void mo5456a(View view, int i) {
            int b = this.f4762a.mo6266b();
            if (b >= 0) {
                mo5458b(view, i);
                return;
            }
            this.f4763b = i;
            if (this.f4765d) {
                int d = (this.f4762a.mo6270d() - b) - this.f4762a.mo6267b(view);
                this.f4764c = this.f4762a.mo6270d() - d;
                if (d > 0) {
                    int e = this.f4764c - this.f4762a.mo6273e(view);
                    int c = this.f4762a.mo6268c();
                    int min = e - (c + Math.min(this.f4762a.mo6263a(view) - c, 0));
                    if (min < 0) {
                        this.f4764c += Math.min(d, -min);
                    }
                }
                return;
            }
            int a = this.f4762a.mo6263a(view);
            int c2 = a - this.f4762a.mo6268c();
            this.f4764c = a;
            if (c2 > 0) {
                int d2 = (this.f4762a.mo6270d() - Math.min(0, (this.f4762a.mo6270d() - b) - this.f4762a.mo6267b(view))) - (a + this.f4762a.mo6273e(view));
                if (d2 < 0) {
                    this.f4764c -= Math.min(c2, -d2);
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$b */
    protected static class C1244b {

        /* renamed from: a */
        public int f4767a;

        /* renamed from: b */
        public boolean f4768b;

        /* renamed from: c */
        public boolean f4769c;

        /* renamed from: d */
        public boolean f4770d;

        protected C1244b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5460a() {
            this.f4767a = 0;
            this.f4768b = false;
            this.f4769c = false;
            this.f4770d = false;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$c */
    static class C1245c {

        /* renamed from: a */
        boolean f4771a = true;

        /* renamed from: b */
        int f4772b;

        /* renamed from: c */
        int f4773c;

        /* renamed from: d */
        int f4774d;

        /* renamed from: e */
        int f4775e;

        /* renamed from: f */
        int f4776f;

        /* renamed from: g */
        int f4777g;

        /* renamed from: h */
        int f4778h;

        /* renamed from: i */
        boolean f4779i;

        /* renamed from: j */
        int f4780j;

        /* renamed from: k */
        List<C1293v> f4781k;

        /* renamed from: l */
        boolean f4782l;

        C1245c() {
        }

        /* renamed from: a */
        public final void mo5462a() {
            m5771a((View) null);
        }

        /* renamed from: b */
        private View m5772b() {
            int size = this.f4781k.size();
            int i = 0;
            while (i < size) {
                View view = ((C1293v) this.f4781k.get(i)).itemView;
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (layoutParams.bl_() || this.f4774d != layoutParams.bn_()) {
                    i++;
                } else {
                    m5771a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo5463a(C1290s sVar) {
            if (this.f4774d < 0 || this.f4774d >= sVar.mo5870b()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private void m5771a(View view) {
            View b = m5773b(view);
            if (b == null) {
                this.f4774d = -1;
            } else {
                this.f4774d = ((LayoutParams) b.getLayoutParams()).bn_();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final View mo5461a(C1284o oVar) {
            if (this.f4781k != null) {
                return m5772b();
            }
            View c = oVar.mo5848c(this.f4774d);
            this.f4774d += this.f4775e;
            return c;
        }

        /* renamed from: b */
        private View m5773b(View view) {
            int size = this.f4781k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((C1293v) this.f4781k.get(i2)).itemView;
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.bl_()) {
                    int bn_ = (layoutParams.bn_() - this.f4774d) * this.f4775e;
                    if (bn_ >= 0 && bn_ < i) {
                        if (bn_ == 0) {
                            return view3;
                        }
                        view2 = view3;
                        i = bn_;
                    }
                }
            }
            return view2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5370a(C1284o oVar, C1290s sVar, C1243a aVar, int i) {
    }

    public final boolean bh_() {
        return true;
    }

    /* renamed from: a */
    public LayoutParams mo5363a() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: a */
    public final void mo5421a(RecyclerView recyclerView, C1284o oVar) {
        super.mo5421a(recyclerView, oVar);
        if (this.f4755q) {
            mo5780c(oVar);
            oVar.mo5832a();
        }
    }

    /* renamed from: a */
    public final void mo5424a(AccessibilityEvent accessibilityEvent) {
        super.mo5424a(accessibilityEvent);
        if (mo5800s() > 0) {
            accessibilityEvent.setFromIndex(mo5445j());
            accessibilityEvent.setToIndex(mo5447l());
        }
    }

    /* renamed from: a */
    public final void mo5420a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4756r = (SavedState) parcelable;
            mo5795n();
        }
    }

    /* renamed from: a */
    public void mo5379a(boolean z) {
        mo5425a((String) null);
        if (this.f4751m != z) {
            this.f4751m = z;
            mo5795n();
        }
    }

    /* renamed from: b */
    public final void mo5428b(boolean z) {
        mo5425a((String) null);
        if (z != this.f4749k) {
            this.f4749k = z;
            mo5795n();
        }
    }

    /* renamed from: a */
    public void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.f4993g = i;
        mo5755a((C1287r) linearSmoothScroller);
    }

    /* renamed from: a */
    public void mo5373a(C1290s sVar) {
        super.mo5373a(sVar);
        this.f4756r = null;
        this.f4753o = -1;
        this.f4754p = Integer.MIN_VALUE;
        this.f4757s.mo5455a();
    }

    /* renamed from: a */
    private void m5696a(C1284o oVar, C1290s sVar, C1243a aVar) {
        if (!m5697a(sVar, aVar) && !m5703b(oVar, sVar, aVar)) {
            aVar.mo5457b();
            aVar.f4763b = this.f4751m ? sVar.mo5870b() - 1 : 0;
        }
    }

    /* renamed from: a */
    private boolean m5697a(C1290s sVar, C1243a aVar) {
        int i;
        boolean z = false;
        if (sVar.f5010g || this.f4753o == -1) {
            return false;
        }
        if (this.f4753o < 0 || this.f4753o >= sVar.mo5870b()) {
            this.f4753o = -1;
            this.f4754p = Integer.MIN_VALUE;
            return false;
        }
        aVar.f4763b = this.f4753o;
        if (this.f4756r != null && this.f4756r.mo5449a()) {
            aVar.f4765d = this.f4756r.f4761c;
            if (aVar.f4765d) {
                aVar.f4764c = this.f4748j.mo6270d() - this.f4756r.f4760b;
            } else {
                aVar.f4764c = this.f4748j.mo6268c() + this.f4756r.f4760b;
            }
            return true;
        } else if (this.f4754p == Integer.MIN_VALUE) {
            View c = mo5432c(this.f4753o);
            if (c == null) {
                if (mo5800s() > 0) {
                    if ((this.f4753o < m6060c(mo5788g(0))) == this.f4750l) {
                        z = true;
                    }
                    aVar.f4765d = z;
                }
                aVar.mo5457b();
            } else if (this.f4748j.mo6273e(c) > this.f4748j.mo6274f()) {
                aVar.mo5457b();
                return true;
            } else if (this.f4748j.mo6263a(c) - this.f4748j.mo6268c() < 0) {
                aVar.f4764c = this.f4748j.mo6268c();
                aVar.f4765d = false;
                return true;
            } else if (this.f4748j.mo6270d() - this.f4748j.mo6267b(c) < 0) {
                aVar.f4764c = this.f4748j.mo6270d();
                aVar.f4765d = true;
                return true;
            } else {
                if (aVar.f4765d) {
                    i = this.f4748j.mo6267b(c) + this.f4748j.mo6266b();
                } else {
                    i = this.f4748j.mo6263a(c);
                }
                aVar.f4764c = i;
            }
            return true;
        } else {
            aVar.f4765d = this.f4750l;
            if (this.f4750l) {
                aVar.f4764c = this.f4748j.mo6270d() - this.f4754p;
            } else {
                aVar.f4764c = this.f4748j.mo6268c() + this.f4754p;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo5417a(int i, int i2) {
        this.f4753o = i;
        this.f4754p = i2;
        if (this.f4756r != null) {
            this.f4756r.mo5450b();
        }
        mo5795n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5374a(C1290s sVar, C1245c cVar, C1276a aVar) {
        int i = cVar.f4774d;
        if (i >= 0 && i < sVar.mo5870b()) {
            aVar.mo5813b(i, Math.max(0, cVar.f4777g));
        }
    }

    /* renamed from: a */
    public final void mo5419a(int i, C1276a aVar) {
        int i2;
        boolean z;
        int i3 = -1;
        if (this.f4756r == null || !this.f4756r.mo5449a()) {
            m5682G();
            z = this.f4750l;
            i2 = this.f4753o == -1 ? z ? i - 1 : 0 : this.f4753o;
        } else {
            z = this.f4756r.f4761c;
            i2 = this.f4756r.f4759a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f4758t && i2 >= 0 && i2 < i; i4++) {
            aVar.mo5813b(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: a */
    public final void mo5418a(int i, int i2, C1290s sVar, C1276a aVar) {
        if (this.f4747i != 0) {
            i = i2;
        }
        if (mo5800s() != 0 && i != 0) {
            mo5444h();
            m5691a(i > 0 ? 1 : -1, Math.abs(i), true, sVar);
            mo5374a(sVar, this.f4744a, aVar);
        }
    }

    /* renamed from: a */
    public final void mo5425a(String str) {
        if (this.f4756r == null) {
            super.mo5425a(str);
        }
    }

    /* renamed from: a */
    private void m5695a(C1284o oVar, C1245c cVar) {
        if (cVar.f4771a && !cVar.f4782l) {
            if (cVar.f4776f == -1) {
                m5701b(oVar, cVar.f4777g);
            } else {
                m5693a(oVar, cVar.f4777g);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5371a(C1284o oVar, C1290s sVar, C1245c cVar, C1244b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View a = cVar.mo5461a(oVar);
        if (a == null) {
            bVar.f4768b = true;
            return;
        }
        LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
        if (cVar.f4781k == null) {
            if (this.f4750l == (cVar.f4776f == -1)) {
                mo5775b(a);
            } else {
                mo5776b(a, 0);
            }
        } else {
            if (this.f4750l == (cVar.f4776f == -1)) {
                mo5756a(a);
            } else {
                mo5757a(a, 0);
            }
        }
        mo5769a_(a, 0, 0);
        bVar.f4767a = this.f4748j.mo6273e(a);
        if (this.f4747i == 1) {
            if (mo5443g()) {
                i7 = this.f4957I - mo5803v();
                i2 = i7 - this.f4748j.mo6275f(a);
            } else {
                i2 = mo5801t();
                i7 = this.f4748j.mo6275f(a) + i2;
            }
            if (cVar.f4776f == -1) {
                i3 = cVar.f4772b;
                int i8 = i7;
                i4 = cVar.f4772b - bVar.f4767a;
                i = i8;
            } else {
                int i9 = cVar.f4772b;
                i3 = cVar.f4772b + bVar.f4767a;
                i = i7;
                i4 = i9;
            }
        } else {
            i4 = mo5802u();
            int f = this.f4748j.mo6275f(a) + i4;
            if (cVar.f4776f == -1) {
                i5 = f;
                i6 = cVar.f4772b - bVar.f4767a;
                i = cVar.f4772b;
            } else {
                int i10 = cVar.f4772b;
                i = cVar.f4772b + bVar.f4767a;
                i5 = f;
                i6 = i10;
            }
            i3 = i5;
        }
        m6057b(a, i2, i4, i, i3);
        if (layoutParams.bl_() || layoutParams.bm_()) {
            bVar.f4769c = true;
        }
        bVar.f4770d = a.hasFocusable();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo5366a(C1284o oVar, C1290s sVar, int i, int i2, int i3) {
        mo5444h();
        int c = this.f4748j.mo6268c();
        int d = this.f4748j.mo6270d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g = mo5788g(i);
            int c2 = m6060c(g);
            if (c2 >= 0 && c2 < i3) {
                if (((LayoutParams) g.getLayoutParams()).bl_()) {
                    if (view2 == null) {
                        view2 = g;
                    }
                } else if (this.f4748j.mo6263a(g) < d && this.f4748j.mo6267b(g) >= c) {
                    return g;
                } else {
                    if (view == null) {
                        view = g;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: a */
    public View mo5367a(View view, int i, C1284o oVar, C1290s sVar) {
        View view2;
        View view3;
        m5682G();
        if (mo5800s() == 0) {
            return null;
        }
        int f = mo5439f(i);
        if (f == Integer.MIN_VALUE) {
            return null;
        }
        mo5444h();
        mo5444h();
        m5691a(f, (int) (((float) this.f4748j.mo6274f()) * 0.33333334f), false, sVar);
        this.f4744a.f4777g = Integer.MIN_VALUE;
        this.f4744a.f4771a = false;
        m5688a(oVar, this.f4744a, sVar, true);
        if (f == -1) {
            view2 = m5715i(oVar, sVar);
        } else {
            view2 = m5713h(oVar, sVar);
        }
        if (f == -1) {
            view3 = m5685J();
        } else {
            view3 = m5686K();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    /* renamed from: a */
    public final void mo5423a(View view, View view2, int i, int i2) {
        mo5425a("Cannot drop a view during a scroll or layout calculation");
        mo5444h();
        m5682G();
        int c = m6060c(view);
        int c2 = m6060c(view2);
        char c3 = c < c2 ? (char) 1 : 65535;
        if (this.f4750l) {
            if (c3 == 1) {
                mo5417a(c2, this.f4748j.mo6270d() - (this.f4748j.mo6263a(view2) + this.f4748j.mo6273e(view)));
            } else {
                mo5417a(c2, this.f4748j.mo6270d() - this.f4748j.mo6267b(view2));
            }
        } else if (c3 == 65535) {
            mo5417a(c2, this.f4748j.mo6263a(view2));
        } else {
            mo5417a(c2, this.f4748j.mo6267b(view2) - this.f4748j.mo6273e(view));
        }
    }

    /* renamed from: H */
    private static C1245c m5683H() {
        return new C1245c();
    }

    public boolean bi_() {
        if (this.f4756r == null && this.f4745b == this.f4751m) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo5441f() {
        if (this.f4747i == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo5443g() {
        if (mo5798q() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    private void m5682G() {
        boolean z = true;
        if (this.f4747i == 1 || !mo5443g()) {
            z = this.f4749k;
        } else if (this.f4749k) {
            z = false;
        }
        this.f4750l = z;
    }

    /* renamed from: I */
    private boolean m5684I() {
        if (this.f4748j.mo6277h() == 0 && this.f4748j.mo6272e() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private View m5685J() {
        int i;
        if (this.f4750l) {
            i = mo5800s() - 1;
        } else {
            i = 0;
        }
        return mo5788g(i);
    }

    /* renamed from: K */
    private View m5686K() {
        int i;
        if (this.f4750l) {
            i = 0;
        } else {
            i = mo5800s() - 1;
        }
        return mo5788g(i);
    }

    /* access modifiers changed from: 0000 */
    public final boolean bj_() {
        if (this.f4956H == 1073741824 || this.f4955G == 1073741824 || !mo5749F()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final int mo5445j() {
        View a = m5689a(0, mo5800s(), false, true);
        if (a == null) {
            return -1;
        }
        return m6060c(a);
    }

    /* renamed from: k */
    public final int mo5446k() {
        View a = m5689a(0, mo5800s(), true, false);
        if (a == null) {
            return -1;
        }
        return m6060c(a);
    }

    /* renamed from: l */
    public final int mo5447l() {
        View a = m5689a(mo5800s() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return m6060c(a);
    }

    /* renamed from: m */
    public final int mo5448m() {
        View a = m5689a(mo5800s() - 1, -1, true, false);
        if (a == null) {
            return -1;
        }
        return m6060c(a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo5444h() {
        if (this.f4744a == null) {
            this.f4744a = m5683H();
        }
    }

    /* renamed from: d */
    public final Parcelable mo5435d() {
        if (this.f4756r != null) {
            return new SavedState(this.f4756r);
        }
        SavedState savedState = new SavedState();
        if (mo5800s() > 0) {
            mo5444h();
            boolean z = this.f4745b ^ this.f4750l;
            savedState.f4761c = z;
            if (z) {
                View K = m5686K();
                savedState.f4760b = this.f4748j.mo6270d() - this.f4748j.mo6267b(K);
                savedState.f4759a = m6060c(K);
            } else {
                View J = m5685J();
                savedState.f4759a = m6060c(J);
                savedState.f4760b = this.f4748j.mo6263a(J) - this.f4748j.mo6268c();
            }
        } else {
            savedState.mo5450b();
        }
        return savedState;
    }

    /* renamed from: e */
    public boolean mo5438e() {
        if (this.f4747i == 0) {
            return true;
        }
        return false;
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: a */
    private void m5692a(C1243a aVar) {
        m5707e(aVar.f4763b, aVar.f4764c);
    }

    /* renamed from: b */
    private void m5700b(C1243a aVar) {
        m5709f(aVar.f4763b, aVar.f4764c);
    }

    /* renamed from: c */
    public int mo5431c(C1290s sVar) {
        return m5714i(sVar);
    }

    /* renamed from: d */
    public final int mo5433d(C1290s sVar) {
        return m5716j(sVar);
    }

    /* renamed from: e */
    public final int mo5436e(C1290s sVar) {
        return m5716j(sVar);
    }

    /* renamed from: f */
    public final int mo5440f(C1290s sVar) {
        return m5718k(sVar);
    }

    /* renamed from: g */
    public final int mo5442g(C1290s sVar) {
        return m5718k(sVar);
    }

    /* renamed from: h */
    private int m5712h(C1290s sVar) {
        if (sVar.mo5869a()) {
            return this.f4748j.mo6274f();
        }
        return 0;
    }

    /* renamed from: e */
    public void mo5437e(int i) {
        this.f4753o = i;
        this.f4754p = Integer.MIN_VALUE;
        if (this.f4756r != null) {
            this.f4756r.mo5450b();
        }
        mo5795n();
    }

    /* renamed from: i */
    private int m5714i(C1290s sVar) {
        if (mo5800s() == 0) {
            return 0;
        }
        mo5444h();
        C1343ah ahVar = this.f4748j;
        View a = m5690a(!this.f4752n, true);
        return C1354ao.m6701a(sVar, ahVar, a, m5699b(!this.f4752n, true), this, this.f4752n, this.f4750l);
    }

    /* renamed from: j */
    private int m5716j(C1290s sVar) {
        if (mo5800s() == 0) {
            return 0;
        }
        mo5444h();
        C1343ah ahVar = this.f4748j;
        View a = m5690a(!this.f4752n, true);
        return C1354ao.m6700a(sVar, ahVar, a, m5699b(!this.f4752n, true), this, this.f4752n);
    }

    /* renamed from: k */
    private int m5718k(C1290s sVar) {
        if (mo5800s() == 0) {
            return 0;
        }
        mo5444h();
        C1343ah ahVar = this.f4748j;
        View a = m5690a(!this.f4752n, true);
        return C1354ao.m6702b(sVar, ahVar, a, m5699b(!this.f4752n, true), this, this.f4752n);
    }

    /* renamed from: d */
    public final PointF mo5434d(int i) {
        if (mo5800s() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < m6060c(mo5788g(0))) {
            z = true;
        }
        if (z != this.f4750l) {
            i2 = -1;
        }
        if (this.f4747i == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: c */
    public final View mo5432c(int i) {
        int s = mo5800s();
        if (s == 0) {
            return null;
        }
        int c = i - m6060c(mo5788g(0));
        if (c >= 0 && c < s) {
            View g = mo5788g(c);
            if (m6060c(g) == i) {
                return g;
            }
        }
        return super.mo5432c(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int mo5439f(int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        switch (i) {
                            case 1:
                                if (this.f4747i != 1 && mo5443g()) {
                                    return 1;
                                }
                                return -1;
                            case 2:
                                if (this.f4747i != 1 && mo5443g()) {
                                    return -1;
                                }
                                return 1;
                            default:
                                return Integer.MIN_VALUE;
                        }
                    } else if (this.f4747i == 1) {
                        return 1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f4747i == 0) {
                    return 1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f4747i == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f4747i == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: b */
    public final int mo5426b(C1290s sVar) {
        return m5714i(sVar);
    }

    /* renamed from: b */
    public final void mo5427b(int i) {
        if (i == 0 || i == 1) {
            mo5425a((String) null);
            if (i != this.f4747i || this.f4748j == null) {
                this.f4748j = C1343ah.m6625a(this, i);
                this.f4757s.f4762a = this.f4748j;
                this.f4747i = i;
                mo5795n();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    private View m5705d(C1284o oVar, C1290s sVar) {
        if (this.f4750l) {
            return m5708f(oVar, sVar);
        }
        return m5711g(oVar, sVar);
    }

    /* renamed from: e */
    private View m5706e(C1284o oVar, C1290s sVar) {
        if (this.f4750l) {
            return m5711g(oVar, sVar);
        }
        return m5708f(oVar, sVar);
    }

    /* renamed from: i */
    private View m5715i(C1284o oVar, C1290s sVar) {
        if (this.f4750l) {
            return m5719k(oVar, sVar);
        }
        return m5717j(oVar, sVar);
    }

    /* renamed from: j */
    private View m5717j(C1284o oVar, C1290s sVar) {
        return m5710g(0, mo5800s());
    }

    /* renamed from: k */
    private View m5719k(C1284o oVar, C1290s sVar) {
        return m5710g(mo5800s() - 1, -1);
    }

    /* renamed from: a */
    private View m5690a(boolean z, boolean z2) {
        if (this.f4750l) {
            return m5689a(mo5800s() - 1, -1, z, true);
        }
        return m5689a(0, mo5800s(), z, true);
    }

    /* renamed from: b */
    private View m5699b(boolean z, boolean z2) {
        if (this.f4750l) {
            return m5689a(0, mo5800s(), z, true);
        }
        return m5689a(mo5800s() - 1, -1, z, true);
    }

    /* renamed from: f */
    private View m5708f(C1284o oVar, C1290s sVar) {
        return mo5366a(oVar, sVar, 0, mo5800s(), sVar.mo5870b());
    }

    /* renamed from: g */
    private View m5711g(C1284o oVar, C1290s sVar) {
        return mo5366a(oVar, sVar, mo5800s() - 1, -1, sVar.mo5870b());
    }

    /* renamed from: h */
    private View m5713h(C1284o oVar, C1290s sVar) {
        if (this.f4750l) {
            return m5717j(oVar, sVar);
        }
        return m5719k(oVar, sVar);
    }

    /* renamed from: e */
    private void m5707e(int i, int i2) {
        int i3;
        this.f4744a.f4773c = this.f4748j.mo6270d() - i2;
        C1245c cVar = this.f4744a;
        if (this.f4750l) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.f4775e = i3;
        this.f4744a.f4774d = i;
        this.f4744a.f4776f = 1;
        this.f4744a.f4772b = i2;
        this.f4744a.f4777g = Integer.MIN_VALUE;
    }

    /* renamed from: f */
    private void m5709f(int i, int i2) {
        int i3;
        this.f4744a.f4773c = i2 - this.f4748j.mo6268c();
        this.f4744a.f4774d = i;
        C1245c cVar = this.f4744a;
        if (this.f4750l) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.f4775e = i3;
        this.f4744a.f4776f = -1;
        this.f4744a.f4772b = i2;
        this.f4744a.f4777g = Integer.MIN_VALUE;
    }

    /* renamed from: g */
    private View m5710g(int i, int i2) {
        char c;
        int i3;
        int i4;
        mo5444h();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return mo5788g(i);
        }
        if (this.f4748j.mo6263a(mo5788g(i)) < this.f4748j.mo6268c()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f4747i == 0) {
            return this.f4963w.mo6436a(i, i2, i4, i3);
        }
        return this.f4964x.mo6436a(i, i2, i4, i3);
    }

    /* renamed from: b */
    private void m5701b(C1284o oVar, int i) {
        int s = mo5800s();
        if (i >= 0) {
            int e = this.f4748j.mo6272e() - i;
            if (this.f4750l) {
                for (int i2 = 0; i2 < s; i2++) {
                    View g = mo5788g(i2);
                    if (this.f4748j.mo6263a(g) < e || this.f4748j.mo6271d(g) < e) {
                        m5694a(oVar, 0, i2);
                        return;
                    }
                }
                return;
            }
            int i3 = s - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                View g2 = mo5788g(i4);
                if (this.f4748j.mo6263a(g2) < e || this.f4748j.mo6271d(g2) < e) {
                    m5694a(oVar, i3, i4);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo5385c(C1284o oVar, C1290s sVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = -1;
        if (!(this.f4756r == null && this.f4753o == -1) && sVar.mo5870b() == 0) {
            mo5780c(oVar);
            return;
        }
        if (this.f4756r != null && this.f4756r.mo5449a()) {
            this.f4753o = this.f4756r.f4759a;
        }
        mo5444h();
        this.f4744a.f4771a = false;
        m5682G();
        View z = mo5807z();
        if (!this.f4757s.f4766e || this.f4753o != -1 || this.f4756r != null) {
            this.f4757s.mo5455a();
            this.f4757s.f4765d = this.f4750l ^ this.f4751m;
            m5696a(oVar, sVar, this.f4757s);
            this.f4757s.f4766e = true;
        } else if (z != null && (this.f4748j.mo6263a(z) >= this.f4748j.mo6270d() || this.f4748j.mo6267b(z) <= this.f4748j.mo6268c())) {
            this.f4757s.mo5456a(z, m6060c(z));
        }
        int h = m5712h(sVar);
        if (this.f4744a.f4780j >= 0) {
            i = h;
            h = 0;
        } else {
            i = 0;
        }
        int c = h + this.f4748j.mo6268c();
        int g = i + this.f4748j.mo6276g();
        if (!(!sVar.f5010g || this.f4753o == -1 || this.f4754p == Integer.MIN_VALUE)) {
            View c2 = mo5432c(this.f4753o);
            if (c2 != null) {
                if (this.f4750l) {
                    i4 = (this.f4748j.mo6270d() - this.f4748j.mo6267b(c2)) - this.f4754p;
                } else {
                    i4 = this.f4754p - (this.f4748j.mo6263a(c2) - this.f4748j.mo6268c());
                }
                if (i4 > 0) {
                    c += i4;
                } else {
                    g -= i4;
                }
            }
        }
        if (!this.f4757s.f4765d ? !this.f4750l : this.f4750l) {
            i5 = 1;
        }
        mo5370a(oVar, sVar, this.f4757s, i5);
        mo5753a(oVar);
        this.f4744a.f4782l = m5684I();
        this.f4744a.f4779i = sVar.f5010g;
        if (this.f4757s.f4765d) {
            m5700b(this.f4757s);
            this.f4744a.f4778h = c;
            m5688a(oVar, this.f4744a, sVar, false);
            i3 = this.f4744a.f4772b;
            int i6 = this.f4744a.f4774d;
            if (this.f4744a.f4773c > 0) {
                g += this.f4744a.f4773c;
            }
            m5692a(this.f4757s);
            this.f4744a.f4778h = g;
            this.f4744a.f4774d += this.f4744a.f4775e;
            m5688a(oVar, this.f4744a, sVar, false);
            i2 = this.f4744a.f4772b;
            if (this.f4744a.f4773c > 0) {
                int i7 = this.f4744a.f4773c;
                m5709f(i6, i3);
                this.f4744a.f4778h = i7;
                m5688a(oVar, this.f4744a, sVar, false);
                i3 = this.f4744a.f4772b;
            }
        } else {
            m5692a(this.f4757s);
            this.f4744a.f4778h = g;
            m5688a(oVar, this.f4744a, sVar, false);
            i2 = this.f4744a.f4772b;
            int i8 = this.f4744a.f4774d;
            if (this.f4744a.f4773c > 0) {
                c += this.f4744a.f4773c;
            }
            m5700b(this.f4757s);
            this.f4744a.f4778h = c;
            this.f4744a.f4774d += this.f4744a.f4775e;
            m5688a(oVar, this.f4744a, sVar, false);
            i3 = this.f4744a.f4772b;
            if (this.f4744a.f4773c > 0) {
                int i9 = this.f4744a.f4773c;
                m5707e(i8, i2);
                this.f4744a.f4778h = i9;
                m5688a(oVar, this.f4744a, sVar, false);
                i2 = this.f4744a.f4772b;
            }
        }
        if (mo5800s() > 0) {
            if (this.f4750l ^ this.f4751m) {
                int a = m5687a(i2, oVar, sVar, true);
                int i10 = i3 + a;
                int i11 = i2 + a;
                int b = m5698b(i10, oVar, sVar, false);
                i3 = i10 + b;
                i2 = i11 + b;
            } else {
                int b2 = m5698b(i3, oVar, sVar, true);
                int i12 = i3 + b2;
                int i13 = i2 + b2;
                int a2 = m5687a(i13, oVar, sVar, false);
                i3 = i12 + a2;
                i2 = i13 + a2;
            }
        }
        m5702b(oVar, sVar, i3, i2);
        if (!sVar.f5010g) {
            this.f4748j.mo6264a();
        } else {
            this.f4757s.mo5455a();
        }
        this.f4745b = this.f4751m;
    }

    /* renamed from: a */
    private void m5693a(C1284o oVar, int i) {
        if (i >= 0) {
            int s = mo5800s();
            if (this.f4750l) {
                int i2 = s - 1;
                for (int i3 = i2; i3 >= 0; i3--) {
                    View g = mo5788g(i3);
                    if (this.f4748j.mo6267b(g) > i || this.f4748j.mo6269c(g) > i) {
                        m5694a(oVar, i2, i3);
                        return;
                    }
                }
                return;
            }
            for (int i4 = 0; i4 < s; i4++) {
                View g2 = mo5788g(i4);
                if (this.f4748j.mo6267b(g2) > i || this.f4748j.mo6269c(g2) > i) {
                    m5694a(oVar, 0, i4);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public int mo5361a(int i, C1284o oVar, C1290s sVar) {
        if (this.f4747i == 1) {
            return 0;
        }
        return m5704c(i, oVar, sVar);
    }

    /* renamed from: b */
    public int mo5381b(int i, C1284o oVar, C1290s sVar) {
        if (this.f4747i == 0) {
            return 0;
        }
        return m5704c(i, oVar, sVar);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f4747i = 1;
        this.f4752n = true;
        this.f4753o = -1;
        this.f4754p = Integer.MIN_VALUE;
        this.f4757s = new C1243a();
        this.f4746c = new C1244b();
        this.f4758t = 2;
        mo5427b(i);
        mo5428b(z);
    }

    /* renamed from: c */
    private int m5704c(int i, C1284o oVar, C1290s sVar) {
        int i2;
        if (mo5800s() == 0 || i == 0) {
            return 0;
        }
        this.f4744a.f4771a = true;
        mo5444h();
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m5691a(i2, abs, true, sVar);
        int a = this.f4744a.f4777g + m5688a(oVar, this.f4744a, sVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f4748j.mo6265a(-i);
        this.f4744a.f4780j = i;
        return i;
    }

    /* renamed from: b */
    private boolean m5703b(C1284o oVar, C1290s sVar, C1243a aVar) {
        View view;
        int i;
        boolean z = false;
        if (mo5800s() == 0) {
            return false;
        }
        View z2 = mo5807z();
        if (z2 != null && C1243a.m5765a(z2, sVar)) {
            aVar.mo5456a(z2, m6060c(z2));
            return true;
        } else if (this.f4745b != this.f4751m) {
            return false;
        } else {
            if (aVar.f4765d) {
                view = m5705d(oVar, sVar);
            } else {
                view = m5706e(oVar, sVar);
            }
            if (view == null) {
                return false;
            }
            aVar.mo5458b(view, m6060c(view));
            if (!sVar.f5010g && bi_()) {
                if (this.f4748j.mo6263a(view) >= this.f4748j.mo6270d() || this.f4748j.mo6267b(view) < this.f4748j.mo6268c()) {
                    z = true;
                }
                if (z) {
                    if (aVar.f4765d) {
                        i = this.f4748j.mo6270d();
                    } else {
                        i = this.f4748j.mo6268c();
                    }
                    aVar.f4764c = i;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private void m5694a(C1284o oVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo5750a(i3, oVar);
                }
                return;
            }
            while (i > i2) {
                mo5750a(i, oVar);
                i--;
            }
        }
    }

    /* renamed from: a */
    private int m5687a(int i, C1284o oVar, C1290s sVar, boolean z) {
        int d = this.f4748j.mo6270d() - i;
        if (d <= 0) {
            return 0;
        }
        int i2 = -m5704c(-d, oVar, sVar);
        int i3 = i + i2;
        if (z) {
            int d2 = this.f4748j.mo6270d() - i3;
            if (d2 > 0) {
                this.f4748j.mo6265a(d2);
                return d2 + i2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private int m5698b(int i, C1284o oVar, C1290s sVar, boolean z) {
        int c = i - this.f4748j.mo6268c();
        if (c <= 0) {
            return 0;
        }
        int i2 = -m5704c(c, oVar, sVar);
        int i3 = i + i2;
        if (z) {
            int c2 = i3 - this.f4748j.mo6268c();
            if (c2 > 0) {
                this.f4748j.mo6265a(-c2);
                return i2 - c2;
            }
        }
        return i2;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4747i = 1;
        this.f4752n = true;
        this.f4753o = -1;
        this.f4754p = Integer.MIN_VALUE;
        this.f4757s = new C1243a();
        this.f4746c = new C1244b();
        this.f4758t = 2;
        C1277b a = m6043a(context, attributeSet, i, i2);
        mo5427b(a.f4969a);
        mo5428b(a.f4971c);
        mo5379a(a.f4972d);
    }

    /* renamed from: a */
    private int m5688a(C1284o oVar, C1245c cVar, C1290s sVar, boolean z) {
        int i = cVar.f4773c;
        if (cVar.f4777g != Integer.MIN_VALUE) {
            if (cVar.f4773c < 0) {
                cVar.f4777g += cVar.f4773c;
            }
            m5695a(oVar, cVar);
        }
        int i2 = cVar.f4773c + cVar.f4778h;
        C1244b bVar = this.f4746c;
        while (true) {
            if ((!cVar.f4782l && i2 <= 0) || !cVar.mo5463a(sVar)) {
                break;
            }
            bVar.mo5460a();
            mo5371a(oVar, sVar, cVar, bVar);
            if (bVar.f4768b) {
                break;
            }
            cVar.f4772b += bVar.f4767a * cVar.f4776f;
            if (!bVar.f4769c || this.f4744a.f4781k != null || !sVar.f5010g) {
                cVar.f4773c -= bVar.f4767a;
                i2 -= bVar.f4767a;
            }
            if (cVar.f4777g != Integer.MIN_VALUE) {
                cVar.f4777g += bVar.f4767a;
                if (cVar.f4773c < 0) {
                    cVar.f4777g += cVar.f4773c;
                }
                m5695a(oVar, cVar);
            }
            if (z && bVar.f4770d) {
                break;
            }
        }
        return i - cVar.f4773c;
    }

    /* renamed from: a */
    private View m5689a(int i, int i2, boolean z, boolean z2) {
        int i3;
        mo5444h();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f4747i == 0) {
            return this.f4963w.mo6436a(i, i2, i3, i4);
        }
        return this.f4964x.mo6436a(i, i2, i3, i4);
    }

    /* renamed from: b */
    private void m5702b(C1284o oVar, C1290s sVar, int i, int i2) {
        boolean z;
        C1284o oVar2 = oVar;
        C1290s sVar2 = sVar;
        if (sVar2.f5014k && mo5800s() != 0 && !sVar2.f5010g && bi_()) {
            List<C1293v> list = oVar2.f4982d;
            int size = list.size();
            int c = m6060c(mo5788g(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C1293v vVar = (C1293v) list.get(i5);
                if (!vVar.isRemoved()) {
                    char c2 = 1;
                    if (vVar.getLayoutPosition() < c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.f4750l) {
                        c2 = 65535;
                    }
                    if (c2 == 65535) {
                        i3 += this.f4748j.mo6273e(vVar.itemView);
                    } else {
                        i4 += this.f4748j.mo6273e(vVar.itemView);
                    }
                }
            }
            this.f4744a.f4781k = list;
            if (i3 > 0) {
                m5709f(m6060c(m5685J()), i);
                this.f4744a.f4778h = i3;
                this.f4744a.f4773c = 0;
                this.f4744a.mo5462a();
                m5688a(oVar2, this.f4744a, sVar2, false);
            }
            if (i4 > 0) {
                m5707e(m6060c(m5686K()), i2);
                this.f4744a.f4778h = i4;
                this.f4744a.f4773c = 0;
                this.f4744a.mo5462a();
                m5688a(oVar2, this.f4744a, sVar2, false);
            }
            this.f4744a.f4781k = null;
        }
    }

    /* renamed from: a */
    private void m5691a(int i, int i2, boolean z, C1290s sVar) {
        int i3;
        this.f4744a.f4782l = m5684I();
        this.f4744a.f4778h = m5712h(sVar);
        this.f4744a.f4776f = i;
        int i4 = -1;
        if (i == 1) {
            this.f4744a.f4778h += this.f4748j.mo6276g();
            View K = m5686K();
            C1245c cVar = this.f4744a;
            if (!this.f4750l) {
                i4 = 1;
            }
            cVar.f4775e = i4;
            this.f4744a.f4774d = m6060c(K) + this.f4744a.f4775e;
            this.f4744a.f4772b = this.f4748j.mo6267b(K);
            i3 = this.f4748j.mo6267b(K) - this.f4748j.mo6270d();
        } else {
            View J = m5685J();
            this.f4744a.f4778h += this.f4748j.mo6268c();
            C1245c cVar2 = this.f4744a;
            if (this.f4750l) {
                i4 = 1;
            }
            cVar2.f4775e = i4;
            this.f4744a.f4774d = m6060c(J) + this.f4744a.f4775e;
            this.f4744a.f4772b = this.f4748j.mo6263a(J);
            i3 = (-this.f4748j.mo6263a(J)) + this.f4748j.mo6268c();
        }
        this.f4744a.f4773c = i2;
        if (z) {
            this.f4744a.f4773c -= i3;
        }
        this.f4744a.f4777g = i3;
    }
}
