package android.support.transition;

import android.view.View;

/* renamed from: android.support.transition.ak */
public abstract class C0471ak extends C0519p {

    /* renamed from: a */
    private static final String[] f1945a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: a */
    public final String[] mo2082a() {
        return f1945a;
    }

    /* renamed from: c */
    public static int m2058c(C0524s sVar) {
        return m2056a(sVar, 0);
    }

    /* renamed from: d */
    public static int m2059d(C0524s sVar) {
        return m2056a(sVar, 1);
    }

    /* renamed from: b */
    public static int m2057b(C0524s sVar) {
        if (sVar == null) {
            return 8;
        }
        Integer num = (Integer) sVar.f2072a.get("android:visibilityPropagation:visibility");
        if (num == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final void mo2081a(C0524s sVar) {
        View view = sVar.f2073b;
        Integer num = (Integer) sVar.f2072a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        sVar.f2072a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        sVar.f2072a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: a */
    private static int m2056a(C0524s sVar, int i) {
        if (sVar == null) {
            return -1;
        }
        int[] iArr = (int[]) sVar.f2072a.get("android:visibilityPropagation:center");
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }
}
