package android.support.p029v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.internal.view.C0746b;
import android.support.p022v4.view.C0958b;
import android.support.p022v4.view.C0958b.C0960b;
import android.support.p029v7.p030a.p031a.C1065a;
import android.support.p029v7.view.menu.C1190j.C1191a;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.view.menu.MenuItemImpl */
public final class MenuItemImpl implements C0746b {

    /* renamed from: A */
    private int f4313A;

    /* renamed from: B */
    private View f4314B;

    /* renamed from: C */
    private C0958b f4315C;

    /* renamed from: D */
    private OnActionExpandListener f4316D;

    /* renamed from: E */
    private boolean f4317E;

    /* renamed from: a */
    public final int f4318a;

    /* renamed from: b */
    MenuBuilder f4319b;

    /* renamed from: c */
    public Runnable f4320c;

    /* renamed from: d */
    public ContextMenuInfo f4321d;

    /* renamed from: e */
    private final int f4322e;

    /* renamed from: f */
    private final int f4323f;

    /* renamed from: g */
    private final int f4324g;

    /* renamed from: h */
    private CharSequence f4325h;

    /* renamed from: i */
    private CharSequence f4326i;

    /* renamed from: j */
    private Intent f4327j;

    /* renamed from: k */
    private char f4328k;

    /* renamed from: l */
    private int f4329l = 4096;

    /* renamed from: m */
    private char f4330m;

    /* renamed from: n */
    private int f4331n = 4096;

    /* renamed from: o */
    private Drawable f4332o;

    /* renamed from: p */
    private int f4333p;

    /* renamed from: q */
    private SubMenuBuilder f4334q;

    /* renamed from: r */
    private OnMenuItemClickListener f4335r;

    /* renamed from: s */
    private CharSequence f4336s;

    /* renamed from: t */
    private CharSequence f4337t;

    /* renamed from: u */
    private ColorStateList f4338u;

    /* renamed from: v */
    private Mode f4339v;

    /* renamed from: w */
    private boolean f4340w;

    /* renamed from: x */
    private boolean f4341x;

    /* renamed from: y */
    private boolean f4342y;

    /* renamed from: z */
    private int f4343z = 16;

    /* renamed from: a */
    public final C0958b mo2950a() {
        return this.f4315C;
    }

    public final int getAlphabeticModifiers() {
        return this.f4331n;
    }

    public final char getAlphabeticShortcut() {
        return this.f4330m;
    }

    public final CharSequence getContentDescription() {
        return this.f4336s;
    }

    public final int getGroupId() {
        return this.f4323f;
    }

    public final ColorStateList getIconTintList() {
        return this.f4338u;
    }

    public final Mode getIconTintMode() {
        return this.f4339v;
    }

    public final Intent getIntent() {
        return this.f4327j;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.f4322e;
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.f4321d;
    }

    public final int getNumericModifiers() {
        return this.f4329l;
    }

    public final char getNumericShortcut() {
        return this.f4328k;
    }

    public final int getOrder() {
        return this.f4324g;
    }

    public final SubMenu getSubMenu() {
        return this.f4334q;
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f4325h;
    }

    public final CharSequence getTooltipText() {
        return this.f4337t;
    }

    public final boolean isActionViewExpanded() {
        return this.f4317E;
    }

    /* renamed from: g */
    public final void mo4768g() {
        this.f4319b.mo4720b(this);
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* renamed from: h */
    public final boolean mo4781h() {
        return this.f4319b.f4294g;
    }

    public final boolean hasSubMenu() {
        if (this.f4334q != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final char mo4761c() {
        if (this.f4319b.mo4726c()) {
            return this.f4330m;
        }
        return this.f4328k;
    }

    /* renamed from: f */
    public final boolean mo4767f() {
        if ((this.f4343z & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo4783i() {
        if ((this.f4343z & 32) == 32) {
            return true;
        }
        return false;
    }

    public final boolean isCheckable() {
        if ((this.f4343z & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f4343z & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f4343z & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo4788j() {
        if ((this.f4313A & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo4789k() {
        if ((this.f4313A & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo4790l() {
        if ((this.f4313A & 4) == 4) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (this.f4325h != null) {
            return this.f4325h.toString();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo4766e() {
        if (!this.f4319b.mo4732d() || mo4761c() == 0) {
            return false;
        }
        return true;
    }

    public final boolean expandActionView() {
        if (!mo4791m()) {
            return false;
        }
        if (this.f4316D == null || this.f4316D.onMenuItemActionExpand(this)) {
            return this.f4319b.mo4727c(this);
        }
        return false;
    }

    public final View getActionView() {
        if (this.f4314B != null) {
            return this.f4314B;
        }
        if (this.f4315C == null) {
            return null;
        }
        this.f4314B = this.f4315C.mo3730a((MenuItem) this);
        return this.f4314B;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence;
        if (this.f4326i != null) {
            charSequence = this.f4326i;
        } else {
            charSequence = this.f4325h;
        }
        if (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    /* renamed from: m */
    public final boolean mo4791m() {
        if ((this.f4313A & 8) == 0) {
            return false;
        }
        if (this.f4314B == null && this.f4315C != null) {
            this.f4314B = this.f4315C.mo3730a((MenuItem) this);
        }
        if (this.f4314B != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo4760b() {
        if ((this.f4335r != null && this.f4335r.onMenuItemClick(this)) || this.f4319b.mo4707a(this.f4319b, (MenuItem) this)) {
            return true;
        }
        if (this.f4320c != null) {
            this.f4320c.run();
            return true;
        }
        if (this.f4327j != null) {
            try {
                this.f4319b.f4288a.startActivity(this.f4327j);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        if (this.f4315C == null || !this.f4315C.mo3736d()) {
            return false;
        }
        return true;
    }

    public final boolean collapseActionView() {
        if ((this.f4313A & 8) == 0) {
            return false;
        }
        if (this.f4314B == null) {
            return true;
        }
        if (this.f4316D == null || this.f4316D.onMenuItemActionCollapse(this)) {
            return this.f4319b.mo4733d(this);
        }
        return false;
    }

    public final Drawable getIcon() {
        if (this.f4332o != null) {
            return m5283a(this.f4332o);
        }
        if (this.f4333p == 0) {
            return null;
        }
        Drawable b = C1065a.m4641b(this.f4319b.f4288a, this.f4333p);
        this.f4333p = 0;
        this.f4332o = b;
        return m5283a(b);
    }

    public final boolean isVisible() {
        if (this.f4315C == null || !this.f4315C.mo3734b()) {
            if ((this.f4343z & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f4343z & 8) != 0 || !this.f4315C.mo3735c()) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo4763d() {
        int i;
        char c = mo4761c();
        if (c == 0) {
            return "";
        }
        Resources resources = this.f4319b.f4288a.getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f4319b.f4288a).hasPermanentMenuKey()) {
            sb.append(resources.getString(R.string.bs));
        }
        if (this.f4319b.mo4726c()) {
            i = this.f4331n;
        } else {
            i = this.f4329l;
        }
        m5286a(sb, i, 65536, resources.getString(R.string.bo));
        m5286a(sb, i, 4096, resources.getString(R.string.bk));
        m5286a(sb, i, 2, resources.getString(R.string.bj));
        m5286a(sb, i, 1, resources.getString(R.string.bp));
        m5286a(sb, i, 4, resources.getString(R.string.br));
        m5286a(sb, i, 8, resources.getString(R.string.bn));
        if (c == 8) {
            sb.append(resources.getString(R.string.bl));
        } else if (c == 10) {
            sb.append(resources.getString(R.string.bm));
        } else if (c != ' ') {
            sb.append(c);
        } else {
            sb.append(resources.getString(R.string.bq));
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C0746b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f4327j = intent;
        return this;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f4316D = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f4335r = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* renamed from: a */
    public final C0746b setContentDescription(CharSequence charSequence) {
        this.f4336s = charSequence;
        this.f4319b.mo1173a(false);
        return this;
    }

    /* renamed from: b */
    public final C0746b setTooltipText(CharSequence charSequence) {
        this.f4337t = charSequence;
        this.f4319b.mo1173a(false);
        return this;
    }

    /* renamed from: d */
    public final void mo4764d(boolean z) {
        if (z) {
            this.f4343z |= 32;
        } else {
            this.f4343z &= -33;
        }
    }

    /* renamed from: e */
    public final void mo4765e(boolean z) {
        this.f4317E = z;
        this.f4319b.mo1173a(false);
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f4343z & 4) != 0) {
            this.f4319b.mo4706a((MenuItem) this);
        } else {
            mo4759b(z);
        }
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f4332o = null;
        this.f4333p = i;
        this.f4342y = true;
        this.f4319b.mo1173a(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4338u = colorStateList;
        this.f4340w = true;
        this.f4342y = true;
        this.f4319b.mo1173a(false);
        return this;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f4339v = mode;
        this.f4341x = true;
        this.f4342y = true;
        this.f4319b.mo1173a(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f4328k == c) {
            return this;
        }
        this.f4328k = c;
        this.f4319b.mo1173a(false);
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f4319b.f4288a.getString(i));
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4326i = charSequence;
        this.f4319b.mo1173a(false);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        if (mo4762c(z)) {
            this.f4319b.mo4703a(this);
        }
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C0746b setActionView(int i) {
        Context context = this.f4319b.f4288a;
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo4759b(boolean z) {
        int i;
        int i2 = this.f4343z;
        int i3 = this.f4343z & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f4343z = i | i3;
        if (i2 != this.f4343z) {
            this.f4319b.mo1173a(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo4762c(boolean z) {
        int i;
        int i2 = this.f4343z;
        int i3 = this.f4343z & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f4343z = i | i3;
        if (i2 != this.f4343z) {
            return true;
        }
        return false;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f4330m == c) {
            return this;
        }
        this.f4330m = Character.toLowerCase(c);
        this.f4319b.mo1173a(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f4343z;
        this.f4343z = z | (this.f4343z & true) ? 1 : 0;
        if (i != this.f4343z) {
            this.f4319b.mo1173a(false);
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f4343z |= 16;
        } else {
            this.f4343z &= -17;
        }
        this.f4319b.mo1173a(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f4333p = 0;
        this.f4332o = drawable;
        this.f4342y = true;
        this.f4319b.mo1173a(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f4313A = i;
                this.f4319b.mo4720b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4325h = charSequence;
        this.f4319b.mo1173a(false);
        if (this.f4334q != null) {
            this.f4334q.setHeaderTitle(charSequence);
        }
        return this;
    }

    /* renamed from: a */
    private Drawable m5283a(Drawable drawable) {
        if (drawable != null && this.f4342y && (this.f4340w || this.f4341x)) {
            drawable = C0727a.m3116g(drawable).mutate();
            if (this.f4340w) {
                C0727a.m3105a(drawable, this.f4338u);
            }
            if (this.f4341x) {
                C0727a.m3108a(drawable, this.f4339v);
            }
            this.f4342y = false;
        }
        return drawable;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C0746b setActionView(View view) {
        this.f4314B = view;
        this.f4315C = null;
        if (view != null && view.getId() == -1 && this.f4322e > 0) {
            view.setId(this.f4322e);
        }
        this.f4319b.mo4720b(this);
        return this;
    }

    /* renamed from: a */
    public final C0746b mo2948a(C0958b bVar) {
        if (this.f4315C != null) {
            this.f4315C.mo3738f();
        }
        this.f4314B = null;
        this.f4315C = bVar;
        this.f4319b.mo1173a(true);
        if (this.f4315C != null) {
            this.f4315C.mo3731a((C0960b) new C0960b() {
                /* renamed from: a */
                public final void mo3740a(boolean z) {
                    MenuItemImpl.this.f4319b.mo4703a(MenuItemImpl.this);
                }
            });
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final CharSequence mo4756a(C1191a aVar) {
        if (aVar.mo1061a()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    /* renamed from: a */
    public final void mo4757a(SubMenuBuilder subMenuBuilder) {
        this.f4334q = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public final void mo4758a(boolean z) {
        int i;
        int i2 = this.f4343z & -5;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.f4343z = i | i2;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f4328k = c;
        this.f4330m = Character.toLowerCase(c2);
        this.f4319b.mo1173a(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f4328k == c && this.f4329l == i) {
            return this;
        }
        this.f4328k = c;
        this.f4329l = KeyEvent.normalizeMetaState(i);
        this.f4319b.mo1173a(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f4330m == c && this.f4331n == i) {
            return this;
        }
        this.f4330m = Character.toLowerCase(c);
        this.f4331n = KeyEvent.normalizeMetaState(i);
        this.f4319b.mo1173a(false);
        return this;
    }

    /* renamed from: a */
    private static void m5286a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f4328k = c;
        this.f4329l = KeyEvent.normalizeMetaState(i);
        this.f4330m = Character.toLowerCase(c2);
        this.f4331n = KeyEvent.normalizeMetaState(i2);
        this.f4319b.mo1173a(false);
        return this;
    }

    MenuItemImpl(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f4319b = menuBuilder;
        this.f4322e = i2;
        this.f4323f = i;
        this.f4324g = i3;
        this.f4318a = i4;
        this.f4325h = charSequence;
        this.f4313A = i5;
    }
}
