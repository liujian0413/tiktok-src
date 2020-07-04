package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43730b;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43735g;
import com.p280ss.android.ugc.effectmanager.effect.model.CheckUpdateVersionModel;
import com.p280ss.android.ugc.effectmanager.effect.model.net.EffectCheckUpdateResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43786c;
import com.p280ss.android.ugc.effectmanager.link.C43849a;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a */
public final class C43800a extends C43727d {

    /* renamed from: a */
    private C43680a f113319a;

    /* renamed from: b */
    private C43834g f113320b = this.f113319a.f113068a;

    /* renamed from: g */
    private String f113321g;

    /* renamed from: h */
    private String f113322h;

    /* renamed from: i */
    private String f113323i;

    /* renamed from: j */
    private int f113324j;

    /* renamed from: b */
    private boolean m138713b() {
        String str;
        switch (this.f113324j) {
            case 1:
                str = C43730b.m138580c(this.f113321g, this.f113322h);
                break;
            case 2:
                str = C43730b.m138575a(this.f113321g);
                break;
            default:
                StringBuilder sb = new StringBuilder("effect_version");
                sb.append(this.f113321g);
                str = sb.toString();
                break;
        }
        InputStream b = this.f113320b.f113528s.mo105735b(str);
        if (b == null) {
            return false;
        }
        CheckUpdateVersionModel checkUpdateVersionModel = (CheckUpdateVersionModel) this.f113320b.f113532w.mo70689a(b, CheckUpdateVersionModel.class);
        C43729a.m138574a(b);
        if (checkUpdateVersionModel == null) {
            return false;
        }
        this.f113323i = checkUpdateVersionModel.version;
        return true;
    }

    /* renamed from: a */
    public final void mo105685a() {
        if (m138713b()) {
            C43707b c = m138714c();
            if (this.f113228e) {
                mo105769a(13, new C43786c(false, new C43726c(10001)));
            }
            try {
                EffectCheckUpdateResponse effectCheckUpdateResponse = (EffectCheckUpdateResponse) this.f113320b.f113533x.mo106114a(c, this.f113320b.f113532w, EffectCheckUpdateResponse.class);
                if (effectCheckUpdateResponse != null) {
                    mo105769a(13, new C43786c(effectCheckUpdateResponse.updated, null));
                    return;
                }
                mo105769a(13, new C43786c(false, new C43726c(10002)));
            } catch (Exception e) {
                mo105769a(13, new C43786c(false, new C43726c(e)));
            }
        } else {
            mo105769a(13, new C43786c(true, null));
        }
    }

    /* renamed from: c */
    private C43707b m138714c() {
        String str;
        C43849a aVar = this.f113319a.f113069b;
        boolean z = false;
        if (aVar != null) {
            SharedPreferences a = C7285c.m22838a(aVar.f113606e, C38347c.f99551f, 0);
            z = !a.getString("app_version", "").equals(this.f113320b.f113513d);
            if (z) {
                Editor edit = a.edit();
                edit.putString("app_version", this.f113320b.f113513d);
                edit.commit();
            }
        }
        HashMap a2 = m138568a(this.f113320b);
        a2.put("panel", this.f113321g);
        switch (this.f113324j) {
            case 1:
                str = "/category/check";
                a2.put("category", this.f113322h);
                break;
            case 2:
                str = "/panel/check";
                break;
            default:
                str = "/panel/check";
                break;
        }
        if (z) {
            a2.put(C38347c.f99551f, "");
        } else {
            a2.put(C38347c.f99551f, this.f113323i);
        }
        String str2 = this.f113320b.f113507A;
        if (!TextUtils.isEmpty(str2)) {
            a2.put("test_status", str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113319a.f113069b.f113609h);
        sb.append(this.f113320b.f113510a);
        sb.append(str);
        return new C43707b("GET", C43735g.m138609a(a2, sb.toString()));
    }

    public C43800a(C43680a aVar, String str, Handler handler, String str2, String str3, int i) {
        super(handler, str, "NETWORK");
        this.f113319a = aVar;
        this.f113321g = str2;
        this.f113322h = str3;
        this.f113324j = i;
    }
}
