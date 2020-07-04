package android.support.p029v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0958b;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.ShareActionProvider */
public class ShareActionProvider extends C0958b {

    /* renamed from: c */
    final Context f5107c;

    /* renamed from: d */
    String f5108d;

    /* renamed from: e */
    private int f5109e;

    /* renamed from: f */
    private final C1311a f5110f;

    /* renamed from: android.support.v7.widget.ShareActionProvider$a */
    class C1311a implements OnMenuItemClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareActionProvider f5111a;

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Intent b = C1372b.m6781a(this.f5111a.f5107c, this.f5111a.f5108d).mo6422b(menuItem.getItemId());
            if (b != null) {
                String action = b.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    ShareActionProvider.m6336a(b);
                }
                this.f5111a.f5107c.startActivity(b);
            }
            return true;
        }
    }

    /* renamed from: e */
    public final boolean mo3737e() {
        return true;
    }

    /* renamed from: a */
    public final View mo3729a() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f5107c);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(C1372b.m6781a(this.f5107c, this.f5108d));
        }
        TypedValue typedValue = new TypedValue();
        this.f5107c.getTheme().resolveAttribute(R.attr.a1, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C1065a.m4641b(this.f5107c, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.c0);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.bz);
        return activityChooserView;
    }

    /* renamed from: a */
    static void m6336a(Intent intent) {
        if (VERSION.SDK_INT >= 21) {
            intent.addFlags(134742016);
        } else {
            intent.addFlags(524288);
        }
    }

    /* renamed from: a */
    public final void mo3732a(SubMenu subMenu) {
        subMenu.clear();
        C1372b a = C1372b.m6781a(this.f5107c, this.f5108d);
        PackageManager packageManager = this.f5107c.getPackageManager();
        int a2 = a.mo6419a();
        int min = Math.min(a2, this.f5109e);
        for (int i = 0; i < min; i++) {
            ResolveInfo a3 = a.mo6421a(i);
            subMenu.add(0, i, i, a3.loadLabel(packageManager)).setIcon(a3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f5110f);
        }
        if (min < a2) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f5107c.getString(R.string.b4));
            for (int i2 = 0; i2 < a2; i2++) {
                ResolveInfo a4 = a.mo6421a(i2);
                addSubMenu.add(0, i2, i2, a4.loadLabel(packageManager)).setIcon(a4.loadIcon(packageManager)).setOnMenuItemClickListener(this.f5110f);
            }
        }
    }
}
