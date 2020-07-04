package com.p280ss.android.ugc.aweme.services.photo;

import android.content.Context;
import com.p280ss.android.ugc.aweme.photo.C34791s;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;

/* renamed from: com.ss.android.ugc.aweme.services.photo.IPhotoService */
public interface IPhotoService {
    PhotoContext compress(String str, C34791s sVar);

    PhotoContext compress(String str, C34791s sVar, int i, int i2);

    int[] getImageWidthHeight(String str);

    boolean isPhotoEditEnabled();

    void toPhotoEditActivity(Context context, PhotoContext photoContext);
}
