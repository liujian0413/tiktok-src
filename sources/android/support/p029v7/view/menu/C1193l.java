package android.support.p029v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.internal.view.C0745a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.l */
class C1193l extends C1173a<C0745a> implements Menu {
    public void close() {
        ((C0745a) this.f4356b).close();
    }

    public void clear() {
        mo4881a();
        ((C0745a) this.f4356b).clear();
    }

    public boolean hasVisibleItems() {
        return ((C0745a) this.f4356b).hasVisibleItems();
    }

    public int size() {
        return ((C0745a) this.f4356b).size();
    }

    public void setQwertyMode(boolean z) {
        ((C0745a) this.f4356b).setQwertyMode(z);
    }

    public MenuItem add(int i) {
        return mo4879a(((C0745a) this.f4356b).add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo4880a(((C0745a) this.f4356b).addSubMenu(i));
    }

    public MenuItem findItem(int i) {
        return mo4879a(((C0745a) this.f4356b).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo4879a(((C0745a) this.f4356b).getItem(i));
    }

    public void removeGroup(int i) {
        mo4882a(i);
        ((C0745a) this.f4356b).removeGroup(i);
    }

    public void removeItem(int i) {
        mo4883b(i);
        ((C0745a) this.f4356b).removeItem(i);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo4879a(((C0745a) this.f4356b).add(charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo4880a(((C0745a) this.f4356b).addSubMenu(charSequence));
    }

    C1193l(Context context, C0745a aVar) {
        super(context, aVar);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0745a) this.f4356b).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0745a) this.f4356b).setGroupVisible(i, z);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0745a) this.f4356b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0745a) this.f4356b).performIdentifierAction(i, i2);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0745a) this.f4356b).setGroupCheckable(i, z, z2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0745a) this.f4356b).performShortcut(i, keyEvent, i2);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo4879a(((C0745a) this.f4356b).add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo4880a(((C0745a) this.f4356b).addSubMenu(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo4879a(((C0745a) this.f4356b).add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo4880a(((C0745a) this.f4356b).addSubMenu(i, i2, i3, charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((C0745a) this.f4356b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr3[i5] = mo4879a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }
}
