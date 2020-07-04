package com.p280ss.android.ugc.aweme.infosticker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.google.common.collect.C17995dt;
import com.google.common.collect.ImmutableMultiset;
import com.google.gson.p276a.C6593c;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.infosticker.InfoStickerModel */
public class InfoStickerModel implements Parcelable, Serializable, Cloneable {
    public static final Creator<InfoStickerModel> CREATOR = new Creator<InfoStickerModel>() {
        /* renamed from: a */
        private static InfoStickerModel[] m104107a(int i) {
            return new InfoStickerModel[i];
        }

        /* renamed from: a */
        private static InfoStickerModel m104106a(Parcel parcel) {
            return new InfoStickerModel(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m104106a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m104107a(i);
        }
    };
    @C6593c(mo15949a = "sticker_dir")
    public String infoStickerDraftDir;
    @C6593c(mo15949a = "text_align")
    public int mAlign = 2;
    @C6593c(mo15949a = "bg_mode")
    public int mBgMode = 1;
    @C6593c(mo15949a = "bg_color")
    public int mColor = -1;
    @C6593c(mo15949a = "text_font")
    public String mFontType;
    @C6593c(mo15949a = "stickers")
    public List<StickerItemModel> stickers;

    public int describeContents() {
        return 0;
    }

    public InfoStickerModel clone() {
        try {
            return (InfoStickerModel) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String getInfoStickerIds() {
        if (C6311g.m19573a(this.stickers)) {
            return "";
        }
        return getNotEmptyInfoStickerIds();
    }

    public StickerItemModel getLyricStickerModel() {
        if (C6311g.m19573a(this.stickers)) {
            return null;
        }
        for (StickerItemModel stickerItemModel : this.stickers) {
            if (stickerItemModel.isLyric()) {
                return stickerItemModel;
            }
        }
        return null;
    }

    public String getNotEmptyInfoStickerIds() {
        C17995dt it = ImmutableMultiset.copyOf((Iterable<? extends E>) this.stickers).iterator();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (it.hasNext()) {
            StickerItemModel stickerItemModel = (StickerItemModel) it.next();
            if (!TextUtils.isEmpty(stickerItemModel.stickerId) && stickerItemModel.type != 2) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(stickerItemModel.stickerId);
            }
        }
        return sb.toString();
    }

    public int getSubtitleRule() {
        if (C6311g.m19573a(this.stickers)) {
            return -1;
        }
        int i = 0;
        while (true) {
            if (i >= this.stickers.size()) {
                i = -1;
                break;
            } else if (((StickerItemModel) this.stickers.get(i)).isSubtitleRule()) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }

    public boolean hasLyricSticker() {
        if (C6311g.m19573a(this.stickers)) {
            return false;
        }
        for (StickerItemModel isLyric : this.stickers) {
            if (isLyric.isLyric()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSubtitle() {
        if (C6311g.m19573a(this.stickers)) {
            return false;
        }
        for (StickerItemModel isSubtitle : this.stickers) {
            if (isSubtitle.isSubtitle()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InfoStickerModel{infoStickerDraftDir='");
        sb.append(this.infoStickerDraftDir);
        sb.append('\'');
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append('}');
        return sb.toString();
    }

    public String getOtherEffect() {
        if (C6311g.m19573a(this.stickers)) {
            return "[]";
        }
        C17995dt it = ImmutableMultiset.copyOf((Iterable<? extends E>) this.stickers).iterator();
        JSONArray jSONArray = new JSONArray();
        while (it.hasNext()) {
            try {
                StickerItemModel stickerItemModel = (StickerItemModel) it.next();
                if (stickerItemModel.type == 10) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", stickerItemModel.stickerId);
                    jSONObject.put("type", "giphy");
                    jSONArray.put(jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        return jSONArray.toString();
    }

    public void addSticker(StickerItemModel stickerItemModel) {
        this.stickers.add(stickerItemModel);
    }

    public void removeSticker(StickerItemModel stickerItemModel) {
        this.stickers.remove(stickerItemModel);
    }

    protected InfoStickerModel(Parcel parcel) {
        this.infoStickerDraftDir = parcel.readString();
        this.stickers = parcel.createTypedArrayList(StickerItemModel.CREATOR);
        this.mFontType = parcel.readString();
        this.mColor = parcel.readInt();
        this.mBgMode = parcel.readInt();
        this.mAlign = parcel.readInt();
    }

    public InfoStickerModel(InfoStickerModel infoStickerModel) {
        this.infoStickerDraftDir = infoStickerModel.infoStickerDraftDir;
        this.stickers = new ArrayList(infoStickerModel.stickers);
        this.mFontType = infoStickerModel.mFontType;
        this.mColor = infoStickerModel.mColor;
        this.mBgMode = infoStickerModel.mBgMode;
        this.mAlign = infoStickerModel.mAlign;
    }

    public InfoStickerModel(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append("stickers");
        this.infoStickerDraftDir = sb.toString();
        this.stickers = new ArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.infoStickerDraftDir);
        parcel.writeTypedList(this.stickers);
        parcel.writeString(this.mFontType);
        parcel.writeInt(this.mColor);
        parcel.writeInt(this.mBgMode);
        parcel.writeInt(this.mAlign);
    }
}
