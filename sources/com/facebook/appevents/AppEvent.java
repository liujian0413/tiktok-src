package com.facebook.appevents;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.C1642a;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.C13173c;
import com.facebook.appevents.internal.C13182g;
import com.facebook.internal.C13949t;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class AppEvent implements Serializable {
    private static final long serialVersionUID = 1;
    private static final HashSet<String> validatedIdentifiers = new HashSet<>();
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    /* renamed from: com.facebook.appevents.AppEvent$a */
    static class C13115a implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: a */
        private final String f34742a;

        /* renamed from: b */
        private final boolean f34743b;

        /* renamed from: c */
        private final boolean f34744c;

        private Object readResolve() throws JSONException {
            AppEvent appEvent = new AppEvent(this.f34742a, this.f34743b, this.f34744c, null);
            return appEvent;
        }
    }

    /* renamed from: com.facebook.appevents.AppEvent$b */
    static class C13116b implements Serializable {
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: a */
        private final String f34745a;

        /* renamed from: b */
        private final boolean f34746b;

        /* renamed from: c */
        private final boolean f34747c;

        /* renamed from: d */
        private final String f34748d;

        private Object readResolve() throws JSONException {
            AppEvent appEvent = new AppEvent(this.f34745a, this.f34746b, this.f34747c, this.f34748d);
            return appEvent;
        }

        private C13116b(String str, boolean z, boolean z2, String str2) {
            this.f34745a = str;
            this.f34746b = z;
            this.f34747c = z2;
            this.f34748d = str2;
        }
    }

    public boolean getIsImplicit() {
        return this.isImplicit;
    }

    public JSONObject getJSONObject() {
        return this.jsonObject;
    }

    public String getName() {
        return this.name;
    }

    private Object writeReplace() {
        C13116b bVar = new C13116b(this.jsonObject.toString(), this.isImplicit, this.inBackground, this.checksum);
        return bVar;
    }

    public boolean isChecksumValid() {
        if (this.checksum == null) {
            return true;
        }
        return calculateChecksum().equals(this.checksum);
    }

    public String toString() {
        return C1642a.m8034a("\"%s\", implicit: %b, json: %s", new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()});
    }

    private String calculateChecksum() {
        if (VERSION.SDK_INT > 19) {
            return md5Checksum(this.jsonObject.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator keys = this.jsonObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.jsonObject.optString(str));
            sb.append(10);
        }
        return md5Checksum(sb.toString());
    }

    private static String md5Checksum(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            return C13173c.m38493a(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return "0";
        } catch (UnsupportedEncodingException unused2) {
            return "1";
        }
    }

    private static void validateIdentifier(String str) throws FacebookException {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(C1642a.m8035a(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, Integer.valueOf(40)}));
        }
        synchronized (validatedIdentifiers) {
            contains = validatedIdentifiers.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (validatedIdentifiers) {
                validatedIdentifiers.add(str);
            }
            return;
        }
        throw new FacebookException(C1642a.m8034a("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    private Map<String, String> validateParameters(Bundle bundle) throws FacebookException {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            validateIdentifier(str);
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(str, obj.toString());
            } else {
                throw new FacebookException(C1642a.m8034a("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str}));
            }
        }
        C13182g.m38527a((Map<String, String>) hashMap, this.name);
        return hashMap;
    }

    private AppEvent(String str, boolean z, boolean z2, String str2) throws JSONException {
        this.jsonObject = new JSONObject(str);
        this.isImplicit = z;
        this.name = this.jsonObject.optString("_eventName");
        this.checksum = str2;
        this.inBackground = z2;
    }

    private JSONObject getJSONObjectForAppEvent(String str, String str2, Double d, Bundle bundle, UUID uuid) throws JSONException {
        validateIdentifier(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", md5Checksum(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map validateParameters = validateParameters(bundle);
            for (String str3 : validateParameters.keySet()) {
                jSONObject.put(str3, validateParameters.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C13949t.m41131a(LoggingBehavior.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, FacebookException {
        this.isImplicit = z;
        this.inBackground = z2;
        this.name = str2;
        this.jsonObject = getJSONObjectForAppEvent(str, str2, d, bundle, uuid);
        this.checksum = calculateChecksum();
    }
}
