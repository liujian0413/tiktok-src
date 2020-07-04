package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Dialog;
import android.arch.lifecycle.C0069x;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42159az;
import com.p280ss.android.ugc.aweme.tools.C42161ba;
import com.p280ss.android.ugc.aweme.tools.C42347l;
import com.p280ss.android.ugc.aweme.tools.C42569o;
import com.p280ss.android.ugc.aweme.tools.C42570p;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s */
public final class C40313s implements C42161ba {

    /* renamed from: a */
    public final C39382ed f104701a;

    /* renamed from: a */
    public final void mo100135a() {
        this.f104701a.mo97963P().mo103594a((Object) this.f104701a, (C42155av) new C42570p());
    }

    /* renamed from: b */
    public final void mo100138b() {
        this.f104701a.mo97963P().mo103594a((Object) this.f104701a, (C42155av) new C42569o());
    }

    /* renamed from: c */
    private void m128769c() {
        Dialog a = new C10741a(this.f104701a.mo97961N()).mo25657b((int) R.string.dau).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.bbe, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C40313s.this.mo100135a();
            }
        }).mo25656a().mo25637a();
        if (!C22911a.m75401a(this.f104701a.mo97961N())) {
            C23487o.m77138a(a);
        }
        a.show();
    }

    /* renamed from: d */
    private void m128770d() {
        try {
            new C1081a(this.f104701a.mo97961N(), R.style.t7).mo4237b((int) R.string.bbh).mo4238b((int) R.string.w_, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (!C40313s.this.f104701a.mo97969V()) {
                        C6907h.onEvent(MobClick.obtain().setEventName("cancel_shoot_fail").setLabelName("shoot_page").setJsonObject(C40313s.this.f104701a.mo97966S()));
                    }
                }
            }).mo4226a((int) R.string.o3, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (!C40313s.this.f104701a.mo97969V()) {
                        C35563c.f93253p.mo90376a();
                        C40313s.this.mo100135a();
                        C6907h.onEvent(MobClick.obtain().setEventName("cancel_shoot_confirm").setLabelName("shoot_page").setJsonObject(C40313s.this.f104701a.mo97966S()));
                    }
                }
            }).mo4243c((int) R.string.nw, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (C40313s.this.f104701a.f33526d_ != null) {
                        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0069x.m159a(C40313s.this.f104701a.mo97962O()).mo147a(ShortVideoContextViewModel.class)).f99791a;
                        C6907h.m21524a("reshoot", (Map) C22984d.m75611a().mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("shoot_way", shortVideoContext.f99788x).mo59970a("draft_id", shortVideoContext.f99790z).f60753a);
                        C40313s.this.mo100138b();
                    }
                }
            }).mo4245c();
        } catch (Exception e) {
            C42880h.m136156a(e.toString());
        }
    }

    public C40313s(C39382ed edVar) {
        this.f104701a = edVar;
    }

    /* renamed from: a */
    private void m128767a(String str) {
        Dialog a = new C10741a(this.f104701a.mo97961N()).mo25657b((int) R.string.dd2).mo25658b((int) R.string.dd0, (OnClickListener) new C41120t(this)).mo25650a((int) R.string.dd1, (OnClickListener) new C41126u(this, str)).mo25656a().mo25637a();
        if (!C22911a.m75401a(this.f104701a.mo97961N())) {
            C23487o.m77138a(a);
        }
        a.show();
        C6907h.m21524a("tutorial_popup_show", (Map) C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").f60753a);
    }

    /* renamed from: b */
    private void m128768b(String str) {
        if (this.f104701a.f33526d_ != null) {
            Intent intent = new Intent(this.f104701a.mo97961N(), C35563c.f93240c.mo83140g());
            intent.setData(Uri.parse(str));
            this.f104701a.f33526d_.startActivity(intent);
            if (((ShortVideoContextViewModel) C0069x.m159a(this.f104701a.mo97962O()).mo147a(ShortVideoContextViewModel.class)).f99791a.f99777m == 0) {
                mo100135a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100136a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        mo100135a();
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo96095a(C42156aw awVar, Type type) {
        if (type != C42347l.class || this.f104701a.f33526d_ == null || this.f104701a.f33526d_.isFinishing()) {
            return null;
        }
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C0069x.m159a(this.f104701a.mo97962O()).mo147a(ShortVideoContextViewModel.class)).f99791a;
        if (shortVideoContext == null) {
            return null;
        }
        C6907h.onEvent(MobClick.obtain().setEventName("cancel_shoot").setLabelName("shoot_page").setJsonObject(this.f104701a.mo97966S()));
        if (shortVideoContext.f99766b != 1 || shortVideoContext.f99779o) {
            C35622l lVar = (C35622l) C25682d.m84426a(this.f104701a.mo97961N(), C35622l.class);
            String e = C35563c.f93230L.mo93346e(Property.RecordTutorialLink);
            if (C35563c.f93231M.mo93305a(AVAB.Property.EnableRecordTutorial) && !TextUtils.isEmpty(e) && lVar != null && lVar.mo60369d(true)) {
                lVar.mo60371e(false);
                m128767a(e);
            } else if (shortVideoContext.mo96150k() == 0) {
                mo100135a();
            } else {
                m128770d();
            }
        } else {
            m128769c();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100137a(String str, DialogInterface dialogInterface, int i) {
        C6907h.m21524a("tutorial_popup_confirm", (Map) C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").f60753a);
        dialogInterface.dismiss();
        m128768b(str);
    }
}
