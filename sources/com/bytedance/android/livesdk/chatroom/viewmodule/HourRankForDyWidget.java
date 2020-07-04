package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3384d;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.event.C4409aa;
import com.bytedance.android.livesdk.chatroom.event.C4430av;
import com.bytedance.android.livesdk.chatroom.model.C4914l;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.p220ui.C5302dx;
import com.bytedance.android.livesdk.chatroom.presenter.C5025j;
import com.bytedance.android.livesdk.chatroom.presenter.C5025j.C5026a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.chatroom.utils.C5357o;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8691v;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.DailyRankDialog;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9420h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class HourRankForDyWidget extends LiveRecyclableWidget implements C0053p<KVData>, OnClickListener, C5026a {

    /* renamed from: a */
    public C47562b f15971a = new C47562b();

    /* renamed from: b */
    public View f15972b;

    /* renamed from: c */
    private View f15973c;

    /* renamed from: d */
    private View f15974d;

    /* renamed from: e */
    private TextView f15975e;

    /* renamed from: f */
    private DailyRankDialog f15976f;

    /* renamed from: g */
    private boolean f15977g;

    /* renamed from: h */
    private C5025j f15978h;

    /* renamed from: i */
    private Room f15979i;

    /* renamed from: j */
    private boolean f15980j;

    /* renamed from: k */
    private boolean f15981k;

    /* renamed from: l */
    private AnimatorSet f15982l;

    /* renamed from: m */
    private CharSequence f15983m;

    /* renamed from: n */
    private PopupWindow f15984n;

    /* renamed from: o */
    private HSImageView f15985o;

    /* renamed from: p */
    private HSImageView f15986p;

    /* renamed from: q */
    private HSImageView f15987q;

    /* renamed from: r */
    private int f15988r;

    /* renamed from: a */
    public final void mo13045a(C4914l lVar) {
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.aws;
    }

    /* renamed from: k */
    private void m17382k() {
        if (isViewValid() && this.f15976f != null) {
            this.f15976f.dismiss();
        }
    }

    /* renamed from: b */
    private void m17374b() {
        if (isViewValid() && this.f15975e != null) {
            m17375c();
            if (m17376d()) {
                this.f15978h.mo13043b();
            }
        }
    }

    /* renamed from: c */
    private void m17375c() {
        if (!TextUtils.equals((String) C8946b.f24460bn.mo22117a(), "result")) {
            C8946b.f24460bn.mo22118a("result");
            m17378g();
        }
    }

    /* renamed from: d */
    private static boolean m17376d() {
        if (((Integer) LiveSettingKeys.LIVE_DAILY_RANK.mo10240a()).intValue() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m17378g() {
        if (this.f15984n == null || !this.f15984n.isShowing()) {
            m17379h();
            if (this.f15972b != null) {
                m17381j();
            }
        }
    }

    /* renamed from: a */
    public final void mo13801a() {
        if (this.f15982l != null) {
            this.f15982l.cancel();
        }
        this.f15972b.clearAnimation();
        C5593ar.m18006a(this.f15984n);
    }

    public void onUnload() {
        this.f15978h.mo8963a();
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        if (this.f15976f != null) {
            try {
                this.f15976f.dismiss();
            } catch (IllegalStateException unused) {
            }
            this.f15976f = null;
        }
        this.f15977g = false;
        this.f15983m = null;
    }

    /* renamed from: f */
    private void m17377f() {
        this.f15973c.setVisibility(0);
        if (TextUtils.isEmpty(this.f15983m)) {
            this.f15973c.setVisibility(4);
            return;
        }
        this.f15975e.setText(this.f15983m);
        if (this.f15988r != 10) {
            this.f15988r = 10;
            this.f15975e.setTextSize((float) this.f15988r);
        }
    }

    /* renamed from: h */
    private void m17379h() {
        if (this.f15972b == null || this.f15984n == null) {
            this.f15972b = LayoutInflater.from(getContext()).inflate(R.layout.awr, this.containerView, false);
            this.f15972b.setVisibility(4);
            this.f15985o = (HSImageView) this.f15972b.findViewById(R.id.azc);
            this.f15986p = (HSImageView) this.f15972b.findViewById(R.id.azd);
            this.f15987q = (HSImageView) this.f15972b.findViewById(R.id.b00);
            m17380i();
            this.f15972b.setVisibility(0);
            this.f15984n = new PopupWindow(this.f15972b, -2, -2, false);
            this.f15984n.setBackgroundDrawable(null);
            this.f15984n.setFocusable(true);
            this.f15984n.setOutsideTouchable(true);
            this.f15972b.setOnClickListener(new C5592aq(this));
        }
    }

    /* renamed from: i */
    private void m17380i() {
        List a = C5357o.m17074a();
        if (a != null && a.size() > 2) {
            int[] a2 = C5302dx.m16975a(0, a.size() - 1, 3);
            if (a2 != null) {
                C5343e.m17040a(this.f15985o, (String) a.get(a2[0]));
                C5343e.m17040a(this.f15986p, (String) a.get(a2[1]));
                C5343e.m17040a(this.f15987q, (String) a.get(a2[2]));
            }
        }
    }

    /* renamed from: j */
    private void m17381j() {
        if (this.f15972b != null && this.f15984n != null) {
            int b = (int) C9738o.m28708b(getContext(), -138.0f);
            int b2 = (int) C9738o.m28708b(getContext(), -40.0f);
            this.f15982l = new AnimatorSet();
            this.f15972b.clearAnimation();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f15972b, "scaleX", new float[]{0.8f, 1.0f, 1.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f15972b, "scaleY", new float[]{0.8f, 1.0f, 1.0f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f15972b, "alpha", new float[]{0.0f, 1.0f, 1.0f});
            this.f15972b.setPivotX((float) (C3358ac.m12523c() - C3358ac.m12510a(66.0f)));
            this.f15972b.setPivotY((float) (this.f15972b.getHeight() / 2));
            this.f15982l.setDuration(300);
            this.f15982l.play(ofFloat).with(ofFloat2).with(ofFloat3);
            this.f15982l.start();
            this.f15982l.addListener(new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    HourRankForDyWidget.this.f15971a.mo119661a(C7492s.m23295b(3000, TimeUnit.MILLISECONDS).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19325f((C7326g<? super T>) new C7326g<Long>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void accept(Long l) throws Exception {
                            HourRankForDyWidget.this.mo13801a();
                        }
                    }));
                    HourRankForDyWidget.this.f15972b.setLayerType(0, null);
                }
            });
            this.f15984n.showAsDropDown(this.f15974d, b, b2);
            this.f15972b.setLayerType(2, null);
        }
    }

    public void onEvent(C4430av avVar) {
        if (isViewValid() && this.f15976f != null) {
            this.f15976f.dismiss();
        }
    }

    /* renamed from: a */
    private void m17372a(int i) {
        if (this.f15976f != null) {
            this.f15976f.dismiss();
        } else {
            this.f15976f = DailyRankDialog.m26361a(this.f15979i, this.f15980j, this.f15981k, this.dataCenter, 0);
        }
        this.f15976f.f23902f = 0;
        this.f15976f.show(((FragmentActivity) this.context).getSupportFragmentManager(), DailyRankDialog.f23895a);
    }

    public void onInit(Object... objArr) {
        this.f15973c = this.contentView.findViewById(R.id.awm);
        this.f15974d = this.contentView.findViewById(R.id.bzw);
        this.f15975e = (TextView) this.contentView.findViewById(R.id.awl);
        this.f15973c.setOnClickListener(this);
        this.f15974d.setOnClickListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -774172322) {
                if (hashCode == 1433895618 && key.equals("cmd_send_gift")) {
                    c = 0;
                }
            } else if (key.equals("cmd_dismiss_dialog_end")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    m17382k();
                    return;
                case 1:
                    if (isViewValid() && this.f15976f != null) {
                        this.f15976f.dismiss();
                        break;
                    }
            }
        }
    }

    public void onClick(View view) {
        if (isViewValid()) {
            int id = view.getId();
            if (id == R.id.awm) {
                this.f15978h.mo13043b();
                m17372a(0);
                return;
            }
            if (id == R.id.bzw) {
                C9097a.m27146a().mo22267a((Object) new C4409aa("button"));
                C9420h.m27938a(C3384d.m12589a(getContext()), Boolean.valueOf(true));
                C8946b.f24460bn.mo22118a("result");
            }
        }
    }

    public void onLoad(Object... objArr) {
        this.f15979i = (Room) this.dataCenter.get("data_room");
        this.f15980j = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f15981k = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f15978h = new C5025j();
        this.f15978h.f14293a = this.f15979i.getOwner().getId();
        this.f15978h.f14294b = this.f15979i.getId();
        this.f15978h.mo9142a((C5026a) this);
        this.dataCenter.observe("cmd_send_gift", this);
        this.dataCenter.observe("cmd_dismiss_dialog_end", this);
        C9097a.m27146a().mo22266a(C4430av.class).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19325f((C7326g<? super T>) new C7326g<C4430av>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C4430av avVar) throws Exception {
                HourRankForDyWidget.this.onEvent(avVar);
            }
        });
        m17374b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13802a(View view) {
        if (this.f15984n != null) {
            C5593ar.m18006a(this.f15984n);
        }
        C9097a.m27146a().mo22267a((Object) new C4409aa("toast"));
        C9420h.m27938a(C3384d.m12589a(getContext()), Boolean.valueOf(true));
    }

    /* renamed from: a */
    public final void mo13046a(C8691v vVar) {
        if (isViewValid() && vVar != null && vVar.baseMessage != null && !this.f15977g) {
            Spannable spannable = C4374z.f12668a;
            if (vVar.supportDisplayText()) {
                spannable = C4374z.m14749a(vVar.baseMessage.f26000j, vVar.f23688j);
            } else if (!TextUtils.isEmpty(vVar.f23688j)) {
                spannable = new SpannableString(vVar.f23688j);
            }
            if (spannable != C4374z.f12668a) {
                this.f15983m = spannable;
                m17377f();
            }
        }
    }

    /* renamed from: a */
    public final void mo13047a(C8852a aVar) {
        if (isViewValid() && aVar != null) {
            if (aVar.f24078k) {
                C9738o.m28712b(this.f15973c, 4);
                return;
            }
            if (aVar.f24069b != null && !C6319n.m19593a(aVar.f24069b.f24102f)) {
                this.f15983m = aVar.f24069b.f24102f;
                m17377f();
            }
        }
    }
}
