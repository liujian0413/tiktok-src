package com.bytedance.jedi.ext.adapter;

import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.widget.Widget;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.ext.adapter.a */
public final class C11678a {
    /* renamed from: a */
    public static final Object m34219a(Object obj) {
        C7573i.m23587b(obj, "host");
        if ((obj instanceof Fragment) || (obj instanceof FragmentActivity)) {
            return obj;
        }
        if (obj instanceof Widget) {
            return ((Widget) obj).mo31589n();
        }
        if (obj instanceof JediViewHolder) {
            return m34219a(((JediViewHolder) obj).mo29227n());
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public static final FragmentActivity m34220b(Object obj) {
        C7573i.m23587b(obj, "host");
        if (obj instanceof Fragment) {
            FragmentActivity requireActivity = ((Fragment) obj).requireActivity();
            C7573i.m23582a((Object) requireActivity, "host.requireActivity()");
            return requireActivity;
        } else if (obj instanceof FragmentActivity) {
            return (FragmentActivity) obj;
        } else {
            if (obj instanceof Widget) {
                return m34220b(((Widget) obj).mo31589n());
            }
            if (obj instanceof JediViewHolder) {
                return m34220b(((JediViewHolder) obj).mo29227n());
            }
            throw new IllegalStateException();
        }
    }
}
