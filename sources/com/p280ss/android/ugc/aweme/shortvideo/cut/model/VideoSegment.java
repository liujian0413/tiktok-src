package com.p280ss.android.ugc.aweme.shortvideo.cut.model;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42133c;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.vesdk.clipparam.VEClipAlgorithmParam;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment */
public class VideoSegment implements Parcelable {
    public static final Creator<VideoSegment> CREATOR = new Creator<VideoSegment>() {
        /* renamed from: a */
        private static VideoSegment[] m123865a(int i) {
            return new VideoSegment[i];
        }

        /* renamed from: a */
        private static VideoSegment m123864a(Parcel parcel) {
            return new VideoSegment(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m123864a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m123865a(i);
        }
    };

    /* renamed from: a */
    public int f100759a;

    /* renamed from: b */
    public String f100760b;

    /* renamed from: c */
    public long f100761c;

    /* renamed from: d */
    public long f100762d;

    /* renamed from: e */
    public long f100763e;

    /* renamed from: f */
    public float f100764f;

    /* renamed from: g */
    public int f100765g;

    /* renamed from: h */
    public int f100766h;

    /* renamed from: i */
    public String f100767i;

    /* renamed from: j */
    public boolean f100768j;

    /* renamed from: k */
    public int f100769k;

    /* renamed from: l */
    public float f100770l = 1.0f;

    /* renamed from: m */
    public float f100771m = 1.0f;

    /* renamed from: n */
    public String f100772n;

    /* renamed from: o */
    public String f100773o;

    /* renamed from: p */
    public StickPointVideoSegment f100774p;

    /* renamed from: q */
    public boolean f100775q;

    /* renamed from: r */
    public boolean f100776r;

    /* renamed from: s */
    public int f100777s = VEClipAlgorithmParam.BINGO_EFFECT_NULL;

    /* renamed from: t */
    public int f100778t;

    /* renamed from: u */
    public int f100779u;

    /* renamed from: v */
    public int f100780v;

    /* renamed from: w */
    public int f100781w;

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public final String mo96908g() {
        return mo96896a(true);
    }

    /* renamed from: c */
    public final int mo96902c() {
        if (this.f100778t == 0) {
            m123848l();
        }
        return this.f100778t;
    }

    /* renamed from: d */
    public final int mo96903d() {
        if (this.f100780v == 0) {
            m123848l();
        }
        return this.f100780v;
    }

    /* renamed from: e */
    public final int mo96905e() {
        if (this.f100781w == 0) {
            m123848l();
        }
        return this.f100781w;
    }

    /* renamed from: f */
    public final int mo96907f() {
        if (this.f100779u == 0) {
            m123848l();
        }
        return this.f100779u;
    }

    /* renamed from: h */
    public final long mo96909h() {
        if (mo96912k()) {
            return this.f100774p.getVideoStart();
        }
        return this.f100762d;
    }

    /* renamed from: i */
    public final long mo96910i() {
        if (mo96912k()) {
            return this.f100774p.getVideoEnd();
        }
        return this.f100763e;
    }

    /* renamed from: j */
    public final float mo96911j() {
        if (mo96912k()) {
            return this.f100774p.getSpeed();
        }
        return this.f100764f;
    }

    /* renamed from: k */
    public final boolean mo96912k() {
        if (!this.f100775q || this.f100774p == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo96900b() {
        this.f100762d = 0;
        this.f100763e = this.f100761c;
        this.f100764f = RecordingSpeed.NORMAL.value();
        this.f100769k = 0;
        this.f100768j = false;
    }

    /* renamed from: l */
    private void m123848l() {
        int[] iArr = new int[10];
        if (C42133c.m134093a(this.f100760b, iArr) == 0) {
            this.f100765g = iArr[0];
            this.f100766h = iArr[1];
            this.f100778t = iArr[7];
            this.f100781w = iArr[8];
            this.f100779u = iArr[6];
            this.f100780v = iArr[9];
        }
    }

    /* renamed from: a */
    public final boolean mo96899a() {
        if (!C42973bg.m136427a(this.f100760b)) {
            return false;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.f100760b, options);
        String str = options.outMimeType;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("png") || str.contains("jpg") || str.contains("jpeg")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo96898a(long j) {
        if (mo96912k()) {
            this.f100774p.setVideoStart(j);
        } else {
            this.f100762d = j;
        }
    }

    /* renamed from: b */
    public final void mo96901b(long j) {
        if (mo96912k()) {
            this.f100774p.setVideoEnd(j);
        } else {
            this.f100763e = j;
        }
    }

    /* renamed from: a */
    public final String mo96896a(boolean z) {
        if (!z) {
            return this.f100760b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f100759a);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo96897a(float f) {
        if (mo96912k()) {
            this.f100774p.setSpeed(1.0f);
        } else {
            this.f100764f = f;
        }
    }

    public VideoSegment(MediaModel mediaModel) {
        this.f100760b = mediaModel.f88156b;
        this.f100765g = mediaModel.f88163i;
        this.f100766h = mediaModel.f88164j;
        this.f100767i = mediaModel.f88162h;
        this.f100761c = mediaModel.f88159e;
        this.f100762d = (long) mediaModel.f88167m;
        if (mediaModel.f88168n > 0) {
            this.f100763e = (long) mediaModel.f88168n;
        } else {
            this.f100763e = this.f100761c;
        }
        this.f100764f = RecordingSpeed.NORMAL.value();
        this.f100772n = mediaModel.mo86200b();
    }

    protected VideoSegment(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f100759a = parcel.readInt();
        this.f100760b = parcel.readString();
        this.f100761c = parcel.readLong();
        this.f100762d = parcel.readLong();
        this.f100763e = parcel.readLong();
        this.f100764f = parcel.readFloat();
        this.f100765g = parcel.readInt();
        this.f100766h = parcel.readInt();
        this.f100767i = parcel.readString();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f100768j = z;
        this.f100769k = parcel.readInt();
        this.f100772n = parcel.readString();
        this.f100773o = parcel.readString();
        this.f100770l = parcel.readFloat();
        this.f100771m = parcel.readFloat();
        this.f100774p = (StickPointVideoSegment) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f100775q = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.f100776r = z3;
        this.f100777s = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSegment)) {
            return false;
        }
        VideoSegment videoSegment = (VideoSegment) obj;
        if (this.f100759a == videoSegment.f100759a && this.f100761c == videoSegment.f100761c && this.f100762d == videoSegment.f100762d && this.f100763e == videoSegment.f100763e && Float.compare(videoSegment.f100764f, this.f100764f) == 0 && this.f100765g == videoSegment.f100765g && this.f100766h == videoSegment.f100766h && this.f100768j == videoSegment.f100768j && ((this.f100760b == videoSegment.f100760b || (this.f100760b != null && this.f100760b.equals(videoSegment.f100760b))) && ((this.f100767i == videoSegment.f100767i || (this.f100767i != null && this.f100767i.equals(videoSegment.f100767i))) && ((this.f100772n == videoSegment.f100772n || (this.f100772n != null && this.f100772n.equals(videoSegment.f100772n))) && (this.f100773o == videoSegment.f100773o || (this.f100773o != null && this.f100773o.equals(videoSegment.f100773o))))))) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f100759a);
        parcel.writeString(this.f100760b);
        parcel.writeLong(this.f100761c);
        parcel.writeLong(this.f100762d);
        parcel.writeLong(this.f100763e);
        parcel.writeFloat(this.f100764f);
        parcel.writeInt(this.f100765g);
        parcel.writeInt(this.f100766h);
        parcel.writeString(this.f100767i);
        parcel.writeByte(this.f100768j ? (byte) 1 : 0);
        parcel.writeInt(this.f100769k);
        parcel.writeString(this.f100772n);
        parcel.writeString(this.f100773o);
        parcel.writeFloat(this.f100770l);
        parcel.writeFloat(this.f100771m);
        parcel.writeSerializable(this.f100774p);
        parcel.writeInt(this.f100775q ? 1 : 0);
        parcel.writeInt(this.f100776r ? 1 : 0);
        parcel.writeInt(this.f100777s);
    }

    public VideoSegment(String str, int i, int i2, int i3) {
        this.f100760b = str;
        this.f100765g = i;
        this.f100766h = i2;
        this.f100767i = "";
        long j = (long) i3;
        this.f100761c = j;
        this.f100763e = j;
        this.f100764f = RecordingSpeed.NORMAL.value();
    }
}
