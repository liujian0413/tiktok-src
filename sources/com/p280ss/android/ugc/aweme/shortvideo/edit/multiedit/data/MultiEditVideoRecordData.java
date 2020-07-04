package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Pair;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.vesdk.VERecordData;
import com.p280ss.android.vesdk.VERecordData.VERecordSegmentData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData */
public class MultiEditVideoRecordData implements Parcelable, Serializable {
    public static final Creator<MultiEditVideoRecordData> CREATOR = new Creator<MultiEditVideoRecordData>() {
        /* renamed from: a */
        private static MultiEditVideoRecordData[] m127225a(int i) {
            return new MultiEditVideoRecordData[i];
        }

        /* renamed from: a */
        private static MultiEditVideoRecordData m127224a(Parcel parcel) {
            return new MultiEditVideoRecordData(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m127224a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m127225a(i);
        }
    };
    @C6593c(mo15949a = "concat_audio")
    public String concatAudio;
    @C6593c(mo15949a = "concat_video")
    public String concatVideo;
    @C6593c(mo15949a = "cover_path")
    public String coverPath;
    public String curRecordingDir;
    @C6593c(mo15949a = "end_time")
    public long endTime;
    @C6593c(mo15949a = "has_retake")
    public boolean hasRetake;
    @C6593c(mo15949a = "is_single_video")
    public boolean isSingleVideo;
    @C6593c(mo15949a = "left_slide_x")
    public float leftSlideX;
    @C6593c(mo15949a = "music_duration")
    public int musicDuration;
    @C6593c(mo15949a = "music_index")
    public int musicIndex = -1;
    @C6593c(mo15949a = "music_path")
    public String musicPath;
    @C6593c(mo15949a = "music_trimin")
    public int musicTrimIn;
    @C6593c(mo15949a = "music_volume")
    public float musicVolume = 0.5f;
    @C6593c(mo15949a = "origin_volume")
    public float originVolume = 0.5f;
    @C6593c(mo15949a = "video_duration")
    public int preVideoDuration;
    @C6593c(mo15949a = "right_slide_x")
    public float rightSlideX;
    @C6593c(mo15949a = "segment_list")
    public List<MultiEditVideoSegmentRecordData> segmentDataList;
    @C6593c(mo15949a = "start_time")
    public long startTime;
    @C6593c(mo15949a = "use_music")
    public boolean useMusic;

    public int describeContents() {
        return 0;
    }

    private int getRealVideoLengthOutter() {
        return (int) (this.endTime - this.startTime);
    }

    public MultiEditVideoRecordData() {
    }

    private int getRealVideoLengthInner() {
        if (C23477d.m77081a((Collection<T>) this.segmentDataList)) {
            return 0;
        }
        long j = 0;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
            j += multiEditVideoSegmentRecordData.endTime - multiEditVideoSegmentRecordData.startTime;
        }
        return (int) j;
    }

    public VERecordData convertData() {
        ArrayList arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData convertData : this.segmentDataList) {
            arrayList.add(convertData.convertData());
        }
        VERecordData vERecordData = new VERecordData(arrayList, this.useMusic);
        vERecordData.f116373d = this.concatVideo;
        vERecordData.f116374e = this.concatAudio;
        return vERecordData;
    }

    public List<MediaModel> convertMediaModelList() {
        if (C23477d.m77081a((Collection<T>) this.segmentDataList)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData convertModel : this.segmentDataList) {
            arrayList.add(convertModel.convertModel());
        }
        return arrayList;
    }

    public Pair<Integer, Integer> getPlayInOutTime() {
        int i;
        int i2 = (int) this.startTime;
        if (getRealVideoLengthOutter() > 0) {
            i = getRealVideoLengthOutter();
        } else {
            i = getRealVideoLengthInner();
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i2 + i));
    }

    public boolean isPlaySingleSegmentMusic() {
        if (this.musicDuration + 1000 >= ((Integer) getPlayInOutTime().second).intValue() - ((Integer) getPlayInOutTime().first).intValue()) {
            return true;
        }
        return false;
    }

    public void resetTimeData() {
        if (!C23477d.m77081a((Collection<T>) this.segmentDataList)) {
            this.startTime = 0;
            this.endTime = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
                multiEditVideoSegmentRecordData.resetTime();
                this.endTime += multiEditVideoSegmentRecordData.videoLength / 1000;
            }
        }
    }

    public MultiEditVideoRecordData cloneData() {
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.concatVideo = this.concatVideo;
        multiEditVideoRecordData.concatAudio = this.concatAudio;
        multiEditVideoRecordData.useMusic = this.useMusic;
        multiEditVideoRecordData.startTime = this.startTime;
        multiEditVideoRecordData.endTime = this.endTime;
        multiEditVideoRecordData.leftSlideX = this.leftSlideX;
        multiEditVideoRecordData.rightSlideX = this.rightSlideX;
        multiEditVideoRecordData.curRecordingDir = this.curRecordingDir;
        multiEditVideoRecordData.segmentDataList = new ArrayList();
        for (MultiEditVideoSegmentRecordData cloneData : this.segmentDataList) {
            multiEditVideoRecordData.segmentDataList.add(cloneData.cloneData());
        }
        multiEditVideoRecordData.musicPath = this.musicPath;
        multiEditVideoRecordData.originVolume = this.originVolume;
        multiEditVideoRecordData.musicVolume = this.musicVolume;
        multiEditVideoRecordData.hasRetake = this.hasRetake;
        multiEditVideoRecordData.musicTrimIn = this.musicTrimIn;
        multiEditVideoRecordData.musicDuration = this.musicDuration;
        multiEditVideoRecordData.preVideoDuration = this.preVideoDuration;
        multiEditVideoRecordData.coverPath = this.coverPath;
        multiEditVideoRecordData.isSingleVideo = this.isSingleVideo;
        return multiEditVideoRecordData;
    }

    public void copyData(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            this.startTime = multiEditVideoRecordData.startTime;
            this.endTime = multiEditVideoRecordData.endTime;
            this.leftSlideX = multiEditVideoRecordData.leftSlideX;
            this.rightSlideX = multiEditVideoRecordData.rightSlideX;
            this.useMusic = multiEditVideoRecordData.useMusic;
            this.concatVideo = multiEditVideoRecordData.concatVideo;
            this.concatAudio = multiEditVideoRecordData.concatAudio;
            this.musicIndex = multiEditVideoRecordData.musicIndex;
            this.musicVolume = multiEditVideoRecordData.musicVolume;
            this.originVolume = multiEditVideoRecordData.originVolume;
            this.musicPath = multiEditVideoRecordData.musicPath;
            this.hasRetake = multiEditVideoRecordData.hasRetake;
            this.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
            this.musicDuration = multiEditVideoRecordData.musicDuration;
            this.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
            this.coverPath = multiEditVideoRecordData.coverPath;
            this.isSingleVideo = multiEditVideoRecordData.isSingleVideo;
        }
    }

    public boolean isEqual(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData == null || C23477d.m77081a((Collection<T>) multiEditVideoRecordData.segmentDataList) || C23477d.m77081a((Collection<T>) this.segmentDataList) || this.segmentDataList.size() != multiEditVideoRecordData.segmentDataList.size()) {
            return false;
        }
        for (int i = 0; i < this.segmentDataList.size(); i++) {
            if (!((MultiEditVideoSegmentRecordData) this.segmentDataList.get(i)).isEqual((MultiEditVideoSegmentRecordData) multiEditVideoRecordData.segmentDataList.get(i))) {
                return false;
            }
        }
        return true;
    }

    protected MultiEditVideoRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        this.segmentDataList = parcel.createTypedArrayList(MultiEditVideoSegmentRecordData.CREATOR);
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useMusic = z;
        this.concatVideo = parcel.readString();
        this.concatAudio = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.leftSlideX = parcel.readFloat();
        this.rightSlideX = parcel.readFloat();
        this.curRecordingDir = parcel.readString();
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hasRetake = z2;
        this.musicPath = parcel.readString();
        this.originVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        this.musicTrimIn = parcel.readInt();
        this.musicDuration = parcel.readInt();
        this.preVideoDuration = parcel.readInt();
        this.coverPath = parcel.readString();
        if (parcel.readByte() == 1) {
            z3 = true;
        }
        this.isSingleVideo = z3;
    }

    public static MultiEditVideoRecordData convertData(VERecordData vERecordData, String str) {
        if (vERecordData == null) {
            return null;
        }
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.useMusic = vERecordData.f116372c;
        multiEditVideoRecordData.concatAudio = vERecordData.f116374e;
        multiEditVideoRecordData.concatVideo = vERecordData.f116373d;
        multiEditVideoRecordData.startTime = 0;
        if (!C23477d.m77081a((Collection<T>) vERecordData.f116371b)) {
            multiEditVideoRecordData.segmentDataList = new ArrayList(vERecordData.f116371b.size());
            for (VERecordSegmentData vERecordSegmentData : vERecordData.f116371b) {
                multiEditVideoRecordData.segmentDataList.add(MultiEditVideoSegmentRecordData.convertData(vERecordSegmentData));
                multiEditVideoRecordData.endTime += vERecordSegmentData.f116377c / 1000;
            }
        }
        multiEditVideoRecordData.curRecordingDir = str;
        return multiEditVideoRecordData;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.segmentDataList);
        parcel.writeByte(this.useMusic ? (byte) 1 : 0);
        parcel.writeString(this.concatVideo);
        parcel.writeString(this.concatAudio);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeFloat(this.leftSlideX);
        parcel.writeFloat(this.rightSlideX);
        parcel.writeString(this.curRecordingDir);
        parcel.writeByte(this.hasRetake ? (byte) 1 : 0);
        parcel.writeString(this.musicPath);
        parcel.writeFloat(this.originVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeInt(this.musicTrimIn);
        parcel.writeInt(this.musicDuration);
        parcel.writeInt(this.preVideoDuration);
        parcel.writeString(this.coverPath);
        parcel.writeByte(this.isSingleVideo ? (byte) 1 : 0);
    }
}
