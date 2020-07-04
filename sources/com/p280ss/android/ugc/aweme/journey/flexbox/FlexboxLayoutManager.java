package com.p280ss.android.ugc.aweme.journey.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p029v7.widget.C1343ah;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1273i.C1277b;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1287r.C1289b;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager */
public class FlexboxLayoutManager extends C1273i implements C1289b, C32239a {

    /* renamed from: i */
    static final /* synthetic */ boolean f84187i = (!FlexboxLayoutManager.class.desiredAssertionStatus());

    /* renamed from: j */
    private static final Rect f84188j = new Rect();

    /* renamed from: K */
    private int f84189K;

    /* renamed from: L */
    private int f84190L;

    /* renamed from: M */
    private int f84191M;

    /* renamed from: N */
    private SparseArray<View> f84192N;

    /* renamed from: O */
    private final Context f84193O;

    /* renamed from: P */
    private View f84194P;

    /* renamed from: Q */
    private int f84195Q;

    /* renamed from: R */
    private C32242a f84196R;

    /* renamed from: a */
    public int f84197a;

    /* renamed from: b */
    public int f84198b;

    /* renamed from: c */
    public boolean f84199c;

    /* renamed from: d */
    public List<C32240b> f84200d;

    /* renamed from: e */
    public final C32241c f84201e;

    /* renamed from: f */
    public C1343ah f84202f;

    /* renamed from: g */
    public C1343ah f84203g;

    /* renamed from: h */
    public boolean f84204h;

    /* renamed from: k */
    private int f84205k;

    /* renamed from: l */
    private int f84206l;

    /* renamed from: m */
    private int f84207m;

    /* renamed from: n */
    private boolean f84208n;

    /* renamed from: o */
    private C1284o f84209o;

    /* renamed from: p */
    private C1290s f84210p;

    /* renamed from: q */
    private C32238b f84211q;

    /* renamed from: r */
    private C32237a f84212r;

    /* renamed from: s */
    private SavedState f84213s;

    /* renamed from: t */
    private int f84214t;

    /* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$LayoutParams */
    public static class LayoutParams extends android.support.p029v7.widget.RecyclerView.LayoutParams implements FlexItem {
        public static final Creator<LayoutParams> CREATOR = new Creator<LayoutParams>() {
            /* renamed from: a */
            private static LayoutParams[] m104669a(int i) {
                return new LayoutParams[i];
            }

            /* renamed from: a */
            private static LayoutParams m104668a(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m104668a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m104669a(i);
            }
        };

        /* renamed from: a */
        private float f84215a;

        /* renamed from: b */
        private float f84216b = 1.0f;

        /* renamed from: g */
        private int f84217g = -1;

        /* renamed from: h */
        private float f84218h = -1.0f;

        /* renamed from: i */
        private int f84219i;

        /* renamed from: j */
        private int f84220j;

        /* renamed from: k */
        private int f84221k = 16777215;

        /* renamed from: l */
        private int f84222l = 16777215;

        /* renamed from: m */
        private boolean f84223m;

        /* renamed from: a */
        public final int mo83391a() {
            return this.width;
        }

        /* renamed from: b */
        public final int mo83392b() {
            return this.height;
        }

        /* renamed from: c */
        public final float mo83393c() {
            return this.f84215a;
        }

        /* renamed from: d */
        public final float mo83394d() {
            return this.f84216b;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final int mo83395e() {
            return this.f84217g;
        }

        /* renamed from: f */
        public final int mo83396f() {
            return this.f84219i;
        }

        /* renamed from: g */
        public final int mo83397g() {
            return this.f84220j;
        }

        /* renamed from: h */
        public final int mo83398h() {
            return this.f84221k;
        }

        /* renamed from: i */
        public final int mo83399i() {
            return this.f84222l;
        }

        /* renamed from: j */
        public final boolean mo83400j() {
            return this.f84223m;
        }

        /* renamed from: k */
        public final float mo83401k() {
            return this.f84218h;
        }

        /* renamed from: l */
        public final int mo83402l() {
            return this.leftMargin;
        }

        /* renamed from: m */
        public final int mo83403m() {
            return this.topMargin;
        }

        /* renamed from: n */
        public final int mo83404n() {
            return this.rightMargin;
        }

        /* renamed from: o */
        public final int mo83405o() {
            return this.bottomMargin;
        }

        protected LayoutParams(Parcel parcel) {
            boolean z;
            super(-2, -2);
            this.f84215a = parcel.readFloat();
            this.f84216b = parcel.readFloat();
            this.f84217g = parcel.readInt();
            this.f84218h = parcel.readFloat();
            this.f84219i = parcel.readInt();
            this.f84220j = parcel.readInt();
            this.f84221k = parcel.readInt();
            this.f84222l = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f84223m = z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(int i, int i2) {
            super(-2, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f84215a);
            parcel.writeFloat(this.f84216b);
            parcel.writeInt(this.f84217g);
            parcel.writeFloat(this.f84218h);
            parcel.writeInt(this.f84219i);
            parcel.writeInt(this.f84220j);
            parcel.writeInt(this.f84221k);
            parcel.writeInt(this.f84222l);
            parcel.writeByte(this.f84223m ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$SavedState */
    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m104673a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m104672a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m104672a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m104673a(i);
            }
        };

        /* renamed from: a */
        public int f84224a;

        /* renamed from: b */
        public int f84225b;

        SavedState() {
        }

        /* renamed from: a */
        public final void mo83426a() {
            this.f84224a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
            sb.append(this.f84224a);
            sb.append(", mAnchorOffset=");
            sb.append(this.f84225b);
            sb.append('}');
            return sb.toString();
        }

        private SavedState(Parcel parcel) {
            this.f84224a = parcel.readInt();
            this.f84225b = parcel.readInt();
        }

        /* renamed from: a */
        public final boolean mo83427a(int i) {
            if (this.f84224a < 0 || this.f84224a >= i) {
                return false;
            }
            return true;
        }

        private SavedState(SavedState savedState) {
            this.f84224a = savedState.f84224a;
            this.f84225b = savedState.f84225b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f84224a);
            parcel.writeInt(this.f84225b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$a */
    class C32237a {

        /* renamed from: h */
        static final /* synthetic */ boolean f84226h = (!FlexboxLayoutManager.class.desiredAssertionStatus());

        /* renamed from: a */
        public int f84227a;

        /* renamed from: b */
        public int f84228b;

        /* renamed from: c */
        public int f84229c;

        /* renamed from: d */
        public int f84230d;

        /* renamed from: e */
        public boolean f84231e;

        /* renamed from: f */
        public boolean f84232f;

        /* renamed from: g */
        public boolean f84233g;

        /* renamed from: a */
        public final void mo83433a() {
            this.f84227a = -1;
            this.f84228b = -1;
            this.f84229c = Integer.MIN_VALUE;
            boolean z = false;
            this.f84232f = false;
            this.f84233g = false;
            if (FlexboxLayoutManager.this.mo83417i()) {
                if (FlexboxLayoutManager.this.f84198b == 0) {
                    if (FlexboxLayoutManager.this.f84197a == 1) {
                        z = true;
                    }
                    this.f84231e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f84198b == 2) {
                    z = true;
                }
                this.f84231e = z;
            } else if (FlexboxLayoutManager.this.f84198b == 0) {
                if (FlexboxLayoutManager.this.f84197a == 3) {
                    z = true;
                }
                this.f84231e = z;
            } else {
                if (FlexboxLayoutManager.this.f84198b == 2) {
                    z = true;
                }
                this.f84231e = z;
            }
        }

        /* renamed from: b */
        public final void mo83435b() {
            int i;
            int i2;
            if (FlexboxLayoutManager.this.mo83417i() || !FlexboxLayoutManager.this.f84199c) {
                if (this.f84231e) {
                    i = FlexboxLayoutManager.this.f84202f.mo6270d();
                } else {
                    i = FlexboxLayoutManager.this.f84202f.mo6268c();
                }
                this.f84229c = i;
                return;
            }
            if (this.f84231e) {
                i2 = FlexboxLayoutManager.this.f84202f.mo6270d();
            } else {
                i2 = FlexboxLayoutManager.this.f4957I - FlexboxLayoutManager.this.f84202f.mo6268c();
            }
            this.f84229c = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.f84227a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.f84228b);
            sb.append(", mCoordinate=");
            sb.append(this.f84229c);
            sb.append(", mPerpendicularCoordinate=");
            sb.append(this.f84230d);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f84231e);
            sb.append(", mValid=");
            sb.append(this.f84232f);
            sb.append(", mAssignedFromSavedState=");
            sb.append(this.f84233g);
            sb.append('}');
            return sb.toString();
        }

        private C32237a() {
        }

        /* renamed from: a */
        public final void mo83434a(View view) {
            C1343ah ahVar;
            int i;
            if (FlexboxLayoutManager.this.f84198b == 0) {
                ahVar = FlexboxLayoutManager.this.f84203g;
            } else {
                ahVar = FlexboxLayoutManager.this.f84202f;
            }
            if (FlexboxLayoutManager.this.mo83417i() || !FlexboxLayoutManager.this.f84199c) {
                if (this.f84231e) {
                    this.f84229c = ahVar.mo6267b(view) + ahVar.mo6266b();
                } else {
                    this.f84229c = ahVar.mo6263a(view);
                }
            } else if (this.f84231e) {
                this.f84229c = ahVar.mo6263a(view) + ahVar.mo6266b();
            } else {
                this.f84229c = ahVar.mo6267b(view);
            }
            this.f84227a = FlexboxLayoutManager.m6060c(view);
            int i2 = 0;
            this.f84233g = false;
            if (f84226h || FlexboxLayoutManager.this.f84201e.f84264a != null) {
                int[] iArr = FlexboxLayoutManager.this.f84201e.f84264a;
                if (this.f84227a != -1) {
                    i = this.f84227a;
                } else {
                    i = 0;
                }
                int i3 = iArr[i];
                if (i3 != -1) {
                    i2 = i3;
                }
                this.f84228b = i2;
                if (FlexboxLayoutManager.this.f84200d.size() > this.f84228b) {
                    this.f84227a = ((C32240b) FlexboxLayoutManager.this.f84200d.get(this.f84228b)).f84259o;
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager$b */
    static class C32238b {

        /* renamed from: a */
        public int f84235a;

        /* renamed from: b */
        public boolean f84236b;

        /* renamed from: c */
        public int f84237c;

        /* renamed from: d */
        public int f84238d;

        /* renamed from: e */
        public int f84239e;

        /* renamed from: f */
        public int f84240f;

        /* renamed from: g */
        public int f84241g;

        /* renamed from: h */
        public int f84242h;

        /* renamed from: i */
        public int f84243i;

        /* renamed from: j */
        public boolean f84244j;

        private C32238b() {
            this.f84242h = 1;
            this.f84243i = 1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
            sb.append(this.f84235a);
            sb.append(", mFlexLinePosition=");
            sb.append(this.f84237c);
            sb.append(", mPosition=");
            sb.append(this.f84238d);
            sb.append(", mOffset=");
            sb.append(this.f84239e);
            sb.append(", mScrollingOffset=");
            sb.append(this.f84240f);
            sb.append(", mLastScrollDelta=");
            sb.append(this.f84241g);
            sb.append(", mItemDirection=");
            sb.append(this.f84242h);
            sb.append(", mLayoutDirection=");
            sb.append(this.f84243i);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        public final boolean mo83437a(C1290s sVar, List<C32240b> list) {
            if (this.f84238d < 0 || this.f84238d >= sVar.mo5870b() || this.f84237c < 0 || this.f84237c >= list.size()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: c */
    public final int mo83413c() {
        return this.f84197a;
    }

    /* renamed from: g */
    public final int mo83415g() {
        return this.f84198b;
    }

    /* renamed from: h */
    public final int mo83416h() {
        return this.f84206l;
    }

    /* renamed from: k */
    public final int mo83419k() {
        return this.f84207m;
    }

    /* renamed from: l */
    public final List<C32240b> mo83420l() {
        return this.f84200d;
    }

    /* renamed from: a */
    public final int mo83407a(View view, int i, int i2) {
        if (mo83417i()) {
            return m6067m(view) + m6068n(view);
        }
        return m6065k(view) + m6066l(view);
    }

    /* renamed from: a */
    public final void mo83409a(View view, int i, int i2, C32240b bVar) {
        mo5777b(view, f84188j);
        if (mo83417i()) {
            int m = m6067m(view) + m6068n(view);
            bVar.f84249e += m;
            bVar.f84250f += m;
            return;
        }
        int k = m6065k(view) + m6066l(view);
        bVar.f84249e += k;
        bVar.f84250f += k;
    }

    /* renamed from: a */
    public final View mo5368a(int i) {
        return m104597m(i);
    }

    /* renamed from: a */
    public final void mo83408a(int i, View view) {
        this.f84192N.put(i, view);
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5364a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    public final boolean mo5380a(android.support.p029v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    public final void mo5420a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f84213s = (SavedState) parcelable;
            mo5795n();
        }
    }

    /* renamed from: a */
    public final void mo5376a(RecyclerView recyclerView, int i, int i2) {
        super.mo5376a(recyclerView, i, i2);
        m104598n(i);
    }

    /* renamed from: a */
    public final void mo5378a(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo5378a(recyclerView, i, i2, obj);
        m104598n(i);
    }

    /* renamed from: b */
    public final void mo5383b(RecyclerView recyclerView, int i, int i2) {
        super.mo5383b(recyclerView, i, i2);
        m104598n(i);
    }

    /* renamed from: a */
    public final void mo5377a(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo5377a(recyclerView, i, i2, i3);
        m104598n(Math.min(i, i2));
    }

    /* renamed from: c */
    public final void mo5385c(C1284o oVar, C1290s sVar) {
        int i;
        int i2;
        this.f84209o = oVar;
        this.f84210p = sVar;
        int b = sVar.mo5870b();
        if (b != 0 || !sVar.f5010g) {
            m104558H();
            m104561K();
            m104562L();
            this.f84201e.mo83457c(b);
            this.f84201e.mo83455b(b);
            this.f84201e.mo83459d(b);
            this.f84211q.f84244j = false;
            if (this.f84213s != null && this.f84213s.mo83427a(b)) {
                this.f84214t = this.f84213s.f84224a;
            }
            if (!(this.f84212r.f84232f && this.f84214t == -1 && this.f84213s == null)) {
                this.f84212r.mo83433a();
                m104573a(sVar, this.f84212r);
                this.f84212r.f84232f = true;
            }
            mo5753a(oVar);
            if (this.f84212r.f84231e) {
                m104581b(this.f84212r, false, true);
            } else {
                m104574a(this.f84212r, false, true);
            }
            m104600o(b);
            if (this.f84212r.f84231e) {
                m104566a(oVar, sVar, this.f84211q);
                i2 = this.f84211q.f84239e;
                m104574a(this.f84212r, true, false);
                m104566a(oVar, sVar, this.f84211q);
                i = this.f84211q.f84239e;
            } else {
                m104566a(oVar, sVar, this.f84211q);
                i = this.f84211q.f84239e;
                m104581b(this.f84212r, true, false);
                m104566a(oVar, sVar, this.f84211q);
                i2 = this.f84211q.f84239e;
            }
            if (mo5800s() > 0) {
                if (this.f84212r.f84231e) {
                    m104565a(i2 + m104577b(i, oVar, sVar, true), oVar, sVar, false);
                    return;
                }
                m104577b(i + m104565a(i2, oVar, sVar, true), oVar, sVar, false);
            }
        }
    }

    /* renamed from: a */
    public final void mo5373a(C1290s sVar) {
        super.mo5373a(sVar);
        this.f84213s = null;
        this.f84214t = -1;
        this.f84189K = Integer.MIN_VALUE;
        this.f84195Q = -1;
        this.f84212r.mo83433a();
        this.f84192N.clear();
    }

    /* renamed from: a */
    private void m104573a(C1290s sVar, C32237a aVar) {
        if (!m104575a(sVar, aVar, this.f84213s) && !m104582b(sVar, aVar)) {
            aVar.mo83435b();
            aVar.f84227a = 0;
            aVar.f84228b = 0;
        }
    }

    /* renamed from: a */
    private boolean m104575a(C1290s sVar, C32237a aVar, SavedState savedState) {
        int i;
        if (f84187i || this.f84201e.f84264a != null) {
            boolean z = false;
            if (sVar.f5010g || this.f84214t == -1) {
                return false;
            }
            if (this.f84214t < 0 || this.f84214t >= sVar.mo5870b()) {
                this.f84214t = -1;
                this.f84189K = Integer.MIN_VALUE;
                return false;
            }
            aVar.f84227a = this.f84214t;
            aVar.f84228b = this.f84201e.f84264a[aVar.f84227a];
            if (this.f84213s != null && this.f84213s.mo83427a(sVar.mo5870b())) {
                aVar.f84229c = this.f84202f.mo6268c() + savedState.f84225b;
                aVar.f84233g = true;
                aVar.f84228b = -1;
                return true;
            } else if (this.f84189K == Integer.MIN_VALUE) {
                View c = mo5432c(this.f84214t);
                if (c == null) {
                    if (mo5800s() > 0) {
                        if (this.f84214t < m6060c(mo5788g(0))) {
                            z = true;
                        }
                        aVar.f84231e = z;
                    }
                    aVar.mo83435b();
                } else if (this.f84202f.mo6273e(c) > this.f84202f.mo6274f()) {
                    aVar.mo83435b();
                    return true;
                } else if (this.f84202f.mo6263a(c) - this.f84202f.mo6268c() < 0) {
                    aVar.f84229c = this.f84202f.mo6268c();
                    aVar.f84231e = false;
                    return true;
                } else if (this.f84202f.mo6270d() - this.f84202f.mo6267b(c) < 0) {
                    aVar.f84229c = this.f84202f.mo6270d();
                    aVar.f84231e = true;
                    return true;
                } else {
                    if (aVar.f84231e) {
                        i = this.f84202f.mo6267b(c) + this.f84202f.mo6266b();
                    } else {
                        i = this.f84202f.mo6263a(c);
                    }
                    aVar.f84229c = i;
                }
                return true;
            } else {
                if (mo83417i() || !this.f84199c) {
                    aVar.f84229c = this.f84202f.mo6268c() + this.f84189K;
                } else {
                    aVar.f84229c = this.f84189K - this.f84202f.mo6276g();
                }
                return true;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    private boolean m104582b(C1290s sVar, C32237a aVar) {
        View view;
        int i;
        boolean z = false;
        if (mo5800s() == 0) {
            return false;
        }
        if (aVar.f84231e) {
            view = m104604q(sVar.mo5870b());
        } else {
            view = m104602p(sVar.mo5870b());
        }
        if (view == null) {
            return false;
        }
        aVar.mo83434a(view);
        if (!sVar.f5010g && bi_()) {
            if (this.f84202f.mo6263a(view) >= this.f84202f.mo6270d() || this.f84202f.mo6267b(view) < this.f84202f.mo6268c()) {
                z = true;
            }
            if (z) {
                if (aVar.f84231e) {
                    i = this.f84202f.mo6270d();
                } else {
                    i = this.f84202f.mo6268c();
                }
                aVar.f84229c = i;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m104574a(C32237a aVar, boolean z, boolean z2) {
        if (z2) {
            m104560J();
        } else {
            this.f84211q.f84236b = false;
        }
        if (mo83417i() || !this.f84199c) {
            this.f84211q.f84235a = this.f84202f.mo6270d() - aVar.f84229c;
        } else {
            this.f84211q.f84235a = aVar.f84229c - mo5803v();
        }
        this.f84211q.f84238d = aVar.f84227a;
        this.f84211q.f84242h = 1;
        this.f84211q.f84243i = 1;
        this.f84211q.f84239e = aVar.f84229c;
        this.f84211q.f84240f = Integer.MIN_VALUE;
        this.f84211q.f84237c = aVar.f84228b;
        if (z && this.f84200d.size() > 1 && aVar.f84228b >= 0 && aVar.f84228b < this.f84200d.size() - 1) {
            C32240b bVar = (C32240b) this.f84200d.get(aVar.f84228b);
            this.f84211q.f84237c++;
            this.f84211q.f84238d += bVar.f84252h;
        }
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.f4993g = i;
        mo5755a((C1287r) linearSmoothScroller);
    }

    /* renamed from: a */
    public final void mo5421a(RecyclerView recyclerView, C1284o oVar) {
        super.mo5421a(recyclerView, oVar);
        if (this.f84204h) {
            mo5780c(oVar);
            oVar.mo5832a();
        }
    }

    /* renamed from: a */
    public final int mo5361a(int i, C1284o oVar, C1290s sVar) {
        if (!mo83417i() || (this.f84198b == 0 && mo83417i())) {
            int c = m104583c(i, oVar, sVar);
            this.f84192N.clear();
            return c;
        }
        int r = m104605r(i);
        this.f84212r.f84230d += r;
        this.f84203g.mo6265a(-r);
        return r;
    }

    /* renamed from: b */
    public final int mo5426b(C1290s sVar) {
        return m104593i(sVar);
    }

    /* renamed from: a */
    private boolean m104576a(View view, boolean z) {
        int t = mo5801t();
        int u = mo5802u();
        int v = this.f4957I - mo5803v();
        int w = this.f4958J - mo5804w();
        int o = m104599o(view);
        int q = m104603q(view);
        int p = m104601p(view);
        int r = m104606r(view);
        return z ? (t <= o && v >= p) && (u <= q && w >= r) : (o >= v || p >= t) && (q >= w || r >= u);
    }

    /* renamed from: I */
    private View m104559I() {
        return mo5788g(0);
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5363a() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: b */
    public final int mo83411b() {
        return this.f84210p.mo5870b();
    }

    /* renamed from: L */
    private void m104562L() {
        if (this.f84211q == null) {
            this.f84211q = new C32238b();
        }
    }

    /* renamed from: M */
    private void m104563M() {
        this.f84200d.clear();
        this.f84212r.mo83433a();
        this.f84212r.f84230d = 0;
    }

    /* renamed from: i */
    public final boolean mo83417i() {
        if (this.f84197a == 0 || this.f84197a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private void m104560J() {
        int i;
        boolean z;
        if (mo83417i()) {
            i = this.f4956H;
        } else {
            i = this.f4955G;
        }
        C32238b bVar = this.f84211q;
        if (i == 0 || i == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        bVar.f84236b = z;
    }

    /* renamed from: N */
    private int m104564N() {
        View a = m104568a(0, mo5800s(), false);
        if (a == null) {
            return -1;
        }
        return m6060c(a);
    }

    /* renamed from: G */
    public final int mo83406G() {
        View a = m104568a(mo5800s() - 1, -1, false);
        if (a == null) {
            return -1;
        }
        return m6060c(a);
    }

    /* renamed from: K */
    private void m104561K() {
        if (this.f84202f == null) {
            if (mo83417i()) {
                if (this.f84198b != 0) {
                    this.f84202f = C1343ah.m6626b((C1273i) this);
                    this.f84203g = C1343ah.m6624a((C1273i) this);
                    return;
                }
            } else if (this.f84198b == 0) {
                this.f84202f = C1343ah.m6626b((C1273i) this);
                this.f84203g = C1343ah.m6624a((C1273i) this);
                return;
            }
            this.f84202f = C1343ah.m6624a((C1273i) this);
            this.f84203g = C1343ah.m6626b((C1273i) this);
        }
    }

    /* renamed from: e */
    public final boolean mo5438e() {
        int i;
        if (this.f84198b == 0) {
            return mo83417i();
        }
        if (mo83417i()) {
            int i2 = this.f4957I;
            if (this.f84194P != null) {
                i = this.f84194P.getWidth();
            } else {
                i = 0;
            }
            if (i2 <= i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo5441f() {
        int i;
        if (this.f84198b != 0) {
            if (!mo83417i()) {
                int i2 = this.f4958J;
                if (this.f84194P != null) {
                    i = this.f84194P.getHeight();
                } else {
                    i = 0;
                }
                if (i2 > i) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (!mo83417i()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: j */
    public final int mo83418j() {
        if (this.f84200d.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.f84200d.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, ((C32240b) this.f84200d.get(i2)).f84249e);
        }
        return i;
    }

    /* renamed from: m */
    public final List<C32240b> mo83421m() {
        ArrayList arrayList = new ArrayList(this.f84200d.size());
        int size = this.f84200d.size();
        for (int i = 0; i < size; i++) {
            C32240b bVar = (C32240b) this.f84200d.get(i);
            if (bVar.f84252h != 0) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: H */
    private void m104558H() {
        boolean z;
        boolean z2;
        boolean z3;
        int q = mo5798q();
        boolean z4 = false;
        switch (this.f84197a) {
            case 0:
                if (q == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f84199c = z;
                if (this.f84198b == 2) {
                    z4 = true;
                }
                this.f84208n = z4;
                return;
            case 1:
                if (q != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f84199c = z2;
                if (this.f84198b == 2) {
                    z4 = true;
                }
                this.f84208n = z4;
                return;
            case 2:
                if (q == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f84199c = z3;
                if (this.f84198b == 2) {
                    this.f84199c = !this.f84199c;
                }
                this.f84208n = false;
                return;
            case 3:
                if (q == 1) {
                    z4 = true;
                }
                this.f84199c = z4;
                if (this.f84198b == 2) {
                    this.f84199c = !this.f84199c;
                }
                this.f84208n = true;
                return;
            default:
                this.f84199c = false;
                this.f84208n = false;
                return;
        }
    }

    /* renamed from: d */
    public final Parcelable mo5435d() {
        if (this.f84213s != null) {
            return new SavedState(this.f84213s);
        }
        SavedState savedState = new SavedState();
        if (mo5800s() > 0) {
            View I = m104559I();
            savedState.f84224a = m6060c(I);
            savedState.f84225b = this.f84202f.mo6263a(I) - this.f84202f.mo6268c();
        } else {
            savedState.mo83426a();
        }
        return savedState;
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    /* renamed from: c */
    public final int mo5431c(C1290s sVar) {
        return m104593i(sVar);
    }

    /* renamed from: d */
    public final int mo5433d(C1290s sVar) {
        return m104592h(sVar);
    }

    /* renamed from: e */
    public final int mo5436e(C1290s sVar) {
        return m104592h(sVar);
    }

    /* renamed from: f */
    public final int mo5440f(C1290s sVar) {
        return m104594j(sVar);
    }

    /* renamed from: g */
    public final int mo5442g(C1290s sVar) {
        return m104594j(sVar);
    }

    /* renamed from: o */
    private int m104599o(View view) {
        return mo5787g(view) - ((android.support.p029v7.widget.RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: p */
    private int m104601p(View view) {
        return mo5791i(view) + ((android.support.p029v7.widget.RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: q */
    private int m104603q(View view) {
        return mo5789h(view) - ((android.support.p029v7.widget.RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
    }

    /* renamed from: r */
    private int m104606r(View view) {
        return mo5793j(view) + ((android.support.p029v7.widget.RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: d */
    public final void mo5785d(RecyclerView recyclerView) {
        super.mo5785d(recyclerView);
        this.f84194P = (View) recyclerView.getParent();
    }

    /* renamed from: f */
    private void m104591f(int i) {
        if (this.f84197a != i) {
            mo5799r();
            this.f84197a = i;
            this.f84202f = null;
            this.f84203g = null;
            m104563M();
            mo5795n();
        }
    }

    /* renamed from: l */
    private void m104596l(int i) {
        if (this.f84206l != 4) {
            mo5799r();
            m104563M();
            this.f84206l = 4;
            mo5795n();
        }
    }

    /* renamed from: m */
    private View m104597m(int i) {
        View view = (View) this.f84192N.get(i);
        if (view != null) {
            return view;
        }
        return this.f84209o.mo5848c(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo5427b(int i) {
        if (f84187i || this.f84201e.f84264a != null) {
            return this.f84201e.f84264a[i];
        }
        throw new AssertionError();
    }

    /* renamed from: d_ */
    public final int mo83414d_(View view) {
        if (mo83417i()) {
            return m6065k(view) + m6066l(view);
        }
        return m6067m(view) + m6068n(view);
    }

    /* renamed from: e */
    public final void mo5437e(int i) {
        this.f84214t = i;
        this.f84189K = Integer.MIN_VALUE;
        if (this.f84213s != null) {
            this.f84213s.mo83426a();
        }
        mo5795n();
    }

    /* renamed from: h */
    private int m104592h(C1290s sVar) {
        if (mo5800s() == 0) {
            return 0;
        }
        int b = sVar.mo5870b();
        m104561K();
        View p = m104602p(b);
        View q = m104604q(b);
        if (sVar.mo5870b() == 0 || p == null || q == null) {
            return 0;
        }
        return Math.min(this.f84202f.mo6274f(), this.f84202f.mo6267b(q) - this.f84202f.mo6263a(p));
    }

    /* renamed from: k */
    private void m104595k(int i) {
        if (i == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        } else if (this.f84198b != i) {
            if (this.f84198b == 0 || i == 0) {
                mo5799r();
                m104563M();
            }
            this.f84198b = i;
            this.f84202f = null;
            this.f84203g = null;
            mo5795n();
        }
    }

    /* renamed from: p */
    private View m104602p(int i) {
        if (f84187i || this.f84201e.f84264a != null) {
            View c = m104585c(0, mo5800s(), i);
            if (c == null) {
                return null;
            }
            int i2 = this.f84201e.f84264a[m6060c(c)];
            if (i2 == -1) {
                return null;
            }
            return m104569a(c, (C32240b) this.f84200d.get(i2));
        }
        throw new AssertionError();
    }

    /* renamed from: q */
    private View m104604q(int i) {
        if (f84187i || this.f84201e.f84264a != null) {
            View c = m104585c(mo5800s() - 1, -1, i);
            if (c == null) {
                return null;
            }
            return m104579b(c, (C32240b) this.f84200d.get(this.f84201e.f84264a[m6060c(c)]));
        }
        throw new AssertionError();
    }

    /* renamed from: i */
    private int m104593i(C1290s sVar) {
        if (mo5800s() == 0) {
            return 0;
        }
        int b = sVar.mo5870b();
        View p = m104602p(b);
        View q = m104604q(b);
        if (sVar.mo5870b() == 0 || p == null || q == null) {
            return 0;
        }
        if (f84187i || this.f84201e.f84264a != null) {
            int c = m6060c(p);
            int c2 = m6060c(q);
            int abs = Math.abs(this.f84202f.mo6267b(q) - this.f84202f.mo6263a(p));
            int i = this.f84201e.f84264a[c];
            if (i == 0 || i == -1) {
                return 0;
            }
            return Math.round((((float) i) * (((float) abs) / ((float) ((this.f84201e.f84264a[c2] - i) + 1)))) + ((float) (this.f84202f.mo6268c() - this.f84202f.mo6263a(p))));
        }
        throw new AssertionError();
    }

    /* renamed from: j */
    private int m104594j(C1290s sVar) {
        if (mo5800s() == 0) {
            return 0;
        }
        int b = sVar.mo5870b();
        View p = m104602p(b);
        View q = m104604q(b);
        if (sVar.mo5870b() == 0 || p == null || q == null) {
            return 0;
        }
        if (f84187i || this.f84201e.f84264a != null) {
            int N = m104564N();
            return (int) ((((float) Math.abs(this.f84202f.mo6267b(q) - this.f84202f.mo6263a(p))) / ((float) ((mo83406G() - N) + 1))) * ((float) sVar.mo5870b()));
        }
        throw new AssertionError();
    }

    /* renamed from: n */
    private void m104598n(int i) {
        if (i < mo83406G()) {
            int s = mo5800s();
            this.f84201e.mo83457c(s);
            this.f84201e.mo83455b(s);
            this.f84201e.mo83459d(s);
            if (!f84187i && this.f84201e.f84264a == null) {
                throw new AssertionError();
            } else if (i < this.f84201e.f84264a.length) {
                this.f84195Q = i;
                View I = m104559I();
                if (I != null) {
                    this.f84214t = m6060c(I);
                    if (mo83417i() || !this.f84199c) {
                        this.f84189K = this.f84202f.mo6263a(I) - this.f84202f.mo6268c();
                    } else {
                        this.f84189K = this.f84202f.mo6267b(I) + this.f84202f.mo6276g();
                    }
                }
            }
        }
    }

    /* renamed from: r */
    private int m104605r(int i) {
        int i2;
        int i3;
        boolean z = false;
        if (mo5800s() == 0 || i == 0) {
            return 0;
        }
        m104561K();
        boolean i4 = mo83417i();
        if (i4) {
            i2 = this.f84194P.getWidth();
        } else {
            i2 = this.f84194P.getHeight();
        }
        if (i4) {
            i3 = this.f4957I;
        } else {
            i3 = this.f4958J;
        }
        if (mo5798q() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                i = -Math.min((i3 + this.f84212r.f84230d) - i2, abs);
            } else if (this.f84212r.f84230d + i > 0) {
                i = -this.f84212r.f84230d;
            }
        } else if (i > 0) {
            i = Math.min((i3 - this.f84212r.f84230d) - i2, i);
        } else if (this.f84212r.f84230d + i < 0) {
            i = -this.f84212r.f84230d;
        }
        return i;
    }

    /* renamed from: d */
    public final PointF mo5434d(int i) {
        int i2;
        if (mo5800s() == 0) {
            return null;
        }
        if (i < m6060c(mo5788g(0))) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo83417i()) {
            return new PointF(0.0f, (float) i2);
        }
        return new PointF((float) i2, 0.0f);
    }

    /* renamed from: o */
    private void m104600o(int i) {
        int i2;
        int i3;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f4957I, this.f4955G);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(this.f4958J, this.f4956H);
        int i4 = this.f4957I;
        int i5 = this.f4958J;
        boolean z = true;
        if (mo83417i()) {
            if (this.f84190L == Integer.MIN_VALUE || this.f84190L == i4) {
                z = false;
            }
            if (this.f84211q.f84236b) {
                i2 = this.f84193O.getResources().getDisplayMetrics().heightPixels;
            } else {
                i2 = this.f84211q.f84235a;
            }
        } else {
            if (this.f84191M == Integer.MIN_VALUE || this.f84191M == i5) {
                z = false;
            }
            if (this.f84211q.f84236b) {
                i2 = this.f84193O.getResources().getDisplayMetrics().widthPixels;
            } else {
                i2 = this.f84211q.f84235a;
            }
        }
        int i6 = i2;
        this.f84190L = i4;
        this.f84191M = i5;
        if (this.f84195Q != -1 || (this.f84214t == -1 && !z)) {
            if (this.f84195Q != -1) {
                i3 = Math.min(this.f84195Q, this.f84212r.f84227a);
            } else {
                i3 = this.f84212r.f84227a;
            }
            int i7 = i3;
            this.f84196R.mo83461a();
            if (mo83417i()) {
                if (this.f84200d.size() > 0) {
                    this.f84201e.mo83454a(this.f84200d, i7);
                    this.f84201e.mo83452a(this.f84196R, makeMeasureSpec, makeMeasureSpec2, i6, i7, this.f84212r.f84227a, this.f84200d);
                } else {
                    this.f84201e.mo83459d(i);
                    this.f84201e.mo83453a(this.f84196R, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f84200d);
                }
            } else if (this.f84200d.size() > 0) {
                this.f84201e.mo83454a(this.f84200d, i7);
                this.f84201e.mo83452a(this.f84196R, makeMeasureSpec2, makeMeasureSpec, i6, i7, this.f84212r.f84227a, this.f84200d);
            } else {
                this.f84201e.mo83459d(i);
                this.f84201e.mo83458c(this.f84196R, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f84200d);
            }
            this.f84200d = this.f84196R.f84269a;
            this.f84201e.mo83449a(makeMeasureSpec, makeMeasureSpec2, i7);
            this.f84201e.mo83447a(i7);
        } else if (!this.f84212r.f84231e) {
            this.f84200d.clear();
            if (f84187i || this.f84201e.f84264a != null) {
                this.f84196R.mo83461a();
                if (mo83417i()) {
                    this.f84201e.mo83456b(this.f84196R, makeMeasureSpec, makeMeasureSpec2, i6, this.f84212r.f84227a, this.f84200d);
                } else {
                    this.f84201e.mo83460d(this.f84196R, makeMeasureSpec, makeMeasureSpec2, i6, this.f84212r.f84227a, this.f84200d);
                }
                this.f84200d = this.f84196R.f84269a;
                this.f84201e.mo83448a(makeMeasureSpec, makeMeasureSpec2);
                this.f84201e.mo83446a();
                this.f84212r.f84228b = this.f84201e.f84264a[this.f84212r.f84227a];
                this.f84211q.f84237c = this.f84212r.f84228b;
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public final void mo5752a(C1262a aVar, C1262a aVar2) {
        mo5799r();
    }

    /* renamed from: a */
    private int m104567a(C32240b bVar, C32238b bVar2) {
        if (mo83417i()) {
            return m104578b(bVar, bVar2);
        }
        return m104584c(bVar, bVar2);
    }

    /* renamed from: c */
    private boolean m104587c(View view, int i) {
        if (mo83417i() || !this.f84199c) {
            if (this.f84202f.mo6267b(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f84202f.mo6272e() - this.f84202f.mo6263a(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private View m104569a(View view, C32240b bVar) {
        boolean i = mo83417i();
        int i2 = bVar.f84252h;
        for (int i3 = 1; i3 < i2; i3++) {
            View g = mo5788g(i3);
            if (!(g == null || g.getVisibility() == 8)) {
                if (!this.f84199c || i) {
                    if (this.f84202f.mo6263a(view) <= this.f84202f.mo6263a(g)) {
                    }
                } else if (this.f84202f.mo6267b(view) >= this.f84202f.mo6267b(g)) {
                }
                view = g;
            }
        }
        return view;
    }

    /* renamed from: d */
    private boolean m104590d(View view, int i) {
        if (mo83417i() || !this.f84199c) {
            if (this.f84202f.mo6263a(view) >= this.f84202f.mo6272e() - i) {
                return true;
            }
            return false;
        } else if (this.f84202f.mo6267b(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private View m104579b(View view, C32240b bVar) {
        boolean i = mo83417i();
        int s = (mo5800s() - bVar.f84252h) - 1;
        for (int s2 = mo5800s() - 2; s2 > s; s2--) {
            View g = mo5788g(s2);
            if (!(g == null || g.getVisibility() == 8)) {
                if (!this.f84199c || i) {
                    if (this.f84202f.mo6267b(view) >= this.f84202f.mo6267b(g)) {
                    }
                } else if (this.f84202f.mo6263a(view) <= this.f84202f.mo6263a(g)) {
                }
                view = g;
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m104570a(int i, int i2) {
        boolean z;
        int i3;
        if (f84187i || this.f84201e.f84264a != null) {
            this.f84211q.f84243i = i;
            boolean i4 = mo83417i();
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f4957I, this.f4955G);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(this.f4958J, this.f4956H);
            int i5 = 0;
            if (i4 || !this.f84199c) {
                z = false;
            } else {
                z = true;
            }
            if (i == 1) {
                View g = mo5788g(mo5800s() - 1);
                this.f84211q.f84239e = this.f84202f.mo6267b(g);
                int c = m6060c(g);
                View b = m104579b(g, (C32240b) this.f84200d.get(this.f84201e.f84264a[c]));
                this.f84211q.f84242h = 1;
                C32238b bVar = this.f84211q;
                bVar.f84238d = c + bVar.f84242h;
                if (this.f84201e.f84264a.length <= this.f84211q.f84238d) {
                    this.f84211q.f84237c = -1;
                } else {
                    this.f84211q.f84237c = this.f84201e.f84264a[this.f84211q.f84238d];
                }
                if (z) {
                    this.f84211q.f84239e = this.f84202f.mo6263a(b);
                    this.f84211q.f84240f = (-this.f84202f.mo6263a(b)) + this.f84202f.mo6268c();
                    C32238b bVar2 = this.f84211q;
                    if (this.f84211q.f84240f >= 0) {
                        i5 = this.f84211q.f84240f;
                    }
                    bVar2.f84240f = i5;
                } else {
                    this.f84211q.f84239e = this.f84202f.mo6267b(b);
                    this.f84211q.f84240f = this.f84202f.mo6267b(b) - this.f84202f.mo6270d();
                }
                if ((this.f84211q.f84237c == -1 || this.f84211q.f84237c > this.f84200d.size() - 1) && this.f84211q.f84238d <= mo83411b()) {
                    int i6 = i2 - this.f84211q.f84240f;
                    this.f84196R.mo83461a();
                    if (i6 > 0) {
                        if (i4) {
                            this.f84201e.mo83453a(this.f84196R, makeMeasureSpec, makeMeasureSpec2, i6, this.f84211q.f84238d, this.f84200d);
                        } else {
                            this.f84201e.mo83458c(this.f84196R, makeMeasureSpec, makeMeasureSpec2, i6, this.f84211q.f84238d, this.f84200d);
                        }
                        this.f84201e.mo83449a(makeMeasureSpec, makeMeasureSpec2, this.f84211q.f84238d);
                        this.f84201e.mo83447a(this.f84211q.f84238d);
                    }
                }
            } else {
                View g2 = mo5788g(0);
                this.f84211q.f84239e = this.f84202f.mo6263a(g2);
                int c2 = m6060c(g2);
                View a = m104569a(g2, (C32240b) this.f84200d.get(this.f84201e.f84264a[c2]));
                this.f84211q.f84242h = 1;
                int i7 = this.f84201e.f84264a[c2];
                if (i7 == -1) {
                    i7 = 0;
                }
                if (i7 > 0) {
                    C32240b bVar3 = (C32240b) this.f84200d.get(i7 - 1);
                    this.f84211q.f84238d = c2 - bVar3.f84252h;
                } else {
                    this.f84211q.f84238d = -1;
                }
                C32238b bVar4 = this.f84211q;
                if (i7 > 0) {
                    i3 = i7 - 1;
                } else {
                    i3 = 0;
                }
                bVar4.f84237c = i3;
                if (z) {
                    this.f84211q.f84239e = this.f84202f.mo6267b(a);
                    this.f84211q.f84240f = this.f84202f.mo6267b(a) - this.f84202f.mo6270d();
                    C32238b bVar5 = this.f84211q;
                    if (this.f84211q.f84240f >= 0) {
                        i5 = this.f84211q.f84240f;
                    }
                    bVar5.f84240f = i5;
                } else {
                    this.f84211q.f84239e = this.f84202f.mo6263a(a);
                    this.f84211q.f84240f = (-this.f84202f.mo6263a(a)) + this.f84202f.mo6268c();
                }
            }
            C32238b bVar6 = this.f84211q;
            bVar6.f84235a = i2 - bVar6.f84240f;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    private int m104578b(C32240b bVar, C32238b bVar2) {
        float f;
        float f2;
        float f3;
        View view;
        LayoutParams layoutParams;
        float f4;
        float f5;
        C32240b bVar3 = bVar;
        C32238b bVar4 = bVar2;
        if (f84187i || this.f84201e.f84265b != null) {
            int t = mo5801t();
            int v = mo5803v();
            int i = this.f4957I;
            int i2 = bVar4.f84239e;
            if (bVar4.f84243i == -1) {
                i2 -= bVar3.f84251g;
            }
            int i3 = i2;
            int i4 = bVar4.f84238d;
            int i5 = 1;
            switch (this.f84205k) {
                case 0:
                    f3 = (float) t;
                    f2 = (float) (i - v);
                    break;
                case 1:
                    f = 0.0f;
                    float f6 = (float) ((i - bVar3.f84249e) + v);
                    f2 = (float) (bVar3.f84249e - t);
                    f3 = f6;
                    break;
                case 2:
                    f3 = ((float) t) + (((float) (i - bVar3.f84249e)) / 2.0f);
                    f2 = ((float) (i - v)) - (((float) (i - bVar3.f84249e)) / 2.0f);
                    break;
                case 3:
                    f3 = (float) t;
                    if (bVar3.f84252h != 1) {
                        f4 = (float) (bVar3.f84252h - 1);
                    } else {
                        f4 = 1.0f;
                    }
                    f = ((float) (i - bVar3.f84249e)) / f4;
                    f2 = (float) (i - v);
                    break;
                case 4:
                    if (bVar3.f84252h != 0) {
                        f5 = ((float) (i - bVar3.f84249e)) / ((float) bVar3.f84252h);
                    } else {
                        f5 = 0.0f;
                    }
                    float f7 = f / 2.0f;
                    f3 = ((float) t) + f7;
                    f2 = ((float) (i - v)) - f7;
                    break;
                case 5:
                    if (bVar3.f84252h != 0) {
                        f = ((float) (i - bVar3.f84249e)) / ((float) (bVar3.f84252h + 1));
                    } else {
                        f = 0.0f;
                    }
                    f3 = ((float) t) + f;
                    f2 = ((float) (i - v)) - f;
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Invalid justifyContent is set: ");
                    sb.append(this.f84205k);
                    throw new IllegalStateException(sb.toString());
            }
            f = 0.0f;
            float f8 = f3 - ((float) this.f84212r.f84230d);
            float f9 = f2 - ((float) this.f84212r.f84230d);
            float max = Math.max(f, 0.0f);
            int i6 = 0;
            int i7 = bVar3.f84252h;
            int i8 = i4;
            while (i8 < i4 + i7) {
                View m = m104597m(i8);
                if (m != null) {
                    if (bVar4.f84243i == i5) {
                        mo5777b(m, f84188j);
                        mo5775b(m);
                    } else {
                        mo5777b(m, f84188j);
                        mo5776b(m, i6);
                        i6++;
                    }
                    int i9 = i6;
                    long j = this.f84201e.f84265b[i8];
                    int a = C32241c.m104701a(j);
                    int b = C32241c.m104713b(j);
                    LayoutParams layoutParams2 = (LayoutParams) m.getLayoutParams();
                    if (m104588c(m, a, b, layoutParams2)) {
                        m.measure(a, b);
                    }
                    float m2 = f8 + ((float) (layoutParams2.leftMargin + m6067m(m)));
                    float n = f9 - ((float) (layoutParams2.rightMargin + m6068n(m)));
                    int k = i3 + m6065k(m);
                    if (this.f84199c) {
                        C32241c cVar = this.f84201e;
                        int round = Math.round(n) - m.getMeasuredWidth();
                        layoutParams = layoutParams2;
                        int round2 = Math.round(n);
                        view = m;
                        cVar.mo83450a(m, bVar, round, k, round2, k + m.getMeasuredHeight());
                    } else {
                        layoutParams = layoutParams2;
                        view = m;
                        this.f84201e.mo83450a(view, bVar, Math.round(m2), k, Math.round(m2) + view.getMeasuredWidth(), k + view.getMeasuredHeight());
                    }
                    i6 = i9;
                    f8 = m2 + ((float) (view.getMeasuredWidth() + layoutParams.rightMargin + m6068n(view))) + max;
                    f9 = n - (((float) ((view.getMeasuredWidth() + layoutParams.leftMargin) + m6067m(view))) + max);
                }
                i8++;
                i5 = 1;
            }
            bVar4.f84237c += this.f84211q.f84243i;
            return bVar3.f84251g;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    private void m104586c(C1284o oVar, C32238b bVar) {
        if (bVar.f84240f >= 0) {
            if (f84187i || this.f84201e.f84264a != null) {
                int s = mo5800s();
                if (s != 0) {
                    int i = s - 1;
                    int i2 = this.f84201e.f84264a[m6060c(mo5788g(i))];
                    if (i2 != -1) {
                        C32240b bVar2 = (C32240b) this.f84200d.get(i2);
                        int i3 = s;
                        int i4 = i;
                        while (true) {
                            if (i4 < 0) {
                                break;
                            }
                            View g = mo5788g(i4);
                            if (!m104590d(g, bVar.f84240f)) {
                                break;
                            }
                            if (bVar2.f84259o == m6060c(g)) {
                                if (i2 <= 0) {
                                    break;
                                }
                                i2 += bVar.f84243i;
                                bVar2 = (C32240b) this.f84200d.get(i2);
                                i3 = i4;
                            }
                            i4--;
                        }
                        i4 = i3;
                        m104571a(oVar, i4, i);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    private void m104580b(C1284o oVar, C32238b bVar) {
        if (bVar.f84240f >= 0) {
            if (f84187i || this.f84201e.f84264a != null) {
                int s = mo5800s();
                if (s != 0) {
                    int i = this.f84201e.f84264a[m6060c(mo5788g(0))];
                    if (i != -1) {
                        C32240b bVar2 = (C32240b) this.f84200d.get(i);
                        int i2 = i;
                        int i3 = 0;
                        int i4 = -1;
                        while (true) {
                            if (i3 >= s) {
                                break;
                            }
                            View g = mo5788g(i3);
                            if (!m104587c(g, bVar.f84240f)) {
                                break;
                            }
                            if (bVar2.f84260p == m6060c(g)) {
                                if (i2 >= this.f84200d.size() - 1) {
                                    break;
                                }
                                i2 += bVar.f84243i;
                                bVar2 = (C32240b) this.f84200d.get(i2);
                                i4 = i3;
                            }
                            i3++;
                        }
                        i3 = i4;
                        m104571a(oVar, 0, i3);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    private int m104584c(C32240b bVar, C32238b bVar2) {
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        View view;
        float f4;
        float f5;
        C32240b bVar3 = bVar;
        C32238b bVar4 = bVar2;
        if (f84187i || this.f84201e.f84265b != null) {
            int u = mo5802u();
            int w = mo5804w();
            int i3 = this.f4958J;
            int i4 = bVar4.f84239e;
            int i5 = bVar4.f84239e;
            if (bVar4.f84243i == -1) {
                i4 -= bVar3.f84251g;
                i5 += bVar3.f84251g;
            }
            int i6 = i4;
            int i7 = i5;
            int i8 = bVar4.f84238d;
            switch (this.f84205k) {
                case 0:
                    f3 = (float) u;
                    f2 = (float) (i3 - w);
                    break;
                case 1:
                    f = 0.0f;
                    float f6 = (float) ((i3 - bVar3.f84249e) + w);
                    f2 = (float) (bVar3.f84249e - u);
                    f3 = f6;
                    break;
                case 2:
                    f3 = ((float) u) + (((float) (i3 - bVar3.f84249e)) / 2.0f);
                    f2 = ((float) (i3 - w)) - (((float) (i3 - bVar3.f84249e)) / 2.0f);
                    break;
                case 3:
                    f3 = (float) u;
                    if (bVar3.f84252h != 1) {
                        f4 = (float) (bVar3.f84252h - 1);
                    } else {
                        f4 = 1.0f;
                    }
                    f = ((float) (i3 - bVar3.f84249e)) / f4;
                    f2 = (float) (i3 - w);
                    break;
                case 4:
                    if (bVar3.f84252h != 0) {
                        f5 = ((float) (i3 - bVar3.f84249e)) / ((float) bVar3.f84252h);
                    } else {
                        f5 = 0.0f;
                    }
                    float f7 = f / 2.0f;
                    f3 = ((float) u) + f7;
                    f2 = ((float) (i3 - w)) - f7;
                    break;
                case 5:
                    if (bVar3.f84252h != 0) {
                        f = ((float) (i3 - bVar3.f84249e)) / ((float) (bVar3.f84252h + 1));
                    } else {
                        f = 0.0f;
                    }
                    f3 = ((float) u) + f;
                    f2 = ((float) (i3 - w)) - f;
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Invalid justifyContent is set: ");
                    sb.append(this.f84205k);
                    throw new IllegalStateException(sb.toString());
            }
            f = 0.0f;
            float f8 = f3 - ((float) this.f84212r.f84230d);
            float f9 = f2 - ((float) this.f84212r.f84230d);
            float max = Math.max(f, 0.0f);
            int i9 = 0;
            int i10 = bVar3.f84252h;
            int i11 = i8;
            while (i11 < i8 + i10) {
                View m = m104597m(i11);
                if (m != null) {
                    long j = this.f84201e.f84265b[i11];
                    int a = C32241c.m104701a(j);
                    int b = C32241c.m104713b(j);
                    LayoutParams layoutParams = (LayoutParams) m.getLayoutParams();
                    if (m104588c(m, a, b, layoutParams)) {
                        m.measure(a, b);
                    }
                    float k = f8 + ((float) (layoutParams.topMargin + m6065k(m)));
                    float l = f9 - ((float) (layoutParams.rightMargin + m6066l(m)));
                    if (bVar4.f84243i == 1) {
                        mo5777b(m, f84188j);
                        mo5775b(m);
                    } else {
                        mo5777b(m, f84188j);
                        mo5776b(m, i9);
                        i9++;
                    }
                    int i12 = i9;
                    int m2 = i6 + m6067m(m);
                    int n = i7 - m6068n(m);
                    if (!this.f84199c) {
                        view = m;
                        i2 = i11;
                        i = i10;
                        if (this.f84208n) {
                            this.f84201e.mo83451a(view, bVar, this.f84199c, m2, Math.round(l) - view.getMeasuredHeight(), m2 + view.getMeasuredWidth(), Math.round(l));
                        } else {
                            this.f84201e.mo83451a(view, bVar, this.f84199c, m2, Math.round(k), m2 + view.getMeasuredWidth(), Math.round(k) + view.getMeasuredHeight());
                        }
                    } else if (this.f84208n) {
                        int measuredWidth = n - m.getMeasuredWidth();
                        view = m;
                        int round = Math.round(l) - m.getMeasuredHeight();
                        i2 = i11;
                        i = i10;
                        this.f84201e.mo83451a(m, bVar, this.f84199c, measuredWidth, round, n, Math.round(l));
                    } else {
                        view = m;
                        i2 = i11;
                        i = i10;
                        this.f84201e.mo83451a(view, bVar, this.f84199c, n - view.getMeasuredWidth(), Math.round(k), n, Math.round(k) + view.getMeasuredHeight());
                    }
                    f8 = k + ((float) (view.getMeasuredHeight() + layoutParams.topMargin + m6066l(view))) + max;
                    f9 = l - (((float) ((view.getMeasuredHeight() + layoutParams.bottomMargin) + m6065k(view))) + max);
                    i9 = i12;
                } else {
                    i2 = i11;
                    i = i10;
                }
                i11 = i2 + 1;
                i10 = i;
            }
            bVar4.f84237c += this.f84211q.f84243i;
            return bVar3.f84251g;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private void m104572a(C1284o oVar, C32238b bVar) {
        if (bVar.f84244j) {
            if (bVar.f84243i == -1) {
                m104586c(oVar, bVar);
            } else {
                m104580b(oVar, bVar);
            }
        }
    }

    /* renamed from: a_ */
    public final int mo83410a_(int i, int i2, int i3) {
        return m6042a(this.f4957I, this.f4955G, i2, i3, mo5438e());
    }

    /* renamed from: b */
    public final int mo83412b(int i, int i2, int i3) {
        return m6042a(this.f4958J, this.f4956H, i2, i3, mo5441f());
    }

    /* renamed from: c */
    public final void mo5782c(RecyclerView recyclerView, int i, int i2) {
        super.mo5782c(recyclerView, i, i2);
        m104598n(i);
    }

    /* renamed from: a */
    private View m104568a(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View g = mo5788g(i);
            if (m104576a(g, false)) {
                return g;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m104589d(int i, int i2, int i3) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode == 1073741824 && size == i) {
                return true;
            }
            return false;
        } else if (size >= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final int mo5381b(int i, C1284o oVar, C1290s sVar) {
        if (mo83417i() || (this.f84198b == 0 && !mo83417i())) {
            int c = m104583c(i, oVar, sVar);
            this.f84192N.clear();
            return c;
        }
        int r = m104605r(i);
        this.f84212r.f84230d += r;
        this.f84203g.mo6265a(-r);
        return r;
    }

    private FlexboxLayoutManager(Context context, int i, int i2) {
        this.f84207m = -1;
        this.f84200d = new ArrayList();
        this.f84201e = new C32241c(this);
        this.f84212r = new C32237a();
        this.f84214t = -1;
        this.f84189K = Integer.MIN_VALUE;
        this.f84190L = Integer.MIN_VALUE;
        this.f84191M = Integer.MIN_VALUE;
        this.f84192N = new SparseArray<>();
        this.f84195Q = -1;
        this.f84196R = new C32242a();
        m104591f(0);
        m104595k(1);
        m104596l(4);
        this.f4950B = true;
        this.f84193O = context;
    }

    /* renamed from: c */
    private int m104583c(int i, C1284o oVar, C1290s sVar) {
        boolean z;
        if (mo5800s() == 0 || i == 0) {
            return 0;
        }
        m104561K();
        int i2 = 1;
        this.f84211q.f84244j = true;
        if (mo83417i() || !this.f84199c) {
            z = false;
        } else {
            z = true;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m104570a(i2, abs);
        int a = this.f84211q.f84240f + m104566a(oVar, sVar, this.f84211q);
        if (a < 0) {
            return 0;
        }
        if (z) {
            if (abs > a) {
                i = (-i2) * a;
            }
        } else if (abs > a) {
            i = i2 * a;
        }
        this.f84202f.mo6265a(-i);
        this.f84211q.f84241g = i;
        return i;
    }

    /* renamed from: a */
    private int m104566a(C1284o oVar, C1290s sVar, C32238b bVar) {
        if (bVar.f84240f != Integer.MIN_VALUE) {
            if (bVar.f84235a < 0) {
                bVar.f84240f += bVar.f84235a;
            }
            m104572a(oVar, bVar);
        }
        int i = bVar.f84235a;
        int i2 = bVar.f84235a;
        int i3 = 0;
        boolean i4 = mo83417i();
        while (true) {
            if ((i2 > 0 || this.f84211q.f84236b) && bVar.mo83437a(sVar, this.f84200d)) {
                C32240b bVar2 = (C32240b) this.f84200d.get(bVar.f84237c);
                bVar.f84238d = bVar2.f84259o;
                i3 += m104567a(bVar2, bVar);
                if (i4 || !this.f84199c) {
                    bVar.f84239e += bVar2.f84251g * bVar.f84243i;
                } else {
                    bVar.f84239e -= bVar2.f84251g * bVar.f84243i;
                }
                i2 -= bVar2.f84251g;
            }
        }
        bVar.f84235a -= i3;
        if (bVar.f84240f != Integer.MIN_VALUE) {
            bVar.f84240f += i3;
            if (bVar.f84235a < 0) {
                bVar.f84240f += bVar.f84235a;
            }
            m104572a(oVar, bVar);
        }
        return i - bVar.f84235a;
    }

    /* renamed from: c */
    private View m104585c(int i, int i2, int i3) {
        int i4;
        m104561K();
        m104562L();
        int c = this.f84202f.mo6268c();
        int d = this.f84202f.mo6270d();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g = mo5788g(i);
            int c2 = m6060c(g);
            if (c2 >= 0 && c2 < i3) {
                if (((android.support.p029v7.widget.RecyclerView.LayoutParams) g.getLayoutParams()).bl_()) {
                    if (view2 == null) {
                        view2 = g;
                    }
                } else if (this.f84202f.mo6263a(g) >= c && this.f84202f.mo6267b(g) <= d) {
                    return g;
                } else {
                    if (view == null) {
                        view = g;
                    }
                }
            }
            i += i4;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* renamed from: a */
    private void m104571a(C1284o oVar, int i, int i2) {
        while (i2 >= i) {
            mo5750a(i2, oVar);
            i2--;
        }
    }

    /* renamed from: b */
    private void m104581b(C32237a aVar, boolean z, boolean z2) {
        if (z2) {
            m104560J();
        } else {
            this.f84211q.f84236b = false;
        }
        if (mo83417i() || !this.f84199c) {
            this.f84211q.f84235a = aVar.f84229c - this.f84202f.mo6268c();
        } else {
            this.f84211q.f84235a = (this.f84194P.getWidth() - aVar.f84229c) - this.f84202f.mo6268c();
        }
        this.f84211q.f84238d = aVar.f84227a;
        this.f84211q.f84242h = 1;
        this.f84211q.f84243i = -1;
        this.f84211q.f84239e = aVar.f84229c;
        this.f84211q.f84240f = Integer.MIN_VALUE;
        this.f84211q.f84237c = aVar.f84228b;
        if (z && aVar.f84228b > 0 && this.f84200d.size() > aVar.f84228b) {
            C32240b bVar = (C32240b) this.f84200d.get(aVar.f84228b);
            this.f84211q.f84237c--;
            this.f84211q.f84238d -= bVar.f84252h;
        }
    }

    /* renamed from: a */
    private int m104565a(int i, C1284o oVar, C1290s sVar, boolean z) {
        int i2;
        if (mo83417i() || !this.f84199c) {
            int c = i - this.f84202f.mo6268c();
            if (c <= 0) {
                return 0;
            }
            i2 = -m104583c(c, oVar, sVar);
        } else {
            int d = this.f84202f.mo6270d() - i;
            if (d <= 0) {
                return 0;
            }
            i2 = m104583c(-d, oVar, sVar);
        }
        int i3 = i + i2;
        if (z) {
            int c2 = i3 - this.f84202f.mo6268c();
            if (c2 > 0) {
                this.f84202f.mo6265a(-c2);
                return i2 - c2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private int m104577b(int i, C1284o oVar, C1290s sVar, boolean z) {
        boolean z2;
        int i2;
        if (mo83417i() || !this.f84199c) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int c = i - this.f84202f.mo6268c();
            if (c <= 0) {
                return 0;
            }
            i2 = m104583c(c, oVar, sVar);
        } else {
            int d = this.f84202f.mo6270d() - i;
            if (d <= 0) {
                return 0;
            }
            i2 = -m104583c(-d, oVar, sVar);
        }
        int i3 = i + i2;
        if (z) {
            int d2 = this.f84202f.mo6270d() - i3;
            if (d2 > 0) {
                this.f84202f.mo6265a(d2);
                return d2 + i2;
            }
        }
        return i2;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f84207m = -1;
        this.f84200d = new ArrayList();
        this.f84201e = new C32241c(this);
        this.f84212r = new C32237a();
        this.f84214t = -1;
        this.f84189K = Integer.MIN_VALUE;
        this.f84190L = Integer.MIN_VALUE;
        this.f84191M = Integer.MIN_VALUE;
        this.f84192N = new SparseArray<>();
        this.f84195Q = -1;
        this.f84196R = new C32242a();
        C1277b a = m6043a(context, attributeSet, i, i2);
        switch (a.f4969a) {
            case 0:
                if (!a.f4971c) {
                    m104591f(0);
                    break;
                } else {
                    m104591f(1);
                    break;
                }
            case 1:
                if (!a.f4971c) {
                    m104591f(2);
                    break;
                } else {
                    m104591f(3);
                    break;
                }
        }
        m104595k(1);
        m104596l(4);
        this.f4950B = true;
        this.f84193O = context;
    }

    /* renamed from: c */
    private boolean m104588c(View view, int i, int i2, android.support.p029v7.widget.RecyclerView.LayoutParams layoutParams) {
        if (view.isLayoutRequested() || !this.f4951C || !m104589d(view.getWidth(), i, layoutParams.width) || !m104589d(view.getHeight(), i2, layoutParams.height)) {
            return true;
        }
        return false;
    }
}
