package android.support.design.p015a;

import android.util.Property;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: android.support.design.a.d */
public final class C0237d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f878a = new C0237d("childrenAlpha");

    private C0237d(String str) {
        super(Float.class, str);
    }

    public final /* synthetic */ Object get(Object obj) {
        return m835a((ViewGroup) obj);
    }

    /* renamed from: a */
    private static Float m835a(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(R.id.c0i);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        m836a((ViewGroup) obj, (Float) obj2);
    }

    /* renamed from: a */
    private static void m836a(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(R.id.c0i, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
