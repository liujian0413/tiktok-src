package com.p280ss.android.ugc.aweme.tools.draft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.C27312d;
import com.p280ss.android.ugc.aweme.p1001al.C22488a;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35526aa;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39502ax;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41463q;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42599i;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.p1716b.C43659c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.p */
public final class C42299p {

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.p$a */
    static class C42302a implements C42599i {

        /* renamed from: e */
        C41654d f110064e;

        /* renamed from: f */
        String f110065f;

        /* renamed from: g */
        Context f110066g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo103785a(int i) {
            if (this.f110064e != null) {
                this.f110064e.setProgress(i);
            }
        }

        C42302a(C41654d dVar, String str, WeakReference<Context> weakReference) {
            this.f110064e = dVar;
            this.f110065f = str;
            this.f110066g = (Context) weakReference.get();
        }

        /* renamed from: a */
        public final void mo100634a(String str, int i, String str2, int i2) {
            C6726a.m20844b(new C42303q(this, i2));
        }

        /* renamed from: a */
        public final void mo100635a(String str, int i, String str2, Exception exc) {
            if (this.f110066g != null) {
                C10761a.m31403c(this.f110066g, this.f110066g.getString(R.string.avf)).mo25750a();
            }
            C42299p.dismiss(this.f110064e);
        }

        /* renamed from: a */
        public void mo100636a(String str, int i, String str2, float[] fArr) {
            if (i == 3) {
                C7276d.m22820d(str, this.f110065f);
                C42299p.dismiss(this.f110064e);
                return;
            }
            if (i == 4) {
                C42299p.dismiss(this.f110064e);
            }
        }
    }

    public static void dismiss(C41654d dVar) {
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    /* renamed from: a */
    private static int m134548a(C27311c cVar) {
        if (cVar.f72026N == 2) {
            return 0;
        }
        return C27312d.m89559a(cVar);
    }

    /* renamed from: b */
    private static void m134552b(C27311c cVar) {
        C35622l lVar = (C35622l) C25682d.m84426a(C35563c.f93238a, C35622l.class);
        if (!TextUtils.isEmpty(lVar.mo60361b()) && lVar.mo60361b().equals(C42297n.m134524a(cVar))) {
            lVar.mo60358a((String) null);
            C35563c.f93257t.mo83279a(false);
        }
    }

    /* renamed from: a */
    public static void m134549a(final Context context, final C27311c cVar, final int i) {
        if (C39360dw.m125725a().mo97930a(context) && cVar != null) {
            int a = m134548a(cVar);
            C6893q.m21444a("aweme_draft_invalid", a, (JSONObject) null);
            C6869c a2 = C6869c.m21381a().mo16887a("validity", String.valueOf(a)).mo16882a("is_fast_import", Boolean.valueOf(cVar.mo70215ad())).mo16887a("videoPath", C27312d.m89562b(cVar));
            if (cVar.mo70177S() || a == 0 || a == -2) {
                if (cVar.mo70179U()) {
                    C39702d.m127068c();
                }
                C6893q.m21444a("aweme_draft_load_fail_rate", 0, a2.mo16888b());
                final C41653c a3 = C41653c.m132582a(context, context.getString(R.string.dy2));
                AVMusic aVMusic = cVar.f72036e;
                if (aVMusic == null || cVar.mo70160B() == 1) {
                    dismiss(a3);
                    m134551a(cVar, a3, context, i);
                } else if (TextUtils.isEmpty(aVMusic.getMusicId()) || !TextUtils.isEmpty(aVMusic.getName())) {
                    StringBuilder sb = new StringBuilder("editDraft() musicModel path = [");
                    sb.append(C35563c.f93239b.mo15979b((Object) aVMusic));
                    sb.append("]");
                    C42880h.m136156a(sb.toString());
                    if (!((cVar.f72028P == null && cVar.mo70163E() == null) || cVar.f72038g == null)) {
                        File file = new File(cVar.f72038g);
                        if (file.exists() && file.length() > 0) {
                            m134551a(cVar, a3, context, i);
                            return;
                        }
                    }
                    if (aVMusic.getPath() == null) {
                        C10761a.m31403c(context, context.getApplicationContext().getString(R.string.chb)).mo25750a();
                        dismiss(a3);
                        return;
                    } else if (aVMusic.getPath().startsWith(WebKitApi.SCHEME_HTTP)) {
                        final C27311c cVar2 = cVar;
                        final C41653c cVar3 = a3;
                        final Context context2 = context;
                        final int i2 = i;
                        C423012 r4 = new C42302a(a3, C43659c.m138324a().mo105612a(aVMusic.getPath()), new WeakReference(context)) {
                            /* renamed from: a */
                            public final void mo100636a(String str, int i, String str2, float[] fArr) {
                                super.mo100636a(str, i, str2, fArr);
                                try {
                                    cVar2.f72038g = str;
                                } catch (Exception unused) {
                                }
                                C42299p.m134551a(cVar2, cVar3, context2, i2);
                            }
                        };
                        m134550a(context, aVMusic, (C41654d) a3, (C42302a) r4);
                    } else {
                        cVar.f72038g = aVMusic.getPath();
                        m134551a(cVar, a3, context, i);
                        return;
                    }
                } else {
                    C35563c.f93246i.mo103858a(aVMusic.getMusicId(), (C35526aa) new C35526aa() {
                        /* renamed from: a */
                        public final void mo90340a(Exception exc) {
                            C42299p.m134551a(cVar, a3, context, i);
                        }

                        /* renamed from: a */
                        public final void mo90339a(AVMusic aVMusic) {
                            if (aVMusic != null) {
                                cVar.f72036e = aVMusic;
                            }
                            C42299p.m134551a(cVar, a3, context, i);
                        }
                    });
                }
                StringBuilder sb2 = new StringBuilder("editDraft() called with: view = [");
                sb2.append(cVar);
                sb2.append("]");
                C42880h.m136156a(sb2.toString());
                C6907h.onEvent(MobClick.obtain().setEventName("click_edit_image").setLabelName("draft_page"));
            } else {
                C10761a.m31399c(context, (int) R.string.buy).mo25750a();
                C6893q.m21444a("aweme_draft_load_fail_rate", 1, a2.mo16888b());
            }
        }
    }

    /* renamed from: a */
    private static void m134550a(Context context, AVMusic aVMusic, C41654d dVar, C42302a aVar) {
        if (context == null || aVMusic.getMusicStatus() != 0) {
            C35563c.f93246i.mo103856a(aVMusic, (C42599i) aVar);
            return;
        }
        String offlineDesc = aVMusic.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getApplicationContext().getString(R.string.chb);
        }
        C10761a.m31403c(context, offlineDesc).mo25750a();
        dismiss(dVar);
    }

    /* renamed from: a */
    public static void m134551a(C27311c cVar, C41653c cVar2, Context context, int i) {
        String str;
        String str2;
        cVar.mo70288p(new SecureRandom().nextInt(Integer.MAX_VALUE));
        cVar.f72049r = i;
        dismiss(cVar2);
        m134552b(cVar);
        C38511bc a = C38511bc.m123103a().mo96485a("creation_id", cVar.mo70303y()).mo96485a("shoot_way", cVar.mo70162D()).mo96483a("draft_id", cVar.mo70304z()).mo96484a("last_save_time", cVar.f72018F).mo96484a("edit_time", System.currentTimeMillis());
        C41463q.m132136b(cVar.mo70303y());
        if (cVar.f72026N == 2) {
            a.mo96485a("content_type", "slideshow").mo96485a("content_source", "upload");
        } else {
            String str3 = "content_type";
            if (cVar.mo70177S()) {
                str = "mv";
            } else {
                str = "video";
            }
            C38511bc a2 = a.mo96485a(str3, str);
            String str4 = "content_source";
            if (cVar.mo70177S() || cVar.mo70299u() == 1 || cVar.mo70299u() == 0) {
                str2 = "upload";
            } else {
                str2 = "shoot";
            }
            a2.mo96485a(str4, str2);
        }
        C6907h.m21524a("edit_draft", (Map) a.f100112a);
        if (cVar.f72026N != 2) {
            Intent intent = new Intent();
            intent.putExtra("shoot_way", "edit_draft");
            intent.putExtra("translation_type", 3);
            new C39502ax("AwemeDraftViewHolder");
            intent.putExtra("args", C39502ax.m126170a(cVar));
            C42880h.m136156a("GoPublishActivity from draft");
            intent.putExtra("fromDraft", 1);
            intent.putExtra("draft_to_edit_from", i);
            if (C35574k.m114859a().mo70110y().mo83122g()) {
                intent.putExtra("edit_publish_session_end_together", true);
            }
            C22488a.m74376a().mo59050a(context, intent);
            C39360dw.m125725a().mo97928a(cVar.f72036e);
        } else if (!((Activity) context).isFinishing()) {
            C35563c.f93256s.mo83285a(context, cVar);
        }
    }
}
