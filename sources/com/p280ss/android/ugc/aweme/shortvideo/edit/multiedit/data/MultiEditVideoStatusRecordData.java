package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData */
public class MultiEditVideoStatusRecordData implements Parcelable, Serializable {
    public static final Creator<MultiEditVideoStatusRecordData> CREATOR = new Creator<MultiEditVideoStatusRecordData>() {
        /* renamed from: a */
        private static MultiEditVideoStatusRecordData[] m127229a(int i) {
            return new MultiEditVideoStatusRecordData[i];
        }

        /* renamed from: a */
        private static MultiEditVideoStatusRecordData m127228a(Parcel parcel) {
            return new MultiEditVideoStatusRecordData(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m127228a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m127229a(i);
        }
    };
    @C6593c(mo15949a = "cover_img_path")
    public String coverImagePath;
    @C6593c(mo15949a = "cur_multi_edit_data")
    public MultiEditVideoRecordData curMultiEditVideoRecordData;
    @C6593c(mo15949a = "cur_select_index")
    public int currentEditIndex = -1;
    @C6593c(mo15949a = "edit_segments")
    public ArrayList<TimeSpeedModelExtension> editSegments;
    @C6593c(mo15949a = "is_multi_edit_retake")
    public boolean isMultiEditRetake;
    @C6593c(mo15949a = "is_support_multi_edit")
    public boolean isSupportMultiEdit;
    @C6593c(mo15949a = "is_use_multi_edit")
    public boolean isUseMultiEdit;
    @C6593c(mo15949a = "origin_multi_edit_data")
    public MultiEditVideoRecordData originMultiEditRecordData;
    @C6593c(mo15949a = "original_music_start")
    public int originalMusicStart;
    @C6593c(mo15949a = "original_segments")
    public ArrayList<TimeSpeedModelExtension> originalSegments;
    @C6593c(mo15949a = "record_music")
    public AVMusic recordMusic;
    @C6593c(mo15949a = "restore_multi_edit_data")
    public MultiEditVideoRecordData restoreMultiEditVideoRecordData;
    @C6593c(mo15949a = "restore_edit_segments")
    public ArrayList<TimeSpeedModelExtension> restoreSegments;
    @C6593c(mo15949a = "segment_size_change")
    public boolean segmentSizeChange;
    @C6593c(mo15949a = "single_restore_multi_edit_data")
    public MultiEditVideoRecordData singleRestoreMultiEditRecordData;
    @C6593c(mo15949a = "single_restore_segments")
    public ArrayList<TimeSpeedModelExtension> singleRestoreSegments;
    @C6593c(mo15949a = "video_meta_data")
    public String videoMetaData;

    public int describeContents() {
        return 0;
    }

    public MultiEditVideoStatusRecordData() {
    }

    protected MultiEditVideoStatusRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.curMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.restoreMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.singleRestoreMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.originMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.currentEditIndex = parcel.readInt();
        boolean z4 = false;
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.segmentSizeChange = z;
        this.originalSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.editSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.restoreSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.singleRestoreSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isMultiEditRetake = z2;
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isUseMultiEdit = z3;
        this.coverImagePath = parcel.readString();
        this.recordMusic = (AVMusic) parcel.readSerializable();
        this.originalMusicStart = parcel.readInt();
        this.videoMetaData = parcel.readString();
        if (parcel.readByte() == 1) {
            z4 = true;
        }
        this.isSupportMultiEdit = z4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.curMultiEditVideoRecordData, i);
        parcel.writeParcelable(this.restoreMultiEditVideoRecordData, i);
        parcel.writeParcelable(this.singleRestoreMultiEditRecordData, i);
        parcel.writeParcelable(this.originMultiEditRecordData, i);
        parcel.writeInt(this.currentEditIndex);
        parcel.writeByte(this.segmentSizeChange ? (byte) 1 : 0);
        parcel.writeTypedList(this.originalSegments);
        parcel.writeTypedList(this.editSegments);
        parcel.writeTypedList(this.restoreSegments);
        parcel.writeTypedList(this.singleRestoreSegments);
        parcel.writeByte(this.isMultiEditRetake ? (byte) 1 : 0);
        parcel.writeByte(this.isUseMultiEdit ? (byte) 1 : 0);
        parcel.writeString(this.coverImagePath);
        parcel.writeSerializable(this.recordMusic);
        parcel.writeInt(this.originalMusicStart);
        parcel.writeString(this.videoMetaData);
        parcel.writeByte(this.isSupportMultiEdit ? (byte) 1 : 0);
    }
}
