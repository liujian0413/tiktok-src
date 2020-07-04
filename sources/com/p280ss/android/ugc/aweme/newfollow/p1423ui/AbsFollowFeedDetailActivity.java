package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0069x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0688e;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p280ss.android.ugc.aweme.common.widget.DragView;
import com.p280ss.android.ugc.aweme.common.widget.DragView.C25730a;
import com.p280ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28471v;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.flowfeed.p1251e.C29359f;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29371f;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29373g;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.C29400c;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21751b;
import com.p280ss.android.ugc.aweme.forward.p1270d.C29893a;
import com.p280ss.android.ugc.aweme.forward.view.FeedDetailActivity;
import com.p280ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.PoiDetailWithoutMapFragment;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43076dy;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity */
public abstract class AbsFollowFeedDetailActivity<T extends View> extends AmeSSActivity implements C6310a, C29400c {

    /* renamed from: a */
    protected T f88994a;

    /* renamed from: b */
    protected Aweme f88995b;

    /* renamed from: c */
    public String f88996c;

    /* renamed from: d */
    protected String f88997d;

    /* renamed from: e */
    protected boolean f88998e;

    /* renamed from: f */
    protected C6309f f88999f;

    /* renamed from: g */
    public String f89000g = "list";

    /* renamed from: h */
    public boolean f89001h;

    /* renamed from: i */
    protected DataCenter f89002i;

    /* renamed from: j */
    protected WidgetManager f89003j;

    /* renamed from: k */
    protected boolean f89004k;

    /* renamed from: l */
    private C29359f f89005l;

    /* renamed from: m */
    private boolean f89006m;
    protected DiggLayout mDiggLayout;
    protected DragView mDragView;
    protected ViewGroup mRootView;

    /* renamed from: n */
    private MotionEvent f89007n;

    /* renamed from: o */
    private MotionEvent f89008o;

    /* renamed from: p */
    private boolean f89009p;

    /* renamed from: q */
    private BroadcastReceiver f89010q;

    /* renamed from: a */
    public final void mo75138a(Aweme aweme) {
    }

    /* renamed from: a */
    public final void mo75143a(C29359f fVar) {
    }

    /* renamed from: a */
    public final void mo75144a(Exception exc, Aweme aweme) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo86844f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo86845g() {
    }

    public Context getContext() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo86846h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract T mo86848j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo86849k();

    public void onBackPressed() {
        mo86851m();
    }

    public boolean isActive() {
        if (!super.isActive() || !this.f89009p) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo86850l() {
        if (!this.f89009p) {
            mo86782b();
            mo86784d();
            this.f89009p = true;
        }
    }

    /* renamed from: m */
    public final void mo86851m() {
        if (this.mDragView != null) {
            this.mDragView.mo66639a();
        }
    }

    /* renamed from: d */
    private void mo86784d() {
        if (this.f88995b != null) {
            C29370e c = C29371f.m96475a().mo75106c(this.f88997d);
            if (c != null) {
                c.mo75092a(this.f88996c);
            }
        }
    }

    /* renamed from: e */
    private void mo86785e() {
        if (this.f88995b != null) {
            C29370e c = C29371f.m96475a().mo75106c(this.f88997d);
            if (c != null) {
                c.mo75098b(this.f88996c);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo86847i() {
        if (this.f88995b != null) {
            C29370e c = C29371f.m96475a().mo75106c(this.f88997d);
            if (c != null) {
                c.f77398c.mo104683b(16777216);
            }
        }
        finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Aweme mo86852n() {
        if (this.f88995b == null || this.f88995b.getAwemeType() != 13) {
            return this.f88995b;
        }
        return this.f88995b.getForwardItem();
    }

    public void onPause() {
        super.onPause();
        if (!isFinishing()) {
            mo86783c();
            mo86785e();
        }
        this.f89009p = false;
    }

    public void onResume() {
        super.onResume();
        if (!C43076dy.m136656a()) {
            mo86782b();
            mo86784d();
            this.f89009p = true;
        }
    }

    /* renamed from: b */
    private void mo86782b() {
        if (C22704b.f60415d.equals(C29893a.m97882a())) {
            C34138b.m109993b();
        } else if ("personal_homepage".equals(this.f88996c) || "others_homepage".equals(this.f88996c)) {
            C34138b.m109984a(this.f88996c);
        } else {
            C34138b.m109963a();
        }
    }

    /* renamed from: c */
    private void mo86783c() {
        if (C22704b.f60415d.equals(C29893a.m97882a())) {
            C34138b.m110006c(this.f88996c, C22704b.f60415d);
        } else if ("personal_homepage".equals(this.f88996c) || "others_homepage".equals(this.f88996c)) {
            C34138b.m110000b(this.f88996c, "list");
        } else {
            C34138b.m109987a(this.f88996c, "list");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C28479b.m93597b(this.f88995b);
        C0688e.m2941a(getContext()).mo2837a(this.f89010q);
        if (this.f89005l != null) {
            this.f89005l.mo59134U_();
            this.f89005l.mo66535W_();
        }
    }

    /* renamed from: o */
    private void m110071o() {
        Aweme n = mo86852n();
        if (!(n == null || n.getStatus() == null || n.getStatus().getPrivateStatus() == 1)) {
            this.mDiggLayout.mo66634a(this.f89007n.getX(), this.f89007n.getY());
        }
        if (this.f88995b.getAwemeType() != 13) {
            C42961az.m136380a(new C21751b(0, this.f88995b));
        } else if (!(this.f89005l == null || n == null || m110067b(n))) {
            C29370e c = C29371f.m96475a().mo75106c(this.f88997d);
            long currentTimeMillis = System.currentTimeMillis();
            if (c != null) {
                currentTimeMillis = c.f77401f;
            }
            this.f89005l.mo58070a(n, 1, "click_double_like", System.currentTimeMillis() - currentTimeMillis);
        }
    }

    /* renamed from: a */
    private void mo86776a() {
        this.f88996c = getIntent().getStringExtra("enter_from");
        this.f88997d = getIntent().getStringExtra("share_id");
        this.f89000g = getIntent().getStringExtra("page_type");
        this.f89001h = getIntent().getBooleanExtra("launch_from_origin_detail", false);
        this.f88998e = getIntent().getBooleanExtra("use_follow_flow_strategy", false);
        this.f88995b = C28479b.m93592a();
        this.f88994a = mo86848j();
        this.mDragView.mo66641a((View) this.f88994a, (IViewInfo) getIntent().getParcelableExtra("view_info"));
        this.mDragView.setDragStateListener(new C25730a() {
            /* renamed from: e */
            public final void mo66669e() {
                AbsFollowFeedDetailActivity.this.mo86847i();
            }

            /* renamed from: c */
            public final void mo66667c() {
                AbsFollowFeedDetailActivity.this.f89004k = false;
                AbsFollowFeedDetailActivity.this.mo86846h();
            }

            /* renamed from: d */
            public final void mo66668d() {
                AbsFollowFeedDetailActivity.this.f89004k = true;
                AbsFollowFeedDetailActivity.this.mo86846h();
            }

            /* renamed from: a */
            public final void mo66665a() {
                AbsFollowFeedDetailActivity.this.f89004k = true;
                AbsFollowFeedDetailActivity.this.mo86846h();
                if ("poi_page".equalsIgnoreCase(AbsFollowFeedDetailActivity.this.f88996c)) {
                    PoiDetailWithoutMapFragment.m113965N();
                }
            }

            /* renamed from: b */
            public final void mo66666b() {
                AbsFollowFeedDetailActivity.this.f89004k = true;
                AbsFollowFeedDetailActivity.this.mo86846h();
                if ("poi_page".equalsIgnoreCase(AbsFollowFeedDetailActivity.this.f88996c)) {
                    PoiDetailWithoutMapFragment.m113966O();
                }
            }
        });
        this.f88999f = new C6309f(this);
        if (this.f88995b == null) {
            finish();
            return;
        }
        C34138b.m110003c(this.f88995b, this.f88996c);
        this.f89002i = DataCenter.m75849a(C0069x.m159a((FragmentActivity) this), (C0043i) this);
        this.f89003j = WidgetManager.m75869a((FragmentActivity) this, (View) this.mRootView);
        this.f89003j.mo60153a(this.f89002i);
        mo86845g();
    }

    public void handleMsg(Message message) {
        if (message.what == 0) {
            mo86849k();
        }
    }

    /* renamed from: b */
    private static boolean m110067b(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(aweme.getAid());
        int userDigg = aweme.getUserDigg();
        if (awemeById != null) {
            userDigg = awemeById.getUserDigg();
        }
        if (userDigg == 1) {
            return true;
        }
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mActivityAnimType = 1;
        super.onCreate(bundle);
        setContentView(mo86844f());
        mo86776a();
        getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        this.f89010q = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && AbsFollowFeedDetailActivity.this.mStatusActive) {
                    AbsFollowFeedDetailActivity.this.mo86850l();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0688e.m2941a(getContext()).mo2838a(this.f89010q, intentFilter);
        this.f89005l = new C29359f(this.f88996c, 0);
        this.f89005l.mo75086f();
        this.f89005l.mo66536a(new C28471v());
        this.f89005l.mo66537a((C29400c) this);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f88999f.hasMessages(0)) {
                    this.f88999f.removeMessages(0);
                }
                if (C29373g.m96484a(this.f89007n, this.f89008o, motionEvent, (Context) this)) {
                    this.f89006m = true;
                    m110071o();
                } else {
                    this.f89006m = false;
                }
                if (this.f89007n != null) {
                    this.f89007n.recycle();
                }
                this.f89007n = MotionEvent.obtain(motionEvent);
                if (this.f89006m || super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 1:
                if (!this.f89006m && this.f89007n != null && !C29373g.m96483a(0, this.f89007n, motionEvent, (Context) this)) {
                    this.f88999f.sendMessageDelayed(this.f88999f.obtainMessage(0), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + this.f89007n.getEventTime());
                }
                if (this.f89008o != null) {
                    this.f89008o.recycle();
                }
                this.f89008o = MotionEvent.obtain(motionEvent);
                if (this.f89006m || super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 2:
                if (C29373g.m96483a(0, this.f89007n, motionEvent, (Context) this)) {
                    this.f88999f.removeMessages(0);
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public static void m110065a(Context context, IViewInfo iViewInfo, Aweme aweme, String str, String str2) {
        String str3;
        if (aweme != null) {
            Intent intent = new Intent(context, ImageFollowFeedDetailActivity.class);
            intent.putExtra("view_info", iViewInfo);
            C28479b.m93593a(aweme);
            intent.putExtra("enter_from", str);
            intent.putExtra("share_id", str2);
            intent.putExtra("launch_from_origin_detail", C6405d.m19984g() instanceof OriginDetailActivity);
            String str4 = "page_type";
            if (C6405d.m19984g() instanceof FeedDetailActivity) {
                str3 = C22704b.f60415d;
            } else {
                str3 = "list";
            }
            intent.putExtra(str4, str3);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m110062a(Context context, IViewInfo iViewInfo, Aweme aweme, int i, String str, String str2) {
        m110063a(context, iViewInfo, aweme, 2, str, str2, false);
    }

    /* renamed from: a */
    private static void m110063a(Context context, IViewInfo iViewInfo, Aweme aweme, int i, String str, String str2, boolean z) {
        m110064a(context, iViewInfo, aweme, i, str, str2, false, false);
    }

    /* renamed from: a */
    public static void m110064a(Context context, IViewInfo iViewInfo, Aweme aweme, int i, String str, String str2, boolean z, boolean z2) {
        String str3;
        if (aweme != null) {
            boolean z3 = false;
            if (C6405d.m19984g() instanceof OriginDetailActivity) {
                z3 = true;
            }
            Intent intent = new Intent(context, VideoFollowFeedDetailActivity.class);
            intent.putExtra("view_info", iViewInfo);
            C28479b.m93593a(aweme);
            intent.putExtra("play_action_type", i);
            intent.putExtra("enter_from", str);
            intent.putExtra("share_id", str2);
            intent.putExtra("launch_from_origin_detail", z3);
            intent.putExtra("use_follow_flow_strategy", z2);
            String str4 = "page_type";
            if (C6405d.m19984g() instanceof FeedDetailActivity) {
                str3 = C22704b.f60415d;
            } else {
                str3 = "list";
            }
            intent.putExtra(str4, str3);
            intent.putExtra("pause_on_close", z);
            context.startActivity(intent);
        }
    }
}
