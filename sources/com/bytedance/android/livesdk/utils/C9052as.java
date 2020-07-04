package com.bytedance.android.livesdk.utils;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.utils.as */
public final class C9052as {

    /* renamed from: a */
    private static int f24716a;

    /* renamed from: a */
    private static boolean m27040a(View view) {
        if (view.getId() != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m27041b(View view) {
        if (view.getContext() == null || view.getContext().getResources() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        int i = f24716a;
        f24716a = i + 1;
        sb.append(i);
        if (view instanceof ProgressBar) {
            sb.append("#ProgressBar#");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static JSONObject m27038a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        JSONObject jSONObject = new JSONObject();
        if (m27040a((View) viewGroup)) {
            arrayList.add(Integer.valueOf(viewGroup.getId()));
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(m27041b(viewGroup), m27039a(viewGroup, arrayList, hashSet));
            jSONObject.put("view_info", jSONObject2);
            if (!C6307b.m19566a((Collection<T>) hashSet)) {
                jSONObject.put("repeat_id", TextUtils.join(", ", hashSet));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m27039a(ViewGroup viewGroup, List<Integer> list, HashSet<Integer> hashSet) {
        if (viewGroup == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", viewGroup.getId());
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (m27040a(childAt)) {
                    if (list.contains(Integer.valueOf(childAt.getId()))) {
                        hashSet.add(Integer.valueOf(childAt.getId()));
                    } else {
                        list.add(Integer.valueOf(childAt.getId()));
                    }
                }
                if (childAt instanceof ViewGroup) {
                    jSONObject.put(m27041b(childAt), m27039a((ViewGroup) childAt, list, hashSet));
                } else {
                    jSONObject.put(m27041b(childAt), String.valueOf(childAt.getId()));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
