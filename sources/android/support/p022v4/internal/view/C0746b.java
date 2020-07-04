package android.support.p022v4.internal.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.p022v4.view.C0958b;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.internal.view.b */
public interface C0746b extends MenuItem {
    /* renamed from: a */
    C0746b mo2948a(C0958b bVar);

    /* renamed from: a */
    C0746b mo2949a(CharSequence charSequence);

    /* renamed from: a */
    C0958b mo2950a();

    /* renamed from: b */
    C0746b mo2951b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
