package com.p280ss.android.ugc.effectmanager.effect.model;

import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43733e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.ComposerHelper */
public class ComposerHelper {
    private static List<String> serverURLs;

    public static List<String> getServerUrls() {
        return serverURLs;
    }

    static {
        ArrayList arrayList = new ArrayList();
        serverURLs = arrayList;
        arrayList.add("https://sf1-hscdn-tos.pstatp.com/obj/ies.fe.effect/");
        serverURLs.add("https://sf3-hscdn-tos.pstatp.com/obj/ies.fe.effect/");
        serverURLs.add("https://sf6-hscdn-tos.pstatp.com/obj/ies.fe.effect/");
    }

    public static void setServerUrls(List<String> list) {
        serverURLs = list;
    }

    public static int versionCompare(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        if (i >= split.length || i >= split2.length) {
            return Integer.signum(split.length - split2.length);
        }
        return Integer.signum(Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i])));
    }

    public static ComposerNode parseComposerMaterial(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append(FilterModel.CONFIG_FILE);
        try {
            JSONArray jSONArray = new JSONObject(C43733e.m138600c(sb.toString())).getJSONObject("effect").getJSONArray("Link");
            if (jSONArray.length() <= 0) {
                return null;
            }
            String string = jSONArray.getJSONObject(0).getString("path");
            if (!jSONArray.getJSONObject(0).getString("type").toLowerCase().equals("composer")) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(File.separator);
            sb2.append(string);
            sb2.append("content.json");
            JSONObject jSONObject = new JSONObject(C43733e.m138600c(sb2.toString()));
            ComposerNode composerNode = new ComposerNode();
            composerNode.tag_name = "root";
            composerNode.UI_name = "Composer";
            composerNode.type = 4;
            JSONObject jSONObject2 = jSONObject.getJSONObject(C38347c.f99553h);
            composerNode.children = new ArrayList();
            JSONArray jSONArray2 = jSONObject2.getJSONArray("nodes");
            for (int i = 0; i < jSONArray2.length(); i++) {
                ComposerNode parseComposerNode = parseComposerNode(jSONArray2.getJSONObject(i), str2, str3);
                if (parseComposerNode != null) {
                    parseComposerNode.parent = composerNode;
                }
                composerNode.children.add(parseComposerNode);
            }
            return composerNode;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ComposerNode parseComposerNode(JSONObject jSONObject, String str, String str2) {
        try {
            ComposerNode composerNode = new ComposerNode();
            composerNode.type = jSONObject.getInt("type");
            composerNode.file = jSONObject.optString("file", "");
            StringBuilder sb = new StringBuilder("https://sf1-hscdn-tos.pstatp.com/obj/ies.fe.effect/");
            sb.append(jSONObject.optString("icon", null));
            composerNode.icon = sb.toString();
            composerNode.UI_name = jSONObject.optString("UI_name", null);
            composerNode.tag_name = jSONObject.getString("tag_name");
            composerNode.default_value = (float) jSONObject.optDouble("default_value", 0.0d);
            composerNode.min_value = (float) jSONObject.optDouble("min_value", 0.0d);
            composerNode.max_value = (float) jSONObject.optDouble("max_value", 0.0d);
            composerNode.switch_mode = jSONObject.optInt("switch_mode", 0);
            if (jSONObject.has("nodes")) {
                composerNode.children = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("nodes");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ComposerNode parseComposerNode = parseComposerNode(jSONArray.getJSONObject(i), str, str2);
                    if (parseComposerNode != null) {
                        parseComposerNode.parent = composerNode;
                        composerNode.children.add(parseComposerNode);
                    }
                }
                if (composerNode.children.size() == 0 || (composerNode.children.size() == 1 && ((ComposerNode) composerNode.children.get(0)).type == -1)) {
                    return null;
                }
            } else {
                List<String> serverUrls = getServerUrls();
                ArrayList arrayList = new ArrayList();
                for (String str3 : serverUrls) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(composerNode.file);
                    arrayList.add(sb2.toString());
                }
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(arrayList);
                urlModel.setUri(composerNode.file);
                Effect effect = new Effect();
                effect.setFileUrl(urlModel);
                effect.setId(composerNode.file);
                effect.setEffectId(composerNode.file);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(File.separator);
                sb3.append(effect.getId());
                sb3.append(".zip");
                effect.setZipPath(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(File.separator);
                sb4.append(effect.getId());
                effect.setUnzipPath(sb4.toString());
                composerNode.effect = effect;
                JSONObject optJSONObject = jSONObject.optJSONObject("extra_info");
                String str4 = "0";
                if (optJSONObject != null) {
                    str4 = optJSONObject.optString(C38347c.f99551f, "0");
                }
                if (versionCompare(str, str4) < 0) {
                    return null;
                }
            }
            return composerNode;
        } catch (Exception unused) {
            return null;
        }
    }
}
