package com.p280ss.android.ugc.aweme.p313im.sdk.detail;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.p030a.p031a.C1065a;
import android.support.p029v7.widget.SwitchCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.selectmsg.C6951b;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a.C31257b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IMService;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.p1879c.C47894a;
import kotlin.p1879c.C47895b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity */
public abstract class BaseChatDetailActivity extends AmeActivity implements OnClickListener, OnCheckedChangeListener {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f81614a = {C7575l.m23599a((MutablePropertyReference1) new MutablePropertyReference1Impl(C7575l.m23595a(BaseChatDetailActivity.class), "mIsMute", "getMIsMute()Z")), C7575l.m23599a((MutablePropertyReference1) new MutablePropertyReference1Impl(C7575l.m23595a(BaseChatDetailActivity.class), "mIsStickTop", "getMIsStickTop()Z"))};

    /* renamed from: b */
    protected ImTextTitleBar f81615b;

    /* renamed from: c */
    public SwitchCompat f81616c;

    /* renamed from: d */
    public SwitchCompat f81617d;

    /* renamed from: e */
    public C6425b f81618e;

    /* renamed from: f */
    private ViewGroup f81619f;

    /* renamed from: g */
    private TextView f81620g;

    /* renamed from: h */
    private TextView f81621h;

    /* renamed from: i */
    private final C47895b f81622i;

    /* renamed from: j */
    private final C47895b f81623j;

    /* renamed from: k */
    private HashMap f81624k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity$a */
    public static final class C31100a extends C47894a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f81625a;

        /* renamed from: b */
        final /* synthetic */ BaseChatDetailActivity f81626b;

        public C31100a(Object obj, Object obj2, BaseChatDetailActivity baseChatDetailActivity) {
            this.f81625a = obj;
            this.f81626b = baseChatDetailActivity;
            super(obj2);
        }

        /* renamed from: a */
        public final void mo63286a(C7595j<?> jVar, Boolean bool, Boolean bool2) {
            C7573i.m23587b(jVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (BaseChatDetailActivity.m101414a(this.f81626b).isChecked() ^ booleanValue) {
                BaseChatDetailActivity.m101414a(this.f81626b).setChecked(booleanValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity$b */
    public static final class C31101b extends C47894a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f81627a;

        /* renamed from: b */
        final /* synthetic */ BaseChatDetailActivity f81628b;

        public C31101b(Object obj, Object obj2, BaseChatDetailActivity baseChatDetailActivity) {
            this.f81627a = obj;
            this.f81628b = baseChatDetailActivity;
            super(obj2);
        }

        /* renamed from: a */
        public final void mo63286a(C7595j<?> jVar, Boolean bool, Boolean bool2) {
            C7573i.m23587b(jVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (BaseChatDetailActivity.m101416b(this.f81628b).isChecked() ^ booleanValue) {
                BaseChatDetailActivity.m101416b(this.f81628b).setChecked(booleanValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity$c */
    public static final class C31102c implements C11195b<Conversation> {

        /* renamed from: a */
        final /* synthetic */ BaseChatDetailActivity f81629a;

        C31102c(BaseChatDetailActivity baseChatDetailActivity) {
            this.f81629a = baseChatDetailActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(Conversation conversation) {
            C7573i.m23587b(conversation, "result");
            this.f81629a.mo81588a(!this.f81629a.mo81590b());
            BaseChatDetailActivity.m101414a(this.f81629a).setEnabled(true);
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            C31257b.m101861a(this.f81629a, gVar);
            BaseChatDetailActivity.m101414a(this.f81629a).setChecked(this.f81629a.mo81590b());
            BaseChatDetailActivity.m101414a(this.f81629a).setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity$d */
    public static final class C31103d implements C11195b<Conversation> {

        /* renamed from: a */
        final /* synthetic */ BaseChatDetailActivity f81630a;

        C31103d(BaseChatDetailActivity baseChatDetailActivity) {
            this.f81630a = baseChatDetailActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(Conversation conversation) {
            C7573i.m23587b(conversation, "result");
            this.f81630a.mo81589b(!this.f81630a.mo81591c());
            BaseChatDetailActivity.m101416b(this.f81630a).setEnabled(true);
        }

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
            C7573i.m23587b(gVar, "error");
            C31257b.m101861a(this.f81630a, gVar);
            BaseChatDetailActivity.m101416b(this.f81630a).setChecked(this.f81630a.mo81591c());
            BaseChatDetailActivity.m101416b(this.f81630a).setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity$e */
    public static final class C31104e implements C31980a {

        /* renamed from: a */
        final /* synthetic */ BaseChatDetailActivity f81631a;

        /* renamed from: b */
        public final void mo18097b() {
        }

        /* renamed from: a */
        public final void mo18096a() {
            this.f81631a.finish();
        }

        C31104e(BaseChatDetailActivity baseChatDetailActivity) {
            this.f81631a = baseChatDetailActivity;
        }
    }

    /* renamed from: a */
    public View mo81586a(int i) {
        if (this.f81624k == null) {
            this.f81624k = new HashMap();
        }
        View view = (View) this.f81624k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81624k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo81588a(boolean z) {
        this.f81622i.mo120019a(this, f81614a[0], Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final void mo81589b(boolean z) {
        this.f81623j.mo120019a(this, f81614a[1], Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final boolean mo81590b() {
        return ((Boolean) this.f81622i.mo120018a(this, f81614a[0])).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81591c() {
        return ((Boolean) this.f81623j.mo120018a(this, f81614a[1])).booleanValue();
    }

    /* renamed from: d */
    public abstract int mo81592d();

    /* renamed from: e */
    public void mo81593e() {
    }

    public void setStatusBarColor() {
    }

    /* renamed from: h */
    private final void mo81642h() {
        m101421j();
        m101420i();
    }

    public BaseChatDetailActivity() {
        Boolean valueOf = Boolean.valueOf(false);
        this.f81622i = new C31100a(valueOf, valueOf, this);
        Boolean valueOf2 = Boolean.valueOf(false);
        this.f81623j = new C31101b(valueOf2, valueOf2, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r0.isMute() == true) goto L_0x0013;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101420i() {
        /*
            r2 = this;
            com.bytedance.im.core.model.b r0 = r2.f81618e
            r1 = 1
            if (r0 == 0) goto L_0x0012
            com.bytedance.im.core.model.Conversation r0 = r0.mo15562a()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isMute()
            if (r0 != r1) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            r2.mo81588a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.BaseChatDetailActivity.m101420i():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r0.isStickTop() == true) goto L_0x0013;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m101421j() {
        /*
            r2 = this;
            com.bytedance.im.core.model.b r0 = r2.f81618e
            r1 = 1
            if (r0 == 0) goto L_0x0012
            com.bytedance.im.core.model.Conversation r0 = r0.mo15562a()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStickTop()
            if (r0 != r1) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            r2.mo81589b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.detail.BaseChatDetailActivity.m101421j():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ImTextTitleBar mo81587a() {
        ImTextTitleBar imTextTitleBar = this.f81615b;
        if (imTextTitleBar == null) {
            C7573i.m23583a("mTitleBar");
        }
        return imTextTitleBar;
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        C6425b bVar = this.f81618e;
        if (bVar != null) {
            str = bVar.f18778a;
        } else {
            str = null;
        }
        C6951b.m21625b(str);
        C6951b.m21627d(str);
    }

    /* renamed from: g */
    public void mo81595g() {
        TextView textView = this.f81620g;
        if (textView == null) {
            C7573i.m23583a("mMuteText");
        }
        OnClickListener onClickListener = this;
        textView.setOnClickListener(onClickListener);
        TextView textView2 = this.f81621h;
        if (textView2 == null) {
            C7573i.m23583a("mStickTopText");
        }
        textView2.setOnClickListener(onClickListener);
        SwitchCompat switchCompat = this.f81616c;
        if (switchCompat == null) {
            C7573i.m23583a("mMuteSwitch");
        }
        OnCheckedChangeListener onCheckedChangeListener = this;
        switchCompat.setOnCheckedChangeListener(onCheckedChangeListener);
        SwitchCompat switchCompat2 = this.f81617d;
        if (switchCompat2 == null) {
            C7573i.m23583a("mStickTopSwitch");
        }
        switchCompat2.setOnCheckedChangeListener(onCheckedChangeListener);
        ImTextTitleBar imTextTitleBar = this.f81615b;
        if (imTextTitleBar == null) {
            C7573i.m23583a("mTitleBar");
        }
        imTextTitleBar.setOnTitlebarClickListener(new C31104e(this));
    }

    /* renamed from: f */
    public void mo81594f() {
        int i;
        int i2;
        View findViewById = findViewById(R.id.djz);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.title_bar)");
        this.f81615b = (ImTextTitleBar) findViewById;
        View findViewById2 = findViewById(R.id.bii);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.layout_mute)");
        this.f81619f = (ViewGroup) findViewById2;
        View findViewById3 = findViewById(R.id.dyc);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.tv_mute)");
        this.f81620g = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.df0);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.switch_mute)");
        this.f81616c = (SwitchCompat) findViewById4;
        View findViewById5 = findViewById(R.id.e2k);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.tv_stick_top)");
        this.f81621h = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.df3);
        C7573i.m23582a((Object) findViewById6, "findViewById(R.id.switch_stick_top)");
        this.f81617d = (SwitchCompat) findViewById6;
        if (C6394b.m19906b()) {
            i = R.color.jr;
        } else {
            i = R.color.jq;
        }
        if (C6394b.m19906b()) {
            i2 = R.color.jp;
        } else {
            i2 = R.color.jo;
        }
        SwitchCompat switchCompat = this.f81616c;
        if (switchCompat == null) {
            C7573i.m23583a("mMuteSwitch");
        }
        Context context = this;
        switchCompat.setTrackTintList(C1065a.m4638a(context, i));
        SwitchCompat switchCompat2 = this.f81616c;
        if (switchCompat2 == null) {
            C7573i.m23583a("mMuteSwitch");
        }
        switchCompat2.setThumbTintList(C1065a.m4638a(context, i2));
        SwitchCompat switchCompat3 = this.f81617d;
        if (switchCompat3 == null) {
            C7573i.m23583a("mStickTopSwitch");
        }
        switchCompat3.setTrackTintList(C1065a.m4638a(context, i));
        SwitchCompat switchCompat4 = this.f81617d;
        if (switchCompat4 == null) {
            C7573i.m23583a("mStickTopSwitch");
        }
        switchCompat4.setThumbTintList(C1065a.m4638a(context, i2));
        IIMService iIMService = IMService.get();
        C7573i.m23582a((Object) iIMService, "IMService.get()");
        if (iIMService.isImReduction()) {
            ViewGroup viewGroup = this.f81619f;
            if (viewGroup == null) {
                C7573i.m23583a("mMuteLayout");
            }
            viewGroup.setVisibility(8);
        }
        mo81642h();
    }

    /* renamed from: a */
    public static final /* synthetic */ SwitchCompat m101414a(BaseChatDetailActivity baseChatDetailActivity) {
        SwitchCompat switchCompat = baseChatDetailActivity.f81616c;
        if (switchCompat == null) {
            C7573i.m23583a("mMuteSwitch");
        }
        return switchCompat;
    }

    /* renamed from: b */
    public static final /* synthetic */ SwitchCompat m101416b(BaseChatDetailActivity baseChatDetailActivity) {
        SwitchCompat switchCompat = baseChatDetailActivity.f81617d;
        if (switchCompat == null) {
            C7573i.m23583a("mStickTopSwitch");
        }
        return switchCompat;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo81592d());
        C6956a.m21633b().setupStatusBar(this);
        mo81593e();
        mo81594f();
        mo81595g();
    }

    /* renamed from: c */
    private final void m101417c(boolean z) {
        if (z != mo81590b()) {
            SwitchCompat switchCompat = this.f81616c;
            if (switchCompat == null) {
                C7573i.m23583a("mMuteSwitch");
            }
            switchCompat.setEnabled(false);
            m101415a(!mo81590b(), "chat_mute_click");
            C6425b bVar = this.f81618e;
            if (bVar != null) {
                bVar.mo15576b(!mo81590b(), (C11195b<Conversation>) new C31102c<Conversation>(this));
            }
        }
    }

    /* renamed from: d */
    private final void m101418d(boolean z) {
        if (z != mo81591c()) {
            SwitchCompat switchCompat = this.f81617d;
            if (switchCompat == null) {
                C7573i.m23583a("mStickTopSwitch");
            }
            switchCompat.setEnabled(false);
            m101415a(!mo81591c(), "chat_top_click");
            C6425b bVar = this.f81618e;
            if (bVar != null) {
                bVar.mo15571a(!mo81591c(), (C11195b<Conversation>) new C31103d<Conversation>(this));
            }
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "v");
        int id = view.getId();
        if (id == R.id.dyc) {
            SwitchCompat switchCompat = this.f81616c;
            if (switchCompat == null) {
                C7573i.m23583a("mMuteSwitch");
            }
            SwitchCompat switchCompat2 = this.f81616c;
            if (switchCompat2 == null) {
                C7573i.m23583a("mMuteSwitch");
            }
            switchCompat.setChecked(!switchCompat2.isChecked());
            return;
        }
        if (id == R.id.e2k) {
            SwitchCompat switchCompat3 = this.f81617d;
            if (switchCompat3 == null) {
                C7573i.m23583a("mStickTopSwitch");
            }
            SwitchCompat switchCompat4 = this.f81617d;
            if (switchCompat4 == null) {
                C7573i.m23583a("mStickTopSwitch");
            }
            switchCompat3.setChecked(!switchCompat4.isChecked());
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton != null) {
            int id = compoundButton.getId();
            if (id == R.id.df0) {
                m101417c(z);
                return;
            }
            if (id == R.id.df3) {
                m101418d(z);
            }
        }
    }

    /* renamed from: a */
    private final void m101415a(boolean z, String str) {
        String str2 = "off";
        if (z) {
            str2 = "on";
        }
        C6425b bVar = this.f81618e;
        String str3 = null;
        if (bVar != null) {
            Conversation a = bVar.mo15562a();
            if (a != null && a.getConversationType() == C11203a.f30381b) {
                C31858ad.m103406a();
                C6425b bVar2 = this.f81618e;
                if (bVar2 != null) {
                    str3 = bVar2.f18778a;
                }
                C31858ad.m103458c(str3, "group", str2, str);
                return;
            }
        }
        C6425b bVar3 = this.f81618e;
        if (bVar3 != null) {
            Conversation a2 = bVar3.mo15562a();
            if (a2 != null && a2.getConversationType() == C11203a.f30380a) {
                C31858ad.m103406a();
                C6425b bVar4 = this.f81618e;
                if (bVar4 != null) {
                    str3 = bVar4.f18778a;
                }
                C31858ad.m103458c(str3, "private", str2, str);
            }
        }
    }
}
