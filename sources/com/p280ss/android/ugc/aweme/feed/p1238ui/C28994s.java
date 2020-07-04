package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.s */
public final class C28994s {

    /* renamed from: a */
    private View f76364a;

    /* renamed from: b */
    private int f76365b;

    /* renamed from: c */
    private String f76366c;

    /* renamed from: d */
    private JSONObject f76367d;

    /* renamed from: e */
    private Aweme f76368e;

    /* renamed from: c */
    public final boolean mo74287c() {
        return C23487o.m77153b(this.f76364a);
    }

    /* renamed from: a */
    public final void mo74281a() {
        if (C23487o.m77153b(this.f76364a)) {
            mo74286c(this.f76368e);
        }
    }

    /* renamed from: b */
    public final void mo74284b() {
        if (this.f76364a != null) {
            this.f76364a.setVisibility(8);
        }
    }

    /* renamed from: d */
    private String m95221d() {
        String str;
        if (this.f76367d == null) {
            str = "";
        } else {
            str = this.f76367d.optString("request_id");
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        return C28199ae.m92689a().mo71790a(logPbBean);
    }

    public C28994s(TextView textView) {
        this.f76364a = textView;
    }

    /* renamed from: a */
    public final void mo74282a(int i) {
        if (this.f76364a instanceof TextView) {
            ((TextView) this.f76364a).setMaxWidth(800);
        }
    }

    /* renamed from: c */
    public final void mo74286c(Aweme aweme) {
        if (this.f76364a != null) {
            m95222d(aweme);
            C6903bc.m21500s().mo102611a(aweme, this.f76364a.getContext(), m95221d());
        }
    }

    /* renamed from: d */
    private void m95222d(Aweme aweme) {
        String str;
        String str2;
        if (this.f76367d == null) {
            str = "";
        } else {
            str = this.f76367d.optString("request_id");
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        if (aweme.getStickerEntranceInfo() != null) {
            str2 = aweme.getStickerEntranceInfo().f108868id;
        } else {
            str2 = "";
        }
        C1592h.m7855a((Callable<TResult>) new C29018t<TResult>(this, logPbBean, aweme, str2), (Executor) C6907h.m21516a());
    }

    /* renamed from: b */
    public final void mo74285b(final Aweme aweme) {
        int i;
        String str;
        if (this.f76364a != null) {
            this.f76368e = aweme;
            this.f76364a.setOnClickListener(new C42939as() {
                /* renamed from: a */
                public final void mo70606a(View view) {
                    if (!C27326a.m89578a(view)) {
                        C28994s.this.mo74286c(aweme);
                    }
                }
            });
            boolean a = m95220a(aweme);
            View view = this.f76364a;
            if (a) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            if (this.f76364a instanceof TextView) {
                if (aweme.getStickerEntranceInfo() != null) {
                    str = aweme.getStickerEntranceInfo().name;
                } else {
                    str = "";
                }
                ((TextView) this.f76364a).setText(str);
            }
        }
    }

    /* renamed from: a */
    public static boolean m95220a(Aweme aweme) {
        if (aweme.getStickerEntranceInfo() == null || TextUtils.isEmpty(aweme.getStickerEntranceInfo().name) || !((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableStickerDetailsEntrance()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m95219a(Aweme aweme, String str) {
        String str2;
        String str3;
        if (this.f76367d == null) {
            str2 = "";
        } else {
            str2 = this.f76367d.optString("request_id");
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str2);
        if (aweme.getStickerEntranceInfo() != null) {
            str3 = aweme.getStickerEntranceInfo().f108868id;
        } else {
            str3 = "";
        }
        C29019u uVar = new C29019u(this, str, logPbBean, aweme, str3);
        C1592h.m7855a((Callable<TResult>) uVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public final void mo74283a(int i, String str, JSONObject jSONObject) {
        this.f76365b = i;
        this.f76366c = str;
        this.f76367d = jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo74279a(LogPbBean logPbBean, Aweme aweme, String str) throws Exception {
        C6907h.m21528b("enter_prop_detail", new C6909j().mo16966a("log_pb", C28199ae.m92689a().mo71790a(logPbBean)).mo16966a("author_id", aweme.getAuthorUid()).mo16966a("group_id", aweme.getAid()).mo16966a("impr_type", C33230ac.m107245t(aweme)).mo16966a("prop_id", str).mo16966a("enter_from", this.f76366c).mo16967a());
        m95219a(aweme, "anchor_entrance_click");
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo74280a(String str, LogPbBean logPbBean, Aweme aweme, String str2) throws Exception {
        C6907h.m21525a(str, new C6909j().mo16966a("log_pb", C28199ae.m92689a().mo71790a(logPbBean)).mo16966a("author_id", aweme.getAuthorUid()).mo16966a("group_id", aweme.getAid()).mo16966a("enter_from", this.f76366c).mo16966a("prop_id", str2).mo16966a("anchor_type", "prop").mo16967a());
        return null;
    }
}
