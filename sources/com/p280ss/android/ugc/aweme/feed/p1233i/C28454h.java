package com.p280ss.android.ugc.aweme.feed.p1233i;

import android.os.SystemClock;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.net.cronet.C10933d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.feed.C28696u;
import com.p280ss.android.ugc.aweme.feed.event.C28309ae;
import com.p280ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.interest.C32190g;
import com.p280ss.android.ugc.aweme.interest.C32195h;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34939a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43048db;
import com.p280ss.android.ugc.aweme.utils.OneTimeEnum;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.i.h */
public final class C28454h extends C25674b<C28447b> {

    /* renamed from: a */
    public C28467s f75038a;

    /* renamed from: d */
    public boolean f75039d;

    /* renamed from: e */
    public int f75040e;

    /* renamed from: f */
    private boolean f75041f;

    /* renamed from: g */
    private boolean f75042g;

    /* renamed from: h */
    private String f75043h = "";

    /* renamed from: i */
    private Fragment f75044i;

    /* renamed from: j */
    private String f75045j;

    /* renamed from: k */
    private C28696u f75046k;

    /* renamed from: l */
    private int f75047l;

    /* renamed from: m */
    private long f75048m;

    /* renamed from: b */
    private static String m93533b(int i) {
        if (i == 4) {
            return "load_more";
        }
        switch (i) {
            case 1:
                return "refresh";
            case 2:
                return "load_latest";
            default:
                return "";
        }
    }

    /* renamed from: c */
    private static String m93534c(int i) {
        switch (i) {
            case 0:
                return "homepage_hot";
            case 1:
                return "homepage_follow";
            case 2:
                return "homepage_fresh";
            default:
                return "";
        }
    }

    /* renamed from: k */
    static final /* synthetic */ Object m93535k() throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", C34943c.f91127w);
        } catch (JSONException unused) {
        }
        C6379c.m19826a("feed_error", jSONObject);
        return null;
    }

    /* renamed from: l */
    private void m93536l() {
        if (this.f75041f) {
            this.f75041f = false;
            ((C28447b) this.f67571b).f74998a = false;
        }
        C42961az.m136380a(new C28309ae());
    }

    /* renamed from: e */
    public final boolean mo72191e() {
        if (this.f67571b == null || ((C28447b) this.f67571b).f75003f) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo72192f() {
        if (this.f67571b == null || !((C28447b) this.f67571b).mo72182a()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo72193g() {
        if (this.f67571b == null || !((C28447b) this.f67571b).isDataEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo72194j() {
        if (this.f67571b == null || !((C28447b) this.f67571b).isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private FeedAppLogParams m93537m() {
        return new FeedAppLogParams((FeedItemList) ((C28447b) mo66539h()).getData(), ((C28447b) mo66539h()).f74999b, ((C28447b) mo66539h()).getItems());
    }

    /* renamed from: b */
    public final void mo56977b() {
        boolean z;
        C6921a.m21552a(4, "FeedFetchModel", "FeedFetchPresenter called onSuccess!");
        C6857a.m21312e().mo16827b("feed_ui_post_msg_to_feed_ui", false);
        C6857a.m21312e().mo16827b("cold_boot_start_to_feed_ui", false);
        if (C6857a.m21312e().mo16823a("feed_parse_to_ui") && !C6857a.m21312e().mo16828b("feed_parse_to_ui")) {
            C6857a.m21312e().mo16827b("feed_parse_to_ui", true);
        }
        if (!C6857a.m21312e().mo16823a("feed_ui_duration")) {
            C6857a.m21312e().mo16822a("feed_ui_duration", true);
        }
        C28434i.m93457a((FeedItemList) ((C28447b) mo66539h()).getData());
        this.f75046k.mo73765b(1, this.f75043h, m93537m());
        this.f75046k.mo73761a(1, this.f75043h, m93537m());
        if (((C28447b) mo66539h()).getData() != null && ((FeedItemList) ((C28447b) mo66539h()).getData()).isFromLocalCache) {
            ((FeedItemList) ((C28447b) mo66539h()).getData()).isFromLocalCache = false;
        }
        this.f75046k.mo73763a(1, this.f75043h, this.f75045j, (C28447b) mo66539h());
        m93536l();
        if (this.f75038a != null) {
            C28467s sVar = this.f75038a;
            if (!this.f75042g || this.f75039d) {
                z = true;
            } else {
                z = false;
            }
            sVar.mo67623d(z);
        }
        this.f75042g = false;
        this.f75039d = false;
        if (((C28447b) mo66539h()).getData() != null && C43048db.m136578a().mo104720a(OneTimeEnum.FEED_FIRST_VIDEO_PRELOAD)) {
            C43305j.m137382a(((FeedItemList) ((C28447b) mo66539h()).getData()).getItems(), 0);
        }
        super.mo56977b();
        if (((C28447b) mo66539h()).getData() != null) {
            this.f75048m = SystemClock.elapsedRealtime();
            C34939a.m112588a().mo88500a(((FeedItemList) ((C28447b) mo66539h()).getData()).getRequestId(), SystemClock.elapsedRealtime());
        }
        if (this.f67571b != null && ((C28447b) this.f67571b).mListQueryType == 1 && C32190g.m104460b()) {
            C42961az.m136380a(new C32195h());
        }
        if (((C28447b) mo66539h()).getData() == null || ((FeedItemList) ((C28447b) mo66539h()).getData()).getItems() == null || ((FeedItemList) ((C28447b) mo66539h()).getData()).getItems().isEmpty()) {
            C1592h.m7855a(C28456j.f75050a, (Executor) C6907h.m21516a());
        }
        if (C6857a.m21312e().mo16823a("feed_ui_duration") && !C6857a.m21312e().mo16828b("feed_ui_duration")) {
            C6857a.m21312e().mo16827b("feed_ui_duration", true);
        }
        if (!C6857a.m21312e().mo16823a("feed_ui_to_video")) {
            C6857a.m21312e().mo16822a("feed_ui_to_video", true);
        }
        C6857a.m21312e().mo16822a("feed_ui_to_texture_available", false);
    }

    /* renamed from: a */
    public final void mo72189a(boolean z) {
        ((C28447b) this.f67571b).f74998a = z;
        this.f75041f = z;
    }

    public C28454h(Fragment fragment) {
        this.f75044i = fragment;
        this.f75046k = new C28696u(fragment);
    }

    /* renamed from: b */
    static final /* synthetic */ Object m93532b(Exception exc) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", C10933d.m32089a(exc, null));
        } catch (JSONException unused) {
        }
        C6379c.m19826a("feed_error", jSONObject);
        return null;
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        boolean z;
        C6921a.m21552a(4, "FeedFetchModel", "FeedFetchPresenter called onFailed!");
        this.f75046k.mo73765b(0, this.f75043h, null);
        this.f75046k.mo73762a(0, this.f75043h, (FeedAppLogParams) null, exc);
        this.f75046k.mo73763a(0, this.f75043h, this.f75045j, (C28447b) null);
        if (exc != null && !TextUtils.isEmpty(exc.getMessage())) {
            C1592h.m7855a((Callable<TResult>) new C28455i<TResult>(exc), (Executor) C6907h.m21516a());
        }
        m93536l();
        if (this.f75038a != null) {
            C28467s sVar = this.f75038a;
            if (!this.f75042g || this.f75039d) {
                z = true;
            } else {
                z = false;
            }
            sVar.mo67623d(z);
        }
        this.f75042g = false;
        this.f75039d = false;
        super.mo57296a(exc);
        if (this.f67571b != null && ((C28447b) this.f67571b).mListQueryType == 1 && C32190g.m104460b()) {
            C42961az.m136380a(new C32195h());
        }
        C7121a.m22259g();
    }

    /* renamed from: a */
    public final boolean mo56976a(Object... objArr) {
        this.f75043h = m93533b(objArr[0].intValue());
        if (5 == this.f75047l) {
            this.f75043h = "press_back";
        }
        this.f75045j = m93534c(objArr[1].intValue());
        StringBuilder sb = new StringBuilder("FeedFetchPresenter sendRequest on:");
        sb.append(this.f75045j);
        C6921a.m21552a(4, "FeedFetchModel", sb.toString());
        this.f75046k.mo73764a(this.f75043h);
        C28696u.m94417a(this.f75043h, this.f75045j, this.f75040e);
        if (this.f75038a != null) {
            this.f75038a.mo67623d(this.f75039d);
        }
        this.f75042g = super.mo56976a(objArr);
        return this.f75042g;
    }

    /* renamed from: a */
    public final boolean mo72190a(int i, Object... objArr) {
        this.f75047l = 5;
        return mo56976a(objArr);
    }
}
