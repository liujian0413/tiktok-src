package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.C6600e;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.sticker.StickerInfo;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension */
public class TimeSpeedModelExtension implements Parcelable {
    public static final Creator<TimeSpeedModelExtension> CREATOR = new Creator<TimeSpeedModelExtension>() {
        /* renamed from: a */
        private static TimeSpeedModelExtension[] m131384a(int i) {
            return new TimeSpeedModelExtension[i];
        }

        /* renamed from: a */
        private static TimeSpeedModelExtension m131383a(Parcel parcel) {
            return new TimeSpeedModelExtension(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m131383a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m131384a(i);
        }
    };
    private static final C6600e GSON = ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().getRetrofitFactoryGson();
    private int cameraId;
    private int duration;
    private String faceId;
    private boolean isBusiSticker;
    private boolean isRedPacketSticker;
    private List<String> mARText;
    private BackgroundVideo mBackgroundVideo;
    private List<String> mBubbleText;
    private AVChallenge mChallenge;
    private String mStickerId;
    private List<String> mStickerMusicIds;
    private EmbaddedWindowInfo mWindowInfo;
    private double speed;
    private StickerInfo stickerInfo;
    private StickerPoi stickerPoi;
    private boolean supportRetake;
    private String words;

    public int describeContents() {
        return 0;
    }

    public List<String> getARTexts() {
        return this.mARText;
    }

    public BackgroundVideo getBackgroundVideo() {
        return this.mBackgroundVideo;
    }

    public List<String> getBubbleTexts() {
        return this.mBubbleText;
    }

    public int getCameraId() {
        return this.cameraId;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getFaceId() {
        return this.faceId;
    }

    public AVChallenge getHashtag() {
        return this.mChallenge;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String getStickerId() {
        return this.mStickerId;
    }

    public List<String> getStickerMusicIds() {
        return this.mStickerMusicIds;
    }

    public StickerPoi getStickerPoi() {
        return this.stickerPoi;
    }

    public boolean isBusiSticker() {
        return this.isBusiSticker;
    }

    public boolean isSupportRetake() {
        return this.supportRetake;
    }

    public C6711m toJson() {
        return GSON.mo15963a((Object) this).mo16136m();
    }

    public String getGradeKey() {
        if (this.stickerInfo == null) {
            return "";
        }
        if (this.stickerInfo.getGradeKey() == null) {
            return "";
        }
        return this.stickerInfo.getGradeKey();
    }

    public String getPropSource() {
        if (this.stickerInfo == null) {
            return "";
        }
        if (this.stickerInfo.getPropSource() == null) {
            return "";
        }
        return this.stickerInfo.getPropSource();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("durationSDK: ");
        sb.append(getDuration());
        sb.append(" speed: ");
        sb.append(getSpeed());
        return sb.toString();
    }

    public void adjustDuration(long j) {
        this.duration = (int) j;
    }

    public void setStickerMusicIds(List<String> list) {
        this.mStickerMusicIds = list;
    }

    public static TimeSpeedModelExtension fromJson(C6711m mVar) {
        return (TimeSpeedModelExtension) GSON.mo15970a((C6709k) mVar, TimeSpeedModelExtension.class);
    }

    public static int calculateRealTime(List<TimeSpeedModelExtension> list) {
        int i = 0;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        for (TimeSpeedModelExtension timeSpeedModelExtension : list) {
            i += calculateRealTime(timeSpeedModelExtension.duration, timeSpeedModelExtension.speed);
        }
        return i;
    }

    protected TimeSpeedModelExtension(Parcel parcel) {
        boolean z;
        boolean z2;
        this.duration = parcel.readInt();
        this.speed = parcel.readDouble();
        this.cameraId = parcel.readInt();
        this.mStickerId = parcel.readString();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isBusiSticker = z;
        this.stickerPoi = (StickerPoi) parcel.readSerializable();
        this.mStickerMusicIds = parcel.createStringArrayList();
        this.stickerInfo = (StickerInfo) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isRedPacketSticker = z2;
        this.words = parcel.readString();
        this.mChallenge = (AVChallenge) parcel.readSerializable();
        this.mWindowInfo = (EmbaddedWindowInfo) parcel.readParcelable(EmbaddedWindowInfo.class.getClassLoader());
        this.mBubbleText = parcel.createStringArrayList();
        this.mARText = parcel.createStringArrayList();
        this.faceId = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.supportRetake = z3;
    }

    public static int calculateRealTime(int i, double d) {
        double d2 = (double) i;
        Double.isNaN(d2);
        return (int) ((d2 * 1.0d) / d);
    }

    public static long calculateRealTime(long j, double d) {
        double d2 = (double) j;
        Double.isNaN(d2);
        return (long) ((d2 * 1.0d) / d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.duration);
        parcel.writeDouble(this.speed);
        parcel.writeInt(this.cameraId);
        parcel.writeString(this.mStickerId);
        parcel.writeByte(this.isBusiSticker ? (byte) 1 : 0);
        parcel.writeSerializable(this.stickerPoi);
        parcel.writeStringList(this.mStickerMusicIds);
        parcel.writeSerializable(this.stickerInfo);
        parcel.writeByte(this.isRedPacketSticker ? (byte) 1 : 0);
        parcel.writeString(this.words);
        parcel.writeSerializable(this.mChallenge);
        parcel.writeParcelable(this.mWindowInfo, i);
        parcel.writeStringList(this.mBubbleText);
        parcel.writeStringList(this.mARText);
        parcel.writeString(this.faceId);
        parcel.writeByte(this.supportRetake ? (byte) 1 : 0);
    }

    public TimeSpeedModelExtension(int i, double d, String str, AVChallenge aVChallenge, List<String> list) {
        this.duration = i;
        this.speed = d;
        this.mStickerId = str;
        this.mChallenge = aVChallenge;
        this.mStickerMusicIds = list;
    }

    public TimeSpeedModelExtension(int i, double d, String str, StickerPoi stickerPoi2, StickerInfo stickerInfo2, AVChallenge aVChallenge, List<String> list, EmbaddedWindowInfo embaddedWindowInfo) {
        this.duration = i;
        this.speed = d;
        this.mStickerId = str;
        this.stickerPoi = stickerPoi2;
        this.stickerInfo = stickerInfo2;
        this.mChallenge = aVChallenge;
        this.mStickerMusicIds = list;
        this.mWindowInfo = embaddedWindowInfo;
    }

    public TimeSpeedModelExtension(int i, double d, String str, StickerPoi stickerPoi2, StickerInfo stickerInfo2, AVChallenge aVChallenge, List<String> list, EmbaddedWindowInfo embaddedWindowInfo, List<String> list2, List<String> list3, int i2, boolean z, String str2, boolean z2, BackgroundVideo backgroundVideo) {
        this.duration = i;
        this.speed = d;
        this.mStickerId = str;
        this.stickerPoi = stickerPoi2;
        this.stickerInfo = stickerInfo2;
        this.mChallenge = aVChallenge;
        this.mStickerMusicIds = list;
        this.mWindowInfo = embaddedWindowInfo;
        this.mARText = list2;
        this.mBubbleText = list3;
        this.cameraId = i2;
        this.isBusiSticker = z;
        this.faceId = str2;
        this.mBackgroundVideo = backgroundVideo;
        this.supportRetake = z2;
    }
}
