package com.p280ss.android.ugc.aweme.services.effect;

import android.app.Application;
import android.content.Context;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.presenter.C40213a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1603e.C40557c;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.android.ugc.aweme.services.effect.EffectService */
public class EffectService implements IEffectService {
    private C40557c fetcher;

    public String getLiveStickerPannel() {
        return "livestreaming";
    }

    public String getCacheDir() {
        return EffectPlatform.m90012a();
    }

    public ArrayList<String> getDraftEffectList() {
        return EffectPlatform.m90016g();
    }

    public C27481e createEffectPlatform(Context context, String str, OkHttpClient okHttpClient) {
        return new EffectPlatform(context, str, okHttpClient);
    }

    public void fetchEffectWithMusicBind(C27481e eVar, String str, String str2, C43760j jVar) {
        if (this.fetcher == null) {
            this.fetcher = new C40557c(eVar);
        }
        this.fetcher.mo100631a(str, str2, jVar);
    }

    public void fetchEffectWithMusicBind(C27481e eVar, String str, Map<String, String> map, C43760j jVar) {
        if (this.fetcher == null) {
            this.fetcher = new C40557c(eVar);
        }
        this.fetcher.mo100632a(str, map, jVar);
    }

    public void getVideoCoverByCallback(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, OnVideoCoverCallback onVideoCoverCallback) {
        C35546al alVar = C35563c.f93228J;
        Application application = C35563c.f93238a;
        final List<EffectPointModel> list2 = list;
        final String str2 = str;
        final float f2 = f;
        final int i2 = i;
        final boolean z2 = z;
        final EditPreviewInfo editPreviewInfo2 = editPreviewInfo;
        final OnVideoCoverCallback onVideoCoverCallback2 = onVideoCoverCallback;
        C374331 r2 = new C35547a() {
            public void onCancel() {
            }

            public void onSuccess() {
                C40213a.m128525a(list2, str2, f2, i2, z2, editPreviewInfo2, onVideoCoverCallback2);
            }
        };
        alVar.mo90366a(application, false, r2);
    }
}
