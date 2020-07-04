package com.p280ss.android.ugc.aweme.longvideonew.feature;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.b */
public final class C32795b {

    /* renamed from: a */
    public static final C32796a f85550a = new C32796a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.b$a */
    public static final class C32796a {
        private C32796a() {
        }

        public /* synthetic */ C32796a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C32798d m106153a(int i, int i2) {
            if (i > i2) {
                return new C32798d(i2, i);
            }
            return new C32798d(i, i2);
        }

        /* renamed from: a */
        private static void m106157a(View view, int i, int i2) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (marginLayoutParams.width != i || marginLayoutParams.height != i2 || VERSION.SDK_INT < 19) {
                    marginLayoutParams.width = i;
                    marginLayoutParams.height = i2;
                    view.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }

        /* renamed from: a */
        private static C32798d m106154a(int i, int i2, int i3, int i4) {
            double d = (double) i;
            double d2 = (double) i2;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double d4 = (double) i3;
            double d5 = (double) i4;
            Double.isNaN(d4);
            Double.isNaN(d5);
            if (d3 > d4 / d5) {
                Double.isNaN(d4);
                Double.isNaN(d2);
                double d6 = d4 * d2;
                Double.isNaN(d);
                i4 = (int) (d6 / d);
            } else {
                Double.isNaN(d5);
                Double.isNaN(d);
                double d7 = d5 * d;
                Double.isNaN(d2);
                i3 = (int) (d7 / d2);
            }
            return new C32798d(i3, i4);
        }

        /* renamed from: a */
        private C32798d m106155a(int i, int i2, int i3, int i4, boolean z) {
            if (!z) {
                return m106154a(i, i2, i3, i4);
            }
            double d = (double) i;
            double d2 = (double) i2;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d / d2 > 0.625d) {
                if (i <= 0 || i2 <= 0) {
                    i4 = i3;
                } else {
                    i4 = (i * i3) / i2;
                }
            } else if (i <= 0 || i2 <= 0) {
                i3 = i4;
            } else {
                i3 = (i2 * i4) / i;
            }
            return new C32798d(i4, i3);
        }

        /* renamed from: a */
        private void m106158a(View view, int i, int i2, int i3, int i4, boolean z) {
            C7573i.m23587b(view, "view");
            C32798d a = m106155a(i, i2, i3, i4, z);
            m106157a(view, a.f85553a, a.f85554b);
        }

        /* renamed from: a */
        public static void m106156a(Activity activity, View view, View view2, Video video, C32798d dVar, boolean z) {
            int i;
            int i2;
            int i3;
            C32798d dVar2 = dVar;
            C7573i.m23587b(dVar, "screenSize");
            if (activity != null && view != null && view2 != null) {
                C32796a aVar = C32795b.f85550a;
                int i4 = 0;
                if (video != null) {
                    i = video.getWidth();
                } else {
                    i = 0;
                }
                if (video != null) {
                    i2 = video.getHeight();
                } else {
                    i2 = 0;
                }
                aVar.m106158a(view, i, i2, dVar2.f85553a, dVar2.f85554b, z);
                C32796a aVar2 = C32795b.f85550a;
                if (video != null) {
                    i3 = video.getWidth();
                } else {
                    i3 = 0;
                }
                if (video != null) {
                    i4 = video.getHeight();
                }
                aVar2.m106158a(view2, i3, i4, dVar2.f85553a, dVar2.f85554b, z);
            }
        }
    }
}
