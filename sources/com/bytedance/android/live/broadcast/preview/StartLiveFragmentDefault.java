package com.bytedance.android.live.broadcast.preview;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Color;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.C2375g;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.dialog.C2527c;
import com.bytedance.android.live.broadcast.dialog.C2527c.C2528a;
import com.bytedance.android.live.broadcast.dialog.LiveTagPicker;
import com.bytedance.android.live.broadcast.dialog.LiveTagPicker.C2521a;
import com.bytedance.android.live.broadcast.effect.C2581a;
import com.bytedance.android.live.broadcast.effect.C2619g;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.C2624k.C2629a;
import com.bytedance.android.live.broadcast.effect.C2636q;
import com.bytedance.android.live.broadcast.effect.LiveBeautyDialogFragment;
import com.bytedance.android.live.broadcast.effect.LiveBeautyFragment.C2576a;
import com.bytedance.android.live.broadcast.effect.LiveFilterDialogFragment;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.game.SelectGameDialogFragment;
import com.bytedance.android.live.broadcast.game.SelectGameDialogFragment.C2735c;
import com.bytedance.android.live.broadcast.model.C2749a;
import com.bytedance.android.live.broadcast.model.C2750b;
import com.bytedance.android.live.broadcast.model.C2750b.C2751a;
import com.bytedance.android.live.broadcast.monitor.BroadcastMonitor;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.share.AbsStartLiveShareView;
import com.bytedance.android.live.broadcast.share.AbsStartLiveShareView.C2934a;
import com.bytedance.android.live.broadcast.share.C2935a;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3484c;
import com.bytedance.android.live.room.C3494k;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.dialog.C3533b;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3978e;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.event.C4454x;
import com.bytedance.android.livesdk.chatroom.model.C4884aq;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.p368g.p370b.C7853a;
import com.bytedance.android.livesdk.p410o.C8732d;
import com.bytedance.android.livesdk.p410o.C8735f;
import com.bytedance.android.livesdk.p410o.p412b.C8721d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.Properties;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.C9044al;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.IPropertyCache.C9283a;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9349d;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9350e;
import com.bytedance.android.livesdkapi.depend.p442e.C9312a;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.bytedance.android.livesdkapi.host.C9465g;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C9430a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.plugin.PluginType;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.p534b.C10296b;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.ttm.player.MediaPlayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C47559ag;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class StartLiveFragmentDefault extends BaseFragment implements C2521a, C2528a, C2934a, C9350e, C6310a {

    /* renamed from: q */
    private static C6600e f8905q = C2317a.m9932a();

    /* renamed from: A */
    private int f8906A = 109;

    /* renamed from: B */
    private TextView f8907B;

    /* renamed from: C */
    private View f8908C;

    /* renamed from: D */
    private View f8909D;

    /* renamed from: E */
    private View f8910E;

    /* renamed from: F */
    private View f8911F;

    /* renamed from: G */
    private View f8912G;

    /* renamed from: H */
    private View f8913H;

    /* renamed from: I */
    private View f8914I;

    /* renamed from: J */
    private View f8915J;

    /* renamed from: K */
    private View f8916K;

    /* renamed from: L */
    private View f8917L;

    /* renamed from: M */
    private TextView f8918M;

    /* renamed from: N */
    private View f8919N;

    /* renamed from: O */
    private View f8920O;

    /* renamed from: P */
    private TextView f8921P;

    /* renamed from: Q */
    private View f8922Q;

    /* renamed from: R */
    private C2527c f8923R;

    /* renamed from: S */
    private ImageView f8924S;

    /* renamed from: T */
    private TextView f8925T;

    /* renamed from: U */
    private View f8926U;

    /* renamed from: V */
    private ImageView f8927V;

    /* renamed from: W */
    private TextView f8928W;

    /* renamed from: X */
    private TextView f8929X;

    /* renamed from: Y */
    private View f8930Y;

    /* renamed from: Z */
    private View f8931Z;

    /* renamed from: a */
    public Activity f8932a;

    /* renamed from: aa */
    private View f8933aa;

    /* renamed from: ab */
    private CheckedTextView f8934ab;

    /* renamed from: ac */
    private C9245h f8935ac;

    /* renamed from: ad */
    private View f8936ad;

    /* renamed from: ae */
    private AbsStartLiveShareView f8937ae;

    /* renamed from: af */
    private LiveBeautyDialogFragment f8938af;

    /* renamed from: ag */
    private boolean f8939ag;

    /* renamed from: ah */
    private int f8940ah = 1;

    /* renamed from: ai */
    private C10296b f8941ai;

    /* renamed from: aj */
    private int f8942aj = 0;

    /* renamed from: ak */
    private C3978e f8943ak;

    /* renamed from: al */
    private Game f8944al;

    /* renamed from: am */
    private String f8945am;

    /* renamed from: an */
    private C3533b f8946an;

    /* renamed from: ao */
    private ProgressDialog f8947ao;

    /* renamed from: ap */
    private String f8948ap = "";

    /* renamed from: aq */
    private C7321c f8949aq;

    /* renamed from: ar */
    private boolean f8950ar = false;

    /* renamed from: as */
    private OnClickListener f8951as = new C2866ak(this);

    /* renamed from: at */
    private C2585a f8952at = new C2585a() {
        /* renamed from: a */
        public final void mo8810a(int i) {
            if (StartLiveFragmentDefault.this.f8960h != null) {
                StartLiveFragmentDefault.this.f8960h.mo9587b(i);
            }
            C8946b.f24361M.mo22118a(Integer.valueOf(i));
            if (StartLiveFragmentDefault.this.f8960h != null) {
                float a = C2619g.m10718a(C2624k.m10736a().f8419b, i);
                if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo10240a()).booleanValue()) {
                    float f = a / 100.0f;
                    if (((Float) C8946b.f24362N.mo22117a()).floatValue() > f) {
                        StartLiveFragmentDefault.this.f8960h.mo9582a(f);
                        C8946b.f24362N.mo22118a(Float.valueOf(f));
                    }
                } else if (!C6311g.m19573a(C2624k.m10736a().f8419b) && i >= 0 && i < C2624k.m10736a().f8419b.size()) {
                    C9355c b = C2515f.m10417f().mo9075b().mo9212a().mo9322b(C2663f.m10856a("beautyTag", (FilterModel) C2624k.m10736a().f8419b.get(i)));
                    if (!(b == null || b.f25570i == null)) {
                        C2421c a2 = C2515f.m10417f().mo9074a();
                        a2.mo8892a(C2418b.f7953d, b);
                        Float c = a2.mo8899c(b.f25570i.f25589b);
                        if (c == null) {
                            c = Float.valueOf(C2636q.m10771a(b, b.f25570i.f25588a));
                        }
                        int i2 = (int) a;
                        if (c.floatValue() > C2636q.m10771a(b, i2)) {
                            a2.mo8891a(b.f25570i.f25589b, C2636q.m10771a(b, i2));
                        }
                    }
                }
            }
            String str = "";
            List<FilterModel> list = C2624k.m10736a().f8419b;
            if (i < list.size()) {
                str = ((FilterModel) list.get(i)).getFilterId();
            }
            StartLiveFragmentDefault.this.mo9559m();
            if (!C6319n.m19593a(str) && !str.equals("0")) {
                HashMap hashMap = new HashMap();
                hashMap.put("filter_id", str);
                C8443c.m25663a().mo21606a("live_take_filter_select", StartLiveFragmentDefault.this.mo9528a(hashMap), new C8438j().mo21599b("live_take").mo21603f("click").mo21604g("click").mo21598a("live_take_page"));
            }
        }
    };

    /* renamed from: au */
    private boolean f8953au = false;

    /* renamed from: b */
    public View f8954b;

    /* renamed from: c */
    public HSImageView f8955c;

    /* renamed from: d */
    public TextView f8956d;

    /* renamed from: e */
    public C3484c f8957e;

    /* renamed from: f */
    public C2375g f8958f;

    /* renamed from: g */
    public String f8959g;

    /* renamed from: h */
    public C9349d f8960h;

    /* renamed from: i */
    public LiveMode f8961i;

    /* renamed from: j */
    public User f8962j;

    /* renamed from: k */
    public final C47562b f8963k = new C47562b();

    /* renamed from: l */
    public int f8964l = 0;

    /* renamed from: m */
    public List<FilterModel> f8965m;

    /* renamed from: r */
    private C6309f f8966r;

    /* renamed from: s */
    private View f8967s;

    /* renamed from: t */
    private Room f8968t;

    /* renamed from: u */
    private boolean f8969u;

    /* renamed from: v */
    private ImageView f8970v;

    /* renamed from: w */
    private View f8971w;

    /* renamed from: x */
    private HSImageView f8972x;

    /* renamed from: y */
    private EditText f8973y;

    /* renamed from: z */
    private int f8974z;

    /* renamed from: h */
    public final void mo9514h() {
        m11197L();
    }

    /* renamed from: j */
    public final Fragment mo9516j() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9531a(View view) {
        int id = view.getId();
        if (id == R.id.apk) {
            m11205a(1 - this.f8940ah, true);
            return;
        }
        if (id == R.id.x_) {
            this.f8948ap = null;
            if (this.f8960h != null) {
                this.f8960h.mo9581a();
            }
        } else if (id == R.id.ap6) {
            m11228y();
        } else if (id == R.id.d3m) {
            C8443c.m25663a().mo21606a("live_take_beauty_click", mo9528a(new HashMap<>()), new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_page"));
            m11191F();
        } else if (id == R.id.e2b) {
            m11186A();
        } else if (id == R.id.dpq) {
            m11187B();
        } else if (id == R.id.d3r) {
            m11192G();
        } else if (id == R.id.bp2) {
            m11189D();
        } else if (id == R.id.d8o) {
            m11188C();
        } else if (id == R.id.d3w) {
            m11193H();
        } else if (id == R.id.d3q) {
            C8443c.m25663a().mo21606a("live_take_filter_click", mo9528a(new HashMap<>()), new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_page"));
            m11190E();
        } else if (id == R.id.xo) {
            mo9099a((C4884aq) null);
        } else if (id == R.id.d3n) {
            m11198M();
        } else if (id == R.id.bo2 && this.f8959g == null) {
            this.f8957e.mo10473c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9537a(final String str, String str2) {
        this.f8957e.mo10470a();
        File file = new File(str);
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("avatar file don't exists in path ");
            sb.append(str);
            mo9538a((Throwable) new Exception(sb.toString()));
            return;
        }
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedFile("multipart/form-data", file));
        C2515f.m10417f().mo9076c().mo9170e().uploadAvatar(multipartTypedOutput).mo19124a((C47559ag<? super T, ? extends R>) C3303k.m12366a()).mo19137b((C47557ad<? super T>) new C47557ad<C3479d<C2375g>>() {
            public final void onSubscribe(C7321c cVar) {
            }

            public final void onError(Throwable th) {
                StartLiveFragmentDefault.this.mo9538a(th);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C3479d<C2375g> dVar) {
                String str;
                String str2;
                if (!StartLiveFragmentDefault.this.mo8989l()) {
                    StartLiveFragmentDefault.this.f8959g = null;
                    return;
                }
                ((C2375g) dVar.data).f7822c = str;
                C3393m.m12634b(StartLiveFragmentDefault.this.f8955c, ((C2375g) dVar.data).f7822c);
                StartLiveFragmentDefault.this.f8956d.setText(StartLiveFragmentDefault.this.getString(R.string.eq4));
                StartLiveFragmentDefault.this.f8956d.setAlpha(1.0f);
                StartLiveFragmentDefault.this.f8957e.mo10472b();
                if (!TextUtils.isEmpty(((C2375g) dVar.data).f7820a)) {
                    StartLiveFragmentDefault.this.f8958f = (C2375g) dVar.data;
                }
                StartLiveFragmentDefault.this.f8959g = null;
                HashMap hashMap = new HashMap();
                String str3 = "live_type";
                if (StartLiveFragmentDefault.this.f8961i == LiveMode.AUDIO) {
                    str = "voice_live";
                } else {
                    str = "video_live";
                }
                hashMap.put(str3, str);
                String str4 = "anchor_id";
                if (StartLiveFragmentDefault.this.f8962j == null) {
                    str2 = "0";
                } else {
                    str2 = String.valueOf(StartLiveFragmentDefault.this.f8962j.getId());
                }
                hashMap.put(str4, str2);
                C8443c.m25663a().mo21606a("pm_live_photo_upload", hashMap, new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_take_page"));
            }
        });
        this.f8959g = str2;
    }

    /* renamed from: a */
    public final void mo9538a(Throwable th) {
        String errorMsg = th instanceof ApiServerException ? ((ApiServerException) th).getErrorMsg() : null;
        if (TextUtils.isEmpty(errorMsg)) {
            errorMsg = getString(R.string.f_c);
        }
        this.f8959g = null;
        if (mo8989l()) {
            this.f8957e.mo10472b();
            C3517a.m12962a(getContext(), errorMsg);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9536a(String str, DialogInterface dialogInterface, int i) {
        BaseDialogFragment.m12688a((C0608j) this.mFragmentManager, ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11533a(C3979c.m13951a(str).mo11555a((int) C34943c.f91128x).mo11560b((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL)));
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9532a(SelectGameDialogFragment selectGameDialogFragment, Game game) {
        this.f8944al = game;
        m11209a(game);
        selectGameDialogFragment.dismiss();
        if (game == null) {
            this.f8941ai.mo25021a("hotsoon.pref.LAST_SET_GAME", (Object) "").mo25023a();
        } else {
            this.f8941ai.mo25021a("hotsoon.pref.LAST_SET_GAME", (Object) game.toJsonString()).mo25023a();
        }
    }

    /* renamed from: a */
    public final void mo9099a(C4884aq aqVar) {
        this.f8921P.setText(aqVar == null ? getString(R.string.f4d) : aqVar.f13994b);
        this.f8922Q.setVisibility(aqVar == null ? 8 : 0);
        Map map = (Map) C8946b.f24359K.mo22117a();
        map.put(this.f8961i.name(), f8905q.mo15979b((Object) aqVar));
        C8946b.f24359K.mo22118a(map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9534a(C9312a aVar, DialogInterface dialogInterface, int i) {
        aVar.mo22118a(Boolean.valueOf(true));
        m11198M();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9535a(Boolean bool) throws Exception {
        this.f8934ab.setChecked(bool.booleanValue());
        if (bool.booleanValue() && !this.f8953au) {
            this.f8953au = true;
            this.f8934ab.postDelayed(new C2892bj(this), 300);
        }
    }

    /* renamed from: a */
    public final void mo9493a(String str) {
        this.f8948ap = str;
    }

    /* renamed from: a */
    public final void mo9109a(LiveMode liveMode) {
        if (mo8989l()) {
            if (this.f8967s != null) {
                this.f8967s.setClickable(liveMode != LiveMode.VIDEO);
            }
            if (liveMode != this.f8961i) {
                this.f8961i = liveMode;
                if (!(this.f8943ak == null || this.f8943ak.f11853a == null)) {
                    this.f8943ak.f11853a.setVisibility(4);
                }
                if (this.f8929X != null) {
                    this.f8929X.setVisibility(4);
                }
                if (this.f8923R != null && this.f8923R.isShowing()) {
                    this.f8923R.dismiss();
                }
                int i = 8;
                switch (liveMode) {
                    case VIDEO:
                        this.f8921P.setVisibility(0);
                        this.f8970v.setVisibility(0);
                        this.f8971w.setVisibility(8);
                        this.f8909D.setVisibility(0);
                        this.f8910E.setVisibility(8);
                        this.f8930Y.setVisibility(8);
                        this.f8913H.setVisibility(8);
                        this.f8972x.setVisibility(8);
                        this.f8907B.setText(R.string.edi);
                        this.f8918M.setText(R.string.ey4);
                        this.f8931Z.setVisibility(0);
                        this.f8911F.setVisibility(0);
                        break;
                    case AUDIO:
                        this.f8921P.setVisibility(0);
                        this.f8970v.setVisibility(4);
                        this.f8971w.setVisibility(8);
                        this.f8909D.setVisibility(8);
                        this.f8910E.setVisibility(8);
                        this.f8930Y.setVisibility(8);
                        this.f8913H.setVisibility(8);
                        this.f8972x.setVisibility(0);
                        this.f8907B.setText(R.string.edk);
                        this.f8918M.setText(R.string.ey2);
                        this.f8931Z.setVisibility(8);
                        this.f8911F.setVisibility(8);
                        break;
                    case THIRD_PARTY:
                        this.f8921P.setVisibility(0);
                        this.f8970v.setVisibility(4);
                        this.f8971w.setVisibility(0);
                        this.f8909D.setVisibility(8);
                        this.f8910E.setVisibility(8);
                        this.f8930Y.setVisibility(8);
                        this.f8913H.setVisibility(8);
                        this.f8972x.setVisibility(0);
                        this.f8907B.setText(R.string.edl);
                        this.f8918M.setText(R.string.ey3);
                        this.f8931Z.setVisibility(8);
                        this.f8911F.setVisibility(8);
                        break;
                    case SCREEN_RECORD:
                        this.f8921P.setVisibility(8);
                        this.f8970v.setVisibility(4);
                        this.f8971w.setVisibility(0);
                        this.f8909D.setVisibility(8);
                        this.f8910E.setVisibility(0);
                        this.f8930Y.setVisibility(0);
                        this.f8913H.setVisibility(0);
                        m11209a(this.f8944al);
                        m11194I();
                        this.f8972x.setVisibility(0);
                        this.f8907B.setText(R.string.edj);
                        this.f8918M.setText(R.string.ey1);
                        this.f8931Z.setVisibility(8);
                        this.f8911F.setVisibility(8);
                        break;
                }
                C4884aq aqVar = (C4884aq) f8905q.mo15974a((String) ((Map) C8946b.f24359K.mo22117a()).get(this.f8961i.name()), C4884aq.class);
                this.f8921P.setText(aqVar == null ? getString(R.string.f4d) : aqVar.f13994b);
                this.f8922Q.setVisibility(aqVar == null ? 8 : 0);
                View view = this.f8920O;
                if (this.f8961i != LiveMode.SCREEN_RECORD) {
                    i = 0;
                }
                view.setVisibility(i);
                mo9540b();
                if (liveMode != LiveMode.VIDEO) {
                    float a = ((float) C9738o.m28691a(getContext())) / ((float) C9738o.m28709b(getContext()));
                    if (liveMode == LiveMode.AUDIO) {
                        this.f8972x.setBackgroundResource(R.drawable.bsa);
                    } else if (this.f8962j == null || this.f8962j.getAvatarLarge() == null) {
                        this.f8972x.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32748b(ImageRequestBuilder.m40864a((int) R.drawable.c61).mo33473a((C13842b) new C9092w(5, a, null)).mo33476b())).mo32729b(this.f8972x.getController())).mo32730f());
                    } else {
                        C5343e.m17039a(this.f8972x, this.f8962j.getAvatarLarge(), (C13842b) new C9092w(5, a, null));
                    }
                    this.f8972x.setVisibility(0);
                }
                mo9558k();
            }
        }
    }

    /* renamed from: a */
    public final void mo9491a(C9349d dVar) {
        this.f8960h = dVar;
    }

    /* renamed from: a */
    public final void mo9539a(boolean z) {
        if (z) {
            mo9559m();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9533a(C3479d dVar) throws Exception {
        if (!(dVar == null || dVar.data == null)) {
            switch (((C2749a) dVar.data).f8706a) {
                case 0:
                    this.f8956d.setText(getString(R.string.eq5));
                    this.f8956d.setAlpha(1.0f);
                    C3393m.m12633b(this.f8955c, ((C2749a) dVar.data).f8707b);
                    return;
                case 1:
                    this.f8956d.setText(getString(R.string.eq4));
                    this.f8956d.setAlpha(1.0f);
                    C3393m.m12633b(this.f8955c, ((C2749a) dVar.data).f8707b);
                    return;
                default:
                    this.f8956d.setText(getString(R.string.eq3));
                    this.f8956d.setAlpha(0.64f);
                    break;
            }
        }
    }

    /* renamed from: d */
    public final String mo9507d() {
        return LiveCameraResManager.INST.getBeautyFilePath();
    }

    /* renamed from: e */
    public final String mo9509e() {
        return LiveCameraResManager.INST.getFaceReshapeFilePath();
    }

    /* renamed from: g */
    public final int mo9513g() {
        return ((Integer) C8946b.f24477g.mo22119b()).intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo9560n() {
        C3517a.m12960a((Context) this.f8932a, (int) R.string.f3k);
    }

    public void onPause() {
        super.onPause();
        if (!this.f8950ar) {
            this.f8966r.removeMessages(2333);
        }
    }

    /* renamed from: J */
    private boolean m11195J() {
        Boolean bool = (Boolean) this.f8910E.getTag(R.id.dp7);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: N */
    private static float m11199N() {
        return ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * ((Float) C8946b.f24362N.mo22117a()).floatValue();
    }

    /* renamed from: O */
    private static float m11200O() {
        return ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21218b.f21222a * ((Float) C8946b.f24363O.mo22117a()).floatValue();
    }

    /* renamed from: P */
    private static float m11201P() {
        return ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21219c.f21222a * ((Float) C8946b.f24364P.mo22117a()).floatValue();
    }

    /* renamed from: Q */
    private static float m11202Q() {
        return ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21220d.f21222a * ((Float) C8946b.f24365Q.mo22117a()).floatValue();
    }

    /* renamed from: b */
    public final void mo9540b() {
        View view = this.f8914I;
        int i = 8;
        if (!(this.f8921P.getVisibility() == 8 && this.f8954b.getVisibility() == 8)) {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* renamed from: i */
    public final void mo9515i() {
        if (this.f8935ac != null && this.f8935ac.isShowing()) {
            this.f8935ac.dismiss();
        }
    }

    /* renamed from: m */
    public final void mo9559m() {
        if (C2624k.m10736a().mo9270c()) {
            this.f8912G.setVisibility(0);
        } else {
            this.f8912G.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final /* synthetic */ void mo9562q() {
        mo9109a(LiveMode.valueOf((String) C8946b.f24358J.mo22117a()));
        ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).dnsOptimizer().mo10469a(true);
    }

    /* renamed from: A */
    private void m11186A() {
        if (this.f8923R == null) {
            this.f8923R = new C2527c(getContext(), this.f8961i);
            this.f8923R.setOnDismissListener(new C2871ap(this));
        }
        this.f8923R.f8137a = this;
        if (!this.f8923R.isShowing()) {
            this.f8923R.show();
            m11215e(8);
        }
    }

    /* renamed from: F */
    private void m11191F() {
        if (this.f8938af == null) {
            this.f8938af = LiveBeautyDialogFragment.m10555a(new C2576a() {
                /* renamed from: a */
                public final void mo9187a(float f) {
                    if (StartLiveFragmentDefault.this.f8960h != null) {
                        StartLiveFragmentDefault.this.f8960h.mo9582a(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * f);
                    }
                }

                /* renamed from: b */
                public final void mo9188b(float f) {
                    if (StartLiveFragmentDefault.this.f8960h != null) {
                        StartLiveFragmentDefault.this.f8960h.mo9586b(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21218b.f21222a * f);
                    }
                }

                /* renamed from: c */
                public final void mo9189c(float f) {
                    if (StartLiveFragmentDefault.this.f8960h != null) {
                        StartLiveFragmentDefault.this.f8960h.mo9588c(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21219c.f21222a * f);
                    }
                }

                /* renamed from: d */
                public final void mo9190d(float f) {
                    if (StartLiveFragmentDefault.this.f8960h != null) {
                        StartLiveFragmentDefault.this.f8960h.mo9589d(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21220d.f21222a * f);
                    }
                }
            }, this.f8952at, true, 0, true);
            this.f8938af.f8243a = new C2876au(this);
        }
        this.f8938af.show(getChildFragmentManager(), "beauty_filter_dialog_tag");
        m11218f(8);
    }

    /* renamed from: G */
    private void m11192G() {
        SelectGameDialogFragment a = SelectGameDialogFragment.m11009a(this.f8944al);
        a.mo9428a((C2735c) new C2877av(this, a));
        a.f8672a = new C2879ax(this);
        a.show(getChildFragmentManager(), SelectGameDialogFragment.class.getSimpleName());
        m11218f(8);
    }

    /* renamed from: H */
    private void m11193H() {
        Boolean valueOf = Boolean.valueOf(!((Boolean) this.f8910E.getTag(R.id.dp7)).booleanValue());
        this.f8910E.setTag(R.id.dp7, valueOf);
        m11194I();
        this.f8941ai.mo25021a("hotsoon.pref.LAST_SET_LANDSCAPE", (Object) valueOf).mo25023a();
    }

    /* renamed from: K */
    private int m11196K() {
        C4884aq aqVar = (C4884aq) f8905q.mo15974a((String) ((Map) C8946b.f24359K.mo22117a()).get(this.f8961i.name()), C4884aq.class);
        if (aqVar == null) {
            return -1;
        }
        return aqVar.f13993a;
    }

    /* renamed from: R */
    private void m11203R() {
        if (this.f8960h != null) {
            this.f8960h.mo9582a(m11199N());
            this.f8960h.mo9586b(m11200O());
            this.f8960h.mo9588c(m11201P());
            this.f8960h.mo9589d(m11202Q());
        }
    }

    /* renamed from: s */
    private void m11222s() {
        new C9249a(getContext(), 0).mo22716a(true).mo22718b((int) R.string.fde).mo22722b(0, (int) R.string.ecy, (DialogInterface.OnClickListener) new C2896bn(this)).mo22722b(1, (int) R.string.eci, C2897bo.f9124a).mo22720b().show();
    }

    /* renamed from: f */
    public final List<Pair<String, String>> mo9512f() {
        ArrayList arrayList = new ArrayList();
        for (FilterModel filterModel : C2624k.m10736a().f8419b) {
            arrayList.add(new Pair(filterModel.getName(), filterModel.getFilterPath()));
        }
        return arrayList;
    }

    /* renamed from: B */
    private void m11187B() {
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "click");
        hashMap.put("event_page", "live_take_page");
        hashMap.put("event_module", "location");
        hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
        C8443c.m25663a().mo21606a("remind_location_click", hashMap, new Object[0]);
        if (getActivity() != null) {
            C8735f.m26105a(getActivity()).mo21742a(C2872aq.f9097a).mo21744b(C2873ar.f9098a).mo21743a(new C8721d() {
                /* renamed from: a */
                public final void mo9567a(String... strArr) {
                    StartLiveFragmentDefault.this.f8954b.setVisibility(8);
                    StartLiveFragmentDefault.this.mo9540b();
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_belong", "live");
                    hashMap.put("event_type", "pv");
                    hashMap.put("event_page", "live_take_page");
                    hashMap.put("enter_from", "live_take_page");
                    hashMap.put("source", "location");
                    hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
                    hashMap.put("is_success", "1");
                    C8443c.m25663a().mo21606a("location_feedback", hashMap, new C8438j().mo21599b("live").mo21603f("pv"));
                }

                /* renamed from: b */
                public final void mo9568b(String... strArr) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_belong", "live");
                    hashMap.put("event_type", "pv");
                    hashMap.put("event_page", "live_take_page");
                    hashMap.put("enter_from", "live_take_page");
                    hashMap.put("source", "location");
                    hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
                    hashMap.put("is_success", "0");
                    C8443c.m25663a().mo21606a("location_feedback", hashMap, new Object[0]);
                }
            }, "android.permission.ACCESS_FINE_LOCATION");
        }
    }

    /* renamed from: C */
    private void m11188C() {
        int i;
        C8443c.m25663a().mo21607a("room_tag_button_click", new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_take_page"));
        C4884aq aqVar = (C4884aq) f8905q.mo15974a((String) ((Map) C8946b.f24359K.mo22117a()).get(this.f8961i.name()), C4884aq.class);
        if (aqVar == null) {
            i = -1;
        } else {
            i = aqVar.f13993a;
        }
        LiveTagPicker a = LiveTagPicker.m10440a(i);
        a.f8123a = new C2874as(this);
        a.show((C0608j) this.mFragmentManager, "TAG_PICKER");
        m11218f(8);
    }

    /* renamed from: E */
    private void m11190E() {
        if (isAdded() && getChildFragmentManager().mo2644a("filter_dialog_tag") == null) {
            LiveFilterDialogFragment liveFilterDialogFragment = null;
            if (this.f8960h != null && !TextUtils.isEmpty(null)) {
                liveFilterDialogFragment = LiveFilterDialogFragment.m10592a(this.f8952at, null, true, true);
            }
            if (liveFilterDialogFragment == null && this.f8965m != null) {
                liveFilterDialogFragment = LiveFilterDialogFragment.m10593a(this.f8952at, this.f8965m, true);
            }
            if (liveFilterDialogFragment == null) {
                liveFilterDialogFragment = LiveFilterDialogFragment.m10594a(this.f8952at, true);
            }
            liveFilterDialogFragment.f8275a = new C2875at(this);
            liveFilterDialogFragment.show(getChildFragmentManager(), "filter_dialog_tag");
            m11218f(8);
        }
    }

    /* renamed from: I */
    private void m11194I() {
        Boolean bool = (Boolean) this.f8910E.getTag(R.id.dp7);
        if (bool == null) {
            bool = Boolean.valueOf(this.f8941ai.mo25024a("hotsoon.pref.LAST_SET_LANDSCAPE", true));
            this.f8910E.setTag(R.id.dp7, bool);
        }
        if (!bool.booleanValue()) {
            this.f8927V.setImageResource(R.drawable.cb0);
            this.f8928W.setText(R.string.f49);
            return;
        }
        this.f8927V.setImageResource(R.drawable.caz);
        this.f8928W.setText(R.string.f46);
    }

    /* renamed from: L */
    private void m11197L() {
        if (PluginType.LiveResource.isInstalled()) {
            mo9545c();
        } else if (!C2903bu.m11386a(this.f8932a)) {
            C3517a.m12960a((Context) this.f8932a, (int) R.string.efr);
        } else if (NetworkUtils.m19550d(this.f8932a) == NetworkType.MOBILE_2G) {
            C3517a.m12960a((Context) this.f8932a, (int) R.string.f8e);
        } else if (this.f8964l <= 3) {
            PluginType.LiveResource.checkInstall(getContext(), new C9430a() {
                /* renamed from: a */
                public final void mo8840a(String str) {
                    if (!C2902bt.m11385a(StartLiveFragmentDefault.this.f8932a)) {
                        C3517a.m12960a((Context) StartLiveFragmentDefault.this.f8932a, (int) R.string.efr);
                    } else if (NetworkUtils.m19550d(StartLiveFragmentDefault.this.f8932a) == NetworkType.MOBILE_2G) {
                        C3517a.m12960a((Context) StartLiveFragmentDefault.this.f8932a, (int) R.string.f8e);
                    } else {
                        StartLiveFragmentDefault.this.mo9545c();
                    }
                }
            });
        }
    }

    /* renamed from: S */
    private void m11204S() {
        if (mo8989l()) {
            this.f8956d.setText(getString(R.string.eq3));
            this.f8956d.setAlpha(0.64f);
            this.f8963k.mo119661a(C2515f.m10417f().mo9076c().mo9171f().anchorCoverStatus().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C2889bg<Object>(this), C2891bi.f9117a));
        }
    }

    /* renamed from: u */
    private void m11224u() {
        ((C9439a) C3596c.m13172a(C9439a.class)).mo23190b().mo22765a((C9283a) Properties.LAST_SHARE_CHANNEL, this.f8948ap);
        C8946b.f24489s.mo22118a(this.f8948ap);
        C8443c.m25663a().mo21607a("live_action", new Object[0]);
        if (this.f8968t != null) {
            if (!PluginType.LiveResource.isInstalled()) {
                PluginType.LiveResource.checkInstall(this.f8932a, new C9430a() {
                    /* renamed from: a */
                    public final void mo8840a(String str) {
                        PluginType.LiveResource.load(StartLiveFragmentDefault.this.f8932a, true);
                        StartLiveFragmentDefault.this.mo9529a();
                    }
                });
            } else {
                mo9529a();
            }
        }
    }

    /* renamed from: v */
    private void m11225v() {
        if (this.f8932a != null) {
            if (this.f8946an == null) {
                C3534a aVar = new C3534a(this.f8932a);
                aVar.mo10654a((CharSequence) getString(R.string.fez)).mo10659b((int) R.string.ecm, (DialogInterface.OnClickListener) new C2898bp(this)).mo10649a((int) R.string.few, (DialogInterface.OnClickListener) new C2899bq(this)).mo10658b((int) R.string.fex);
                aVar.mo10650a((OnCancelListener) new C2900br(this));
                this.f8946an = aVar.mo10657a();
                this.f8946an.setCanceledOnTouchOutside(true);
            }
            this.f8946an.show();
            C8448g.m25682a((Context) this.f8932a);
        }
    }

    /* renamed from: w */
    private void m11226w() {
        IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
        if (this.f8932a != null && a != null) {
            this.f8963k.mo119661a(C2515f.m10417f().mo9076c().mo9167b().getBanUserInfo().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C2868am<Object>(this), C2869an.f9094a));
        }
    }

    /* renamed from: z */
    private void m11229z() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int intValue = ((Integer) C8946b.f24491u.mo22117a()).intValue();
            if (C8732d.m26098b((Context) activity, "android.permission.ACCESS_FINE_LOCATION")) {
                this.f8954b.setVisibility(8);
                C8946b.f24491u.mo22118a(Integer.valueOf(0));
            } else if (intValue <= 5) {
                this.f8954b.setVisibility(0);
                this.f8954b.setOnClickListener(this.f8951as);
                C8946b.f24491u.mo22118a(Integer.valueOf(intValue + 1));
            } else {
                this.f8939ag = true;
            }
            mo9540b();
        }
    }

    /* renamed from: c */
    public final void mo9545c() {
        if (!LiveCameraResManager.INST.isLoadedRes()) {
            PluginType.LiveResource.preload();
            if (this.f8935ac == null) {
                this.f8935ac = new C9249a(getContext(), 2).mo22713a((OnDismissListener) new C2880ay(this)).mo22729d();
            }
            LiveCameraResManager.INST.isLoadedRes.observe(this, new C2881az(this));
        }
    }

    /* renamed from: k */
    public final void mo9558k() {
        if (this.f8933aa != null) {
            IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
            if (C9290a.f25466a || a == null || !a.isEnableShowCommerceSale() || this.f8961i != LiveMode.VIDEO) {
                this.f8933aa.setVisibility(8);
                return;
            }
            this.f8933aa.setVisibility(0);
            ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).liveCommerceService().mo10500b(Long.valueOf(a.getId())).mo19280a((C7326g<? super T>) new C2887be<Object>(this), (C7326g<? super Throwable>) new C2888bf<Object>(this));
        }
    }

    public void onDestroyView() {
        if (!this.f8950ar) {
            C2624k.m10736a().mo9268b((C2629a) new C2895bm(this));
            if (this.f8923R != null && this.f8923R.isShowing()) {
                this.f8923R.dismiss();
                this.f8923R.f8137a = null;
            }
            if (this.f8935ac != null && this.f8935ac.isShowing()) {
                this.f8935ac.dismiss();
            }
            if (this.f8957e != null) {
                this.f8957e.mo10472b();
                this.f8957e = null;
            }
            this.f8923R = null;
            if (this.f8949aq != null && !this.f8949aq.isDisposed()) {
                this.f8949aq.dispose();
            }
            this.f8959g = null;
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11539a(this.f8943ak);
            this.f8963k.mo119660a();
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        if (!this.f8950ar) {
            if (this.f8969u) {
                m11224u();
                this.f8969u = false;
            }
            m11203R();
            if (!this.f8939ag) {
                if (!C8732d.m26098b((Context) getActivity(), "android.permission.ACCESS_FINE_LOCATION") && (this.f8938af == null || this.f8938af.getDialog() == null || !this.f8938af.getDialog().isShowing())) {
                    this.f8954b.setVisibility(0);
                    this.f8954b.setOnClickListener(this.f8951as);
                    mo9540b();
                }
            }
            this.f8954b.setVisibility(8);
            mo9540b();
        }
    }

    /* renamed from: D */
    private void m11189D() {
        if (this.f8961i == LiveMode.SCREEN_RECORD) {
            C8443c.m25663a().mo21607a("game_take_guide", new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_take_page"));
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(getContext(), C3979c.m13952b("https://hotsoon.snssdk.com/falcon/live_inroom/page/game_course/index.html").mo11550a(C3358ac.m12515a((int) R.string.f77)));
            return;
        }
        ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(getContext(), C3979c.m13952b("https://hotsoon.snssdk.com/falcon/live_inroom/page/obs_course/index.html").mo11550a(C3358ac.m12515a((int) R.string.eyl)));
        C8443c.m25663a().mo21607a("thirdparty_take_guide", new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_page"));
    }

    /* renamed from: M */
    private void m11198M() {
        IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
        if (a != null) {
            C9312a aVar = new C9312a("has_show_commodity_dialog", Boolean.valueOf(false));
            if (((Boolean) aVar.mo22117a()).booleanValue()) {
                ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).liveCommerceService().mo10499a(Long.valueOf(a.getId())).mo19280a((C7326g<? super T>) new C2883ba<Object>(this), (C7326g<? super Throwable>) new C2884bb<Object>(this));
            } else {
                new C3534a(this.f8932a).mo10648a((int) R.string.f3t).mo10658b((int) R.string.f3s).mo10649a((int) R.string.f3r, (DialogInterface.OnClickListener) new C2885bc(this, aVar)).mo10659b((int) R.string.f3q, C2886bd.f9112a).mo10656a(false).mo10657a().show();
            }
        }
    }

    /* renamed from: t */
    private void m11223t() {
        ((C3495l) C3596c.m13172a(C3495l.class)).setCurrentRoom(this.f8968t);
        this.f8969u = C2935a.m11413a(this.f8932a, this.f8948ap, this.f8968t);
        C8946b.f24489s.mo22118a(this.f8948ap);
        String str = this.f8948ap;
        if (C6319n.m19594a(this.f8948ap, "weixin_moment")) {
            str = "weixin_moment";
        }
        C8448g.m25682a((Context) this.f8932a);
        this.f8968t.getId();
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_interact");
        hashMap.put("event_page", "live_take_page");
        hashMap.put("room_id", String.valueOf(this.f8968t.getId()));
        hashMap.put("platform", str);
        C8443c.m25663a().mo21606a("live_take_share", hashMap, new Object[0]);
        if (!this.f8969u) {
            m11224u();
            return;
        }
        int intValue = ((Integer) LiveSettingKeys.START_LIVE_SHARE_TIMEOUT.mo10240a()).intValue();
        if (intValue > 0) {
            this.f8966r.sendEmptyMessageDelayed(2333, ((long) intValue) * 1000);
        }
    }

    /* renamed from: x */
    private boolean m11227x() {
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(getActivity(), C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f6_)).mo22188a(-1).mo22193d("video_take").mo22194e("open_live").mo22192c("bottom_tab").mo22190a()).mo19189a((C7498y<? super T>) new C8986g<IUser>() {
                public final void onSubscribe(C7321c cVar) {
                    super.onSubscribe(cVar);
                    StartLiveFragmentDefault.this.f8963k.mo119661a(cVar);
                }
            });
            return false;
        } else if (!C2903bu.m11386a(this.f8932a)) {
            C3517a.m12960a((Context) this.f8932a, (int) R.string.efr);
            return false;
        } else if (NetworkUtils.m19550d(this.f8932a) == NetworkType.MOBILE_2G) {
            C3517a.m12960a((Context) this.f8932a, (int) R.string.f8e);
            return false;
        } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(getActivity(), C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f6_)).mo22188a(-1).mo22193d("video_take").mo22194e("open_live").mo22192c("bottom_tab").mo22190a()).mo19189a((C7498y<? super T>) new C8986g<IUser>() {
                public final void onSubscribe(C7321c cVar) {
                    super.onSubscribe(cVar);
                    StartLiveFragmentDefault.this.f8963k.mo119661a(cVar);
                }
            });
            return false;
        } else if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a().childrenManagerForbidCreateLiveRoom()) {
            return true;
        } else {
            C3517a.m12960a((Context) this.f8932a, (int) R.string.ede);
            return false;
        }
    }

    /* renamed from: y */
    private void m11228y() {
        String str;
        boolean z;
        this.f8906A = 10001;
        if (m11227x()) {
            if (this.f8961i != LiveMode.THIRD_PARTY || m11196K() != -1) {
                if (this.f8961i.isStreamingBackground) {
                    Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
                    if (currentRoom != null && ((currentRoom.isScreenshot && this.f8961i == LiveMode.SCREEN_RECORD) || (currentRoom.isThirdParty && this.f8961i == LiveMode.THIRD_PARTY))) {
                        this.f8968t = currentRoom;
                        m11224u();
                        return;
                    }
                }
                long j = 0;
                if (this.f8961i == LiveMode.SCREEN_RECORD) {
                    if (VERSION.SDK_INT >= 21) {
                        Game game = this.f8944al;
                        if (game == null) {
                            C9049ap.m27022a((int) R.string.fdc);
                            this.f8913H.performClick();
                            return;
                        }
                        j = game.gameId;
                        if (BgBroadcastServiceImpl.getProjection() == null) {
                            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
                            if (mediaProjectionManager == null) {
                                C9049ap.m27022a((int) R.string.fda);
                                return;
                            } else {
                                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 20001);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                long j2 = j;
                this.f8906A = 109;
                if (this.f8947ao == null) {
                    this.f8947ao = C9044al.m27010a(this.f8932a, getString(R.string.ehh));
                }
                if (!this.f8947ao.isShowing()) {
                    this.f8947ao.show();
                }
                String obj = this.f8973y.getText().toString();
                m11211b(obj);
                C3494k roomManager = ((C3495l) C3596c.m13172a(C3495l.class)).roomManager();
                C6309f fVar = this.f8966r;
                if (this.f8958f == null) {
                    str = null;
                } else {
                    str = (String) this.f8958f.f7821b.get(0);
                }
                String str2 = str;
                LiveMode liveMode = this.f8961i;
                int K = m11196K();
                if (this.f8961i != LiveMode.VIDEO || this.f8934ab == null || !this.f8934ab.isChecked()) {
                    z = false;
                } else {
                    z = true;
                }
                roomManager.mo10516a(fVar, obj, str2, liveMode, K, j2, z, 1);
                C8448g.m25682a((Context) this.f8932a);
            } else if (getActivity() != null) {
                new C9249a(getActivity(), 0).mo22716a(false).mo22727c((CharSequence) getActivity().getString(R.string.f_r)).mo22722b(0, (int) R.string.ecj, (DialogInterface.OnClickListener) new C2870ao(this)).mo22729d();
            }
        }
    }

    /* renamed from: r */
    private void m11221r() {
        this.f8972x = (HSImageView) this.f8967s.findViewById(R.id.cmu);
        this.f8916K = this.f8967s.findViewById(R.id.e2c);
        this.f8918M = (TextView) this.f8967s.findViewById(R.id.e2b);
        this.f8918M.setOnClickListener(this.f8951as);
        this.f8970v = (ImageView) this.f8967s.findViewById(R.id.apk);
        this.f8970v.setOnClickListener(this.f8951as);
        this.f8971w = this.f8967s.findViewById(R.id.bp2);
        this.f8971w.setOnClickListener(this.f8951as);
        this.f8919N = this.f8967s.findViewById(R.id.x_);
        this.f8919N.setOnClickListener(this.f8951as);
        this.f8917L = this.f8967s.findViewById(R.id.da0);
        this.f8973y = (EditText) this.f8967s.findViewById(R.id.bq4);
        this.f8914I = this.f8967s.findViewById(R.id.dgd);
        this.f8954b = this.f8967s.findViewById(R.id.dpq);
        this.f8920O = this.f8967s.findViewById(R.id.d8p);
        this.f8921P = (TextView) this.f8967s.findViewById(R.id.d8o);
        this.f8921P.setOnClickListener(this.f8951as);
        this.f8922Q = this.f8967s.findViewById(R.id.xo);
        this.f8922Q.setOnClickListener(this.f8951as);
        this.f8915J = this.f8967s.findViewById(R.id.e1t);
        this.f8937ae = (AbsStartLiveShareView) this.f8967s.findViewById(R.id.ecv);
        this.f8908C = this.f8967s.findViewById(R.id.d3o);
        this.f8909D = this.f8967s.findViewById(R.id.d3m);
        this.f8909D.setOnClickListener(this.f8951as);
        this.f8910E = this.f8967s.findViewById(R.id.d3w);
        this.f8910E.setOnClickListener(this.f8951as);
        this.f8911F = this.f8967s.findViewById(R.id.d3q);
        this.f8911F.setOnClickListener(this.f8951as);
        this.f8912G = this.f8967s.findViewById(R.id.b3h);
        this.f8913H = this.f8967s.findViewById(R.id.d3r);
        this.f8913H.setOnClickListener(this.f8951as);
        this.f8931Z = this.f8967s.findViewById(R.id.d40);
        this.f8933aa = this.f8967s.findViewById(R.id.d3n);
        this.f8933aa.setOnClickListener(this.f8951as);
        this.f8934ab = (CheckedTextView) this.f8967s.findViewById(R.id.a0p);
        this.f8924S = (ImageView) this.f8967s.findViewById(R.id.d3s);
        this.f8926U = this.f8967s.findViewById(R.id.d3t);
        this.f8925T = (TextView) this.f8967s.findViewById(R.id.d3u);
        this.f8927V = (ImageView) this.f8967s.findViewById(R.id.d3x);
        this.f8928W = (TextView) this.f8967s.findViewById(R.id.d3y);
        this.f8930Y = this.f8967s.findViewById(R.id.d41);
        this.f8907B = (TextView) this.f8967s.findViewById(R.id.ap6);
        this.f8907B.setOnClickListener(this.f8951as);
        this.f8929X = (TextView) this.f8967s.findViewById(R.id.dx1);
        this.f8955c = (HSImageView) this.f8967s.findViewById(R.id.bo2);
        this.f8955c.setImageResource(R.drawable.bxn);
        this.f8955c.setOnClickListener(this.f8951as);
        this.f8956d = (TextView) this.f8967s.findViewById(R.id.dwz);
        this.f8936ad = this.f8967s.findViewById(R.id.bo3);
        if (this.f8974z != 0) {
            m11214d(this.f8974z);
        } else {
            m11214d(20);
        }
        if (!this.f8950ar) {
            this.f8962j.getAvatarMedium();
            m11229z();
            this.f8918M.setVisibility(0);
            this.f8916K.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo9529a() {
        Class cls;
        try {
            Activity activity = this.f8932a;
            if (this.f8961i.isStreamingBackground) {
                cls = ((IHostApp) C3596c.m13172a(IHostApp.class)).getHostActivity(6);
            } else {
                cls = ((IHostApp) C3596c.m13172a(IHostApp.class)).getHostActivity(5);
            }
            Intent intent = new Intent(activity, cls);
            if (LiveMode.THIRD_PARTY == this.f8961i || LiveMode.SCREEN_RECORD == this.f8961i) {
                C8946b.f24405ad.mo22118a(Boolean.valueOf(false));
            }
            if (LiveMode.SCREEN_RECORD == this.f8961i) {
                intent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", m11195J());
            }
            C8946b.f24358J.mo22118a(this.f8961i.name());
            this.f8932a.startActivity(intent);
            ((C3495l) C3596c.m13172a(C3495l.class)).setCurrentRoom(this.f8968t);
            ((C9439a) C3596c.m13172a(C9439a.class)).mo23189a().mo23110a(true);
            this.f8932a.finish();
            this.f8932a.overridePendingTransition(0, 0);
            ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).startLiveManager().mo9650a();
        } catch (Exception unused) {
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onEvent(C4454x xVar) {
        mo9558k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo9546c(DialogInterface dialogInterface) {
        m11218f(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo9554f(DialogInterface dialogInterface) {
        m11215e(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo9556g(DialogInterface dialogInterface) {
        m11218f(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo9557h(DialogInterface dialogInterface) {
        C8448g.m25682a((Context) this.f8932a);
    }

    /* renamed from: f */
    private void m11218f(int i) {
        this.f8908C.setVisibility(i);
        this.f8907B.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo9481a(int i) {
        this.f8974z = i;
    }

    /* renamed from: b */
    public final void mo9497b(int i) {
        C8946b.f24477g.mo22120b(Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo9550d(DialogInterface dialogInterface) {
        m11218f(0);
    }

    /* renamed from: d */
    private void m11214d(int i) {
        this.f8973y.setFilters(new InputFilter[]{new LengthFilter(i)});
    }

    /* renamed from: a */
    public final HashMap<String, String> mo9528a(HashMap<String, String> hashMap) {
        long j;
        if (this.f8968t != null) {
            j = this.f8968t.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo9549c(Throwable th) throws Exception {
        C9076n.m27095a(this.f8932a, th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo9553e(DialogInterface dialogInterface) {
        m11218f(0);
    }

    /* renamed from: c */
    private boolean m11213c(String str) {
        if (!isAdded()) {
            return false;
        }
        Fragment a = getChildFragmentManager().mo2644a(str);
        if (a != null && (a instanceof DialogFragment)) {
            DialogFragment dialogFragment = (DialogFragment) a;
            if (dialogFragment.getDialog() != null && dialogFragment.getDialog().isShowing()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9541b(DialogInterface dialogInterface) {
        m11218f(0);
    }

    /* renamed from: a */
    private void m11209a(Game game) {
        if (game == null) {
            this.f8926U.setVisibility(0);
            this.f8924S.setVisibility(8);
            this.f8925T.setText(R.string.f44);
            return;
        }
        this.f8926U.setVisibility(8);
        this.f8924S.setVisibility(0);
        C5343e.m17030a(this.f8924S, game.icon);
        this.f8925T.setText(game.name);
    }

    /* renamed from: b */
    private static void m11211b(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", "click");
        hashMap.put("event_belong", "live");
        hashMap.put("event_page", "live_action");
        hashMap.put("event_module", "title");
        hashMap.put("live_edit_type", "title");
        String str3 = "title_status";
        if (str.length() == 0) {
            str2 = "off";
        } else {
            str2 = "on";
        }
        hashMap.put(str3, str2);
        C8443c.m25663a().mo21606a("live_edit_features", hashMap, new Object[0]);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("event_type", "click");
        hashMap2.put("event_belong", "live");
        hashMap2.put("event_page", "live_action");
        hashMap2.put("event_module", "action");
        hashMap2.put("is_beauty", "off");
        C8443c.m25663a().mo21606a("live_action", hashMap2, new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo9552d(Throwable th) throws Exception {
        C9076n.m27095a(this.f8932a, th);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f8932a = getActivity();
        this.f8966r = new C6309f(this);
        if (!this.f8950ar) {
            this.f8957e = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).createImagePicker(this.f8932a, this, "cover", 1, 1, 750, 750, new C2867al(this));
            C8448g.m25682a((Context) this.f8932a);
            this.f8967s.post(new C2878aw(this));
            this.f8937ae.mo9667a(getActivity(), this);
            C2624k.m10736a().mo9261a((C2629a) new C2890bh(this));
            C2624k.m10736a().mo9267b();
            this.f8931Z.setVisibility(0);
            this.f8911F.setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m11215e(int i) {
        int i2;
        int i3;
        this.f8917L.setVisibility(i);
        this.f8915J.setVisibility(i);
        this.f8937ae.setVisibility(i);
        this.f8973y.setVisibility(i);
        if (i != 0) {
            this.f8929X.setVisibility(i);
        }
        m11208a((View) this.f8956d, i);
        m11208a((View) this.f8955c, i);
        m11208a(this.f8936ad, i);
        if (i == 0) {
            if (this.f8961i == LiveMode.SCREEN_RECORD) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            this.f8920O.setVisibility(i2);
            this.f8921P.setVisibility(i2);
            C4884aq aqVar = (C4884aq) f8905q.mo15974a((String) ((Map) C8946b.f24359K.mo22117a()).get(this.f8961i.name()), C4884aq.class);
            View view = this.f8922Q;
            if (i2 != 0 || aqVar == null) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            view.setVisibility(i3);
            if (!this.f8939ag) {
                if (!C8732d.m26098b((Context) getActivity(), "android.permission.ACCESS_FINE_LOCATION") && (this.f8938af == null || this.f8938af.getDialog() == null || !this.f8938af.getDialog().isShowing())) {
                    this.f8954b.setVisibility(0);
                    this.f8954b.setOnClickListener(this.f8951as);
                }
            }
            this.f8954b.setVisibility(8);
        } else {
            this.f8920O.setVisibility(i);
            this.f8922Q.setVisibility(i);
            this.f8921P.setVisibility(i);
            this.f8954b.setVisibility(i);
        }
        mo9540b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo9548c(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            if (this.f8942aj > 3) {
                if (mo8989l()) {
                    C9049ap.m27022a((int) R.string.f3w);
                }
                if (this.f8935ac != null && this.f8935ac.isShowing()) {
                    this.f8935ac.dismiss();
                }
            } else {
                LiveCameraResManager.INST.loadResources();
                this.f8942aj++;
            }
        } else if (this.f8935ac != null && this.f8935ac.isShowing()) {
            this.f8935ac.dismiss();
        }
    }

    public void handleMsg(Message message) {
        boolean z = false;
        if (message.obj instanceof Exception) {
            Exception exc = (Exception) message.obj;
            if (message.what == 1) {
                if (mo8989l()) {
                    if (this.f8947ao != null) {
                        this.f8947ao.dismiss();
                    }
                    if (exc instanceof ApiServerException) {
                        int errorCode = ((ApiServerException) exc).getErrorCode();
                        if (errorCode != 10018) {
                            switch (errorCode) {
                                case 30010:
                                    m11225v();
                                    break;
                                case 30011:
                                    m11222s();
                                    break;
                                default:
                                    C9076n.m27096a((Context) this.f8932a, (Throwable) exc, (int) R.string.ehi);
                                    break;
                            }
                        } else {
                            m11226w();
                        }
                    } else {
                        C9076n.m27096a((Context) this.f8932a, (Throwable) exc, (int) R.string.ehi);
                    }
                }
                C8448g.m25682a((Context) this.f8932a);
                if (this.f8961i == LiveMode.AUDIO) {
                    z = true;
                }
                BroadcastMonitor.m11027a(exc, z);
            }
        } else if (message.what == 1) {
            this.f8968t = (Room) message.obj;
            if (!Room.isValid(this.f8968t)) {
                if (this.f8947ao != null) {
                    this.f8947ao.dismiss();
                }
                IllegalStateException illegalStateException = new IllegalStateException("invalid room");
                C9076n.m27096a((Context) this.f8932a, (Throwable) illegalStateException, (int) R.string.ehi);
                if (this.f8961i == LiveMode.AUDIO) {
                    z = true;
                }
                BroadcastMonitor.m11027a(illegalStateException, z);
                return;
            }
            m11206a(this.f8968t.getId());
        } else {
            if (message.what == 2333) {
                m11224u();
            }
        }
    }

    /* renamed from: a */
    private void m11206a(long j) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (this.f8947ao != null && this.f8947ao.isShowing()) {
            this.f8947ao.dismiss();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_take");
        hashMap.put("event_type", "click");
        hashMap.put("enter_from", this.f8945am);
        hashMap.put("event_page", "live_take_page");
        hashMap.put("room_id", String.valueOf(this.f8968t.getId()));
        String str10 = "live_type";
        if (this.f8968t.isLiveTypeAudio()) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put(str10, str);
        hashMap.put("streaming_type", this.f8961i.logStreamingType);
        if (this.f8961i == LiveMode.SCREEN_RECORD) {
            Game game = this.f8944al;
            if (game != null) {
                hashMap.put("game_name", game.name);
            }
        }
        C8443c.m25663a().mo21606a("live_take", hashMap, new Object[0]);
        if (this.f8973y.getText() != null && !TextUtils.isEmpty(this.f8973y.getText())) {
            HashMap hashMap2 = new HashMap();
            String str11 = "live_type";
            if (this.f8968t.isLiveTypeAudio()) {
                str9 = "voice_live";
            } else {
                str9 = "video_live";
            }
            hashMap2.put(str11, str9);
            hashMap2.put("streaming_type", this.f8961i.logStreamingType);
            C8443c.m25663a().mo21606a("pm_live_take_title_write", hashMap2, new C8438j().mo21599b("live_take").mo21603f("other").mo21598a("live_take_page"), new C8439k());
        }
        C2619g.m10719a(j);
        float floatValue = ((Float) C8946b.f24362N.mo22117a()).floatValue() * 100.0f;
        float floatValue2 = ((Float) C8946b.f24363O.mo22117a()).floatValue() * 100.0f;
        float floatValue3 = ((Float) C8946b.f24364P.mo22117a()).floatValue() * 100.0f;
        float floatValue4 = ((Float) C8946b.f24365Q.mo22117a()).floatValue() * 100.0f;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("event_page", "live_take_page");
        String str12 = "live_type";
        if (this.f8968t.isLiveTypeAudio()) {
            str2 = "voice_live";
        } else {
            str2 = "video_live";
        }
        hashMap3.put(str12, str2);
        hashMap3.put("streaming_type", this.f8961i.logStreamingType);
        hashMap3.put("anchor_id", String.valueOf(this.f8962j.getId()));
        String str13 = "is_tag";
        if (m11196K() == -1) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        hashMap3.put(str13, str3);
        String str14 = "is_beauty";
        if (this.f8961i == LiveMode.VIDEO && !(floatValue == 0.0f && floatValue2 == 0.0f && floatValue3 == 0.0f && floatValue4 == 0.0f)) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        hashMap3.put(str14, str4);
        String str15 = "beauty_white";
        if (this.f8961i != LiveMode.VIDEO) {
            str5 = "0";
        } else {
            str5 = String.valueOf(floatValue);
        }
        hashMap3.put(str15, str5);
        String str16 = "beauty_skin";
        if (this.f8961i != LiveMode.VIDEO) {
            str6 = "0";
        } else {
            str6 = String.valueOf(floatValue2);
        }
        hashMap3.put(str16, str6);
        String str17 = "beauty_bigeye";
        if (this.f8961i != LiveMode.VIDEO) {
            str7 = "0";
        } else {
            str7 = String.valueOf(floatValue3);
        }
        hashMap3.put(str17, str7);
        String str18 = "beauty_facethin";
        if (this.f8961i != LiveMode.VIDEO) {
            str8 = "0";
        } else {
            str8 = String.valueOf(floatValue4);
        }
        hashMap3.put(str18, str8);
        C8443c.m25663a().mo21606a("pm_live_take_edit_features", hashMap3, new C8438j().mo21599b("live_take").mo21603f("click"));
        if (TextUtils.isEmpty(this.f8948ap)) {
            m11224u();
        } else {
            m11223t();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9543b(C3479d dVar) throws Exception {
        CharSequence charSequence;
        String str;
        C2751a aVar = ((C2750b) dVar.data).f8713a;
        if (aVar != null) {
            if (aVar.f8717d) {
                charSequence = C3358ac.m12515a((int) R.string.epc);
                if (charSequence == 0) {
                    return;
                }
            } else {
                int i = (int) (((aVar.f8714a - (dVar.extra.now / 1000)) + ((long) ((C2750b) dVar.data).f8713a.f8715b)) / 60);
                if (i < 60) {
                    str = C3358ac.m12516a(R.plurals.a2, i, Integer.valueOf(i));
                } else if (i < 1440) {
                    i /= 60;
                    str = C3358ac.m12516a(R.plurals.a1, i, Integer.valueOf(i));
                } else {
                    i /= 1440;
                    str = C3358ac.m12516a(R.plurals.a0, i, Integer.valueOf(i));
                }
                String valueOf = String.valueOf(i);
                if (str != null) {
                    String[] split = str.split(valueOf);
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ff2200")), split[0].length(), split[0].length() + valueOf.length(), 33);
                    charSequence = spannableString;
                } else {
                    return;
                }
            }
            new C9249a(getContext()).mo22727c(charSequence).mo22722b(0, (int) R.string.epd, (DialogInterface.OnClickListener) new C2894bl(this, Uri.parse((String) LiveConfigSettingKeys.LIVE_BLOCKED_DETAIL_URL.mo10240a()).buildUpon().appendQueryParameter("id", String.valueOf(aVar.f8718e)).build().toString())).mo22720b().show();
            C8443c.m25663a().mo21607a("pm_live_take_banpopup_show", new C8438j().mo21599b("live_take").mo21603f("show").mo21598a("live_take_page"), new C8439k());
        }
    }

    /* renamed from: c */
    public final void mo9504c(int i) {
        boolean c = m11213c("beauty_filter_dialog_tag");
        boolean c2 = m11213c("filter_dialog_tag");
        if (!c && !c2) {
            String str = "";
            List<FilterModel> list = C2624k.m10736a().f8419b;
            if (i < list.size()) {
                str = ((FilterModel) list.get(i)).getFilterId();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", "draw");
            hashMap.put("filter_id", str);
            C8443c.m25663a().mo21606a("live_take_filter_select", mo9528a(hashMap), new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_page"));
            C8946b.f24361M.mo22118a(Integer.valueOf(i));
            float a = C2619g.m10718a(C2624k.m10736a().f8419b, i);
            if (((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo10240a()).booleanValue()) {
                if (!C6311g.m19573a(C2624k.m10736a().f8419b) && i >= 0 && i < C2624k.m10736a().f8419b.size()) {
                    C9355c b = C2515f.m10417f().mo9075b().mo9212a().mo9322b(C2663f.m10856a("beautyTag", (FilterModel) C2624k.m10736a().f8419b.get(i)));
                    if (b != null) {
                        C2421c a2 = C2515f.m10417f().mo9074a();
                        a2.mo8892a(C2418b.f7953d, b);
                        int i2 = (int) a;
                        if (a2.mo8899c(b.f25570i.f25589b).floatValue() > C2636q.m10771a(b, i2)) {
                            a2.mo8891a(b.f25570i.f25589b, C2636q.m10771a(b, i2));
                        }
                    }
                }
            } else if (m11199N() > (((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * a) / 100.0f) {
                float f = a / 100.0f;
                this.f8960h.mo9582a(f);
                C8946b.f24362N.mo22118a(Float.valueOf(f));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9544b(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            final BaseDialogFragment a = ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).liveCommerceService().mo10498a(this.f8932a, null);
            a.getLifecycle().mo55a(new C0042h() {
                @C0054q(mo125a = Event.ON_RESUME)
                public void onResume() {
                    a.getDialog().setOnDismissListener(new C2901bs(this));
                }

                /* access modifiers changed from: 0000 */
                /* renamed from: a */
                public final /* synthetic */ void mo9563a(DialogInterface dialogInterface) {
                    StartLiveFragmentDefault.this.mo9558k();
                }
            });
            a.show((C0608j) this.mFragmentManager, "LIVE_SHOP_EDIT");
            return;
        }
        C3517a.m12960a((Context) this.f8932a, (int) R.string.f3l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9530a(DialogInterface dialogInterface) {
        if (!LiveCameraResManager.INST.isLoadedRes()) {
            if (this.f8960h != null) {
                this.f8960h.mo9581a();
            } else if (getActivity() != null) {
                getActivity().finish();
            }
        }
    }

    /* renamed from: a */
    private static void m11208a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo9547c(DialogInterface dialogInterface, int i) {
        C3596c.m13172a(C9465g.class);
        startActivityForResult(null, 23456);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo9555f(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f8959g == null) {
            this.f8957e.mo10473c();
        }
    }

    /* renamed from: a */
    private void m11205a(int i, boolean z) {
        C8443c.m25663a().mo21607a("camera_switch", new C8438j().mo21598a("live_take_page").mo21599b("live").mo21603f("click"));
        this.f8940ah = i;
        C8946b.f24477g.mo22120b(Integer.valueOf(this.f8940ah));
        if (this.f8960h != null) {
            this.f8960h.mo9583a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo9551d(DialogInterface dialogInterface, int i) {
        C8448g.m25682a((Context) this.f8932a);
        this.f8946an.dismiss();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f8941ai = C10296b.m30493a(getContext());
        String a = this.f8941ai.mo25022a("hotsoon.pref.LAST_SET_GAME", (String) null);
        if (!TextUtils.isEmpty(a)) {
            this.f8944al = Game.fromJson(a);
        }
        m11221r();
        C2581a.m10600a();
        m11204S();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9542b(DialogInterface dialogInterface, int i) {
        int i2;
        dialogInterface.dismiss();
        if (this.mFragmentManager != null) {
            C4884aq aqVar = (C4884aq) f8905q.mo15974a((String) ((Map) C8946b.f24359K.mo22117a()).get(this.f8961i.name()), C4884aq.class);
            if (aqVar == null) {
                i2 = -1;
            } else {
                i2 = aqVar.f13993a;
            }
            LiveTagPicker a = LiveTagPicker.m10440a(i2);
            a.f8123a = new C2893bk(this);
            a.show((C0608j) this.mFragmentManager, "TAG_PICKER");
            m11218f(8);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f8950ar) {
            if (i != 20001 || VERSION.SDK_INT < 21) {
                C3596c.m13172a(C9465g.class);
                if (i2 != 0) {
                    this.f8957e.mo10471a(i, i2, intent);
                } else if (i == 10001) {
                    m11228y();
                } else {
                    if (i == 10002) {
                        m11191F();
                    }
                }
            } else {
                if (i2 == -1) {
                    MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
                    if (mediaProjectionManager != null) {
                        MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(i2, intent);
                        if (mediaProjection != null) {
                            BgBroadcastServiceImpl.setProjection(mediaProjection);
                            m11228y();
                            return;
                        }
                    }
                }
                C9049ap.m27022a((int) R.string.fda);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8967s = LayoutInflater.from(getContext()).inflate(R.layout.aqu, viewGroup, false);
        if (C3596c.m13172a(C3592a.class) == null || ((C3592a) C3596c.m13172a(C3592a.class)).user() == null) {
            C9049ap.m27022a((int) R.string.ejm);
            getActivity().finish();
            this.f8950ar = true;
        } else {
            this.f8962j = (User) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
            if (this.f8962j.getId() != ((Long) C8946b.f24356H.mo22117a()).longValue()) {
                C8946b.f24356H.mo22118a(Long.valueOf(this.f8962j.getId()));
                C8946b.f24358J.mo22118a(LiveMode.VIDEO.name());
            }
        }
        C9097a.m27146a().mo22266a(C4454x.class).mo19293a(C3303k.m12369a((Fragment) this)).mo19325f((C7326g<? super T>) new C7326g<C4454x>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C4454x xVar) throws Exception {
                StartLiveFragmentDefault.this.onEvent(xVar);
            }
        });
        return this.f8967s;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m11210a(String str, String str2, String str3, String str4) {
        CharSequence charSequence;
        if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
            charSequence = "system_position";
        } else if (str.equals("android.permission.READ_PHONE_STATE")) {
            charSequence = "call";
        } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
            charSequence = "save";
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C8438j jVar = new C8438j();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(null)) {
                jVar.mo21601d(null);
            }
            if (!TextUtils.isEmpty(str4)) {
                jVar.mo21604g(str4);
            }
            hashMap.put("popup_type", charSequence);
            C8443c.m25663a().mo21606a("system_popup", hashMap, jVar.mo21599b("video").mo21603f(str2));
        }
    }
}
