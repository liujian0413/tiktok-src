package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.asve.context.C15426e;
import com.p280ss.android.ugc.asve.context.PreviewSize;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper */
public class SandBoxASContextWrapper implements Parcelable {
    public static final Creator<SandBoxASContextWrapper> CREATOR = new Creator<SandBoxASContextWrapper>() {
        /* renamed from: a */
        private static SandBoxASContextWrapper[] m71054a(int i) {
            return new SandBoxASContextWrapper[i];
        }

        /* renamed from: a */
        private static SandBoxASContextWrapper m71053a(Parcel parcel) {
            return new SandBoxASContextWrapper(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m71053a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m71054a(i);
        }
    };

    /* renamed from: a */
    public boolean f56528a;

    /* renamed from: b */
    public int f56529b;

    /* renamed from: c */
    public boolean f56530c;

    /* renamed from: d */
    public String f56531d;

    /* renamed from: e */
    public int f56532e;

    /* renamed from: f */
    public int f56533f;

    /* renamed from: g */
    public boolean f56534g;

    /* renamed from: h */
    public String f56535h;

    /* renamed from: i */
    public boolean f56536i;

    /* renamed from: j */
    public boolean f56537j;

    /* renamed from: k */
    public int f56538k;

    /* renamed from: l */
    public boolean f56539l;

    /* renamed from: m */
    public String f56540m;

    /* renamed from: n */
    public String f56541n;

    /* renamed from: o */
    public String f56542o;

    /* renamed from: p */
    public String f56543p;

    /* renamed from: q */
    public String f56544q;

    /* renamed from: r */
    public int f56545r;

    /* renamed from: s */
    public int f56546s;

    /* renamed from: t */
    public int f56547t;

    /* renamed from: u */
    public boolean f56548u;

    /* renamed from: v */
    public boolean f56549v;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxASContextWrapper{isUseVERecorder=");
        sb.append(this.f56528a);
        sb.append(", monitorServerLocation=");
        sb.append(this.f56529b);
        sb.append(", enableAsyncInitMonitor=");
        sb.append(this.f56530c);
        sb.append(", workspace='");
        sb.append(this.f56531d);
        sb.append('\'');
        sb.append(", importOption=");
        sb.append(this.f56532e);
        sb.append(", minHDH264Side=");
        sb.append(this.f56533f);
        sb.append(", enableTT265Decoder=");
        sb.append(this.f56534g);
        sb.append(", amazingShareDir='");
        sb.append(this.f56535h);
        sb.append('\'');
        sb.append(", useBuiltinAmazing=");
        sb.append(this.f56536i);
        sb.append(", useNewEffectAlgorithmApi=");
        sb.append(this.f56537j);
        sb.append(", wideCameraCloudInfo=");
        sb.append(this.f56538k);
        sb.append(", cloudWideCameraSwitch=");
        sb.append(this.f56539l);
        sb.append(", effectModelDownloadPath='");
        sb.append(this.f56540m);
        sb.append('\'');
        sb.append(", deviceId='");
        sb.append(this.f56541n);
        sb.append('\'');
        sb.append(", sdkVersion='");
        sb.append(this.f56542o);
        sb.append('\'');
        sb.append(", userId='");
        sb.append(this.f56543p);
        sb.append('\'');
        sb.append(", veRuntimeConfig='");
        sb.append(this.f56544q);
        sb.append('\'');
        sb.append(", previewWidth=");
        sb.append(this.f56545r);
        sb.append(", previewHeight=");
        sb.append(this.f56546s);
        sb.append(", recordOutputCategory=");
        sb.append(this.f56547t);
        sb.append(", enableOpengl3=");
        sb.append(this.f56548u);
        sb.append(", enableHDH264HWDecoder=");
        sb.append(this.f56549v);
        sb.append('}');
        return sb.toString();
    }

    protected SandBoxASContextWrapper(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f56528a = z;
        this.f56529b = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f56530c = z2;
        this.f56531d = parcel.readString();
        this.f56532e = parcel.readInt();
        this.f56533f = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f56534g = z3;
        this.f56535h = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f56536i = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f56537j = z5;
        this.f56538k = parcel.readInt();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f56539l = z6;
        this.f56540m = parcel.readString();
        this.f56541n = parcel.readString();
        this.f56542o = parcel.readString();
        this.f56543p = parcel.readString();
        this.f56544q = parcel.readString();
        this.f56545r = parcel.readInt();
        this.f56546s = parcel.readInt();
        this.f56547t = parcel.readInt();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f56548u = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        }
        this.f56549v = z8;
    }

    public SandBoxASContextWrapper(C15426e eVar) {
        this.f56528a = eVar.mo38951h();
        this.f56529b = eVar.mo38952i().getValue();
        this.f56530c = eVar.mo38954k();
        this.f56531d = eVar.mo38955l().getAbsolutePath();
        this.f56532e = eVar.mo38956m();
        this.f56533f = eVar.mo38958o();
        this.f56534g = eVar.mo38959p();
        this.f56535h = eVar.mo38960q().getAbsolutePath();
        this.f56536i = eVar.mo38961r();
        this.f56537j = eVar.mo38962s();
        this.f56538k = eVar.mo38963t();
        this.f56539l = eVar.mo38964u();
        this.f56540m = eVar.mo38950g();
        this.f56541n = eVar.mo38967x().f116729c;
        this.f56543p = eVar.mo38967x().f116728b;
        this.f56542o = eVar.mo38967x().f116727a;
        this.f56548u = eVar.mo38953j();
        this.f56549v = eVar.mo38957n();
        PreviewSize y = eVar.mo38968y();
        if (y != null) {
            this.f56546s = y.getHeight();
            this.f56545r = y.getWidth();
        }
        this.f56544q = eVar.mo38969z();
        this.f56547t = eVar.mo38965v();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f56528a ? (byte) 1 : 0);
        parcel.writeInt(this.f56529b);
        parcel.writeByte(this.f56530c ? (byte) 1 : 0);
        parcel.writeString(this.f56531d);
        parcel.writeInt(this.f56532e);
        parcel.writeInt(this.f56533f);
        parcel.writeByte(this.f56534g ? (byte) 1 : 0);
        parcel.writeString(this.f56535h);
        parcel.writeByte(this.f56536i ? (byte) 1 : 0);
        parcel.writeByte(this.f56537j ? (byte) 1 : 0);
        parcel.writeInt(this.f56538k);
        parcel.writeByte(this.f56539l ? (byte) 1 : 0);
        parcel.writeString(this.f56540m);
        parcel.writeString(this.f56541n);
        parcel.writeString(this.f56542o);
        parcel.writeString(this.f56543p);
        parcel.writeString(this.f56544q);
        parcel.writeInt(this.f56545r);
        parcel.writeInt(this.f56546s);
        parcel.writeInt(this.f56547t);
        parcel.writeByte(this.f56548u ? (byte) 1 : 0);
        parcel.writeByte(this.f56549v ? (byte) 1 : 0);
    }
}
