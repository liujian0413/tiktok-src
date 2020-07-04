package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.common.util.C15325h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C14977e();

    /* renamed from: j */
    private static C15322e f38762j = C15325h.m44574d();

    /* renamed from: a */
    public String f38763a;

    /* renamed from: b */
    public String f38764b;

    /* renamed from: c */
    public String f38765c;

    /* renamed from: d */
    public String f38766d;

    /* renamed from: e */
    public Uri f38767e;

    /* renamed from: f */
    public String f38768f;

    /* renamed from: g */
    public String f38769g;

    /* renamed from: h */
    public String f38770h;

    /* renamed from: i */
    public String f38771i;

    /* renamed from: k */
    private final int f38772k;

    /* renamed from: l */
    private long f38773l;

    /* renamed from: m */
    private List<Scope> f38774m;

    /* renamed from: n */
    private Set<Scope> f38775n = new HashSet();

    /* renamed from: a */
    public static GoogleSignInAccount m43429a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a = m43430a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a.f38768f = jSONObject.optString("serverAuthCode", null);
        return a;
    }

    /* renamed from: a */
    private static GoogleSignInAccount m43430a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, (l == null ? Long.valueOf(f38762j.mo38684a() / 1000) : l).longValue(), C15267r.m44386a(str7), new ArrayList((Collection) C15267r.m44384a(set)), str5, str6);
        return googleSignInAccount;
    }

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f38772k = i;
        this.f38763a = str;
        this.f38764b = str2;
        this.f38765c = str3;
        this.f38766d = str4;
        this.f38767e = uri;
        this.f38768f = str5;
        this.f38773l = j;
        this.f38769g = str6;
        this.f38774m = list;
        this.f38770h = str7;
        this.f38771i = str8;
    }

    /* renamed from: a */
    public final Account mo38077a() {
        if (this.f38765c == null) {
            return null;
        }
        return new Account(this.f38765c, "com.google");
    }

    /* renamed from: b */
    public final Set<Scope> mo38078b() {
        HashSet hashSet = new HashSet(this.f38774m);
        hashSet.addAll(this.f38775n);
        return hashSet;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38772k);
        C15269a.m44457a(parcel, 2, this.f38763a, false);
        C15269a.m44457a(parcel, 3, this.f38764b, false);
        C15269a.m44457a(parcel, 4, this.f38765c, false);
        C15269a.m44457a(parcel, 5, this.f38766d, false);
        C15269a.m44452a(parcel, 6, (Parcelable) this.f38767e, i, false);
        C15269a.m44457a(parcel, 7, this.f38768f, false);
        C15269a.m44448a(parcel, 8, this.f38773l);
        C15269a.m44457a(parcel, 9, this.f38769g, false);
        C15269a.m44468c(parcel, 10, this.f38774m, false);
        C15269a.m44457a(parcel, 11, this.f38770h, false);
        C15269a.m44457a(parcel, 12, this.f38771i, false);
        C15269a.m44443a(parcel, a);
    }

    public int hashCode() {
        return ((this.f38769g.hashCode() + 527) * 31) + mo38078b().hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f38769g.equals(this.f38769g) && googleSignInAccount.mo38078b().equals(mo38078b());
    }

    /* renamed from: c */
    public final String mo38079c() {
        JSONObject d = m43431d();
        d.remove("serverAuthCode");
        return d.toString();
    }

    /* renamed from: d */
    private final JSONObject m43431d() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f38763a != null) {
                jSONObject.put("id", this.f38763a);
            }
            if (this.f38764b != null) {
                jSONObject.put("tokenId", this.f38764b);
            }
            if (this.f38765c != null) {
                jSONObject.put("email", this.f38765c);
            }
            if (this.f38766d != null) {
                jSONObject.put("displayName", this.f38766d);
            }
            if (this.f38770h != null) {
                jSONObject.put("givenName", this.f38770h);
            }
            if (this.f38771i != null) {
                jSONObject.put("familyName", this.f38771i);
            }
            if (this.f38767e != null) {
                jSONObject.put("photoUrl", this.f38767e.toString());
            }
            if (this.f38768f != null) {
                jSONObject.put("serverAuthCode", this.f38768f);
            }
            jSONObject.put("expirationTime", this.f38773l);
            jSONObject.put("obfuscatedIdentifier", this.f38769g);
            JSONArray jSONArray = new JSONArray();
            Scope[] scopeArr = (Scope[]) this.f38774m.toArray(new Scope[this.f38774m.size()]);
            Arrays.sort(scopeArr, C14976d.f38814a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f38865a);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
