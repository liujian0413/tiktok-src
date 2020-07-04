package android.support.p029v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.internal.view.C0746b;
import android.support.p022v4.view.C0958b;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.ActionMenuItem */
public class ActionMenuItem implements C0746b {

    /* renamed from: a */
    private final int f4209a;

    /* renamed from: b */
    private final int f4210b;

    /* renamed from: c */
    private final int f4211c;

    /* renamed from: d */
    private final int f4212d;

    /* renamed from: e */
    private CharSequence f4213e;

    /* renamed from: f */
    private CharSequence f4214f;

    /* renamed from: g */
    private Intent f4215g;

    /* renamed from: h */
    private char f4216h;

    /* renamed from: i */
    private int f4217i = 4096;

    /* renamed from: j */
    private char f4218j;

    /* renamed from: k */
    private int f4219k = 4096;

    /* renamed from: l */
    private Drawable f4220l;

    /* renamed from: m */
    private int f4221m;

    /* renamed from: n */
    private Context f4222n;

    /* renamed from: o */
    private OnMenuItemClickListener f4223o;

    /* renamed from: p */
    private CharSequence f4224p;

    /* renamed from: q */
    private CharSequence f4225q;

    /* renamed from: r */
    private ColorStateList f4226r;

    /* renamed from: s */
    private Mode f4227s;

    /* renamed from: t */
    private boolean f4228t;

    /* renamed from: u */
    private boolean f4229u;

    /* renamed from: v */
    private int f4230v = 16;

    /* renamed from: a */
    public final C0958b mo2950a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f4219k;
    }

    public char getAlphabeticShortcut() {
        return this.f4218j;
    }

    public CharSequence getContentDescription() {
        return this.f4224p;
    }

    public int getGroupId() {
        return this.f4210b;
    }

    public Drawable getIcon() {
        return this.f4220l;
    }

    public ColorStateList getIconTintList() {
        return this.f4226r;
    }

    public Mode getIconTintMode() {
        return this.f4227s;
    }

    public Intent getIntent() {
        return this.f4215g;
    }

    public int getItemId() {
        return this.f4209a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f4217i;
    }

    public char getNumericShortcut() {
        return this.f4216h;
    }

    public int getOrder() {
        return this.f4212d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f4213e;
    }

    public CharSequence getTooltipText() {
        return this.f4225q;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public void setShowAsAction(int i) {
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public CharSequence getTitleCondensed() {
        if (this.f4214f != null) {
            return this.f4214f;
        }
        return this.f4213e;
    }

    public boolean isCheckable() {
        if ((this.f4230v & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.f4230v & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.f4230v & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if ((this.f4230v & 8) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m5170b() {
        if (this.f4220l == null) {
            return;
        }
        if (this.f4228t || this.f4229u) {
            this.f4220l = C0727a.m3116g(this.f4220l);
            this.f4220l = this.f4220l.mutate();
            if (this.f4228t) {
                C0727a.m3105a(this.f4220l, this.f4226r);
            }
            if (this.f4229u) {
                C0727a.m3108a(this.f4220l, this.f4227s);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C0746b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: a */
    public final C0746b setContentDescription(CharSequence charSequence) {
        this.f4224p = charSequence;
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f4215g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f4216h = c;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f4223o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f4213e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4214f = charSequence;
        return this;
    }

    /* renamed from: a */
    private static C0746b m5167a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final C0746b setTooltipText(CharSequence charSequence) {
        this.f4225q = charSequence;
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        return m5167a(i);
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f4218j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f4230v = z | (this.f4230v & true) ? 1 : 0;
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private static C0746b m5168a(View view) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m5168a(view);
    }

    public MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.f4230v & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f4230v = i | i2;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.f4230v & -17;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.f4230v = i | i2;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f4221m = i;
        this.f4220l = C0683b.m2903a(this.f4222n, i);
        m5170b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4226r = colorStateList;
        this.f4228t = true;
        m5170b();
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f4227s = mode;
        this.f4229u = true;
        m5170b();
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f4213e = this.f4222n.getResources().getString(i);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f4230v & 8;
        if (z) {
            i = 0;
        }
        this.f4230v = i2 | i;
        return this;
    }

    /* renamed from: a */
    public final C0746b mo2948a(C0958b bVar) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f4220l = drawable;
        this.f4221m = 0;
        m5170b();
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f4218j = Character.toLowerCase(c);
        this.f4219k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f4216h = c;
        this.f4217i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f4216h = c;
        this.f4218j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4216h = c;
        this.f4217i = KeyEvent.normalizeMetaState(i);
        this.f4218j = Character.toLowerCase(c2);
        this.f4219k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public ActionMenuItem(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f4222n = context;
        this.f4209a = 16908332;
        this.f4210b = 0;
        this.f4211c = 0;
        this.f4212d = 0;
        this.f4213e = charSequence;
    }
}
