package com.etsy.android.grid;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import com.etsy.android.grid.ExtendableListView.C13062f;
import com.etsy.android.grid.ExtendableListView.ListSavedState;
import java.util.Arrays;

public final class StaggeredGridView extends ExtendableListView {

    /* renamed from: A */
    private int f34580A;

    /* renamed from: B */
    private int f34581B;

    /* renamed from: C */
    private int[] f34582C;

    /* renamed from: D */
    private int[] f34583D;

    /* renamed from: E */
    private int[] f34584E;

    /* renamed from: F */
    private int f34585F;

    /* renamed from: r */
    private int f34586r;

    /* renamed from: s */
    private int f34587s;

    /* renamed from: t */
    private int f34588t;

    /* renamed from: u */
    private boolean f34589u;

    /* renamed from: v */
    private int f34590v;

    /* renamed from: w */
    private int f34591w;

    /* renamed from: x */
    private SparseArray<GridItemRecord> f34592x;

    /* renamed from: y */
    private int f34593y;

    /* renamed from: z */
    private int f34594z;

    static class GridItemRecord implements Parcelable {
        public static final Creator<GridItemRecord> CREATOR = new Creator<GridItemRecord>() {
            /* renamed from: a */
            private static GridItemRecord[] m38208a(int i) {
                return new GridItemRecord[i];
            }

            /* renamed from: a */
            private static GridItemRecord m38207a(Parcel parcel) {
                return new GridItemRecord(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m38207a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m38208a(i);
            }
        };

        /* renamed from: a */
        int f34595a;

        /* renamed from: b */
        double f34596b;

        /* renamed from: c */
        boolean f34597c;

        GridItemRecord() {
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GridItemRecord.ListSavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" column:");
            sb.append(this.f34595a);
            sb.append(" heightRatio:");
            sb.append(this.f34596b);
            sb.append(" isHeaderFooter:");
            sb.append(this.f34597c);
            sb.append("}");
            return sb.toString();
        }

        private GridItemRecord(Parcel parcel) {
            this.f34595a = parcel.readInt();
            this.f34596b = parcel.readDouble();
            boolean z = true;
            if (parcel.readByte() != 1) {
                z = false;
            }
            this.f34597c = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f34595a);
            parcel.writeDouble(this.f34596b);
            parcel.writeByte(this.f34597c ? (byte) 1 : 0);
        }
    }

    public static class GridListSavedState extends ListSavedState {
        public static final Creator<GridListSavedState> CREATOR = new Creator<GridListSavedState>() {
            /* renamed from: a */
            private static GridListSavedState[] m38210a(int i) {
                return new GridListSavedState[i];
            }

            /* renamed from: a */
            private static GridListSavedState m38209a(Parcel parcel) {
                return new GridListSavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m38209a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m38210a(i);
            }
        };

        /* renamed from: h */
        int f34598h;

        /* renamed from: i */
        int[] f34599i;

        /* renamed from: j */
        SparseArray f34600j;

        public String toString() {
            StringBuilder sb = new StringBuilder("StaggeredGridView.GridListSavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("}");
            return sb.toString();
        }

        public GridListSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public GridListSavedState(Parcel parcel) {
            int i;
            super(parcel);
            this.f34598h = parcel.readInt();
            if (this.f34598h >= 0) {
                i = this.f34598h;
            } else {
                i = 0;
            }
            this.f34599i = new int[i];
            parcel.readIntArray(this.f34599i);
            this.f34600j = parcel.readSparseArray(GridItemRecord.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f34598h);
            parcel.writeIntArray(this.f34599i);
            parcel.writeSparseArray(this.f34600j);
        }
    }

    /* renamed from: com.etsy.android.grid.StaggeredGridView$a */
    public static class C13069a extends C13062f {

        /* renamed from: e */
        int f34601e;

        /* renamed from: a */
        private void m38211a() {
            if (this.width != -1) {
                this.width = -1;
            }
            if (this.height == -1) {
                this.height = -2;
            }
        }

        public C13069a(LayoutParams layoutParams) {
            super(layoutParams);
            m38211a();
        }

        public C13069a(int i, int i2) {
            super(i, -2);
            m38211a();
        }
    }

    private int getChildBottomMargin() {
        return this.f34587s;
    }

    public final int getColumnWidth() {
        return this.f34588t;
    }

    public final int getDistanceToTop() {
        return this.f34585F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31647a(boolean z) {
        super.mo31647a(z);
        if (!z) {
            m38176h();
        }
    }

    /* renamed from: j */
    private void m38181j() {
        m38184k();
        m38186l();
    }

    public final int getRowPaddingBottom() {
        return getListPaddingBottom() + this.f34581B;
    }

    public final int getRowPaddingLeft() {
        return getListPaddingLeft() + this.f34593y;
    }

    public final int getRowPaddingRight() {
        return getListPaddingRight() + this.f34594z;
    }

    public final int getRowPaddingTop() {
        return getListPaddingTop() + this.f34580A;
    }

    /* access modifiers changed from: protected */
    public final void layoutChildren() {
        m38173g();
        super.layoutChildren();
    }

    private int getHighestPositionedBottom() {
        return this.f34583D[getHighestPositionedBottomColumn()];
    }

    private int getHighestPositionedTop() {
        return this.f34582C[getHighestPositionedTopColumn()];
    }

    private int getLowestPositionedBottom() {
        return this.f34583D[getLowestPositionedBottomColumn()];
    }

    private int getLowestPositionedTop() {
        return this.f34582C[getLowestPositionedTopColumn()];
    }

    /* renamed from: k */
    private void m38184k() {
        Arrays.fill(this.f34582C, getPaddingTop() + this.f34580A);
    }

    /* renamed from: e */
    private boolean m38170e() {
        if (getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m38171f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                childAt.requestLayout();
            }
        }
    }

    /* renamed from: g */
    private void m38173g() {
        if (!this.f34589u) {
            Arrays.fill(this.f34583D, 0);
        } else {
            this.f34589u = false;
        }
        System.arraycopy(this.f34582C, 0, this.f34583D, 0, this.f34586r);
    }

    private int getHighestPositionedBottomColumn() {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f34586r; i3++) {
            int i4 = this.f34583D[i3];
            if (i4 < i) {
                i2 = i3;
                i = i4;
            }
        }
        return i2;
    }

    private int getHighestPositionedTopColumn() {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f34586r; i3++) {
            int i4 = this.f34582C[i3];
            if (i4 < i) {
                i2 = i3;
                i = i4;
            }
        }
        return i2;
    }

    private int getLowestPositionedBottomColumn() {
        int i = Integer.MIN_VALUE;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f34586r; i3++) {
            int i4 = this.f34583D[i3];
            if (i4 > i) {
                i2 = i3;
                i = i4;
            }
        }
        return i2;
    }

    private int getLowestPositionedTopColumn() {
        int i = Integer.MIN_VALUE;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f34586r; i3++) {
            int i4 = this.f34582C[i3];
            if (i4 > i) {
                i2 = i3;
                i = i4;
            }
        }
        return i2;
    }

    /* renamed from: l */
    private void m38186l() {
        Arrays.fill(this.f34583D, getPaddingTop() + this.f34580A);
    }

    /* access modifiers changed from: protected */
    public final int getFirstChildTop() {
        if (m38190o(this.f34524e)) {
            return super.getFirstChildTop();
        }
        return getLowestPositionedTop();
    }

    /* access modifiers changed from: protected */
    public final int getHighestChildTop() {
        if (m38190o(this.f34524e)) {
            return super.getHighestChildTop();
        }
        return getHighestPositionedTop();
    }

    /* access modifiers changed from: protected */
    public final int getLastChildBottom() {
        if (m38190o(this.f34524e + (getChildCount() - 1))) {
            return super.getLastChildBottom();
        }
        return getHighestPositionedBottom();
    }

    /* access modifiers changed from: protected */
    public final int getLowestChildBottom() {
        if (m38190o(this.f34524e + (getChildCount() - 1))) {
            return super.getLowestChildBottom();
        }
        return getLowestPositionedBottom();
    }

    /* renamed from: h */
    private void m38176h() {
        if (this.f34524e == getHeaderViewsCount()) {
            int[] highestNonHeaderTops = getHighestNonHeaderTops();
            int i = Integer.MAX_VALUE;
            boolean z = true;
            int i2 = -1;
            for (int i3 = 0; i3 < highestNonHeaderTops.length; i3++) {
                if (z && i3 > 0 && highestNonHeaderTops[i3] != i) {
                    z = false;
                }
                if (highestNonHeaderTops[i3] < i) {
                    i = highestNonHeaderTops[i3];
                    i2 = i3;
                }
            }
            if (!z) {
                for (int i4 = 0; i4 < highestNonHeaderTops.length; i4++) {
                    if (i4 != i2) {
                        m38172f(i - highestNonHeaderTops[i4], i4);
                    }
                }
                invalidate();
            }
        }
    }

    /* renamed from: m */
    private void m38188m() {
        for (int i = 0; i < this.f34586r; i++) {
            this.f34584E[i] = m38185l(i);
        }
    }

    private int[] getHighestNonHeaderTops() {
        int[] iArr = new int[this.f34586r];
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt == null || childAt.getLayoutParams() == null || !(childAt.getLayoutParams() instanceof C13069a))) {
                    C13069a aVar = (C13069a) childAt.getLayoutParams();
                    if (aVar.f34567d != -2 && childAt.getTop() < iArr[aVar.f34601e]) {
                        iArr[aVar.f34601e] = childAt.getTop();
                    }
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo31640a() {
        if (this.f34586r > 0) {
            if (this.f34582C == null) {
                this.f34582C = new int[this.f34586r];
            }
            if (this.f34583D == null) {
                this.f34583D = new int[this.f34586r];
            }
            m38181j();
            this.f34592x.clear();
            this.f34589u = false;
            this.f34585F = 0;
            setSelection(0);
        }
    }

    public final Parcelable onSaveInstanceState() {
        boolean z;
        ListSavedState listSavedState = (ListSavedState) super.onSaveInstanceState();
        GridListSavedState gridListSavedState = new GridListSavedState(listSavedState.f34505b);
        gridListSavedState.f34549c = listSavedState.f34549c;
        gridListSavedState.f34550d = listSavedState.f34550d;
        gridListSavedState.f34551e = listSavedState.f34551e;
        gridListSavedState.f34552f = listSavedState.f34552f;
        gridListSavedState.f34553g = listSavedState.f34553g;
        int i = 0;
        if (getChildCount() <= 0 || getCount() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z || this.f34524e <= 0) {
            if (this.f34586r >= 0) {
                i = this.f34586r;
            }
            gridListSavedState.f34598h = i;
            gridListSavedState.f34599i = new int[gridListSavedState.f34598h];
            gridListSavedState.f34600j = new SparseArray();
        } else {
            gridListSavedState.f34598h = this.f34586r;
            gridListSavedState.f34599i = this.f34582C;
            gridListSavedState.f34600j = this.f34592x;
        }
        return gridListSavedState;
    }

    /* renamed from: i */
    private void m38178i() {
        int min = Math.min(this.f34532m, getCount() - 1);
        SparseArray sparseArray = new SparseArray(min);
        for (int i = 0; i < min; i++) {
            GridItemRecord gridItemRecord = (GridItemRecord) this.f34592x.get(i);
            if (gridItemRecord == null) {
                break;
            }
            sparseArray.append(i, Double.valueOf(gridItemRecord.f34596b));
        }
        this.f34592x.clear();
        for (int i2 = 0; i2 < min; i2++) {
            Double d = (Double) sparseArray.get(i2);
            if (d == null) {
                break;
            }
            GridItemRecord m = m38187m(i2);
            double d2 = (double) this.f34588t;
            double doubleValue = d.doubleValue();
            Double.isNaN(d2);
            int i3 = (int) (d2 * doubleValue);
            m.f34596b = d.doubleValue();
            if (m38190o(i2)) {
                int lowestPositionedBottom = getLowestPositionedBottom();
                int i4 = i3 + lowestPositionedBottom;
                for (int i5 = 0; i5 < this.f34586r; i5++) {
                    this.f34582C[i5] = lowestPositionedBottom;
                    this.f34583D[i5] = i4;
                }
            } else {
                int highestPositionedBottomColumn = getHighestPositionedBottomColumn();
                int i6 = this.f34583D[highestPositionedBottomColumn];
                int h = i3 + i6 + m38175h(i2) + getChildBottomMargin();
                this.f34582C[highestPositionedBottomColumn] = i6;
                this.f34583D[highestPositionedBottomColumn] = h;
                m.f34595a = highestPositionedBottomColumn;
            }
        }
        int highestPositionedBottomColumn2 = getHighestPositionedBottomColumn();
        m38177h(min, highestPositionedBottomColumn2);
        int i7 = -this.f34583D[highestPositionedBottomColumn2];
        m38182j(this.f34533n + i7);
        this.f34585F = i7;
        System.arraycopy(this.f34583D, 0, this.f34582C, 0, this.f34586r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo31650b() {
        int i;
        if (this.f34530k) {
            i = getRowPaddingTop();
        } else {
            i = 0;
        }
        if (getLowestPositionedTop() > i) {
            return true;
        }
        return false;
    }

    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
    }

    public final void setItemMargin(int i) {
        this.f34587s = i;
    }

    /* renamed from: b */
    private static int m38163b(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: i */
    private void m38179i(int i) {
        this.f34585F += i;
    }

    private void setPositionIsHeaderFooter(int i) {
        m38187m(i).f34597c = true;
    }

    /* renamed from: j */
    private void m38182j(int i) {
        if (i != 0) {
            for (int i2 = 0; i2 < this.f34586r; i2++) {
                m38174g(i, i2);
            }
        }
    }

    /* renamed from: l */
    private int m38185l(int i) {
        return getRowPaddingLeft() + this.f34587s + ((this.f34587s + this.f34588t) * i);
    }

    /* renamed from: n */
    private int m38189n(int i) {
        GridItemRecord gridItemRecord = (GridItemRecord) this.f34592x.get(i, null);
        if (gridItemRecord != null) {
            return gridItemRecord.f34595a;
        }
        return -1;
    }

    /* renamed from: o */
    private boolean m38190o(int i) {
        if (this.f34522c.getItemViewType(i) == -2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo31658f(int i) {
        super.mo31658f(i);
        m38182j(i);
        m38179i(i);
    }

    /* renamed from: h */
    private int m38175h(int i) {
        boolean z;
        if (i < getHeaderViewsCount() + this.f34586r) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f34587s;
        }
        return 0;
    }

    /* renamed from: k */
    private int m38183k(int i) {
        return ((i - (getRowPaddingLeft() + getRowPaddingRight())) - (this.f34587s * (this.f34586r + 1))) / this.f34586r;
    }

    /* renamed from: m */
    private GridItemRecord m38187m(int i) {
        GridItemRecord gridItemRecord = (GridItemRecord) this.f34592x.get(i, null);
        if (gridItemRecord != null) {
            return gridItemRecord;
        }
        GridItemRecord gridItemRecord2 = new GridItemRecord();
        this.f34592x.append(i, gridItemRecord2);
        return gridItemRecord2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo31638a(int i) {
        if (m38190o(i)) {
            return super.mo31638a(i);
        }
        return this.f34584E[m38189n(i)];
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo31652c(int i) {
        if (m38190o(i)) {
            return super.mo31652c(i);
        }
        int n = m38189n(i);
        if (n == -1) {
            return getLowestPositionedTop();
        }
        return this.f34582C[n];
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo31655d(int i) {
        if (m38190o(i)) {
            return super.mo31655d(i);
        }
        return getHighestPositionedBottom();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        GridListSavedState gridListSavedState = (GridListSavedState) parcelable;
        this.f34586r = gridListSavedState.f34598h;
        this.f34582C = gridListSavedState.f34599i;
        this.f34583D = new int[this.f34586r];
        this.f34592x = gridListSavedState.f34600j;
        this.f34589u = true;
        super.onRestoreInstanceState(gridListSavedState);
    }

    public final void setColumnCount(int i) {
        this.f34590v = i;
        this.f34591w = i;
        mo31641a(getWidth(), getHeight());
        m38171f();
    }

    public final void setColumnCountLandscape(int i) {
        this.f34591w = i;
        mo31641a(getWidth(), getHeight());
        m38171f();
    }

    public final void setColumnCountPortrait(int i) {
        this.f34590v = i;
        mo31641a(getWidth(), getHeight());
        m38171f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13062f mo31639a(View view) {
        C13069a aVar;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            aVar = null;
        } else if (layoutParams instanceof C13069a) {
            aVar = (C13069a) layoutParams;
        } else {
            aVar = new C13069a(layoutParams);
        }
        if (aVar == null) {
            return new C13069a(this.f34588t, -2);
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo31657e(int i) {
        if (m38190o(i)) {
            return super.mo31657e(i);
        }
        return getLowestPositionedTop();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31649b(int i) {
        if (m38190o(i)) {
            return super.mo31649b(i);
        }
        int n = m38189n(i);
        if (n == -1) {
            return getHighestPositionedBottom();
        }
        return this.f34583D[n];
    }

    /* renamed from: h */
    private void m38177h(int i, int i2) {
        m38187m(i).f34595a = i2;
    }

    /* renamed from: d */
    private void m38167d(int i, int i2) {
        if (i2 < this.f34582C[i]) {
            this.f34582C[i] = i2;
        }
    }

    /* renamed from: e */
    private void m38169e(int i, int i2) {
        if (i2 > this.f34583D[i]) {
            this.f34583D[i] = i2;
        }
    }

    /* renamed from: b */
    private int m38162b(int i, boolean z) {
        int n = m38189n(i);
        int i2 = this.f34586r;
        if (n >= 0 && n < i2) {
            return n;
        }
        if (z) {
            return getHighestPositionedBottomColumn();
        }
        return getLowestPositionedTopColumn();
    }

    /* renamed from: i */
    private void m38180i(int i, int i2) {
        GridItemRecord m = m38187m(i);
        double d = (double) i2;
        double d2 = (double) this.f34588t;
        Double.isNaN(d);
        Double.isNaN(d2);
        m.f34596b = d / d2;
    }

    /* renamed from: f */
    private void m38172f(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getLayoutParams() != null && (childAt.getLayoutParams() instanceof C13069a) && ((C13069a) childAt.getLayoutParams()).f34601e == i2) {
                childAt.offsetTopAndBottom(i);
            }
        }
        m38174g(i, i2);
    }

    /* renamed from: g */
    private void m38174g(int i, int i2) {
        if (i != 0) {
            int[] iArr = this.f34582C;
            iArr[i2] = iArr[i2] + i;
            int[] iArr2 = this.f34583D;
            iArr2[i2] = iArr2[i2] + i;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f34586r <= 0) {
            if (m38170e()) {
                i3 = this.f34591w;
            } else {
                i3 = this.f34590v;
            }
            this.f34586r = i3;
        }
        this.f34588t = m38183k(getMeasuredWidth());
        if (this.f34582C == null || this.f34582C.length != this.f34586r) {
            this.f34582C = new int[this.f34586r];
            m38184k();
        }
        if (this.f34583D == null || this.f34583D.length != this.f34586r) {
            this.f34583D = new int[this.f34586r];
            m38186l();
        }
        if (this.f34584E == null || this.f34584E.length != this.f34586r) {
            this.f34584E = new int[this.f34586r];
            m38188m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31641a(int i, int i2) {
        int i3;
        super.mo31641a(i, i2);
        if (m38170e()) {
            i3 = this.f34591w;
        } else {
            i3 = this.f34590v;
        }
        if (this.f34586r != i3) {
            this.f34586r = i3;
            this.f34588t = m38183k(i);
            this.f34582C = new int[this.f34586r];
            this.f34583D = new int[this.f34586r];
            this.f34584E = new int[this.f34586r];
            this.f34585F = 0;
            m38181j();
            m38188m();
            if (getCount() > 0 && this.f34592x.size() > 0) {
                m38178i();
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo31654c(int i, int i2) {
        super.mo31654c(i, i2);
        Arrays.fill(this.f34582C, Integer.MAX_VALUE);
        Arrays.fill(this.f34583D, 0);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                C13062f fVar = (C13062f) childAt.getLayoutParams();
                if (fVar.f34567d == -2 || !(fVar instanceof C13069a)) {
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    for (int i4 = 0; i4 < this.f34586r; i4++) {
                        if (top < this.f34582C[i4]) {
                            this.f34582C[i4] = top;
                        }
                        if (bottom > this.f34583D[i4]) {
                            this.f34583D[i4] = bottom;
                        }
                    }
                } else {
                    C13069a aVar = (C13069a) fVar;
                    int i5 = aVar.f34601e;
                    int i6 = aVar.f34565b;
                    int top2 = childAt.getTop();
                    if (top2 < this.f34582C[i5]) {
                        this.f34582C[i5] = top2 - m38175h(i6);
                    }
                    int bottom2 = childAt.getBottom();
                    if (bottom2 > this.f34583D[i5]) {
                        this.f34583D[i5] = bottom2 + getChildBottomMargin();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31642a(int i, boolean z) {
        super.mo31642a(i, z);
        if (!m38190o(i)) {
            m38177h(i, m38162b(i, z));
        } else {
            setPositionIsHeaderFooter(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31645a(View view, C13062f fVar) {
        int i;
        int i2 = fVar.f34567d;
        int i3 = fVar.f34565b;
        if (i2 == -2 || i2 == -1) {
            super.mo31645a(view, fVar);
        } else {
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f34588t, 1073741824);
            if (fVar.height > 0) {
                i = MeasureSpec.makeMeasureSpec(fVar.height, 1073741824);
            } else {
                i = MeasureSpec.makeMeasureSpec(-2, 0);
            }
            view.measure(makeMeasureSpec, i);
        }
        m38180i(i3, m38163b(view));
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo31641a(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31643a(View view, int i, boolean z, int i2, int i3) {
        if (m38190o(i)) {
            m38166c(view, i, z, i2, i3);
        } else {
            m38168d(view, i, z, i2, i3);
        }
    }

    /* renamed from: b */
    private void m38164b(View view, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int n = m38189n(i);
        int h = m38175h(i);
        int childBottomMargin = getChildBottomMargin();
        int i6 = h + childBottomMargin;
        if (z) {
            i4 = this.f34583D[n];
            i5 = m38163b(view) + i6 + i4;
        } else {
            i5 = this.f34582C[n];
            i4 = i5 - (m38163b(view) + i6);
        }
        ((C13069a) view.getLayoutParams()).f34601e = n;
        m38169e(n, i5);
        m38167d(n, i4);
        view.layout(i2, i4 + h, i3, i5 - childBottomMargin);
    }

    /* renamed from: c */
    private void m38166c(View view, int i, boolean z, int i2, int i3) {
        int highestPositionedTop;
        int b;
        if (z) {
            b = getLowestPositionedBottom();
            highestPositionedTop = m38163b(view) + b;
        } else {
            highestPositionedTop = getHighestPositionedTop();
            b = highestPositionedTop - m38163b(view);
        }
        int i4 = b;
        for (int i5 = 0; i5 < this.f34586r; i5++) {
            m38167d(i5, i4);
            m38169e(i5, highestPositionedTop);
        }
        super.mo31643a(view, i, z, i2, i4);
    }

    /* renamed from: d */
    private void m38168d(View view, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int n = m38189n(i);
        int h = m38175h(i);
        int childBottomMargin = getChildBottomMargin() + h;
        if (z) {
            i5 = this.f34583D[n];
            i4 = m38163b(view) + childBottomMargin + i5;
        } else {
            i4 = this.f34582C[n];
            i5 = i4 - (m38163b(view) + childBottomMargin);
        }
        ((C13069a) view.getLayoutParams()).f34601e = n;
        m38169e(n, i4);
        m38167d(n, i5);
        super.mo31643a(view, i, z, i2, i5 + h);
    }

    /* renamed from: b */
    private void m38165b(View view, int i, boolean z, int i2, int i3, int i4, int i5) {
        int highestPositionedTop;
        int b;
        if (z) {
            b = getLowestPositionedBottom();
            highestPositionedTop = m38163b(view) + b;
        } else {
            highestPositionedTop = getHighestPositionedTop();
            b = highestPositionedTop - m38163b(view);
        }
        int i6 = b;
        int i7 = highestPositionedTop;
        for (int i8 = 0; i8 < this.f34586r; i8++) {
            m38167d(i8, i6);
            m38169e(i8, i7);
        }
        super.mo31644a(view, i, z, i2, i6, i4, i7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31644a(View view, int i, boolean z, int i2, int i3, int i4, int i5) {
        if (m38190o(i)) {
            m38165b(view, i, z, i2, i3, i4, i5);
        } else {
            m38164b(view, i, z, i2, i4);
        }
    }
}
