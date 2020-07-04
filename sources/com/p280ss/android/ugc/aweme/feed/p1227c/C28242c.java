package com.p280ss.android.ugc.aweme.feed.p1227c;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FloatingCardInfo;
import com.p280ss.android.ugc.aweme.feed.p1238ui.VideoBottomButton;
import com.p280ss.android.ugc.aweme.feed.p1238ui.VideoFloatingCard;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.c.c */
public final class C28242c {

    /* renamed from: a */
    private VideoBottomButton f74401a;

    /* renamed from: b */
    private VideoFloatingCard f74402b;

    /* renamed from: c */
    private ViewStub f74403c;

    /* renamed from: d */
    private ViewStub f74404d;

    /* renamed from: e */
    private ViewGroup f74405e;

    /* renamed from: f */
    private Aweme f74406f;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo71867c() {
        m92799d(0);
    }

    /* renamed from: e */
    private void m92800e() {
        if (this.f74402b == null) {
            this.f74402b = (VideoFloatingCard) this.f74403c.inflate();
        }
        if (this.f74401a == null) {
            this.f74401a = (VideoBottomButton) this.f74404d.inflate();
        }
    }

    /* renamed from: a */
    public final void mo71859a() {
        if (this.f74406f != null && this.f74406f.getFloatingCardInfo() != null && !this.f74406f.isAd()) {
            m92797c(200);
        }
    }

    /* renamed from: b */
    public final void mo71864b() {
        if (this.f74406f != null && this.f74406f.getFloatingCardInfo() != null) {
            m92799d(0);
        }
    }

    /* renamed from: d */
    private void m92798d() {
        this.f74405e.setTranslationX(0.0f);
        this.f74405e.setAlpha(1.0f);
        if (this.f74401a != null) {
            this.f74401a.setVisibility(8);
        }
        if (this.f74402b != null) {
            this.f74402b.setVisibility(8);
            this.f74402b.setTranslationX(0.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71861a(View view) {
        m92799d(200);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo71865b(long j) {
        this.f74402b.mo73950a(j);
    }

    /* renamed from: d */
    private void m92799d(long j) {
        if (this.f74402b != null) {
            this.f74402b.mo73951a(j, null, new C28248i(this, j));
        }
    }

    public C28242c(View view) {
        this.f74405e = (ViewGroup) view.findViewById(R.id.jh);
        this.f74404d = (ViewStub) view.findViewById(R.id.ea_);
        this.f74403c = (ViewStub) view.findViewById(R.id.ean);
    }

    /* renamed from: c */
    private void m92797c(long j) {
        m92800e();
        if (this.f74402b.getVisibility() != 0) {
            this.f74402b.setVisibility(0);
        }
        this.f74405e.animate().translationX((float) (-C23487o.m77157d(this.f74405e).right)).alpha(0.0f).setDuration(200).withEndAction(new C28247h(this, 200)).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71860a(long j) {
        this.f74405e.animate().alpha(1.0f).translationX(0.0f).setDuration(j).start();
    }

    /* renamed from: a */
    private static void m92796a(FloatingCardInfo floatingCardInfo) {
        if (C6903bc.m21501t().mo68412a(floatingCardInfo.getSchema())) {
            C6907h.m21524a("enter_star_board", (Map) C22984d.m75611a().mo59973a("enter_from", "star_ad").f60753a);
            C7195s.m22438a().mo18682a(C6903bc.m21501t().mo68413b("star_ad", "", ""));
            return;
        }
        C7195s.m22438a().mo18682a(floatingCardInfo.getSchema());
    }

    /* renamed from: a */
    public final void mo71862a(Aweme aweme) {
        if (aweme != null) {
            this.f74406f = aweme;
            m92798d();
            FloatingCardInfo floatingCardInfo = aweme.getFloatingCardInfo();
            if (floatingCardInfo != null && !aweme.isAd()) {
                m92800e();
                this.f74401a.setVisibility(0);
                this.f74401a.setText(floatingCardInfo.getButtonDesc());
                this.f74401a.setOnClickListener(new C28243d(this, floatingCardInfo));
                this.f74401a.setButtonBackground(floatingCardInfo.getButtonBackground());
                this.f74402b.setVisibility(4);
                this.f74402b.post(new C28244e(this));
                if (floatingCardInfo.getIcons() != null && floatingCardInfo.getIcons().size() > 0) {
                    this.f74402b.setIcon((UrlModel) floatingCardInfo.getIcons().get(0));
                }
                this.f74402b.setTitle(floatingCardInfo.getTitle());
                this.f74402b.setDesc(floatingCardInfo.getDescription());
                this.f74402b.setButtonText(floatingCardInfo.getSchemaDesc());
                this.f74402b.setOnClickListener(new C28245f(this, floatingCardInfo));
                this.f74402b.setButtonBackground(floatingCardInfo.getButtonBackground());
                this.f74402b.getCloseView().setOnClickListener(new C28246g(this));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71863a(FloatingCardInfo floatingCardInfo, View view) {
        m92796a(floatingCardInfo);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo71866b(FloatingCardInfo floatingCardInfo, View view) {
        m92796a(floatingCardInfo);
    }
}
