package com.zhihu.matisse.internal.entity;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.provider.MediaStore.Files;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import com.zhihu.matisse.MimeType;

public class Item implements Parcelable {
    public static final Creator<Item> CREATOR = new Creator<Item>() {
        /* renamed from: a */
        private static Item[] m147800a(int i) {
            return new Item[i];
        }

        /* renamed from: a */
        private static Item m147799a(Parcel parcel) {
            return new Item(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147799a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147800a(i);
        }
    };

    /* renamed from: a */
    public final long f121434a;

    /* renamed from: b */
    public final String f121435b;

    /* renamed from: c */
    public final Uri f121436c;

    /* renamed from: d */
    public final long f121437d;

    /* renamed from: e */
    public final long f121438e;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo119353a() {
        if (this.f121434a == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo119355c() {
        if (this.f121435b == null) {
            return false;
        }
        return this.f121435b.equals(MimeType.GIF.toString());
    }

    public int hashCode() {
        int hashCode = Long.valueOf(this.f121434a).hashCode() + 31;
        if (this.f121435b != null) {
            hashCode = (hashCode * 31) + this.f121435b.hashCode();
        }
        return (((((hashCode * 31) + this.f121436c.hashCode()) * 31) + Long.valueOf(this.f121437d).hashCode()) * 31) + Long.valueOf(this.f121438e).hashCode();
    }

    /* renamed from: b */
    public final boolean mo119354b() {
        if (this.f121435b == null) {
            return false;
        }
        if (this.f121435b.equals(MimeType.JPEG.toString()) || this.f121435b.equals(MimeType.PNG.toString()) || this.f121435b.equals(MimeType.GIF.toString()) || this.f121435b.equals(MimeType.BMP.toString()) || this.f121435b.equals(MimeType.WEBP.toString())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo119356d() {
        if (this.f121435b == null) {
            return false;
        }
        if (this.f121435b.equals(MimeType.MPEG.toString()) || this.f121435b.equals(MimeType.MP4.toString()) || this.f121435b.equals(MimeType.QUICKTIME.toString()) || this.f121435b.equals(MimeType.THREEGPP.toString()) || this.f121435b.equals(MimeType.THREEGPP2.toString()) || this.f121435b.equals(MimeType.MKV.toString()) || this.f121435b.equals(MimeType.WEBM.toString()) || this.f121435b.equals(MimeType.TS.toString()) || this.f121435b.equals(MimeType.AVI.toString())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Item m147794a(Cursor cursor) {
        Item item = new Item(cursor.getLong(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("mime_type")), cursor.getLong(cursor.getColumnIndex("_size")), cursor.getLong(cursor.getColumnIndex("duration")));
        return item;
    }

    private Item(Parcel parcel) {
        this.f121434a = parcel.readLong();
        this.f121435b = parcel.readString();
        this.f121436c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f121437d = parcel.readLong();
        this.f121438e = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        if (this.f121434a != item.f121434a || (((this.f121435b == null || !this.f121435b.equals(item.f121435b)) && (this.f121435b != null || item.f121435b != null)) || (((this.f121436c == null || !this.f121436c.equals(item.f121436c)) && (this.f121436c != null || item.f121436c != null)) || this.f121437d != item.f121437d || this.f121438e != item.f121438e))) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f121434a);
        parcel.writeString(this.f121435b);
        parcel.writeParcelable(this.f121436c, 0);
        parcel.writeLong(this.f121437d);
        parcel.writeLong(this.f121438e);
    }

    private Item(long j, String str, long j2, long j3) {
        Uri uri;
        this.f121434a = j;
        this.f121435b = str;
        if (mo119354b()) {
            uri = Media.EXTERNAL_CONTENT_URI;
        } else if (mo119356d()) {
            uri = Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = Files.getContentUri("external");
        }
        this.f121436c = ContentUris.withAppendedId(uri, j);
        this.f121437d = j2;
        this.f121438e = j3;
    }
}
