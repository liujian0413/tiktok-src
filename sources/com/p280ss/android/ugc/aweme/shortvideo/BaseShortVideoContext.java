package com.p280ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p280ss.android.ugc.aweme.sticker.StickerInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext */
public abstract class BaseShortVideoContext implements Parcelable {
    public static final int MESSAGE_BUBBLE_TYPE_STATUS = 6;
    public static final int MESSAGE_BUBBLE_TYPE_SUBTITLE = 5;
    public static final int MESSAGE_BUBBLE_TYPE_TEXT = 1;
    public static final int MESSAGE_BUBBLE_TYPE_TEXT_STICKER = 4;
    public static final int MESSAGE_BUBBLE_TYPE_VOTE_STICKER = 3;
    public int allowDownloadSetting;
    public ArrayList<String> arTextList;
    private AVETParameter avetParameter;
    public List<AVChallenge> challenges;
    public String city;
    public int commentSetting;
    public String commerceData;
    public DraftEditTransferModel draftEditTransferModel;
    public String globalData;
    public int isPrivate;
    public String latitude;
    public String longitude;
    public boolean mIsFromDraft;
    public String mShootWay;
    public String mSyncPlatforms;
    private int mVideoLength;
    private String mainBusinessData;
    public ArrayList<String> messageBubbleTexts;
    public String nationalTaskId;
    public String poiData;
    public String poiId;
    public String poiName;
    public HashMap<String, String> poiServerMobParam;
    public int reactDuetSetting;
    public String socialData;
    public StickerInfo stickerInfo;
    public List<AVTextExtraStruct> structList;
    public String tagId;
    public String techData;
    public String title;
    public String ugData;
    public long userClickPublishTime;

    public BaseShortVideoContext() {
    }

    public int describeContents() {
        return 0;
    }

    public String getMainBusinessData() {
        return this.mainBusinessData;
    }

    public int getVideoLength() {
        return this.mVideoLength;
    }

    public AVETParameter getAvetParameter() {
        if (this.avetParameter == null) {
            this.avetParameter = new AVETParameter();
        }
        return this.avetParameter;
    }

    public String getDraftPrimaryKey() {
        if (this.draftEditTransferModel != null) {
            return this.draftEditTransferModel.getPrimaryKey();
        }
        return null;
    }

    public String getPropGradeKey() {
        if (this.stickerInfo == null) {
            return "";
        }
        return this.stickerInfo.getGradeKey();
    }

    public String getPropSource() {
        if (this.stickerInfo == null) {
            return "";
        }
        return this.stickerInfo.getPropSource();
    }

    public boolean isPoiOrderRate() {
        if (TextUtils.isEmpty(this.poiId)) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(new JSONObject(this.poiId).getString("mPoiRateId"))) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public void setAvetParameter(AVETParameter aVETParameter) {
        this.avetParameter = aVETParameter;
    }

    public void setMainBusinessData(String str) {
        this.mainBusinessData = str;
    }

    public void setVideoLength(int i) {
        this.mVideoLength = i;
    }

    protected BaseShortVideoContext(Parcel parcel) {
        boolean z;
        this.challenges = new ArrayList();
        parcel.readList(this.challenges, AVChallenge.class.getClassLoader());
        this.nationalTaskId = parcel.readString();
        this.tagId = parcel.readString();
        this.title = parcel.readString();
        this.structList = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.city = parcel.readString();
        this.longitude = parcel.readString();
        this.latitude = parcel.readString();
        this.isPrivate = parcel.readInt();
        this.poiId = parcel.readString();
        this.poiName = parcel.readString();
        this.mVideoLength = parcel.readInt();
        this.mSyncPlatforms = parcel.readString();
        this.mShootWay = parcel.readString();
        this.stickerInfo = (StickerInfo) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsFromDraft = z;
        this.commentSetting = parcel.readInt();
        this.reactDuetSetting = parcel.readInt();
        setMainBusinessData(parcel.readString());
        this.socialData = parcel.readString();
        this.poiData = parcel.readString();
        this.commerceData = parcel.readString();
        this.ugData = parcel.readString();
        this.techData = parcel.readString();
        this.globalData = parcel.readString();
        this.avetParameter = (AVETParameter) parcel.readSerializable();
        this.arTextList = parcel.createStringArrayList();
        this.messageBubbleTexts = parcel.createStringArrayList();
        this.draftEditTransferModel = (DraftEditTransferModel) parcel.readParcelable(DraftEditTransferModel.class.getClassLoader());
        this.userClickPublishTime = parcel.readLong();
        this.allowDownloadSetting = parcel.readInt();
        this.poiServerMobParam = (HashMap) parcel.readSerializable();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.challenges);
        parcel.writeString(this.nationalTaskId);
        parcel.writeString(this.tagId);
        parcel.writeString(this.title);
        parcel.writeTypedList(this.structList);
        parcel.writeString(this.city);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        parcel.writeInt(this.isPrivate);
        parcel.writeString(this.poiId);
        parcel.writeString(this.poiName);
        parcel.writeInt(this.mVideoLength);
        parcel.writeString(this.mSyncPlatforms);
        parcel.writeString(this.mShootWay);
        parcel.writeSerializable(this.stickerInfo);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : 0);
        parcel.writeInt(this.commentSetting);
        parcel.writeInt(this.reactDuetSetting);
        parcel.writeString(getMainBusinessData());
        parcel.writeString(this.socialData);
        parcel.writeString(this.poiData);
        parcel.writeString(this.commerceData);
        parcel.writeString(this.ugData);
        parcel.writeString(this.techData);
        parcel.writeString(this.globalData);
        parcel.writeSerializable(this.avetParameter);
        parcel.writeStringList(this.arTextList);
        parcel.writeStringList(this.messageBubbleTexts);
        parcel.writeParcelable(this.draftEditTransferModel, i);
        parcel.writeLong(this.userClickPublishTime);
        parcel.writeInt(this.allowDownloadSetting);
        parcel.writeSerializable(this.poiServerMobParam);
    }
}
