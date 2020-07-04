package com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam */
public final class AudioEffectParam implements Parcelable, Serializable {
    public static final C39419a CREATOR = new C39419a(null);
    @C6593c(mo15949a = "effectPath")
    private String effectPath;
    @C6593c(mo15949a = "effectTag")
    private String effectTag;
    @C6593c(mo15949a = "preprocessResult")
    private byte[] preprocessResult;
    @C6593c(mo15949a = "seqIn")
    private int seqIn;
    @C6593c(mo15949a = "seqOut")
    private int seqOut;
    private boolean showErrorToast;
    @C6593c(mo15949a = "trackIndex")
    private int trackIndex;
    @C6593c(mo15949a = "trackType")
    private int trackType;
    @C6593c(mo15949a = "uploadId")
    private String uploadId;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam$a */
    public static final class C39419a implements Creator<AudioEffectParam> {
        private C39419a() {
        }

        /* renamed from: a */
        private static AudioEffectParam[] m125912a(int i) {
            return new AudioEffectParam[i];
        }

        public /* synthetic */ C39419a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m125911a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m125912a(i);
        }

        /* renamed from: a */
        private static AudioEffectParam m125911a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new AudioEffectParam(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String getEffectPath() {
        return this.effectPath;
    }

    public final String getEffectTag() {
        return this.effectTag;
    }

    public final byte[] getPreprocessResult() {
        return this.preprocessResult;
    }

    public final int getSeqIn() {
        return this.seqIn;
    }

    public final int getSeqOut() {
        return this.seqOut;
    }

    public final boolean getShowErrorToast() {
        return this.showErrorToast;
    }

    public final int getTrackIndex() {
        return this.trackIndex;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final String getUploadId() {
        return this.uploadId;
    }

    public final void setPreprocessResult(byte[] bArr) {
        this.preprocessResult = bArr;
    }

    public final void setSeqIn(int i) {
        this.seqIn = i;
    }

    public final void setSeqOut(int i) {
        this.seqOut = i;
    }

    public final void setShowErrorToast(boolean z) {
        this.showErrorToast = z;
    }

    public final void setTrackIndex(int i) {
        this.trackIndex = i;
    }

    public final void setTrackType(int i) {
        this.trackType = i;
    }

    public final void setEffectPath(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.effectPath = str;
    }

    public final void setEffectTag(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.effectTag = str;
    }

    public final void setUploadId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.uploadId = str;
    }

    public AudioEffectParam(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        String str = readString;
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        String str2 = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        this(str, readInt, readInt2, str2, readString3, parcel.readInt(), parcel.readInt(), parcel.createByteArray());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(this.uploadId);
        parcel.writeInt(this.trackType);
        parcel.writeInt(this.trackIndex);
        parcel.writeString(this.effectPath);
        parcel.writeString(this.effectTag);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeByteArray(this.preprocessResult);
    }

    public AudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, byte[] bArr) {
        C7573i.m23587b(str, "uploadId");
        C7573i.m23587b(str2, "effectPath");
        C7573i.m23587b(str3, "effectTag");
        this.uploadId = str;
        this.trackType = i;
        this.trackIndex = i2;
        this.effectPath = str2;
        this.effectTag = str3;
        this.seqIn = i3;
        this.seqOut = i4;
        this.preprocessResult = bArr;
    }

    public /* synthetic */ AudioEffectParam(String str, int i, int i2, String str2, String str3, int i3, int i4, byte[] bArr, int i5, C7571f fVar) {
        String str4;
        int i6;
        int i7;
        String str5;
        String str6;
        int i8;
        int i9;
        if ((i5 & 1) != 0) {
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i5 & 2) != 0) {
            i6 = 0;
        } else {
            i6 = i;
        }
        if ((i5 & 4) != 0) {
            i7 = 0;
        } else {
            i7 = i2;
        }
        if ((i5 & 8) != 0) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i5 & 16) != 0) {
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i5 & 32) != 0) {
            i8 = 0;
        } else {
            i8 = i3;
        }
        if ((i5 & 64) != 0) {
            i9 = 0;
        } else {
            i9 = i4;
        }
        this(str4, i6, i7, str5, str6, i8, i9, bArr);
    }
}
