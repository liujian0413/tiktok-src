package android.support.p029v7.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.view.g */
public class C1162g implements Callback {

    /* renamed from: b */
    final Callback f4208b;

    public void onAttachedToWindow() {
        this.f4208b.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f4208b.onContentChanged();
    }

    public void onDetachedFromWindow() {
        this.f4208b.onDetachedFromWindow();
    }

    public boolean onSearchRequested() {
        return this.f4208b.onSearchRequested();
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4208b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4208b.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f4208b.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4208b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f4208b.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4208b.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f4208b.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f4208b.onActionModeStarted(actionMode);
    }

    public View onCreatePanelView(int i) {
        return this.f4208b.onCreatePanelView(i);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f4208b.onPointerCaptureChanged(z);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f4208b.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f4208b.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f4208b.onWindowStartingActionMode(callback);
    }

    public C1162g(Callback callback) {
        if (callback != null) {
            this.f4208b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f4208b.onSearchRequested(searchEvent);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f4208b.onCreatePanelMenu(i, menu);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f4208b.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f4208b.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f4208b.onPanelClosed(i, menu);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f4208b.onWindowStartingActionMode(callback, i);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f4208b.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f4208b.onProvideKeyboardShortcuts(list, menu, i);
    }
}
