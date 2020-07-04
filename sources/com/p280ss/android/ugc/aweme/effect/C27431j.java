package com.p280ss.android.ugc.aweme.effect;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import bolts.C1592h;
import com.google.common.collect.C17795bu;
import com.google.common.collect.C18054w;
import com.google.common.collect.ImmutableSet;
import com.p280ss.android.medialib.p883d.C19719e;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.effect.j */
public final class C27431j {
    /* renamed from: c */
    static final /* synthetic */ boolean m89901c(String str) {
        return str != null;
    }

    /* renamed from: c */
    static final /* synthetic */ Object m89900c() throws Exception {
        Application b = C35574k.m114861b();
        C19719e eVar = new C19719e();
        eVar.mo52424a((Context) b, (int) R.raw.fake3d, C39810eq.f103482r);
        eVar.mo52424a((Context) b, (int) R.raw.soul_scale, C39810eq.f103482r);
        return null;
    }

    /* renamed from: d */
    private static void m89902d() {
        C35574k.m114859a().mo70097l().mo74952e();
        C1592h.m7853a(C27432k.f72350a);
    }

    /* renamed from: b */
    public static ArrayList<EffectModel> m89898b() {
        ArrayList<EffectModel> arrayList = new ArrayList<>();
        arrayList.add(m89892a(C35574k.m114861b().getString(R.string.e82), 2, "0", R.drawable.an4));
        arrayList.add(m89892a(C35574k.m114861b().getString(R.string.e7w), 2, "1", R.drawable.art));
        arrayList.add(m89892a(C35574k.m114861b().getString(R.string.e7x), 2, "2", R.drawable.arr));
        arrayList.add(m89892a(C35574k.m114861b().getString(R.string.e7y), 2, "3", R.drawable.ars));
        return arrayList;
    }

    /* renamed from: a */
    public static void m89894a() {
        C27393b bVar = (C27393b) C25682d.m84426a(C35574k.m114861b(), C27393b.class);
        int h = C35574k.m114859a().mo70102q().mo83141h();
        if (h != bVar.mo60431a(-1)) {
            bVar.mo60432b(h);
            m89902d();
        }
    }

    /* renamed from: a */
    public static boolean m89896a(String str) {
        return "trans".equals(str);
    }

    /* renamed from: b */
    public static boolean m89899b(String str) {
        return "sticker".equals(str);
    }

    /* renamed from: a */
    private static int m89889a(int i) {
        int[] a = C27421d.m89846a();
        return a[i % a.length];
    }

    /* renamed from: b */
    public static String m89897b(ArrayList<EffectPointModel> arrayList) {
        return TextUtils.join(",", ImmutableSet.copyOf(C18054w.m59709a((Collection<E>) C17795bu.m59147a((List<F>) arrayList, C27434m.f72352a), C27435n.f72353a)));
    }

    /* renamed from: a */
    private static int m89890a(List<String> list) {
        if (list == null) {
            return 0;
        }
        String str = "duration:";
        for (String str2 : list) {
            if (str2.contains(str)) {
                return Integer.parseInt(str2.substring(str.length()));
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static String m89893a(ArrayList<EffectPointModel> arrayList) {
        return TextUtils.join(",", ImmutableSet.copyOf((Collection<? extends E>) C17795bu.m59147a((List<F>) arrayList, C27433l.f72351a)));
    }

    /* renamed from: a */
    public static boolean m89895a(EffectModel effectModel) {
        try {
            if (Integer.parseInt(effectModel.key) < 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static EffectModel m89891a(int i, Effect effect, String str) {
        EffectModel effectModel = new EffectModel();
        effectModel.name = effect.getName();
        effectModel.hint = effect.getHint();
        effectModel.key = effect.getEffectId();
        effectModel.type = 1;
        effectModel.iconUrl = (String) effect.getIconUrl().getUrlList().get(0);
        effectModel.color = m89889a(i);
        effectModel.resDir = effect.getUnzipPath();
        effectModel.duration = m89890a(effect.getTags());
        effectModel.category = str;
        effectModel.extra = effect.getExtra();
        return effectModel;
    }

    /* renamed from: a */
    private static EffectModel m89892a(String str, int i, String str2, int i2) {
        EffectModel effectModel = new EffectModel();
        effectModel.name = str;
        effectModel.type = 2;
        effectModel.key = str2;
        effectModel.imagePath = i2;
        return effectModel;
    }
}
