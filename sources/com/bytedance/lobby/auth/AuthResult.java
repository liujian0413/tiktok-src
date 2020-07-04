package com.bytedance.lobby.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.lobby.LobbyException;

public final class AuthResult implements Parcelable {
    public static final Creator<AuthResult> CREATOR = new Creator<AuthResult>() {
        /* renamed from: a */
        private static AuthResult[] m35452a(int i) {
            return new AuthResult[0];
        }

        /* renamed from: a */
        private static AuthResult m35451a(Parcel parcel) {
            return new AuthResult(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m35451a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m35452a(i);
        }
    };

    /* renamed from: a */
    public boolean f32438a;

    /* renamed from: b */
    public transient boolean f32439b;

    /* renamed from: c */
    public LobbyException f32440c;

    /* renamed from: d */
    public String f32441d;

    /* renamed from: e */
    public String f32442e;

    /* renamed from: f */
    public String f32443f;

    /* renamed from: g */
    public String f32444g;

    /* renamed from: h */
    public long f32445h;

    /* renamed from: i */
    public int f32446i;

    /* renamed from: j */
    public Bundle f32447j;

    /* renamed from: com.bytedance.lobby.auth.AuthResult$a */
    public static final class C12195a {

        /* renamed from: a */
        public boolean f32448a;

        /* renamed from: b */
        public LobbyException f32449b;

        /* renamed from: c */
        public String f32450c;

        /* renamed from: d */
        public String f32451d = "";

        /* renamed from: e */
        public String f32452e = "";

        /* renamed from: f */
        public String f32453f = "";

        /* renamed from: g */
        public long f32454g;

        /* renamed from: h */
        public int f32455h;

        /* renamed from: i */
        public Bundle f32456i;

        /* renamed from: a */
        public final AuthResult mo29926a() {
            return new AuthResult(this);
        }

        /* renamed from: a */
        public final C12195a mo29921a(long j) {
            this.f32454g = j;
            return this;
        }

        /* renamed from: b */
        public final C12195a mo29927b(String str) {
            this.f32452e = str;
            return this;
        }

        /* renamed from: c */
        public final C12195a mo29928c(String str) {
            this.f32453f = str;
            return this;
        }

        /* renamed from: a */
        public final C12195a mo29922a(Bundle bundle) {
            this.f32456i = bundle;
            return this;
        }

        /* renamed from: a */
        public final C12195a mo29923a(LobbyException lobbyException) {
            this.f32449b = lobbyException;
            return this;
        }

        /* renamed from: a */
        public final C12195a mo29924a(String str) {
            this.f32451d = str;
            return this;
        }

        /* renamed from: a */
        public final C12195a mo29925a(boolean z) {
            this.f32448a = z;
            return this;
        }

        public C12195a(String str, int i) {
            this.f32450c = str;
            this.f32455h = i;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return super.toString();
    }

    private AuthResult(Parcel parcel) {
        this.f32441d = "";
        this.f32442e = "";
        this.f32443f = "";
        this.f32444g = "";
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        LobbyException lobbyException = (LobbyException) parcel.readSerializable();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        new C12195a(readString, readInt).mo29925a(z).mo29923a(lobbyException).mo29924a(readString2).mo29927b(readString3).mo29928c(readString4).mo29921a(readLong).mo29922a(parcel.readBundle(getClass().getClassLoader())).mo29926a();
    }

    private AuthResult(C12195a aVar) {
        Bundle bundle;
        this.f32441d = "";
        this.f32442e = "";
        this.f32443f = "";
        this.f32444g = "";
        this.f32438a = aVar.f32448a;
        boolean z = true;
        if (!this.f32438a) {
            if (aVar.f32449b == null) {
                this.f32440c = new LobbyException(1, "Auth is unsuccessful with no Error Cause");
            } else {
                this.f32440c = aVar.f32449b;
            }
        }
        if (this.f32440c == null || (!this.f32440c.isCancelled() && this.f32440c.getErrorCode() != 4)) {
            z = false;
        }
        this.f32439b = z;
        this.f32441d = aVar.f32450c;
        this.f32442e = aVar.f32451d;
        this.f32443f = aVar.f32452e;
        this.f32444g = aVar.f32453f;
        this.f32445h = aVar.f32454g;
        this.f32446i = aVar.f32455h;
        if (aVar.f32456i == null) {
            bundle = new Bundle();
        } else {
            bundle = aVar.f32456i;
        }
        this.f32447j = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f32438a ? 1 : 0);
        parcel.writeSerializable(this.f32440c);
        parcel.writeString(this.f32441d);
        parcel.writeString(this.f32444g);
        parcel.writeString(this.f32442e);
        parcel.writeString(this.f32443f);
        parcel.writeLong(this.f32445h);
        parcel.writeInt(this.f32446i);
        parcel.writeBundle(this.f32447j);
    }
}
