package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.C0958b;
import android.support.p022v4.view.C0958b.C0959a;
import android.support.p029v7.view.C1152a;
import android.support.p029v7.view.menu.ActionMenuItemView;
import android.support.p029v7.view.menu.ActionMenuItemView.C1164b;
import android.support.p029v7.view.menu.BaseMenuPresenter;
import android.support.p029v7.view.menu.C1186h;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.view.menu.C1190j;
import android.support.p029v7.view.menu.C1190j.C1191a;
import android.support.p029v7.view.menu.C1194m;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.support.p029v7.view.menu.SubMenuBuilder;
import android.support.p029v7.widget.ActionMenuView.C1212a;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.ActionMenuPresenter */
final class ActionMenuPresenter extends BaseMenuPresenter implements C0959a {

    /* renamed from: A */
    private final SparseBooleanArray f4508A = new SparseBooleanArray();

    /* renamed from: B */
    private View f4509B;

    /* renamed from: C */
    private C1206b f4510C;

    /* renamed from: i */
    C1208d f4511i;

    /* renamed from: j */
    public boolean f4512j;

    /* renamed from: k */
    public boolean f4513k;

    /* renamed from: l */
    C1210e f4514l;

    /* renamed from: m */
    C1205a f4515m;

    /* renamed from: n */
    C1207c f4516n;

    /* renamed from: o */
    final C1211f f4517o = new C1211f();

    /* renamed from: p */
    int f4518p;

    /* renamed from: q */
    private Drawable f4519q;

    /* renamed from: r */
    private boolean f4520r;

    /* renamed from: s */
    private boolean f4521s;

    /* renamed from: t */
    private int f4522t;

    /* renamed from: u */
    private int f4523u;

    /* renamed from: v */
    private int f4524v;

    /* renamed from: w */
    private boolean f4525w;

    /* renamed from: x */
    private boolean f4526x;

    /* renamed from: y */
    private boolean f4527y;

    /* renamed from: z */
    private int f4528z;

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$SavedState */
    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m5513a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m5512a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m5512a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m5513a(i);
            }
        };

        /* renamed from: a */
        public int f4529a;

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        SavedState(Parcel parcel) {
            this.f4529a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4529a);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$a */
    class C1205a extends C1186h {
        /* renamed from: d */
        public final void mo4925d() {
            ActionMenuPresenter.this.f4515m = null;
            ActionMenuPresenter.this.f4518p = 0;
            super.mo4925d();
        }

        public C1205a(Context context, SubMenuBuilder subMenuBuilder, View view) {
            View view2;
            super(context, subMenuBuilder, view, false, R.attr.a6);
            if (!((MenuItemImpl) subMenuBuilder.getItem()).mo4783i()) {
                if (ActionMenuPresenter.this.f4511i == null) {
                    view2 = (View) ActionMenuPresenter.this.f4249g;
                } else {
                    view2 = ActionMenuPresenter.this.f4511i;
                }
                this.f4407a = view2;
            }
            mo4920a((C1189a) ActionMenuPresenter.this.f4517o);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$b */
    class C1206b extends C1164b {
        /* renamed from: a */
        public final C1194m mo4668a() {
            if (ActionMenuPresenter.this.f4515m != null) {
                return ActionMenuPresenter.this.f4515m.mo4923b();
            }
            return null;
        }

        C1206b() {
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$c */
    class C1207c implements Runnable {

        /* renamed from: b */
        private C1210e f4533b;

        public final void run() {
            if (ActionMenuPresenter.this.f4245c != null) {
                ActionMenuPresenter.this.f4245c.mo4734e();
            }
            View view = (View) ActionMenuPresenter.this.f4249g;
            if (!(view == null || view.getWindowToken() == null || !this.f4533b.mo4924c())) {
                ActionMenuPresenter.this.f4514l = this.f4533b;
            }
            ActionMenuPresenter.this.f4516n = null;
        }

        public C1207c(C1210e eVar) {
            this.f4533b = eVar;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$d */
    class C1208d extends AppCompatImageView implements C1212a {

        /* renamed from: b */
        private final float[] f4535b = new float[2];

        /* renamed from: c */
        public final boolean mo4651c() {
            return false;
        }

        /* renamed from: d */
        public final boolean mo4652d() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo5058e();
            return true;
        }

        public C1208d(Context context) {
            super(context, null, R.attr.a5);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C1366aw.m6763a(this, getContentDescription());
            setOnTouchListener(new C1330aa(this, ActionMenuPresenter.this) {
                /* renamed from: b */
                public final boolean mo4667b() {
                    ActionMenuPresenter.this.mo5058e();
                    return true;
                }

                /* renamed from: a */
                public final C1194m mo4666a() {
                    if (ActionMenuPresenter.this.f4514l == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.f4514l.mo4923b();
                }

                /* renamed from: c */
                public final boolean mo5071c() {
                    if (ActionMenuPresenter.this.f4516n != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.mo5059f();
                    return true;
                }
            });
        }

        /* access modifiers changed from: protected */
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0727a.m3104a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$e */
    class C1210e extends C1186h {
        /* renamed from: d */
        public final void mo4925d() {
            if (ActionMenuPresenter.this.f4245c != null) {
                ActionMenuPresenter.this.f4245c.close();
            }
            ActionMenuPresenter.this.f4514l = null;
            super.mo4925d();
        }

        public C1210e(Context context, MenuBuilder menuBuilder, View view, boolean z) {
            super(context, menuBuilder, view, true, R.attr.a6);
            mo4920a((C1189a) ActionMenuPresenter.this.f4517o);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$f */
    class C1211f implements C1189a {
        C1211f() {
        }

        /* renamed from: a */
        public final boolean mo4339a(MenuBuilder menuBuilder) {
            if (menuBuilder == null) {
                return false;
            }
            ActionMenuPresenter.this.f4518p = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            C1189a aVar = ActionMenuPresenter.this.f4248f;
            if (aVar != null) {
                return aVar.mo4339a(menuBuilder);
            }
            return false;
        }

        /* renamed from: a */
        public final void mo4338a(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuBuilder) {
                menuBuilder.mo4745l().mo4722b(false);
            }
            C1189a aVar = ActionMenuPresenter.this.f4248f;
            if (aVar != null) {
                aVar.mo4338a(menuBuilder, z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo4672a(int i, MenuItemImpl menuItemImpl) {
        return menuItemImpl.mo4783i();
    }

    /* renamed from: a */
    public final void mo1114a(boolean z) {
        super.mo1114a(z);
        ((View) this.f4249g).requestLayout();
        boolean z2 = false;
        if (this.f4245c != null) {
            ArrayList j = this.f4245c.mo4743j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                C0958b a = ((MenuItemImpl) j.get(i)).mo2950a();
                if (a != null) {
                    a.f3348b = this;
                }
            }
        }
        ArrayList k = this.f4245c != null ? this.f4245c.mo4744k() : null;
        if (this.f4512j && k != null) {
            int size2 = k.size();
            if (size2 == 1) {
                z2 = !((MenuItemImpl) k.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f4511i == null) {
                this.f4511i = new C1208d(this.f4243a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f4511i.getParent();
            if (viewGroup != this.f4249g) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f4511i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4249g;
                actionMenuView.addView(this.f4511i, actionMenuView.mo5072a());
            }
        } else if (this.f4511i != null && this.f4511i.getParent() == this.f4249g) {
            ((ViewGroup) this.f4249g).removeView(this.f4511i);
        }
        ((ActionMenuView) this.f4249g).setOverflowReserved(this.f4512j);
    }

    /* renamed from: a */
    public final boolean mo4673a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f4511i) {
            return false;
        }
        return super.mo4673a(viewGroup, i);
    }

    /* renamed from: a */
    public final boolean mo1117a(SubMenuBuilder subMenuBuilder) {
        boolean z = false;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.f4351j != this.f4245c) {
            subMenuBuilder2 = (SubMenuBuilder) subMenuBuilder2.f4351j;
        }
        View a = m5487a(subMenuBuilder2.getItem());
        if (a == null) {
            return false;
        }
        this.f4518p = subMenuBuilder.getItem().getItemId();
        int size = subMenuBuilder.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = subMenuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f4515m = new C1205a(this.f4244b, subMenuBuilder, a);
        this.f4515m.mo4921a(z);
        this.f4515m.mo4919a();
        super.mo1117a(subMenuBuilder);
        return true;
    }

    /* renamed from: a */
    public final boolean mo1115a() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        int i5 = 0;
        if (actionMenuPresenter.f4245c != null) {
            arrayList = actionMenuPresenter.f4245c.mo4739h();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f4524v;
        int i7 = actionMenuPresenter.f4523u;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f4249g;
        int i8 = i6;
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i11);
            if (menuItemImpl.mo4789k()) {
                i9++;
            } else if (menuItemImpl.mo4788j()) {
                i10++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.f4513k && menuItemImpl.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (actionMenuPresenter.f4512j && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f4508A;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f4526x) {
            i3 = i7 / actionMenuPresenter.f4528z;
            i2 = ((i7 % actionMenuPresenter.f4528z) / i3) + actionMenuPresenter.f4528z;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = i7;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i) {
            MenuItemImpl menuItemImpl2 = (MenuItemImpl) arrayList.get(i14);
            if (menuItemImpl2.mo4789k()) {
                View a = actionMenuPresenter.mo4670a(menuItemImpl2, actionMenuPresenter.f4509B, viewGroup);
                if (actionMenuPresenter.f4509B == null) {
                    actionMenuPresenter.f4509B = a;
                }
                if (actionMenuPresenter.f4526x) {
                    i3 -= ActionMenuView.m5524a(a, i2, i3, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i15 != 0) {
                    measuredWidth = i15;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                menuItemImpl2.mo4764d(z);
                i4 = i;
                i15 = measuredWidth;
            } else if (menuItemImpl2.mo4788j()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i13 > 0 && (!actionMenuPresenter.f4526x || i3 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View a2 = actionMenuPresenter.mo4670a(menuItemImpl2, actionMenuPresenter.f4509B, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.f4509B == null) {
                        actionMenuPresenter.f4509B = a2;
                    }
                    if (actionMenuPresenter.f4526x) {
                        int a3 = ActionMenuView.m5524a(a2, i2, i3, makeMeasureSpec, 0);
                        i3 -= a3;
                        if (a3 == 0) {
                            z5 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    if (actionMenuPresenter.f4526x) {
                        z4 = z5 & (i13 >= 0);
                    } else {
                        z4 = z5 & (i13 + i15 > 0);
                    }
                } else {
                    boolean z6 = z4;
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i16 = 0;
                    while (i16 < i14) {
                        MenuItemImpl menuItemImpl3 = (MenuItemImpl) arrayList.get(i16);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.mo4783i()) {
                                i12++;
                            }
                            menuItemImpl3.mo4764d(false);
                        }
                        i16++;
                    }
                }
                if (z4) {
                    i12--;
                }
                menuItemImpl2.mo4764d(z4);
            } else {
                i4 = i;
                menuItemImpl2.mo4764d(false);
                i14++;
                i = i4;
                actionMenuPresenter = this;
                i5 = 0;
            }
            i14++;
            i = i4;
            actionMenuPresenter = this;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo5055a(ActionMenuView actionMenuView) {
        this.f4249g = actionMenuView;
        actionMenuView.mo1084a(this.f4245c);
    }

    /* renamed from: c */
    public final Parcelable mo1120c() {
        SavedState savedState = new SavedState();
        savedState.f4529a = this.f4518p;
        return savedState;
    }

    /* renamed from: g */
    public final boolean mo5060g() {
        return mo5059f() | mo5061h();
    }

    /* renamed from: h */
    public final boolean mo5061h() {
        if (this.f4515m == null) {
            return false;
        }
        this.f4515m.dismiss();
        return true;
    }

    /* renamed from: i */
    public final boolean mo5062i() {
        if (this.f4514l == null || !this.f4514l.mo4927e()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo5063j() {
        if (this.f4516n != null || mo5062i()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable mo5057d() {
        if (this.f4511i != null) {
            return this.f4511i.getDrawable();
        }
        if (this.f4520r) {
            return this.f4519q;
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo5059f() {
        if (this.f4516n == null || this.f4249g == null) {
            C1210e eVar = this.f4514l;
            if (eVar == null) {
                return false;
            }
            eVar.dismiss();
            return true;
        }
        ((View) this.f4249g).removeCallbacks(this.f4516n);
        this.f4516n = null;
        return true;
    }

    /* renamed from: e */
    public final boolean mo5058e() {
        if (!this.f4512j || mo5062i() || this.f4245c == null || this.f4249g == null || this.f4516n != null || this.f4245c.mo4744k().isEmpty()) {
            return false;
        }
        C1210e eVar = new C1210e(this.f4244b, this.f4245c, this.f4511i, true);
        this.f4516n = new C1207c(eVar);
        ((View) this.f4249g).post(this.f4516n);
        super.mo1117a((SubMenuBuilder) null);
        return true;
    }

    /* renamed from: c */
    public final void mo5056c(boolean z) {
        this.f4512j = true;
        this.f4521s = true;
    }

    /* renamed from: a */
    public final C1190j mo4669a(ViewGroup viewGroup) {
        C1190j jVar = this.f4249g;
        C1190j a = super.mo4669a(viewGroup);
        if (jVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.d, R.layout.c);
    }

    /* renamed from: a */
    public final void mo5053a(Configuration configuration) {
        if (!this.f4525w) {
            this.f4524v = C1152a.m5114a(this.f4244b).mo4570a();
        }
        if (this.f4245c != null) {
            this.f4245c.mo1173a(true);
        }
    }

    /* renamed from: b */
    public final void mo3739b(boolean z) {
        if (z) {
            super.mo1117a((SubMenuBuilder) null);
            return;
        }
        if (this.f4245c != null) {
            this.f4245c.mo4722b(false);
        }
    }

    /* renamed from: a */
    private View m5487a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f4249g;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C1191a) && ((C1191a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo5054a(Drawable drawable) {
        if (this.f4511i != null) {
            this.f4511i.setImageDrawable(drawable);
            return;
        }
        this.f4520r = true;
        this.f4519q = drawable;
    }

    /* renamed from: a */
    public final void mo1111a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.f4529a > 0) {
                MenuItem findItem = this.f4245c.findItem(savedState.f4529a);
                if (findItem != null) {
                    mo1117a((SubMenuBuilder) findItem.getSubMenu());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1112a(MenuBuilder menuBuilder, boolean z) {
        mo5060g();
        super.mo1112a(menuBuilder, z);
    }

    /* renamed from: a */
    public final void mo1110a(Context context, MenuBuilder menuBuilder) {
        super.mo1110a(context, menuBuilder);
        Resources resources = context.getResources();
        C1152a a = C1152a.m5114a(context);
        if (!this.f4521s) {
            this.f4512j = a.mo4571b();
        }
        if (!this.f4527y) {
            this.f4522t = a.mo4572c();
        }
        if (!this.f4525w) {
            this.f4524v = a.mo4570a();
        }
        int i = this.f4522t;
        if (this.f4512j) {
            if (this.f4511i == null) {
                this.f4511i = new C1208d(this.f4243a);
                if (this.f4520r) {
                    this.f4511i.setImageDrawable(this.f4519q);
                    this.f4519q = null;
                    this.f4520r = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f4511i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f4511i.getMeasuredWidth();
        } else {
            this.f4511i = null;
        }
        this.f4523u = i;
        this.f4528z = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f4509B = null;
    }

    /* renamed from: a */
    public final void mo4671a(MenuItemImpl menuItemImpl, C1191a aVar) {
        aVar.mo1060a(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f4249g);
        if (this.f4510C == null) {
            this.f4510C = new C1206b();
        }
        actionMenuItemView.setPopupCallback(this.f4510C);
    }

    /* renamed from: a */
    public final View mo4670a(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        int i;
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.mo4791m()) {
            actionView = super.mo4670a(menuItemImpl, view, viewGroup);
        }
        if (menuItemImpl.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }
}
