package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.p022v4.app.C0608j;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.C2624k.C2629a;
import com.bytedance.android.live.broadcast.effect.LiveBeautyDialogFragment;
import com.bytedance.android.live.broadcast.effect.LiveBeautyFragment.C2576a;
import com.bytedance.android.live.broadcast.effect.LiveFilterDialogFragment;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyDialogFragment;
import com.bytedance.android.live.broadcast.game.SelectGameDialogFragment;
import com.bytedance.android.live.broadcast.game.SelectGameDialogFragment.C2735c;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.event.C4454x;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p368g.p370b.C7853a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9349d;
import com.bytedance.android.livesdkapi.depend.p442e.C9312a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.ies.p534b.C10296b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.widget.v */
public final class C3135v implements OnClickListener, C2629a {

    /* renamed from: a */
    public C9349d f9672a;

    /* renamed from: b */
    private View f9673b;

    /* renamed from: c */
    private View f9674c;

    /* renamed from: d */
    private View f9675d;

    /* renamed from: e */
    private ImageView f9676e;

    /* renamed from: f */
    private TextView f9677f;

    /* renamed from: g */
    private TextView f9678g;

    /* renamed from: h */
    private ImageView f9679h;

    /* renamed from: i */
    private View f9680i;

    /* renamed from: j */
    private CheckedTextView f9681j;

    /* renamed from: k */
    private LiveDialogFragment f9682k;

    /* renamed from: l */
    private View f9683l;

    /* renamed from: m */
    private BaseFragment f9684m;

    /* renamed from: n */
    private C10296b f9685n;

    /* renamed from: o */
    private Game f9686o;

    /* renamed from: p */
    private LiveMode f9687p;

    /* renamed from: q */
    private TextView f9688q;

    /* renamed from: r */
    private C2585a f9689r;

    /* renamed from: s */
    private boolean f9690s;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9967b() {
        C3517a.m12960a((Context) this.f9684m.getActivity(), (int) R.string.f3k);
    }

    /* renamed from: e */
    private void m11880e() {
        if (C2624k.m10736a().mo9270c()) {
            this.f9674c.setVisibility(0);
        } else {
            this.f9674c.setVisibility(8);
        }
    }

    /* renamed from: f */
    private void m11881f() {
        Boolean valueOf = Boolean.valueOf(!((Boolean) this.f9673b.getTag(R.id.dp7)).booleanValue());
        this.f9673b.setTag(R.id.dp7, valueOf);
        m11882g();
        this.f9685n.mo25021a("hotsoon.pref.LAST_SET_LANDSCAPE", (Object) valueOf).mo25023a();
    }

    /* renamed from: h */
    private void m11883h() {
        SelectGameDialogFragment a = SelectGameDialogFragment.m11009a(this.f9686o);
        a.mo9428a((C2735c) new C3084ac(this, a));
        a.f8672a = new C3085ad(this);
        a.show(this.f9684m.getChildFragmentManager(), SelectGameDialogFragment.class.getSimpleName());
        m11874a(8);
    }

    /* renamed from: j */
    private boolean m11885j() {
        IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
        if (!C9290a.f25466a && a != null && a.isEnableShowCommerceSale()) {
            if (this.f9687p == LiveMode.VIDEO) {
                return true;
            }
            LiveMode liveMode = this.f9687p;
            LiveMode liveMode2 = LiveMode.THIRD_PARTY;
        }
        return false;
    }

    /* renamed from: c */
    private void m11878c() {
        if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo10240a()).booleanValue()) {
            if (this.f9682k == null) {
                this.f9682k = LiveBeautyDialogFragment.m10555a(new C2576a() {
                    /* renamed from: a */
                    public final void mo9187a(float f) {
                        if (C3135v.this.f9672a != null) {
                            C3135v.this.f9672a.mo9582a(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * f);
                        }
                    }

                    /* renamed from: b */
                    public final void mo9188b(float f) {
                        if (C3135v.this.f9672a != null) {
                            C3135v.this.f9672a.mo9586b(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21218b.f21222a * f);
                        }
                    }

                    /* renamed from: c */
                    public final void mo9189c(float f) {
                        if (C3135v.this.f9672a != null) {
                            C3135v.this.f9672a.mo9588c(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21219c.f21222a * f);
                        }
                    }

                    /* renamed from: d */
                    public final void mo9190d(float f) {
                        if (C3135v.this.f9672a != null) {
                            C3135v.this.f9672a.mo9589d(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21220d.f21222a * f);
                        }
                    }
                }, this.f9689r, true, 0, false);
                ((LiveBeautyDialogFragment) this.f9682k).f8243a = new C3082aa(this);
            }
            this.f9682k.show(this.f9684m.getChildFragmentManager(), "beauty_filter_dialog_tag");
        } else if (!C3091aj.m11784a(C3358ac.m12528e())) {
            C9049ap.m27022a((int) R.string.fcw);
            return;
        } else if (this.f9684m != null) {
            this.f9682k = C2515f.m10417f().mo9075b().mo9213a(this.f9684m.getActivity(), Boolean.valueOf(false));
            ((LiveSmallItemBeautyDialogFragment) this.f9682k).mo9224a((OnDismissListener) new C3137w(this));
        }
        m11874a(8);
    }

    /* renamed from: d */
    private void m11879d() {
        LiveFilterDialogFragment liveFilterDialogFragment;
        if (this.f9684m.isAdded() && this.f9684m.getChildFragmentManager().mo2644a("filter_dialog_tag") == null) {
            String str = "";
            if (this.f9672a != null) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                liveFilterDialogFragment = LiveFilterDialogFragment.m10592a(this.f9689r, str, true, true);
            } else {
                liveFilterDialogFragment = LiveFilterDialogFragment.m10593a(this.f9689r, C2624k.m10736a().f8419b, true);
            }
            liveFilterDialogFragment.f8275a = new C3083ab(this);
            liveFilterDialogFragment.show(this.f9684m.getChildFragmentManager(), "filter_dialog_tag");
            m11874a(8);
        }
    }

    /* renamed from: g */
    private void m11882g() {
        Boolean bool = (Boolean) this.f9673b.getTag(R.id.dp7);
        if (bool == null) {
            bool = Boolean.valueOf(this.f9685n.mo25024a("hotsoon.pref.LAST_SET_LANDSCAPE", true));
            this.f9673b.setTag(R.id.dp7, bool);
        }
        if (!bool.booleanValue()) {
            this.f9676e.setImageResource(R.drawable.cb0);
            this.f9677f.setText(R.string.f49);
            return;
        }
        this.f9676e.setImageResource(R.drawable.caz);
        this.f9677f.setText(R.string.f46);
    }

    /* renamed from: a */
    public final void mo9961a() {
        if (this.f9675d != null) {
            IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
            if (m11885j()) {
                this.f9675d.setVisibility(0);
                ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).liveCommerceService().mo10500b(Long.valueOf(a.getId())).mo19280a((C7326g<? super T>) new C3138x<Object>(this), (C7326g<? super Throwable>) new C3139y<Object>(this));
                return;
            }
            this.f9675d.setVisibility(8);
        }
    }

    /* renamed from: i */
    private void m11884i() {
        IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
        if (a != null) {
            C9312a aVar = new C9312a("has_show_commodity_dialog", Boolean.valueOf(false));
            if (((Boolean) aVar.mo22117a()).booleanValue()) {
                ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).liveCommerceService().mo10499a(Long.valueOf(a.getId())).mo19280a((C7326g<? super T>) new C3086ae<Object>(this), (C7326g<? super Throwable>) new C3087af<Object>(this));
            } else {
                new C3534a(this.f9684m.getActivity()).mo10648a((int) R.string.f3t).mo10658b((int) R.string.f3s).mo10649a((int) R.string.f3r, (DialogInterface.OnClickListener) new C3088ag(this, aVar)).mo10659b((int) R.string.f3q, C3089ah.f9562a).mo10656a(false).mo10657a().show();
            }
        }
    }

    public final void onEvent(C4454x xVar) {
        mo9961a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9962a(DialogInterface dialogInterface) {
        m11874a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9968b(DialogInterface dialogInterface) {
        m11874a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo9971c(DialogInterface dialogInterface) {
        m11874a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo9972d(DialogInterface dialogInterface) {
        m11874a(0);
    }

    /* renamed from: a */
    private void m11874a(int i) {
        this.f9683l.setVisibility(i);
        this.f9688q.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9970b(Throwable th) throws Exception {
        C9076n.m27095a(this.f9684m.getActivity(), th);
    }

    /* renamed from: a */
    private void m11876a(Game game) {
        if (game == null) {
            this.f9680i.setVisibility(0);
            this.f9679h.setVisibility(8);
            this.f9678g.setText(R.string.f44);
            return;
        }
        this.f9680i.setVisibility(8);
        this.f9679h.setVisibility(0);
        C5343e.m17030a(this.f9679h, game.icon);
        this.f9678g.setText(game.name);
    }

    /* renamed from: b */
    private void m11877b(boolean z) {
        if (z) {
            m11880e();
            if (this.f9672a != null && ((Integer) C8946b.f24361M.mo22117a()).intValue() > 0) {
                this.f9672a.mo9587b(((Integer) C8946b.f24361M.mo22117a()).intValue());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9969b(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            BaseDialogFragment a = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).liveCommerceService().mo10498a(this.f9684m.getActivity(), null);
            a.getLifecycle().mo55a(new StartLiveSetController$5(this, a));
            a.show((C0608j) this.f9684m.mFragmentManager, "LIVE_SHOP_EDIT");
            return;
        }
        C3517a.m12960a((Context) this.f9684m.getActivity(), (int) R.string.f3l);
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.d3m) {
            C8443c.m25663a().mo21607a("live_take_beauty_click", new C8438j().mo21599b("live_take").mo21598a("live_take_page").mo21603f("click"));
            m11878c();
        } else if (id == R.id.d3q) {
            C8443c.m25663a().mo21607a("live_take_filter_click", new C8438j().mo21599b("live_take").mo21598a("live_take_page").mo21603f("click"));
            m11879d();
        } else if (id == R.id.d3w) {
            m11881f();
        } else if (id == R.id.d3r) {
            m11883h();
        } else {
            if (id == R.id.d3n) {
                m11884i();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9965a(Boolean bool) throws Exception {
        this.f9681j.setChecked(bool.booleanValue());
        if (bool.booleanValue() && !this.f9690s) {
            this.f9690s = true;
            this.f9681j.postDelayed(new C3140z(this), 300);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9966a(Throwable th) throws Exception {
        C9076n.m27095a(this.f9684m.getActivity(), th);
    }

    /* renamed from: a */
    public final void mo9249a(boolean z) {
        m11877b(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9963a(SelectGameDialogFragment selectGameDialogFragment, Game game) {
        this.f9686o = game;
        m11876a(game);
        selectGameDialogFragment.dismiss();
        if (game == null) {
            this.f9685n.mo25021a("hotsoon.pref.LAST_SET_GAME", (Object) "").mo25023a();
        } else {
            this.f9685n.mo25021a("hotsoon.pref.LAST_SET_GAME", (Object) game.toJsonString()).mo25023a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9964a(C9312a aVar, DialogInterface dialogInterface, int i) {
        aVar.mo22118a(Boolean.valueOf(true));
        m11884i();
    }
}
