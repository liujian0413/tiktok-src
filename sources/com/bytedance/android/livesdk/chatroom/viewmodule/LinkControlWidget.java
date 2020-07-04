package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.PkState;
import com.bytedance.android.livesdk.chatroom.event.C4448r;
import com.bytedance.android.livesdk.chatroom.event.C4449s;
import com.bytedance.android.livesdk.chatroom.interact.C4811i;
import com.bytedance.android.livesdk.chatroom.interact.C4812j;
import com.bytedance.android.livesdk.chatroom.interact.LinkDialog;
import com.bytedance.android.livesdk.chatroom.interact.LinkDialog.C4459a;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomPkWidget;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoAnchorWidget;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoGuestWidget;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.model.ChiJiPermissionData;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.p214b.C4492a;
import com.bytedance.android.livesdk.chatroom.interact.p214b.C4499h.C4500a;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4563bh;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4563bh.C4564a;
import com.bytedance.android.livesdk.chatroom.utils.C5340c;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8681n;
import com.bytedance.android.livesdk.p203c.C4228a;
import com.bytedance.android.livesdk.p417q.C8784a;
import com.bytedance.android.livesdk.p417q.C8791d;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9036ae;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.Widget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class LinkControlWidget extends LiveWidget implements C0053p<KVData>, C4228a, C4564a {

    /* renamed from: a */
    public LinkInRoomVideoAnchorWidget f15992a;

    /* renamed from: b */
    public LinkInRoomVideoGuestWidget f15993b;

    /* renamed from: c */
    public LinkCrossRoomWidget f15994c;

    /* renamed from: d */
    public LinkInRoomAudioWidget f15995d;

    /* renamed from: e */
    public C4563bh f15996e;

    /* renamed from: f */
    public Room f15997f;

    /* renamed from: g */
    public LiveMode f15998g;

    /* renamed from: h */
    public boolean f15999h;

    /* renamed from: i */
    public int f16000i;

    /* renamed from: j */
    public LinkDialog f16001j;

    /* renamed from: k */
    public LinkAutoMatchModel f16002k;

    /* renamed from: l */
    public C7321c f16003l;

    /* renamed from: m */
    public C5438c f16004m = new C5438c();

    /* renamed from: n */
    public boolean f16005n;

    /* renamed from: o */
    public long f16006o;

    /* renamed from: p */
    private TextView f16007p;

    /* renamed from: q */
    private LinkInRoomPkWidget f16008q;

    /* renamed from: r */
    private C5436a f16009r;

    /* renamed from: s */
    private C5437b f16010s = new C5437b();

    /* renamed from: t */
    private Dialog f16011t;

    /* renamed from: u */
    private long f16012u;

    /* renamed from: v */
    private C8681n f16013v;

    /* renamed from: w */
    private C4500a f16014w = new C4500a() {
        /* renamed from: a */
        public final boolean mo12269a(ApiServerException apiServerException) {
            return false;
        }

        /* renamed from: a */
        public final boolean mo12268a() {
            LinkControlWidget.this.f16004m.mo13818a();
            return false;
        }

        /* renamed from: c */
        public final boolean mo12273c() {
            LinkControlWidget.this.f16002k = null;
            LinkControlWidget.this.f16004m.mo13820b();
            return false;
        }

        /* renamed from: b */
        public final boolean mo12271b() {
            if (LinkControlWidget.this.f16001j != null && LinkControlWidget.this.f16001j.f11448j) {
                LinkControlWidget.this.f16004m.mo13820b();
            } else if (((Boolean) C8946b.f24394aS.mo22117a()).booleanValue()) {
                LinkControlWidget.this.f16003l = ((C3245ad) C7492s.m23295b(3, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) LinkControlWidget.this.autoDispose())).mo10183a(new C7326g<Long>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Long l) throws Exception {
                        C4492a.m15023a().mo12259a(LinkControlWidget.this.f15997f.getId());
                    }
                }, new C7326g<Throwable>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Throwable th) throws Exception {
                        LinkControlWidget.this.mo9118a(th);
                    }
                });
            } else {
                LinkControlWidget.this.f16001j = LinkDialog.m14832a(LinkControlWidget.this.dataCenter, (C0043i) LinkControlWidget.this).mo12161b(LinkControlWidget.this.f16002k);
                LinkControlWidget.this.f16001j.show(((FragmentActivity) LinkControlWidget.this.context).getSupportFragmentManager(), "LinkDialog");
                LinkControlWidget.this.f16004m.mo13820b();
            }
            LinkControlWidget.this.f16002k = null;
            return false;
        }

        /* renamed from: a */
        public final boolean mo12270a(LinkAutoMatchModel linkAutoMatchModel) {
            LinkControlWidget.this.f16002k = linkAutoMatchModel;
            return false;
        }

        /* renamed from: b */
        public final boolean mo12272b(LinkAutoMatchModel linkAutoMatchModel) {
            LinkControlWidget.this.f16002k = null;
            LinkControlWidget.this.f16004m.mo13820b();
            if (LinkControlWidget.this.f16001j != null && LinkControlWidget.this.f16001j.f11448j) {
                return false;
            }
            LinkControlWidget.this.f16001j = LinkDialog.m14832a(LinkControlWidget.this.dataCenter, (C0043i) LinkControlWidget.this).mo12157a(linkAutoMatchModel);
            LinkControlWidget.this.f16001j.show(((FragmentActivity) LinkControlWidget.this.context).getSupportFragmentManager(), "LinkDialog");
            return false;
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$a */
    public interface C5436a {
        /* renamed from: a */
        Widget mo13401a(int i);

        /* renamed from: a */
        void mo13402a(Widget widget);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$b */
    class C5437b implements C5739a {

        /* renamed from: a */
        public boolean f16018a;

        /* renamed from: b */
        public boolean f16019b;

        /* renamed from: d */
        private View f16021d;

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5437b() {
        }

        /* renamed from: a */
        public final void mo13815a(boolean z) {
            this.f16018a = z;
            if (z) {
                mo13814a(0);
            }
        }

        /* renamed from: b */
        public final void mo13816b(int i) {
            if (this.f16021d != null) {
                this.f16021d.setBackgroundResource(i);
            }
        }

        /* renamed from: a */
        public final void mo13814a(int i) {
            if (this.f16021d != null) {
                if (i == 0) {
                    if (C5340c.m17018a(LinkControlWidget.this.context)) {
                        if (LinkControlWidget.this.f15999h) {
                            C4811i.m15842b();
                        } else {
                            C4811i.m15841a("connection_button");
                        }
                    } else {
                        return;
                    }
                }
                this.f16021d.setVisibility(i);
            }
        }

        public final void onClick(View view) {
            if (LinkControlWidget.this.f15999h) {
                C4811i.m15844c();
            } else {
                C4811i.m15843b("connection_button");
            }
            PkState pkState = (PkState) LinkCrossRoomDataHolder.m13782a().get("data_pk_state");
            if (VERSION.SDK_INT < 17) {
                C9049ap.m27022a((int) R.string.ex5);
            } else if (!C9290a.f25466a && LinkControlWidget.this.f15998g == LiveMode.VIDEO && !((Boolean) C5864b.f17257L.mo10240a()).booleanValue()) {
                C9049ap.m27028a(LinkControlWidget.this.context.getString(R.string.evb));
            } else if (LinkControlWidget.this.f15997f != null && LinkControlWidget.this.f15997f.getMosaicStatus() == 1) {
                C9049ap.m27022a((int) R.string.ezh);
            } else if (LinkControlWidget.this.f16000i == 1) {
                if (LinkControlWidget.this.f15999h) {
                    LinkControlWidget.this.f15992a.mo12176d();
                } else {
                    LinkControlWidget.this.f15993b.mo12191a();
                }
                C9036ae.m26994a(LinkControlWidget.this.f15997f, "click_connection_button", "anchor_connection", true);
            } else if (LinkControlWidget.this.f16000i == 4) {
                C9049ap.m27022a((int) R.string.euc);
            } else {
                if (LinkControlWidget.this.f16000i == 2) {
                    if (pkState != PkState.DISABLED) {
                        C9049ap.m27022a((int) R.string.eub);
                    } else if (LinkControlWidget.this.f15994c != null) {
                        LinkControlWidget.this.f15994c.mo13839i();
                    }
                } else if (LinkControlWidget.this.f15998g == LiveMode.AUDIO) {
                    if (LinkControlWidget.this.f16000i == 0) {
                        LinkControlWidget.this.mo13812i();
                    } else {
                        LinkControlWidget.this.f15995d.mo13854j();
                    }
                } else if (LinkControlWidget.this.f16000i == 0 && C4492a.m15023a().mo12267c()) {
                    new C9249a(LinkControlWidget.this.context).mo22731d((CharSequence) LinkControlWidget.this.context.getString(R.string.euh)).mo22722b(0, (int) R.string.f96, C5601az.f16666a).mo22722b(1, (int) R.string.ecm, C5603ba.f16668a).mo22729d();
                } else if (LinkControlWidget.this.f16001j == null || !LinkControlWidget.this.f16001j.isVisible()) {
                    if (!this.f16019b || this.f16018a) {
                        LinkControlWidget.this.mo13813j();
                    } else {
                        LinkControlWidget.this.f16005n = false;
                        LinkControlWidget.this.f15996e.mo12412b(0);
                        HashMap hashMap = new HashMap();
                        hashMap.put("connection_type", "anchor");
                        C8443c.m25663a().mo21606a("connection_click", hashMap, new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("click"), Room.class);
                    }
                }
            }
        }

        /* renamed from: b */
        static final /* synthetic */ void m17437b(DialogInterface dialogInterface, int i) {
            C4492a.m15023a().mo12265b();
            dialogInterface.dismiss();
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            this.f16021d = view;
            if (LinkControlWidget.this.f15998g != LiveMode.VIDEO || !LinkControlWidget.this.f15999h) {
                this.f16019b = true;
                this.f16018a = true;
                return;
            }
            this.f16021d.setVisibility(8);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget$c */
    class C5438c implements C5739a {

        /* renamed from: b */
        private final int f16023b;

        /* renamed from: c */
        private C8784a f16024c;

        /* renamed from: d */
        private View f16025d;

        /* renamed from: e */
        private View f16026e;

        /* renamed from: f */
        private Animation f16027f;

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: a */
        public final void mo13818a() {
            this.f16026e.setVisibility(0);
            this.f16026e.startAnimation(this.f16027f);
        }

        /* renamed from: b */
        public final void mo13820b() {
            this.f16026e.setVisibility(8);
            this.f16026e.clearAnimation();
        }

        /* renamed from: c */
        public final void mo13821c() {
            if (this.f16025d != null) {
                this.f16025d.setVisibility(0);
            }
        }

        /* renamed from: e */
        public final void mo13823e() {
            if (this.f16024c != null && this.f16024c.mo21856c()) {
                this.f16024c.dismiss();
            }
        }

        /* renamed from: d */
        public final void mo13822d() {
            if (((Boolean) C8946b.f24483m.mo22117a()).booleanValue() && LinkControlWidget.this.f15999h) {
                C8946b.f24483m.mo22118a(Boolean.valueOf(false));
                mo13823e();
                this.f16024c = ((C8791d) ((C8791d) ((C8791d) C8791d.m26348b(LinkControlWidget.this.getContext()).mo21843a((int) R.layout.ay9)).mo21852b(C3358ac.m12510a(160.0f))).mo21855c(true)).mo21842a();
                this.f16024c.mo21849a(this.f16025d, 1, 0, C3358ac.m12510a(1.0f), C3358ac.m12510a(-4.0f));
            }
        }

        private C5438c() {
            this.f16023b = 1;
        }

        /* renamed from: a */
        public final void mo13819a(int i) {
            if (this.f16025d != null) {
                this.f16025d.setBackgroundResource(i);
            }
        }

        public final void onClick(View view) {
            PkState pkState = (PkState) LinkCrossRoomDataHolder.m13782a().get("data_pk_state");
            HashMap hashMap = new HashMap();
            hashMap.put("current_mode", String.valueOf(LinkControlWidget.this.f16000i));
            if (pkState != null) {
                hashMap.put("pk_state", pkState.toString());
            }
            C8444d.m25673b().mo9999a("ttlive_pk", (Map<String, ?>) hashMap);
            if (VERSION.SDK_INT < 17) {
                C9049ap.m27022a((int) R.string.ex5);
            } else if (!((Boolean) C5864b.f17257L.mo10240a()).booleanValue()) {
                C9049ap.m27028a(LinkControlWidget.this.context.getString(R.string.evb));
            } else if (LinkControlWidget.this.f15997f != null && LinkControlWidget.this.f15997f.getMosaicStatus() == 1) {
                C9049ap.m27022a((int) R.string.ezh);
            } else if (LinkControlWidget.this.f16000i == 0) {
                if (C4492a.m15023a().mo12267c() || (LinkControlWidget.this.f16003l != null && !LinkControlWidget.this.f16003l.isDisposed())) {
                    LinkControlWidget.this.f16001j = LinkDialog.m14832a(LinkControlWidget.this.dataCenter, (C0043i) LinkControlWidget.this).mo12157a(LinkControlWidget.this.f16002k);
                    LinkControlWidget.this.f16001j.show(((FragmentActivity) LinkControlWidget.this.context).getSupportFragmentManager(), "LinkDialog");
                } else {
                    LinkControlWidget.this.f16005n = true;
                    LinkControlWidget.this.f15996e.mo12412b(1);
                }
                C8443c.m25663a().mo21607a("pk_icon_click", LinkControlWidget.this.f15997f);
            } else {
                if (LinkControlWidget.this.f16000i != 2 || pkState == PkState.DISABLED) {
                    int i = LinkControlWidget.this.f16000i;
                    C9049ap.m27022a((int) R.string.euc);
                } else if (LinkControlWidget.this.f15994c != null) {
                    LinkControlWidget.this.f15994c.mo13839i();
                }
            }
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
            mo13820b();
            mo13823e();
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            this.f16025d = view;
            this.f16026e = this.f16025d.findViewById(R.id.bb1);
            this.f16027f = AnimationUtils.loadAnimation(LinkControlWidget.this.context, R.anim.d4);
            this.f16027f.setInterpolator(new LinearInterpolator());
            ((Boolean) C8946b.f24349A.mo22117a()).booleanValue();
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

    public int getLayoutId() {
        return R.layout.awu;
    }

    /* renamed from: a */
    public final void mo13809a(String str) {
        if (!this.f15999h) {
            if (this.f16000i == 1) {
                if (this.f15993b != null) {
                    this.f15993b.mo12197a(str);
                }
            } else if (this.f16000i == 2) {
                if (this.f15994c != null) {
                    this.f15994c.mo13836b(str);
                }
            } else if (this.f16000i == 3) {
                this.f15995d.mo13845a(str);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo11784a(Runnable runnable, boolean z) {
        if (!this.f15999h && this.f15993b != null) {
            return this.f15993b.mo12201a(runnable, z);
        }
        if (this.f15999h || this.f15995d == null) {
            return false;
        }
        return this.f15995d.mo13847a(runnable, z);
    }

    /* renamed from: a */
    public final void mo12429a(ChiJiPermissionData chiJiPermissionData, ApiServerException apiServerException) {
        if (isViewValid()) {
            if ((this.f16001j == null || !this.f16001j.isVisible()) && m17404o()) {
                boolean z = true;
                if (!this.f16010s.f16019b || this.f16010s.f16018a) {
                    if (((Boolean) C8946b.f24395aT.mo22117a()).booleanValue()) {
                        LinkCrossRoomDataHolder.m13782a().f11680r = 1;
                        this.f16001j = LinkDialog.m14832a(this.dataCenter, (C0043i) this).mo12156a();
                        this.f16001j.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                    }
                } else if (!this.f16005n) {
                    C4459a a = LinkDialog.m14832a(this.dataCenter, (C0043i) this);
                    if (!this.f16010s.f16019b || this.f16010s.f16018a) {
                        z = false;
                    }
                    this.f16001j = a.mo12160a(z);
                    this.f16001j.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
                }
                this.f16001j = LinkDialog.m14832a(this.dataCenter, (C0043i) this).mo12158a(chiJiPermissionData, apiServerException);
                this.f16001j.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
            }
        }
    }

    /* renamed from: d */
    public final void mo12435d() {
        m17397b(0);
    }

    /* renamed from: o */
    private static boolean m17404o() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        C9049ap.m27022a((int) R.string.ex5);
        return false;
    }

    /* renamed from: h */
    public final void mo12438h() {
        if (this.f15994c != null && this.f15999h) {
            this.f15994c.mo13838h();
        }
    }

    /* renamed from: m */
    private void m17402m() {
        try {
            if (this.f16001j != null && this.f16001j.isVisible()) {
                this.f16001j.dismiss();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo12431b() {
        C3912d.m13795a().mo11452a(Boolean.valueOf(false));
        m17397b(0);
        if (!this.f15999h) {
            this.f16010s.mo13814a(8);
        }
    }

    /* renamed from: c */
    public final void mo12433c() {
        if (this.f16001j != null && this.f16001j.isVisible()) {
            this.f16001j.dismiss();
        }
        m17397b(2);
    }

    /* renamed from: f */
    public final void mo12436f() {
        if (!isViewValid() || this.f16000i == 2) {
            return;
        }
        if (this.f16000i != 1 || !this.f15999h) {
            m17397b(0);
        }
    }

    /* renamed from: l */
    private void m17401l() {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "room_type";
        if (this.f15997f.getStreamType() == LiveMode.AUDIO) {
            str = "radio";
        } else {
            str = "video";
        }
        hashMap.put(str2, str);
        C8443c.m25663a().mo21606a("anchor_audience_connection_open_success", hashMap, Room.class);
    }

    /* renamed from: n */
    private void m17403n() {
        if (isViewValid() && this.f15999h && LinkCrossRoomDataHolder.m13782a().f11680r == 1 && ((Boolean) C8946b.f24394aS.mo22117a()).booleanValue()) {
            this.f16001j = LinkDialog.m14832a(this.dataCenter, (C0043i) this).mo12157a((LinkAutoMatchModel) null);
            this.f16001j.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
        }
    }

    /* renamed from: a */
    public final void mo12426a() {
        C3912d.m13795a().mo11452a(Boolean.valueOf(true));
        if (this.f15997f.isLiveTypeAudio()) {
            m17397b(3);
        } else {
            m17397b(1);
        }
    }

    /* renamed from: g */
    public final void mo12437g() {
        if (isViewValid()) {
            m17402m();
            if (LinkCrossRoomDataHolder.m13782a().f11680r == 1) {
                C9049ap.m27023a((int) R.string.eo5, 1);
                m17403n();
                return;
            }
            C9049ap.m27023a((int) R.string.eud, 1);
        }
    }

    /* renamed from: i */
    public final void mo13812i() {
        m17400k();
        new C9249a(this.context).mo22716a(false).mo22710a((int) R.string.eoy).mo22727c((CharSequence) this.context.getString(R.string.f16)).mo22722b(0, (int) R.string.edq, (OnClickListener) new C5597av(this)).mo22722b(1, (int) R.string.ecm, C5598aw.f16663a).mo22729d();
    }

    public void onDestroy() {
        this.dataCenter.removeObserver(this);
        if (LinkCrossRoomDataHolder.m13782a() != LinkCrossRoomDataHolder.f11658a) {
            LinkCrossRoomDataHolder.m13782a().removeObserver(this);
        }
        this.f16009r = null;
        this.f15996e.mo8963a();
        m17402m();
        C4492a.m15023a().mo12266b(this.f16014w);
        C4492a.m15023a().mo12265b();
        super.onDestroy();
    }

    /* renamed from: k */
    private void m17400k() {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "room_type";
        if (this.f15997f.getStreamType() == LiveMode.AUDIO) {
            str = "radio";
        } else {
            str = "video";
        }
        hashMap.put(str2, str);
        C8443c.m25663a().mo21606a("anchor_audience_connection_open", hashMap, new C8438j().mo21598a("live_detail").mo21599b("live").mo21603f("click"), Room.class);
    }

    /* renamed from: j */
    public final void mo13813j() {
        if (this.f16011t != null) {
            C5604bb.m18014a(this.f16011t);
        }
        if (this.f16001j != null) {
            this.f16001j.dismiss();
        }
        C9036ae.m26994a(this.f15997f, "click_connection_button", "anchor_connection", true);
        C9249a aVar = new C9249a(this.context);
        aVar.mo22710a((int) R.string.cvk);
        aVar.mo22718b((int) R.string.cvj);
        aVar.mo22716a(false).mo22722b(0, (int) R.string.cvi, (OnClickListener) new C5599ax(this)).mo22722b(1, (int) R.string.ecm, C5600ay.f16665a);
        C9245h b = aVar.mo22720b();
        this.f16011t = b;
        b.show();
    }

    public void onCreate() {
        super.onCreate();
        this.f15997f = (Room) this.dataCenter.get("data_room");
        this.f15999h = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f15998g = (LiveMode) this.dataCenter.get("data_live_mode");
        C5738d a = C5747j.m18103a();
        a.mo14165a(ToolbarButton.INTERACTION, (C5739a) this.f16010s);
        a.mo14165a(ToolbarButton.PK, (C5739a) this.f16004m);
        this.f16007p = (TextView) this.contentView.findViewById(R.id.b2_);
        if (!this.f15999h) {
            this.f16010s.mo13814a(8);
        }
        this.f15996e = new C4563bh(this.f15997f, this.f15999h, this.f15998g);
        this.f15996e.mo9142a((C4564a) this);
        C4492a.m15023a().mo12262a(this.f16014w);
        this.dataCenter.observeForever("data_keyboard_status", this).observeForever("cmd_pk_state_change", this).observeForever("data_interact_debug_info", this).observeForever("cmd_inroompk_state_change", this).observe("cmd_audience_turn_on_link", this).observe("data_pk_chiji_stage", this);
        if (LinkCrossRoomDataHolder.m13782a() != LinkCrossRoomDataHolder.f11658a) {
            LinkCrossRoomDataHolder.m13782a().observe("data_pk_state", this);
        }
        C5340c.m17019b(this.context);
    }

    /* renamed from: a */
    public final void mo12430a(boolean z) {
        this.f16010s.mo13815a(z);
    }

    /* renamed from: b */
    public final void mo12432b(Throwable th) {
        C9076n.m27096a(this.context, th, (int) R.string.exd);
    }

    public LinkControlWidget(C5436a aVar) {
        this.f16009r = aVar;
    }

    /* renamed from: a */
    private void m17394a(C4448r rVar) {
        if (rVar.f12904a == 4) {
            m17397b(2);
        } else if (rVar.f12904a == 5) {
            this.f16004m.mo13822d();
        } else {
            if (rVar.f12904a == 1) {
                this.f16004m.mo13823e();
            }
        }
    }

    /* renamed from: c */
    private static int m17398c(int i) {
        switch (i) {
            case 2:
                if (LinkCrossRoomDataHolder.m13782a().f11680r == 1) {
                    return R.string.eo5;
                }
                return R.string.eo4;
            case 3:
                return R.string.eo3;
            case 4:
                return R.string.eo2;
            case 5:
                return R.string.eo4;
            case 6:
                return R.string.eo1;
            case 7:
                return R.string.eo6;
            default:
                return R.string.eo0;
        }
    }

    /* renamed from: a */
    private void m17393a(PkState pkState) {
        if (this.f15999h) {
            this.f16010s.mo13814a(0);
            this.f16004m.mo13821c();
            if (!LinkCrossRoomDataHolder.m13782a().f11664b) {
                this.f16010s.mo13816b(R.drawable.cga);
                this.f16004m.mo13819a((int) R.drawable.cgd);
            } else if (pkState != PkState.DISABLED) {
                this.f16010s.mo13816b(R.drawable.cga);
                this.f16004m.mo13819a((int) R.drawable.c7b);
            } else {
                this.f16010s.mo13816b(R.drawable.c77);
                this.f16004m.mo13819a((int) R.drawable.cgd);
            }
        }
    }

    /* renamed from: c */
    public final void mo12434c(Throwable th) {
        if (isViewValid()) {
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                int errorCode = apiServerException.getErrorCode();
                if (errorCode == 32001 || errorCode == 32002 || errorCode == 32003) {
                    mo12429a((ChiJiPermissionData) null, apiServerException);
                    return;
                }
            }
            C9076n.m27095a(this.context, th);
        }
    }

    /* renamed from: a */
    private void m17395a(C4449s sVar) {
        int i;
        if (TTLiveSDKContext.getHostService().mo22360a().getChannel().equals("local_test")) {
            TextView textView = this.f16007p;
            if (sVar.f12907a) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            TextView textView2 = this.f16007p;
            StringBuilder sb = new StringBuilder();
            sb.append(sVar.f12908b);
            sb.append("  channel_id:");
            sb.append(LinkCrossRoomDataHolder.m13782a().f11665c);
            textView2.setText(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo12427a(int i) {
        if (isViewValid()) {
            m17402m();
            if (i != 1 || LinkCrossRoomDataHolder.m13782a().f11667e == 0) {
                LinkCrossRoomDataHolder.m13782a().f11664b = false;
                LinkCrossRoomDataHolder.m13782a().f11670h = 0;
                LinkCrossRoomDataHolder.m13782a().f11667e = 0;
                C9049ap.m27023a(m17398c(i), 1);
                if (i == 2) {
                    m17403n();
                }
                LinkCrossRoomDataHolder.m13782a().mo11450c();
                return;
            }
            if (this.f16001j != null && this.f16001j.isVisible()) {
                this.f16001j.dismiss();
            }
            if (LinkCrossRoomDataHolder.m13782a().f11680r == 2) {
                this.f15996e.mo12411b();
            } else {
                m17397b(2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (isViewValid() && kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            switch (key.hashCode()) {
                case -1931352685:
                    if (key.equals("data_pk_chiji_stage")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1540323875:
                    if (key.equals("cmd_pk_state_change")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1087608658:
                    if (key.equals("data_interact_debug_info")) {
                        c = 2;
                        break;
                    }
                    break;
                case 204814877:
                    if (key.equals("cmd_inroompk_state_change")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1060055221:
                    if (key.equals("data_keyboard_status")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1325017518:
                    if (key.equals("cmd_audience_turn_on_link")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1505611330:
                    if (key.equals("data_pk_state")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (this.f15994c != null) {
                        this.f15994c.mo13837b(((Boolean) kVData.getData()).booleanValue());
                        return;
                    }
                    return;
                case 1:
                    m17394a((C4448r) kVData.getData());
                    return;
                case 2:
                    m17395a((C4449s) kVData.getData());
                    return;
                case 3:
                    m17393a((PkState) kVData.getData());
                    return;
                case 4:
                    mo13813j();
                    return;
                case 5:
                    if (kVData.getData() instanceof C4812j) {
                        switch (((C4812j) kVData.getData()).f13711a) {
                            case 0:
                                this.f16000i = 4;
                                return;
                            case 1:
                                if (this.f15999h) {
                                    this.f15996e.mo12411b();
                                    return;
                                }
                                break;
                            case 2:
                                this.f16000i = 0;
                                return;
                            case 3:
                                if (((Integer) this.dataCenter.get("data_pk_chiji_stage", Integer.valueOf(0))).intValue() == 3 && this.f16006o > 0 && this.f16013v != null) {
                                    LinkCrossRoomDataHolder.m13782a().f11660B = this.f16013v.f23632b;
                                    if (this.f16013v.f23631a == 1) {
                                        this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(1));
                                        if (this.f16008q == null) {
                                            this.f16008q = (LinkInRoomPkWidget) this.f16009r.mo13401a(4);
                                            return;
                                        }
                                    } else if (this.f16013v.f23631a == 2) {
                                        this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(2));
                                        if (this.f16008q == null) {
                                            this.f16008q = (LinkInRoomPkWidget) this.f16009r.mo13401a(4);
                                            return;
                                        }
                                    }
                                } else if (!(this.f16008q == null || this.f16009r == null || this.f16000i != 0)) {
                                    this.f16009r.mo13402a((Widget) this.f16008q);
                                    this.f16008q = null;
                                    return;
                                }
                                break;
                            default:
                                return;
                        }
                    }
                    break;
                case 6:
                    if (((Integer) kVData.getData()).intValue() != 4) {
                        if (!(((Integer) kVData.getData()).intValue() != 5 || this.f16008q == null || this.f16009r == null)) {
                            this.f16009r.mo13402a((Widget) this.f16008q);
                            this.f16008q = null;
                            break;
                        }
                    } else if (this.f16006o > 0 && this.f16013v != null) {
                        LinkCrossRoomDataHolder.m13782a().f11660B = this.f16013v.f23632b;
                        if (this.f16013v.f23631a == 1) {
                            this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(1));
                            if (this.f16008q == null) {
                                this.f16008q = (LinkInRoomPkWidget) this.f16009r.mo13401a(4);
                                return;
                            }
                        } else if (this.f16013v.f23631a == 2) {
                            this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(2));
                            if (this.f16008q == null) {
                                this.f16008q = (LinkInRoomPkWidget) this.f16009r.mo13401a(4);
                                return;
                            }
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: b */
    private void m17397b(int i) {
        String str;
        String str2;
        if (isViewValid() && i != this.f16000i) {
            if (this.f16000i == 1) {
                this.f16009r.mo13402a((Widget) this.f15992a);
                this.f16009r.mo13402a((Widget) this.f15993b);
                this.f15992a = null;
                this.f15993b = null;
                this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(4));
            } else if (this.f16000i == 2) {
                if (this.f15999h) {
                    HashMap hashMap = new HashMap();
                    C8435g gVar = new C8435g();
                    hashMap.put("event_page", "live_detail");
                    hashMap.put("room_id", String.valueOf(this.f15997f.getId()));
                    hashMap.put("anchor_id", String.valueOf(this.f15997f.getOwnerUserId()));
                    if (this.f15997f.getId() == LinkCrossRoomDataHolder.m13782a().f11665c) {
                        hashMap.put("inviter_id", String.valueOf(this.f15997f.getOwner().getId()));
                        hashMap.put("invitee_id", String.valueOf(LinkCrossRoomDataHolder.m13782a().f11667e));
                    } else {
                        hashMap.put("inviter_id", String.valueOf(LinkCrossRoomDataHolder.m13782a().f11667e));
                        hashMap.put("invitee_id", String.valueOf(this.f15997f.getOwner().getId()));
                    }
                    String str3 = "match_type";
                    if (LinkCrossRoomDataHolder.m13782a().f11680r == 1) {
                        str = "random";
                    } else {
                        str = "manual";
                    }
                    hashMap.put(str3, str);
                    if (LinkCrossRoomDataHolder.m13782a().f11672j > 0) {
                        hashMap.put("pk_time", String.valueOf(LinkCrossRoomDataHolder.m13782a().f11672j));
                    }
                    String str4 = "is_oncemore";
                    if (LinkCrossRoomDataHolder.m13782a().f11684v) {
                        str2 = "1";
                    } else {
                        str2 = "0";
                    }
                    hashMap.put(str4, str2);
                    hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.m13782a().f11665c));
                    hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.m13782a().f11666d));
                    if (LinkCrossRoomDataHolder.m13782a().f11672j > 0 && LinkCrossRoomDataHolder.m13782a().f11680r == 0) {
                        gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
                    }
                    hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - this.f16012u) / 1000));
                }
                this.f16009r.mo13402a((Widget) this.f15994c);
                this.f15994c = null;
                m17403n();
                LinkCrossRoomDataHolder.m13782a().mo11450c();
            } else if (this.f16000i == 3) {
                this.f16009r.mo13402a((Widget) this.f15995d);
                this.f15995d = null;
            }
            this.f16000i = i;
            LinkCrossRoomDataHolder.m13782a().lambda$put$1$DataCenter("data_link_model", Integer.valueOf(this.f16000i));
            if (this.f16000i == 1) {
                if (this.f15999h) {
                    this.f15992a = (LinkInRoomVideoAnchorWidget) this.f16009r.mo13401a(0);
                } else {
                    this.f15993b = (LinkInRoomVideoGuestWidget) this.f16009r.mo13401a(1);
                }
                this.dataCenter.lambda$put$1$DataCenter("data_pk_chiji_stage", Integer.valueOf(5));
                this.f16010s.mo13814a(0);
                this.f16010s.mo13816b(R.drawable.cga);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", Integer.valueOf(1));
            } else if (this.f16000i == 2) {
                this.f16012u = SystemClock.elapsedRealtime();
                if (LinkCrossRoomDataHolder.m13782a().f11672j > 0) {
                    LinkCrossRoomDataHolder.m13782a().f11686x = this.f16012u;
                }
                this.f15994c = (LinkCrossRoomWidget) this.f16009r.mo13401a(2);
                if (this.f15999h) {
                    this.f16010s.mo13814a(0);
                    this.f16010s.mo13816b(R.drawable.c77);
                } else {
                    this.f16010s.mo13814a(8);
                }
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", Integer.valueOf(2));
            } else if (this.f16000i == 3) {
                this.f15995d = (LinkInRoomAudioWidget) this.f16009r.mo13401a(3);
                this.f16010s.mo13814a(8);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", Integer.valueOf(3));
            } else if (this.f15999h) {
                this.f16010s.mo13814a(0);
                this.f16010s.mo13816b(R.drawable.cga);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", Integer.valueOf(0));
            } else {
                this.f16010s.mo13814a(8);
                this.dataCenter.lambda$put$1$DataCenter("data_link_state", Integer.valueOf(0));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo13811d(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (isViewValid()) {
            this.f15996e.mo12399a(0);
            m17401l();
            C9036ae.m26994a(this.f15997f, "click_connection_button", "anchor_connection", true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13810b(DialogInterface dialogInterface, int i) {
        C4811i.m15836a();
        dialogInterface.dismiss();
        if (isViewValid()) {
            this.f15996e.mo12399a(0);
            m17401l();
        }
    }

    /* renamed from: a */
    public final void mo12428a(long j, C3479d<Room> dVar, String str, int i, RivalExtraInfo rivalExtraInfo) {
        if (isViewValid() && j != 0) {
            m17402m();
            String str2 = LinkCrossRoomDataHolder.m13782a().f11673k;
            C4492a.m15023a().mo12265b();
            this.f16001j = LinkDialog.m14832a(this.dataCenter, (C0043i) this).mo12159a((Room) dVar.data, str2, j, str, i, rivalExtraInfo);
            this.f16001j.show(((FragmentActivity) this.context).getSupportFragmentManager(), "LinkDialog");
        }
    }
}
