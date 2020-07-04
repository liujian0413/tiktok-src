package com.p280ss.android.ugc.aweme.services;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12464d;
import com.bytedance.retrofit2.p637a.C12465e;
import com.google.gson.C6600e;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.internal.LinkedTreeMap;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.commerce.model.C24430a;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.p1049ay.C23142a;
import com.p280ss.android.ugc.aweme.p1076c.p1077a.C23623a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.AbsApiMonitorService */
public abstract class AbsApiMonitorService {
    public static final Companion Companion = new Companion(null);
    private static final C6600e GSON = new C6600e();
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.services.AbsApiMonitorService$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean filter(String str, Object obj);

    public final void addALog(String str, C12534t<?> tVar) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(tVar, "res");
        try {
            C23623a.m77525a(str, tVar.mo30511b());
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void checkApiFailedAndMonitor(String str, C12534t<?> tVar) {
        List<C12461b> list;
        C7573i.m23587b(str, "url");
        C7573i.m23587b(tVar, "res");
        T t = tVar.f33302b;
        if (tVar.mo30512c()) {
            C7573i.m23582a((Object) t, "body");
            if (!checkApiSuccess(str, t)) {
                String str2 = "";
                if (t instanceof C6866d) {
                    str2 = ((C6866d) t).getRequestId();
                }
                if (TextUtils.isEmpty(str2)) {
                    C12464d dVar = tVar.f33301a;
                    if (dVar != null) {
                        list = dVar.mo30452b("X-TT-LOGID");
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        for (C12461b bVar : list) {
                            C7573i.m23582a((Object) bVar, "it");
                            str2 = bVar.f33096b;
                            TextUtils.isEmpty(str2);
                        }
                    }
                }
                try {
                    String b = GSON.mo15979b((Object) t);
                    C7573i.m23582a((Object) b, "GSON.toJson(body)");
                    apiMonitor(str, str2, b);
                } catch (NoSuchMethodError unused) {
                }
            }
        }
    }

    private final boolean checkApiSuccess(String str, Object obj) {
        if (obj == null) {
            return false;
        }
        String str2 = null;
        if (obj instanceof String) {
            if (TextUtils.isEmpty((CharSequence) obj)) {
                return false;
            }
            if (!TextUtils.equals("musically", C6399b.m19930f()) && !TextUtils.equals("tiktok", C6399b.m19930f())) {
                CharSequence charSequence = "/aweme/v1/user/";
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    str2 = parse.getPath();
                }
                if (TextUtils.equals(charSequence, str2)) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) obj);
                        if ((jSONObject.has("status_code") && jSONObject.optInt("status_code") != 0) || !jSONObject.has("user")) {
                            return false;
                        }
                        JSONObject jSONObject2 = jSONObject.getJSONObject("user");
                        if (C7573i.m23585a(jSONObject2.opt("uid"), (Object) Integer.valueOf(0)) || TextUtils.isEmpty(jSONObject2.optString("nickname"))) {
                            return false;
                        }
                    } catch (Exception unused) {
                        return false;
                    }
                }
            }
            return true;
        } else if (obj instanceof BaseResponse) {
            BaseResponse baseResponse = (BaseResponse) obj;
            if (baseResponse.status_code == 0 || C7573i.m23585a((Object) baseResponse.message, (Object) "success")) {
                return true;
            }
            return false;
        } else if (obj instanceof C24430a) {
            C24430a aVar = (C24430a) obj;
            if (aVar.statusCode == 0 || C7573i.m23585a((Object) aVar.message, (Object) "success")) {
                return true;
            }
            return false;
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject3 = (JSONObject) obj;
            if (jSONObject3.has("statusCode") && jSONObject3.optInt("statusCode") == 0) {
                return true;
            }
            if (jSONObject3.has("status_code") && jSONObject3.optInt("status_code") == 0) {
                return true;
            }
            if (!jSONObject3.has("message") || !TextUtils.equals("success", jSONObject3.optString("message"))) {
                return false;
            }
            return true;
        } else if (obj instanceof C6711m) {
            C6711m mVar = (C6711m) obj;
            if (mVar.mo16148a("statusCode")) {
                C6709k b = mVar.mo16149b("statusCode");
                C7573i.m23582a((Object) b, "body.get(\"statusCode\")");
                if (b.mo16003g() == 0) {
                    return true;
                }
            }
            if (mVar.mo16148a("status_code")) {
                C6709k b2 = mVar.mo16149b("status_code");
                C7573i.m23582a((Object) b2, "body.get(\"status_code\")");
                if (b2.mo16003g() == 0) {
                    return true;
                }
            }
            if (mVar.mo16148a("message")) {
                CharSequence charSequence2 = "success";
                C6709k b3 = mVar.mo16149b("message");
                C7573i.m23582a((Object) b3, "body.get(\"message\")");
                if (TextUtils.equals(charSequence2, b3.mo15998c())) {
                    return true;
                }
            }
            return false;
        } else if (obj instanceof FeedItemList) {
            FeedItemList feedItemList = (FeedItemList) obj;
            if (feedItemList.getItems() == null || feedItemList.getItems().size() <= 0) {
                return false;
            }
            return true;
        } else if ((obj instanceof TypedInput) || (obj instanceof TypedOutput) || (obj instanceof C12465e) || (obj instanceof LinkedTreeMap) || (obj instanceof C23142a) || !C7163a.m22363a()) {
            return true;
        } else {
            Uri parse2 = Uri.parse(str);
            C7573i.m23582a((Object) parse2, "Uri.parse(url)");
            String path = parse2.getPath();
            C7573i.m23582a((Object) path, "path");
            if (C7634n.m23721b(path, "/webcast/", false) || C7634n.m23721b(path, "/aweme/v1/im/", false) || C7634n.m23721b(path, "/v1/message/", false) || path.equals("/api/ad/v1/adlink/") || path.equals("/aweme/v1/fansclub/club/")) {
                return true;
            }
            return filter(str, obj);
        }
    }

    public final void apiMonitor(String str, String str2, String str3) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str3, "body");
        Uri parse = Uri.parse(str);
        if (parse != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str);
                jSONObject.put("path", parse.getPath());
                jSONObject.put("host", parse.getHost());
                jSONObject.put("body", str3);
                jSONObject.put("requestid", str2);
                jSONObject.put("debug", C7163a.m22363a());
                C6893q.m21452b("api_error_service_log", "", jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
