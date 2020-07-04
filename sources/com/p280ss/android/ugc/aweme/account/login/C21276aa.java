package com.p280ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.aa */
public final class C21276aa {

    /* renamed from: a */
    public static final C21276aa f57185a = new C21276aa();

    /* renamed from: b */
    private static final String f57186b = f57186b;

    private C21276aa() {
    }

    /* renamed from: a */
    public static boolean m71638a(Context context) {
        int i;
        if (VERSION.SDK_INT >= 17) {
            i = Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0);
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m71639b(Activity activity) {
        C7573i.m23587b(activity, "activity");
        Resources resources = activity.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: a */
    public static boolean m71637a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        Window window = activity.getWindow();
        C7573i.m23582a((Object) window, "activity.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C7573i.m23582a((Object) childAt, "vp.getChildAt(i)");
                if (childAt.getId() != -1) {
                    String str = f57186b;
                    Resources resources = activity.getResources();
                    View childAt2 = viewGroup.getChildAt(i);
                    C7573i.m23582a((Object) childAt2, "vp.getChildAt(i)");
                    if (C7573i.m23585a((Object) str, (Object) resources.getResourceEntryName(childAt2.getId()))) {
                        View childAt3 = viewGroup.getChildAt(i);
                        C7573i.m23582a((Object) childAt3, "vp.getChildAt(i)");
                        if (childAt3.getHeight() != 0) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
