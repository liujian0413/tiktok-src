package com.p280ss.android.ugc.aweme.sticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.StickerPoi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.FaceStickerBean */
public class FaceStickerBean implements Parcelable {
    public static final Creator<FaceStickerBean> CREATOR = new Creator<FaceStickerBean>() {
        /* renamed from: a */
        private static FaceStickerBean[] m133121a(int i) {
            return new FaceStickerBean[i];
        }

        /* renamed from: a */
        private static FaceStickerBean m133120a(Parcel parcel) {
            return new FaceStickerBean(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m133120a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m133121a(i);
        }
    };
    public static final FaceStickerBean NONE = new FaceStickerBean();
    public static final int SOURCE_DESIGNER = 1;
    public static final int TYPE_COLLECT = 1;
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_SCHEMA = 2;
    public static String sCurPropSource;
    @C6593c(mo15949a = "ad_raw_data")
    private String adRawData;
    @C6593c(mo15949a = "children")
    List<String> children;
    @C6593c(mo15949a = "designer_id")
    private String designerId;
    @C6593c(mo15949a = "effect_type")
    int effectType;
    @C6593c(mo15949a = "extra")
    private String extra;
    FaceStickerCommerceBean faceStickerCommerceBean;
    @C6593c(mo15949a = "file_url")
    UrlModel fileUrl;
    @C6593c(mo15949a = "force_bind_music")
    private AVMusic forceBindMusic;
    @C6593c(mo15949a = "force_bind_music_path")
    private String forceBindMusicPath;
    @C6593c(mo15949a = "grade_key")
    private String gradeKey;
    @C6593c(mo15949a = "hint")
    String hint;
    @C6593c(mo15949a = "hint_icon")
    UrlModel hintIcon;
    @C6593c(mo15949a = "icon_url")
    UrlModel iconUrl;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    String f108863id;
    @C6593c(mo15949a = "is_busi")
    private boolean isBusi;
    @C6593c(mo15949a = "is_force_bind_music")
    private boolean isForceBind;
    public boolean isSelected;
    public String mLocalPath;
    List<String> musicIds;
    @C6593c(mo15949a = "name")
    String name;
    @C6593c(mo15949a = "parent")
    String parentId;
    String propSource;
    @C6593c(mo15949a = "schema")
    private String schema;
    @C6593c(mo15949a = "sdk_extra")
    private String sdkExtra;
    @C6593c(mo15949a = "source")
    private int source;
    @C6593c(mo15949a = "sticker_id")
    long stickerId;
    private StickerPoi stickerPoi;
    List<String> tags;
    @C6593c(mo15949a = "type")
    long type;
    List<String> types;
    @C6593c(mo15949a = "usage_scenario")
    int usageScenario;

    public FaceStickerBean() {
    }

    public int describeContents() {
        return 0;
    }

    public String getAdRawData() {
        return this.adRawData;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public String getDesignerId() {
        return this.designerId;
    }

    public int getEffectType() {
        return this.effectType;
    }

    public String getExtra() {
        return this.extra;
    }

    public FaceStickerCommerceBean getFaceStickerCommerceBean() {
        return this.faceStickerCommerceBean;
    }

    public UrlModel getFileUrl() {
        return this.fileUrl;
    }

    public AVMusic getForceBindMusic() {
        return this.forceBindMusic;
    }

    public String getForceBindMusicPath() {
        return this.forceBindMusicPath;
    }

    public String getGradeKey() {
        return this.gradeKey;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHintIcon() {
        return this.hintIcon;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getId() {
        return this.f108863id;
    }

    public String getLocalPath() {
        return this.mLocalPath;
    }

    public List<String> getMusicIds() {
        return this.musicIds;
    }

    public String getName() {
        return this.name;
    }

    public String getParentId() {
        return this.parentId;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdkExtra() {
        return this.sdkExtra;
    }

    public int getSource() {
        return this.source;
    }

    public long getStickerId() {
        return this.stickerId;
    }

    public StickerPoi getStickerPoi() {
        return this.stickerPoi;
    }

    public long getType() {
        return this.type;
    }

    public boolean isBusi() {
        return this.isBusi;
    }

    public boolean isForceBind() {
        return this.isForceBind;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public String getPropSource() {
        if (this.propSource == null) {
            return "";
        }
        return this.propSource;
    }

    public int hashCode() {
        return (int) (this.stickerId ^ (this.stickerId >>> 32));
    }

    public boolean suportLive() {
        if (this.usageScenario == 0 || this.usageScenario == 2) {
            return true;
        }
        return false;
    }

    public boolean supportVideo() {
        if (this.usageScenario == 0 || this.usageScenario == 1) {
            return true;
        }
        return false;
    }

    public List<String> getTags() {
        if (C6307b.m19566a((Collection<T>) this.tags)) {
            return new ArrayList();
        }
        return this.tags;
    }

    public List<String> getTypes() {
        if (C6307b.m19566a((Collection<T>) this.types)) {
            return new ArrayList();
        }
        return this.types;
    }

    public boolean shouldShowCommerceStickerTag() {
        if (!isBusi() || getFaceStickerCommerceBean() == null || getFaceStickerCommerceBean().f108867d != 1 || TextUtils.isEmpty(getFaceStickerCommerceBean().f108866c)) {
            return false;
        }
        return true;
    }

    public void setAdRawData(String str) {
        this.adRawData = str;
    }

    public void setBusi(boolean z) {
        this.isBusi = z;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setDesignerId(String str) {
        this.designerId = str;
    }

    public void setEffectType(int i) {
        this.effectType = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFaceStickerCommerceBean(FaceStickerCommerceBean faceStickerCommerceBean2) {
        this.faceStickerCommerceBean = faceStickerCommerceBean2;
    }

    public void setFileUrl(UrlModel urlModel) {
        this.fileUrl = urlModel;
    }

    public void setForceBind(boolean z) {
        this.isForceBind = z;
    }

    public void setForceBindMusic(AVMusic aVMusic) {
        this.forceBindMusic = aVMusic;
    }

    public void setForceBindMusicPath(String str) {
        this.forceBindMusicPath = str;
    }

    public void setGradeKey(String str) {
        this.gradeKey = str;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setHintIcon(UrlModel urlModel) {
        this.hintIcon = urlModel;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setId(String str) {
        this.f108863id = str;
    }

    public void setLocalPath(String str) {
        this.mLocalPath = str;
    }

    public void setMusicIds(List<String> list) {
        this.musicIds = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setPropSource(String str) {
        this.propSource = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSdkExtra(String str) {
        this.sdkExtra = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStickerId(long j) {
        this.stickerId = j;
    }

    public void setStickerPoi(StickerPoi stickerPoi2) {
        this.stickerPoi = stickerPoi2;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setType(long j) {
        this.type = j;
    }

    public void setTypes(List<String> list) {
        this.types = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceStickerBean)) {
            return false;
        }
        if (this.stickerId == ((FaceStickerBean) obj).stickerId) {
            return true;
        }
        return false;
    }

    protected FaceStickerBean(Parcel parcel) {
        boolean z;
        this.f108863id = parcel.readString();
        this.stickerId = parcel.readLong();
        this.name = parcel.readString();
        this.iconUrl = (UrlModel) parcel.readSerializable();
        this.fileUrl = (UrlModel) parcel.readSerializable();
        this.hint = parcel.readString();
        this.hintIcon = (UrlModel) parcel.readSerializable();
        this.type = parcel.readLong();
        this.usageScenario = parcel.readInt();
        this.types = parcel.createStringArrayList();
        this.mLocalPath = parcel.readString();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSelected = z;
        this.tags = parcel.createStringArrayList();
        this.effectType = parcel.readInt();
        this.schema = parcel.readString();
        this.source = parcel.readInt();
        this.designerId = parcel.readString();
        this.extra = parcel.readString();
        this.sdkExtra = parcel.readString();
        this.musicIds = parcel.createStringArrayList();
        this.stickerPoi = (StickerPoi) parcel.readSerializable();
        this.adRawData = parcel.readString();
        this.forceBindMusic = (AVMusic) parcel.readSerializable();
        this.forceBindMusicPath = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.isForceBind = z2;
        this.gradeKey = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f108863id);
        parcel.writeLong(this.stickerId);
        parcel.writeString(this.name);
        parcel.writeSerializable(this.iconUrl);
        parcel.writeSerializable(this.fileUrl);
        parcel.writeString(this.hint);
        parcel.writeSerializable(this.hintIcon);
        parcel.writeLong(this.type);
        parcel.writeInt(this.usageScenario);
        parcel.writeStringList(this.types);
        parcel.writeString(this.mLocalPath);
        parcel.writeByte(this.isSelected ? (byte) 1 : 0);
        parcel.writeStringList(this.tags);
        parcel.writeInt(this.effectType);
        parcel.writeString(this.schema);
        parcel.writeInt(this.source);
        parcel.writeString(this.designerId);
        parcel.writeString(this.extra);
        parcel.writeString(this.sdkExtra);
        parcel.writeStringList(this.musicIds);
        parcel.writeSerializable(this.stickerPoi);
        parcel.writeString(this.adRawData);
        parcel.writeSerializable(this.forceBindMusic);
        parcel.writeString(this.forceBindMusicPath);
        parcel.writeByte(this.isForceBind ? (byte) 1 : 0);
        parcel.writeString(this.gradeKey);
    }
}
