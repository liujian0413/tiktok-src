package com.p280ss.android.ugc.aweme.setting;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.au */
public final class C37575au {
    /* renamed from: a */
    public static void m120344a(int i, ViewGroup viewGroup) {
        if (viewGroup != null) {
            List a = C25789b.m84754a(i);
            if (!C6307b.m19566a((Collection<T>) a)) {
                List g = C25789b.m84761g();
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt != null) {
                        Object tag = childAt.getTag();
                        if (tag instanceof String) {
                            String str = (String) tag;
                            if (!TextUtils.isEmpty(str) && (!a.contains(str) || g.contains(str))) {
                                childAt.setVisibility(8);
                            }
                        }
                    }
                }
            }
        }
    }
}
