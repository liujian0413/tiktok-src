package com.bytedance.android.livesdk.log.alog;

import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.log.alog.a */
public class C8427a {

    /* renamed from: a */
    private static volatile C8427a f23044a;

    /* renamed from: b */
    private static final C8444d f23045b = C8444d.m25673b();

    /* renamed from: a */
    public final void mo21578a(String str, String str2, int i, Map map) {
        mo21579a(str, str2, i, m25628a(map));
    }

    /* renamed from: a */
    public final void mo21579a(String str, String str2, int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject a = m25627a(jSONObject.toString());
            if (a != null) {
                m25630a(a, "service", str2);
                m25629a(a, "status_code", i);
                f23045b.mo10002b(str, a);
            }
        }
    }

    /* renamed from: a */
    public static C8427a m25623a() {
        if (f23044a == null) {
            synchronized (C8427a.class) {
                if (f23044a == null) {
                    f23044a = new C8427a();
                }
            }
        }
        return f23044a;
    }

    /* renamed from: a */
    private static JSONObject m25627a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m25633d(View view) {
        if (view != null) {
            return (String) view.getContentDescription();
        }
        return "";
    }

    /* renamed from: b */
    private static String m25631b(View view) {
        if (view instanceof TextView) {
            return ((TextView) view).getText().toString();
        }
        return "";
    }

    /* renamed from: c */
    private static String m25632c(View view) {
        Object obj;
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = "";
        }
        if (obj == null) {
            return "";
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    private static String m25625a(View view) {
        String str;
        String str2 = "";
        if (view == null || view.getId() <= 0 || view.getContext() == null) {
            return str2;
        }
        try {
            StringBuilder sb = new StringBuilder("R.id.");
            sb.append(view.getContext().getResources().getResourceEntryName(view.getId()));
            str = sb.toString();
        } catch (Exception unused) {
            str = "";
        }
        return str;
    }

    /* renamed from: a */
    private static JSONObject m25628a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private String m25624a(int i, ViewGroup viewGroup) {
        StringBuffer stringBuffer = new StringBuffer();
        if (viewGroup == null) {
            return stringBuffer.toString();
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            stringBuffer.append("|index:");
            stringBuffer.append(i);
            stringBuffer.append(i2);
            String b = m25631b(childAt);
            if (!TextUtils.isEmpty(b)) {
                stringBuffer.append("|text:");
                stringBuffer.append(b);
            }
            if (!TextUtils.isEmpty(m25632c(childAt))) {
                stringBuffer.append("|tag:");
                stringBuffer.append(b);
            }
            String d = m25633d(childAt);
            if (!TextUtils.isEmpty(d)) {
                stringBuffer.append("|description:");
                stringBuffer.append(d);
            }
            if (childAt instanceof ViewGroup) {
                stringBuffer.append(m25624a(i2, (ViewGroup) childAt));
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private Map<String, String> m25626a(View view, String str) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("type", "action");
            hashMap.put("action", str);
            if (view == null) {
                return hashMap;
            }
            hashMap.put("class_name", view.toString());
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = true;
            String str2 = (String) view.getTag(-16777215);
            if (str2 != null) {
                stringBuffer.append("page_name:");
                stringBuffer.append(str2);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (parent.getParent() == null || !(parent instanceof View) || !TextUtils.isEmpty(str2)) {
                    break;
                }
                View view2 = (View) parent;
                if (view2.getTag(-16777215) != null) {
                    String str3 = (String) view2.getTag(-16777215);
                    stringBuffer.append("page_name:");
                    stringBuffer.append(str3);
                    break;
                }
                parent = parent.getParent();
            }
            JSONObject jSONObject = new JSONObject();
            String a = m25625a(view);
            if (!TextUtils.isEmpty(a)) {
                hashMap.put("id", a);
                stringBuffer.append("|id:");
                stringBuffer.append(a);
                z = false;
            }
            if (view.getParent() != null) {
                if (view.getParent() instanceof RecyclerView) {
                    int indexOfChild = ((RecyclerView) view.getParent()).indexOfChild(view);
                    stringBuffer.append("|RecyclerView|position:");
                    stringBuffer.append(indexOfChild);
                    m25629a(jSONObject, "position", indexOfChild);
                    if (view instanceof ViewGroup) {
                        m25630a(jSONObject, "children_info", m25624a(0, (ViewGroup) view));
                    }
                } else if (view.getParent() instanceof ListView) {
                    int indexOfChild2 = ((ListView) view.getParent()).indexOfChild(view);
                    stringBuffer.append("|ListView|position:");
                    stringBuffer.append(indexOfChild2);
                    m25629a(jSONObject, "position", indexOfChild2);
                    if (view instanceof ViewGroup) {
                        m25630a(jSONObject, "children_info", m25624a(0, (ViewGroup) view));
                    }
                }
            }
            String b = m25631b(view);
            if (!TextUtils.isEmpty(b)) {
                m25630a(jSONObject, "text", b);
                stringBuffer.append("|text:");
                stringBuffer.append(b);
                z = false;
            }
            String c = m25632c(view);
            if (!TextUtils.isEmpty(c)) {
                m25630a(jSONObject, "tag", c);
                stringBuffer.append("|tag:");
                stringBuffer.append(c);
                z = false;
            }
            String d = m25633d(view);
            if (!TextUtils.isEmpty(d)) {
                m25630a(jSONObject, "description", d);
                stringBuffer.append("|description:");
                stringBuffer.append(d);
                z = false;
            }
            if (jSONObject.length() > 0) {
                z = false;
            }
            if (z && (view instanceof ViewGroup)) {
                m25630a(jSONObject, "children_info", m25624a(0, (ViewGroup) view));
            }
            hashMap.put("params", jSONObject.toString());
            hashMap.put("path", stringBuffer.toString());
            return hashMap;
        } catch (Throwable unused) {
            return hashMap;
        }
    }

    /* renamed from: a */
    public final void mo21577a(LiveVerticalViewPager liveVerticalViewPager, int i) {
        if (liveVerticalViewPager != null && i != -1) {
            JSONObject a = m25628a(m25626a((View) liveVerticalViewPager, "ViewPage#onPageSelected()"));
            m25629a(a, "position", i);
            m25630a(a, "description", "room scroll change");
            f23045b.mo10002b(TTLiveALogTag.Page.info, a);
        }
    }

    /* renamed from: a */
    private static void m25629a(JSONObject jSONObject, String str, int i) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, i);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m25630a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (Exception unused) {
            }
        }
    }
}
