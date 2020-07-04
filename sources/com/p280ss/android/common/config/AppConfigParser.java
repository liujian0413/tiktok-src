package com.p280ss.android.common.config;

import android.text.TextUtils;
import com.p280ss.android.http.legacy.p877d.C19575c;
import com.p280ss.android.p294e.p870b.C19539b;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.config.AppConfigParser */
public class AppConfigParser {
    public static boolean parseCookieShareDomain(List<String> list, JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            list.add(jSONArray.getString(i));
        }
        return true;
    }

    public static void parseDnsMap(HashMap<String, InetAddress[]> hashMap, JSONArray jSONArray) {
        if (hashMap != null && jSONArray != null) {
            try {
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < length; i++) {
                    try {
                        arrayList.clear();
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string = jSONObject.getString("host");
                        if (!TextUtils.isEmpty(string)) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("ip");
                            int min = Math.min(jSONArray2.length(), 3);
                            for (int i2 = 0; i2 < min; i2++) {
                                String string2 = jSONArray2.getString(i2);
                                if (C19575c.m64492a(string2)) {
                                    InetAddress byName = InetAddress.getByName(string2);
                                    if (byName != null) {
                                        arrayList.add(byName);
                                    }
                                }
                            }
                            if (arrayList.size() > 0) {
                                InetAddress[] inetAddressArr = new InetAddress[arrayList.size()];
                                arrayList.toArray(inetAddressArr);
                                hashMap.put(string, inetAddressArr);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    public static boolean parsePathHostMap(HashMap<Pattern, String> hashMap, JSONArray jSONArray, HashMap<Pattern, String> hashMap2) throws JSONException {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("path");
            String string2 = jSONObject.getString("host_group");
            Pattern compile = Pattern.compile(string);
            hashMap.put(compile, string2);
            hashMap2.put(compile, string2);
        }
        return true;
    }

    public static boolean parseHostMap(HashMap<String, List<ConnectHost>> hashMap, JSONArray jSONArray, HashMap<String, List<C19539b>> hashMap2) throws JSONException {
        int i;
        int length = jSONArray.length();
        int i2 = 0;
        while (i2 < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.getString("name");
            JSONArray jSONArray2 = jSONObject.getJSONArray("hosts");
            int length2 = jSONArray2.length();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            while (i3 < length2) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                String optString = jSONObject2.optString("host");
                String optString2 = jSONObject2.optString("schema");
                int optInt = jSONObject2.optInt("weight");
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                    i = i2;
                } else {
                    ConnectHost connectHost = new ConnectHost();
                    connectHost.setHost(optString);
                    connectHost.setSchema(optString2);
                    connectHost.setWeight(optInt);
                    i = i2;
                    C19539b bVar = new C19539b(optString, optString2, (long) optInt);
                    arrayList.add(connectHost);
                    arrayList2.add(bVar);
                }
                i3++;
                i2 = i;
            }
            int i4 = i2;
            hashMap.put(string, arrayList);
            hashMap2.put(string, arrayList2);
            i2 = i4 + 1;
        }
        return true;
    }
}
