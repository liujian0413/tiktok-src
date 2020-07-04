package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.content.C0683b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.ads.AdError;
import com.p280ss.android.p817ad.p818a.C18920b;
import com.p280ss.android.p817ad.p818a.C18920b.C18922a;
import com.p280ss.android.p817ad.p818a.C18929c;
import com.p280ss.android.p817ad.p818a.C18941d;
import com.p280ss.android.p817ad.p818a.p819a.C18912a;
import com.p280ss.android.p817ad.p818a.p819a.C18918f;
import com.p280ss.android.p817ad.p818a.p821b.C18924b;
import com.p280ss.android.p817ad.p818a.p821b.C18928d;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.views.DmtLoadingDialog;
import com.p280ss.android.ugc.aweme.web.C43446h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bm */
public final class C25280bm {

    /* renamed from: b */
    private static final String f66635b = C43446h.f112524d;

    /* renamed from: a */
    public C18912a f66636a;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bm$a */
    public static class C25284a {

        /* renamed from: a */
        public static C25280bm f66642a = new C25280bm();
    }

    /* renamed from: a */
    public static C25280bm m83074a() {
        return C25284a.f66642a;
    }

    private C25280bm() {
        m83078c();
    }

    /* renamed from: c */
    private void m83078c() {
        C18941d.m61812a(C6399b.m19921a());
        C18941d.m61811a().f51047a.mo50315a(C25285bn.f66643a).mo50293a(C25286bo.f66644a).mo50294a(C25287bp.f66645a).mo50295a(f66635b).mo50292a((int) AdError.SERVER_ERROR_CODE);
        C18929c.m61780a((C18918f) new C18918f() {
            /* renamed from: a */
            private static boolean m83081a(Context context, String str) {
                if (context == null || C0683b.m2909b(context, str) != 0) {
                    return false;
                }
                return true;
            }

            /* renamed from: a */
            public final void mo50296a(Activity activity, String[] strArr, C18912a aVar) {
                if (activity != null) {
                    if (m83081a(activity, strArr[0])) {
                        aVar.mo50289a();
                        return;
                    }
                    C25280bm.this.f66636a = aVar;
                    ActivityCompat.m2241a(activity, strArr, BaseNotice.HASHTAG);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo65890a(Activity activity, Aweme aweme, String str) {
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C18920b a = new C18922a().mo50308a(String.valueOf(awemeRawAd.getAdId())).mo50310b(String.valueOf(awemeRawAd.getCreativeId())).mo50311c(awemeRawAd.getLogExtra()).mo50314f(awemeRawAd.getPhoneNumber()).mo50307a(awemeRawAd.getInstancePhoneId()).mo50312d(awemeRawAd.getPhoneKey()).mo50306a(1).mo50313e(str).mo50309a();
            final DmtLoadingDialog dmtLoadingDialog = new DmtLoadingDialog(activity);
            dmtLoadingDialog.show();
            C18941d.m61811a().mo50328a(activity, a, new C18928d() {
                /* renamed from: a */
                public final void mo50320a(C18924b bVar) {
                    dmtLoadingDialog.dismiss();
                }

                /* renamed from: b */
                public final void mo50321b(C18924b bVar) {
                    dmtLoadingDialog.dismiss();
                }
            });
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m83076a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        try {
            C24976t.m82032a(C6399b.m19921a(), jSONObject, str4);
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName(str2).setLabelName(str3).setValue(str).setJsonObject(jSONObject));
    }

    /* renamed from: a */
    public final void mo65891a(Activity activity, String str, String str2, String str3, String str4) {
        long j;
        try {
            j = Long.valueOf(str2).longValue();
        } catch (Exception unused) {
            j = 0;
        }
        C18920b a = new C18922a().mo50314f(str).mo50307a(j).mo50312d(str3).mo50313e(str4).mo50309a();
        final DmtLoadingDialog dmtLoadingDialog = new DmtLoadingDialog(activity);
        dmtLoadingDialog.show();
        C18941d.m61811a().mo50328a(activity, a, new C18928d() {
            /* renamed from: a */
            public final void mo50320a(C18924b bVar) {
                dmtLoadingDialog.dismiss();
            }

            /* renamed from: b */
            public final void mo50321b(C18924b bVar) {
                dmtLoadingDialog.dismiss();
            }
        });
    }
}
