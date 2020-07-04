package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0053p;
import android.content.DialogInterface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.SubscriptSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.p125a.C2417b;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.LinkState;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PKPenalStickerState;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkResult;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4696fq;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4696fq.C4697a;
import com.bytedance.android.livesdk.chatroom.model.C4901d;
import com.bytedance.android.livesdk.chatroom.p209bl.C4270b;
import com.bytedance.android.livesdk.chatroom.p210c.C4301d;
import com.bytedance.android.livesdk.chatroom.p210c.C4307e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7874h;
import com.bytedance.android.livesdk.gift.assets.C7877j;
import com.bytedance.android.livesdk.gift.effect.p376b.C7963a;
import com.bytedance.android.livesdk.gift.effect.p376b.C7964b;
import com.bytedance.android.livesdk.log.C8409a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p181a.C3848a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9066h;
import com.bytedance.android.livesdk.utils.C9066h.C9068b;
import com.bytedance.android.livesdk.utils.p425a.C9023a;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdk.widget.GradientTextView;
import com.bytedance.android.livesdk.widget.PKProgressBar;
import com.bytedance.android.livesdkapi.depend.model.live.C9380q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.KVData;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class LinkPKWidget extends SubWidget implements C0053p<KVData>, OnClickListener, C4697a {

    /* renamed from: A */
    private LinkPkTaskWidget f16117A;

    /* renamed from: B */
    private C2417b f16118B;

    /* renamed from: C */
    private C7964b f16119C;

    /* renamed from: D */
    private Random f16120D;

    /* renamed from: d */
    private View f16121d;

    /* renamed from: e */
    private ViewGroup f16122e;

    /* renamed from: f */
    private GradientTextView f16123f;

    /* renamed from: g */
    private ImageView f16124g;

    /* renamed from: h */
    private ImageView f16125h;

    /* renamed from: i */
    private TextView f16126i;

    /* renamed from: j */
    private ImageView f16127j;

    /* renamed from: k */
    private TextView f16128k;

    /* renamed from: l */
    private ImageView f16129l;

    /* renamed from: m */
    private SimpleDraweeView f16130m;

    /* renamed from: n */
    private TextView f16131n;

    /* renamed from: o */
    private View f16132o;

    /* renamed from: p */
    private C9245h f16133p;

    /* renamed from: q */
    private C4307e f16134q;

    /* renamed from: r */
    private C4301d<PKProgressBar> f16135r;

    /* renamed from: s */
    private C4301d<TextView> f16136s;

    /* renamed from: t */
    private C9245h f16137t;

    /* renamed from: u */
    private boolean f16138u;

    /* renamed from: v */
    private boolean f16139v;

    /* renamed from: w */
    private AnimatorSet f16140w;

    /* renamed from: x */
    private AnimatorSet f16141x;

    /* renamed from: y */
    private C7321c f16142y;

    /* renamed from: z */
    private C4696fq f16143z;

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.ax4;
    }

    /* renamed from: a */
    public final void mo12635a(String str) {
        this.f16123f.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo12636a(boolean z) {
        long j;
        if (this.f16138u || this.f16058c || z) {
            this.f16138u = false;
            C54451 r6 = new C7877j() {
                /* renamed from: a */
                public final void mo9346a(Throwable th) {
                    LinkPKWidget.this.mo13880a(Uri.parse("asset://com.ss.android.ies.live.sdk/pk_animation.webp"));
                }

                /* renamed from: a */
                public final void mo9345a(long j, String str) {
                    String str2;
                    C9068b a = C9066h.m27071a(str);
                    if (a != null) {
                        str2 = a.mo22256a(LinkPKWidget.this.context);
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        LinkPKWidget.this.mo13880a(new Builder().scheme("file").path(str2).build());
                        return;
                    }
                    LinkPKWidget.this.mo13880a(Uri.parse("asset://com.ss.android.ies.live.sdk/pk_animation.webp"));
                }
            };
            if (LiveSettingKeys.ASSET_ANIM_ID_MAP.mo10240a() == null) {
                j = 0;
            } else {
                j = ((C3848a) LiveSettingKeys.ASSET_ANIM_ID_MAP.mo10240a()).f11539a;
            }
            C7874h assetsManager = ((IGiftService) C3596c.m13172a(IGiftService.class)).getAssetsManager();
            if (assetsManager != null) {
                AssetsModel c = assetsManager.mo20662c(j);
                if (c == null) {
                    C8409a.m25578a("资源列表中找不到这个PK特效", String.valueOf(j));
                    mo13880a(Uri.parse("asset://com.ss.android.ies.live.sdk/pk_animation.webp"));
                    return;
                } else if (c.getResourceType() != 6) {
                    C8409a.m25578a("获取到的特效资源不是PK特效", String.valueOf(j));
                    mo13880a(Uri.parse("asset://com.ss.android.ies.live.sdk/pk_animation.webp"));
                    return;
                } else {
                    assetsManager.mo20656a(j, r6, 4);
                }
            }
            return;
        }
        this.f16138u = true;
    }

    /* renamed from: b */
    public final void mo12637b() {
        if (isViewValid()) {
            C9049ap.m27022a((int) R.string.eu4);
        }
    }

    /* renamed from: c */
    public final void mo12638c() {
        C9738o.m28712b(this.f16121d, 0);
        C9738o.m28712b((View) this.f16135r.f12507a, 0);
    }

    /* renamed from: m */
    private void m17591m() {
        if (!(!this.f16058c || this.f16119C == null || this.f16118B == null)) {
            C7963a a = this.f16118B.mo8875a();
            if (a != null && a.f21551a == this.f16119C.f21551a) {
                this.f16118B.mo8877b();
            }
        }
        this.f16056a.f11662D = PKPenalStickerState.HIDE;
        this.f16119C = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo13886d() {
        if (!this.f16058c) {
            this.f16139v = true;
            StringBuilder sb = new StringBuilder("onAdjustUiToVideoPosition :");
            sb.append(this.f16056a.f11674l);
            this.f16056a.lambda$put$1$DataCenter("cmd_log_link", sb.toString());
            if (this.f16056a.f11674l != 0) {
                m17579a((C3479d) this.f16056a.get("data_pk_current_room_interact_info"));
            }
            this.f16056a.f11661C = null;
        }
    }

    public void onDestroy() {
        this.f16143z.mo8963a();
        this.f16056a.removeObserver(this);
        this.f16134q.mo11983a();
        if (this.f16142y != null) {
            this.f16142y.dispose();
        }
        if (this.f16117A != null) {
            this.f16117A.mo13889b();
        }
        super.onDestroy();
    }

    /* renamed from: g */
    private void m17585g() {
        this.f16134q = new C4307e(this.f16056a, this.contentView);
        this.f16135r = this.f16134q.mo11982a((int) R.id.cbx).mo11977a(C5644co.f16718a).mo11978a("data_pk_anchor_score", C5645cp.f16719a).mo11978a("data_pk_guest_score", C5648cs.f16722a).mo11979a();
        this.f16136s = this.f16134q.mo11982a((int) R.id.e3_).mo11978a("data_pk_time_left", C5649ct.f16723a).mo11979a();
    }

    /* renamed from: h */
    private void m17586h() {
        if (this.f16058c) {
            m17587i();
            if (this.f16132o.getHeight() == 0) {
                int a = C9738o.m28691a(getContext());
                C9738o.m28701a(this.f16132o, a, (int) (((((float) (a / 2)) * 1.0f) / 9.0f) * 13.0f));
            }
        }
        this.f16127j.setVisibility(8);
        this.f16129l.setVisibility(8);
        ((TextView) this.f16136s.f12507a).setVisibility(0);
        this.f16126i.setVisibility(8);
        this.f16128k.setVisibility(8);
        this.f16124g.setVisibility(0);
        this.f16125h.setVisibility(8);
        this.f16123f.setVisibility(8);
        this.f16131n.setVisibility(8);
        if (this.f16137t != null && this.f16137t.isShowing()) {
            this.f16137t.dismiss();
        }
    }

    /* renamed from: i */
    private void m17587i() {
        ((PKProgressBar) this.f16135r.f12507a).setVisibility(0);
        this.f16121d.setVisibility(0);
        if (((Integer) this.f16056a.get("data_pk_battle_mode", Integer.valueOf(0))).intValue() == 0) {
            this.f16122e.setVisibility(0);
        }
        StringBuilder sb = new StringBuilder("show success :");
        sb.append(this.f16122e.getVisibility());
        this.f16056a.lambda$put$1$DataCenter("cmd_log_link", sb.toString());
        this.f16056a.lambda$put$1$DataCenter("cmd_pk_show_interface", new C4901d());
    }

    /* renamed from: k */
    private void m17589k() {
        this.f16129l.setVisibility(8);
        this.f16127j.setVisibility(8);
        ((PKProgressBar) this.f16135r.f12507a).mo22569a();
        this.f16122e.setVisibility(0);
        this.f16124g.setVisibility(8);
        this.f16125h.setVisibility(0);
        ((TextView) this.f16136s.f12507a).setVisibility(8);
        this.f16123f.setText(C3358ac.m12515a((int) R.string.eur));
        this.f16123f.setVisibility(0);
        this.f16123f.setGradient(true);
        ((PKProgressBar) this.f16135r.f12507a).setVisibility(8);
        this.f16121d.setVisibility(8);
        this.f16131n.setVisibility(8);
        if (this.f16137t != null && this.f16137t.isShowing()) {
            this.f16137t.dismiss();
        }
        this.f16056a.f11672j = 0;
        if (this.f16056a.f11680r == 1) {
            ((Boolean) C8946b.f24394aS.mo22117a()).booleanValue();
        }
    }

    /* renamed from: l */
    private void m17590l() {
        if (this.f16118B == null) {
            this.f16118B = (C2417b) this.dataCenter.get("data_sticker_message_manager");
        }
        if (this.f16118B != null) {
            Integer[] numArr = (Integer[]) LiveConfigSettingKeys.PK_PANEL_STICKER.mo10240a();
            if (numArr != null && numArr.length > 0) {
                if (this.f16120D == null) {
                    this.f16120D = new Random();
                }
                this.f16119C = C4270b.m14420a(numArr[this.f16120D.nextInt(numArr.length)].intValue(), true, ((Integer) LiveConfigSettingKeys.PK_PANEL_STICKER_DURATION.mo10240a()).intValue(), false);
                if (this.f16119C != null) {
                    this.f16056a.f11662D = PKPenalStickerState.SHOW;
                    this.f16118B.mo8876a(this.f16119C);
                    C7963a a = this.f16118B.mo8875a();
                    if (!(a == null || a.f21551a == this.f16119C.f21551a)) {
                        this.f16118B.mo8877b();
                    }
                }
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f16121d = this.contentView.findViewById(R.id.m0);
        this.f16123f = (GradientTextView) this.contentView.findViewById(R.id.dzl);
        this.f16122e = (ViewGroup) this.contentView.findViewById(R.id.bkg);
        this.f16132o = this.contentView.findViewById(R.id.a24);
        this.f16130m = (SimpleDraweeView) this.contentView.findViewById(R.id.bay);
        this.f16126i = (TextView) this.contentView.findViewById(R.id.dvf);
        this.f16127j = (ImageView) this.contentView.findViewById(R.id.b9r);
        this.f16128k = (TextView) this.contentView.findViewById(R.id.e4j);
        this.f16129l = (ImageView) this.contentView.findViewById(R.id.bdh);
        this.f16131n = (TextView) this.contentView.findViewById(R.id.dql);
        this.f16131n.setOnClickListener(this);
        this.f16124g = (ImageView) this.contentView.findViewById(R.id.bb0);
        this.f16125h = (ImageView) this.contentView.findViewById(R.id.b_o);
        this.f16121d.setVisibility(4);
        m17585g();
        this.f16056a.observe("data_pk_state", this).observe("data_link_state", this).observe("data_pk_result", this).observe("cmd_show_gift_task_info", this).observe("cmd_show_steal_tower_info", this).observe("data_pk_current_room_interact_info", this);
        this.f16143z = new C4696fq(this.dataCenter);
        this.f16143z.mo9142a((C4697a) this);
        enableSubWidgetManager();
        this.f16056a.lambda$put$1$DataCenter("cmd_log_link", "LinkPkWidget loaded");
        if (!this.f16058c && this.f16056a.f11661C != null) {
            mo13886d();
        }
    }

    /* renamed from: j */
    private void m17588j() {
        if (isViewValid()) {
            this.f16123f.setGradient(false);
            this.f16123f.setText(C3358ac.m12515a((int) R.string.evh));
            this.f16123f.setVisibility(0);
            this.f16124g.setVisibility(8);
            this.f16125h.setVisibility(8);
            PkResult pkResult = (PkResult) this.f16056a.get("data_pk_result");
            if (pkResult == PkResult.EVEN) {
                this.f16127j.setImageResource(R.drawable.c95);
                this.f16129l.setImageResource(R.drawable.c95);
            } else if (pkResult == PkResult.LEFT_WON) {
                this.f16127j.setImageResource(R.drawable.c96);
                this.f16129l.setImageResource(R.drawable.c97);
            } else {
                this.f16127j.setImageResource(R.drawable.c97);
                this.f16129l.setImageResource(R.drawable.c96);
            }
            this.f16126i.setText(String.valueOf(((PKProgressBar) this.f16135r.f12507a).getRightValue()));
            this.f16128k.setText(String.valueOf(((PKProgressBar) this.f16135r.f12507a).getLeftValue()));
            this.f16129l.setScaleX(1.0f);
            this.f16129l.setScaleY(1.0f);
            this.f16129l.setTranslationX(0.0f);
            this.f16129l.setTranslationY(0.0f);
            this.f16127j.setScaleX(1.0f);
            this.f16127j.setScaleY(1.0f);
            this.f16127j.setTranslationX(0.0f);
            this.f16127j.setTranslationY(0.0f);
            this.f16128k.setVisibility(0);
            this.f16126i.setVisibility(0);
            this.f16129l.setVisibility(0);
            this.f16127j.setVisibility(0);
            if (this.f16058c) {
                if (this.f16056a.f11680r == 0) {
                    this.f16131n.setVisibility(0);
                }
                if (pkResult == PkResult.RIGHT_WON) {
                    m17590l();
                }
            }
            ((C3245ad) C7492s.m23295b(3, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10183a(new C5652cw(this), new C5653cx(this));
        }
    }

    /* renamed from: a */
    public final void mo12634a() {
        if (isViewValid()) {
            if (this.f16137t == null) {
                this.f16137t = new C9249a(this.context).mo22710a((int) R.string.etw).mo22718b((int) R.string.eu5).mo22722b(0, (int) R.string.ett, (DialogInterface.OnClickListener) new C5650cu(this)).mo22722b(1, (int) R.string.ewn, (DialogInterface.OnClickListener) new C5651cv(this)).mo22720b();
            }
            if (!this.f16137t.isShowing()) {
                this.f16137t.show();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo13887f() {
        PkState pkState = (PkState) LinkCrossRoomDataHolder.m13782a().get("data_pk_state");
        if (pkState == PkState.PK) {
            if (!((String) C8946b.f24482l.mo22117a()).equals(C9048ao.m27019b(System.currentTimeMillis()))) {
                C8946b.f24384aI.mo22118a(Integer.valueOf(((Integer) C8946b.f24481k.mo22117a()).intValue()));
                C8946b.f24482l.mo22118a(C9048ao.m27019b(System.currentTimeMillis()));
            } else if (((Integer) C8946b.f24384aI.mo22117a()).intValue() <= 0) {
                C9049ap.m27022a((int) R.string.eu9);
                return;
            }
        }
        if (this.f16133p == null) {
            this.f16133p = new C9249a(this.context, 0).mo22731d((CharSequence) C3358ac.m12515a((int) R.string.eue)).mo22722b(0, (int) R.string.es9, (DialogInterface.OnClickListener) new C5654cy(this, pkState)).mo22722b(1, (int) R.string.ecm, C5655cz.f16730a).mo22720b();
        }
        if (pkState == PkState.PK) {
            TextView textView = this.f16133p.f25360a;
            textView.setGravity(17);
            textView.setVisibility(8);
            String a = C3358ac.m12517a((int) R.string.euf, C8946b.f24384aI.mo22117a(), C8946b.f24480j.mo22117a());
            String[] split = a.split("\n");
            int length = split[split.length - 1].length();
            SpannableString spannableString = new SpannableString(a);
            spannableString.setSpan(new ForegroundColorSpan(this.context.getResources().getColor(R.color.all)), 0, spannableString.length() - length, 17);
            spannableString.setSpan(new ForegroundColorSpan(this.context.getResources().getColor(R.color.afm)), (spannableString.length() - length) - 1, spannableString.length(), 17);
            spannableString.setSpan(new SubscriptSpan(), (spannableString.length() - length) - 1, spannableString.length(), 17);
            spannableString.setSpan(new RelativeSizeSpan(1.1428572f), (spannableString.length() - length) - 1, spannableString.length(), 17);
            this.f16133p.mo22703a((CharSequence) spannableString);
            this.f16133p.f25361b.setLineSpacing(0.0f, 1.1f);
            this.f16133p.f25361b.setGravity(17);
            this.f16133p.f25361b.setVisibility(0);
        } else {
            this.f16133p.f25360a.setGravity(8388611);
            this.f16133p.setTitle((int) R.string.eue);
            this.f16133p.f25360a.setVisibility(0);
            this.f16133p.f25361b.setVisibility(8);
        }
        if (!this.f16133p.isShowing()) {
            this.f16133p.show();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13882a(Long l) throws Exception {
        this.f16130m.setVisibility(8);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.dql) {
            this.f16143z.mo12625b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m17580a(PKProgressBar pKProgressBar) {
        pKProgressBar.setLayerType(1, null);
        pKProgressBar.setIsVigo(false);
    }

    /* renamed from: b */
    private void m17584b(String str) {
        BaseDialogFragment.m12686a((FragmentActivity) this.context, (DialogFragment) C9178j.m27302j().mo22374c().mo11533a(C3979c.m13951a(str).mo11555a(280).mo11560b(384)));
    }

    /* renamed from: a */
    private void m17579a(C3479d<C9380q> dVar) {
        if (this.f16139v) {
            this.f16139v = false;
            long a = (C9023a.m26968a() - this.f16056a.f11674l) / 1000;
            StringBuilder sb = new StringBuilder("onPkInfoUpdated duration:");
            sb.append(this.f16056a.f11672j);
            sb.append(", timePast");
            sb.append(a);
            sb.append(", penaltyDuration");
            sb.append(this.f16056a.f11682t);
            this.f16056a.lambda$put$1$DataCenter("cmd_log_link", sb.toString());
            if (this.f16056a.f11672j > 0 && a < ((long) (this.f16056a.f11672j + this.f16056a.f11682t))) {
                m17587i();
                if (a >= ((long) this.f16056a.f11672j)) {
                    return;
                }
                if (!this.f16056a.f11663E.f11697h || !this.f16056a.f11663E.f11695f) {
                    this.f16123f.setVisibility(8);
                    mo12636a(false);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            switch (key.hashCode()) {
                case -2082923311:
                    if (key.equals("cmd_show_steal_tower_info")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1692693464:
                    if (key.equals("data_pk_current_room_interact_info")) {
                        c = 1;
                        break;
                    }
                    break;
                case 855900630:
                    if (key.equals("cmd_show_gift_task_info")) {
                        c = 3;
                        break;
                    }
                    break;
                case 872172481:
                    if (key.equals("data_link_state")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1505611330:
                    if (key.equals("data_pk_state")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    PkState pkState = (PkState) kVData.getData();
                    if (pkState == PkState.PK) {
                        m17586h();
                    } else if (pkState == PkState.PENAL) {
                        m17588j();
                    } else if (pkState == PkState.FINISHED) {
                        m17589k();
                    }
                    if (PKPenalStickerState.SHOW == this.f16056a.f11662D && pkState != PkState.PENAL) {
                        m17591m();
                        return;
                    }
                case 1:
                    m17579a((C3479d) kVData.getData());
                    return;
                case 2:
                    if (LinkState.UNLOADED.equals((LinkState) kVData.getData()) && this.f16056a.f11672j > 0) {
                        m17591m();
                        return;
                    }
                case 3:
                    m17584b("https://hotsoon.snssdk.com/falcon/live_inroom/page/pk_task_intro/index.html?show_task=true");
                    return;
                case 4:
                    m17584b("https://hotsoon.snssdk.com/falcon/live_inroom/page/pk_task_intro/index.html");
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13884b(Long l) throws Exception {
        this.f16126i.setVisibility(8);
        this.f16128k.setVisibility(8);
        if (this.f16141x == null || this.f16140w == null) {
            float x = (this.f16132o.getX() + ((float) C3358ac.m12510a(-9.0f))) - this.f16129l.getX();
            float y = (((this.f16132o.getY() + ((float) this.f16132o.getHeight())) - ((float) C3358ac.m12510a(5.0f))) - this.f16129l.getY()) - ((float) this.f16129l.getHeight());
            HashMap hashMap = new HashMap();
            hashMap.put("translationX", String.valueOf(x));
            hashMap.put("translationY", String.valueOf(y));
            StringBuilder sb = new StringBuilder("Y: ");
            sb.append(this.f16132o.getY());
            sb.append(", height: ");
            sb.append(this.f16132o.getHeight());
            hashMap.put("layoutContent", sb.toString());
            C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16127j, "scaleX", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f16127j, "scaleY", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f16127j, "translationX", new float[]{0.0f, x});
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f16127j, "translationY", new float[]{0.0f, y});
            this.f16140w = new AnimatorSet();
            this.f16140w.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
            this.f16140w.setDuration(500);
            this.f16140w.start();
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f16129l, "scaleX", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f16129l, "scaleY", new float[]{1.0f, 0.5952381f});
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f16129l, "translationX", new float[]{0.0f, x});
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f16129l, "translationY", new float[]{0.0f, y});
            this.f16141x = new AnimatorSet();
            this.f16141x.playTogether(new Animator[]{ofFloat5, ofFloat6, ofFloat7, ofFloat8});
            this.f16141x.setDuration(500);
            this.f16141x.start();
            return;
        }
        this.f16141x.cancel();
        this.f16140w.cancel();
        this.f16141x.start();
        this.f16140w.start();
    }

    /* renamed from: a */
    public final void mo13880a(Uri uri) {
        this.f16130m.setController(((C13382e) C13380c.m39166a().mo32713b(uri).mo32751c(true)).mo32730f());
        this.f16130m.setVisibility(0);
        this.f16142y = C7492s.m23295b(2000, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5646cq<Object>(this), (C7326g<? super Throwable>) new C5647cr<Object>(this));
    }

    LinkPKWidget(View view, ViewGroup viewGroup) {
        super(view, viewGroup);
        TTLiveSDKContext.getHostService().mo22362c().initImageLib();
    }

    /* renamed from: b */
    static final /* synthetic */ void m17583b(PKProgressBar pKProgressBar, Integer num) {
        if (pKProgressBar.getLeftValue() != num.intValue()) {
            pKProgressBar.setLeftValue(num.intValue());
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m17581a(PKProgressBar pKProgressBar, Integer num) {
        if (pKProgressBar.getRightValue() != num.intValue()) {
            pKProgressBar.setRightValue(num.intValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13883b(DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("selection", "reject");
        PkState pkState = (PkState) LinkCrossRoomDataHolder.m13782a().get("data_pk_state");
        C8435g gVar = new C8435g();
        if (this.f16056a.f11680r == 0) {
            gVar.mo21591a(this.f16056a.f11669g);
        }
        hashMap.put("connection_type", "manual_pk");
        hashMap.put("is_oncemore", "1");
        C8443c.m25663a().mo21606a("connection_invited", hashMap, Room.class, new C8438j().mo21599b("live").mo21603f("other").mo21598a("live_detail"), gVar.mo21594b(this.f16056a.f11667e).mo21596c(this.f16057b.getOwner().getId()).mo21590a(((Integer) C8946b.f24390aO.mo22117a()).intValue()));
        if (pkState == PkState.PK) {
            C9049ap.m27022a((int) R.string.evl);
        }
        this.f16143z.mo12632d();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo13885c(DialogInterface dialogInterface, int i) {
        if (((PkState) LinkCrossRoomDataHolder.m13782a().get("data_pk_state")) == PkState.PK) {
            C9049ap.m27022a((int) R.string.evl);
            return;
        }
        LinkCrossRoomDataHolder.m13782a().f11684v = true;
        HashMap hashMap = new HashMap();
        hashMap.put("selection", "accept");
        hashMap.put("connection_type", "manual_pk");
        hashMap.put("is_oncemore", "1");
        C8435g gVar = new C8435g();
        if (this.f16056a.f11680r == 0) {
            gVar.mo21591a(this.f16056a.f11669g);
        }
        C8443c.m25663a().mo21606a("connection_invited", hashMap, Room.class, new C8438j().mo21599b("live").mo21603f("other").mo21598a("live_detail"), gVar.mo21594b(this.f16056a.f11667e).mo21596c(this.f16057b.getOwner().getId()).mo21590a(((Integer) C8946b.f24390aO.mo22117a()).intValue()));
        this.f16143z.mo12633e();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13881a(PkState pkState, DialogInterface dialogInterface, int i) {
        if (isViewValid()) {
            if (pkState == PkState.PK) {
                C8947c<Integer> cVar = C8946b.f24384aI;
                cVar.mo22118a(Integer.valueOf(((Integer) cVar.mo22117a()).intValue() - 1));
                C8946b.f24482l.mo22118a(C9048ao.m27019b(System.currentTimeMillis()));
                if (this.f16143z != null) {
                    this.f16143z.mo12623a(true);
                }
            } else {
                if (this.f16058c && pkState == PkState.PENAL) {
                    C8435g gVar = new C8435g();
                    if (LinkCrossRoomDataHolder.m13782a().f11680r == 0) {
                        gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
                    }
                    C8443c.m25663a().mo21607a("punish_end", gVar.mo21597c("disconnect").mo21593a(String.valueOf((System.currentTimeMillis() - this.f16056a.f11688z) / 1000)), this.f16056a.mo11449b(), Room.class);
                }
                this.f16056a.lambda$put$1$DataCenter("data_pk_result", PkResult.RIGHT_WON).lambda$put$1$DataCenter("cmd_stop_interact", Boolean.valueOf(false));
            }
            dialogInterface.dismiss();
        }
    }
}
