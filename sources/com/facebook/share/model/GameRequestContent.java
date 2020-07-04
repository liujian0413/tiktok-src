package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class GameRequestContent implements ShareModel {
    public static final Creator<GameRequestContent> CREATOR = new Creator<GameRequestContent>() {
        /* renamed from: a */
        private static GameRequestContent[] m42089a(int i) {
            return new GameRequestContent[i];
        }

        /* renamed from: a */
        private static GameRequestContent m42088a(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42088a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42089a(i);
        }
    };

    /* renamed from: a */
    public final String f37582a;

    /* renamed from: b */
    public final List<String> f37583b;

    /* renamed from: c */
    public final String f37584c;

    /* renamed from: d */
    public final String f37585d;

    /* renamed from: e */
    public final ActionType f37586e;

    /* renamed from: f */
    public final String f37587f;

    /* renamed from: g */
    public final Filters f37588g;

    /* renamed from: h */
    public final List<String> f37589h;

    public enum ActionType {
        SEND,
        ASKFOR,
        TURN
    }

    public enum Filters {
        APP_USERS,
        APP_NON_USERS
    }

    public final int describeContents() {
        return 0;
    }

    GameRequestContent(Parcel parcel) {
        this.f37582a = parcel.readString();
        this.f37583b = parcel.createStringArrayList();
        this.f37584c = parcel.readString();
        this.f37585d = parcel.readString();
        this.f37586e = (ActionType) parcel.readSerializable();
        this.f37587f = parcel.readString();
        this.f37588g = (Filters) parcel.readSerializable();
        this.f37589h = parcel.createStringArrayList();
        parcel.readStringList(this.f37589h);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37582a);
        parcel.writeStringList(this.f37583b);
        parcel.writeString(this.f37584c);
        parcel.writeString(this.f37585d);
        parcel.writeSerializable(this.f37586e);
        parcel.writeString(this.f37587f);
        parcel.writeSerializable(this.f37588g);
        parcel.writeStringList(this.f37589h);
    }
}
