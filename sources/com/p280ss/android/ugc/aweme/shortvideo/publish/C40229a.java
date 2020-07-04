package com.p280ss.android.ugc.aweme.shortvideo.publish;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35584s.C35589e;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a */
public final class C40229a {

    /* renamed from: a */
    public static final C40229a f104546a = new C40229a();

    /* renamed from: b */
    private static final Map<String, String> f104547b = new LinkedHashMap();

    private C40229a() {
    }

    /* renamed from: a */
    public static Map<String, String> m128552a() {
        return f104547b;
    }

    /* renamed from: a */
    public static C35589e m128549a(PhotoContext photoContext) {
        C7573i.m23587b(photoContext, "context");
        C35589e eVar = new C35589e();
        StringBuilder sb = new StringBuilder();
        sb.append(photoContext.mStickers);
        eVar.f93285b = sb.toString();
        eVar.f93286c = "";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mShootWay", photoContext.mShootWay);
        jSONObject.put("method", "getFromPhotoContext");
        eVar.f93288e = jSONObject.toString();
        return eVar;
    }

    /* renamed from: a */
    public static C35589e m128550a(PhotoMovieContext photoMovieContext) {
        String str;
        C7573i.m23587b(photoMovieContext, "context");
        C35589e eVar = new C35589e();
        AVMusic aVMusic = photoMovieContext.mMusic;
        if (aVMusic != null) {
            str = aVMusic.getMusicId();
        } else {
            str = null;
        }
        eVar.f93284a = str;
        eVar.f93286c = "";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mFrom", photoMovieContext.mFrom);
        jSONObject.put("mShootWay", photoMovieContext.mShootWay);
        jSONObject.put("mIsFromDraft", photoMovieContext.mIsFromDraft);
        jSONObject.put("method", "getFromPhotoMovieContext");
        eVar.f93288e = jSONObject.toString();
        return eVar;
    }

    /* renamed from: a */
    public static C35589e m128551a(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        boolean z2;
        C7573i.m23587b(videoPublishEditModel, "videoEditViewModel");
        C35589e eVar = new C35589e();
        String editEffectList = videoPublishEditModel.getEditEffectList();
        C7573i.m23582a((Object) editEffectList, "videoEditViewModel.editEffectList");
        boolean z3 = false;
        if (editEffectList.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !TextUtils.isEmpty(videoPublishEditModel.getStickers())) {
            StringBuilder sb = new StringBuilder();
            sb.append(editEffectList);
            sb.append(",");
            sb.append(videoPublishEditModel.getStickers());
            editEffectList = sb.toString();
        }
        if (editEffectList.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            editEffectList = videoPublishEditModel.getStickers();
            if (editEffectList == null) {
                editEffectList = "";
            }
        }
        eVar.f93285b = editEffectList;
        eVar.f93284a = videoPublishEditModel.musicId;
        eVar.f93286c = "";
        if (TextUtils.isEmpty(videoPublishEditModel.mUploadPath)) {
            videoPublishEditModel.mUploadPath = (String) f104547b.get(videoPublishEditModel.creationId);
        }
        eVar.f93287d = videoPublishEditModel.mUploadPath;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mShootWay", videoPublishEditModel.mShootWay);
        jSONObject.put("mIsFromDraft", videoPublishEditModel.mIsFromDraft);
        jSONObject.put("method", "getFromVideoEditModel");
        eVar.f93288e = jSONObject.toString();
        CharSequence charSequence = eVar.f93287d;
        if (charSequence == null || charSequence.length() == 0) {
            z3 = true;
        }
        C40241g.m128587a(z3);
        return eVar;
    }
}
