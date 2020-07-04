package com.p280ss.sys.ces.p1803b;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.p280ss.sys.ces.C45939c;

/* renamed from: com.ss.sys.ces.b.b */
public final class C45938b implements Callback {

    /* renamed from: a */
    public static boolean f117413a;

    /* renamed from: b */
    private Callback f117414b;

    public C45938b(Callback callback) {
        this.f117414b = callback;
        f117413a = true;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        try {
            if (C45939c.m144077a() != null) {
                C45939c.m144079a(5, motionEvent);
            }
        } catch (Throwable unused) {
        }
        return this.f117414b.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            if (C45939c.m144077a() != null) {
                C45939c.m144079a(1, keyEvent);
            }
        } catch (Throwable unused) {
        }
        return this.f117414b.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        try {
            if (C45939c.m144077a() != null) {
                C45939c.m144079a(2, keyEvent);
            }
        } catch (Throwable unused) {
        }
        return this.f117414b.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f117414b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (C45939c.m144077a() != null) {
                C45939c.m144079a(3, motionEvent);
            }
        } catch (Throwable unused) {
        }
        return this.f117414b.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        try {
            if (C45939c.m144077a() != null) {
                C45939c.m144079a(4, motionEvent);
            }
        } catch (Throwable unused) {
        }
        return this.f117414b.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f117414b.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f117414b.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f117414b.onAttachedToWindow();
    }

    public final void onContentChanged() {
        this.f117414b.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f117414b.onCreatePanelMenu(i, menu);
    }

    public final View onCreatePanelView(int i) {
        return this.f117414b.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.f117414b.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f117414b.onMenuItemSelected(i, menuItem);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        return this.f117414b.onMenuOpened(i, menu);
    }

    public final void onPanelClosed(int i, Menu menu) {
        this.f117414b.onPanelClosed(i, menu);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f117414b.onPreparePanel(i, view, menu);
    }

    public final boolean onSearchRequested() {
        return this.f117414b.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f117414b.onSearchRequested(searchEvent);
    }

    public final void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f117414b.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f117414b.onWindowFocusChanged(z);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f117414b.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f117414b.onWindowStartingActionMode(callback, i);
    }
}
