package com.p280ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.photomovie.edit.cover.C34882a.C34883a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieContext */
public class PhotoMovieContext extends BaseShortVideoContext implements Parcelable {
    public static final Creator<PhotoMovieContext> CREATOR = new Creator<PhotoMovieContext>() {
        /* renamed from: a */
        private static PhotoMovieContext[] m112303a(int i) {
            return new PhotoMovieContext[i];
        }

        /* renamed from: a */
        private static PhotoMovieContext m112302a(Parcel parcel) {
            return new PhotoMovieContext(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m112302a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m112303a(i);
        }
    };
    public static final int PHOTO_MOVIE_COVER_HEIGHT = 228;
    public static final int PHOTO_MOVIE_COVER_WIDTH = 128;
    public static final int PHOTO_MOVIE_FROM_DRAFT = 1;
    public static final int PHOTO_MOVIE_FROM_RECORD_UPLOAD = 2;
    public static final int PHOTO_MOVIE_FROM_UPLOAD = 0;
    @C6593c(mo15949a = "creationId")
    public String creationId;
    @C6593c(mo15949a = "draftId")
    public int draftId;
    @C6593c(mo15949a = "extract_model")
    public ExtractFramesModel extractFramesModel;
    @C6593c(mo15949a = "mCoverStartTm")
    public float mCoverStartTm;
    @C6593c(mo15949a = "mFilterId")
    public int mFilterId;
    @C6593c(mo15949a = "mFilterName")
    public String mFilterName;
    @C6593c(mo15949a = "mFilterPath")
    public String mFilterPath;
    @C6593c(mo15949a = "mFinalVideoTmpPath")
    public String mFinalVideoTmpPath;
    @C6593c(mo15949a = "mFrom")
    public int mFrom;
    @C6593c(mo15949a = "mHeight")
    public int mHeight;
    @C6593c(mo15949a = "mImageList")
    public List<String> mImageList;
    @C6593c(mo15949a = "mInputAudioPath")
    public String mInputAudioPath;
    @C6593c(mo15949a = "mMusic")
    public AVMusic mMusic;
    @C6593c(mo15949a = "mMusicList")
    public List<AVMusic> mMusicList = new ArrayList();
    @C6593c(mo15949a = "mMusicPath")
    public String mMusicPath;
    @C6593c(mo15949a = "mOutputVideoPath")
    public String mOutputVideoPath;
    @C6593c(mo15949a = "mPlayType")
    public int mPlayType;
    @C6593c(mo15949a = "mRealImageCount")
    public int mRealImageCount;
    @C6593c(mo15949a = "save_model")
    public AVUploadSaveModel mSaveModel;
    @C6593c(mo15949a = "mWidth")
    public int mWidth;
    @C6593c(mo15949a = "music_origin")
    public String musicOrigin;
    @C6593c(mo15949a = "photo_time")
    public int photoTime;
    @C6593c(mo15949a = "shop_draft_id")
    public String shopDraftId;
    @C6593c(mo15949a = "trans_time")
    public int transTime;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieContext$a */
    public interface C34822a {
        /* renamed from: a */
        void mo70305a(Bitmap bitmap, int i, int i2);
    }

    public int describeContents() {
        return 0;
    }

    public PhotoMovieContext() {
    }

    public int getImageCount() {
        if (this.mImageList == null) {
            return 0;
        }
        return this.mImageList.size();
    }

    public String getLocalTempPath() {
        if (this.mSaveModel == null) {
            return null;
        }
        return this.mSaveModel.getLocalTempPath();
    }

    public boolean isSaveLocal() {
        if (this.mSaveModel == null || !this.mSaveModel.isSaveLocal()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithWaterMark() {
        if (this.mSaveModel == null || !this.mSaveModel.isSaveLocalWithWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithoutWaterMark() {
        if (this.mSaveModel == null || this.mSaveModel.isWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToAlbum() {
        if (this.mSaveModel == null || !this.mSaveModel.getSaveToAlbum()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToLocalPathInsteadOfAlbum() {
        if (this.mSaveModel == null || !this.mSaveModel.isSaveToAppPathInsteadOfAlbum()) {
            return false;
        }
        return true;
    }

    public String getPhotoMovieCover() {
        if (C6307b.m19566a((Collection<T>) this.mImageList) || getVideoLength() == 0) {
            return null;
        }
        return (String) this.mImageList.get(new C34883a().mo88417a(this.mImageList.size(), this.mCoverStartTm / ((((float) getVideoLength()) * 1.0f) / 1000.0f)));
    }

    public void getPhotoMovieCover(C34822a aVar) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).photoMovieService().getPhotoMovieCover(this, aVar);
    }

    protected PhotoMovieContext(Parcel parcel) {
        super(parcel);
        this.mFinalVideoTmpPath = parcel.readString();
        this.mImageList = parcel.createStringArrayList();
        this.musicOrigin = parcel.readString();
        this.mMusicPath = parcel.readString();
        this.mHeight = parcel.readInt();
        this.mWidth = parcel.readInt();
        this.mPlayType = parcel.readInt();
        this.mOutputVideoPath = parcel.readString();
        this.mInputAudioPath = parcel.readString();
        this.mCoverStartTm = parcel.readFloat();
        this.mMusic = (AVMusic) parcel.readSerializable();
        this.mFilterPath = parcel.readString();
        this.mFilterName = parcel.readString();
        this.mFilterId = parcel.readInt();
        this.mFrom = parcel.readInt();
        this.creationId = parcel.readString();
        this.draftId = parcel.readInt();
        this.shopDraftId = parcel.readString();
        this.mSaveModel = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.photoTime = parcel.readInt();
        this.transTime = parcel.readInt();
        this.mRealImageCount = parcel.readInt();
    }

    public static PhotoMovieContext convertFromOld(PhotoMovieContextOld photoMovieContextOld) {
        PhotoMovieContext photoMovieContext = new PhotoMovieContext();
        photoMovieContext.mFinalVideoTmpPath = photoMovieContextOld.f90818a;
        photoMovieContext.mImageList = photoMovieContextOld.f90819b;
        photoMovieContext.musicOrigin = photoMovieContextOld.f90831n;
        photoMovieContext.mMusicPath = photoMovieContextOld.f90820c;
        photoMovieContext.mHeight = photoMovieContextOld.f90822e;
        photoMovieContext.mWidth = photoMovieContextOld.f90823f;
        photoMovieContext.mPlayType = photoMovieContextOld.f90824g;
        photoMovieContext.mOutputVideoPath = photoMovieContextOld.f90825h;
        photoMovieContext.mInputAudioPath = photoMovieContextOld.f90826i;
        photoMovieContext.mCoverStartTm = photoMovieContextOld.f90827j;
        photoMovieContext.mMusic = photoMovieContextOld.f90828k;
        photoMovieContext.mFilterPath = photoMovieContextOld.f90829l;
        photoMovieContext.mFrom = photoMovieContextOld.f90830m;
        photoMovieContext.challenges = photoMovieContextOld.challenges;
        photoMovieContext.title = photoMovieContextOld.title;
        photoMovieContext.structList = photoMovieContextOld.structList;
        photoMovieContext.city = photoMovieContextOld.city;
        photoMovieContext.longitude = photoMovieContextOld.longitude;
        photoMovieContext.latitude = photoMovieContextOld.latitude;
        photoMovieContext.isPrivate = photoMovieContextOld.isPrivate;
        photoMovieContext.poiId = photoMovieContextOld.poiId;
        photoMovieContext.poiName = photoMovieContextOld.poiName;
        photoMovieContext.setVideoLength(photoMovieContextOld.getVideoLength());
        photoMovieContext.mSyncPlatforms = photoMovieContextOld.mSyncPlatforms;
        photoMovieContext.mShootWay = photoMovieContextOld.mShootWay;
        photoMovieContext.nationalTaskId = photoMovieContextOld.nationalTaskId;
        photoMovieContext.mIsFromDraft = photoMovieContextOld.mIsFromDraft;
        photoMovieContext.commentSetting = photoMovieContextOld.commentSetting;
        photoMovieContext.photoTime = photoMovieContextOld.f90832o;
        photoMovieContext.transTime = photoMovieContextOld.f90833p;
        photoMovieContext.allowDownloadSetting = photoMovieContextOld.allowDownloadSetting;
        return photoMovieContext;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mFinalVideoTmpPath);
        parcel.writeStringList(this.mImageList);
        parcel.writeString(this.musicOrigin);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mHeight);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mPlayType);
        parcel.writeString(this.mOutputVideoPath);
        parcel.writeString(this.mInputAudioPath);
        parcel.writeFloat(this.mCoverStartTm);
        parcel.writeSerializable(this.mMusic);
        parcel.writeString(this.mFilterPath);
        parcel.writeString(this.mFilterName);
        parcel.writeInt(this.mFilterId);
        parcel.writeInt(this.mFrom);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.shopDraftId);
        parcel.writeParcelable(this.mSaveModel, i);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeInt(this.photoTime);
        parcel.writeInt(this.transTime);
        parcel.writeInt(this.mRealImageCount);
    }
}
