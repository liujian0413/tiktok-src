package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3361af;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;

public class NobleRankListBottomView extends RelativeLayout {

    /* renamed from: i */
    private static final String f24109i = "NobleRankListBottomView";

    /* renamed from: a */
    protected View f24110a;

    /* renamed from: b */
    protected ImageView f24111b;

    /* renamed from: c */
    protected TextView f24112c;

    /* renamed from: d */
    protected ImageView f24113d;

    /* renamed from: e */
    protected TextView f24114e;

    /* renamed from: f */
    protected TextView f24115f;

    /* renamed from: g */
    protected View f24116g;

    /* renamed from: h */
    protected DataCenter f24117h;

    /* renamed from: j */
    private C8986g<IUser> f24118j;

    /* renamed from: b */
    private void m26496b() {
        C9738o.m28712b((View) this, 8);
        C9738o.m28712b(this.f24110a, 8);
        C9738o.m28712b((View) this.f24115f, 8);
        C9738o.m28712b(this.f24116g, 8);
    }

    /* renamed from: c */
    private void m26498c() {
        C9738o.m28712b((View) this, 0);
        C9738o.m28712b(this.f24110a, 0);
        C9738o.m28712b(this.f24116g, 8);
        C9738o.m28712b((View) this.f24115f, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21923a() {
        C9738o.m28712b((View) this, 0);
        C9738o.m28712b(this.f24110a, 8);
        C9738o.m28712b(this.f24116g, 0);
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.f24117h = dataCenter;
    }

    public void setLoginObserver(C8986g<IUser> gVar) {
        this.f24118j = gVar;
    }

    public NobleRankListBottomView(Context context) {
        super(context);
        m26493a(context);
    }

    /* renamed from: a */
    private void m26495a(User user) {
        if (user != null) {
            C5343e.m17045b(this.f24113d, user.getAvatarThumb(), this.f24113d.getWidth(), this.f24113d.getHeight(), R.drawable.c4_);
            this.f24114e.setText(user.getNickName());
        }
    }

    /* renamed from: a */
    private void m26493a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.aut, this, true);
        this.f24110a = findViewById(R.id.cn6);
        this.f24111b = (ImageView) findViewById(R.id.cnb);
        this.f24112c = (TextView) findViewById(R.id.cnf);
        this.f24113d = (ImageView) findViewById(R.id.e8m);
        this.f24114e = (TextView) findViewById(R.id.e9m);
        this.f24115f = (TextView) findViewById(R.id.d33);
        this.f24115f.setOnClickListener(new C8860a(context));
        this.f24116g = findViewById(R.id.bvo);
        this.f24116g.setOnClickListener(new C8861b(this));
    }

    /* renamed from: b */
    private void m26497b(C8857f fVar) {
        if (fVar != null && fVar.f24097a != null) {
            NobleLevelInfo nobleLevelInfo = fVar.f24097a.getNobleLevelInfo();
            if (nobleLevelInfo == null || nobleLevelInfo.getNobleLevel() <= 0) {
                this.f24111b.setVisibility(8);
                this.f24112c.setVisibility(0);
                this.f24115f.setText(getContext().getString(R.string.f87));
                this.f24112c.setText("-");
                return;
            }
            this.f24111b.setVisibility(0);
            this.f24112c.setVisibility(8);
            if (nobleLevelInfo.getNobleLevel() >= 4) {
                this.f24115f.setText(getContext().getString(R.string.f89));
            } else {
                this.f24115f.setText(getContext().getString(R.string.f8_));
            }
            C5343e.m17030a(this.f24111b, nobleLevelInfo.getNobleIcon());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21924a(View view) {
        TTLiveSDKContext.getHostService().mo22367h().mo22167a(getContext(), C8987h.m26865a().mo22189a(getContext().getString(R.string.efb)).mo22188a(0).mo22193d("live_detail").mo22194e("audience_list").mo22192c("live").mo22190a()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) this.f24118j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21925a(C8857f fVar) {
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            this.f24116g.setVisibility(0);
            this.f24110a.setVisibility(8);
            this.f24115f.setVisibility(8);
        } else if (fVar == null) {
            setVisibility(8);
            this.f24116g.setVisibility(8);
            this.f24110a.setVisibility(8);
            this.f24115f.setVisibility(8);
        } else if (this.f24117h == null || !((Boolean) this.f24117h.get("data_is_anchor", Boolean.valueOf(false))).booleanValue()) {
            m26498c();
            m26497b(fVar);
            m26495a(fVar.f24097a);
        } else {
            m26496b();
        }
    }

    public NobleRankListBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26493a(context);
    }

    /* renamed from: a */
    static final /* synthetic */ void m26494a(Context context, View view) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "nobility");
        C8443c.m25663a().mo21606a("livesdk_nobility_page_click", hashMap, new Object[0]);
        ((C8931a) C3596c.m13172a(C8931a.class)).handle(context, Uri.parse((String) LiveConfigSettingKeys.LIVE_NOBLE_INTRODUCE_SCHEMA.mo10240a()).buildUpon().appendQueryParameter("status_bar_height", String.valueOf((int) C3358ac.m12527e(C3361af.m12532a(context)))).build());
    }

    public NobleRankListBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26493a(context);
    }

    public NobleRankListBottomView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
