package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.arch.lifecycle.C0053p;
import android.os.Handler;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.antiaddic.C22558b;
import com.p280ss.android.ugc.aweme.antiaddic.C22562c;
import com.p280ss.android.ugc.aweme.antiaddic.C22572i;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.main.C33055k;
import com.p280ss.android.ugc.aweme.main.TabChangeManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.at */
public final class C28811at extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    public ViewGroup f75956a;

    /* renamed from: b */
    public boolean f75957b;

    /* renamed from: c */
    public String f75958c;

    /* renamed from: d */
    public SimpleDateFormat f75959d;

    /* renamed from: e */
    private C24723e f75960e;

    /* renamed from: f */
    private boolean f75961f;

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* renamed from: j */
    private boolean m94822j() {
        if (this.f75960e == null || !this.f75960e.mo64705a()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo74037i() {
        if (FeedParamProvider.m94273a(this.f76175m).isHotSpot() || !C6903bc.m21489h().mo85874b(this.f76169g, this.f76179q, this.f76170h)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m94825m() {
        try {
            String awemeId = C30199h.m98861a().getAddictionSettings().getAwemeId();
            if (TextUtils.isEmpty(awemeId) || !TextUtils.equals(this.f76169g.getAid(), awemeId)) {
                return false;
            }
            return true;
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: n */
    private void m94826n() {
        if (C23487o.m77147a((View) this.f75956a) && !this.f75957b) {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public final void run() {
                    if (C28811at.this.f75956a != null) {
                        TextView textView = (TextView) C28811at.this.f75956a.findViewById(R.id.dqe);
                        String charSequence = textView.getText().toString();
                        if (!TextUtils.isEmpty(charSequence)) {
                            String format = C28811at.this.f75959d.format(new Date(System.currentTimeMillis()));
                            textView.setText(C1642a.m8034a(C28811at.this.f75958c, new Object[]{format, charSequence}));
                            C24671f.m80855e().mo65851a(C28811at.this.f75956a, 0, 360, true);
                            C28811at.this.f75957b = true;
                            C22558b.m74568a();
                        }
                    }
                }
            }, 100);
            handler.postDelayed(new Runnable() {
                public final void run() {
                    if (C28811at.this.f75956a != null) {
                        C24671f.m80855e().mo65851a(C28811at.this.f75956a, -C28811at.this.f75956a.getHeight(), 360, false);
                        handler.postDelayed(new Runnable() {
                            public final void run() {
                                if (C28811at.this.mo74037i()) {
                                    C28811at.this.f76174l.mo60134a("need_show_mix_enter", (Object) Integer.valueOf(1));
                                }
                            }
                        }, 360);
                    }
                }
            }, 7000);
        }
    }

    /* renamed from: l */
    private boolean m94824l() {
        if (C6399b.m19945u() || !C22572i.m74610a()) {
            return false;
        }
        Fragment a = TabChangeManager.m106432a((FragmentActivity) this.f76175m).mo84567a();
        if (!(a instanceof C33055k) || !(((C33055k) a).mo84447b() instanceof FeedRecommendFragment)) {
            return false;
        }
        String e = C22562c.m74570a().mo59207e();
        String aid = this.f76169g.getAid();
        if (!TextUtils.isEmpty(e) && TextUtils.equals(e, aid)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private void m94823k() {
        TextView textView = (TextView) this.f75956a.findViewById(R.id.dqe);
        ImageView imageView = (ImageView) this.f75956a.findViewById(R.id.b5v);
        if (!m94822j() && !this.f76169g.isHotSearchAweme() && !this.f76169g.isHotVideoAweme() && !C28482e.m93617j(this.f76169g) && !C28478a.m93588c(this.f76169g)) {
            String g = C22562c.m74570a().mo59209g();
            if (m94824l()) {
                this.f75961f = true;
                this.f75956a.setVisibility(0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f75956a.getLayoutParams();
                marginLayoutParams.height = (int) C9738o.m28708b(this.f76175m, 32.0f);
                marginLayoutParams.bottomMargin = 0;
                this.f75956a.setLayoutParams(marginLayoutParams);
                textView.setText(C22572i.m74611b());
                textView.setTextColor(C0683b.m2912c(this.f76175m, R.color.az3));
                imageView.setImageResource(R.drawable.aoz);
                return;
            } else if (!TextUtils.isEmpty(g)) {
                this.f75957b = false;
                this.f75961f = false;
                this.f75956a.setVisibility(0);
                MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f75956a.getLayoutParams();
                if (C6399b.m19944t()) {
                    marginLayoutParams2.height = (int) C9738o.m28708b(this.f76175m, 48.0f);
                }
                marginLayoutParams2.bottomMargin = (int) C9738o.m28708b(this.f76175m, -48.0f);
                this.f75956a.setLayoutParams(marginLayoutParams2);
                textView.setTextColor(C0683b.m2912c(this.f76175m, R.color.yr));
                textView.setText(g);
                imageView.setImageResource(R.drawable.aup);
                return;
            } else if (m94825m()) {
                this.f75961f = true;
                this.f75956a.setVisibility(0);
                MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) this.f75956a.getLayoutParams();
                marginLayoutParams3.bottomMargin = 0;
                this.f75956a.setLayoutParams(marginLayoutParams3);
                CharSequence charSequence = null;
                try {
                    charSequence = C30199h.m98861a().getAddictionSettings().getPopupText();
                } catch (NullValueException unused) {
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    textView.setText(charSequence);
                } else {
                    textView.setText(C6903bc.m21506y().mo57902d());
                }
                C6903bc.m21506y().mo57903e();
                return;
            }
        }
        this.f75961f = false;
        this.f75956a.setVisibility(8);
        textView.setText("");
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        if (videoItemParams != null) {
            this.f75960e = videoItemParams.mAdViewController;
            m94823k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        dataCenter.mo60132a("on_page_selected", (C0053p<C23083a>) this).mo60132a("on_render_ready", (C0053p<C23083a>) this).mo60132a("already_hide_mix_enter", (C0053p<C23083a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.addiction_hint);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f75956a = (ViewGroup) view.findViewById(R.id.ef);
        this.f75956a.setOnClickListener(C28815au.f75966a);
    }

    public C28811at(View view) {
        boolean z;
        super(view);
        if (!C6399b.m19944t()) {
            this.f75959d = new SimpleDateFormat("HH:mm", Locale.CHINA);
            this.f75958c = this.f76175m.getResources().getString(R.string.e89);
            return;
        }
        try {
            z = C30199h.m98861a().getAntiAddictionToastEnable24hourTime().booleanValue();
        } catch (NullValueException unused) {
            z = false;
        }
        if (z) {
            this.f75959d = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
        } else {
            this.f75959d = new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
        }
        this.f75958c = this.f76175m.getResources().getString(R.string.g5);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null && !this.f75961f) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1266775233) {
                if (hashCode != -962685926) {
                    if (hashCode == 350216171 && str.equals("on_page_selected")) {
                        c = 0;
                    }
                } else if (str.equals("on_render_ready")) {
                    c = 1;
                }
            } else if (str.equals("already_hide_mix_enter")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    return;
                case 1:
                    if (C23487o.m77147a((View) this.f75956a) && !this.f75957b) {
                        if (!mo74037i()) {
                            m94826n();
                            break;
                        } else {
                            this.f76174l.mo60134a("need_hide_mix_enter", (Object) Integer.valueOf(1));
                            break;
                        }
                    }
                case 2:
                    break;
            }
            if (C23487o.m77147a((View) this.f75956a) && !this.f75957b && mo74037i()) {
                m94826n();
            }
        }
    }
}
