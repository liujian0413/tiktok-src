package dmt.p1861av.video;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p280ss.android.vesdk.C45255af;
import com.p280ss.android.vesdk.VECherEffectParam;
import com.p280ss.android.vesdk.VEEditorModel;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: dmt.av.video.VEPreviewParams */
public class VEPreviewParams implements Parcelable, Serializable {
    public static final Creator<VEPreviewParams> CREATOR = new Creator<VEPreviewParams>() {
        /* renamed from: a */
        private static VEPreviewParams[] m147959a(int i) {
            return new VEPreviewParams[i];
        }

        /* renamed from: a */
        private static VEPreviewParams m147958a(Parcel parcel) {
            return new VEPreviewParams(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m147958a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m147959a(i);
        }
    };
    public int canvasHeight;
    public int canvasWidth;
    public long editorHandler;
    public VEEditorModel editorModel;
    public boolean fromPublishVideo;
    public boolean isFastImport;
    public String[] mAudioPaths;
    public int mFps;
    public boolean mIsFromDraft;
    public int mMusicInPoint;
    public int mMusicOutPoint;
    public String mMusicPath;
    public float mMusicVolume;
    public int mPageType;
    public int[] mVTrimIn;
    public int[] mVTrimOut;
    public String[] mVideoPaths;
    public float mVolume;
    public String mWorkspace;
    public MvCreateVideoData mvCreateVideoData;
    public int previewHeight;
    public int previewWidth;
    public MultiEditVideoStatusRecordData recordData;
    public int[] rotateArray;
    public int sceneIn;
    public int sceneOut;
    public float[] speedArray;
    public StatusCreateVideoData statusCreateVideoData;
    public C45255af timelineParams;
    public AudioEffectParam veAudioEffectParam;
    public AudioRecorderParam veAudioRecordParam;
    public VECherEffectParam veCherEffectParam;
    public int videoEditorType;

    public int describeContents() {
        return 0;
    }

    public VEPreviewParams() {
        this.mFps = -1;
        this.mVolume = 1.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VEPreviewParams{mVideoPaths=");
        sb.append(Arrays.toString(this.mVideoPaths));
        sb.append(", mAudioPaths=");
        sb.append(Arrays.toString(this.mAudioPaths));
        sb.append(", mWorkspace='");
        sb.append(this.mWorkspace);
        sb.append('\'');
        sb.append(", mVolume=");
        sb.append(this.mVolume);
        sb.append(", mFps=");
        sb.append(this.mFps);
        sb.append(", mVTrimIn=");
        sb.append(this.mVTrimIn);
        sb.append(", mVTrimOut=");
        sb.append(this.mVTrimOut);
        sb.append(", sceneIn=");
        sb.append(this.sceneIn);
        sb.append(", sceneOut=");
        sb.append(this.sceneOut);
        sb.append(", canvasWidth=");
        sb.append(this.canvasWidth);
        sb.append(", canvasHeight=");
        sb.append(this.canvasHeight);
        sb.append('}');
        return sb.toString();
    }

    protected VEPreviewParams(Parcel parcel) {
        boolean z;
        boolean z2;
        this.mFps = -1;
        this.mVideoPaths = parcel.createStringArray();
        this.mAudioPaths = parcel.createStringArray();
        this.mWorkspace = parcel.readString();
        this.mVolume = parcel.readFloat();
        this.mMusicVolume = parcel.readFloat();
        this.mFps = parcel.readInt();
        this.mVTrimIn = parcel.createIntArray();
        this.mVTrimOut = parcel.createIntArray();
        this.sceneIn = parcel.readInt();
        this.sceneOut = parcel.readInt();
        this.videoEditorType = parcel.readInt();
        this.mvCreateVideoData = (MvCreateVideoData) parcel.readSerializable();
        this.speedArray = parcel.createFloatArray();
        this.rotateArray = parcel.createIntArray();
        this.veCherEffectParam = (VECherEffectParam) parcel.readParcelable(VECherEffectParam.class.getClassLoader());
        this.canvasWidth = parcel.readInt();
        this.canvasHeight = parcel.readInt();
        this.mMusicPath = parcel.readString();
        this.mMusicInPoint = parcel.readInt();
        this.mMusicOutPoint = parcel.readInt();
        this.mPageType = parcel.readInt();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsFromDraft = z;
        this.veAudioRecordParam = (AudioRecorderParam) parcel.readParcelable(AudioRecorderParam.class.getClassLoader());
        this.recordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
        this.previewWidth = parcel.readInt();
        this.previewHeight = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isFastImport = z2;
        this.statusCreateVideoData = (StatusCreateVideoData) parcel.readParcelable(StatusCreateVideoData.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.fromPublishVideo = z3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.mVideoPaths);
        parcel.writeStringArray(this.mAudioPaths);
        parcel.writeString(this.mWorkspace);
        parcel.writeFloat(this.mVolume);
        parcel.writeFloat(this.mMusicVolume);
        parcel.writeInt(this.mFps);
        parcel.writeIntArray(this.mVTrimIn);
        parcel.writeIntArray(this.mVTrimOut);
        parcel.writeInt(this.sceneIn);
        parcel.writeInt(this.sceneOut);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeFloatArray(this.speedArray);
        parcel.writeIntArray(this.rotateArray);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeInt(this.canvasWidth);
        parcel.writeInt(this.canvasHeight);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mMusicInPoint);
        parcel.writeInt(this.mMusicOutPoint);
        parcel.writeInt(this.mPageType);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : 0);
        parcel.writeParcelable(this.veAudioRecordParam, i);
        parcel.writeParcelable(this.recordData, i);
        parcel.writeInt(this.previewWidth);
        parcel.writeInt(this.previewHeight);
        parcel.writeByte(this.isFastImport ? (byte) 1 : 0);
        parcel.writeParcelable(this.statusCreateVideoData, i);
        parcel.writeByte(this.fromPublishVideo ? (byte) 1 : 0);
    }
}
