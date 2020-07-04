package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0053p;
import android.graphics.Color;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3247af;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3409v;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkResult;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4694fp;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4694fp.C4695a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4861l;
import com.bytedance.android.livesdk.chatroom.p210c.C4301d;
import com.bytedance.android.livesdk.chatroom.p210c.C4307e;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.C9376n.C9377a;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.KVData;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C47555ab;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

public class LinkPKMvpWidget extends SubWidget implements C0053p<KVData>, C4695a {

    /* renamed from: d */
    public ViewGroup f16083d;

    /* renamed from: e */
    public ObjectAnimator f16084e;

    /* renamed from: f */
    private HSImageView f16085f;

    /* renamed from: g */
    private TextView f16086g;

    /* renamed from: h */
    private C7321c f16087h;

    /* renamed from: i */
    private C4301d<LinearLayout> f16088i;

    /* renamed from: j */
    private C4301d<LinearLayout> f16089j;

    /* renamed from: k */
    private List<C5443a> f16090k;

    /* renamed from: l */
    private List<C5443a> f16091l;

    /* renamed from: m */
    private C4694fp f16092m;

    /* renamed from: n */
    private C4307e f16093n;

    /* renamed from: o */
    private ObjectAnimator f16094o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkPKMvpWidget$a */
    static class C5443a {

        /* renamed from: a */
        public View f16097a;

        /* renamed from: b */
        public VHeadView f16098b;

        /* renamed from: c */
        private View f16099c;

        /* renamed from: d */
        private TextView f16100d;

        /* renamed from: e */
        private View f16101e;

        private C5443a(View view) {
            this.f16097a = view.findViewById(R.id.bbq);
            this.f16098b = (VHeadView) view.findViewById(R.id.b64);
            this.f16099c = view.findViewById(R.id.b87);
            this.f16100d = (TextView) view.findViewById(R.id.e08);
            this.f16101e = view.findViewById(R.id.bam);
        }

        /* renamed from: a */
        public final void mo13874a(C9377a aVar, boolean z, int i, PkResult pkResult) {
            this.f16100d.setText(String.valueOf(i + 1));
            this.f16100d.setVisibility(0);
            C5343e.m17031a((ImageView) this.f16098b, aVar.f25742d, (int) R.drawable.c9a);
            if (z && pkResult != PkResult.RIGHT_WON) {
                this.f16097a.setBackgroundResource(R.drawable.c9b);
                this.f16100d.setBackgroundResource(R.drawable.bve);
                if (i == 0) {
                    this.f16099c.setVisibility(0);
                    this.f16099c.setBackgroundResource(R.drawable.c9_);
                }
            } else if (z || pkResult == PkResult.LEFT_WON) {
                this.f16097a.setBackgroundResource(R.drawable.c9c);
                this.f16100d.setBackgroundResource(R.drawable.bvf);
                this.f16099c.setVisibility(8);
            } else {
                this.f16097a.setBackgroundResource(R.drawable.c9f);
                this.f16100d.setBackgroundResource(R.drawable.bvg);
                if (i == 0) {
                    this.f16099c.setVisibility(0);
                    this.f16099c.setBackgroundResource(R.drawable.c9d);
                }
            }
            if (i != 0 || ((!z || pkResult != PkResult.LEFT_WON) && (z || pkResult != PkResult.RIGHT_WON))) {
                this.f16101e.setVisibility(8);
            } else {
                this.f16101e.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    /* renamed from: a */
    public final void mo12616a(User user, User user2, C4861l lVar) {
        if (this.f16087h != null) {
            this.f16087h.dispose();
        }
        this.f16087h = ((C3245ad) C7492s.m23301b(user2).mo19317d((C7327h<? super T, ? extends R>) new C5636cg<Object,Object>(this, user, lVar)).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C5637ch<Object>(this, user));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13866a(User user, SpannableStringBuilder spannableStringBuilder) throws Exception {
        int c = C3358ac.m12523c();
        C5343e.m17038a(this.f16085f, user.getAvatarThumb());
        this.f16086g.setText(spannableStringBuilder);
        if (this.f16094o == null || this.f16084e == null) {
            this.f16094o = ObjectAnimator.ofFloat(this.f16083d, "translationX", new float[]{(float) c, 0.0f});
            this.f16094o.addListener(new AnimatorListenerAdapter() {
                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo13871a(Long l) throws Exception {
                    LinkPKMvpWidget.this.f16084e.start();
                }

                public final void onAnimationStart(Animator animator) {
                    LinkPKMvpWidget.this.f16083d.setVisibility(0);
                    ((C3247af) C7319aa.m22922a(10, TimeUnit.SECONDS).mo19127a(C47549a.m148327a()).mo19131a((C47555ab<T, ? extends R>) LinkPKMvpWidget.this.autoDispose())).mo10186a(new C5640ck(this));
                }
            });
            this.f16094o.setDuration(1000);
            this.f16084e = ObjectAnimator.ofFloat(this.f16083d, "translationX", new float[]{0.0f, (float) (-c)});
            this.f16084e.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    LinkPKMvpWidget.this.f16083d.setVisibility(8);
                }
            });
            this.f16084e.setDuration(1000);
        }
        this.f16094o.start();
    }

    /* renamed from: b */
    private void m17547b() {
        ((LinearLayout) this.f16088i.f12507a).setVisibility(0);
        ((LinearLayout) this.f16089j.f12507a).setVisibility(0);
    }

    public void onDestroy() {
        if (this.f16084e != null) {
            this.f16084e.cancel();
        }
        if (this.f16094o != null) {
            this.f16094o.cancel();
        }
        this.f16092m.mo8963a();
        this.f16056a.removeObserver(this);
        this.f16093n.mo11983a();
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        this.f16083d = (ViewGroup) findViewById(R.id.c2h);
        this.f16085f = (HSImageView) this.f16083d.findViewById(R.id.ayt);
        this.f16086g = (TextView) this.f16083d.findViewById(R.id.dsf);
        this.f16093n = new C4307e(this.f16056a, this.contentView);
        this.f16088i = this.f16093n.mo11982a((int) R.id.bla).mo11977a(new C5630ca(this)).mo11978a("data_pk_mvp_list_anchor", new C5631cb(this)).mo11978a("data_pk_state", new C5632cc(this)).mo11979a();
        this.f16089j = this.f16093n.mo11982a((int) R.id.ctf).mo11977a(new C5633cd(this)).mo11978a("data_pk_mvp_list_guest", new C5634ce(this)).mo11978a("data_pk_state", new C5635cf(this)).mo11979a();
        mo12615a();
        this.f16056a.observe("cmd_pk_mvp_show_list", this).observe("cmd_pk_show_interface", this);
        this.f16092m = new C4694fp(this.dataCenter);
        this.f16092m.mo9142a((C4695a) this);
    }

    /* renamed from: a */
    public final void mo12615a() {
        ((LinearLayout) this.f16088i.f12507a).removeAllViews();
        this.f16090k.clear();
        C5443a aVar = new C5443a(LayoutInflater.from(this.context).inflate(R.layout.ay5, (ViewGroup) this.f16088i.f12507a, true));
        aVar.f16097a.setBackgroundResource(R.drawable.c9b);
        aVar.f16098b.setImageResource(R.drawable.c9a);
        this.f16090k.add(aVar);
        ((LinearLayout) this.f16089j.f12507a).removeAllViews();
        this.f16091l.clear();
        C5443a aVar2 = new C5443a(LayoutInflater.from(this.context).inflate(R.layout.ay5, (ViewGroup) this.f16089j.f12507a, true));
        aVar2.f16097a.setBackgroundResource(R.drawable.c9f);
        aVar2.f16098b.setImageResource(R.drawable.c9e);
        this.f16091l.add(aVar2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13862a(View view) {
        m17546a(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13867b(View view) {
        m17546a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13863a(LinearLayout linearLayout) {
        linearLayout.setOnClickListener(new C5638ci(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13868b(LinearLayout linearLayout) {
        linearLayout.setOnClickListener(new C5639cj(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != 1608385910) {
                if (hashCode == 1619041129 && key.equals("cmd_pk_mvp_show_list")) {
                    c = 0;
                }
            } else if (key.equals("cmd_pk_show_interface")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    m17546a(true);
                    return;
                case 1:
                    m17547b();
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m17546a(boolean z) {
        long j;
        long j2;
        if (z) {
            j = this.f16057b.getOwner().getId();
        } else {
            j = this.f16056a.f11667e;
        }
        List list = null;
        PkResult pkResult = (PkResult) this.f16056a.get("data_pk_result");
        if (z && pkResult == PkResult.LEFT_WON) {
            list = (List) this.f16056a.get("data_pk_mvp_list_anchor");
        } else if (!z && pkResult == PkResult.RIGHT_WON) {
            list = (List) this.f16056a.get("data_pk_mvp_list_guest");
        }
        if (!C3409v.m12670a(list)) {
            j2 = ((C9377a) list.get(0)).f25739a;
        } else {
            j2 = -1;
        }
        Builder appendQueryParameter = Uri.parse("https://hotsoon.snssdk.com/hotsoon/in_app/common_live/mvp_rank/").buildUpon().appendQueryParameter("channel_id", String.valueOf(this.f16056a.f11665c)).appendQueryParameter("anchor_id", String.valueOf(j)).appendQueryParameter("room_id", String.valueOf(this.f16057b.getId()));
        if (j2 != -1) {
            appendQueryParameter.appendQueryParameter("mvp_id", String.valueOf(j2));
        }
        int e = (int) C3358ac.m12527e(C3358ac.m12523c());
        BaseDialogFragment.m12686a((FragmentActivity) this.context, (DialogFragment) C9178j.m27302j().mo22374c().mo11533a(C3979c.m13951a(appendQueryParameter.build().toString()).mo11555a(e).mo11560b((e / 16) * 15).mo11556a(8, 8, 0, 0).mo11566e(80)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13864a(LinearLayout linearLayout, PkState pkState) {
        if (pkState == PkState.PENAL) {
            m17545a((List) this.f16056a.get("data_pk_mvp_list_guest"), this.f16091l, linearLayout, false);
            return;
        }
        if (pkState == PkState.FINISHED) {
            linearLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13865a(LinearLayout linearLayout, List list) {
        m17545a(list, this.f16091l, linearLayout, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13869b(LinearLayout linearLayout, PkState pkState) {
        if (pkState == PkState.PENAL) {
            m17545a((List) this.f16056a.get("data_pk_mvp_list_anchor"), this.f16090k, linearLayout, true);
            return;
        }
        if (pkState == PkState.FINISHED) {
            linearLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13870b(LinearLayout linearLayout, List list) {
        m17545a(list, this.f16090k, linearLayout, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ SpannableStringBuilder mo13861a(User user, C4861l lVar, User user2) throws Exception {
        String str;
        String nickName = user.getNickName();
        String nickName2 = user2.getNickName();
        if (lVar.f13906a != 0) {
            str = this.context.getString(R.string.f_p, new Object[]{nickName, nickName2, lVar.f13907b});
        } else {
            str = this.context.getString(R.string.f_q, new Object[]{nickName, nickName2});
        }
        int indexOf = str.indexOf(nickName);
        int indexOf2 = str.indexOf(nickName2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#ffd064")), indexOf, nickName.length() + indexOf, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#ffd064")), indexOf2, nickName2.length() + indexOf2, 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private void m17545a(List<C9377a> list, List<C5443a> list2, LinearLayout linearLayout, boolean z) {
        int i;
        if (!C6311g.m19573a(list)) {
            while (true) {
                if (linearLayout.getChildCount() >= list.size()) {
                    break;
                }
                View inflate = LayoutInflater.from(this.context).inflate(R.layout.ay5, linearLayout, false);
                if (z) {
                    linearLayout.addView(inflate, 0);
                } else {
                    linearLayout.addView(inflate);
                }
                list2.add(new C5443a(inflate));
            }
            PkResult pkResult = (PkResult) this.f16056a.get("data_pk_result");
            for (i = 0; i < list.size(); i++) {
                ((C5443a) list2.get(i)).mo13874a((C9377a) list.get(i), z, i, pkResult);
            }
        }
    }
}
