package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40506c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40966j;
import com.p280ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.p280ss.android.ugc.aweme.sticker.model.CommerceStickerUnlockInfo;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p280ss.android.ugc.effectmanager.effect.model.ResourceListModel.ResourceListBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.bh */
public final class C40496bh {

    /* renamed from: a */
    private static Map<String, List<String>> f105241a = new HashMap();

    /* renamed from: a */
    public static boolean m129440a(Effect effect) {
        return effect != null && effect.getEffectType() == 1;
    }

    /* renamed from: a */
    public static boolean m129439a(NewFaceStickerBean newFaceStickerBean) {
        if (newFaceStickerBean == null) {
            return false;
        }
        return (C6311g.m19574b(newFaceStickerBean.mTags) && newFaceStickerBean.mTags.contains("lock")) || m129445b(newFaceStickerBean);
    }

    /* renamed from: a */
    public static boolean m129436a(Context context, NewFaceStickerBean newFaceStickerBean, String str) {
        if (!m129445b(newFaceStickerBean) || m129447b(newFaceStickerBean.f108868id)) {
            return false;
        }
        C42962b.f111525a.mo104671a("show_toast", C38511bc.m123103a().mo96485a("prop_id", newFaceStickerBean.f108868id).mo96485a("scene_id", "1001").mo96485a("enter_from", str).f100112a);
        CommerceStickerUnlockInfo c = m129449c(newFaceStickerBean);
        new C10741a(context).mo25660b(c == null ? "" : c.desc).mo25658b((int) R.string.w_, C40497bi.f105242a).mo25650a((int) R.string.aop, (OnClickListener) new C40498bj(newFaceStickerBean, str, context)).mo25656a().mo25638b();
        return true;
    }

    /* renamed from: a */
    public static boolean m129441a(String str, FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || faceStickerBean == FaceStickerBean.NONE || !C6311g.m19574b(faceStickerBean.getTags()) || !faceStickerBean.getTags().contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m129442a(String str, Effect effect) {
        return effect != null && C6311g.m19574b(effect.getTags()) && effect.getTags().contains(str);
    }

    /* renamed from: a */
    public static boolean m129438a(FaceStickerBean faceStickerBean) {
        return m129441a(C40413c.f105052c, faceStickerBean);
    }

    /* renamed from: e */
    public static boolean m129457e(Effect effect) {
        return m129442a(C40413c.f105052c, effect);
    }

    /* renamed from: a */
    public static boolean m129437a(StickerWrapper stickerWrapper) {
        if (stickerWrapper == null || !m129446b(stickerWrapper.f104908a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m129443b(StickerWrapper stickerWrapper) {
        if (stickerWrapper == null || !m129474s(stickerWrapper.f104908a)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static CommerceStickerUnlockInfo m129449c(NewFaceStickerBean newFaceStickerBean) {
        if (newFaceStickerBean == null) {
            return null;
        }
        CommerceSticker commerceSticker = newFaceStickerBean.commerceSticker;
        if (commerceSticker == null) {
            return null;
        }
        return commerceSticker.getCommerceStickerUnlockInfo();
    }

    /* renamed from: d */
    public static boolean m129453d(StickerWrapper stickerWrapper) {
        if (stickerWrapper == null || !m129475t(stickerWrapper.f104908a)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m129470o(Effect effect) {
        return effect.getTags().contains("douyin_card");
    }

    /* renamed from: s */
    private static boolean m129474s(Effect effect) {
        if (effect == null || effect.getEffectType() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static int m129428a(String str) {
        if (TextUtils.isEmpty(str) || str.equals("{}")) {
            return -1;
        }
        try {
            return new JSONObject(str).getInt("lock_type");
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static boolean m129446b(Effect effect) {
        if (effect == null || effect.getEffectType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m129450c(StickerWrapper stickerWrapper) {
        if (stickerWrapper == null || !m129455d(stickerWrapper.f104908a)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m129455d(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("Game2DV2")) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m129458f(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null) {
            return true;
        }
        if (m129456e(faceStickerBean) || m129460g(faceStickerBean) || m129462h(faceStickerBean)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m129460g(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || !faceStickerBean.getTypes().contains("Game2DV2")) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m129462h(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || faceStickerBean.getTags() == null) {
            return false;
        }
        return faceStickerBean.getTags().contains("audio_effect");
    }

    /* renamed from: j */
    public static boolean m129465j(Effect effect) {
        if (effect == null) {
            return false;
        }
        String extra = effect.getExtra();
        if (extra != null && m129428a(extra) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m129473r(Effect effect) {
        if (effect == null) {
            return true;
        }
        if (m129476u(effect) || m129455d(effect) || m129477v(effect)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private static boolean m129475t(Effect effect) {
        if (effect == null || !effect.getTags().contains("hw_beauty")) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private static boolean m129477v(Effect effect) {
        if (effect == null || effect.getTags() == null) {
            return false;
        }
        return effect.getTags().contains("audio_effect");
    }

    /* renamed from: b */
    public static boolean m129444b(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || ((faceStickerBean.getTags() == null || !faceStickerBean.getTags().contains("text2d")) && !faceStickerBean.getTypes().contains("Text2D"))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m129451c(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == FaceStickerBean.NONE) {
            return false;
        }
        return faceStickerBean.getTypes().contains("Adaptive");
    }

    /* renamed from: d */
    public static boolean m129454d(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || C6311g.m19573a(faceStickerBean.getTags())) {
            return false;
        }
        for (String str : faceStickerBean.getTags()) {
            if (str != null && str.contains("bCanAmazing510")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m129456e(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || faceStickerBean.getTags() == null) {
            return false;
        }
        if (faceStickerBean.getTags().contains("instrument") || faceStickerBean.getTypes().contains("Instrument")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m129459f(Effect effect) {
        if (m129461g(effect) || m129463h(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m129461g(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("AR")) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m129463h(Effect effect) {
        if (effect == null || ((effect.getTags() == null || !effect.getTags().contains("text2d")) && !effect.getTypes().contains("Text2D"))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m129464i(Effect effect) {
        if (effect == null) {
            return false;
        }
        for (String contains : effect.getTags()) {
            if (contains.contains("lock")) {
                return true;
            }
        }
        return m129465j(effect);
    }

    /* renamed from: l */
    public static boolean m129467l(Effect effect) {
        if (effect == null) {
            return false;
        }
        for (String contains : effect.getTags()) {
            if (contains.contains(":1")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static String m129468m(Effect effect) {
        if (effect == null) {
            return "default";
        }
        for (String str : effect.getTags()) {
            if (str.contains("lock")) {
                if (str.split(":").length == 3) {
                    return str.split(":")[2];
                }
                return "default";
            }
        }
        return "default";
    }

    /* renamed from: p */
    public static boolean m129471p(Effect effect) {
        ArrayList unlockedStickerIds = ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getUnlockedStickerIds();
        if (unlockedStickerIds == null || unlockedStickerIds.size() == 0) {
            return false;
        }
        return unlockedStickerIds.contains(effect.getEffectId());
    }

    /* renamed from: q */
    public static boolean m129472q(Effect effect) {
        if (effect == null) {
            return false;
        }
        String extra = effect.getExtra();
        if (TextUtils.isEmpty(extra) || !extra.contains("music_is_force_bind")) {
            return false;
        }
        try {
            return new JSONObject(extra).optBoolean("music_is_force_bind");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: u */
    private static boolean m129476u(Effect effect) {
        if (effect == null || effect.getTags() == null) {
            return false;
        }
        if (effect.getTags().contains("instrument") || effect.getTypes().contains("Instrument")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m129445b(NewFaceStickerBean newFaceStickerBean) {
        if (newFaceStickerBean == null) {
            return false;
        }
        String str = newFaceStickerBean.extra;
        if (!TextUtils.isEmpty(str) && !m129447b(newFaceStickerBean.f108868id) && newFaceStickerBean.commerceSticker != null && m129428a(str) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m129452c(Effect effect) {
        if (effect == null || effect.getSource() != 1 || TextUtils.isEmpty(effect.getDesignerId())) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m129466k(Effect effect) {
        if (!m129464i(effect) || m129465j(effect)) {
            return false;
        }
        String effectId = effect.getEffectId();
        if (TextUtils.isEmpty(effectId)) {
            return false;
        }
        for (String equals : ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getUnlockedStickerIds()) {
            if (TextUtils.equals(effectId, equals)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public static String m129469n(Effect effect) {
        if (effect == null || effect.getTags() == null || effect.getTags().isEmpty()) {
            return null;
        }
        for (String str : effect.getTags()) {
            if (str != null && str.contains("challenge") && str.contains(":")) {
                String[] split = str.split(":");
                if (split.length <= 1 || split[1] == null || split[1].isEmpty() || !split[1].matches("[0-9]+")) {
                    return null;
                }
                return split[1];
            }
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m129447b(String str) {
        ArrayList unlockedStickerIds = ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getUnlockedStickerIds();
        if (unlockedStickerIds == null || unlockedStickerIds.size() == 0) {
            return false;
        }
        return unlockedStickerIds.contains(str);
    }

    /* renamed from: a */
    public static List<String> m129431a(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<String> m129429a(Context context, String str) {
        if (f105241a.keySet().contains(str)) {
            return (List) f105241a.get(str);
        }
        List<String> a = new C40966j(context, str).mo101266a();
        f105241a.put(str, a);
        String str2 = "本地已经提示过的贴纸列表";
        for (String str3 : a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str3);
            sb.append(" , ");
            str2 = sb.toString();
        }
        return a;
    }

    /* renamed from: a */
    public static List<C40506c> m129430a(String str, ResourceListModel resourceListModel) {
        ArrayList arrayList = new ArrayList();
        if (resourceListModel == null) {
            return arrayList;
        }
        for (ResourceListBean resourceListBean : resourceListModel.resource_list) {
            C40506c cVar = new C40506c();
            cVar.f105265b = resourceListBean.name;
            cVar.f105266c = resourceListBean.value;
            ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
            toolsUrlModel.f109647b = m129431a(resourceListBean.resource_uri, resourceListModel.url_prefix);
            cVar.mo100555a(toolsUrlModel);
            cVar.mo100557b(str);
            cVar.mo100556a(resourceListBean.resource_uri);
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m129448b(String str, Effect effect) {
        if (effect != null && C6311g.m19574b(effect.getTypes()) && effect.getTypes().contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m129435a(Context context, NewFaceStickerBean newFaceStickerBean) {
        if (context == null || newFaceStickerBean == null || m129447b(newFaceStickerBean.f108868id) || !m129445b(newFaceStickerBean)) {
            return false;
        }
        CommerceSticker commerceSticker = newFaceStickerBean.commerceSticker;
        if (commerceSticker == null) {
            return false;
        }
        CommerceStickerUnlockInfo commerceStickerUnlockInfo = commerceSticker.getCommerceStickerUnlockInfo();
        if (commerceStickerUnlockInfo == null) {
            return false;
        }
        if (C7195s.m22438a().mo18682a(commerceStickerUnlockInfo.openUrl)) {
            return true;
        }
        String str = commerceStickerUnlockInfo.webUrl;
        if (!C35574k.m114859a().mo70069C().mo83174a(context, commerceStickerUnlockInfo.openUrl, false)) {
            C35574k.m114859a().mo70069C().mo83173a(context, str, "");
        }
        return true;
    }

    /* renamed from: a */
    public static void m129432a(Context context, String str, String str2) {
        if (f105241a.keySet().contains(str)) {
            ((List) f105241a.get(str)).add(str2);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            f105241a.put(str, arrayList);
        }
        new C40966j(context, str).mo101267a(str2);
    }

    /* renamed from: a */
    static final /* synthetic */ void m129434a(NewFaceStickerBean newFaceStickerBean, String str, Context context, DialogInterface dialogInterface, int i) {
        C42962b.f111525a.mo104671a("confirm_toast", C38511bc.m123103a().mo96485a("prop_id", newFaceStickerBean.f108868id).mo96485a("scene_id", "1001").mo96485a("enter_from", str).f100112a);
        m129435a(context, newFaceStickerBean);
    }
}
