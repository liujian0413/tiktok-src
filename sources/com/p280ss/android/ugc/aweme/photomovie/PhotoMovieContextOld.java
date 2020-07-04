package com.p280ss.android.ugc.aweme.photomovie;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.photomovie.edit.cover.C34882a.C34883a;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieContextOld */
public class PhotoMovieContextOld extends BaseShortVideoContext implements Parcelable {
    public static final Creator<PhotoMovieContext> CREATOR = new Creator<PhotoMovieContext>() {
        /* renamed from: a */
        private static PhotoMovieContext[] m112307a(int i) {
            return new PhotoMovieContext[i];
        }

        /* renamed from: a */
        private static PhotoMovieContext m112306a(Parcel parcel) {
            return new PhotoMovieContext(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m112306a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m112307a(i);
        }
    };

    /* renamed from: a */
    public String f90818a;

    /* renamed from: b */
    public List<String> f90819b;

    /* renamed from: c */
    public String f90820c;

    /* renamed from: d */
    public List<AVMusic> f90821d = new ArrayList();

    /* renamed from: e */
    public int f90822e;

    /* renamed from: f */
    public int f90823f;

    /* renamed from: g */
    public int f90824g;

    /* renamed from: h */
    public String f90825h;

    /* renamed from: i */
    public String f90826i;

    /* renamed from: j */
    public float f90827j;

    /* renamed from: k */
    public AVMusic f90828k;

    /* renamed from: l */
    public String f90829l;

    /* renamed from: m */
    public int f90830m;

    /* renamed from: n */
    public String f90831n;

    /* renamed from: o */
    public int f90832o;

    /* renamed from: p */
    public int f90833p;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieContextOld$a */
    public interface C34824a {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final String mo88329a() {
        if (C6307b.m19566a((Collection<T>) this.f90819b) || getVideoLength() == 0) {
            return null;
        }
        return (String) this.f90819b.get(new C34883a().mo88417a(this.f90819b.size(), this.f90827j / ((((float) getVideoLength()) * 1.0f) / 1000.0f)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f90818a);
        parcel.writeStringList(this.f90819b);
        parcel.writeString(this.f90831n);
        parcel.writeString(this.f90820c);
        parcel.writeInt(this.f90822e);
        parcel.writeInt(this.f90823f);
        parcel.writeInt(this.f90824g);
        parcel.writeString(this.f90825h);
        parcel.writeString(this.f90826i);
        parcel.writeFloat(this.f90827j);
        parcel.writeSerializable(this.f90828k);
        parcel.writeString(this.f90829l);
        parcel.writeInt(this.f90830m);
        parcel.writeInt(this.f90832o);
        parcel.writeInt(this.f90833p);
    }
}
