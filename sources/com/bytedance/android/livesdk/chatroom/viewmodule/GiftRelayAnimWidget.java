package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.presenter.C4939ad;
import com.bytedance.android.livesdk.chatroom.presenter.C4939ad.C4940a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.relay.p392a.C8269a;
import com.bytedance.android.livesdk.gift.relay.p392a.C8271c;
import com.bytedance.android.livesdk.gift.relay.view.CountDownAnimationView;
import com.bytedance.android.livesdk.gift.relay.view.GiftRelayProgressBar;
import com.bytedance.android.livesdk.gift.relay.view.GiftRelayProgressBar.C8281a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.message.model.C8483aj;
import com.bytedance.android.livesdk.message.model.C8549ck;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a;
import com.bytedance.android.livesdkapi.depend.p440c.C9301a.C9302a;
import com.bytedance.android.livesdkapi.p457i.C9480h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.facebook.ads.AdError;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GiftRelayAnimWidget extends LiveRecyclableWidget implements OnClickListener, C4940a, C8281a, C9302a {

    /* renamed from: A */
    private ArrayDeque<Long> f15896A = new ArrayDeque<>();

    /* renamed from: B */
    private boolean f15897B;

    /* renamed from: C */
    private long f15898C;

    /* renamed from: a */
    public View f15899a;

    /* renamed from: b */
    public CountDownAnimationView f15900b;

    /* renamed from: c */
    public GiftRelayProgressBar f15901c;

    /* renamed from: d */
    public TextView f15902d;

    /* renamed from: e */
    public int f15903e;

    /* renamed from: f */
    private SimpleDraweeView f15904f;

    /* renamed from: g */
    private SimpleDraweeView f15905g;

    /* renamed from: h */
    private ObjectAnimator f15906h;

    /* renamed from: i */
    private CountDownTimer f15907i;

    /* renamed from: j */
    private SimpleDraweeView f15908j;

    /* renamed from: k */
    private HSImageView f15909k;

    /* renamed from: l */
    private ImageButton f15910l;

    /* renamed from: m */
    private TextView f15911m;

    /* renamed from: n */
    private C9301a f15912n;

    /* renamed from: o */
    private boolean f15913o;

    /* renamed from: p */
    private boolean f15914p;

    /* renamed from: q */
    private boolean f15915q;

    /* renamed from: r */
    private C4939ad f15916r;

    /* renamed from: s */
    private long f15917s;

    /* renamed from: t */
    private long f15918t;

    /* renamed from: u */
    private User f15919u;

    /* renamed from: v */
    private long f15920v;

    /* renamed from: w */
    private int f15921w;

    /* renamed from: x */
    private C9480h f15922x;

    /* renamed from: y */
    private List<Integer> f15923y;

    /* renamed from: z */
    private int[] f15924z = {1000, 3000, 6000};

    /* renamed from: a */
    public final void mo9118a(Throwable th) {
        C5596au.m18013a(this, th);
    }

    /* renamed from: d */
    public final void mo13769d() {
        m17305g();
    }

    /* renamed from: e */
    public final String mo9125e() {
        return C5596au.m18012a(this);
    }

    public int getLayoutId() {
        return R.layout.ar2;
    }

    /* renamed from: b */
    public final void mo13767b() {
        m17299b((int) VETransitionFilterParam.TransitionDuration_DEFAULT);
    }

    /* renamed from: c */
    public final void mo13768c() {
        m17304f();
        m17297a(this.f15920v);
        this.f15901c.setmProgressBarRank(String.valueOf(this.f15921w));
    }

    /* renamed from: f */
    private void m17304f() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f);
        scaleAnimation.setDuration(166);
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f);
                animation.setDuration(166);
                animation.setRepeatCount(0);
                animation.setFillAfter(true);
                GiftRelayAnimWidget.this.f15902d.startAnimation(scaleAnimation);
            }
        });
        this.f15902d.startAnimation(scaleAnimation);
    }

    /* renamed from: g */
    private void m17305g() {
        int i = 0;
        if (this.f15896A.isEmpty()) {
            this.f15897B = false;
            return;
        }
        long longValue = ((Long) this.f15896A.poll()).longValue();
        if (this.f15903e != 0) {
            if (longValue >= ((long) this.f15921w)) {
                int i2 = (int) longValue;
                this.f15921w = ((i2 / this.f15903e) + 1) * this.f15903e;
                Boolean valueOf = Boolean.valueOf(false);
                while (true) {
                    if (i < this.f15924z.length) {
                        if (longValue >= ((long) this.f15924z[i]) && longValue < ((long) (this.f15924z[i] + this.f15903e))) {
                            valueOf = Boolean.valueOf(true);
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                if (valueOf.booleanValue()) {
                    this.f15901c.mo21427a(i2 % this.f15903e, 1);
                } else {
                    this.f15901c.mo21427a(i2 % this.f15903e, 2);
                }
            } else {
                this.f15901c.mo21427a(((int) longValue) % this.f15903e, 0);
            }
        }
    }

    public void onUnload() {
        if (this.f15907i != null) {
            this.f15907i.cancel();
            this.f15907i = null;
        }
        if (this.f15906h != null && this.f15906h.isRunning()) {
            this.f15906h.cancel();
        }
        if (this.f15899a != null) {
            this.f15899a.animate().cancel();
            this.f15899a.setVisibility(8);
        }
        if (this.f15904f != null) {
            this.f15914p = false;
            this.f15904f.setVisibility(8);
        }
        if (this.f15908j != null) {
            this.f15913o = false;
            this.f15908j.setVisibility(8);
        }
        if (this.f15912n != null) {
            this.f15912n.removeMessages(0);
            this.f15912n.removeMessages(1);
        }
        if (this.f15916r != null) {
            this.f15916r.mo8963a();
        }
        this.f15919u = null;
        this.f15915q = false;
    }

    /* renamed from: a */
    public final void mo13766a() {
        this.f15898C = 0;
        this.f15897B = false;
        this.f15896A.clear();
        this.f15915q = false;
        this.dataCenter.lambda$put$1$DataCenter("data_is_gift_relay_showing", Boolean.valueOf(false));
        this.f15919u = null;
        this.f15921w = this.f15903e;
        this.f15899a.animate().translationX(-C9738o.m28708b(this.context, 160.0f)).setListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                GiftRelayAnimWidget.this.f15899a.animate().setListener(null);
                GiftRelayAnimWidget.this.f15901c.setProgress(0);
                GiftRelayAnimWidget.this.f15899a.setVisibility(8);
                GiftRelayAnimWidget.this.f15901c.setmProgressBarRank(String.valueOf(GiftRelayAnimWidget.this.f15903e));
                GiftRelayAnimWidget.this.f15901c.setProgressBarDrawable(C3358ac.m12513a().getDrawable(R.drawable.bqm));
            }
        }).setDuration(333).start();
    }

    /* renamed from: a */
    public final void mo12923a(C8269a aVar) {
        m17298a(aVar, 0, false);
    }

    /* renamed from: a */
    public final void mo12924a(C8483aj ajVar) {
        if (ajVar != null) {
            this.f15917s = ajVar.f23224a;
            m17298a(ajVar.f23231h, ajVar.f23226c, true);
        }
    }

    /* renamed from: a */
    private void m17296a(int i) {
        if (this.f15914p) {
            this.f15912n.removeMessages(0);
            this.f15912n.sendEmptyMessageDelayed(0, (long) i);
            return;
        }
        this.f15914p = true;
        this.f15904f.setVisibility(0);
        this.f15904f.setController(((C13382e) C13380c.m39166a().mo32711a("asset://com.ss.android.ies.live.sdk/gift/giftrelay_double_prize.webp").mo32751c(true)).mo32730f());
        this.f15912n.sendEmptyMessageDelayed(0, (long) i);
    }

    /* renamed from: b */
    private void m17299b(int i) {
        this.f15905g.setVisibility(0);
        this.f15905g.setController(((C13382e) C13380c.m39166a().mo32711a("asset://com.ss.android.ies.live.sdk/gift/giftrelay_star.webp").mo32751c(true)).mo32730f());
        this.f15912n.sendEmptyMessageDelayed(4, (long) i);
    }

    /* renamed from: c */
    private void m17301c(int i) {
        if (this.f15913o) {
            this.f15912n.removeMessages(1);
        }
        this.f15913o = true;
        this.f15900b.setVisibility(4);
        this.f15907i.cancel();
        this.f15908j.setVisibility(0);
        this.f15908j.setController(((C13382e) C13380c.m39166a().mo32711a("asset://com.ss.android.ies.live.sdk/gift/giftrelay_freeze.webp").mo32751c(true)).mo32730f());
        this.f15912n.sendEmptyMessageDelayed(1, (long) i);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ark || id == R.id.rl) {
            C8549ck ckVar = new C8549ck();
            ckVar.f23549a = "endless_pallet";
            ckVar.f23550b = this.f15917s;
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_gift_relay_dialog", ckVar);
        }
    }

    /* renamed from: a */
    private void m17297a(long j) {
        if (this.f15924z.length >= 3) {
            if (j >= ((long) this.f15924z[0]) && j < ((long) this.f15924z[1])) {
                this.f15901c.setProgressBarDrawable(C3358ac.m12513a().getDrawable(R.drawable.bqn));
            } else if (j >= ((long) this.f15924z[1]) && this.f15918t < ((long) this.f15924z[2])) {
                this.f15901c.setProgressBarDrawable(C3358ac.m12513a().getDrawable(R.drawable.bqo));
            } else if (j >= ((long) this.f15924z[2])) {
                this.f15901c.setProgressBarDrawable(C3358ac.m12513a().getDrawable(R.drawable.bqp));
            }
        }
    }

    /* renamed from: d */
    private void m17302d(int i) {
        this.f15915q = true;
        this.dataCenter.lambda$put$1$DataCenter("data_is_gift_relay_showing", Boolean.valueOf(true));
        this.f15899a.setX(-C9738o.m28708b(this.context, 160.0f));
        this.f15899a.setVisibility(0);
        m17303e(i);
        this.f15899a.animate().translationX(0.0f).setDuration(333).start();
        HashMap hashMap = new HashMap();
        Room room = (Room) this.dataCenter.get("data_room", null);
        if (room != null) {
            long id = room.getOwner().getId();
            long id2 = room.getId();
            hashMap.put("anchor_id", String.valueOf(id));
            hashMap.put("room_id", String.valueOf(id2));
        }
        C8443c.m25663a().mo21606a("livesdk_endless_gift_pallet_show", hashMap, new Object[0]);
    }

    /* renamed from: e */
    private void m17303e(int i) {
        if (!this.f15913o) {
            if (this.f15906h != null && this.f15906h.isRunning()) {
                this.f15906h.cancel();
            }
            if (this.f15907i != null) {
                this.f15907i.cancel();
            }
            this.f15900b.setTime(i);
            long j = ((long) i) * 1000;
            C54202 r1 = new CountDownTimer(j, 1000) {
                public final void onFinish() {
                    GiftRelayAnimWidget.this.mo13766a();
                }

                public final void onTick(long j) {
                    double d = (double) j;
                    Double.isNaN(d);
                    int ceil = (int) Math.ceil(d / 1000.0d);
                    if (ceil > 15) {
                        ceil = 15;
                    }
                    GiftRelayAnimWidget.this.f15900b.setTime(ceil);
                }
            };
            this.f15907i = r1;
            this.f15907i.start();
            this.f15900b.setVisibility(0);
            this.f15900b.setCountDownTime(i);
            this.f15906h = ObjectAnimator.ofFloat(this.f15900b, "progress", new float[]{360.0f, 0.0f}).setDuration(j);
            this.f15906h.start();
        }
    }

    public void onInit(Object[] objArr) {
        this.f15899a = this.contentView.findViewById(R.id.ark);
        this.f15904f = (SimpleDraweeView) this.contentView.findViewById(R.id.aa6);
        this.f15900b = (CountDownAnimationView) this.contentView.findViewById(R.id.a3k);
        this.f15908j = (SimpleDraweeView) this.contentView.findViewById(R.id.aph);
        this.f15905g = (SimpleDraweeView) this.contentView.findViewById(R.id.cle);
        this.f15909k = (HSImageView) this.contentView.findViewById(R.id.arv);
        this.f15902d = (TextView) this.contentView.findViewById(R.id.arw);
        this.f15910l = (ImageButton) this.contentView.findViewById(R.id.rl);
        this.f15901c = (GiftRelayProgressBar) this.contentView.findViewById(R.id.as0);
        this.f15911m = (TextView) this.contentView.findViewById(R.id.b15);
        this.f15912n = new C9301a(this);
        this.f15916r = new C4939ad();
        this.f15901c.setmProgressBarListener(this);
        this.f15923y = new LinkedList();
    }

    public void onLoad(Object[] objArr) {
        this.f15899a.setOnClickListener(this);
        this.f15910l.setOnClickListener(this);
        this.f15916r.mo9142a((C4940a) this);
        Room room = (Room) this.dataCenter.get("data_room", null);
        if (room != null) {
            long j = 0;
            C8271c giftRelayInfo = GiftManager.inst().getGiftRelayInfo(0);
            C4939ad adVar = this.f15916r;
            long longValue = ((Long) this.dataCenter.get("data_room_id", Long.valueOf(0))).longValue();
            long ownerUserId = room.getOwnerUserId();
            if (giftRelayInfo != null) {
                j = giftRelayInfo.f22712c;
            }
            adVar.mo12920a(longValue, ownerUserId, j);
            this.f15903e = 1000;
            this.f15923y = Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(1000), Integer.valueOf(AdError.SERVER_ERROR_CODE), Integer.valueOf(3000), Integer.valueOf(5000), Integer.valueOf(6000)});
            this.f15915q = false;
            if (LiveSettingKeys.LIVE_GIFT_CHAIN_LENTH.mo10240a() != null) {
                this.f15922x = (C9480h) LiveSettingKeys.LIVE_GIFT_CHAIN_LENTH.mo10240a();
                this.f15903e = this.f15922x.f25952a;
                this.f15923y = this.f15922x.f25953b;
            }
            this.f15921w = this.f15903e;
        }
    }

    /* renamed from: b */
    private void m17300b(C8269a aVar) {
        long j = aVar.f22702g;
        int i = 1;
        while (true) {
            if (i < this.f15923y.size()) {
                if (j < ((long) ((Integer) this.f15923y.get(i)).intValue()) && j >= ((long) ((Integer) this.f15923y.get(i - 1)).intValue())) {
                    break;
                }
                i++;
            } else {
                i = 0;
                break;
            }
        }
        if (i == 0) {
            i = this.f15923y.size() - 1;
        }
        User user = aVar.f22705j;
        this.f15919u = user;
        String str = "";
        if (user != null) {
            str = user.getNickName();
        }
        if (str == null) {
            str = "";
        }
        if (str.length() > 6) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 5));
            sb.append("...");
            str = sb.toString();
        }
        long j2 = aVar.f22706k;
        switch (i) {
            case 1:
                this.f15911m.setText(this.context.getResources().getString(R.string.emf, new Object[]{String.valueOf(((long) ((Integer) this.f15923y.get(i)).intValue()) - j)}));
                return;
            case 2:
                this.f15911m.setText(this.context.getResources().getString(R.string.emg, new Object[]{str, String.valueOf(j2)}));
                return;
            case 3:
                this.f15911m.setText(this.context.getResources().getString(R.string.emf, new Object[]{String.valueOf(((long) ((Integer) this.f15923y.get(i)).intValue()) - j)}));
                return;
            case 4:
                this.f15911m.setText(this.context.getResources().getString(R.string.emg, new Object[]{str, String.valueOf(j2)}));
                return;
            case 5:
                this.f15911m.setText(this.context.getResources().getString(R.string.emh, new Object[]{String.valueOf(6000 - (j % 6000))}));
                break;
        }
    }

    /* renamed from: a */
    public final void mo12403a(Message message) {
        if (message != null) {
            int i = message.what;
            if (i != 4) {
                if (i != 6) {
                    switch (i) {
                        case 0:
                            this.f15914p = false;
                            this.f15904f.setVisibility(8);
                            return;
                        case 1:
                            this.f15913o = false;
                            this.f15908j.setVisibility(8);
                            m17303e(15);
                            return;
                    }
                } else {
                    m17299b(1000);
                }
                return;
            }
            this.f15905g.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m17298a(C8269a aVar, long j, boolean z) {
        long j2;
        boolean z2;
        if (aVar != null) {
            this.f15920v = aVar.f22702g;
            if (this.f15920v > 0) {
                if (this.f15920v < ((long) this.f15903e)) {
                    this.f15921w = this.f15903e;
                }
                if (z) {
                    j2 = this.f15917s;
                } else {
                    j2 = aVar.f22696a;
                }
                C8149d findGiftById = GiftManager.inst().findGiftById(j2);
                if (findGiftById != null) {
                    C5343e.m17038a(this.f15909k, findGiftById.f22231b);
                    this.f15918t = this.f15920v;
                    int i = (int) ((aVar.f22701f - aVar.f22697b) / 1000);
                    if (this.f15915q) {
                        m17303e(i);
                    } else {
                        m17302d(i);
                    }
                    m17300b(aVar);
                    boolean z3 = false;
                    if (this.f15920v > this.f15898C) {
                        if (this.f15920v < 10000) {
                            TextView textView = this.f15902d;
                            Resources resources = this.context.getResources();
                            StringBuilder sb = new StringBuilder();
                            sb.append(String.valueOf(this.f15920v));
                            sb.append(" ");
                            textView.setText(resources.getString(R.string.emi, new Object[]{sb.toString()}));
                        } else {
                            TextView textView2 = this.f15902d;
                            Resources resources2 = this.context.getResources();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(C3385e.m12593c(this.f15920v));
                            sb2.append(" ");
                            textView2.setText(resources2.getString(R.string.emi, new Object[]{sb2.toString()}));
                        }
                        this.f15898C = this.f15920v;
                    }
                    this.f15896A.offer(Long.valueOf(this.f15920v));
                    if (!this.f15897B) {
                        this.f15897B = true;
                        m17305g();
                    }
                    if (z) {
                        if (!aVar.f22703h || j != 100) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (aVar.f22704i && j == 500) {
                            z3 = true;
                        }
                    } else {
                        z2 = aVar.f22703h;
                        z3 = aVar.f22704i;
                    }
                    if (z2) {
                        int i2 = (int) (aVar.f22699d - aVar.f22697b);
                        if (i2 > 4500) {
                            i2 = 4500;
                        }
                        m17301c(i2);
                    }
                    if (z3) {
                        m17296a((int) (aVar.f22700e - aVar.f22697b));
                    }
                }
            }
        }
    }
}
