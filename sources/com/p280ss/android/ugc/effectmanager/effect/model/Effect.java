package com.p280ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.Effect */
public class Effect implements Parcelable, Serializable {
    public static final Creator<Effect> CREATOR = new Creator<Effect>() {
        public final Effect[] newArray(int i) {
            return new Effect[i];
        }

        public final Effect createFromParcel(Parcel parcel) {
            return new Effect(parcel);
        }
    };
    private String ad_raw_data;
    private String app_version;
    private List<String> bind_ids;
    private List<Effect> childEffects;
    private List<String> children;
    private List<String> composerPath;
    private String composer_params;
    private String designer_encrypted_id;
    private String designer_id;
    private String device_platform;
    private boolean downloaded;
    private String effect_id;
    private int effect_type;
    private String extra;
    private UrlModel file_url;
    private String grade_key;
    private String hint;
    private UrlModel hint_icon;
    private UrlModel icon_url;

    /* renamed from: id */
    private String f113498id;
    private boolean is_busi;
    private boolean is_poi;
    private List<String> music;
    private String name;
    private String parent;
    private String poi_id;
    private long ptime;
    private List<String> requirements;
    private String resource_id;
    private String schema;
    private String sdk_extra;
    private String sdk_version;
    private int source;
    private List<String> tags;
    private String tags_updated_at;
    private String type;
    private List<String> types;
    private String unzipPath;
    private String zipPath;

    public Effect() {
    }

    public int describeContents() {
        return 0;
    }

    public String getAdRawData() {
        return this.ad_raw_data;
    }

    public String getAppVersion() {
        return this.app_version;
    }

    public List<String> getBindIds() {
        return this.bind_ids;
    }

    public List<Effect> getChildEffects() {
        return this.childEffects;
    }

    public List<String> getChildren() {
        return this.children;
    }

    public String getComposerParams() {
        return this.composer_params;
    }

    public List<String> getComposerPath() {
        return this.composerPath;
    }

    public String getDesignerEncryptedId() {
        return this.designer_encrypted_id;
    }

    public String getDesignerId() {
        return this.designer_id;
    }

    public String getDevicePlatform() {
        return this.device_platform;
    }

    public String getEffectId() {
        return this.effect_id;
    }

    public int getEffectType() {
        return this.effect_type;
    }

    public String getExtra() {
        return this.extra;
    }

    public UrlModel getFileUrl() {
        return this.file_url;
    }

    public String getGradeKey() {
        return this.grade_key;
    }

    public String getHint() {
        return this.hint;
    }

    public UrlModel getHintIcon() {
        return this.hint_icon;
    }

    public UrlModel getIconUrl() {
        return this.icon_url;
    }

    public String getId() {
        return this.f113498id;
    }

    public List<String> getMusic() {
        return this.music;
    }

    public String getName() {
        return this.name;
    }

    public String getParentId() {
        return this.parent;
    }

    public String getPoiId() {
        return this.poi_id;
    }

    public long getPublishTime() {
        return this.ptime;
    }

    public List<String> getRequirements() {
        return this.requirements;
    }

    public String getResourceId() {
        return this.resource_id;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSdkExtra() {
        return this.sdk_extra;
    }

    public String getSdkVersion() {
        return this.sdk_version;
    }

    public int getSource() {
        return this.source;
    }

    public String getTagsUpdatedAt() {
        return this.tags_updated_at;
    }

    public String getType() {
        return this.type;
    }

    public List<String> getTypes() {
        return this.types;
    }

    public String getUnzipPath() {
        return this.unzipPath;
    }

    public String getZipPath() {
        return this.zipPath;
    }

    public boolean isBusiness() {
        return this.is_busi;
    }

    public boolean isDownloaded() {
        return this.downloaded;
    }

    public boolean isIsPoi() {
        return this.is_poi;
    }

    public List<String> getTags() {
        if (this.tags == null) {
            return new ArrayList();
        }
        return this.tags;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Effect{name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", effect_id='");
        sb.append(this.effect_id);
        sb.append('\'');
        sb.append(", type='");
        sb.append(this.type);
        sb.append('\'');
        sb.append(", unzipPath='");
        sb.append(this.unzipPath);
        sb.append('\'');
        sb.append(", children=");
        sb.append(this.children);
        sb.append(", effectType=");
        sb.append(this.effect_type);
        sb.append(", parentId=");
        sb.append(this.parent);
        sb.append('}');
        return sb.toString();
    }

    public void setAdRawData(String str) {
        this.ad_raw_data = str;
    }

    public void setAppVersion(String str) {
        this.app_version = str;
    }

    public void setBindIds(List<String> list) {
        this.bind_ids = list;
    }

    public void setChildEffects(List<Effect> list) {
        this.childEffects = list;
    }

    public void setChildren(List<String> list) {
        this.children = list;
    }

    public void setComposerParams(String str) {
        this.composer_params = str;
    }

    public void setComposerPath(List<String> list) {
        this.composerPath = list;
    }

    public void setDesignerEncryptedId(String str) {
        this.designer_encrypted_id = str;
    }

    public void setDesignerId(String str) {
        this.designer_id = str;
    }

    public void setDevicePlatform(String str) {
        this.device_platform = str;
    }

    public void setDownloaded(boolean z) {
        this.downloaded = z;
    }

    public void setEffectId(String str) {
        this.effect_id = str;
    }

    public void setEffectType(int i) {
        this.effect_type = i;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFileUrl(UrlModel urlModel) {
        this.file_url = urlModel;
    }

    public void setGradeKey(String str) {
        this.grade_key = str;
    }

    public void setHint(String str) {
        this.hint = str;
    }

    public void setHintIcon(UrlModel urlModel) {
        this.hint_icon = urlModel;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.icon_url = urlModel;
    }

    public void setId(String str) {
        this.f113498id = str;
    }

    public void setIsBusiness(boolean z) {
        this.is_busi = z;
    }

    public void setIsPoi(boolean z) {
        this.is_poi = z;
    }

    public void setMusic(List<String> list) {
        this.music = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParentId(String str) {
        this.parent = str;
    }

    public void setPoiId(String str) {
        this.poi_id = str;
    }

    public void setPublishTime(long j) {
        this.ptime = j;
    }

    public Effect setRequirements(List<String> list) {
        this.requirements = list;
        return this;
    }

    public void setResourceId(String str) {
        this.resource_id = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSdkExtra(String str) {
        this.sdk_extra = str;
    }

    public void setSdkVersion(String str) {
        this.sdk_version = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public void setTagsUpdatedAt(String str) {
        this.tags_updated_at = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setTypes(List<String> list) {
        this.types = list;
    }

    public void setUnzipPath(String str) {
        this.unzipPath = str;
    }

    public void setZipPath(String str) {
        this.zipPath = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Effect) {
            return TextUtils.equals(this.effect_id, ((Effect) obj).effect_id);
        }
        return super.equals(obj);
    }

    protected Effect(Parcel parcel) {
        boolean z;
        boolean z2;
        this.name = parcel.readString();
        this.hint = parcel.readString();
        this.sdk_version = parcel.readString();
        this.app_version = parcel.readString();
        this.file_url = (UrlModel) parcel.readParcelable(UrlModel.class.getClassLoader());
        this.icon_url = (UrlModel) parcel.readParcelable(UrlModel.class.getClassLoader());
        this.f113498id = parcel.readString();
        this.effect_id = parcel.readString();
        this.type = parcel.readString();
        this.types = parcel.createStringArrayList();
        this.device_platform = parcel.readString();
        this.zipPath = parcel.readString();
        this.unzipPath = parcel.readString();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.downloaded = z;
        this.tags = parcel.createStringArrayList();
        this.tags_updated_at = parcel.readString();
        this.hint_icon = (UrlModel) parcel.readParcelable(UrlModel.class.getClassLoader());
        this.children = parcel.createStringArrayList();
        this.childEffects = parcel.createTypedArrayList(CREATOR);
        this.effect_type = parcel.readInt();
        this.parent = parcel.readString();
        this.source = parcel.readInt();
        this.designer_id = parcel.readString();
        this.schema = parcel.readString();
        this.requirements = parcel.createStringArrayList();
        this.music = parcel.createStringArrayList();
        this.extra = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.is_busi = z2;
        this.poi_id = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.is_poi = z3;
        this.designer_encrypted_id = parcel.readString();
        this.sdk_extra = parcel.readString();
        this.ad_raw_data = parcel.readString();
        this.composerPath = parcel.createStringArrayList();
        this.ptime = parcel.readLong();
        this.grade_key = parcel.readString();
        this.composer_params = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.hint);
        parcel.writeString(this.sdk_version);
        parcel.writeString(this.app_version);
        parcel.writeParcelable(this.file_url, i);
        parcel.writeParcelable(this.icon_url, i);
        parcel.writeString(this.f113498id);
        parcel.writeString(this.effect_id);
        parcel.writeString(this.type);
        parcel.writeStringList(this.types);
        parcel.writeString(this.device_platform);
        parcel.writeString(this.zipPath);
        parcel.writeString(this.unzipPath);
        parcel.writeByte(this.downloaded ? (byte) 1 : 0);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.tags_updated_at);
        parcel.writeParcelable(this.hint_icon, i);
        parcel.writeStringList(this.children);
        parcel.writeTypedList(this.childEffects);
        parcel.writeInt(this.effect_type);
        parcel.writeString(this.parent);
        parcel.writeInt(this.source);
        parcel.writeString(this.designer_id);
        parcel.writeString(this.schema);
        parcel.writeStringList(this.requirements);
        parcel.writeStringList(this.music);
        parcel.writeString(this.extra);
        parcel.writeByte(this.is_busi ? (byte) 1 : 0);
        parcel.writeString(this.poi_id);
        parcel.writeByte(this.is_poi ? (byte) 1 : 0);
        parcel.writeString(this.designer_encrypted_id);
        parcel.writeString(this.sdk_extra);
        parcel.writeString(this.ad_raw_data);
        parcel.writeStringList(this.composerPath);
        parcel.writeLong(this.ptime);
        parcel.writeString(this.grade_key);
        parcel.writeString(this.composer_params);
    }
}
