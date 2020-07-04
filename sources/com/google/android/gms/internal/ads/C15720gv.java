package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.C1642a;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.gv */
public final class C15720gv implements C15742hq<Object> {

    /* renamed from: a */
    private final C15721gw f44450a;

    public C15720gv(C15721gw gwVar) {
        this.f44450a = gwVar;
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        if (this.f44450a != null) {
            String str = (String) map.get("name");
            if (str == null) {
                acd.m45781d("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = m50983a(new JSONObject((String) map.get("info")));
                } catch (JSONException e) {
                    acd.m45778b("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                acd.m45779c("Failed to convert ad metadata to Bundle.");
            } else {
                this.f44450a.mo37604a(str, bundle);
            }
        }
    }

    /* renamed from: a */
    private static Bundle m50983a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Iterator keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (obj != null) {
                if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof String) {
                    bundle.putString(str, (String) obj);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    if (!(jSONArray == null || jSONArray.length() == 0)) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object obj2 = null;
                        int i2 = 0;
                        while (obj2 == null && i2 < length) {
                            obj2 = !jSONArray.isNull(i2) ? jSONArray.get(i2) : null;
                            i2++;
                        }
                        if (obj2 == null) {
                            String str2 = "Expected JSONArray with at least 1 non-null element for key:";
                            String valueOf = String.valueOf(str);
                            acd.m45783e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        } else if (obj2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? m50983a(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(str, bundleArr);
                        } else if (obj2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(str, dArr);
                        } else if (obj2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(str, strArr);
                        } else if (obj2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(str, zArr);
                        } else {
                            acd.m45783e(C1642a.m8034a("JSONArray with unsupported type %s for key:%s", new Object[]{obj2.getClass().getCanonicalName(), str}));
                        }
                    }
                } else if (obj instanceof JSONObject) {
                    bundle.putBundle(str, m50983a((JSONObject) obj));
                } else {
                    String str3 = "Unsupported type for key:";
                    String valueOf2 = String.valueOf(str);
                    acd.m45783e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                }
            }
        }
        return bundle;
    }
}
