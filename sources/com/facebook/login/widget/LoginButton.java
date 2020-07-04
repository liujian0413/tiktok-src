package com.facebook.login.widget;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.os.Bundle;
import android.support.p029v7.p030a.p031a.C1065a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.C1642a;
import com.facebook.AccessToken;
import com.facebook.C13338d;
import com.facebook.C13447e;
import com.facebook.C13449f;
import com.facebook.C13498g;
import com.facebook.C13499h;
import com.facebook.Profile;
import com.facebook.appevents.C13187j;
import com.facebook.internal.C13924n;
import com.facebook.internal.C13926o;
import com.facebook.internal.C13967z;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.login.C14102d;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginBehavior;
import com.facebook.login.LoginManager;
import com.facebook.login.R$styleable;
import com.facebook.login.widget.ToolTipPopup.Style;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LoginButton extends C13449f {

    /* renamed from: f */
    private static final String f37255f = "com.facebook.login.widget.LoginButton";

    /* renamed from: c */
    public boolean f37256c;

    /* renamed from: d */
    public C14109a f37257d = new C14109a();

    /* renamed from: e */
    public String f37258e = "fb_login_view_usage";

    /* renamed from: g */
    private String f37259g;

    /* renamed from: h */
    private String f37260h;

    /* renamed from: i */
    private boolean f37261i;

    /* renamed from: j */
    private Style f37262j = Style.BLUE;

    /* renamed from: k */
    private ToolTipMode f37263k;

    /* renamed from: l */
    private long f37264l = 6000;

    /* renamed from: m */
    private ToolTipPopup f37265m;

    /* renamed from: n */
    private C13338d f37266n;

    /* renamed from: o */
    private LoginManager f37267o;

    public enum ToolTipMode {
        AUTOMATIC("automatic", 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        
        public static ToolTipMode DEFAULT;
        private int intValue;
        private String stringValue;

        public final int getValue() {
            return this.intValue;
        }

        public final String toString() {
            return this.stringValue;
        }

        static {
            DEFAULT = AUTOMATIC;
        }

        public static ToolTipMode fromInt(int i) {
            ToolTipMode[] values;
            for (ToolTipMode toolTipMode : values()) {
                if (toolTipMode.getValue() == i) {
                    return toolTipMode;
                }
            }
            return null;
        }

        private ToolTipMode(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$a */
    static class C14109a {

        /* renamed from: a */
        public DefaultAudience f37274a = DefaultAudience.FRIENDS;

        /* renamed from: b */
        public List<String> f37275b = Collections.emptyList();

        /* renamed from: c */
        public LoginBehavior f37276c = LoginBehavior.NATIVE_WITH_FALLBACK;

        /* renamed from: d */
        public String f37277d = "rerequest";

        C14109a() {
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$b */
    protected class C14110b implements OnClickListener {
        /* renamed from: b */
        private LoginManager m41677b() {
            LoginManager a = LoginManager.m41580a();
            a.mo33799a(LoginButton.this.getDefaultAudience());
            a.mo33800a(LoginButton.this.getLoginBehavior());
            a.mo33801a(LoginButton.this.getAuthType());
            return a;
        }

        /* renamed from: a */
        private void m41675a() {
            LoginManager b = m41677b();
            if (LoginButton.this.getFragment() != null) {
                b.mo33804a(LoginButton.this.getFragment(), (Collection<String>) LoginButton.this.f37257d.f37275b);
            } else if (LoginButton.this.getNativeFragment() != null) {
                b.mo33803a(LoginButton.this.getNativeFragment(), (Collection<String>) LoginButton.this.f37257d.f37275b);
            } else {
                b.mo33802a(LoginButton.this.getActivity(), (Collection<String>) LoginButton.this.f37257d.f37275b);
            }
        }

        protected C14110b() {
        }

        public final void onClick(View view) {
            int i;
            LoginButton.this.mo32948a(view);
            AccessToken a = AccessToken.m38225a();
            if (AccessToken.m38232b()) {
                m41676a(LoginButton.this.getContext());
            } else {
                m41675a();
            }
            C13187j jVar = new C13187j(LoginButton.this.getContext());
            Bundle bundle = new Bundle();
            String str = "logging_in";
            if (a != null) {
                i = 0;
            } else {
                i = 1;
            }
            bundle.putInt(str, i);
            bundle.putInt("access_token_expired", AccessToken.m38232b() ? 1 : 0);
            jVar.mo32371b(LoginButton.this.f37258e, bundle);
        }

        /* renamed from: a */
        private void m41676a(Context context) {
            String str;
            final LoginManager b = m41677b();
            if (LoginButton.this.f37256c) {
                String string = LoginButton.this.getResources().getString(R.string.a6l);
                String string2 = LoginButton.this.getResources().getString(R.string.a6h);
                Profile a = Profile.m38319a();
                if (a == null || a.f34712f == null) {
                    str = LoginButton.this.getResources().getString(R.string.a6o);
                } else {
                    str = C1642a.m8034a(LoginButton.this.getResources().getString(R.string.a6n), new Object[]{a.f34712f});
                }
                Builder builder = new Builder(context);
                builder.setMessage(str).setCancelable(true).setPositiveButton(string, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        b.mo33808b();
                    }
                }).setNegativeButton(string2, null);
                builder.create().show();
                return;
            }
            b.mo33808b();
        }
    }

    public int getDefaultStyleResource() {
        return R.style.s9;
    }

    public long getToolTipDisplayTime() {
        return this.f37264l;
    }

    public ToolTipMode getToolTipMode() {
        return this.f37263k;
    }

    public String getAuthType() {
        return this.f37257d.f37277d;
    }

    public DefaultAudience getDefaultAudience() {
        return this.f37257d.f37274a;
    }

    public int getDefaultRequestCode() {
        return RequestCodeOffset.Login.toRequestCode();
    }

    public LoginBehavior getLoginBehavior() {
        return this.f37257d.f37276c;
    }

    /* access modifiers changed from: protected */
    public C14110b getNewLoginClickListener() {
        return new C14110b();
    }

    /* access modifiers changed from: 0000 */
    public List<String> getPermissions() {
        return this.f37257d.f37275b;
    }

    /* renamed from: b */
    private void m41664b() {
        if (this.f37265m != null) {
            this.f37265m.dismiss();
            this.f37265m = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public LoginManager getLoginManager() {
        if (this.f37267o == null) {
            this.f37267o = LoginManager.m41580a();
        }
        return this.f37267o;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f37266n != null) {
            this.f37266n.mo32631b();
        }
        m41664b();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37266n != null && !this.f37266n.f35254b) {
            this.f37266n.mo32629a();
            mo33834a();
        }
    }

    /* renamed from: c */
    private void m41668c() {
        switch (this.f37263k) {
            case AUTOMATIC:
                final String a = C13967z.m41219a(getContext());
                C13499h.m39719e().execute(new Runnable() {
                    public final void run() {
                        final C13924n a = C13926o.m41099a(a, false);
                        LoginButton.this.getActivity().runOnUiThread(new Runnable() {
                            public final void run() {
                                LoginButton.this.mo33837a(a);
                            }
                        });
                    }
                });
                return;
            case DISPLAY_ALWAYS:
                m41666b(getResources().getString(R.string.a6w));
                break;
        }
    }

    /* renamed from: a */
    public final void mo33834a() {
        String str;
        Resources resources = getResources();
        if (!isInEditMode() && AccessToken.m38232b()) {
            if (this.f37260h != null) {
                str = this.f37260h;
            } else {
                str = resources.getString(R.string.a6m);
            }
            setText(str);
        } else if (this.f37259g != null) {
            setText(this.f37259g);
        } else {
            String string = resources.getString(R.string.a6j);
            int width = getWidth();
            if (width != 0 && m41667c(string) > width) {
                string = resources.getString(R.string.a6i);
            }
            setText(string);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setLoginManager(LoginManager loginManager) {
        this.f37267o = loginManager;
    }

    /* access modifiers changed from: 0000 */
    public void setProperties(C14109a aVar) {
        this.f37257d = aVar;
    }

    public void setToolTipDisplayTime(long j) {
        this.f37264l = j;
    }

    public void setToolTipMode(ToolTipMode toolTipMode) {
        this.f37263k = toolTipMode;
    }

    public void setToolTipStyle(Style style) {
        this.f37262j = style;
    }

    /* renamed from: a */
    public final void mo33835a(C13447e eVar) {
        getLoginManager();
        LoginManager.m41585a(eVar);
    }

    public void setAuthType(String str) {
        this.f37257d.f37277d = str;
    }

    public void setDefaultAudience(DefaultAudience defaultAudience) {
        this.f37257d.f37274a = defaultAudience;
    }

    public void setLoginBehavior(LoginBehavior loginBehavior) {
        this.f37257d.f37276c = loginBehavior;
    }

    public void setLoginText(String str) {
        this.f37259g = str;
        mo33834a();
    }

    public void setLogoutText(String str) {
        this.f37260h = str;
        mo33834a();
    }

    public void setPermissions(List<String> list) {
        this.f37257d.f37275b = list;
    }

    public void setPublishPermissions(List<String> list) {
        this.f37257d.f37275b = list;
    }

    public void setReadPermissions(List<String> list) {
        this.f37257d.f37275b = list;
    }

    public void setPermissions(String... strArr) {
        this.f37257d.f37275b = Arrays.asList(strArr);
    }

    public void setPublishPermissions(String... strArr) {
        this.f37257d.f37275b = Arrays.asList(strArr);
    }

    public void setReadPermissions(String... strArr) {
        this.f37257d.f37275b = Arrays.asList(strArr);
    }

    public LoginButton(Context context) {
        super(context, null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    /* renamed from: b */
    private void m41666b(String str) {
        this.f37265m = new ToolTipPopup(str, this);
        this.f37265m.f37284d = this.f37262j;
        this.f37265m.f37285e = this.f37264l;
        this.f37265m.mo33871a();
    }

    /* renamed from: c */
    private int m41667c(String str) {
        return getCompoundPaddingLeft() + getCompoundDrawablePadding() + mo32945a(str) + getCompoundPaddingRight();
    }

    /* renamed from: a */
    public final void mo33837a(C13924n nVar) {
        if (nVar != null && nVar.f36839c && getVisibility() == 0) {
            m41666b(nVar.f36838b);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f37261i && !isInEditMode()) {
            this.f37261i = true;
            m41668c();
        }
    }

    /* renamed from: a */
    public final void mo33836a(C13447e eVar, C13498g<C14102d> gVar) {
        getLoginManager().mo33805a(eVar, gVar);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            m41664b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        FontMetrics fontMetrics = getPaint().getFontMetrics();
        int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
        Resources resources = getResources();
        String str = this.f37259g;
        if (str == null) {
            str = resources.getString(R.string.a6j);
            int c = m41667c(str);
            if (resolveSize(c, i) < c) {
                str = resources.getString(R.string.a6i);
            }
        }
        int c2 = m41667c(str);
        String str2 = this.f37260h;
        if (str2 == null) {
            str2 = resources.getString(R.string.a6m);
        }
        setMeasuredDimension(resolveSize(Math.max(c2, m41667c(str2)), i), compoundPaddingTop);
    }

    /* renamed from: b */
    private void m41665b(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f37263k = ToolTipMode.DEFAULT;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.com_facebook_login_view, i, i2);
        try {
            this.f37256c = obtainStyledAttributes.getBoolean(0, true);
            this.f37259g = obtainStyledAttributes.getString(1);
            this.f37260h = obtainStyledAttributes.getString(2);
            this.f37263k = ToolTipMode.fromInt(obtainStyledAttributes.getInt(3, ToolTipMode.DEFAULT.getValue()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public final void mo32947a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo32947a(context, attributeSet, i, i2);
        setInternalOnClickListener(getNewLoginClickListener());
        m41665b(context, attributeSet, i, i2);
        if (isInEditMode()) {
            setBackgroundColor(getResources().getColor(R.color.jv));
            this.f37259g = "Continue with Facebook";
        } else {
            this.f37266n = new C13338d() {
                /* renamed from: a */
                public final void mo32630a(AccessToken accessToken, AccessToken accessToken2) {
                    LoginButton.this.mo33834a();
                }
            };
        }
        mo33834a();
        setCompoundDrawablesWithIntrinsicBounds(C1065a.m4641b(getContext(), R.drawable.wy), null, null, null);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo33834a();
    }
}
