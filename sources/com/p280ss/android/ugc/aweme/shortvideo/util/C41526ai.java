package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33242an;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ai */
public final class C41526ai {

    /* renamed from: a */
    protected Activity f107994a;

    /* renamed from: b */
    private String f107995b = "";

    /* renamed from: b */
    private void m132271b() {
        C6726a.m20844b(new C41527aj(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102181a() {
        if (this.f107994a != null) {
            C9738o.m28710b((Context) this.f107994a, (int) R.string.ig, 0);
        }
    }

    /* renamed from: c */
    private boolean m132273c() {
        if (this.f107994a == null) {
            return false;
        }
        if (!C7276d.m22826g()) {
            C10761a.m31399c(this.f107994a.getApplicationContext(), (int) R.string.djg).mo25750a();
            return false;
        } else if (C7276d.m22827h() >= 20971520) {
            return true;
        } else {
            C10761a.m31399c(this.f107994a.getApplicationContext(), (int) R.string.djh).mo25750a();
            return false;
        }
    }

    /* renamed from: d */
    private void m132274d() {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
        m132275e();
    }

    /* renamed from: e */
    private void m132275e() {
        String uuid = UUID.randomUUID().toString();
        Intent intent = new Intent();
        intent.putExtra("shoot_way", "status");
        intent.putExtra("creation_id", uuid);
        intent.putExtra("extra_to_status", true);
        C33242an.m107315a(this.f107995b);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).startToolPermissionActivity(this.f107994a, intent);
    }

    /* renamed from: b */
    private void m132272b(String str) {
        C6726a.m20844b(new C41528ak(this, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102183a(String str) {
        if (this.f107994a != null) {
            C32656f.m105743a(C6405d.m19984g(), str, "click_duet_button", C42914ab.m136242a().mo104633a("login_title", this.f107994a.getString(R.string.dtg)).f111445a);
        }
    }

    /* renamed from: a */
    public final void mo102182a(Aweme aweme, Activity activity, String str) {
        this.f107994a = activity;
        if (!C21115b.m71197a().isLogin() && ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().needLoginBeforeRecord()) {
            m132272b(str);
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished() || ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown()) {
            this.f107995b = str;
            if (aweme != null && aweme.getAuthor() != null && m132273c() && C41529al.m132279a(C6399b.m19921a())) {
                m132274d();
            }
        } else {
            m132271b();
        }
    }
}
