package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.projection.MediaProjectionManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.C2404a;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.bgbroadcast.p130a.C2466f;
import com.bytedance.android.live.broadcast.bgbroadcast.p131b.C2487b;
import com.bytedance.android.live.broadcast.dialog.IllegalReviewDialog;
import com.bytedance.android.live.broadcast.p129b.C2442a;
import com.bytedance.android.live.broadcast.p129b.C2442a.C2443a;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.live.core.utils.SlideFinishUtil;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.C3435e;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.room.C3486d;
import com.bytedance.android.live.room.C3486d.C3487a;
import com.bytedance.android.live.room.C3489f;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.C3850ab;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.event.C4427as;
import com.bytedance.android.livesdk.chatroom.event.C4452v;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du.C5296b;
import com.bytedance.android.livesdk.chatroom.p220ui.C5290du.C5297c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.C7849h;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8540cb;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.C9284a;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9345a;
import com.bytedance.android.livesdkapi.depend.p438a.C9297a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.message.C9521a;
import com.bytedance.android.message.IMessageService;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class BgBroadcastFragment extends BaseFragment implements C0053p<KVData>, C2443a, C2501m, C9345a {

    /* renamed from: a */
    public C9284a f7994a = null;

    /* renamed from: b */
    public Room f7995b;

    /* renamed from: c */
    public DataCenter f7996c;

    /* renamed from: d */
    public C3486d f7997d;

    /* renamed from: e */
    public C5290du f7998e;

    /* renamed from: f */
    public C2442a f7999f;

    /* renamed from: g */
    public C2483b f8000g;

    /* renamed from: h */
    private boolean f8001h;

    /* renamed from: i */
    private boolean f8002i;

    /* renamed from: j */
    private C3435e f8003j = new C3435e() {
        /* renamed from: a */
        public final void mo8799a(List<C8149d> list) {
        }

        /* renamed from: b */
        public final void mo8800b(List<GiftPage> list) {
        }
    };

    /* renamed from: k */
    private ServiceConnection f8004k = new ServiceConnection() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo8993a() {
            C3166a.m11961b("BgBroadcastFragment", "room close onLiveFinished");
            BgBroadcastFragment.this.mo8984d();
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            BgBroadcastFragment.this.f7994a = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (BgBroadcastFragment.this.f7996c != null) {
                BgBroadcastFragment.this.f7994a = (C9284a) iBinder;
                if (BgBroadcastFragment.this.f7994a.isLiveFinished()) {
                    C3166a.m11961b("BgBroadcastFragment", "room close onServiceConnected isLiveFinished");
                    BgBroadcastFragment.this.mo8984d();
                    return;
                }
                BgBroadcastFragment.this.f7994a.setLiveStatusListener(new C2498j(this));
                if (BgBroadcastFragment.this.f8000g != null && BgBroadcastFragment.this.f8000g.mo9038g()) {
                    if (((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.mo10240a()).intValue() == 0 && (BgBroadcastFragment.this.f8000g instanceof C2466f)) {
                        BgBroadcastFragment.this.f7994a.startStream(BgBroadcastFragment.this.f8000g.mo9039h());
                    } else if (BgBroadcastFragment.this.f8000g instanceof C2487b) {
                        BgBroadcastFragment.this.f7994a.startStream(BgBroadcastFragment.this.f8000g.mo9039h());
                    }
                }
                if (!(BgBroadcastFragment.this.f7995b == null || BgBroadcastFragment.this.f7996c == null || BgBroadcastFragment.this.f7996c.get("data_message_manager", null) != null)) {
                    BgBroadcastFragment.this.f7996c.lambda$put$1$DataCenter("data_message_manager", ((IMessageService) C3596c.m13172a(IMessageService.class)).messageManagerProvider(BgBroadcastFragment.this.f7995b.getId(), false, BgBroadcastFragment.this.getContext()));
                }
                BgBroadcastFragment.this.mo8982c();
            }
        }
    };

    /* renamed from: l */
    private C3435e f8005l = new C3435e() {
        /* renamed from: a */
        public final void mo8799a(List<C8149d> list) {
        }

        /* renamed from: b */
        public final void mo8800b(List<GiftPage> list) {
        }
    };

    /* renamed from: m */
    private IllegalReviewDialog f8006m;

    /* renamed from: q */
    private boolean f8007q;

    /* renamed from: r */
    private int f8008r;

    public void onStop() {
        super.onStop();
    }

    /* renamed from: a */
    public final void mo8774a(boolean z, String str) {
        if (mo8989l()) {
            m10244o();
            this.f7998e.mo13558a(z, str);
        }
    }

    /* renamed from: a */
    public final void mo8773a(boolean z, CharSequence charSequence, String str) {
        if (mo8989l()) {
            m10244o();
            this.f7998e.mo13557a(false, null, new OnClickListener(null) {
                public final void onClick(View view) {
                    ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(BgBroadcastFragment.this.getContext(), C3979c.m13952b(null).mo11551a(true));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo8771a(boolean z) {
        if (mo8989l() && this.f7998e != null) {
            m10244o();
            if (z) {
                this.f7998e.setCancelable(false);
                this.f7998e.show();
                this.f7998e.mo13555a((OnClickListener) new OnClickListener() {
                    public final void onClick(View view) {
                        if (BgBroadcastFragment.this.f7999f != null) {
                            BgBroadcastFragment.this.f7999f.mo8968b();
                            BgBroadcastFragment.this.f7998e.dismiss();
                        }
                    }
                });
                this.f7998e.f15465a = new C5296b() {
                    /* renamed from: a */
                    public final void mo8803a() {
                        C3517a.m12963a(BgBroadcastFragment.this.getContext(), C3358ac.m12515a((int) R.string.ezh), 1);
                    }
                };
                this.f7998e.f15466b = new C5297c() {
                    /* renamed from: a */
                    public final void mo8804a() {
                        C3517a.m12963a(BgBroadcastFragment.this.getContext(), C3358ac.m12515a((int) R.string.ezh), 1);
                    }
                };
                return;
            }
            this.f7998e.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo8772a(boolean z, CharSequence charSequence, CharSequence charSequence2) {
        if (mo8989l() && this.f7997d != null) {
            this.f7997d.mo10480a(z, charSequence, charSequence2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8979a(HashMap hashMap, boolean z, DialogInterface dialogInterface, int i) {
        C8443c.m25663a().mo21606a("anchor_close_live_confirm", hashMap, new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"));
        dialogInterface.dismiss();
        C8946b.f24405ad.mo22118a(Boolean.valueOf(true));
        m10240a(1);
        mo8984d();
        if (z) {
            this.f7994a.startBgActivity();
        }
    }

    /* renamed from: l */
    public final boolean mo8989l() {
        if (!this.f8001h) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final /* synthetic */ Activity mo8990m() {
        return super.getActivity();
    }

    /* renamed from: o */
    private void m10244o() {
        if (this.f7998e == null) {
            this.f7998e = C5290du.m16945a((Context) getActivity(), 1);
        }
    }

    /* renamed from: e */
    public final void mo8782e() {
        if (mo8989l()) {
            m10245p();
        }
    }

    /* renamed from: f */
    public final void mo8783f() {
        C3517a.m12961a(getContext(), (int) R.string.f34, (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    /* renamed from: h */
    public final C9521a mo8985h() {
        return (C9521a) this.f7996c.get("data_room_text_message_presenter", null);
    }

    /* renamed from: i */
    public final void mo8986i() {
        if (this.f7994a != null) {
            this.f7994a.startAudio();
        }
    }

    /* renamed from: j */
    public final void mo8987j() {
        if (this.f7994a != null) {
            this.f7994a.stopAudio();
        }
    }

    /* renamed from: k */
    public final void mo8988k() {
        if (this.f7994a != null) {
            this.f7994a.startBgActivity();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo8991n() {
        if (mo8989l() && this.f8000g != null) {
            this.f8000g.mo9036e();
        }
    }

    public void onPause() {
        super.onPause();
        this.f8000g.mo9034c();
    }

    public void onResume() {
        super.onResume();
        this.f8000g.mo9033b();
    }

    /* renamed from: g */
    public final void mo8784g() {
        m10240a(8);
        m10247r();
        C3166a.m11961b("BgBroadcastFragment", "room close forceEndLive");
        mo8984d();
    }

    /* renamed from: p */
    private void m10245p() {
        if (this.f8006m == null) {
            this.f8006m = IllegalReviewDialog.m10429a(getContext(), this.f7999f);
            this.f7999f.f7979c = this.f8006m;
        }
        if (getActivity() != null) {
            this.f8006m.show(getActivity().getSupportFragmentManager(), "IllegalReviewDialog");
        }
    }

    /* renamed from: q */
    private void m10246q() {
        if (this.f7997d != null) {
            this.f7997d.mo10482d();
            getActivity().getSupportFragmentManager().mo2645a().mo2587a((Fragment) this.f7997d).mo2610f();
            this.f7997d = null;
            C3850ab.m13691a().mo11396b();
        }
    }

    /* renamed from: r */
    private void m10247r() {
        try {
            if (this.f7994a != null) {
                this.f7994a.stopService();
            }
            if (this.f8002i) {
                getActivity().stopService(m10238a(getContext()));
                this.f8002i = false;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final boolean mo8981b() {
        List<Fragment> f = getActivity().getSupportFragmentManager().mo2658f();
        if (f != null) {
            for (Fragment fragment : f) {
                if ((fragment instanceof C9297a) && ((C9297a) fragment).mo9067a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onStart() {
        super.onStart();
        if (!((Boolean) C8946b.f24405ad.mo22117a()).booleanValue()) {
            getActivity().bindService(m10238a(getContext()), this.f8004k, 1);
        }
    }

    public void onDestroy() {
        if (this.f7995b != null) {
            ((IMessageService) C3596c.m13172a(IMessageService.class)).release(this.f7995b.getId());
            LinkCrossRoomDataHolder.m13784a(this.f7995b.getId());
        }
        m10246q();
        if (this.f7999f != null) {
            this.f7999f.mo8963a();
            this.f7999f = null;
        }
        if (this.f7998e != null && this.f7998e.isShowing()) {
            this.f7998e.dismiss();
        }
        this.f7998e = null;
        if (this.f8000g != null) {
            this.f8000g.mo9035d();
            this.f8000g = null;
        }
        if (this.f7996c != null) {
            this.f7996c.removeObserver(this);
        }
        super.onDestroy();
        this.f8001h = true;
    }

    /* renamed from: c */
    public final void mo8982c() {
        Bundle bundle;
        LiveMode liveMode;
        if (mo8989l() && this.f7996c != null) {
            C0608j supportFragmentManager = getActivity().getSupportFragmentManager();
            if (supportFragmentManager.mo2644a("AbsInteractionFragment") == null) {
                if (getArguments() != null) {
                    bundle = getArguments().getBundle("extra");
                } else {
                    bundle = null;
                }
                this.f7997d = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).createInteractionFragment(getActivity().getRequestedOrientation());
                this.f7997d.setArguments(bundle);
                this.f7996c.lambda$put$1$DataCenter("data_room", this.f7995b);
                this.f7997d.mo10478a(this.f7996c, true, new C3487a() {
                    /* renamed from: a */
                    public final void mo8807a(C8540cb cbVar) {
                        if (BgBroadcastFragment.this.f7999f != null) {
                            BgBroadcastFragment.this.f7999f.mo8965a(cbVar);
                        }
                    }
                }, null);
                if (this.f7996c != null) {
                    this.f7996c.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C4427as(this.f8007q, this.f8008r));
                }
                C3486d dVar = this.f7997d;
                if (this.f7995b.isScreenshot) {
                    liveMode = LiveMode.SCREEN_RECORD;
                } else {
                    liveMode = LiveMode.THIRD_PARTY;
                }
                dVar.mo10477a(liveMode);
                C0633q a = supportFragmentManager.mo2645a();
                a.mo2588a((Fragment) this.f7997d, "AbsInteractionFragment");
                a.mo2610f();
                this.f7997d.mo10479a((Runnable) new C2492d(this));
            }
        }
    }

    /* renamed from: d */
    public final void mo8984d() {
        boolean z = true;
        if (getActivity() != null) {
            getActivity().setRequestedOrientation(1);
        }
        if (this.f8000g != null) {
            this.f8000g.mo9040i();
        }
        try {
            if (C7849h.m24059b("control_view") != null) {
                C7849h.m24059b("control_view").dismiss();
            }
        } catch (Throwable unused) {
        }
        try {
            if (C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW) != null) {
                C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW).dismiss();
            }
        } catch (Throwable unused2) {
        }
        if (mo8989l()) {
            FrameLayout frameLayout = (FrameLayout) getView().findViewById(R.id.aeq);
            if (frameLayout.getChildCount() <= 0) {
                m10246q();
                frameLayout.setVisibility(0);
                C3166a.m11961b("BgBroadcastFragment", "room close new LiveBroadcastEndFragment");
                if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_USE_NEW_BROADCAST_END.mo10240a()).booleanValue() || TextUtils.isEmpty(this.f7995b.finish_url)) {
                    z = false;
                }
                C3489f createLiveBroadcastEndFragment = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).createLiveBroadcastEndFragment(z);
                createLiveBroadcastEndFragment.mo10494a(getActivity(), this.f7995b, C2493e.f8081a, "");
                C0633q a = getActivity().getSupportFragmentManager().mo2645a();
                if (this.f7997d != null && this.f7997d.isAdded()) {
                    a.mo2587a((Fragment) this.f7997d);
                }
                this.f7997d = null;
                try {
                    a.mo2586a(R.id.aeq, (Fragment) createLiveBroadcastEndFragment, "live_end").mo2606d();
                } catch (Throwable th) {
                    C3166a.m11966e("BgBroadcastFragmentadd LiveBroadcastEndFragment", th.toString());
                }
                if (this.f8000g != null) {
                    this.f8000g.mo9037f();
                }
                m10247r();
                mo8976a();
            }
        }
    }

    /* renamed from: a */
    public final void mo8976a() {
        try {
            if (C7849h.m24059b("control_view") != null) {
                C7849h.m24059b("control_view").dismiss();
            }
        } catch (Throwable unused) {
        }
        try {
            if (C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW) != null) {
                C7849h.m24059b(IBroadcastService.TAG_MSG_VIEW).dismiss();
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public final void mo8768a(CharSequence charSequence) {
        if (mo8989l()) {
            m10244o();
            this.f7998e.mo13556a(charSequence);
        }
    }

    /* renamed from: b */
    public final void mo8777b(CharSequence charSequence) {
        if (mo8989l()) {
            m10244o();
            this.f7998e.mo13559b(charSequence);
        }
    }

    /* renamed from: c */
    public final void mo8983c(boolean z) {
        if (this.f7994a != null) {
            this.f7994a.startStream(false);
        }
    }

    /* renamed from: a */
    private static Intent m10238a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ((IHostApp) C3596c.m13172a(IHostApp.class)).getBgBroadcastServiceName()));
        return intent;
    }

    /* renamed from: a */
    public static BgBroadcastFragment m10239a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        BgBroadcastFragment bgBroadcastFragment = new BgBroadcastFragment();
        bgBroadcastFragment.setArguments(bundle2);
        return bgBroadcastFragment;
    }

    /* renamed from: onEvent */
    public void mo8978a(C4452v vVar) {
        switch (vVar.f12912a) {
            case 5:
                m10247r();
                getActivity().finish();
                return;
            case 6:
            case 8:
                mo8980b(false);
                return;
            case 7:
                m10240a(1);
                C3166a.m11961b("BgBroadcastFragment", "room close LiveEvent.ACTION_SHOW_LIVE_END_DIALOG");
                mo8984d();
                return;
            default:
                if (this.f8000g != null) {
                    this.f8000g.onEvent(vVar);
                }
                return;
        }
    }

    /* renamed from: a */
    private void m10240a(int i) {
        if (this.f7995b.isThirdParty) {
            C2515f.m10417f().mo9076c().mo9174i().sendStatus(this.f7995b.getId(), 4, this.f7995b.getStreamId(), i).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a(C2496h.f8086a, C2497i.f8087a);
        }
        if (this.f7994a != null) {
            this.f7994a.stopStream(i);
        }
        this.f7999f.mo8973f();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey()) && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1559753544) {
                if (hashCode == 562756910 && key.equals("cmd_show_illegal_dialog")) {
                    c = 1;
                }
            } else if (key.equals("text_msg_widget_ready")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    if ((this.f8000g instanceof C2466f) && this.f7996c.get("data_room_text_message_presenter", null) != null) {
                        ((C2466f) this.f8000g).mo9031a((C9521a) this.f7996c.get("data_room_text_message_presenter", null));
                        return;
                    }
                case 1:
                    m10245p();
                    this.f7999f.f7978b = false;
                    break;
            }
        }
    }

    /* renamed from: b */
    public final void mo8980b(boolean z) {
        Object obj;
        int i;
        String str;
        CharSequence charSequence = 0;
        if (this.f7996c != null) {
            obj = this.f7996c.get("data_member_count");
        } else {
            obj = null;
        }
        if (obj == null || !(obj instanceof Integer)) {
            i = 0;
        } else {
            i = ((Integer) obj).intValue();
        }
        if (i <= 0) {
            str = C3358ac.m12515a((int) R.string.epi);
        } else {
            str = getResources().getQuantityString(R.plurals.a4, i, new Object[]{Integer.valueOf(i)});
        }
        if (!TextUtils.isEmpty(str) && i > 0) {
            String valueOf = String.valueOf(i);
            int indexOf = str.indexOf(valueOf);
            if (indexOf != -1) {
                Spannable spannableString = new SpannableString(str);
                spannableString.setSpan(new ForegroundColorSpan(-56832), indexOf, valueOf.length() + indexOf, 34);
                charSequence = spannableString;
            }
        }
        long j = 0;
        if (this.f7995b != null) {
            j = this.f7995b.getId();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(j));
        C8443c.m25663a().mo21606a("anchor_close_live_popup", hashMap, new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"));
        C9249a a = new C9249a(getContext()).mo22710a((int) R.string.fez);
        if (charSequence == 0) {
            charSequence = str;
        }
        a.mo22727c(charSequence).mo22722b(0, (int) R.string.f96, (DialogInterface.OnClickListener) new C2494f(this, hashMap, z)).mo22722b(1, (int) R.string.ecm, (DialogInterface.OnClickListener) new C2495g(hashMap)).mo22721b(z);
    }

    public void onCreate(Bundle bundle) {
        Room room;
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        if (C9290a.f25466a) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        C3495l lVar = (C3495l) C3596c.m13172a(C3495l.class);
        if (lVar != null) {
            room = lVar.getCurrentRoom();
        } else {
            room = null;
        }
        this.f7995b = room;
        if (!Room.isValid(this.f7995b) || !this.f7995b.isPullUrlValid()) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.f7996c = DataCenter.create(C0069x.m157a((Fragment) this), this);
        this.f7996c.observeForever("text_msg_widget_ready", this);
        this.f7996c.observe("cmd_show_illegal_dialog", this);
        SlideFinishUtil.m12463a(getActivity());
        ((C3245ad) C9097a.m27146a().mo22266a(C4452v.class).mo19293a(C3303k.m12369a((Fragment) this)).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10182a((C7326g<? super T>) new C2491c<Object>(this));
    }

    public void onActivityCreated(Bundle bundle) {
        SlideFinishUtil.m12463a(getActivity());
        super.onActivityCreated(bundle);
        if (C3387g.m12599a(getActivity()) && getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(48);
        }
        if (!Room.isValid(this.f7995b) || !this.f7995b.isPullUrlValid() || C9469i.m27992d() == null) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        LinkCrossRoomDataHolder.m13783a(this.f7995b.getId(), C0069x.m157a((Fragment) this), this);
        C0608j supportFragmentManager = getActivity().getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a("AbsInteractionFragment");
        if (a != null) {
            try {
                supportFragmentManager.mo2645a().mo2587a(a).mo2610f();
            } catch (Exception e) {
                C8444d.m25673b();
                C8444d.m11969a(6, e.getStackTrace());
            }
        }
        this.f7999f = new C2442a(this.f7995b.getId(), getContext());
        this.f7999f.mo9142a(this);
        if (this.f7995b.isScreenshot) {
            this.f8000g = new C2466f(this.f7995b, this);
        } else {
            this.f8000g = new C2487b(this.f7995b, this);
        }
        this.f8000g.mo9029a();
        if (!((Boolean) C8946b.f24405ad.mo22117a()).booleanValue()) {
            if (VERSION.SDK_INT >= 26) {
                getActivity().startForegroundService(m10238a(getContext()));
            } else {
                getActivity().startService(m10238a(getContext()));
            }
            this.f8002i = true;
        } else {
            C3166a.m11961b("BgBroadcastFragment", "room close LIVE_GAME_QUIT_CLICKED is true");
            mo8984d();
        }
        ((IGiftService) C3596c.m13172a(IGiftService.class)).syncGiftList(this.f8005l, this.f7995b.getId(), 2, true);
        if (this.f7995b.isScreenshot && VERSION.SDK_INT >= 21 && ((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.mo10240a()).intValue() == 1) {
            C2404a.m10120a().mo8841b();
            startActivityForResult(((MediaProjectionManager) getActivity().getSystemService("media_projection")).createScreenCaptureIntent(), 1000);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!Room.isValid(this.f7995b) || !this.f7995b.isPullUrlValid()) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        float a = (float) (C9738o.m28691a(getContext()) / C9738o.m28709b(getContext()));
        C5343e.m17039a((HSImageView) getView().findViewById(R.id.k5), this.f7995b.getOwner().getAvatarThumb(), (C13842b) new C9092w(5, a, null));
        C5343e.m17039a((HSImageView) getView().findViewById(R.id.ea8), this.f7995b.getOwner().getAvatarThumb(), (C13842b) new C9092w(5, a, null));
    }

    /* renamed from: a */
    public final void mo8977a(int i, int i2) {
        if (i > i2) {
            this.f8007q = true;
            this.f8008r = ((i2 * C3358ac.m12523c()) / i) + ((int) C9738o.m28708b(getContext(), 96.0f));
        } else {
            this.f8007q = false;
        }
        if (this.f7997d != null) {
            this.f7996c.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C4427as(this.f8007q, this.f8008r));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ala, viewGroup, false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000 && i2 == -1 && this.f7994a != null) {
            this.f7994a.setData(intent, this.f8000g.mo9039h());
            this.f7994a.startStream(this.f8000g.mo9039h());
            if (this.f7996c != null && this.f7996c.get("data_message_manager", null) == null) {
                this.f7996c.lambda$put$1$DataCenter("data_message_manager", ((IMessageService) C3596c.m13172a(IMessageService.class)).messageManagerProvider(this.f7995b.getId(), false, getContext()));
            }
            mo8982c();
        }
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    static final /* synthetic */ void m10243a(HashMap hashMap, DialogInterface dialogInterface, int i) {
        C8443c.m25663a().mo21606a("anchor_close_live_cancel", hashMap, new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_detail"));
        dialogInterface.dismiss();
        C8946b.f24405ad.mo22118a(Boolean.valueOf(false));
    }
}
