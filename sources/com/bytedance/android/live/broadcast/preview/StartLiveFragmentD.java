package com.bytedance.android.live.broadcast.preview;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
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
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.dialog.C2527c;
import com.bytedance.android.live.broadcast.dialog.C2527c.C2528a;
import com.bytedance.android.live.broadcast.dialog.LiveTagPicker;
import com.bytedance.android.live.broadcast.dialog.LiveTagPicker.C2521a;
import com.bytedance.android.live.broadcast.effect.C2581a;
import com.bytedance.android.live.broadcast.effect.C2619g;
import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.C2624k.C2629a;
import com.bytedance.android.live.broadcast.effect.LiveBeautyDialogFragment;
import com.bytedance.android.live.broadcast.effect.LiveBeautyFragment.C2576a;
import com.bytedance.android.live.broadcast.effect.LiveFilterDialogFragment;
import com.bytedance.android.live.broadcast.effect.adapter.LiveFilterAdapter.C2585a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.model.C2750b;
import com.bytedance.android.live.broadcast.model.C2750b.C2751a;
import com.bytedance.android.live.broadcast.monitor.BroadcastMonitor;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.broadcast.share.AbsStartLiveShareView;
import com.bytedance.android.live.broadcast.share.AbsStartLiveShareView.C2934a;
import com.bytedance.android.live.broadcast.share.C2935a;
import com.bytedance.android.live.broadcast.viewmodel.StartLiveBannerViewModel;
import com.bytedance.android.live.broadcast.widget.C3115k;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.performance.C3222b;
import com.bytedance.android.live.core.performance.TimeCostUtil;
import com.bytedance.android.live.core.performance.TimeCostUtil.Tag;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3409v;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3494k;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.dialog.C3533b;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.browser.p193c.C3972b;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3977d;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3978e;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.event.C4454x;
import com.bytedance.android.livesdk.chatroom.model.C4884aq;
import com.bytedance.android.livesdk.chatroom.model.C4899c.C4900a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.p368g.p370b.C7853a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.Properties;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.C9044al;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdk.utils.C9083u;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdk.widget.C9245h;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.IPropertyCache.C9283a;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9349d;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9350e;
import com.bytedance.android.livesdkapi.host.C9439a;
import com.bytedance.android.livesdkapi.host.C9465g;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C9430a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.android.livesdkapi.plugin.PluginType;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.p534b.C10296b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.gson.C6600e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

public class StartLiveFragmentD extends BaseFragment implements C2521a, C2528a, C2629a, C2934a, C9350e, C6310a {

    /* renamed from: i */
    private static C6600e f8817i = C2317a.m9932a();

    /* renamed from: A */
    private View f8818A;

    /* renamed from: B */
    private View f8819B;

    /* renamed from: C */
    private View f8820C;

    /* renamed from: D */
    private View f8821D;

    /* renamed from: E */
    private View f8822E;

    /* renamed from: F */
    private View f8823F;

    /* renamed from: G */
    private TextView f8824G;

    /* renamed from: H */
    private View f8825H;

    /* renamed from: I */
    private View f8826I;

    /* renamed from: J */
    private TextView f8827J;

    /* renamed from: K */
    private View f8828K;

    /* renamed from: L */
    private C2527c f8829L;

    /* renamed from: M */
    private ImageView f8830M;

    /* renamed from: N */
    private TextView f8831N;

    /* renamed from: O */
    private View f8832O;

    /* renamed from: P */
    private ImageView f8833P;

    /* renamed from: Q */
    private TextView f8834Q;

    /* renamed from: R */
    private TextView f8835R;

    /* renamed from: S */
    private View f8836S;

    /* renamed from: T */
    private View f8837T;

    /* renamed from: U */
    private View f8838U;

    /* renamed from: V */
    private CheckedTextView f8839V;

    /* renamed from: W */
    private C9245h f8840W;

    /* renamed from: X */
    private HSImageView f8841X;

    /* renamed from: Y */
    private View f8842Y;

    /* renamed from: Z */
    private TextView f8843Z;

    /* renamed from: a */
    public Activity f8844a;

    /* renamed from: aA */
    private final TextWatcher f8845aA = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            StartLiveFragmentD.this.f8874c = 32;
            Editable text = StartLiveFragmentD.this.f8873b.getText();
            if (text == null) {
                str = "";
            } else {
                str = text.toString();
            }
            int trimmedLength = TextUtils.getTrimmedLength(str);
            if (trimmedLength > StartLiveFragmentD.this.f8874c) {
                StartLiveFragmentD.this.mo9488a(StartLiveFragmentD.this.f8873b, str.length());
            } else {
                StartLiveFragmentD.this.mo9487a(StartLiveFragmentD.this.f8873b);
            }
            if (trimmedLength > StartLiveFragmentD.this.f8874c) {
                C9049ap.m27026a(StartLiveFragmentD.this.getContext(), StartLiveFragmentD.this.getString(R.string.ens, Integer.valueOf(StartLiveFragmentD.this.f8874c)));
                String substring = str.substring(0, StartLiveFragmentD.this.f8874c);
                StartLiveFragmentD.this.f8873b.setText(substring);
                StartLiveFragmentD.this.f8873b.setSelection(substring.length());
            }
        }
    };

    /* renamed from: aB */
    private InputFilter f8846aB;

    /* renamed from: aa */
    private C3115k f8847aa;

    /* renamed from: ab */
    private String f8848ab;

    /* renamed from: ac */
    private AbsStartLiveShareView f8849ac;

    /* renamed from: ad */
    private LiveBeautyDialogFragment f8850ad;

    /* renamed from: ae */
    private boolean f8851ae;

    /* renamed from: af */
    private LiveMode f8852af;

    /* renamed from: ag */
    private int f8853ag = 1;

    /* renamed from: ah */
    private C10296b f8854ah;

    /* renamed from: ai */
    private User f8855ai;

    /* renamed from: aj */
    private int f8856aj = 0;

    /* renamed from: ak */
    private StartLiveBannerViewModel f8857ak;

    /* renamed from: al */
    private C3978e f8858al;

    /* renamed from: am */
    private C4900a f8859am;

    /* renamed from: an */
    private Game f8860an;

    /* renamed from: ao */
    private String f8861ao;

    /* renamed from: ap */
    private C3533b f8862ap;

    /* renamed from: aq */
    private ProgressDialog f8863aq;

    /* renamed from: ar */
    private String f8864ar = "";

    /* renamed from: as */
    private C7321c f8865as;

    /* renamed from: at */
    private boolean f8866at = false;

    /* renamed from: au */
    private boolean f8867au = false;

    /* renamed from: av */
    private boolean f8868av = true;

    /* renamed from: aw */
    private C7321c f8869aw;

    /* renamed from: ax */
    private OnClickListener f8870ax = new C2914j(this);

    /* renamed from: ay */
    private C2585a f8871ay = new C2585a() {
        /* renamed from: a */
        public final void mo8810a(int i) {
            if (StartLiveFragmentD.this.f8876e != null) {
                StartLiveFragmentD.this.f8876e.mo9587b(i);
            }
            C8946b.f24361M.mo22118a(Integer.valueOf(i));
            if (StartLiveFragmentD.this.f8876e != null) {
                float a = C2619g.m10718a(C2624k.m10736a().f8419b, i) / 100.0f;
                if (((Float) C8946b.f24362N.mo22117a()).floatValue() > a) {
                    StartLiveFragmentD.this.f8876e.mo9582a(a);
                    C8946b.f24362N.mo22118a(Float.valueOf(a));
                }
            }
            String str = "";
            List<FilterModel> list = C2624k.m10736a().f8419b;
            if (i < list.size()) {
                str = ((FilterModel) list.get(i)).getFilterId();
            }
            StartLiveFragmentD.this.mo9517k();
            if (!C6319n.m19593a(str) && !str.equals("0")) {
                HashMap hashMap = new HashMap();
                hashMap.put("filter_id", str);
                C8443c.m25663a().mo21606a("live_take_filter_select", StartLiveFragmentD.this.mo9479a(hashMap), new C8438j().mo21599b("live_take").mo21603f("click").mo21604g("click").mo21598a("live_take_page"));
            }
        }
    };

    /* renamed from: az */
    private boolean f8872az = false;

    /* renamed from: b */
    public EditText f8873b;

    /* renamed from: c */
    public int f8874c;

    /* renamed from: d */
    public View f8875d;

    /* renamed from: e */
    public C9349d f8876e;

    /* renamed from: f */
    public final C47562b f8877f = new C47562b();

    /* renamed from: g */
    public int f8878g = 0;

    /* renamed from: h */
    public List<FilterModel> f8879h;

    /* renamed from: j */
    private C6309f f8880j;

    /* renamed from: k */
    private View f8881k;

    /* renamed from: l */
    private Room f8882l;

    /* renamed from: m */
    private boolean f8883m;

    /* renamed from: q */
    private ImageView f8884q;

    /* renamed from: r */
    private View f8885r;

    /* renamed from: s */
    private HSImageView f8886s;

    /* renamed from: t */
    private int f8887t = 109;

    /* renamed from: u */
    private TextView f8888u;

    /* renamed from: v */
    private View f8889v;

    /* renamed from: w */
    private View f8890w;

    /* renamed from: x */
    private View f8891x;

    /* renamed from: y */
    private View f8892y;

    /* renamed from: z */
    private View f8893z;

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragmentD$9 */
    class C28079 implements C0042h {

        /* renamed from: a */
        final /* synthetic */ BaseDialogFragment f8903a;

        /* renamed from: b */
        final /* synthetic */ StartLiveFragmentD f8904b;

        @C0054q(mo125a = Event.ON_RESUME)
        public void onResume() {
            this.f8903a.getDialog().setOnDismissListener(new C2864ai(this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo9526a(DialogInterface dialogInterface) {
            this.f8904b.mo9503c();
        }
    }

    /* renamed from: h */
    public final void mo9514h() {
        m11106E();
    }

    /* renamed from: j */
    public final Fragment mo9516j() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9484a(View view) {
        int id = view.getId();
        if (id == R.id.apk) {
            m11111a(1 - this.f8853ag, true);
            return;
        }
        if (id == R.id.x_) {
            this.f8864ar = null;
            if (this.f8876e != null) {
                this.f8876e.mo9581a();
            }
        } else if (id == R.id.ap6) {
            m11130x();
        } else if (id == R.id.d3m) {
            C8443c.m25663a().mo21606a("live_take_beauty_click", mo9479a(new HashMap<>()), new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_page"));
            m11102A();
        } else if (id == R.id.bp2) {
            m11131y();
        } else if (id == R.id.d3q) {
            if (!C2865aj.m11378a(this.f8844a)) {
                C3517a.m12960a((Context) this.f8844a, (int) R.string.eyf);
            }
            C8443c.m25663a().mo21606a("live_take_filter_click", mo9479a(new HashMap<>()), new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_page"));
            m11132z();
        } else if (id == R.id.bo2 && this.f8847aa != null) {
            this.f8847aa.mo9933c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9485a(View view, boolean z) {
        if (this.f8869aw != null && !this.f8869aw.isDisposed()) {
            this.f8869aw.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9489a(C3479d dVar) throws Exception {
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
                Context context = getContext();
                if (context == null) {
                    context = C3358ac.m12528e();
                }
                Resources resources = context.getResources();
                int i = (int) (((aVar.f8714a - (dVar.extra.now / 1000)) + ((long) ((C2750b) dVar.data).f8713a.f8715b)) / 60);
                if (i < 60) {
                    str = C9078p.m27100a(resources.getQuantityString(R.plurals.a2, i), Integer.valueOf(i));
                } else if (i < 1440) {
                    i /= 60;
                    str = C9078p.m27100a(resources.getQuantityString(R.plurals.a1, i), Integer.valueOf(i));
                } else {
                    i /= 1440;
                    str = C9078p.m27100a(resources.getQuantityString(R.plurals.a0, i), Integer.valueOf(i));
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
            new C9249a(getContext()).mo22727c(charSequence).mo22722b(0, (int) R.string.epd, (DialogInterface.OnClickListener) new C2856aa(this, Uri.parse((String) LiveConfigSettingKeys.LIVE_BLOCKED_DETAIL_URL.mo10240a()).buildUpon().appendQueryParameter("id", String.valueOf(aVar.f8718e)).build().toString())).mo22720b().show();
            C8443c.m25663a().mo21607a("pm_live_take_banpopup_show", new C8438j().mo21599b("live_take").mo21603f("show").mo21598a("live_take_page"), new C8439k());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9494a(String str, DialogInterface dialogInterface, int i) {
        ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a((Context) getActivity(), C3979c.m13952b(str).mo11551a(true).mo11550a(getContext().getResources().getString(R.string.ec2)));
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9483a(DialogInterface dialogInterface, int i) {
        int i2;
        dialogInterface.dismiss();
        if (this.mFragmentManager != null) {
            C4884aq aqVar = (C4884aq) f8817i.mo15974a((String) ((Map) C8946b.f24359K.mo22117a()).get(this.f8852af.name()), C4884aq.class);
            if (aqVar == null) {
                i2 = -1;
            } else {
                i2 = aqVar.f13993a;
            }
            LiveTagPicker a = LiveTagPicker.m10440a(i2);
            a.f8123a = new C2930z(this);
            a.show((C0608j) this.mFragmentManager, "TAG_PICKER");
            m11119d(8);
        }
    }

    /* renamed from: a */
    public final void mo9099a(C4884aq aqVar) {
        this.f8827J.setText(aqVar == null ? getString(R.string.f4d) : aqVar.f13994b);
        this.f8828K.setVisibility(aqVar == null ? 8 : 0);
        Map map = (Map) C8946b.f24359K.mo22117a();
        map.put(this.f8852af.name(), f8817i.mo15979b((Object) aqVar));
        C8946b.f24359K.mo22118a(map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9492a(Boolean bool) throws Exception {
        this.f8839V.setChecked(bool.booleanValue());
        if (bool.booleanValue() && !this.f8872az) {
            this.f8872az = true;
            this.f8839V.postDelayed(new C2929y(this), 300);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9495a(Throwable th) throws Exception {
        C9076n.m27095a(this.f8844a, th);
    }

    /* renamed from: a */
    public final void mo9493a(String str) {
        this.f8864ar = str;
    }

    /* renamed from: a */
    public final void mo9109a(LiveMode liveMode) {
        if (mo8989l()) {
            if (this.f8881k != null) {
                this.f8881k.setClickable(liveMode != LiveMode.VIDEO);
            }
            if (liveMode != this.f8852af) {
                this.f8852af = liveMode;
                if (!(this.f8858al == null || this.f8858al.f11853a == null)) {
                    this.f8858al.f11853a.setVisibility(4);
                }
                if (this.f8835R != null) {
                    this.f8835R.setVisibility(8);
                }
                String str = this.f8852af == LiveMode.AUDIO ? "1" : this.f8852af == LiveMode.VIDEO ? "2" : this.f8852af == LiveMode.SCREEN_RECORD ? "3" : "4";
                this.f8857ak.mo9784a(str);
                if (this.f8829L != null && this.f8829L.isShowing()) {
                    this.f8829L.dismiss();
                }
                switch (liveMode) {
                    case VIDEO:
                        this.f8885r.setVisibility(8);
                        this.f8891x.setVisibility(8);
                        this.f8836S.setVisibility(8);
                        this.f8818A.setVisibility(8);
                        this.f8886s.setVisibility(8);
                        this.f8888u.setText(R.string.edi);
                        break;
                    case AUDIO:
                        this.f8827J.setVisibility(0);
                        this.f8884q.setVisibility(4);
                        this.f8885r.setVisibility(8);
                        this.f8890w.setVisibility(8);
                        this.f8891x.setVisibility(8);
                        this.f8836S.setVisibility(8);
                        this.f8818A.setVisibility(8);
                        this.f8886s.setVisibility(0);
                        this.f8888u.setText(R.string.edi);
                        this.f8824G.setText(R.string.ey2);
                        this.f8837T.setVisibility(8);
                        this.f8892y.setVisibility(8);
                        break;
                    case THIRD_PARTY:
                        this.f8827J.setVisibility(0);
                        this.f8884q.setVisibility(4);
                        this.f8885r.setVisibility(0);
                        this.f8890w.setVisibility(8);
                        this.f8891x.setVisibility(8);
                        this.f8836S.setVisibility(8);
                        this.f8818A.setVisibility(8);
                        this.f8886s.setVisibility(0);
                        this.f8888u.setText(R.string.edi);
                        this.f8824G.setText(R.string.ey3);
                        this.f8837T.setVisibility(8);
                        this.f8892y.setVisibility(8);
                        break;
                    case SCREEN_RECORD:
                        this.f8827J.setVisibility(8);
                        this.f8884q.setVisibility(4);
                        this.f8885r.setVisibility(0);
                        this.f8890w.setVisibility(8);
                        this.f8891x.setVisibility(0);
                        this.f8836S.setVisibility(0);
                        this.f8818A.setVisibility(0);
                        m11114a(this.f8860an);
                        m11103B();
                        this.f8886s.setVisibility(0);
                        this.f8888u.setText(R.string.edi);
                        this.f8824G.setText(R.string.ey1);
                        this.f8837T.setVisibility(8);
                        this.f8892y.setVisibility(8);
                        break;
                }
                if (liveMode != LiveMode.VIDEO) {
                    float a = ((float) C9738o.m28691a(getContext())) / ((float) C9738o.m28709b(getContext()));
                    if (liveMode == LiveMode.AUDIO) {
                        this.f8886s.setBackgroundResource(R.drawable.bsa);
                    } else if (this.f8855ai == null || this.f8855ai.getAvatarLarge() == null) {
                        this.f8886s.setController(((C13382e) ((C13382e) C13380c.m39166a().mo32748b(ImageRequestBuilder.m40864a((int) R.drawable.c61).mo33473a((C13842b) new C9092w(5, a, null)).mo33476b())).mo32729b(this.f8886s.getController())).mo32730f());
                    } else {
                        C5343e.m17039a(this.f8886s, this.f8855ai.getAvatarLarge(), (C13842b) new C9092w(5, a, null));
                    }
                    this.f8886s.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9491a(C9349d dVar) {
        this.f8876e = dVar;
    }

    /* renamed from: a */
    public final void mo9249a(boolean z) {
        if (z) {
            mo9517k();
        }
    }

    /* renamed from: a */
    public final void mo9488a(EditText editText, int i) {
        this.f8846aB = new LengthFilter(i);
        editText.setFilters(new InputFilter[]{this.f8846aB});
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
    /* renamed from: m */
    public final /* synthetic */ void mo9518m() {
        C3517a.m12960a((Context) this.f8844a, (int) R.string.f3k);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f8847aa != null) {
            this.f8847aa.mo9932b();
        }
    }

    public void onPause() {
        super.onPause();
        if (!this.f8866at) {
            this.f8880j.removeMessages(2333);
        }
    }

    /* renamed from: C */
    private boolean m11104C() {
        Boolean bool = (Boolean) this.f8891x.getTag(R.id.dp7);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: F */
    private static float m11107F() {
        return ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21218b.f21222a * ((Float) C8946b.f24363O.mo22117a()).floatValue();
    }

    /* renamed from: G */
    private static float m11108G() {
        return ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21219c.f21222a * ((Float) C8946b.f24364P.mo22117a()).floatValue();
    }

    /* renamed from: H */
    private static float m11109H() {
        return ((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21220d.f21222a * ((Float) C8946b.f24365Q.mo22117a()).floatValue();
    }

    /* renamed from: i */
    public final void mo9515i() {
        if (this.f8840W != null && this.f8840W.isShowing()) {
            this.f8840W.dismiss();
        }
    }

    /* renamed from: k */
    public final void mo9517k() {
        if (C2624k.m10736a().mo9270c()) {
            this.f8893z.setVisibility(0);
        } else {
            this.f8893z.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo9519n() {
        mo9109a(LiveMode.valueOf((String) C8946b.f24358J.mo22117a()));
        ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).dnsOptimizer().mo10469a(true);
    }

    /* renamed from: A */
    private void m11102A() {
        if (this.f8850ad == null) {
            this.f8850ad = LiveBeautyDialogFragment.m10555a(new C2576a() {
                /* renamed from: a */
                public final void mo9187a(float f) {
                    if (StartLiveFragmentD.this.f8876e != null) {
                        StartLiveFragmentD.this.f8876e.mo9582a(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * f);
                    }
                }

                /* renamed from: b */
                public final void mo9188b(float f) {
                    if (StartLiveFragmentD.this.f8876e != null) {
                        StartLiveFragmentD.this.f8876e.mo9586b(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21218b.f21222a * f);
                    }
                }

                /* renamed from: c */
                public final void mo9189c(float f) {
                    if (StartLiveFragmentD.this.f8876e != null) {
                        StartLiveFragmentD.this.f8876e.mo9588c(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21219c.f21222a * f);
                    }
                }

                /* renamed from: d */
                public final void mo9190d(float f) {
                    if (StartLiveFragmentD.this.f8876e != null) {
                        StartLiveFragmentD.this.f8876e.mo9589d(((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21220d.f21222a * f);
                    }
                }
            }, this.f8871ay, true, 0, true);
            this.f8850ad.f8243a = new C2921q(this);
        }
        Fragment a = getChildFragmentManager().mo2644a("beauty_filter_dialog_tag");
        if (!this.f8851ae && a == null) {
            this.f8851ae = true;
            this.f8850ad.show(getChildFragmentManager(), "beauty_filter_dialog_tag");
            m11119d(8);
        }
    }

    /* renamed from: D */
    private int m11105D() {
        C4884aq aqVar = (C4884aq) f8817i.mo15974a((String) ((Map) C8946b.f24359K.mo22117a()).get(this.f8852af.name()), C4884aq.class);
        if (aqVar == null) {
            return -1;
        }
        return aqVar.f13993a;
    }

    /* renamed from: I */
    private void m11110I() {
        if (this.f8876e != null) {
            this.f8876e.mo9582a(0.0f);
            this.f8876e.mo9586b(m11107F());
            this.f8876e.mo9588c(m11108G());
            this.f8876e.mo9589d(m11109H());
            this.f8876e.mo9587b(((Integer) C8946b.f24361M.mo22117a()).intValue());
        }
    }

    /* renamed from: o */
    private void m11121o() {
        if (!((Boolean) LiveSettingKeys.LIVE_START_BROADCAST_COVER.mo10240a()).booleanValue()) {
            this.f8822E.setVisibility(0);
            this.f8823F.setVisibility(4);
            this.f8873b.setSingleLine();
            this.f8847aa.mo9926a(8);
        }
    }

    /* renamed from: q */
    private void m11123q() {
        if (mo8989l()) {
            if (this.f8869aw != null && !this.f8869aw.isDisposed()) {
                this.f8869aw.dispose();
            }
            this.f8869aw = C2515f.m10417f().mo9076c().mo9169d().getLatestRoom().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2857ab<Object>(this), C2858ac.f9085a);
        }
    }

    /* renamed from: r */
    private void m11124r() {
        new C9249a(getContext(), 0).mo22716a(true).mo22718b((int) R.string.fde).mo22722b(0, (int) R.string.ecy, (DialogInterface.OnClickListener) new C2859ad(this)).mo22722b(1, (int) R.string.eci, C2860ae.f9087a).mo22720b().show();
    }

    /* renamed from: f */
    public final List<Pair<String, String>> mo9512f() {
        ArrayList arrayList = new ArrayList();
        for (FilterModel filterModel : C2624k.m10736a().f8419b) {
            arrayList.add(new Pair(filterModel.getName(), filterModel.getFilterPath()));
        }
        return arrayList;
    }

    public void onResume() {
        super.onResume();
        if (!this.f8866at) {
            if (this.f8883m) {
                m11126t();
                this.f8883m = false;
            }
            TimeCostUtil.m12209c(Tag.CreateStartLivePreview);
            C3222b.m12218a().mo10134a(Tag.CreateStartLivePreview.name());
        }
    }

    /* renamed from: B */
    private void m11103B() {
        Boolean bool = (Boolean) this.f8891x.getTag(R.id.dp7);
        if (bool == null) {
            bool = Boolean.valueOf(this.f8854ah.mo25024a("hotsoon.pref.LAST_SET_LANDSCAPE", true));
            this.f8891x.setTag(R.id.dp7, bool);
        }
        if (!bool.booleanValue()) {
            this.f8833P.setImageResource(R.drawable.cb0);
            this.f8834Q.setText(R.string.f49);
            return;
        }
        this.f8833P.setImageResource(R.drawable.caz);
        this.f8834Q.setText(R.string.f46);
    }

    /* renamed from: E */
    private void m11106E() {
        if (PluginType.LiveResource.isInstalled()) {
            mo9496b();
        } else if (!C2865aj.m11378a(this.f8844a)) {
            C3517a.m12960a((Context) this.f8844a, (int) R.string.efr);
        } else if (NetworkUtils.m19550d(this.f8844a) == NetworkType.MOBILE_2G) {
            C3517a.m12960a((Context) this.f8844a, (int) R.string.f8e);
        } else if (this.f8878g <= 3) {
            PluginType.LiveResource.checkInstall(getContext(), new C9430a() {
                /* renamed from: a */
                public final void mo8840a(String str) {
                    if (!C2863ah.m11377a(StartLiveFragmentD.this.f8844a)) {
                        C3517a.m12960a((Context) StartLiveFragmentD.this.f8844a, (int) R.string.efr);
                    } else if (NetworkUtils.m19550d(StartLiveFragmentD.this.f8844a) == NetworkType.MOBILE_2G) {
                        C3517a.m12960a((Context) StartLiveFragmentD.this.f8844a, (int) R.string.f8e);
                    } else {
                        StartLiveFragmentD.this.mo9496b();
                    }
                }
            });
        }
    }

    /* renamed from: t */
    private void m11126t() {
        ((C9439a) C3596c.m13172a(C9439a.class)).mo23190b().mo22765a((C9283a) Properties.LAST_SHARE_CHANNEL, this.f8864ar);
        C8946b.f24489s.mo22118a(this.f8864ar);
        C8443c.m25663a().mo21607a("live_action", new Object[0]);
        if (this.f8882l != null) {
            if (!PluginType.LiveResource.isInstalled()) {
                PluginType.LiveResource.checkInstall(this.f8844a, new C9430a() {
                    /* renamed from: a */
                    public final void mo8840a(String str) {
                        if (C3596c.m13172a(IHostPlugin.class) != null && !((IHostPlugin) C3596c.m13172a(IHostPlugin.class)).isFull()) {
                            ((IHostPlugin) C3596c.m13172a(IHostPlugin.class)).preload(PluginType.LiveResource.getPackageName());
                        }
                        PluginType.LiveResource.load(StartLiveFragmentD.this.f8844a, false);
                        StartLiveFragmentD.this.mo9480a();
                    }
                });
            } else {
                mo9480a();
            }
        }
    }

    /* renamed from: u */
    private void m11127u() {
        if (this.f8844a != null) {
            if (this.f8862ap == null) {
                C3534a aVar = new C3534a(this.f8844a);
                aVar.mo10654a((CharSequence) getString(R.string.fez)).mo10659b((int) R.string.ecm, (DialogInterface.OnClickListener) new C2861af(this)).mo10649a((int) R.string.few, (DialogInterface.OnClickListener) new C2862ag(this)).mo10658b((int) R.string.fex);
                aVar.mo10650a((OnCancelListener) new C2916l(this));
                this.f8862ap = aVar.mo10657a();
                this.f8862ap.setCanceledOnTouchOutside(true);
            }
            this.f8862ap.show();
            C8448g.m25682a((Context) this.f8844a);
        }
    }

    /* renamed from: v */
    private void m11128v() {
        IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
        if (this.f8844a != null && a != null) {
            this.f8877f.mo119661a(C2515f.m10417f().mo9076c().mo9167b().getBanUserInfo().mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C2917m<Object>(this), (C7326g<? super Throwable>) new C2918n<Object>(this)));
        }
    }

    /* renamed from: z */
    private void m11132z() {
        if (isAdded() && getChildFragmentManager().mo2644a("filter_dialog_tag") == null) {
            LiveFilterDialogFragment liveFilterDialogFragment = null;
            if (this.f8876e != null && !TextUtils.isEmpty(null)) {
                liveFilterDialogFragment = LiveFilterDialogFragment.m10592a(this.f8871ay, null, true, true);
            }
            if (liveFilterDialogFragment == null && this.f8879h != null) {
                liveFilterDialogFragment = LiveFilterDialogFragment.m10593a(this.f8871ay, this.f8879h, true);
            }
            if (liveFilterDialogFragment == null) {
                liveFilterDialogFragment = LiveFilterDialogFragment.m10595a(this.f8871ay, true, true);
            }
            liveFilterDialogFragment.f8275a = new C2920p(this);
            liveFilterDialogFragment.show(getChildFragmentManager(), "filter_dialog_tag");
            m11119d(8);
        }
    }

    /* renamed from: c */
    public final void mo9503c() {
        if (this.f8838U != null) {
            IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
            if (C9290a.f25466a || a == null || !a.isEnableShowCommerceSale() || this.f8852af != LiveMode.VIDEO) {
                this.f8838U.setVisibility(8);
                return;
            }
            this.f8838U.setVisibility(0);
            ((ILiveSDKService) C3596c.m13172a(ILiveSDKService.class)).liveCommerceService().mo10500b(Long.valueOf(a.getId())).mo19280a((C7326g<? super T>) new C2926v<Object>(this), (C7326g<? super Throwable>) new C2928x<Object>(this));
        }
    }

    public void onDestroyView() {
        if (!this.f8866at) {
            C2624k.m10736a().mo9268b((C2629a) this);
            if (this.f8829L != null && this.f8829L.isShowing()) {
                this.f8829L.dismiss();
                this.f8829L.f8137a = null;
            }
            if (this.f8840W != null && this.f8840W.isShowing()) {
                this.f8840W.dismiss();
            }
            this.f8829L = null;
            if (this.f8865as != null && !this.f8865as.isDisposed()) {
                this.f8865as.dispose();
            }
            this.f8848ab = null;
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11539a(this.f8858al);
            this.f8877f.mo119660a();
            if (this.f8869aw != null && !this.f8869aw.isDisposed()) {
                this.f8869aw.dispose();
            }
        }
        super.onDestroyView();
    }

    /* renamed from: s */
    private void m11125s() {
        ((C3495l) C3596c.m13172a(C3495l.class)).setCurrentRoom(this.f8882l);
        if (getActivity() != null) {
            this.f8883m = C2935a.m11413a(getActivity(), this.f8864ar, this.f8882l);
            C8946b.f24489s.mo22118a(this.f8864ar);
            String str = this.f8864ar;
            if (C6319n.m19594a(this.f8864ar, "weixin_moment")) {
                str = "weixin_moment";
            }
            C8448g.m25682a((Context) getActivity());
            this.f8882l.getId();
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_interact");
            hashMap.put("event_page", "live_take_page");
            hashMap.put("room_id", String.valueOf(this.f8882l.getId()));
            hashMap.put("platform", str);
            C8443c.m25663a().mo21606a("live_take_share", hashMap, new Object[0]);
            if (!this.f8883m) {
                m11126t();
                return;
            }
            int intValue = ((Integer) LiveSettingKeys.START_LIVE_SHARE_TIMEOUT.mo10240a()).intValue();
            if (intValue > 0) {
                this.f8880j.sendEmptyMessageDelayed(2333, ((long) intValue) * 1000);
                TimeCostUtil.m12199a(Tag.CreateLive);
            }
        }
    }

    /* renamed from: w */
    private boolean m11129w() {
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22167a(getActivity(), C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.f6_)).mo22188a(-1).mo22193d("video_take").mo22194e("open_live").mo22192c("bottom_tab").mo22190a()).mo19189a((C7498y<? super T>) new C8986g<IUser>() {
                public final void onSubscribe(C7321c cVar) {
                    super.onSubscribe(cVar);
                    StartLiveFragmentD.this.f8877f.mo119661a(cVar);
                }
            });
            return false;
        } else if (!C2865aj.m11378a(this.f8844a)) {
            C3517a.m12960a((Context) this.f8844a, (int) R.string.efr);
            return false;
        } else if (NetworkUtils.m19550d(this.f8844a) == NetworkType.MOBILE_2G) {
            C3517a.m12960a((Context) this.f8844a, (int) R.string.f8e);
            return false;
        } else if (!((IHostContext) C3596c.m13172a(IHostContext.class)).isNeedProtectUnderage()) {
            return true;
        } else {
            C9049ap.m27022a((int) R.string.f0j);
            return false;
        }
    }

    /* renamed from: y */
    private void m11131y() {
        if (this.f8852af == LiveMode.SCREEN_RECORD) {
            C8443c.m25663a().mo21607a("game_take_guide", new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_take_page"));
            ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(getContext(), C3979c.m13952b("https://hotsoon.snssdk.com/falcon/live_inroom/page/game_course/index.html").mo11550a(C3358ac.m12515a((int) R.string.f77)));
            return;
        }
        ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(getContext(), C3979c.m13952b("https://hotsoon.snssdk.com/falcon/live_inroom/page/obs_course/index.html").mo11550a(C3358ac.m12515a((int) R.string.eyl)));
        C8443c.m25663a().mo21607a("thirdparty_take_guide", new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_page"));
    }

    /* renamed from: b */
    public final void mo9496b() {
        if (!LiveCameraResManager.INST.isLoadedRes()) {
            if (C3596c.m13172a(IHostPlugin.class) != null && !((IHostPlugin) C3596c.m13172a(IHostPlugin.class)).isFull()) {
                ((IHostPlugin) C3596c.m13172a(IHostPlugin.class)).preload(PluginType.LiveResource.getPackageName());
            }
            if (this.f8840W == null && getContext() != null && mo8989l()) {
                this.f8840W = new C9249a(getContext(), 2).mo22713a((OnDismissListener) new C2924t(this)).mo22729d();
            }
            LiveCameraResManager.INST.isLoadedRes.observe(this, new C2925u(this));
            return;
        }
        m11110I();
    }

    /* renamed from: x */
    private void m11130x() {
        boolean z;
        this.f8887t = 10001;
        if (m11129w()) {
            if (this.f8852af != LiveMode.THIRD_PARTY || m11105D() != -1) {
                if (this.f8852af.isStreamingBackground) {
                    Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
                    if (currentRoom != null && ((currentRoom.isScreenshot && this.f8852af == LiveMode.SCREEN_RECORD) || (currentRoom.isThirdParty && this.f8852af == LiveMode.THIRD_PARTY))) {
                        this.f8882l = currentRoom;
                        TimeCostUtil.m12208b(Tag.CreateLive);
                        C3222b.m12218a().mo10148c(Tag.CreateLive.name(), (C0043i) this, getContext());
                        m11126t();
                        return;
                    }
                }
                long j = 0;
                if (this.f8852af == LiveMode.SCREEN_RECORD) {
                    if (VERSION.SDK_INT >= 21) {
                        Game game = this.f8860an;
                        if (game == null) {
                            C9049ap.m27022a((int) R.string.fdc);
                            this.f8818A.performClick();
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
                this.f8887t = 109;
                if (this.f8863aq == null) {
                    this.f8863aq = C9044al.m27010a(this.f8844a, getString(R.string.ehh));
                }
                if (!this.f8863aq.isShowing()) {
                    this.f8863aq.show();
                }
                String obj = this.f8873b.getText().toString();
                m11116b(obj);
                C3494k roomManager = ((C3495l) C3596c.m13172a(C3495l.class)).roomManager();
                C6309f fVar = this.f8880j;
                String a = this.f8847aa.mo9925a();
                LiveMode liveMode = this.f8852af;
                int D = m11105D();
                if (this.f8852af != LiveMode.VIDEO || this.f8839V == null || !this.f8839V.isChecked()) {
                    z = false;
                } else {
                    z = true;
                }
                roomManager.mo10516a(fVar, obj, a, liveMode, D, j2, z, 1);
                C8448g.m25682a((Context) this.f8844a);
                TimeCostUtil.m12208b(Tag.CreateLive);
                C3222b.m12218a().mo10148c(Tag.CreateLive.name(), (C0043i) this, getContext());
            } else if (getActivity() != null) {
                new C9249a(getActivity(), 0).mo22716a(false).mo22727c((CharSequence) getActivity().getString(R.string.f_r)).mo22722b(0, (int) R.string.ecj, (DialogInterface.OnClickListener) new C2919o(this)).mo22729d();
            }
        }
    }

    /* renamed from: a */
    public final void mo9480a() {
        Class cls;
        try {
            TimeCostUtil.m12208b(Tag.CreateLive);
            C3222b.m12218a().mo10137a(Tag.CreateLive.name(), (C0043i) this, getContext());
            C3222b.m12218a().mo10146b(Tag.CreateLive.name(), (C0043i) this, getContext());
            Activity activity = this.f8844a;
            if (this.f8852af.isStreamingBackground) {
                cls = ((IHostApp) C3596c.m13172a(IHostApp.class)).getHostActivity(6);
            } else {
                cls = ((IHostApp) C3596c.m13172a(IHostApp.class)).getHostActivity(5);
            }
            Intent intent = new Intent(activity, cls);
            if (LiveMode.THIRD_PARTY == this.f8852af || LiveMode.SCREEN_RECORD == this.f8852af) {
                C8946b.f24405ad.mo22118a(Boolean.valueOf(false));
            }
            if (LiveMode.SCREEN_RECORD == this.f8852af) {
                intent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", m11104C());
            }
            C8946b.f24358J.mo22118a(this.f8852af.name());
            this.f8844a.startActivity(intent);
            ((C3495l) C3596c.m13172a(C3495l.class)).setCurrentRoom(this.f8882l);
            ((C9439a) C3596c.m13172a(C9439a.class)).mo23189a().mo23110a(true);
            this.f8844a.finish();
            this.f8844a.overridePendingTransition(0, 0);
            ((IBroadcastService) C3596c.m13172a(IBroadcastService.class)).startLiveManager().mo9650a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: p */
    private void m11122p() {
        this.f8886s = (HSImageView) this.f8881k.findViewById(R.id.cmu);
        this.f8821D = this.f8881k.findViewById(R.id.e2c);
        this.f8824G = (TextView) this.f8881k.findViewById(R.id.e2b);
        this.f8824G.setOnClickListener(this.f8870ax);
        this.f8884q = (ImageView) this.f8881k.findViewById(R.id.apk);
        this.f8884q.setOnClickListener(this.f8870ax);
        this.f8885r = this.f8881k.findViewById(R.id.bp2);
        this.f8885r.setOnClickListener(this.f8870ax);
        this.f8825H = this.f8881k.findViewById(R.id.x_);
        this.f8825H.setOnClickListener(this.f8870ax);
        this.f8823F = this.f8881k.findViewById(R.id.da0);
        this.f8873b = (EditText) this.f8881k.findViewById(R.id.bq4);
        this.f8873b.setTextDirection(2);
        this.f8873b.setOnFocusChangeListener(new C2927w(this));
        this.f8819B = this.f8881k.findViewById(R.id.dgd);
        this.f8875d = this.f8881k.findViewById(R.id.dpq);
        this.f8826I = this.f8881k.findViewById(R.id.d8p);
        this.f8827J = (TextView) this.f8881k.findViewById(R.id.d8o);
        this.f8827J.setOnClickListener(this.f8870ax);
        this.f8828K = this.f8881k.findViewById(R.id.xo);
        this.f8828K.setOnClickListener(this.f8870ax);
        this.f8820C = this.f8881k.findViewById(R.id.e1t);
        this.f8849ac = (AbsStartLiveShareView) this.f8881k.findViewById(R.id.ecv);
        this.f8889v = this.f8881k.findViewById(R.id.d3o);
        this.f8890w = this.f8881k.findViewById(R.id.d3m);
        this.f8890w.setOnClickListener(this.f8870ax);
        this.f8891x = this.f8881k.findViewById(R.id.d3w);
        this.f8891x.setOnClickListener(this.f8870ax);
        this.f8892y = this.f8881k.findViewById(R.id.d3q);
        this.f8892y.setOnClickListener(this.f8870ax);
        this.f8893z = this.f8881k.findViewById(R.id.b3h);
        this.f8818A = this.f8881k.findViewById(R.id.d3r);
        this.f8818A.setOnClickListener(this.f8870ax);
        this.f8837T = this.f8881k.findViewById(R.id.d40);
        this.f8838U = this.f8881k.findViewById(R.id.d3n);
        this.f8838U.setOnClickListener(this.f8870ax);
        this.f8839V = (CheckedTextView) this.f8881k.findViewById(R.id.a0p);
        this.f8830M = (ImageView) this.f8881k.findViewById(R.id.d3s);
        this.f8832O = this.f8881k.findViewById(R.id.d3t);
        this.f8831N = (TextView) this.f8881k.findViewById(R.id.d3u);
        this.f8833P = (ImageView) this.f8881k.findViewById(R.id.d3x);
        this.f8834Q = (TextView) this.f8881k.findViewById(R.id.d3y);
        this.f8836S = this.f8881k.findViewById(R.id.d41);
        this.f8888u = (TextView) this.f8881k.findViewById(R.id.ap6);
        this.f8888u.setOnClickListener(this.f8870ax);
        this.f8835R = (TextView) this.f8881k.findViewById(R.id.dx1);
        this.f8841X = (HSImageView) this.f8881k.findViewById(R.id.bo2);
        this.f8841X.setImageResource(R.drawable.bxn);
        this.f8841X.setOnClickListener(this.f8870ax);
        this.f8822E = this.f8881k.findViewById(R.id.aw6);
        this.f8843Z = (TextView) this.f8881k.findViewById(R.id.dwz);
        this.f8842Y = this.f8881k.findViewById(R.id.bo3);
        this.f8847aa = new C3115k(this.f8881k, this);
        if (this.f8874c <= 0) {
            this.f8874c = 20;
        }
        if (!this.f8866at) {
            this.f8855ai.getAvatarMedium();
            m11119d(0);
        }
    }

    /* renamed from: a */
    public final void mo9481a(int i) {
        this.f8874c = i;
    }

    public void onEvent(C4454x xVar) {
        mo9503c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9498b(DialogInterface dialogInterface) {
        m11119d(0);
    }

    /* renamed from: a */
    public final void mo9487a(EditText editText) {
        if (this.f8846aB != null) {
            editText.setFilters(new InputFilter[0]);
            this.f8846aB = null;
        }
    }

    /* renamed from: b */
    public final void mo9497b(int i) {
        C8946b.f24477g.mo22120b(Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo9505c(DialogInterface dialogInterface) {
        m11119d(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo9508d(DialogInterface dialogInterface) {
        m11119d(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo9510e(DialogInterface dialogInterface) {
        C8448g.m25682a((Context) this.f8844a);
    }

    /* renamed from: d */
    private void m11119d(int i) {
        if (i == 0) {
            this.f8851ae = false;
        }
        if (!this.f8867au) {
            this.f8889v.setVisibility(i);
            this.f8888u.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final HashMap<String, String> mo9479a(HashMap<String, String> hashMap) {
        long j;
        if (this.f8882l != null) {
            j = this.f8882l.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        return hashMap;
    }

    /* renamed from: c */
    private boolean m11118c(String str) {
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
    public final /* synthetic */ void mo9500b(C3479d dVar) throws Exception {
        if (dVar != null && dVar.data != null && !TextUtils.isEmpty(((Room) dVar.data).title())) {
            this.f8873b.setText(((Room) dVar.data).title());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TimeCostUtil.m12208b(Tag.CreateStartLivePreview);
        C3222b.m12218a().mo10146b(Tag.CreateStartLivePreview.name(), (C0043i) this, getContext());
        C3222b.m12218a().mo10137a(Tag.CreateStartLivePreview.name(), (C0043i) this, getContext());
    }

    /* renamed from: a */
    private void m11114a(Game game) {
        if (game == null) {
            this.f8832O.setVisibility(0);
            this.f8830M.setVisibility(8);
            this.f8831N.setText(R.string.f44);
            return;
        }
        this.f8832O.setVisibility(8);
        this.f8830M.setVisibility(0);
        C5343e.m17030a(this.f8830M, game.icon);
        this.f8831N.setText(game.name);
    }

    /* renamed from: b */
    private static void m11116b(String str) {
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

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f8844a = getActivity();
        this.f8880j = new C6309f(this);
        if (!this.f8866at) {
            this.f8857ak = (StartLiveBannerViewModel) C0069x.m157a((Fragment) this).mo147a(StartLiveBannerViewModel.class);
            this.f8857ak.f9321a.observe(this, new C2915k(this));
            this.f8881k.post(new C2922r(this));
            C2624k.m10736a().mo9261a((C2629a) this);
            C2624k.m10736a().mo9267b();
            if (getActivity() != null) {
                getActivity().getWindow().setSoftInputMode(48);
            }
        }
    }

    /* renamed from: a */
    private void m11113a(WebView webView) {
        boolean z;
        if (webView != null) {
            if (this.f8829L == null || !this.f8829L.isShowing()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                webView.setVisibility(0);
            }
            if (this.f8859am == null || C6319n.m19593a(this.f8859am.f14013a) || C3409v.m12670a(this.f8859am.f14014b)) {
                webView.setVisibility(8);
                if (this.f8835R != null) {
                    this.f8835R.setVisibility(8);
                }
            } else if (this.f8858al != null && this.f8858al.f11853a == webView) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", C2317a.m9932a().mo15979b((Object) this.f8859am.f14014b));
                    jSONObject.put("type", "init");
                    ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11541a(this.f8858al, "H5_roomStatusChange", jSONObject);
                    for (C9357a aVar : this.f8859am.f14014b) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("banner_id", String.valueOf(aVar.f25623a));
                        hashMap.put("request_page", "topleft");
                        C8443c.m25663a().mo21606a("livesdk_live_banner_show", hashMap, new C8438j().mo21598a("live_take_entrance"), Room.class);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo9504c(int i) {
        boolean c = m11118c("beauty_filter_dialog_tag");
        boolean c2 = m11118c("filter_dialog_tag");
        if (!c && !c2) {
            String str = "";
            List<FilterModel> list = C2624k.m10736a().f8419b;
            if (i < list.size()) {
                str = ((FilterModel) list.get(i)).getFilterId();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", "draw");
            hashMap.put("filter_id", str);
            C8443c.m25663a().mo21606a("live_take_filter_select", mo9479a(hashMap), new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_page"));
            C8946b.f24361M.mo22118a(Integer.valueOf(i));
            float a = C2619g.m10718a(C2624k.m10736a().f8419b, i);
            if (0.0f > (((C7853a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo10240a()).f21217a.f21222a * a) / 100.0f) {
                float f = a / 100.0f;
                this.f8876e.mo9582a(f);
                C8946b.f24362N.mo22118a(Float.valueOf(f));
            }
        }
    }

    public void handleMsg(Message message) {
        boolean z = false;
        if (message.obj instanceof Exception) {
            Exception exc = (Exception) message.obj;
            TimeCostUtil.m12199a(Tag.CreateLive);
            if (message.what == 1) {
                if (mo8989l()) {
                    if (this.f8863aq != null) {
                        this.f8863aq.dismiss();
                    }
                    if (exc instanceof ApiServerException) {
                        int errorCode = ((ApiServerException) exc).getErrorCode();
                        if (errorCode == 2403) {
                            C2908d.m11392a(getContext());
                        } else if (errorCode != 10018) {
                            switch (errorCode) {
                                case 30010:
                                    m11127u();
                                    break;
                                case 30011:
                                    m11124r();
                                    break;
                                default:
                                    C9076n.m27096a((Context) this.f8844a, (Throwable) exc, (int) R.string.ehi);
                                    break;
                            }
                        } else {
                            m11128v();
                        }
                    } else {
                        C9076n.m27096a((Context) this.f8844a, (Throwable) exc, (int) R.string.ehi);
                    }
                }
                C8448g.m25682a((Context) this.f8844a);
                if (this.f8852af == LiveMode.AUDIO) {
                    z = true;
                }
                BroadcastMonitor.m11027a(exc, z);
            }
        } else if (message.what != 1) {
            if (message.what == 2333) {
                m11126t();
            }
        } else if (mo8989l()) {
            this.f8882l = (Room) message.obj;
            if (!Room.isValid(this.f8882l)) {
                if (this.f8863aq != null) {
                    this.f8863aq.dismiss();
                }
                IllegalStateException illegalStateException = new IllegalStateException("invalid room");
                C9076n.m27096a((Context) this.f8844a, (Throwable) illegalStateException, (int) R.string.ehi);
                if (this.f8852af == LiveMode.AUDIO) {
                    z = true;
                }
                BroadcastMonitor.m11027a(illegalStateException, z);
                TimeCostUtil.m12199a(Tag.CreateLive);
                return;
            }
            m11112a(this.f8882l.getId());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo9490a(C4900a aVar) {
        this.f8859am = aVar;
        if (getActivity() != null && aVar != null && !C6319n.m19593a(aVar.f14013a) && !C3409v.m12670a(aVar.f14014b)) {
            C3972b webViewManager = ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager();
            if (this.f8858al == null) {
                this.f8858al = webViewManager.mo11534a((Activity) getActivity(), (C3977d) new C2923s(this));
                if (VERSION.SDK_INT <= 19) {
                    this.f8858al.f11853a.setLayerType(1, null);
                }
                this.f8858al.f11853a.setBackgroundColor(0);
                this.f8858al.f11853a.setLayoutParams(this.f8881k.findViewById(R.id.egd).getLayoutParams());
                ((ViewGroup) this.f8881k.findViewById(R.id.ap7)).addView(this.f8858al.f11853a);
                this.f8858al.f11853a.setVisibility(4);
                webViewManager.mo11540a(this.f8858al, Uri.parse(aVar.f14013a).buildUpon().appendQueryParameter("request_page", "topleft").appendQueryParameter("event_page", "live_take_entrance").appendQueryParameter("is_anchor", "true").appendQueryParameter("mode", "live_create").appendQueryParameter("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b())).toString());
                return;
            }
            webViewManager.mo11540a(this.f8858al, Uri.parse(aVar.f14013a).buildUpon().appendQueryParameter("request_page", "topleft").appendQueryParameter("event_page", "live_take_entrance").appendQueryParameter("is_anchor", "true").appendQueryParameter("mode", "live_create").appendQueryParameter("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b())).toString());
        }
    }

    /* renamed from: a */
    private void m11112a(long j) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (this.f8863aq != null && this.f8863aq.isShowing() && mo8989l()) {
            this.f8863aq.dismiss();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live_take");
        hashMap.put("event_type", "click");
        hashMap.put("enter_from", this.f8861ao);
        hashMap.put("event_page", "live_take_page");
        hashMap.put("room_id", String.valueOf(this.f8882l.getId()));
        String str10 = "live_type";
        if (this.f8882l.isLiveTypeAudio()) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put(str10, str);
        hashMap.put("streaming_type", this.f8852af.logStreamingType);
        if (this.f8852af == LiveMode.SCREEN_RECORD) {
            Game game = this.f8860an;
            if (game != null) {
                hashMap.put("game_name", game.name);
            }
        }
        C8443c.m25663a().mo21606a("live_take", hashMap, new Object[0]);
        if (this.f8873b.getText() != null && !TextUtils.isEmpty(this.f8873b.getText())) {
            HashMap hashMap2 = new HashMap();
            String str11 = "live_type";
            if (this.f8882l.isLiveTypeAudio()) {
                str9 = "voice_live";
            } else {
                str9 = "video_live";
            }
            hashMap2.put(str11, str9);
            hashMap2.put("streaming_type", this.f8852af.logStreamingType);
            C8443c.m25663a().mo21606a("pm_live_take_title_write", hashMap2, new C8438j().mo21599b("live_take").mo21603f("other").mo21598a("live_take_page"), new C8439k());
        }
        C2619g.m10719a(j);
        if (this.f8852af == LiveMode.AUDIO) {
            z = true;
        } else {
            z = false;
        }
        BroadcastMonitor.m11029a(z);
        float floatValue = ((Float) C8946b.f24362N.mo22117a()).floatValue() * 100.0f;
        float floatValue2 = ((Float) C8946b.f24363O.mo22117a()).floatValue() * 100.0f;
        float floatValue3 = ((Float) C8946b.f24364P.mo22117a()).floatValue() * 100.0f;
        float floatValue4 = ((Float) C8946b.f24365Q.mo22117a()).floatValue() * 100.0f;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("event_page", "live_take_page");
        String str12 = "live_type";
        if (this.f8882l.isLiveTypeAudio()) {
            str2 = "voice_live";
        } else {
            str2 = "video_live";
        }
        hashMap3.put(str12, str2);
        hashMap3.put("streaming_type", this.f8852af.logStreamingType);
        hashMap3.put("anchor_id", String.valueOf(this.f8855ai.getId()));
        String str13 = "is_tag";
        if (m11105D() == -1) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        hashMap3.put(str13, str3);
        String str14 = "is_beauty";
        if (this.f8852af == LiveMode.VIDEO && !(floatValue == 0.0f && floatValue2 == 0.0f && floatValue3 == 0.0f && floatValue4 == 0.0f)) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        hashMap3.put(str14, str4);
        String str15 = "beauty_white";
        if (this.f8852af != LiveMode.VIDEO) {
            str5 = "0";
        } else {
            str5 = String.valueOf(floatValue);
        }
        hashMap3.put(str15, str5);
        String str16 = "beauty_skin";
        if (this.f8852af != LiveMode.VIDEO) {
            str6 = "0";
        } else {
            str6 = String.valueOf(floatValue2);
        }
        hashMap3.put(str16, str6);
        String str17 = "beauty_bigeye";
        if (this.f8852af != LiveMode.VIDEO) {
            str7 = "0";
        } else {
            str7 = String.valueOf(floatValue3);
        }
        hashMap3.put(str17, str7);
        String str18 = "beauty_facethin";
        if (this.f8852af != LiveMode.VIDEO) {
            str8 = "0";
        } else {
            str8 = String.valueOf(floatValue4);
        }
        hashMap3.put(str18, str8);
        C8443c.m25663a().mo21606a("pm_live_take_edit_features", hashMap3, new C8438j().mo21599b("live_take").mo21603f("click"));
        if (TextUtils.isEmpty(this.f8864ar)) {
            m11126t();
        } else {
            m11125s();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9501b(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            if (this.f8856aj > 3) {
                if (mo8989l()) {
                    C9049ap.m27022a((int) R.string.f3w);
                }
                if (this.f8840W != null && this.f8840W.isShowing()) {
                    this.f8840W.dismiss();
                    return;
                }
            } else {
                LiveCameraResManager.INST.loadResources();
                this.f8856aj++;
            }
            return;
        }
        if (this.f8840W != null && this.f8840W.isShowing()) {
            this.f8840W.dismiss();
        }
        m11110I();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9482a(DialogInterface dialogInterface) {
        if (!LiveCameraResManager.INST.isLoadedRes()) {
            if (this.f8876e != null) {
                this.f8876e.mo9581a();
            } else if (getActivity() != null) {
                getActivity().finish();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9502b(Throwable th) throws Exception {
        C3166a.m11955a(6, "StartLiveFragmentC", th.getStackTrace());
        C9076n.m27095a(getContext(), th);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9486a(WebView webView, String str) {
        m11113a(webView);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9499b(DialogInterface dialogInterface, int i) {
        C3596c.m13172a(C9465g.class);
        getActivity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo9506c(DialogInterface dialogInterface, int i) {
        C8448g.m25682a((Context) this.f8844a);
        this.f8862ap.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo9511e(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f8847aa != null) {
            this.f8847aa.mo9933c();
        }
    }

    /* renamed from: a */
    private void m11111a(int i, boolean z) {
        C8443c.m25663a().mo21607a("camera_switch", new C8438j().mo21598a("live_take_page").mo21599b("live").mo21603f("click"));
        this.f8853ag = i;
        C8946b.f24477g.mo22120b(Integer.valueOf(this.f8853ag));
        if (this.f8876e != null) {
            this.f8876e.mo9583a(i);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f8854ah = C10296b.m30493a(getContext());
        if (C3596c.m13172a(C3592a.class) == null || ((C3592a) C3596c.m13172a(C3592a.class)).user() == null || C3596c.m13172a(ILiveSDKService.class) == null || C3596c.m13172a(IHostNetwork.class) == null) {
            C9049ap.m27022a((int) R.string.ejm);
            getActivity().finish();
            this.f8866at = true;
            return;
        }
        String a = this.f8854ah.mo25022a("hotsoon.pref.LAST_SET_GAME", (String) null);
        if (!TextUtils.isEmpty(a)) {
            this.f8860an = Game.fromJson(a);
        }
        m11122p();
        C2581a.m10600a();
        if (this.f8876e != null) {
            this.f8876e.mo9585b();
        }
        this.f8873b.addTextChangedListener(this.f8845aA);
        this.f8881k.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (StartLiveFragmentD.this.getContext() != null) {
                    C9083u.m27121b(StartLiveFragmentD.this.getContext(), StartLiveFragmentD.this.f8873b);
                }
                return false;
            }
        });
        m11123q();
        m11121o();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f8866at) {
            if (i != 20001 || VERSION.SDK_INT < 21) {
                C3596c.m13172a(C9465g.class);
                if (i2 != 0) {
                    this.f8847aa.mo9931a(i, i2, intent);
                } else if (i == 10001) {
                    m11130x();
                } else {
                    if (i == 10002) {
                        m11102A();
                    }
                }
            } else {
                if (i2 == -1) {
                    MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
                    if (mediaProjectionManager != null) {
                        MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(i2, intent);
                        if (mediaProjection != null) {
                            BgBroadcastServiceImpl.setProjection(mediaProjection);
                            m11130x();
                            return;
                        }
                    }
                }
                C9049ap.m27022a((int) R.string.fda);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8881k = LayoutInflater.from(getContext()).inflate(R.layout.aqu, viewGroup, false);
        if (C3596c.m13172a(C3592a.class) == null || ((C3592a) C3596c.m13172a(C3592a.class)).user() == null || C3596c.m13172a(ILiveSDKService.class) == null || C3596c.m13172a(IHostNetwork.class) == null) {
            C9049ap.m27022a((int) R.string.ejm);
            getActivity().finish();
            this.f8866at = true;
            return null;
        }
        this.f8855ai = (User) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
        if (this.f8855ai.getId() != ((Long) C8946b.f24356H.mo22117a()).longValue()) {
            C8946b.f24356H.mo22118a(Long.valueOf(this.f8855ai.getId()));
            C8946b.f24358J.mo22118a(LiveMode.VIDEO.name());
        }
        C9097a.m27146a().mo22266a(C4454x.class).mo19293a(C3303k.m12369a((Fragment) this)).mo19325f((C7326g<? super T>) new C7326g<C4454x>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C4454x xVar) throws Exception {
                StartLiveFragmentD.this.onEvent(xVar);
            }
        });
        return this.f8881k;
    }
}
