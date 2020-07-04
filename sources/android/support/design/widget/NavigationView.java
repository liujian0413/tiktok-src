package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.R$styleable;
import android.support.design.internal.C0296b;
import android.support.design.internal.NavigationMenu;
import android.support.design.internal.NavigationMenuPresenter;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.p030a.p031a.C1065a;
import android.support.p029v7.view.C1157e;
import android.support.p029v7.view.menu.C1188i;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuBuilder.C1166a;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.support.p029v7.widget.C1365av;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: d */
    private static final int[] f1461d = {16842912};

    /* renamed from: e */
    private static final int[] f1462e = {-16842910};

    /* renamed from: c */
    C0364a f1463c;

    /* renamed from: f */
    private final NavigationMenu f1464f;

    /* renamed from: g */
    private final NavigationMenuPresenter f1465g;

    /* renamed from: h */
    private final int f1466h;

    /* renamed from: i */
    private MenuInflater f1467i;

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m1566a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m1564a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1564a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m1566a(i);
            }

            /* renamed from: a */
            private static SavedState m1565a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m1565a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        public Bundle f1469a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1469a = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f1469a);
        }
    }

    /* renamed from: android.support.design.widget.NavigationView$a */
    public interface C0364a {
        /* renamed from: a */
        boolean mo1562a(MenuItem menuItem);
    }

    public Menu getMenu() {
        return this.f1464f;
    }

    public MenuItem getCheckedItem() {
        return this.f1465g.mo1159d();
    }

    public int getHeaderCount() {
        return this.f1465g.mo1161e();
    }

    public Drawable getItemBackground() {
        return this.f1465g.f1161j;
    }

    public int getItemHorizontalPadding() {
        return this.f1465g.f1162k;
    }

    public int getItemIconPadding() {
        return this.f1465g.f1163l;
    }

    public ColorStateList getItemIconTintList() {
        return this.f1465g.f1160i;
    }

    public ColorStateList getItemTextColor() {
        return this.f1465g.f1159h;
    }

    private MenuInflater getMenuInflater() {
        if (this.f1467i == null) {
            this.f1467i = new C1157e(getContext());
        }
        return this.f1467i;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1469a = new Bundle();
        this.f1464f.mo4701a(savedState.f1469a);
        return savedState;
    }

    public void setNavigationItemSelectedListener(C0364a aVar) {
        this.f1463c = aVar;
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private View m1559b(int i) {
        return this.f1465g.mo1150a(i);
    }

    /* renamed from: a */
    public final void mo1179a(C0954ab abVar) {
        this.f1465g.mo1153a(abVar);
    }

    public void setItemBackground(Drawable drawable) {
        this.f1465g.mo1152a(drawable);
    }

    public void setItemHorizontalPadding(int i) {
        this.f1465g.mo1158c(i);
    }

    public void setItemIconPadding(int i) {
        this.f1465g.mo1160d(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f1465g.mo1151a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.f1465g.mo1155b(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1465g.mo1156b(colorStateList);
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f1464f.findItem(i);
        if (findItem != null) {
            this.f1465g.mo1154a((MenuItemImpl) findItem);
        }
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0683b.m2903a(getContext(), i));
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f1465g.mo1158c(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPaddingResource(int i) {
        this.f1465g.mo1160d(getResources().getDimensionPixelSize(i));
    }

    /* renamed from: a */
    private void m1558a(int i) {
        this.f1465g.mo1157b(true);
        getMenuInflater().inflate(i, this.f1464f);
        this.f1465g.mo1157b(false);
        this.f1465g.mo1114a(false);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3171e);
        this.f1464f.mo4719b(savedState.f1469a);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f1464f.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f1465g.mo1154a((MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    /* renamed from: c */
    private ColorStateList m1560c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C1065a.m4638a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.g8, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f1462e, f1461d, EMPTY_STATE_SET}, new int[]{a.getColorForState(f1462e, defaultColor), i2, defaultColor});
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.uf);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i), this.f1466h), 1073741824);
        } else if (mode == 0) {
            i = MeasureSpec.makeMeasureSpec(this.f1466h, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int i2;
        boolean z;
        super(context, attributeSet, i);
        this.f1465g = new NavigationMenuPresenter();
        this.f1464f = new NavigationMenu(context);
        C1365av b = C0296b.m1173b(context, attributeSet, R$styleable.NavigationView, i, R.style.qd, new int[0]);
        C0991u.m4185a((View) this, b.mo6392a(0));
        if (b.mo6406g(3)) {
            C0991u.m4230k((View) this, (float) b.mo6401e(3, 0));
        }
        C0991u.m4203b((View) this, b.mo6394a(1, false));
        this.f1466h = b.mo6401e(2, 0);
        if (b.mo6406g(8)) {
            colorStateList = b.mo6402e(8);
        } else {
            colorStateList = m1560c(16842808);
        }
        if (b.mo6406g(9)) {
            i2 = b.mo6405g(9, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList colorStateList2 = null;
        if (b.mo6406g(10)) {
            colorStateList2 = b.mo6402e(10);
        }
        if (!z && colorStateList2 == null) {
            colorStateList2 = m1560c(16842806);
        }
        Drawable a = b.mo6392a(5);
        if (b.mo6406g(6)) {
            this.f1465g.mo1158c(b.mo6401e(6, 0));
        }
        int e = b.mo6401e(7, 0);
        this.f1464f.mo4702a((C1166a) new C1166a() {
            /* renamed from: a */
            public final void mo1345a(MenuBuilder menuBuilder) {
            }

            /* renamed from: a */
            public final boolean mo1346a(MenuBuilder menuBuilder, MenuItem menuItem) {
                if (NavigationView.this.f1463c == null || !NavigationView.this.f1463c.mo1562a(menuItem)) {
                    return false;
                }
                return true;
            }
        });
        this.f1465g.f1154c = 1;
        this.f1465g.mo1110a(context, (MenuBuilder) this.f1464f);
        this.f1465g.mo1151a(colorStateList);
        if (z) {
            this.f1465g.mo1155b(i2);
        }
        this.f1465g.mo1156b(colorStateList2);
        this.f1465g.mo1152a(a);
        this.f1465g.mo1160d(e);
        this.f1464f.mo4704a((C1188i) this.f1465g);
        addView((View) this.f1465g.mo1149a((ViewGroup) this));
        if (b.mo6406g(11)) {
            m1558a(b.mo6405g(11, 0));
        }
        if (b.mo6406g(4)) {
            m1559b(b.mo6405g(4, 0));
        }
        b.mo6393a();
    }
}
