package com.bytedance.android.livesdk.chatroom.end;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.constraint.Group;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.media.C2360f;
import com.bytedance.android.live.base.model.media.Media;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.C2412a;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3360ae;
import com.bytedance.android.live.core.utils.C3363ah;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3489f;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.api.BannerRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.C4253a;
import com.bytedance.android.livesdk.chatroom.end.TopFansLayout.C4391a;
import com.bytedance.android.livesdk.chatroom.model.C4919p;
import com.bytedance.android.livesdk.chatroom.model.C4919p.C4920a;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.Properties;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.IPropertyCache.C9283a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p438a.C9297a;
import com.bytedance.android.livesdkapi.depend.p439b.C9299b;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C9430a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.android.livesdkapi.plugin.PluginType;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.facebook.imagepipeline.request.C13842b;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.p280ss.android.common.util.C19290j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class LiveBroadcastEndFragment extends LiveEndFragment implements C3489f, C9297a, C6310a {

    /* renamed from: a */
    public static String f12692a = "sslocal://webcast_webview?url=https%3A%2F%2Fwj.toutiao.com%2F6K0526Um%2F%3Fbanner_id%3D373&type=fullscreen&title=&hide_more=0&hide_nav_bar=0&hide_status_bar=0";

    /* renamed from: C */
    private TextView f12693C;

    /* renamed from: D */
    private TextView f12694D;

    /* renamed from: E */
    private TextView f12695E;

    /* renamed from: F */
    private TextView f12696F;

    /* renamed from: G */
    private TextView f12697G;

    /* renamed from: H */
    private HSImageView f12698H;

    /* renamed from: I */
    private View f12699I;

    /* renamed from: J */
    private View f12700J;

    /* renamed from: K */
    private View f12701K;

    /* renamed from: L */
    private View f12702L;

    /* renamed from: M */
    private HSImageView f12703M;

    /* renamed from: N */
    private HSImageView f12704N;

    /* renamed from: O */
    private ImageView f12705O;

    /* renamed from: P */
    private ImageView f12706P;

    /* renamed from: Q */
    private VHeadView f12707Q;

    /* renamed from: R */
    private TextView f12708R;

    /* renamed from: S */
    private ImageView f12709S;

    /* renamed from: T */
    private TextView f12710T;

    /* renamed from: U */
    private ImageView f12711U;

    /* renamed from: V */
    private ImageView f12712V;

    /* renamed from: W */
    private TextView f12713W;

    /* renamed from: X */
    private TextView f12714X;

    /* renamed from: Y */
    private TextView f12715Y;

    /* renamed from: Z */
    private TextView f12716Z;

    /* renamed from: aa */
    private View f12717aa;

    /* renamed from: ab */
    private String f12718ab;

    /* renamed from: ac */
    private List<C2360f> f12719ac;

    /* renamed from: ad */
    private String f12720ad;

    /* renamed from: ae */
    private CharSequence f12721ae;

    /* renamed from: af */
    private CharSequence f12722af;

    /* renamed from: ag */
    private CharSequence f12723ag;

    /* renamed from: ah */
    private C6309f f12724ah = new C6309f(this);

    /* renamed from: ai */
    private C9297a f12725ai;

    /* renamed from: aj */
    private long f12726aj;

    /* renamed from: ak */
    private TextView f12727ak;

    /* renamed from: al */
    private TopFansLayout f12728al;

    /* renamed from: am */
    private LinearLayout f12729am;

    /* renamed from: an */
    private TextView f12730an;

    /* renamed from: ao */
    private TextView f12731ao;

    /* renamed from: ap */
    private TextView f12732ap;

    /* renamed from: aq */
    private View f12733aq;

    /* renamed from: ar */
    private OnClickListener f12734ar = new OnClickListener() {
        public final void onClick(View view) {
            float f;
            float f2;
            PluginType pluginType;
            int id = view.getId();
            if (id == R.id.k2) {
                LiveBroadcastEndFragment.this.mo12107d();
            } else if (id == R.id.dkq) {
                LiveBroadcastEndFragment.this.mo12106c();
            } else {
                int i = 0;
                if (id == R.id.ald) {
                    C8448g.m25682a((Context) LiveBroadcastEndFragment.this.f12742i);
                    LiveBroadcastEndFragment.this.mo12093a(0, "live_ending");
                } else if (id == R.id.d1r) {
                    LiveBroadcastEndFragment.this.mo12093a(0, "anchor_live_ending");
                } else if (id == R.id.dix) {
                    LiveBroadcastEndFragment.this.mo12093a(1, "anchor_live_ending");
                } else {
                    if (id == R.id.r_) {
                        C8448g.m25682a((Context) LiveBroadcastEndFragment.this.f12742i);
                        LiveBroadcastEndFragment.this.f12762y.getId();
                        LiveBroadcastEndFragment.this.f12739f = true;
                        TTLiveSDKContext.getHostService().mo22361b().mo23190b().mo22766a((C9283a) Properties.CLICK_RECORD_BUTTON_IN_END_LIVE, LiveBroadcastEndFragment.this.f12739f);
                        LiveBroadcastEndFragment.this.f12737d.setVisibility(8);
                        if (LiveBroadcastEndFragment.this.f12743j != null) {
                            LiveBroadcastEndFragment.this.f12743j.mo8764a();
                        }
                        C8443c.m25663a().mo21607a("pm_live_take_video_add", new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("anchor_live_ending"), new C8439k());
                        if (((Boolean) LiveConfigSettingKeys.LIVE_FIX_CHECK_PLUGIN_ERROR.mo10240a()).booleanValue()) {
                            pluginType = PluginType.Camera;
                        } else {
                            pluginType = PluginType.LiveResource;
                        }
                        if (pluginType.isInstalled()) {
                            LiveBroadcastEndFragment.this.mo12095b();
                        } else {
                            pluginType.checkInstall(LiveBroadcastEndFragment.this.getContext(), "live_end", new C9430a() {
                                /* access modifiers changed from: 0000 */
                                /* renamed from: a */
                                public final /* synthetic */ void mo12099a(Integer num) throws Exception {
                                    if (num.equals(Integer.valueOf(2))) {
                                        LiveBroadcastEndFragment.this.mo12095b();
                                    } else if (num.equals(Integer.valueOf(1))) {
                                        C9049ap.m27022a((int) R.string.fbm);
                                    } else {
                                        C9049ap.m27022a((int) R.string.fbl);
                                    }
                                }

                                /* renamed from: a */
                                public final void mo8840a(String str) {
                                    LiveBroadcastEndFragment.this.f12741h.mo119661a(((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).loadShortVideoRes().mo19280a((C7326g<? super T>) new C4398f<Object>(this), C4399g.f12805a));
                                }
                            });
                        }
                    } else if (id == R.id.vb || id == R.id.dro || id == R.id.bnt) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("room_id", String.valueOf(LiveBroadcastEndFragment.this.f12762y.getId()));
                        hashMap.put("anchor_id", String.valueOf(LiveBroadcastEndFragment.this.f12762y.getOwner().getId()));
                        hashMap.put("event_page", "anchor_live_ending");
                        C8443c.m25663a().mo21606a("livesdk_live_assit_guide_click", hashMap, new Object[0]);
                        if (LiveBroadcastEndFragment.this.f12754x) {
                            C9178j.m27302j().mo22380i().handle(LiveBroadcastEndFragment.this.getContext(), Uri.parse(new C19290j(LiveBroadcastEndFragment.f12692a).mo51184a()));
                        }
                    } else {
                        float f3 = 0.0f;
                        if (id == R.id.efw) {
                            if (!C9290a.f25466a) {
                                C8443c.m25663a().mo21607a("pm_live_take_count_click", new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("anchor_live_ending"), new C8439k());
                                LiveBroadcastEndFragment.this.f12738e.setVisibility(0);
                                LiveBroadcastEndFragment.this.f12738e.setPivotY(0.0f);
                                LiveBroadcastEndFragment liveBroadcastEndFragment = LiveBroadcastEndFragment.this;
                                ViewPropertyAnimator animate = LiveBroadcastEndFragment.this.f12738e.animate();
                                if (!LiveBroadcastEndFragment.this.f12747q) {
                                    f3 = 1.0f;
                                }
                                liveBroadcastEndFragment.f12746m = animate.scaleY(f3).setDuration(200).setListener(new AnimatorListener() {
                                    public final void onAnimationCancel(Animator animator) {
                                    }

                                    public final void onAnimationRepeat(Animator animator) {
                                    }

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        LiveBroadcastEndFragment.this.f12744k.setClickable(true);
                                    }
                                });
                                ViewPropertyAnimator animate2 = LiveBroadcastEndFragment.this.f12735b.animate();
                                if (!LiveBroadcastEndFragment.this.f12747q) {
                                    f = C9738o.m28708b((Context) LiveBroadcastEndFragment.this.f12742i, 56.0f);
                                } else {
                                    f = -C9738o.m28708b((Context) LiveBroadcastEndFragment.this.f12742i, 56.0f);
                                }
                                animate2.translationYBy(f).setDuration(200).start();
                                if (LiveBroadcastEndFragment.this.f12753w != null) {
                                    ViewPropertyAnimator animate3 = LiveBroadcastEndFragment.this.f12753w.animate();
                                    if (!LiveBroadcastEndFragment.this.f12747q) {
                                        f2 = C9738o.m28708b((Context) LiveBroadcastEndFragment.this.f12742i, 56.0f);
                                    } else {
                                        f2 = -C9738o.m28708b((Context) LiveBroadcastEndFragment.this.f12742i, 56.0f);
                                    }
                                    animate3.translationYBy(f2).setDuration(200).start();
                                }
                                LiveBroadcastEndFragment.this.f12746m.start();
                                LiveBroadcastEndFragment.this.f12745l.animate().rotationBy(180.0f).setDuration(200).start();
                                LiveBroadcastEndFragment.this.f12744k.setClickable(false);
                                LiveBroadcastEndFragment.this.f12747q = !LiveBroadcastEndFragment.this.f12747q;
                            }
                        } else if (view.equals(LiveBroadcastEndFragment.this.f12751u)) {
                            if (LiveBroadcastEndFragment.this.mo8989l()) {
                                C3596c.m13172a(C9295a.class);
                                LiveBroadcastEndFragment.this.getContext();
                            }
                        } else if (view.equals(LiveBroadcastEndFragment.this.f12750t) || view.equals(LiveBroadcastEndFragment.this.f12749s)) {
                            if (LiveBroadcastEndFragment.this.mo8989l()) {
                                if (LiveBroadcastEndFragment.this.f12752v.getVisibility() == 0) {
                                    i = 8;
                                }
                                LiveBroadcastEndFragment.this.f12752v.setVisibility(i);
                                if (i == 0) {
                                    LiveBroadcastEndFragment.this.f12750t.animate().rotation(180.0f).start();
                                } else {
                                    LiveBroadcastEndFragment.this.f12750t.animate().rotation(0.0f).start();
                                }
                            }
                        } else if (!(id != R.id.ajp || LiveBroadcastEndFragment.this.f12762y == null || LiveBroadcastEndFragment.this.f12762y.getId() == 0)) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("roomId", LiveBroadcastEndFragment.this.f12762y.getId());
                            bundle.putLong("anchor_id", LiveBroadcastEndFragment.this.f12762y.getOwnerUserId());
                            TTLiveSDKContext.getHostService().mo22365f().mo22048a((Context) LiveBroadcastEndFragment.this.f12742i, "//livend/submitfeedbackacitivity", bundle);
                            HashMap hashMap2 = new HashMap(1);
                            hashMap2.put("anchor_id", String.valueOf(LiveBroadcastEndFragment.this.f12762y.getOwnerUserId()));
                            TTLiveSDKContext.getHostService().mo22363d().mo23269a("livesdk_live_end_feedback_click", hashMap2);
                        }
                    }
                }
            }
        }
    };

    /* renamed from: b */
    public LinearLayout f12735b;

    /* renamed from: c */
    public LinearLayout f12736c;

    /* renamed from: d */
    public TextView f12737d;

    /* renamed from: e */
    public View f12738e;

    /* renamed from: f */
    public boolean f12739f;

    /* renamed from: g */
    public String f12740g;

    /* renamed from: h */
    public final C47562b f12741h = new C47562b();

    /* renamed from: i */
    public Activity f12742i;

    /* renamed from: j */
    public C2412a f12743j;

    /* renamed from: k */
    public View f12744k;

    /* renamed from: l */
    public ImageView f12745l;

    /* renamed from: m */
    public ViewPropertyAnimator f12746m;

    /* renamed from: q */
    public boolean f12747q = true;

    /* renamed from: r */
    public RelativeLayout f12748r;

    /* renamed from: s */
    public View f12749s;

    /* renamed from: t */
    public View f12750t;

    /* renamed from: u */
    public TextView f12751u;

    /* renamed from: v */
    public Group f12752v;

    /* renamed from: w */
    public View f12753w;

    /* renamed from: x */
    public boolean f12754x;

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
    }

    /* renamed from: a */
    public final boolean mo9067a() {
        if (this.f12725ai == null || !this.f12725ai.mo9067a()) {
            return false;
        }
        if (this.f12742i != null) {
            this.f12742i.finish();
        }
        return true;
    }

    /* renamed from: b */
    public final void mo12095b() {
        this.f12724ah.postDelayed(new Runnable() {
            public final void run() {
                if (TTLiveSDKContext.getHostService().mo22362c().startVideoRecordActivity(LiveBroadcastEndFragment.this.f12742i, "live_end_dialog")) {
                    LiveBroadcastEndFragment.this.f12742i.finish();
                }
            }
        }, 200);
    }

    public void onStop() {
        super.onStop();
        if (this.f12746m != null) {
            this.f12746m.cancel();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f12724ah != null) {
            this.f12724ah.removeCallbacks(null);
        }
        this.f12741h.mo119660a();
    }

    /* renamed from: e */
    private void m14786e() {
        this.f12717aa.setClickable(false);
        ((BannerRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(BannerRetrofitApi.class)).queryLiveEndPageBanner().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4396d<Object>(this), C4397e.f12803a);
    }

    /* renamed from: f */
    private void m14787f() {
        C9178j.m27302j().mo22374c().mo11535a((Context) getActivity(), C3979c.m13952b(this.f12720ad).mo11551a(true).mo11550a(getContext().getResources().getString(R.string.ec2)));
    }

    /* renamed from: g */
    private void m14788g() {
        String str;
        long id;
        this.f12699I = mo12105a(R.id.dv);
        this.f12694D = (TextView) mo12105a(R.id.efu);
        this.f12693C = (TextView) mo12105a(R.id.efv);
        this.f12696F = (TextView) mo12105a(R.id.c3s);
        this.f12697G = (TextView) mo12105a(R.id.a2n);
        this.f12695E = (TextView) mo12105a(R.id.dj0);
        View a = mo12105a(R.id.k2);
        this.f12698H = (HSImageView) mo12105a(R.id.bor);
        this.f12735b = (LinearLayout) mo12105a(R.id.czf);
        this.f12736c = (LinearLayout) mo12105a(R.id.a2p);
        this.f12728al = (TopFansLayout) mo12105a(R.id.dmy);
        this.f12700J = mo12105a(R.id.ea2);
        this.f12701K = mo12105a(R.id.d1r);
        this.f12702L = mo12105a(R.id.dix);
        this.f12703M = (HSImageView) mo12105a(R.id.eah);
        this.f12704N = (HSImageView) mo12105a(R.id.eai);
        this.f12705O = (ImageView) mo12105a(R.id.d1o);
        this.f12706P = (ImageView) mo12105a(R.id.div);
        this.f12700J.setVisibility(8);
        this.f12707Q = (VHeadView) mo12105a(R.id.dkq);
        this.f12708R = (TextView) mo12105a(R.id.dkr);
        this.f12737d = (TextView) mo12105a(R.id.cpu);
        this.f12709S = (ImageView) mo12105a(R.id.r_);
        this.f12710T = (TextView) mo12105a(R.id.ebl);
        this.f12711U = (ImageView) mo12105a(R.id.az8);
        this.f12712V = (ImageView) mo12105a(R.id.az9);
        this.f12713W = (TextView) mo12105a(R.id.dro);
        this.f12727ak = (TextView) mo12105a(R.id.bno);
        this.f12744k = mo12105a(R.id.efw);
        this.f12745l = (ImageView) mo12105a(R.id.bq9);
        C9738o.m28712b((View) this.f12745l, 8);
        this.f12738e = mo12105a(R.id.e8z);
        this.f12714X = (TextView) mo12105a(R.id.bnv);
        this.f12715Y = (TextView) mo12105a(R.id.bpp);
        this.f12716Z = (TextView) mo12105a(R.id.box);
        this.f12717aa = mo12105a(R.id.vb);
        this.f12729am = (LinearLayout) mo12105a(R.id.bp0);
        this.f12730an = (TextView) mo12105a(R.id.boz);
        this.f12748r = (RelativeLayout) mo12105a(R.id.av6);
        this.f12731ao = (TextView) mo12105a(R.id.av7);
        this.f12733aq = mo12105a(R.id.ajp);
        this.f12733aq.setOnClickListener(this.f12734ar);
        this.f12744k.setOnClickListener(this.f12734ar);
        this.f12709S.setOnClickListener(this.f12734ar);
        a.setOnClickListener(this.f12734ar);
        this.f12707Q.setOnClickListener(this.f12734ar);
        this.f12713W.setOnClickListener(this.f12734ar);
        this.f12717aa.setOnClickListener(this.f12734ar);
        mo12105a(R.id.bnt).setOnClickListener(this.f12734ar);
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "show");
        hashMap.put("event_module", "live");
        String str2 = "room_id";
        if (this.f12762y == null) {
            str = "0";
        } else {
            str = String.valueOf(this.f12762y.getId());
        }
        hashMap.put(str2, str);
        String str3 = "user_id";
        if (this.f12762y == null) {
            id = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        } else {
            id = this.f12762y.getOwner().getId();
        }
        hashMap.put(str3, String.valueOf(id));
        C8443c.m25663a().mo21606a("live_assit_guide_show", hashMap, new Object[0]);
    }

    /* renamed from: a */
    public final void mo10495a(C2412a aVar) {
        this.f12743j = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12094a(C3479d dVar) throws Exception {
        m14779a((C4919p) dVar.data);
    }

    /* renamed from: a */
    private static Media m14778a(C2360f fVar) {
        return (Media) C9178j.m27302j().mo22372a().mo15974a(fVar.f7783b, Media.class);
    }

    public void onEvent(C9299b bVar) {
        if (bVar != null && isAdded()) {
            ((FragmentActivity) this.f12742i).getSupportFragmentManager();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f12762y != null) {
            C4275g.m14434a().mo11968a(this.f12724ah, true, this.f12762y.getId(), 4, true, 1, 12);
            ((C3495l) C3596c.m13172a(C3495l.class)).setCurrentRoom(null);
        }
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
        this.f12720ad = bundle.getString("live_end_banned_url", null);
        this.f12721ae = bundle.getCharSequence("live_end_banned_title", null);
        this.f12722af = bundle.getCharSequence("live_end_banned_reason", null);
        this.f12723ag = bundle.getCharSequence("live_end_banned_content", null);
    }

    /* renamed from: a */
    private void m14783a(List<C2360f> list) {
        int size = list.size();
        if (size <= 0) {
            this.f12711U.setVisibility(0);
            this.f12712V.setVisibility(0);
        }
        if (size == 1) {
            this.f12712V.setVisibility(0);
        }
        for (int i = 0; i < size; i++) {
            C2360f fVar = (C2360f) list.get(i);
            if (!(fVar == null || fVar.f7782a == null)) {
                if (i == 0) {
                    C5343e.m17038a(this.f12703M, fVar.f7782a);
                    this.f12705O.setVisibility(0);
                    this.f12701K.setOnClickListener(this.f12734ar);
                }
                if (i == 1) {
                    C5343e.m17038a(this.f12704N, fVar.f7782a);
                    this.f12706P.setVisibility(0);
                    this.f12702L.setOnClickListener(this.f12734ar);
                }
                m14781a(this.f12762y, fVar, true, (String) null);
            }
        }
    }

    /* renamed from: a */
    private void m14779a(C4919p pVar) {
        C4920a aVar;
        int i;
        if (pVar == null || pVar.f14062b == null) {
            this.f12754x = false;
            this.f12713W.setText(getResources().getString(R.string.eqx));
            this.f12713W.setTextColor(Color.parseColor("#a3ffffff"));
        } else {
            if (pVar.f14062b.size() > 0) {
                aVar = (C4920a) pVar.f14062b.get(0);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                this.f12754x = true;
                this.f12713W.setText(aVar.f14070h);
                f12692a = aVar.f14068f;
                try {
                    i = Color.parseColor(aVar.f14065c);
                } catch (Exception unused) {
                    i = Color.parseColor("#a3ffffff");
                }
                if (i != -1) {
                    this.f12713W.setTextColor(i);
                }
            } else {
                this.f12754x = false;
                this.f12713W.setText(getResources().getString(R.string.eqx));
                this.f12713W.setTextColor(Color.parseColor("#a3ffffff"));
            }
        }
        if (this.f12754x) {
            C9738o.m28712b(this.f12717aa, 0);
        } else {
            C9738o.m28712b(this.f12717aa, 8);
        }
        this.f12717aa.setClickable(true);
    }

    /* renamed from: b */
    private void m14784b(Room room) {
        RoomStats stats = room.getStats();
        if (stats != null) {
            String douPlusPromotion = stats.getDouPlusPromotion();
            if (!TextUtils.isEmpty(douPlusPromotion)) {
                C6711m mVar = (C6711m) C2317a.m9932a().mo15974a(douPlusPromotion, C6711m.class);
                if (mVar != null) {
                    C6709k b = mVar.mo16149b("live_click");
                    C6709k b2 = mVar.mo16149b("is_dou_plus_on");
                    C6709k b3 = mVar.mo16149b("task_list_path");
                    if (b != null && !TextUtils.isEmpty(b.mo15998c()) && b2 != null && b2.mo16003g() == 1 && b3 != null && !TextUtils.isEmpty(b3.mo15998c())) {
                        this.f12740g = b3.mo15998c();
                        String c = b.mo15998c();
                        if (this.f12753w == null) {
                            this.f12753w = mo12105a(R.id.bh8);
                            if (this.f12753w != null) {
                                this.f12732ap = (TextView) this.f12753w.findViewById(R.id.a_o);
                                this.f12751u = (TextView) this.f12753w.findViewById(R.id.a_s);
                                this.f12752v = (Group) this.f12753w.findViewById(R.id.a_p);
                                this.f12749s = this.f12753w.findViewById(R.id.a_y);
                                this.f12750t = this.f12753w.findViewById(R.id.a_x);
                                this.f12752v.setReferencedIds(new int[]{R.id.a_o, R.id.a_n, R.id.a_s});
                                this.f12751u.setOnClickListener(this.f12734ar);
                                this.f12749s.setOnClickListener(this.f12734ar);
                                this.f12750t.setOnClickListener(this.f12734ar);
                            } else {
                                return;
                            }
                        }
                        this.f12752v.setVisibility(8);
                        this.f12753w.setVisibility(0);
                        this.f12732ap.setText(c);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m14785c(Room room) {
        if (mo8989l() && room.getStats() != null && room.getStats().userComposition != null) {
            RoomStats stats = room.getStats();
            this.f12738e.setVisibility(0);
            TextView textView = this.f12714X;
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf((int) (stats.userComposition.f7714a * 100.0d)));
            sb.append("%");
            textView.setText(sb.toString());
            TextView textView2 = this.f12715Y;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf((int) (stats.userComposition.f7715b * 100.0d)));
            sb2.append("%");
            textView2.setText(sb2.toString());
            TextView textView3 = this.f12716Z;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(String.valueOf((int) (stats.userComposition.f7716c * 100.0d)));
            sb3.append("%");
            textView3.setText(sb3.toString());
        }
    }

    public void handleMsg(Message message) {
        String str;
        String str2;
        if (this.f12742i != null && !this.f12742i.isFinishing()) {
            int i = message.what;
            if (message.obj instanceof Exception) {
                if ((!C9290a.f25466a || !(i == 21 || i == 22)) && (message.obj instanceof ApiServerException)) {
                    C3517a.m12962a((Context) this.f12742i, ((ApiServerException) message.obj).getPrompt());
                }
                return;
            }
            if (12 == i && (message.obj instanceof Room)) {
                Room room = (Room) message.obj;
                m14780a(room);
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(room.getId()));
                String str3 = "live_type";
                if (room.isLiveTypeAudio()) {
                    str = "voice_live";
                } else {
                    str = "video_live";
                }
                hashMap.put(str3, str);
                hashMap.put("time", String.valueOf(room.getFinishTime() - room.getCreateTime()));
                String str4 = "streaming_type";
                if (this.f12762y.isThirdParty) {
                    str2 = "thirdparty";
                } else {
                    str2 = "general";
                }
                hashMap.put(str4, str2);
                C8443c.m25663a().mo21606a("live_over", hashMap, new C8438j().mo21598a("live_take_page").mo21603f("click").mo21599b("live_take"));
            }
            if (21 == i) {
                this.f12719ac = (List) message.obj;
                m14783a(this.f12719ac);
            }
        }
    }

    /* renamed from: a */
    private void m14780a(Room room) {
        if (room != null && room.getStats() != null) {
            if (room.isLiveTypeAudio()) {
                this.f12693C.setText(R.string.er2);
            }
            RoomStats stats = room.getStats();
            long totalUser = (long) stats.getTotalUser();
            String a = C3385e.m12591a(totalUser);
            if (C3385e.m12595e(totalUser)) {
                this.f12694D.setText(C3360ae.m12531a(a, 0.6777f, a.length() - 1, a.length()));
            } else {
                this.f12694D.setText(a);
            }
            String a2 = C3385e.m12591a(stats.getTicket());
            if (C3385e.m12595e(stats.getTicket())) {
                this.f12695E.setText(C3360ae.m12531a(a2, 0.6777f, a2.length() - 1, a2.length()));
            } else {
                this.f12695E.setText(a2);
            }
            String a3 = C3385e.m12591a((long) stats.getFollowCount());
            if (C3385e.m12595e((long) stats.getFollowCount())) {
                this.f12696F.setText(C3360ae.m12531a(a3, 0.6777f, a3.length() - 1, a3.length()));
            } else {
                this.f12696F.setText(a3);
            }
            String a4 = C3385e.m12591a((long) stats.getGiftUVCount());
            if (C3385e.m12595e((long) stats.getGiftUVCount())) {
                this.f12697G.setText(C3360ae.m12531a(a4, 0.6777f, a4.length() - 1, a4.length()));
            } else {
                this.f12697G.setText(a4);
            }
            this.f12745l.setRotation(180.0f);
            room.getHealthScoreInfo();
            if (!C9290a.f25466a) {
                m14785c(room);
            }
            User owner = this.f12762y.getOwner();
            if (owner != null && owner.isFollowing()) {
                this.f12760A = true;
            }
            if (C6311g.m19573a(room.getTopFanTickets())) {
                C9738o.m28712b((View) this.f12736c, 8);
            } else {
                this.f12728al.mo12117a(this.f12742i, this, room, this.f12718ab);
                this.f12728al.setTopFansCallBack(new C4391a() {
                    /* renamed from: a */
                    public final void mo12097a() {
                        LiveBroadcastEndFragment.this.f12736c.setVisibility(8);
                    }
                });
            }
            m14784b(room);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        m14788g();
        if (this.f12762y != null) {
            User owner = this.f12762y.getOwner();
            if (owner != null) {
                C5343e.m17031a((ImageView) this.f12707Q, owner.getAvatarThumb(), (int) R.drawable.c4_);
                this.f12708R.setText(owner.getNickName());
            }
            C4253a.m14397a(this.f12724ah, this.f12762y.getId());
            this.f12709S.setVisibility(0);
            if (C9290a.f25466a) {
                this.f12713W.setVisibility(8);
            } else {
                this.f12713W.setVisibility(0);
            }
            if (owner != null && owner.getId() == TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
                TTLiveSDKContext.getHostService().mo22367h().mo22177a(true);
            }
            float a = ((float) C9738o.m28691a(getContext())) / ((float) C9738o.m28709b(getContext()));
            if (owner != null) {
                C5343e.m17039a(this.f12698H, owner.getAvatarLarge(), (C13842b) new C9092w(8, a, null));
            }
            C8448g.m25682a((Context) this.f12742i);
            this.f12762y.getId();
            this.f12710T.setText(R.string.er5);
            TextView textView = this.f12737d;
            if (this.f12739f || C9290a.f25466a) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            C8448g.m25682a((Context) this.f12742i);
            this.f12762y.getId();
            C3913e.m13800a().mo11452a(Integer.valueOf(0));
            ((Boolean) LiveSettingKeys.VIGO_FLAME_DIAMOND_GUIDE_SWITCH.mo10240a()).booleanValue();
            long j = 0;
            if (this.f12762y.getId() > 0 && this.f12762y.getId() == ((Long) C8946b.f24492v.mo22117a()).longValue()) {
                j = Math.max(0, SystemClock.elapsedRealtime() - ((Long) C8946b.f24493w.mo22117a()).longValue());
            }
            C9738o.m28704a(this.f12727ak, (CharSequence) this.f12742i.getResources().getString(R.string.ece, new Object[]{C3363ah.m12541a((int) j)}));
            if (!TextUtils.isEmpty(this.f12720ad)) {
                m14787f();
            }
            this.f12733aq.setVisibility(0);
            C3596c.m13172a(C9295a.class);
            m14786e();
        }
    }

    /* renamed from: a */
    public final void mo12093a(int i, String str) {
        if (SystemClock.elapsedRealtime() - this.f12726aj >= 1000 && this.f12742i != null && !this.f12742i.isFinishing() && this.f12719ac != null && i <= this.f12719ac.size() - 1) {
            C8448g.m25682a((Context) this.f12742i);
            this.f12762y.getId();
            C2360f fVar = (C2360f) this.f12719ac.get(i);
            this.f12726aj = SystemClock.elapsedRealtime();
            TTLiveSDKContext.getHostService().mo22365f().mo22046a(fVar.f7783b, str);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.aqh, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo10494a(Activity activity, Room room, C9297a aVar, String str) {
        this.f12742i = activity;
        this.f12762y = room;
        this.f12763z = true;
        this.f12739f = TTLiveSDKContext.getHostService().mo22361b().mo23190b().mo22767a(Properties.CLICK_RECORD_BUTTON_IN_END_LIVE);
        this.f12725ai = aVar;
        this.f12718ab = str;
    }

    /* renamed from: a */
    private void m14781a(Room room, C2360f fVar, boolean z, String str) {
        String str2;
        if (room != null) {
            Media a = m14778a(fVar);
            if (a != null) {
                String str3 = "anchor_live_ending";
                long id = room.getId();
                long userFrom = room.getUserFrom();
                String requestId = room.getRequestId();
                TTLiveSDKContext.getHostService().mo22367h().mo22179b();
                if (room.isLiveTypeAudio()) {
                    str2 = "voice_live";
                } else {
                    str2 = "video_live";
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_page", str3);
                hashMap.put("event_module", "video");
                hashMap.put("room_id", String.valueOf(id));
                hashMap.put("video_id", String.valueOf(a.getId()));
                hashMap.put("request_id", requestId);
                hashMap.put("log_pb", room.getLog_pb());
                hashMap.put("live_type", str2);
                hashMap.put("source", String.valueOf(userFrom));
                if (a != null) {
                    if (a.getVideoPicNum() > 0) {
                        hashMap.put("video_type", "photofilm");
                    } else {
                        hashMap.put("video_type", "video");
                    }
                    if (a.getMusic() != null) {
                        hashMap.put("music", a.getMusic().f7759d);
                        hashMap.put("music_id", String.valueOf(a.getMusic().f7756a));
                    }
                    if (a.getHashTag() != null) {
                        hashMap.put("hashtag_content", a.getHashTag().f7736b);
                        hashMap.put("hashtag_id", String.valueOf(a.getHashTag().f7735a));
                    }
                }
                C8443c.m25663a().mo21606a("video_show", hashMap, new C8438j().mo21599b("video_view").mo21603f("show"));
            }
        }
    }
}
