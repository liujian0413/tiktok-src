package com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock;

import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.n */
public final class C40970n {

    /* renamed from: a */
    private static ArrayList<String> f106501a = new ArrayList<>();

    /* renamed from: b */
    private static List<LockStickerTextBean> f106502b = new ArrayList();

    /* renamed from: c */
    private static boolean f106503c = false;

    /* renamed from: b */
    public static boolean m130845b() {
        return f106503c;
    }

    /* renamed from: d */
    public static LockStickerTextBean m130847d() {
        return m130843b("default");
    }

    /* renamed from: c */
    public static void m130846c() {
        f106503c = false;
        f106501a.clear();
    }

    /* renamed from: a */
    public static ArrayList<String> m130840a() {
        String str = "";
        Iterator it = f106501a.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(" , ");
            str = sb.toString();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(f106501a);
        arrayList.addAll(C40956d.m130819a().mo101263b());
        return arrayList;
    }

    /* renamed from: a */
    public static void m130841a(String str) {
        if (str != null) {
            f106501a.add(str);
        }
    }

    /* renamed from: a */
    public static LockStickerTextBean m130839a(Effect effect) {
        return m130843b(C40496bh.m129468m(effect));
    }

    /* renamed from: b */
    public static LockStickerTextBean m130843b(String str) {
        for (LockStickerTextBean lockStickerTextBean : f106502b) {
            if (lockStickerTextBean.activityId.equals(str)) {
                return lockStickerTextBean;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m130844b(List<LockStickerTextBean> list) {
        if (list != null && !list.isEmpty()) {
            f106502b.clear();
            f106502b.addAll(list);
        }
    }

    /* renamed from: a */
    public static void m130842a(List<String> list) {
        f106503c = true;
        if (list != null) {
            String str = "";
            for (String str2 : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                sb.append(" , ");
                str = sb.toString();
            }
            f106501a.clear();
            f106501a.addAll(list);
        }
    }
}
