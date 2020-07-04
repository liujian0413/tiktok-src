package android.support.p022v4.app;

import android.graphics.Rect;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0996w;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.support.v4.app.u */
public abstract class C0646u {
    /* renamed from: a */
    public abstract Object mo2025a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public abstract void mo2026a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo2027a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo2028a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo2029a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2030a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo2031a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2032a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo2033a(Object obj);

    /* renamed from: b */
    public abstract Object mo2034b(Object obj);

    /* renamed from: b */
    public abstract Object mo2035b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo2036b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2037b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo2038b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo2039c(Object obj);

    /* renamed from: c */
    public abstract void mo2040c(Object obj, View view);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2753a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (C0996w.m4263a(viewGroup)) {
                    arrayList.add(viewGroup);
                } else {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        mo2753a(arrayList, viewGroup.getChildAt(i));
                    }
                }
            } else {
                arrayList.add(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2754a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String t = C0991u.m4241t(view);
            if (t != null) {
                map.put(t, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo2754a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2752a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0587ab.m2461a(viewGroup, new Runnable() {
            public final void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    C0991u.m4192a(view, (String) map.get(C0991u.m4241t(view)));
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m2788a(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static ArrayList<String> m2785a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(C0991u.m4241t(view));
            C0991u.m4192a(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    protected static void m2786a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    static String m2784a(Map<String, String> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m2787a(List<View> list, View view) {
        int size = list.size();
        if (!m2789a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m2789a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m2789a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2751a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0587ab.m2461a(view, new Runnable() {
            public final void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String t = C0991u.m4241t(view);
                    if (t != null) {
                        C0991u.m4192a(view, C0646u.m2784a(map, t));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2750a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String t = C0991u.m4241t(view2);
            arrayList4.add(t);
            if (t != null) {
                C0991u.m4192a(view2, (String) null);
                String str = (String) map.get(t);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0991u.m4192a((View) arrayList2.get(i2), t);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C06471 r0 = new Runnable() {
            public final void run() {
                for (int i = 0; i < size; i++) {
                    C0991u.m4192a((View) arrayList5.get(i), (String) arrayList6.get(i));
                    C0991u.m4192a((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        };
        C0587ab.m2461a(view, r0);
    }
}
