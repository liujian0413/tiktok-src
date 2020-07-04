package com.bytedance.android.livesdk.browser.fragment;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.bytedance.android.live.browser.C3142b;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment.C4001a;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment.C4004d;
import com.bytedance.android.livesdk.browser.jsbridge.C4030a;
import com.bytedance.android.livesdk.browser.jsbridge.C4037b;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4113as;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4175l;
import com.bytedance.android.livesdk.browser.jsbridge.p201c.p202a.C4042a;
import com.bytedance.android.livesdk.browser.p193c.C3972b.C3975b;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9041ai;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.ttm.player.MediaPlayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class WebDialogFragment extends BaseDialogFragment implements C4001a, C4004d, C4030a {

    /* renamed from: A */
    private int f11951A;

    /* renamed from: B */
    private C3142b f11952B;

    /* renamed from: C */
    private String f11953C;

    /* renamed from: D */
    private boolean f11954D = true;

    /* renamed from: E */
    private Map<String, C11155d> f11955E = new HashMap();

    /* renamed from: e */
    private View f11956e;

    /* renamed from: f */
    private View f11957f;

    /* renamed from: g */
    private View f11958g;

    /* renamed from: h */
    private String f11959h;

    /* renamed from: i */
    private int f11960i;

    /* renamed from: j */
    private int f11961j;

    /* renamed from: k */
    private int f11962k;

    /* renamed from: l */
    private int f11963l;

    /* renamed from: m */
    private int f11964m;

    /* renamed from: n */
    private int f11965n;

    /* renamed from: o */
    private int f11966o;

    /* renamed from: p */
    private int f11967p;

    /* renamed from: q */
    private int f11968q;

    /* renamed from: r */
    private String f11969r;

    /* renamed from: s */
    private TTLiveBrowserFragment f11970s;

    /* renamed from: t */
    private boolean f11971t;

    /* renamed from: u */
    private long f11972u;

    /* renamed from: v */
    private long f11973v;

    /* renamed from: w */
    private boolean f11974w;

    /* renamed from: x */
    private boolean f11975x;

    /* renamed from: y */
    private boolean f11976y;

    /* renamed from: z */
    private boolean f11977z;

    /* renamed from: a */
    public final void mo11573a(String str, JSONObject jSONObject) {
        if (this.f11970s != null) {
            this.f11970s.mo11573a(str, jSONObject);
        }
    }

    /* renamed from: e */
    private boolean m14061e() {
        if (this.f11960i == 0 && this.f11961j == 0) {
            return true;
        }
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        C9178j.m27302j().mo22374c().mo11547b((DialogFragment) this);
    }

    /* renamed from: f */
    private String m14062f() {
        if (this.f11970s == null || this.f11970s.f11934m == null) {
            return "";
        }
        return this.f11970s.f11934m.getUrl();
    }

    /* renamed from: h */
    private TTLiveBrowserFragment m14064h() {
        TTLiveBrowserFragment tTLiveBrowserFragment = new TTLiveBrowserFragment();
        tTLiveBrowserFragment.f11914a = this.f11969r;
        tTLiveBrowserFragment.f11926e = this;
        tTLiveBrowserFragment.f11927f = this.f11952B;
        tTLiveBrowserFragment.mo11607a(this.f11953C);
        return tTLiveBrowserFragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo11643d() {
        if (this.f11963l != 0) {
            m14060b(this.f11963l);
        } else {
            m14056a(this.f11964m, this.f11965n, this.f11967p, this.f11966o);
        }
    }

    /* renamed from: g */
    private Bundle m14063g() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f11959h);
        bundle.putBoolean("bundle_user_webview_title", false);
        bundle.putBoolean("hide_nav_bar", true);
        if (this.f11951A != -1) {
            bundle.putInt("bundle_web_view_background_color", this.f11951A);
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo11593b() {
        this.f11973v = System.currentTimeMillis();
        this.f11971t = false;
        if (this.f10225b) {
            this.f11956e.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo11594c() {
        if (this.f10225b) {
            if (this.f11971t || (this.f11970s.f11934m != null && TextUtils.equals(this.f11970s.f11934m.getUrl(), "about:blank"))) {
                this.f11956e.setVisibility(0);
            } else {
                this.f11956e.setVisibility(8);
            }
            if (this.f11974w) {
                if (this.f11963l > 0) {
                    m14060b(this.f11963l);
                    return;
                }
                m14056a(this.f11964m, this.f11965n, this.f11966o, this.f11967p);
            }
        }
    }

    /* renamed from: a */
    public final void mo11589a(int i) {
        this.f11971t = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11640a(View view) {
        dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11642b(View view) {
        if (this.f11970s != null) {
            this.f11970s.mo11598a();
        }
    }

    /* renamed from: a */
    private void m14059a(boolean z) {
        setCancelable(z);
        getDialog().setCanceledOnTouchOutside(z);
    }

    /* renamed from: b */
    private void m14060b(int i) {
        if (this.f11970s != null && this.f11970s.f11934m != null) {
            WebView webView = this.f11970s.f11934m;
            if (webView instanceof RoundRectWebView) {
                ((RoundRectWebView) webView).setRadius((float) C3358ac.m12510a((float) i));
            }
        }
    }

    /* renamed from: a */
    public static WebDialogFragment m14054a(C3975b bVar) {
        WebDialogFragment webDialogFragment = new WebDialogFragment();
        webDialogFragment.f11959h = bVar.f11833a;
        webDialogFragment.f11960i = bVar.f11834b;
        webDialogFragment.f11961j = bVar.f11835c;
        webDialogFragment.f11962k = bVar.f11842j;
        webDialogFragment.f11963l = bVar.f11837e;
        webDialogFragment.f11968q = bVar.f11836d;
        webDialogFragment.f11964m = bVar.f11838f;
        webDialogFragment.f11965n = bVar.f11839g;
        webDialogFragment.f11967p = bVar.f11840h;
        webDialogFragment.f11966o = bVar.f11841i;
        webDialogFragment.f11969r = bVar.f11844l;
        webDialogFragment.f11974w = bVar.f11846n;
        webDialogFragment.f11952B = bVar.f11850r;
        webDialogFragment.f11975x = bVar.f11847o;
        webDialogFragment.f11976y = bVar.f11848p;
        webDialogFragment.f11977z = bVar.f11849q;
        webDialogFragment.f11951A = bVar.f11843k;
        webDialogFragment.f11953C = bVar.f11851s;
        webDialogFragment.f11954D = bVar.f11852t;
        return webDialogFragment;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getDialog() != null) {
            m14057a(getDialog(), this.f11960i, this.f11961j, this.f11962k);
            if (this.f11963l != 0) {
                m14060b(this.f11963l);
            } else {
                m14056a(this.f11964m, this.f11965n, this.f11967p, this.f11966o);
            }
            Window window = getDialog().getWindow();
            if (window != null) {
                window.setLayout(C3358ac.m12510a((float) this.f11960i), C3358ac.m12510a((float) this.f11961j));
                if (m14061e()) {
                    window.addFlags(32);
                    window.getAttributes().dimAmount = 0.0f;
                }
                window.setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        onCreateDialog.setCanceledOnTouchOutside(this.f11954D);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            LayoutParams attributes = window.getAttributes();
            if (C3358ac.m12513a() == null || C3358ac.m12513a().getConfiguration().orientation != 2) {
                attributes.windowAnimations = R.style.zw;
            } else {
                attributes.windowAnimations = R.style.zv;
            }
            window.setAttributes(attributes);
            if (!this.f11977z) {
                window.setDimAmount(0.0f);
            }
        }
        return onCreateDialog;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.y9);
        if (getActivity().getRequestedOrientation() == 0) {
            if (!this.f11975x) {
                this.f11968q = 8;
                this.f11963l = 8;
                this.f11961j = (int) C3358ac.m12527e(C3358ac.m12520b() - (this.f11968q * 2));
                this.f11960i = C34943c.f91128x;
            }
            if (!this.f11976y) {
                this.f11962k = 8388693;
            }
        }
        if (this.f11960i <= 0) {
            this.f11960i = C34943c.f91128x;
        }
        if (!TextUtils.isEmpty(this.f11959h)) {
            Uri parse = Uri.parse(this.f11959h);
            if (parse != null) {
                int a = C9041ai.m27008a(parse.getQueryParameter("height"));
                if (a > 0) {
                    this.f11961j = a;
                }
            }
        }
        if (getActivity().getRequestedOrientation() == 0 && ((float) this.f11961j) > C3358ac.m12527e(C3358ac.m12520b())) {
            this.f11961j = (int) C3358ac.m12527e(C3358ac.m12520b() - (this.f11968q * 2));
        }
        if (this.f11962k == 80 && ((float) this.f11961j) > C3358ac.m12527e((int) (((float) C3358ac.m12520b()) * 0.85f))) {
            this.f11961j = (int) C3358ac.m12527e((int) (((float) C3358ac.m12520b()) * 0.85f));
        }
        if (this.f11961j <= 0) {
            this.f11961j = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        }
        if (this.f11974w) {
            this.f11961j += 48;
        }
        if (this.f11963l < 0) {
            this.f11963l = 0;
        }
        if (this.f11964m < 0) {
            this.f11964m = 0;
        }
        if (this.f11965n < 0) {
            this.f11965n = 0;
        }
        if (this.f11967p < 0) {
            this.f11967p = 0;
        }
        if (this.f11966o < 0) {
            this.f11966o = 0;
        }
        C9178j.m27302j().mo22374c().mo11536a((DialogFragment) this);
    }

    /* renamed from: a */
    public final void mo11591a(C4037b bVar) {
        bVar.mo11529a().mo27204a("close", (C11155d<?, ?>) new C4175l<Object,Object>((DialogFragment) this));
        bVar.mo11529a().mo27204a("setHotsoon", (C11155d<?, ?>) new C4113as<Object,Object>(this));
        bVar.mo11529a().mo27204a("setLive", (C11155d<?, ?>) new C4113as<Object,Object>(this));
        bVar.mo11657c().mo27210a("open_live", (C11093e) new C4042a(new WeakReference(getActivity()), this));
        if (this.f11955E != null) {
            for (String str : this.f11955E.keySet()) {
                bVar.mo11529a().mo27204a(str, (C11155d) this.f11955E.get(str));
            }
        }
    }

    /* renamed from: a */
    private void m14055a(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11957f.getLayoutParams();
        layoutParams.width = C3358ac.m12510a((float) i);
        layoutParams.height = C3358ac.m12510a((float) i2);
        this.f11957f.setLayoutParams(layoutParams);
        this.f11957f.requestLayout();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MarginLayoutParams marginLayoutParams;
        this.f11972u = System.currentTimeMillis();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.al9, viewGroup, false);
        this.f11956e = inflate.findViewById(R.id.csg);
        this.f11957f = inflate.findViewById(R.id.eg3);
        this.f11958g = inflate.findViewById(R.id.b6p);
        if (m14061e() || !this.f11954D) {
            getDialog().hide();
        } else {
            m14059a(true);
        }
        ViewGroup.LayoutParams layoutParams = this.f11957f.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            marginLayoutParams = (MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.setMargins(C3358ac.m12510a((float) this.f11968q), C3358ac.m12510a((float) this.f11968q), C3358ac.m12510a((float) this.f11968q), C3358ac.m12510a((float) this.f11968q));
        this.f11957f.setLayoutParams(marginLayoutParams);
        this.f11970s = m14064h();
        this.f11970s.setArguments(m14063g());
        C0633q a = getChildFragmentManager().mo2645a();
        a.mo2599b(R.id.eg3, this.f11970s);
        a.mo2606d();
        this.f11970s.f11924c = this;
        this.f11956e.setOnClickListener(new C4021p(this));
        inflate.post(new C4022q(this));
        if (this.f11974w) {
            this.f11958g.setVisibility(0);
            this.f11958g.setOnClickListener(new C4023r(this));
        }
        return inflate;
    }

    /* renamed from: a */
    private void m14057a(Dialog dialog, int i, int i2, int i3) {
        m14058a(dialog, i, i2, i3, false);
    }

    /* renamed from: a */
    private void m14056a(int i, int i2, int i3, int i4) {
        if (this.f11970s != null && this.f11970s.f11934m != null) {
            WebView webView = this.f11970s.f11934m;
            if (webView instanceof RoundRectWebView) {
                ((RoundRectWebView) webView).setRadius((float) C3358ac.m12510a((float) i), (float) C3358ac.m12510a((float) i2), (float) C3358ac.m12510a((float) i3), (float) C3358ac.m12510a((float) i4));
            }
        }
    }

    /* renamed from: a */
    private void m14058a(Dialog dialog, int i, int i2, int i3, boolean z) {
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                LayoutParams attributes = window.getAttributes();
                attributes.gravity = i3;
                attributes.width = C3358ac.m12510a((float) i);
                attributes.height = C3358ac.m12510a((float) i2);
                window.setAttributes(attributes);
                m14055a(i, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo11641a(String str, int i, int i2, int i3, int i4) {
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().show();
            Window window = getDialog().getWindow();
            if (window != null) {
                window.clearFlags(32);
                window.getAttributes().dimAmount = 0.6f;
            }
            if (!TextUtils.isEmpty(str) && TextUtils.equals(str, m14062f())) {
                m14060b(i3);
                FragmentActivity activity = getActivity();
                boolean z = true;
                if (activity != null && activity.getRequestedOrientation() == 1) {
                    if (this.f11974w) {
                        i2 += 48;
                    }
                    m14057a(getDialog(), i, i2, this.f11962k);
                }
                if (i4 != 1) {
                    z = false;
                }
                m14059a(z);
            }
        }
    }
}
