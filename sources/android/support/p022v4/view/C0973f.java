package android.support.p022v4.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.view.f */
public final class C0973f {

    /* renamed from: a */
    private static boolean f3391a;

    /* renamed from: b */
    private static Method f3392b;

    /* renamed from: c */
    private static boolean f3393c;

    /* renamed from: d */
    private static Field f3394d;

    /* renamed from: android.support.v4.view.f$a */
    public interface C0974a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static OnKeyListener m4111a(Dialog dialog) {
        if (!f3393c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f3394d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3393c = true;
        }
        if (f3394d != null) {
            try {
                return (OnKeyListener) f3394d.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m4116a(View view, KeyEvent keyEvent) {
        return C0991u.m4197a(view, keyEvent);
    }

    /* renamed from: a */
    private static boolean m4112a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f3391a) {
            try {
                f3392b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f3391a = true;
        }
        if (f3392b != null) {
            try {
                return ((Boolean) f3392b.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m4113a(Activity activity, KeyEvent keyEvent) {
        DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m4112a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0991u.m4204b(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    /* renamed from: a */
    private static boolean m4114a(Dialog dialog, KeyEvent keyEvent) {
        DispatcherState dispatcherState;
        OnKeyListener a = m4111a(dialog);
        if (a != null && a.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0991u.m4204b(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    /* renamed from: a */
    public static boolean m4115a(C0974a aVar, View view, Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m4113a((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m4114a((Dialog) callback, keyEvent);
        }
        if ((view == null || !C0991u.m4204b(view, keyEvent)) && !aVar.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }
}
