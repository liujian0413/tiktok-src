package com.p280ss.android.ugc.aweme.longvideo.p1375b;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.b.c */
public final class C32724c {

    /* renamed from: a */
    public static final float f85304a = 0.625f;

    /* renamed from: b */
    public static final C32725a f85305b = new C32725a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.c$a */
    public static final class C32725a {
        private C32725a() {
        }

        public /* synthetic */ C32725a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        public static C32726d m105938b(int i, int i2) {
            if (i > i2) {
                return new C32726d(i2, i);
            }
            return new C32726d(i, i2);
        }

        /* renamed from: a */
        public static boolean m105937a(int i, int i2) {
            double d = (double) i;
            double d2 = (double) i2;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d / d2 > ((double) C32724c.f85304a)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private static void m105935a(View view, int i, int i2) {
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
        private static C32726d m105932a(int i, int i2, int i3, int i4) {
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
            return new C32726d(i3, i4);
        }

        /* renamed from: a */
        private C32726d m105933a(int i, int i2, int i3, int i4, boolean z) {
            if (!z) {
                return m105932a(i, i2, i3, i4);
            }
            double d = (double) i;
            double d2 = (double) i2;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d / d2 > ((double) C32724c.f85304a)) {
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
            return new C32726d(i4, i3);
        }

        /* renamed from: a */
        private void m105936a(View view, int i, int i2, int i3, int i4, boolean z) {
            C7573i.m23587b(view, "view");
            C32726d a = m105933a(i, i2, i3, i4, z);
            m105935a(view, a.f85306a, a.f85307b);
        }

        /* renamed from: a */
        public static void m105934a(Activity activity, View view, View view2, Video video, C32726d dVar, boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            C32726d dVar2 = dVar;
            Activity activity2 = activity;
            C7573i.m23587b(activity, "activity");
            View view3 = view;
            C7573i.m23587b(view, "mVideoView");
            View view4 = view2;
            C7573i.m23587b(view2, "mCover");
            C7573i.m23587b(dVar, "screenSize");
            C32725a aVar = C32724c.f85305b;
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
            aVar.m105936a(view, i, i2, dVar2.f85306a, dVar2.f85307b, z);
            C32725a aVar2 = C32724c.f85305b;
            if (video != null) {
                i3 = video.getWidth();
            } else {
                i3 = 0;
            }
            if (video != null) {
                i4 = video.getHeight();
            } else {
                i4 = 0;
            }
            aVar2.m105936a(view2, i3, i4, dVar2.f85306a, dVar2.f85307b, z);
        }
    }
}
