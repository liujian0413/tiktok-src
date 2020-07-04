package android.support.p029v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.view.p028a.C0945c.C0948c;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1273i.C1276a;
import android.support.p029v7.widget.RecyclerView.C1273i.C1277b;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1287r.C1289b;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: android.support.v7.widget.StaggeredGridLayoutManager */
public class StaggeredGridLayoutManager extends C1273i implements C1289b {

    /* renamed from: K */
    private boolean f5119K = false;

    /* renamed from: L */
    private boolean f5120L = true;

    /* renamed from: M */
    private int[] f5121M;

    /* renamed from: N */
    private final Runnable f5122N = new Runnable() {
        public final void run() {
            StaggeredGridLayoutManager.this.mo6012g();
        }
    };

    /* renamed from: a */
    public int f5123a = -1;

    /* renamed from: b */
    C1318b[] f5124b;

    /* renamed from: c */
    C1343ah f5125c;

    /* renamed from: d */
    C1343ah f5126d;

    /* renamed from: e */
    public int f5127e;

    /* renamed from: f */
    public boolean f5128f;

    /* renamed from: g */
    boolean f5129g;

    /* renamed from: h */
    int f5130h = -1;

    /* renamed from: i */
    int f5131i = Integer.MIN_VALUE;

    /* renamed from: j */
    LazySpanLookup f5132j = new LazySpanLookup();

    /* renamed from: k */
    public int f5133k = 2;

    /* renamed from: l */
    private int f5134l;

    /* renamed from: m */
    private final C1338ad f5135m;

    /* renamed from: n */
    private BitSet f5136n;

    /* renamed from: o */
    private boolean f5137o;

    /* renamed from: p */
    private boolean f5138p;

    /* renamed from: q */
    private SavedState f5139q;

    /* renamed from: r */
    private int f5140r;

    /* renamed from: s */
    private final Rect f5141s = new Rect();

    /* renamed from: t */
    private final C1317a f5142t = new C1317a();

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams */
    public static class LayoutParams extends android.support.p029v7.widget.RecyclerView.LayoutParams {

        /* renamed from: a */
        C1318b f5144a;

        /* renamed from: b */
        public boolean f5145b;

        /* renamed from: e */
        public final int mo6015e() {
            if (this.f5144a == null) {
                return -1;
            }
            return this.f5144a.f5173e;
        }

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

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup */
    static class LazySpanLookup {

        /* renamed from: a */
        int[] f5146a;

        /* renamed from: b */
        List<FullSpanItem> f5147b;

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem */
        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new Creator<FullSpanItem>() {
                /* renamed from: a */
                private static FullSpanItem[] m6486a(int i) {
                    return new FullSpanItem[i];
                }

                /* renamed from: a */
                private static FullSpanItem m6485a(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m6485a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m6486a(i);
                }
            };

            /* renamed from: a */
            int f5148a;

            /* renamed from: b */
            int f5149b;

            /* renamed from: c */
            int[] f5150c;

            /* renamed from: d */
            boolean f5151d;

            FullSpanItem() {
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("FullSpanItem{mPosition=");
                sb.append(this.f5148a);
                sb.append(", mGapDir=");
                sb.append(this.f5149b);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.f5151d);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.f5150c));
                sb.append('}');
                return sb.toString();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final int mo6026a(int i) {
                if (this.f5150c == null) {
                    return 0;
                }
                return this.f5150c[i];
            }

            FullSpanItem(Parcel parcel) {
                this.f5148a = parcel.readInt();
                this.f5149b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f5151d = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f5150c = new int[readInt];
                    parcel.readIntArray(this.f5150c);
                }
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f5148a);
                parcel.writeInt(this.f5149b);
                parcel.writeInt(this.f5151d ? 1 : 0);
                if (this.f5150c == null || this.f5150c.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(this.f5150c.length);
                parcel.writeIntArray(this.f5150c);
            }
        }

        LazySpanLookup() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6018a() {
            if (this.f5146a != null) {
                Arrays.fill(this.f5146a, -1);
            }
            this.f5147b = null;
        }

        /* renamed from: e */
        private int m6471e(int i) {
            int length = this.f5146a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo6024c(int i) {
            if (this.f5146a == null || i >= this.f5146a.length) {
                return -1;
            }
            return this.f5146a[i];
        }

        /* renamed from: f */
        private void m6472f(int i) {
            if (this.f5146a == null) {
                this.f5146a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f5146a, -1);
                return;
            }
            if (i >= this.f5146a.length) {
                int[] iArr = this.f5146a;
                this.f5146a = new int[m6471e(i)];
                System.arraycopy(iArr, 0, this.f5146a, 0, iArr.length);
                Arrays.fill(this.f5146a, iArr.length, this.f5146a.length, -1);
            }
        }

        /* renamed from: g */
        private int m6473g(int i) {
            if (this.f5147b == null) {
                return -1;
            }
            FullSpanItem d = mo6025d(i);
            if (d != null) {
                this.f5147b.remove(d);
            }
            int size = this.f5147b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((FullSpanItem) this.f5147b.get(i2)).f5148a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f5147b.get(i2);
            this.f5147b.remove(i2);
            return fullSpanItem.f5148a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo6016a(int i) {
            if (this.f5147b != null) {
                for (int size = this.f5147b.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f5147b.get(size)).f5148a >= i) {
                        this.f5147b.remove(size);
                    }
                }
            }
            return mo6022b(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo6022b(int i) {
            if (this.f5146a == null || i >= this.f5146a.length) {
                return -1;
            }
            int g = m6473g(i);
            if (g == -1) {
                int[] iArr = this.f5146a;
                Arrays.fill(iArr, i, iArr.length, -1);
                return this.f5146a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f5146a, i, i2, -1);
            return i2;
        }

        /* renamed from: d */
        public final FullSpanItem mo6025d(int i) {
            if (this.f5147b == null) {
                return null;
            }
            for (int size = this.f5147b.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f5147b.get(size);
                if (fullSpanItem.f5148a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: a */
        public final void mo6021a(FullSpanItem fullSpanItem) {
            if (this.f5147b == null) {
                this.f5147b = new ArrayList();
            }
            int size = this.f5147b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f5147b.get(i);
                if (fullSpanItem2.f5148a == fullSpanItem.f5148a) {
                    this.f5147b.remove(i);
                }
                if (fullSpanItem2.f5148a >= fullSpanItem.f5148a) {
                    this.f5147b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f5147b.add(fullSpanItem);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6020a(int i, C1318b bVar) {
            m6472f(i);
            this.f5146a[i] = bVar.f5173e;
        }

        /* renamed from: c */
        private void m6469c(int i, int i2) {
            if (this.f5147b != null) {
                int i3 = i + i2;
                for (int size = this.f5147b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f5147b.get(size);
                    if (fullSpanItem.f5148a >= i) {
                        if (fullSpanItem.f5148a < i3) {
                            this.f5147b.remove(size);
                        } else {
                            fullSpanItem.f5148a -= i2;
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private void m6470d(int i, int i2) {
            if (this.f5147b != null) {
                for (int size = this.f5147b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f5147b.get(size);
                    if (fullSpanItem.f5148a >= i) {
                        fullSpanItem.f5148a += i2;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6023b(int i, int i2) {
            if (this.f5146a != null && i < this.f5146a.length) {
                int i3 = i + i2;
                m6472f(i3);
                int[] iArr = this.f5146a;
                System.arraycopy(iArr, i, iArr, i3, (this.f5146a.length - i) - i2);
                Arrays.fill(this.f5146a, i, i3, -1);
                m6470d(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6019a(int i, int i2) {
            if (this.f5146a != null && i < this.f5146a.length) {
                int i3 = i + i2;
                m6472f(i3);
                int[] iArr = this.f5146a;
                int[] iArr2 = this.f5146a;
                System.arraycopy(iArr, i3, iArr2, i, (iArr2.length - i) - i2);
                Arrays.fill(this.f5146a, this.f5146a.length - i2, this.f5146a.length, -1);
                m6469c(i, i2);
            }
        }

        /* renamed from: a */
        public final FullSpanItem mo6017a(int i, int i2, int i3, boolean z) {
            if (this.f5147b == null) {
                return null;
            }
            int size = this.f5147b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f5147b.get(i4);
                if (fullSpanItem.f5148a >= i2) {
                    return null;
                }
                if (fullSpanItem.f5148a >= i && (i3 == 0 || fullSpanItem.f5149b == i3 || fullSpanItem.f5151d)) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m6490a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m6489a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m6489a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m6490a(i);
            }
        };

        /* renamed from: a */
        int f5152a;

        /* renamed from: b */
        int f5153b;

        /* renamed from: c */
        int f5154c;

        /* renamed from: d */
        int[] f5155d;

        /* renamed from: e */
        int f5156e;

        /* renamed from: f */
        int[] f5157f;

        /* renamed from: g */
        List<FullSpanItem> f5158g;

        /* renamed from: h */
        boolean f5159h;

        /* renamed from: i */
        boolean f5160i;

        /* renamed from: j */
        boolean f5161j;

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6032a() {
            this.f5155d = null;
            this.f5154c = 0;
            this.f5156e = 0;
            this.f5157f = null;
            this.f5158g = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6033b() {
            this.f5155d = null;
            this.f5154c = 0;
            this.f5152a = -1;
            this.f5153b = -1;
        }

        public SavedState(SavedState savedState) {
            this.f5154c = savedState.f5154c;
            this.f5152a = savedState.f5152a;
            this.f5153b = savedState.f5153b;
            this.f5155d = savedState.f5155d;
            this.f5156e = savedState.f5156e;
            this.f5157f = savedState.f5157f;
            this.f5159h = savedState.f5159h;
            this.f5160i = savedState.f5160i;
            this.f5161j = savedState.f5161j;
            this.f5158g = savedState.f5158g;
        }

        SavedState(Parcel parcel) {
            boolean z;
            boolean z2;
            this.f5152a = parcel.readInt();
            this.f5153b = parcel.readInt();
            this.f5154c = parcel.readInt();
            if (this.f5154c > 0) {
                this.f5155d = new int[this.f5154c];
                parcel.readIntArray(this.f5155d);
            }
            this.f5156e = parcel.readInt();
            if (this.f5156e > 0) {
                this.f5157f = new int[this.f5156e];
                parcel.readIntArray(this.f5157f);
            }
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f5159h = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f5160i = z2;
            if (parcel.readInt() == 1) {
                z3 = true;
            }
            this.f5161j = z3;
            this.f5158g = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5152a);
            parcel.writeInt(this.f5153b);
            parcel.writeInt(this.f5154c);
            if (this.f5154c > 0) {
                parcel.writeIntArray(this.f5155d);
            }
            parcel.writeInt(this.f5156e);
            if (this.f5156e > 0) {
                parcel.writeIntArray(this.f5157f);
            }
            parcel.writeInt(this.f5159h ? 1 : 0);
            parcel.writeInt(this.f5160i ? 1 : 0);
            parcel.writeInt(this.f5161j ? 1 : 0);
            parcel.writeList(this.f5158g);
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a */
    class C1317a {

        /* renamed from: a */
        int f5162a;

        /* renamed from: b */
        int f5163b;

        /* renamed from: c */
        boolean f5164c;

        /* renamed from: d */
        boolean f5165d;

        /* renamed from: e */
        boolean f5166e;

        /* renamed from: f */
        int[] f5167f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6038a() {
            this.f5162a = -1;
            this.f5163b = Integer.MIN_VALUE;
            this.f5164c = false;
            this.f5165d = false;
            this.f5166e = false;
            if (this.f5167f != null) {
                Arrays.fill(this.f5167f, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6041b() {
            int i;
            if (this.f5164c) {
                i = StaggeredGridLayoutManager.this.f5125c.mo6270d();
            } else {
                i = StaggeredGridLayoutManager.this.f5125c.mo6268c();
            }
            this.f5163b = i;
        }

        C1317a() {
            mo6038a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6039a(int i) {
            if (this.f5164c) {
                this.f5163b = StaggeredGridLayoutManager.this.f5125c.mo6270d() - i;
            } else {
                this.f5163b = StaggeredGridLayoutManager.this.f5125c.mo6268c() + i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6040a(C1318b[] bVarArr) {
            int length = bVarArr.length;
            if (this.f5167f == null || this.f5167f.length < length) {
                this.f5167f = new int[StaggeredGridLayoutManager.this.f5124b.length];
            }
            for (int i = 0; i < length; i++) {
                this.f5167f[i] = bVarArr[i].mo6043a(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b */
    class C1318b {

        /* renamed from: a */
        ArrayList<View> f5169a = new ArrayList<>();

        /* renamed from: b */
        int f5170b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f5171c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f5172d = 0;

        /* renamed from: e */
        final int f5173e;

        /* renamed from: m */
        private void m6501m() {
            this.f5170b = Integer.MIN_VALUE;
            this.f5171c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo6050c() {
            this.f5169a.clear();
            m6501m();
            this.f5172d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo6042a() {
            if (this.f5170b != Integer.MIN_VALUE) {
                return this.f5170b;
            }
            m6499k();
            return this.f5170b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo6047b() {
            if (this.f5171c != Integer.MIN_VALUE) {
                return this.f5171c;
            }
            m6500l();
            return this.f5171c;
        }

        /* renamed from: f */
        public final int mo6055f() {
            if (StaggeredGridLayoutManager.this.f5128f) {
                return m6495a(this.f5169a.size() - 1, -1, false);
            }
            return m6495a(0, this.f5169a.size(), false);
        }

        /* renamed from: g */
        public final int mo6056g() {
            if (StaggeredGridLayoutManager.this.f5128f) {
                return m6497b(this.f5169a.size() - 1, -1, true);
            }
            return m6497b(0, this.f5169a.size(), true);
        }

        /* renamed from: h */
        public final int mo6057h() {
            if (StaggeredGridLayoutManager.this.f5128f) {
                return m6495a(this.f5169a.size() - 1, -1, true);
            }
            return m6495a(0, this.f5169a.size(), true);
        }

        /* renamed from: i */
        public final int mo6058i() {
            if (StaggeredGridLayoutManager.this.f5128f) {
                return m6495a(0, this.f5169a.size(), false);
            }
            return m6495a(this.f5169a.size() - 1, -1, false);
        }

        /* renamed from: j */
        public final int mo6059j() {
            if (StaggeredGridLayoutManager.this.f5128f) {
                return m6497b(0, this.f5169a.size(), true);
            }
            return m6497b(this.f5169a.size() - 1, -1, true);
        }

        /* renamed from: k */
        private void m6499k() {
            View view = (View) this.f5169a.get(0);
            LayoutParams c = m6498c(view);
            this.f5170b = StaggeredGridLayoutManager.this.f5125c.mo6263a(view);
            if (c.f5145b) {
                FullSpanItem d = StaggeredGridLayoutManager.this.f5132j.mo6025d(c.bn_());
                if (d != null && d.f5149b == -1) {
                    this.f5170b -= d.mo6026a(this.f5173e);
                }
            }
        }

        /* renamed from: l */
        private void m6500l() {
            View view = (View) this.f5169a.get(this.f5169a.size() - 1);
            LayoutParams c = m6498c(view);
            this.f5171c = StaggeredGridLayoutManager.this.f5125c.mo6267b(view);
            if (c.f5145b) {
                FullSpanItem d = StaggeredGridLayoutManager.this.f5132j.mo6025d(c.bn_());
                if (d != null && d.f5149b == 1) {
                    this.f5171c += d.mo6026a(this.f5173e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo6052d() {
            int size = this.f5169a.size();
            View view = (View) this.f5169a.remove(size - 1);
            LayoutParams c = m6498c(view);
            c.f5144a = null;
            if (c.bl_() || c.bm_()) {
                this.f5172d -= StaggeredGridLayoutManager.this.f5125c.mo6273e(view);
            }
            if (size == 1) {
                this.f5170b = Integer.MIN_VALUE;
            }
            this.f5171c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo6054e() {
            View view = (View) this.f5169a.remove(0);
            LayoutParams c = m6498c(view);
            c.f5144a = null;
            if (this.f5169a.size() == 0) {
                this.f5171c = Integer.MIN_VALUE;
            }
            if (c.bl_() || c.bm_()) {
                this.f5172d -= StaggeredGridLayoutManager.this.f5125c.mo6273e(view);
            }
            this.f5170b = Integer.MIN_VALUE;
        }

        /* renamed from: c */
        static LayoutParams m6498c(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo6051c(int i) {
            this.f5170b = i;
            this.f5171c = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo6053d(int i) {
            if (this.f5170b != Integer.MIN_VALUE) {
                this.f5170b += i;
            }
            if (this.f5171c != Integer.MIN_VALUE) {
                this.f5171c += i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo6043a(int i) {
            if (this.f5170b != Integer.MIN_VALUE) {
                return this.f5170b;
            }
            if (this.f5169a.size() == 0) {
                return i;
            }
            m6499k();
            return this.f5170b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo6048b(int i) {
            if (this.f5171c != Integer.MIN_VALUE) {
                return this.f5171c;
            }
            if (this.f5169a.size() == 0) {
                return i;
            }
            m6500l();
            return this.f5171c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6049b(View view) {
            LayoutParams c = m6498c(view);
            c.f5144a = this;
            this.f5169a.add(view);
            this.f5171c = Integer.MIN_VALUE;
            if (this.f5169a.size() == 1) {
                this.f5170b = Integer.MIN_VALUE;
            }
            if (c.bl_() || c.bm_()) {
                this.f5172d += StaggeredGridLayoutManager.this.f5125c.mo6273e(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6045a(View view) {
            LayoutParams c = m6498c(view);
            c.f5144a = this;
            this.f5169a.add(0, view);
            this.f5170b = Integer.MIN_VALUE;
            if (this.f5169a.size() == 1) {
                this.f5171c = Integer.MIN_VALUE;
            }
            if (c.bl_() || c.bm_()) {
                this.f5172d += StaggeredGridLayoutManager.this.f5125c.mo6273e(view);
            }
        }

        C1318b(int i) {
            this.f5173e = i;
        }

        /* renamed from: a */
        public final View mo6044a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f5169a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f5169a.get(size);
                    if ((StaggeredGridLayoutManager.this.f5128f && StaggeredGridLayoutManager.m6060c(view2) >= i) || ((!StaggeredGridLayoutManager.this.f5128f && StaggeredGridLayoutManager.m6060c(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f5169a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f5169a.get(i3);
                    if ((StaggeredGridLayoutManager.this.f5128f && StaggeredGridLayoutManager.m6060c(view3) <= i) || ((!StaggeredGridLayoutManager.this.f5128f && StaggeredGridLayoutManager.m6060c(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6046a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo6048b(Integer.MIN_VALUE);
            } else {
                i2 = mo6043a(Integer.MIN_VALUE);
            }
            mo6050c();
            if (i2 != Integer.MIN_VALUE) {
                if ((!z || i2 >= StaggeredGridLayoutManager.this.f5125c.mo6270d()) && (z || i2 <= StaggeredGridLayoutManager.this.f5125c.mo6268c())) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f5171c = i2;
                    this.f5170b = i2;
                }
            }
        }

        /* renamed from: a */
        private int m6495a(int i, int i2, boolean z) {
            return m6496a(i, i2, z, true, false);
        }

        /* renamed from: b */
        private int m6497b(int i, int i2, boolean z) {
            return m6496a(i, i2, false, false, true);
        }

        /* renamed from: a */
        private int m6496a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int c = StaggeredGridLayoutManager.this.f5125c.mo6268c();
            int d = StaggeredGridLayoutManager.this.f5125c.mo6270d();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = (View) this.f5169a.get(i);
                int a = StaggeredGridLayoutManager.this.f5125c.mo6263a(view);
                int b = StaggeredGridLayoutManager.this.f5125c.mo6267b(view);
                boolean z5 = false;
                if (!z3 ? a >= d : a > d) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 ? b > c : b >= c) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.m6060c(view);
                        }
                        if (a < c || b > d) {
                            return StaggeredGridLayoutManager.m6060c(view);
                        }
                    } else if (a >= c && b <= d) {
                        return StaggeredGridLayoutManager.m6060c(view);
                    }
                }
                i += i3;
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo5421a(RecyclerView recyclerView, C1284o oVar) {
        super.mo5421a(recyclerView, oVar);
        mo5768a(this.f5122N);
        for (int i = 0; i < this.f5123a; i++) {
            this.f5124b[i].mo6050c();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: a */
    private boolean m6386a(C1318b bVar) {
        return this.f5129g ? bVar.mo6047b() < this.f5125c.mo6270d() && !C1318b.m6498c((View) bVar.f5169a.get(bVar.f5169a.size() - 1)).f5145b : bVar.mo6042a() > this.f5125c.mo6268c() && !C1318b.m6498c((View) bVar.f5169a.get(0)).f5145b;
        return false;
    }

    /* renamed from: a */
    public final void mo5368a(int i) {
        mo5425a((String) null);
        if (i != this.f5123a) {
            mo6013h();
            this.f5123a = i;
            this.f5136n = new BitSet(this.f5123a);
            this.f5124b = new C1318b[this.f5123a];
            for (int i2 = 0; i2 < this.f5123a; i2++) {
                this.f5124b[i2] = new C1318b(i2);
            }
            mo5795n();
        }
    }

    /* renamed from: b */
    public final void mo5427b(int i) {
        mo5425a((String) null);
        if (this.f5133k != 0) {
            this.f5133k = 0;
            mo5795n();
        }
    }

    /* renamed from: a */
    public final void mo5425a(String str) {
        if (this.f5139q == null) {
            super.mo5425a(str);
        }
    }

    /* renamed from: a */
    public final void mo5369a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int t = mo5801t() + mo5803v();
        int u = mo5802u() + mo5804w();
        if (this.f5127e == 1) {
            i4 = m6041a(i2, rect.height() + u, mo5746C());
            i3 = m6041a(i, (this.f5134l * this.f5123a) + t, mo5745B());
        } else {
            i3 = m6041a(i, rect.width() + t, mo5745B());
            i4 = m6041a(i2, (this.f5134l * this.f5123a) + u, mo5746C());
        }
        mo5784d(i3, i4);
    }

    /* renamed from: a */
    public final void mo5373a(C1290s sVar) {
        super.mo5373a(sVar);
        this.f5130h = -1;
        this.f5131i = Integer.MIN_VALUE;
        this.f5139q = null;
        this.f5142t.mo6038a();
    }

    /* renamed from: a */
    private void m6380a(C1317a aVar) {
        if (this.f5139q.f5154c > 0) {
            if (this.f5139q.f5154c == this.f5123a) {
                for (int i = 0; i < this.f5123a; i++) {
                    this.f5124b[i].mo6050c();
                    int i2 = this.f5139q.f5155d[i];
                    if (i2 != Integer.MIN_VALUE) {
                        if (this.f5139q.f5160i) {
                            i2 += this.f5125c.mo6270d();
                        } else {
                            i2 += this.f5125c.mo6268c();
                        }
                    }
                    this.f5124b[i].mo6051c(i2);
                }
            } else {
                this.f5139q.mo6032a();
                this.f5139q.f5152a = this.f5139q.f5153b;
            }
        }
        this.f5138p = this.f5139q.f5161j;
        m6385a(this.f5139q.f5159h);
        m6406l();
        if (this.f5139q.f5152a != -1) {
            this.f5130h = this.f5139q.f5152a;
            aVar.f5164c = this.f5139q.f5160i;
        } else {
            aVar.f5164c = this.f5129g;
        }
        if (this.f5139q.f5156e > 1) {
            this.f5132j.f5146a = this.f5139q.f5157f;
            this.f5132j.f5147b = this.f5139q.f5158g;
        }
    }

    /* renamed from: a */
    public final int[] mo6009a(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5123a];
        } else if (iArr.length < this.f5123a) {
            StringBuilder sb = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.f5123a);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.f5123a; i++) {
            iArr[i] = this.f5124b[i].mo6055f();
        }
        return iArr;
    }

    /* renamed from: b */
    public final int[] mo6010b(int[] iArr) {
        int[] iArr2 = new int[this.f5123a];
        for (int i = 0; i < this.f5123a; i++) {
            iArr2[i] = this.f5124b[i].mo6057h();
        }
        return iArr2;
    }

    /* renamed from: a */
    private void m6384a(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f5145b) {
            if (this.f5127e == 1) {
                m6382a(view, this.f5140r, m6042a(this.f4958J, this.f4956H, mo5802u() + mo5804w(), layoutParams.height, true), false);
            } else {
                m6382a(view, m6042a(this.f4957I, this.f4955G, mo5801t() + mo5803v(), layoutParams.width, true), this.f5140r, false);
            }
        } else if (this.f5127e == 1) {
            m6382a(view, m6042a(this.f5134l, this.f4955G, 0, layoutParams.width, false), m6042a(this.f4958J, this.f4956H, mo5802u() + mo5804w(), layoutParams.height, true), false);
        } else {
            m6382a(view, m6042a(this.f4957I, this.f4955G, mo5801t() + mo5803v(), layoutParams.width, true), m6042a(this.f5134l, this.f4956H, 0, layoutParams.height, false), false);
        }
    }

    /* renamed from: a */
    private void m6382a(View view, int i, int i2, boolean z) {
        boolean z2;
        mo5777b(view, this.f5141s);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int b = m6387b(i, layoutParams.leftMargin + this.f5141s.left, layoutParams.rightMargin + this.f5141s.right);
        int b2 = m6387b(i2, layoutParams.topMargin + this.f5141s.top, layoutParams.bottomMargin + this.f5141s.bottom);
        if (z) {
            z2 = mo5765a(view, b, b2, (android.support.p029v7.widget.RecyclerView.LayoutParams) layoutParams);
        } else {
            z2 = mo5778b(view, b, b2, (android.support.p029v7.widget.RecyclerView.LayoutParams) layoutParams);
        }
        if (z2) {
            view.measure(b, b2);
        }
    }

    /* renamed from: a */
    public final void mo5420a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f5139q = (SavedState) parcelable;
            mo5795n();
        }
    }

    /* renamed from: a */
    public final void mo5372a(C1284o oVar, C1290s sVar, View view, C0945c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.mo5758a(view, cVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int i5 = 1;
        if (this.f5127e == 0) {
            int e = layoutParams2.mo6015e();
            if (layoutParams2.f5145b) {
                i5 = this.f5123a;
            }
            i4 = e;
            i3 = i5;
            i2 = -1;
            i = -1;
        } else {
            int e2 = layoutParams2.mo6015e();
            if (layoutParams2.f5145b) {
                i2 = e2;
                i = this.f5123a;
                i4 = -1;
                i3 = -1;
            } else {
                i2 = e2;
                i4 = -1;
                i3 = -1;
                i = 1;
            }
        }
        cVar.mo3657b((Object) C0948c.m4049a(i4, i3, i2, i, layoutParams2.f5145b, false));
    }

    /* renamed from: a */
    public final void mo5424a(AccessibilityEvent accessibilityEvent) {
        super.mo5424a(accessibilityEvent);
        if (mo5800s() > 0) {
            View b = m6388b(false);
            View c = m6394c(false);
            if (b != null && c != null) {
                int c2 = m6060c(b);
                int c3 = m6060c(c);
                if (c2 < c3) {
                    accessibilityEvent.setFromIndex(c2);
                    accessibilityEvent.setToIndex(c3);
                    return;
                }
                accessibilityEvent.setFromIndex(c3);
                accessibilityEvent.setToIndex(c2);
            }
        }
    }

    /* renamed from: a */
    public final int mo5362a(C1284o oVar, C1290s sVar) {
        if (this.f5127e == 0) {
            return this.f5123a;
        }
        return super.mo5362a(oVar, sVar);
    }

    /* renamed from: b */
    public final void mo5383b(RecyclerView recyclerView, int i, int i2) {
        m6395c(i, i2, 2);
    }

    /* renamed from: a */
    public final void mo5376a(RecyclerView recyclerView, int i, int i2) {
        m6395c(i, i2, 1);
    }

    /* renamed from: a */
    public final void mo5375a(RecyclerView recyclerView) {
        this.f5132j.mo6018a();
        mo5795n();
    }

    /* renamed from: a */
    public final void mo5377a(RecyclerView recyclerView, int i, int i2, int i3) {
        m6395c(i, i2, 8);
    }

    /* renamed from: a */
    public final void mo5378a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m6395c(i, i2, 4);
    }

    /* renamed from: a */
    private void m6383a(View view, LayoutParams layoutParams, C1338ad adVar) {
        if (adVar.f5242e == 1) {
            if (layoutParams.f5145b) {
                m6412o(view);
            } else {
                layoutParams.f5144a.mo6049b(view);
            }
        } else if (layoutParams.f5145b) {
            m6414p(view);
        } else {
            layoutParams.f5144a.mo6045a(view);
        }
    }

    /* renamed from: a */
    private void m6378a(C1284o oVar, C1338ad adVar) {
        int i;
        int i2;
        if (adVar.f5238a && !adVar.f5246i) {
            if (adVar.f5239b == 0) {
                if (adVar.f5242e == -1) {
                    m6390b(oVar, adVar.f5244g);
                } else {
                    m6376a(oVar, adVar.f5243f);
                }
            } else if (adVar.f5242e == -1) {
                int o = adVar.f5243f - m6411o(adVar.f5243f);
                if (o < 0) {
                    i2 = adVar.f5244g;
                } else {
                    i2 = adVar.f5244g - Math.min(o, adVar.f5239b);
                }
                m6390b(oVar, i2);
            } else {
                int r = m6416r(adVar.f5244g) - adVar.f5244g;
                if (r < 0) {
                    i = adVar.f5243f;
                } else {
                    i = Math.min(r, adVar.f5239b) + adVar.f5243f;
                }
                m6376a(oVar, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.f4993g = i;
        mo5755a((C1287r) linearSmoothScroller);
    }

    /* renamed from: a */
    public final void mo5417a(int i, int i2) {
        if (this.f5139q != null) {
            this.f5139q.mo6033b();
        }
        this.f5130h = i;
        this.f5131i = i2;
        mo5795n();
    }

    /* renamed from: a */
    public final void mo5418a(int i, int i2, C1290s sVar, C1276a aVar) {
        int i3;
        if (this.f5127e != 0) {
            i = i2;
        }
        if (mo5800s() != 0 && i != 0) {
            m6389b(i, sVar);
            if (this.f5121M == null || this.f5121M.length < this.f5123a) {
                this.f5121M = new int[this.f5123a];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f5123a; i5++) {
                if (this.f5135m.f5241d == -1) {
                    i3 = this.f5135m.f5243f - this.f5124b[i5].mo6043a(this.f5135m.f5243f);
                } else {
                    i3 = this.f5124b[i5].mo6048b(this.f5135m.f5244g) - this.f5135m.f5244g;
                }
                if (i3 >= 0) {
                    this.f5121M[i4] = i3;
                    i4++;
                }
            }
            Arrays.sort(this.f5121M, 0, i4);
            for (int i6 = 0; i6 < i4 && this.f5135m.mo6258a(sVar); i6++) {
                aVar.mo5813b(this.f5135m.f5240c, this.f5121M[i6]);
                this.f5135m.f5240c += this.f5135m.f5241d;
            }
        }
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5363a() {
        if (this.f5127e == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5364a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    public final android.support.p029v7.widget.RecyclerView.LayoutParams mo5365a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final View mo5367a(View view, int i, C1284o oVar, C1290s sVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (mo5800s() == 0) {
            return null;
        }
        View d = mo5783d(view);
        if (d == null) {
            return null;
        }
        m6406l();
        int w = m6421w(i);
        if (w == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) d.getLayoutParams();
        boolean z = layoutParams.f5145b;
        C1318b bVar = layoutParams.f5144a;
        if (w == 1) {
            i2 = m6371K();
        } else {
            i2 = m6372L();
        }
        m6375a(i2, sVar);
        m6407l(w);
        C1338ad adVar = this.f5135m;
        adVar.f5240c = adVar.f5241d + i2;
        this.f5135m.f5239b = (int) (((float) this.f5125c.mo6274f()) * 0.33333334f);
        this.f5135m.f5245h = true;
        this.f5135m.f5238a = false;
        m6373a(oVar, this.f5135m, sVar);
        this.f5137o = this.f5129g;
        if (!z) {
            View a = bVar.mo6044a(i2, w);
            if (!(a == null || a == d)) {
                return a;
            }
        }
        if (m6417s(w)) {
            for (int i6 = this.f5123a - 1; i6 >= 0; i6--) {
                View a2 = this.f5124b[i6].mo6044a(i2, w);
                if (a2 != null && a2 != d) {
                    return a2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f5123a; i7++) {
                View a3 = this.f5124b[i7].mo6044a(i2, w);
                if (a3 != null && a3 != d) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f5128f ^ true) == (w == -1);
        if (!z) {
            if (z2) {
                i5 = bVar.mo6056g();
            } else {
                i5 = bVar.mo6059j();
            }
            View c = mo5432c(i5);
            if (!(c == null || c == d)) {
                return c;
            }
        }
        if (m6417s(w)) {
            for (int i8 = this.f5123a - 1; i8 >= 0; i8--) {
                if (i8 != bVar.f5173e) {
                    if (z2) {
                        i4 = this.f5124b[i8].mo6056g();
                    } else {
                        i4 = this.f5124b[i8].mo6059j();
                    }
                    View c2 = mo5432c(i4);
                    if (!(c2 == null || c2 == d)) {
                        return c2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f5123a; i9++) {
                if (z2) {
                    i3 = this.f5124b[i9].mo6056g();
                } else {
                    i3 = this.f5124b[i9].mo6059j();
                }
                View c3 = mo5432c(i3);
                if (c3 != null && c3 != d) {
                    return c3;
                }
            }
        }
        return null;
    }

    public final boolean bh_() {
        if (this.f5133k != 0) {
            return true;
        }
        return false;
    }

    public final boolean bi_() {
        if (this.f5139q == null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m6409m() {
        if (mo5798q() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo5438e() {
        if (this.f5127e == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo5441f() {
        if (this.f5127e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo6013h() {
        this.f5132j.mo6018a();
        mo5795n();
    }

    /* renamed from: H */
    private int m6368H() {
        View view;
        if (this.f5129g) {
            view = m6394c(true);
        } else {
            view = m6388b(true);
        }
        if (view == null) {
            return -1;
        }
        return m6060c(view);
    }

    /* renamed from: I */
    private boolean m6369I() {
        int b = this.f5124b[0].mo6048b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f5123a; i++) {
            if (this.f5124b[i].mo6048b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    private boolean m6370J() {
        int a = this.f5124b[0].mo6043a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f5123a; i++) {
            if (this.f5124b[i].mo6043a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: K */
    private int m6371K() {
        int s = mo5800s();
        if (s == 0) {
            return 0;
        }
        return m6060c(mo5788g(s - 1));
    }

    /* renamed from: L */
    private int m6372L() {
        if (mo5800s() == 0) {
            return 0;
        }
        return m6060c(mo5788g(0));
    }

    /* renamed from: j */
    private void m6403j() {
        this.f5125c = C1343ah.m6625a(this, this.f5127e);
        this.f5126d = C1343ah.m6625a(this, 1 - this.f5127e);
    }

    /* renamed from: l */
    private void m6406l() {
        boolean z = true;
        if (this.f5127e == 1 || !m6409m()) {
            z = this.f5128f;
        } else if (this.f5128f) {
            z = false;
        }
        this.f5129g = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo6012g() {
        int i;
        int i2;
        int i3;
        if (mo5800s() == 0 || this.f5133k == 0 || !this.f4949A) {
            return false;
        }
        if (this.f5129g) {
            i2 = m6371K();
            i = m6372L();
        } else {
            i2 = m6372L();
            i = m6371K();
        }
        if (i2 == 0 && m6404k() != null) {
            this.f5132j.mo6018a();
            mo5748E();
            mo5795n();
            return true;
        } else if (!this.f5119K) {
            return false;
        } else {
            if (this.f5129g) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            int i4 = i + 1;
            FullSpanItem a = this.f5132j.mo6017a(i2, i4, i3, true);
            if (a == null) {
                this.f5119K = false;
                this.f5132j.mo6016a(i4);
                return false;
            }
            FullSpanItem a2 = this.f5132j.mo6017a(i2, a.f5148a, i3 * -1, true);
            if (a2 == null) {
                this.f5132j.mo6016a(a.f5148a);
            } else {
                this.f5132j.mo6016a(a2.f5148a + 1);
            }
            mo5748E();
            mo5795n();
            return true;
        }
    }

    /* renamed from: G */
    private void m6367G() {
        if (this.f5126d.mo6277h() != 1073741824) {
            int s = mo5800s();
            float f = 0.0f;
            for (int i = 0; i < s; i++) {
                View g = mo5788g(i);
                float e = (float) this.f5126d.mo6273e(g);
                if (e >= f) {
                    if (((LayoutParams) g.getLayoutParams()).f5145b) {
                        e = (e * 1.0f) / ((float) this.f5123a);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f5134l;
            int round = Math.round(f * ((float) this.f5123a));
            if (this.f5126d.mo6277h() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f5126d.mo6274f());
            }
            m6405k(round);
            if (this.f5134l != i2) {
                for (int i3 = 0; i3 < s; i3++) {
                    View g2 = mo5788g(i3);
                    LayoutParams layoutParams = (LayoutParams) g2.getLayoutParams();
                    if (!layoutParams.f5145b) {
                        if (!m6409m() || this.f5127e != 1) {
                            int i4 = layoutParams.f5144a.f5173e * this.f5134l;
                            int i5 = layoutParams.f5144a.f5173e * i2;
                            if (this.f5127e == 1) {
                                g2.offsetLeftAndRight(i4 - i5);
                            } else {
                                g2.offsetTopAndBottom(i4 - i5);
                            }
                        } else {
                            g2.offsetLeftAndRight(((-((this.f5123a - 1) - layoutParams.f5144a.f5173e)) * this.f5134l) - ((-((this.f5123a - 1) - layoutParams.f5144a.f5173e)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r10 == r11) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r10 == r11) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        r10 = false;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m6404k() {
        /*
            r12 = this;
            int r0 = r12.mo5800s()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f5123a
            r2.<init>(r3)
            int r3 = r12.f5123a
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f5127e
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.m6409m()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f5129g
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00aa
            android.view.View r7 = r12.mo5788g(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams r8 = (android.support.p029v7.widget.StaggeredGridLayoutManager.LayoutParams) r8
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r8.f5144a
            int r9 = r9.f5173e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r8.f5144a
            boolean r9 = r12.m6386a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r8.f5144a
            int r9 = r9.f5173e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f5145b
            if (r9 != 0) goto L_0x00a8
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a8
            android.view.View r9 = r12.mo5788g(r9)
            boolean r10 = r12.f5129g
            if (r10 == 0) goto L_0x0076
            android.support.v7.widget.ah r10 = r12.f5125c
            int r10 = r10.mo6267b(r7)
            android.support.v7.widget.ah r11 = r12.f5125c
            int r11 = r11.mo6267b(r9)
            if (r10 >= r11) goto L_0x0073
            return r7
        L_0x0073:
            if (r10 != r11) goto L_0x0089
            goto L_0x0087
        L_0x0076:
            android.support.v7.widget.ah r10 = r12.f5125c
            int r10 = r10.mo6263a(r7)
            android.support.v7.widget.ah r11 = r12.f5125c
            int r11 = r11.mo6263a(r9)
            if (r10 <= r11) goto L_0x0085
            return r7
        L_0x0085:
            if (r10 != r11) goto L_0x0089
        L_0x0087:
            r10 = 1
            goto L_0x008a
        L_0x0089:
            r10 = 0
        L_0x008a:
            if (r10 == 0) goto L_0x00a8
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams r9 = (android.support.p029v7.widget.StaggeredGridLayoutManager.LayoutParams) r9
            android.support.v7.widget.StaggeredGridLayoutManager$b r8 = r8.f5144a
            int r8 = r8.f5173e
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = r9.f5144a
            int r9 = r9.f5173e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x009f
            r8 = 1
            goto L_0x00a0
        L_0x009f:
            r8 = 0
        L_0x00a0:
            if (r3 >= 0) goto L_0x00a4
            r9 = 1
            goto L_0x00a5
        L_0x00a4:
            r9 = 0
        L_0x00a5:
            if (r8 == r9) goto L_0x00a8
            return r7
        L_0x00a8:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00aa:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.StaggeredGridLayoutManager.m6404k():android.view.View");
    }

    /* renamed from: d */
    public final Parcelable mo5435d() {
        int i;
        int i2;
        if (this.f5139q != null) {
            return new SavedState(this.f5139q);
        }
        SavedState savedState = new SavedState();
        savedState.f5159h = this.f5128f;
        savedState.f5160i = this.f5137o;
        savedState.f5161j = this.f5138p;
        if (this.f5132j == null || this.f5132j.f5146a == null) {
            savedState.f5156e = 0;
        } else {
            savedState.f5157f = this.f5132j.f5146a;
            savedState.f5156e = savedState.f5157f.length;
            savedState.f5158g = this.f5132j.f5147b;
        }
        if (mo5800s() > 0) {
            if (this.f5137o) {
                i = m6371K();
            } else {
                i = m6372L();
            }
            savedState.f5152a = i;
            savedState.f5153b = m6368H();
            savedState.f5154c = this.f5123a;
            savedState.f5155d = new int[this.f5123a];
            for (int i3 = 0; i3 < this.f5123a; i3++) {
                if (this.f5137o) {
                    i2 = this.f5124b[i3].mo6048b(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i2 -= this.f5125c.mo6270d();
                    }
                } else {
                    i2 = this.f5124b[i3].mo6043a(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i2 -= this.f5125c.mo6268c();
                    }
                }
                savedState.f5155d[i3] = i2;
            }
        } else {
            savedState.f5152a = -1;
            savedState.f5153b = -1;
            savedState.f5154c = 0;
        }
        return savedState;
    }

    /* renamed from: a */
    public final boolean mo5380a(android.support.p029v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: c */
    public final int mo5431c(C1290s sVar) {
        return m6400h(sVar);
    }

    /* renamed from: d */
    public final int mo5433d(C1290s sVar) {
        return m6401i(sVar);
    }

    /* renamed from: e */
    public final int mo5436e(C1290s sVar) {
        return m6401i(sVar);
    }

    /* renamed from: f */
    public final int mo5440f(C1290s sVar) {
        return m6402j(sVar);
    }

    /* renamed from: g */
    public final int mo5442g(C1290s sVar) {
        return m6402j(sVar);
    }

    /* renamed from: j */
    public final void mo5794j(int i) {
        if (i == 0) {
            mo6012g();
        }
    }

    /* renamed from: a */
    private void m6385a(boolean z) {
        mo5425a((String) null);
        if (!(this.f5139q == null || this.f5139q.f5159h == z)) {
            this.f5139q.f5159h = z;
        }
        this.f5128f = z;
        mo5795n();
    }

    /* renamed from: k */
    private void m6405k(int i) {
        this.f5134l = i / this.f5123a;
        this.f5140r = MeasureSpec.makeMeasureSpec(i, this.f5126d.mo6277h());
    }

    /* renamed from: o */
    private int m6411o(int i) {
        int a = this.f5124b[0].mo6043a(i);
        for (int i2 = 1; i2 < this.f5123a; i2++) {
            int a2 = this.f5124b[i2].mo6043a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: p */
    private int m6413p(int i) {
        int a = this.f5124b[0].mo6043a(i);
        for (int i2 = 1; i2 < this.f5123a; i2++) {
            int a2 = this.f5124b[i2].mo6043a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: q */
    private int m6415q(int i) {
        int b = this.f5124b[0].mo6048b(i);
        for (int i2 = 1; i2 < this.f5123a; i2++) {
            int b2 = this.f5124b[i2].mo6048b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: r */
    private int m6416r(int i) {
        int b = this.f5124b[0].mo6048b(i);
        for (int i2 = 1; i2 < this.f5123a; i2++) {
            int b2 = this.f5124b[i2].mo6048b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: t */
    private int m6418t(int i) {
        boolean z;
        if (mo5800s() != 0) {
            if (i < m6372L()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f5129g) {
                return -1;
            }
            return 1;
        } else if (this.f5129g) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: u */
    private int m6419u(int i) {
        int s = mo5800s();
        for (int i2 = 0; i2 < s; i2++) {
            int c = m6060c(mo5788g(i2));
            if (c >= 0 && c < i) {
                return c;
            }
        }
        return 0;
    }

    /* renamed from: v */
    private int m6420v(int i) {
        for (int s = mo5800s() - 1; s >= 0; s--) {
            int c = m6060c(mo5788g(s));
            if (c >= 0 && c < i) {
                return c;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final PointF mo5434d(int i) {
        int t = m6418t(i);
        PointF pointF = new PointF();
        if (t == 0) {
            return null;
        }
        if (this.f5127e == 0) {
            pointF.x = (float) t;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) t;
        }
        return pointF;
    }

    /* renamed from: h */
    public final void mo5790h(int i) {
        super.mo5790h(i);
        for (int i2 = 0; i2 < this.f5123a; i2++) {
            this.f5124b[i2].mo6053d(i);
        }
    }

    /* renamed from: i */
    public final void mo5792i(int i) {
        super.mo5792i(i);
        for (int i2 = 0; i2 < this.f5123a; i2++) {
            this.f5124b[i2].mo6053d(i);
        }
    }

    /* renamed from: f */
    private void m6399f(int i) {
        if (i == 0 || i == 1) {
            mo5425a((String) null);
            if (i != this.f5127e) {
                this.f5127e = i;
                C1343ah ahVar = this.f5125c;
                this.f5125c = this.f5126d;
                this.f5126d = ahVar;
                mo5795n();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: h */
    private int m6400h(C1290s sVar) {
        if (mo5800s() == 0) {
            return 0;
        }
        return C1354ao.m6701a(sVar, this.f5125c, m6388b(!this.f5120L), m6394c(!this.f5120L), this, this.f5120L, this.f5129g);
    }

    /* renamed from: i */
    private int m6401i(C1290s sVar) {
        if (mo5800s() == 0) {
            return 0;
        }
        return C1354ao.m6700a(sVar, this.f5125c, m6388b(!this.f5120L), m6394c(!this.f5120L), this, this.f5120L);
    }

    /* renamed from: j */
    private int m6402j(C1290s sVar) {
        if (mo5800s() == 0) {
            return 0;
        }
        return C1354ao.m6702b(sVar, this.f5125c, m6388b(!this.f5120L), m6394c(!this.f5120L), this, this.f5120L);
    }

    /* renamed from: l */
    private void m6407l(int i) {
        boolean z;
        this.f5135m.f5242e = i;
        C1338ad adVar = this.f5135m;
        boolean z2 = this.f5129g;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        adVar.f5241d = i2;
    }

    /* renamed from: m */
    private FullSpanItem m6408m(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f5150c = new int[this.f5123a];
        for (int i2 = 0; i2 < this.f5123a; i2++) {
            fullSpanItem.f5150c[i2] = i - this.f5124b[i2].mo6048b(i);
        }
        return fullSpanItem;
    }

    /* renamed from: n */
    private FullSpanItem m6410n(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f5150c = new int[this.f5123a];
        for (int i2 = 0; i2 < this.f5123a; i2++) {
            fullSpanItem.f5150c[i2] = this.f5124b[i2].mo6043a(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: o */
    private void m6412o(View view) {
        for (int i = this.f5123a - 1; i >= 0; i--) {
            this.f5124b[i].mo6049b(view);
        }
    }

    /* renamed from: p */
    private void m6414p(View view) {
        for (int i = this.f5123a - 1; i >= 0; i--) {
            this.f5124b[i].mo6045a(view);
        }
    }

    /* renamed from: s */
    private boolean m6417s(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f5127e == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f5129g) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f5129g) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == m6409m()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo5437e(int i) {
        if (!(this.f5139q == null || this.f5139q.f5152a == i)) {
            this.f5139q.mo6033b();
        }
        this.f5130h = i;
        this.f5131i = Integer.MIN_VALUE;
        mo5795n();
    }

    /* renamed from: a */
    private C1318b m6374a(C1338ad adVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m6417s(adVar.f5242e)) {
            i2 = this.f5123a - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f5123a;
            i = 1;
        }
        C1318b bVar = null;
        if (adVar.f5242e == 1) {
            int i4 = Integer.MAX_VALUE;
            int c = this.f5125c.mo6268c();
            while (i2 != i3) {
                C1318b bVar2 = this.f5124b[i2];
                int b = bVar2.mo6048b(c);
                if (b < i4) {
                    bVar = bVar2;
                    i4 = b;
                }
                i2 += i;
            }
            return bVar;
        }
        int i5 = Integer.MIN_VALUE;
        int d = this.f5125c.mo6270d();
        while (i2 != i3) {
            C1318b bVar3 = this.f5124b[i2];
            int a = bVar3.mo6043a(d);
            if (a > i5) {
                bVar = bVar3;
                i5 = a;
            }
            i2 += i;
        }
        return bVar;
    }

    /* renamed from: b */
    private View m6388b(boolean z) {
        int c = this.f5125c.mo6268c();
        int d = this.f5125c.mo6270d();
        int s = mo5800s();
        View view = null;
        for (int i = 0; i < s; i++) {
            View g = mo5788g(i);
            int a = this.f5125c.mo6263a(g);
            if (this.f5125c.mo6267b(g) > c && a < d) {
                if (a >= c || !z) {
                    return g;
                }
                if (view == null) {
                    view = g;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    private View m6394c(boolean z) {
        int c = this.f5125c.mo6268c();
        int d = this.f5125c.mo6270d();
        View view = null;
        for (int s = mo5800s() - 1; s >= 0; s--) {
            View g = mo5788g(s);
            int a = this.f5125c.mo6263a(g);
            int b = this.f5125c.mo6267b(g);
            if (b > c && a < d) {
                if (b <= d || !z) {
                    return g;
                }
                if (view == null) {
                    view = g;
                }
            }
        }
        return view;
    }

    /* renamed from: w */
    private int m6421w(int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        switch (i) {
                            case 1:
                                if (this.f5127e != 1 && m6409m()) {
                                    return 1;
                                }
                                return -1;
                            case 2:
                                if (this.f5127e != 1 && m6409m()) {
                                    return -1;
                                }
                                return 1;
                            default:
                                return Integer.MIN_VALUE;
                        }
                    } else if (this.f5127e == 1) {
                        return 1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f5127e == 0) {
                    return 1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f5127e == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.f5127e == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: b */
    public final int mo5426b(C1290s sVar) {
        return m6400h(sVar);
    }

    /* renamed from: c */
    public final int[] mo6011c(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5123a];
        } else if (iArr.length < this.f5123a) {
            StringBuilder sb = new StringBuilder("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.f5123a);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.f5123a; i++) {
            iArr[i] = this.f5124b[i].mo6058i();
        }
        return iArr;
    }

    /* renamed from: a */
    private void m6379a(C1290s sVar, C1317a aVar) {
        if (!m6397c(sVar, aVar)) {
            m6392b(sVar, aVar);
        }
    }

    /* renamed from: b */
    public final int mo5382b(C1284o oVar, C1290s sVar) {
        if (this.f5127e == 1) {
            return this.f5123a;
        }
        return super.mo5382b(oVar, sVar);
    }

    /* renamed from: c */
    public void mo5385c(C1284o oVar, C1290s sVar) {
        m6377a(oVar, sVar, true);
    }

    /* renamed from: b */
    private boolean m6392b(C1290s sVar, C1317a aVar) {
        int i;
        if (this.f5137o) {
            i = m6420v(sVar.mo5870b());
        } else {
            i = m6419u(sVar.mo5870b());
        }
        aVar.f5162a = i;
        aVar.f5163b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: e */
    private void m6398e(int i, int i2) {
        for (int i3 = 0; i3 < this.f5123a; i3++) {
            if (!this.f5124b[i3].f5169a.isEmpty()) {
                m6381a(this.f5124b[i3], i, i2);
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f5127e = i2;
        mo5368a(i);
        this.f5135m = new C1338ad();
        m6403j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6375a(int r5, android.support.p029v7.widget.RecyclerView.C1290s r6) {
        /*
            r4 = this;
            android.support.v7.widget.ad r0 = r4.f5135m
            r1 = 0
            r0.f5239b = r1
            android.support.v7.widget.ad r0 = r4.f5135m
            r0.f5240c = r5
            boolean r0 = r4.mo5797p()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.f5004a
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f5129g
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0027
            android.support.v7.widget.ah r5 = r4.f5125c
            int r5 = r5.mo6274f()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x0027:
            android.support.v7.widget.ah r5 = r4.f5125c
            int r5 = r5.mo6274f()
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo5796o()
            if (r0 == 0) goto L_0x004d
            android.support.v7.widget.ad r0 = r4.f5135m
            android.support.v7.widget.ah r3 = r4.f5125c
            int r3 = r3.mo6268c()
            int r3 = r3 - r5
            r0.f5243f = r3
            android.support.v7.widget.ad r5 = r4.f5135m
            android.support.v7.widget.ah r0 = r4.f5125c
            int r0 = r0.mo6270d()
            int r0 = r0 + r6
            r5.f5244g = r0
            goto L_0x005d
        L_0x004d:
            android.support.v7.widget.ad r0 = r4.f5135m
            android.support.v7.widget.ah r3 = r4.f5125c
            int r3 = r3.mo6272e()
            int r3 = r3 + r6
            r0.f5244g = r3
            android.support.v7.widget.ad r6 = r4.f5135m
            int r5 = -r5
            r6.f5243f = r5
        L_0x005d:
            android.support.v7.widget.ad r5 = r4.f5135m
            r5.f5245h = r1
            android.support.v7.widget.ad r5 = r4.f5135m
            r5.f5238a = r2
            android.support.v7.widget.ad r5 = r4.f5135m
            android.support.v7.widget.ah r6 = r4.f5125c
            int r6 = r6.mo6277h()
            if (r6 != 0) goto L_0x0078
            android.support.v7.widget.ah r6 = r4.f5125c
            int r6 = r6.mo6272e()
            if (r6 != 0) goto L_0x0078
            r1 = 1
        L_0x0078:
            r5.f5246i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.StaggeredGridLayoutManager.m6375a(int, android.support.v7.widget.RecyclerView$s):void");
    }

    /* renamed from: b */
    private void m6389b(int i, C1290s sVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = m6371K();
            i2 = 1;
        } else {
            i3 = m6372L();
            i2 = -1;
        }
        this.f5135m.f5238a = true;
        m6375a(i3, sVar);
        m6407l(i2);
        C1338ad adVar = this.f5135m;
        adVar.f5240c = i3 + adVar.f5241d;
        this.f5135m.f5239b = Math.abs(i);
    }

    /* renamed from: b */
    private void m6390b(C1284o oVar, int i) {
        int s = mo5800s() - 1;
        while (s >= 0) {
            View g = mo5788g(s);
            if (this.f5125c.mo6263a(g) >= i && this.f5125c.mo6271d(g) >= i) {
                LayoutParams layoutParams = (LayoutParams) g.getLayoutParams();
                if (layoutParams.f5145b) {
                    int i2 = 0;
                    while (i2 < this.f5123a) {
                        if (this.f5124b[i2].f5169a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f5123a; i3++) {
                        this.f5124b[i3].mo6052d();
                    }
                } else if (layoutParams.f5144a.f5169a.size() != 1) {
                    layoutParams.f5144a.mo6052d();
                } else {
                    return;
                }
                mo5759a(g, oVar);
                s--;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m6376a(C1284o oVar, int i) {
        while (mo5800s() > 0) {
            View g = mo5788g(0);
            if (this.f5125c.mo6267b(g) <= i && this.f5125c.mo6269c(g) <= i) {
                LayoutParams layoutParams = (LayoutParams) g.getLayoutParams();
                if (layoutParams.f5145b) {
                    int i2 = 0;
                    while (i2 < this.f5123a) {
                        if (this.f5124b[i2].f5169a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f5123a; i3++) {
                        this.f5124b[i3].mo6054e();
                    }
                } else if (layoutParams.f5144a.f5169a.size() != 1) {
                    layoutParams.f5144a.mo6054e();
                } else {
                    return;
                }
                mo5759a(g, oVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private boolean m6397c(C1290s sVar, C1317a aVar) {
        int i;
        int i2;
        boolean z = false;
        if (sVar.f5010g || this.f5130h == -1) {
            return false;
        }
        if (this.f5130h < 0 || this.f5130h >= sVar.mo5870b()) {
            this.f5130h = -1;
            this.f5131i = Integer.MIN_VALUE;
            return false;
        }
        if (this.f5139q == null || this.f5139q.f5152a == -1 || this.f5139q.f5154c <= 0) {
            View c = mo5432c(this.f5130h);
            if (c != null) {
                if (this.f5129g) {
                    i = m6371K();
                } else {
                    i = m6372L();
                }
                aVar.f5162a = i;
                if (this.f5131i != Integer.MIN_VALUE) {
                    if (aVar.f5164c) {
                        aVar.f5163b = (this.f5125c.mo6270d() - this.f5131i) - this.f5125c.mo6267b(c);
                    } else {
                        aVar.f5163b = (this.f5125c.mo6268c() + this.f5131i) - this.f5125c.mo6263a(c);
                    }
                    return true;
                } else if (this.f5125c.mo6273e(c) > this.f5125c.mo6274f()) {
                    if (aVar.f5164c) {
                        i2 = this.f5125c.mo6270d();
                    } else {
                        i2 = this.f5125c.mo6268c();
                    }
                    aVar.f5163b = i2;
                    return true;
                } else {
                    int a = this.f5125c.mo6263a(c) - this.f5125c.mo6268c();
                    if (a < 0) {
                        aVar.f5163b = -a;
                        return true;
                    }
                    int d = this.f5125c.mo6270d() - this.f5125c.mo6267b(c);
                    if (d < 0) {
                        aVar.f5163b = d;
                        return true;
                    }
                    aVar.f5163b = Integer.MIN_VALUE;
                }
            } else {
                aVar.f5162a = this.f5130h;
                if (this.f5131i == Integer.MIN_VALUE) {
                    if (m6418t(aVar.f5162a) == 1) {
                        z = true;
                    }
                    aVar.f5164c = z;
                    aVar.mo6041b();
                } else {
                    aVar.mo6039a(this.f5131i);
                }
                aVar.f5165d = true;
            }
        } else {
            aVar.f5163b = Integer.MIN_VALUE;
            aVar.f5162a = this.f5130h;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo5361a(int i, C1284o oVar, C1290s sVar) {
        return m6393c(i, oVar, sVar);
    }

    /* renamed from: b */
    public int mo5381b(int i, C1284o oVar, C1290s sVar) {
        return m6393c(i, oVar, sVar);
    }

    /* renamed from: a */
    private void m6381a(C1318b bVar, int i, int i2) {
        int i3 = bVar.f5172d;
        if (i == -1) {
            if (bVar.mo6042a() + i3 <= i2) {
                this.f5136n.set(bVar.f5173e, false);
            }
            return;
        }
        if (bVar.mo6047b() - i3 >= i2) {
            this.f5136n.set(bVar.f5173e, false);
        }
    }

    /* renamed from: b */
    private static int m6387b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: c */
    private int m6393c(int i, C1284o oVar, C1290s sVar) {
        if (mo5800s() == 0 || i == 0) {
            return 0;
        }
        m6389b(i, sVar);
        int a = m6373a(oVar, this.f5135m, sVar);
        if (this.f5135m.f5239b >= a) {
            if (i < 0) {
                i = -a;
            } else {
                i = a;
            }
        }
        this.f5125c.mo6265a(-i);
        this.f5137o = this.f5129g;
        this.f5135m.f5239b = 0;
        m6378a(oVar, this.f5135m);
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6395c(int r6, int r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r5.f5129g
            if (r0 == 0) goto L_0x0009
            int r0 = r5.m6371K()
            goto L_0x000d
        L_0x0009:
            int r0 = r5.m6372L()
        L_0x000d:
            r1 = 8
            if (r8 != r1) goto L_0x001b
            if (r6 >= r7) goto L_0x0016
            int r2 = r7 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r6 + 1
            r3 = r2
            r2 = r7
            goto L_0x001f
        L_0x001b:
            int r2 = r6 + r7
        L_0x001d:
            r3 = r2
            r2 = r6
        L_0x001f:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r5.f5132j
            r4.mo6022b(r2)
            if (r8 == r1) goto L_0x0036
            switch(r8) {
                case 1: goto L_0x0030;
                case 2: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0041
        L_0x002a:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f5132j
            r8.mo6019a(r6, r7)
            goto L_0x0041
        L_0x0030:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f5132j
            r8.mo6023b(r6, r7)
            goto L_0x0041
        L_0x0036:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f5132j
            r1 = 1
            r8.mo6019a(r6, r1)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r5.f5132j
            r6.mo6023b(r7, r1)
        L_0x0041:
            if (r3 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r5.f5129g
            if (r6 == 0) goto L_0x004d
            int r6 = r5.m6372L()
            goto L_0x0051
        L_0x004d:
            int r6 = r5.m6371K()
        L_0x0051:
            if (r2 > r6) goto L_0x0056
            r5.mo5795n()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.StaggeredGridLayoutManager.m6395c(int, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v53 */
    /* JADX WARNING: type inference failed for: r5v54 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v1, types: [int, boolean]
      assigns: []
      uses: [boolean, int, ?[int, short, byte, char]]
      mth insns count: 201
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m6373a(android.support.p029v7.widget.RecyclerView.C1284o r17, android.support.p029v7.widget.C1338ad r18, android.support.p029v7.widget.RecyclerView.C1290s r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.BitSet r3 = r0.f5136n
            int r4 = r0.f5123a
            r5 = 0
            r6 = 1
            r3.set(r5, r4, r6)
            android.support.v7.widget.ad r3 = r0.f5135m
            boolean r3 = r3.f5246i
            if (r3 == 0) goto L_0x0020
            int r3 = r2.f5242e
            if (r3 != r6) goto L_0x001d
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002f
        L_0x001d:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x002f
        L_0x0020:
            int r3 = r2.f5242e
            if (r3 != r6) goto L_0x002a
            int r3 = r2.f5244g
            int r4 = r2.f5239b
            int r3 = r3 + r4
            goto L_0x002f
        L_0x002a:
            int r3 = r2.f5243f
            int r4 = r2.f5239b
            int r3 = r3 - r4
        L_0x002f:
            int r4 = r2.f5242e
            r0.m6398e(r4, r3)
            boolean r4 = r0.f5129g
            if (r4 == 0) goto L_0x003f
            android.support.v7.widget.ah r4 = r0.f5125c
            int r4 = r4.mo6270d()
            goto L_0x0045
        L_0x003f:
            android.support.v7.widget.ah r4 = r0.f5125c
            int r4 = r4.mo6268c()
        L_0x0045:
            r7 = 0
        L_0x0046:
            boolean r8 = r18.mo6258a(r19)
            r9 = -1
            if (r8 == 0) goto L_0x01b2
            android.support.v7.widget.ad r8 = r0.f5135m
            boolean r8 = r8.f5246i
            if (r8 != 0) goto L_0x005b
            java.util.BitSet r8 = r0.f5136n
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x01b2
        L_0x005b:
            android.view.View r7 = r2.mo6257a(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$LayoutParams r8 = (android.support.p029v7.widget.StaggeredGridLayoutManager.LayoutParams) r8
            int r10 = r8.bn_()
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r11 = r0.f5132j
            int r11 = r11.mo6024c(r10)
            if (r11 != r9) goto L_0x0073
            r12 = 1
            goto L_0x0074
        L_0x0073:
            r12 = 0
        L_0x0074:
            if (r12 == 0) goto L_0x0089
            boolean r11 = r8.f5145b
            if (r11 == 0) goto L_0x007f
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r11 = r0.f5124b
            r11 = r11[r5]
            goto L_0x0083
        L_0x007f:
            android.support.v7.widget.StaggeredGridLayoutManager$b r11 = r0.m6374a(r2)
        L_0x0083:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r13 = r0.f5132j
            r13.mo6020a(r10, r11)
            goto L_0x008d
        L_0x0089:
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r13 = r0.f5124b
            r11 = r13[r11]
        L_0x008d:
            r8.f5144a = r11
            int r13 = r2.f5242e
            if (r13 != r6) goto L_0x0097
            r0.mo5775b(r7)
            goto L_0x009a
        L_0x0097:
            r0.mo5776b(r7, r5)
        L_0x009a:
            r0.m6384a(r7, r8, r5)
            int r13 = r2.f5242e
            if (r13 != r6) goto L_0x00c9
            boolean r13 = r8.f5145b
            if (r13 == 0) goto L_0x00aa
            int r13 = r0.m6415q(r4)
            goto L_0x00ae
        L_0x00aa:
            int r13 = r11.mo6048b(r4)
        L_0x00ae:
            android.support.v7.widget.ah r14 = r0.f5125c
            int r14 = r14.mo6273e(r7)
            int r14 = r14 + r13
            if (r12 == 0) goto L_0x00f3
            boolean r15 = r8.f5145b
            if (r15 == 0) goto L_0x00f3
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r15 = r0.m6408m(r13)
            r15.f5149b = r9
            r15.f5148a = r10
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r0.f5132j
            r5.mo6021a(r15)
            goto L_0x00f3
        L_0x00c9:
            boolean r5 = r8.f5145b
            if (r5 == 0) goto L_0x00d3
            int r5 = r0.m6413p(r4)
        L_0x00d1:
            r14 = r5
            goto L_0x00d8
        L_0x00d3:
            int r5 = r11.mo6043a(r4)
            goto L_0x00d1
        L_0x00d8:
            android.support.v7.widget.ah r5 = r0.f5125c
            int r5 = r5.mo6273e(r7)
            int r13 = r14 - r5
            if (r12 == 0) goto L_0x00f3
            boolean r5 = r8.f5145b
            if (r5 == 0) goto L_0x00f3
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r0.m6410n(r14)
            r5.f5149b = r6
            r5.f5148a = r10
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r15 = r0.f5132j
            r15.mo6021a(r5)
        L_0x00f3:
            boolean r5 = r8.f5145b
            if (r5 == 0) goto L_0x011a
            int r5 = r2.f5241d
            if (r5 != r9) goto L_0x011a
            if (r12 != 0) goto L_0x0118
            int r5 = r2.f5242e
            if (r5 != r6) goto L_0x0107
            boolean r5 = r16.m6369I()
        L_0x0105:
            r5 = r5 ^ r6
            goto L_0x010c
        L_0x0107:
            boolean r5 = r16.m6370J()
            goto L_0x0105
        L_0x010c:
            if (r5 == 0) goto L_0x011a
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r0.f5132j
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r5.mo6025d(r10)
            if (r5 == 0) goto L_0x0118
            r5.f5151d = r6
        L_0x0118:
            r0.f5119K = r6
        L_0x011a:
            r0.m6383a(r7, r8, r2)
            boolean r5 = r16.m6409m()
            if (r5 == 0) goto L_0x014c
            int r5 = r0.f5127e
            if (r5 != r6) goto L_0x014c
            boolean r5 = r8.f5145b
            if (r5 == 0) goto L_0x0132
            android.support.v7.widget.ah r5 = r0.f5126d
            int r5 = r5.mo6270d()
            goto L_0x0143
        L_0x0132:
            android.support.v7.widget.ah r5 = r0.f5126d
            int r5 = r5.mo6270d()
            int r9 = r0.f5123a
            int r9 = r9 - r6
            int r10 = r11.f5173e
            int r9 = r9 - r10
            int r10 = r0.f5134l
            int r9 = r9 * r10
            int r5 = r5 - r9
        L_0x0143:
            android.support.v7.widget.ah r9 = r0.f5126d
            int r9 = r9.mo6273e(r7)
            int r9 = r5 - r9
            goto L_0x016d
        L_0x014c:
            boolean r5 = r8.f5145b
            if (r5 == 0) goto L_0x0158
            android.support.v7.widget.ah r5 = r0.f5126d
            int r5 = r5.mo6268c()
        L_0x0156:
            r9 = r5
            goto L_0x0166
        L_0x0158:
            int r5 = r11.f5173e
            int r9 = r0.f5134l
            int r5 = r5 * r9
            android.support.v7.widget.ah r9 = r0.f5126d
            int r9 = r9.mo6268c()
            int r5 = r5 + r9
            goto L_0x0156
        L_0x0166:
            android.support.v7.widget.ah r5 = r0.f5126d
            int r5 = r5.mo6273e(r7)
            int r5 = r5 + r9
        L_0x016d:
            int r10 = r0.f5127e
            if (r10 != r6) goto L_0x0175
            m6057b(r7, r9, r13, r5, r14)
            goto L_0x0178
        L_0x0175:
            m6057b(r7, r13, r9, r14, r5)
        L_0x0178:
            boolean r5 = r8.f5145b
            if (r5 == 0) goto L_0x0184
            android.support.v7.widget.ad r5 = r0.f5135m
            int r5 = r5.f5242e
            r0.m6398e(r5, r3)
            goto L_0x018b
        L_0x0184:
            android.support.v7.widget.ad r5 = r0.f5135m
            int r5 = r5.f5242e
            r0.m6381a(r11, r5, r3)
        L_0x018b:
            android.support.v7.widget.ad r5 = r0.f5135m
            r0.m6378a(r1, r5)
            android.support.v7.widget.ad r5 = r0.f5135m
            boolean r5 = r5.f5245h
            if (r5 == 0) goto L_0x01ae
            boolean r5 = r7.hasFocusable()
            if (r5 == 0) goto L_0x01ae
            boolean r5 = r8.f5145b
            if (r5 == 0) goto L_0x01a6
            java.util.BitSet r5 = r0.f5136n
            r5.clear()
            goto L_0x01ae
        L_0x01a6:
            java.util.BitSet r5 = r0.f5136n
            int r7 = r11.f5173e
            r8 = 0
            r5.set(r7, r8)
        L_0x01ae:
            r5 = 0
            r7 = 1
            goto L_0x0046
        L_0x01b2:
            if (r7 != 0) goto L_0x01b9
            android.support.v7.widget.ad r3 = r0.f5135m
            r0.m6378a(r1, r3)
        L_0x01b9:
            android.support.v7.widget.ad r1 = r0.f5135m
            int r1 = r1.f5242e
            if (r1 != r9) goto L_0x01d1
            android.support.v7.widget.ah r1 = r0.f5125c
            int r1 = r1.mo6268c()
            int r1 = r0.m6413p(r1)
            android.support.v7.widget.ah r3 = r0.f5125c
            int r3 = r3.mo6268c()
            int r3 = r3 - r1
            goto L_0x01e3
        L_0x01d1:
            android.support.v7.widget.ah r1 = r0.f5125c
            int r1 = r1.mo6270d()
            int r1 = r0.m6415q(r1)
            android.support.v7.widget.ah r3 = r0.f5125c
            int r3 = r3.mo6270d()
            int r3 = r1 - r3
        L_0x01e3:
            if (r3 <= 0) goto L_0x01ec
            int r1 = r2.f5239b
            int r1 = java.lang.Math.min(r1, r3)
            return r1
        L_0x01ec:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.StaggeredGridLayoutManager.m6373a(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.ad, android.support.v7.widget.RecyclerView$s):int");
    }

    /* renamed from: c */
    private void m6396c(C1284o oVar, C1290s sVar, boolean z) {
        int p = m6413p(Integer.MAX_VALUE);
        if (p != Integer.MAX_VALUE) {
            int c = p - this.f5125c.mo6268c();
            if (c > 0) {
                int c2 = c - m6393c(c, oVar, sVar);
                if (z && c2 > 0) {
                    this.f5125c.mo6265a(-c2);
                }
            }
        }
    }

    /* renamed from: b */
    private void m6391b(C1284o oVar, C1290s sVar, boolean z) {
        int q = m6415q(Integer.MIN_VALUE);
        if (q != Integer.MIN_VALUE) {
            int d = this.f5125c.mo6270d() - q;
            if (d > 0) {
                int i = d - (-m6393c(-d, oVar, sVar));
                if (z && i > 0) {
                    this.f5125c.mo6265a(i);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0161, code lost:
        if (mo6012g() != false) goto L_0x0165;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6377a(android.support.p029v7.widget.RecyclerView.C1284o r9, android.support.p029v7.widget.RecyclerView.C1290s r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
        L_0x0001:
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f5142t
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r2 = r8.f5139q
            r3 = -1
            if (r2 != 0) goto L_0x000c
            int r2 = r8.f5130h
            if (r2 == r3) goto L_0x0019
        L_0x000c:
            int r2 = r10.mo5870b()
            if (r2 != 0) goto L_0x0019
            r8.mo5780c(r9)
            r1.mo6038a()
            return
        L_0x0019:
            boolean r2 = r1.f5166e
            r4 = 1
            if (r2 == 0) goto L_0x0029
            int r2 = r8.f5130h
            if (r2 != r3) goto L_0x0029
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r2 = r8.f5139q
            if (r2 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            if (r2 == 0) goto L_0x0043
            r1.mo6038a()
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f5139q
            if (r5 == 0) goto L_0x0037
            r8.m6380a(r1)
            goto L_0x003e
        L_0x0037:
            r8.m6406l()
            boolean r5 = r8.f5129g
            r1.f5164c = r5
        L_0x003e:
            r8.m6379a(r10, r1)
            r1.f5166e = r4
        L_0x0043:
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f5139q
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f5130h
            if (r5 != r3) goto L_0x0060
            boolean r5 = r1.f5164c
            boolean r6 = r8.f5137o
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.m6409m()
            boolean r6 = r8.f5138p
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f5132j
            r5.mo6018a()
            r1.f5165d = r4
        L_0x0060:
            int r5 = r8.mo5800s()
            if (r5 <= 0) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f5139q
            if (r5 == 0) goto L_0x0070
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f5139q
            int r5 = r5.f5154c
            if (r5 > 0) goto L_0x00cd
        L_0x0070:
            boolean r5 = r1.f5165d
            if (r5 == 0) goto L_0x0092
            r2 = 0
        L_0x0075:
            int r5 = r8.f5123a
            if (r2 >= r5) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f5124b
            r5 = r5[r2]
            r5.mo6050c()
            int r5 = r1.f5163b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008f
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f5124b
            r5 = r5[r2]
            int r6 = r1.f5163b
            r5.mo6051c(r6)
        L_0x008f:
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0092:
            if (r2 != 0) goto L_0x00b3
            android.support.v7.widget.StaggeredGridLayoutManager$a r2 = r8.f5142t
            int[] r2 = r2.f5167f
            if (r2 != 0) goto L_0x009b
            goto L_0x00b3
        L_0x009b:
            r2 = 0
        L_0x009c:
            int r5 = r8.f5123a
            if (r2 >= r5) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f5124b
            r5 = r5[r2]
            r5.mo6050c()
            android.support.v7.widget.StaggeredGridLayoutManager$a r6 = r8.f5142t
            int[] r6 = r6.f5167f
            r6 = r6[r2]
            r5.mo6051c(r6)
            int r2 = r2 + 1
            goto L_0x009c
        L_0x00b3:
            r2 = 0
        L_0x00b4:
            int r5 = r8.f5123a
            if (r2 >= r5) goto L_0x00c6
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f5124b
            r5 = r5[r2]
            boolean r6 = r8.f5129g
            int r7 = r1.f5163b
            r5.mo6046a(r6, r7)
            int r2 = r2 + 1
            goto L_0x00b4
        L_0x00c6:
            android.support.v7.widget.StaggeredGridLayoutManager$a r2 = r8.f5142t
            android.support.v7.widget.StaggeredGridLayoutManager$b[] r5 = r8.f5124b
            r2.mo6040a(r5)
        L_0x00cd:
            r8.mo5753a(r9)
            android.support.v7.widget.ad r2 = r8.f5135m
            r2.f5238a = r0
            r8.f5119K = r0
            android.support.v7.widget.ah r2 = r8.f5126d
            int r2 = r2.mo6274f()
            r8.m6405k(r2)
            int r2 = r1.f5162a
            r8.m6375a(r2, r10)
            boolean r2 = r1.f5164c
            if (r2 == 0) goto L_0x0104
            r8.m6407l(r3)
            android.support.v7.widget.ad r2 = r8.f5135m
            r8.m6373a(r9, r2, r10)
            r8.m6407l(r4)
            android.support.v7.widget.ad r2 = r8.f5135m
            int r3 = r1.f5162a
            android.support.v7.widget.ad r5 = r8.f5135m
            int r5 = r5.f5241d
            int r3 = r3 + r5
            r2.f5240c = r3
            android.support.v7.widget.ad r2 = r8.f5135m
            r8.m6373a(r9, r2, r10)
            goto L_0x011f
        L_0x0104:
            r8.m6407l(r4)
            android.support.v7.widget.ad r2 = r8.f5135m
            r8.m6373a(r9, r2, r10)
            r8.m6407l(r3)
            android.support.v7.widget.ad r2 = r8.f5135m
            int r3 = r1.f5162a
            android.support.v7.widget.ad r5 = r8.f5135m
            int r5 = r5.f5241d
            int r3 = r3 + r5
            r2.f5240c = r3
            android.support.v7.widget.ad r2 = r8.f5135m
            r8.m6373a(r9, r2, r10)
        L_0x011f:
            r8.m6367G()
            int r2 = r8.mo5800s()
            if (r2 <= 0) goto L_0x0139
            boolean r2 = r8.f5129g
            if (r2 == 0) goto L_0x0133
            r8.m6391b(r9, r10, r4)
            r8.m6396c(r9, r10, r0)
            goto L_0x0139
        L_0x0133:
            r8.m6396c(r9, r10, r4)
            r8.m6391b(r9, r10, r0)
        L_0x0139:
            if (r11 == 0) goto L_0x0164
            boolean r11 = r10.f5010g
            if (r11 != 0) goto L_0x0164
            int r11 = r8.f5133k
            if (r11 == 0) goto L_0x0155
            int r11 = r8.mo5800s()
            if (r11 <= 0) goto L_0x0155
            boolean r11 = r8.f5119K
            if (r11 != 0) goto L_0x0153
            android.view.View r11 = r8.m6404k()
            if (r11 == 0) goto L_0x0155
        L_0x0153:
            r11 = 1
            goto L_0x0156
        L_0x0155:
            r11 = 0
        L_0x0156:
            if (r11 == 0) goto L_0x0164
            java.lang.Runnable r11 = r8.f5122N
            r8.mo5768a(r11)
            boolean r11 = r8.mo6012g()
            if (r11 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r4 = 0
        L_0x0165:
            boolean r11 = r10.f5010g
            if (r11 == 0) goto L_0x016e
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f5142t
            r11.mo6038a()
        L_0x016e:
            boolean r11 = r1.f5164c
            r8.f5137o = r11
            boolean r11 = r8.m6409m()
            r8.f5138p = r11
            if (r4 == 0) goto L_0x0182
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f5142t
            r11.mo6038a()
            r11 = 0
            goto L_0x0001
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.StaggeredGridLayoutManager.m6377a(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s, boolean):void");
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C1277b a = m6043a(context, attributeSet, i, i2);
        m6399f(a.f4969a);
        mo5368a(a.f4970b);
        m6385a(a.f4971c);
        this.f5135m = new C1338ad();
        m6403j();
    }
}
