package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.api.C24547f;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24570j;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.net.C34065d;
import com.p280ss.android.ugc.aweme.profile.experiment.C35778a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.o */
public final class C38122o implements C34065d<Object>, C38389f {

    /* renamed from: b */
    public static final C38123a f99217b = new C38123a(null);

    /* renamed from: a */
    public final Aweme f99218a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.o$a */
    public static final class C38123a {
        private C38123a() {
        }

        public /* synthetic */ C38123a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "top";
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    /* renamed from: a */
    public final int mo95710a() {
        if (!this.f99218a.isTop()) {
            return R.drawable.au8;
        }
        return R.drawable.auf;
    }

    /* renamed from: c */
    public final int mo95716c() {
        if (this.f99218a.isTop()) {
            return R.string.cn3;
        }
        return R.string.eaa;
    }

    public C38122o(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        this.f99218a = aweme;
    }

    /* renamed from: a */
    public final void mo95711a(Context context) {
        C7573i.m23587b(context, "context");
        C38390a.m122628a((C38389f) this, context);
    }

    /* renamed from: a */
    public final void mo95713a(ImageView imageView) {
        C7573i.m23587b(imageView, "iconView");
        C38390a.m122629a((C38389f) this, imageView);
    }

    /* renamed from: a */
    public final void mo95714a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C38390a.m122630a((C38389f) this, textView);
    }

    /* renamed from: a */
    public final void mo58715a(Exception exc) {
        String str;
        C22814a.m75245a(C6399b.m19921a(), exc, R.string.cjs);
        String str2 = "click_video_top";
        User author = this.f99218a.getAuthor();
        C7573i.m23582a((Object) author, "aweme.author");
        C22984d a = new C22984d().mo59973a("group_id", this.f99218a.getAid()).mo59973a("author_id", author.getUid()).mo59973a("enter_from", "personal_homepage");
        String str3 = "final_status";
        if (this.f99218a.isTop()) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (!C35778a.m115539a() || !this.f99218a.isPrivate() || this.f99218a.isTop()) {
            C24547f.m80571a(this, this.f99218a.getAid(), !this.f99218a.isTop());
        } else {
            C10761a.m31383a(context, (int) R.string.cxd).mo25750a();
        }
    }

    /* renamed from: a */
    public final void mo58716a(String str, Object obj) {
        int i;
        String str2;
        this.f99218a.setIsTop(this.f99218a.isTop() ^ true ? 1 : 0);
        Context a = C6399b.m19921a();
        if (this.f99218a.isTop()) {
            i = R.string.eag;
        } else {
            i = R.string.eac;
        }
        C10761a.m31387a(a, a.getString(i)).mo25750a();
        String str3 = "click_video_top";
        User author = this.f99218a.getAuthor();
        C7573i.m23582a((Object) author, "aweme.author");
        C22984d a2 = new C22984d().mo59973a("group_id", this.f99218a.getAid()).mo59973a("author_id", author.getUid()).mo59973a("enter_from", "personal_homepage");
        String str4 = "final_status";
        if (this.f99218a.isTop()) {
            str2 = "top";
        } else {
            str2 = "top_cancel";
        }
        C6907h.m21524a(str3, (Map) a2.mo59973a(str4, str2).f60753a);
        C42961az.m136380a(new C24570j(1));
    }
}
