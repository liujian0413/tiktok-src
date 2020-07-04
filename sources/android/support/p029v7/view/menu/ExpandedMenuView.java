package android.support.p029v7.view.menu;

import android.content.Context;
import android.support.p029v7.view.menu.MenuBuilder.C1167b;
import android.support.p029v7.widget.C1365av;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C1167b, C1190j, OnItemClickListener {

    /* renamed from: a */
    private static final int[] f4253a = {16842964, 16843049};

    /* renamed from: b */
    private MenuBuilder f4254b;

    /* renamed from: c */
    private int f4255c;

    public final int getWindowAnimations() {
        return this.f4255c;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    /* renamed from: a */
    public final void mo1084a(MenuBuilder menuBuilder) {
        this.f4254b = menuBuilder;
    }

    /* renamed from: a */
    public final boolean mo4674a(MenuItemImpl menuItemImpl) {
        return this.f4254b.mo4708a((MenuItem) menuItemImpl, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1365av a = C1365av.m6744a(context, attributeSet, f4253a, i, 0);
        if (a.mo6406g(0)) {
            setBackgroundDrawable(a.mo6392a(0));
        }
        if (a.mo6406g(1)) {
            setDivider(a.mo6392a(1));
        }
        a.mo6393a();
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo4674a((MenuItemImpl) getAdapter().getItem(i));
    }
}
