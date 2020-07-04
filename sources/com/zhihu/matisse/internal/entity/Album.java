package com.zhihu.matisse.internal.entity;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class Album implements Parcelable {
    public static final Creator<Album> CREATOR = new Creator<Album>() {
        /* renamed from: a */
        private static Album[] m147793a(int i) {
            return new Album[i];
        }

        /* renamed from: a */
        private static Album m147792a(Parcel parcel) {
            return new Album(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147792a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147793a(i);
        }
    };

    /* renamed from: a */
    public static final String f121429a = "-1";

    /* renamed from: b */
    public final String f121430b;

    /* renamed from: c */
    public final String f121431c;

    /* renamed from: d */
    public long f121432d;

    /* renamed from: e */
    private final String f121433e;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final void mo119346a() {
        this.f121432d++;
    }

    /* renamed from: b */
    public final boolean mo119347b() {
        return f121429a.equals(this.f121430b);
    }

    /* renamed from: c */
    public final boolean mo119348c() {
        if (this.f121432d == 0) {
            return true;
        }
        return false;
    }

    Album(Parcel parcel) {
        this.f121430b = parcel.readString();
        this.f121431c = parcel.readString();
        this.f121433e = parcel.readString();
        this.f121432d = parcel.readLong();
    }

    /* renamed from: a */
    public final String mo119345a(Context context) {
        if (mo119347b()) {
            return context.getString(R.string.c82);
        }
        return this.f121433e;
    }

    /* renamed from: a */
    public static Album m147787a(Cursor cursor) {
        Album album = new Album(cursor.getString(cursor.getColumnIndex("bucket_id")), cursor.getString(cursor.getColumnIndex("_data")), cursor.getString(cursor.getColumnIndex("bucket_display_name")), cursor.getLong(cursor.getColumnIndex("count")));
        return album;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f121430b);
        parcel.writeString(this.f121431c);
        parcel.writeString(this.f121433e);
        parcel.writeLong(this.f121432d);
    }

    private Album(String str, String str2, String str3, long j) {
        this.f121430b = str;
        this.f121431c = str2;
        this.f121433e = str3;
        this.f121432d = j;
    }
}
