package com.bytedance.ies.bullet.kit.p261rn.pkg.viewshot;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.support.p022v4.util.C0902i;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.C1642a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.util.Locale;
import java.util.Stack;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.viewshot.a */
public final class C10609a {

    /* renamed from: a */
    public static final Matrix f28436a = new Matrix();

    /* renamed from: a */
    public static String m31027a(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        if (findViewById != null) {
            return m31029a(findViewById);
        }
        StringBuilder sb = new StringBuilder("Activity [");
        sb.append(activity.getClass().getSimpleName());
        sb.append("] is not initialized yet. ");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m31029a(View view) {
        boolean z;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(VideoCacheReadBuffersizeExperiment.DEFAULT);
        sb.append("\n");
        Resources resources = view.getResources();
        Stack stack = new Stack();
        stack.push(C0902i.m3837a("", view));
        while (!stack.empty()) {
            C0902i iVar = (C0902i) stack.pop();
            View view2 = (View) iVar.f3155b;
            String str3 = (String) iVar.f3154a;
            if (stack.empty() || !str3.equals(((C0902i) stack.peek()).f3154a)) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            if (z) {
                str = "└── ";
            } else {
                str = "├── ";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            String simpleName = view2.getClass().getSimpleName();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append(simpleName);
            sb4.append(m31028a(resources, view2));
            sb.append(sb4.toString());
            sb.append("\n");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str3);
                    if (z) {
                        str2 = "    ";
                    } else {
                        str2 = "│   ";
                    }
                    sb5.append(str2);
                    stack.push(C0902i.m3837a(sb5.toString(), viewGroup.getChildAt(childCount)));
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m31030b(Resources resources, View view) {
        if (resources == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder(" / ");
            sb.append(resources.getResourceEntryName(view.getId()));
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static int m31026a(String str, String str2) {
        int i;
        int i2 = 0;
        while (str2.length() > 0) {
            int indexOf = str2.indexOf("\n");
            if (indexOf < 0) {
                i = C34943c.f91127w;
            } else {
                i = indexOf + 1;
            }
            int min = Math.min(str2.length(), Math.min(i, C34943c.f91127w));
            C1642a.m8035a(Locale.US, "%02d: %s", new Object[]{Integer.valueOf(i2), str2.substring(0, min)});
            str2 = str2.substring(min);
            i2++;
        }
        return i2;
    }

    /* renamed from: a */
    private static String m31028a(Resources resources, View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(" id=");
        sb.append(view.getId());
        sb.append(m31030b(resources, view));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            sb.append(", V--");
        } else if (visibility == 4) {
            sb.append(", -I-");
        } else if (visibility != 8) {
            sb.append(", ---");
        } else {
            sb.append(", --G");
        }
        if (!view.getMatrix().equals(f28436a)) {
            sb.append(", matrix=");
            sb.append(view.getMatrix().toShortString());
            if (!(0.0f == view.getRotation() && 0.0f == view.getRotationX() && 0.0f == view.getRotationY())) {
                sb.append(", rotate=[");
                sb.append(view.getRotation());
                sb.append(",");
                sb.append(view.getRotationX());
                sb.append(",");
                sb.append(view.getRotationY());
                sb.append("]");
                if (!(((float) (view.getWidth() / 2)) == view.getPivotX() && ((float) (view.getHeight() / 2)) == view.getPivotY())) {
                    sb.append(", pivot=[");
                    sb.append(view.getPivotX());
                    sb.append(",");
                    sb.append(view.getPivotY());
                    sb.append("]");
                }
            }
            if (!(0.0f == view.getTranslationX() && 0.0f == view.getTranslationY() && 0.0f == view.getTranslationZ())) {
                sb.append(", translate=[");
                sb.append(view.getTranslationX());
                sb.append(",");
                sb.append(view.getTranslationY());
                sb.append(",");
                sb.append(view.getTranslationZ());
                sb.append("]");
            }
            if (!(1.0f == view.getScaleX() && 1.0f == view.getScaleY())) {
                sb.append(", scale=[");
                sb.append(view.getScaleX());
                sb.append(",");
                sb.append(view.getScaleY());
                sb.append("]");
            }
        }
        if (!(view.getPaddingStart() == 0 && view.getPaddingTop() == 0 && view.getPaddingEnd() == 0 && view.getPaddingBottom() == 0)) {
            sb.append(", padding=[");
            sb.append(view.getPaddingStart());
            sb.append(",");
            sb.append(view.getPaddingTop());
            sb.append(",");
            sb.append(view.getPaddingEnd());
            sb.append(",");
            sb.append(view.getPaddingBottom());
            sb.append("]");
        }
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (!(marginLayoutParams.leftMargin == 0 && marginLayoutParams.topMargin == 0 && marginLayoutParams.rightMargin == 0 && marginLayoutParams.bottomMargin == 0)) {
                sb.append(", margin=[");
                sb.append(marginLayoutParams.leftMargin);
                sb.append(",");
                sb.append(marginLayoutParams.topMargin);
                sb.append(",");
                sb.append(marginLayoutParams.rightMargin);
                sb.append(",");
                sb.append(marginLayoutParams.bottomMargin);
                sb.append("]");
            }
        }
        sb.append(", position=[");
        sb.append(view.getLeft());
        sb.append(",");
        sb.append(view.getTop());
        sb.append("]");
        sb.append(", size=[");
        sb.append(view.getWidth());
        sb.append(",");
        sb.append(view.getHeight());
        sb.append("]");
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            sb.append(", text=\"");
            sb.append(textView.getText());
            sb.append("\"");
        }
        return sb.toString();
    }
}
