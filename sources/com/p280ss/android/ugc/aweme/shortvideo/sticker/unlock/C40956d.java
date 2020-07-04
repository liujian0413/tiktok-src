package com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.d */
public class C40956d {

    /* renamed from: a */
    private static volatile C40956d f106468a;

    /* renamed from: c */
    private static SharedPreferences f106469c;

    /* renamed from: b */
    private List<String> f106470b;

    /* renamed from: d */
    private C6600e f106471d = C35574k.m114859a().mo70085S();

    private C40956d() {
    }

    /* renamed from: b */
    public final List<String> mo101263b() {
        if (this.f106470b == null) {
            this.f106470b = m130821c();
        }
        return this.f106470b;
    }

    /* renamed from: d */
    private void m130822d() {
        f106469c.edit().putString("sticker_id_info", this.f106471d.mo15979b((Object) mo101263b())).apply();
    }

    /* renamed from: a */
    public static C40956d m130819a() {
        if (f106468a == null) {
            synchronized (C40956d.class) {
                f106469c = C7285c.m22838a(C35574k.m114861b(), "commerce_sticker_unlock", 0);
                f106468a = new C40956d();
            }
        }
        return f106468a;
    }

    /* renamed from: c */
    private List<String> m130821c() {
        ArrayList arrayList = new ArrayList();
        try {
            String string = f106469c.getString("sticker_id_info", null);
            if (TextUtils.isEmpty(string)) {
                return arrayList;
            }
            List list = (List) this.f106471d.mo15975a(string, new C6597a<List<String>>() {
            }.type);
            if (list != null) {
                arrayList.addAll(list);
            }
            return arrayList;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo101262a(Effect effect) {
        if (C40496bh.m129465j(effect)) {
            m130820a(effect.getEffectId());
        }
    }

    /* renamed from: a */
    private void m130820a(String str) {
        if (!mo101263b().contains(str)) {
            mo101263b().add(str);
            m130822d();
        }
    }
}
