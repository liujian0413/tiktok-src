package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.C28687a;
import com.p280ss.android.ugc.aweme.livewallpaper.p1368a.C32558c;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32577e;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38156a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.s */
public final class C38128s implements C38389f {

    /* renamed from: a */
    private final Aweme f99224a;

    /* renamed from: b */
    private final String f99225b;

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.ati;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "live_photo";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.dsp;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        if (this.f99224a.getDownloadStatus() == 0 && !C6903bc.m21487f().mo84747b(this.f99224a) && this.f99224a.getDownloadStatus() != 1 && this.f99224a.getAwemeControl().canShare()) {
            return true;
        }
        return false;
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

    public C38128s(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        this.f99224a = aweme;
        this.f99225b = str;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if ((C6399b.m19944t() || C37984ap.m121302b().checkDownloadPermission(C38157b.m121903a(context))) && C38156a.m121902a(this, context, this.f99224a, this.f99225b) && C28687a.m94362a(context, this.f99224a) && C37984ap.m121302b().checkShareAllowStatus(this.f99224a, context) && this.f99224a.getAwemeControl().canShare()) {
            if (C6399b.m19947w() && this.f99224a.getAuthor() != null) {
                IAccountUserService f = C6861a.m21337f();
                User author = this.f99224a.getAuthor();
                C7573i.m23582a((Object) author, "aweme.author");
                if (!f.isMe(author.getUid())) {
                    User author2 = this.f99224a.getAuthor();
                    C7573i.m23582a((Object) author2, "aweme.author");
                    if (author2.isPreventDownload()) {
                        C10761a.m31399c(context, (int) R.string.apu).mo25750a();
                        return;
                    }
                }
            }
            if (C6903bc.m21487f().mo84747b(this.f99224a)) {
                C10761a.m31399c(context, (int) R.string.bb_).mo25750a();
                return;
            }
            C32577e.m105500b(this.f99224a, this.f99225b);
            new C32558c(C38157b.m121903a(context)).mo83840c(this.f99224a);
        }
    }
}
