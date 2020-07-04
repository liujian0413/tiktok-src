package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import com.twitter.sdk.android.core.C46820a;

public class OAuth2Token extends C46820a implements Parcelable {
    public static final Creator<OAuth2Token> CREATOR = new Creator<OAuth2Token>() {
        /* renamed from: a */
        private static OAuth2Token[] m146655a(int i) {
            return new OAuth2Token[i];
        }

        /* renamed from: a */
        private static OAuth2Token m146654a(Parcel parcel) {
            return new OAuth2Token(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m146654a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m146655a(i);
        }
    };
    @C6593c(mo15949a = "token_type")

    /* renamed from: c */
    public final String f120216c;
    @C6593c(mo15949a = "access_token")

    /* renamed from: d */
    public final String f120217d;

    /* renamed from: a */
    public boolean mo117981a() {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.f120216c != null) {
            i = this.f120216c.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.f120217d != null) {
            i2 = this.f120217d.hashCode();
        }
        return i3 + i2;
    }

    private OAuth2Token(Parcel parcel) {
        this.f120216c = parcel.readString();
        this.f120217d = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OAuth2Token oAuth2Token = (OAuth2Token) obj;
        if (this.f120217d == null ? oAuth2Token.f120217d != null : !this.f120217d.equals(oAuth2Token.f120217d)) {
            return false;
        }
        if (this.f120216c == null ? oAuth2Token.f120216c == null : this.f120216c.equals(oAuth2Token.f120216c)) {
            return true;
        }
        return false;
    }

    public OAuth2Token(String str, String str2) {
        this.f120216c = str;
        this.f120217d = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120216c);
        parcel.writeString(this.f120217d);
    }
}
