package com.p280ss.android.ugc.aweme.photo;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29965e;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photo.PhotoContext */
public class PhotoContext implements Serializable {
    private AVETParameter avetParameter;
    public List<AVChallenge> challenges;
    public String commerceData;
    public String creationId;
    public DefaultSelectStickerPoi defaultSelectStickerPoi;
    public int draftId;
    public String globalData;
    public float mBigEyesRate;
    public String mCamera;
    public List<AVTextExtraStruct> mExtras;
    public int mFilterId;
    public int mFilterIndex;
    public String mFilterName;
    public float mFilterRate = 0.8f;
    public boolean mFromOtherPlatform;
    public int mHeight;
    public int mImageType;
    public int mIsPrivate;
    public String mLatitude;
    public String mLongitude;
    public int mPhotoFrom;
    public String mPhotoLocalPath;
    public String mPoiId;
    public String mPoiName;
    public String mPrettify;
    public String mPropSource;
    public String mShootWay;
    public float mSmoothSkinRate;
    public int mState;
    public String mStickers;
    public String mSyncPlatforms;
    public String mText;
    private String mTmpPath;
    public int mWidth;
    public String mainBusinessData;
    public String md5;
    public MicroAppModel microAppModel;
    public String poiData;
    public Map<String, String> poiServerMobParam;
    public String shopDraftId;
    public String socialData;
    public String techData;
    public String ugData;

    public AVETParameter getAvetParameter() {
        if (this.avetParameter == null) {
            this.avetParameter = new AVETParameter();
        }
        return this.avetParameter;
    }

    public Uri getPhotoUri() {
        if (!TextUtils.isEmpty(this.mPhotoLocalPath)) {
            return Uri.fromFile(new File(this.mPhotoLocalPath));
        }
        return null;
    }

    public void updatePhotoPath() {
        File file = new File(this.mPhotoLocalPath);
        if (file.exists()) {
            file.delete();
        }
        this.mPhotoLocalPath = this.mTmpPath;
        this.mTmpPath = null;
    }

    public boolean isPoiOrderRate() {
        if (TextUtils.isEmpty(this.mPoiId)) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(new JSONObject(this.mPoiId).getString("mPoiRateId"))) {
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

    public String getTmpPhotoPath(Context context) {
        genTmpPath(context);
        return this.mTmpPath;
    }

    private PhotoContext(int i) {
        this.mPhotoFrom = i;
    }

    private void genTmpPath(Context context) {
        if (TextUtils.isEmpty(this.mTmpPath)) {
            this.mTmpPath = genTmpPhotoPath(context);
        }
    }

    public Uri getTmpPhotoUri(Context context) {
        genTmpPath(context);
        return Uri.fromFile(new File(this.mTmpPath));
    }

    public void delTmpPhoto(Context context) {
        genTmpPath(context);
        File file = new File(this.mTmpPath);
        if (file.exists()) {
            file.delete();
        }
    }

    private static String genTmpPhotoPath(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        StringBuilder sb = new StringBuilder("tmp-photo-");
        sb.append(System.currentTimeMillis());
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(absolutePath);
        sb3.append(File.separator);
        sb3.append(sb2);
        return sb3.toString();
    }

    public static PhotoContext fromCapture(String str, int i, int i2, String str2) {
        C29965e.m98246a(str);
        PhotoContext photoContext = new PhotoContext(1);
        photoContext.creationId = str2;
        photoContext.mPhotoLocalPath = str;
        photoContext.mWidth = i;
        photoContext.mHeight = i2;
        return photoContext;
    }

    public static PhotoContext fromUpload(String str, int i, int i2, String str2) {
        C29965e.m98246a(str);
        PhotoContext photoContext = new PhotoContext(0);
        photoContext.creationId = str2;
        photoContext.mPhotoLocalPath = str;
        photoContext.mWidth = i;
        photoContext.mHeight = i2;
        return photoContext;
    }
}
