package com.p280ss.android.ugc.aweme.services;

import android.content.Context;
import com.p280ss.android.ugc.aweme.photo.C34758j;
import com.p280ss.android.ugc.aweme.photo.C34791s;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photo.edit.PhotoEditActivity;
import com.p280ss.android.ugc.aweme.services.photo.IPhotoService;

/* renamed from: com.ss.android.ugc.aweme.services.PhotoService */
public class PhotoService implements IPhotoService {
    public boolean isPhotoEditEnabled() {
        return C34758j.m112134a();
    }

    public int[] getImageWidthHeight(String str) {
        return C34758j.m112136b(str);
    }

    public void toPhotoEditActivity(Context context, PhotoContext photoContext) {
        PhotoEditActivity.m112080a(context, photoContext);
    }

    public PhotoContext compress(String str, C34791s sVar) {
        return C34758j.m112132a(str, sVar);
    }

    public PhotoContext compress(String str, C34791s sVar, int i, int i2) {
        return C34758j.m112133a(str, sVar, i, i2);
    }
}
