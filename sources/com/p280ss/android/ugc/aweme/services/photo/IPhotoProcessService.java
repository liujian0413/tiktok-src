package com.p280ss.android.ugc.aweme.services.photo;

import android.graphics.Bitmap;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;

/* renamed from: com.ss.android.ugc.aweme.services.photo.IPhotoProcessService */
public interface IPhotoProcessService {

    /* renamed from: com.ss.android.ugc.aweme.services.photo.IPhotoProcessService$IPhotoServiceListener */
    public interface IPhotoServiceListener {
        void onSaved(int i, PhotoContext photoContext);

        void onWaterMakerAdded(Bitmap bitmap);
    }

    void photoAddStoryWaterMarker(String str, String str2, IPhotoServiceListener iPhotoServiceListener);

    void photoAddWaterMarker(Bitmap bitmap, IPhotoServiceListener iPhotoServiceListener);

    void savePhotoWithWaterMarker(PhotoContext photoContext, IPhotoServiceListener iPhotoServiceListener);

    void savePhotoWithoutWaterMarker(PhotoContext photoContext, IPhotoServiceListener iPhotoServiceListener);
}
