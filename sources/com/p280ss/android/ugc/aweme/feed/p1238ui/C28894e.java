package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.e */
public abstract class C28894e {

    /* renamed from: g */
    public Aweme f76169g;

    /* renamed from: h */
    protected String f76170h;

    /* renamed from: i */
    protected JSONObject f76171i;

    /* renamed from: j */
    protected boolean f76172j;

    /* renamed from: k */
    protected int f76173k;

    /* renamed from: l */
    protected DataCenter f76174l;

    /* renamed from: m */
    public final Context f76175m;

    /* renamed from: n */
    protected final View f76176n;

    /* renamed from: o */
    protected String f76177o = "click";

    /* renamed from: p */
    protected Fragment f76178p;

    /* renamed from: q */
    protected int f76179q;

    /* renamed from: a */
    public abstract void mo72018a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo72019a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo73965b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo72022b(DataCenter dataCenter);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo74125c() {
        return false;
    }

    /* renamed from: g */
    public void mo73804g() {
    }

    /* renamed from: h */
    public void mo74131h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo74168f() {
        if (this.f76169g == null || !this.f76169g.isImage()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo74167d() {
        if (!mo74098e()) {
            return false;
        }
        C10761a.m31399c(this.f76175m, (int) R.string.e3).mo25750a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo74098e() {
        boolean z;
        boolean a = C25329c.m83215a(this.f76169g);
        if (this.f76169g == null || !this.f76169g.isAd()) {
            z = false;
        } else {
            z = true;
        }
        if (z || !a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo72021a(VideoItemParams videoItemParams) {
        mo73803b(videoItemParams);
    }

    public C28894e(View view) {
        this.f76175m = view.getContext();
        this.f76176n = view;
        mo72019a(view);
    }

    /* renamed from: a */
    public void mo72020a(DataCenter dataCenter) {
        if (dataCenter != null) {
            this.f76174l = dataCenter;
            mo72022b(dataCenter);
        } else if (C7163a.m22363a()) {
            throw new RuntimeException("DataCenter can not be null !!!");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo73803b(VideoItemParams videoItemParams) {
        if (videoItemParams != null) {
            this.f76169g = videoItemParams.mAweme;
            this.f76173k = videoItemParams.mPageType;
            this.f76170h = videoItemParams.mEventType;
            this.f76171i = videoItemParams.mRequestId;
            this.f76172j = videoItemParams.isMyProfile;
            this.f76177o = videoItemParams.mEnterMethodValue;
            this.f76178p = videoItemParams.fragment;
            this.f76179q = videoItemParams.mAwemeFromPage;
        }
    }
}
