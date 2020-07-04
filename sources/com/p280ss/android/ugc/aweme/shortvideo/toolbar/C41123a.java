package com.p280ss.android.ugc.aweme.shortvideo.toolbar;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44779b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.toolbar.a */
public final class C41123a {

    /* renamed from: a */
    public static final C41123a f107002a = new C41123a();

    /* renamed from: b */
    private static int f107003b;

    /* renamed from: c */
    private static DmtTextView f107004c;

    /* renamed from: d */
    private static final Map<Integer, Integer> f107005d = new LinkedHashMap();

    private C41123a() {
    }

    /* renamed from: a */
    public static void m131307a() {
        f107004c = null;
    }

    /* renamed from: a */
    public static int m131306a(Context context, boolean z, List<? extends C44779b> list) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(list, "itemList");
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        for (C44779b a : list) {
            i = i + m131305a(context, z, a) + C23486n.m77122a(12.0d);
            if (i >= f107003b) {
                return f107003b;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static int m131305a(Context context, boolean z, C44779b bVar) {
        int i;
        int a = C23486n.m77122a(32.0d);
        if (!z) {
            return a;
        }
        int i2 = 0;
        if (f107005d.containsKey(Integer.valueOf(bVar.f115198g))) {
            Integer num = (Integer) f107005d.get(Integer.valueOf(bVar.f115198g));
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (i > 0) {
                Object obj = f107005d.get(Integer.valueOf(bVar.f115198g));
                if (obj == null) {
                    C7573i.m23580a();
                }
                return ((Number) obj).intValue();
            }
        }
        if (f107004c == null) {
            View inflate = View.inflate(context, R.layout.b47, null);
            if (inflate != null) {
                DmtTextView dmtTextView = (DmtTextView) inflate;
                f107004c = dmtTextView;
                if (dmtTextView == null) {
                    C7573i.m23580a();
                }
                dmtTextView.setLayoutParams(new LayoutParams(C23486n.m77122a(40.0d), -2));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
            }
        }
        DmtTextView dmtTextView2 = f107004c;
        if (dmtTextView2 != null) {
            try {
                dmtTextView2.setText(bVar.f115198g);
            } catch (Exception unused) {
                dmtTextView2.setText("");
            }
            dmtTextView2.measure(MeasureSpec.makeMeasureSpec(C23486n.m77122a(40.0d), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
            i2 = dmtTextView2.getMeasuredHeight();
        }
        int i3 = a + i2;
        f107005d.put(Integer.valueOf(bVar.f115198g), Integer.valueOf(i3));
        return i3;
    }

    /* renamed from: a */
    public static int m131304a(Context context, List<? extends C44779b> list, int i, boolean z) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(list, "recordToolbarData");
        if (f107003b > 0) {
            return f107003b;
        }
        int i2 = 0;
        int i3 = 6;
        for (C44779b bVar : list) {
            i3--;
            if (i3 >= 0) {
                i2 = i2 + m131305a(context, z, bVar) + C23486n.m77122a(12.0d);
            }
        }
        int a = i2 + C23486n.m77122a(16.0d);
        f107003b = a;
        return a;
    }
}
