package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkStealTowerState;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4715gh;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4715gh.C4716a;
import com.bytedance.android.livesdk.chatroom.p210c.C4301d;
import com.bytedance.android.livesdk.chatroom.p210c.C4307e;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.ies.sdk.widgets.KVData;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;

public class LinkPKStealTowerWidget extends SubWidget implements C0053p<KVData>, C4716a {

    /* renamed from: d */
    private static final int f16102d = Color.parseColor("#ffee00");

    /* renamed from: e */
    private boolean f16103e;

    /* renamed from: f */
    private C4715gh f16104f;

    /* renamed from: g */
    private ViewGroup f16105g;

    /* renamed from: h */
    private View f16106h;

    /* renamed from: i */
    private View f16107i;

    /* renamed from: j */
    private TextView f16108j;

    /* renamed from: k */
    private ProgressBar f16109k;

    /* renamed from: l */
    private LayoutParams f16110l;

    /* renamed from: m */
    private LayoutParams f16111m;

    /* renamed from: n */
    private ForegroundColorSpan f16112n;

    /* renamed from: o */
    private C4301d<TextView> f16113o;

    /* renamed from: p */
    private C4307e f16114p;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public void onDestroy() {
        this.f16056a.removeObserver(this);
        this.f16114p.mo11983a();
        this.f16104f.mo8963a();
        super.onDestroy();
    }

    /* renamed from: a */
    private void m17564a() {
        this.f16114p = new C4307e(this.f16056a, this.contentView);
        this.f16113o = this.f16114p.mo11982a((int) R.id.e2i).mo11978a("data_pk_steal_tower_score", new C5641cl(this)).mo11979a();
    }

    /* renamed from: b */
    private void m17567b() {
        this.f16105g.setVisibility(8);
        this.f16109k.setVisibility(0);
        this.f16108j.setBackgroundResource(0);
        this.f16108j.setVisibility(0);
        this.f16106h.setBackgroundResource(R.drawable.cb_);
        this.f16107i.setBackgroundResource(R.drawable.cbb);
    }

    /* renamed from: d */
    private void m17569d() {
        long j;
        this.f16105g.setVisibility(0);
        this.f16108j.setVisibility(8);
        if (this.f16056a.f11663E.f11695f) {
            ((TextView) this.f16113o.f12507a).setText(R.string.ex1);
            this.f16107i.setBackgroundResource(R.drawable.cbc);
        } else {
            ((TextView) this.f16113o.f12507a).setText(R.string.ews);
            this.f16106h.setBackgroundResource(R.drawable.cba);
        }
        if (this.f16056a.f11663E.f11695f) {
            j = 3000;
        } else {
            j = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
        }
        C7492s.m23295b(j, TimeUnit.MILLISECONDS).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5642cm<Object>(this), (C7326g<? super Throwable>) new C5643cn<Object>(this));
    }

    public void onCreate() {
        super.onCreate();
        this.f16103e = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16105g = (ViewGroup) this.contentView.findViewById(R.id.bkg);
        this.f16106h = this.contentView.findViewById(R.id.e2g);
        this.f16107i = this.contentView.findViewById(R.id.e2h);
        this.f16108j = (TextView) this.contentView.findViewById(R.id.e2j);
        this.f16109k = (ProgressBar) this.contentView.findViewById(R.id.cl_);
        this.f16110l = (LayoutParams) this.f16106h.getLayoutParams();
        this.f16111m = (LayoutParams) this.f16107i.getLayoutParams();
        m17564a();
        this.f16104f = new C4715gh(this.dataCenter);
        this.f16104f.mo9142a((C4716a) this);
        this.f16056a.observe("data_pk_steal_tower_state", this);
    }

    /* renamed from: c */
    private void m17568c() {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i;
        int i2;
        this.f16109k.setVisibility(8);
        this.f16108j.setBackgroundResource(R.drawable.btb);
        m17565a((View) this.f16113o.f12507a, true);
        m17565a(this.f16107i, true);
        m17565a(this.f16106h, true);
        boolean z = this.f16056a.f11663E.f11691b;
        View view = this.f16106h;
        if (z) {
            layoutParams = this.f16110l;
        } else {
            layoutParams = this.f16111m;
        }
        view.setLayoutParams(layoutParams);
        View view2 = this.f16107i;
        if (z) {
            layoutParams2 = this.f16111m;
        } else {
            layoutParams2 = this.f16110l;
        }
        view2.setLayoutParams(layoutParams2);
        switch (this.f16056a.f11663E.f11696g) {
            case 1:
                i2 = R.string.ewt;
                if (!this.f16103e) {
                    i = R.string.ewx;
                    break;
                } else {
                    i = R.string.ewu;
                    break;
                }
            case 2:
                i2 = R.string.ex0;
                if (!this.f16103e) {
                    i = R.string.ewy;
                    break;
                } else {
                    i = R.string.ewv;
                    break;
                }
            default:
                i2 = R.string.ex2;
                if (!this.f16103e) {
                    i = R.string.ewz;
                    break;
                } else {
                    i = R.string.eww;
                    break;
                }
        }
        C9049ap.m27022a(i2);
        this.f16104f.mo12642a(C3358ac.m12515a(i));
    }

    /* renamed from: a */
    public final void mo12648a(int i) {
        this.f16108j.setText(C3358ac.m12517a((int) R.string.ewr, C9048ao.m27017a((long) i)));
    }

    /* renamed from: b */
    public final void mo12650b(int i) {
        this.f16108j.setText(C3358ac.m12517a((int) R.string.ex3, C9048ao.m27017a((long) i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == 436641052 && key.equals("data_pk_steal_tower_state")) {
                c = 0;
            }
            if (c == 0) {
                if (kVData.getData().equals(PkStealTowerState.READY)) {
                    m17567b();
                } else if (kVData.getData().equals(PkStealTowerState.IN_PROCESS)) {
                    m17568c();
                } else if (kVData.getData().equals(PkStealTowerState.ENDED)) {
                    m17569d();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13876a(Long l) throws Exception {
        m17565a((View) this.f16113o.f12507a, false);
        m17565a(this.f16107i, false);
        m17565a(this.f16106h, false);
    }

    /* renamed from: a */
    private void m17565a(final View view, boolean z) {
        if (z) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200);
            view.startAnimation(alphaAnimation);
            view.setVisibility(0);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(200);
        view.startAnimation(alphaAnimation2);
        alphaAnimation2.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
            }
        });
    }

    /* renamed from: a */
    public final void mo12649a(int i, int i2) {
        if (this.f16109k.getMax() != i2) {
            this.f16109k.setMax(i2);
        }
        this.f16109k.setProgress(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13875a(TextView textView, Integer num) {
        int i;
        String str;
        int i2;
        int i3 = this.f16056a.f11663E.f11694e - this.f16056a.f11663E.f11693d;
        if (this.f16056a.f11663E.f11691b) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(num));
            sb.append("/");
            sb.append(String.valueOf(i3));
            str = sb.toString();
            i2 = 0;
            i = String.valueOf(num).length() + 1;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf(i3));
            sb2.append("/");
            sb2.append(String.valueOf(num));
            String sb3 = sb2.toString();
            i2 = String.valueOf(i3).length();
            String str2 = sb3;
            i = sb3.length();
            str = str2;
        }
        if (this.f16112n == null) {
            this.f16112n = new ForegroundColorSpan(f16102d);
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(this.f16112n, i2, i, 33);
        ((TextView) this.f16113o.f12507a).setText(spannableString);
    }
}
