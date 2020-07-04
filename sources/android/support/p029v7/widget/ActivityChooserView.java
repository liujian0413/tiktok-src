package android.support.p029v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0958b;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.view.menu.C1194m;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.ActivityChooserView */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C1221a f4559a;

    /* renamed from: b */
    final FrameLayout f4560b;

    /* renamed from: c */
    final FrameLayout f4561c;

    /* renamed from: d */
    C0958b f4562d;

    /* renamed from: e */
    final DataSetObserver f4563e;

    /* renamed from: f */
    OnDismissListener f4564f;

    /* renamed from: g */
    boolean f4565g;

    /* renamed from: h */
    int f4566h;

    /* renamed from: i */
    private final C1222b f4567i;

    /* renamed from: j */
    private final View f4568j;

    /* renamed from: k */
    private final Drawable f4569k;

    /* renamed from: l */
    private final ImageView f4570l;

    /* renamed from: m */
    private final ImageView f4571m;

    /* renamed from: n */
    private final int f4572n;

    /* renamed from: o */
    private final OnGlobalLayoutListener f4573o;

    /* renamed from: p */
    private ListPopupWindow f4574p;

    /* renamed from: q */
    private boolean f4575q;

    /* renamed from: r */
    private int f4576r;

    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f4582a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C1365av a = C1365av.m6743a(context, attributeSet, f4582a);
            setBackgroundDrawable(a.mo6392a(0));
            a.mo6393a();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    class C1221a extends BaseAdapter {

        /* renamed from: a */
        public C1372b f4583a;

        /* renamed from: b */
        public boolean f4584b;

        /* renamed from: d */
        private int f4586d = 4;

        /* renamed from: e */
        private boolean f4587e;

        /* renamed from: f */
        private boolean f4588f;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getViewTypeCount() {
            return 3;
        }

        /* renamed from: b */
        public final ResolveInfo mo5130b() {
            return this.f4583a.mo6423b();
        }

        /* renamed from: c */
        public final int mo5131c() {
            return this.f4583a.mo6419a();
        }

        /* renamed from: d */
        public final int mo5132d() {
            return this.f4583a.mo6424c();
        }

        /* renamed from: a */
        public final int mo5125a() {
            int i = this.f4586d;
            this.f4586d = Integer.MAX_VALUE;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f4586d = i;
            return i2;
        }

        public final int getCount() {
            int a = this.f4583a.mo6419a();
            if (!this.f4584b && this.f4583a.mo6423b() != null) {
                a--;
            }
            int min = Math.min(a, this.f4586d);
            if (this.f4588f) {
                return min + 1;
            }
            return min;
        }

        C1221a() {
        }

        /* renamed from: a */
        public final void mo5126a(int i) {
            if (this.f4586d != i) {
                this.f4586d = i;
                notifyDataSetChanged();
            }
        }

        public final int getItemViewType(int i) {
            if (!this.f4588f || i != getCount() - 1) {
                return 0;
            }
            return 1;
        }

        /* renamed from: a */
        public final void mo5128a(boolean z) {
            if (this.f4588f != z) {
                this.f4588f = z;
                notifyDataSetChanged();
            }
        }

        public final Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f4584b && this.f4583a.mo6423b() != null) {
                        i++;
                    }
                    return this.f4583a.mo6421a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public final void mo5127a(C1372b bVar) {
            C1372b bVar2 = ActivityChooserView.this.f4559a.f4583a;
            if (bVar2 != null && ActivityChooserView.this.isShown()) {
                bVar2.unregisterObserver(ActivityChooserView.this.f4563e);
            }
            this.f4583a = bVar;
            if (bVar != null && ActivityChooserView.this.isShown()) {
                bVar.registerObserver(ActivityChooserView.this.f4563e);
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public final void mo5129a(boolean z, boolean z2) {
            if (this.f4584b != z || this.f4587e != z2) {
                this.f4584b = z;
                this.f4587e = z2;
                notifyDataSetChanged();
            }
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != R.id.bn_) {
                        view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.h, viewGroup, false);
                    }
                    PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(R.id.ax9)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (!this.f4584b || i != 0 || !this.f4587e) {
                        view.setActivated(false);
                    } else {
                        view.setActivated(true);
                    }
                    return view;
                case 1:
                    if (view == null || view.getId() != 1) {
                        view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.h, viewGroup, false);
                        view.setId(1);
                        ((TextView) view.findViewById(R.id.title)).setText(ActivityChooserView.this.getContext().getString(R.string.b4));
                    }
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    class C1222b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
        /* renamed from: a */
        private void m5565a() {
            if (ActivityChooserView.this.f4564f != null) {
                ActivityChooserView.this.f4564f.onDismiss();
            }
        }

        public final void onDismiss() {
            m5565a();
            if (ActivityChooserView.this.f4562d != null) {
                ActivityChooserView.this.f4562d.mo3733a(false);
            }
        }

        C1222b() {
        }

        public final boolean onLongClick(View view) {
            if (view == ActivityChooserView.this.f4561c) {
                if (ActivityChooserView.this.f4559a.getCount() > 0) {
                    ActivityChooserView.this.f4565g = true;
                    ActivityChooserView.this.mo5102a(ActivityChooserView.this.f4566h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        public final void onClick(View view) {
            if (view == ActivityChooserView.this.f4561c) {
                ActivityChooserView.this.mo5104b();
                Intent b = ActivityChooserView.this.f4559a.f4583a.mo6422b(ActivityChooserView.this.f4559a.f4583a.mo6420a(ActivityChooserView.this.f4559a.mo5130b()));
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            } else if (view == ActivityChooserView.this.f4560b) {
                ActivityChooserView.this.f4565g = false;
                ActivityChooserView.this.mo5102a(ActivityChooserView.this.f4566h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C1221a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    ActivityChooserView.this.mo5104b();
                    if (!ActivityChooserView.this.f4565g) {
                        if (!ActivityChooserView.this.f4559a.f4584b) {
                            i++;
                        }
                        Intent b = ActivityChooserView.this.f4559a.f4583a.mo6422b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            ActivityChooserView.this.getContext().startActivity(b);
                        }
                        return;
                    } else if (i > 0) {
                        ActivityChooserView.this.f4559a.f4583a.mo6425c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    ActivityChooserView.this.mo5102a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public C1372b getDataModel() {
        return this.f4559a.f4583a;
    }

    /* renamed from: c */
    public final boolean mo5105c() {
        return getListPopupWindow().mo4894e();
    }

    /* renamed from: a */
    public final boolean mo5103a() {
        if (mo5105c() || !this.f4575q) {
            return false;
        }
        this.f4565g = false;
        mo5102a(this.f4566h);
        return true;
    }

    /* renamed from: b */
    public final boolean mo5104b() {
        if (mo5105c()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f4573o);
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1372b bVar = this.f4559a.f4583a;
        if (bVar != null) {
            bVar.registerObserver(this.f4563e);
        }
        this.f4575q = true;
    }

    /* access modifiers changed from: 0000 */
    public ListPopupWindow getListPopupWindow() {
        if (this.f4574p == null) {
            this.f4574p = new ListPopupWindow(getContext());
            this.f4574p.mo5249a((ListAdapter) this.f4559a);
            this.f4574p.f4814n = this;
            this.f4574p.mo5481a(true);
            this.f4574p.f4816p = this.f4567i;
            this.f4574p.mo5480a((OnDismissListener) this.f4567i);
        }
        return this.f4574p;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1372b bVar = this.f4559a.f4583a;
        if (bVar != null) {
            bVar.unregisterObserver(this.f4563e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f4573o);
        }
        if (mo5105c()) {
            mo5104b();
        }
        this.f4575q = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo5106d() {
        if (this.f4559a.getCount() > 0) {
            this.f4560b.setEnabled(true);
        } else {
            this.f4560b.setEnabled(false);
        }
        int c = this.f4559a.mo5131c();
        int d = this.f4559a.mo5132d();
        if (c == 1 || (c > 1 && d > 0)) {
            this.f4561c.setVisibility(0);
            ResolveInfo b = this.f4559a.mo5130b();
            PackageManager packageManager = getContext().getPackageManager();
            this.f4571m.setImageDrawable(b.loadIcon(packageManager));
            if (this.f4576r != 0) {
                CharSequence loadLabel = b.loadLabel(packageManager);
                this.f4561c.setContentDescription(getContext().getString(this.f4576r, new Object[]{loadLabel}));
            }
        } else {
            this.f4561c.setVisibility(8);
        }
        if (this.f4561c.getVisibility() == 0) {
            this.f4568j.setBackgroundDrawable(this.f4569k);
        } else {
            this.f4568j.setBackgroundDrawable(null);
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f4576r = i;
    }

    public void setInitialActivityCount(int i) {
        this.f4566h = i;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f4564f = onDismissListener;
    }

    public void setProvider(C0958b bVar) {
        this.f4562d = bVar;
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f4570l.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f4570l.setContentDescription(getContext().getString(i));
    }

    public void setActivityChooserModel(C1372b bVar) {
        this.f4559a.mo5127a(bVar);
        if (mo5105c()) {
            mo5104b();
            mo5103a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5102a(int i) {
        boolean z;
        if (this.f4559a.f4583a != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f4573o);
            if (this.f4561c.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            int c = this.f4559a.mo5131c();
            if (i == Integer.MAX_VALUE || c <= i + (z ? 1 : 0)) {
                this.f4559a.mo5128a(false);
                this.f4559a.mo5126a(i);
            } else {
                this.f4559a.mo5128a(true);
                this.f4559a.mo5126a(i - 1);
            }
            ListPopupWindow listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.mo4894e()) {
                if (this.f4565g || !z) {
                    this.f4559a.mo5129a(true, z);
                } else {
                    this.f4559a.mo5129a(false, false);
                }
                listPopupWindow.mo5487c(Math.min(this.f4559a.mo5125a(), this.f4572n));
                listPopupWindow.mo4892d();
                if (this.f4562d != null) {
                    this.f4562d.mo3733a(true);
                }
                listPopupWindow.mo4895f().setContentDescription(getContext().getString(R.string.b5));
                listPopupWindow.mo4895f().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f4568j;
        if (this.f4561c.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4563e = new DataSetObserver() {
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.f4559a.notifyDataSetChanged();
            }

            public final void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.f4559a.notifyDataSetInvalidated();
            }
        };
        this.f4573o = new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (ActivityChooserView.this.mo5105c()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().dismiss();
                        return;
                    }
                    ActivityChooserView.this.getListPopupWindow().mo4892d();
                    if (ActivityChooserView.this.f4562d != null) {
                        ActivityChooserView.this.f4562d.mo3733a(true);
                    }
                }
            }
        };
        this.f4566h = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActivityChooserView, i, 0);
        this.f4566h = obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.g, this, true);
        this.f4567i = new C1222b();
        this.f4568j = findViewById(R.id.as);
        this.f4569k = this.f4568j.getBackground();
        this.f4561c = (FrameLayout) findViewById(R.id.a6v);
        this.f4561c.setOnClickListener(this.f4567i);
        this.f4561c.setOnLongClickListener(this.f4567i);
        this.f4571m = (ImageView) this.f4561c.findViewById(R.id.ay4);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ah2);
        frameLayout.setOnClickListener(this.f4567i);
        frameLayout.setAccessibilityDelegate(new AccessibilityDelegate() {
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                C0945c.m3986a(accessibilityNodeInfo).mo3691m(true);
            }
        });
        frameLayout.setOnTouchListener(new C1330aa(frameLayout) {
            /* renamed from: a */
            public final C1194m mo4666a() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final boolean mo4667b() {
                ActivityChooserView.this.mo5103a();
                return true;
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public final boolean mo5071c() {
                ActivityChooserView.this.mo5104b();
                return true;
            }
        });
        this.f4560b = frameLayout;
        this.f4570l = (ImageView) frameLayout.findViewById(R.id.ay4);
        this.f4570l.setImageDrawable(drawable);
        this.f4559a = new C1221a();
        this.f4559a.registerDataSetObserver(new DataSetObserver() {
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.mo5106d();
            }
        });
        Resources resources = context.getResources();
        this.f4572n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.a0));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f4568j.layout(0, 0, i3 - i, i4 - i2);
        if (!mo5105c()) {
            mo5104b();
        }
    }
}
