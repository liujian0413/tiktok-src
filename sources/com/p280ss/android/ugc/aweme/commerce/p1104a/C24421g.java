package com.p280ss.android.ugc.aweme.commerce.p1104a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.vast.model.AdVerification;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25301by;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43734f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.g */
public final class C24421g {
    /* renamed from: e */
    private static AdVerification m80315e(Aweme aweme) {
        return C25301by.m83160i(aweme);
    }

    /* renamed from: a */
    public static String m80309a(Aweme aweme) {
        if (!m80316f(aweme)) {
            return "";
        }
        return m80315e(aweme).javascriptResource;
    }

    /* renamed from: b */
    public static String m80311b(Aweme aweme) {
        if (!m80316f(aweme)) {
            return "";
        }
        return m80315e(aweme).vender;
    }

    /* renamed from: c */
    public static String m80313c(Aweme aweme) {
        if (!m80316f(aweme)) {
            return "";
        }
        return m80315e(aweme).verificationParameters;
    }

    /* renamed from: d */
    public static String m80314d(Aweme aweme) {
        StringBuilder sb = new StringBuilder();
        sb.append(m80309a(aweme));
        sb.append(m80311b(aweme));
        sb.append(m80313c(aweme));
        return C43734f.m138605a(sb.toString());
    }

    /* renamed from: f */
    private static boolean m80316f(Aweme aweme) {
        if (!C25352e.m83221d(aweme) || aweme.getAwemeRawAd().getOmVast() == null || m80315e(aweme) == null || C25301by.m83160i(aweme) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m80312b(View view, int i, int i2) {
        if (((float) view.getHeight()) <= ((float) i) * 0.8f || ((float) view.getWidth()) <= ((float) i2) * 0.8f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<View> m80310a(View view, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (m80312b(view, i, i2)) {
            arrayList.add(view);
        }
        if (!(view instanceof ViewGroup)) {
            return arrayList;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (m80312b(view, i, i2)) {
                arrayList.add(childAt);
            }
            arrayList.addAll(m80310a(childAt, i, i2));
        }
        return arrayList;
    }
}
