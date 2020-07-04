package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.facebook.C13499h;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.C13148d;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.internal.C13173c;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.appevents.codeless.d */
public class C13134d {

    /* renamed from: a */
    private static final String f34794a = C13134d.class.getCanonicalName();

    /* renamed from: com.facebook.appevents.codeless.d$a */
    public static class C13135a implements OnTouchListener {

        /* renamed from: a */
        public boolean f34795a;

        /* renamed from: b */
        private EventBinding f34796b;

        /* renamed from: c */
        private WeakReference<View> f34797c;

        /* renamed from: d */
        private WeakReference<View> f34798d;

        /* renamed from: e */
        private OnTouchListener f34799e;

        /* renamed from: a */
        private void m38406a() {
            if (this.f34796b != null) {
                final String str = this.f34796b.f34816a;
                final Bundle a = C13130c.m38389a(this.f34796b, (View) this.f34798d.get(), (View) this.f34797c.get());
                if (a.containsKey("_valueToSum")) {
                    a.putDouble("_valueToSum", C13173c.m38492a(a.getString("_valueToSum")));
                }
                a.putString("_is_fb_codeless", "1");
                C13499h.m39719e().execute(new Runnable() {
                    public final void run() {
                        AppEventsLogger.m38356a(C13499h.m39721g()).mo32284a(str, a);
                    }
                });
            }
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                m38406a();
            }
            if (this.f34799e == null || !this.f34799e.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }

        public C13135a(EventBinding eventBinding, View view, View view2) {
            if (eventBinding != null && view != null && view2 != null) {
                this.f34799e = C13148d.m38436e(view2);
                this.f34796b = eventBinding;
                this.f34797c = new WeakReference<>(view2);
                this.f34798d = new WeakReference<>(view);
                this.f34795a = true;
            }
        }
    }

    /* renamed from: a */
    public static C13135a m38405a(EventBinding eventBinding, View view, View view2) {
        return new C13135a(eventBinding, view, view2);
    }
}
