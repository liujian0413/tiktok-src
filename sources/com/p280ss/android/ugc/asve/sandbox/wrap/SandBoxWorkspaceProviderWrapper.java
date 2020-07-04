package com.p280ss.android.ugc.asve.sandbox.wrap;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.asve.recorder.C20733d;

/* renamed from: com.ss.android.ugc.asve.sandbox.wrap.SandBoxWorkspaceProviderWrapper */
public class SandBoxWorkspaceProviderWrapper implements Parcelable {
    public static final Creator<SandBoxWorkspaceProviderWrapper> CREATOR = new Creator<SandBoxWorkspaceProviderWrapper>() {
        /* renamed from: a */
        private static SandBoxWorkspaceProviderWrapper[] m71064a(int i) {
            return new SandBoxWorkspaceProviderWrapper[i];
        }

        /* renamed from: a */
        private static SandBoxWorkspaceProviderWrapper m71063a(Parcel parcel) {
            return new SandBoxWorkspaceProviderWrapper(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m71063a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m71064a(i);
        }
    };

    /* renamed from: a */
    public String f56577a;

    /* renamed from: b */
    public String f56578b;

    /* renamed from: c */
    public String f56579c;

    /* renamed from: d */
    public String f56580d;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SandBoxWorkspaceProviderWrapper{workspace='");
        sb.append(this.f56577a);
        sb.append('\'');
        sb.append(", segmentPath='");
        sb.append(this.f56578b);
        sb.append('\'');
        sb.append(", concatSegmentVideoPath='");
        sb.append(this.f56579c);
        sb.append('\'');
        sb.append(", concatSegmentAudioPath='");
        sb.append(this.f56580d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    protected SandBoxWorkspaceProviderWrapper(Parcel parcel) {
        this.f56577a = parcel.readString();
        this.f56578b = parcel.readString();
        this.f56579c = parcel.readString();
        this.f56580d = parcel.readString();
    }

    public SandBoxWorkspaceProviderWrapper(C20733d dVar) {
        this.f56577a = dVar.mo38982a().getAbsolutePath();
        this.f56578b = dVar.mo38984b().getAbsolutePath();
        this.f56579c = dVar.mo38986c().getAbsolutePath();
        this.f56580d = dVar.mo38987d().getAbsolutePath();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56577a);
        parcel.writeString(this.f56578b);
        parcel.writeString(this.f56579c);
        parcel.writeString(this.f56580d);
    }
}
