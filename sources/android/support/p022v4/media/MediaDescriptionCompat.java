package android.support.p022v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new Creator<MediaDescriptionCompat>() {
        /* renamed from: a */
        private static MediaDescriptionCompat[] m3284a(int i) {
            return new MediaDescriptionCompat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m3283a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m3284a(i);
        }

        /* renamed from: a */
        private static MediaDescriptionCompat m3283a(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m3281a(C0806e.m3340a(parcel));
        }
    };

    /* renamed from: a */
    public final String f2912a;

    /* renamed from: b */
    public final CharSequence f2913b;

    /* renamed from: c */
    public final CharSequence f2914c;

    /* renamed from: d */
    public final CharSequence f2915d;

    /* renamed from: e */
    public final Bitmap f2916e;

    /* renamed from: f */
    public final Uri f2917f;

    /* renamed from: g */
    public final Bundle f2918g;

    /* renamed from: h */
    public final Uri f2919h;

    /* renamed from: i */
    private Object f2920i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0791a {

        /* renamed from: a */
        private String f2921a;

        /* renamed from: b */
        private CharSequence f2922b;

        /* renamed from: c */
        private CharSequence f2923c;

        /* renamed from: d */
        private CharSequence f2924d;

        /* renamed from: e */
        private Bitmap f2925e;

        /* renamed from: f */
        private Uri f2926f;

        /* renamed from: g */
        private Bundle f2927g;

        /* renamed from: h */
        private Uri f2928h;

        /* renamed from: a */
        public final MediaDescriptionCompat mo3070a() {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(this.f2921a, this.f2922b, this.f2923c, this.f2924d, this.f2925e, this.f2926f, this.f2927g, this.f2928h);
            return mediaDescriptionCompat;
        }

        /* renamed from: a */
        public final C0791a mo3065a(Bitmap bitmap) {
            this.f2925e = bitmap;
            return this;
        }

        /* renamed from: b */
        public final C0791a mo3071b(Uri uri) {
            this.f2928h = uri;
            return this;
        }

        /* renamed from: c */
        public final C0791a mo3073c(CharSequence charSequence) {
            this.f2924d = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C0791a mo3066a(Uri uri) {
            this.f2926f = uri;
            return this;
        }

        /* renamed from: b */
        public final C0791a mo3072b(CharSequence charSequence) {
            this.f2923c = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C0791a mo3067a(Bundle bundle) {
            this.f2927g = bundle;
            return this;
        }

        /* renamed from: a */
        public final C0791a mo3068a(CharSequence charSequence) {
            this.f2922b = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C0791a mo3069a(String str) {
            this.f2921a = str;
            return this;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2913b);
        sb.append(", ");
        sb.append(this.f2914c);
        sb.append(", ");
        sb.append(this.f2915d);
        return sb.toString();
    }

    /* renamed from: a */
    private Object m3282a() {
        if (this.f2920i != null || VERSION.SDK_INT < 21) {
            return this.f2920i;
        }
        Object a = C0807a.m3349a();
        C0807a.m3355a(a, this.f2912a);
        C0807a.m3354a(a, this.f2913b);
        C0807a.m3356b(a, this.f2914c);
        C0807a.m3357c(a, this.f2915d);
        C0807a.m3351a(a, this.f2916e);
        C0807a.m3352a(a, this.f2917f);
        Bundle bundle = this.f2918g;
        if (VERSION.SDK_INT < 23 && this.f2919h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f2919h);
        }
        C0807a.m3353a(a, bundle);
        if (VERSION.SDK_INT >= 23) {
            C0809a.m3359a(a, this.f2919h);
        }
        this.f2920i = C0807a.m3350a(a);
        return this.f2920i;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f2912a = parcel.readString();
        this.f2913b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2914c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2915d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f2916e = (Bitmap) parcel.readParcelable(classLoader);
        this.f2917f = (Uri) parcel.readParcelable(classLoader);
        this.f2918g = parcel.readBundle(classLoader);
        this.f2919h = (Uri) parcel.readParcelable(classLoader);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p022v4.media.MediaDescriptionCompat m3281a(java.lang.Object r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0085
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0085
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            java.lang.String r2 = android.support.p022v4.media.C0806e.m3341a(r6)
            r1.mo3069a(r2)
            java.lang.CharSequence r2 = android.support.p022v4.media.C0806e.m3343b(r6)
            r1.mo3068a(r2)
            java.lang.CharSequence r2 = android.support.p022v4.media.C0806e.m3344c(r6)
            r1.mo3072b(r2)
            java.lang.CharSequence r2 = android.support.p022v4.media.C0806e.m3345d(r6)
            r1.mo3073c(r2)
            android.graphics.Bitmap r2 = android.support.p022v4.media.C0806e.m3346e(r6)
            r1.mo3065a(r2)
            android.net.Uri r2 = android.support.p022v4.media.C0806e.m3347f(r6)
            r1.mo3066a(r2)
            android.os.Bundle r2 = android.support.p022v4.media.C0806e.m3348g(r6)
            if (r2 == 0) goto L_0x004a
            android.support.p022v4.media.session.MediaSessionCompat.m3530a(r2)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            android.net.Uri r3 = (android.net.Uri) r3
            goto L_0x004b
        L_0x004a:
            r3 = r0
        L_0x004b:
            if (r3 == 0) goto L_0x0067
            java.lang.String r4 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r4 = r2.containsKey(r4)
            if (r4 == 0) goto L_0x005d
            int r4 = r2.size()
            r5 = 2
            if (r4 != r5) goto L_0x005d
            goto L_0x0068
        L_0x005d:
            java.lang.String r0 = "android.support.v4.media.description.MEDIA_URI"
            r2.remove(r0)
            java.lang.String r0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r2.remove(r0)
        L_0x0067:
            r0 = r2
        L_0x0068:
            r1.mo3067a(r0)
            if (r3 == 0) goto L_0x0071
            r1.mo3071b(r3)
            goto L_0x007e
        L_0x0071:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007e
            android.net.Uri r0 = android.support.p022v4.media.C0808f.m3358a(r6)
            r1.mo3071b(r0)
        L_0x007e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo3070a()
            r0.f2920i = r6
            return r0
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.media.MediaDescriptionCompat.m3281a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f2912a);
            TextUtils.writeToParcel(this.f2913b, parcel, i);
            TextUtils.writeToParcel(this.f2914c, parcel, i);
            TextUtils.writeToParcel(this.f2915d, parcel, i);
            parcel.writeParcelable(this.f2916e, i);
            parcel.writeParcelable(this.f2917f, i);
            parcel.writeBundle(this.f2918g);
            parcel.writeParcelable(this.f2919h, i);
            return;
        }
        C0806e.m3342a(m3282a(), parcel, i);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2912a = str;
        this.f2913b = charSequence;
        this.f2914c = charSequence2;
        this.f2915d = charSequence3;
        this.f2916e = bitmap;
        this.f2917f = uri;
        this.f2918g = bundle;
        this.f2919h = uri2;
    }
}
