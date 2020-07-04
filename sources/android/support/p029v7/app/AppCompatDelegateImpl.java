package android.support.p029v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.C0652w;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0973f;
import android.support.p022v4.view.C0973f.C0974a;
import android.support.p022v4.view.C0975g;
import android.support.p022v4.view.C0983o;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0998y;
import android.support.p022v4.view.C1002z;
import android.support.p022v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.p029v7.app.ActionBarDrawerToggle.C1068a;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.p030a.p031a.C1065a;
import android.support.p029v7.view.C1153b;
import android.support.p029v7.view.C1153b.C1154a;
import android.support.p029v7.view.C1156d;
import android.support.p029v7.view.C1157e;
import android.support.p029v7.view.C1162g;
import android.support.p029v7.view.SupportActionModeWrapper.CallbackWrapper;
import android.support.p029v7.view.menu.C1188i;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.view.menu.C1190j;
import android.support.p029v7.view.menu.ListMenuPresenter;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuBuilder.C1166a;
import android.support.p029v7.widget.ActionBarContextView;
import android.support.p029v7.widget.C1365av;
import android.support.p029v7.widget.C1371az;
import android.support.p029v7.widget.C1385bc;
import android.support.p029v7.widget.C1393g;
import android.support.p029v7.widget.C1431u;
import android.support.p029v7.widget.C1442z;
import android.support.p029v7.widget.C1442z.C1443a;
import android.support.p029v7.widget.ContentFrameLayout;
import android.support.p029v7.widget.ContentFrameLayout.C1230a;
import android.support.p029v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.app.AppCompatDelegateImpl */
final class AppCompatDelegateImpl extends C1107c implements C1166a, Factory2 {

    /* renamed from: v */
    private static final boolean f3827v;

    /* renamed from: w */
    private static final int[] f3828w = {16842836};

    /* renamed from: x */
    private static boolean f3829x = true;

    /* renamed from: A */
    private C1092b f3830A;

    /* renamed from: B */
    private C1099g f3831B;

    /* renamed from: C */
    private boolean f3832C = true;

    /* renamed from: D */
    private boolean f3833D;

    /* renamed from: E */
    private TextView f3834E;

    /* renamed from: F */
    private View f3835F;

    /* renamed from: G */
    private boolean f3836G;

    /* renamed from: H */
    private boolean f3837H;

    /* renamed from: I */
    private boolean f3838I;

    /* renamed from: J */
    private PanelFeatureState[] f3839J;

    /* renamed from: K */
    private PanelFeatureState f3840K;

    /* renamed from: L */
    private boolean f3841L;

    /* renamed from: M */
    private int f3842M = -100;

    /* renamed from: N */
    private boolean f3843N;

    /* renamed from: O */
    private C1096e f3844O;

    /* renamed from: P */
    private final Runnable f3845P = new Runnable() {
        public final void run() {
            if ((AppCompatDelegateImpl.this.f3870u & 1) != 0) {
                AppCompatDelegateImpl.this.mo4313h(0);
            }
            if ((AppCompatDelegateImpl.this.f3870u & 4096) != 0) {
                AppCompatDelegateImpl.this.mo4313h(108);
            }
            AppCompatDelegateImpl.this.f3869t = false;
            AppCompatDelegateImpl.this.f3870u = 0;
        }
    };

    /* renamed from: Q */
    private boolean f3846Q;

    /* renamed from: R */
    private Rect f3847R;

    /* renamed from: S */
    private Rect f3848S;

    /* renamed from: T */
    private AppCompatViewInflater f3849T;

    /* renamed from: a */
    final Context f3850a;

    /* renamed from: b */
    final Window f3851b;

    /* renamed from: c */
    final Callback f3852c;

    /* renamed from: d */
    final Callback f3853d;

    /* renamed from: e */
    final C1106b f3854e;

    /* renamed from: f */
    public ActionBar f3855f;

    /* renamed from: g */
    MenuInflater f3856g;

    /* renamed from: h */
    C1153b f3857h;

    /* renamed from: i */
    ActionBarContextView f3858i;

    /* renamed from: j */
    PopupWindow f3859j;

    /* renamed from: k */
    Runnable f3860k;

    /* renamed from: l */
    C0998y f3861l;

    /* renamed from: m */
    public ViewGroup f3862m;

    /* renamed from: n */
    boolean f3863n;

    /* renamed from: o */
    boolean f3864o;

    /* renamed from: p */
    boolean f3865p;

    /* renamed from: q */
    boolean f3866q;

    /* renamed from: r */
    boolean f3867r;

    /* renamed from: s */
    boolean f3868s;

    /* renamed from: t */
    boolean f3869t;

    /* renamed from: u */
    int f3870u;

    /* renamed from: y */
    private CharSequence f3871y;

    /* renamed from: z */
    private C1431u f3872z;

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState */
    protected static final class PanelFeatureState {

        /* renamed from: a */
        int f3881a;

        /* renamed from: b */
        int f3882b;

        /* renamed from: c */
        int f3883c;

        /* renamed from: d */
        int f3884d;

        /* renamed from: e */
        int f3885e;

        /* renamed from: f */
        int f3886f;

        /* renamed from: g */
        ViewGroup f3887g;

        /* renamed from: h */
        View f3888h;

        /* renamed from: i */
        View f3889i;

        /* renamed from: j */
        MenuBuilder f3890j;

        /* renamed from: k */
        ListMenuPresenter f3891k;

        /* renamed from: l */
        Context f3892l;

        /* renamed from: m */
        boolean f3893m;

        /* renamed from: n */
        boolean f3894n;

        /* renamed from: o */
        boolean f3895o;

        /* renamed from: p */
        public boolean f3896p;

        /* renamed from: q */
        boolean f3897q;

        /* renamed from: r */
        boolean f3898r;

        /* renamed from: s */
        Bundle f3899s;

        /* renamed from: android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState$SavedState */
        static class SavedState implements Parcelable {
            public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
                /* renamed from: a */
                private static SavedState[] m4813a(int i) {
                    return new SavedState[i];
                }

                /* renamed from: a */
                private static SavedState m4811a(Parcel parcel) {
                    return SavedState.m4810a(parcel, null);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m4811a(parcel);
                }

                public final /* synthetic */ Object[] newArray(int i) {
                    return m4813a(i);
                }

                /* renamed from: a */
                private static SavedState m4812a(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m4810a(parcel, classLoader);
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return m4812a(parcel, classLoader);
                }
            };

            /* renamed from: a */
            int f3900a;

            /* renamed from: b */
            boolean f3901b;

            /* renamed from: c */
            Bundle f3902c;

            SavedState() {
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3900a);
                parcel.writeInt(this.f3901b ? 1 : 0);
                if (this.f3901b) {
                    parcel.writeBundle(this.f3902c);
                }
            }

            /* renamed from: a */
            static SavedState m4810a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f3900a = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f3901b = z;
                if (savedState.f3901b) {
                    savedState.f3902c = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }

        /* renamed from: a */
        public final boolean mo4332a() {
            if (this.f3888h == null) {
                return false;
            }
            if (this.f3889i == null && this.f3891k.mo4688d().getCount() <= 0) {
                return false;
            }
            return true;
        }

        PanelFeatureState(int i) {
            this.f3881a = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4331a(MenuBuilder menuBuilder) {
            if (menuBuilder != this.f3890j) {
                if (this.f3890j != null) {
                    this.f3890j.mo4721b((C1188i) this.f3891k);
                }
                this.f3890j = menuBuilder;
                if (!(menuBuilder == null || this.f3891k == null)) {
                    menuBuilder.mo4704a((C1188i) this.f3891k);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C1190j mo4329a(C1189a aVar) {
            if (this.f3890j == null) {
                return null;
            }
            if (this.f3891k == null) {
                this.f3891k = new ListMenuPresenter(this.f3892l, (int) R.layout.q);
                this.f3891k.mo1113a(aVar);
                this.f3890j.mo4704a((C1188i) this.f3891k);
            }
            return this.f3891k.mo4687a(this.f3887g);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4330a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.e, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(R.attr.v3, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(R.style.ln, true);
            }
            C1156d dVar = new C1156d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f3892l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(R$styleable.AppCompatTheme);
            this.f3882b = obtainStyledAttributes.getResourceId(80, 0);
            this.f3886f = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$a */
    class C1091a implements C1068a {
        C1091a() {
        }

        /* renamed from: a */
        public final void mo4191a(int i) {
            ActionBar a = AppCompatDelegateImpl.this.mo4282a();
            if (a != null) {
                a.mo4168a(i);
            }
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$b */
    final class C1092b implements C1189a {
        C1092b() {
        }

        /* renamed from: a */
        public final boolean mo4339a(MenuBuilder menuBuilder) {
            Callback l = AppCompatDelegateImpl.this.mo4317l();
            if (l != null) {
                l.onMenuOpened(108, menuBuilder);
            }
            return true;
        }

        /* renamed from: a */
        public final void mo4338a(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImpl.this.mo4300b(menuBuilder);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$c */
    class C1093c implements C1154a {

        /* renamed from: b */
        private C1154a f3906b;

        /* renamed from: a */
        public final void mo4340a(C1153b bVar) {
            this.f3906b.mo4340a(bVar);
            if (AppCompatDelegateImpl.this.f3859j != null) {
                AppCompatDelegateImpl.this.f3851b.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f3860k);
            }
            if (AppCompatDelegateImpl.this.f3858i != null) {
                AppCompatDelegateImpl.this.mo4320o();
                AppCompatDelegateImpl.this.f3861l = C0991u.m4238q(AppCompatDelegateImpl.this.f3858i).mo3797a(0.0f);
                AppCompatDelegateImpl.this.f3861l.mo3800a((C1002z) new ViewPropertyAnimatorListenerAdapter() {
                    /* renamed from: b */
                    public final void mo3627b(View view) {
                        AppCompatDelegateImpl.this.f3858i.setVisibility(8);
                        if (AppCompatDelegateImpl.this.f3859j != null) {
                            C1108d.m4925a(AppCompatDelegateImpl.this.f3859j);
                        } else if (AppCompatDelegateImpl.this.f3858i.getParent() instanceof View) {
                            C0991u.m4243v((View) AppCompatDelegateImpl.this.f3858i.getParent());
                        }
                        AppCompatDelegateImpl.this.f3858i.removeAllViews();
                        AppCompatDelegateImpl.this.f3861l.mo3800a((C1002z) null);
                        AppCompatDelegateImpl.this.f3861l = null;
                    }
                });
            }
            if (AppCompatDelegateImpl.this.f3854e != null) {
                AppCompatDelegateImpl.this.f3854e.onSupportActionModeFinished(AppCompatDelegateImpl.this.f3857h);
            }
            AppCompatDelegateImpl.this.f3857h = null;
        }

        public C1093c(C1154a aVar) {
            this.f3906b = aVar;
        }

        /* renamed from: a */
        public final boolean mo4341a(C1153b bVar, Menu menu) {
            return this.f3906b.mo4341a(bVar, menu);
        }

        /* renamed from: b */
        public final boolean mo4343b(C1153b bVar, Menu menu) {
            return this.f3906b.mo4343b(bVar, menu);
        }

        /* renamed from: a */
        public final boolean mo4342a(C1153b bVar, MenuItem menuItem) {
            return this.f3906b.mo4342a(bVar, menuItem);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$d */
    class C1095d extends C1162g {
        public final void onContentChanged() {
        }

        /* renamed from: a */
        private ActionMode m4822a(ActionMode.Callback callback) {
            CallbackWrapper callbackWrapper = new CallbackWrapper(AppCompatDelegateImpl.this.f3850a, callback);
            C1153b a = AppCompatDelegateImpl.this.mo4285a((C1154a) callbackWrapper);
            if (a != null) {
                return callbackWrapper.mo4569b(a);
            }
            return null;
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.mo4296a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo4295a(keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            return false;
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.mo4319n()) {
                return m4822a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        C1095d(Callback callback) {
            super(callback);
        }

        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo4309f(i);
            return true;
        }

        public final void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo4307e(i);
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo4319n() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return m4822a(callback);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder;
            if (menu instanceof MenuBuilder) {
                menuBuilder = (MenuBuilder) menu;
            } else {
                menuBuilder = null;
            }
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.f4296i = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.f4296i = false;
            }
            return onPreparePanel;
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            PanelFeatureState a = AppCompatDelegateImpl.this.mo4283a(0, true);
            if (a == null || a.f3890j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.f3890j, i);
            }
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$e */
    final class C1096e {

        /* renamed from: b */
        private C1117h f3910b;

        /* renamed from: c */
        private boolean f3911c;

        /* renamed from: d */
        private BroadcastReceiver f3912d;

        /* renamed from: e */
        private IntentFilter f3913e;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo4354a() {
            this.f3911c = this.f3910b.mo4414a();
            if (this.f3911c) {
                return 2;
            }
            return 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo4355b() {
            boolean a = this.f3910b.mo4414a();
            if (a != this.f3911c) {
                this.f3911c = a;
                AppCompatDelegateImpl.this.mo4316j();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo4357d() {
            if (this.f3912d != null) {
                AppCompatDelegateImpl.this.f3850a.unregisterReceiver(this.f3912d);
                this.f3912d = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo4356c() {
            mo4357d();
            if (this.f3912d == null) {
                this.f3912d = new BroadcastReceiver() {
                    public final void onReceive(Context context, Intent intent) {
                        C1096e.this.mo4355b();
                    }
                };
            }
            if (this.f3913e == null) {
                this.f3913e = new IntentFilter();
                this.f3913e.addAction("android.intent.action.TIME_SET");
                this.f3913e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f3913e.addAction("android.intent.action.TIME_TICK");
            }
            AppCompatDelegateImpl.this.f3850a.registerReceiver(this.f3912d, this.f3913e);
        }

        C1096e(C1117h hVar) {
            this.f3910b = hVar;
            this.f3911c = hVar.mo4414a();
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$f */
    class C1098f extends ContentFrameLayout {
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C1065a.m4641b(getContext(), i));
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (AppCompatDelegateImpl.this.mo4296a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
                return true;
            }
            return false;
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m4827a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo4311g(0);
            return true;
        }

        public C1098f(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m4827a(int i, int i2) {
            if (i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$g */
    final class C1099g implements C1189a {
        C1099g() {
        }

        /* renamed from: a */
        public final boolean mo4339a(MenuBuilder menuBuilder) {
            if (menuBuilder == null && AppCompatDelegateImpl.this.f3863n) {
                Callback l = AppCompatDelegateImpl.this.mo4317l();
                if (l != null && !AppCompatDelegateImpl.this.f3868s) {
                    l.onMenuOpened(108, menuBuilder);
                }
            }
            return true;
        }

        /* renamed from: a */
        public final void mo4338a(MenuBuilder menuBuilder, boolean z) {
            boolean z2;
            MenuBuilder l = menuBuilder.mo4745l();
            if (l != menuBuilder) {
                z2 = true;
            } else {
                z2 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = l;
            }
            PanelFeatureState a = appCompatDelegateImpl.mo4284a((Menu) menuBuilder);
            if (a != null) {
                if (z2) {
                    AppCompatDelegateImpl.this.mo4287a(a.f3881a, a, l);
                    AppCompatDelegateImpl.this.mo4290a(a, true);
                    return;
                }
                AppCompatDelegateImpl.this.mo4290a(a, z);
            }
        }
    }

    /* renamed from: k */
    private static int m4743k(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    /* renamed from: c */
    public final void mo4302c() {
        mo4316j();
    }

    /* renamed from: n */
    public final boolean mo4319n() {
        return this.f3832C;
    }

    /* renamed from: a */
    public final void mo4289a(Bundle bundle) {
        if (this.f3852c instanceof Activity) {
            String str = null;
            try {
                str = C0652w.m2822b((Activity) this.f3852c);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.f3855f;
                if (actionBar == null) {
                    this.f3846Q = true;
                } else {
                    actionBar.mo4178d(true);
                }
            }
        }
        if (bundle != null && this.f3842M == -100) {
            this.f3842M = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: a */
    public final void mo4291a(Toolbar toolbar) {
        if (this.f3852c instanceof Activity) {
            ActionBar a = mo4282a();
            if (!(a instanceof WindowDecorActionBar)) {
                this.f3856g = null;
                if (a != null) {
                    a.mo4184g();
                }
                if (toolbar != null) {
                    C1110f fVar = new C1110f(toolbar, ((Activity) this.f3852c).getTitle(), this.f3853d);
                    this.f3855f = fVar;
                    this.f3851b.setCallback(fVar.f3976c);
                } else {
                    this.f3855f = null;
                    this.f3851b.setCallback(this.f3853d);
                }
                mo4308f();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: a */
    public final void mo4288a(Configuration configuration) {
        if (this.f3863n && this.f3833D) {
            ActionBar a = mo4282a();
            if (a != null) {
                a.mo4169a(configuration);
            }
        }
        C1393g.m6901a().mo6490a(this.f3850a);
        mo4316j();
    }

    /* renamed from: a */
    public final void mo4292a(View view) {
        m4748s();
        ViewGroup viewGroup = (ViewGroup) this.f3862m.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f3852c.onContentChanged();
    }

    /* renamed from: a */
    public final void mo4293a(View view, LayoutParams layoutParams) {
        m4748s();
        ViewGroup viewGroup = (ViewGroup) this.f3862m.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f3852c.onContentChanged();
    }

    /* renamed from: b */
    public final void mo4301b(View view, LayoutParams layoutParams) {
        m4748s();
        ((ViewGroup) this.f3862m.findViewById(16908290)).addView(view, layoutParams);
        this.f3852c.onContentChanged();
    }

    /* renamed from: a */
    public final void mo4294a(CharSequence charSequence) {
        this.f3871y = charSequence;
        if (this.f3872z != null) {
            this.f3872z.setWindowTitle(charSequence);
        } else if (this.f3855f != null) {
            this.f3855f.mo4170a(charSequence);
        } else {
            if (this.f3834E != null) {
                this.f3834E.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1346a(MenuBuilder menuBuilder, MenuItem menuItem) {
        Callback l = mo4317l();
        if (l != null && !this.f3868s) {
            PanelFeatureState a = mo4284a((Menu) menuBuilder.mo4745l());
            if (a != null) {
                return l.onMenuItemSelected(a.f3881a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1345a(MenuBuilder menuBuilder) {
        m4730a(menuBuilder, true);
    }

    /* renamed from: a */
    public final C1153b mo4285a(C1154a aVar) {
        if (aVar != null) {
            if (this.f3857h != null) {
                this.f3857h.mo4402c();
            }
            C1093c cVar = new C1093c(aVar);
            ActionBar a = mo4282a();
            if (a != null) {
                this.f3857h = a.mo4166a((C1154a) cVar);
                if (!(this.f3857h == null || this.f3854e == null)) {
                    this.f3854e.onSupportActionModeStarted(this.f3857h);
                }
            }
            if (this.f3857h == null) {
                this.f3857h = m4734b((C1154a) cVar);
            }
            return this.f3857h;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4295a(int i, KeyEvent keyEvent) {
        ActionBar a = mo4282a();
        if (a != null && a.mo4172a(i, keyEvent)) {
            return true;
        }
        if (this.f3840K == null || !m4732a(this.f3840K, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f3840K == null) {
                PanelFeatureState a2 = mo4283a(0, true);
                m4737b(a2, keyEvent);
                boolean a3 = m4732a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f3893m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        }
        if (this.f3840K != null) {
            this.f3840K.f3894n = true;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4296a(KeyEvent keyEvent) {
        boolean z = true;
        if ((this.f3852c instanceof C0974a) || (this.f3852c instanceof AppCompatDialog)) {
            View decorView = this.f3851b.getDecorView();
            if (decorView != null && C0973f.m4116a(decorView, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getKeyCode() == 82 && this.f3852c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? m4738c(keyCode, keyEvent) : m4735b(keyCode, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4290a(PanelFeatureState panelFeatureState, boolean z) {
        if (!z || panelFeatureState.f3881a != 0 || this.f3872z == null || !this.f3872z.mo5016c()) {
            WindowManager windowManager = (WindowManager) this.f3850a.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f3895o || panelFeatureState.f3887g == null)) {
                windowManager.removeView(panelFeatureState.f3887g);
                if (z) {
                    mo4287a(panelFeatureState.f3881a, panelFeatureState, null);
                }
            }
            panelFeatureState.f3893m = false;
            panelFeatureState.f3894n = false;
            panelFeatureState.f3895o = false;
            panelFeatureState.f3888h = null;
            panelFeatureState.f3897q = true;
            if (this.f3840K == panelFeatureState) {
                this.f3840K = null;
            }
            return;
        }
        mo4300b(panelFeatureState.f3890j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4287a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.f3839J.length) {
                panelFeatureState = this.f3839J[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f3890j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f3895o) && !this.f3868s) {
            this.f3852c.onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PanelFeatureState mo4284a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f3839J;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f3890j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final ActionBar mo4282a() {
        m4746q();
        return this.f3855f;
    }

    /* renamed from: h */
    public final C1068a mo4312h() {
        return new C1091a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final Callback mo4317l() {
        return this.f3851b.getCallback();
    }

    /* renamed from: x */
    private void m4753x() {
        if (this.f3833D) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: y */
    private int m4754y() {
        if (this.f3842M != -100) {
            return this.f3842M;
        }
        return m4901k();
    }

    /* renamed from: e */
    public final void mo4306e() {
        ActionBar a = mo4282a();
        if (a != null) {
            a.mo4180e(true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo4320o() {
        if (this.f3861l != null) {
            this.f3861l.mo3804b();
        }
    }

    /* renamed from: r */
    private Context m4747r() {
        Context context;
        ActionBar a = mo4282a();
        if (a != null) {
            context = a.mo4174b();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f3850a;
        }
        return context;
    }

    /* renamed from: v */
    private CharSequence m4751v() {
        if (this.f3852c instanceof Activity) {
            return ((Activity) this.f3852c).getTitle();
        }
        return this.f3871y;
    }

    /* renamed from: w */
    private boolean m4752w() {
        if (this.f3857h != null) {
            this.f3857h.mo4402c();
            return true;
        }
        ActionBar a = mo4282a();
        if (a == null || !a.mo4183f()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private void m4755z() {
        if (this.f3844O == null) {
            this.f3844O = new C1096e(C1117h.m4955a(this.f3850a));
        }
    }

    /* renamed from: b */
    public final MenuInflater mo4297b() {
        Context context;
        if (this.f3856g == null) {
            m4746q();
            if (this.f3855f != null) {
                context = this.f3855f.mo4174b();
            } else {
                context = this.f3850a;
            }
            this.f3856g = new C1157e(context);
        }
        return this.f3856g;
    }

    /* renamed from: f */
    public final void mo4308f() {
        ActionBar a = mo4282a();
        if (a == null || !a.mo4181e()) {
            m4742j(0);
        }
    }

    /* renamed from: i */
    public final void mo4315i() {
        LayoutInflater from = LayoutInflater.from(this.f3850a);
        if (from.getFactory() == null) {
            C0975g.m4117a(from, this);
        } else {
            from.getFactory2();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo4318m() {
        if (!this.f3833D || this.f3862m == null || !C0991u.m4167D(this.f3862m)) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        if (VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        f3827v = z;
        if (f3827v && !f3829x) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                /* renamed from: a */
                private static boolean m4798a(Throwable th) {
                    if (!(th instanceof NotFoundException)) {
                        return false;
                    }
                    String message = th.getMessage();
                    if (message == null || (!message.contains("drawable") && !message.contains("Drawable"))) {
                        return false;
                    }
                    return true;
                }

                public final void uncaughtException(Thread thread, Throwable th) {
                    if (m4798a(th)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(th.getMessage());
                        sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        NotFoundException notFoundException = new NotFoundException(sb.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    /* renamed from: A */
    private boolean m4727A() {
        if (!this.f3843N || !(this.f3850a instanceof Activity)) {
            return false;
        }
        try {
            if ((this.f3850a.getPackageManager().getActivityInfo(new ComponentName(this.f3850a, this.f3850a.getClass()), 0).configChanges & 512) == 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: q */
    private void m4746q() {
        m4748s();
        if (this.f3863n && this.f3855f == null) {
            if (this.f3852c instanceof Activity) {
                this.f3855f = new WindowDecorActionBar((Activity) this.f3852c, this.f3864o);
            } else if (this.f3852c instanceof Dialog) {
                this.f3855f = new WindowDecorActionBar((Dialog) this.f3852c);
            }
            if (this.f3855f != null) {
                this.f3855f.mo4178d(this.f3846Q);
            }
        }
    }

    /* renamed from: d */
    public final void mo4305d() {
        ActionBar a = mo4282a();
        if (a != null) {
            a.mo4180e(false);
        }
        if (this.f3844O != null) {
            this.f3844O.mo4357d();
        }
    }

    /* renamed from: g */
    public final void mo4310g() {
        if (this.f3869t) {
            this.f3851b.getDecorView().removeCallbacks(this.f3845P);
        }
        this.f3868s = true;
        if (this.f3855f != null) {
            this.f3855f.mo4184g();
        }
        if (this.f3844O != null) {
            this.f3844O.mo4357d();
        }
    }

    /* renamed from: j */
    public final boolean mo4316j() {
        boolean z;
        int y = m4754y();
        int l = m4744l(y);
        if (l != -1) {
            z = m4745m(l);
        } else {
            z = false;
        }
        if (y == 0) {
            m4755z();
            this.f3844O.mo4356c();
        }
        this.f3843N = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final void mo4323p() {
        if (this.f3872z != null) {
            this.f3872z.mo5029h();
        }
        if (this.f3859j != null) {
            this.f3851b.getDecorView().removeCallbacks(this.f3860k);
            if (this.f3859j.isShowing()) {
                try {
                    C1109e.m4926a(this.f3859j);
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f3859j = null;
        }
        mo4320o();
        PanelFeatureState a = mo4283a(0, false);
        if (a != null && a.f3890j != null) {
            a.f3890j.close();
        }
    }

    /* renamed from: s */
    private void m4748s() {
        if (!this.f3833D) {
            this.f3862m = m4749t();
            CharSequence v = m4751v();
            if (!TextUtils.isEmpty(v)) {
                if (this.f3872z != null) {
                    this.f3872z.setWindowTitle(v);
                } else if (this.f3855f != null) {
                    this.f3855f.mo4170a(v);
                } else if (this.f3834E != null) {
                    this.f3834E.setText(v);
                }
            }
            m4750u();
            this.f3833D = true;
            PanelFeatureState a = mo4283a(0, false);
            if (this.f3868s) {
                return;
            }
            if (a == null || a.f3890j == null) {
                m4742j(108);
            }
        }
    }

    /* renamed from: u */
    private void m4750u() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f3862m.findViewById(16908290);
        View decorView = this.f3851b.getDecorView();
        contentFrameLayout.mo5312a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f3850a.obtainStyledAttributes(R$styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(118, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(119, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(116)) {
            obtainStyledAttributes.getValue(116, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.getValue(117, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(114)) {
            obtainStyledAttributes.getValue(114, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(115)) {
            obtainStyledAttributes.getValue(115, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: t */
    private ViewGroup m4749t() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f3850a.obtainStyledAttributes(R$styleable.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(111)) {
            if (obtainStyledAttributes.getBoolean(120, false)) {
                mo4304c(1);
            } else if (obtainStyledAttributes.getBoolean(111, false)) {
                mo4304c(108);
            }
            if (obtainStyledAttributes.getBoolean(112, false)) {
                mo4304c(109);
            }
            if (obtainStyledAttributes.getBoolean(113, false)) {
                mo4304c(10);
            }
            this.f3866q = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.f3851b.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f3850a);
            if (this.f3867r) {
                if (this.f3865p) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.w, null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(R.layout.v, null);
                }
                if (VERSION.SDK_INT >= 21) {
                    C0991u.m4188a((View) viewGroup, (C0983o) new C0983o() {
                        /* renamed from: a */
                        public final C0954ab mo1183a(View view, C0954ab abVar) {
                            int b = abVar.mo3719b();
                            int i = AppCompatDelegateImpl.this.mo4314i(b);
                            if (b != i) {
                                abVar = abVar.mo3718a(abVar.mo3717a(), i, abVar.mo3720c(), abVar.mo3721d());
                            }
                            return C0991u.m4176a(view, abVar);
                        }
                    });
                } else {
                    ((C1442z) viewGroup).setOnFitSystemWindowsListener(new C1443a() {
                        /* renamed from: a */
                        public final void mo4326a(Rect rect) {
                            rect.top = AppCompatDelegateImpl.this.mo4314i(rect.top);
                        }
                    });
                }
            } else if (this.f3866q) {
                viewGroup = (ViewGroup) from.inflate(R.layout.m, null);
                this.f3864o = false;
                this.f3863n = false;
            } else if (this.f3863n) {
                TypedValue typedValue = new TypedValue();
                this.f3850a.getTheme().resolveAttribute(R.attr.l, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C1156d(this.f3850a, typedValue.resourceId);
                } else {
                    context = this.f3850a;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.x, null);
                this.f3872z = (C1431u) viewGroup.findViewById(R.id.a6k);
                this.f3872z.setWindowCallback(mo4317l());
                if (this.f3864o) {
                    this.f3872z.mo5013a(109);
                }
                if (this.f3836G) {
                    this.f3872z.mo5013a(2);
                }
                if (this.f3837H) {
                    this.f3872z.mo5013a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f3872z == null) {
                    this.f3834E = (TextView) viewGroup.findViewById(R.id.title);
                }
                C1385bc.m6840b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.a5);
                ViewGroup viewGroup2 = (ViewGroup) this.f3851b.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f3851b.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C1230a() {
                    /* renamed from: a */
                    public final void mo4327a() {
                        AppCompatDelegateImpl.this.mo4323p();
                    }
                });
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.f3863n);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.f3864o);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f3866q);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.f3865p);
            sb.append(", windowNoTitle: ");
            sb.append(this.f3867r);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: b */
    public final void mo4299b(Bundle bundle) {
        m4748s();
    }

    /* renamed from: a */
    public final <T extends View> T mo4286a(int i) {
        m4748s();
        return this.f3851b.findViewById(i);
    }

    /* renamed from: c */
    public final void mo4303c(Bundle bundle) {
        if (this.f3842M != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f3842M);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo4309f(int i) {
        if (i == 108) {
            ActionBar a = mo4282a();
            if (a != null) {
                a.mo4182f(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo4311g(int i) {
        mo4290a(mo4283a(0, true), true);
    }

    /* renamed from: a */
    private boolean m4731a(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo4330a(m4747r());
        panelFeatureState.f3887g = new C1098f(panelFeatureState.f3892l);
        panelFeatureState.f3883c = 81;
        return true;
    }

    /* renamed from: j */
    private void m4742j(int i) {
        this.f3870u = (1 << i) | this.f3870u;
        if (!this.f3869t) {
            C0991u.m4190a(this.f3851b.getDecorView(), this.f3845P);
            this.f3869t = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo4307e(int i) {
        if (i == 108) {
            ActionBar a = mo4282a();
            if (a != null) {
                a.mo4182f(false);
            }
            return;
        }
        if (i == 0) {
            PanelFeatureState a2 = mo4283a(i, true);
            if (a2.f3895o) {
                mo4290a(a2, false);
            }
        }
    }

    /* renamed from: c */
    private boolean m4739c(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.f3889i != null) {
            panelFeatureState.f3888h = panelFeatureState.f3889i;
            return true;
        } else if (panelFeatureState.f3890j == null) {
            return false;
        } else {
            if (this.f3831B == null) {
                this.f3831B = new C1099g();
            }
            panelFeatureState.f3888h = (View) panelFeatureState.mo4329a((C1189a) this.f3831B);
            if (panelFeatureState.f3888h != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: l */
    private int m4744l(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (VERSION.SDK_INT >= 23 && ((UiModeManager) this.f3850a.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m4755z();
        return this.f3844O.mo4354a();
    }

    /* renamed from: b */
    private boolean m4736b(PanelFeatureState panelFeatureState) {
        Context context = this.f3850a;
        if ((panelFeatureState.f3881a == 0 || panelFeatureState.f3881a == 108) && this.f3872z != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(R.attr.l, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(R.attr.m, typedValue, true);
            } else {
                theme.resolveAttribute(R.attr.m, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                Context dVar = new C1156d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.mo4702a((C1166a) this);
        panelFeatureState.mo4331a(menuBuilder);
        return true;
    }

    /* renamed from: m */
    private boolean m4745m(int i) {
        int i2;
        Resources resources = this.f3850a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i3 = configuration.uiMode & 48;
        if (i == 2) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        if (i3 == i2) {
            return false;
        }
        if (m4727A()) {
            ((Activity) this.f3850a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i2 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            if (VERSION.SDK_INT < 26) {
                ResourcesFlusher.flush(resources);
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo4304c(int i) {
        int k = m4743k(i);
        if (this.f3867r && k == 108) {
            return false;
        }
        if (this.f3863n && k == 1) {
            this.f3863n = false;
        }
        switch (k) {
            case 1:
                m4753x();
                this.f3867r = true;
                return true;
            case 2:
                m4753x();
                this.f3836G = true;
                return true;
            case 5:
                m4753x();
                this.f3837H = true;
                return true;
            case 10:
                m4753x();
                this.f3865p = true;
                return true;
            case 108:
                m4753x();
                this.f3863n = true;
                return true;
            case 109:
                m4753x();
                this.f3864o = true;
                return true;
            default:
                return this.f3851b.requestFeature(k);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo4313h(int i) {
        PanelFeatureState a = mo4283a(i, true);
        if (a.f3890j != null) {
            Bundle bundle = new Bundle();
            a.f3890j.mo4725c(bundle);
            if (bundle.size() > 0) {
                a.f3899s = bundle;
            }
            a.f3890j.mo4735f();
            a.f3890j.clear();
        }
        a.f3898r = true;
        a.f3897q = true;
        if ((i == 108 || i == 0) && this.f3872z != null) {
            PanelFeatureState a2 = mo4283a(0, false);
            if (a2 != null) {
                a2.f3893m = false;
                m4737b(a2, (KeyEvent) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final int mo4314i(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3 = 0;
        if (this.f3858i == null || !(this.f3858i.getLayoutParams() instanceof MarginLayoutParams)) {
            z = false;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f3858i.getLayoutParams();
            z = true;
            if (this.f3858i.isShown()) {
                if (this.f3847R == null) {
                    this.f3847R = new Rect();
                    this.f3848S = new Rect();
                }
                Rect rect = this.f3847R;
                Rect rect2 = this.f3848S;
                rect.set(0, i, 0, 0);
                C1385bc.m6838a(this.f3862m, rect, rect2);
                if (rect2.top == 0) {
                    i2 = i;
                } else {
                    i2 = 0;
                }
                if (marginLayoutParams.topMargin != i2) {
                    marginLayoutParams.topMargin = i;
                    if (this.f3835F == null) {
                        this.f3835F = new View(this.f3850a);
                        this.f3835F.setBackgroundColor(this.f3850a.getResources().getColor(R.color.c6));
                        this.f3862m.addView(this.f3835F, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = this.f3835F.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f3835F.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f3835F == null) {
                    z = false;
                }
                if (!this.f3865p && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f3858i.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f3835F != null) {
            View view = this.f3835F;
            if (!z) {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.p029v7.view.C1153b m4734b(android.support.p029v7.view.C1153b.C1154a r8) {
        /*
            r7 = this;
            r7.mo4320o()
            android.support.v7.view.b r0 = r7.f3857h
            if (r0 == 0) goto L_0x000c
            android.support.v7.view.b r0 = r7.f3857h
            r0.mo4402c()
        L_0x000c:
            android.support.v7.app.b r0 = r7.f3854e
            r1 = 0
            if (r0 == 0) goto L_0x001c
            boolean r0 = r7.f3868s
            if (r0 != 0) goto L_0x001c
            android.support.v7.app.b r0 = r7.f3854e     // Catch:{ AbstractMethodError -> 0x001c }
            android.support.v7.view.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0023
            r7.f3857h = r0
            goto L_0x0164
        L_0x0023:
            android.support.v7.widget.ActionBarContextView r0 = r7.f3858i
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f3866q
            if (r0 == 0) goto L_0x00b4
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f3850a
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r5 = 2130968587(0x7f04000b, float:1.7545832E38)
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0063
            android.content.Context r5 = r7.f3850a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            android.support.v7.view.d r4 = new android.support.v7.view.d
            android.content.Context r6 = r7.f3850a
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x0065
        L_0x0063:
            android.content.Context r4 = r7.f3850a
        L_0x0065:
            android.support.v7.widget.ActionBarContextView r5 = new android.support.v7.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f3858i = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            r6 = 2130968601(0x7f040019, float:1.754586E38)
            r5.<init>(r4, r1, r6)
            r7.f3859j = r5
            android.widget.PopupWindow r5 = r7.f3859j
            r6 = 2
            android.support.p022v4.widget.C1054l.m4551a(r5, r6)
            android.widget.PopupWindow r5 = r7.f3859j
            android.support.v7.widget.ActionBarContextView r6 = r7.f3858i
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f3859j
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            r6 = 2130968581(0x7f040005, float:1.754582E38)
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            android.support.v7.widget.ActionBarContextView r4 = r7.f3858i
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f3859j
            r4 = -2
            r0.setHeight(r4)
            android.support.v7.app.AppCompatDelegateImpl$6 r0 = new android.support.v7.app.AppCompatDelegateImpl$6
            r0.<init>()
            r7.f3860k = r0
            goto L_0x00d4
        L_0x00b4:
            android.view.ViewGroup r0 = r7.f3862m
            r4 = 2131296304(0x7f090030, float:1.821052E38)
            android.view.View r0 = r0.findViewById(r4)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.p029v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.m4747r()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo6224a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.p029v7.widget.ActionBarContextView) r0
            r7.f3858i = r0
        L_0x00d4:
            android.support.v7.widget.ActionBarContextView r0 = r7.f3858i
            if (r0 == 0) goto L_0x0164
            r7.mo4320o()
            android.support.v7.widget.ActionBarContextView r0 = r7.f3858i
            r0.mo4997c()
            android.support.v7.view.StandaloneActionMode r0 = new android.support.v7.view.StandaloneActionMode
            android.support.v7.widget.ActionBarContextView r4 = r7.f3858i
            android.content.Context r4 = r4.getContext()
            android.support.v7.widget.ActionBarContextView r5 = r7.f3858i
            android.widget.PopupWindow r6 = r7.f3859j
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo4399b()
            boolean r8 = r8.mo4341a(r0, r3)
            if (r8 == 0) goto L_0x0162
            r0.mo4403d()
            android.support.v7.widget.ActionBarContextView r8 = r7.f3858i
            r8.mo4995a(r0)
            r7.f3857h = r0
            boolean r8 = r7.mo4318m()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012c
            android.support.v7.widget.ActionBarContextView r8 = r7.f3858i
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.f3858i
            android.support.v4.view.y r8 = android.support.p022v4.view.C0991u.m4238q(r8)
            android.support.v4.view.y r8 = r8.mo3797a(r0)
            r7.f3861l = r8
            android.support.v4.view.y r8 = r7.f3861l
            android.support.v7.app.AppCompatDelegateImpl$7 r0 = new android.support.v7.app.AppCompatDelegateImpl$7
            r0.<init>()
            r8.mo3800a(r0)
            goto L_0x0152
        L_0x012c:
            android.support.v7.widget.ActionBarContextView r8 = r7.f3858i
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f3858i
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.f3858i
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f3858i
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0152
            android.support.v7.widget.ActionBarContextView r8 = r7.f3858i
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            android.support.p022v4.view.C0991u.m4243v(r8)
        L_0x0152:
            android.widget.PopupWindow r8 = r7.f3859j
            if (r8 == 0) goto L_0x0164
            android.view.Window r8 = r7.f3851b
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f3860k
            r8.post(r0)
            goto L_0x0164
        L_0x0162:
            r7.f3857h = r1
        L_0x0164:
            android.support.v7.view.b r8 = r7.f3857h
            if (r8 == 0) goto L_0x0173
            android.support.v7.app.b r8 = r7.f3854e
            if (r8 == 0) goto L_0x0173
            android.support.v7.app.b r8 = r7.f3854e
            android.support.v7.view.b r0 = r7.f3857h
            r8.onSupportActionModeStarted(r0)
        L_0x0173:
            android.support.v7.view.b r8 = r7.f3857h
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.app.AppCompatDelegateImpl.m4734b(android.support.v7.view.b$a):android.support.v7.view.b");
    }

    /* renamed from: a */
    private boolean m4733a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f3851b.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0991u.m4170G((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: b */
    public final void mo4298b(int i) {
        m4748s();
        ViewGroup viewGroup = (ViewGroup) this.f3862m.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f3850a).inflate(i, viewGroup);
        this.f3852c.onContentChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo4300b(MenuBuilder menuBuilder) {
        if (!this.f3838I) {
            this.f3838I = true;
            this.f3872z.mo5029h();
            Callback l = mo4317l();
            if (l != null && !this.f3868s) {
                l.onPanelClosed(108, menuBuilder);
            }
            this.f3838I = false;
        }
    }

    /* renamed from: c */
    private boolean m4738c(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
                z = false;
            }
            this.f3841L = z;
        } else if (i == 82) {
            m4740d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m4740d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState a = mo4283a(0, true);
            if (!a.f3895o) {
                return m4737b(a, keyEvent);
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m4735b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f3841L;
            this.f3841L = false;
            PanelFeatureState a = mo4283a(0, false);
            if (a != null && a.f3895o) {
                if (!z) {
                    mo4290a(a, true);
                }
                return true;
            } else if (m4752w()) {
                return true;
            }
        } else if (i == 82) {
            m4741e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4741e(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            android.support.v7.view.b r4 = r3.f3857h
            r0 = 0
            if (r4 == 0) goto L_0x0006
            return r0
        L_0x0006:
            r4 = 1
            android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState r1 = r3.mo4283a(r0, r4)
            android.support.v7.widget.u r2 = r3.f3872z
            if (r2 == 0) goto L_0x0043
            android.support.v7.widget.u r2 = r3.f3872z
            boolean r2 = r2.mo5015b()
            if (r2 == 0) goto L_0x0043
            android.content.Context r2 = r3.f3850a
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            boolean r2 = r2.hasPermanentMenuKey()
            if (r2 != 0) goto L_0x0043
            android.support.v7.widget.u r4 = r3.f3872z
            boolean r4 = r4.mo5016c()
            if (r4 != 0) goto L_0x003c
            boolean r4 = r3.f3868s
            if (r4 != 0) goto L_0x0062
            boolean r4 = r3.m4737b(r1, r5)
            if (r4 == 0) goto L_0x0062
            android.support.v7.widget.u r4 = r3.f3872z
            boolean r4 = r4.mo5020e()
            goto L_0x006a
        L_0x003c:
            android.support.v7.widget.u r4 = r3.f3872z
            boolean r4 = r4.mo5021f()
            goto L_0x006a
        L_0x0043:
            boolean r2 = r1.f3895o
            if (r2 != 0) goto L_0x0064
            boolean r2 = r1.f3894n
            if (r2 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r2 = r1.f3893m
            if (r2 == 0) goto L_0x0062
            boolean r2 = r1.f3898r
            if (r2 == 0) goto L_0x005b
            r1.f3893m = r0
            boolean r2 = r3.m4737b(r1, r5)
            goto L_0x005c
        L_0x005b:
            r2 = 1
        L_0x005c:
            if (r2 == 0) goto L_0x0062
            r3.m4729a(r1, r5)
            goto L_0x006a
        L_0x0062:
            r4 = 0
            goto L_0x006a
        L_0x0064:
            boolean r5 = r1.f3895o
            r3.mo4290a(r1, r4)
            r4 = r5
        L_0x006a:
            if (r4 == 0) goto L_0x007b
            android.content.Context r5 = r3.f3850a
            java.lang.String r1 = "audio"
            java.lang.Object r5 = r5.getSystemService(r1)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007b
            r5.playSoundEffect(r0)
        L_0x007b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.app.AppCompatDelegateImpl.m4741e(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    private void m4729a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        boolean z;
        if (!panelFeatureState.f3895o && !this.f3868s) {
            if (panelFeatureState.f3881a == 0) {
                if ((this.f3850a.getResources().getConfiguration().screenLayout & 15) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            Callback l = mo4317l();
            if (l == null || l.onMenuOpened(panelFeatureState.f3881a, panelFeatureState.f3890j)) {
                WindowManager windowManager = (WindowManager) this.f3850a.getSystemService("window");
                if (windowManager != null && m4737b(panelFeatureState, keyEvent)) {
                    if (panelFeatureState.f3887g == null || panelFeatureState.f3897q) {
                        if (panelFeatureState.f3887g == null) {
                            m4731a(panelFeatureState);
                            if (panelFeatureState.f3887g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f3897q && panelFeatureState.f3887g.getChildCount() > 0) {
                            panelFeatureState.f3887g.removeAllViews();
                        }
                        if (m4739c(panelFeatureState) && panelFeatureState.mo4332a()) {
                            LayoutParams layoutParams = panelFeatureState.f3888h.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new LayoutParams(-2, -2);
                            }
                            panelFeatureState.f3887g.setBackgroundResource(panelFeatureState.f3882b);
                            ViewParent parent = panelFeatureState.f3888h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(panelFeatureState.f3888h);
                            }
                            panelFeatureState.f3887g.addView(panelFeatureState.f3888h, layoutParams);
                            if (!panelFeatureState.f3888h.hasFocus()) {
                                panelFeatureState.f3888h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else if (panelFeatureState.f3889i != null) {
                        LayoutParams layoutParams2 = panelFeatureState.f3889i.getLayoutParams();
                        if (layoutParams2 != null && layoutParams2.width == -1) {
                            i = -1;
                            panelFeatureState.f3894n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f3884d, panelFeatureState.f3885e, 1002, 8519680, -3);
                            layoutParams3.gravity = panelFeatureState.f3883c;
                            layoutParams3.windowAnimations = panelFeatureState.f3886f;
                            windowManager.addView(panelFeatureState.f3887g, layoutParams3);
                            panelFeatureState.f3895o = true;
                            return;
                        }
                    }
                    i = -2;
                    panelFeatureState.f3894n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f3884d, panelFeatureState.f3885e, 1002, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.f3883c;
                    layoutParams32.windowAnimations = panelFeatureState.f3886f;
                    windowManager.addView(panelFeatureState.f3887g, layoutParams32);
                    panelFeatureState.f3895o = true;
                    return;
                }
                return;
            }
            mo4290a(panelFeatureState, true);
        }
    }

    /* renamed from: b */
    private boolean m4737b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        int i;
        boolean z2;
        if (this.f3868s) {
            return false;
        }
        if (panelFeatureState.f3893m) {
            return true;
        }
        if (!(this.f3840K == null || this.f3840K == panelFeatureState)) {
            mo4290a(this.f3840K, false);
        }
        Callback l = mo4317l();
        if (l != null) {
            panelFeatureState.f3889i = l.onCreatePanelView(panelFeatureState.f3881a);
        }
        if (panelFeatureState.f3881a == 0 || panelFeatureState.f3881a == 108) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f3872z != null) {
            this.f3872z.mo5023g();
        }
        if (panelFeatureState.f3889i == null && (!z || !(this.f3855f instanceof C1110f))) {
            if (panelFeatureState.f3890j == null || panelFeatureState.f3898r) {
                if (panelFeatureState.f3890j == null) {
                    m4736b(panelFeatureState);
                    if (panelFeatureState.f3890j == null) {
                        return false;
                    }
                }
                if (z && this.f3872z != null) {
                    if (this.f3830A == null) {
                        this.f3830A = new C1092b();
                    }
                    this.f3872z.mo5014a(panelFeatureState.f3890j, this.f3830A);
                }
                panelFeatureState.f3890j.mo4735f();
                if (!l.onCreatePanelMenu(panelFeatureState.f3881a, panelFeatureState.f3890j)) {
                    panelFeatureState.mo4331a((MenuBuilder) null);
                    if (z && this.f3872z != null) {
                        this.f3872z.mo5014a(null, this.f3830A);
                    }
                    return false;
                }
                panelFeatureState.f3898r = false;
            }
            panelFeatureState.f3890j.mo4735f();
            if (panelFeatureState.f3899s != null) {
                panelFeatureState.f3890j.mo4731d(panelFeatureState.f3899s);
                panelFeatureState.f3899s = null;
            }
            if (!l.onPreparePanel(0, panelFeatureState.f3889i, panelFeatureState.f3890j)) {
                if (z && this.f3872z != null) {
                    this.f3872z.mo5014a(null, this.f3830A);
                }
                panelFeatureState.f3890j.mo4737g();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            panelFeatureState.f3896p = z2;
            panelFeatureState.f3890j.setQwertyMode(panelFeatureState.f3896p);
            panelFeatureState.f3890j.mo4737g();
        }
        panelFeatureState.f3893m = true;
        panelFeatureState.f3894n = false;
        this.f3840K = panelFeatureState;
        return true;
    }

    /* renamed from: a */
    private void m4730a(MenuBuilder menuBuilder, boolean z) {
        if (this.f3872z == null || !this.f3872z.mo5015b() || (ViewConfiguration.get(this.f3850a).hasPermanentMenuKey() && !this.f3872z.mo5018d())) {
            PanelFeatureState a = mo4283a(0, true);
            a.f3897q = true;
            mo4290a(a, false);
            m4729a(a, (KeyEvent) null);
            return;
        }
        Callback l = mo4317l();
        if (this.f3872z.mo5016c()) {
            this.f3872z.mo5021f();
            if (!this.f3868s) {
                l.onPanelClosed(108, mo4283a(0, true).f3890j);
            }
        } else if (l != null && !this.f3868s) {
            if (this.f3869t && (this.f3870u & 1) != 0) {
                this.f3851b.getDecorView().removeCallbacks(this.f3845P);
                this.f3845P.run();
            }
            PanelFeatureState a2 = mo4283a(0, true);
            if (a2.f3890j != null && !a2.f3898r && l.onPreparePanel(0, a2.f3889i, a2.f3890j)) {
                l.onMenuOpened(108, a2.f3890j);
                this.f3872z.mo5020e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final PanelFeatureState mo4283a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f3839J;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f3839J = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    AppCompatDelegateImpl(Context context, Window window, C1106b bVar) {
        this.f3850a = context;
        this.f3851b = window;
        this.f3854e = bVar;
        this.f3852c = this.f3851b.getCallback();
        if (!(this.f3852c instanceof C1095d)) {
            this.f3853d = new C1095d(this.f3852c);
            this.f3851b.setCallback(this.f3853d);
            C1365av a = C1365av.m6743a(context, (AttributeSet) null, f3828w);
            Drawable b = a.mo6396b(0);
            if (b != null) {
                this.f3851b.setBackgroundDrawable(b);
            }
            a.mo6393a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m4728a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    private boolean m4732a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f3893m || m4737b(panelFeatureState, keyEvent)) && panelFeatureState.f3890j != null) {
            z = panelFeatureState.f3890j.performShortcut(i, keyEvent, 1);
        }
        return z;
    }

    /* renamed from: a */
    private View m4728a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f3849T == null) {
            String string = this.f3850a.obtainStyledAttributes(R$styleable.AppCompatTheme).getString(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f3849T = new AppCompatViewInflater();
            } else {
                try {
                    this.f3849T = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.f3849T = new AppCompatViewInflater();
                }
            }
        }
        if (f3827v) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m4733a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f3849T.createView(view, str, context, attributeSet, z, f3827v, true, C1371az.m6778a());
    }
}
