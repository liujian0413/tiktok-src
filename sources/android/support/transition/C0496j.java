package android.support.transition;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.transition.j */
public final class C0496j {

    /* renamed from: a */
    public ViewGroup f1996a;

    /* renamed from: b */
    public Runnable f1997b;

    /* renamed from: a */
    public final void mo2110a() {
        if (m2094a(this.f1996a) == this && this.f1997b != null) {
            this.f1997b.run();
        }
    }

    /* renamed from: a */
    static C0496j m2094a(View view) {
        return (C0496j) view.getTag(R.id.dng);
    }

    /* renamed from: a */
    static void m2095a(View view, C0496j jVar) {
        view.setTag(R.id.dng, null);
    }
}
