package com.p280ss.android.ugc.aweme.services.effect;

import android.content.Context;
import android.graphics.Bitmap;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.android.ugc.aweme.services.effect.IEffectService */
public interface IEffectService {

    /* renamed from: com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback */
    public interface OnVideoCoverCallback {
        void onGetVideoCoverFailed(int i);

        void onGetVideoCoverSuccess(Bitmap bitmap);
    }

    C27481e createEffectPlatform(Context context, String str, OkHttpClient okHttpClient);

    void fetchEffectWithMusicBind(C27481e eVar, String str, String str2, C43760j jVar);

    void fetchEffectWithMusicBind(C27481e eVar, String str, Map<String, String> map, C43760j jVar);

    String getCacheDir();

    ArrayList<String> getDraftEffectList();

    String getLiveStickerPannel();

    void getVideoCoverByCallback(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, OnVideoCoverCallback onVideoCoverCallback);
}
