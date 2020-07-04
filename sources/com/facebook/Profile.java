package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13967z;
import com.facebook.internal.C13967z.C13970a;
import org.json.JSONException;
import org.json.JSONObject;

public final class Profile implements Parcelable {
    public static final Creator<Profile> CREATOR = new Creator<Profile>() {
        /* renamed from: a */
        private static Profile[] m38326a(int i) {
            return new Profile[i];
        }

        /* renamed from: a */
        private static Profile m38325a(Parcel parcel) {
            return new Profile(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m38325a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m38326a(i);
        }
    };

    /* renamed from: a */
    public static final String f34707a = "Profile";

    /* renamed from: b */
    public final String f34708b;

    /* renamed from: c */
    public final String f34709c;

    /* renamed from: d */
    public final String f34710d;

    /* renamed from: e */
    public final String f34711e;

    /* renamed from: f */
    public final String f34712f;

    /* renamed from: g */
    public final Uri f34713g;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static Profile m38319a() {
        return C14155p.m41775a().f37404a;
    }

    /* renamed from: b */
    public static void m38321b() {
        AccessToken a = AccessToken.m38225a();
        if (!AccessToken.m38232b()) {
            m38320a(null);
        } else {
            C13967z.m41241a(a.f34627e, (C13970a) new C13970a() {
                /* renamed from: a */
                public final void mo31807a(FacebookException facebookException) {
                }

                /* renamed from: a */
                public final void mo31808a(JSONObject jSONObject) {
                    Uri uri;
                    String optString = jSONObject.optString("id");
                    if (optString != null) {
                        String optString2 = jSONObject.optString("link");
                        String optString3 = jSONObject.optString("first_name");
                        String optString4 = jSONObject.optString("middle_name");
                        String optString5 = jSONObject.optString("last_name");
                        String optString6 = jSONObject.optString("name");
                        if (optString2 != null) {
                            uri = Uri.parse(optString2);
                        } else {
                            uri = null;
                        }
                        Profile profile = new Profile(optString, optString3, optString4, optString5, optString6, uri);
                        Profile.m38320a(profile);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final JSONObject mo31802c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f34708b);
            jSONObject.put("first_name", this.f34709c);
            jSONObject.put("middle_name", this.f34710d);
            jSONObject.put("last_name", this.f34711e);
            jSONObject.put("name", this.f34712f);
            if (this.f34713g == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", this.f34713g.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final int hashCode() {
        int hashCode = this.f34708b.hashCode() + 527;
        if (this.f34709c != null) {
            hashCode = (hashCode * 31) + this.f34709c.hashCode();
        }
        if (this.f34710d != null) {
            hashCode = (hashCode * 31) + this.f34710d.hashCode();
        }
        if (this.f34711e != null) {
            hashCode = (hashCode * 31) + this.f34711e.hashCode();
        }
        if (this.f34712f != null) {
            hashCode = (hashCode * 31) + this.f34712f.hashCode();
        }
        if (this.f34713g != null) {
            return (hashCode * 31) + this.f34713g.hashCode();
        }
        return hashCode;
    }

    /* renamed from: a */
    public static void m38320a(Profile profile) {
        C14155p.m41775a().mo33915a(profile);
    }

    private Profile(Parcel parcel) {
        Uri uri;
        this.f34708b = parcel.readString();
        this.f34709c = parcel.readString();
        this.f34710d = parcel.readString();
        this.f34711e = parcel.readString();
        this.f34712f = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.f34713g = uri;
    }

    Profile(JSONObject jSONObject) {
        Uri uri = null;
        this.f34708b = jSONObject.optString("id", null);
        this.f34709c = jSONObject.optString("first_name", null);
        this.f34710d = jSONObject.optString("middle_name", null);
        this.f34711e = jSONObject.optString("last_name", null);
        this.f34712f = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        if (optString != null) {
            uri = Uri.parse(optString);
        }
        this.f34713g = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        if (!this.f34708b.equals(profile.f34708b) || this.f34709c != null) {
            if (!this.f34709c.equals(profile.f34709c) || this.f34710d != null) {
                if (!this.f34710d.equals(profile.f34710d) || this.f34711e != null) {
                    if (!this.f34711e.equals(profile.f34711e) || this.f34712f != null) {
                        if (!this.f34712f.equals(profile.f34712f) || this.f34713g != null) {
                            return this.f34713g.equals(profile.f34713g);
                        }
                        if (profile.f34713g == null) {
                            return true;
                        }
                        return false;
                    } else if (profile.f34712f == null) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (profile.f34711e == null) {
                    return true;
                } else {
                    return false;
                }
            } else if (profile.f34710d == null) {
                return true;
            } else {
                return false;
            }
        } else if (profile.f34709c == null) {
            return true;
        } else {
            return false;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f34708b);
        parcel.writeString(this.f34709c);
        parcel.writeString(this.f34710d);
        parcel.writeString(this.f34711e);
        parcel.writeString(this.f34712f);
        if (this.f34713g == null) {
            str = null;
        } else {
            str = this.f34713g.toString();
        }
        parcel.writeString(str);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        C13876aa.m40979a(str, "id");
        this.f34708b = str;
        this.f34709c = str2;
        this.f34710d = str3;
        this.f34711e = str4;
        this.f34712f = str5;
        this.f34713g = uri;
    }
}
