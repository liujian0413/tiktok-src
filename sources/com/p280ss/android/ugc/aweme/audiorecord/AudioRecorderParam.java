package com.p280ss.android.ugc.aweme.audiorecord;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.Stack;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam */
public final class AudioRecorderParam implements Parcelable, Serializable {
    public static final C23108a CREATOR = new C23108a(null);
    private int audioRecordIndex;
    @C6593c(mo15949a = "audiourl")
    private String audioUrl;
    @C6593c(mo15949a = "extraurl")
    private String extraUrl;
    @C6593c(mo15949a = "mstack")
    private Stack<Point> mStack;
    private boolean needDel;
    @C6593c(mo15949a = "needoriginalsound")
    private boolean needOriginalSound;
    @C6593c(mo15949a = "voicevolume")
    private float voiceVolume;

    /* renamed from: com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam$a */
    public static final class C23108a implements Creator<AudioRecorderParam> {
        private C23108a() {
        }

        /* renamed from: a */
        private static AudioRecorderParam[] m75949a(int i) {
            return new AudioRecorderParam[i];
        }

        public /* synthetic */ C23108a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m75948a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m75949a(i);
        }

        /* renamed from: a */
        private static AudioRecorderParam m75948a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new AudioRecorderParam(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getAudioRecordIndex() {
        return this.audioRecordIndex;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final String getExtraUrl() {
        return this.extraUrl;
    }

    public final Stack<Point> getMStack() {
        return this.mStack;
    }

    public final boolean getNeedDel() {
        return this.needDel;
    }

    public final boolean getNeedOriginalSound() {
        return this.needOriginalSound;
    }

    public final float getVoiceVolume() {
        return this.voiceVolume;
    }

    public AudioRecorderParam() {
        this.mStack = new Stack<>();
        this.needOriginalSound = true;
        this.audioUrl = "";
        this.extraUrl = "";
        this.audioRecordIndex = -1;
    }

    public final boolean hasRecord() {
        if (TextUtils.isEmpty(this.audioUrl) || this.mStack.empty()) {
            return false;
        }
        return true;
    }

    public final String getAudioUrlWithoutDraft() {
        if (!C7634n.m23723c(this.audioUrl, "df", false)) {
            return "";
        }
        String str = this.audioUrl;
        int length = this.audioUrl.length() - 2;
        if (str != null) {
            String substring = str.substring(0, length);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final String getDraftAudioUrl() {
        if (C7634n.m23723c(this.audioUrl, "df", false)) {
            return this.audioUrl;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.audioUrl);
        sb.append("df");
        return sb.toString();
    }

    public final void setAudioRecordIndex(int i) {
        this.audioRecordIndex = i;
    }

    public final void setNeedDel(boolean z) {
        this.needDel = z;
    }

    public final void setNeedOriginalSound(boolean z) {
        this.needOriginalSound = z;
    }

    public final void setVoiceVolume(float f) {
        this.voiceVolume = f;
    }

    public final void setAudioUrl(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.audioUrl = str;
    }

    public final void setExtraUrl(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.extraUrl = str;
    }

    public final void setMStack(Stack<Point> stack) {
        C7573i.m23587b(stack, "<set-?>");
        this.mStack = stack;
    }

    public final void copyFrom(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam != null) {
            this.voiceVolume = audioRecorderParam.voiceVolume;
            this.needOriginalSound = audioRecorderParam.needOriginalSound;
            this.needDel = audioRecorderParam.needDel;
            this.voiceVolume = audioRecorderParam.voiceVolume;
            this.audioRecordIndex = audioRecorderParam.audioRecordIndex;
            this.audioUrl = audioRecorderParam.audioUrl;
            this.extraUrl = audioRecorderParam.extraUrl;
            this.mStack.clear();
            this.mStack.addAll(audioRecorderParam.mStack);
        }
    }

    public AudioRecorderParam(Parcel parcel) {
        boolean z;
        C7573i.m23587b(parcel, "parcel");
        this();
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable != null) {
            this.mStack = (Stack) readSerializable;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.needOriginalSound = z;
            String readString = parcel.readString();
            C7573i.m23582a((Object) readString, "parcel.readString()");
            this.audioUrl = readString;
            this.voiceVolume = parcel.readFloat();
            String readString2 = parcel.readString();
            C7573i.m23582a((Object) readString2, "parcel.readString()");
            this.extraUrl = readString2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Stack<com.ss.android.ugc.aweme.audiorecord.Point>");
    }

    public final boolean hasChange(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam != null) {
            Stack stack = new Stack();
            Stack stack2 = new Stack();
            stack.addAll(this.mStack);
            stack2.addAll(audioRecorderParam.mStack);
            if (stack.size() != stack2.size()) {
                return true;
            }
            while (!stack.isEmpty() && !stack2.empty()) {
                Point point = (Point) stack.pop();
                Point point2 = (Point) stack2.pop();
                C7573i.m23582a((Object) point2, "b");
                if (!point.isEqual(point2)) {
                    return true;
                }
            }
            if (this.needOriginalSound != audioRecorderParam.needOriginalSound) {
                return true;
            }
            return false;
        } else if (!this.mStack.empty() || !this.needOriginalSound) {
            return true;
        } else {
            return false;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeSerializable(this.mStack);
        parcel.writeByte(this.needOriginalSound ? (byte) 1 : 0);
        parcel.writeString(this.audioUrl);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeString(this.extraUrl);
    }
}
