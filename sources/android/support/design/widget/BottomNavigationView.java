package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.R$styleable;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.design.internal.C0296b;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.view.C1157e;
import android.support.p029v7.view.menu.C1188i;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuBuilder.C1166a;
import android.support.p029v7.widget.C1365av;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: a */
    public C0339b f1327a;

    /* renamed from: b */
    public C0338a f1328b;

    /* renamed from: c */
    private final MenuBuilder f1329c;

    /* renamed from: d */
    private final BottomNavigationMenuView f1330d;

    /* renamed from: e */
    private final BottomNavigationPresenter f1331e;

    /* renamed from: f */
    private MenuInflater f1332f;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m1363a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m1361a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1361a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m1363a(i);
            }

            /* renamed from: a */
            private static SavedState m1362a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m1362a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        Bundle f1334a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m1360a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m1360a(Parcel parcel, ClassLoader classLoader) {
            this.f1334a = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f1334a);
        }
    }

    /* renamed from: android.support.design.widget.BottomNavigationView$a */
    public interface C0338a {
    }

    /* renamed from: android.support.design.widget.BottomNavigationView$b */
    public interface C0339b {
        /* renamed from: a */
        boolean mo1350a(MenuItem menuItem);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f1329c;
    }

    public Drawable getItemBackground() {
        return this.f1330d.getItemBackground();
    }

    public int getItemBackgroundResource() {
        return this.f1330d.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f1330d.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f1330d.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.f1330d.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f1330d.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f1330d.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f1330d.getLabelVisibilityMode();
    }

    public int getSelectedItemId() {
        return this.f1330d.getSelectedItemId();
    }

    private MenuInflater getMenuInflater() {
        if (this.f1332f == null) {
            this.f1332f = new C1157e(getContext());
        }
        return this.f1332f;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1334a = new Bundle();
        this.f1329c.mo4701a(savedState.f1334a);
        return savedState;
    }

    public void setOnNavigationItemReselectedListener(C0338a aVar) {
        this.f1328b = aVar;
    }

    public void setOnNavigationItemSelectedListener(C0339b bVar) {
        this.f1327a = bVar;
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public void setItemBackground(Drawable drawable) {
        this.f1330d.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f1330d.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f1330d.setItemIconSize(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f1330d.setIconTintList(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f1330d.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f1330d.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1330d.setItemTextColor(colorStateList);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    /* renamed from: a */
    private void m1356a(int i) {
        this.f1331e.f1130b = true;
        getMenuInflater().inflate(i, this.f1329c);
        this.f1331e.f1130b = false;
        this.f1331e.mo1114a(true);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3171e);
        this.f1329c.mo4719b(savedState.f1334a);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f1330d.f1104a != z) {
            this.f1330d.setItemHorizontalTranslationEnabled(z);
            this.f1331e.mo1114a(false);
        }
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f1330d.getLabelVisibilityMode() != i) {
            this.f1330d.setLabelVisibilityMode(i);
            this.f1331e.mo1114a(false);
        }
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f1329c.findItem(i);
        if (findItem != null && !this.f1329c.mo4709a(findItem, (C1188i) this.f1331e, 0)) {
            findItem.setChecked(true);
        }
    }

    /* renamed from: a */
    private void m1357a(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0683b.m2912c(context, R.color.n8));
        view.setLayoutParams(new LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.f4)));
        addView(view);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cw);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1331e = new BottomNavigationPresenter();
        this.f1329c = new BottomNavigationMenu(context);
        this.f1330d = new BottomNavigationMenuView(context);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f1330d.setLayoutParams(layoutParams);
        this.f1331e.f1129a = this.f1330d;
        this.f1331e.f1131c = 1;
        this.f1330d.setPresenter(this.f1331e);
        this.f1329c.mo4704a((C1188i) this.f1331e);
        this.f1331e.mo1110a(getContext(), this.f1329c);
        C1365av b = C0296b.m1173b(context, attributeSet, R$styleable.BottomNavigationView, i, R.style.q_, 6, 5);
        if (b.mo6406g(4)) {
            this.f1330d.setIconTintList(b.mo6402e(4));
        } else {
            this.f1330d.setIconTintList(this.f1330d.mo1082a(16842808));
        }
        setItemIconSize(b.mo6401e(3, getResources().getDimensionPixelSize(R.dimen.f0)));
        if (b.mo6406g(6)) {
            setItemTextAppearanceInactive(b.mo6405g(6, 0));
        }
        if (b.mo6406g(5)) {
            setItemTextAppearanceActive(b.mo6405g(5, 0));
        }
        if (b.mo6406g(7)) {
            setItemTextColor(b.mo6402e(7));
        }
        if (b.mo6406g(0)) {
            C0991u.m4230k((View) this, (float) b.mo6401e(0, 0));
        }
        setLabelVisibilityMode(b.mo6397c(8, -1));
        setItemHorizontalTranslationEnabled(b.mo6394a(2, true));
        this.f1330d.setItemBackgroundRes(b.mo6405g(1, 0));
        if (b.mo6406g(9)) {
            m1356a(b.mo6405g(9, 0));
        }
        b.mo6393a();
        addView(this.f1330d, layoutParams);
        if (VERSION.SDK_INT < 21) {
            m1357a(context);
        }
        this.f1329c.mo4702a((C1166a) new C1166a() {
            /* renamed from: a */
            public final void mo1345a(MenuBuilder menuBuilder) {
            }

            /* renamed from: a */
            public final boolean mo1346a(MenuBuilder menuBuilder, MenuItem menuItem) {
                if (BottomNavigationView.this.f1328b != null && menuItem.getItemId() == BottomNavigationView.this.getSelectedItemId()) {
                    return true;
                }
                if (BottomNavigationView.this.f1327a == null || BottomNavigationView.this.f1327a.mo1350a(menuItem)) {
                    return false;
                }
                return true;
            }
        });
    }
}
