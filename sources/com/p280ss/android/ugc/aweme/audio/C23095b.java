package com.p280ss.android.ugc.aweme.audio;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.audio.C23092a.C23094a;
import com.p280ss.android.ugc.aweme.audio.C23106h.C23107a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.audio.b */
public final class C23095b {

    /* renamed from: a */
    public static final boolean f60978a = C7163a.m22363a();

    /* renamed from: g */
    private static int f60979g;

    /* renamed from: h */
    private static int f60980h;

    /* renamed from: b */
    public Activity f60981b;

    /* renamed from: c */
    public LinearLayout f60982c;

    /* renamed from: d */
    public boolean f60983d;

    /* renamed from: e */
    public C35481c f60984e;

    /* renamed from: f */
    public boolean f60985f;

    /* renamed from: i */
    private ViewStub f60986i;

    /* renamed from: j */
    private ImageView f60987j;

    /* renamed from: k */
    private C23106h f60988k = C23106h.m75943a();

    /* renamed from: l */
    private C23107a f60989l;

    /* renamed from: m */
    private C23102f f60990m = C23102f.m75929a();

    /* renamed from: n */
    private String f60991n;

    /* renamed from: o */
    private C23094a f60992o;

    /* renamed from: p */
    private boolean f60993p;

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onVideoStatusChanged(C39330h hVar) {
        if (hVar != null) {
        }
    }

    /* renamed from: c */
    private void m75916c() {
        this.f60982c.postDelayed(new Runnable() {
            public final void run() {
                C23095b.this.f60984e = new C35481c(C23095b.this.f60981b, true);
                if (C23095b.this.f60983d) {
                    C23095b.this.f60984e.mo90267c((int) R.string.e9m);
                } else {
                    C23095b.this.f60984e.mo90267c((int) R.string.e9l);
                }
                C23095b.this.f60984e.mo90274e(C23095b.this.f60981b.getResources().getColor(R.color.a8r));
                C23095b.this.f60984e.f93102j = C23095b.this.f60984e.f93104l + 2000;
                C23095b.this.f60984e.mo90270d(8388613);
                C23095b.this.f60984e.mo90275f();
                C23095b.this.f60984e.f93098f = false;
                C23095b.this.f60984e.mo90258a(false);
                C23095b.this.f60984e.setOnDismissListener(new OnDismissListener() {
                    public final void onDismiss() {
                        C23102f.m75932b(C23095b.this.f60981b);
                        C23095b.this.f60984e = null;
                    }
                });
                C23095b.this.f60984e.mo90271d((View) C23095b.this.f60982c);
                C6907h.m21524a("mute_guide_show", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_hot").f60753a);
            }
        }, 1000);
    }

    /* renamed from: b */
    public final void mo60176b() {
        this.f60990m.mo60187d();
        this.f60988k.mo60193b(this.f60989l);
        C42961az.m136383d(this);
        if (this.f60992o != null) {
            C23092a.m75908a().mo60168b(this.f60981b, this.f60992o);
        }
    }

    /* renamed from: d */
    private void m75918d() {
        if (this.f60982c == null) {
            if (this.f60986i.getLayoutResource() <= 0) {
                this.f60986i.setLayoutResource(R.layout.ac3);
            }
            this.f60982c = (LinearLayout) this.f60986i.inflate();
            this.f60987j = (ImageView) this.f60982c.getChildAt(0);
            mo60175a(AudioUtils.m75904f(this.f60981b));
        }
        C10789c.m31503a(this.f60982c, 0.5f);
        this.f60989l = new C23100d(this);
        this.f60988k.mo60191a(this.f60989l);
        if (this.f60992o == null) {
            this.f60992o = new C23094a() {
                /* renamed from: a */
                public final void mo60170a(int i) {
                    if (C23095b.this.f60985f) {
                        C23095b.this.f60985f = false;
                    } else {
                        C23095b.this.mo60175a(AudioUtils.m75904f(C23095b.this.f60981b));
                    }
                }
            };
        }
        C23092a.m75908a().mo60167a(this.f60981b, this.f60992o);
        this.f60982c.setOnClickListener(new C23101e(this));
    }

    /* renamed from: a */
    public final void mo60171a() {
        if (this.f60982c != null) {
            mo60175a(AudioUtils.m75904f(this.f60981b));
        }
        if (this.f60982c != null && !C23102f.m75930a((Context) this.f60981b) && !this.f60993p) {
            m75916c();
        }
    }

    /* renamed from: c */
    private void m75917c(boolean z) {
        this.f60985f = true;
        AudioUtils.m75896a((Context) this.f60981b, z);
        mo60175a(z);
        if (!z && AudioUtils.m75898b(this.f60981b) == 0 && f60979g > 0) {
            AudioUtils.m75897a((Context) this.f60981b, f60979g, 4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo60177b(boolean z) {
        int i;
        if (z) {
            if (f60979g == 0) {
                i = AudioUtils.m75898b(this.f60981b);
            } else if (f60979g >= f60980h) {
                i = f60979g;
            } else {
                i = f60979g + 1;
            }
            f60979g = i;
            if (!this.f60983d) {
                return false;
            }
        } else if (f60979g > 1) {
            f60979g--;
        }
        if (f60979g <= 0 || !this.f60983d) {
            mo60175a(AudioUtils.m75904f(this.f60981b));
        } else {
            m75917c(false);
            AudioUtils.m75897a((Context) this.f60981b, f60979g, 4);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60174a(View view) {
        String str;
        if (this.f60981b instanceof FragmentActivity) {
            Aweme a = AwemeChangeCallBack.m106763a((FragmentActivity) this.f60981b);
            String str2 = null;
            if (a != null) {
                str2 = a.getAid();
                str = a.getAuthorUid();
            } else {
                str = null;
            }
            if (this.f60984e != null && this.f60984e.isShowing()) {
                this.f60984e.dismiss();
            }
            C6907h.m21524a("click_mute_icon", (Map) C22984d.m75611a().mo59970a("is_mute", this.f60983d ^ true ? 1 : 0).mo59973a("group_id", str2).mo59973a("author_id", str).mo59973a("enter_from", this.f60991n).f60753a);
            if (!this.f60983d) {
                int b = AudioUtils.m75898b(this.f60981b);
                if (b > 0) {
                    f60979g = b;
                }
            }
            m75917c(!this.f60983d);
        }
    }

    /* renamed from: a */
    public final void mo60175a(boolean z) {
        int i;
        if (this.f60987j != null) {
            this.f60983d = z;
            ImageView imageView = this.f60987j;
            if (z) {
                i = R.drawable.b2n;
            } else {
                i = R.drawable.b2o;
            }
            imageView.setImageResource(i);
        }
    }

    public C23095b(Activity activity, ViewStub viewStub) {
        this.f60981b = activity;
        this.f60986i = viewStub;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60173a(int i, boolean z) {
        mo60175a(false);
        this.f60990m.mo60184a(this.f60981b, i);
        this.f60990m.f61008f = null;
        if (!z) {
            m75916c();
        }
    }

    /* renamed from: a */
    private void m75915a(int i, int i2) {
        if (i == 1) {
            if ((i2 == 1 || i2 == 2 || i2 == 3) && !AudioUtils.m75903e(this.f60981b) && !AudioUtils.m75901c(this.f60981b)) {
                C6907h.m21524a("mute_state", (Map) new HashMap());
            }
        }
    }

    /* renamed from: a */
    public final void mo60172a(int i, String str) {
        if (C6399b.m19944t()) {
            this.f60991n = str;
            f60980h = AudioUtils.m75892a(C6399b.m19921a());
            int b = AudioUtils.m75898b(this.f60981b);
            if (b > 0) {
                f60979g = b;
            }
            int b2 = C23102f.m75931b();
            m75915a(i, 0);
            if (b2 != 0) {
                m75918d();
                if (C23102f.m75929a().f61006d) {
                    mo60175a(AudioUtils.m75904f(this.f60981b));
                    return;
                }
                boolean a = C23102f.m75930a((Context) this.f60981b);
                C23102f.m75929a().mo60188e();
                if (b2 == 1) {
                    if (!AudioUtils.m75901c(this.f60981b) && !AudioUtils.m75903e(this.f60981b)) {
                        m75917c(true);
                    }
                } else if (b2 == 2 && !this.f60990m.f61005c && !AudioUtils.m75903e(this.f60981b)) {
                    int b3 = AudioUtils.m75898b(this.f60981b);
                    AudioUtils.m75892a(this.f60981b);
                    this.f60985f = true;
                    AudioUtils.m75896a((Context) this.f60981b, true);
                    mo60175a(false);
                    this.f60993p = true;
                    this.f60990m.f61008f = new C23099c(this, b3, a);
                    this.f60983d = false;
                }
            }
        }
    }
}
