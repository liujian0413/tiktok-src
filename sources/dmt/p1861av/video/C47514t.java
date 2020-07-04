package dmt.p1861av.video;

import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.List;

/* renamed from: dmt.av.video.t */
public final class C47514t {
    /* renamed from: a */
    public static void m148293a(List<EffectPointModel> list, C47458g<C47479s> gVar) {
        for (int i = 0; i < list.size(); i++) {
            EffectPointModel effectPointModel = (EffectPointModel) list.get(i);
            if (effectPointModel.getType() != 2) {
                C47479s a = C47479s.m148205a(effectPointModel.getResDir(), (long) effectPointModel.getStartPoint());
                a.f121914f = effectPointModel.getSelectColor();
                a.f121916h = effectPointModel.getKey();
                a.f121913e = effectPointModel.isFromEnd();
                a.f121919k = effectPointModel.getCategory();
                a.f121918j = effectPointModel.getDuration();
                a.f121920l = effectPointModel.getExtra();
                gVar.setValue(a);
                C47479s a2 = C47479s.m148203a((long) effectPointModel.getEndPoint());
                a2.f121913e = effectPointModel.isFromEnd();
                gVar.setValue(a2);
            }
        }
    }
}
