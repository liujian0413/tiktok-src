package com.bytedance.android.live.broadcast.effect.sticker;

import android.content.Context;
import com.bytedance.android.live.base.model.C2347g;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.core.utils.C3388h;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.f */
public final class C2663f {
    /* renamed from: a */
    private static C2347g m10851a(UrlModel urlModel) {
        if (urlModel == null) {
            return new C2347g();
        }
        C2347g gVar = new C2347g();
        gVar.f7710a = urlModel.getUri();
        gVar.f7711b = urlModel.getUrlList();
        return gVar;
    }

    /* renamed from: a */
    private static UrlModel m10853a(C2347g gVar) {
        if (gVar == null) {
            return new UrlModel();
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(gVar.f7710a);
        urlModel.setUrlList(gVar.f7711b);
        return urlModel;
    }

    /* renamed from: a */
    public static Effect m10854a(C9355c cVar) {
        if (cVar.f25573l != null) {
            return cVar.f25573l;
        }
        Effect effect = new Effect();
        effect.setId(cVar.f25577p);
        effect.setFileUrl(m10853a(cVar.f25563b));
        effect.setIconUrl(m10853a(cVar.f25562a));
        effect.setZipPath(cVar.f25580s);
        effect.setUnzipPath(cVar.f25581t);
        effect.setTypes(cVar.f25568g);
        effect.setHint(cVar.f25584w);
        effect.setTags(cVar.f25569h);
        effect.setDevicePlatform(cVar.f25579r);
        effect.setAppVersion(cVar.f25587z);
        effect.setSdkVersion(cVar.f25586y);
        effect.setDownloaded(cVar.f25582u);
        effect.setEffectId(cVar.f25574m);
        effect.setTagsUpdatedAt(cVar.f25575n);
        return effect;
    }

    /* renamed from: a */
    public static C9355c m10852a(Effect effect) {
        C9355c cVar = new C9355c();
        cVar.f25562a = m10851a(effect.getIconUrl());
        cVar.f25563b = m10851a(effect.getFileUrl());
        cVar.f25568g = effect.getTypes();
        cVar.f25576o = effect.getName();
        cVar.f25577p = effect.getId();
        cVar.f25566e = Long.valueOf(effect.getEffectId()).longValue();
        cVar.f25580s = effect.getZipPath();
        cVar.f25581t = effect.getUnzipPath();
        cVar.f25568g = effect.getTypes();
        cVar.f25585x = effect.getType();
        cVar.f25584w = effect.getHint();
        cVar.f25579r = effect.getDevicePlatform();
        cVar.f25587z = effect.getAppVersion();
        cVar.f25586y = effect.getSdkVersion();
        cVar.f25582u = effect.isDownloaded();
        cVar.f25569h = effect.getTags();
        cVar.f25575n = effect.getTagsUpdatedAt();
        cVar.f25574m = effect.getEffectId();
        cVar.f25567f = effect.getName();
        cVar.f25573l = effect;
        return cVar;
    }

    /* renamed from: a */
    public static String m10855a(Context context) {
        if (context == null) {
            return null;
        }
        File a = C3388h.m12602a(context);
        if (a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a.getAbsolutePath());
        sb.append(File.separator);
        sb.append("live");
        sb.append(File.separator);
        sb.append("sticker");
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (file.exists() || file.mkdirs()) {
            return sb2;
        }
        return null;
    }

    /* renamed from: a */
    public static ImageModel m10850a(String str, List<String> list) {
        ImageModel imageModel = new ImageModel();
        imageModel.setUri(str);
        imageModel.setUrls(list);
        return imageModel;
    }

    /* renamed from: b */
    private static String m10858b(String str, List<String> list) {
        for (String str2 : list) {
            if (str2.startsWith(str)) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    return split[1];
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m10856a(String str, FilterModel filterModel) {
        if (!C6311g.m19573a(filterModel.getTags())) {
            return m10858b(str, filterModel.getTags());
        }
        return null;
    }

    /* renamed from: a */
    public static String m10857a(String str, C9355c cVar) {
        if (!C6311g.m19573a(cVar.f25569h)) {
            return m10858b(str, cVar.f25569h);
        }
        return null;
    }
}
