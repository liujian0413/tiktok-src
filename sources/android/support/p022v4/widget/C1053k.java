package android.support.p022v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.k */
public final class C1053k {
    /* renamed from: a */
    public static void m4549a(ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1) {
            View childAt = listView.getChildAt(0);
            if (childAt != null) {
                listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
            }
        }
    }

    /* renamed from: b */
    public static boolean m4550b(ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            return listView.canScrollList(-1);
        }
        if (listView.getChildCount() == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int top = listView.getChildAt(0).getTop();
        if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
            return true;
        }
        return false;
    }
}
