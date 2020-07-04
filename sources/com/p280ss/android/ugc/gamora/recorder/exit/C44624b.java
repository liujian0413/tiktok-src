package com.p280ss.android.ugc.gamora.recorder.exit;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.port.p1479in.C35578o;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40229a;
import com.p280ss.android.ugc.aweme.tools.C42141ah;
import com.p280ss.android.ugc.aweme.tools.C42146am;
import com.p280ss.android.ugc.aweme.tools.C42153at;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42250d;
import com.p280ss.android.ugc.aweme.tools.C42570p;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C43058dj;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.gamora.recorder.exit.b */
public final class C44624b implements C44623a {

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.b$a */
    static final class C44625a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f114965a;

        C44625a(C7561a aVar) {
            this.f114965a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f114965a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.b$b */
    static final class C44626b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f114966a;

        C44626b(C7561a aVar) {
            this.f114966a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f114966a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.b$c */
    static final class C44627c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f114967a;

        C44627c(C7561a aVar) {
            this.f114967a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f114967a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.b$d */
    static final class C44628d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f114968a;

        C44628d(C7561a aVar) {
            this.f114968a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f114968a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.b$e */
    static final class C44629e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f114969a;

        C44629e(C7561a aVar) {
            this.f114969a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f114969a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.b$f */
    static final class C44630f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7561a f114970a;

        C44630f(C7561a aVar) {
            this.f114970a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C6907h.m21524a("tutorial_popup_confirm", (Map) C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").f60753a);
            dialogInterface.dismiss();
            this.f114970a.invoke();
        }
    }

    /* renamed from: a */
    public final void mo107067a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) activity;
        videoRecordNewActivity.mo101850j();
        C43058dj.m136602a();
        videoRecordNewActivity.mo97896J().mo103594a((Object) this, (C42155av) new C42570p());
    }

    /* renamed from: b */
    public final void mo107072b(Activity activity) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23582a((Object) C35563c.f93240c, "AVEnv.APPLICATION_SERVICE");
        String e = C35563c.f93230L.mo93346e(Property.RecordTutorialLink);
        Context context = activity;
        C35578o oVar = C35563c.f93240c;
        C7573i.m23582a((Object) oVar, "AVEnv.APPLICATION_SERVICE");
        Intent intent = new Intent(context, oVar.mo83140g());
        intent.setData(Uri.parse(e));
        activity.startActivity(intent);
    }

    /* renamed from: c */
    public final void mo107073c(Activity activity) {
        C7573i.m23587b(activity, "activity");
        if (activity instanceof VideoRecordNewActivity) {
            VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) activity;
            videoRecordNewActivity.mo101850j();
            C40229a.m128552a().clear();
            C42141ah a = C42141ah.m134103a(C7525m.m23461a(), 0);
            videoRecordNewActivity.f107337w.mo103594a((Object) activity, (C42155av) a);
            C42153at atVar = new C42153at(videoRecordNewActivity.f107286a.f99745af, false);
            C42146am amVar = new C42146am(3);
            videoRecordNewActivity.f107337w.mo103594a((Object) activity, (C42155av) atVar);
            videoRecordNewActivity.f107337w.mo103594a((Object) activity, (C42155av) amVar);
            videoRecordNewActivity.f107338x.mo103594a((Object) activity, (C42155av) new C42250d());
            a.mo103576a();
        }
    }

    /* renamed from: a */
    public final boolean mo107071a(Context context) {
        C7573i.m23587b(context, "context");
        C35622l lVar = (C35622l) C25682d.m84426a(context, C35622l.class);
        String e = C35574k.m114859a().mo70091f().mo93346e(Property.RecordTutorialLink);
        if (!C35574k.m114859a().mo70096k().mo93305a(AVAB.Property.EnableRecordTutorial) || TextUtils.isEmpty(e) || lVar == null || !lVar.mo60369d(true)) {
            return false;
        }
        lVar.mo60371e(false);
        return true;
    }

    /* renamed from: a */
    public final void mo107068a(Context context, C7561a<C7581n> aVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "drop");
        Dialog a = new C10741a(context).mo25657b((int) R.string.dau).mo25658b((int) R.string.w_, (OnClickListener) null).mo25650a((int) R.string.bbe, (OnClickListener) new C44625a(aVar)).mo25656a().mo25637a();
        if (!C22911a.m75401a(context)) {
            C23487o.m77138a(a);
        }
        a.show();
    }

    /* renamed from: a */
    public final void mo107069a(Context context, C7561a<C7581n> aVar, C7561a<C7581n> aVar2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "cancel");
        C7573i.m23587b(aVar2, "confirm");
        Dialog a = new C10741a(context).mo25657b((int) R.string.dd2).mo25658b((int) R.string.dd0, (OnClickListener) new C44629e(aVar)).mo25650a((int) R.string.dd1, (OnClickListener) new C44630f(aVar2)).mo25656a().mo25637a();
        if (!C22911a.m75401a(context)) {
            C23487o.m77138a(a);
        }
        a.show();
        C6907h.m21524a("tutorial_popup_show", (Map) C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").f60753a);
    }

    /* renamed from: a */
    public final void mo107070a(Context context, C7561a<C7581n> aVar, C7561a<C7581n> aVar2, C7561a<C7581n> aVar3) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aVar, "cancel");
        C7573i.m23587b(aVar2, "exit");
        C7573i.m23587b(aVar3, "record");
        try {
            new C1081a(context, R.style.t7).mo4237b((int) R.string.bbh).mo4238b((int) R.string.w_, (OnClickListener) new C44626b(aVar)).mo4226a((int) R.string.o3, (OnClickListener) new C44627c(aVar2)).mo4243c((int) R.string.nw, (OnClickListener) new C44628d(aVar3)).mo4245c();
        } catch (Exception e) {
            C42880h.m136156a(e.toString());
        }
    }
}
