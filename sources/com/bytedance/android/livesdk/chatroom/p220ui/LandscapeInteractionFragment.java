package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.p127c.C2429a;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.event.C4455y;
import com.bytedance.android.livesdk.chatroom.interact.C4487am;
import com.bytedance.android.livesdk.chatroom.viewmodule.ActionMessageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.OBSBarrageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5735a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5747j;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8497aw;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p451g.C9409a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LandscapeInteractionFragment */
public class LandscapeInteractionFragment extends AbsInteractionFragment implements OnClickListener, OnTouchListener {

    /* renamed from: I */
    private static final int[] f14598I = {R.id.x_, R.id.e9a, R.id.cli, R.id.bnp, R.id.dmo, R.id.o7, R.id.cqz, R.id.a5v, R.id.byb, R.id.zd, R.id.bo5, R.id.ai3, R.id.ehz, R.id.ehx, R.id.dn3};

    /* renamed from: H */
    public boolean f14599H = false;

    /* renamed from: J */
    private List<Integer> f14600J = new ArrayList();

    /* renamed from: K */
    private int f14601K = 0;

    /* renamed from: L */
    private View[] f14602L;

    /* renamed from: M */
    private List<Integer> f14603M = new ArrayList();

    /* renamed from: N */
    private List<View> f14604N;

    /* renamed from: O */
    private List<Integer> f14605O;

    /* renamed from: P */
    private C7492s<Long> f14606P;

    /* renamed from: Q */
    private C7321c f14607Q;

    /* renamed from: R */
    private long f14608R = 0;

    /* renamed from: S */
    private LinearLayout f14609S;

    /* renamed from: T */
    private View f14610T;

    /* renamed from: U */
    private boolean f14611U = false;

    /* renamed from: V */
    private View f14612V;

    /* renamed from: W */
    private View f14613W;

    /* renamed from: X */
    private long f14614X;

    /* renamed from: Y */
    private Dialog f14615Y = null;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LandscapeInteractionFragment$a */
    class C5084a implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5084a() {
        }

        public final void onClick(View view) {
            LandscapeInteractionFragment.this.f14599H = false;
            LandscapeInteractionFragment.this.mo13220w();
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
            C8443c.m25663a().mo21606a("clear_screen_click", hashMap, C8438j.class, Room.class);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LandscapeInteractionFragment$b */
    class C5085b implements C5739a {
        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
        }

        private C5085b() {
        }

        public final void onClick(View view) {
            C9097a.m27146a().mo22267a((Object) new C9409a(1));
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(LandscapeInteractionFragment.this.f14378a.getId()));
            hashMap.put("type", "landscape_to_portrait");
            C8443c.m25663a().mo21606a("screen_rotate", hashMap, new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_detail"));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LandscapeInteractionFragment$c */
    class C5086c implements C5739a {

        /* renamed from: b */
        private View f14619b;

        /* renamed from: c */
        private Dialog f14620c;

        /* renamed from: d */
        private C7321c f14621d;

        /* renamed from: a */
        public final void mo8812a(C5735a aVar) {
        }

        private C5086c() {
        }

        public final void onEvent(C4455y yVar) {
            if (this.f14619b instanceof TextView) {
                if (yVar.f12922d != null) {
                    ((TextView) this.f14619b).setText(yVar.f12922d.name);
                    return;
                }
                ((TextView) this.f14619b).setText(yVar.f12919a);
            }
        }

        /* renamed from: a */
        private static boolean m16420a(Room room) {
            if (room.isMultiPullDataValid()) {
                if (room.getStreamUrl().qualityList.size() > 1) {
                    return true;
                }
                return false;
            } else if (room.getStreamUrl().mo23054e().size() > 1) {
                return true;
            } else {
                return false;
            }
        }

        public final void onClick(View view) {
            if (this.f14620c == null && LandscapeInteractionFragment.this.getContext() != null) {
                this.f14620c = new C5310ed(LandscapeInteractionFragment.this.getContext(), LandscapeInteractionFragment.this.f14378a);
            }
            if (!this.f14620c.isShowing()) {
                this.f14620c.show();
            }
            C8443c.m25663a().mo21607a("definition_setting_button", Room.class, new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_detail"));
        }

        /* renamed from: b */
        public final void mo8813b(View view, DataCenter dataCenter) {
            if (this.f14620c != null) {
                C5194aq.m16815a(this.f14620c);
            }
            this.f14620c = null;
            if (this.f14621d != null && !this.f14621d.isDisposed()) {
                this.f14621d.dispose();
            }
        }

        /* renamed from: a */
        public final void mo8811a(View view, DataCenter dataCenter) {
            String str;
            this.f14619b = view;
            if (!(this.f14619b instanceof TextView) || !m16420a(LandscapeInteractionFragment.this.f14378a)) {
                this.f14619b.setVisibility(8);
                return;
            }
            if (this.f14621d != null && !this.f14621d.isDisposed()) {
                this.f14621d.dispose();
            }
            this.f14621d = C9097a.m27146a().mo22266a(C4455y.class).mo19325f((C7326g<? super T>) new C7326g<C4455y>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(C4455y yVar) throws Exception {
                    C5086c.this.onEvent(yVar);
                }
            });
            TextView textView = (TextView) this.f14619b;
            if (LandscapeInteractionFragment.this.f14378a.isMultiPullDataValid()) {
                str = LandscapeInteractionFragment.this.f14378a.getStreamUrl().mo23056g();
            } else {
                str = LandscapeInteractionFragment.this.f14378a.getStreamUrl().f25619r;
            }
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public final void mo10475a(C2429a aVar) {
    }

    /* renamed from: a */
    public final void mo10476a(C4487am amVar) {
    }

    /* renamed from: f */
    public final void mo10484f() {
    }

    public void onPause() {
        super.onPause();
        m16398B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo13132i() {
        super.mo13132i();
        this.f14611U = true;
        m16397A();
    }

    /* renamed from: B */
    private void m16398B() {
        if (this.f14607Q != null && !this.f14607Q.isDisposed()) {
            this.f14607Q.dispose();
        }
    }

    /* renamed from: C */
    private void m16399C() {
        for (int valueOf : f14598I) {
            this.f14600J.add(Integer.valueOf(valueOf));
            this.f14603M.add(Integer.valueOf(8));
        }
    }

    /* renamed from: g */
    public final boolean mo13130g() {
        if (getContext() == null || getContext().getResources().getConfiguration().orientation != 1) {
            return false;
        }
        return true;
    }

    public void onResume() {
        super.onResume();
        this.f14614X = System.currentTimeMillis();
        if (this.f14611U) {
            m16397A();
        }
    }

    /* renamed from: D */
    private void m16400D() {
        LayoutParams layoutParams = (LayoutParams) this.f14462l.getLayoutParams();
        LayoutParams layoutParams2 = new LayoutParams(layoutParams.width, layoutParams.height);
        layoutParams2.addRule(11);
        layoutParams2.addRule(6, R.id.aaf);
        layoutParams2.topMargin = (int) C9738o.m28708b(getContext(), 46.0f);
        layoutParams2.rightMargin = (int) C9738o.m28708b(getContext(), 8.0f);
        this.f14462l.setLayoutParams(layoutParams2);
    }

    /* renamed from: y */
    private void m16403y() {
        if (this.f14612V != null && this.f14612V.getVisibility() == 0) {
            this.f14612V.setVisibility(4);
        }
        if (this.f14613W != null && this.f14613W.getVisibility() != 8) {
            this.f14613W.setVisibility(8);
        }
    }

    /* renamed from: z */
    private void m16404z() {
        if (!(this.f14612V == null || this.f14612V.getVisibility() == 0)) {
            this.f14612V.setVisibility(0);
        }
        if (this.f14613W != null && this.f14613W.getVisibility() != 0) {
            this.f14613W.setVisibility(0);
        }
    }

    /* renamed from: A */
    private void m16397A() {
        if (this.f14601K != 8) {
            if (this.f14606P == null) {
                this.f14606P = C7492s.m23295b((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION, TimeUnit.MILLISECONDS).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a());
            }
            if (this.f14607Q != null && !this.f14607Q.isDisposed()) {
                this.f14607Q.dispose();
            }
            this.f14607Q = this.f14606P.mo19280a((C7326g<? super T>) new C5192ao<Object>(this), C5193ap.f15248a);
        }
    }

    /* renamed from: x */
    private void m16402x() {
        C8497aw awVar = new C8497aw();
        awVar.f23284a = (int) getResources().getDimension(R.dimen.rk);
        if (this.f14472v != null) {
            this.f14472v.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(awVar.f23284a));
        }
        C8497aw awVar2 = new C8497aw();
        awVar2.f23284a = (int) getResources().getDimension(R.dimen.rj);
        if (this.f14472v != null) {
            this.f14472v.lambda$put$1$DataCenter("cmd_enter_widget_layout_change", awVar2);
        }
    }

    public void onStop() {
        super.onStop();
        HashMap hashMap = new HashMap();
        hashMap.put("time", String.valueOf(System.currentTimeMillis() - this.f14614X));
        C8443c.m25663a().mo21606a("transverse_screen_duration", hashMap, new C8438j().mo21599b("live").mo21603f("other").mo21598a("live_detail"), Room.class);
    }

    /* renamed from: w */
    public final void mo13220w() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.f14599H = !this.f14599H;
        C5738d c = C5747j.m18105c();
        ToolbarButton toolbarButton = ToolbarButton.DOUYIN_OFFICIAL_IMMERSE;
        int i10 = 0;
        if (this.f14599H) {
            i = 8;
        } else {
            i = 0;
        }
        c.mo14163a(toolbarButton, i);
        C5738d c2 = C5747j.m18105c();
        ToolbarButton toolbarButton2 = ToolbarButton.DOUYIN_OFFICIAL_QUALITY;
        if (this.f14599H) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        c2.mo14163a(toolbarButton2, i2);
        C5738d c3 = C5747j.m18105c();
        ToolbarButton toolbarButton3 = ToolbarButton.GIFT;
        if (this.f14599H) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        c3.mo14163a(toolbarButton3, i3);
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("Gift icon status changed, visiable:");
        sb.append(!this.f14599H);
        sb.append(", reason:LandscapeInteractionFragment#toggleImmerseMode()");
        C8444d.m11971b("ttlive_gift", sb.toString());
        View view = this.f14460j;
        if (this.f14599H) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        C9738o.m28712b(view, i4);
        View findViewById = this.f14610T.findViewById(R.id.zd);
        if (this.f14599H) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        C9738o.m28712b(findViewById, i5);
        View findViewById2 = this.f14610T.findViewById(R.id.kl);
        if (this.f14599H) {
            i6 = 8;
        } else {
            i6 = 0;
        }
        C9738o.m28712b(findViewById2, i6);
        View findViewById3 = this.f14610T.findViewById(R.id.o7);
        if (this.f14599H) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        C9738o.m28712b(findViewById3, i7);
        View findViewById4 = this.f14610T.findViewById(R.id.c87);
        if (this.f14599H) {
            i8 = 8;
        } else {
            i8 = 0;
        }
        C9738o.m28712b(findViewById4, i8);
        View findViewById5 = this.f14610T.findViewById(R.id.cwd);
        if (this.f14599H) {
            i10 = 8;
        }
        C9738o.m28712b(findViewById5, i10);
        C9097a a = C9097a.m27146a();
        if (!this.f14599H) {
            i9 = 4;
        } else {
            i9 = 3;
        }
        a.mo22267a((Object) new C9409a(i9));
    }

    /* renamed from: b */
    static final /* synthetic */ void m16401b(Throwable th) throws Exception {
        throw new RuntimeException(th);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m16402x();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13216a(Long l) throws Exception {
        if (this.f14601K == 0) {
            mo13217b(8);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
        }
        return onCreateDialog;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.c88 && this.f14615Y != null) {
            mo13217b(8);
            this.f14615Y.show();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            view.findViewById(R.id.avf).setOnTouchListener(this);
            view.findViewById(R.id.dmf).setOnTouchListener(this);
            view.findViewById(R.id.c88).setOnClickListener(this);
            view.findViewById(R.id.byb).setVisibility(8);
        }
        m16399C();
        C5738d a = C5747j.m18103a();
        a.mo14165a(ToolbarButton.SWITCH_VIDEO_QUALITY, (C5739a) new C5086c());
        a.mo14165a(ToolbarButton.SWITCH_SCREEN_ORIENTATION, (C5739a) new C5085b());
        if (C3387g.m12599a(getContext())) {
            this.f14610T.setPadding(C9738o.m28717e(getContext()), -3, -3, -3);
        }
        if (view != null) {
            C9738o.m28712b(view.findViewById(R.id.jn), 8);
        }
        if (this.f14378a != null && this.f14378a.isOfficial()) {
            C5747j.m18103a().mo14165a(ToolbarButton.DOUYIN_OFFICIAL_IMMERSE, (C5739a) new C5084a());
            C5747j.m18103a().mo14165a(ToolbarButton.DOUYIN_OFFICIAL_QUALITY, (C5739a) new C5086c());
            m16400D();
            if (view != null) {
                View findViewById = view.findViewById(R.id.c7x);
                if (findViewById != null && getContext() != null) {
                    C9738o.m28701a(findViewById, -3, (int) (((float) C9738o.m28709b(getContext())) * 0.6f));
                    C9738o.m28702a(findViewById, -3, (int) C9738o.m28708b(getContext(), 40.0f), -3, -3);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo13217b(int i) {
        if (this.f14378a == null || !this.f14378a.isOfficial()) {
            this.f14601K = i;
            if (i == 0) {
                m16397A();
            }
            int i2 = 0;
            if (this.f14602L == null) {
                this.f14602L = new View[this.f14600J.size()];
                for (int i3 = 0; i3 < this.f14602L.length; i3++) {
                    this.f14602L[i3] = this.f14610T.findViewById(((Integer) this.f14600J.get(i3)).intValue());
                }
            }
            if (i == 8) {
                for (int i4 = 0; i4 < this.f14600J.size(); i4++) {
                    if (this.f14602L[i4] != null) {
                        this.f14603M.set(i4, Integer.valueOf(this.f14602L[i4].getVisibility()));
                        this.f14602L[i4].setVisibility(8);
                    }
                }
                if (this.f14609S == null) {
                    this.f14609S = (LinearLayout) this.f14610T.findViewById(R.id.ac);
                }
                if (this.f14609S != null) {
                    this.f14605O = new ArrayList();
                    this.f14604N = new ArrayList();
                    while (i2 < this.f14609S.getChildCount()) {
                        View childAt = this.f14609S.getChildAt(i2);
                        if (!(childAt.getTag() == ToolbarButton.RECHARGE_GUIDE || childAt.getTag() == ToolbarButton.FAST_GIFT || childAt.getTag() == ToolbarButton.GIFT || childAt.getTag() == ToolbarButton.SWITCH_SCREEN_ORIENTATION)) {
                            this.f14604N.add(childAt);
                            this.f14605O.add(Integer.valueOf(childAt.getVisibility()));
                            childAt.setVisibility(8);
                        }
                        i2++;
                    }
                    return;
                }
            } else {
                for (int i5 = 0; i5 < this.f14600J.size(); i5++) {
                    if (this.f14602L[i5] != null) {
                        this.f14602L[i5].setVisibility(((Integer) this.f14603M.get(i5)).intValue());
                        if (i == 0 && this.f14602L[i5].getId() == R.id.x_) {
                            C9738o.m28712b(this.f14602L[i5], i);
                        }
                    }
                }
                if (this.f14604N != null) {
                    int size = this.f14604N.size();
                    while (i2 < size) {
                        ((View) this.f14604N.get(i2)).setVisibility(((Integer) this.f14605O.get(i2)).intValue());
                        i2++;
                    }
                }
            }
            return;
        }
        this.f14601K = i;
        if (i == 0) {
            m16397A();
            m16404z();
            return;
        }
        if (i == 8) {
            m16403y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13113a(View view, Bundle bundle) {
        this.f14475y.load(R.id.aj, new ActionMessageWidget()).load(R.id.c7x, new OBSBarrageWidget());
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (view.getId() == R.id.avf) {
            if (this.f14611U) {
                switch (motionEvent.getAction()) {
                    case 0:
                        if (SystemClock.elapsedRealtime() - this.f14608R > 300) {
                            z = true;
                        }
                        this.f14608R = SystemClock.elapsedRealtime();
                        return z;
                    case 1:
                        if (this.f14601K != 0) {
                            mo13217b(0);
                            break;
                        } else {
                            mo13217b(8);
                            break;
                        }
                }
            } else {
                return false;
            }
        } else if (view.getId() == R.id.dmf) {
            m16397A();
            return false;
        }
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f14610T = LayoutInflater.from(getContext()).inflate(R.layout.aqd, viewGroup, false);
        this.f14612V = this.f14610T.findViewById(R.id.aaf);
        if (this.f14378a == null || !this.f14378a.isOfficial()) {
            this.f14612V.setVisibility(8);
        }
        this.f14613W = this.f14610T.findViewById(R.id.ns);
        return this.f14610T;
    }
}
