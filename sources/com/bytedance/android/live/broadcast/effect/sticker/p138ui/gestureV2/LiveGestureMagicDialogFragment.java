package com.bytedance.android.live.broadcast.effect.sticker.p138ui.gestureV2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.bytedance.android.live.BaseDialogFragmentV2;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2426b;
import com.bytedance.android.live.broadcast.effect.C2588b;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.effect.sticker.p138ui.C2684a;
import com.bytedance.android.live.broadcast.effect.sticker.p138ui.gestureV2.LiveGestureMagicListAdapter.C2705b;
import com.bytedance.android.live.broadcast.effect.sticker.p138ui.gestureV2.LiveGestureMagicTabAdapter.C2711b;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment */
public final class LiveGestureMagicDialogFragment extends BaseDialogFragmentV2 implements C2684a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f8564a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LiveGestureMagicDialogFragment.class), "gestureMagicTabAdapter", "getGestureMagicTabAdapter()Lcom/bytedance/android/live/broadcast/effect/sticker/ui/gestureV2/LiveGestureMagicTabAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LiveGestureMagicDialogFragment.class), "gestureMagicListAdapter", "getGestureMagicListAdapter()Lcom/bytedance/android/live/broadcast/effect/sticker/ui/gestureV2/LiveGestureMagicListAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LiveGestureMagicDialogFragment.class), "liveComposerManager", "getLiveComposerManager()Lcom/bytedance/android/live/broadcast/api/effect/ILiveComposerManager;"))};

    /* renamed from: h */
    public static final C2692a f8565h = new C2692a(null);

    /* renamed from: b */
    public Map<String, C9355c> f8566b = new HashMap();

    /* renamed from: c */
    public List<? extends EffectCategoryResponse> f8567c;

    /* renamed from: d */
    public final HashMap<Integer, Integer[]> f8568d = new HashMap<>();

    /* renamed from: e */
    public int f8569e;

    /* renamed from: f */
    public DataCenter f8570f;

    /* renamed from: g */
    public boolean f8571g = true;

    /* renamed from: i */
    private OnDismissListener f8572i;

    /* renamed from: j */
    private final C7541d f8573j = C7546e.m23569a(new C2694c(this));

    /* renamed from: k */
    private final C7541d f8574k = C7546e.m23569a(C2693b.f8577a);

    /* renamed from: l */
    private final C7541d f8575l = C7546e.m23569a(C2695d.f8579a);

    /* renamed from: m */
    private HashMap f8576m;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$a */
    public static final class C2692a {
        private C2692a() {
        }

        public /* synthetic */ C2692a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static LiveGestureMagicDialogFragment m10943a(DataCenter dataCenter) {
            C7573i.m23587b(dataCenter, "dataCenter");
            LiveGestureMagicDialogFragment liveGestureMagicDialogFragment = new LiveGestureMagicDialogFragment();
            liveGestureMagicDialogFragment.f8570f = dataCenter;
            return liveGestureMagicDialogFragment;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$b */
    static final class C2693b extends Lambda implements C7561a<LiveGestureMagicListAdapter> {

        /* renamed from: a */
        public static final C2693b f8577a = new C2693b();

        C2693b() {
            super(0);
        }

        /* renamed from: a */
        private static LiveGestureMagicListAdapter m10944a() {
            return new LiveGestureMagicListAdapter();
        }

        public final /* synthetic */ Object invoke() {
            return m10944a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$c */
    static final class C2694c extends Lambda implements C7561a<LiveGestureMagicTabAdapter> {

        /* renamed from: a */
        final /* synthetic */ LiveGestureMagicDialogFragment f8578a;

        C2694c(LiveGestureMagicDialogFragment liveGestureMagicDialogFragment) {
            this.f8578a = liveGestureMagicDialogFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LiveGestureMagicTabAdapter invoke() {
            return new LiveGestureMagicTabAdapter(this.f8578a.getContext());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$d */
    static final class C2695d extends Lambda implements C7561a<C2421c> {

        /* renamed from: a */
        public static final C2695d f8579a = new C2695d();

        C2695d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m10946a();
        }

        /* renamed from: a */
        private static C2421c m10946a() {
            return C2515f.m10417f().mo9074a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$e */
    static final class C2696e implements OnClickListener {

        /* renamed from: a */
        public static final C2696e f8580a = new C2696e();

        C2696e() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$f */
    static final class C2697f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveGestureMagicDialogFragment f8581a;

        C2697f(LiveGestureMagicDialogFragment liveGestureMagicDialogFragment) {
            this.f8581a = liveGestureMagicDialogFragment;
        }

        public final void onClick(View view) {
            this.f8581a.mo9384d();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$g */
    static final class C2698g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveGestureMagicDialogFragment f8582a;

        C2698g(LiveGestureMagicDialogFragment liveGestureMagicDialogFragment) {
            this.f8582a = liveGestureMagicDialogFragment;
        }

        public final void onClick(View view) {
            this.f8582a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$h */
    static final class C2699h implements OnClickListener {

        /* renamed from: a */
        public static final C2699h f8583a = new C2699h();

        C2699h() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$i */
    public static final class C2700i implements C2711b {

        /* renamed from: a */
        final /* synthetic */ LiveGestureMagicDialogFragment f8584a;

        C2700i(LiveGestureMagicDialogFragment liveGestureMagicDialogFragment) {
            this.f8584a = liveGestureMagicDialogFragment;
        }

        /* renamed from: a */
        public final void mo9392a(int i) {
            int i2;
            if (this.f8584a.mo9387g()) {
                List<? extends EffectCategoryResponse> list = this.f8584a.f8567c;
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = -1;
                }
                if (i2 >= i) {
                    List<? extends EffectCategoryResponse> list2 = this.f8584a.f8567c;
                    if (list2 != null) {
                        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list2.get(i);
                        if (effectCategoryResponse != null) {
                            this.f8584a.mo9378a(this.f8584a.f8569e);
                            this.f8584a.f8569e = i;
                            this.f8584a.mo9381b().mo9398a(effectCategoryResponse);
                            SwitchCompat switchCompat = (SwitchCompat) this.f8584a.mo9380b(R.id.aq9);
                            C7573i.m23582a((Object) switchCompat, "gesture_magic_switch");
                            if (switchCompat.isChecked()) {
                                this.f8584a.mo9382b(effectCategoryResponse, i);
                            } else {
                                this.f8584a.mo9379a(effectCategoryResponse, i);
                            }
                            Integer[] numArr = (Integer[]) this.f8584a.f8568d.get(Integer.valueOf(this.f8584a.f8569e));
                            if (numArr != null && numArr.length == 2) {
                                StringBuilder sb = new StringBuilder("x:");
                                sb.append(numArr);
                                sb.append("[0]+y:");
                                sb.append(numArr);
                                sb.append("[1]");
                                C3166a.m11966e("LiveGestureMagicDialogFragment", sb.toString());
                                RecyclerView recyclerView = (RecyclerView) this.f8584a.mo9380b(R.id.aq8);
                                C7573i.m23582a((Object) recyclerView, "gesture_magic_list");
                                C1273i layoutManager = recyclerView.getLayoutManager();
                                if (!(layoutManager instanceof LinearLayoutManager)) {
                                    layoutManager = null;
                                }
                                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                                if (linearLayoutManager != null) {
                                    linearLayoutManager.mo5417a(numArr[0].intValue(), numArr[1].intValue());
                                }
                            }
                            this.f8584a.mo9386f();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$j */
    public static final class C2701j implements C2705b {

        /* renamed from: a */
        final /* synthetic */ LiveGestureMagicDialogFragment f8585a;

        C2701j(LiveGestureMagicDialogFragment liveGestureMagicDialogFragment) {
            this.f8585a = liveGestureMagicDialogFragment;
        }

        /* renamed from: a */
        public final void mo9393a(boolean z, C9355c cVar) {
            String str;
            if (this.f8585a.mo9387g() && ((SwitchCompat) this.f8585a.mo9380b(R.id.aq9)) != null) {
                if (cVar != null) {
                    str = cVar.f25581t;
                } else {
                    str = null;
                }
                if (!C6319n.m19593a(str)) {
                    this.f8585a.mo9377a().mo9407a(z, this.f8585a.f8569e);
                    if (z) {
                        C2588b b = C2515f.m10417f().mo9075b();
                        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
                        if (b.mo9212a().mo8906a(cVar)) {
                            SwitchCompat switchCompat = (SwitchCompat) this.f8585a.mo9380b(R.id.aq9);
                            if (switchCompat != null && switchCompat.isChecked()) {
                                this.f8585a.mo9383c().mo8892a(C2418b.f7950a, cVar);
                            }
                        }
                    } else {
                        this.f8585a.mo9383c().mo8898b(C2418b.f7950a, cVar);
                    }
                    this.f8585a.mo9386f();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$k */
    static final class C2702k implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ LiveGestureMagicDialogFragment f8586a;

        C2702k(LiveGestureMagicDialogFragment liveGestureMagicDialogFragment) {
            this.f8586a = liveGestureMagicDialogFragment;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            if (!this.f8586a.f8571g) {
                Map hashMap = new HashMap();
                String str2 = "status";
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                hashMap.put(str2, str);
                C8443c.m25663a().mo21606a("live_take_gesture_switch_click", hashMap, Room.class);
            } else {
                this.f8586a.f8571g = false;
            }
            C8947c<Boolean> cVar = C8946b.f24416ao;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.GESTURE_MAGIC_SWITCH");
            cVar.mo22118a(Boolean.valueOf(z));
            this.f8586a.mo9377a().mo9406a(z);
            this.f8586a.mo9381b().mo9399a(z);
            if (z) {
                View b = this.f8586a.mo9380b(R.id.bzr);
                C7573i.m23582a((Object) b, "mongolian_view");
                b.setVisibility(8);
                TextView textView = (TextView) this.f8586a.mo9380b(R.id.dv3);
                C7573i.m23582a((Object) textView, "tv_gesture_magic_tip");
                textView.setText(C3358ac.m12515a((int) R.string.esk));
                for (C9355c a : this.f8586a.f8566b.values()) {
                    this.f8586a.mo9383c().mo8892a(C2418b.f7950a, a);
                }
                this.f8586a.mo9386f();
                return;
            }
            C8947c<Map<String, Boolean>> cVar2 = C8946b.f24415an;
            C7573i.m23582a((Object) cVar2, "LivePluginProperties.SHOW_GUIDE_GESTURE_MAGIC_V2");
            cVar2.mo22118a(new HashMap());
            TextView textView2 = (TextView) this.f8586a.mo9380b(R.id.dv3);
            C7573i.m23582a((Object) textView2, "tv_gesture_magic_tip");
            textView2.setText(C3358ac.m12515a((int) R.string.esi));
            View b2 = this.f8586a.mo9380b(R.id.bzr);
            C7573i.m23582a((Object) b2, "mongolian_view");
            b2.setVisibility(0);
            this.f8586a.f8566b.clear();
            List<C9355c> a2 = this.f8586a.mo9383c().mo8884a(C2418b.f7950a);
            C7573i.m23582a((Object) a2, "liveComposerManager.getC…ickerPanel.GESTURE_PANEL)");
            for (C9355c cVar3 : a2) {
                List<? extends EffectCategoryResponse> list = this.f8586a.f8567c;
                if (list != null) {
                    for (EffectCategoryResponse effectCategoryResponse : list) {
                        C7573i.m23582a((Object) cVar3, "sticker");
                        List<Effect> list2 = effectCategoryResponse.totalEffects;
                        C7573i.m23582a((Object) list2, "it.totalEffects");
                        if (LiveGestureMagicDialogFragment.m10929a(cVar3, list2)) {
                            Map<String, C9355c> map = this.f8586a.f8566b;
                            String str3 = effectCategoryResponse.f113500id;
                            C7573i.m23582a((Object) str3, "it.id");
                            map.put(str3, cVar3);
                        }
                    }
                }
            }
            this.f8586a.mo9383c().mo8897b(C2418b.f7950a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicDialogFragment$l */
    public static final class C2703l implements C2426b {

        /* renamed from: a */
        final /* synthetic */ LiveGestureMagicDialogFragment f8587a;

        /* renamed from: a */
        public final void mo8910a() {
            if (this.f8587a.mo9387g()) {
                ((LoadingStatusView) this.f8587a.mo9380b(R.id.dav)).mo10832e();
            }
        }

        C2703l(LiveGestureMagicDialogFragment liveGestureMagicDialogFragment) {
            this.f8587a = liveGestureMagicDialogFragment;
        }

        /* renamed from: a */
        public final void mo8911a(EffectChannelResponse effectChannelResponse) {
            if (this.f8587a.mo9387g()) {
                if (effectChannelResponse != null) {
                    List<EffectCategoryResponse> list = effectChannelResponse.categoryResponseList;
                    if (list != null && !list.isEmpty()) {
                        this.f8587a.f8567c = effectChannelResponse.categoryResponseList;
                        ((LoadingStatusView) this.f8587a.mo9380b(R.id.dav)).mo10828a();
                        LoadingStatusView loadingStatusView = (LoadingStatusView) this.f8587a.mo9380b(R.id.dav);
                        C7573i.m23582a((Object) loadingStatusView, "status_view");
                        loadingStatusView.setVisibility(8);
                        this.f8587a.mo9377a().mo9405a(effectChannelResponse.categoryResponseList);
                        this.f8587a.mo9385e();
                        return;
                    }
                }
                ((LoadingStatusView) this.f8587a.mo9380b(R.id.dav)).mo10831d();
            }
        }
    }

    /* renamed from: a */
    public static final LiveGestureMagicDialogFragment m10927a(DataCenter dataCenter) {
        return C2692a.m10943a(dataCenter);
    }

    /* renamed from: i */
    private void m10931i() {
        if (this.f8576m != null) {
            this.f8576m.clear();
        }
    }

    /* renamed from: a */
    public final LiveGestureMagicTabAdapter mo9377a() {
        return (LiveGestureMagicTabAdapter) this.f8573j.getValue();
    }

    /* renamed from: b */
    public final View mo9380b(int i) {
        if (this.f8576m == null) {
            this.f8576m = new HashMap();
        }
        View view = (View) this.f8576m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f8576m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public final LiveGestureMagicListAdapter mo9381b() {
        return (LiveGestureMagicListAdapter) this.f8574k.getValue();
    }

    /* renamed from: c */
    public final C2421c mo9383c() {
        return (C2421c) this.f8575l.getValue();
    }

    public final void onStart() {
        super.onStart();
        mo9384d();
    }

    public final boolean isShowing() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog.isShowing();
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo9387g() {
        if (!isAdded() || this.mHidden || getView() == null) {
            return false;
        }
        return true;
    }

    public final void onDestroyView() {
        mo9378a(this.f8569e);
        m10930h();
        this.f8571g = true;
        super.onDestroyView();
        m10931i();
    }

    /* renamed from: d */
    public final void mo9384d() {
        ((LoadingStatusView) mo9380b(R.id.dav)).mo10830c();
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        b.mo9212a().mo8904a(C2418b.f7950a, (C2426b) new C2703l(this));
    }

    /* renamed from: e */
    public final void mo9385e() {
        List<? extends EffectCategoryResponse> list = this.f8567c;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                SwitchCompat switchCompat = (SwitchCompat) mo9380b(R.id.aq9);
                C7573i.m23582a((Object) switchCompat, "gesture_magic_switch");
                if (switchCompat.isChecked()) {
                    mo9382b((EffectCategoryResponse) list.get(i), i);
                } else {
                    mo9379a((EffectCategoryResponse) list.get(i), i);
                }
            }
        }
    }

    /* renamed from: h */
    private final void m10930h() {
        SwitchCompat switchCompat = (SwitchCompat) mo9380b(R.id.aq9);
        C7573i.m23582a((Object) switchCompat, "gesture_magic_switch");
        if (switchCompat.isChecked()) {
            C8947c<Map<String, String>> cVar = C8946b.f24418aq;
            C7573i.m23582a((Object) cVar, "LivePluginProperties.GESTURE_MAGIC_OLD_SELECT_PATH");
            cVar.mo22118a(new HashMap());
            return;
        }
        C8947c<Map<String, String>> cVar2 = C8946b.f24418aq;
        C7573i.m23582a((Object) cVar2, "LivePluginProperties.GESTURE_MAGIC_OLD_SELECT_PATH");
        Map map = (Map) cVar2.mo22117a();
        for (Entry entry : this.f8566b.entrySet()) {
            C7573i.m23582a((Object) map, "saveMap");
            map.put(entry.getKey(), ((C9355c) entry.getValue()).f25581t);
        }
        C8947c<Map<String, String>> cVar3 = C8946b.f24418aq;
        C7573i.m23582a((Object) cVar3, "LivePluginProperties.GESTURE_MAGIC_OLD_SELECT_PATH");
        cVar3.mo22118a(map);
    }

    /* renamed from: f */
    public final void mo9386f() {
        Object obj;
        List<? extends EffectCategoryResponse> list = this.f8567c;
        if (list != null) {
            EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list.get(this.f8569e);
            if (effectCategoryResponse != null) {
                List a = mo9383c().mo8884a(C2418b.f7950a);
                C7573i.m23582a((Object) a, "liveComposerManager.getC…ickerPanel.GESTURE_PANEL)");
                Iterator it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C9355c cVar = (C9355c) obj;
                    C7573i.m23582a((Object) cVar, "it");
                    List<Effect> list2 = effectCategoryResponse.totalEffects;
                    C7573i.m23582a((Object) list2, "response.totalEffects");
                    if (m10929a(cVar, list2)) {
                        break;
                    }
                }
                if (((C9355c) obj) != null) {
                    C8947c<Map<String, Boolean>> cVar2 = C8946b.f24415an;
                    C7573i.m23582a((Object) cVar2, "LivePluginProperties.SHOW_GUIDE_GESTURE_MAGIC_V2");
                    Map map = (Map) cVar2.mo22117a();
                    if (!map.containsKey(effectCategoryResponse.f113500id) || (!C7573i.m23585a((Object) (Boolean) map.get(effectCategoryResponse.f113500id), (Object) Boolean.valueOf(true)))) {
                        C7573i.m23582a((Object) map, "gestureGuideMap");
                        map.put(effectCategoryResponse.f113500id, Boolean.valueOf(true));
                        String a2 = m10928a(effectCategoryResponse);
                        if (a2 != null) {
                            DataCenter dataCenter = this.f8570f;
                            if (dataCenter == null) {
                                C7573i.m23583a("dataCenter");
                            }
                            dataCenter.lambda$put$1$DataCenter("cmd_sticker_tip", a2);
                            C8947c<Map<String, Boolean>> cVar3 = C8946b.f24415an;
                            C7573i.m23582a((Object) cVar3, "LivePluginProperties.SHOW_GUIDE_GESTURE_MAGIC_V2");
                            cVar3.mo22118a(map);
                        }
                    }
                }
            }
        }
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
        C7573i.m23587b(onDismissListener, "onDismissListener");
        this.f8572i = onDismissListener;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.z4);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f8572i != null) {
            OnDismissListener onDismissListener = this.f8572i;
            if (onDismissListener == null) {
                C7573i.m23580a();
            }
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: a */
    private static String m10928a(EffectCategoryResponse effectCategoryResponse) {
        Object obj;
        Object obj2;
        List<String> list = effectCategoryResponse.tags;
        C7573i.m23582a((Object) list, "response.tags");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = (String) obj;
            C7573i.m23582a((Object) str, "it");
            if (C7634n.m23722b(str, "tip", false, 2, null)) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return null;
        }
        Iterator it2 = C7634n.m23769b((CharSequence) str2, new String[]{":"}, false, 0, 6, (Object) null).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (!C6319n.m19594a("tip", (String) obj2)) {
                break;
            }
        }
        String str3 = (String) obj2;
        if (str3 == null) {
            return null;
        }
        return str3;
    }

    public final void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(true);
        }
        super.onActivityCreated(bundle);
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            Window window = dialog3.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        Dialog dialog4 = getDialog();
        if (dialog4 != null) {
            Window window2 = dialog4.getWindow();
            if (window2 != null) {
                window2.setGravity(80);
            }
        }
        Dialog dialog5 = getDialog();
        if (dialog5 != null) {
            Window window3 = dialog5.getWindow();
            if (window3 != null) {
                window3.setLayout(-1, C3358ac.m12510a(228.0f));
            }
        }
    }

    /* renamed from: a */
    public final void mo9378a(int i) {
        RecyclerView recyclerView = (RecyclerView) mo9380b(R.id.aq8);
        C7573i.m23582a((Object) recyclerView, "gesture_magic_list");
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            View g = linearLayoutManager.mo5788g(0);
            if (g != null) {
                C7573i.m23582a((Object) g, "layoutManager.getChildAt(0) ?: return");
                this.f8568d.put(Integer.valueOf(i), new Integer[]{Integer.valueOf(LinearLayoutManager.m6060c(g)), Integer.valueOf(g.getLeft())});
            }
        }
    }

    /* renamed from: a */
    public static boolean m10929a(C9355c cVar, List<? extends Effect> list) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Effect effect = (Effect) obj;
            long j = cVar.f25566e;
            Long valueOf = Long.valueOf(effect.getEffectId());
            if (valueOf != null && j == valueOf.longValue()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo9382b(EffectCategoryResponse effectCategoryResponse, int i) {
        Object obj;
        boolean z;
        List a = mo9383c().mo8884a(C2418b.f7950a);
        C7573i.m23582a((Object) a, "liveComposerManager.getC…ickerPanel.GESTURE_PANEL)");
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C9355c cVar = (C9355c) obj;
            C7573i.m23582a((Object) cVar, "it");
            List<Effect> list = effectCategoryResponse.totalEffects;
            C7573i.m23582a((Object) list, "response.totalEffects");
            if (m10929a(cVar, list)) {
                break;
            }
        }
        C9355c cVar2 = (C9355c) obj;
        LiveGestureMagicTabAdapter a2 = mo9377a();
        if (cVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        a2.mo9407a(z, i);
        if (i == this.f8569e && cVar2 != null) {
            mo9381b().mo9396a(cVar2);
        }
    }

    /* renamed from: a */
    public final void mo9379a(EffectCategoryResponse effectCategoryResponse, int i) {
        Object obj;
        C8947c<Map<String, String>> cVar = C8946b.f24418aq;
        C7573i.m23582a((Object) cVar, "LivePluginProperties.GESTURE_MAGIC_OLD_SELECT_PATH");
        String str = (String) ((Map) cVar.mo22117a()).get(effectCategoryResponse.f113500id);
        if (str != null) {
            List<Effect> list = effectCategoryResponse.totalEffects;
            C7573i.m23582a((Object) list, "response.totalEffects");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Effect effect = (Effect) obj;
                C7573i.m23582a((Object) effect, "it");
                if (C6319n.m19594a(effect.getUnzipPath(), str)) {
                    break;
                }
            }
            Effect effect2 = (Effect) obj;
            if (effect2 != null) {
                C9355c a = C2663f.m10852a(effect2);
                Map<String, C9355c> map = this.f8566b;
                String str2 = effectCategoryResponse.f113500id;
                C7573i.m23582a((Object) str2, "response.id");
                C7573i.m23582a((Object) a, "sticker");
                map.put(str2, a);
                mo9377a().mo9407a(true, i);
                if (i == this.f8569e) {
                    mo9381b().mo9396a(a);
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        ((LoadingStatusView) mo9380b(R.id.dav)).setOnClickListener(C2696e.f8580a);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ay3, null, false);
        inflate.setOnClickListener(new C2697f(this));
        ((LoadingStatusView) mo9380b(R.id.dav)).setBuilder(C3555a.m13075a(getContext()).mo10834a((int) C9738o.m28708b(getContext(), 56.0f)).mo10839c(inflate));
        mo9380b(R.id.a9l).setOnClickListener(new C2698g(this));
        mo9380b(R.id.a8i).setOnClickListener(C2699h.f8583a);
        RecyclerView recyclerView = (RecyclerView) mo9380b(R.id.aq_);
        C7573i.m23582a((Object) recyclerView, "gesture_magic_tab");
        recyclerView.setLayoutManager(new LiveGestureMagicDialogFragment$onViewCreated$5(this, getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) mo9380b(R.id.aq_);
        C7573i.m23582a((Object) recyclerView2, "gesture_magic_tab");
        recyclerView2.setAdapter(mo9377a());
        RecyclerView recyclerView3 = (RecyclerView) mo9380b(R.id.aq8);
        C7573i.m23582a((Object) recyclerView3, "gesture_magic_list");
        recyclerView3.setLayoutManager(new LiveGestureMagicDialogFragment$onViewCreated$6(this, getContext(), 0, false));
        RecyclerView recyclerView4 = (RecyclerView) mo9380b(R.id.aq8);
        C7573i.m23582a((Object) recyclerView4, "gesture_magic_list");
        recyclerView4.setAdapter(mo9381b());
        mo9377a().mo9404a((C2711b) new C2700i(this));
        mo9381b().mo9395a((C2705b) new C2701j(this));
        ((SwitchCompat) mo9380b(R.id.aq9)).setThumbResource(R.drawable.chp);
        ((SwitchCompat) mo9380b(R.id.aq9)).setTrackResource(R.drawable.chs);
        ((SwitchCompat) mo9380b(R.id.aq9)).setOnCheckedChangeListener(new C2702k(this));
        SwitchCompat switchCompat = (SwitchCompat) mo9380b(R.id.aq9);
        C7573i.m23582a((Object) switchCompat, "gesture_magic_switch");
        C8947c<Boolean> cVar = C8946b.f24416ao;
        C7573i.m23582a((Object) cVar, "LivePluginProperties.GESTURE_MAGIC_SWITCH");
        Object a = cVar.mo22117a();
        C7573i.m23582a(a, "LivePluginProperties.GESTURE_MAGIC_SWITCH.value");
        switchCompat.setChecked(((Boolean) a).booleanValue());
        C8947c<Boolean> cVar2 = C8946b.f24416ao;
        C7573i.m23582a((Object) cVar2, "LivePluginProperties.GESTURE_MAGIC_SWITCH");
        Object a2 = cVar2.mo22117a();
        C7573i.m23582a(a2, "LivePluginProperties.GESTURE_MAGIC_SWITCH.value");
        if (((Boolean) a2).booleanValue()) {
            this.f8571g = false;
        }
        TextView textView = (TextView) mo9380b(R.id.dv3);
        C7573i.m23582a((Object) textView, "tv_gesture_magic_tip");
        C8947c<Boolean> cVar3 = C8946b.f24416ao;
        C7573i.m23582a((Object) cVar3, "LivePluginProperties.GESTURE_MAGIC_SWITCH");
        Object a3 = cVar3.mo22117a();
        C7573i.m23582a(a3, "LivePluginProperties.GESTURE_MAGIC_SWITCH.value");
        if (((Boolean) a3).booleanValue()) {
            i = R.string.esk;
        } else {
            i = R.string.esi;
        }
        textView.setText(C3358ac.m12515a(i));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ao7, viewGroup, false);
    }
}
