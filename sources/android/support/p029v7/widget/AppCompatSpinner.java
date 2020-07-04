package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0989s;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.AppCompatSpinner */
public class AppCompatSpinner extends Spinner implements C0989s {

    /* renamed from: d */
    private static final int[] f4611d = {16843505};

    /* renamed from: a */
    C1225b f4612a;

    /* renamed from: b */
    int f4613b;

    /* renamed from: c */
    final Rect f4614c;

    /* renamed from: e */
    private final C1390d f4615e;

    /* renamed from: f */
    private final Context f4616f;

    /* renamed from: g */
    private C1330aa f4617g;

    /* renamed from: h */
    private SpinnerAdapter f4618h;

    /* renamed from: i */
    private final boolean f4619i;

    /* renamed from: android.support.v7.widget.AppCompatSpinner$a */
    static class C1224a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f4622a;

        /* renamed from: b */
        private ListAdapter f4623b;

        public final int getItemViewType(int i) {
            return 0;
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f4623b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            if (this.f4622a == null) {
                return 0;
            }
            return this.f4622a.getCount();
        }

        public final boolean hasStableIds() {
            if (this.f4622a == null || !this.f4622a.hasStableIds()) {
                return false;
            }
            return true;
        }

        public final boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        public final Object getItem(int i) {
            if (this.f4622a == null) {
                return null;
            }
            return this.f4622a.getItem(i);
        }

        public final long getItemId(int i) {
            if (this.f4622a == null) {
                return -1;
            }
            return this.f4622a.getItemId(i);
        }

        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f4623b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f4622a != null) {
                this.f4622a.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f4622a != null) {
                this.f4622a.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public C1224a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f4622a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f4623b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f4622a == null) {
                return null;
            }
            return this.f4622a.getDropDownView(i, view, viewGroup);
        }
    }

    /* renamed from: android.support.v7.widget.AppCompatSpinner$b */
    class C1225b extends ListPopupWindow {

        /* renamed from: a */
        public CharSequence f4624a;

        /* renamed from: b */
        ListAdapter f4625b;

        /* renamed from: w */
        private final Rect f4627w = new Rect();

        /* renamed from: d */
        public final void mo4892d() {
            boolean e = mo4894e();
            mo5248a();
            mo5489e(2);
            super.mo4892d();
            mo4895f().setChoiceMode(1);
            mo5490f(AppCompatSpinner.this.getSelectedItemPosition());
            if (!e) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    final C12272 r1 = new OnGlobalLayoutListener() {
                        public final void onGlobalLayout() {
                            if (!C1225b.this.mo5250a((View) AppCompatSpinner.this)) {
                                C1225b.this.dismiss();
                                return;
                            }
                            C1225b.this.mo5248a();
                            C1225b.super.mo4892d();
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(r1);
                    mo5480a((OnDismissListener) new OnDismissListener() {
                        public final void onDismiss() {
                            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeGlobalOnLayoutListener(r1);
                            }
                        }
                    });
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5248a() {
            int i;
            int i2;
            Drawable b = mo5482b();
            int i3 = 0;
            if (b != null) {
                b.getPadding(AppCompatSpinner.this.f4614c);
                if (C1385bc.m6839a(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.f4614c.right;
                } else {
                    i2 = -AppCompatSpinner.this.f4614c.left;
                }
                i3 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.f4614c;
                AppCompatSpinner.this.f4614c.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.f4613b == -2) {
                int a = AppCompatSpinner.this.mo5213a((SpinnerAdapter) this.f4625b, mo5482b());
                int i4 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.f4614c.left) - AppCompatSpinner.this.f4614c.right;
                if (a > i4) {
                    a = i4;
                }
                mo5487c(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (AppCompatSpinner.this.f4613b == -1) {
                mo5487c((width - paddingLeft) - paddingRight);
            } else {
                mo5487c(AppCompatSpinner.this.f4613b);
            }
            if (C1385bc.m6839a(AppCompatSpinner.this)) {
                i = i3 + ((width - paddingRight) - this.f4806f);
            } else {
                i = i3 + paddingLeft;
            }
            this.f4807g = i;
        }

        /* renamed from: a */
        public final void mo5249a(ListAdapter listAdapter) {
            super.mo5249a(listAdapter);
            this.f4625b = listAdapter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo5250a(View view) {
            if (!C0991u.m4170G(view) || !view.getGlobalVisibleRect(this.f4627w)) {
                return false;
            }
            return true;
        }

        public C1225b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f4814n = AppCompatSpinner.this;
            mo5481a(true);
            this.f4813m = 0;
            this.f4816p = new OnItemClickListener(AppCompatSpinner.this) {
                public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    AppCompatSpinner.this.setSelection(i);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i, C1225b.this.f4625b.getItemId(i));
                    }
                    C1225b.this.dismiss();
                }
            };
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4615e != null) {
            this.f4615e.mo6481c();
        }
    }

    public CharSequence getPrompt() {
        if (this.f4612a != null) {
            return this.f4612a.f4624a;
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4615e != null) {
            return this.f4615e.mo6474a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4615e != null) {
            return this.f4615e.mo6480b();
        }
        return null;
    }

    public int getDropDownHorizontalOffset() {
        if (this.f4612a != null) {
            return this.f4612a.f4807g;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        if (this.f4612a != null) {
            return this.f4612a.mo5486c();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f4612a != null) {
            return this.f4613b;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        if (this.f4612a != null) {
            return this.f4612a.mo5482b();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.f4612a != null) {
            return this.f4616f;
        }
        if (VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4612a != null && this.f4612a.mo4894e()) {
            this.f4612a.dismiss();
        }
    }

    public boolean performClick() {
        if (this.f4612a == null) {
            return super.performClick();
        }
        if (!this.f4612a.mo4894e()) {
            this.f4612a.mo4892d();
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4615e != null) {
            this.f4615e.mo6478a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4615e != null) {
            this.f4615e.mo6475a(i);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C1065a.m4641b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f4612a != null) {
            this.f4612a.f4624a = charSequence;
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4615e != null) {
            this.f4615e.mo6476a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4615e != null) {
            this.f4615e.mo6477a(mode);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f4617g == null || !this.f4617g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f4612a != null) {
            this.f4612a.f4807g = i;
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f4612a != null) {
            this.f4612a.mo5484b(i);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f4612a != null) {
            this.f4613b = i;
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f4612a != null) {
            this.f4612a.mo5479a(drawable);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        Context context;
        if (!this.f4619i) {
            this.f4618h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f4612a != null) {
            if (this.f4616f == null) {
                context = getContext();
            } else {
                context = this.f4616f;
            }
            this.f4612a.mo5249a((ListAdapter) new C1224a(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a2k);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4612a != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo5213a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo5213a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f4614c);
            i2 += this.f4614c.left + this.f4614c.right;
        }
        return i2;
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    private AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, -1, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r1 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r1 != null) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r6.f4614c = r11
            int[] r11 = android.support.p029v7.appcompat.R$styleable.Spinner
            r0 = 0
            android.support.v7.widget.av r11 = android.support.p029v7.widget.C1365av.m6744a(r7, r8, r11, r9, r0)
            android.support.v7.widget.d r1 = new android.support.v7.widget.d
            r1.<init>(r6)
            r6.f4615e = r1
            r1 = 4
            int r1 = r11.mo6405g(r1, r0)
            r2 = 0
            if (r1 == 0) goto L_0x0026
            android.support.v7.view.d r3 = new android.support.v7.view.d
            r3.<init>(r7, r1)
            goto L_0x002f
        L_0x0026:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 >= r3) goto L_0x002e
            r3 = r7
            goto L_0x002f
        L_0x002e:
            r3 = r2
        L_0x002f:
            r6.f4616f = r3
            android.content.Context r1 = r6.f4616f
            r3 = 1
            if (r1 == 0) goto L_0x0091
            r1 = -1
            if (r10 != r1) goto L_0x005e
            int[] r1 = f4611d     // Catch:{ Exception -> 0x005a, all -> 0x0052 }
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r8, r1, r9, r0)     // Catch:{ Exception -> 0x005a, all -> 0x0052 }
            boolean r4 = r1.hasValue(r0)     // Catch:{ Exception -> 0x005b, all -> 0x0050 }
            if (r4 == 0) goto L_0x004a
            int r4 = r1.getInt(r0, r0)     // Catch:{ Exception -> 0x005b, all -> 0x0050 }
            r10 = r4
        L_0x004a:
            if (r1 == 0) goto L_0x005e
        L_0x004c:
            r1.recycle()
            goto L_0x005e
        L_0x0050:
            r7 = move-exception
            goto L_0x0054
        L_0x0052:
            r7 = move-exception
            r1 = r2
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            r1.recycle()
        L_0x0059:
            throw r7
        L_0x005a:
            r1 = r2
        L_0x005b:
            if (r1 == 0) goto L_0x005e
            goto L_0x004c
        L_0x005e:
            if (r10 != r3) goto L_0x0091
            android.support.v7.widget.AppCompatSpinner$b r10 = new android.support.v7.widget.AppCompatSpinner$b
            android.content.Context r1 = r6.f4616f
            r10.<init>(r1, r8, r9)
            android.content.Context r1 = r6.f4616f
            int[] r4 = android.support.p029v7.appcompat.R$styleable.Spinner
            android.support.v7.widget.av r1 = android.support.p029v7.widget.C1365av.m6744a(r1, r8, r4, r9, r0)
            r4 = 3
            r5 = -2
            int r4 = r1.mo6403f(r4, r5)
            r6.f4613b = r4
            android.graphics.drawable.Drawable r4 = r1.mo6392a(r3)
            r10.mo5479a(r4)
            r4 = 2
            java.lang.String r4 = r11.mo6400d(r4)
            r10.f4624a = r4
            r1.mo6393a()
            r6.f4612a = r10
            android.support.v7.widget.AppCompatSpinner$1 r1 = new android.support.v7.widget.AppCompatSpinner$1
            r1.<init>(r6, r10)
            r6.f4617g = r1
        L_0x0091:
            java.lang.CharSequence[] r10 = r11.mo6404f(r0)
            if (r10 == 0) goto L_0x00a8
            android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r0.<init>(r7, r1, r10)
            r7 = 2131494666(0x7f0c070a, float:1.8612847E38)
            r0.setDropDownViewResource(r7)
            r6.setAdapter(r0)
        L_0x00a8:
            r11.mo6393a()
            r6.f4619i = r3
            android.widget.SpinnerAdapter r7 = r6.f4618h
            if (r7 == 0) goto L_0x00b8
            android.widget.SpinnerAdapter r7 = r6.f4618h
            r6.setAdapter(r7)
            r6.f4618h = r2
        L_0x00b8:
            android.support.v7.widget.d r7 = r6.f4615e
            r7.mo6479a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
