package com.p280ss.android.ugc.aweme.base.utils;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.ies.ugc.appcontext.C6399b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils */
public final class KeyboardUtils {

    /* renamed from: a */
    public static List<ClearCursorDecorator> f61936a = new ArrayList(2);

    /* renamed from: b */
    public static List<AndroidBug5497Workaround> f61937b = new ArrayList(2);

    /* renamed from: c */
    private static final int f61938c = C23486n.m77122a(73.0d);

    /* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils$AndroidBug5497Workaround */
    static class AndroidBug5497Workaround implements C0042h {

        /* renamed from: a */
        private OnGlobalLayoutListener f61939a;

        /* renamed from: b */
        private View f61940b;

        /* renamed from: c */
        private C23471a f61941c;

        @C0054q(mo125a = Event.ON_STOP)
        public void onStop() {
            Iterator it = KeyboardUtils.f61937b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AndroidBug5497Workaround androidBug5497Workaround = (AndroidBug5497Workaround) it.next();
                if (androidBug5497Workaround == this) {
                    KeyboardUtils.f61937b.remove(androidBug5497Workaround);
                    break;
                }
            }
            if (this.f61940b.getViewTreeObserver() != null && this.f61940b.getViewTreeObserver().isAlive()) {
                this.f61940b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f61939a);
            }
            this.f61940b = null;
            this.f61939a = null;
            this.f61941c = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils$ClearCursorDecorator */
    public static class ClearCursorDecorator implements C0042h {

        /* renamed from: a */
        public EditText f61942a;

        @C0054q(mo125a = Event.ON_DESTROY)
        public void onDestroy() {
            this.f61942a = null;
            for (ClearCursorDecorator clearCursorDecorator : KeyboardUtils.f61936a) {
                if (clearCursorDecorator == this) {
                    KeyboardUtils.f61936a.remove(this);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils$a */
    public interface C23471a {
    }

    /* renamed from: a */
    public static void m77055a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C6399b.m19921a().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    /* renamed from: b */
    public static void m77056b(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C6399b.m19921a().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    /* renamed from: c */
    public static void m77057c(View view) {
        if (view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) C6399b.m19921a().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }
}
