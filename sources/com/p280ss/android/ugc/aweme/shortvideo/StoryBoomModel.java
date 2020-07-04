package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.StoryBoomModel */
public final class StoryBoomModel implements Parcelable, Serializable {
    public static final C38408a CREATOR = new C38408a(null);
    private int fps;
    private String originVideoPath;
    private int replayTime;
    private String reverseVideoPath;
    private int singleDuration;
    private int totalDuration;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.StoryBoomModel$a */
    public static final class C38408a implements Creator<StoryBoomModel> {
        private C38408a() {
        }

        /* renamed from: a */
        private static StoryBoomModel[] m122751a(int i) {
            return new StoryBoomModel[i];
        }

        public /* synthetic */ C38408a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122750a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122751a(i);
        }

        /* renamed from: a */
        private static StoryBoomModel m122750a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new StoryBoomModel(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getFps() {
        return this.fps;
    }

    public final String getOriginVideoPath() {
        return this.originVideoPath;
    }

    public final int getReplayTime() {
        return this.replayTime;
    }

    public final String getReverseVideoPath() {
        return this.reverseVideoPath;
    }

    public final int getSingleDuration() {
        return this.singleDuration;
    }

    public final int getTotalDuration() {
        return this.totalDuration;
    }

    public StoryBoomModel() {
        this.replayTime = 3;
        this.fps = 20;
    }

    public final String[] getVideoList() {
        List arrayList = new ArrayList();
        int i = this.replayTime;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.reverseVideoPath;
            if (str != null) {
                arrayList.add(str);
            }
            String str2 = this.originVideoPath;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void setFps(int i) {
        this.fps = i;
    }

    public final void setOriginVideoPath(String str) {
        this.originVideoPath = str;
    }

    public final void setReplayTime(int i) {
        this.replayTime = i;
    }

    public final void setReverseVideoPath(String str) {
        this.reverseVideoPath = str;
    }

    public final void setSingleDuration(int i) {
        this.singleDuration = i;
    }

    public final void setTotalDuration(int i) {
        this.totalDuration = i;
    }

    public StoryBoomModel(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this();
        this.replayTime = parcel.readInt();
        this.fps = parcel.readInt();
        this.singleDuration = parcel.readInt();
        this.totalDuration = parcel.readInt();
        this.originVideoPath = parcel.readString();
        this.reverseVideoPath = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeInt(this.replayTime);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.singleDuration);
        parcel.writeInt(this.totalDuration);
        parcel.writeString(this.originVideoPath);
        parcel.writeString(this.reverseVideoPath);
    }
}
