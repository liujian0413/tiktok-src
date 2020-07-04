package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VERecordData.VERecordSegmentData;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData */
public class MultiEditVideoSegmentRecordData implements Parcelable, Serializable {
    public static final Creator<MultiEditVideoSegmentRecordData> CREATOR = new Creator<MultiEditVideoSegmentRecordData>() {
        /* renamed from: a */
        private static MultiEditVideoSegmentRecordData[] m127227a(int i) {
            return new MultiEditVideoSegmentRecordData[i];
        }

        /* renamed from: a */
        private static MultiEditVideoSegmentRecordData m127226a(Parcel parcel) {
            return new MultiEditVideoSegmentRecordData(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m127226a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m127227a(i);
        }
    };
    @C6593c(mo15949a = "audio_length")
    public long audioLength;
    @C6593c(mo15949a = "audio_path")
    public String audioPath;
    @C6593c(mo15949a = "draft_audio_path")
    public String draftAudioPath;
    @C6593c(mo15949a = "draft_video_path")
    public String draftVideoPath;
    @C6593c(mo15949a = "endTime")
    public long endTime;
    @C6593c(mo15949a = "speed")
    public float speed;
    @C6593c(mo15949a = "startTime")
    public long startTime;
    @C6593c(mo15949a = "video_length")
    public long videoLength;
    @C6593c(mo15949a = "video_path")
    public String videoPath;

    public MultiEditVideoSegmentRecordData() {
    }

    public int describeContents() {
        return 0;
    }

    public void resetTime() {
        this.startTime = 0;
        this.endTime = this.videoLength / 1000;
    }

    public MultiEditVideoSegmentRecordData cloneData() {
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
        multiEditVideoSegmentRecordData.videoPath = this.videoPath;
        multiEditVideoSegmentRecordData.videoLength = this.videoLength;
        multiEditVideoSegmentRecordData.draftVideoPath = this.draftVideoPath;
        multiEditVideoSegmentRecordData.draftAudioPath = this.draftAudioPath;
        multiEditVideoSegmentRecordData.audioPath = this.audioPath;
        multiEditVideoSegmentRecordData.audioLength = this.audioLength;
        multiEditVideoSegmentRecordData.speed = this.speed;
        multiEditVideoSegmentRecordData.startTime = this.startTime;
        multiEditVideoSegmentRecordData.endTime = this.endTime;
        return multiEditVideoSegmentRecordData;
    }

    public VERecordSegmentData convertData() {
        String str = this.videoPath;
        if (!C7276d.m22812b(str)) {
            str = this.draftVideoPath;
        }
        String str2 = str;
        String str3 = this.audioPath;
        if (!C7276d.m22812b(str3)) {
            str3 = this.draftAudioPath;
        }
        VERecordSegmentData vERecordSegmentData = new VERecordSegmentData(str2, this.videoLength, str3, this.audioLength, this.speed, this.startTime * 1000, 1000 * this.endTime, true);
        return vERecordSegmentData;
    }

    public MediaModel convertModel() {
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f88156b = this.videoPath;
        mediaModel.f88159e = this.videoLength / 1000;
        mediaModel.f88163i = 720;
        mediaModel.f88164j = 1080;
        mediaModel.f88167m = (int) this.startTime;
        mediaModel.f88168n = (int) this.endTime;
        return mediaModel;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MultiEditVideoSegmentRecordData{videoPath=");
        sb.append(this.videoPath);
        sb.append(", videoLength=");
        sb.append(this.videoLength);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append('}');
        return sb.toString();
    }

    public void copyData(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData != null) {
            this.videoPath = multiEditVideoSegmentRecordData.videoPath;
            this.audioPath = multiEditVideoSegmentRecordData.audioPath;
            this.videoLength = multiEditVideoSegmentRecordData.videoLength;
            this.audioLength = multiEditVideoSegmentRecordData.audioLength;
            this.startTime = multiEditVideoSegmentRecordData.startTime;
            this.endTime = multiEditVideoSegmentRecordData.endTime;
            this.speed = multiEditVideoSegmentRecordData.speed;
        }
    }

    protected MultiEditVideoSegmentRecordData(Parcel parcel) {
        this.videoPath = parcel.readString();
        this.draftVideoPath = parcel.readString();
        this.audioPath = parcel.readString();
        this.draftAudioPath = parcel.readString();
        this.videoLength = parcel.readLong();
        this.audioLength = parcel.readLong();
        this.speed = parcel.readFloat();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
    }

    public static MultiEditVideoSegmentRecordData convertData(VERecordSegmentData vERecordSegmentData) {
        if (vERecordSegmentData == null) {
            return null;
        }
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
        multiEditVideoSegmentRecordData.videoPath = vERecordSegmentData.f116375a;
        multiEditVideoSegmentRecordData.audioPath = vERecordSegmentData.f116376b;
        multiEditVideoSegmentRecordData.startTime = vERecordSegmentData.f116380f / 1000;
        multiEditVideoSegmentRecordData.endTime = vERecordSegmentData.f116381g / 1000;
        if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
            multiEditVideoSegmentRecordData.draftVideoPath = vERecordSegmentData.f116375a;
        }
        if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftAudioPath)) {
            multiEditVideoSegmentRecordData.draftAudioPath = vERecordSegmentData.f116376b;
        }
        multiEditVideoSegmentRecordData.videoLength = vERecordSegmentData.f116377c;
        multiEditVideoSegmentRecordData.audioLength = vERecordSegmentData.f116378d;
        multiEditVideoSegmentRecordData.speed = vERecordSegmentData.f116379e;
        return multiEditVideoSegmentRecordData;
    }

    public boolean isEqual(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData != null && this.videoPath.equals(multiEditVideoSegmentRecordData.videoPath) && this.videoLength == multiEditVideoSegmentRecordData.videoLength && this.audioPath.equals(multiEditVideoSegmentRecordData.audioPath) && this.audioLength == multiEditVideoSegmentRecordData.audioLength && this.speed == multiEditVideoSegmentRecordData.speed && this.startTime == multiEditVideoSegmentRecordData.startTime && this.endTime == multiEditVideoSegmentRecordData.endTime) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.draftVideoPath);
        parcel.writeString(this.audioPath);
        parcel.writeString(this.draftAudioPath);
        parcel.writeLong(this.videoLength);
        parcel.writeLong(this.audioLength);
        parcel.writeFloat(this.speed);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }
}
