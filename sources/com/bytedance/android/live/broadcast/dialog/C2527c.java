package com.bytedance.android.live.broadcast.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.model.C2752c;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.p534b.C10296b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.dialog.c */
public final class C2527c extends Dialog implements OnClickListener {

    /* renamed from: b */
    private static final int f8135b = Color.parseColor("#80FFFFFF");

    /* renamed from: c */
    private static final int f8136c = Color.parseColor("#FF2200");

    /* renamed from: a */
    public C2528a f8137a;

    /* renamed from: d */
    private ImageView f8138d;

    /* renamed from: e */
    private TextView f8139e;

    /* renamed from: f */
    private View f8140f;

    /* renamed from: g */
    private ImageView f8141g;

    /* renamed from: h */
    private TextView f8142h;

    /* renamed from: i */
    private View f8143i;

    /* renamed from: j */
    private ImageView f8144j;

    /* renamed from: k */
    private TextView f8145k;

    /* renamed from: l */
    private View f8146l;

    /* renamed from: m */
    private ImageView f8147m;

    /* renamed from: n */
    private TextView f8148n;

    /* renamed from: o */
    private View f8149o;

    /* renamed from: p */
    private boolean f8150p;

    /* renamed from: q */
    private boolean f8151q;

    /* renamed from: r */
    private boolean f8152r;

    /* renamed from: s */
    private LiveMode f8153s;

    /* renamed from: t */
    private View f8154t;

    /* renamed from: u */
    private View f8155u;

    /* renamed from: v */
    private View f8156v;

    /* renamed from: w */
    private C2752c f8157w;

    /* renamed from: x */
    private C7321c f8158x;

    /* renamed from: com.bytedance.android.live.broadcast.dialog.c$a */
    public interface C2528a {
        /* renamed from: a */
        void mo9109a(LiveMode liveMode);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m10450a(this.f8153s);
    }

    public final void onDetachedFromWindow() {
        this.f8137a = null;
        if (this.f8158x != null && !this.f8158x.isDisposed()) {
            this.f8158x.dispose();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9103a(View view) {
        dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9104a(C3479d dVar) throws Exception {
        m10449a((C2752c) dVar.data, true);
    }

    /* renamed from: b */
    private void m10452b(LiveMode liveMode) {
        int i;
        int i2;
        int i3;
        this.f8153s = liveMode;
        View view = this.f8140f;
        int i4 = 8;
        if (this.f8153s == LiveMode.VIDEO) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.f8143i;
        if (this.f8153s == LiveMode.AUDIO) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        View view3 = this.f8146l;
        if (this.f8153s == LiveMode.THIRD_PARTY) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view3.setVisibility(i3);
        View view4 = this.f8149o;
        if (this.f8153s == LiveMode.SCREEN_RECORD) {
            i4 = 0;
        }
        view4.setVisibility(i4);
        if (this.f8137a != null) {
            this.f8137a.mo9109a(this.f8153s);
        }
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.eac) {
            m10450a(LiveMode.VIDEO);
            dismiss();
        } else if (id == R.id.hl) {
            m10450a(LiveMode.AUDIO);
            dismiss();
        } else if (id == R.id.diq) {
            m10450a(LiveMode.THIRD_PARTY);
            dismiss();
            HashMap hashMap = new HashMap();
            hashMap.put("event_page", "live_take_page");
            C8443c.m25663a().mo21606a("thirdparty_take_click", hashMap, new C8438j().mo21599b("live").mo21603f("click"));
        } else {
            if (id == R.id.cz7) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("event_page", "live_take_page");
                C8443c.m25663a().mo21606a("game_take_click", hashMap2, new C8438j().mo21599b("live").mo21603f("click"));
                m10450a(LiveMode.SCREEN_RECORD);
            }
        }
    }

    /* renamed from: a */
    private void m10450a(LiveMode liveMode) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4 = true;
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
            m10452b(liveMode);
            return;
        }
        this.f8153s = liveMode;
        if (this.f8153s == LiveMode.VIDEO) {
            z = true;
        } else {
            z = false;
        }
        if (this.f8153s == LiveMode.AUDIO) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f8153s == LiveMode.THIRD_PARTY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f8153s != LiveMode.SCREEN_RECORD) {
            z4 = false;
        }
        ImageView imageView = this.f8138d;
        if (z) {
            i = R.drawable.cak;
        } else {
            i = R.drawable.cai;
        }
        imageView.setImageResource(i);
        TextView textView = this.f8139e;
        if (z) {
            i2 = f8136c;
        } else {
            i2 = f8135b;
        }
        textView.setTextColor(i2);
        ImageView imageView2 = this.f8141g;
        if (z2) {
            i3 = R.drawable.cab;
        } else {
            i3 = R.drawable.ca_;
        }
        imageView2.setImageResource(i3);
        TextView textView2 = this.f8142h;
        if (z2) {
            i4 = f8136c;
        } else {
            i4 = f8135b;
        }
        textView2.setTextColor(i4);
        ImageView imageView3 = this.f8144j;
        if (z3) {
            i5 = R.drawable.cah;
        } else {
            i5 = R.drawable.caf;
        }
        imageView3.setImageResource(i5);
        TextView textView3 = this.f8145k;
        if (z3) {
            i6 = f8136c;
        } else {
            i6 = f8135b;
        }
        textView3.setTextColor(i6);
        TextView textView4 = this.f8148n;
        if (z4) {
            i7 = f8136c;
        } else {
            i7 = f8135b;
        }
        textView4.setTextColor(i7);
        ImageView imageView4 = this.f8147m;
        if (z4) {
            i8 = R.drawable.cae;
        } else {
            i8 = R.drawable.cac;
        }
        imageView4.setImageResource(i8);
        if (this.f8137a != null) {
            this.f8137a.mo9109a(this.f8153s);
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        String str;
        String str2;
        super.onCreate(bundle);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
            i = R.layout.amw;
            i2 = 48;
        } else {
            i = R.layout.amv;
            i2 = 80;
        }
        setContentView(LayoutInflater.from(getContext()).inflate(i, null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(i2);
        }
        findViewById(R.id.eac).setOnClickListener(this);
        this.f8138d = (ImageView) findViewById(R.id.eap);
        this.f8139e = (TextView) findViewById(R.id.ebp);
        this.f8140f = findViewById(R.id.ebk);
        this.f8154t = findViewById(R.id.hl);
        this.f8154t.setOnClickListener(this);
        this.f8141g = (ImageView) findViewById(R.id.ho);
        this.f8142h = (TextView) findViewById(R.id.hq);
        this.f8143i = findViewById(R.id.hp);
        this.f8155u = findViewById(R.id.diq);
        this.f8155u.setOnClickListener(this);
        this.f8144j = (ImageView) findViewById(R.id.dis);
        this.f8145k = (TextView) findViewById(R.id.diu);
        this.f8146l = findViewById(R.id.dit);
        this.f8156v = findViewById(R.id.cz7);
        this.f8156v.setOnClickListener(this);
        this.f8147m = (ImageView) findViewById(R.id.cz8);
        this.f8148n = (TextView) findViewById(R.id.cz_);
        this.f8149o = findViewById(R.id.cz9);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
            findViewById(R.id.a9l).setOnClickListener(new C2529d(this));
        }
        this.f8157w = new C2752c(this.f8150p, this.f8151q, this.f8152r);
        m10449a(this.f8157w, false);
        HashMap hashMap = new HashMap();
        String str3 = "thirdparty_button";
        if (this.f8151q) {
            str = "show";
        } else {
            str = "not_show";
        }
        hashMap.put(str3, str);
        String str4 = "game_live_button";
        if (this.f8152r) {
            str2 = "show";
        } else {
            str2 = "not_show";
        }
        hashMap.put(str4, str2);
        C8443c.m25663a().mo21606a("live_take_type_click", hashMap, new C8438j().mo21599b("live").mo21603f("click").mo21598a("live_take_page"));
        this.f8158x = C2515f.m10417f().mo9076c().mo9168c().getBroadcastConfig().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2530e<Object>(this), C2531f.f8161a);
    }

    public C2527c(Context context, LiveMode liveMode) {
        int i;
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
            i = R.style.yl;
        } else {
            i = R.style.yh;
        }
        super(context, i);
        this.f8150p = false;
        this.f8151q = false;
        this.f8152r = false;
        this.f8153s = liveMode;
    }

    /* renamed from: a */
    private void m10449a(C2752c cVar, boolean z) {
        View view;
        int i;
        int i2;
        if (!z || !cVar.equals(this.f8157w)) {
            int i3 = 0;
            if (((Boolean) LiveConfigSettingKeys.START_LIVE_MODE_UNLOCK.mo10240a()).booleanValue()) {
                this.f8154t.setVisibility(0);
                this.f8156v.setVisibility(0);
                view = this.f8155u;
            } else {
                View view2 = this.f8154t;
                if (cVar.f8720a) {
                    i = 0;
                } else {
                    i = 8;
                }
                view2.setVisibility(i);
                View view3 = this.f8156v;
                if (cVar.f8722c) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view3.setVisibility(i2);
                view = this.f8155u;
                if (!cVar.f8721b) {
                    i3 = 8;
                }
            }
            view.setVisibility(i3);
            if (z) {
                C10296b.m30494a(getContext(), "ttrlive_sp_live_setting").mo25021a("enable_radio", (Object) Boolean.valueOf(cVar.f8720a)).mo25021a("enable_live_third_party", (Object) Boolean.valueOf(cVar.f8721b)).mo25021a("enable_live_screenshot", (Object) Boolean.valueOf(cVar.f8722c)).mo25023a();
            }
        }
    }
}
