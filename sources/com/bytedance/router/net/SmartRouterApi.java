package com.bytedance.router.net;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.util.Logger;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SmartRouterApi {
    private static String ROUTER_CONFIG_URL = "https://lf.snssdk.com/smart_router/config";
    private static String ROUTER_REPORT_URL = "https://lf.snssdk.com/smart_router/report";
    private static Map<String, String> sCommonParams;

    public static class ApiResult<T> {
        public int errorCode = -1;
        public T result;
    }

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m36450x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    private static Map<String, String> getCommonParams(Context context) {
        if (sCommonParams != null) {
            return sCommonParams;
        }
        sCommonParams = new HashMap();
        try {
            sCommonParams.put("version_code", String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).versionCode));
            Bundle bundle = _lancet.m36450x89c42dc8(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData;
            if (bundle != null) {
                sCommonParams.put("update_version_code", String.valueOf(bundle.getInt("UPDATE_VERSION_CODE")));
            }
            sCommonParams.put("device_platform", "android");
            sCommonParams.put("os_api", String.valueOf(VERSION.SDK_INT));
        } catch (Exception unused) {
            sCommonParams = null;
        }
        return sCommonParams;
    }

    private static String getRouterConfigTag(Context context) {
        if (getCommonParams(context) == null) {
            return "";
        }
        String str = "";
        String str2 = (String) sCommonParams.get("version_code");
        String str3 = (String) sCommonParams.get("update_version_code");
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            str = sb.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("_");
            sb2.append(str2);
            str = sb2.toString();
        }
        return str;
    }

    public static ApiResult<RouterConfig> requestConfig(Context context, ServerParam serverParam) {
        ApiResult<RouterConfig> apiResult = new ApiResult<>();
        Map commonParams = getCommonParams(context);
        if (commonParams == null) {
            Logger.m36454e("SmartRouterApi#requestConfig commonParams is null!!!");
            return apiResult;
        } else if (serverParam == null) {
            Logger.m36454e("SmartRouterApi#requestConfig serverParam is null!!!");
            return apiResult;
        } else {
            commonParams.put("aid", String.valueOf(serverParam.getAid()));
            commonParams.put("device_id", String.valueOf(serverParam.getDeviceId()));
            commonParams.put("channel", String.valueOf(serverParam.getChannel()));
            NetResponse netResponse = NetClient.get(ROUTER_CONFIG_URL, commonParams);
            if (netResponse == null) {
                return apiResult;
            }
            if (netResponse.errorCode == 200) {
                try {
                    JSONObject jSONObject = new JSONObject(netResponse.content);
                    apiResult.errorCode = jSONObject.optInt("errorCode");
                    if (apiResult.errorCode == 0) {
                        String routerConfigTag = getRouterConfigTag(context);
                        if (!TextUtils.isEmpty(routerConfigTag)) {
                            apiResult.result = new RouterConfig(routerConfigTag);
                            ((RouterConfig) apiResult.result).setIncMapping(RouterConfig.parseJsonArray(jSONObject.optJSONArray("mapping")));
                            ((RouterConfig) apiResult.result).setRewriteMapping(RouterConfig.parseJsonArray(jSONObject.optJSONArray("rewrite")));
                            apiResult.errorCode = 0;
                        }
                        if (Logger.isDebug()) {
                            StringBuilder sb = new StringBuilder("SmartRouterApi#requestConfig success, content: ");
                            sb.append(jSONObject.toString());
                            Logger.m36452d(sb.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            } else {
                apiResult.errorCode = netResponse.errorCode;
            }
            return apiResult;
        }
    }

    public static boolean reportRouterConfig(Context context, ServerParam serverParam, RouterConfig routerConfig) {
        boolean z;
        ApiResult apiResult = new ApiResult();
        Map commonParams = getCommonParams(context);
        if (commonParams == null) {
            Logger.m36454e("SmartRouterApi#reportRouterConfig commonParams is null!!!");
            return false;
        } else if (serverParam == null) {
            Logger.m36454e("SmartRouterApi#reportRouterConfig serverParam is null!!!");
            return false;
        } else if (routerConfig == null || (routerConfig.getIncMapping().isEmpty() && routerConfig.getRewriteMapping().isEmpty())) {
            Logger.m36452d("SmartRouterApi#reportRouterConfig there is no need to report.");
            return true;
        } else {
            commonParams.put("aid", String.valueOf(serverParam.getAid()));
            commonParams.put("device_id", String.valueOf(serverParam.getDeviceId()));
            commonParams.put("channel", String.valueOf(serverParam.getChannel()));
            JSONObject jSONObject = new JSONObject();
            if (routerConfig != null) {
                JSONArray jSONArray = new JSONArray();
                try {
                    if (routerConfig.getIncMapping() != null) {
                        for (Entry entry : routerConfig.getIncMapping().entrySet()) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("schema", entry.getKey());
                            jSONObject2.put("target", entry.getValue());
                            jSONObject2.put("type", 1);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    if (routerConfig.getRewriteMapping() != null) {
                        for (Entry entry2 : routerConfig.getRewriteMapping().entrySet()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("schema", entry2.getKey());
                            jSONObject3.put("target", entry2.getValue());
                            jSONObject3.put("type", 2);
                            jSONArray.put(jSONObject3);
                        }
                    }
                    jSONObject.put("route", jSONArray);
                } catch (JSONException unused) {
                }
            }
            NetResponse post = NetClient.post(ROUTER_REPORT_URL, commonParams, jSONObject);
            if (200 == post.errorCode) {
                try {
                    apiResult.errorCode = new JSONObject(post.content).optInt("errorCode");
                } catch (Exception unused2) {
                }
            } else {
                apiResult.errorCode = post.errorCode;
            }
            StringBuilder sb = new StringBuilder("SmartRouterApi#reportRouterConfig result: ");
            if (apiResult.errorCode == 0) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            Logger.m36452d(sb.toString());
            if (apiResult.errorCode == 0) {
                return true;
            }
            return false;
        }
    }
}
