package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.C13499h;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.C13148d;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.internal.C13173c;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.appevents.codeless.a */
public class C13123a {

    /* renamed from: a */
    private static final String f34760a = C13123a.class.getCanonicalName();

    /* renamed from: com.facebook.appevents.codeless.a$a */
    public static class C13125a implements OnClickListener {

        /* renamed from: a */
        public boolean f34761a;

        /* renamed from: b */
        private EventBinding f34762b;

        /* renamed from: c */
        private WeakReference<View> f34763c;

        /* renamed from: d */
        private WeakReference<View> f34764d;

        /* renamed from: e */
        private OnClickListener f34765e;

        /* renamed from: a */
        private void m38378a() {
            final String str = this.f34762b.f34816a;
            final Bundle a = C13130c.m38389a(this.f34762b, (View) this.f34764d.get(), (View) this.f34763c.get());
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

        public final void onClick(View view) {
            if (this.f34765e != null) {
                this.f34765e.onClick(view);
            }
            m38378a();
        }

        private C13125a(EventBinding eventBinding, View view, View view2) {
            if (eventBinding != null && view != null && view2 != null) {
                this.f34765e = C13148d.m38435d(view2);
                this.f34762b = eventBinding;
                this.f34763c = new WeakReference<>(view2);
                this.f34764d = new WeakReference<>(view);
                this.f34761a = true;
            }
        }
    }

    /* renamed from: a */
    public static C13125a m38377a(EventBinding eventBinding, View view, View view2) {
        return new C13125a(eventBinding, view, view2);
    }
}
