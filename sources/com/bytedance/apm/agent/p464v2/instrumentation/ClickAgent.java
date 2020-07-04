package com.bytedance.apm.agent.p464v2.instrumentation;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.monitor.MonitorTool;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.agent.v2.instrumentation.ClickAgent */
public class ClickAgent {
    private static final String ACTION_NAME = "view_click";
    private static final String CLICK_TYPE = "click_type";
    private static final String VIEW_ID = "view_id";
    private static final String VIEW_NAME = "view_name";
    private static final String VIEW_TEXT = "view_text";
    private static final int VIEW_TEXT_LENGTH_LIMIT = 100;

    public static void onTabChanged(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VIEW_NAME, str);
            jSONObject.put(CLICK_TYPE, "TabHost#OnTabChanged");
            MonitorTool.monitorUIAction(ACTION_NAME, "", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static void onClick(View view) {
        if (view != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                Resources resources = view.getContext().getResources();
                if (view.getId() != -1) {
                    jSONObject.put(VIEW_ID, view.getId());
                    jSONObject.put(VIEW_NAME, resources.getResourceEntryName(view.getId()));
                }
                if (view instanceof TextView) {
                    CharSequence text = ((TextView) view).getText();
                    if (text.length() > 100) {
                        text = text.subSequence(0, 100);
                    }
                    jSONObject.put(VIEW_TEXT, text);
                }
                if (view.getParent() != null) {
                    String simpleName = view.getParent().getClass().getSimpleName();
                    if (view.getParent().getParent() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(view.getParent().getParent().getClass().getSimpleName());
                        sb.append("#");
                        sb.append(simpleName);
                        sb.append("#");
                        sb.append(view.getClass().getSimpleName());
                        simpleName = sb.toString();
                    }
                    jSONObject.put("view_path", simpleName);
                }
                jSONObject.put(CLICK_TYPE, "View#OnClick");
                MonitorTool.monitorUIAction(ACTION_NAME, "", jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
