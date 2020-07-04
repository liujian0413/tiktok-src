package com.bytedance.ies.dmt.p262ui.common.rebranding;

import android.content.res.Resources;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.c */
public final class C10782c {
    /* renamed from: a */
    public static int m31460a(TextView textView, ArrayList<Integer> arrayList, int i, int i2) {
        Resources resources = textView.getResources();
        Iterator it = arrayList.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            i3 = Math.max(i3, ((int) textView.getPaint().measureText(resources.getString(((Integer) it.next()).intValue()))) + textView.getPaddingLeft() + textView.getPaddingRight());
        }
        if (i3 >= i) {
            i = i3;
        }
        if (i > i2) {
            return i2;
        }
        return i;
    }
}
