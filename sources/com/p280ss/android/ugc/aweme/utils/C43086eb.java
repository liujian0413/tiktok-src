package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.eb */
public final class C43086eb {

    /* renamed from: a */
    public static TypedValue f111703a = new TypedValue();

    /* renamed from: b */
    public static DisplayMetrics f111704b;

    /* renamed from: c */
    public static final C43087a f111705c = new C43087a(null);

    /* renamed from: com.ss.android.ugc.aweme.utils.eb$a */
    public static final class C43087a {
        private C43087a() {
        }

        /* renamed from: a */
        public static boolean m136684a(int i, int i2) {
            return i2 <= 0 || i <= 0;
        }

        public /* synthetic */ C43087a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static int m136682a(Context context) {
            if (C9738o.m28691a(C6399b.m19921a()) >= 1080) {
                return 1080;
            }
            return 720;
        }

        /* renamed from: b */
        private static void m136686b(Context context) {
            if (C43086eb.f111704b == null) {
                Resources resources = context.getResources();
                C7573i.m23582a((Object) resources, "context.resources");
                C43086eb.f111704b = resources.getDisplayMetrics();
            }
        }

        /* renamed from: a */
        public final int[] mo104750a(View view) {
            C7573i.m23587b(view, "view");
            return m136685a(view, 0, 0);
        }

        /* renamed from: a */
        public static int m136683a(Context context, int i) {
            C7573i.m23587b(context, "context");
            context.getResources().getValue(i, C43086eb.f111703a, true);
            return (int) TypedValue.complexToFloat(C43086eb.f111703a.data);
        }

        /* renamed from: a */
        private static float m136681a(int i, float f, DisplayMetrics displayMetrics) {
            switch (i) {
                case 0:
                    if (displayMetrics == null) {
                        C7573i.m23580a();
                    }
                    return f / displayMetrics.density;
                case 1:
                    return f;
                default:
                    return 0.0f;
            }
        }

        /* renamed from: a */
        private int[] m136685a(View view, int i, int i2) {
            int i3;
            int i4;
            C7573i.m23587b(view, "view");
            if (m136684a(0, 0)) {
                int measuredHeight = view.getMeasuredHeight();
                int measuredWidth = view.getMeasuredWidth();
                if (m136684a(measuredWidth, measuredHeight)) {
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        i3 = layoutParams.width;
                        i4 = layoutParams.height;
                    }
                }
                int i5 = measuredWidth;
                i4 = measuredHeight;
                i3 = i5;
            } else {
                i3 = 0;
                i4 = 0;
            }
            C43087a aVar = this;
            return new int[]{(int) aVar.mo104749a(view.getContext(), 0, (float) i3), (int) aVar.mo104749a(view.getContext(), 0, (float) i4)};
        }

        /* renamed from: a */
        public final float mo104749a(Context context, int i, float f) {
            if (context == null) {
                return f;
            }
            m136686b(context);
            float a = m136681a(i, f, C43086eb.f111704b);
            DisplayMetrics displayMetrics = C43086eb.f111704b;
            if (displayMetrics == null) {
                C7573i.m23580a();
            }
            float f2 = 3.0f;
            if (displayMetrics.density < 3.0f) {
                f2 = 2.0f;
            }
            return (a * f2) + 0.5f;
        }
    }

    /* renamed from: a */
    public static final float m136676a(Context context, int i, float f) {
        return f111705c.mo104749a(context, 1, f);
    }

    /* renamed from: a */
    public static final int m136677a(Context context) {
        return C43087a.m136682a(context);
    }

    /* renamed from: a */
    public static final int m136678a(Context context, int i) {
        return C43087a.m136683a(context, (int) R.dimen.gi);
    }

    /* renamed from: a */
    public static final boolean m136679a(int i, int i2) {
        return C43087a.m136684a(0, 0);
    }

    /* renamed from: a */
    public static final int[] m136680a(View view) {
        return f111705c.mo104750a(view);
    }
}
