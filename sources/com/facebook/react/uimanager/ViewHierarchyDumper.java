package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.p280ss.android.socialbase.downloader.impls.C20318n;
import com.p280ss.android.ugc.aweme.tools.extract.C42323i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ViewHierarchyDumper {
    public static JSONObject toJSON(View view) throws JSONException {
        UiThreadUtil.assertOnUiThread();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C20318n.f54884f, view.getClass().getName());
        jSONObject.put(C42323i.f110089f, System.identityHashCode(view));
        Object tag = view.getTag();
        if (tag != null && (tag instanceof String)) {
            jSONObject.put("t", tag);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    jSONArray.put(i, toJSON(viewGroup.getChildAt(i)));
                }
                jSONObject.put("c", jSONArray);
            }
        }
        return jSONObject;
    }
}
