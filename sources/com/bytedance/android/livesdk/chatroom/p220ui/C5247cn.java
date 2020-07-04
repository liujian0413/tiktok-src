package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileManageViewPager.ProfileManageViewAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cn */
public final class C5247cn extends Dialog {

    /* renamed from: e */
    public static final C5248a f15353e = new C5248a(null);

    /* renamed from: a */
    public boolean f15354a;

    /* renamed from: b */
    public boolean f15355b;

    /* renamed from: c */
    public final int f15356c;

    /* renamed from: d */
    public final C5249b f15357d;

    /* renamed from: f */
    private View f15358f;

    /* renamed from: g */
    private final OnLayoutChangeListener f15359g;

    /* renamed from: h */
    private final Room f15360h;

    /* renamed from: i */
    private final User f15361i;

    /* renamed from: j */
    private final boolean f15362j;

    /* renamed from: k */
    private final boolean f15363k;

    /* renamed from: l */
    private final boolean f15364l;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cn$a */
    public static final class C5248a {
        private C5248a() {
        }

        public /* synthetic */ C5248a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cn$b */
    public interface C5249b {
        /* renamed from: a */
        void mo13514a();

        /* renamed from: a */
        void mo13515a(int i);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cn$c */
    public static final class C5250c implements OnLayoutChangeListener {

        /* renamed from: a */
        public final float f15365a = 0.75f;

        /* renamed from: b */
        final /* synthetic */ C5247cn f15366b;

        /* renamed from: c */
        private float f15367c = -1.0f;

        C5250c(C5247cn cnVar) {
            this.f15366b = cnVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C7573i.m23587b(view, "v");
            if (this.f15366b.f15354a) {
                if (this.f15367c < 0.0f) {
                    this.f15367c = ((float) this.f15366b.f15356c) * this.f15365a;
                }
                if (((float) i4) < this.f15367c) {
                    if (!this.f15366b.f15355b) {
                        this.f15366b.f15355b = true;
                        ProfileManageViewAdapter mAdapter = ((LiveProfileManageViewPager) this.f15366b.findViewById(R.id.d47)).getMAdapter();
                        if (mAdapter != null) {
                            mAdapter.mo13344a(this.f15366b.f15355b);
                        }
                        ((LiveProfileManageViewPager) this.f15366b.findViewById(R.id.d47)).mo13338b();
                    }
                } else if (this.f15366b.f15355b) {
                    this.f15366b.f15355b = false;
                    ProfileManageViewAdapter mAdapter2 = ((LiveProfileManageViewPager) this.f15366b.findViewById(R.id.d47)).getMAdapter();
                    if (mAdapter2 != null) {
                        mAdapter2.mo13344a(this.f15366b.f15355b);
                    }
                    ((LiveProfileManageViewPager) this.f15366b.findViewById(R.id.d47)).mo13338b();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cn$d */
    public static final class C5251d implements C5249b {

        /* renamed from: a */
        final /* synthetic */ C5247cn f15368a;

        /* renamed from: a */
        public final void mo13514a() {
            this.f15368a.dismiss();
        }

        C5251d(C5247cn cnVar) {
            this.f15368a = cnVar;
        }

        /* renamed from: a */
        public final void mo13515a(int i) {
            switch (i) {
                case 0:
                    ((LiveProfileManageViewPager) this.f15368a.findViewById(R.id.d47)).mo13337a(1);
                    return;
                case 1:
                    ((LiveProfileManageViewPager) this.f15368a.findViewById(R.id.d47)).mo13337a(2);
                    return;
                case 2:
                    ((LiveProfileManageViewPager) this.f15368a.findViewById(R.id.d47)).mo13337a(3);
                    return;
                case 3:
                    ((LiveProfileManageViewPager) this.f15368a.findViewById(R.id.d47)).mo13336a();
                    break;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cn$e */
    static final class C5252e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5247cn f15369a;

        C5252e(C5247cn cnVar) {
            this.f15369a = cnVar;
        }

        public final void onClick(View view) {
            this.f15369a.dismiss();
        }
    }

    public C5247cn(Context context, Room room, User user, boolean z, boolean z2) {
        this(context, room, user, z, z2, false, 32, null);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15354a = true;
    }

    public final void onDetachedFromWindow() {
        this.f15354a = false;
        super.onDetachedFromWindow();
    }

    public final void dismiss() {
        IBinder iBinder;
        if (this.f15355b) {
            Object systemService = getContext().getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View view = this.f15358f;
                if (view != null) {
                    iBinder = view.getWindowToken();
                } else {
                    iBinder = null;
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        }
        C5253co.m16898a(this);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        this.f15358f = getLayoutInflater().inflate(R.layout.aob, null);
        setContentView(this.f15358f);
        if (window != null) {
            window.setLayout(-1, -1);
            window.setSoftInputMode(18);
            window.getDecorView().addOnLayoutChangeListener(this.f15359g);
        }
        findViewById(R.id.d46).setOnClickListener(new C5252e(this));
        LiveProfileManageViewPager liveProfileManageViewPager = (LiveProfileManageViewPager) findViewById(R.id.d47);
        C7573i.m23582a((Object) liveProfileManageViewPager, "setting_view_pager");
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        LayoutInflater layoutInflater = getLayoutInflater();
        C7573i.m23582a((Object) layoutInflater, "layoutInflater");
        ProfileManageViewAdapter profileManageViewAdapter = new ProfileManageViewAdapter(context, layoutInflater, this.f15357d, this.f15360h, this.f15361i, this.f15362j, this.f15364l);
        liveProfileManageViewPager.setAdapter(profileManageViewAdapter);
    }

    private C5247cn(Context context, Room room, User user, boolean z, boolean z2, boolean z3) {
        int i;
        C7573i.m23587b(context, "context");
        if (z2) {
            i = R.style.y0;
        } else {
            i = R.style.y1;
        }
        super(context, i);
        this.f15360h = room;
        this.f15361i = user;
        this.f15362j = z;
        this.f15363k = z2;
        this.f15364l = z3;
        Resources resources = context.getResources();
        C7573i.m23582a((Object) resources, "context.resources");
        this.f15356c = resources.getDisplayMetrics().heightPixels;
        this.f15357d = new C5251d(this);
        this.f15359g = new C5250c(this);
    }

    private /* synthetic */ C5247cn(Context context, Room room, User user, boolean z, boolean z2, boolean z3, int i, C7571f fVar) {
        this(context, room, user, z, z2, true);
    }
}
