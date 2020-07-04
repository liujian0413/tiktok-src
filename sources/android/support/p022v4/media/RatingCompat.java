package android.support.p022v4.media;

import android.media.Rating;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new Creator<RatingCompat>() {
        /* renamed from: a */
        private static RatingCompat[] m3306a(int i) {
            return new RatingCompat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m3305a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m3306a(i);
        }

        /* renamed from: a */
        private static RatingCompat m3305a(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    };

    /* renamed from: a */
    public final int f2935a;

    /* renamed from: b */
    private final float f2936b;

    /* renamed from: c */
    private Object f2937c;

    public final int describeContents() {
        return this.f2935a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f2935a);
        sb.append(" rating=");
        if (this.f2936b < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(this.f2936b);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static RatingCompat m3303a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return new RatingCompat(1, f);
    }

    /* renamed from: b */
    private static RatingCompat m3304b(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return new RatingCompat(2, f);
    }

    /* renamed from: a */
    private static RatingCompat m3299a(float f) {
        if (f < 0.0f || f > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f);
    }

    /* renamed from: a */
    private static RatingCompat m3300a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static RatingCompat m3302a(Object obj) {
        RatingCompat ratingCompat;
        if (obj == null || VERSION.SDK_INT < 19) {
            return null;
        }
        Rating rating = (Rating) obj;
        int ratingStyle = rating.getRatingStyle();
        if (rating.isRated()) {
            switch (ratingStyle) {
                case 1:
                    ratingCompat = m3303a(rating.hasHeart());
                    break;
                case 2:
                    ratingCompat = m3304b(rating.isThumbUp());
                    break;
                case 3:
                case 4:
                case 5:
                    ratingCompat = m3301a(ratingStyle, rating.getStarRating());
                    break;
                case 6:
                    ratingCompat = m3299a(rating.getPercentRating());
                    break;
                default:
                    return null;
            }
        } else {
            ratingCompat = m3300a(ratingStyle);
        }
        ratingCompat.f2937c = obj;
        return ratingCompat;
    }

    RatingCompat(int i, float f) {
        this.f2935a = i;
        this.f2936b = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2935a);
        parcel.writeFloat(this.f2936b);
    }

    /* renamed from: a */
    private static RatingCompat m3301a(int i, float f) {
        float f2;
        switch (i) {
            case 3:
                f2 = 3.0f;
                break;
            case 4:
                f2 = 4.0f;
                break;
            case 5:
                f2 = 5.0f;
                break;
            default:
                return null;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }
}
