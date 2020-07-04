package android.support.p022v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new Creator<PlaybackStateCompat>() {
        /* renamed from: a */
        private static PlaybackStateCompat[] m3685a(int i) {
            return new PlaybackStateCompat[i];
        }

        /* renamed from: a */
        private static PlaybackStateCompat m3684a(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m3684a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m3685a(i);
        }
    };

    /* renamed from: a */
    public final int f3063a;

    /* renamed from: b */
    public final long f3064b;

    /* renamed from: c */
    public final long f3065c;

    /* renamed from: d */
    public final float f3066d;

    /* renamed from: e */
    public final long f3067e;

    /* renamed from: f */
    public final int f3068f;

    /* renamed from: g */
    public final CharSequence f3069g;

    /* renamed from: h */
    public final long f3070h;

    /* renamed from: i */
    public List<CustomAction> f3071i;

    /* renamed from: j */
    public final long f3072j;

    /* renamed from: k */
    public final Bundle f3073k;

    /* renamed from: l */
    private Object f3074l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new Creator<CustomAction>() {
            /* renamed from: a */
            private static CustomAction[] m3688a(int i) {
                return new CustomAction[i];
            }

            /* renamed from: a */
            private static CustomAction m3687a(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3687a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m3688a(i);
            }
        };

        /* renamed from: a */
        public final String f3075a;

        /* renamed from: b */
        public final CharSequence f3076b;

        /* renamed from: c */
        public final int f3077c;

        /* renamed from: d */
        public final Bundle f3078d;

        /* renamed from: e */
        private Object f3079e;

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action:mName='");
            sb.append(this.f3076b);
            sb.append(", mIcon=");
            sb.append(this.f3077c);
            sb.append(", mExtras=");
            sb.append(this.f3078d);
            return sb.toString();
        }

        CustomAction(Parcel parcel) {
            this.f3075a = parcel.readString();
            this.f3076b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3077c = parcel.readInt();
            this.f3078d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        /* renamed from: a */
        public static CustomAction m3686a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0872a.m3727a(obj), C0872a.m3728b(obj), C0872a.m3729c(obj), C0872a.m3730d(obj));
            customAction.f3079e = obj;
            return customAction;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3075a);
            TextUtils.writeToParcel(this.f3076b, parcel, i);
            parcel.writeInt(this.f3077c);
            parcel.writeBundle(this.f3078d);
        }

        private CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f3075a = str;
            this.f3076b = charSequence;
            this.f3077c = i;
            this.f3078d = bundle;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public static final class C0862a {

        /* renamed from: a */
        private final List<CustomAction> f3080a = new ArrayList();

        /* renamed from: b */
        private int f3081b;

        /* renamed from: c */
        private long f3082c;

        /* renamed from: d */
        private long f3083d;

        /* renamed from: e */
        private float f3084e;

        /* renamed from: f */
        private long f3085f;

        /* renamed from: g */
        private int f3086g;

        /* renamed from: h */
        private CharSequence f3087h;

        /* renamed from: i */
        private long f3088i;

        /* renamed from: j */
        private long f3089j = -1;

        /* renamed from: k */
        private Bundle f3090k;

        public C0862a() {
        }

        /* renamed from: a */
        public final PlaybackStateCompat mo3243a() {
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(this.f3081b, this.f3082c, this.f3083d, this.f3084e, this.f3085f, this.f3086g, this.f3087h, this.f3088i, this.f3080a, this.f3089j, this.f3090k);
            return playbackStateCompat;
        }

        public C0862a(PlaybackStateCompat playbackStateCompat) {
            this.f3081b = playbackStateCompat.f3063a;
            this.f3082c = playbackStateCompat.f3064b;
            this.f3084e = playbackStateCompat.f3066d;
            this.f3088i = playbackStateCompat.f3070h;
            this.f3083d = playbackStateCompat.f3065c;
            this.f3085f = playbackStateCompat.f3067e;
            this.f3086g = playbackStateCompat.f3068f;
            this.f3087h = playbackStateCompat.f3069g;
            if (playbackStateCompat.f3071i != null) {
                this.f3080a.addAll(playbackStateCompat.f3071i);
            }
            this.f3089j = playbackStateCompat.f3072j;
            this.f3090k = playbackStateCompat.f3073k;
        }

        /* renamed from: a */
        public final C0862a mo3242a(int i, long j, float f, long j2) {
            this.f3081b = i;
            this.f3082c = j;
            this.f3088i = j2;
            this.f3084e = f;
            return this;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f3063a);
        sb.append(", position=");
        sb.append(this.f3064b);
        sb.append(", buffered position=");
        sb.append(this.f3065c);
        sb.append(", speed=");
        sb.append(this.f3066d);
        sb.append(", updated=");
        sb.append(this.f3070h);
        sb.append(", actions=");
        sb.append(this.f3067e);
        sb.append(", error code=");
        sb.append(this.f3068f);
        sb.append(", error message=");
        sb.append(this.f3069g);
        sb.append(", custom actions=");
        sb.append(this.f3071i);
        sb.append(", active item id=");
        sb.append(this.f3072j);
        sb.append("}");
        return sb.toString();
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f3063a = parcel.readInt();
        this.f3064b = parcel.readLong();
        this.f3066d = parcel.readFloat();
        this.f3070h = parcel.readLong();
        this.f3065c = parcel.readLong();
        this.f3067e = parcel.readLong();
        this.f3069g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3071i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f3072j = parcel.readLong();
        this.f3073k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f3068f = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m3683a(Object obj) {
        List list;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> h = C0871c.m3725h(obj);
        if (h != null) {
            ArrayList arrayList = new ArrayList(h.size());
            for (Object a : h) {
                arrayList.add(CustomAction.m3686a(a));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            bundle = C0873d.m3731a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0871c.m3718a(obj), C0871c.m3719b(obj), C0871c.m3720c(obj), C0871c.m3721d(obj), C0871c.m3722e(obj), 0, C0871c.m3723f(obj), C0871c.m3724g(obj), list, C0871c.m3726i(obj), bundle);
        playbackStateCompat.f3074l = obj2;
        return playbackStateCompat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3063a);
        parcel.writeLong(this.f3064b);
        parcel.writeFloat(this.f3066d);
        parcel.writeLong(this.f3070h);
        parcel.writeLong(this.f3065c);
        parcel.writeLong(this.f3067e);
        TextUtils.writeToParcel(this.f3069g, parcel, i);
        parcel.writeTypedList(this.f3071i);
        parcel.writeLong(this.f3072j);
        parcel.writeBundle(this.f3073k);
        parcel.writeInt(this.f3068f);
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f3063a = i;
        this.f3064b = j;
        this.f3065c = j2;
        this.f3066d = f;
        this.f3067e = j3;
        this.f3068f = i2;
        this.f3069g = charSequence;
        this.f3070h = j4;
        this.f3071i = new ArrayList(list);
        this.f3072j = j5;
        this.f3073k = bundle;
    }
}
