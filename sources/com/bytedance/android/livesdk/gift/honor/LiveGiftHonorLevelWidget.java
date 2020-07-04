package com.bytedance.android.livesdk.gift.honor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C2380l;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.p122a.C2369b;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7939b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p390a.C8135b;
import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9507h;
import com.bytedance.android.livesdkapi.p457i.C9481i;
import com.bytedance.android.livesdkapi.p457i.C9481i.C9482a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7494t;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class LiveGiftHonorLevelWidget extends LiveWidget {

    /* renamed from: a */
    private C2380l f22063a;

    /* renamed from: b */
    private TextView f22064b;

    /* renamed from: c */
    private LiveGiftHonorProgressView f22065c;

    /* renamed from: d */
    private TextView f22066d;

    /* renamed from: e */
    private TextView f22067e;

    /* renamed from: f */
    private boolean f22068f;

    /* renamed from: g */
    private TextView f22069g;

    /* renamed from: h */
    private HSImageView f22070h;

    /* renamed from: i */
    private View f22071i;

    /* renamed from: j */
    private GiftDialogViewModel f22072j;

    /* renamed from: k */
    private C9481i f22073k;

    /* renamed from: l */
    private C7321c f22074l;

    /* renamed from: m */
    private Handler f22075m;

    /* renamed from: n */
    private ValueAnimator f22076n;

    /* renamed from: o */
    private ValueAnimator f22077o;

    /* renamed from: p */
    private View f22078p;

    /* renamed from: q */
    private boolean f22079q;

    /* renamed from: r */
    private float f22080r;

    /* renamed from: s */
    private GiftViewModel f22081s;

    public int getLayoutId() {
        return R.layout.ar1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21186a(Integer num) {
        if (this.f22072j.f22471s.getValue() != null || num.intValue() <= 0) {
            if (this.f22075m != null) {
                this.f22075m.post(new C8098j(this));
            }
        } else if (this.f22075m != null) {
            this.f22075m.post(new C8097i(this, num));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21184a(C8158m mVar) {
        if (mVar != null && mVar.f22297a != null && mVar.f22297a.f26016d != null) {
            for (C9507h hVar : mVar.f22297a.f26016d) {
                if (!(hVar == null || hVar.f26023d == null || hVar.f26023d.f26032a == null || hVar.f26023d.f26032a.getUserHonor() == null)) {
                    m24820a(hVar.f26023d.f26032a.getUserHonor(), false);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21181a(View view) {
        Room room = (Room) this.dataCenter.get("data_room", null);
        if (room != null) {
            Bundle bundle = new Bundle();
            String valueOf = ((C3592a) C3596c.m13172a(C3592a.class)).user() != null ? String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()) : "";
            if (room != null) {
                bundle.putString("com.ss.android.ugc.live.intent.extra.ROOM_ID", String.valueOf(room.getId()));
                bundle.putString("com.ss.android.ugc.live.intent.extra.REQUEST_ID", room.getRequestId());
                bundle.putString("com.ss.android.ugc.live.intent.extra.LOG_PB", room.getLog_pb());
                bundle.putString("user_id", valueOf);
                bundle.putString("request_page", "privilege_click");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", valueOf);
            C8443c.m25663a().mo21606a("privilege_click", hashMap, new C8438j(), Room.class);
            if (this.f22073k != null) {
                C9469i.m27993e().mo14569i().handleSchema(this.context, this.f22073k.f25955b, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21182a(IUser iUser) throws Exception {
        m24820a((iUser == null || !(iUser.getUserHonor() instanceof C2380l)) ? null : (C2380l) iUser.getUserHonor(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo21194d() {
        this.f22065c.mo21198a();
        if (this.f22074l != null) {
            this.f22074l.dispose();
        }
        if (this.f22063a != null) {
            m24822a(this.f22063a.mo8713q());
        }
    }

    /* renamed from: i */
    private void m24830i() {
        if (this.f22063a != null) {
            float r = (float) ((this.f22063a.mo8714r() - this.f22063a.mo8715s()) + 0);
            if (r > 0.0f) {
                this.f22065c.mo21199a(this.f22080r / r);
            }
        }
    }

    /* renamed from: g */
    private void m24828g() {
        IUser a = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a();
        if (a instanceof User) {
            ((User) a).setUserHonor(this.f22063a);
        }
        String string = this.context.getString(R.string.ena);
        if (!(this.f22073k == null || this.f22073k.f25960g == null)) {
            Iterator it = this.f22073k.f25960g.iterator();
            while (it.hasNext()) {
                C9482a aVar = (C9482a) it.next();
                if (!(aVar == null || this.f22063a == null || aVar.f25961a != this.f22063a.mo8710n())) {
                    string = aVar.f25962b;
                }
            }
        }
        this.f22069g.setText(string);
        m24829h();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f22075m != null) {
            this.f22075m.removeCallbacksAndMessages(null);
        }
        if (this.f22076n != null) {
            this.f22076n.cancel();
            this.f22076n.removeAllUpdateListeners();
            this.f22076n.removeAllListeners();
        }
        if (this.f22077o != null) {
            this.f22077o.cancel();
            this.f22077o.removeAllUpdateListeners();
            this.f22077o.removeAllListeners();
        }
        ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22185e().mo19137b((C47557ad<? super T>) new C8986g<Object>());
    }

    /* renamed from: f */
    private void m24827f() {
        this.f22064b = (TextView) this.contentView.findViewById(R.id.a7w);
        this.f22064b.setOnClickListener(new C8106r(this));
        this.f22071i = this.containerView.findViewById(R.id.blj);
        this.f22069g = (TextView) this.containerView.findViewById(R.id.blk);
        this.f22065c = (LiveGiftHonorProgressView) this.containerView.findViewById(R.id.aw1);
        this.f22066d = (TextView) this.containerView.findViewById(R.id.c3k);
        this.f22070h = (HSImageView) this.containerView.findViewById(R.id.bl7);
        this.f22067e = (TextView) this.containerView.findViewById(R.id.ei4);
        this.f22066d.setAlpha(0.6f);
        this.f22065c.setProgressAnimatorFinishCallBack(new C8091c(this));
        this.f22078p = this.containerView.findViewById(R.id.ar2);
        ((C3245ad) ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22186f().mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C8092d<Object>(this));
        if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22185e().mo19137b((C47557ad<? super T>) new C8986g<Object>());
            this.f22079q = true;
        }
        m24820a(this.f22063a, true);
    }

    /* renamed from: h */
    private void m24829h() {
        this.f22065c.setAlpha(0.0f);
        this.f22066d.setAlpha(0.0f);
        this.f22065c.mo21200a(0.0f, false);
        m24830i();
        if (this.f22063a != null) {
            if (this.f22063a.mo8710n() == 0) {
                this.f22070h.setActualImageResource(R.drawable.cit);
            } else {
                C3393m.m12633b(this.f22070h, this.f22063a.mo8707k());
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f22076n = ofFloat;
        Paint paint = new Paint();
        paint.setTextSize(C9738o.m28690a(this.context, 10.0f));
        ofFloat.addUpdateListener(new C8093e(this, paint.measureText(this.f22069g.getText().toString()) + C9738o.m28708b(this.context, 40.0f)));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo21195a(Integer num) throws Exception {
                LiveGiftHonorLevelWidget.this.mo21176a();
            }

            public final void onAnimationEnd(Animator animator) {
                ((C3245ad) C7492s.m23301b(Integer.valueOf(1)).mo19320e(1500, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) LiveGiftHonorLevelWidget.this.autoDispose())).mo10182a((C7326g<? super T>) new C8107s<Object>(this));
            }
        });
        ofFloat.setDuration(500).start();
    }

    /* renamed from: b */
    public final void mo21187b() {
        LayoutParams layoutParams = this.f22071i.getLayoutParams();
        layoutParams.width = 0;
        layoutParams.height = (int) C9738o.m28708b(this.context, 14.0f);
        this.f22071i.setLayoutParams(layoutParams);
        this.f22069g.setAlpha(1.0f);
        m24820a(this.f22063a, false);
        if (this.f22063a != null) {
            m24822a(this.f22063a.mo8713q());
        }
    }

    public void onCreate() {
        C2369b bVar;
        super.onCreate();
        if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            this.f22079q = true;
        }
        if (this.f22079q) {
            bVar = ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a().getUserHonor();
        } else {
            bVar = null;
        }
        if (bVar instanceof C2380l) {
            this.f22063a = (C2380l) bVar;
        }
        this.f22075m = new Handler(Looper.getMainLooper());
        this.f22073k = (C9481i) LiveSettingKeys.LIVE_HONOR_LEVEL_SETTINGS_SETTING_KEY.mo10240a();
        m24827f();
        this.f22072j = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        if (this.f22081s != null) {
            this.f22081s.mo20784a((C0043i) this, (C0053p<C7939b>) new C8090b<C7939b>(this));
            this.f22078p.setVisibility(8);
            return;
        }
        if (this.f22072j != null) {
            this.f22072j.f22439A.observe(this, new C8099k(this));
            this.f22072j.f22471s.observe(this, new C8100l(this));
            this.f22072j.f22440B.observe(this, new C8101m(this));
            this.f22078p.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo21176a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f22077o = ofFloat;
        ofFloat.addUpdateListener(new C8094f(this, ((float) this.f22065c.getWidth()) + this.f22065c.getX(), (float) this.f22071i.getWidth()));
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                LiveGiftHonorLevelWidget.this.mo21187b();
            }
        });
        ofFloat.setDuration(200).start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21189b(C8169b bVar) {
        if (bVar != null) {
            mo21180a(bVar.f22365d);
        }
    }

    /* renamed from: d */
    private void m24825d(C8158m mVar) {
        if (this.f22075m != null) {
            this.f22075m.post(new C8105q(this, mVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21185a(C8169b bVar) {
        if (this.f22075m != null) {
            this.f22075m.post(new C8096h(this, bVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21188b(C8158m mVar) {
        if (this.f22075m != null) {
            this.f22075m.post(new C8095g(this, mVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo21193c(Integer num) throws Exception {
        if (this.f22063a != null) {
            m24822a(this.f22063a.mo8713q());
        }
    }

    /* renamed from: a */
    private void m24822a(String str) {
        int i;
        if (this.f22075m != null) {
            this.f22066d.setAlpha(0.6f);
            this.f22066d.setText(str);
            TextView textView = this.f22066d;
            if (this.f22068f) {
                i = 8;
            } else {
                i = 0;
            }
            C9738o.m28712b((View) textView, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21190b(Integer num) {
        mo21180a(num.intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21183a(C7939b bVar) {
        if (bVar != null) {
            switch (bVar.f21493a) {
                case 1:
                    m24821a((C8135b) null);
                    break;
                case 2:
                    m24821a(bVar.f21494b);
                    break;
            }
            m24825d(bVar.f21503k);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21177a(float f) {
        if (f < 1.0f && this.f22063a != null) {
            m24822a(this.f22063a.mo8713q());
        }
    }

    /* renamed from: a */
    private void m24821a(C8135b bVar) {
        int i;
        if (this.f22075m != null) {
            if (bVar == null) {
                this.f22075m.post(new C8102n(this));
                return;
            }
            C8149d dVar = null;
            if (bVar.f22206d instanceof C8149d) {
                dVar = bVar.f22206d;
            } else if (bVar.f22206d instanceof Prop) {
                dVar = ((Prop) bVar.f22206d).gift;
            }
            if (dVar != null) {
                i = dVar.f22235f;
            } else {
                i = 0;
            }
            if (i > 0) {
                this.f22075m.post(new C8103o(this, i));
            } else {
                this.f22075m.post(new C8104p(this));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21180a(int i) {
        float f = (float) i;
        this.f22080r = f;
        if (i <= 0 || this.f22063a == null || this.f22068f) {
            if (this.f22063a != null) {
                m24822a(this.f22063a.mo8713q());
            }
            return;
        }
        StringBuilder sb = new StringBuilder("+");
        sb.append(i);
        String sb2 = sb.toString();
        this.f22065c.mo21199a(f / ((float) ((this.f22063a.mo8714r() - this.f22063a.mo8715s()) + 0)));
        this.f22066d.setText(sb2);
        if (this.f22074l != null) {
            this.f22074l.dispose();
        }
        this.f22074l = ((C3245ad) C7492s.m23301b(Integer.valueOf(1)).mo19320e(DouPlusShareGuideExperiment.MIN_VALID_DURATION, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10182a((C7326g<? super T>) new C8089a<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo21192c(C8158m mVar) {
        if (mVar != null && mVar.f22297a != null && mVar.f22297a.f26016d != null) {
            for (C9507h hVar : mVar.f22297a.f26016d) {
                if (!(hVar == null || hVar.f26023d == null || hVar.f26023d.f26032a == null || hVar.f26023d.f26032a.getUserHonor() == null)) {
                    m24820a(hVar.f26023d.f26032a.getUserHonor(), false);
                }
            }
        }
    }

    /* renamed from: a */
    private void m24820a(C2380l lVar, boolean z) {
        String str;
        int i;
        if (lVar != null) {
            C2380l lVar2 = this.f22063a;
            this.f22063a = lVar;
            TextView textView = this.f22064b;
            if (this.f22073k != null) {
                str = this.f22073k.f25957d;
            } else {
                str = this.context.getString(R.string.en9);
            }
            textView.setText(str);
            long a = this.f22063a.mo8730a();
            if (a == 0) {
                this.f22068f = true;
                if (this.f22073k != null) {
                    this.f22067e.setText(this.f22073k.f25958e);
                }
                C9738o.m28712b((View) this.f22067e, 0);
                C9738o.m28712b((View) this.f22070h, 8);
                C9738o.m28712b((View) this.f22065c, 8);
                C9738o.m28712b((View) this.f22066d, 8);
                return;
            }
            if (this.f22063a != null) {
                m24822a(this.f22063a.mo8713q());
            }
            C9738o.m28712b((View) this.f22067e, 8);
            C9738o.m28712b((View) this.f22070h, 0);
            C9738o.m28712b((View) this.f22065c, 0);
            this.f22068f = false;
            long s = lVar.mo8715s();
            float f = (float) (a - s);
            float r = (float) ((lVar.mo8714r() - s) + 0);
            float f2 = 0.0f;
            if (f > 0.0f && r > 0.0f) {
                f2 = f / r;
            }
            if (z || !this.f22079q) {
                this.f22079q = true;
                if (lVar.mo8710n() == 0) {
                    this.f22070h.setActualImageResource(R.drawable.cit);
                } else {
                    C3393m.m12633b(this.f22070h, lVar.mo8707k());
                }
                this.f22065c.mo21200a(f2, false);
                return;
            }
            if (lVar2 == null) {
                i = 0;
            } else {
                i = lVar2.mo8710n();
            }
            int n = lVar.mo8710n();
            if (i == n) {
                if (lVar.mo8710n() == 0) {
                    this.f22070h.setActualImageResource(R.drawable.cit);
                } else {
                    C3393m.m12633b(this.f22070h, lVar.mo8707k());
                }
                this.f22065c.mo21200a(f2, true);
            } else if (i < n) {
                this.f22065c.mo21200a(1.0f, false);
                m24828g();
            } else {
                if (lVar.mo8710n() == 0) {
                    this.f22070h.setActualImageResource(R.drawable.cit);
                } else {
                    C3393m.m12633b(this.f22070h, lVar.mo8707k());
                }
                this.f22065c.mo21200a(f2, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21179a(float f, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LayoutParams layoutParams = this.f22071i.getLayoutParams();
        layoutParams.width = (int) (f * floatValue);
        this.f22071i.setLayoutParams(layoutParams);
        this.f22071i.setAlpha(floatValue);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21178a(float f, float f2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        LayoutParams layoutParams = this.f22071i.getLayoutParams();
        layoutParams.height = (int) ((((float) ((int) C9738o.m28708b(this.context, 10.0f))) * floatValue) + C9738o.m28708b(this.context, 4.0f));
        float f3 = 1.0f - floatValue;
        layoutParams.width = (int) (((((float) ((int) (f - C9738o.m28708b(this.context, 12.0f)))) - f2) * f3) + f2);
        this.f22071i.setLayoutParams(layoutParams);
        this.f22069g.setAlpha(floatValue);
        this.f22071i.setAlpha(floatValue);
        this.f22065c.setAlpha(f3);
    }
}
