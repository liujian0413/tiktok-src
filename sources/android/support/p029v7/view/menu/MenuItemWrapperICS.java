package android.support.p029v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p022v4.internal.view.C0746b;
import android.support.p022v4.view.C0958b;
import android.support.p029v7.view.C1155c;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.MenuItemWrapperICS */
public class MenuItemWrapperICS extends C1173a<C0746b> implements MenuItem {

    /* renamed from: c */
    private Method f4345c;

    /* renamed from: android.support.v7.view.menu.MenuItemWrapperICS$a */
    class C1169a extends C0958b {

        /* renamed from: c */
        final ActionProvider f4346c;

        /* renamed from: a */
        public final View mo3729a() {
            return this.f4346c.onCreateActionView();
        }

        /* renamed from: d */
        public final boolean mo3736d() {
            return this.f4346c.onPerformDefaultAction();
        }

        /* renamed from: e */
        public final boolean mo3737e() {
            return this.f4346c.hasSubMenu();
        }

        /* renamed from: a */
        public final void mo3732a(SubMenu subMenu) {
            this.f4346c.onPrepareSubMenu(MenuItemWrapperICS.this.mo4880a(subMenu));
        }

        public C1169a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f4346c = actionProvider;
        }
    }

    /* renamed from: android.support.v7.view.menu.MenuItemWrapperICS$b */
    static class C1170b extends FrameLayout implements C1155c {

        /* renamed from: a */
        final CollapsibleActionView f4348a;

        /* renamed from: a */
        public final void mo4577a() {
            this.f4348a.onActionViewExpanded();
        }

        /* renamed from: b */
        public final void mo4578b() {
            this.f4348a.onActionViewCollapsed();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final View mo4867c() {
            return (View) this.f4348a;
        }

        C1170b(View view) {
            super(view.getContext());
            this.f4348a = (CollapsibleActionView) view;
            addView(view);
        }
    }

    /* renamed from: android.support.v7.view.menu.MenuItemWrapperICS$c */
    class C1171c extends C1174b<OnActionExpandListener> implements OnActionExpandListener {
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f4356b).onMenuItemActionCollapse(MenuItemWrapperICS.this.mo4879a(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.f4356b).onMenuItemActionExpand(MenuItemWrapperICS.this.mo4879a(menuItem));
        }

        C1171c(OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }
    }

    /* renamed from: android.support.v7.view.menu.MenuItemWrapperICS$d */
    class C1172d extends C1174b<OnMenuItemClickListener> implements OnMenuItemClickListener {
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.f4356b).onMenuItemClick(MenuItemWrapperICS.this.mo4879a(menuItem));
        }

        C1172d(OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }
    }

    public boolean collapseActionView() {
        return ((C0746b) this.f4356b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0746b) this.f4356b).expandActionView();
    }

    public int getAlphabeticModifiers() {
        return ((C0746b) this.f4356b).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0746b) this.f4356b).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0746b) this.f4356b).getContentDescription();
    }

    public int getGroupId() {
        return ((C0746b) this.f4356b).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0746b) this.f4356b).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0746b) this.f4356b).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((C0746b) this.f4356b).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0746b) this.f4356b).getIntent();
    }

    public int getItemId() {
        return ((C0746b) this.f4356b).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0746b) this.f4356b).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0746b) this.f4356b).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0746b) this.f4356b).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0746b) this.f4356b).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo4880a(((C0746b) this.f4356b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0746b) this.f4356b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0746b) this.f4356b).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0746b) this.f4356b).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0746b) this.f4356b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0746b) this.f4356b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0746b) this.f4356b).isCheckable();
    }

    public boolean isChecked() {
        return ((C0746b) this.f4356b).isChecked();
    }

    public boolean isEnabled() {
        return ((C0746b) this.f4356b).isEnabled();
    }

    public boolean isVisible() {
        return ((C0746b) this.f4356b).isVisible();
    }

    public ActionProvider getActionProvider() {
        C0958b a = ((C0746b) this.f4356b).mo2950a();
        if (a instanceof C1169a) {
            return ((C1169a) a).f4346c;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C0746b) this.f4356b).getActionView();
        if (actionView instanceof C1170b) {
            return ((C1170b) actionView).mo4867c();
        }
        return actionView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1169a mo4811a(ActionProvider actionProvider) {
        return new C1169a(this.f4353a, actionProvider);
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0746b) this.f4356b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0746b) this.f4356b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0746b) this.f4356b).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0746b) this.f4356b).mo2949a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0746b) this.f4356b).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0746b) this.f4356b).setIcon(i);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0746b) this.f4356b).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0746b) this.f4356b).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0746b) this.f4356b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0746b) this.f4356b).setNumericShortcut(c);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0746b) this.f4356b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0746b) this.f4356b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0746b) this.f4356b).setTitle(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0746b) this.f4356b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0746b) this.f4356b).mo2951b(charSequence);
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C1169a aVar;
        C0746b bVar = (C0746b) this.f4356b;
        if (actionProvider != null) {
            aVar = mo4811a(actionProvider);
        } else {
            aVar = null;
        }
        bVar.mo2948a((C0958b) aVar);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0746b) this.f4356b).setIcon(drawable);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0746b) this.f4356b).setTitle(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0746b) this.f4356b).setVisible(z);
    }

    public MenuItem setActionView(int i) {
        ((C0746b) this.f4356b).setActionView(i);
        View actionView = ((C0746b) this.f4356b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0746b) this.f4356b).setActionView((View) new C1170b(actionView));
        }
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        C1171c cVar;
        C0746b bVar = (C0746b) this.f4356b;
        if (onActionExpandListener != null) {
            cVar = new C1171c(onActionExpandListener);
        } else {
            cVar = null;
        }
        bVar.setOnActionExpandListener(cVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        C1172d dVar;
        C0746b bVar = (C0746b) this.f4356b;
        if (onMenuItemClickListener != null) {
            dVar = new C1172d(onMenuItemClickListener);
        } else {
            dVar = null;
        }
        bVar.setOnMenuItemClickListener(dVar);
        return this;
    }

    /* renamed from: a */
    public final void mo4812a(boolean z) {
        try {
            if (this.f4345c == null) {
                this.f4345c = ((C0746b) this.f4356b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f4345c.invoke(this.f4356b, new Object[]{Boolean.valueOf(true)});
        } catch (Exception unused) {
        }
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1170b(view);
        }
        ((C0746b) this.f4356b).setActionView(view);
        return this;
    }

    MenuItemWrapperICS(Context context, C0746b bVar) {
        super(context, bVar);
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0746b) this.f4356b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0746b) this.f4356b).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0746b) this.f4356b).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0746b) this.f4356b).setShortcut(c, c2, i, i2);
        return this;
    }
}
