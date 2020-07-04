package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.C13912i;
import com.facebook.internal.C13924n;
import com.facebook.internal.C13926o;
import com.facebook.internal.C13967z;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Creator<FacebookRequestError> CREATOR = new Creator<FacebookRequestError>() {
        /* renamed from: a */
        private static FacebookRequestError[] m38250a(int i) {
            return new FacebookRequestError[i];
        }

        /* renamed from: a */
        private static FacebookRequestError m38249a(Parcel parcel) {
            return new FacebookRequestError(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m38249a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m38250a(i);
        }
    };

    /* renamed from: a */
    static final C13083a f34651a = new C13083a();

    /* renamed from: b */
    public final Category f34652b;

    /* renamed from: c */
    public final int f34653c;

    /* renamed from: d */
    public final int f34654d;

    /* renamed from: e */
    public final int f34655e;

    /* renamed from: f */
    public final String f34656f;

    /* renamed from: g */
    public final String f34657g;

    /* renamed from: h */
    public final String f34658h;

    /* renamed from: i */
    public final String f34659i;

    /* renamed from: j */
    public final JSONObject f34660j;

    /* renamed from: k */
    public final JSONObject f34661k;

    /* renamed from: l */
    public final Object f34662l;

    /* renamed from: m */
    public final HttpURLConnection f34663m;

    /* renamed from: n */
    public final FacebookException f34664n;

    /* renamed from: o */
    private final String f34665o;

    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$a */
    static class C13083a {

        /* renamed from: a */
        private final int f34666a;

        /* renamed from: b */
        private final int f34667b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo31786a(int i) {
            if (this.f34666a > i || i > this.f34667b) {
                return false;
            }
            return true;
        }

        private C13083a(int i, int i2) {
            this.f34666a = i;
            this.f34667b = i2;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final String mo31780a() {
        if (this.f34665o != null) {
            return this.f34665o;
        }
        return this.f34664n.getLocalizedMessage();
    }

    /* renamed from: b */
    private static synchronized C13912i m38247b() {
        synchronized (FacebookRequestError.class) {
            C13924n a = C13926o.m41097a(C13499h.m39725k());
            if (a == null) {
                C13912i a2 = C13912i.m41073a();
                return a2;
            }
            C13912i iVar = a.f36844h;
            return iVar;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{HttpStatus: ");
        sb.append(this.f34653c);
        sb.append(", errorCode: ");
        sb.append(this.f34654d);
        sb.append(", subErrorCode: ");
        sb.append(this.f34655e);
        sb.append(", errorType: ");
        sb.append(this.f34656f);
        sb.append(", errorMessage: ");
        sb.append(mo31780a());
        sb.append("}");
        return sb.toString();
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34653c);
        parcel.writeInt(this.f34654d);
        parcel.writeInt(this.f34655e);
        parcel.writeString(this.f34656f);
        parcel.writeString(this.f34665o);
        parcel.writeString(this.f34657g);
        parcel.writeString(this.f34658h);
    }

    FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        FacebookException facebookException;
        Exception exc2 = exc;
        if (exc2 instanceof FacebookException) {
            facebookException = (FacebookException) exc2;
        } else {
            facebookException = new FacebookException((Throwable) exc2);
        }
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, facebookException);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    /* renamed from: a */
    static FacebookRequestError m38246a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        JSONObject jSONObject2;
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        int i;
        JSONObject jSONObject3 = jSONObject;
        try {
            if (jSONObject3.has("code")) {
                int i2 = jSONObject3.getInt("code");
                Object a = C13967z.m41216a(jSONObject3, "body", "FACEBOOK_NON_JSON_RESULT");
                if (a != null && (a instanceof JSONObject)) {
                    JSONObject jSONObject4 = (JSONObject) a;
                    boolean z2 = true;
                    int i3 = 0;
                    if (jSONObject4.has("error")) {
                        JSONObject jSONObject5 = (JSONObject) C13967z.m41216a(jSONObject4, "error", (String) null);
                        str4 = jSONObject5.optString("type", null);
                        str3 = jSONObject5.optString("message", null);
                        int optInt = jSONObject5.optInt("code", -1);
                        i = jSONObject5.optInt("error_subcode", -1);
                        String optString = jSONObject5.optString("error_user_msg", null);
                        str = jSONObject5.optString("error_user_title", null);
                        i3 = optInt;
                        str2 = optString;
                        z = jSONObject5.optBoolean("is_transient", false);
                    } else {
                        if (!jSONObject4.has("error_code") && !jSONObject4.has("error_msg")) {
                            if (!jSONObject4.has("error_reason")) {
                                str4 = null;
                                str3 = null;
                                str2 = null;
                                str = null;
                                z2 = false;
                                i = 0;
                                z = false;
                            }
                        }
                        String optString2 = jSONObject4.optString("error_reason", null);
                        String optString3 = jSONObject4.optString("error_msg", null);
                        int optInt2 = jSONObject4.optInt("error_code", -1);
                        i = jSONObject4.optInt("error_subcode", -1);
                        i3 = optInt2;
                        str2 = null;
                        str = null;
                        z = false;
                        str3 = optString3;
                        str4 = optString2;
                    }
                    if (z2) {
                        FacebookRequestError facebookRequestError = new FacebookRequestError(i2, i3, i, str4, str3, str, str2, z, jSONObject4, jSONObject, obj, httpURLConnection, null);
                        return facebookRequestError;
                    }
                }
                if (!f34651a.mo31786a(i2)) {
                    if (jSONObject3.has("body")) {
                        jSONObject2 = (JSONObject) C13967z.m41216a(jSONObject3, "body", "FACEBOOK_NON_JSON_RESULT");
                    } else {
                        jSONObject2 = null;
                    }
                    FacebookRequestError facebookRequestError2 = new FacebookRequestError(i2, -1, -1, null, null, null, null, false, jSONObject2, jSONObject, obj, httpURLConnection, null);
                    return facebookRequestError2;
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        boolean z2;
        Category category;
        this.f34653c = i;
        this.f34654d = i2;
        this.f34655e = i3;
        this.f34656f = str;
        this.f34665o = str2;
        this.f34661k = jSONObject;
        this.f34660j = jSONObject2;
        this.f34662l = obj;
        this.f34663m = httpURLConnection;
        this.f34657g = str3;
        this.f34658h = str4;
        if (facebookException != null) {
            this.f34664n = facebookException;
            z2 = true;
        } else {
            this.f34664n = new FacebookServiceException(this, str2);
            z2 = false;
        }
        C13912i b = m38247b();
        if (z2) {
            category = Category.OTHER;
        } else {
            category = b.mo33570a(i2, i3, z);
        }
        this.f34652b = category;
        this.f34659i = b.mo33571a(this.f34652b);
    }
}
