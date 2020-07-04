package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.common.utility.collection.C6307b;
import com.google.common.collect.C17794bt;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.effectplatform.C27470a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41363h;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.StickerPoi;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryIconsModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ag */
public final class C40376ag {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ag$a */
    public static class C40377a {
        /* renamed from: b */
        public static EffectCategoryModel m129124b(Context context) {
            EffectCategoryModel effectCategoryModel = new EffectCategoryModel();
            effectCategoryModel.name = context.getString(R.string.e1m);
            effectCategoryModel.f113499id = "1";
            effectCategoryModel.key = "";
            EffectCategoryIconsModel effectCategoryIconsModel = new EffectCategoryIconsModel();
            StringBuilder sb = new StringBuilder("res:// /");
            sb.append(R.drawable.aiu);
            effectCategoryIconsModel.uri = sb.toString();
            effectCategoryModel.icon = effectCategoryIconsModel;
            return effectCategoryModel;
        }

        /* renamed from: a */
        public static List<EffectCategoryModel> m129123a(Context context) {
            ArrayList arrayList = new ArrayList();
            String[] stringArray = context.getResources().getStringArray(R.array.n);
            if (context instanceof AppCompatActivity) {
                EffectStickerViewModel effectStickerViewModel = (EffectStickerViewModel) C0069x.m159a((FragmentActivity) (AppCompatActivity) context).mo147a(EffectStickerViewModel.class);
                if (effectStickerViewModel.mo101285a() != null && effectStickerViewModel.mo101285a().mo101196e()) {
                    stringArray = new String[]{"..."};
                }
            }
            for (String str : stringArray) {
                EffectCategoryModel effectCategoryModel = new EffectCategoryModel();
                effectCategoryModel.name = str;
                arrayList.add(effectCategoryModel);
            }
            return arrayList;
        }
    }

    /* renamed from: b */
    public static HashMap<String, Integer> m129122b(List<StickerWrapper> list) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (list == null) {
            return hashMap;
        }
        for (int i = 0; i < list.size(); i++) {
            StickerWrapper stickerWrapper = (StickerWrapper) list.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(stickerWrapper.f104909b);
            sb.append(stickerWrapper.f104908a.getEffectId());
            hashMap.put(sb.toString(), Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static HashMap<String, Integer> m129119a(List<StickerWrapper> list) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (list == null) {
            return hashMap;
        }
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(((StickerWrapper) list.get(i)).f104908a.getEffectId(), Integer.valueOf(i));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static FaceStickerBean m129117a(Effect effect) {
        List list;
        if (effect == null) {
            return FaceStickerBean.NONE;
        }
        FaceStickerBean faceStickerBean = new FaceStickerBean();
        if (!(C41363h.m131937b(effect.getEffectId()) == null || C41363h.m131938c(effect.getEffectId()) == null)) {
            faceStickerBean.setForceBindMusic(C41363h.m131937b(effect.getEffectId()));
            faceStickerBean.setForceBindMusicPath(C41363h.m131938c(effect.getEffectId()));
        }
        faceStickerBean.setForceBind(C40496bh.m129472q(effect));
        faceStickerBean.setBusi(effect.isBusiness());
        faceStickerBean.setAdRawData(effect.getAdRawData());
        faceStickerBean.setFaceStickerCommerceBean((FaceStickerCommerceBean) new C6600e().mo15974a(effect.getExtra(), FaceStickerCommerceBean.class));
        faceStickerBean.setIconUrl(C27470a.m90049a(effect.getIconUrl()));
        faceStickerBean.setFileUrl(C27470a.m90049a(effect.getFileUrl()));
        try {
            faceStickerBean.setStickerId(Long.parseLong(effect.getEffectId()));
        } catch (NumberFormatException unused) {
            faceStickerBean.setStickerId(-1);
        }
        faceStickerBean.setId(effect.getId());
        faceStickerBean.setPropSource(FaceStickerBean.sCurPropSource);
        faceStickerBean.setMusicIds(effect.getMusic());
        faceStickerBean.setName(effect.getName());
        faceStickerBean.setHint(effect.getHint());
        faceStickerBean.setHintIcon(C27470a.m90049a(effect.getHintIcon()));
        faceStickerBean.setLocalPath(effect.getUnzipPath());
        if (effect.getTypes() == null) {
            list = new ArrayList();
        } else {
            list = effect.getTypes();
        }
        faceStickerBean.setTypes(list);
        faceStickerBean.setTags(effect.getTags());
        faceStickerBean.setChildren(effect.getChildren());
        faceStickerBean.setEffectType(effect.getEffectType());
        faceStickerBean.setParentId(effect.getParentId());
        faceStickerBean.setExtra(effect.getExtra());
        faceStickerBean.setStickerPoi(new StickerPoi(effect.getPoiId(), effect.isIsPoi()));
        faceStickerBean.setSdkExtra(effect.getSdkExtra());
        faceStickerBean.setGradeKey(effect.getGradeKey());
        return faceStickerBean;
    }

    /* renamed from: a */
    private static boolean m129121a(C40378ah ahVar, Effect effect) {
        if (ahVar == null) {
            return true;
        }
        return ahVar.mo100372a(effect);
    }

    /* renamed from: a */
    public static Effect m129118a(List<Effect> list, C40378ah ahVar) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        for (Effect effect : list) {
            if (m129121a(ahVar, effect) && !C40496bh.m129446b(effect)) {
                return effect;
            }
        }
        return (Effect) list.get(0);
    }

    /* renamed from: a */
    public static void m129120a(C17794bt<String, String> btVar, List<StickerWrapper> list) {
        if (list != null) {
            if (!btVar.isEmpty()) {
                btVar.clear();
            }
            for (StickerWrapper stickerWrapper : list) {
                btVar.put(stickerWrapper.f104908a.getEffectId(), stickerWrapper.f104909b);
            }
        }
    }
}
