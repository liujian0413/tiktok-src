package android.support.design.internal;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p022v4.util.Pools.C0887a;
import android.support.p022v4.util.Pools.SynchronizedPool;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.support.p029v7.p030a.p031a.C1065a;
import android.support.p029v7.view.menu.C1188i;
import android.support.p029v7.view.menu.C1190j;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.support.transition.C0475b;
import android.support.transition.C0508m;
import android.support.transition.C0516o;
import android.support.transition.C0520q;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class BottomNavigationMenuView extends ViewGroup implements C1190j {

    /* renamed from: d */
    private static final int[] f1102d = {16842912};

    /* renamed from: e */
    private static final int[] f1103e = {-16842910};

    /* renamed from: a */
    public boolean f1104a;

    /* renamed from: b */
    public BottomNavigationPresenter f1105b;

    /* renamed from: c */
    public MenuBuilder f1106c;

    /* renamed from: f */
    private final C0520q f1107f;

    /* renamed from: g */
    private final int f1108g;

    /* renamed from: h */
    private final int f1109h;

    /* renamed from: i */
    private final int f1110i;

    /* renamed from: j */
    private final int f1111j;

    /* renamed from: k */
    private final int f1112k;

    /* renamed from: l */
    private final OnClickListener f1113l;

    /* renamed from: m */
    private final C0887a<BottomNavigationItemView> f1114m;

    /* renamed from: n */
    private int f1115n;

    /* renamed from: o */
    private BottomNavigationItemView[] f1116o;

    /* renamed from: p */
    private int f1117p;

    /* renamed from: q */
    private int f1118q;

    /* renamed from: r */
    private ColorStateList f1119r;

    /* renamed from: s */
    private int f1120s;

    /* renamed from: t */
    private ColorStateList f1121t;

    /* renamed from: u */
    private final ColorStateList f1122u;

    /* renamed from: v */
    private int f1123v;

    /* renamed from: w */
    private int f1124w;

    /* renamed from: x */
    private Drawable f1125x;

    /* renamed from: y */
    private int f1126y;

    /* renamed from: z */
    private int[] f1127z;

    /* renamed from: a */
    private static boolean m1097a(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    public ColorStateList getIconTintList() {
        return this.f1119r;
    }

    public int getItemBackgroundRes() {
        return this.f1126y;
    }

    public int getItemIconSize() {
        return this.f1120s;
    }

    public int getItemTextAppearanceActive() {
        return this.f1124w;
    }

    public int getItemTextAppearanceInactive() {
        return this.f1123v;
    }

    public ColorStateList getItemTextColor() {
        return this.f1121t;
    }

    public int getLabelVisibilityMode() {
        return this.f1115n;
    }

    public int getSelectedItemId() {
        return this.f1117p;
    }

    public int getWindowAnimations() {
        return 0;
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) this.f1114m.acquire();
        if (bottomNavigationItemView == null) {
            return new BottomNavigationItemView(getContext());
        }
        return bottomNavigationItemView;
    }

    public Drawable getItemBackground() {
        if (this.f1116o == null || this.f1116o.length <= 0) {
            return this.f1125x;
        }
        return this.f1116o[0].getBackground();
    }

    /* renamed from: b */
    public final void mo1085b() {
        if (this.f1106c != null && this.f1116o != null) {
            int size = this.f1106c.size();
            if (size != this.f1116o.length) {
                mo1083a();
                return;
            }
            int i = this.f1117p;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f1106c.getItem(i2);
                if (item.isChecked()) {
                    this.f1117p = item.getItemId();
                    this.f1118q = i2;
                }
            }
            if (i != this.f1117p) {
                C0516o.m2171a(this, this.f1107f);
            }
            boolean a = m1097a(this.f1115n, this.f1106c.mo4739h().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f1105b.f1130b = true;
                this.f1116o[i3].setLabelVisibilityMode(this.f1115n);
                this.f1116o[i3].setShifting(a);
                this.f1116o[i3].mo1060a((MenuItemImpl) this.f1106c.getItem(i3), 0);
                this.f1105b.f1130b = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo1083a() {
        BottomNavigationItemView[] bottomNavigationItemViewArr;
        removeAllViews();
        if (this.f1116o != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f1116o) {
                if (bottomNavigationItemView != null) {
                    this.f1114m.release(bottomNavigationItemView);
                }
            }
        }
        if (this.f1106c.size() == 0) {
            this.f1117p = 0;
            this.f1118q = 0;
            this.f1116o = null;
            return;
        }
        this.f1116o = new BottomNavigationItemView[this.f1106c.size()];
        boolean a = m1097a(this.f1115n, this.f1106c.mo4739h().size());
        for (int i = 0; i < this.f1106c.size(); i++) {
            this.f1105b.f1130b = true;
            this.f1106c.getItem(i).setCheckable(true);
            this.f1105b.f1130b = false;
            BottomNavigationItemView newItem = getNewItem();
            this.f1116o[i] = newItem;
            newItem.setIconTintList(this.f1119r);
            newItem.setIconSize(this.f1120s);
            newItem.setTextColor(this.f1122u);
            newItem.setTextAppearanceInactive(this.f1123v);
            newItem.setTextAppearanceActive(this.f1124w);
            newItem.setTextColor(this.f1121t);
            if (this.f1125x != null) {
                newItem.setItemBackground(this.f1125x);
            } else {
                newItem.setItemBackground(this.f1126y);
            }
            newItem.setShifting(a);
            newItem.setLabelVisibilityMode(this.f1115n);
            newItem.mo1060a((MenuItemImpl) this.f1106c.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f1113l);
            addView(newItem);
        }
        this.f1118q = Math.min(this.f1106c.size() - 1, this.f1118q);
        this.f1106c.getItem(this.f1118q).setChecked(true);
    }

    /* renamed from: a */
    public final void mo1084a(MenuBuilder menuBuilder) {
        this.f1106c = menuBuilder;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f1104a = z;
    }

    public void setLabelVisibilityMode(int i) {
        this.f1115n = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f1105b = bottomNavigationPresenter;
    }

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1119r = colorStateList;
        if (this.f1116o != null) {
            for (BottomNavigationItemView iconTintList : this.f1116o) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f1125x = drawable;
        if (this.f1116o != null) {
            for (BottomNavigationItemView itemBackground : this.f1116o) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f1126y = i;
        if (this.f1116o != null) {
            for (BottomNavigationItemView itemBackground : this.f1116o) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f1120s = i;
        if (this.f1116o != null) {
            for (BottomNavigationItemView iconSize : this.f1116o) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        BottomNavigationItemView[] bottomNavigationItemViewArr;
        this.f1124w = i;
        if (this.f1116o != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f1116o) {
                bottomNavigationItemView.setTextAppearanceActive(i);
                if (this.f1121t != null) {
                    bottomNavigationItemView.setTextColor(this.f1121t);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        BottomNavigationItemView[] bottomNavigationItemViewArr;
        this.f1123v = i;
        if (this.f1116o != null) {
            for (BottomNavigationItemView bottomNavigationItemView : this.f1116o) {
                bottomNavigationItemView.setTextAppearanceInactive(i);
                if (this.f1121t != null) {
                    bottomNavigationItemView.setTextColor(this.f1121t);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1121t = colorStateList;
        if (this.f1116o != null) {
            for (BottomNavigationItemView textColor : this.f1116o) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1086b(int i) {
        int size = this.f1106c.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f1106c.getItem(i2);
            if (i == item.getItemId()) {
                this.f1117p = i;
                this.f1118q = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: a */
    public final ColorStateList mo1082a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList a = C1065a.m4638a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.g8, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f1103e, f1102d, EMPTY_STATE_SET}, new int[]{a.getColorForState(f1103e, defaultColor), i2, defaultColor});
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1114m = new SynchronizedPool(5);
        this.f1117p = 0;
        this.f1118q = 0;
        Resources resources = getResources();
        this.f1108g = resources.getDimensionPixelSize(R.dimen.f1);
        this.f1109h = resources.getDimensionPixelSize(R.dimen.f2);
        this.f1110i = resources.getDimensionPixelSize(R.dimen.ev);
        this.f1111j = resources.getDimensionPixelSize(R.dimen.ew);
        this.f1112k = resources.getDimensionPixelSize(R.dimen.ez);
        this.f1122u = mo1082a(16842808);
        this.f1107f = new C0475b();
        this.f1107f.mo2150a(0);
        this.f1107f.mo2115a(115);
        this.f1107f.mo2116a((TimeInterpolator) new FastOutSlowInInterpolator());
        this.f1107f.mo2151a((C0508m) new C0294a());
        this.f1113l = new OnClickListener() {
            public final void onClick(View view) {
                MenuItemImpl itemData = ((BottomNavigationItemView) view).getItemData();
                if (!BottomNavigationMenuView.this.f1106c.mo4709a((MenuItem) itemData, (C1188i) BottomNavigationMenuView.this.f1105b, 0)) {
                    itemData.setChecked(true);
                }
            }
        };
        this.f1127z = new int[5];
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = MeasureSpec.getSize(i);
        int size2 = this.f1106c.mo4739h().size();
        int childCount = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f1112k, 1073741824);
        if (!m1097a(this.f1115n, size2) || !this.f1104a) {
            if (size2 == 0) {
                i3 = 1;
            } else {
                i3 = size2;
            }
            int min = Math.min(size / i3, this.f1110i);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    this.f1127z[i8] = min;
                    if (i7 > 0) {
                        int[] iArr = this.f1127z;
                        iArr[i8] = iArr[i8] + 1;
                        i7--;
                    }
                } else {
                    this.f1127z[i8] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f1118q);
            int i9 = this.f1111j;
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.f1110i, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i10 = size2 - i4;
            int min2 = Math.min(size - (this.f1109h * i10), Math.min(i9, this.f1110i));
            int i11 = size - min2;
            if (i10 == 0) {
                i5 = 1;
            } else {
                i5 = i10;
            }
            int min3 = Math.min(i11 / i5, this.f1108g);
            int i12 = i11 - (i10 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr2 = this.f1127z;
                    if (i13 == this.f1118q) {
                        i6 = min2;
                    } else {
                        i6 = min3;
                    }
                    iArr2[i13] = i6;
                    if (i12 > 0) {
                        int[] iArr3 = this.f1127z;
                        iArr3[i13] = iArr3[i13] + 1;
                        i12--;
                    }
                } else {
                    this.f1127z[i13] = 0;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(MeasureSpec.makeMeasureSpec(this.f1127z[i15], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14, MeasureSpec.makeMeasureSpec(i14, 1073741824), 0), View.resolveSizeAndState(this.f1112k, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C0991u.m4220h(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }
}
