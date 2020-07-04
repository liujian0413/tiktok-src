package com.bytedance.android.live.network;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.local.EmptyResponseException;
import com.bytedance.android.live.api.exceptions.local.ResponseNoDataException;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.network.p149a.C3173a;
import com.bytedance.android.live.core.network.p149a.C3174b;
import com.bytedance.android.live.core.network.p149a.C3175c;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.p166a.C3453a;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.network.response.C3480e;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6319n;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12464d;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class ResponseInterceptor implements C12469a {
    private ResponseInterceptor() {
    }

    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C3468m.m12830a(this, aVar);
    }

    /* renamed from: a */
    public static ResponseInterceptor m12775a() {
        return new ResponseInterceptor();
    }

    /* renamed from: a */
    private static String m12776a(C12534t tVar) {
        List b = tVar.f33301a.mo30452b("X-Tt-Logid");
        if (b == null || b.size() <= 0) {
            return "";
        }
        return ((C12461b) b.get(0)).f33096b;
    }

    /* renamed from: b */
    public final C12534t mo10437b(C12470a aVar) throws Exception {
        C12462c a = aVar.mo30456a();
        C12534t a2 = aVar.mo30457a(a);
        m12780a(a, a2);
        return a2;
    }

    /* renamed from: a */
    private static JSONObject m12779a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m12781a(JSONObject jSONObject) {
        if (!jSONObject.has("status_code") || jSONObject.optInt("status_code") != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m12780a(C12462c cVar, C12534t tVar) throws Exception {
        m12782b(cVar, tVar);
        T t = tVar.f33302b;
        if (t instanceof C3480e) {
            C3480e eVar = (C3480e) t;
            if (eVar.f10306a != 0) {
                if (eVar.f10309d == null) {
                    eVar.f10309d = new RequestError();
                }
                eVar.f10309d.url = cVar.f33098b;
                eVar.f10309d.message = ((Room) eVar.f10307b).message;
                eVar.f10309d.prompts = ((Room) eVar.f10307b).prompts;
                C3453a.m12792a(eVar.f10306a, eVar.f10309d, C2317a.m9932a().mo15979b(eVar.f10308c), m12776a(tVar));
            }
        } else if (t instanceof C3479d) {
            C3479d dVar = (C3479d) t;
            if (dVar.statusCode != 0) {
                if (dVar.error == null) {
                    dVar.error = new RequestError();
                }
                dVar.error.url = cVar.f33098b;
                C3453a.m12791a(dVar.statusCode, dVar.error, dVar.extra, m12776a(tVar));
            }
        } else if (t instanceof C3478c) {
            C3478c cVar2 = (C3478c) t;
            if (cVar2.f10295a != 0) {
                if (cVar2.f10298d == null) {
                    cVar2.f10298d = new RequestError();
                }
                cVar2.f10298d.url = cVar.f33098b;
                C3453a.m12791a(cVar2.f10295a, cVar2.f10298d, cVar2.f10297c, m12776a(tVar));
            }
        } else if (t instanceof C3175c) {
            C3175c cVar3 = (C3175c) t;
            if (!TextUtils.equals(cVar3.f9763b, "success") && cVar3.f9764c != null) {
                cVar3.f9764c.f9761c = cVar.f33098b;
                C3453a.m12790a(cVar3.f9764c.f9759a, cVar3.f9764c, m12776a(tVar));
            }
        } else if (t instanceof C3173a) {
            C3173a aVar = (C3173a) t;
            if (!TextUtils.equals(aVar.f9757b, "success") && aVar.f9758c != null) {
                aVar.f9758c.f9761c = cVar.f33098b;
                C3453a.m12790a(aVar.f9758c.f9759a, aVar.f9758c, m12776a(tVar));
            }
        } else {
            if (t instanceof C3474a) {
                C3474a aVar2 = (C3474a) t;
                if (aVar2.f10295a != 0) {
                    if (aVar2.f10298d == null) {
                        aVar2.f10298d = new RequestError();
                    }
                    aVar2.f10298d.url = cVar.f33098b;
                    C3453a.m12791a(aVar2.f10295a, aVar2.f10298d, (Extra) aVar2.f10297c, m12776a(tVar));
                } else if (aVar2.f10296b == null) {
                    throw new ResponseNoDataException();
                }
            } else if (t instanceof C3477b) {
                C3477b bVar = (C3477b) t;
                if (bVar.statusCode != 0) {
                    if (bVar.error == null) {
                        bVar.error = new RequestError();
                    }
                    bVar.error.url = cVar.f33098b;
                    C3453a.m12791a(bVar.statusCode, bVar.error, (Extra) bVar.extra, m12776a(tVar));
                } else if (bVar.data == null) {
                    throw new ResponseNoDataException(bVar);
                }
            } else if (t instanceof String) {
                String str = (String) t;
                if (!C6319n.m19593a(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has("data")) {
                        throw new ResponseNoDataException();
                    } else if (!m12781a(jSONObject)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        throw new ApiServerException(jSONObject.optInt("status_code")).setErrorMsg(optJSONObject.optString("message", "")).setPrompt(optJSONObject.optString("prompts", "")).setExtra(jSONObject.optString("extra", "")).setAlert(optJSONObject.optString("alert", ""));
                    }
                } else {
                    throw new EmptyResponseException();
                }
            }
        }
    }

    /* renamed from: b */
    private void m12782b(C12462c cVar, C12534t tVar) {
        String str;
        if (tVar != null && cVar != null) {
            C12464d dVar = tVar.f33301a;
            if (dVar != null) {
                int i = dVar.f33119b;
                if (i == 200) {
                    T t = tVar.f33302b;
                    if (t != null) {
                        String str2 = cVar.f33098b;
                        String a = C3358ac.m12515a((int) R.string.f80);
                        int i2 = 0;
                        if (t instanceof C3480e) {
                            C3480e eVar = (C3480e) t;
                            i2 = eVar.f10306a;
                            if (eVar.f10307b instanceof Room) {
                                a = ((Room) eVar.f10307b).message;
                            }
                        } else if (t instanceof C12464d) {
                            i2 = ((C12464d) t).f33119b;
                        } else if (t instanceof C3478c) {
                            i2 = ((C3478c) t).f10295a;
                        } else {
                            if (t instanceof C3175c) {
                                C3174b bVar = ((C3175c) t).f9764c;
                                if (bVar != null) {
                                    i2 = bVar.f9759a;
                                    str = bVar.f9760b;
                                }
                            } else if (t instanceof C3173a) {
                                C3174b bVar2 = ((C3173a) t).f9758c;
                                if (bVar2 != null) {
                                    i2 = bVar2.f9759a;
                                    str = bVar2.f9760b;
                                }
                            } else if (t instanceof C3474a) {
                                i2 = ((C3474a) t).f10295a;
                            } else if (t instanceof C3477b) {
                                i2 = ((C3477b) t).statusCode;
                            } else if (t instanceof String) {
                                String str3 = (String) t;
                                if (TextUtils.isEmpty(str3)) {
                                    JSONObject a2 = m12779a(str3);
                                    i2 = m12774a(a2, "status_code", 0);
                                    a = m12778a(a2, "message", "");
                                }
                            }
                            a = str;
                        }
                        if (i2 != 0) {
                            String str4 = "";
                            List<C12461b> list = dVar.f33121d;
                            if (list != null && !list.isEmpty()) {
                                for (C12461b bVar3 : list) {
                                    if (bVar3 != null && "x-tt-Logid".equalsIgnoreCase(bVar3.f33095a)) {
                                        str4 = bVar3.f33096b;
                                    }
                                }
                            }
                            JSONObject jSONObject = new JSONObject();
                            m12784b(jSONObject, "xLogId", str4);
                            m12783b(jSONObject, "code", i);
                            m12783b(jSONObject, "status_code", i2);
                            m12784b(jSONObject, "url", str2);
                            m12784b(jSONObject, "message", a);
                            m12784b(jSONObject, "classes", "com.bytedance.android.livesdk.network.ResponseInterceptor");
                            String str5 = "ttlive_net";
                            C3166a.m11961b(str5, m12777a(str5, jSONObject, (JSONObject) null));
                            JSONObject jSONObject2 = new JSONObject();
                            m12784b(jSONObject2, "xLogId", str4);
                            m12783b(jSONObject2, "code", i);
                            m12783b(jSONObject2, "status_code", i2);
                            try {
                                Uri parse = Uri.parse(str2);
                                m12784b(jSONObject2, "host", parse.getHost());
                                m12784b(jSONObject2, "path", parse.getPath());
                            } catch (Exception unused) {
                            }
                            m12784b(jSONObject2, "message", a);
                            C3172e.m12008b("ttlive_network_request_error", 1, jSONObject2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m12783b(JSONObject jSONObject, String str, int i) {
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static int m12774a(JSONObject jSONObject, String str, int i) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str, 0);
    }

    /* renamed from: b */
    private static void m12784b(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static String m12777a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("tag", str);
            jSONObject3.put("data", jSONObject.toString());
        } catch (JSONException unused) {
        }
        return jSONObject3.toString();
    }

    /* renamed from: a */
    private static String m12778a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return str2;
        }
        return jSONObject.optString(str, str2);
    }
}
