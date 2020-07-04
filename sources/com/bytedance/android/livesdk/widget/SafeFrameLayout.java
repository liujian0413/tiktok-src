package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.p148d.C3168a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.utils.C9052as;
import org.json.JSONObject;

public class SafeFrameLayout extends FrameLayout {
    public SafeFrameLayout(Context context) {
        super(context);
    }

    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        try {
            super.restoreHierarchyState(sparseArray);
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            C3168a.m11984a(jSONObject, "error_msg", e.toString());
            JSONObject a = C9052as.m27038a((ViewGroup) this);
            C3168a.m11985a(jSONObject, "dump", a);
            int i = 0;
            if (a.optJSONObject("repeat_id") != null) {
                i = 1;
            }
            C3172e.m12002a("ttlive_xg_restore_dump", i, jSONObject);
        }
    }

    public SafeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SafeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
