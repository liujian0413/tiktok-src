package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C14983a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C15017a.C15021d.C15026e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends AbstractSafeParcelable implements C15026e, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new C14979g();

    /* renamed from: a */
    public static final Scope f38783a = new Scope("profile");

    /* renamed from: b */
    public static final Scope f38784b = new Scope("email");

    /* renamed from: c */
    public static final Scope f38785c = new Scope("openid");

    /* renamed from: d */
    public static final Scope f38786d = new Scope("https://www.googleapis.com/auth/games_lite");

    /* renamed from: e */
    public static final Scope f38787e = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: f */
    public static final GoogleSignInOptions f38788f = new C14972a().mo38088a().mo38093c().mo38094d();

    /* renamed from: g */
    public static final GoogleSignInOptions f38789g = new C14972a().mo38089a(f38786d, new Scope[0]).mo38094d();

    /* renamed from: r */
    private static Comparator<Scope> f38790r = new C14978f();

    /* renamed from: h */
    public Account f38791h;

    /* renamed from: i */
    public boolean f38792i;

    /* renamed from: j */
    public final boolean f38793j;

    /* renamed from: k */
    public final boolean f38794k;

    /* renamed from: l */
    public String f38795l;

    /* renamed from: m */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f38796m;

    /* renamed from: n */
    private final int f38797n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final ArrayList<Scope> f38798o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f38799p;

    /* renamed from: q */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f38800q;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C14972a {

        /* renamed from: a */
        private Set<Scope> f38801a = new HashSet();

        /* renamed from: b */
        private boolean f38802b;

        /* renamed from: c */
        private boolean f38803c;

        /* renamed from: d */
        private boolean f38804d;

        /* renamed from: e */
        private String f38805e;

        /* renamed from: f */
        private Account f38806f;

        /* renamed from: g */
        private String f38807g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f38808h = new HashMap();

        public C14972a() {
        }

        public C14972a(GoogleSignInOptions googleSignInOptions) {
            C15267r.m44384a(googleSignInOptions);
            this.f38801a = new HashSet(googleSignInOptions.f38798o);
            this.f38802b = googleSignInOptions.f38793j;
            this.f38803c = googleSignInOptions.f38794k;
            this.f38804d = googleSignInOptions.f38792i;
            this.f38805e = googleSignInOptions.f38795l;
            this.f38806f = googleSignInOptions.f38791h;
            this.f38807g = googleSignInOptions.f38799p;
            this.f38808h = GoogleSignInOptions.m43439b((List<GoogleSignInOptionsExtensionParcelable>) googleSignInOptions.f38796m);
        }

        /* renamed from: a */
        public final C14972a mo38088a() {
            this.f38801a.add(GoogleSignInOptions.f38785c);
            return this;
        }

        /* renamed from: b */
        public final C14972a mo38092b() {
            this.f38801a.add(GoogleSignInOptions.f38784b);
            return this;
        }

        /* renamed from: c */
        public final C14972a mo38093c() {
            this.f38801a.add(GoogleSignInOptions.f38783a);
            return this;
        }

        /* renamed from: a */
        public final C14972a mo38089a(Scope scope, Scope... scopeArr) {
            this.f38801a.add(scope);
            this.f38801a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: a */
        public final C14972a mo38090a(String str) {
            this.f38804d = true;
            this.f38805e = m43450b(str);
            return this;
        }

        /* renamed from: a */
        public final C14972a mo38091a(String str, boolean z) {
            this.f38802b = true;
            this.f38805e = m43450b(str);
            this.f38803c = z;
            return this;
        }

        /* renamed from: d */
        public final GoogleSignInOptions mo38094d() {
            if (this.f38801a.contains(GoogleSignInOptions.f38787e) && this.f38801a.contains(GoogleSignInOptions.f38786d)) {
                this.f38801a.remove(GoogleSignInOptions.f38786d);
            }
            if (this.f38804d && (this.f38806f == null || !this.f38801a.isEmpty())) {
                mo38088a();
            }
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList(this.f38801a), this.f38806f, this.f38804d, this.f38802b, this.f38803c, this.f38805e, this.f38807g, this.f38808h, null);
            return googleSignInOptions;
        }

        /* renamed from: b */
        private final String m43450b(String str) {
            C15267r.m44386a(str);
            C15267r.m44395b(this.f38805e == null || this.f38805e.equals(str), "two different server client ids provided");
            return str;
        }
    }

    /* renamed from: a */
    public static GoogleSignInOptions m43436a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", null);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList<>(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap<Integer,GoogleSignInOptionsExtensionParcelable>());
        return googleSignInOptions;
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m43439b((List<GoogleSignInOptionsExtensionParcelable>) arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f38797n = i;
        this.f38798o = arrayList;
        this.f38791h = account;
        this.f38792i = z;
        this.f38793j = z2;
        this.f38794k = z3;
        this.f38795l = str;
        this.f38799p = str2;
        this.f38796m = new ArrayList<>(map.values());
        this.f38800q = map;
    }

    /* renamed from: a */
    public final ArrayList<Scope> mo38083a() {
        return new ArrayList<>(this.f38798o);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m43439b(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f38816a), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38797n);
        C15269a.m44468c(parcel, 2, mo38083a(), false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f38791h, i, false);
        C15269a.m44459a(parcel, 4, this.f38792i);
        C15269a.m44459a(parcel, 5, this.f38793j);
        C15269a.m44459a(parcel, 6, this.f38794k);
        C15269a.m44457a(parcel, 7, this.f38795l, false);
        C15269a.m44457a(parcel, 8, this.f38799p, false);
        C15269a.m44468c(parcel, 9, this.f38796m, false);
        C15269a.m44443a(parcel, a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r3.f38791h.equals(r4.f38791h) != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r3.f38795l.equals(r4.f38795l) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0079 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f38796m     // Catch:{ ClassCastException -> 0x0079 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 > 0) goto L_0x0078
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f38796m     // Catch:{ ClassCastException -> 0x0079 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 <= 0) goto L_0x0017
            goto L_0x0078
        L_0x0017:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f38798o     // Catch:{ ClassCastException -> 0x0079 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0079 }
            java.util.ArrayList r2 = r4.mo38083a()     // Catch:{ ClassCastException -> 0x0079 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != r2) goto L_0x0077
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f38798o     // Catch:{ ClassCastException -> 0x0079 }
            java.util.ArrayList r2 = r4.mo38083a()     // Catch:{ ClassCastException -> 0x0079 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != 0) goto L_0x0034
            goto L_0x0077
        L_0x0034:
            android.accounts.Account r1 = r3.f38791h     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != 0) goto L_0x003d
            android.accounts.Account r1 = r4.f38791h     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != 0) goto L_0x0076
            goto L_0x0047
        L_0x003d:
            android.accounts.Account r1 = r3.f38791h     // Catch:{ ClassCastException -> 0x0079 }
            android.accounts.Account r2 = r4.f38791h     // Catch:{ ClassCastException -> 0x0079 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 == 0) goto L_0x0076
        L_0x0047:
            java.lang.String r1 = r3.f38795l     // Catch:{ ClassCastException -> 0x0079 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = r4.f38795l     // Catch:{ ClassCastException -> 0x0079 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 == 0) goto L_0x0076
            goto L_0x0062
        L_0x0058:
            java.lang.String r1 = r3.f38795l     // Catch:{ ClassCastException -> 0x0079 }
            java.lang.String r2 = r4.f38795l     // Catch:{ ClassCastException -> 0x0079 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 == 0) goto L_0x0076
        L_0x0062:
            boolean r1 = r3.f38794k     // Catch:{ ClassCastException -> 0x0079 }
            boolean r2 = r4.f38794k     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != r2) goto L_0x0076
            boolean r1 = r3.f38792i     // Catch:{ ClassCastException -> 0x0079 }
            boolean r2 = r4.f38792i     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != r2) goto L_0x0076
            boolean r1 = r3.f38793j     // Catch:{ ClassCastException -> 0x0079 }
            boolean r4 = r4.f38793j     // Catch:{ ClassCastException -> 0x0079 }
            if (r1 != r4) goto L_0x0076
            r4 = 1
            return r4
        L_0x0076:
            return r0
        L_0x0077:
            return r0
        L_0x0078:
            return r0
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f38798o;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).f38865a);
        }
        Collections.sort(arrayList);
        return new C14983a().mo38116a((Object) arrayList).mo38116a((Object) this.f38791h).mo38116a((Object) this.f38795l).mo38117a(this.f38794k).mo38117a(this.f38792i).mo38117a(this.f38793j).f38829a;
    }

    /* renamed from: b */
    public final String mo38084b() {
        return m43441c().toString();
    }

    /* renamed from: c */
    private final JSONObject m43441c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f38798o, f38790r);
            ArrayList arrayList = this.f38798o;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((Scope) obj).f38865a);
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f38791h != null) {
                jSONObject.put("accountName", this.f38791h.name);
            }
            jSONObject.put("idTokenRequested", this.f38792i);
            jSONObject.put("forceCodeForRefreshToken", this.f38794k);
            jSONObject.put("serverAuthRequested", this.f38793j);
            if (!TextUtils.isEmpty(this.f38795l)) {
                jSONObject.put("serverClientId", this.f38795l);
            }
            if (!TextUtils.isEmpty(this.f38799p)) {
                jSONObject.put("hostedDomain", this.f38799p);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C14978f fVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map);
    }
}
