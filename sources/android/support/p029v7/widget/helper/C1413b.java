package android.support.p029v7.widget.helper;

import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.v7.widget.helper.b */
final class C1413b implements C1412a {

    /* renamed from: a */
    static final C1412a f5507a = new C1413b();

    C1413b() {
    }

    /* renamed from: a */
    public final void mo6536a(View view) {
        if (VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(R.id.b5b);
            if (tag != null && (tag instanceof Float)) {
                C0991u.m4230k(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.b5b, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: a */
    private static float m6994a(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float s = C0991u.m4240s(childAt);
                if (s > f) {
                    f = s;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public final void mo6535a(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (VERSION.SDK_INT >= 21 && z && view.getTag(R.id.b5b) == null) {
            Float valueOf = Float.valueOf(C0991u.m4240s(view));
            C0991u.m4230k(view, m6994a(recyclerView, view) + 1.0f);
            view.setTag(R.id.b5b, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
