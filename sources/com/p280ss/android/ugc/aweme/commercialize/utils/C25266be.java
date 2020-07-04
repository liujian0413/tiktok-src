package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.be */
public final class C25266be {
    /* renamed from: a */
    public static boolean m83036a(Intent intent) {
        if (intent == null || !TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m83035a(Intent intent, Intent intent2) {
        if (intent != null) {
            intent2.setAction(intent.getAction());
        }
    }

    /* renamed from: b */
    public static void m83037b(Intent intent, Intent intent2) {
        if (intent != null) {
            Set<String> categories = intent.getCategories();
            if (!C6307b.m19566a((Collection<T>) categories)) {
                for (String addCategory : categories) {
                    intent2.addCategory(addCategory);
                }
            }
        }
    }
}
