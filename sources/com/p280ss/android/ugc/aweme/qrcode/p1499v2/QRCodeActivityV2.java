package com.p280ss.android.ugc.aweme.qrcode.p1499v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.metrics.C33235ah;
import com.p280ss.android.ugc.aweme.metrics.C33236ai;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36717ag;
import com.p280ss.android.ugc.aweme.qrcode.C37055c;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37045m;
import com.p280ss.android.ugc.aweme.qrcode.p1496b.C37045m.C37051a;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37074d;
import com.p280ss.android.ugc.aweme.qrcode.view.C37121a;
import com.p280ss.android.ugc.aweme.qrcode.view.QRCodeCardView;
import com.p280ss.android.ugc.aweme.qrcode.view.QRCodeCardView.C37120a;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2 */
public class QRCodeActivityV2 extends AmeSSActivity implements OnClickListener, C37051a {

    /* renamed from: a */
    QRCodeParams f97045a;

    /* renamed from: b */
    public QRCodeCardView f97046b;

    /* renamed from: c */
    public C37121a f97047c;

    /* renamed from: d */
    public QRCodeCardViewV2ForSaveImage f97048d;

    /* renamed from: e */
    public boolean f97049e;

    /* renamed from: f */
    private TextView f97050f;

    /* renamed from: g */
    private TextView f97051g;

    /* renamed from: h */
    private FrameLayout f97052h;

    /* renamed from: i */
    private View f97053i;

    /* renamed from: j */
    private TextTitleBar f97054j;

    /* renamed from: k */
    private C37045m f97055k;

    /* renamed from: l */
    private TextView f97056l;

    /* renamed from: m */
    private ImageView f97057m;

    /* renamed from: n */
    private List<Aweme> f97058n;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    /* renamed from: l */
    private void m119244l() {
        this.f97055k.mo93489a();
    }

    /* renamed from: g */
    private void m119239g() {
        Intent intent = getIntent();
        if (intent != null) {
            this.f97045a = (QRCodeParams) intent.getSerializableExtra("extra_params");
        }
        this.f97058n = C28479b.m93596b();
    }

    /* renamed from: j */
    private QRCodeCardView m119242j() {
        if (this.f97045a == null || this.f97045a.type != 4) {
            return new QRCodeCardViewV2(this);
        }
        return new C37114g(this);
    }

    /* renamed from: m */
    private void m119245m() {
        if (this.f97047c != null && !this.f97047c.isShowing()) {
            this.f97047c.show();
            this.f97047c.mo93590a();
        }
    }

    /* renamed from: a */
    public final View mo93496a() {
        if (C6399b.m19944t()) {
            return this.f97046b;
        }
        return this.f97048d;
    }

    /* renamed from: b */
    public final void mo93498b() {
        m119245m();
        new C33236ai().mo85085a(this.f97045a.enterFrom).mo85086b("normal").mo85087c("shaped").mo85252e();
    }

    /* renamed from: c */
    public final void mo93542c() {
        if (this.f97047c != null && this.f97047c.isShowing()) {
            this.f97047c.dismiss();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C28479b.m93598b(this.f97058n);
        this.f97055k.mo93491b();
        mo93542c();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: e */
    private void m119237e() {
        C6907h.m21524a("click_share_person", (Map) C22984d.m75611a().mo59973a("enter_from", "qr_code").f60753a);
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser != null) {
            C36717ag.m118375a((Activity) this, curUser, (String) null, this.f97058n, true);
        }
    }

    /* renamed from: i */
    private void m119241i() {
        if (this.f97047c == null) {
            this.f97047c = C37121a.m119327a(this, getResources().getString(R.string.da6));
            this.f97047c.setIndeterminate(false);
            this.f97047c.getWindow().addFlags(32);
        }
    }

    /* renamed from: k */
    private String m119243k() {
        if (this.f97045a == null) {
            return getString(C37055c.m119141a(0, ""));
        }
        return getString(C37055c.m119142a(this.f97045a.type, this.f97045a.objectId, this.f97045a.enterFrom));
    }

    /* renamed from: d */
    private void m119236d() {
        if (!C6399b.m19944t() && !TimeLockRuler.isTeenModeON() && this.f97045a != null && this.f97045a.objectId != null && this.f97045a.objectId.equals(C21115b.m71197a().getCurUserId()) && "navigation_panel".equals(this.f97045a.enterFrom)) {
            this.f97057m = new ImageView(this);
            this.f97057m.setImageResource(R.drawable.alb);
            this.f97057m.setContentDescription(getString(R.string.drz));
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) C9738o.m28708b((Context) this, 44.0f), 1073741824);
            LayoutParams layoutParams = new LayoutParams(makeMeasureSpec, makeMeasureSpec);
            layoutParams.gravity = 21;
            layoutParams.rightMargin = (int) C9738o.m28708b((Context) this, 6.0f);
            int b = (int) C9738o.m28708b((Context) this, 10.0f);
            this.f97057m.setPadding(b, b, b, b);
            this.f97054j.addView(this.f97057m, layoutParams);
            this.f97057m.setOnClickListener(new C37108a(this));
        }
    }

    /* renamed from: f */
    private void m119238f() {
        if (C6399b.m19946v()) {
            this.f97053i.setBackgroundColor(getResources().getColor(R.color.a48));
            this.f97054j.setBackgroundColor(getResources().getColor(R.color.a7f));
            this.f97050f.setTextColor(getResources().getColor(R.color.a64));
            this.f97051g.setTextColor(getResources().getColor(R.color.a64));
            this.f97046b.setQRCodeCardTitleColor(getResources().getColor(R.color.lw));
            this.f97046b.setQRCodeCardSubtitleColor(getResources().getColor(R.color.lz));
            if (this.f97048d != null) {
                this.f97048d.setQRCodeCardTitleColor(getResources().getColor(R.color.lw));
                this.f97048d.setQRCodeCardSubtitleColor(getResources().getColor(R.color.lz));
            }
        }
    }

    /* renamed from: h */
    private void m119240h() {
        QRCodeCardViewV2ForSaveImage qRCodeCardViewV2ForSaveImage;
        this.f97054j.setTitle((CharSequence) m119243k());
        int c = C9738o.m28714c(this, (float) C9738o.m28709b((Context) this));
        if (c < 660) {
            float f = ((float) c) / 667.0f;
            this.f97052h.setScaleX(f);
            this.f97052h.setScaleY(f);
            float f2 = ((1.0f - f) * 400.0f) / 2.0f;
            float f3 = (32.0f * f) - f2;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f97052h.getLayoutParams();
            layoutParams.topMargin = (int) C9738o.m28708b((Context) this, f3);
            this.f97052h.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f97056l.getLayoutParams();
            layoutParams2.topMargin = (int) C9738o.m28708b((Context) this, 16.0f - f2);
            this.f97056l.setLayoutParams(layoutParams2);
        }
        this.f97046b = m119242j();
        if (!C6399b.m19944t()) {
            if (this.f97045a.type == 4) {
                qRCodeCardViewV2ForSaveImage = new C37117j(this);
            } else {
                qRCodeCardViewV2ForSaveImage = new QRCodeCardViewV2ForSaveImage(this);
            }
            this.f97048d = qRCodeCardViewV2ForSaveImage;
            this.f97052h.addView(this.f97048d);
            this.f97048d.setTranslationY((float) C9738o.m28709b((Context) this));
        }
        this.f97052h.addView(this.f97046b);
        m119241i();
        this.f97046b.setOnBindQrCodeListener(new C37120a() {
            /* renamed from: b */
            public final void mo93546b() {
                if (!QRCodeActivityV2.this.f97049e && QRCodeActivityV2.this.f97047c != null && QRCodeActivityV2.this.f97047c.isShowing()) {
                    QRCodeActivityV2.this.f97047c.dismiss();
                }
            }

            /* renamed from: c */
            public final void mo93547c() {
                QRCodeActivityV2.this.f97049e = true;
                if (QRCodeActivityV2.this.f97048d != null) {
                    QRCodeActivityV2.this.f97048d.setParams(QRCodeActivityV2.this.f97045a);
                }
                QRCodeActivityV2.this.mo93542c();
            }

            /* renamed from: a */
            public final void mo93545a() {
                new C33235ah().mo85083a(QRCodeActivityV2.this.f97045a.enterFrom).mo85084b("shaped").mo85252e();
                if (QRCodeActivityV2.this.f97048d != null) {
                    QRCodeActivityV2.this.f97048d.setParams(QRCodeActivityV2.this.f97045a);
                    QRCodeActivityV2.this.f97048d.setOnBindQrCodeListener(new C37120a() {
                        /* renamed from: b */
                        public final void mo93546b() {
                        }

                        /* renamed from: c */
                        public final void mo93547c() {
                        }

                        /* renamed from: a */
                        public final void mo93545a() {
                            QRCodeActivityV2.this.mo93542c();
                        }
                    });
                    if (QRCodeActivityV2.this.f97046b instanceof QRCodeCardViewV2) {
                        QRCodeActivityV2.this.f97048d.mo93457a(((QRCodeCardViewV2) QRCodeActivityV2.this.f97046b).getQrCodeInfo());
                    }
                } else {
                    QRCodeActivityV2.this.mo93542c();
                }
            }
        });
        this.f97046b.setData(this.f97045a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93541a(View view) {
        m119237e();
    }

    /* renamed from: a */
    public final void mo93497a(String str) {
        if (!isFinishing()) {
            mo93542c();
            C10761a.m31383a((Context) this, (int) R.string.dir).mo25750a();
            this.f97050f.announceForAccessibility(getString(R.string.dir));
            C37074d.m119209a(this, str);
        }
    }

    public void onClick(View view) {
        boolean z;
        boolean z2;
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.b6a) {
            finish();
            return;
        }
        if (id == R.id.e16) {
            if (this.f97048d != null) {
                z2 = this.f97048d.f97141f;
            } else {
                z2 = this.f97046b.f97141f;
            }
            if (z2) {
                m119244l();
            } else {
                C10761a.m31410e((Context) AwemeApplication.m21341a(), getString(R.string.av9)).mo25750a();
                view.announceForAccessibility(getString(R.string.av9));
            }
        } else if (id == R.id.e17) {
            C6907h.m21524a("qr_code_scan_enter", (Map) C22984d.m75611a().mo59973a("enter_from", "qr_code_detail").mo59973a("previous_page", this.f97045a.enterFrom).f60753a);
            if (this.f97045a.type == 4) {
                z = true;
            } else {
                z = false;
            }
            QRCodePermissionActivity.m119024a((Context) this, false, z);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ec);
        m119239g();
        this.f97053i = findViewById(R.id.a1c);
        this.f97054j = (TextTitleBar) findViewById(R.id.djz);
        this.f97056l = (TextView) findViewById(R.id.cyl);
        this.f97050f = (TextView) findViewById(R.id.e16);
        this.f97051g = (TextView) findViewById(R.id.e17);
        this.f97052h = (FrameLayout) findViewById(R.id.cmh);
        this.f97050f.setOnClickListener(this);
        this.f97051g.setOnClickListener(this);
        this.f97054j.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                QRCodeActivityV2.this.finish();
            }
        });
        this.f97054j.getBackBtn().setContentDescription(getString(R.string.pp));
        m119236d();
        m119240h();
        m119238f();
        this.f97055k = new C37045m(this, this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2", "onCreate", false);
    }

    /* renamed from: a */
    public static void m119235a(Context context, QRCodeParams qRCodeParams) {
        Intent intent = new Intent(context, QRCodeActivityV2.class);
        intent.putExtra("extra_params", qRCodeParams);
        context.startActivity(intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f97055k.mo93490a(i, strArr, iArr);
    }
}
