package com.bytedance.router.dynamic;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.util.Logger;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RouterConfig {
    private Map<String, String> mIncMapping = Collections.emptyMap();
    private Map<String, String> mRewriteMapping = Collections.emptyMap();
    private String mTag = "";

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m36447x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    public Map<String, String> getIncMapping() {
        return this.mIncMapping;
    }

    public Map<String, String> getRewriteMapping() {
        return this.mRewriteMapping;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", this.mTag);
            JSONArray jSONArray = new JSONArray();
            for (Entry entry : this.mIncMapping.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append(",");
                sb.append((String) entry.getValue());
                jSONArray.put(sb.toString());
            }
            jSONObject.put("incMapping", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (Entry entry2 : this.mRewriteMapping.entrySet()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) entry2.getKey());
                sb2.append(",");
                sb2.append((String) entry2.getValue());
                jSONArray2.put(sb2.toString());
            }
            jSONObject.put("rewriteMapping", jSONArray2);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public static RouterConfig load(String str) {
        return parse(str);
    }

    public RouterConfig(String str) {
        this.mTag = str;
    }

    public void setIncMapping(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            this.mIncMapping = Collections.emptyMap();
        } else {
            this.mIncMapping = map;
        }
    }

    public void setRewriteMapping(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            this.mRewriteMapping = Collections.emptyMap();
        } else {
            this.mRewriteMapping = map;
        }
    }

    private static RouterConfig parse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            RouterConfig routerConfig = new RouterConfig(jSONObject.optString("tag"));
            routerConfig.setIncMapping(parseJsonArray(jSONObject.optJSONArray("incMapping")));
            routerConfig.setRewriteMapping(parseJsonArray(jSONObject.optJSONArray("rewriteMapping")));
            return routerConfig;
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("DynamicMapping#load failed: ");
            sb.append(str);
            Logger.m36454e(sb.toString());
            return null;
        }
    }

    public static Map<String, String> parseJsonArray(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String[] split = optString.split(",");
                if (split.length != 2) {
                    StringBuilder sb = new StringBuilder("DynamicMapping#parseJsonArray illegal schema mapping: ");
                    sb.append(optString);
                    Logger.m36454e(sb.toString());
                } else if (split[0] == null || split[1] == null) {
                    StringBuilder sb2 = new StringBuilder("DynamicMapping#parseJsonArray illegal schema mapping(null): ");
                    sb2.append(optString);
                    Logger.m36454e(sb2.toString());
                } else {
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    if (TextUtils.isEmpty(split[0]) || TextUtils.isEmpty(split[1])) {
                        StringBuilder sb3 = new StringBuilder("DynamicMapping#parseJsonArray illegal schema mapping empty: ");
                        sb3.append(optString);
                        Logger.m36454e(sb3.toString());
                    } else {
                        hashMap.put(split[0], split[1]);
                    }
                }
            }
        }
        return hashMap;
    }

    public static boolean isExpired(Context context, RouterConfig routerConfig) {
        String str;
        if (context == null || routerConfig == null) {
            return true;
        }
        String str2 = "";
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(packageInfo.versionCode);
            String sb2 = sb.toString();
            try {
                Bundle bundle = _lancet.m36447x89c42dc8(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData;
                if (bundle != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("_");
                    sb3.append(String.valueOf(bundle.getInt("UPDATE_VERSION_CODE")));
                    str = sb3.toString();
                    if (TextUtils.isEmpty(str) && str.equals(routerConfig.mTag)) {
                        return false;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            str = sb2;
        } catch (Exception unused2) {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }
}
