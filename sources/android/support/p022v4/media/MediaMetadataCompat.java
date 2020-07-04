package android.support.p022v4.media;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.media.session.MediaSessionCompat;
import android.support.p022v4.util.ArrayMap;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new Creator<MediaMetadataCompat>() {
        /* renamed from: a */
        private static MediaMetadataCompat[] m3298a(int i) {
            return new MediaMetadataCompat[i];
        }

        /* renamed from: a */
        private static MediaMetadataCompat m3297a(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m3297a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m3298a(i);
        }
    };

    /* renamed from: a */
    static final ArrayMap<String, Integer> f2929a;

    /* renamed from: c */
    private static final String[] f2930c = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: d */
    private static final String[] f2931d = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: e */
    private static final String[] f2932e = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b */
    final Bundle f2933b;

    /* renamed from: f */
    private Object f2934f;

    public final int describeContents() {
        return 0;
    }

    static {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        f2929a = arrayMap;
        arrayMap.put("android.media.metadata.TITLE", Integer.valueOf(1));
        f2929a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        f2929a.put("android.media.metadata.DURATION", Integer.valueOf(0));
        f2929a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        f2929a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        f2929a.put("android.media.metadata.WRITER", Integer.valueOf(1));
        f2929a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        f2929a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        f2929a.put("android.media.metadata.DATE", Integer.valueOf(1));
        f2929a.put("android.media.metadata.YEAR", Integer.valueOf(0));
        f2929a.put("android.media.metadata.GENRE", Integer.valueOf(1));
        f2929a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        f2929a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        f2929a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        f2929a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        f2929a.put("android.media.metadata.ART", Integer.valueOf(2));
        f2929a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        f2929a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        f2929a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        f2929a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        f2929a.put("android.media.metadata.RATING", Integer.valueOf(3));
        f2929a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        f2929a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        f2929a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        f2929a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        f2929a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        f2929a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
        f2929a.put("android.media.metadata.BT_FOLDER_TYPE", Integer.valueOf(0));
        f2929a.put("android.media.metadata.MEDIA_URI", Integer.valueOf(1));
        f2929a.put("android.media.metadata.ADVERTISEMENT", Integer.valueOf(0));
        f2929a.put("android.media.metadata.DOWNLOAD_STATUS", Integer.valueOf(0));
    }

    /* renamed from: a */
    public final boolean mo3074a(String str) {
        return this.f2933b.containsKey(str);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f2933b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: b */
    public final long mo3075b(String str) {
        return this.f2933b.getLong(str, 0);
    }

    /* renamed from: a */
    public static MediaMetadataCompat m3294a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0810g.m3360a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f2934f = obj;
        return mediaMetadataCompat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f2933b);
    }
}
