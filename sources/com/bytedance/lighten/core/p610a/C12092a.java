package com.bytedance.lighten.core.p610a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lighten.core.a.a */
public class C12092a {

    /* renamed from: a */
    public List<String> f32193a = new ArrayList();

    /* renamed from: a */
    public final boolean mo29784a() {
        if (this.f32193a == null || this.f32193a.isEmpty()) {
            return true;
        }
        return false;
    }

    public C12092a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    this.f32193a.add(str);
                }
            }
        }
    }
}
