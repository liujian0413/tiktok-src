package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer;

import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.experiment.MTMaskLayerStyleExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.a */
public final class C28927a {

    /* renamed from: a */
    public static int f76261a = -1;

    /* renamed from: b */
    public static int f76262b;

    /* renamed from: c */
    public static final boolean f76263c;

    /* renamed from: d */
    public static final C28928a f76264d = new C28928a(null);

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.a$a */
    public static final class C28928a {
        private C28928a() {
        }

        /* renamed from: a */
        public static int m95142a() {
            return C28927a.f76262b;
        }

        /* renamed from: b */
        public static boolean m95144b() {
            return C28927a.f76263c;
        }

        public /* synthetic */ C28928a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final int mo74223a(View view) {
            C7573i.m23587b(view, "itemView");
            if (C28927a.f76261a == -1) {
                C28927a.f76261a = (int) m95143b(view);
            }
            return C28927a.f76261a;
        }

        /* renamed from: b */
        private static double m95143b(View view) {
            int i;
            View findViewById = view.findViewById(R.id.d4a);
            if (findViewById != null) {
                TextPaint paint = ((TextView) findViewById).getPaint();
                int b = C23482j.m77098b(view.getContext());
                int a = C23486n.m77122a(85.0d);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(R.string.dkz));
                arrayList.add(Integer.valueOf(R.string.e1m));
                arrayList.add(Integer.valueOf(R.string.dis));
                Iterable<Number> iterable = arrayList;
                Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable, 10));
                for (Number intValue : iterable) {
                    arrayList2.add(view.getContext().getString(intValue.intValue()));
                }
                Iterable<String> iterable2 = (List) arrayList2;
                Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable2, 10));
                for (String measureText : iterable2) {
                    arrayList3.add(Integer.valueOf((int) paint.measureText(measureText)));
                }
                Iterable<Number> iterable3 = (List) arrayList3;
                Collection arrayList4 = new ArrayList(C7525m.m23469a(iterable3, 10));
                for (Number intValue2 : iterable3) {
                    arrayList4.add(Integer.valueOf(intValue2.intValue() + a));
                }
                Integer num = (Integer) C7525m.m23524n((List) arrayList4);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                double d = (double) i;
                double d2 = (double) b;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                if (d3 > 0.77d) {
                    d3 = 0.77d;
                } else if (d3 < 0.66d) {
                    d3 = 0.66d;
                }
                Double.isNaN(d2);
                return d2 * d3;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    static {
        int i;
        if (f76263c) {
            i = C23486n.m77122a(35.0d);
        } else {
            i = C23486n.m77122a(70.0d);
        }
        f76262b = i;
        boolean z = true;
        if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(MTMaskLayerStyleExperiment.class, true, "enable_new_style_dislike", C6384b.m19835a().mo15295d().enable_new_style_dislike, 0) != 1) {
            z = false;
        }
        f76263c = z;
    }
}
