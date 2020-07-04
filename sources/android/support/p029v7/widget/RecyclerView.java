package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.p022v4.p027os.C0885f;
import android.support.p022v4.util.C0903j;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.view.C0980l;
import android.support.p022v4.view.C0988r;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0995v;
import android.support.p022v4.view.NestedScrollingChild2;
import android.support.p022v4.view.p028a.C0941a;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.view.p028a.C0945c.C0947b;
import android.support.p022v4.view.p028a.C0945c.C0948c;
import android.support.p029v7.recyclerview.R$styleable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.widget.RecyclerView */
public class RecyclerView extends ViewGroup implements NestedScrollingChild2, C0988r {

    /* renamed from: L */
    static final Interpolator f4844L = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: M */
    private static final int[] f4845M = {16843830};

    /* renamed from: N */
    private static final int[] f4846N = {16842987};

    /* renamed from: O */
    private static final boolean f4847O;

    /* renamed from: P */
    private static final boolean f4848P;

    /* renamed from: Q */
    private static final Class<?>[] f4849Q = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};

    /* renamed from: a */
    static final boolean f4850a;

    /* renamed from: b */
    static final boolean f4851b;

    /* renamed from: c */
    static final boolean f4852c;

    /* renamed from: d */
    static final boolean f4853d;

    /* renamed from: A */
    final C1292u f4854A;

    /* renamed from: B */
    C1333ab f4855B;

    /* renamed from: C */
    C1335a f4856C;

    /* renamed from: D */
    final C1290s f4857D;

    /* renamed from: E */
    boolean f4858E;

    /* renamed from: F */
    boolean f4859F;

    /* renamed from: G */
    boolean f4860G;

    /* renamed from: H */
    RecyclerViewAccessibilityDelegate f4861H;

    /* renamed from: I */
    final int[] f4862I;

    /* renamed from: J */
    final int[] f4863J;

    /* renamed from: K */
    final List<C1293v> f4864K;

    /* renamed from: R */
    private final C1286q f4865R;

    /* renamed from: S */
    private SavedState f4866S;

    /* renamed from: T */
    private final Rect f4867T;

    /* renamed from: U */
    private final ArrayList<C1280l> f4868U;

    /* renamed from: V */
    private C1280l f4869V;

    /* renamed from: W */
    private int f4870W;

    /* renamed from: aA */
    private List<C1281m> f4871aA;

    /* renamed from: aB */
    private C1269b f4872aB;

    /* renamed from: aC */
    private C1265d f4873aC;

    /* renamed from: aD */
    private final int[] f4874aD;

    /* renamed from: aE */
    private C0980l f4875aE;

    /* renamed from: aF */
    private final int[] f4876aF;

    /* renamed from: aG */
    private final int[] f4877aG;

    /* renamed from: aH */
    private Runnable f4878aH;

    /* renamed from: aI */
    private final C1384b f4879aI;

    /* renamed from: aa */
    private boolean f4880aa;

    /* renamed from: ab */
    private int f4881ab;

    /* renamed from: ac */
    private final AccessibilityManager f4882ac;

    /* renamed from: ad */
    private List<C1278j> f4883ad;

    /* renamed from: ae */
    private int f4884ae;

    /* renamed from: af */
    private int f4885af;

    /* renamed from: ag */
    private C1266e f4886ag;

    /* renamed from: ah */
    private EdgeEffect f4887ah;

    /* renamed from: ai */
    private EdgeEffect f4888ai;

    /* renamed from: aj */
    private EdgeEffect f4889aj;

    /* renamed from: ak */
    private EdgeEffect f4890ak;

    /* renamed from: al */
    private int f4891al;

    /* renamed from: am */
    private int f4892am;

    /* renamed from: an */
    private VelocityTracker f4893an;

    /* renamed from: ao */
    private int f4894ao;

    /* renamed from: ap */
    private int f4895ap;

    /* renamed from: aq */
    private int f4896aq;

    /* renamed from: ar */
    private int f4897ar;

    /* renamed from: as */
    private int f4898as;

    /* renamed from: at */
    private C1279k f4899at;

    /* renamed from: au */
    private final int f4900au;

    /* renamed from: av */
    private final int f4901av;

    /* renamed from: aw */
    private float f4902aw;

    /* renamed from: ax */
    private float f4903ax;

    /* renamed from: ay */
    private boolean f4904ay;

    /* renamed from: az */
    private C1281m f4905az;

    /* renamed from: e */
    final C1284o f4906e;

    /* renamed from: f */
    C1387c f4907f;

    /* renamed from: g */
    C1428t f4908g;

    /* renamed from: h */
    final C1382bb f4909h;

    /* renamed from: i */
    boolean f4910i;

    /* renamed from: j */
    final Runnable f4911j;

    /* renamed from: k */
    final Rect f4912k;

    /* renamed from: l */
    final RectF f4913l;

    /* renamed from: m */
    C1262a f4914m;

    /* renamed from: n */
    C1273i f4915n;

    /* renamed from: o */
    C1285p f4916o;

    /* renamed from: p */
    final ArrayList<C1272h> f4917p;

    /* renamed from: q */
    boolean f4918q;

    /* renamed from: r */
    public boolean f4919r;

    /* renamed from: s */
    boolean f4920s;

    /* renamed from: t */
    boolean f4921t;

    /* renamed from: u */
    boolean f4922u;

    /* renamed from: v */
    public boolean f4923v;

    /* renamed from: w */
    boolean f4924w;

    /* renamed from: x */
    boolean f4925x;

    /* renamed from: y */
    boolean f4926y;

    /* renamed from: z */
    C1267f f4927z;

    /* renamed from: android.support.v7.widget.RecyclerView$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: c */
        C1293v f4933c;

        /* renamed from: d */
        final Rect f4934d = new Rect();

        /* renamed from: e */
        boolean f4935e = true;

        /* renamed from: f */
        boolean f4936f = false;

        public final boolean bk_() {
            return this.f4933c.isInvalid();
        }

        public final boolean bl_() {
            return this.f4933c.isRemoved();
        }

        public final boolean bm_() {
            return this.f4933c.isUpdated();
        }

        public final int bn_() {
            return this.f4933c.getLayoutPosition();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
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

    /* renamed from: android.support.v7.widget.RecyclerView$SavedState */
    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m6001a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m5999a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m5999a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m6001a(i);
            }

            /* renamed from: a */
            private static SavedState m6000a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m6000a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        Parcelable f4937a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5685a(SavedState savedState) {
            this.f4937a = savedState.f4937a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4937a, 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C1273i.class.getClassLoader();
            }
            this.f4937a = parcel.readParcelable(classLoader);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$SimpleOnItemTouchListener */
    public static class SimpleOnItemTouchListener implements C1280l {
        /* renamed from: a */
        public final void mo5689a(boolean z) {
        }

        /* renamed from: a */
        public final boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public final void mo5691b(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$a */
    public static abstract class C1262a<VH extends C1293v> {
        public boolean mHasStableIds = false;
        private final C1263b mObservable = new C1263b();

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public final boolean hasObservers() {
            return this.mObservable.mo5716a();
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo5717b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo5714a(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo5718b(i, 1);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo5719c(i, 1);
        }

        public void registerAdapterDataObserver(C1264c cVar) {
            this.mObservable.registerObserver(cVar);
        }

        public void unregisterAdapterDataObserver(C1264c cVar) {
            this.mObservable.unregisterObserver(cVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo5720d(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo5714a(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo5718b(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo5719c(i, i2);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo5715a(i, 1, obj);
        }

        public final void bindViewHolder(VH vh, int i) {
            vh.mPosition = i;
            if (this.mHasStableIds) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            C0885f.m3753a("RV OnBindView");
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            android.view.ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).f4935e = true;
            }
            C0885f.m3752a();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C0885f.m3753a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C0885f.m3752a();
            }
        }

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo5715a(i, i2, obj);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$b */
    static class C1263b extends Observable<C1264c> {
        C1263b() {
        }

        /* renamed from: a */
        public final boolean mo5716a() {
            if (!this.mObservers.isEmpty()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo5717b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1264c) this.mObservers.get(size)).mo5721a();
            }
        }

        /* renamed from: a */
        public final void mo5714a(int i, int i2) {
            mo5715a(i, i2, null);
        }

        /* renamed from: c */
        public final void mo5719c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1264c) this.mObservers.get(size)).mo5726c(i, i2);
            }
        }

        /* renamed from: d */
        public final void mo5720d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1264c) this.mObservers.get(size)).mo5723a(i, i2, 1);
            }
        }

        /* renamed from: b */
        public final void mo5718b(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1264c) this.mObservers.get(size)).mo5725b(i, i2);
            }
        }

        /* renamed from: a */
        public final void mo5715a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1264c) this.mObservers.get(size)).mo5724a(i, i2, obj);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$c */
    public static abstract class C1264c {
        /* renamed from: a */
        public void mo5721a() {
        }

        /* renamed from: a */
        public void mo5722a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo5723a(int i, int i2, int i3) {
        }

        /* renamed from: b */
        public void mo5725b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo5726c(int i, int i2) {
        }

        /* renamed from: a */
        public void mo5724a(int i, int i2, Object obj) {
            mo5722a(i, i2);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$d */
    public interface C1265d {
        /* renamed from: a */
        int mo5727a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$e */
    public static class C1266e {
        /* renamed from: a */
        protected static EdgeEffect m6019a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$f */
    public static abstract class C1267f {

        /* renamed from: a */
        private ArrayList<C1268a> f4938a = new ArrayList<>();

        /* renamed from: h */
        public C1269b f4939h;

        /* renamed from: i */
        public long f4940i = 120;

        /* renamed from: j */
        public long f4941j = 120;

        /* renamed from: k */
        public long f4942k = 250;

        /* renamed from: l */
        public long f4943l = 250;

        /* renamed from: android.support.v7.widget.RecyclerView$f$a */
        public interface C1268a {
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$b */
        interface C1269b {
            /* renamed from: a */
            void mo5738a(C1293v vVar);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$f$c */
        public static class C1270c {

            /* renamed from: a */
            public int f4944a;

            /* renamed from: b */
            public int f4945b;

            /* renamed from: c */
            public int f4946c;

            /* renamed from: d */
            public int f4947d;

            /* renamed from: a */
            public final C1270c mo5739a(C1293v vVar) {
                return m6038a(vVar, 0);
            }

            /* renamed from: a */
            private C1270c m6038a(C1293v vVar, int i) {
                View view = vVar.itemView;
                this.f4944a = view.getLeft();
                this.f4945b = view.getTop();
                this.f4946c = view.getRight();
                this.f4947d = view.getBottom();
                return this;
            }
        }

        /* renamed from: a */
        public abstract void mo5324a();

        /* renamed from: a */
        public abstract boolean mo5731a(C1293v vVar, C1270c cVar, C1270c cVar2);

        /* renamed from: a */
        public abstract boolean mo5732a(C1293v vVar, C1293v vVar2, C1270c cVar, C1270c cVar2);

        /* renamed from: b */
        public abstract boolean mo5331b();

        /* renamed from: b */
        public abstract boolean mo5733b(C1293v vVar, C1270c cVar, C1270c cVar2);

        /* renamed from: c */
        public abstract boolean mo5734c(C1293v vVar, C1270c cVar, C1270c cVar2);

        /* renamed from: d */
        public abstract void mo5335d();

        /* renamed from: d */
        public abstract void mo5336d(C1293v vVar);

        /* renamed from: g */
        public boolean mo5737g(C1293v vVar) {
            return true;
        }

        /* renamed from: c */
        private static C1270c mo5333c() {
            return new C1270c();
        }

        /* renamed from: e */
        public final void mo5735e() {
            int size = this.f4938a.size();
            for (int i = 0; i < size; i++) {
                this.f4938a.get(i);
            }
            this.f4938a.clear();
        }

        /* renamed from: a */
        public final boolean mo5730a(C1268a aVar) {
            return mo5331b();
        }

        /* renamed from: f */
        public final void mo5736f(C1293v vVar) {
            if (this.f4939h != null) {
                this.f4939h.mo5738a(vVar);
            }
        }

        /* renamed from: e */
        static int m6021e(C1293v vVar) {
            int i = vVar.mFlags & 14;
            if (vVar.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int i2 = vVar.mOldPosition;
                int adapterPosition = vVar.getAdapterPosition();
                if (!(i2 == -1 || adapterPosition == -1 || i2 == adapterPosition)) {
                    i |= 2048;
                }
            }
            return i;
        }

        /* renamed from: a */
        public final C1270c mo5728a(C1290s sVar, C1293v vVar) {
            return mo5333c().mo5739a(vVar);
        }

        /* renamed from: a */
        public boolean mo5329a(C1293v vVar, List<Object> list) {
            return mo5737g(vVar);
        }

        /* renamed from: a */
        public final C1270c mo5729a(C1290s sVar, C1293v vVar, int i, List<Object> list) {
            return mo5333c().mo5739a(vVar);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$g */
    class C1271g implements C1269b {
        C1271g() {
        }

        /* renamed from: a */
        public final void mo5738a(C1293v vVar) {
            vVar.setIsRecyclable(true);
            if (vVar.mShadowedHolder != null && vVar.mShadowingHolder == null) {
                vVar.mShadowedHolder = null;
            }
            vVar.mShadowingHolder = null;
            if (!vVar.shouldBeKeptAsChild() && !RecyclerView.this.mo5537a(vVar.itemView) && vVar.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(vVar.itemView, false);
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$h */
    public static abstract class C1272h {
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).bn_(), recyclerView);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$i */
    public static abstract class C1273i {

        /* renamed from: A */
        public boolean f4949A = false;

        /* renamed from: B */
        public boolean f4950B = false;

        /* renamed from: C */
        public boolean f4951C = true;

        /* renamed from: D */
        public boolean f4952D = true;

        /* renamed from: E */
        int f4953E;

        /* renamed from: F */
        boolean f4954F;

        /* renamed from: G */
        public int f4955G;

        /* renamed from: H */
        public int f4956H;

        /* renamed from: I */
        public int f4957I;

        /* renamed from: J */
        public int f4958J;

        /* renamed from: a */
        private final C1381b f4959a = new C1381b() {
            /* renamed from: a */
            public final int mo5808a() {
                return C1273i.this.mo5801t();
            }

            /* renamed from: b */
            public final int mo5811b() {
                return C1273i.this.f4957I - C1273i.this.mo5803v();
            }

            /* renamed from: a */
            public final int mo5809a(View view) {
                return C1273i.this.mo5787g(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: a */
            public final View mo5810a(int i) {
                return C1273i.this.mo5788g(i);
            }

            /* renamed from: b */
            public final int mo5812b(View view) {
                return C1273i.this.mo5791i(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        };

        /* renamed from: b */
        private final C1381b f4960b = new C1381b() {
            /* renamed from: a */
            public final int mo5808a() {
                return C1273i.this.mo5802u();
            }

            /* renamed from: b */
            public final int mo5811b() {
                return C1273i.this.f4958J - C1273i.this.mo5804w();
            }

            /* renamed from: a */
            public final int mo5809a(View view) {
                return C1273i.this.mo5789h(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: a */
            public final View mo5810a(int i) {
                return C1273i.this.mo5788g(i);
            }

            /* renamed from: b */
            public final int mo5812b(View view) {
                return C1273i.this.mo5793j(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        };

        /* renamed from: u */
        C1428t f4961u;

        /* renamed from: v */
        RecyclerView f4962v;

        /* renamed from: w */
        C1379ba f4963w = new C1379ba(this.f4959a);

        /* renamed from: x */
        C1379ba f4964x = new C1379ba(this.f4960b);

        /* renamed from: y */
        C1287r f4965y;

        /* renamed from: z */
        boolean f4966z = false;

        /* renamed from: android.support.v7.widget.RecyclerView$i$a */
        public interface C1276a {
            /* renamed from: b */
            void mo5813b(int i, int i2);
        }

        /* renamed from: android.support.v7.widget.RecyclerView$i$b */
        public static class C1277b {

            /* renamed from: a */
            public int f4969a;

            /* renamed from: b */
            public int f4970b;

            /* renamed from: c */
            public boolean f4971c;

            /* renamed from: d */
            public boolean f4972d;
        }

        /* renamed from: E */
        public void mo5748E() {
            this.f4966z = true;
        }

        /* renamed from: a */
        public int mo5361a(int i, C1284o oVar, C1290s sVar) {
            return 0;
        }

        /* renamed from: a */
        public abstract LayoutParams mo5363a();

        /* renamed from: a */
        public View mo5367a(View view, int i, C1284o oVar, C1290s sVar) {
            return null;
        }

        /* renamed from: a */
        public void mo5418a(int i, int i2, C1290s sVar, C1276a aVar) {
        }

        /* renamed from: a */
        public void mo5419a(int i, C1276a aVar) {
        }

        /* renamed from: a */
        public void mo5420a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo5752a(C1262a aVar, C1262a aVar2) {
        }

        /* renamed from: a */
        public void mo5373a(C1290s sVar) {
        }

        /* renamed from: a */
        public void mo5375a(RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo5376a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo5377a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo5421a(RecyclerView recyclerView, C1284o oVar) {
        }

        /* renamed from: a */
        public void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        }

        /* renamed from: a */
        public boolean mo5380a(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo5766a(View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: b */
        public int mo5381b(int i, C1284o oVar, C1290s sVar) {
            return 0;
        }

        /* renamed from: b */
        public int mo5426b(C1290s sVar) {
            return 0;
        }

        /* renamed from: b */
        public void mo5383b(RecyclerView recyclerView, int i, int i2) {
        }

        public boolean bh_() {
            return this.f4950B;
        }

        public boolean bi_() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean bj_() {
            return false;
        }

        /* renamed from: c */
        public int mo5431c(C1290s sVar) {
            return 0;
        }

        /* renamed from: c */
        public void mo5385c(C1284o oVar, C1290s sVar) {
        }

        /* renamed from: c */
        public void mo5782c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d */
        public int mo5433d(C1290s sVar) {
            return 0;
        }

        /* renamed from: d */
        public Parcelable mo5435d() {
            return null;
        }

        /* renamed from: d */
        public void mo5785d(RecyclerView recyclerView) {
        }

        /* renamed from: e */
        public int mo5436e(C1290s sVar) {
            return 0;
        }

        /* renamed from: e */
        public void mo5437e(int i) {
        }

        /* renamed from: e */
        public boolean mo5438e() {
            return false;
        }

        /* renamed from: f */
        public int mo5440f(C1290s sVar) {
            return 0;
        }

        /* renamed from: f */
        public boolean mo5441f() {
            return false;
        }

        /* renamed from: g */
        public int mo5442g(C1290s sVar) {
            return 0;
        }

        /* renamed from: j */
        public void mo5794j(int i) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5773b(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4962v = null;
                this.f4961u = null;
                this.f4957I = 0;
                this.f4958J = 0;
            } else {
                this.f4962v = recyclerView;
                this.f4961u = recyclerView.f4908g;
                this.f4957I = recyclerView.getWidth();
                this.f4958J = recyclerView.getHeight();
            }
            this.f4955G = 1073741824;
            this.f4956H = 1073741824;
        }

        /* renamed from: a */
        public void mo5369a(Rect rect, int i, int i2) {
            mo5784d(m6041a(i, rect.width() + mo5801t() + mo5803v(), mo5745B()), m6041a(i2, rect.height() + mo5802u() + mo5804w(), mo5746C()));
        }

        /* renamed from: a */
        public void mo5425a(String str) {
            if (this.f4962v != null) {
                this.f4962v.mo5531a(str);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5774b(RecyclerView recyclerView, C1284o oVar) {
            this.f4949A = false;
            mo5421a(recyclerView, oVar);
        }

        /* renamed from: a */
        public final boolean mo5768a(Runnable runnable) {
            if (this.f4962v != null) {
                return this.f4962v.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: a */
        public LayoutParams mo5365a(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new LayoutParams((MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        /* renamed from: a */
        public LayoutParams mo5364a(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: a */
        public final void mo5755a(C1287r rVar) {
            if (!(this.f4965y == null || rVar == this.f4965y || !this.f4965y.f4996j)) {
                this.f4965y.mo5862d();
            }
            this.f4965y = rVar;
            this.f4965y.mo5859a(this.f4962v, this);
        }

        /* renamed from: a */
        public final void mo5756a(View view) {
            mo5757a(view, -1);
        }

        /* renamed from: a */
        public final void mo5757a(View view, int i) {
            m6052a(view, i, true);
        }

        /* renamed from: b */
        public final void mo5775b(View view) {
            mo5776b(view, -1);
        }

        /* renamed from: b */
        public final void mo5776b(View view, int i) {
            m6052a(view, i, false);
        }

        /* renamed from: a */
        private void m6052a(View view, int i, boolean z) {
            C1293v d = RecyclerView.m5889d(view);
            if (z || d.isRemoved()) {
                this.f4962v.f4909h.mo6453e(d);
            } else {
                this.f4962v.f4909h.mo6454f(d);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (d.wasReturnedFromScrap() || d.isScrap()) {
                if (d.isScrap()) {
                    d.unScrap();
                } else {
                    d.clearReturnedFromScrapFlag();
                }
                this.f4961u.mo6597a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4962v) {
                int b = this.f4961u.mo6601b(view);
                if (i == -1) {
                    i = this.f4961u.mo6600b();
                }
                if (b == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f4962v.indexOfChild(view));
                    sb.append(this.f4962v.mo5520a());
                    throw new IllegalStateException(sb.toString());
                } else if (b != i) {
                    this.f4962v.f4915n.mo5417a(b, i);
                }
            } else {
                this.f4961u.mo6598a(view, i, false);
                layoutParams.f4935e = true;
                if (this.f4965y != null && this.f4965y.f4996j) {
                    this.f4965y.mo5860a(view);
                }
            }
            if (layoutParams.f4936f) {
                d.itemView.invalidate();
                layoutParams.f4936f = false;
            }
        }

        /* renamed from: a */
        private void m6051a(View view, int i, LayoutParams layoutParams) {
            C1293v d = RecyclerView.m5889d(view);
            if (d.isRemoved()) {
                this.f4962v.f4909h.mo6453e(d);
            } else {
                this.f4962v.f4909h.mo6454f(d);
            }
            this.f4961u.mo6597a(view, i, layoutParams, d.isRemoved());
        }

        /* renamed from: a */
        public final void mo5759a(View view, C1284o oVar) {
            m6069o(view);
            oVar.mo5840a(view);
        }

        /* renamed from: a */
        public final void mo5750a(int i, C1284o oVar) {
            View g = mo5788g(i);
            mo5368a(i);
            oVar.mo5840a(g);
        }

        /* renamed from: a */
        public final void mo5753a(C1284o oVar) {
            for (int s = mo5800s() - 1; s >= 0; s--) {
                m6047a(oVar, s, mo5788g(s));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo5765a(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.f4951C || !mo83412b(view.getMeasuredWidth(), i, layoutParams.width) || !mo83412b(view.getMeasuredHeight(), i2, layoutParams.height);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo5778b(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.f4951C || !mo83412b(view.getWidth(), i, layoutParams.width) || !mo83412b(view.getHeight(), i2, layoutParams.height);
        }

        /* renamed from: a */
        public static void m6050a(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4934d;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        /* renamed from: a */
        public final void mo5760a(View view, boolean z, Rect rect) {
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).f4934d;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f4962v != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.f4962v.f4913l;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: b */
        public final void mo5777b(View view, Rect rect) {
            if (this.f4962v == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.f4962v.mo5601h(view));
            }
        }

        /* renamed from: a */
        public final boolean mo5763a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo5764a(recyclerView, view, rect, z, false);
        }

        /* renamed from: a */
        public final boolean mo5764a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] b = m6059b(recyclerView, view, rect, z);
            int i = b[0];
            int i2 = b[1];
            if ((z2 && !m6062d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo5521a(i, i2);
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo5767a(View view, boolean z, boolean z2) {
            boolean z3 = this.f4963w.mo6437a(view, 24579) && this.f4964x.mo6437a(view, 24579);
            if (z) {
                return z3;
            }
            return !z3;
        }

        /* renamed from: a */
        private boolean m6055a(RecyclerView recyclerView, View view, View view2) {
            return mo5797p() || recyclerView.mo5606i();
        }

        /* renamed from: a */
        public final boolean mo5762a(RecyclerView recyclerView, C1290s sVar, View view, View view2) {
            return m6055a(recyclerView, view, view2);
        }

        /* renamed from: a */
        public void mo5378a(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo5782c(recyclerView, i, i2);
        }

        /* renamed from: a */
        public void mo5754a(C1284o oVar, C1290s sVar, int i, int i2) {
            this.f4962v.mo5574e(i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5751a(C0945c cVar) {
            m6048a(this.f4962v.f4906e, this.f4962v.f4857D, cVar);
        }

        /* renamed from: a */
        public void mo5424a(AccessibilityEvent accessibilityEvent) {
            m6049a(this.f4962v.f4906e, this.f4962v.f4857D, accessibilityEvent);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5758a(View view, C0945c cVar) {
            C1293v d = RecyclerView.m5889d(view);
            if (d != null && !d.isRemoved() && !this.f4961u.mo6605c(d.itemView)) {
                mo5372a(this.f4962v.f4906e, this.f4962v.f4857D, view, cVar);
            }
        }

        /* renamed from: a */
        public void mo5372a(C1284o oVar, C1290s sVar, View view, C0945c cVar) {
            cVar.mo3657b((Object) C0948c.m4049a(mo5441f() ? m6060c(view) : 0, 1, mo5438e() ? m6060c(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public int mo5362a(C1284o oVar, C1290s sVar) {
            if (this.f4962v == null || this.f4962v.f4914m == null || !mo5441f()) {
                return 1;
            }
            return this.f4962v.f4914m.getItemCount();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo5761a(int i, Bundle bundle) {
            return m6054a(this.f4962v.f4906e, this.f4962v.f4857D, i, bundle);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m6054a(android.support.p029v7.widget.RecyclerView.C1284o r2, android.support.p029v7.widget.RecyclerView.C1290s r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                android.support.v7.widget.RecyclerView r2 = r1.f4962v
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r2 = 4096(0x1000, float:5.74E-42)
                r5 = 1
                if (r4 == r2) goto L_0x0040
                r2 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r2) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006a
            L_0x0012:
                android.support.v7.widget.RecyclerView r2 = r1.f4962v
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.f4958J
                int r0 = r1.mo5802u()
                int r2 = r2 - r0
                int r0 = r1.mo5804w()
                int r2 = r2 - r0
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                android.support.v7.widget.RecyclerView r0 = r1.f4962v
                boolean r4 = r0.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.f4957I
                int r0 = r1.mo5801t()
                int r4 = r4 - r0
                int r0 = r1.mo5803v()
                int r4 = r4 - r0
                int r4 = -r4
                goto L_0x006a
            L_0x0040:
                android.support.v7.widget.RecyclerView r2 = r1.f4962v
                boolean r2 = r2.canScrollVertically(r5)
                if (r2 == 0) goto L_0x0055
                int r2 = r1.f4958J
                int r4 = r1.mo5802u()
                int r2 = r2 - r4
                int r4 = r1.mo5804w()
                int r2 = r2 - r4
                goto L_0x0056
            L_0x0055:
                r2 = 0
            L_0x0056:
                android.support.v7.widget.RecyclerView r4 = r1.f4962v
                boolean r4 = r4.canScrollHorizontally(r5)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.f4957I
                int r0 = r1.mo5801t()
                int r4 = r4 - r0
                int r0 = r1.mo5803v()
                int r4 = r4 - r0
            L_0x006a:
                if (r2 != 0) goto L_0x006f
                if (r4 != 0) goto L_0x006f
                return r3
            L_0x006f:
                android.support.v7.widget.RecyclerView r3 = r1.f4962v
                r3.mo5521a(r4, r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.RecyclerView.C1273i.m6054a(android.support.v7.widget.RecyclerView$o, android.support.v7.widget.RecyclerView$s, int, android.os.Bundle):boolean");
        }

        /* renamed from: B */
        public final int mo5745B() {
            return C0991u.m4236o(this.f4962v);
        }

        /* renamed from: C */
        public final int mo5746C() {
            return C0991u.m4237p(this.f4962v);
        }

        /* renamed from: q */
        public final int mo5798q() {
            return C0991u.m4220h(this.f4962v);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: D */
        public final void mo5747D() {
            if (this.f4965y != null) {
                this.f4965y.mo5862d();
            }
        }

        /* renamed from: o */
        public final boolean mo5796o() {
            if (this.f4962v == null || !this.f4962v.f4910i) {
                return false;
            }
            return true;
        }

        /* renamed from: p */
        public final boolean mo5797p() {
            if (this.f4965y == null || !this.f4965y.f4996j) {
                return false;
            }
            return true;
        }

        /* renamed from: s */
        public final int mo5800s() {
            if (this.f4961u != null) {
                return this.f4961u.mo6600b();
            }
            return 0;
        }

        /* renamed from: t */
        public final int mo5801t() {
            if (this.f4962v != null) {
                return this.f4962v.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: u */
        public final int mo5802u() {
            if (this.f4962v != null) {
                return this.f4962v.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: v */
        public final int mo5803v() {
            if (this.f4962v != null) {
                return this.f4962v.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: w */
        public final int mo5804w() {
            if (this.f4962v != null) {
                return this.f4962v.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: x */
        public final int mo5805x() {
            if (this.f4962v != null) {
                return C0991u.m4229k(this.f4962v);
            }
            return 0;
        }

        /* renamed from: y */
        public final int mo5806y() {
            if (this.f4962v != null) {
                return C0991u.m4232l(this.f4962v);
            }
            return 0;
        }

        /* renamed from: A */
        public final int mo5744A() {
            C1262a aVar;
            if (this.f4962v != null) {
                aVar = this.f4962v.getAdapter();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                return aVar.getItemCount();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: F */
        public final boolean mo5749F() {
            int s = mo5800s();
            for (int i = 0; i < s; i++) {
                android.view.ViewGroup.LayoutParams layoutParams = mo5788g(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: n */
        public final void mo5795n() {
            if (this.f4962v != null) {
                this.f4962v.requestLayout();
            }
        }

        /* renamed from: r */
        public final void mo5799r() {
            for (int s = mo5800s() - 1; s >= 0; s--) {
                this.f4961u.mo6595a(s);
            }
        }

        /* renamed from: z */
        public final View mo5807z() {
            if (this.f4962v == null) {
                return null;
            }
            View focusedChild = this.f4962v.getFocusedChild();
            if (focusedChild == null || this.f4961u.mo6605c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: b */
        private void mo5427b(int i) {
            mo83408a(i, mo5788g(i));
        }

        /* renamed from: o */
        private void m6069o(View view) {
            this.f4961u.mo6596a(view);
        }

        /* renamed from: a */
        private void mo5368a(int i) {
            if (mo5788g(i) != null) {
                this.f4961u.mo6595a(i);
            }
        }

        /* renamed from: c */
        public static int m6060c(View view) {
            return ((LayoutParams) view.getLayoutParams()).bn_();
        }

        /* renamed from: k */
        public static int m6065k(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4934d.top;
        }

        /* renamed from: l */
        public static int m6066l(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4934d.bottom;
        }

        /* renamed from: m */
        public static int m6067m(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4934d.left;
        }

        /* renamed from: n */
        public static int m6068n(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4934d.right;
        }

        /* renamed from: g */
        public final int mo5787g(View view) {
            return view.getLeft() - m6067m(view);
        }

        /* renamed from: h */
        public final int mo5789h(View view) {
            return view.getTop() - m6065k(view);
        }

        /* renamed from: i */
        public final int mo5791i(View view) {
            return view.getRight() + m6068n(view);
        }

        /* renamed from: j */
        public final int mo5793j(View view) {
            return view.getBottom() + m6066l(view);
        }

        /* renamed from: e */
        public static int m6063e(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4934d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: f */
        public static int m6064f(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4934d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: d */
        public final View mo5783d(View view) {
            if (this.f4962v == null) {
                return null;
            }
            View c = this.f4962v.mo5550c(view);
            if (c != null && !this.f4961u.mo6605c(c)) {
                return c;
            }
            return null;
        }

        /* renamed from: g */
        public final View mo5788g(int i) {
            if (this.f4961u != null) {
                return this.f4961u.mo6602b(i);
            }
            return null;
        }

        /* renamed from: h */
        public void mo5790h(int i) {
            if (this.f4962v != null) {
                this.f4962v.mo5602h(i);
            }
        }

        /* renamed from: i */
        public void mo5792i(int i) {
            if (this.f4962v != null) {
                this.f4962v.mo5580g(i);
            }
        }

        /* renamed from: c */
        public View mo5432c(int i) {
            int s = mo5800s();
            for (int i2 = 0; i2 < s; i2++) {
                View g = mo5788g(i2);
                C1293v d = RecyclerView.m5889d(g);
                if (d != null && d.getLayoutPosition() == i && !d.shouldIgnore() && (this.f4962v.f4857D.f5010g || !d.isRemoved())) {
                    return g;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final void mo5786e(RecyclerView recyclerView) {
            mo5770b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: c */
        public final void mo5780c(C1284o oVar) {
            for (int s = mo5800s() - 1; s >= 0; s--) {
                if (!RecyclerView.m5889d(mo5788g(s)).shouldIgnore()) {
                    mo5750a(s, oVar);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5781c(RecyclerView recyclerView) {
            this.f4949A = true;
            mo5785d(recyclerView);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5771b(C1284o oVar) {
            int c = oVar.mo5847c();
            for (int i = c - 1; i >= 0; i--) {
                View d = oVar.mo5851d(i);
                C1293v d2 = RecyclerView.m5889d(d);
                if (!d2.shouldIgnore()) {
                    d2.setIsRecyclable(false);
                    if (d2.isTmpDetached()) {
                        this.f4962v.removeDetachedView(d, false);
                    }
                    if (this.f4962v.f4927z != null) {
                        this.f4962v.f4927z.mo5336d(d2);
                    }
                    d2.setIsRecyclable(true);
                    oVar.mo5846b(d);
                }
            }
            oVar.mo5852d();
            if (c > 0) {
                this.f4962v.invalidate();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5772b(C1287r rVar) {
            if (this.f4965y == rVar) {
                this.f4965y = null;
            }
        }

        /* renamed from: a */
        public static void m6053a(View view, Rect rect) {
            RecyclerView.m5885b(view, rect);
        }

        /* renamed from: a */
        private void mo83408a(int i, View view) {
            this.f4961u.mo6608e(i);
        }

        /* renamed from: d */
        public void mo5784d(int i, int i2) {
            this.f4962v.setMeasuredDimension(i, i2);
        }

        /* renamed from: c */
        private void m6061c(View view, int i) {
            m6051a(view, i, (LayoutParams) view.getLayoutParams());
        }

        /* renamed from: b */
        public int mo5382b(C1284o oVar, C1290s sVar) {
            if (this.f4962v == null || this.f4962v.f4914m == null || !mo5438e()) {
                return 1;
            }
            return this.f4962v.f4914m.getItemCount();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5779c(int i, int i2) {
            int s = mo5800s();
            if (s == 0) {
                this.f4962v.mo5574e(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < s; i7++) {
                View g = mo5788g(i7);
                Rect rect = this.f4962v.f4912k;
                m6053a(g, rect);
                if (rect.left < i3) {
                    i3 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i4) {
                    i4 = rect.top;
                }
                if (rect.bottom > i6) {
                    i6 = rect.bottom;
                }
            }
            this.f4962v.f4912k.set(i3, i4, i5, i6);
            mo5369a(this.f4962v.f4912k, i, i2);
        }

        /* renamed from: a */
        private void mo5417a(int i, int i2) {
            View g = mo5788g(i);
            if (g != null) {
                mo5427b(i);
                m6061c(g, i2);
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.f4962v.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5770b(int i, int i2) {
            this.f4957I = MeasureSpec.getSize(i);
            this.f4955G = MeasureSpec.getMode(i);
            if (this.f4955G == 0 && !RecyclerView.f4851b) {
                this.f4957I = 0;
            }
            this.f4958J = MeasureSpec.getSize(i2);
            this.f4956H = MeasureSpec.getMode(i2);
            if (this.f4956H == 0 && !RecyclerView.f4851b) {
                this.f4958J = 0;
            }
        }

        /* renamed from: a */
        public static int m6041a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }

        /* renamed from: d */
        private boolean m6062d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int t = mo5801t();
            int u = mo5802u();
            int v = this.f4957I - mo5803v();
            int w = this.f4958J - mo5804w();
            Rect rect = this.f4962v.f4912k;
            m6053a(focusedChild, rect);
            if (rect.left - i >= v || rect.right - i <= t || rect.top - i2 >= w || rect.bottom - i2 <= u) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        private static boolean mo83412b(int i, int i2, int i3) {
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

        /* renamed from: a_ */
        public final void mo5769a_(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect h = this.f4962v.mo5601h(view);
            int i3 = h.top + h.bottom + 0;
            int a = m6042a(this.f4957I, this.f4955G, mo5801t() + mo5803v() + layoutParams.leftMargin + layoutParams.rightMargin + h.left + h.right + 0, layoutParams.width, mo5438e());
            int a2 = m6042a(this.f4958J, this.f4956H, mo5802u() + mo5804w() + layoutParams.topMargin + layoutParams.bottomMargin + i3, layoutParams.height, mo5441f());
            if (mo5778b(view, a, a2, layoutParams)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        private void m6047a(C1284o oVar, int i, View view) {
            C1293v d = RecyclerView.m5889d(view);
            if (!d.shouldIgnore()) {
                if (!d.isInvalid() || d.isRemoved() || this.f4962v.f4914m.mHasStableIds) {
                    mo5427b(i);
                    oVar.mo5850c(view);
                    this.f4962v.f4909h.mo6456h(d);
                    return;
                }
                mo5368a(i);
                oVar.mo5838a(d);
            }
        }

        /* renamed from: a */
        private void m6048a(C1284o oVar, C1290s sVar, C0945c cVar) {
            if (this.f4962v.canScrollVertically(-1) || this.f4962v.canScrollHorizontally(-1)) {
                cVar.mo3644a((int) VideoCacheReadBuffersizeExperiment.DEFAULT);
                cVar.mo3687k(true);
            }
            if (this.f4962v.canScrollVertically(1) || this.f4962v.canScrollHorizontally(1)) {
                cVar.mo3644a(4096);
                cVar.mo3687k(true);
            }
            cVar.mo3649a((Object) C0947b.m4048a(mo5362a(oVar, sVar), mo5382b(oVar, sVar), false, 0));
        }

        /* renamed from: a */
        private void m6049a(C1284o oVar, C1290s sVar, AccessibilityEvent accessibilityEvent) {
            if (this.f4962v != null && accessibilityEvent != null) {
                boolean z = true;
                if (!this.f4962v.canScrollVertically(1) && !this.f4962v.canScrollVertically(-1) && !this.f4962v.canScrollHorizontally(-1) && !this.f4962v.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (this.f4962v.f4914m != null) {
                    accessibilityEvent.setItemCount(this.f4962v.f4914m.getItemCount());
                }
            }
        }

        /* renamed from: a */
        public static C1277b m6043a(Context context, AttributeSet attributeSet, int i, int i2) {
            C1277b bVar = new C1277b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i, i2);
            bVar.f4969a = obtainStyledAttributes.getInt(0, 1);
            bVar.f4970b = obtainStyledAttributes.getInt(9, 1);
            bVar.f4971c = obtainStyledAttributes.getBoolean(8, false);
            bVar.f4972d = obtainStyledAttributes.getBoolean(10, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* renamed from: b */
        private int[] m6059b(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int t = mo5801t();
            int u = mo5802u();
            int v = this.f4957I - mo5803v();
            int w = this.f4958J - mo5804w();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - t;
            int min = Math.min(0, i);
            int i2 = top - u;
            int min2 = Math.min(0, i2);
            int i3 = width - v;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - w);
            if (mo5798q() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m6042a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001c
                if (r7 < 0) goto L_0x0013
            L_0x0010:
                r6 = 1073741824(0x40000000, float:2.0)
                goto L_0x002f
            L_0x0013:
                if (r7 != r1) goto L_0x002e
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002e
                if (r5 == r3) goto L_0x0021
                goto L_0x002e
            L_0x001c:
                if (r7 < 0) goto L_0x001f
                goto L_0x0010
            L_0x001f:
                if (r7 != r1) goto L_0x0024
            L_0x0021:
                r7 = r4
                r6 = r5
                goto L_0x002f
            L_0x0024:
                if (r7 != r0) goto L_0x002e
                if (r5 == r2) goto L_0x002a
                if (r5 != r3) goto L_0x002c
            L_0x002a:
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x002c:
                r7 = r4
                goto L_0x002f
            L_0x002e:
                r7 = 0
            L_0x002f:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.RecyclerView.C1273i.m6042a(int, int, int, int, boolean):int");
        }

        /* renamed from: b */
        public static void m6057b(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f4934d;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$j */
    public interface C1278j {
        /* renamed from: a */
        void mo5814a(View view);

        /* renamed from: b */
        void mo5815b(View view);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$k */
    public static abstract class C1279k {
        /* renamed from: a */
        public abstract boolean mo5816a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$l */
    public interface C1280l {
        /* renamed from: a */
        void mo5689a(boolean z);

        /* renamed from: a */
        boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo5691b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$m */
    public static abstract class C1281m {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$n */
    public static class C1282n {

        /* renamed from: a */
        SparseArray<C1283a> f4973a = new SparseArray<>();

        /* renamed from: b */
        private int f4974b = 0;

        /* renamed from: android.support.v7.widget.RecyclerView$n$a */
        static class C1283a {

            /* renamed from: a */
            final ArrayList<C1293v> f4975a = new ArrayList<>();

            /* renamed from: b */
            int f4976b = 5;

            /* renamed from: c */
            long f4977c = 0;

            /* renamed from: d */
            long f4978d = 0;

            C1283a() {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5827b() {
            this.f4974b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5830c() {
            this.f4974b--;
        }

        /* renamed from: a */
        public final void mo5820a() {
            for (int i = 0; i < this.f4973a.size(); i++) {
                ((C1283a) this.f4973a.valueAt(i)).f4975a.clear();
            }
        }

        /* renamed from: a */
        public final int mo5819a(int i) {
            return m6188c(i).f4975a.size();
        }

        /* renamed from: c */
        private C1283a m6188c(int i) {
            C1283a aVar = (C1283a) this.f4973a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1283a aVar2 = new C1283a();
            this.f4973a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: b */
        public C1293v mo5826b(int i) {
            C1283a aVar = (C1283a) this.f4973a.get(i);
            if (aVar == null || aVar.f4975a.isEmpty()) {
                return null;
            }
            ArrayList<C1293v> arrayList = aVar.f4975a;
            return (C1293v) arrayList.remove(arrayList.size() - 1);
        }

        /* renamed from: a */
        public void mo5824a(C1293v vVar) {
            int i = vVar.mItemViewType;
            ArrayList<C1293v> arrayList = m6188c(i).f4975a;
            if (((C1283a) this.f4973a.get(i)).f4976b > arrayList.size()) {
                vVar.resetInternal();
                arrayList.add(vVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5828b(int i, long j) {
            C1283a c = m6188c(i);
            c.f4978d = m6187a(c.f4978d, j);
        }

        /* renamed from: a */
        private static long m6187a(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: a */
        public final void mo5821a(int i, int i2) {
            C1283a c = m6188c(i);
            c.f4976b = i2;
            ArrayList<C1293v> arrayList = c.f4975a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5822a(int i, long j) {
            C1283a c = m6188c(i);
            c.f4977c = m6187a(c.f4977c, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo5829b(int i, long j, long j2) {
            long j3 = m6188c(i).f4978d;
            if (j3 == 0 || j + j3 < j2) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5823a(C1262a aVar, C1262a aVar2, boolean z) {
            if (aVar != null) {
                mo5830c();
            }
            if (!z && this.f4974b == 0) {
                mo5820a();
            }
            if (aVar2 != null) {
                mo5827b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo5825a(int i, long j, long j2) {
            long j3 = m6188c(i).f4977c;
            if (j3 == 0 || j + j3 < j2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$o */
    public final class C1284o {

        /* renamed from: a */
        final ArrayList<C1293v> f4979a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C1293v> f4980b = null;

        /* renamed from: c */
        final ArrayList<C1293v> f4981c = new ArrayList<>();

        /* renamed from: d */
        public final List<C1293v> f4982d = Collections.unmodifiableList(this.f4979a);

        /* renamed from: e */
        int f4983e = 2;

        /* renamed from: f */
        C1282n f4984f;

        /* renamed from: g */
        public C1291t f4985g;

        /* renamed from: i */
        private int f4987i = 2;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C1293v mo5831a(int i, boolean z, long j) {
            return C1348aj.m6671a(this, i, z, j);
        }

        /* renamed from: a */
        public final void mo5840a(View view) {
            C1293v d = RecyclerView.m5889d(view);
            if (d.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (d.isScrap()) {
                d.unScrap();
            } else if (d.wasReturnedFromScrap()) {
                d.clearReturnedFromScrapFlag();
            }
            mo5838a(d);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5838a(C1293v vVar) {
            boolean z;
            boolean z2 = false;
            if (vVar.isScrap() || vVar.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(vVar.isScrap());
                sb.append(" isAttached:");
                if (vVar.itemView.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo5520a());
                throw new IllegalArgumentException(sb.toString());
            } else if (vVar.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(vVar);
                sb2.append(RecyclerView.this.mo5520a());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!vVar.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = vVar.doesTransientStatePreventRecycling();
                if ((RecyclerView.this.f4914m != null && doesTransientStatePreventRecycling && RecyclerView.this.f4914m.onFailedToRecycleView(vVar)) || vVar.isRecyclable()) {
                    if (this.f4983e <= 0 || vVar.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.f4981c.size();
                        if (size >= this.f4983e && size > 0) {
                            m6208e(0);
                            size--;
                        }
                        if (RecyclerView.f4853d && size > 0 && !RecyclerView.this.f4856C.mo6255a(vVar.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f4856C.mo6255a(((C1293v) this.f4981c.get(i)).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f4981c.add(size, vVar);
                        z = true;
                    }
                    if (!z) {
                        mo5839a(vVar, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.f4909h.mo6455g(vVar);
                if (!z && !z2 && doesTransientStatePreventRecycling) {
                    vVar.mOwnerRecyclerView = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.mo5520a());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5839a(C1293v vVar, boolean z) {
            RecyclerView.m5884b(vVar);
            if (vVar.hasAnyOfTheFlags(16384)) {
                vVar.setFlags(0, 16384);
                C0991u.m4187a(vVar.itemView, (C0939a) null);
            }
            if (z) {
                m6211f(vVar);
            }
            vVar.mOwnerRecyclerView = null;
            mo5853e().mo5824a(vVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5836a(C1262a aVar, C1262a aVar2, boolean z) {
            mo5832a();
            mo5853e().mo5823a(aVar, aVar2, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5837a(C1282n nVar) {
            if (this.f4984f != null) {
                this.f4984f.mo5830c();
            }
            this.f4984f = nVar;
            if (this.f4984f != null && RecyclerView.this.getAdapter() != null) {
                this.f4984f.mo5827b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo5847c() {
            return this.f4979a.size();
        }

        /* renamed from: a */
        public final void mo5832a() {
            this.f4979a.clear();
            m6212i();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo5852d() {
            this.f4979a.clear();
            if (this.f4980b != null) {
                this.f4980b.clear();
            }
        }

        /* renamed from: i */
        private void m6212i() {
            for (int size = this.f4981c.size() - 1; size >= 0; size--) {
                m6208e(size);
            }
            this.f4981c.clear();
            if (RecyclerView.f4853d) {
                RecyclerView.this.f4856C.mo6252a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5843b() {
            int i;
            if (RecyclerView.this.f4915n != null) {
                i = RecyclerView.this.f4915n.f4953E;
            } else {
                i = 0;
            }
            this.f4983e = this.f4987i + i;
            for (int size = this.f4981c.size() - 1; size >= 0 && this.f4981c.size() > this.f4983e; size--) {
                m6208e(size);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final C1282n mo5853e() {
            if (this.f4984f == null) {
                this.f4984f = new C1282n();
            }
            return this.f4984f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public final void mo5856h() {
            int size = this.f4981c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) ((C1293v) this.f4981c.get(i)).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f4935e = true;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public final void mo5855g() {
            int size = this.f4981c.size();
            for (int i = 0; i < size; i++) {
                ((C1293v) this.f4981c.get(i)).clearOldPosition();
            }
            int size2 = this.f4979a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C1293v) this.f4979a.get(i2)).clearOldPosition();
            }
            if (this.f4980b != null) {
                int size3 = this.f4980b.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C1293v) this.f4980b.get(i3)).clearOldPosition();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final void mo5854f() {
            int size = this.f4981c.size();
            for (int i = 0; i < size; i++) {
                C1293v vVar = (C1293v) this.f4981c.get(i);
                if (vVar != null) {
                    vVar.addFlags(6);
                    vVar.addChangePayload(null);
                }
            }
            if (RecyclerView.this.f4914m == null || !RecyclerView.this.f4914m.mHasStableIds) {
                m6212i();
            }
        }

        /* renamed from: e */
        private void m6209e(C1293v vVar) {
            if (vVar.itemView instanceof ViewGroup) {
                m6203a((ViewGroup) vVar.itemView, false);
            }
        }

        /* renamed from: c */
        public final View mo5848c(int i) {
            return m6202a(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final View mo5851d(int i) {
            return ((C1293v) this.f4979a.get(i)).itemView;
        }

        /* renamed from: e */
        private void m6208e(int i) {
            mo5839a((C1293v) this.f4981c.get(i), true);
            this.f4981c.remove(i);
        }

        public C1284o() {
        }

        /* renamed from: d */
        private void m6207d(C1293v vVar) {
            if (RecyclerView.this.mo5604h()) {
                View view = vVar.itemView;
                if (C0991u.m4214f(view) == 0) {
                    C0991u.m4206c(view, 1);
                }
                if (!C0991u.m4207c(view)) {
                    vVar.addFlags(16384);
                    C0991u.m4187a(view, RecyclerView.this.f4861H.f5029c);
                }
            }
        }

        /* renamed from: f */
        private void m6211f(C1293v vVar) {
            if (RecyclerView.this.f4916o != null) {
                RecyclerView.this.f4916o.onViewRecycled(vVar);
            }
            if (RecyclerView.this.f4914m != null) {
                RecyclerView.this.f4914m.onViewRecycled(vVar);
            }
            if (RecyclerView.this.f4857D != null) {
                RecyclerView.this.f4909h.mo6455g(vVar);
            }
        }

        /* renamed from: c */
        private boolean m6206c(C1293v vVar) {
            if (vVar.isRemoved()) {
                return RecyclerView.this.f4857D.f5010g;
            }
            if (vVar.mPosition < 0 || vVar.mPosition >= RecyclerView.this.f4914m.getItemCount()) {
                StringBuilder sb = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                sb.append(vVar);
                sb.append(RecyclerView.this.mo5520a());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.f4857D.f5010g && RecyclerView.this.f4914m.getItemViewType(vVar.mPosition) != vVar.mItemViewType) {
                return false;
            } else {
                if (!RecyclerView.this.f4914m.mHasStableIds || vVar.mItemId == RecyclerView.this.f4914m.getItemId(vVar.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: f */
        private C1293v m6210f(int i) {
            if (this.f4980b != null) {
                int size = this.f4980b.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        C1293v vVar = (C1293v) this.f4980b.get(i3);
                        if (vVar.wasReturnedFromScrap() || vVar.getLayoutPosition() != i) {
                            i3++;
                        } else {
                            vVar.addFlags(32);
                            return vVar;
                        }
                    }
                    if (RecyclerView.this.f4914m.mHasStableIds) {
                        int b = RecyclerView.this.f4907f.mo6463b(i);
                        if (b > 0 && b < RecyclerView.this.f4914m.getItemCount()) {
                            long itemId = RecyclerView.this.f4914m.getItemId(b);
                            while (i2 < size) {
                                C1293v vVar2 = (C1293v) this.f4980b.get(i2);
                                if (vVar2.wasReturnedFromScrap() || vVar2.mItemId != itemId) {
                                    i2++;
                                } else {
                                    vVar2.addFlags(32);
                                    return vVar2;
                                }
                            }
                        }
                    }
                    return null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final int mo5841b(int i) {
            if (i < 0 || i >= RecyclerView.this.f4857D.mo5870b()) {
                StringBuilder sb = new StringBuilder("invalid position ");
                sb.append(i);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.f4857D.mo5870b());
                sb.append(RecyclerView.this.mo5520a());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.f4857D.f5010g) {
                return i;
            } else {
                return RecyclerView.this.f4907f.mo6463b(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5850c(View view) {
            C1293v d = RecyclerView.m5889d(view);
            if (!d.hasAnyOfTheFlags(12) && d.isUpdated() && !RecyclerView.this.mo5535a(d)) {
                if (this.f4980b == null) {
                    this.f4980b = new ArrayList<>();
                }
                d.setScrapContainer(this, true);
                this.f4980b.add(d);
            } else if (!d.isInvalid() || d.isRemoved() || RecyclerView.this.f4914m.mHasStableIds) {
                d.setScrapContainer(this, false);
                this.f4979a.add(d);
            } else {
                StringBuilder sb = new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.mo5520a());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: a */
        public final void mo5833a(int i) {
            this.f4987i = i;
            mo5843b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5845b(C1293v vVar) {
            if (vVar.mInChangeScrap) {
                this.f4980b.remove(vVar);
            } else {
                this.f4979a.remove(vVar);
            }
            vVar.mScrapContainer = null;
            vVar.mInChangeScrap = false;
            vVar.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5846b(View view) {
            C1293v d = RecyclerView.m5889d(view);
            d.mScrapContainer = null;
            d.mInChangeScrap = false;
            d.clearReturnedFromScrapFlag();
            mo5838a(d);
        }

        /* renamed from: a */
        private View m6202a(int i, boolean z) {
            return mo5831a(i, false, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo5844b(int i, int i2) {
            int size = this.f4981c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1293v vVar = (C1293v) this.f4981c.get(i3);
                if (vVar != null && vVar.mPosition >= i) {
                    vVar.offsetPosition(i2, true);
                }
            }
        }

        /* renamed from: a */
        private void m6203a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m6203a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo5849c(int i, int i2) {
            int i3 = i2 + i;
            for (int size = this.f4981c.size() - 1; size >= 0; size--) {
                C1293v vVar = (C1293v) this.f4981c.get(size);
                if (vVar != null) {
                    int i4 = vVar.mPosition;
                    if (i4 >= i && i4 < i3) {
                        vVar.addFlags(2);
                        m6208e(size);
                    }
                }
            }
        }

        /* renamed from: b */
        private C1293v m6205b(int i, boolean z) {
            int size = this.f4979a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1293v vVar = (C1293v) this.f4979a.get(i3);
                if (vVar.wasReturnedFromScrap() || vVar.getLayoutPosition() != i || vVar.isInvalid() || (!RecyclerView.this.f4857D.f5010g && vVar.isRemoved())) {
                    i3++;
                } else {
                    vVar.addFlags(32);
                    return vVar;
                }
            }
            if (!z) {
                View c = RecyclerView.this.f4908g.mo6604c(i);
                if (c != null) {
                    C1293v d = RecyclerView.m5889d(c);
                    RecyclerView.this.f4908g.mo6609e(c);
                    int b = RecyclerView.this.f4908g.mo6601b(c);
                    if (b != -1) {
                        RecyclerView.this.f4908g.mo6608e(b);
                        mo5850c(c);
                        d.addFlags(8224);
                        return d;
                    }
                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(d);
                    sb.append(RecyclerView.this.mo5520a());
                    throw new IllegalStateException(sb.toString());
                }
            }
            int size2 = this.f4981c.size();
            while (i2 < size2) {
                C1293v vVar2 = (C1293v) this.f4981c.get(i2);
                if (vVar2.isInvalid() || vVar2.getLayoutPosition() != i) {
                    i2++;
                } else {
                    if (!z) {
                        this.f4981c.remove(i2);
                    }
                    return vVar2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5834a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i5 = i;
                i4 = i2;
                i3 = -1;
            } else {
                i4 = i;
                i5 = i2;
                i3 = 1;
            }
            int size = this.f4981c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C1293v vVar = (C1293v) this.f4981c.get(i6);
                if (vVar != null && vVar.mPosition >= i5 && vVar.mPosition <= i4) {
                    if (vVar.mPosition == i) {
                        vVar.offsetPosition(i2 - i, false);
                    } else {
                        vVar.offsetPosition(i3, false);
                    }
                }
            }
        }

        /* renamed from: a */
        private C1293v m6201a(long j, int i, boolean z) {
            for (int size = this.f4979a.size() - 1; size >= 0; size--) {
                C1293v vVar = (C1293v) this.f4979a.get(size);
                if (vVar.mItemId == j && !vVar.wasReturnedFromScrap()) {
                    if (i == vVar.mItemViewType) {
                        vVar.addFlags(32);
                        if (vVar.isRemoved() && !RecyclerView.this.f4857D.f5010g) {
                            vVar.setFlags(2, 14);
                        }
                        return vVar;
                    } else if (!z) {
                        this.f4979a.remove(size);
                        RecyclerView.this.removeDetachedView(vVar.itemView, false);
                        mo5846b(vVar.itemView);
                    }
                }
            }
            int size2 = this.f4981c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1293v vVar2 = (C1293v) this.f4981c.get(size2);
                if (vVar2.mItemId == j) {
                    if (i == vVar2.mItemViewType) {
                        if (!z) {
                            this.f4981c.remove(size2);
                        }
                        return vVar2;
                    } else if (!z) {
                        m6208e(size2);
                        return null;
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0196  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01b9  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01f2  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0200  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.support.p029v7.widget.RecyclerView.C1293v mo5842b(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0223
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r1 = r1.f4857D
                int r1 = r1.mo5870b()
                if (r3 >= r1) goto L_0x0223
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r1 = r1.f4857D
                boolean r1 = r1.f5010g
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0025
                android.support.v7.widget.RecyclerView$v r1 = r16.m6210f(r17)
                if (r1 == 0) goto L_0x0026
                r4 = 1
                goto L_0x0027
            L_0x0025:
                r1 = r2
            L_0x0026:
                r4 = 0
            L_0x0027:
                if (r1 != 0) goto L_0x005b
                android.support.v7.widget.RecyclerView$v r1 = r16.m6205b(r17, r18)
                if (r1 == 0) goto L_0x005b
                boolean r5 = r6.m6206c(r1)
                if (r5 != 0) goto L_0x005a
                if (r0 != 0) goto L_0x0058
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004c
                android.support.v7.widget.RecyclerView r5 = android.support.p029v7.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0055
            L_0x004c:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0055
                r1.clearReturnedFromScrapFlag()
            L_0x0055:
                r6.mo5838a(r1)
            L_0x0058:
                r1 = r2
                goto L_0x005b
            L_0x005a:
                r4 = 1
            L_0x005b:
                if (r1 != 0) goto L_0x0177
                android.support.v7.widget.RecyclerView r5 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.c r5 = r5.f4907f
                int r5 = r5.mo6463b(r3)
                if (r5 < 0) goto L_0x0142
                android.support.v7.widget.RecyclerView r9 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r9 = r9.f4914m
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x0142
                android.support.v7.widget.RecyclerView r9 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r9 = r9.f4914m
                int r9 = r9.getItemViewType(r5)
                android.support.v7.widget.RecyclerView r10 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r10 = r10.f4914m
                boolean r10 = r10.mHasStableIds
                if (r10 == 0) goto L_0x0092
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r1 = r1.f4914m
                long r10 = r1.getItemId(r5)
                android.support.v7.widget.RecyclerView$v r1 = r6.m6201a(r10, r9, r0)
                if (r1 == 0) goto L_0x0092
                r1.mPosition = r5
                r4 = 1
            L_0x0092:
                if (r1 != 0) goto L_0x00e3
                android.support.v7.widget.RecyclerView$t r0 = r6.f4985g
                if (r0 == 0) goto L_0x00e3
                android.support.v7.widget.RecyclerView$t r0 = r6.f4985g
                android.view.View r0 = r0.mo5872a(r6, r3, r9)
                if (r0 == 0) goto L_0x00e3
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$v r1 = r1.mo5539b(r0)
                if (r1 == 0) goto L_0x00c9
                boolean r0 = r1.shouldIgnore()
                if (r0 != 0) goto L_0x00af
                goto L_0x00e3
            L_0x00af:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.<init>(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5520a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00c9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.<init>(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5520a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00e3:
                if (r1 != 0) goto L_0x00f9
                android.support.v7.widget.RecyclerView$n r0 = r16.mo5853e()
                android.support.v7.widget.RecyclerView$v r1 = r0.mo5826b(r9)
                if (r1 == 0) goto L_0x00f9
                r1.resetInternal()
                boolean r0 = android.support.p029v7.widget.RecyclerView.f4850a
                if (r0 == 0) goto L_0x00f9
                r6.m6209e(r1)
            L_0x00f9:
                if (r1 != 0) goto L_0x0177
                android.support.v7.widget.RecyclerView r0 = android.support.p029v7.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0117
                android.support.v7.widget.RecyclerView$n r10 = r6.f4984f
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo5825a(r11, r12, r14)
                if (r5 != 0) goto L_0x0117
                return r2
            L_0x0117:
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r2 = r2.f4914m
                android.support.v7.widget.RecyclerView r5 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$v r2 = r2.createViewHolder(r5, r9)
                boolean r5 = android.support.p029v7.widget.RecyclerView.f4853d
                if (r5 == 0) goto L_0x0134
                android.view.View r5 = r2.itemView
                android.support.v7.widget.RecyclerView r5 = android.support.p029v7.widget.RecyclerView.m5894i(r5)
                if (r5 == 0) goto L_0x0134
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x0134:
                android.support.v7.widget.RecyclerView r5 = android.support.p029v7.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                android.support.v7.widget.RecyclerView$n r5 = r6.f4984f
                long r10 = r10 - r0
                r5.mo5822a(r9, r10)
                r10 = r2
                goto L_0x0178
            L_0x0142:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.<init>(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r2 = r2.f4857D
                int r2 = r2.mo5870b()
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5520a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0177:
                r10 = r1
            L_0x0178:
                r9 = r4
                if (r9 == 0) goto L_0x01b1
                android.support.v7.widget.RecyclerView r0 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r0 = r0.f4857D
                boolean r0 = r0.f5010g
                if (r0 != 0) goto L_0x01b1
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x01b1
                r10.setFlags(r8, r0)
                android.support.v7.widget.RecyclerView r0 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r0 = r0.f4857D
                boolean r0 = r0.f5013j
                if (r0 == 0) goto L_0x01b1
                int r0 = android.support.p029v7.widget.RecyclerView.C1267f.m6021e(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$f r1 = r1.f4927z
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r2 = r2.f4857D
                java.util.List r4 = r10.getUnmodifiedPayloads()
                android.support.v7.widget.RecyclerView$f$c r0 = r1.mo5729a(r2, r10, r0, r4)
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                r1.mo5529a(r10, r0)
            L_0x01b1:
                android.support.v7.widget.RecyclerView r0 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r0 = r0.f4857D
                boolean r0 = r0.f5010g
                if (r0 == 0) goto L_0x01c2
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01c2
                r10.mPreLayoutPosition = r3
                goto L_0x01d5
            L_0x01c2:
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x01d7
                boolean r0 = r10.needsUpdate()
                if (r0 != 0) goto L_0x01d7
                boolean r0 = r10.isInvalid()
                if (r0 == 0) goto L_0x01d5
                goto L_0x01d7
            L_0x01d5:
                r0 = 0
                goto L_0x01ea
            L_0x01d7:
                android.support.v7.widget.RecyclerView r0 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.c r0 = r0.f4907f
                int r2 = r0.mo6463b(r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.m6204a(r1, r2, r3, r4)
            L_0x01ea:
                android.view.View r1 = r10.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0200
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                android.support.v7.widget.RecyclerView$LayoutParams r1 = (android.support.p029v7.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x0218
            L_0x0200:
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0216
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                android.support.v7.widget.RecyclerView$LayoutParams r1 = (android.support.p029v7.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x0218
            L_0x0216:
                android.support.v7.widget.RecyclerView$LayoutParams r1 = (android.support.p029v7.widget.RecyclerView.LayoutParams) r1
            L_0x0218:
                r1.f4933c = r10
                if (r9 == 0) goto L_0x021f
                if (r0 == 0) goto L_0x021f
                goto L_0x0220
            L_0x021f:
                r7 = 0
            L_0x0220:
                r1.f4936f = r7
                return r10
            L_0x0223:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid item position "
                r1.<init>(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r2 = r2.f4857D
                int r2 = r2.mo5870b()
                r1.append(r2)
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                java.lang.String r2 = r2.mo5520a()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.RecyclerView.C1284o.mo5842b(int, boolean, long):android.support.v7.widget.RecyclerView$v");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5835a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f4981c.size() - 1; size >= 0; size--) {
                C1293v vVar = (C1293v) this.f4981c.get(size);
                if (vVar != null) {
                    if (vVar.mPosition >= i3) {
                        vVar.offsetPosition(-i2, z);
                    } else if (vVar.mPosition >= i) {
                        vVar.addFlags(8);
                        m6208e(size);
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m6204a(C1293v vVar, int i, int i2, long j) {
            vVar.mOwnerRecyclerView = RecyclerView.this;
            int i3 = vVar.mItemViewType;
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f4984f.mo5829b(i3, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f4914m.bindViewHolder(vVar, i);
            this.f4984f.mo5828b(vVar.mItemViewType, RecyclerView.this.getNanoTime() - nanoTime);
            m6207d(vVar);
            if (RecyclerView.this.f4857D.f5010g) {
                vVar.mPreLayoutPosition = i2;
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$p */
    public interface C1285p {
        void onViewRecycled(C1293v vVar);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$q */
    class C1286q extends C1264c {
        /* renamed from: b */
        private void m6239b() {
            if (!RecyclerView.f4852c || !RecyclerView.this.f4919r || !RecyclerView.this.f4918q) {
                RecyclerView.this.f4924w = true;
                RecyclerView.this.requestLayout();
                return;
            }
            C0991u.m4190a((View) RecyclerView.this, RecyclerView.this.f4911j);
        }

        /* renamed from: a */
        public final void mo5721a() {
            RecyclerView.this.mo5531a((String) null);
            RecyclerView.this.f4857D.f5009f = true;
            RecyclerView.this.mo5547b(true);
            if (!RecyclerView.this.f4907f.mo6468d()) {
                RecyclerView.this.requestLayout();
            }
        }

        C1286q() {
        }

        /* renamed from: b */
        public final void mo5725b(int i, int i2) {
            RecyclerView.this.mo5531a((String) null);
            if (RecyclerView.this.f4907f.mo6460a(i, i2)) {
                m6239b();
            }
        }

        /* renamed from: c */
        public final void mo5726c(int i, int i2) {
            RecyclerView.this.mo5531a((String) null);
            if (RecyclerView.this.f4907f.mo6465b(i, i2)) {
                m6239b();
            }
        }

        /* renamed from: a */
        public final void mo5723a(int i, int i2, int i3) {
            RecyclerView.this.mo5531a((String) null);
            if (RecyclerView.this.f4907f.mo6461a(i, i2, i3)) {
                m6239b();
            }
        }

        /* renamed from: a */
        public final void mo5724a(int i, int i2, Object obj) {
            RecyclerView.this.mo5531a((String) null);
            if (RecyclerView.this.f4907f.mo6462a(i, i2, obj)) {
                m6239b();
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$r */
    public static abstract class C1287r {

        /* renamed from: a */
        private RecyclerView f4989a;

        /* renamed from: b */
        private View f4990b;

        /* renamed from: c */
        private final C1288a f4991c = new C1288a(0, 0);

        /* renamed from: d */
        private boolean f4992d;

        /* renamed from: g */
        public int f4993g = -1;

        /* renamed from: h */
        public C1273i f4994h;

        /* renamed from: i */
        public boolean f4995i;

        /* renamed from: j */
        public boolean f4996j;

        /* renamed from: android.support.v7.widget.RecyclerView$r$a */
        public static class C1288a {

            /* renamed from: a */
            public int f4997a;

            /* renamed from: b */
            public int f4998b;

            /* renamed from: c */
            public int f4999c;

            /* renamed from: d */
            public int f5000d;

            /* renamed from: e */
            public Interpolator f5001e;

            /* renamed from: f */
            private boolean f5002f;

            /* renamed from: g */
            private int f5003g;

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final boolean mo5866a() {
                if (this.f5000d >= 0) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            private void m6257b() {
                if (this.f5001e != null && this.f4999c <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f4999c <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo5865a(RecyclerView recyclerView) {
                if (this.f5000d >= 0) {
                    int i = this.f5000d;
                    this.f5000d = -1;
                    recyclerView.mo5552c(i);
                    this.f5002f = false;
                } else if (this.f5002f) {
                    m6257b();
                    if (this.f5001e != null) {
                        recyclerView.f4854A.mo5876a(this.f4997a, this.f4998b, this.f4999c, this.f5001e);
                    } else if (this.f4999c == Integer.MIN_VALUE) {
                        recyclerView.f4854A.mo5879b(this.f4997a, this.f4998b);
                    } else {
                        recyclerView.f4854A.mo5875a(this.f4997a, this.f4998b, this.f4999c);
                    }
                    this.f5003g++;
                    this.f5002f = false;
                } else {
                    this.f5003g = 0;
                }
            }

            public C1288a(int i, int i2) {
                this(0, 0, Integer.MIN_VALUE, null);
            }

            /* renamed from: a */
            public final void mo5864a(int i, int i2, int i3, Interpolator interpolator) {
                this.f4997a = i;
                this.f4998b = i2;
                this.f4999c = i3;
                this.f5001e = interpolator;
                this.f5002f = true;
            }

            private C1288a(int i, int i2, int i3, Interpolator interpolator) {
                this.f5000d = -1;
                this.f4997a = i;
                this.f4998b = i2;
                this.f4999c = Integer.MIN_VALUE;
                this.f5001e = null;
            }
        }

        /* renamed from: android.support.v7.widget.RecyclerView$r$b */
        public interface C1289b {
            /* renamed from: d */
            PointF mo5434d(int i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo5468a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo5469a(int i, int i2, C1290s sVar, C1288a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo5470a(View view, C1290s sVar, C1288a aVar);

        /* renamed from: e */
        public final int mo5863e() {
            return this.f4989a.f4915n.mo5800s();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo5862d() {
            if (this.f4996j) {
                this.f4996j = false;
                mo5468a();
                this.f4989a.f4857D.f5004a = -1;
                this.f4990b = null;
                this.f4993g = -1;
                this.f4995i = false;
                this.f4994h.mo5772b(this);
                this.f4994h = null;
                this.f4989a = null;
            }
        }

        /* renamed from: b */
        private int m6247b(View view) {
            return RecyclerView.m5893g(view);
        }

        /* renamed from: a */
        private View mo5465a(int i) {
            return this.f4989a.f4915n.mo5432c(i);
        }

        /* renamed from: c */
        public PointF mo5861c(int i) {
            C1273i iVar = this.f4994h;
            if (iVar instanceof C1289b) {
                return ((C1289b) iVar).mo5434d(i);
            }
            return null;
        }

        /* renamed from: a */
        protected static void m6246a(PointF pointF) {
            float sqrt = (float) Math.sqrt((double) ((pointF.x * pointF.x) + (pointF.y * pointF.y)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo5860a(View view) {
            if (m6247b(view) == this.f4993g) {
                this.f4990b = view;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5859a(RecyclerView recyclerView, C1273i iVar) {
            this.f4989a = recyclerView;
            this.f4994h = iVar;
            if (this.f4993g != -1) {
                this.f4989a.f4857D.f5004a = this.f4993g;
                this.f4996j = true;
                this.f4995i = true;
                this.f4990b = mo5465a(this.f4993g);
                this.f4989a.f4854A.mo5873a();
                this.f4992d = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5858a(int i, int i2) {
            RecyclerView recyclerView = this.f4989a;
            if (!this.f4996j || this.f4993g == -1 || recyclerView == null) {
                mo5862d();
            }
            if (this.f4995i && this.f4990b == null && this.f4994h != null) {
                PointF c = mo5861c(this.f4993g);
                if (!(c == null || (c.x == 0.0f && c.y == 0.0f))) {
                    recyclerView.mo5524a((int) Math.signum(c.x), (int) Math.signum(c.y), (int[]) null);
                }
            }
            this.f4995i = false;
            if (this.f4990b != null) {
                if (m6247b(this.f4990b) == this.f4993g) {
                    mo5470a(this.f4990b, recyclerView.f4857D, this.f4991c);
                    this.f4991c.mo5865a(recyclerView);
                    mo5862d();
                } else {
                    this.f4990b = null;
                }
            }
            if (this.f4996j) {
                mo5469a(i, i2, recyclerView.f4857D, this.f4991c);
                boolean a = this.f4991c.mo5866a();
                this.f4991c.mo5865a(recyclerView);
                if (a) {
                    if (this.f4996j) {
                        this.f4995i = true;
                        recyclerView.f4854A.mo5873a();
                        return;
                    }
                    mo5862d();
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$s */
    public static class C1290s {

        /* renamed from: a */
        public int f5004a = -1;

        /* renamed from: b */
        int f5005b;

        /* renamed from: c */
        int f5006c;

        /* renamed from: d */
        int f5007d = 1;

        /* renamed from: e */
        int f5008e;

        /* renamed from: f */
        public boolean f5009f;

        /* renamed from: g */
        public boolean f5010g;

        /* renamed from: h */
        boolean f5011h;

        /* renamed from: i */
        public boolean f5012i;

        /* renamed from: j */
        public boolean f5013j;

        /* renamed from: k */
        public boolean f5014k;

        /* renamed from: l */
        int f5015l;

        /* renamed from: m */
        long f5016m;

        /* renamed from: n */
        int f5017n;

        /* renamed from: o */
        public int f5018o;

        /* renamed from: p */
        public int f5019p;

        /* renamed from: q */
        private SparseArray<Object> f5020q;

        /* renamed from: a */
        public final boolean mo5869a() {
            if (this.f5004a != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final int mo5870b() {
            if (this.f5010g) {
                return this.f5005b - this.f5006c;
            }
            return this.f5008e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.f5004a);
            sb.append(", mData=");
            sb.append(this.f5020q);
            sb.append(", mItemCount=");
            sb.append(this.f5008e);
            sb.append(", mIsMeasuring=");
            sb.append(this.f5012i);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f5005b);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f5006c);
            sb.append(", mStructureChanged=");
            sb.append(this.f5009f);
            sb.append(", mInPreLayout=");
            sb.append(this.f5010g);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f5013j);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.f5014k);
            sb.append('}');
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5868a(C1262a aVar) {
            this.f5007d = 1;
            this.f5008e = aVar.getItemCount();
            this.f5010g = false;
            this.f5011h = false;
            this.f5012i = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5867a(int i) {
            if ((this.f5007d & i) == 0) {
                StringBuilder sb = new StringBuilder("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.f5007d));
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$t */
    public static abstract class C1291t {
        /* renamed from: a */
        public abstract View mo5872a(C1284o oVar, int i, int i2);
    }

    /* renamed from: android.support.v7.widget.RecyclerView$u */
    class C1292u implements Runnable {

        /* renamed from: a */
        OverScroller f5021a;

        /* renamed from: b */
        Interpolator f5022b = RecyclerView.f4844L;

        /* renamed from: d */
        private int f5024d;

        /* renamed from: e */
        private int f5025e;

        /* renamed from: f */
        private boolean f5026f;

        /* renamed from: g */
        private boolean f5027g;

        /* renamed from: c */
        private void m6270c() {
            this.f5027g = false;
            this.f5026f = true;
        }

        /* renamed from: d */
        private void m6271d() {
            this.f5026f = false;
            if (this.f5027g) {
                mo5873a();
            }
        }

        /* renamed from: b */
        public final void mo5878b() {
            RecyclerView.this.removeCallbacks(this);
            this.f5021a.abortAnimation();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5873a() {
            if (this.f5026f) {
                this.f5027g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            C0991u.m4190a((View) RecyclerView.this, (Runnable) this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e4, code lost:
            if (r8 > 0) goto L_0x00e8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r22 = this;
                r0 = r22
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r1 = r1.f4915n
                if (r1 != 0) goto L_0x000c
                r22.mo5878b()
                return
            L_0x000c:
                r22.m6270c()
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                r1.mo5573e()
                android.widget.OverScroller r1 = r0.f5021a
                android.support.v7.widget.RecyclerView r2 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r2 = r2.f4915n
                android.support.v7.widget.RecyclerView$r r2 = r2.f4965y
                boolean r3 = r1.computeScrollOffset()
                r4 = 0
                if (r3 == 0) goto L_0x018a
                android.support.v7.widget.RecyclerView r3 = android.support.p029v7.widget.RecyclerView.this
                int[] r3 = r3.f4862I
                int r11 = r1.getCurrX()
                int r12 = r1.getCurrY()
                int r5 = r0.f5024d
                int r13 = r11 - r5
                int r5 = r0.f5025e
                int r14 = r12 - r5
                r0.f5024d = r11
                r0.f5025e = r12
                android.support.v7.widget.RecyclerView r5 = android.support.p029v7.widget.RecyclerView.this
                r9 = 0
                r10 = 1
                r6 = r13
                r7 = r14
                r8 = r3
                boolean r5 = r5.mo5534a(r6, r7, r8, r9, r10)
                r6 = 1
                if (r5 == 0) goto L_0x004f
                r5 = r3[r4]
                int r13 = r13 - r5
                r3 = r3[r6]
                int r14 = r14 - r3
            L_0x004f:
                android.support.v7.widget.RecyclerView r3 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$a r3 = r3.f4914m
                if (r3 == 0) goto L_0x0095
                android.support.v7.widget.RecyclerView r3 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView r5 = android.support.p029v7.widget.RecyclerView.this
                int[] r5 = r5.f4863J
                r3.mo5524a(r13, r14, r5)
                android.support.v7.widget.RecyclerView r3 = android.support.p029v7.widget.RecyclerView.this
                int[] r3 = r3.f4863J
                r3 = r3[r4]
                android.support.v7.widget.RecyclerView r5 = android.support.p029v7.widget.RecyclerView.this
                int[] r5 = r5.f4863J
                r5 = r5[r6]
                int r7 = r13 - r3
                int r8 = r14 - r5
                if (r2 == 0) goto L_0x0099
                boolean r9 = r2.f4995i
                if (r9 != 0) goto L_0x0099
                boolean r9 = r2.f4996j
                if (r9 == 0) goto L_0x0099
                android.support.v7.widget.RecyclerView r9 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$s r9 = r9.f4857D
                int r9 = r9.mo5870b()
                if (r9 != 0) goto L_0x0086
                r2.mo5862d()
                goto L_0x0099
            L_0x0086:
                int r10 = r2.f4993g
                if (r10 < r9) goto L_0x008d
                int r9 = r9 - r6
                r2.f4993g = r9
            L_0x008d:
                int r9 = r13 - r7
                int r10 = r14 - r8
                r2.mo5858a(r9, r10)
                goto L_0x0099
            L_0x0095:
                r3 = 0
                r5 = 0
                r7 = 0
                r8 = 0
            L_0x0099:
                android.support.v7.widget.RecyclerView r9 = android.support.p029v7.widget.RecyclerView.this
                java.util.ArrayList<android.support.v7.widget.RecyclerView$h> r9 = r9.f4917p
                boolean r9 = r9.isEmpty()
                if (r9 != 0) goto L_0x00a8
                android.support.v7.widget.RecyclerView r9 = android.support.p029v7.widget.RecyclerView.this
                r9.invalidate()
            L_0x00a8:
                android.support.v7.widget.RecyclerView r9 = android.support.p029v7.widget.RecyclerView.this
                int r9 = r9.getOverScrollMode()
                r10 = 2
                if (r9 == r10) goto L_0x00b6
                android.support.v7.widget.RecyclerView r9 = android.support.p029v7.widget.RecyclerView.this
                r9.mo5553c(r13, r14)
            L_0x00b6:
                android.support.v7.widget.RecyclerView r15 = android.support.p029v7.widget.RecyclerView.this
                r20 = 0
                r21 = 1
                r16 = r3
                r17 = r5
                r18 = r7
                r19 = r8
                boolean r9 = r15.mo5533a(r16, r17, r18, r19, r20, r21)
                if (r9 != 0) goto L_0x010c
                if (r7 != 0) goto L_0x00ce
                if (r8 == 0) goto L_0x010c
            L_0x00ce:
                float r9 = r1.getCurrVelocity()
                int r9 = (int) r9
                if (r7 == r11) goto L_0x00dd
                if (r7 >= 0) goto L_0x00d9
                int r15 = -r9
                goto L_0x00de
            L_0x00d9:
                if (r7 <= 0) goto L_0x00dd
                r15 = r9
                goto L_0x00de
            L_0x00dd:
                r15 = 0
            L_0x00de:
                if (r8 == r12) goto L_0x00e7
                if (r8 >= 0) goto L_0x00e4
                int r9 = -r9
                goto L_0x00e8
            L_0x00e4:
                if (r8 <= 0) goto L_0x00e7
                goto L_0x00e8
            L_0x00e7:
                r9 = 0
            L_0x00e8:
                android.support.v7.widget.RecyclerView r4 = android.support.p029v7.widget.RecyclerView.this
                int r4 = r4.getOverScrollMode()
                if (r4 == r10) goto L_0x00f5
                android.support.v7.widget.RecyclerView r4 = android.support.p029v7.widget.RecyclerView.this
                r4.mo5562d(r15, r9)
            L_0x00f5:
                if (r15 != 0) goto L_0x00ff
                if (r7 == r11) goto L_0x00ff
                int r4 = r1.getFinalX()
                if (r4 != 0) goto L_0x010c
            L_0x00ff:
                if (r9 != 0) goto L_0x0109
                if (r8 == r12) goto L_0x0109
                int r4 = r1.getFinalY()
                if (r4 != 0) goto L_0x010c
            L_0x0109:
                r1.abortAnimation()
            L_0x010c:
                if (r3 != 0) goto L_0x0110
                if (r5 == 0) goto L_0x0115
            L_0x0110:
                android.support.v7.widget.RecyclerView r4 = android.support.p029v7.widget.RecyclerView.this
                r4.mo5603h(r3, r5)
            L_0x0115:
                android.support.v7.widget.RecyclerView r4 = android.support.p029v7.widget.RecyclerView.this
                boolean r4 = r4.awakenScrollBars()
                if (r4 != 0) goto L_0x0122
                android.support.v7.widget.RecyclerView r4 = android.support.p029v7.widget.RecyclerView.this
                r4.invalidate()
            L_0x0122:
                if (r14 == 0) goto L_0x0132
                android.support.v7.widget.RecyclerView r4 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r4 = r4.f4915n
                boolean r4 = r4.mo5441f()
                if (r4 == 0) goto L_0x0132
                if (r5 != r14) goto L_0x0132
                r4 = 1
                goto L_0x0133
            L_0x0132:
                r4 = 0
            L_0x0133:
                if (r13 == 0) goto L_0x0143
                android.support.v7.widget.RecyclerView r5 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.RecyclerView$i r5 = r5.f4915n
                boolean r5 = r5.mo5438e()
                if (r5 == 0) goto L_0x0143
                if (r3 != r13) goto L_0x0143
                r3 = 1
                goto L_0x0144
            L_0x0143:
                r3 = 0
            L_0x0144:
                if (r13 != 0) goto L_0x0148
                if (r14 == 0) goto L_0x014f
            L_0x0148:
                if (r3 != 0) goto L_0x014f
                if (r4 == 0) goto L_0x014d
                goto L_0x014f
            L_0x014d:
                r3 = 0
                goto L_0x0150
            L_0x014f:
                r3 = 1
            L_0x0150:
                boolean r1 = r1.isFinished()
                if (r1 != 0) goto L_0x0174
                if (r3 != 0) goto L_0x0161
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                boolean r1 = r1.mo5607i(r6)
                if (r1 != 0) goto L_0x0161
                goto L_0x0174
            L_0x0161:
                r22.mo5873a()
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.ab r1 = r1.f4855B
                if (r1 == 0) goto L_0x018a
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.ab r1 = r1.f4855B
                android.support.v7.widget.RecyclerView r3 = android.support.p029v7.widget.RecyclerView.this
                r1.mo6248a(r3, r13, r14)
                goto L_0x018a
            L_0x0174:
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                r3 = 0
                r1.setScrollState(r3)
                boolean r1 = android.support.p029v7.widget.RecyclerView.f4853d
                if (r1 == 0) goto L_0x0185
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                android.support.v7.widget.ab$a r1 = r1.f4856C
                r1.mo6252a()
            L_0x0185:
                android.support.v7.widget.RecyclerView r1 = android.support.p029v7.widget.RecyclerView.this
                r1.mo3524a(r6)
            L_0x018a:
                if (r2 == 0) goto L_0x019b
                boolean r1 = r2.f4995i
                if (r1 == 0) goto L_0x0194
                r1 = 0
                r2.mo5858a(r1, r1)
            L_0x0194:
                boolean r1 = r0.f5027g
                if (r1 != 0) goto L_0x019b
                r2.mo5862d()
            L_0x019b:
                r22.m6271d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.RecyclerView.C1292u.run():void");
        }

        /* renamed from: a */
        private static float m6267a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        C1292u() {
            this.f5021a = new OverScroller(RecyclerView.this.getContext(), RecyclerView.f4844L);
        }

        /* renamed from: b */
        public final void mo5879b(int i, int i2) {
            m6268a(i, i2, 0, 0);
        }

        /* renamed from: a */
        public final void mo5874a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f5025e = 0;
            this.f5024d = 0;
            this.f5021a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo5873a();
        }

        /* renamed from: a */
        public final void mo5875a(int i, int i2, int i3) {
            mo5876a(i, i2, i3, RecyclerView.f4844L);
        }

        /* renamed from: a */
        public final void mo5877a(int i, int i2, Interpolator interpolator) {
            int b = m6269b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.f4844L;
            }
            mo5876a(i, i2, b, interpolator);
        }

        /* renamed from: a */
        private void m6268a(int i, int i2, int i3, int i4) {
            mo5875a(i, i2, m6269b(i, i2, 0, 0));
        }

        /* renamed from: b */
        private int m6269b(int i, int i2, int i3, int i4) {
            boolean z;
            int i5;
            int i6;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            if (z) {
                i5 = RecyclerView.this.getWidth();
            } else {
                i5 = RecyclerView.this.getHeight();
            }
            int i7 = i5 / 2;
            float f = (float) i5;
            float f2 = (float) i7;
            float a = f2 + (m6267a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i6 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i6 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i6, AdError.SERVER_ERROR_CODE);
        }

        /* renamed from: a */
        public final void mo5876a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f5022b != interpolator) {
                this.f5022b = interpolator;
                this.f5021a = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f5025e = 0;
            this.f5024d = 0;
            this.f5021a.startScroll(0, 0, i, i2, i3);
            if (VERSION.SDK_INT < 23) {
                this.f5021a.computeScrollOffset();
            }
            mo5873a();
        }
    }

    /* renamed from: android.support.v7.widget.RecyclerView$v */
    public static abstract class C1293v {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public final View itemView;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        public long mItemId = -1;
        public int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        public int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        C1284o mScrapContainer;
        C1293v mShadowedHolder;
        C1293v mShadowingHolder;
        List<Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        /* access modifiers changed from: 0000 */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: 0000 */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: 0000 */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: 0000 */
        public boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        /* access modifiers changed from: 0000 */
        public void unScrap() {
            this.mScrapContainer.mo5845b(this);
        }

        /* access modifiers changed from: 0000 */
        public void clearPayload() {
            if (this.mPayloads != null) {
                this.mPayloads.clear();
            }
            this.mFlags &= -1025;
        }

        public final int getAdapterPosition() {
            if (this.mOwnerRecyclerView == null) {
                return -1;
            }
            return this.mOwnerRecyclerView.mo5549c(this);
        }

        public final int getLayoutPosition() {
            if (this.mPreLayoutPosition == -1) {
                return this.mPosition;
            }
            return this.mPreLayoutPosition;
        }

        public final int getPosition() {
            if (this.mPreLayoutPosition == -1) {
                return this.mPosition;
            }
            return this.mPreLayoutPosition;
        }

        /* access modifiers changed from: 0000 */
        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean isTmpDetached() {
            if ((this.mFlags & 256) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldIgnore() {
            if ((this.mFlags & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0 || !C0991u.m4210d(this.itemView)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            if (this.mPayloads == null || this.mPayloads.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: 0000 */
        public boolean isAdapterPositionUnknown() {
            if ((this.mFlags & 512) != 0 || isInvalid()) {
                return true;
            }
            return false;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0 || C0991u.m4210d(this.itemView)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m5884b(this);
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ViewHolder{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sb3 = new StringBuilder(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: 0000 */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: 0000 */
        public boolean hasAnyOfTheFlags(int i) {
            if ((i & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.mo5536a(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public C1293v(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: 0000 */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(PreloadTask.BYTE_UNIT_NUMBER);
                return;
            }
            if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: 0000 */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            if (this.mPendingAccessibilityState != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = this.mPendingAccessibilityState;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C0991u.m4214f(this.itemView);
            }
            recyclerView.mo5536a(this, 4);
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            if (z) {
                i = this.mIsRecyclableCount - 1;
            } else {
                i = this.mIsRecyclableCount + 1;
            }
            this.mIsRecyclableCount = i;
            if (this.mIsRecyclableCount < 0) {
                this.mIsRecyclableCount = 0;
            } else if (z || this.mIsRecyclableCount != 1) {
                if (z && this.mIsRecyclableCount == 0) {
                    this.mFlags &= -17;
                }
            } else {
                this.mFlags |= 16;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setScrapContainer(C1284o oVar, boolean z) {
            this.mScrapContainer = oVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: 0000 */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (i2 ^ -1));
        }

        /* access modifiers changed from: 0000 */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f4935e = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }
    }

    public C1262a getAdapter() {
        return this.f4914m;
    }

    public boolean getClipToPadding() {
        return this.f4910i;
    }

    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.f4861H;
    }

    public C1266e getEdgeEffectFactory() {
        return this.f4886ag;
    }

    public C1267f getItemAnimator() {
        return this.f4927z;
    }

    public C1273i getLayoutManager() {
        return this.f4915n;
    }

    public int getMaxFlingVelocity() {
        return this.f4901av;
    }

    public int getMinFlingVelocity() {
        return this.f4900au;
    }

    public C1279k getOnFlingListener() {
        return this.f4899at;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4904ay;
    }

    public int getScrollState() {
        return this.f4891al;
    }

    public boolean isAttachedToWindow() {
        return this.f4918q;
    }

    public void scrollTo(int i, int i2) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo5520a() {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.f4914m);
        sb.append(", layout:");
        sb.append(this.f4915n);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    /* renamed from: a */
    private void m5869a(C1262a aVar, boolean z, boolean z2) {
        if (this.f4914m != null) {
            this.f4914m.unregisterAdapterDataObserver(this.f4865R);
            this.f4914m.onDetachedFromRecyclerView(this);
        }
        mo5540b();
        this.f4907f.mo6458a();
        C1262a aVar2 = this.f4914m;
        this.f4914m = aVar;
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.f4865R);
            aVar.onAttachedToRecyclerView(this);
        }
        if (this.f4915n != null) {
            this.f4915n.mo5752a(aVar2, this.f4914m);
        }
        this.f4906e.mo5836a(aVar2, this.f4914m, false);
        this.f4857D.f5009f = true;
    }

    /* renamed from: a */
    public final void mo5526a(C1278j jVar) {
        if (this.f4883ad == null) {
            this.f4883ad = new ArrayList();
        }
        this.f4883ad.add(jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5537a(View view) {
        m5904r();
        boolean f = this.f4908g.mo6610f(view);
        if (f) {
            C1293v d = m5889d(view);
            this.f4906e.mo5845b(d);
            this.f4906e.mo5838a(d);
        }
        m5888c(!f);
        return f;
    }

    /* renamed from: a */
    private void m5870a(C1272h hVar, int i) {
        if (this.f4915n != null) {
            this.f4915n.mo5425a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4917p.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f4917p.add(hVar);
        mo5611k();
        requestLayout();
    }

    /* renamed from: a */
    public final void mo5525a(C1272h hVar) {
        m5870a(hVar, -1);
    }

    /* renamed from: a */
    public final void mo5528a(C1281m mVar) {
        if (this.f4871aA == null) {
            this.f4871aA = new ArrayList();
        }
        this.f4871aA.add(mVar);
    }

    /* renamed from: b */
    public final void mo5545b(C1281m mVar) {
        if (this.f4871aA != null) {
            this.f4871aA.remove(mVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5524a(int i, int i2, int[] iArr) {
        m5904r();
        mo5579g();
        C0885f.m3753a("RV Scroll");
        m5871a(this.f4857D);
        int a = i != 0 ? this.f4915n.mo5361a(i, this.f4906e, this.f4857D) : 0;
        int b = i2 != 0 ? this.f4915n.mo5381b(i2, this.f4906e, this.f4857D) : 0;
        C0885f.m3752a();
        m5860Q();
        m5845B();
        m5888c(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    /* renamed from: a */
    private boolean m5879a(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo5573e();
        if (this.f4914m != null) {
            mo5524a(i7, i8, this.f4863J);
            int i9 = this.f4863J[0];
            int i10 = this.f4863J[1];
            i5 = i9;
            i4 = i10;
            i3 = i7 - i9;
            i6 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.f4917p.isEmpty()) {
            invalidate();
        }
        int i11 = i6;
        if (mo5533a(i5, i4, i3, i6, this.f4876aF, 0)) {
            this.f4896aq -= this.f4876aF[0];
            this.f4897ar -= this.f4876aF[1];
            if (motionEvent2 != null) {
                motionEvent2.offsetLocation((float) this.f4876aF[0], (float) this.f4876aF[1]);
            }
            int[] iArr = this.f4877aG;
            iArr[0] = iArr[0] + this.f4876aF[0];
            int[] iArr2 = this.f4877aG;
            iArr2[1] = iArr2[1] + this.f4876aF[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C0978j.m4135e(motionEvent2, 8194)) {
                m5864a(motionEvent.getX(), (float) i3, motionEvent.getY(), (float) i11);
            }
            mo5553c(i, i2);
        }
        if (!(i5 == 0 && i4 == 0)) {
            mo5603h(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i5 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: a */
    public final void mo5521a(int i, int i2) {
        m5865a(i, i2, (Interpolator) null);
    }

    /* renamed from: b */
    public boolean mo5548b(int i, int i2) {
        if (this.f4915n == null || this.f4923v) {
            return false;
        }
        boolean e = this.f4915n.mo5438e();
        boolean f = this.f4915n.mo5441f();
        if (!e || Math.abs(i) < this.f4900au) {
            i = 0;
        }
        if (!f || Math.abs(i2) < this.f4900au) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f2 = (float) i;
        float f3 = (float) i2;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z = e || f;
            dispatchNestedFling(f2, f3, z);
            if (this.f4899at != null && this.f4899at.mo5816a(i, i2)) {
                return true;
            }
            if (z) {
                if (f) {
                    e |= true;
                }
                m5897j(e ? 1 : 0, 1);
                this.f4854A.mo5874a(Math.max(-this.f4901av, Math.min(i, this.f4901av)), Math.max(-this.f4901av, Math.min(i2, this.f4901av)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m5882a(View view, View view2, int i) {
        if (view2 == null || view2 == this || mo5550c(view2) == null) {
            return false;
        }
        if (view == null || mo5550c(view) == null) {
            return true;
        }
        this.f4912k.set(0, 0, view.getWidth(), view.getHeight());
        this.f4867T.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f4912k);
        offsetDescendantRectToMyCoords(view2, this.f4867T);
        char c = 65535;
        int i2 = this.f4915n.mo5798q() == 1 ? -1 : 1;
        int i3 = ((this.f4912k.left < this.f4867T.left || this.f4912k.right <= this.f4867T.left) && this.f4912k.right < this.f4867T.right) ? 1 : ((this.f4912k.right > this.f4867T.right || this.f4912k.left >= this.f4867T.right) && this.f4912k.left > this.f4867T.left) ? -1 : 0;
        if ((this.f4912k.top < this.f4867T.top || this.f4912k.bottom <= this.f4867T.top) && this.f4912k.bottom < this.f4867T.bottom) {
            c = 1;
        } else if ((this.f4912k.bottom <= this.f4867T.bottom && this.f4912k.top < this.f4867T.bottom) || this.f4912k.top <= this.f4867T.top) {
            c = 0;
        }
        if (i == 17) {
            return i3 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i3 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        switch (i) {
            case 1:
                return c < 0 || (c == 0 && i3 * i2 <= 0);
            case 2:
                return c > 0 || (c == 0 && i3 * i2 >= 0);
            default:
                StringBuilder sb = new StringBuilder("Invalid direction: ");
                sb.append(i);
                sb.append(mo5520a());
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m5877a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4912k.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f4935e) {
                Rect rect = layoutParams2.f4934d;
                this.f4912k.left -= rect.left;
                this.f4912k.right += rect.right;
                this.f4912k.top -= rect.top;
                this.f4912k.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4912k);
            offsetRectIntoDescendantCoords(view, this.f4912k);
        }
        this.f4915n.mo5764a(this, view, this.f4912k, !this.f4921t, view2 == null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5531a(String str) {
        if (!mo5606i()) {
            return;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
            sb.append(mo5520a());
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: a */
    public final void mo5527a(C1280l lVar) {
        this.f4868U.add(lVar);
    }

    /* renamed from: b */
    public final void mo5544b(C1280l lVar) {
        this.f4868U.remove(lVar);
        if (this.f4869V == lVar) {
            this.f4869V = null;
        }
    }

    /* renamed from: a */
    private boolean m5881a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f4869V = null;
        }
        int size = this.f4868U.size();
        int i = 0;
        while (i < size) {
            C1280l lVar = (C1280l) this.f4868U.get(i);
            if (!lVar.mo5690a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f4869V = lVar;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5532a(boolean z) {
        this.f4884ae--;
        if (this.f4884ae <= 0) {
            this.f4884ae = 0;
            if (z) {
                m5846C();
                m5861R();
            }
        }
    }

    /* renamed from: a */
    private boolean m5883a(AccessibilityEvent accessibilityEvent) {
        if (!mo5606i()) {
            return false;
        }
        int a = accessibilityEvent != null ? C0941a.m3978a(accessibilityEvent) : 0;
        if (a == 0) {
            a = 0;
        }
        this.f4881ab = a | this.f4881ab;
        return true;
    }

    /* renamed from: a */
    private void m5871a(C1290s sVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f4854A.f5021a;
            sVar.f5018o = overScroller.getFinalX() - overScroller.getCurrX();
            sVar.f5019p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        sVar.f5018o = 0;
        sVar.f5019p = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5529a(C1293v vVar, C1270c cVar) {
        vVar.setFlags(0, VideoCacheReadBuffersizeExperiment.DEFAULT);
        if (this.f4857D.f5011h && vVar.isUpdated() && !vVar.isRemoved() && !vVar.shouldIgnore()) {
            this.f4909h.mo6444a(m5891e(vVar), vVar);
        }
        this.f4909h.mo6445a(vVar, cVar);
    }

    /* renamed from: a */
    private void m5878a(int[] iArr) {
        int b = this.f4908g.mo6600b();
        if (b == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < b; i3++) {
            C1293v d = m5889d(this.f4908g.mo6602b(i3));
            if (!d.shouldIgnore()) {
                int layoutPosition = d.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5530a(C1293v vVar, C1270c cVar, C1270c cVar2) {
        vVar.setIsRecyclable(false);
        if (this.f4927z.mo5733b(vVar, cVar, cVar2)) {
            mo5609j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo5546b(C1293v vVar, C1270c cVar, C1270c cVar2) {
        m5890d(vVar);
        vVar.setIsRecyclable(false);
        if (this.f4927z.mo5731a(vVar, cVar, cVar2)) {
            mo5609j();
        }
    }

    /* renamed from: a */
    private void m5872a(C1293v vVar, C1293v vVar2, C1270c cVar, C1270c cVar2, boolean z, boolean z2) {
        vVar.setIsRecyclable(false);
        if (z) {
            m5890d(vVar);
        }
        if (vVar != vVar2) {
            if (z2) {
                m5890d(vVar2);
            }
            vVar.mShadowedHolder = vVar2;
            m5890d(vVar);
            this.f4906e.mo5845b(vVar);
            vVar2.setIsRecyclable(false);
            vVar2.mShadowingHolder = vVar;
        }
        if (this.f4927z.mo5732a(vVar, vVar2, cVar, cVar2)) {
            mo5609j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5523a(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c = this.f4908g.mo6603c();
        for (int i4 = 0; i4 < c; i4++) {
            C1293v d = m5889d(this.f4908g.mo6606d(i4));
            if (d != null && !d.shouldIgnore()) {
                if (d.mPosition >= i3) {
                    d.offsetPosition(-i2, z);
                    this.f4857D.f5009f = true;
                } else if (d.mPosition >= i) {
                    d.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f4857D.f5009f = true;
                }
            }
        }
        this.f4906e.mo5835a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5522a(int i, int i2, Object obj) {
        int c = this.f4908g.mo6603c();
        int i3 = i + i2;
        for (int i4 = 0; i4 < c; i4++) {
            View d = this.f4908g.mo6606d(i4);
            C1293v d2 = m5889d(d);
            if (d2 != null && !d2.shouldIgnore() && d2.mPosition >= i && d2.mPosition < i3) {
                d2.addFlags(2);
                d2.addChangePayload(obj);
                ((LayoutParams) d.getLayoutParams()).f4935e = true;
            }
        }
        this.f4906e.mo5849c(i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5535a(C1293v vVar) {
        return this.f4927z == null || this.f4927z.mo5329a(vVar, vVar.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo5547b(boolean z) {
        this.f4926y = z | this.f4926y;
        this.f4925x = true;
        m5859P();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1293v mo5518a(int i, boolean z) {
        int c = this.f4908g.mo6603c();
        C1293v vVar = null;
        for (int i2 = 0; i2 < c; i2++) {
            C1293v d = m5889d(this.f4908g.mo6606d(i2));
            if (d != null && !d.isRemoved()) {
                if (z) {
                    if (d.mPosition != i) {
                        continue;
                    }
                } else if (d.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.f4908g.mo6605c(d.itemView)) {
                    return d;
                }
                vVar = d;
            }
        }
        return vVar;
    }

    /* renamed from: a */
    public final View mo5519a(float f, float f2) {
        for (int b = this.f4908g.mo6600b() - 1; b >= 0; b--) {
            View b2 = this.f4908g.mo6602b(b);
            float translationX = b2.getTranslationX();
            float translationY = b2.getTranslationY();
            if (f >= ((float) b2.getLeft()) + translationX && f <= ((float) b2.getRight()) + translationX && f2 >= ((float) b2.getTop()) + translationY && f2 <= ((float) b2.getBottom()) + translationY) {
                return b2;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5536a(C1293v vVar, int i) {
        if (mo5606i()) {
            vVar.mPendingAccessibilityState = i;
            this.f4864K.add(vVar);
            return false;
        }
        C0991u.m4206c(vVar.itemView, i);
        return true;
    }

    /* renamed from: a */
    private void m5868a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder("Trying to set fast scroller without both required drawables.");
            sb.append(mo5520a());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new C1437y(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.gx), resources.getDimensionPixelSize(R.dimen.gz), resources.getDimensionPixelOffset(R.dimen.gy));
    }

    /* renamed from: a */
    public final void mo3524a(int i) {
        getScrollingChildHelper().mo3773c(i);
    }

    /* renamed from: a */
    public final boolean mo5533a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo3767a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public final boolean mo5534a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo3769a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: A */
    private void m5844A() {
        m5912z();
        setScrollState(0);
    }

    /* renamed from: B */
    private void m5845B() {
        mo5532a(true);
    }

    /* renamed from: f */
    public final void mo5576f() {
        setScrollState(0);
        m5905s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo5579g() {
        this.f4884ae++;
    }

    public int getItemDecorationCount() {
        return this.f4917p.size();
    }

    public C1282n getRecycledViewPool() {
        return this.f4906e.mo5853e();
    }

    /* renamed from: i */
    public final boolean mo5606i() {
        if (this.f4884ae > 0) {
            return true;
        }
        return false;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3397a;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo3770b();
    }

    /* renamed from: D */
    private boolean m5847D() {
        if (this.f4927z == null || !this.f4915n.bi_()) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    private void m5851H() {
        this.f4857D.f5016m = -1;
        this.f4857D.f5015l = -1;
        this.f4857D.f5017n = -1;
    }

    private C0980l getScrollingChildHelper() {
        if (this.f4875aE == null) {
            this.f4875aE = new C0980l(this);
        }
        return this.f4875aE;
    }

    /* renamed from: n */
    private void mo61102n() {
        if (C0991u.m4198b(this) == 0) {
            C0991u.m4201b((View) this, 8);
        }
    }

    /* renamed from: o */
    private void mo61103o() {
        this.f4908g = new C1428t(new C1430b() {
            /* renamed from: a */
            public final int mo5662a() {
                return RecyclerView.this.getChildCount();
            }

            /* renamed from: b */
            public final void mo5669b() {
                int a = mo5662a();
                for (int i = 0; i < a; i++) {
                    View b = mo5668b(i);
                    RecyclerView.this.mo5610j(b);
                    b.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            /* renamed from: b */
            public final C1293v mo5667b(View view) {
                return RecyclerView.m5889d(view);
            }

            /* renamed from: a */
            public final int mo5663a(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            /* renamed from: b */
            public final View mo5668b(int i) {
                return RecyclerView.this.getChildAt(i);
            }

            /* renamed from: c */
            public final void mo5671c(View view) {
                C1293v d = RecyclerView.m5889d(view);
                if (d != null) {
                    d.onEnteredHiddenState(RecyclerView.this);
                }
            }

            /* renamed from: d */
            public final void mo5672d(View view) {
                C1293v d = RecyclerView.m5889d(view);
                if (d != null) {
                    d.onLeftHiddenState(RecyclerView.this);
                }
            }

            /* renamed from: a */
            public final void mo5664a(int i) {
                View childAt = RecyclerView.this.getChildAt(i);
                if (childAt != null) {
                    RecyclerView.this.mo5610j(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i);
            }

            /* renamed from: c */
            public final void mo5670c(int i) {
                View b = mo5668b(i);
                if (b != null) {
                    C1293v d = RecyclerView.m5889d(b);
                    if (d != null) {
                        if (!d.isTmpDetached() || d.shouldIgnore()) {
                            d.addFlags(256);
                        } else {
                            StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                            sb.append(d);
                            sb.append(RecyclerView.this.mo5520a());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                RecyclerView.this.detachViewFromParent(i);
            }

            /* renamed from: a */
            public final void mo5665a(View view, int i) {
                RecyclerView.this.addView(view, i);
                RecyclerView.this.mo5612k(view);
            }

            /* renamed from: a */
            public final void mo5666a(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
                C1293v d = RecyclerView.m5889d(view);
                if (d != null) {
                    if (d.isTmpDetached() || d.shouldIgnore()) {
                        d.clearTmpDetachFlag();
                    } else {
                        StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                        sb.append(d);
                        sb.append(RecyclerView.this.mo5520a());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                RecyclerView.this.attachViewToParent(view, i, layoutParams);
            }
        });
    }

    /* renamed from: p */
    private void m5902p() {
        this.f4907f = new C1387c(new C1388a() {
            /* renamed from: a */
            public final void mo5676a(C1389b bVar) {
                m5989c(bVar);
            }

            /* renamed from: b */
            public final void mo5678b(C1389b bVar) {
                m5989c(bVar);
            }

            /* renamed from: a */
            public final C1293v mo5673a(int i) {
                C1293v a = RecyclerView.this.mo5518a(i, true);
                if (a != null && !RecyclerView.this.f4908g.mo6605c(a.itemView)) {
                    return a;
                }
                return null;
            }

            /* renamed from: c */
            private void m5989c(C1389b bVar) {
                int i = bVar.f5417a;
                if (i != 4) {
                    if (i != 8) {
                        switch (i) {
                            case 1:
                                RecyclerView.this.f4915n.mo5376a(RecyclerView.this, bVar.f5418b, bVar.f5420d);
                                return;
                            case 2:
                                RecyclerView.this.f4915n.mo5383b(RecyclerView.this, bVar.f5418b, bVar.f5420d);
                                return;
                        }
                    } else {
                        RecyclerView.this.f4915n.mo5377a(RecyclerView.this, bVar.f5418b, bVar.f5420d, 1);
                    }
                    return;
                }
                RecyclerView.this.f4915n.mo5378a(RecyclerView.this, bVar.f5418b, bVar.f5420d, bVar.f5419c);
            }

            /* renamed from: b */
            public final void mo5677b(int i, int i2) {
                RecyclerView.this.mo5523a(i, i2, false);
                RecyclerView.this.f4858E = true;
            }

            /* renamed from: c */
            public final void mo5679c(int i, int i2) {
                RecyclerView.this.mo5581g(i, i2);
                RecyclerView.this.f4858E = true;
            }

            /* renamed from: d */
            public final void mo5680d(int i, int i2) {
                RecyclerView.this.mo5577f(i, i2);
                RecyclerView.this.f4858E = true;
            }

            /* renamed from: a */
            public final void mo5674a(int i, int i2) {
                RecyclerView.this.mo5523a(i, i2, true);
                RecyclerView.this.f4858E = true;
                RecyclerView.this.f4857D.f5006c += i2;
            }

            /* renamed from: a */
            public final void mo5675a(int i, int i2, Object obj) {
                RecyclerView.this.mo5522a(i, i2, obj);
                RecyclerView.this.f4859F = true;
            }
        });
    }

    /* renamed from: s */
    private void m5905s() {
        this.f4854A.mo5878b();
        if (this.f4915n != null) {
            this.f4915n.mo5747D();
        }
    }

    /* renamed from: y */
    private void m5911y() {
        this.f4890ak = null;
        this.f4888ai = null;
        this.f4889aj = null;
        this.f4887ah = null;
    }

    /* renamed from: c */
    public final void mo5551c() {
        if (this.f4883ad != null) {
            this.f4883ad.clear();
        }
    }

    public int getBaseline() {
        if (this.f4915n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: 0000 */
    public long getNanoTime() {
        if (f4853d) {
            return System.nanoTime();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo5604h() {
        if (this.f4882ac == null || !this.f4882ac.isEnabled()) {
            return false;
        }
        return true;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo3761a();
    }

    /* renamed from: l */
    public final boolean mo5613l() {
        if (this.f4927z == null || !this.f4927z.mo5331b()) {
            return false;
        }
        return true;
    }

    public void requestLayout() {
        if (this.f4870W != 0 || this.f4923v) {
            this.f4922u = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: C */
    private void m5846C() {
        int i = this.f4881ab;
        this.f4881ab = 0;
        if (i != 0 && mo5604h()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0941a.m3979a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: N */
    private void m5857N() {
        int c = this.f4908g.mo6603c();
        for (int i = 0; i < c; i++) {
            C1293v d = m5889d(this.f4908g.mo6606d(i));
            if (!d.shouldIgnore()) {
                d.saveOldPosition();
            }
        }
    }

    /* renamed from: r */
    private void m5904r() {
        this.f4870W++;
        if (this.f4870W == 1 && !this.f4923v) {
            this.f4922u = false;
        }
    }

    /* renamed from: z */
    private void m5912z() {
        if (this.f4893an != null) {
            this.f4893an.clear();
        }
        mo3524a(0);
        m5906t();
    }

    public int computeHorizontalScrollExtent() {
        if (this.f4915n != null && this.f4915n.mo5438e()) {
            return this.f4915n.mo5433d(this.f4857D);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        if (this.f4915n != null && this.f4915n.mo5438e()) {
            return this.f4915n.mo5426b(this.f4857D);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        if (this.f4915n != null && this.f4915n.mo5438e()) {
            return this.f4915n.mo5440f(this.f4857D);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        if (this.f4915n != null && this.f4915n.mo5441f()) {
            return this.f4915n.mo5436e(this.f4857D);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        if (this.f4915n != null && this.f4915n.mo5441f()) {
            return this.f4915n.mo5431c(this.f4857D);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        if (this.f4915n != null && this.f4915n.mo5441f()) {
            return this.f4915n.mo5442g(this.f4857D);
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo5560d() {
        if (this.f4871aA != null) {
            this.f4871aA.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo5609j() {
        if (!this.f4860G && this.f4918q) {
            C0991u.m4190a((View) this, this.f4878aH);
            this.f4860G = true;
        }
    }

    /* renamed from: m */
    public final boolean mo5614m() {
        if (!this.f4921t || this.f4925x || this.f4907f.mo6468d()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    private void m5858O() {
        int c = this.f4908g.mo6603c();
        for (int i = 0; i < c; i++) {
            C1293v d = m5889d(this.f4908g.mo6606d(i));
            if (!d.shouldIgnore()) {
                d.clearOldPosition();
            }
        }
        this.f4906e.mo5855g();
    }

    /* renamed from: P */
    private void m5859P() {
        int c = this.f4908g.mo6603c();
        for (int i = 0; i < c; i++) {
            C1293v d = m5889d(this.f4908g.mo6606d(i));
            if (d != null && !d.shouldIgnore()) {
                d.addFlags(6);
            }
        }
        mo5611k();
        this.f4906e.mo5854f();
    }

    /* renamed from: R */
    private void m5861R() {
        for (int size = this.f4864K.size() - 1; size >= 0; size--) {
            C1293v vVar = (C1293v) this.f4864K.get(size);
            if (vVar.itemView.getParent() == this && !vVar.shouldIgnore()) {
                int i = vVar.mPendingAccessibilityState;
                if (i != -1) {
                    C0991u.m4206c(vVar.itemView, i);
                    vVar.mPendingAccessibilityState = -1;
                }
            }
        }
        this.f4864K.clear();
    }

    /* renamed from: q */
    private boolean m5903q() {
        int b = this.f4908g.mo6600b();
        for (int i = 0; i < b; i++) {
            C1293v d = m5889d(this.f4908g.mo6602b(i));
            if (d != null && !d.shouldIgnore() && d.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    private void m5907u() {
        if (this.f4887ah == null) {
            this.f4887ah = C1266e.m6019a(this, 0);
            if (this.f4910i) {
                this.f4887ah.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f4887ah.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: v */
    private void m5908v() {
        if (this.f4889aj == null) {
            this.f4889aj = C1266e.m6019a(this, 2);
            if (this.f4910i) {
                this.f4889aj.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.f4889aj.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: w */
    private void m5909w() {
        if (this.f4888ai == null) {
            this.f4888ai = C1266e.m6019a(this, 1);
            if (this.f4910i) {
                this.f4888ai.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f4888ai.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: x */
    private void m5910x() {
        if (this.f4890ak == null) {
            this.f4890ak = C1266e.m6019a(this, 3);
            if (this.f4910i) {
                this.f4890ak.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.f4890ak.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.f4915n != null) {
            return this.f4915n.mo5363a();
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(mo5520a());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: k */
    public void mo5611k() {
        int c = this.f4908g.mo6603c();
        for (int i = 0; i < c; i++) {
            ((LayoutParams) this.f4908g.mo6606d(i).getLayoutParams()).f4935e = true;
        }
        this.f4906e.mo5856h();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4927z != null) {
            this.f4927z.mo5335d();
        }
        mo5576f();
        this.f4918q = false;
        if (this.f4915n != null) {
            this.f4915n.mo5774b(this, this.f4906e);
        }
        this.f4864K.clear();
        removeCallbacks(this.f4878aH);
        C1382bb.m6815b();
        if (f4853d && this.f4855B != null) {
            this.f4855B.mo6249b(this);
            this.f4855B = null;
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f4866S != null) {
            savedState.mo5685a(this.f4866S);
        } else if (this.f4915n != null) {
            savedState.f4937a = this.f4915n.mo5435d();
        } else {
            savedState.f4937a = null;
        }
        return savedState;
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (VERSION.SDK_INT == 18 || VERSION.SDK_INT == 19 || VERSION.SDK_INT == 20) {
            z = true;
        } else {
            z = false;
        }
        f4850a = z;
        if (VERSION.SDK_INT >= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        f4851b = z2;
        if (VERSION.SDK_INT >= 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        f4852c = z3;
        if (VERSION.SDK_INT >= 21) {
            z4 = true;
        } else {
            z4 = false;
        }
        f4853d = z4;
        if (VERSION.SDK_INT <= 15) {
            z5 = true;
        } else {
            z5 = false;
        }
        f4847O = z5;
        if (VERSION.SDK_INT <= 15) {
            z6 = true;
        } else {
            z6 = false;
        }
        f4848P = z6;
    }

    /* renamed from: E */
    private void m5848E() {
        boolean z;
        boolean z2;
        if (this.f4925x) {
            this.f4907f.mo6458a();
            if (this.f4926y) {
                this.f4915n.mo5375a(this);
            }
        }
        if (m5847D()) {
            this.f4907f.mo6464b();
        } else {
            this.f4907f.mo6469e();
        }
        boolean z3 = false;
        if (this.f4858E || this.f4859F) {
            z = true;
        } else {
            z = false;
        }
        C1290s sVar = this.f4857D;
        if (!this.f4921t || this.f4927z == null || ((!this.f4925x && !z && !this.f4915n.f4966z) || (this.f4925x && !this.f4914m.mHasStableIds))) {
            z2 = false;
        } else {
            z2 = true;
        }
        sVar.f5013j = z2;
        C1290s sVar2 = this.f4857D;
        if (this.f4857D.f5013j && z && !this.f4925x && m5847D()) {
            z3 = true;
        }
        sVar2.f5014k = z3;
    }

    /* renamed from: F */
    private void m5849F() {
        if (this.f4914m != null && this.f4915n != null) {
            this.f4857D.f5012i = false;
            if (this.f4857D.f5007d == 1) {
                m5854K();
                this.f4915n.mo5786e(this);
                m5855L();
            } else if (!this.f4907f.mo6470f() && this.f4915n.f4957I == getWidth() && this.f4915n.f4958J == getHeight()) {
                this.f4915n.mo5786e(this);
            } else {
                this.f4915n.mo5786e(this);
                m5855L();
            }
            m5856M();
        }
    }

    /* renamed from: G */
    private void m5850G() {
        View view;
        long j;
        int i;
        C1293v vVar = null;
        if (!this.f4904ay || !hasFocus() || this.f4914m == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view != null) {
            vVar = m5899m(view);
        }
        if (vVar == null) {
            m5851H();
            return;
        }
        C1290s sVar = this.f4857D;
        if (this.f4914m.mHasStableIds) {
            j = vVar.mItemId;
        } else {
            j = -1;
        }
        sVar.f5016m = j;
        C1290s sVar2 = this.f4857D;
        if (this.f4925x) {
            i = -1;
        } else if (vVar.isRemoved()) {
            i = vVar.mOldPosition;
        } else {
            i = vVar.getAdapterPosition();
        }
        sVar2.f5015l = i;
        this.f4857D.f5017n = m5898l(vVar.itemView);
    }

    /* renamed from: I */
    private View m5852I() {
        int i;
        if (this.f4857D.f5015l != -1) {
            i = this.f4857D.f5015l;
        } else {
            i = 0;
        }
        int b = this.f4857D.mo5870b();
        int i2 = i;
        while (i2 < b) {
            C1293v f = mo5575f(i2);
            if (f == null) {
                break;
            } else if (f.itemView.hasFocusable()) {
                return f.itemView;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0) {
                return null;
            }
            C1293v f2 = mo5575f(min);
            if (f2 == null) {
                return null;
            }
            if (f2.itemView.hasFocusable()) {
                return f2.itemView;
            }
        }
    }

    /* renamed from: L */
    private void m5855L() {
        boolean z;
        m5904r();
        mo5579g();
        this.f4857D.mo5867a(6);
        this.f4907f.mo6469e();
        this.f4857D.f5008e = this.f4914m.getItemCount();
        this.f4857D.f5006c = 0;
        this.f4857D.f5010g = false;
        this.f4915n.mo5385c(this.f4906e, this.f4857D);
        this.f4857D.f5009f = false;
        this.f4866S = null;
        C1290s sVar = this.f4857D;
        if (!this.f4857D.f5013j || this.f4927z == null) {
            z = false;
        } else {
            z = true;
        }
        sVar.f5013j = z;
        this.f4857D.f5007d = 4;
        m5845B();
        m5888c(false);
    }

    /* renamed from: Q */
    private void m5860Q() {
        int b = this.f4908g.mo6600b();
        for (int i = 0; i < b; i++) {
            View b2 = this.f4908g.mo6602b(i);
            C1293v b3 = mo5539b(b2);
            if (!(b3 == null || b3.mShadowingHolder == null)) {
                View view = b3.mShadowingHolder.itemView;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: t */
    private void m5906t() {
        boolean z;
        if (this.f4887ah != null) {
            this.f4887ah.onRelease();
            z = this.f4887ah.isFinished();
        } else {
            z = false;
        }
        if (this.f4888ai != null) {
            this.f4888ai.onRelease();
            z |= this.f4888ai.isFinished();
        }
        if (this.f4889aj != null) {
            this.f4889aj.onRelease();
            z |= this.f4889aj.isFinished();
        }
        if (this.f4890ak != null) {
            this.f4890ak.onRelease();
            z |= this.f4890ak.isFinished();
        }
        if (z) {
            C0991u.m4212e(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo5573e() {
        if (!this.f4921t || this.f4925x) {
            C0885f.m3753a("RV FullInvalidate");
            m5849F();
            C0885f.m3752a();
        } else if (this.f4907f.mo6468d()) {
            if (!this.f4907f.mo6459a(4) || this.f4907f.mo6459a(11)) {
                if (this.f4907f.mo6468d()) {
                    C0885f.m3753a("RV FullInvalidate");
                    m5849F();
                    C0885f.m3752a();
                }
                return;
            }
            C0885f.m3753a("RV PartialInvalidate");
            m5904r();
            mo5579g();
            this.f4907f.mo6464b();
            if (!this.f4922u) {
                if (m5903q()) {
                    m5849F();
                } else {
                    this.f4907f.mo6467c();
                }
            }
            m5888c(true);
            m5845B();
            C0885f.m3752a();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r0 >= 30.0f) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.f4884ae = r0
            r1 = 1
            r4.f4918q = r1
            boolean r2 = r4.f4921t
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.f4921t = r1
            android.support.v7.widget.RecyclerView$i r1 = r4.f4915n
            if (r1 == 0) goto L_0x0020
            android.support.v7.widget.RecyclerView$i r1 = r4.f4915n
            r1.mo5781c(r4)
        L_0x0020:
            r4.f4860G = r0
            boolean r0 = f4853d
            if (r0 == 0) goto L_0x006b
            java.lang.ThreadLocal<android.support.v7.widget.ab> r0 = android.support.p029v7.widget.C1333ab.f5223a
            java.lang.Object r0 = r0.get()
            android.support.v7.widget.ab r0 = (android.support.p029v7.widget.C1333ab) r0
            r4.f4855B = r0
            android.support.v7.widget.ab r0 = r4.f4855B
            if (r0 != 0) goto L_0x0066
            android.support.v7.widget.ab r0 = new android.support.v7.widget.ab
            r0.<init>()
            r4.f4855B = r0
            android.view.Display r0 = android.support.p022v4.view.C0991u.m4172I(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0054
            if (r0 == 0) goto L_0x0054
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0056:
            android.support.v7.widget.ab r1 = r4.f4855B
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f5227d = r2
            java.lang.ThreadLocal<android.support.v7.widget.ab> r0 = android.support.p029v7.widget.C1333ab.f5223a
            android.support.v7.widget.ab r1 = r4.f4855B
            r0.set(r1)
        L_0x0066:
            android.support.v7.widget.ab r0 = r4.f4855B
            r0.mo6247a(r4)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ad, code lost:
        if (r0.isFocusable() != false) goto L_0x00b1;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5853J() {
        /*
            r6 = this;
            boolean r0 = r6.f4904ay
            if (r0 == 0) goto L_0x00b5
            android.support.v7.widget.RecyclerView$a r0 = r6.f4914m
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r6.hasFocus()
            if (r0 == 0) goto L_0x00b5
            int r0 = r6.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x00b5
            int r0 = r6.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0026
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0026
            goto L_0x00b5
        L_0x0026:
            boolean r0 = r6.isFocused()
            if (r0 != 0) goto L_0x0055
            android.view.View r0 = r6.getFocusedChild()
            boolean r1 = f4848P
            if (r1 == 0) goto L_0x004c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L_0x004c
        L_0x0040:
            android.support.v7.widget.t r0 = r6.f4908g
            int r0 = r0.mo6600b()
            if (r0 != 0) goto L_0x0055
            r6.requestFocus()
            return
        L_0x004c:
            android.support.v7.widget.t r1 = r6.f4908g
            boolean r0 = r1.mo6605c(r0)
            if (r0 != 0) goto L_0x0055
            return
        L_0x0055:
            android.support.v7.widget.RecyclerView$s r0 = r6.f4857D
            long r0 = r0.f5016m
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x006f
            android.support.v7.widget.RecyclerView$a r0 = r6.f4914m
            boolean r0 = r0.mHasStableIds
            if (r0 == 0) goto L_0x006f
            android.support.v7.widget.RecyclerView$s r0 = r6.f4857D
            long r0 = r0.f5016m
            android.support.v7.widget.RecyclerView$v r0 = r6.m5862a(r0)
            goto L_0x0070
        L_0x006f:
            r0 = r4
        L_0x0070:
            if (r0 == 0) goto L_0x0088
            android.support.v7.widget.t r1 = r6.f4908g
            android.view.View r5 = r0.itemView
            boolean r1 = r1.mo6605c(r5)
            if (r1 != 0) goto L_0x0088
            android.view.View r1 = r0.itemView
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x0085
            goto L_0x0088
        L_0x0085:
            android.view.View r4 = r0.itemView
            goto L_0x0094
        L_0x0088:
            android.support.v7.widget.t r0 = r6.f4908g
            int r0 = r0.mo6600b()
            if (r0 <= 0) goto L_0x0094
            android.view.View r4 = r6.m5852I()
        L_0x0094:
            if (r4 == 0) goto L_0x00b4
            android.support.v7.widget.RecyclerView$s r0 = r6.f4857D
            int r0 = r0.f5017n
            long r0 = (long) r0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00b0
            android.support.v7.widget.RecyclerView$s r0 = r6.f4857D
            int r0 = r0.f5017n
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x00b0
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r0 = r4
        L_0x00b1:
            r0.requestFocus()
        L_0x00b4:
            return
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.RecyclerView.m5853J():void");
    }

    /* renamed from: M */
    private void m5856M() {
        this.f4857D.mo5867a(4);
        m5904r();
        mo5579g();
        this.f4857D.f5007d = 1;
        if (this.f4857D.f5013j) {
            for (int b = this.f4908g.mo6600b() - 1; b >= 0; b--) {
                C1293v d = m5889d(this.f4908g.mo6602b(b));
                if (!d.shouldIgnore()) {
                    long e = m5891e(d);
                    C1270c a = this.f4927z.mo5728a(this.f4857D, d);
                    C1293v a2 = this.f4909h.mo6442a(e);
                    if (a2 == null || a2.shouldIgnore()) {
                        this.f4909h.mo6451c(d, a);
                    } else {
                        boolean a3 = this.f4909h.mo6447a(a2);
                        boolean a4 = this.f4909h.mo6447a(d);
                        if (!a3 || a2 != d) {
                            C1270c b2 = this.f4909h.mo6448b(a2);
                            this.f4909h.mo6451c(d, a);
                            C1270c c = this.f4909h.mo6450c(d);
                            if (b2 == null) {
                                m5866a(e, d, a2);
                            } else {
                                m5872a(a2, d, b2, c, a3, a4);
                            }
                        } else {
                            this.f4909h.mo6451c(d, a);
                        }
                    }
                }
            }
            this.f4909h.mo6446a(this.f4879aI);
        }
        this.f4915n.mo5771b(this.f4906e);
        this.f4857D.f5005b = this.f4857D.f5008e;
        this.f4925x = false;
        this.f4926y = false;
        this.f4857D.f5013j = false;
        this.f4857D.f5014k = false;
        this.f4915n.f4966z = false;
        if (this.f4906e.f4980b != null) {
            this.f4906e.f4980b.clear();
        }
        if (this.f4915n.f4954F) {
            this.f4915n.f4953E = 0;
            this.f4915n.f4954F = false;
            this.f4906e.mo5843b();
        }
        this.f4915n.mo5373a(this.f4857D);
        m5845B();
        m5888c(false);
        this.f4909h.mo6443a();
        if (mo97737i(this.f4874aD[0], this.f4874aD[1])) {
            mo5603h(0, 0);
        }
        m5853J();
        m5851H();
    }

    /* renamed from: K */
    private void m5854K() {
        boolean z = true;
        this.f4857D.mo5867a(1);
        m5871a(this.f4857D);
        this.f4857D.f5012i = false;
        m5904r();
        this.f4909h.mo6443a();
        mo5579g();
        m5848E();
        m5850G();
        C1290s sVar = this.f4857D;
        if (!this.f4857D.f5013j || !this.f4859F) {
            z = false;
        }
        sVar.f5011h = z;
        this.f4859F = false;
        this.f4858E = false;
        this.f4857D.f5010g = this.f4857D.f5014k;
        this.f4857D.f5008e = this.f4914m.getItemCount();
        m5878a(this.f4874aD);
        if (this.f4857D.f5013j) {
            int b = this.f4908g.mo6600b();
            for (int i = 0; i < b; i++) {
                C1293v d = m5889d(this.f4908g.mo6602b(i));
                if (!d.shouldIgnore() && (!d.isInvalid() || this.f4914m.mHasStableIds)) {
                    this.f4909h.mo6445a(d, this.f4927z.mo5729a(this.f4857D, d, C1267f.m6021e(d), d.getUnmodifiedPayloads()));
                    if (this.f4857D.f5011h && d.isUpdated() && !d.isRemoved() && !d.shouldIgnore() && !d.isInvalid()) {
                        this.f4909h.mo6444a(m5891e(d), d);
                    }
                }
            }
        }
        if (this.f4857D.f5014k) {
            m5857N();
            boolean z2 = this.f4857D.f5009f;
            this.f4857D.f5009f = false;
            this.f4915n.mo5385c(this.f4906e, this.f4857D);
            this.f4857D.f5009f = z2;
            for (int i2 = 0; i2 < this.f4908g.mo6600b(); i2++) {
                C1293v d2 = m5889d(this.f4908g.mo6602b(i2));
                if (!d2.shouldIgnore() && !this.f4909h.mo6452d(d2)) {
                    int e = C1267f.m6021e(d2);
                    boolean hasAnyOfTheFlags = d2.hasAnyOfTheFlags(VideoCacheReadBuffersizeExperiment.DEFAULT);
                    if (!hasAnyOfTheFlags) {
                        e |= 4096;
                    }
                    C1270c a = this.f4927z.mo5729a(this.f4857D, d2, e, d2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        mo5529a(d2, a);
                    } else {
                        this.f4909h.mo6449b(d2, a);
                    }
                }
            }
            m5858O();
        } else {
            m5858O();
        }
        m5845B();
        m5888c(false);
        this.f4857D.f5007d = 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo5540b() {
        if (this.f4927z != null) {
            this.f4927z.mo5335d();
        }
        if (this.f4915n != null) {
            this.f4915n.mo5780c(this.f4906e);
            this.f4915n.mo5771b(this.f4906e);
        }
        this.f4906e.mo5832a();
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void setHasFixedSize(boolean z) {
        this.f4919r = z;
    }

    public void setOnFlingListener(C1279k kVar) {
        this.f4899at = kVar;
    }

    public void setOnScrollListener(C1281m mVar) {
        this.f4905az = mVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4904ay = z;
    }

    public void setRecyclerListener(C1285p pVar) {
        this.f4916o = pVar;
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    public final int mo5571e(View view) {
        return m5892f(view);
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.f4861H = recyclerViewAccessibilityDelegate;
        C0991u.m4187a((View) this, (C0939a) this.f4861H);
    }

    public void setItemViewCacheSize(int i) {
        this.f4906e.mo5833a(i);
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo3760a(z);
    }

    public void setRecycledViewPool(C1282n nVar) {
        this.f4906e.mo5837a(nVar);
    }

    public void setViewCacheExtension(C1291t tVar) {
        this.f4906e.f4985g = tVar;
    }

    /* renamed from: d */
    static C1293v m5889d(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f4933c;
    }

    /* renamed from: e */
    private long m5891e(C1293v vVar) {
        if (this.f4914m.mHasStableIds) {
            return vVar.mItemId;
        }
        return (long) vVar.mPosition;
    }

    /* renamed from: f */
    public static int m5892f(View view) {
        C1293v d = m5889d(view);
        if (d != null) {
            return d.getAdapterPosition();
        }
        return -1;
    }

    /* renamed from: g */
    public static int m5893g(View view) {
        C1293v d = m5889d(view);
        if (d != null) {
            return d.getLayoutPosition();
        }
        return -1;
    }

    /* renamed from: m */
    private C1293v m5899m(View view) {
        View c = mo5550c(view);
        if (c == null) {
            return null;
        }
        return mo5539b(c);
    }

    /* renamed from: b */
    public final void mo5543b(C1278j jVar) {
        if (this.f4883ad != null) {
            this.f4883ad.remove(jVar);
        }
    }

    /* renamed from: i */
    public final boolean mo5607i(int i) {
        return getScrollingChildHelper().mo3764a(1);
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m5883a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAdapter(C1262a aVar) {
        setLayoutFrozen(false);
        m5869a(aVar, false, true);
        mo5547b(false);
        requestLayout();
    }

    public void setEdgeEffectFactory(C1266e eVar) {
        C0903j.m3840a(eVar);
        this.f4886ag = eVar;
        m5911y();
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo3771b(i);
    }

    /* renamed from: b */
    public final void mo5541b(int i) {
        if (!this.f4923v) {
            mo5576f();
            if (this.f4915n != null) {
                this.f4915n.mo5437e(i);
                awakenScrollBars();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo5549c(C1293v vVar) {
        if (vVar.hasAnyOfTheFlags(524) || !vVar.isBound()) {
            return -1;
        }
        return this.f4907f.mo6466c(vVar.mPosition);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !this.f4915n.mo5380a((LayoutParams) layoutParams)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final C1293v mo5572e(int i) {
        return mo5518a(i, false);
    }

    /* renamed from: g */
    public final void mo5580g(int i) {
        int b = this.f4908g.mo6600b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f4908g.mo6602b(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: h */
    public final void mo5602h(int i) {
        int b = this.f4908g.mo6600b();
        for (int i2 = 0; i2 < b; i2++) {
            this.f4908g.mo6602b(i2).offsetLeftAndRight(i);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4917p.size();
        for (int i = 0; i < size; i++) {
            ((C1272h) this.f4917p.get(i)).onDraw(canvas, this, this.f4857D);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f4868U.size();
        for (int i = 0; i < size; i++) {
            ((C1280l) this.f4868U.get(i)).mo5689a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setChildDrawingOrderCallback(C1265d dVar) {
        boolean z;
        if (dVar != this.f4873aC) {
            this.f4873aC = dVar;
            if (this.f4873aC != null) {
                z = true;
            } else {
                z = false;
            }
            setChildrenDrawingOrderEnabled(z);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f4910i) {
            m5911y();
        }
        this.f4910i = z;
        super.setClipToPadding(z);
        if (this.f4921t) {
            requestLayout();
        }
    }

    public void setItemAnimator(C1267f fVar) {
        if (this.f4927z != null) {
            this.f4927z.mo5335d();
            this.f4927z.f4939h = null;
        }
        this.f4927z = fVar;
        if (this.f4927z != null) {
            this.f4927z.f4939h = this.f4872aB;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (i != this.f4891al) {
            this.f4891al = i;
            if (i != 2) {
                m5905s();
            }
            mo97738j(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.f4898as = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f4898as = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    /* renamed from: a */
    private C1293v m5862a(long j) {
        C1293v vVar = null;
        if (this.f4914m == null || !this.f4914m.mHasStableIds) {
            return null;
        }
        int c = this.f4908g.mo6603c();
        for (int i = 0; i < c; i++) {
            C1293v d = m5889d(this.f4908g.mo6606d(i));
            if (d != null && !d.isRemoved() && d.mItemId == j) {
                if (!this.f4908g.mo6605c(d.itemView)) {
                    return d;
                }
                vVar = d;
            }
        }
        return vVar;
    }

    /* renamed from: b */
    static void m5884b(C1293v vVar) {
        if (vVar.mNestedRecyclerView != null) {
            View view = (View) vVar.mNestedRecyclerView.get();
            while (view != null) {
                if (view != vVar.itemView) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            vVar.mNestedRecyclerView = null;
        }
    }

    /* renamed from: c */
    private void m5887c(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4892am) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f4892am = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f4896aq = x;
            this.f4894ao = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4897ar = y;
            this.f4895ap = y;
        }
    }

    /* renamed from: d */
    private void m5890d(C1293v vVar) {
        boolean z;
        View view = vVar.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.f4906e.mo5845b(mo5539b(view));
        if (vVar.isTmpDetached()) {
            this.f4908g.mo6597a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f4908g.mo6599a(view, true);
        } else {
            this.f4908g.mo6607d(view);
        }
    }

    /* renamed from: i */
    static RecyclerView m5894i(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView i2 = m5894i(viewGroup.getChildAt(i));
            if (i2 != null) {
                return i2;
            }
        }
        return null;
    }

    /* renamed from: j */
    private void mo97738j(int i) {
        if (this.f4915n != null) {
            this.f4915n.mo5794j(i);
        }
        if (this.f4905az != null) {
            this.f4905az.onScrollStateChanged(this, i);
        }
        if (this.f4871aA != null) {
            for (int size = this.f4871aA.size() - 1; size >= 0; size--) {
                ((C1281m) this.f4871aA.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    /* renamed from: l */
    private static int m5898l(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: f */
    public final C1293v mo5575f(int i) {
        C1293v vVar = null;
        if (this.f4925x) {
            return null;
        }
        int c = this.f4908g.mo6603c();
        for (int i2 = 0; i2 < c; i2++) {
            C1293v d = m5889d(this.f4908g.mo6606d(i2));
            if (d != null && !d.isRemoved() && mo5549c(d) == i) {
                if (!this.f4908g.mo6605c(d.itemView)) {
                    return d;
                }
                vVar = d;
            }
        }
        return vVar;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.f4915n != null) {
            return this.f4915n.mo5364a(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(mo5520a());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f4866S = (SavedState) parcelable;
        super.onRestoreInstanceState(this.f4866S.f3171e);
        if (!(this.f4915n == null || this.f4866S.f4937a == null)) {
            this.f4915n.mo5420a(this.f4866S.f4937a);
        }
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.f4923v) {
            mo5531a("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.f4923v = false;
                if (!(!this.f4922u || this.f4915n == null || this.f4914m == null)) {
                    requestLayout();
                }
                this.f4922u = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4923v = true;
            this.f4880aa = true;
            mo5576f();
        }
    }

    /* renamed from: c */
    private void m5888c(boolean z) {
        if (this.f4870W <= 0) {
            this.f4870W = 1;
        }
        if (!z && !this.f4923v) {
            this.f4922u = false;
        }
        if (this.f4870W == 1) {
            if (z && this.f4922u && !this.f4923v && this.f4915n != null && this.f4914m != null) {
                m5849F();
            }
            if (!this.f4923v) {
                this.f4922u = false;
            }
        }
        this.f4870W--;
    }

    /* renamed from: d */
    public final void mo5561d(int i) {
        if (!this.f4923v && this.f4915n != null) {
            this.f4915n.mo5422a(this, this.f4857D, i);
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.f4915n != null) {
            return this.f4915n.mo5365a(layoutParams);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(mo5520a());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final Rect mo5601h(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f4935e) {
            return layoutParams.f4934d;
        }
        if (this.f4857D.f5010g && (layoutParams.bm_() || layoutParams.bk_())) {
            return layoutParams.f4934d;
        }
        Rect rect = layoutParams.f4934d;
        rect.set(0, 0, 0, 0);
        int size = this.f4917p.size();
        for (int i = 0; i < size; i++) {
            this.f4912k.set(0, 0, 0, 0);
            ((C1272h) this.f4917p.get(i)).getItemOffsets(this.f4912k, view, this, this.f4857D);
            rect.left += this.f4912k.left;
            rect.top += this.f4912k.top;
            rect.right += this.f4912k.right;
            rect.bottom += this.f4912k.bottom;
        }
        layoutParams.f4935e = false;
        return rect;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo5610j(View view) {
        C1293v d = m5889d(view);
        if (!(this.f4914m == null || d == null)) {
            this.f4914m.onViewDetachedFromWindow(d);
        }
        if (this.f4883ad != null) {
            for (int size = this.f4883ad.size() - 1; size >= 0; size--) {
                ((C1278j) this.f4883ad.get(size)).mo5815b(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo5612k(View view) {
        C1293v d = m5889d(view);
        if (!(this.f4914m == null || d == null)) {
            this.f4914m.onViewAttachedToWindow(d);
        }
        if (this.f4883ad != null) {
            for (int size = this.f4883ad.size() - 1; size >= 0; size--) {
                ((C1278j) this.f4883ad.get(size)).mo5814a(view);
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f4915n != null && !this.f4923v && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f4915n.mo5441f()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                if (this.f4915n.mo5438e()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        m5879a((int) (f * this.f4902aw), (int) (f2 * this.f4903ax), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f4915n.mo5441f()) {
                        f2 = -axisValue;
                    } else if (this.f4915n.mo5438e()) {
                        f = axisValue;
                        f2 = 0.0f;
                        m5879a((int) (f * this.f4902aw), (int) (f2 * this.f4903ax), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            m5879a((int) (f * this.f4902aw), (int) (f2 * this.f4903ax), motionEvent);
        }
        return false;
    }

    /* renamed from: b */
    private boolean m5886b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.f4869V != null) {
            if (action == 0) {
                this.f4869V = null;
            } else {
                this.f4869V.mo5691b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f4869V = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.f4868U.size();
            for (int i = 0; i < size; i++) {
                C1280l lVar = (C1280l) this.f4868U.get(i);
                if (lVar.mo5690a(this, motionEvent)) {
                    this.f4869V = lVar;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final View mo5550c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public void setLayoutManager(C1273i iVar) {
        if (iVar != this.f4915n) {
            mo5576f();
            if (this.f4915n != null) {
                if (this.f4927z != null) {
                    this.f4927z.mo5335d();
                }
                this.f4915n.mo5780c(this.f4906e);
                this.f4915n.mo5771b(this.f4906e);
                this.f4906e.mo5832a();
                if (this.f4918q) {
                    this.f4915n.mo5774b(this, this.f4906e);
                }
                this.f4915n.mo5773b((RecyclerView) null);
                this.f4915n = null;
            } else {
                this.f4906e.mo5832a();
            }
            this.f4908g.mo6594a();
            this.f4915n = iVar;
            if (iVar != null) {
                if (iVar.f4962v == null) {
                    this.f4915n.mo5773b(this);
                    if (this.f4918q) {
                        this.f4915n.mo5781c(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(iVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(iVar.f4962v.mo5520a());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f4906e.mo5843b();
            requestLayout();
        }
    }

    /* renamed from: b */
    public final C1293v mo5539b(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m5889d(view);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5552c(int i) {
        if (this.f4915n != null) {
            this.f4915n.mo5437e(i);
            awakenScrollBars();
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        int i2;
        super.draw(canvas);
        int size = this.f4917p.size();
        boolean z5 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((C1272h) this.f4917p.get(i3)).onDrawOver(canvas, this, this.f4857D);
        }
        if (this.f4887ah == null || this.f4887ah.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.f4910i) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i2), 0.0f);
            if (this.f4887ah == null || !this.f4887ah.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        if (this.f4888ai != null && !this.f4888ai.isFinished()) {
            int save2 = canvas.save();
            if (this.f4910i) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            if (this.f4888ai == null || !this.f4888ai.draw(canvas)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save2);
        }
        if (this.f4889aj != null && !this.f4889aj.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f4910i) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i), (float) (-width));
            if (this.f4889aj == null || !this.f4889aj.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save3);
        }
        if (this.f4890ak == null || this.f4890ak.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4910i) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.f4890ak != null && this.f4890ak.draw(canvas)) {
                z5 = true;
            }
            z2 = z5 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.f4927z != null && this.f4917p.size() > 0 && this.f4927z.mo5331b()) {
            z2 = true;
        }
        if (z2) {
            C0991u.m4212e(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f4923v) {
            return false;
        }
        if (m5881a(motionEvent)) {
            m5844A();
            return true;
        } else if (this.f4915n == null) {
            return false;
        } else {
            boolean e = this.f4915n.mo5438e();
            boolean f = this.f4915n.mo5441f();
            if (this.f4893an == null) {
                this.f4893an = VelocityTracker.obtain();
            }
            this.f4893an.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            switch (actionMasked) {
                case 0:
                    if (this.f4880aa) {
                        this.f4880aa = false;
                    }
                    this.f4892am = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f4896aq = x;
                    this.f4894ao = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f4897ar = y;
                    this.f4895ap = y;
                    if (this.f4891al == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.f4877aG;
                    this.f4877aG[1] = 0;
                    iArr[0] = 0;
                    if (f) {
                        e |= true;
                    }
                    m5897j(e ? 1 : 0, 0);
                    break;
                case 1:
                    this.f4893an.clear();
                    mo3524a(0);
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4892am);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        if (this.f4891al != 1) {
                            int i = x2 - this.f4894ao;
                            int i2 = y2 - this.f4895ap;
                            if (!e || Math.abs(i) <= this.f4898as) {
                                z = false;
                            } else {
                                this.f4896aq = x2;
                                z = true;
                            }
                            if (f && Math.abs(i2) > this.f4898as) {
                                this.f4897ar = y2;
                                z = true;
                            }
                            if (z) {
                                setScrollState(1);
                                break;
                            }
                        }
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    m5844A();
                    break;
                case 5:
                    this.f4892am = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f4896aq = x3;
                    this.f4894ao = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f4897ar = y3;
                    this.f4895ap = y3;
                    break;
                case 6:
                    m5887c(motionEvent);
                    break;
            }
            if (this.f4891al == 1) {
                return true;
            }
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2 = false;
        if (this.f4923v || this.f4880aa) {
            return false;
        }
        if (m5886b(motionEvent)) {
            m5844A();
            return true;
        } else if (this.f4915n == null) {
            return false;
        } else {
            boolean e = this.f4915n.mo5438e();
            boolean f3 = this.f4915n.mo5441f();
            if (this.f4893an == null) {
                this.f4893an = VelocityTracker.obtain();
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.f4877aG;
                this.f4877aG[1] = 0;
                iArr[0] = 0;
            }
            obtain.offsetLocation((float) this.f4877aG[0], (float) this.f4877aG[1]);
            switch (actionMasked) {
                case 0:
                    this.f4892am = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f4896aq = x;
                    this.f4894ao = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f4897ar = y;
                    this.f4895ap = y;
                    if (f3) {
                        e |= true;
                    }
                    m5897j(e ? 1 : 0, 0);
                    break;
                case 1:
                    this.f4893an.addMovement(obtain);
                    this.f4893an.computeCurrentVelocity(1000, (float) this.f4901av);
                    if (e) {
                        f = -this.f4893an.getXVelocity(this.f4892am);
                    } else {
                        f = 0.0f;
                    }
                    if (f3) {
                        f2 = -this.f4893an.getYVelocity(this.f4892am);
                    } else {
                        f2 = 0.0f;
                    }
                    if ((f == 0.0f && f2 == 0.0f) || !mo5548b((int) f, (int) f2)) {
                        setScrollState(0);
                    }
                    m5912z();
                    z2 = true;
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4892am);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i5 = this.f4896aq - x2;
                        int i6 = this.f4897ar - y2;
                        if (mo5534a(i5, i6, this.f4862I, this.f4876aF, 0)) {
                            i5 -= this.f4862I[0];
                            i6 -= this.f4862I[1];
                            obtain.offsetLocation((float) this.f4876aF[0], (float) this.f4876aF[1]);
                            int[] iArr2 = this.f4877aG;
                            iArr2[0] = iArr2[0] + this.f4876aF[0];
                            int[] iArr3 = this.f4877aG;
                            iArr3[1] = iArr3[1] + this.f4876aF[1];
                        }
                        if (this.f4891al != 1) {
                            if (!e || Math.abs(i2) <= this.f4898as) {
                                z = false;
                            } else {
                                if (i2 > 0) {
                                    i2 -= this.f4898as;
                                } else {
                                    i2 += this.f4898as;
                                }
                                z = true;
                            }
                            if (f3 && Math.abs(i) > this.f4898as) {
                                if (i > 0) {
                                    i -= this.f4898as;
                                } else {
                                    i += this.f4898as;
                                }
                                z = true;
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.f4891al == 1) {
                            this.f4896aq = x2 - this.f4876aF[0];
                            this.f4897ar = y2 - this.f4876aF[1];
                            if (e) {
                                i3 = i2;
                            } else {
                                i3 = 0;
                            }
                            if (f3) {
                                i4 = i;
                            } else {
                                i4 = 0;
                            }
                            if (m5879a(i3, i4, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            if (!(this.f4855B == null || (i2 == 0 && i == 0))) {
                                this.f4855B.mo6248a(this, i2, i);
                                break;
                            }
                        }
                    } else {
                        return false;
                    }
                    break;
                case 3:
                    m5844A();
                    break;
                case 5:
                    this.f4892am = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f4896aq = x3;
                    this.f4894ao = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f4897ar = y3;
                    this.f4895ap = y3;
                    break;
                case 6:
                    m5887c(motionEvent);
                    break;
            }
            if (!z2) {
                this.f4893an.addMovement(obtain);
            }
            obtain.recycle();
            return true;
        }
    }

    /* renamed from: b */
    public final void mo5542b(C1272h hVar) {
        boolean z;
        if (this.f4915n != null) {
            this.f4915n.mo5425a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4917p.remove(hVar);
        if (this.f4917p.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        mo5611k();
        requestLayout();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: j */
    private boolean m5897j(int i, int i2) {
        return getScrollingChildHelper().mo3765a(i, i2);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo3762a(f, f2);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f4873aC == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return this.f4873aC.mo5727a(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo5606i()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* renamed from: a */
    public static void m5876a(View view, Rect rect) {
        m5885b(view, rect);
    }

    /* renamed from: i */
    private boolean mo97737i(int i, int i2) {
        m5878a(this.f4874aD);
        if (this.f4874aD[0] == i && this.f4874aD[1] == i2) {
            return false;
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f4915n.mo5762a(this, this.f4857D, view, view2) && view2 != null) {
            m5877a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo5574e(int i, int i2) {
        setMeasuredDimension(C1273i.m6041a(i, getPaddingLeft() + getPaddingRight(), C0991u.m4236o(this)), C1273i.m6041a(i2, getPaddingTop() + getPaddingBottom(), C0991u.m4237p(this)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo5581g(int i, int i2) {
        int c = this.f4908g.mo6603c();
        for (int i3 = 0; i3 < c; i3++) {
            C1293v d = m5889d(this.f4908g.mo6606d(i3));
            if (d != null && !d.shouldIgnore() && d.mPosition >= i) {
                d.offsetPosition(i2, false);
                this.f4857D.f5009f = true;
            }
        }
        this.f4906e.mo5844b(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo5603h(int i, int i2) {
        this.f4885af++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        if (this.f4905az != null) {
            this.f4905az.onScrolled(this, i, i2);
        }
        if (this.f4871aA != null) {
            for (int size = this.f4871aA.size() - 1; size >= 0; size--) {
                ((C1281m) this.f4871aA.get(size)).onScrolled(this, i, i2);
            }
        }
        this.f4885af--;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1293v d = m5889d(view);
        if (d != null) {
            if (d.isTmpDetached()) {
                d.clearTmpDetachFlag();
            } else if (!d.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(d);
                sb.append(mo5520a());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        mo5610j(view);
        super.removeDetachedView(view, z);
    }

    public void scrollBy(int i, int i2) {
        if (this.f4915n != null && !this.f4923v) {
            boolean e = this.f4915n.mo5438e();
            boolean f = this.f4915n.mo5441f();
            if (e || f) {
                if (!e) {
                    i = 0;
                }
                if (!f) {
                    i2 = 0;
                }
                m5879a(i, i2, (MotionEvent) null);
            }
        }
    }

    /* renamed from: a */
    private static String m5863a(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* renamed from: b */
    static void m5885b(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f4934d;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo5577f(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int c = this.f4908g.mo6603c();
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i6 = 0; i6 < c; i6++) {
            C1293v d = m5889d(this.f4908g.mo6606d(i6));
            if (d != null && d.mPosition >= i5 && d.mPosition <= i4) {
                if (d.mPosition == i) {
                    d.offsetPosition(i2 - i, false);
                } else {
                    d.offsetPosition(i3, false);
                }
                this.f4857D.f5009f = true;
            }
        }
        this.f4906e.mo5834a(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo5562d(int i, int i2) {
        if (i < 0) {
            m5907u();
            this.f4887ah.onAbsorb(-i);
        } else if (i > 0) {
            m5908v();
            this.f4889aj.onAbsorb(i);
        }
        if (i2 < 0) {
            m5909w();
            this.f4888ai.onAbsorb(-i2);
        } else if (i2 > 0) {
            m5910x();
            this.f4890ak.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            C0991u.m4212e(this);
        }
    }

    public View focusSearch(View view, int i) {
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        int i3;
        if (this.f4914m == null || this.f4915n == null || mo5606i() || this.f4923v) {
            z = false;
        } else {
            z = true;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (!z || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z) {
                view2 = findNextFocus;
            } else {
                mo5573e();
                if (mo5550c(view) == null) {
                    return null;
                }
                m5904r();
                view2 = this.f4915n.mo5367a(view, i, this.f4906e, this.f4857D);
                m5888c(false);
            }
        } else {
            if (this.f4915n.mo5441f()) {
                if (i == 2) {
                    i3 = 130;
                } else {
                    i3 = 33;
                }
                if (instance.findNextFocus(this, view, i3) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f4847O) {
                    i = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.f4915n.mo5438e()) {
                if (this.f4915n.mo5798q() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 ^ z4) {
                    i2 = 66;
                } else {
                    i2 = 17;
                }
                if (instance.findNextFocus(this, view, i2) == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (f4847O) {
                    i = i2;
                }
            }
            if (z2) {
                mo5573e();
                if (mo5550c(view) == null) {
                    return null;
                }
                m5904r();
                this.f4915n.mo5367a(view, i, this.f4906e, this.f4857D);
                m5888c(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (m5882a(view, view2, i)) {
                return view2;
            }
            return super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m5877a(view2, (View) null);
            return view;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f4915n == null) {
            mo5574e(i, i2);
            return;
        }
        boolean z = false;
        if (this.f4915n.bh_()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.f4915n.mo5754a(this.f4906e, this.f4857D, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.f4914m != null) {
                if (this.f4857D.f5007d == 1) {
                    m5854K();
                }
                this.f4915n.mo5770b(i, i2);
                this.f4857D.f5012i = true;
                m5855L();
                this.f4915n.mo5779c(i, i2);
                if (this.f4915n.bj_()) {
                    this.f4915n.mo5770b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f4857D.f5012i = true;
                    m5855L();
                    this.f4915n.mo5779c(i, i2);
                }
            }
        } else if (this.f4919r) {
            this.f4915n.mo5754a(this.f4906e, this.f4857D, i, i2);
        } else {
            if (this.f4924w) {
                m5904r();
                mo5579g();
                m5848E();
                m5845B();
                if (this.f4857D.f5014k) {
                    this.f4857D.f5010g = true;
                } else {
                    this.f4907f.mo6469e();
                    this.f4857D.f5010g = false;
                }
                this.f4924w = false;
                m5888c(false);
            } else if (this.f4857D.f5014k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            if (this.f4914m != null) {
                this.f4857D.f5008e = this.f4914m.getItemCount();
            } else {
                this.f4857D.f5008e = 0;
            }
            m5904r();
            this.f4915n.mo5754a(this.f4906e, this.f4857D, i, i2);
            m5888c(false);
            this.f4857D.f5010g = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5553c(int i, int i2) {
        boolean z;
        if (this.f4887ah == null || this.f4887ah.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f4887ah.onRelease();
            z = this.f4887ah.isFinished();
        }
        if (this.f4889aj != null && !this.f4889aj.isFinished() && i < 0) {
            this.f4889aj.onRelease();
            z |= this.f4889aj.isFinished();
        }
        if (this.f4888ai != null && !this.f4888ai.isFinished() && i2 > 0) {
            this.f4888ai.onRelease();
            z |= this.f4888ai.isFinished();
        }
        if (this.f4890ak != null && !this.f4890ak.isFinished() && i2 < 0) {
            this.f4890ak.onRelease();
            z |= this.f4890ak.isFinished();
        }
        if (z) {
            C0991u.m4212e(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4915n.mo5763a(this, view, rect, z);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo3763a(f, f2, z);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        C1335a aVar;
        boolean z;
        super(context, attributeSet, i);
        this.f4865R = new C1286q();
        this.f4906e = new C1284o();
        this.f4909h = new C1382bb();
        this.f4911j = new Runnable() {
            public final void run() {
                if (RecyclerView.this.f4921t && !RecyclerView.this.isLayoutRequested()) {
                    if (!RecyclerView.this.f4918q) {
                        RecyclerView.this.requestLayout();
                    } else if (RecyclerView.this.f4923v) {
                        RecyclerView.this.f4922u = true;
                    } else {
                        RecyclerView.this.mo5573e();
                    }
                }
            }
        };
        this.f4912k = new Rect();
        this.f4867T = new Rect();
        this.f4913l = new RectF();
        this.f4917p = new ArrayList<>();
        this.f4868U = new ArrayList<>();
        this.f4870W = 0;
        this.f4925x = false;
        this.f4926y = false;
        this.f4884ae = 0;
        this.f4885af = 0;
        this.f4886ag = new C1266e();
        this.f4927z = new DefaultItemAnimator();
        this.f4891al = 0;
        this.f4892am = -1;
        this.f4902aw = Float.MIN_VALUE;
        this.f4903ax = Float.MIN_VALUE;
        boolean z2 = true;
        this.f4904ay = true;
        this.f4854A = new C1292u();
        if (f4853d) {
            aVar = new C1335a();
        } else {
            aVar = null;
        }
        this.f4856C = aVar;
        this.f4857D = new C1290s();
        this.f4858E = false;
        this.f4859F = false;
        this.f4872aB = new C1271g();
        this.f4860G = false;
        this.f4874aD = new int[2];
        this.f4876aF = new int[2];
        this.f4862I = new int[2];
        this.f4877aG = new int[2];
        this.f4863J = new int[2];
        this.f4864K = new ArrayList();
        this.f4878aH = new Runnable() {
            public final void run() {
                if (RecyclerView.this.f4927z != null) {
                    RecyclerView.this.f4927z.mo5324a();
                }
                RecyclerView.this.f4860G = false;
            }
        };
        this.f4879aI = new C1384b() {
            /* renamed from: a */
            public final void mo5658a(C1293v vVar) {
                RecyclerView.this.f4915n.mo5759a(vVar.itemView, RecyclerView.this.f4906e);
            }

            /* renamed from: b */
            public final void mo5660b(C1293v vVar, C1270c cVar, C1270c cVar2) {
                RecyclerView.this.mo5530a(vVar, cVar, cVar2);
            }

            /* renamed from: a */
            public final void mo5659a(C1293v vVar, C1270c cVar, C1270c cVar2) {
                RecyclerView.this.f4906e.mo5845b(vVar);
                RecyclerView.this.mo5546b(vVar, cVar, cVar2);
            }

            /* renamed from: c */
            public final void mo5661c(C1293v vVar, C1270c cVar, C1270c cVar2) {
                vVar.setIsRecyclable(false);
                if (RecyclerView.this.f4925x) {
                    if (RecyclerView.this.f4927z.mo5732a(vVar, vVar, cVar, cVar2)) {
                        RecyclerView.this.mo5609j();
                    }
                } else if (RecyclerView.this.f4927z.mo5734c(vVar, cVar, cVar2)) {
                    RecyclerView.this.mo5609j();
                }
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4846N, i, 0);
            this.f4910i = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f4910i = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4898as = viewConfiguration.getScaledTouchSlop();
        this.f4902aw = C0995v.m4256a(viewConfiguration, context);
        this.f4903ax = C0995v.m4258b(viewConfiguration, context);
        this.f4900au = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4901av = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.f4927z.f4939h = this.f4872aB;
        m5902p();
        mo61103o();
        mo61102n();
        if (C0991u.m4214f(this) == 0) {
            C0991u.m4206c((View) this, 1);
        }
        this.f4882ac = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.f4920s = obtainStyledAttributes2.getBoolean(2, false);
            if (this.f4920s) {
                m5868a((StateListDrawable) obtainStyledAttributes2.getDrawable(5), obtainStyledAttributes2.getDrawable(6), (StateListDrawable) obtainStyledAttributes2.getDrawable(3), obtainStyledAttributes2.getDrawable(4));
            }
            obtainStyledAttributes2.recycle();
            m5867a(context, string, attributeSet, i, 0);
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f4845M, i, 0);
                boolean z3 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z2 = z3;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    /* renamed from: a */
    private void m5865a(int i, int i2, Interpolator interpolator) {
        if (this.f4915n != null && !this.f4923v) {
            if (!this.f4915n.mo5438e()) {
                i = 0;
            }
            if (!this.f4915n.mo5441f()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                this.f4854A.mo5877a(i, i2, (Interpolator) null);
            }
        }
    }

    /* renamed from: a */
    private void m5866a(long j, C1293v vVar, C1293v vVar2) {
        int b = this.f4908g.mo6600b();
        int i = 0;
        while (i < b) {
            C1293v d = m5889d(this.f4908g.mo6602b(i));
            if (d == vVar || m5891e(d) != j) {
                i++;
            } else if (this.f4914m == null || !this.f4914m.mHasStableIds) {
                StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb.append(d);
                sb.append(" \n View Holder 2:");
                sb.append(vVar);
                sb.append(mo5520a());
                throw new IllegalStateException(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(d);
                sb2.append(" \n View Holder 2:");
                sb2.append(vVar);
                sb2.append(mo5520a());
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo3768a(i, i2, iArr, iArr2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            m5911y();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5864a(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.m5907u()
            android.widget.EdgeEffect r3 = r6.f4887ah
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            android.support.p022v4.widget.C1047h.m4520a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.m5908v()
            android.widget.EdgeEffect r3 = r6.f4889aj
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            android.support.p022v4.widget.C1047h.m4520a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.m5909w()
            android.widget.EdgeEffect r9 = r6.f4888ai
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            android.support.p022v4.widget.C1047h.m4520a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.m5910x()
            android.widget.EdgeEffect r9 = r6.f4890ak
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            android.support.p022v4.widget.C1047h.m4520a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            android.support.p022v4.view.C0991u.m4212e(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.RecyclerView.m5864a(float, float, float, float):void");
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo3766a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0885f.m3753a("RV OnLayout");
        m5849F();
        C0885f.m3752a();
        this.f4921t = true;
    }

    /* renamed from: a */
    private void m5867a(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a = m5863a(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = classLoader.loadClass(a).asSubclass(C1273i.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f4849Q);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(0)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C1273i) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(a);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(": Could not instantiate the LayoutManager: ");
                    sb3.append(a);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(": Could not instantiate the LayoutManager: ");
                    sb4.append(a);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(a);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(a);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }
}
