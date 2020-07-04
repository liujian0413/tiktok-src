package com.p280ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.property.a */
public final class C36954a {

    /* renamed from: c */
    public static final C36955a f96843c = new C36955a(null);

    /* renamed from: a */
    public final SharedPreferences f96844a = C7285c.m22838a(this.f96845b, "language_switch", 0);

    /* renamed from: b */
    public final FragmentActivity f96845b;

    /* renamed from: d */
    private ABAndSettingViewModel f96846d;

    /* renamed from: com.ss.android.ugc.aweme.property.a$a */
    public static final class C36955a {
        private C36955a() {
        }

        public /* synthetic */ C36955a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    private final void m118903b() {
        this.f96846d.mo93290a(C36969j.f96872c.mo93397a());
        this.f96846d.mo93292b(C36969j.f96872c.mo93398b());
        this.f96846d.f96768g.setValue(this.f96846d.mo93289a().mo93393c());
        this.f96846d.f96769h.setValue(this.f96846d.mo93291b().mo93393c());
        mo93380a();
    }

    /* renamed from: a */
    public final void mo93380a() {
        String str;
        String str2;
        boolean z;
        if (((Language) this.f96846d.f96763b.getValue()) == Language.Chinese) {
            this.f96846d.f96763b.setValue(Language.EngAndChi);
            this.f96846d.f96762a.setValue("切换中文");
            C0052o<C36969j> oVar = this.f96846d.f96768g;
            Object value = this.f96846d.f96768g.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            ((C36969j) value).mo93392b();
            oVar.setValue(value);
            C0052o<C36969j> oVar2 = this.f96846d.f96769h;
            Object value2 = this.f96846d.f96769h.getValue();
            if (value2 == null) {
                C7573i.m23580a();
            }
            ((C36969j) value2).mo93392b();
            oVar2.setValue(value2);
        } else {
            this.f96846d.f96763b.setValue(Language.Chinese);
            this.f96846d.f96762a.setValue("English");
            C0052o<C36969j> oVar3 = this.f96846d.f96768g;
            Object value3 = this.f96846d.f96768g.getValue();
            if (value3 == null) {
                C7573i.m23580a();
            }
            ((C36969j) value3).mo93390a();
            oVar3.setValue(value3);
            C0052o<C36969j> oVar4 = this.f96846d.f96769h;
            Object value4 = this.f96846d.f96769h.getValue();
            if (value4 == null) {
                C7573i.m23580a();
            }
            ((C36969j) value4).mo93390a();
            oVar4.setValue(value4);
        }
        C0052o<String> oVar5 = this.f96846d.f96770i;
        StringBuilder sb = new StringBuilder("在 ");
        sb.append(this.f96846d.mo93289a().f96873a);
        sb.append(" 项中搜索");
        if (((Language) this.f96846d.f96763b.getValue()) == Language.Chinese) {
            str = "中文 key";
        } else {
            str = "英文 key 或者 owner";
        }
        sb.append(str);
        oVar5.setValue(sb.toString());
        C0052o<String> oVar6 = this.f96846d.f96771j;
        StringBuilder sb2 = new StringBuilder("在 ");
        sb2.append(this.f96846d.mo93291b().f96873a);
        sb2.append(" 项中搜索");
        if (((Language) this.f96846d.f96763b.getValue()) == Language.Chinese) {
            str2 = "中文 key";
        } else {
            str2 = "英文 key 或者 owner";
        }
        sb2.append(str2);
        oVar6.setValue(sb2.toString());
        Editor edit = this.f96844a.edit();
        String str3 = "English";
        if (((Language) this.f96846d.f96763b.getValue()) == Language.EngAndChi) {
            z = true;
        } else {
            z = false;
        }
        edit.putBoolean(str3, z).apply();
    }

    public C36954a(FragmentActivity fragmentActivity) {
        Language language;
        C7573i.m23587b(fragmentActivity, "context");
        this.f96845b = fragmentActivity;
        C0063u a = C0069x.m159a(this.f96845b).mo147a(ABAndSettingViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(co…ingViewModel::class.java)");
        this.f96846d = (ABAndSettingViewModel) a;
        boolean z = this.f96844a.getBoolean("English", false);
        C0052o<Language> oVar = this.f96846d.f96763b;
        if (z) {
            language = Language.Chinese;
        } else {
            language = Language.EngAndChi;
        }
        oVar.setValue(language);
        m118903b();
    }
}
