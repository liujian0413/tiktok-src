package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13967z;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final Creator<AccessToken> CREATOR = new Creator() {
        /* renamed from: a */
        private static AccessToken[] m38238a(int i) {
            return new AccessToken[i];
        }

        /* renamed from: a */
        private static AccessToken m38237a(Parcel parcel) {
            return new AccessToken(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m38237a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m38238a(i);
        }
    };

    /* renamed from: k */
    private static final Date f34619k;

    /* renamed from: l */
    private static final Date f34620l;

    /* renamed from: m */
    private static final Date f34621m = new Date();

    /* renamed from: n */
    private static final AccessTokenSource f34622n = AccessTokenSource.FACEBOOK_APPLICATION_WEB;

    /* renamed from: a */
    public final Date f34623a;

    /* renamed from: b */
    public final Set<String> f34624b;

    /* renamed from: c */
    public final Set<String> f34625c;

    /* renamed from: d */
    public final Set<String> f34626d;

    /* renamed from: e */
    public final String f34627e;

    /* renamed from: f */
    public final AccessTokenSource f34628f;

    /* renamed from: g */
    public final Date f34629g;

    /* renamed from: h */
    public final String f34630h;

    /* renamed from: i */
    public final String f34631i;

    /* renamed from: j */
    public final Date f34632j;

    /* renamed from: com.facebook.AccessToken$a */
    public interface C13078a {
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static AccessToken m38225a() {
        return C13196b.m38575a().f34954a;
    }

    /* renamed from: c */
    static void m38233c() {
        AccessToken accessToken = C13196b.m38575a().f34954a;
        if (accessToken != null) {
            m38229a(m38231b(accessToken));
        }
    }

    /* renamed from: d */
    public final boolean mo31748d() {
        return new Date().after(this.f34623a);
    }

    /* renamed from: b */
    public static boolean m38232b() {
        AccessToken accessToken = C13196b.m38575a().f34954a;
        if (accessToken == null || accessToken.mo31748d()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private String m38234f() {
        if (this.f34627e == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        if (C13499h.m39715b(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
            return this.f34627e;
        }
        return "ACCESS_TOKEN_REMOVED";
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f34619k = date;
        f34620l = date;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m38234f());
        m38230a(sb);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final JSONObject mo31750e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C38347c.f99551f, 1);
        jSONObject.put("token", this.f34627e);
        jSONObject.put("expires_at", this.f34623a.getTime());
        jSONObject.put("permissions", new JSONArray(this.f34624b));
        jSONObject.put("declined_permissions", new JSONArray(this.f34625c));
        jSONObject.put("expired_permissions", new JSONArray(this.f34626d));
        jSONObject.put("last_refresh", this.f34629g.getTime());
        jSONObject.put("source", this.f34628f.name());
        jSONObject.put("application_id", this.f34630h);
        jSONObject.put("user_id", this.f34631i);
        jSONObject.put("data_access_expiration_time", this.f34632j.getTime());
        return jSONObject;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((this.f34623a.hashCode() + 527) * 31) + this.f34624b.hashCode()) * 31) + this.f34625c.hashCode()) * 31) + this.f34626d.hashCode()) * 31) + this.f34627e.hashCode()) * 31) + this.f34628f.hashCode()) * 31) + this.f34629g.hashCode()) * 31;
        if (this.f34630h == null) {
            i = 0;
        } else {
            i = this.f34630h.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f34631i.hashCode()) * 31) + this.f34632j.hashCode();
    }

    /* renamed from: a */
    public static void m38229a(AccessToken accessToken) {
        C13196b.m38575a().mo32384a(accessToken);
    }

    /* renamed from: a */
    private void m38230a(StringBuilder sb) {
        sb.append(" permissions:");
        if (this.f34624b == null) {
            sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f34624b));
        sb.append("]");
    }

    /* renamed from: b */
    private static AccessToken m38231b(AccessToken accessToken) {
        AccessToken accessToken2 = new AccessToken(accessToken.f34627e, accessToken.f34630h, accessToken.f34631i, accessToken.f34624b, accessToken.f34625c, accessToken.f34626d, accessToken.f34628f, new Date(), new Date(), accessToken.f34632j);
        return accessToken2;
    }

    AccessToken(Parcel parcel) {
        this.f34623a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f34624b = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f34625c = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f34626d = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f34627e = parcel.readString();
        this.f34628f = AccessTokenSource.valueOf(parcel.readString());
        this.f34629g = new Date(parcel.readLong());
        this.f34630h = parcel.readString();
        this.f34631i = parcel.readString();
        this.f34632j = new Date(parcel.readLong());
    }

    /* renamed from: a */
    static AccessToken m38226a(Bundle bundle) {
        List a = m38228a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List a2 = m38228a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List a3 = m38228a(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        String d = C14121n.m41700d(bundle);
        if (C13967z.m41249a(d)) {
            d = C13499h.m39725k();
        }
        String str = d;
        String b = C14121n.m41698b(bundle);
        try {
            AccessToken accessToken = new AccessToken(b, str, C13967z.m41270e(b).getString("id"), a, a2, a3, C14121n.m41699c(bundle), C14121n.m41695a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), C14121n.m41695a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
            return accessToken;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (!this.f34623a.equals(accessToken.f34623a) || !this.f34624b.equals(accessToken.f34624b) || !this.f34625c.equals(accessToken.f34625c) || !this.f34626d.equals(accessToken.f34626d) || !this.f34627e.equals(accessToken.f34627e) || this.f34628f != accessToken.f34628f || !this.f34629g.equals(accessToken.f34629g) || (this.f34630h != null ? !this.f34630h.equals(accessToken.f34630h) : accessToken.f34630h != null) || !this.f34631i.equals(accessToken.f34631i) || !this.f34632j.equals(accessToken.f34632j)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static AccessToken m38227a(JSONObject jSONObject) throws JSONException {
        Collection a;
        if (jSONObject.getInt(C38347c.f99551f) <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            AccessTokenSource valueOf = AccessTokenSource.valueOf(jSONObject.getString("source"));
            String string2 = jSONObject.getString("application_id");
            String string3 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
            List a2 = C13967z.m41232a(jSONArray);
            List a3 = C13967z.m41232a(jSONArray2);
            if (optJSONArray == null) {
                a = new ArrayList();
            } else {
                a = C13967z.m41232a(optJSONArray);
            }
            AccessToken accessToken = new AccessToken(string, string2, string3, a2, a3, a, valueOf, date, date2, date3);
            return accessToken;
        }
        throw new FacebookException("Unknown AccessToken serialization format.");
    }

    /* renamed from: a */
    private static List<String> m38228a(Bundle bundle, String str) {
        ArrayList stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f34623a.getTime());
        parcel.writeStringList(new ArrayList(this.f34624b));
        parcel.writeStringList(new ArrayList(this.f34625c));
        parcel.writeStringList(new ArrayList(this.f34626d));
        parcel.writeString(this.f34627e);
        parcel.writeString(this.f34628f.name());
        parcel.writeLong(this.f34629g.getTime());
        parcel.writeString(this.f34630h);
        parcel.writeString(this.f34631i);
        parcel.writeLong(this.f34632j.getTime());
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        C13876aa.m40979a(str, "accessToken");
        C13876aa.m40979a(str2, "applicationId");
        C13876aa.m40979a(str3, "userId");
        if (date == null) {
            date = f34620l;
        }
        this.f34623a = date;
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        this.f34624b = Collections.unmodifiableSet(hashSet);
        if (collection2 != null) {
            hashSet2 = new HashSet(collection2);
        } else {
            hashSet2 = new HashSet();
        }
        this.f34625c = Collections.unmodifiableSet(hashSet2);
        if (collection3 != null) {
            hashSet3 = new HashSet(collection3);
        } else {
            hashSet3 = new HashSet();
        }
        this.f34626d = Collections.unmodifiableSet(hashSet3);
        this.f34627e = str;
        if (accessTokenSource == null) {
            accessTokenSource = f34622n;
        }
        this.f34628f = accessTokenSource;
        if (date2 == null) {
            date2 = f34621m;
        }
        this.f34629g = date2;
        this.f34630h = str2;
        this.f34631i = str3;
        if (date3 == null || date3.getTime() == 0) {
            date3 = f34620l;
        }
        this.f34632j = date3;
    }
}
