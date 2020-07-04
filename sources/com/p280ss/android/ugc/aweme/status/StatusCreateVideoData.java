package com.p280ss.android.ugc.aweme.status;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.status.StatusCreateVideoData */
public final class StatusCreateVideoData implements Parcelable, Serializable {
    public static final C41776a CREATOR = new C41776a(null);
    @C6593c(mo15949a = "status_background_selected_from")
    private String bgFrom;
    @C6593c(mo15949a = "status_background_height")
    private int bgHeight;
    @C6593c(mo15949a = "bg_id")
    private String bgId;
    @C6593c(mo15949a = "bg_path")
    private String bgPath;
    @C6593c(mo15949a = "status_background_size")
    private int bgSize;
    @C6593c(mo15949a = "status_background_src_image")
    private String bgSrcImage;
    @C6593c(mo15949a = "status_background_width")
    private int bgWidth;
    @C6593c(mo15949a = "effect_id")
    private String effectId;
    @C6593c(mo15949a = "effect_path")
    private String effectPath;
    @C6593c(mo15949a = "status_music_ids")
    private List<String> musicIds;
    @C6593c(mo15949a = "music_path")
    private String musicPath;
    @C6593c(mo15949a = "key_status_type")
    private int statusType;
    @C6593c(mo15949a = "status_template_text")
    private String templateText;
    @C6593c(mo15949a = "status_user_text")
    private String userText;
    @C6593c(mo15949a = "status_video_cover")
    private String videoCoverImgPath;
    @C6593c(mo15949a = "status_video_cover_starttime")
    private int videoCoverStartTime;

    /* renamed from: com.ss.android.ugc.aweme.status.StatusCreateVideoData$a */
    public static final class C41776a implements Creator<StatusCreateVideoData> {
        private C41776a() {
        }

        /* renamed from: a */
        private static StatusCreateVideoData[] m132994a(int i) {
            return new StatusCreateVideoData[i];
        }

        public /* synthetic */ C41776a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m132993a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m132994a(i);
        }

        /* renamed from: a */
        private static StatusCreateVideoData m132993a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new StatusCreateVideoData(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String getBgFrom() {
        return this.bgFrom;
    }

    public final int getBgHeight() {
        return this.bgHeight;
    }

    public final String getBgId() {
        return this.bgId;
    }

    public final String getBgPath() {
        return this.bgPath;
    }

    public final int getBgSize() {
        return this.bgSize;
    }

    public final String getBgSrcImage() {
        return this.bgSrcImage;
    }

    public final int getBgWidth() {
        return this.bgWidth;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectPath() {
        return this.effectPath;
    }

    public final List<String> getMusicIds() {
        return this.musicIds;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getStatusType() {
        return this.statusType;
    }

    public final String getTemplateText() {
        return this.templateText;
    }

    public final String getUserText() {
        return this.userText;
    }

    public final String getVideoCoverImgPath() {
        return this.videoCoverImgPath;
    }

    public final int getVideoCoverStartTime() {
        return this.videoCoverStartTime;
    }

    public StatusCreateVideoData() {
        this.statusType = -1;
        this.bgPath = "";
        this.bgId = "";
        this.bgFrom = "template";
        this.bgSrcImage = "";
        this.musicPath = "";
        this.effectPath = "";
        this.effectId = "";
        this.musicIds = new ArrayList();
        this.templateText = "";
        this.userText = "";
    }

    public final void setBgHeight(int i) {
        this.bgHeight = i;
    }

    public final void setBgSize(int i) {
        this.bgSize = i;
    }

    public final void setBgWidth(int i) {
        this.bgWidth = i;
    }

    public final void setStatusType(int i) {
        this.statusType = i;
    }

    public final void setVideoCoverImgPath(String str) {
        this.videoCoverImgPath = str;
    }

    public final void setVideoCoverStartTime(int i) {
        this.videoCoverStartTime = i;
    }

    public final void setBgFrom(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.bgFrom = str;
    }

    public final void setBgId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.bgId = str;
    }

    public final void setBgPath(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.bgPath = str;
    }

    public final void setBgSrcImage(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.bgSrcImage = str;
    }

    public final void setEffectId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.effectId = str;
    }

    public final void setEffectPath(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.effectPath = str;
    }

    public final void setMusicIds(List<String> list) {
        C7573i.m23587b(list, "<set-?>");
        this.musicIds = list;
    }

    public final void setMusicPath(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.musicPath = str;
    }

    public final void setTemplateText(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.templateText = str;
    }

    public final void setUserText(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.userText = str;
    }

    public StatusCreateVideoData(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this();
        this.statusType = parcel.readInt();
        String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        this.bgPath = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        this.bgId = readString2;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        this.bgFrom = readString3;
        this.bgSize = parcel.readInt();
        this.bgWidth = parcel.readInt();
        this.bgHeight = parcel.readInt();
        String readString4 = parcel.readString();
        C7573i.m23582a((Object) readString4, "parcel.readString()");
        this.bgSrcImage = readString4;
        String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = "";
        }
        this.musicPath = readString5;
        String readString6 = parcel.readString();
        if (readString6 == null) {
            readString6 = "";
        }
        this.effectPath = readString6;
        String readString7 = parcel.readString();
        if (readString7 == null) {
            readString7 = "";
        }
        this.effectId = readString7;
        parcel.readList(this.musicIds, String.class.getClassLoader());
        String readString8 = parcel.readString();
        if (readString8 == null) {
            readString8 = "";
        }
        this.videoCoverImgPath = readString8;
        this.videoCoverStartTime = parcel.readInt();
        String readString9 = parcel.readString();
        if (readString9 == null) {
            readString9 = "";
        }
        this.templateText = readString9;
        String readString10 = parcel.readString();
        if (readString10 == null) {
            readString10 = "";
        }
        this.userText = readString10;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(this.statusType);
            parcel.writeString(this.bgPath);
            parcel.writeString(this.bgId);
            parcel.writeString(this.bgFrom);
            parcel.writeInt(this.bgSize);
            parcel.writeInt(this.bgWidth);
            parcel.writeInt(this.bgHeight);
            parcel.writeString(this.bgSrcImage);
            parcel.writeString(this.musicPath);
            parcel.writeString(this.effectPath);
            parcel.writeString(this.effectId);
            parcel.writeList(this.musicIds);
            parcel.writeString(this.videoCoverImgPath);
            parcel.writeInt(this.videoCoverStartTime);
            parcel.writeString(this.templateText);
            parcel.writeString(this.userText);
        }
    }
}
