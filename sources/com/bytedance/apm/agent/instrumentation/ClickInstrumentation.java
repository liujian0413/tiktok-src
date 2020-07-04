package com.bytedance.apm.agent.instrumentation;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.monitor.MonitorTool;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

public class ClickInstrumentation {
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
                    if (text != null) {
                        String charSequence = text.toString();
                        if (charSequence.length() > 100) {
                            charSequence = charSequence.substring(0, 100);
                        }
                        jSONObject.put(VIEW_TEXT, charSequence);
                    }
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
                if (view.getTag(-16777215) != null && !TextUtils.isEmpty(view.getTag(-16777215).toString())) {
                    jSONObject.put("view_tag_1", view.getTag(-16777215).toString());
                }
                if (view.getTag(-16777214) != null && !TextUtils.isEmpty(view.getTag(-16777214).toString())) {
                    jSONObject.put("view_tag_2", view.getTag(-16777214).toString());
                }
                if (view.getTag(-16777213) != null && (view.getTag(-16777213) instanceof Map)) {
                    for (Entry entry : ((Map) view.getTag(-16777213)).entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        StringBuilder sb2 = new StringBuilder("view_tag_map_");
                        sb2.append(key.toString());
                        jSONObject.put(sb2.toString(), value.toString());
                    }
                }
                jSONObject.put(CLICK_TYPE, "View#OnClick");
                MonitorTool.monitorUIAction(ACTION_NAME, "", jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
