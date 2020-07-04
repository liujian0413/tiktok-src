package com.p280ss.android.ugc.aweme.services.video;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.video.VideoExposureData */
public final class VideoExposureData {
    private final AVUploadSaveModel avUploadSaveModel;
    private final String creationId;
    private final String draftPrimaryKey;
    private final String inputVideoFile;
    private final boolean isSaveLocal;
    private final String localFinalPath;
    private final String mainBusinessData;
    private final int origin;
    private final String outPutFile;
    private final String path;
    private final String shootWay;
    private final float videoCoverStartTm;

    public static /* synthetic */ VideoExposureData copy$default(VideoExposureData videoExposureData, String str, float f, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, String str8, int i2, Object obj) {
        VideoExposureData videoExposureData2 = videoExposureData;
        int i3 = i2;
        return videoExposureData.copy((i3 & 1) != 0 ? videoExposureData2.path : str, (i3 & 2) != 0 ? videoExposureData2.videoCoverStartTm : f, (i3 & 4) != 0 ? videoExposureData2.mainBusinessData : str2, (i3 & 8) != 0 ? videoExposureData2.outPutFile : str3, (i3 & 16) != 0 ? videoExposureData2.inputVideoFile : str4, (i3 & 32) != 0 ? videoExposureData2.creationId : str5, (i3 & 64) != 0 ? videoExposureData2.isSaveLocal : z, (i3 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) != 0 ? videoExposureData2.localFinalPath : str6, (i3 & 256) != 0 ? videoExposureData2.avUploadSaveModel : aVUploadSaveModel, (i3 & 512) != 0 ? videoExposureData2.origin : i, (i3 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? videoExposureData2.draftPrimaryKey : str7, (i3 & 2048) != 0 ? videoExposureData2.shootWay : str8);
    }

    public final String component1() {
        return this.path;
    }

    public final int component10() {
        return this.origin;
    }

    public final String component11() {
        return this.draftPrimaryKey;
    }

    public final String component12() {
        return this.shootWay;
    }

    public final float component2() {
        return this.videoCoverStartTm;
    }

    public final String component3() {
        return this.mainBusinessData;
    }

    public final String component4() {
        return this.outPutFile;
    }

    public final String component5() {
        return this.inputVideoFile;
    }

    public final String component6() {
        return this.creationId;
    }

    public final boolean component7() {
        return this.isSaveLocal;
    }

    public final String component8() {
        return this.localFinalPath;
    }

    public final AVUploadSaveModel component9() {
        return this.avUploadSaveModel;
    }

    public final VideoExposureData copy(String str, float f, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, String str8) {
        String str9 = str;
        C7573i.m23587b(str, "path");
        String str10 = str3;
        C7573i.m23587b(str10, "outPutFile");
        String str11 = str4;
        C7573i.m23587b(str11, "inputVideoFile");
        String str12 = str5;
        C7573i.m23587b(str12, "creationId");
        VideoExposureData videoExposureData = new VideoExposureData(str9, f, str2, str10, str11, str12, z, str6, aVUploadSaveModel, i, str7, str8);
        return videoExposureData;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoExposureData) {
                VideoExposureData videoExposureData = (VideoExposureData) obj;
                if (C7573i.m23585a((Object) this.path, (Object) videoExposureData.path) && Float.compare(this.videoCoverStartTm, videoExposureData.videoCoverStartTm) == 0 && C7573i.m23585a((Object) this.mainBusinessData, (Object) videoExposureData.mainBusinessData) && C7573i.m23585a((Object) this.outPutFile, (Object) videoExposureData.outPutFile) && C7573i.m23585a((Object) this.inputVideoFile, (Object) videoExposureData.inputVideoFile) && C7573i.m23585a((Object) this.creationId, (Object) videoExposureData.creationId)) {
                    if ((this.isSaveLocal == videoExposureData.isSaveLocal) && C7573i.m23585a((Object) this.localFinalPath, (Object) videoExposureData.localFinalPath) && C7573i.m23585a((Object) this.avUploadSaveModel, (Object) videoExposureData.avUploadSaveModel)) {
                        if (!(this.origin == videoExposureData.origin) || !C7573i.m23585a((Object) this.draftPrimaryKey, (Object) videoExposureData.draftPrimaryKey) || !C7573i.m23585a((Object) this.shootWay, (Object) videoExposureData.shootWay)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final AVUploadSaveModel getAvUploadSaveModel() {
        return this.avUploadSaveModel;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getDraftPrimaryKey() {
        return this.draftPrimaryKey;
    }

    public final String getInputVideoFile() {
        return this.inputVideoFile;
    }

    public final String getLocalFinalPath() {
        return this.localFinalPath;
    }

    public final String getMainBusinessData() {
        return this.mainBusinessData;
    }

    public final int getOrigin() {
        return this.origin;
    }

    public final String getOutPutFile() {
        return this.outPutFile;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final float getVideoCoverStartTm() {
        return this.videoCoverStartTm;
    }

    public final int hashCode() {
        String str = this.path;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.videoCoverStartTm)) * 31;
        String str2 = this.mainBusinessData;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.outPutFile;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.inputVideoFile;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.creationId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.isSaveLocal;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str6 = this.localFinalPath;
        int hashCode6 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.avUploadSaveModel;
        int hashCode7 = (((hashCode6 + (aVUploadSaveModel != null ? aVUploadSaveModel.hashCode() : 0)) * 31) + this.origin) * 31;
        String str7 = this.draftPrimaryKey;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.shootWay;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    public final boolean isSaveLocal() {
        return this.isSaveLocal;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoExposureData(path=");
        sb.append(this.path);
        sb.append(", videoCoverStartTm=");
        sb.append(this.videoCoverStartTm);
        sb.append(", mainBusinessData=");
        sb.append(this.mainBusinessData);
        sb.append(", outPutFile=");
        sb.append(this.outPutFile);
        sb.append(", inputVideoFile=");
        sb.append(this.inputVideoFile);
        sb.append(", creationId=");
        sb.append(this.creationId);
        sb.append(", isSaveLocal=");
        sb.append(this.isSaveLocal);
        sb.append(", localFinalPath=");
        sb.append(this.localFinalPath);
        sb.append(", avUploadSaveModel=");
        sb.append(this.avUploadSaveModel);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", draftPrimaryKey=");
        sb.append(this.draftPrimaryKey);
        sb.append(", shootWay=");
        sb.append(this.shootWay);
        sb.append(")");
        return sb.toString();
    }

    public VideoExposureData(String str, float f, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, String str8) {
        C7573i.m23587b(str, "path");
        C7573i.m23587b(str3, "outPutFile");
        C7573i.m23587b(str4, "inputVideoFile");
        C7573i.m23587b(str5, "creationId");
        this.path = str;
        this.videoCoverStartTm = f;
        this.mainBusinessData = str2;
        this.outPutFile = str3;
        this.inputVideoFile = str4;
        this.creationId = str5;
        this.isSaveLocal = z;
        this.localFinalPath = str6;
        this.avUploadSaveModel = aVUploadSaveModel;
        this.origin = i;
        this.draftPrimaryKey = str7;
        this.shootWay = str8;
    }
}
