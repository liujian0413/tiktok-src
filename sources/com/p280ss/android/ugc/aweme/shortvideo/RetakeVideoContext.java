package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.vesdk.VERecordData;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext */
public final class RetakeVideoContext implements Parcelable {
    public static final C38400a CREATOR = new C38400a(null);

    /* renamed from: a */
    public long f99687a;

    /* renamed from: b */
    public long f99688b;

    /* renamed from: c */
    public int f99689c;

    /* renamed from: d */
    public VERecordData f99690d;

    /* renamed from: e */
    public MultiEditVideoStatusRecordData f99691e;

    /* renamed from: f */
    public String f99692f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext$a */
    public static final class C38400a implements Creator<RetakeVideoContext> {
        private C38400a() {
        }

        /* renamed from: a */
        private static RetakeVideoContext[] m122675a(int i) {
            return new RetakeVideoContext[i];
        }

        public /* synthetic */ C38400a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122674a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122675a(i);
        }

        /* renamed from: a */
        private static RetakeVideoContext m122674a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new RetakeVideoContext(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public RetakeVideoContext() {
        String str = C39811er.f103469e;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sTmpDir");
        this.f99692f = str;
    }

    /* renamed from: a */
    public final void mo96131a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f99692f = str;
    }

    public RetakeVideoContext(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this();
        this.f99687a = parcel.readLong();
        this.f99688b = parcel.readLong();
        this.f99689c = parcel.readInt();
        this.f99690d = (VERecordData) parcel.readParcelable(VERecordData.class.getClassLoader());
        String readString = parcel.readString();
        if (readString == null) {
            readString = C39811er.f103469e;
            C7573i.m23582a((Object) readString, "ShortVideoConfig2.sTmpDir");
        }
        this.f99692f = readString;
        this.f99691e = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeLong(this.f99687a);
        parcel.writeLong(this.f99688b);
        parcel.writeInt(this.f99689c);
        parcel.writeParcelable(this.f99690d, i);
        parcel.writeString(this.f99692f);
        parcel.writeParcelable(this.f99691e, i);
    }
}
