package com.etsy.android.grid;

import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.util.C0905l;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.view.C0991u;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListAdapter;
import android.widget.Scroller;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class ExtendableListView extends AbsListView {

    /* renamed from: A */
    private int f34507A;

    /* renamed from: B */
    private int f34508B;

    /* renamed from: C */
    private boolean f34509C;

    /* renamed from: D */
    private boolean f34510D;

    /* renamed from: E */
    private C13057a f34511E;

    /* renamed from: F */
    private int f34512F;

    /* renamed from: G */
    private C13061e f34513G;

    /* renamed from: H */
    private C13063g f34514H;

    /* renamed from: I */
    private Runnable f34515I;

    /* renamed from: J */
    private ArrayList<C13060d> f34516J;

    /* renamed from: K */
    private ArrayList<C13060d> f34517K;

    /* renamed from: L */
    private OnScrollListener f34518L;

    /* renamed from: M */
    private ListSavedState f34519M;

    /* renamed from: a */
    public int f34520a;

    /* renamed from: b */
    public int f34521b;

    /* renamed from: c */
    ListAdapter f34522c;

    /* renamed from: d */
    public int f34523d;

    /* renamed from: e */
    protected int f34524e;

    /* renamed from: f */
    public boolean f34525f;

    /* renamed from: g */
    public int f34526g;

    /* renamed from: h */
    public int f34527h;

    /* renamed from: i */
    final boolean[] f34528i;

    /* renamed from: j */
    public C13064h f34529j;

    /* renamed from: k */
    protected boolean f34530k;

    /* renamed from: l */
    public C13058b f34531l;

    /* renamed from: m */
    protected int f34532m;

    /* renamed from: n */
    protected int f34533n;

    /* renamed from: o */
    long f34534o;

    /* renamed from: p */
    long f34535p;

    /* renamed from: q */
    boolean f34536q;

    /* renamed from: r */
    private int f34537r;

    /* renamed from: s */
    private VelocityTracker f34538s;

    /* renamed from: t */
    private int f34539t;

    /* renamed from: u */
    private int f34540u;

    /* renamed from: v */
    private int f34541v;

    /* renamed from: w */
    private boolean f34542w;

    /* renamed from: x */
    private int f34543x;

    /* renamed from: y */
    private int f34544y;

    /* renamed from: z */
    private int f34545z;

    public static class ListSavedState extends ClassLoaderSavedState {
        public static final Creator<ListSavedState> CREATOR = new Creator<ListSavedState>() {
            /* renamed from: a */
            private static ListSavedState[] m38145a(int i) {
                return new ListSavedState[i];
            }

            /* renamed from: a */
            private static ListSavedState m38144a(Parcel parcel) {
                return new ListSavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m38144a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m38145a(i);
            }
        };

        /* renamed from: c */
        protected long f34549c;

        /* renamed from: d */
        protected long f34550d;

        /* renamed from: e */
        protected int f34551e;

        /* renamed from: f */
        protected int f34552f;

        /* renamed from: g */
        protected int f34553g;

        public String toString() {
            StringBuilder sb = new StringBuilder("ExtendableListView.ListSavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" selectedId=");
            sb.append(this.f34549c);
            sb.append(" firstId=");
            sb.append(this.f34550d);
            sb.append(" viewTop=");
            sb.append(this.f34551e);
            sb.append(" position=");
            sb.append(this.f34552f);
            sb.append(" height=");
            sb.append(this.f34553g);
            sb.append("}");
            return sb.toString();
        }

        public ListSavedState(Parcelable parcelable) {
            super(parcelable, AbsListView.class.getClassLoader());
        }

        public ListSavedState(Parcel parcel) {
            super(parcel);
            this.f34549c = parcel.readLong();
            this.f34550d = parcel.readLong();
            this.f34551e = parcel.readInt();
            this.f34552f = parcel.readInt();
            this.f34553g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f34549c);
            parcel.writeLong(this.f34550d);
            parcel.writeInt(this.f34551e);
            parcel.writeInt(this.f34552f);
            parcel.writeInt(this.f34553g);
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$a */
    class C13057a extends DataSetObserver {

        /* renamed from: a */
        final /* synthetic */ ExtendableListView f34554a;

        /* renamed from: b */
        private Parcelable f34555b;

        public final void onInvalidated() {
            this.f34554a.f34525f = true;
            if (this.f34554a.getAdapter().hasStableIds()) {
                this.f34555b = this.f34554a.onSaveInstanceState();
            }
            this.f34554a.f34527h = this.f34554a.f34526g;
            this.f34554a.f34526g = 0;
            this.f34554a.f34536q = false;
            this.f34554a.mo31653c();
            this.f34554a.requestLayout();
        }

        public final void onChanged() {
            this.f34554a.f34525f = true;
            this.f34554a.f34527h = this.f34554a.f34526g;
            this.f34554a.f34526g = this.f34554a.getAdapter().getCount();
            this.f34554a.f34529j.mo31711c();
            if (!this.f34554a.getAdapter().hasStableIds() || this.f34555b == null || this.f34554a.f34527h != 0 || this.f34554a.f34526g <= 0) {
                this.f34554a.mo31656d();
            } else {
                this.f34554a.onRestoreInstanceState(this.f34555b);
                this.f34555b = null;
            }
            this.f34554a.mo31653c();
            this.f34554a.requestLayout();
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$b */
    class C13058b extends C13065i implements Runnable {
        public final void run() {
            boolean z;
            View childAt = ExtendableListView.this.getChildAt(ExtendableListView.this.f34523d);
            if (childAt != null) {
                int i = ExtendableListView.this.f34523d;
                long itemId = ExtendableListView.this.f34522c.getItemId(ExtendableListView.this.f34523d + ExtendableListView.this.f34524e);
                if (!mo31715b() || ExtendableListView.this.f34525f) {
                    z = false;
                } else {
                    z = ExtendableListView.this.mo31648a(childAt, i + ExtendableListView.this.f34524e, itemId);
                }
                if (z) {
                    ExtendableListView.this.f34521b = 0;
                    ExtendableListView.this.setPressed(false);
                    childAt.setPressed(false);
                    return;
                }
                ExtendableListView.this.f34521b = 5;
            }
        }

        private C13058b() {
            super();
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$c */
    final class C13059c implements Runnable {
        public final void run() {
            if (ExtendableListView.this.f34521b == 3) {
                ExtendableListView.this.f34521b = 4;
                View childAt = ExtendableListView.this.getChildAt(ExtendableListView.this.f34523d);
                if (childAt != null && !childAt.hasFocusable()) {
                    ExtendableListView.this.f34520a = 0;
                    if (!ExtendableListView.this.f34525f) {
                        ExtendableListView.this.layoutChildren();
                        childAt.setPressed(true);
                        ExtendableListView.this.setPressed(true);
                        int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                        if (ExtendableListView.this.isLongClickable()) {
                            if (ExtendableListView.this.f34531l == null) {
                                ExtendableListView.this.f34531l = new C13058b();
                            }
                            ExtendableListView.this.f34531l.mo31714a();
                            ExtendableListView.this.postDelayed(ExtendableListView.this.f34531l, (long) longPressTimeout);
                        } else {
                            ExtendableListView.this.f34521b = 5;
                        }
                    } else {
                        ExtendableListView.this.f34521b = 5;
                    }
                }
            }
        }

        C13059c() {
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$d */
    public class C13060d {

        /* renamed from: a */
        public View f34558a;

        /* renamed from: b */
        public Object f34559b;

        /* renamed from: c */
        public boolean f34560c;
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$e */
    class C13061e implements Runnable {

        /* renamed from: b */
        private final Scroller f34562b;

        /* renamed from: c */
        private int f34563c;

        /* renamed from: a */
        public final void mo31700a() {
            this.f34563c = 0;
            ExtendableListView.this.f34521b = 0;
            ExtendableListView.this.mo31659g(0);
            ExtendableListView.this.removeCallbacks(this);
            this.f34562b.forceFinished(true);
        }

        public final void run() {
            int i;
            if (ExtendableListView.this.f34521b == 2) {
                if (ExtendableListView.this.f34526g == 0 || ExtendableListView.this.getChildCount() == 0) {
                    mo31700a();
                    return;
                }
                Scroller scroller = this.f34562b;
                boolean computeScrollOffset = scroller.computeScrollOffset();
                int currY = scroller.getCurrY();
                int i2 = this.f34563c - currY;
                if (i2 > 0) {
                    ExtendableListView.this.f34523d = ExtendableListView.this.f34524e;
                    i = Math.min(((ExtendableListView.this.getHeight() - ExtendableListView.this.getPaddingBottom()) - ExtendableListView.this.getPaddingTop()) - 1, i2);
                } else {
                    int childCount = ExtendableListView.this.getChildCount() - 1;
                    ExtendableListView.this.f34523d = ExtendableListView.this.f34524e + childCount;
                    i = Math.max(-(((ExtendableListView.this.getHeight() - ExtendableListView.this.getPaddingBottom()) - ExtendableListView.this.getPaddingTop()) - 1), i2);
                }
                boolean b = ExtendableListView.this.mo31651b(i, i);
                if (!computeScrollOffset || b) {
                    mo31700a();
                    return;
                }
                ExtendableListView.this.invalidate();
                this.f34563c = currY;
                ExtendableListView.this.mo31646a((Runnable) this);
            }
        }

        C13061e() {
            this.f34562b = new Scroller(ExtendableListView.this.getContext());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo31701a(int i) {
            int i2;
            if (i < 0) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = 0;
            }
            this.f34563c = i2;
            this.f34562b.forceFinished(true);
            this.f34562b.fling(0, i2, 0, i, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
            ExtendableListView.this.f34521b = 2;
            ExtendableListView.this.mo31646a((Runnable) this);
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$f */
    public static class C13062f extends LayoutParams {

        /* renamed from: a */
        boolean f34564a;

        /* renamed from: b */
        int f34565b;

        /* renamed from: c */
        long f34566c;

        /* renamed from: d */
        int f34567d;

        public C13062f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34566c = -1;
        }

        public C13062f(int i, int i2) {
            super(i, i2);
            this.f34566c = -1;
        }

        public C13062f(int i, int i2, int i3) {
            super(-1, -2);
            this.f34566c = -1;
            this.f34567d = 0;
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$g */
    class C13063g extends C13065i implements Runnable {

        /* renamed from: a */
        int f34568a;

        public final void run() {
            if (!ExtendableListView.this.f34525f) {
                ListAdapter listAdapter = ExtendableListView.this.f34522c;
                int i = this.f34568a;
                if (listAdapter != null && ExtendableListView.this.f34526g > 0 && i != -1 && i < listAdapter.getCount() && mo31715b()) {
                    View childAt = ExtendableListView.this.getChildAt(i);
                    if (childAt != null) {
                        int i2 = i + ExtendableListView.this.f34524e;
                        ExtendableListView.this.performItemClick(childAt, i2, listAdapter.getItemId(i2));
                    }
                }
            }
        }

        private C13063g() {
            super();
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$h */
    class C13064h {

        /* renamed from: a */
        final /* synthetic */ ExtendableListView f34570a;

        /* renamed from: b */
        private int f34571b;

        /* renamed from: c */
        private View[] f34572c;

        /* renamed from: d */
        private ArrayList<View>[] f34573d;

        /* renamed from: e */
        private int f34574e;

        /* renamed from: f */
        private ArrayList<View> f34575f;

        /* renamed from: g */
        private ArrayList<View> f34576g;

        /* renamed from: h */
        private C0905l<View> f34577h;

        /* renamed from: d */
        private static boolean m38148d(int i) {
            return i >= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo31711c() {
            if (this.f34577h != null) {
                this.f34577h.mo3438c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo31712d() {
            if (this.f34576g != null) {
                int size = this.f34576g.size();
                for (int i = 0; i < size; i++) {
                    this.f34570a.removeDetachedView((View) this.f34576g.get(i), false);
                }
                this.f34576g.clear();
            }
        }

        /* renamed from: f */
        private void m38149f() {
            int length = this.f34572c.length;
            int i = this.f34574e;
            ArrayList<View>[] arrayListArr = this.f34573d;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                ArrayList<View> arrayList = arrayListArr[i3];
                int size = arrayList.size();
                int i4 = size - length;
                int i5 = size - 1;
                int i6 = 0;
                while (i6 < i4) {
                    int i7 = i5 - 1;
                    this.f34570a.removeDetachedView((View) arrayList.remove(i5), false);
                    i6++;
                    i5 = i7;
                }
            }
            if (this.f34577h != null) {
                while (i2 < this.f34577h.mo3435b()) {
                    if (!C0991u.m4210d((View) this.f34577h.mo3443e(i2))) {
                        this.f34577h.mo3439c(i2);
                        i2--;
                    }
                    i2++;
                }
            }
        }

        /* renamed from: a */
        public final void mo31704a() {
            if (this.f34574e == 1) {
                ArrayList<View> arrayList = this.f34575f;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).forceLayout();
                }
            } else {
                int i2 = this.f34574e;
                for (int i3 = 0; i3 < i2; i3++) {
                    ArrayList<View> arrayList2 = this.f34573d[i3];
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((View) arrayList2.get(i4)).forceLayout();
                    }
                }
            }
            if (this.f34577h != null) {
                int b = this.f34577h.mo3435b();
                for (int i5 = 0; i5 < b; i5++) {
                    ((View) this.f34577h.mo3443e(i5)).forceLayout();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo31709b() {
            if (this.f34574e == 1) {
                ArrayList<View> arrayList = this.f34575f;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    this.f34570a.removeDetachedView((View) arrayList.remove((size - 1) - i), false);
                }
            } else {
                int i2 = this.f34574e;
                for (int i3 = 0; i3 < i2; i3++) {
                    ArrayList<View> arrayList2 = this.f34573d[i3];
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        this.f34570a.removeDetachedView((View) arrayList2.remove((size2 - 1) - i4), false);
                    }
                }
            }
            if (this.f34577h != null) {
                this.f34577h.mo3438c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo31713e() {
            boolean z;
            View[] viewArr = this.f34572c;
            if (this.f34574e > 1) {
                z = true;
            } else {
                z = false;
            }
            ArrayList<View> arrayList = this.f34575f;
            for (int length = viewArr.length - 1; length >= 0; length--) {
                View view = viewArr[length];
                if (view != null) {
                    C13062f fVar = (C13062f) view.getLayoutParams();
                    viewArr[length] = null;
                    boolean d = C0991u.m4210d(view);
                    int i = fVar.f34567d;
                    if (!m38148d(i) || d) {
                        if (i != -2 || d) {
                            this.f34570a.removeDetachedView(view, false);
                        }
                        if (d) {
                            if (this.f34577h == null) {
                                this.f34577h = new C0905l<>();
                            }
                            this.f34577h.mo3437b(this.f34571b + length, view);
                        }
                    } else {
                        if (z) {
                            arrayList = this.f34573d[i];
                        }
                        fVar.f34565b = this.f34571b + length;
                        arrayList.add(view);
                    }
                }
            }
            m38149f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final View mo31708b(int i) {
            int i2 = i - this.f34571b;
            View[] viewArr = this.f34572c;
            if (i2 < 0 || i2 >= viewArr.length) {
                return null;
            }
            View view = viewArr[i2];
            viewArr[i2] = null;
            return view;
        }

        /* renamed from: a */
        public final void mo31705a(int i) {
            if (i > 0) {
                ArrayList<View>[] arrayListArr = new ArrayList[i];
                for (int i2 = 0; i2 < i; i2++) {
                    arrayListArr[i2] = new ArrayList<>();
                }
                this.f34574e = i;
                this.f34575f = arrayListArr[0];
                this.f34573d = arrayListArr;
                return;
            }
            throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final View mo31710c(int i) {
            if (this.f34574e == 1) {
                return ExtendableListView.m38083a(this.f34575f, i);
            }
            int itemViewType = this.f34570a.f34522c.getItemViewType(i);
            if (itemViewType < 0 || itemViewType >= this.f34573d.length) {
                return null;
            }
            return ExtendableListView.m38083a(this.f34573d[itemViewType], i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo31706a(int i, int i2) {
            if (this.f34572c.length < i) {
                this.f34572c = new View[i];
            }
            this.f34571b = i2;
            View[] viewArr = this.f34572c;
            for (int i3 = 0; i3 < i; i3++) {
                View childAt = this.f34570a.getChildAt(i3);
                C13062f fVar = (C13062f) childAt.getLayoutParams();
                if (!(fVar == null || fVar.f34567d == -2)) {
                    viewArr[i3] = childAt;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo31707a(View view, int i) {
            C13062f fVar = (C13062f) view.getLayoutParams();
            if (fVar != null) {
                fVar.f34565b = i;
                int i2 = fVar.f34567d;
                boolean d = C0991u.m4210d(view);
                if (!m38148d(i2) || d) {
                    if (i2 != -2 || d) {
                        if (this.f34576g == null) {
                            this.f34576g = new ArrayList<>();
                        }
                        this.f34576g.add(view);
                    }
                    if (d) {
                        if (this.f34577h == null) {
                            this.f34577h = new C0905l<>();
                        }
                        this.f34577h.mo3437b(i, view);
                    }
                } else if (this.f34574e == 1) {
                    this.f34575f.add(view);
                } else {
                    this.f34573d[i2].add(view);
                }
            }
        }
    }

    /* renamed from: com.etsy.android.grid.ExtendableListView$i */
    class C13065i {

        /* renamed from: a */
        private int f34578a;

        /* renamed from: a */
        public final void mo31714a() {
            this.f34578a = ExtendableListView.this.getWindowAttachCount();
        }

        /* renamed from: b */
        public final boolean mo31715b() {
            if (!ExtendableListView.this.hasWindowFocus() || ExtendableListView.this.getWindowAttachCount() != this.f34578a) {
                return false;
            }
            return true;
        }

        private C13065i() {
        }
    }

    /* renamed from: a */
    public void mo31640a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31642a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo31650b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo31654c(int i, int i2) {
    }

    public ListAdapter getAdapter() {
        return this.f34522c;
    }

    public int getCount() {
        return this.f34526g;
    }

    public View getSelectedView() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
    }

    public void onWindowFocusChanged(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31641a(int i, int i2) {
        if (getChildCount() > 0) {
            m38116k();
            this.f34529j.mo31709b();
            this.f34525f = true;
            mo31656d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31647a(boolean z) {
        if (z) {
            m38118l(getChildCount());
        } else {
            m38120m(getChildCount());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13062f mo31639a(View view) {
        return m38090b(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31645a(View view, C13062f fVar) {
        int i;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f34512F, getListPaddingLeft() + getListPaddingRight(), fVar.width);
        int i2 = fVar.height;
        if (i2 > 0) {
            i = MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else {
            i = MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(childMeasureSpec, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31644a(View view, int i, boolean z, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31643a(View view, int i, boolean z, int i2, int i3) {
        view.offsetLeftAndRight(i2 - view.getLeft());
        view.offsetTopAndBottom(i3 - view.getTop());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo31638a(int i) {
        return getListPaddingLeft();
    }

    /* renamed from: a */
    public final void mo31646a(Runnable runnable) {
        C0991u.m4190a((View) this, runnable);
    }

    /* renamed from: a */
    public final boolean mo31648a(View view, int i, long j) {
        OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        boolean onItemLongClick = onItemLongClickListener != null ? onItemLongClickListener.onItemLongClick(this, view, i, j) : false;
        if (onItemLongClick) {
            performHapticFeedback(0);
        }
        return onItemLongClick;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m38100e();
    }

    public int getFooterViewsCount() {
        return this.f34517K.size();
    }

    public int getHeaderViewsCount() {
        return this.f34516J.size();
    }

    /* renamed from: e */
    private static C13062f m38100e() {
        return new C13062f(-1, -2, 0);
    }

    /* renamed from: g */
    private boolean m38106g() {
        if (getChildCount() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m38111i() {
        if (this.f34538s == null) {
            this.f34538s = VelocityTracker.obtain();
        }
    }

    /* renamed from: j */
    private void m38114j() {
        if (this.f34538s != null) {
            this.f34538s.recycle();
            this.f34538s = null;
        }
    }

    /* renamed from: k */
    private void m38116k() {
        if (this.f34513G != null) {
            this.f34513G.mo31700a();
        }
    }

    public int getFirstVisiblePosition() {
        return Math.max(0, this.f34524e - getHeaderViewsCount());
    }

    public void requestLayout() {
        if (!this.f34510D && !this.f34542w) {
            super.requestLayout();
        }
    }

    /* renamed from: f */
    private void m38104f() {
        if (getChildCount() > 0) {
            int highestChildTop = getHighestChildTop() - getListPaddingTop();
            if (highestChildTop < 0) {
                highestChildTop = 0;
            }
            if (highestChildTop != 0) {
                mo31658f(-highestChildTop);
            }
        }
    }

    /* renamed from: h */
    private void m38108h() {
        if (this.f34538s == null) {
            this.f34538s = VelocityTracker.obtain();
        } else {
            this.f34538s.clear();
        }
    }

    /* renamed from: l */
    private void m38117l() {
        switch (this.f34521b) {
            case 0:
                mo31659g(0);
                break;
            case 1:
                mo31659g(1);
                return;
            case 2:
                mo31659g(2);
                return;
        }
    }

    /* renamed from: m */
    private void m38119m() {
        if (this.f34518L != null) {
            this.f34518L.onScroll(this, this.f34524e, getChildCount(), this.f34526g);
        }
    }

    /* access modifiers changed from: protected */
    public int getFirstChildTop() {
        if (m38106g()) {
            return getChildAt(0).getTop();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getHighestChildTop() {
        if (m38106g()) {
            return getChildAt(0).getTop();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getLastChildBottom() {
        if (m38106g()) {
            return getChildAt(getChildCount() - 1).getBottom();
        }
        return 0;
    }

    public int getLastVisiblePosition() {
        int i;
        int childCount = (this.f34524e + getChildCount()) - 1;
        if (this.f34522c != null) {
            i = this.f34522c.getCount() - 1;
        } else {
            i = 0;
        }
        return Math.min(childCount, i);
    }

    /* access modifiers changed from: protected */
    public int getLowestChildBottom() {
        if (m38106g()) {
            return getChildAt(getChildCount() - 1).getBottom();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34522c != null) {
            this.f34525f = true;
            this.f34527h = this.f34526g;
            this.f34526g = this.f34522c.getCount();
        }
        this.f34509C = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34529j.mo31709b();
        if (this.f34513G != null) {
            removeCallbacks(this.f34513G);
        }
        this.f34509C = false;
    }

    /* renamed from: n */
    private void m38121n() {
        m38087a(this.f34516J);
        m38087a(this.f34517K);
        removeAllViewsInLayout();
        this.f34524e = 0;
        this.f34525f = false;
        this.f34529j.mo31709b();
        this.f34536q = false;
        this.f34519M = null;
        this.f34520a = 0;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void handleDataChanged() {
        super.handleDataChanged();
        int i = this.f34526g;
        if (i <= 0 || !this.f34536q) {
            this.f34520a = 1;
            this.f34536q = false;
            this.f34519M = null;
            return;
        }
        this.f34536q = false;
        this.f34519M = null;
        this.f34520a = 2;
        this.f34532m = Math.min(Math.max(0, this.f34532m), i - 1);
    }

    /* renamed from: c */
    public final void mo31653c() {
        boolean z;
        if (getAdapter() == null || getAdapter().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (isInFilterMode()) {
            z = false;
        }
        View emptyView = getEmptyView();
        if (z) {
            if (emptyView != null) {
                emptyView.setVisibility(0);
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.f34525f) {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }
        } else {
            if (emptyView != null) {
                emptyView.setVisibility(8);
            }
            setVisibility(0);
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        ListSavedState listSavedState = new ListSavedState(super.onSaveInstanceState());
        if (this.f34519M != null) {
            listSavedState.f34549c = this.f34519M.f34549c;
            listSavedState.f34550d = this.f34519M.f34550d;
            listSavedState.f34551e = this.f34519M.f34551e;
            listSavedState.f34552f = this.f34519M.f34552f;
            listSavedState.f34553g = this.f34519M.f34553g;
            return listSavedState;
        }
        if (getChildCount() <= 0 || this.f34526g <= 0) {
            z = false;
        } else {
            z = true;
        }
        listSavedState.f34549c = getSelectedItemId();
        listSavedState.f34553g = getHeight();
        if (!z || this.f34524e <= 0) {
            listSavedState.f34551e = 0;
            listSavedState.f34550d = -1;
            listSavedState.f34552f = 0;
        } else {
            listSavedState.f34551e = getChildAt(0).getTop();
            int i = this.f34524e;
            if (i >= this.f34526g) {
                i = this.f34526g - 1;
            }
            listSavedState.f34552f = i;
            listSavedState.f34550d = this.f34522c.getItemId(i);
        }
        return listSavedState;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo31656d() {
        if (getChildCount() > 0) {
            this.f34536q = true;
            this.f34535p = (long) getHeight();
            View childAt = getChildAt(0);
            ListAdapter adapter = getAdapter();
            if (this.f34524e < 0 || this.f34524e >= adapter.getCount()) {
                this.f34534o = -1;
            } else {
                this.f34534o = adapter.getItemId(this.f34524e);
            }
            if (childAt != null) {
                this.f34533n = childAt.getTop();
            }
            this.f34532m = this.f34524e;
        }
    }

    /* access modifiers changed from: protected */
    public void layoutChildren() {
        if (!this.f34510D) {
            this.f34510D = true;
            try {
                super.layoutChildren();
                invalidate();
                if (this.f34522c == null) {
                    m38121n();
                    m38119m();
                    return;
                }
                int listPaddingTop = getListPaddingTop();
                int childCount = getChildCount();
                View view = null;
                if (this.f34520a == 0) {
                    view = getChildAt(0);
                }
                boolean z = this.f34525f;
                if (z) {
                    handleDataChanged();
                }
                if (this.f34526g == 0) {
                    m38121n();
                    m38119m();
                    this.f34510D = false;
                } else if (this.f34526g == this.f34522c.getCount()) {
                    int i = this.f34524e;
                    C13064h hVar = this.f34529j;
                    if (z) {
                        for (int i2 = 0; i2 < childCount; i2++) {
                            hVar.mo31707a(getChildAt(i2), i + i2);
                        }
                    } else {
                        hVar.mo31706a(childCount, i);
                    }
                    detachAllViewsFromParent();
                    hVar.mo31712d();
                    switch (this.f34520a) {
                        case 1:
                            this.f34524e = 0;
                            mo31640a();
                            m38104f();
                            m38115k(listPaddingTop);
                            m38104f();
                            break;
                        case 2:
                            m38103f(this.f34532m, this.f34533n);
                            break;
                        default:
                            if (childCount != 0) {
                                if (this.f34524e >= this.f34526g) {
                                    m38103f(0, listPaddingTop);
                                    break;
                                } else {
                                    int i3 = this.f34524e;
                                    if (view != null) {
                                        listPaddingTop = view.getTop();
                                    }
                                    m38103f(i3, listPaddingTop);
                                    break;
                                }
                            } else {
                                m38115k(listPaddingTop);
                                break;
                            }
                    }
                    hVar.mo31713e();
                    this.f34525f = false;
                    this.f34536q = false;
                    this.f34520a = 0;
                    m38119m();
                    this.f34510D = false;
                } else {
                    StringBuilder sb = new StringBuilder("The content of the adapter has changed but ExtendableListView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in ExtendableListView(");
                    sb.append(getId());
                    sb.append(", ");
                    sb.append(getClass());
                    sb.append(") with Adapter(");
                    sb.append(this.f34522c.getClass());
                    sb.append(")]");
                    throw new IllegalStateException(sb.toString());
                }
            } finally {
                this.f34510D = false;
            }
        }
    }

    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.f34530k = z;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
        this.f34518L = onScrollListener;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m38114j();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* renamed from: a */
    private void m38084a(float f) {
        if (this.f34513G == null) {
            this.f34513G = new C13061e();
        }
        this.f34513G.mo31701a((int) (-f));
    }

    /* renamed from: b */
    private C13062f m38090b(View view) {
        C13062f fVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            fVar = null;
        } else if (layoutParams instanceof C13062f) {
            fVar = (C13062f) layoutParams;
        } else {
            fVar = new C13062f(layoutParams);
        }
        if (fVar == null) {
            return m38100e();
        }
        return fVar;
    }

    /* renamed from: c */
    private boolean m38095c(MotionEvent motionEvent) {
        this.f34521b = 0;
        setPressed(false);
        invalidate();
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f34531l);
        }
        m38114j();
        this.f34508B = -1;
        return true;
    }

    /* renamed from: g */
    private boolean m38107g(MotionEvent motionEvent) {
        m38109h(motionEvent);
        int i = this.f34544y;
        int i2 = this.f34543x;
        int pointToPosition = pointToPosition(i, i2);
        if (pointToPosition >= 0) {
            this.f34523d = pointToPosition;
        }
        this.f34507A = i2;
        return true;
    }

    /* renamed from: j */
    private int m38113j(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i <= getChildAt(i2).getBottom()) {
                    return this.f34524e + i2;
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    private View m38115k(int i) {
        this.f34524e = Math.min(this.f34524e, this.f34526g - 1);
        if (this.f34524e < 0) {
            this.f34524e = 0;
        }
        return m38096d(this.f34524e, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo31655d(int i) {
        int childCount = getChildCount();
        if (childCount > 0) {
            return getChildAt(childCount - 1).getBottom();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo31657e(int i) {
        int childCount = getChildCount();
        if (childCount != 0 && childCount > 0) {
            return getChildAt(0).getTop();
        }
        return 0;
    }

    public void setSelection(int i) {
        if (i >= 0) {
            this.f34520a = 2;
            this.f34533n = getListPaddingTop();
            this.f34524e = 0;
            if (this.f34536q) {
                this.f34532m = i;
                this.f34534o = this.f34522c.getItemId(i);
            }
            requestLayout();
        }
    }

    /* renamed from: b */
    private void m38092b(boolean z) {
        int childCount = getChildCount();
        if (z) {
            int i = this.f34524e + childCount;
            m38096d(i, mo31649b(i));
        } else {
            int i2 = this.f34524e - 1;
            m38099e(i2, mo31652c(i2));
        }
        mo31647a(z);
    }

    /* renamed from: h */
    private void m38109h(MotionEvent motionEvent) {
        int i;
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f34508B) {
            if (action == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f34544y = (int) motionEvent.getX(i);
            this.f34543x = (int) motionEvent.getY(i);
            this.f34508B = motionEvent.getPointerId(i);
            m38114j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo31652c(int i) {
        int i2;
        int childCount = getChildCount();
        if (this.f34530k) {
            i2 = getListPaddingBottom();
        } else {
            i2 = 0;
        }
        if (childCount > 0) {
            return getChildAt(0).getTop();
        }
        return getHeight() - i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo31659g(int i) {
        if (i != this.f34537r) {
            this.f34537r = i;
            if (this.f34518L != null) {
                this.f34518L.onScrollStateChanged(this, i);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ListSavedState listSavedState = (ListSavedState) parcelable;
        super.onRestoreInstanceState(listSavedState.f34505b);
        this.f34525f = true;
        this.f34535p = (long) listSavedState.f34553g;
        if (listSavedState.f34550d >= 0) {
            this.f34536q = true;
            this.f34519M = listSavedState;
            this.f34534o = listSavedState.f34550d;
            this.f34532m = listSavedState.f34552f;
            this.f34533n = listSavedState.f34551e;
        }
        requestLayout();
    }

    /* renamed from: b */
    private boolean m38093b(MotionEvent motionEvent) {
        int a = C0978j.m4130a(motionEvent, this.f34508B);
        if (a < 0) {
            return false;
        }
        int d = (int) C0978j.m4134d(motionEvent, a);
        if (this.f34525f) {
            layoutChildren();
        }
        int i = this.f34521b;
        if (i != 1) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                    m38110h(d);
                    break;
            }
        } else {
            m38112i(d);
        }
        return true;
    }

    /* renamed from: d */
    private boolean m38098d(MotionEvent motionEvent) {
        int i = this.f34521b;
        if (i == 1) {
            return m38102e(motionEvent);
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
                return m38105f(motionEvent);
            default:
                setPressed(false);
                invalidate();
                Handler handler = getHandler();
                if (handler != null) {
                    handler.removeCallbacks(this.f34531l);
                }
                m38114j();
                this.f34508B = -1;
                return true;
        }
    }

    /* renamed from: e */
    private boolean m38102e(MotionEvent motionEvent) {
        boolean z;
        if (m38106g()) {
            int firstChildTop = getFirstChildTop();
            int lastChildBottom = getLastChildBottom();
            if (this.f34524e != 0 || firstChildTop < getListPaddingTop() || this.f34524e + getChildCount() >= this.f34526g || lastChildBottom > getHeight() - getListPaddingBottom()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                this.f34538s.computeCurrentVelocity(1000, (float) this.f34540u);
                float yVelocity = this.f34538s.getYVelocity(this.f34508B);
                if (Math.abs(yVelocity) > ((float) this.f34541v)) {
                    m38084a(yVelocity);
                    this.f34521b = 2;
                    this.f34543x = 0;
                    invalidate();
                    return true;
                }
            }
        }
        m38116k();
        m38114j();
        this.f34521b = 0;
        return true;
    }

    /* renamed from: h */
    private boolean m38110h(int i) {
        int i2;
        int i3 = i - this.f34543x;
        if (Math.abs(i3) <= this.f34539t) {
            return false;
        }
        this.f34521b = 1;
        if (i3 > 0) {
            i2 = this.f34539t;
        } else {
            i2 = -this.f34539t;
        }
        this.f34545z = i2;
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f34531l);
        }
        setPressed(false);
        View childAt = getChildAt(this.f34523d - this.f34524e);
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        m38112i(i);
        return true;
    }

    /* renamed from: i */
    private void m38112i(int i) {
        int i2;
        int i3;
        int i4 = i - this.f34543x;
        int i5 = i4 - this.f34545z;
        if (this.f34507A != Integer.MIN_VALUE) {
            i2 = i - this.f34507A;
        } else {
            i2 = i5;
        }
        if (this.f34521b == 1 && i != this.f34507A) {
            if (Math.abs(i4) > this.f34539t) {
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (this.f34523d >= 0) {
                i3 = this.f34523d - this.f34524e;
            } else {
                i3 = getChildCount() / 2;
            }
            if (i2 != 0) {
                mo31651b(i5, i2);
            }
            if (getChildAt(i3) != null) {
                this.f34543x = i;
            }
            this.f34507A = i;
        }
    }

    /* renamed from: l */
    private void m38118l(int i) {
        if ((this.f34524e + i) - 1 == this.f34526g - 1 && i > 0) {
            int bottom = ((getBottom() - getTop()) - getListPaddingBottom()) - getLowestChildBottom();
            int highestChildTop = getHighestChildTop();
            if (bottom <= 0) {
                return;
            }
            if (this.f34524e > 0 || highestChildTop < getListPaddingTop()) {
                if (this.f34524e == 0) {
                    bottom = Math.min(bottom, getListPaddingTop() - highestChildTop);
                }
                mo31658f(bottom);
                if (this.f34524e > 0) {
                    int i2 = this.f34524e - 1;
                    m38099e(i2, mo31657e(i2));
                    m38104f();
                }
            }
        }
    }

    /* renamed from: m */
    private void m38120m(int i) {
        if (this.f34524e == 0 && i > 0) {
            int top = (getTop() - getBottom()) - getListPaddingBottom();
            int highestChildTop = getHighestChildTop() - getListPaddingTop();
            int lowestChildBottom = getLowestChildBottom();
            int i2 = (this.f34524e + i) - 1;
            if (highestChildTop > 0) {
                if (i2 < this.f34526g - 1 || lowestChildBottom > top) {
                    if (i2 == this.f34526g - 1) {
                        highestChildTop = Math.min(highestChildTop, lowestChildBottom - top);
                    }
                    mo31658f(-highestChildTop);
                    if (i2 < this.f34526g - 1) {
                        int i3 = i2 + 1;
                        m38096d(i3, mo31655d(i3));
                        m38104f();
                    }
                } else if (i2 == this.f34526g - 1) {
                    m38104f();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo31658f(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).offsetTopAndBottom(i);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (isEnabled()) {
            m38111i();
            this.f34538s.addMovement(motionEvent);
            if (!m38106g()) {
                return false;
            }
            int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
            if (action != 6) {
                switch (action) {
                    case 0:
                        z = m38088a(motionEvent);
                        break;
                    case 1:
                        z = m38098d(motionEvent);
                        break;
                    case 2:
                        z = m38093b(motionEvent);
                        break;
                    case 3:
                        z = m38095c(motionEvent);
                        break;
                }
            } else {
                z = m38107g(motionEvent);
            }
            m38117l();
            return z;
        } else if (isClickable() || isLongClickable()) {
            return true;
        } else {
            return false;
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        int i;
        if (this.f34522c != null) {
            this.f34522c.unregisterDataSetObserver(this.f34511E);
        }
        if (this.f34516J.size() > 0 || this.f34517K.size() > 0) {
            this.f34522c = new C13070a(this.f34516J, this.f34517K, listAdapter);
        } else {
            this.f34522c = listAdapter;
        }
        this.f34525f = true;
        if (this.f34522c != null) {
            i = this.f34522c.getCount();
        } else {
            i = 0;
        }
        this.f34526g = i;
        if (this.f34522c != null) {
            this.f34522c.registerDataSetObserver(this.f34511E);
            this.f34529j.mo31705a(this.f34522c.getViewTypeCount());
        }
        requestLayout();
    }

    /* renamed from: f */
    private boolean m38105f(MotionEvent motionEvent) {
        Runnable runnable;
        int i = this.f34523d;
        if (i >= 0) {
            final View childAt = getChildAt(i);
            if (childAt != null && !childAt.hasFocusable()) {
                if (this.f34521b != 3) {
                    childAt.setPressed(false);
                }
                if (this.f34514H == null) {
                    invalidate();
                    this.f34514H = new C13063g();
                }
                final C13063g gVar = this.f34514H;
                gVar.f34568a = i;
                gVar.mo31714a();
                if (this.f34521b == 3 || this.f34521b == 4) {
                    Handler handler = getHandler();
                    if (handler != null) {
                        if (this.f34521b == 3) {
                            runnable = this.f34515I;
                        } else {
                            runnable = this.f34531l;
                        }
                        handler.removeCallbacks(runnable);
                    }
                    this.f34520a = 0;
                    if (this.f34525f || i < 0 || !this.f34522c.isEnabled(i)) {
                        this.f34521b = 0;
                    } else {
                        this.f34521b = 4;
                        layoutChildren();
                        childAt.setPressed(true);
                        setPressed(true);
                        postDelayed(new Runnable() {
                            public final void run() {
                                childAt.setPressed(false);
                                ExtendableListView.this.setPressed(false);
                                if (!ExtendableListView.this.f34525f) {
                                    ExtendableListView.this.post(gVar);
                                }
                                ExtendableListView.this.f34521b = 0;
                            }
                        }, (long) ViewConfiguration.getPressedStateDuration());
                    }
                    return true;
                } else if (!this.f34525f && i >= 0 && this.f34522c.isEnabled(i)) {
                    post(gVar);
                }
            }
        }
        this.f34521b = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo31649b(int i) {
        int i2;
        int childCount = getChildCount();
        if (this.f34530k) {
            i2 = getListPaddingTop();
        } else {
            i2 = 0;
        }
        if (childCount > 0) {
            return getChildAt(childCount - 1).getBottom();
        }
        return i2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (!this.f34509C) {
            return false;
        }
        int i = action & NormalGiftView.ALPHA_255;
        if (i != 6) {
            switch (i) {
                case 0:
                    int i2 = this.f34521b;
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    this.f34508B = motionEvent.getPointerId(0);
                    int j = m38113j(y);
                    if (i2 != 2 && j >= 0) {
                        this.f34544y = x;
                        this.f34543x = y;
                        this.f34523d = j;
                        this.f34521b = 3;
                    }
                    this.f34507A = Integer.MIN_VALUE;
                    m38108h();
                    this.f34538s.addMovement(motionEvent);
                    if (i2 == 2) {
                        return true;
                    }
                    break;
                case 1:
                case 3:
                    this.f34521b = 0;
                    this.f34508B = -1;
                    m38114j();
                    mo31659g(0);
                    break;
                case 2:
                    if (this.f34521b == 3) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f34508B);
                        if (findPointerIndex == -1) {
                            this.f34508B = motionEvent.getPointerId(0);
                            findPointerIndex = 0;
                        }
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        m38111i();
                        this.f34538s.addMovement(motionEvent);
                        if (m38110h(y2)) {
                            return true;
                        }
                    }
                    break;
            }
        } else {
            m38109h(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    private static void m38087a(ArrayList<C13060d> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ViewGroup.LayoutParams layoutParams = ((C13060d) it.next()).f34558a.getLayoutParams();
                if (layoutParams instanceof C13062f) {
                    ((C13062f) layoutParams).f34564a = false;
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m38088a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int pointToPosition = pointToPosition(x, y);
        this.f34538s.clear();
        this.f34508B = C0978j.m4132b(motionEvent, 0);
        if (this.f34521b != 2 && !this.f34525f && pointToPosition >= 0 && getAdapter().isEnabled(pointToPosition)) {
            this.f34521b = 3;
            if (this.f34515I == null) {
                this.f34515I = new C13059c();
            }
            postDelayed(this.f34515I, (long) ViewConfiguration.getTapTimeout());
            if (motionEvent.getEdgeFlags() != 0 && pointToPosition < 0) {
                return false;
            }
        } else if (this.f34521b == 2) {
            this.f34521b = 1;
            this.f34545z = 0;
            pointToPosition = m38113j(y);
        }
        this.f34544y = x;
        this.f34543x = y;
        this.f34523d = pointToPosition;
        this.f34507A = Integer.MIN_VALUE;
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        this.f34512F = i;
    }

    /* renamed from: d */
    private View m38096d(int i, int i2) {
        int height = getHeight();
        if (this.f34530k) {
            height -= getListPaddingBottom();
        }
        while (i2 < height && i < this.f34526g) {
            m38081a(i, i2, true, false);
            i++;
            i2 = mo31655d(i);
        }
        return null;
    }

    /* renamed from: e */
    private View m38099e(int i, int i2) {
        int i3;
        if (this.f34530k) {
            i3 = getListPaddingTop();
        } else {
            i3 = 0;
        }
        while (true) {
            if ((i2 > i3 || mo31650b()) && i >= 0) {
                m38081a(i, i2, false, false);
                i--;
                i2 = mo31657e(i);
            }
        }
        this.f34524e = i + 1;
        return null;
    }

    /* renamed from: f */
    private View m38103f(int i, int i2) {
        m38081a(i, i2, true, false);
        this.f34524e = i;
        int i3 = i - 1;
        int e = mo31657e(i3);
        int i4 = i + 1;
        int d = mo31655d(i4);
        m38099e(i3, e);
        m38104f();
        m38096d(i4, d);
        int childCount = getChildCount();
        if (childCount > 0) {
            m38118l(childCount);
        }
        return null;
    }

    /* renamed from: a */
    private View m38082a(int i, boolean[] zArr) {
        zArr[0] = false;
        View c = this.f34529j.mo31710c(i);
        if (c == null) {
            return this.f34522c.getView(i, null, this);
        }
        View view = this.f34522c.getView(i, c, this);
        if (view != c) {
            this.f34529j.mo31707a(c, i);
            return view;
        }
        zArr[0] = true;
        return view;
    }

    /* renamed from: a */
    static View m38083a(ArrayList<View> arrayList, int i) {
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList.get(i2);
            if (((C13062f) view.getLayoutParams()).f34565b == i) {
                arrayList.remove(i2);
                return view;
            }
        }
        return (View) arrayList.remove(size - 1);
    }

    /* renamed from: b */
    public final boolean mo31651b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        int i6;
        int i7;
        int i8 = i2;
        if (!m38106g()) {
            return true;
        }
        int highestChildTop = getHighestChildTop();
        int lowestChildBottom = getLowestChildBottom();
        if (this.f34530k) {
            i4 = getListPaddingTop();
            i3 = getListPaddingBottom();
        } else {
            i4 = 0;
            i3 = 0;
        }
        int height = getHeight();
        int firstChildTop = i4 - getFirstChildTop();
        int lastChildBottom = getLastChildBottom() - (height - i3);
        int listPaddingBottom = (height - getListPaddingBottom()) - getListPaddingTop();
        if (i8 < 0) {
            i5 = Math.max(-(listPaddingBottom - 1), i8);
        } else {
            i5 = Math.min(listPaddingBottom - 1, i8);
        }
        int i9 = this.f34524e;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom2 = height - getListPaddingBottom();
        int childCount = getChildCount();
        if (i9 != 0 || highestChildTop < listPaddingTop || i5 < 0) {
            z = false;
        } else {
            z = true;
        }
        if (i9 + childCount != this.f34526g || lowestChildBottom > listPaddingBottom2 || i5 > 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            if (i5 != 0) {
                return true;
            }
            return false;
        } else if (!z2) {
            if (i5 < 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int headerViewsCount = getHeaderViewsCount();
            int footerViewsCount = this.f34526g - getFooterViewsCount();
            if (!z3) {
                int i10 = height - i5;
                if (this.f34530k) {
                    i10 -= getListPaddingBottom();
                }
                i7 = 0;
                int i11 = 0;
                for (int i12 = childCount - 1; i12 >= 0; i12--) {
                    View childAt = getChildAt(i12);
                    if (childAt.getTop() <= i10) {
                        break;
                    }
                    i11 = i6 + 1;
                    int i13 = i9 + i12;
                    if (i13 >= headerViewsCount && i13 < footerViewsCount) {
                        this.f34529j.mo31707a(childAt, i13);
                    }
                    i7 = i12;
                }
            } else {
                int i14 = -i5;
                if (this.f34530k) {
                    i14 += getListPaddingTop();
                }
                i6 = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt2 = getChildAt(i15);
                    if (childAt2.getBottom() >= i14) {
                        break;
                    }
                    i6++;
                    int i16 = i9 + i15;
                    if (i16 >= headerViewsCount && i16 < footerViewsCount) {
                        this.f34529j.mo31707a(childAt2, i16);
                    }
                }
                i7 = 0;
            }
            this.f34510D = true;
            if (i6 > 0) {
                detachViewsFromParent(i7, i6);
                this.f34529j.mo31712d();
                mo31654c(i7, i6);
            }
            if (!awakenScrollBars()) {
                invalidate();
            }
            mo31658f(i5);
            if (z3) {
                this.f34524e += i6;
            }
            int abs = Math.abs(i5);
            if (firstChildTop < abs || lastChildBottom < abs) {
                m38092b(z3);
            }
            this.f34510D = false;
            m38119m();
            return false;
        } else if (i5 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo31641a(i, i2);
    }

    /* renamed from: a */
    private View m38081a(int i, int i2, boolean z, boolean z2) {
        mo31642a(i, z);
        if (!this.f34525f) {
            View b = this.f34529j.mo31708b(i);
            if (b != null) {
                m38085a(b, i, i2, z, false, true);
                return b;
            }
        }
        View a = m38082a(i, this.f34528i);
        m38085a(a, i, i2, z, false, this.f34528i[0]);
        return a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f34522c != null) {
            if (z) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    getChildAt(i5).forceLayout();
                }
                this.f34529j.mo31704a();
            }
            this.f34542w = true;
            layoutChildren();
            this.f34542w = false;
        }
    }

    /* renamed from: a */
    private void m38085a(View view, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        C13062f fVar;
        int i3;
        View view2 = view;
        int i4 = i;
        boolean isSelected = view.isSelected();
        int i5 = this.f34521b;
        if (i5 <= 3 || i5 > 0 || this.f34523d != i4) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4 != view.isPressed()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z3 || isSelected || view.isLayoutRequested()) {
            z6 = true;
        } else {
            z6 = false;
        }
        int itemViewType = this.f34522c.getItemViewType(i4);
        if (itemViewType == -2) {
            fVar = m38090b(view);
        } else {
            fVar = mo31639a(view);
        }
        fVar.f34567d = itemViewType;
        fVar.f34565b = i4;
        int i6 = -1;
        if (z3 || (fVar.f34564a && fVar.f34567d == -2)) {
            if (!z) {
                i6 = 0;
            }
            attachViewToParent(view, i6, fVar);
        } else {
            if (fVar.f34567d == -2) {
                fVar.f34564a = true;
            }
            if (!z) {
                i6 = 0;
            }
            addViewInLayout(view, i6, fVar, true);
        }
        if (isSelected) {
            view.setSelected(false);
        }
        if (z5) {
            view.setPressed(z4);
        }
        if (z6) {
            mo31645a(view, fVar);
        } else {
            cleanupLayoutState(view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (z) {
            i3 = i2;
        } else {
            i3 = i2 - measuredHeight;
        }
        int a = mo31638a(i4);
        if (z6) {
            mo31644a(view, i, z, a, i3, a + measuredWidth, i3 + measuredHeight);
            return;
        }
        mo31643a(view, i, z, a, i3);
    }
}
