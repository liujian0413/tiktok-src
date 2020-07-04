package com.p280ss.android.ugc.aweme.base.p308ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AbstractFeedTagLayout */
public abstract class AbstractFeedTagLayout extends LinearLayout {

    /* renamed from: a */
    protected TextView f61604a;

    /* renamed from: b */
    protected TextView f61605b;

    /* renamed from: c */
    protected Context f61606c;

    /* renamed from: d */
    protected Aweme f61607d;

    /* renamed from: e */
    protected int f61608e;

    /* renamed from: f */
    protected int f61609f;

    /* renamed from: g */
    protected String f61610g;

    /* renamed from: h */
    protected Activity f61611h;

    /* renamed from: i */
    protected JSONObject f61612i;

    /* renamed from: j */
    protected int f61613j;

    /* renamed from: k */
    public boolean f61614k;

    /* renamed from: l */
    protected boolean f61615l;

    /* renamed from: m */
    protected String f61616m = "list";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo60852a();

    /* renamed from: b */
    public final boolean mo60853b() {
        if (!(this.f61607d == null || this.f61607d.getOpenPlatformStruct() == null || this.f61607d.getOpenPlatformStruct().getRawData() == null)) {
            OpenPlatformRawData rawData = this.f61607d.getOpenPlatformStruct().getRawData();
            if (rawData.getAnchor() != null && !TextUtils.isEmpty(rawData.getAnchor().getName())) {
                return true;
            }
        }
        return false;
    }

    public String getOpenPlatformIcon() {
        if (!(this.f61607d == null || this.f61607d.getOpenPlatformStruct() == null || this.f61607d.getOpenPlatformStruct().getRawData() == null)) {
            OpenPlatformRawData rawData = this.f61607d.getOpenPlatformStruct().getRawData();
            if (rawData.getAnchor() != null && !TextUtils.isEmpty(rawData.getAnchor().getIcon())) {
                return rawData.getAnchor().getIcon();
            }
        }
        return null;
    }

    public String getOpenPlatformName() {
        if (!(this.f61607d == null || this.f61607d.getOpenPlatformStruct() == null || this.f61607d.getOpenPlatformStruct().getRawData() == null)) {
            OpenPlatformRawData rawData = this.f61607d.getOpenPlatformStruct().getRawData();
            if (rawData.getAnchor() != null && !TextUtils.isEmpty(rawData.getAnchor().getName())) {
                return rawData.getAnchor().getName();
            }
        }
        return null;
    }

    public void setFollowPageType(String str) {
        this.f61616m = str;
    }

    public void setPageType(int i) {
        this.f61613j = i;
    }

    public void setPoiTagVisible(boolean z) {
        this.f61614k = z;
    }

    public void setRequestId(JSONObject jSONObject) {
        this.f61612i = jSONObject;
    }

    public AbstractFeedTagLayout(Context context) {
        super(context);
    }

    public AbstractFeedTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractFeedTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
