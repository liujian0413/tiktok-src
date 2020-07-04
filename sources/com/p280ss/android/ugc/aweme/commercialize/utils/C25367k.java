package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import kotlin.TypeCastException;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.k */
public final class C25367k {

    /* renamed from: a */
    public static final C25367k f66772a = new C25367k();

    private C25367k() {
    }

    /* renamed from: a */
    public static final void m83410a(Context context) {
        m83412a(context, null, 2, null);
    }

    /* renamed from: b */
    private static InputMethodManager m83413b(Context context) throws Exception {
        Object systemService = context.getSystemService("input_method");
        if (systemService != null) {
            return (InputMethodManager) systemService;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: a */
    public static final void m83411a(Context context, View view) {
        if (context != null && view != null) {
            try {
                view.requestFocus();
                m83413b(context).showSoftInput(view, 2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static final void m83414b(Context context, View view) {
        if (context != null && view != null) {
            try {
                m83413b(context).hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception unused) {
            }
            view.clearFocus();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m83412a(Context context, View view, int i, Object obj) {
        Context context2;
        View view2 = null;
        if (!(context instanceof Activity)) {
            context2 = null;
        } else {
            context2 = context;
        }
        Activity activity = (Activity) context2;
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                    view2 = decorView.findFocus();
                }
            }
        }
        m83414b(context, view2);
    }
}
