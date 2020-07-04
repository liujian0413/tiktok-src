package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class AppInviteContent implements ShareModel {
    public static final Creator<AppInviteContent> CREATOR = new Creator<AppInviteContent>() {
        /* renamed from: a */
        private static AppInviteContent[] m42072a(int i) {
            return new AppInviteContent[i];
        }

        /* renamed from: a */
        private static AppInviteContent m42071a(Parcel parcel) {
            return new AppInviteContent(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m42071a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m42072a(i);
        }
    };

    /* renamed from: a */
    public final String f37573a;

    /* renamed from: b */
    public final String f37574b;

    /* renamed from: c */
    public final String f37575c;

    /* renamed from: d */
    public final String f37576d;

    /* renamed from: e */
    private final Destination f37577e;

    public static class Builder {

        public enum Destination {
            FACEBOOK("facebook"),
            MESSENGER("messenger");
            
            private final String name;

            public final String toString() {
                return this.name;
            }

            public final boolean equalsName(String str) {
                if (str == null) {
                    return false;
                }
                return this.name.equals(str);
            }

            private Destination(String str) {
                this.name = str;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    AppInviteContent(Parcel parcel) {
        this.f37573a = parcel.readString();
        this.f37574b = parcel.readString();
        this.f37576d = parcel.readString();
        this.f37575c = parcel.readString();
        String readString = parcel.readString();
        if (readString.length() > 0) {
            this.f37577e = Destination.valueOf(readString);
        } else {
            this.f37577e = Destination.FACEBOOK;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37573a);
        parcel.writeString(this.f37574b);
        parcel.writeString(this.f37576d);
        parcel.writeString(this.f37575c);
        parcel.writeString(this.f37577e.toString());
    }
}
