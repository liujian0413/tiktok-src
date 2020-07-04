package com.bytedance.polaris.browser;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.p480a.C9700a;
import com.bytedance.polaris.base.BasePolarisActivity;
import com.bytedance.polaris.base.C12376b;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.p634b.C12352g;
import com.bytedance.polaris.p634b.C12352g.C12353a;
import com.bytedance.polaris.p634b.C12370u;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;

public class PolarisBrowserActivity extends BasePolarisActivity implements C12376b {

    /* renamed from: A */
    private String f32842A;

    /* renamed from: B */
    private String f32843B;

    /* renamed from: C */
    private boolean f32844C;

    /* renamed from: D */
    private String f32845D;

    /* renamed from: E */
    private WeakReference<C12388a> f32846E;

    /* renamed from: F */
    private String f32847F;

    /* renamed from: G */
    private OnClickListener f32848G = new OnClickListener() {
        public final void onClick(View view) {
            int id = view.getId();
            if (id == R.id.ctl) {
                try {
                    if (PolarisBrowserActivity.this.mo30220j() != null) {
                        C12418b.m36108a(PolarisBrowserActivity.this.mo30220j(), "javascript:(function(){function loadScript(url,callback){var head=document.head,script;script=document.createElement('script');script.async=false;script.type='text/javascript';script.charset='utf-8';script.src=url;head.insertBefore(script,head.firstChild);if(callback){script.addEventListener('load',callback,false)}}function sendMsg(argument){var min_image_size=100;var title='',desc='',icon='',title_ele=document.querySelector('title'),desc_ele=document.querySelector('meta[name=description]');if(title_ele){title=title_ele.innerText}if(desc_ele){desc=desc_ele.content}var imgs=document.querySelectorAll('body img');for(var i=0;i<imgs.length;i++){var img=imgs[i];if(img.naturalWidth>min_image_size&&img.naturalHeight>min_image_size){icon=img.src;break}}window.ToutiaoJSBridge.call('shareInfo',{'title':title,'desc':desc,'image':icon,'url':location.href})}if(!window.ToutiaoJSBridge){var protocol=location.protocol.indexOf('https')>-1?'https://':'http://';loadScript(protocol+'s2.pstatp.com/inapp/toutiao.js',sendMsg)}else{sendMsg()}})();");
                    }
                    PopupMenu popupMenu = new PopupMenu(PolarisBrowserActivity.this, PolarisBrowserActivity.this.f32830h);
                    Menu menu = popupMenu.getMenu();
                    Iterator it = PolarisBrowserActivity.this.f32854r.iterator();
                    while (it.hasNext()) {
                        OperationButton operationButton = (OperationButton) it.next();
                        menu.add(0, operationButton.mId, 0, operationButton.mTitleRes);
                    }
                    if (!PolarisBrowserActivity.this.mo30219i()) {
                        menu.removeItem(OperationButton.SHARE.mId);
                    }
                    popupMenu.setOnMenuItemClickListener(PolarisBrowserActivity.this.f32853q);
                    if (menu.hasVisibleItems()) {
                        popupMenu.show();
                    }
                } catch (Throwable unused) {
                }
            } else if (id == R.id.p3) {
                PolarisBrowserActivity.this.onBackPressed();
            } else {
                if (id == R.id.xb) {
                    PolarisBrowserActivity.this.mo30208f();
                }
            }
        }
    };

    /* renamed from: H */
    private boolean f32849H;

    /* renamed from: n */
    public ImageView f32850n;

    /* renamed from: o */
    public String f32851o;

    /* renamed from: p */
    public boolean f32852p;

    /* renamed from: q */
    OnMenuItemClickListener f32853q = new OnMenuItemClickListener() {
        public final boolean onMenuItemClick(MenuItem menuItem) {
            WebView j = PolarisBrowserActivity.this.mo30220j();
            if (j == null) {
                return true;
            }
            int itemId = menuItem.getItemId();
            String url = j.getUrl();
            if (itemId == R.id.cht) {
                PolarisBrowserActivity.this.mo30217a(url);
            } else if (itemId == R.id.chs) {
                PolarisBrowserActivity.this.mo30218b(url);
            } else if (itemId == R.id.chv) {
                PolarisBrowserActivity.this.mo30221k();
            } else if (itemId == R.id.chw) {
                PolarisBrowserActivity.this.mo30222l();
            }
            return true;
        }
    };

    /* renamed from: r */
    public ArrayList<OperationButton> f32854r;

    /* renamed from: s */
    private boolean f32855s;

    /* renamed from: t */
    private String f32856t;

    /* renamed from: u */
    private String f32857u;

    /* renamed from: v */
    private TextView f32858v;

    /* renamed from: w */
    private View f32859w;

    /* renamed from: x */
    private boolean f32860x;

    /* renamed from: y */
    private int f32861y;

    /* renamed from: z */
    private int f32862z;

    public enum OperationButton {
        REFRESH(R.id.chv, "refresh", R.string.d1g),
        COPYLINK(R.id.chs, "copylink", R.string.d1e),
        OPEN_WITH_BROWSER(R.id.cht, "openwithbrowser", R.string.d1f),
        SHARE(R.id.chw, "share", R.string.d1h);
        
        public int mId;
        public String mKey;
        public int mTitleRes;

        private OperationButton(int i, String str, int i2) {
            this.mId = i;
            this.mKey = str;
            this.mTitleRes = i2;
        }
    }

    /* renamed from: com.bytedance.polaris.browser.PolarisBrowserActivity$a */
    public interface C12382a {
        /* renamed from: a */
        boolean mo30227a();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    /* renamed from: m */
    private static C12388a m35971m() {
        return new PolarisBrowserFragment();
    }

    /* renamed from: e */
    public final boolean mo30207e() {
        if (this.f32861y != 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo30216g() {
        if (this.f32834l != null) {
            this.f32834l.setSwipeEnabled(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo30222l() {
        if (this.f32846E != null) {
            this.f32846E.get();
        }
    }

    /* renamed from: d */
    public final boolean mo30206d() {
        if (this.f32860x || this.f32861y == 1 || this.f32861y == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo30208f() {
        if (!isFinishing()) {
            Intent intent = null;
            if (isTaskRoot()) {
                intent = C6776h.m20941a((Context) this, getPackageName());
            }
            finish();
            if (intent != null) {
                startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo30219i() {
        C12388a aVar;
        if (this.f32846E != null) {
            aVar = (C12388a) this.f32846E.get();
        } else {
            aVar = null;
        }
        if (!(aVar instanceof C12382a) || !((C12382a) aVar).mo30227a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final WebView mo30220j() {
        C12388a aVar;
        if (this.f32846E != null) {
            aVar = (C12388a) this.f32846E.get();
        } else {
            aVar = null;
        }
        if (aVar == null || !aVar.mo30248p_()) {
            return null;
        }
        return aVar.mo30231c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo30221k() {
        C12388a aVar;
        if (this.f32846E != null) {
            aVar = (C12388a) this.f32846E.get();
        } else {
            aVar = null;
        }
        if (aVar != null && aVar.mo30248p_()) {
            aVar.mo30230b();
        }
    }

    public void onBackPressed() {
        if (this.f32852p) {
            mo30208f();
            return;
        }
        if (this.f32850n.getVisibility() != 0) {
            this.f32850n.postDelayed(new Runnable() {
                public final void run() {
                    if ("back_arrow".equals(PolarisBrowserActivity.this.f32851o)) {
                        PolarisBrowserActivity.this.f32850n.setVisibility(0);
                    }
                }
            }, 300);
        }
        WebView j = mo30220j();
        if (j == null || !j.canGoBack()) {
            mo30208f();
        } else {
            j.goBack();
        }
    }

    /* renamed from: a */
    public final void mo30215a() {
        if (this.f32834l != null) {
            this.f32834l.setSwipeEnabled(false);
        }
    }

    /* renamed from: b */
    public final C12353a mo30204b() {
        C12353a aVar = new C12353a();
        if (this.f32855s) {
            aVar.mo30195a(true).mo30194a((int) R.color.a2k);
        }
        if (!C6319n.m19593a(this.f32857u) && VERSION.SDK_INT >= 23) {
            if ("black".equals(this.f32857u)) {
                aVar.mo30196b(true);
            } else if ("white".equals(this.f32857u)) {
                aVar.mo30196b(false);
            }
        }
        if (!this.f32855s) {
            if (C6319n.m19593a(this.f32856t) || VERSION.SDK_INT < 23) {
                aVar.mo30194a((int) R.color.a2l);
            } else if ("black".equals(this.f32856t)) {
                aVar.mo30194a((int) R.color.a2g);
            } else if ("white".equals(this.f32856t)) {
                aVar.mo30194a((int) R.color.a2l);
            }
        }
        Window window = getWindow();
        if (C12428i.m36162l() && window != null) {
            window.setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        }
        return aVar;
    }

    /* renamed from: c */
    public final void mo30205c() {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        int i2;
        String str7;
        String str8;
        boolean z2;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean z3;
        boolean z4;
        long j;
        boolean z5;
        String str13;
        String str14;
        String str15;
        boolean z6;
        boolean z7;
        String str16;
        String str17;
        boolean z8;
        String str18;
        this.f32858v = (TextView) findViewById(R.id.p3);
        this.f32858v.setOnClickListener(this.f32848G);
        this.f32859w = findViewById(R.id.p5);
        this.f32850n = (ImageView) findViewById(R.id.xb);
        this.f32850n.setOnClickListener(this.f32848G);
        Intent intent = getIntent();
        String str19 = "";
        String str20 = "";
        String str21 = "";
        String str22 = "";
        if (intent != null) {
            String dataString = intent.getDataString();
            boolean booleanExtra = intent.getBooleanExtra("show_toolbar", false);
            this.f32860x = intent.getBooleanExtra("use_swipe", false);
            this.f32861y = intent.getIntExtra("swipe_mode", 0);
            String stringExtra = intent.getStringExtra("referer");
            this.f32862z = intent.getIntExtra("orientation", 1);
            this.f32842A = intent.getStringExtra("screen_name");
            this.f32843B = intent.getStringExtra("screen_context");
            j = intent.getLongExtra("ad_id", 0);
            if (j > 0) {
                this.f32862z = 0;
            }
            String stringExtra2 = intent.getStringExtra("bundle_app_package_name");
            z4 = intent.getBooleanExtra("bundle_user_webview_title", false);
            z3 = intent.getBooleanExtra("bundle_is_from_picture_detail_ad", false);
            str12 = intent.getStringExtra("bundle_picture_detail_ad_event");
            boolean booleanExtra2 = intent.getBooleanExtra("bundle_is_from_app_ad", false);
            int intExtra = intent.getIntExtra("bundle_app_ad_from", 0);
            String stringExtra3 = intent.getStringExtra("bundle_app_ad_event");
            String stringExtra4 = intent.getStringExtra("bundle_download_url");
            String stringExtra5 = intent.getStringExtra("bundle_download_app_name");
            String str23 = dataString;
            String stringExtra6 = intent.getStringExtra("bundle_download_app_extra");
            boolean z9 = booleanExtra;
            int intExtra2 = intent.getIntExtra("bundle_link_mode", 0);
            String stringExtra7 = intent.getStringExtra("bundle_deeplink_open_url");
            int i3 = intExtra2;
            String stringExtra8 = intent.getStringExtra("bundle_deeplink_web_url");
            String stringExtra9 = intent.getStringExtra("bundle_deeplink_web_title");
            String str24 = stringExtra7;
            boolean booleanExtra3 = intent.getBooleanExtra("bundle_support_download", false);
            String stringExtra10 = intent.getStringExtra("bundle_download_app_log_extra");
            boolean booleanExtra4 = intent.getBooleanExtra("bundle_no_hw_acceleration", false);
            String stringExtra11 = intent.getStringExtra("gd_label");
            boolean z10 = booleanExtra4;
            String stringExtra12 = intent.getStringExtra("gd_ext_json");
            String stringExtra13 = intent.getStringExtra("webview_track_key");
            String stringExtra14 = intent.getStringExtra("wap_headers");
            String str25 = stringExtra11;
            this.f32844C = intent.getBooleanExtra("hide_more", false);
            this.f32845D = intent.getStringExtra("back_button_color");
            if (C6319n.m19593a(this.f32845D)) {
                this.f32845D = "black";
            }
            this.f32851o = intent.getStringExtra("back_button_icon");
            if (C6319n.m19593a(this.f32851o)) {
                this.f32851o = "back_arrow";
            }
            String stringExtra15 = intent.getStringExtra("back_button_position");
            this.f32852p = intent.getBooleanExtra("back_button_disable_history", false);
            boolean booleanExtra5 = intent.getBooleanExtra("key_hide_bar", false);
            this.f32849H = intent.getBooleanExtra("require_login", false);
            z = booleanExtra2;
            str6 = stringExtra3;
            str8 = stringExtra4;
            i2 = intExtra;
            str7 = stringExtra5;
            str16 = str23;
            str5 = stringExtra6;
            i = i3;
            str3 = stringExtra8;
            str2 = stringExtra9;
            str4 = str24;
            str9 = stringExtra10;
            z5 = z10;
            str10 = stringExtra12;
            str15 = stringExtra13;
            str = stringExtra14;
            str11 = str25;
            str17 = stringExtra15;
            z2 = booleanExtra5;
            str14 = stringExtra;
            str13 = stringExtra2;
            z7 = z9;
            z6 = booleanExtra3;
        } else {
            str6 = str19;
            str4 = str20;
            str3 = str21;
            str2 = str22;
            str17 = null;
            str16 = null;
            z7 = false;
            z6 = false;
            str15 = null;
            str14 = null;
            str13 = null;
            z5 = false;
            j = 0;
            z4 = false;
            z3 = false;
            str12 = null;
            str11 = null;
            str10 = null;
            str9 = null;
            z2 = false;
            str8 = null;
            str7 = null;
            i2 = 0;
            str5 = null;
            i = 0;
            str = null;
            z = false;
        }
        m35964a(this.f32862z);
        this.f32854r = new ArrayList<>();
        boolean z11 = z5;
        this.f32854r.add(OperationButton.REFRESH);
        this.f32854r.add(OperationButton.COPYLINK);
        this.f32854r.add(OperationButton.OPEN_WITH_BROWSER);
        this.f32854r.add(OperationButton.SHARE);
        super.mo30205c();
        m35968c(this.f32851o);
        m35970e(this.f32845D);
        m35969d(str17);
        if (this.f32855s) {
            ((MarginLayoutParams) this.f32858v.getLayoutParams()).topMargin = C9738o.m28717e(this);
            this.f32858v.requestLayout();
            z8 = true;
        } else {
            z8 = z2;
        }
        if (z8) {
            this.f32828f.setBackgroundResource(R.drawable.bdr);
            C9738o.m28712b((View) this.f32830h, 8);
            C9738o.m28712b((View) this.f32831i, 8);
            C9738o.m28712b(this.f32859w, 8);
            ((LayoutParams) this.f32834l.getLayoutParams()).addRule(3, 0);
        }
        if (intent != null) {
            str18 = intent.getStringExtra("title");
        } else {
            str18 = null;
        }
        if (C6319n.m19593a(str18)) {
            str18 = getString(R.string.d2v);
        }
        String str26 = str18;
        this.f32847F = str26;
        this.f32831i.setText(str26);
        this.f32830h.setOnClickListener(this.f32848G);
        if (!C12370u.m35938d(str16)) {
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("bundle_url", str16);
        bundle.putBoolean("show_toolbar", z7);
        bundle.putBoolean("bundle_user_webview_title", z4);
        bundle.putBoolean("bundle_support_download", z6);
        if (!C6319n.m19593a(str15)) {
            bundle.putString("webview_track_key", str15);
        }
        if (!C6319n.m19593a(str14)) {
            bundle.putString("referer", str14);
        }
        if (z3 && !TextUtils.isEmpty(str12)) {
            bundle.putBoolean("bundle_is_from_picture_detail_ad", z3);
            bundle.putString("bundle_picture_detail_ad_event", str12);
        }
        if (j > 0) {
            bundle.putLong("ad_id", j);
        }
        if (!C6319n.m19593a(str13)) {
            bundle.putString("package_name", str13);
        }
        if (z11) {
            bundle.putBoolean("bundle_no_hw_acceleration", z11);
        }
        if (!C6319n.m19593a(str11)) {
            bundle.putString("gd_label", str11);
        }
        if (!C6319n.m19593a(str10)) {
            bundle.putString("gd_ext_json", str10);
        }
        if (!C6319n.m19593a(str9)) {
            bundle.putString("bundle_download_app_log_extra", str9);
        }
        if (z && !C6319n.m19593a(str8)) {
            bundle.putString("bundle_download_url", str8);
            bundle.putString("bundle_download_app_name", str7);
            bundle.putBoolean("bundle_is_from_app_ad", z);
            bundle.putInt("bundle_app_ad_from", i2);
            bundle.putString("bundle_app_ad_event", str6);
            bundle.putString("bundle_download_app_extra", str5);
            bundle.putInt("bundle_link_mode", i);
            bundle.putString("bundle_deeplink_open_url", str4);
            bundle.putString("bundle_deeplink_web_url", str3);
            bundle.putString("bundle_deeplink_web_title", str2);
        }
        if (!C6319n.m19593a(str)) {
            bundle.putString("wap_headers", str);
        }
        bundle.putBoolean("require_login", this.f32849H);
        m35967a(bundle);
        if (this.f32844C) {
            this.f32830h.setVisibility(4);
        }
    }

    /* renamed from: a */
    private void m35964a(int i) {
        switch (i) {
            case 0:
                setRequestedOrientation(4);
                return;
            case 1:
                setRequestedOrientation(1);
                return;
            case 2:
                setRequestedOrientation(0);
                return;
            default:
                setRequestedOrientation(4);
                return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo30218b(String str) {
        if (!C6319n.m19593a(str)) {
            C9700a.m28636a(this, "", str);
            m35965a((int) R.drawable.bdc, (int) R.string.d32);
        }
    }

    /* renamed from: a */
    private void m35967a(Bundle bundle) {
        C12388a m = m35971m();
        this.f32846E = new WeakReference<>(m);
        C0633q a = getSupportFragmentManager().mo2645a();
        Fragment fragment = (Fragment) m;
        fragment.setArguments(bundle);
        if (getSupportFragmentManager().mo2644a("browser_fragment_tag") == null) {
            a.mo2586a(R.id.p4, fragment, "browser_fragment_tag");
        } else {
            a.mo2600b(R.id.p4, fragment, "browser_fragment_tag");
        }
        a.mo2604c();
    }

    /* renamed from: c */
    private void m35968c(String str) {
        if (!C6319n.m19593a(str)) {
            if ("back_arrow".equals(str)) {
                this.f32858v.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bdg, 0, 0, 0);
            } else if ("close".equals(str)) {
                this.f32858v.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bdm, 0, 0, 0);
                this.f32852p = true;
                C9738o.m28712b((View) this.f32850n, 8);
            } else {
                if ("down_arrow".equals(str)) {
                    this.f32858v.setCompoundDrawablesWithIntrinsicBounds(R.drawable.bd5, 0, 0, 0);
                    this.f32852p = true;
                    C9738o.m28712b((View) this.f32850n, 8);
                }
            }
        }
    }

    /* renamed from: d */
    private void m35969d(String str) {
        if (!C6319n.m19593a(str)) {
            LayoutParams layoutParams = (LayoutParams) this.f32858v.getLayoutParams();
            if ("top_left".equals(str)) {
                layoutParams.addRule(9);
                layoutParams.addRule(10);
                layoutParams.addRule(11, 0);
                layoutParams.addRule(12, 0);
            } else if ("top_right".equals(str)) {
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                layoutParams.addRule(9, 0);
                layoutParams.addRule(12, 0);
            } else if ("bottom_left".equals(str)) {
                layoutParams.addRule(9);
                layoutParams.addRule(12);
                layoutParams.addRule(11, 0);
                layoutParams.addRule(10, 0);
            } else if ("bottom_right".equals(str)) {
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.addRule(9, 0);
                layoutParams.addRule(10, 0);
            }
            this.f32858v.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: e */
    private void m35970e(String str) {
        if (!C6319n.m19593a(str)) {
            Drawable drawable = this.f32858v.getCompoundDrawables()[0];
            if (drawable != null) {
                if ("white".equals(str)) {
                    drawable.setColorFilter(getResources().getColor(R.color.a2n), Mode.SRC_IN);
                } else if ("black".equals(str)) {
                    drawable.setColorFilter(getResources().getColor(R.color.a24), Mode.SRC_IN);
                }
                this.f32858v.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
            }
            Drawable drawable2 = this.f32850n.getDrawable();
            if (drawable2 != null) {
                if ("white".equals(str)) {
                    drawable2.setColorFilter(getResources().getColor(R.color.a2n), Mode.SRC_IN);
                } else if ("black".equals(str)) {
                    drawable2.setColorFilter(getResources().getColor(R.color.a24), Mode.SRC_IN);
                }
                this.f32850n.setImageDrawable(drawable2);
            }
            this.f32845D = str;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30217a(String str) {
        if (!C6319n.m19593a(str)) {
            C12388a aVar = null;
            if (this.f32846E != null) {
                aVar = (C12388a) this.f32846E.get();
            }
            if (!(aVar instanceof C12382a)) {
                try {
                    Intent intent = new Intent();
                    intent.setData(Uri.parse(str));
                    intent.setAction("android.intent.action.VIEW");
                    startActivity(intent);
                } catch (Exception unused) {
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        if (!getIntent().getBooleanExtra("hide_status_bar", false) || VERSION.SDK_INT < 23) {
            z = false;
        } else {
            z = true;
        }
        this.f32855s = z;
        this.f32856t = getIntent().getStringExtra("status_bar_background");
        this.f32857u = getIntent().getStringExtra("status_bar_color");
        super.onCreate(bundle);
        Window window = getWindow();
        if (C12428i.m36162l() && window != null) {
            window.setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        }
        getWindow().setSoftInputMode(48);
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("key_show_feedback_entrance", false)) {
            C12428i.m36155e();
            if (this.f32830h != null) {
                this.f32830h.setText("我的反馈");
                this.f32830h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.f32830h.setTextColor(getResources().getColor(R.color.a23));
                C9738o.m28712b((View) this.f32830h, 0);
                this.f32830h.setOnClickListener(new OnClickListener(1) {
                    public final void onClick(View view) {
                        C12428i.m36155e().mo30308a((Context) PolarisBrowserActivity.this, 1);
                    }
                });
            }
        }
        C12352g.m35878a(getWindow(), true);
    }

    /* renamed from: a */
    private void m35965a(int i, int i2) {
        C9738o.m28694a((Context) this, (int) R.drawable.bdc, (int) R.string.d32);
    }

    /* renamed from: a */
    public static Intent m35963a(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Intent intent = new Intent(context, PolarisBrowserActivity.class);
            String queryParameter = uri.getQueryParameter("url");
            if (C6319n.m19593a(queryParameter)) {
                return null;
            }
            boolean a = C12370u.m35935a(uri.getQueryParameter("rotate"));
            boolean a2 = C12370u.m35935a(uri.getQueryParameter("no_hw"));
            boolean a3 = C12370u.m35935a(uri.getQueryParameter("hide_more"));
            boolean a4 = C12370u.m35935a(uri.getQueryParameter("bundle_user_webview_title"));
            String queryParameter2 = uri.getQueryParameter("ad_id");
            if (!C6319n.m19593a(queryParameter2)) {
                try {
                    intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                } catch (Exception unused) {
                }
            }
            intent.setData(Uri.parse(URLDecoder.decode(queryParameter, "UTF-8")));
            intent.putExtra("swipe_mode", C12370u.m35924a(uri, "swipe_mode", 2));
            intent.putExtra("show_toolbar", true);
            if (a) {
                intent.putExtra("orientation", 0);
            }
            if (a4) {
                intent.putExtra("bundle_user_webview_title", a4);
            }
            if (a2) {
                intent.putExtra("bundle_no_hw_acceleration", a2);
            }
            if (a3) {
                intent.putExtra("hide_more", a3);
            }
            intent.putExtra("bundle_support_download", C12370u.m35935a(uri.getQueryParameter("support_download")));
            String queryParameter3 = uri.getQueryParameter("title");
            if (!C6319n.m19593a(queryParameter3)) {
                intent.putExtra("title", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("gd_label");
            if (!C6319n.m19593a(queryParameter4)) {
                intent.putExtra("gd_label", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("gd_ext_json");
            if (!C6319n.m19593a(queryParameter5)) {
                intent.putExtra("gd_ext_json", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("webview_track_key");
            if (!C6319n.m19593a(queryParameter6)) {
                intent.putExtra("webview_track_key", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("wap_headers");
            if (!C6319n.m19593a(queryParameter7)) {
                intent.putExtra("wap_headers", queryParameter7);
            }
            intent.putExtra("require_login", uri.getBooleanQueryParameter("require_login", false));
            m35966a(intent, uri);
            return intent;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m35966a(Intent intent, Uri uri) {
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("back_button_color");
            String queryParameter2 = uri.getQueryParameter("back_button_icon");
            String queryParameter3 = uri.getQueryParameter("back_button_position");
            String queryParameter4 = uri.getQueryParameter("disableHistory");
            String queryParameter5 = uri.getQueryParameter("hide_bar");
            String queryParameter6 = uri.getQueryParameter("hide_nav_bar");
            String queryParameter7 = uri.getQueryParameter("title");
            if (!C6319n.m19593a(queryParameter7)) {
                intent.putExtra("title", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("status_bar_color");
            String queryParameter9 = uri.getQueryParameter("status_bar_background");
            String queryParameter10 = uri.getQueryParameter("hide_status_bar");
            if (!C6319n.m19593a(queryParameter)) {
                intent.putExtra("back_button_color", queryParameter);
            }
            if (!C6319n.m19593a(queryParameter2)) {
                intent.putExtra("back_button_icon", queryParameter2);
            }
            if (!C6319n.m19593a(queryParameter3)) {
                intent.putExtra("back_button_position", queryParameter3);
            }
            if (!C6319n.m19593a(queryParameter8)) {
                intent.putExtra("status_bar_color", queryParameter8);
            }
            if (!C6319n.m19593a(queryParameter9)) {
                intent.putExtra("status_bar_background", queryParameter9);
            }
            boolean z3 = true;
            if (!C6319n.m19593a(queryParameter10)) {
                try {
                    i4 = Integer.parseInt(queryParameter10);
                } catch (NumberFormatException unused) {
                    i4 = 0;
                }
                if (i4 > 0) {
                    intent.putExtra("hide_status_bar", true);
                }
            }
            if (!C6319n.m19593a(queryParameter4)) {
                try {
                    i3 = Integer.parseInt(queryParameter4);
                } catch (NumberFormatException unused2) {
                    i3 = 0;
                }
                if (i3 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intent.putExtra("back_button_disable_history", z2);
            }
            if (!C6319n.m19593a(queryParameter5)) {
                try {
                    i2 = Integer.parseInt(queryParameter5);
                } catch (NumberFormatException unused3) {
                    i2 = 0;
                }
                if (i2 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                intent.putExtra("key_hide_bar", z);
            }
            if (!C6319n.m19593a(queryParameter6)) {
                try {
                    i = Integer.parseInt(queryParameter6);
                } catch (NumberFormatException unused4) {
                    i = 0;
                }
                if (i <= 0) {
                    z3 = false;
                }
                intent.putExtra("key_hide_bar", z3);
            }
            if (("down_arrow".equals(queryParameter2) || "close".equals(queryParameter2)) && ("top_left".equals(queryParameter3) || "top_right".equals(queryParameter3) || C6319n.m19593a(queryParameter3))) {
                intent.putExtra("activity_trans_type", 3);
            }
        }
    }
}
