package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.net.C34098r;
import com.p280ss.android.ugc.aweme.qrcode.view.C37121a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.share.v */
public final class C38265v {

    /* renamed from: a */
    public C37121a f99445a;

    /* renamed from: b */
    public Context f99446b;

    /* renamed from: c */
    private C27481e f99447c;

    /* renamed from: d */
    private String f99448d = "";

    /* renamed from: e */
    private String f99449e = "";

    /* renamed from: b */
    private boolean m122232b() {
        if (!C7276d.m22826g()) {
            C9738o.m28693a(this.f99446b, (int) R.string.djg);
            return false;
        } else if (C7276d.m22827h() >= 20971520) {
            return true;
        } else {
            C9738o.m28693a(this.f99446b, (int) R.string.djh);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m122231a() {
        if (!m122232b() || !C38274w.m122265a(C6399b.m19921a())) {
            return false;
        }
        if (this.f99445a == null) {
            this.f99445a = C37121a.m119327a(this.f99446b, this.f99446b.getResources().getString(R.string.awk));
            this.f99445a.setIndeterminate(false);
        } else if ((this.f99446b instanceof Activity) && !((Activity) this.f99446b).isFinishing()) {
            this.f99445a.show();
            this.f99445a.mo93590a();
        }
        return true;
    }

    public C38265v(Context context) {
        this.f99446b = context;
    }

    /* renamed from: a */
    public final void mo95891a(String str) {
        if (m122231a() && !TextUtils.isEmpty(str)) {
            this.f99447c = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().createEffectPlatform(this.f99446b, C32326h.m104885g(), C34098r.m109769a().mo86751b());
            this.f99447c.mo70630a(str, "", new C43760j() {
                /* renamed from: b */
                public final void mo9282b(Effect effect) {
                }

                /* renamed from: a */
                public final void mo9280a(Effect effect) {
                    if (C38265v.this.f99445a != null) {
                        C42951au.m136343b(C38265v.this.f99445a);
                    }
                    C38265v.this.mo95890a(effect);
                }

                /* renamed from: a */
                public final void mo9281a(Effect effect, C43726c cVar) {
                    int i = cVar.f113220a;
                    if (i == 2004 || i == 2002) {
                        C10761a.m31403c(C38265v.this.f99446b, C38265v.this.f99446b.getResources().getString(R.string.cia)).mo25750a();
                    } else if (i == 2003) {
                        C10761a.m31403c(C38265v.this.f99446b, C38265v.this.f99446b.getResources().getString(R.string.ci_)).mo25750a();
                    } else if (i == 2006) {
                        C10761a.m31403c(C38265v.this.f99446b, C38265v.this.f99446b.getResources().getString(R.string.b2v)).mo25750a();
                    } else {
                        C10761a.m31403c(C38265v.this.f99446b, C38265v.this.f99446b.getResources().getString(R.string.ci9)).mo25750a();
                    }
                    if (C38265v.this.f99445a != null) {
                        C42951au.m136343b(C38265v.this.f99445a);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo95890a(Effect effect) {
        String str;
        if (effect != null) {
            Intent intent = new Intent(this.f99446b, ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
            intent.putExtra("first_sticker", effect);
            intent.putExtra("reuse_mvtheme_enter", true);
            intent.putExtra("extra_bind_mv_id", effect.getEffectId());
            String str2 = "shoot_way";
            if (TextUtils.isEmpty(this.f99448d)) {
                str = "mv_reuse";
            } else {
                str = this.f99448d;
            }
            intent.putExtra(str2, str);
            intent.putExtra("creation_id", UUID.randomUUID().toString());
            intent.putExtra("enter_from", this.f99449e);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(this.f99446b, intent);
        }
    }

    /* renamed from: a */
    public final void mo95892a(String str, String str2, String str3) {
        this.f99448d = str2;
        this.f99449e = str3;
        mo95891a(str);
    }
}
