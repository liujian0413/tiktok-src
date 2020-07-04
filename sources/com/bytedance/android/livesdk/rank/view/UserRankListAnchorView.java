package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3385e;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;

public class UserRankListAnchorView extends RelativeLayout {

    /* renamed from: a */
    protected View f24128a;

    /* renamed from: b */
    protected ImageView f24129b;

    /* renamed from: c */
    protected TextView f24130c;

    /* renamed from: d */
    protected ImageView f24131d;

    /* renamed from: e */
    protected HSImageView f24132e;

    /* renamed from: f */
    protected TextView f24133f;

    /* renamed from: g */
    protected TextView f24134g;

    /* renamed from: h */
    protected TextView f24135h;

    /* renamed from: i */
    protected View f24136i;

    /* renamed from: j */
    protected View f24137j;

    /* renamed from: k */
    protected View f24138k;

    /* renamed from: l */
    protected long f24139l;

    /* renamed from: m */
    protected DataCenter f24140m;

    /* renamed from: n */
    private int f24141n;

    /* renamed from: o */
    private C8986g<IUser> f24142o;

    /* renamed from: b */
    private void m26522b() {
        C9738o.m28712b((View) this, 0);
        C9738o.m28712b(this.f24128a, 0);
        C9738o.m28712b(this.f24138k, 8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21937a() {
        C9738o.m28712b((View) this, 0);
        C9738o.m28712b(this.f24128a, 8);
        C9738o.m28712b(this.f24138k, 0);
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.f24140m = dataCenter;
    }

    public void setLoginObserver(C8986g<IUser> gVar) {
        this.f24142o = gVar;
    }

    public void setOwnerId(long j) {
        this.f24139l = j;
    }

    public UserRankListAnchorView(Context context) {
        super(context);
        m26519a(context);
    }

    /* renamed from: a */
    private void m26520a(User user) {
        if (user != null) {
            C5343e.m17045b(this.f24131d, user.getAvatarThumb(), this.f24131d.getWidth(), this.f24131d.getHeight(), R.drawable.c4_);
            if (!(user.getBorder() == null || this.f24132e == null)) {
                C3393m.m12633b(this.f24132e, user.getBorder().f7818a);
            }
            this.f24133f.setText(user.getNickName());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21938a(View view) {
        TTLiveSDKContext.getHostService().mo22367h().mo22167a(getContext(), C8987h.m26865a().mo22189a(getContext().getString(R.string.efb)).mo22188a(0).mo22193d("live_detail").mo22194e("audience_list").mo22192c("live").mo22190a()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) this.f24142o);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21940b(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("page_source", "contribution_ranklist");
        bundle.putString("enter_from", "live_detail");
        bundle.putString("user_id", String.valueOf(this.f24139l));
        if (this.f24141n == 1) {
            bundle.putString("type", "totally_rank");
        } else if (this.f24141n == 2) {
            bundle.putString("type", "weekly_rank");
        } else if (this.f24141n == 3) {
            bundle.putString("type", "live_room_rank");
        }
        if (this.f24140m != null) {
            User user = new User();
            user.setId(this.f24139l);
            this.f24140m.lambda$put$1$DataCenter("data_gift_log_extra", bundle);
            this.f24140m.lambda$put$1$DataCenter("cmd_send_gift", user);
        }
    }

    /* renamed from: a */
    private void m26519a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.aqw, this, true);
        this.f24128a = findViewById(R.id.cn6);
        this.f24129b = (ImageView) findViewById(R.id.cnb);
        this.f24130c = (TextView) findViewById(R.id.cnf);
        this.f24131d = (ImageView) findViewById(R.id.e8m);
        this.f24132e = (HSImageView) findViewById(R.id.b65);
        this.f24133f = (TextView) findViewById(R.id.e9m);
        this.f24134g = (TextView) findViewById(R.id.cn_);
        this.f24136i = findViewById(R.id.a9q);
        this.f24137j = findViewById(R.id.d33);
        this.f24135h = (TextView) findViewById(R.id.dj0);
        this.f24137j.setOnClickListener(new C8874k(this));
        this.f24138k = findViewById(R.id.bvo);
        this.f24138k.setOnClickListener(new C8875l(this));
    }

    /* renamed from: a */
    private void m26521a(C8857f fVar) {
        int i;
        float f;
        String str;
        if (fVar != null) {
            this.f24129b.setVisibility(8);
            boolean z = false;
            this.f24130c.setVisibility(0);
            int i2 = fVar.f24099c;
            String valueOf = String.valueOf(i2);
            this.f24130c.setText(valueOf);
            if (fVar.f24098b > 0) {
                if (i2 > 0 && i2 <= 100) {
                    switch (i2) {
                        case 1:
                            this.f24129b.setImageResource(R.drawable.cby);
                            this.f24129b.setVisibility(0);
                            this.f24130c.setVisibility(8);
                            break;
                        case 2:
                            this.f24129b.setImageResource(R.drawable.cbz);
                            this.f24129b.setVisibility(0);
                            this.f24130c.setVisibility(8);
                            break;
                        case 3:
                            this.f24129b.setImageResource(R.drawable.cc0);
                            this.f24129b.setVisibility(0);
                            this.f24130c.setVisibility(8);
                            break;
                        default:
                            this.f24130c.setText(valueOf);
                            break;
                    }
                } else if (this.f24141n == 17) {
                    this.f24130c.setText(getContext().getResources().getString(R.string.eyi));
                } else {
                    if (C9290a.f25466a) {
                        str = "-";
                    } else {
                        str = getContext().getResources().getString(R.string.eyi);
                    }
                    this.f24130c.setText(str);
                }
            } else {
                this.f24130c.setText("-");
            }
            this.f24130c.setVisibility(0);
            this.f24129b.setVisibility(8);
            TextView textView = (TextView) this.f24128a.findViewById(R.id.d2r);
            if (this.f24141n == 17 && fVar.f24098b > 0) {
                String valueOf2 = String.valueOf(fVar.f24098b);
                textView.setText(getResources().getString(R.string.f7t, new Object[]{valueOf2}));
            }
            if (!(getContext() == null || getContext().getResources() == null)) {
                if (i2 > 0 && i2 <= 100) {
                    z = true;
                }
                TextView textView2 = this.f24130c;
                Resources resources = getContext().getResources();
                if (z) {
                    i = R.color.ars;
                } else {
                    i = R.color.art;
                }
                textView2.setTextColor(resources.getColor(i));
                TextView textView3 = this.f24130c;
                if (z) {
                    f = 20.0f;
                } else {
                    f = 12.0f;
                }
                textView3.setTextSize(f);
                if (fVar.f24098b <= 0) {
                    this.f24130c.setTextSize(20.0f);
                }
            }
        }
    }

    /* renamed from: b */
    private void m26523b(C8857f fVar) {
        String str;
        String str2;
        if (fVar != null) {
            int i = 0;
            if (!C9290a.f25466a) {
                if (!(getContext() == null || getContext().getResources() == null)) {
                    if (this.f24141n == 17) {
                        if (C6319n.m19593a(fVar.f24100d)) {
                            str2 = getContext().getResources().getString(R.string.feo, new Object[]{C3385e.m12592b(fVar.f24098b)});
                        } else {
                            str2 = getContext().getResources().getString(R.string.fen, new Object[]{C3385e.m12592b(fVar.f24098b), fVar.f24100d});
                        }
                        this.f24134g.setText(str2);
                    } else if (this.f24141n == 7) {
                        if (C6319n.m19593a(fVar.f24100d)) {
                            str = getContext().getResources().getString(R.string.fev, new Object[]{C3385e.m12592b(fVar.f24098b)});
                        } else {
                            str = getContext().getResources().getString(R.string.feu, new Object[]{C3385e.m12592b(fVar.f24098b), fVar.f24100d});
                        }
                        this.f24134g.setText(str);
                    } else {
                        this.f24134g.setText("");
                    }
                }
            } else if (!TextUtils.isEmpty(fVar.f24100d)) {
                String str3 = fVar.f24100d;
                SpannableString spannableString = new SpannableString(str3);
                while (i < str3.length()) {
                    char charAt = str3.charAt(i);
                    if (Character.isDigit(charAt)) {
                        int i2 = i + 1;
                        while (i2 < str3.length() - 1 && Character.isDigit(str3.charAt(i2))) {
                            i2++;
                        }
                        spannableString.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.ag2)), i, i2, 18);
                        i = i2;
                    } else {
                        if (i > 0 && charAt == '.' && Character.isDigit(str3.charAt(i - 1))) {
                            spannableString.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.ag2)), i, i + 1, 18);
                        } else if (i > 0 && ((charAt == 'k' || charAt == 'm' || charAt == 'b') && Character.isDigit(str3.charAt(i - 1)))) {
                            spannableString.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.ag2)), i, i + 1, 18);
                        } else if (i < str3.length() - 1 && (charAt == 'k' || charAt == 'm' || charAt == 'b')) {
                            int i3 = i + 1;
                            if (Character.isDigit(str3.charAt(i3))) {
                                spannableString.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.ag2)), i, i3, 18);
                            }
                        }
                        i++;
                    }
                }
                this.f24134g.setText(spannableString);
            } else {
                this.f24134g.setVisibility(8);
                this.f24136i.setVisibility(8);
            }
            this.f24134g.setVisibility(8);
        }
    }

    public UserRankListAnchorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26519a(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21939a(C8857f fVar, int i) {
        this.f24141n = i;
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            this.f24138k.setVisibility(0);
            this.f24128a.setVisibility(8);
        } else if (fVar == null) {
            this.f24138k.setVisibility(8);
            this.f24128a.setVisibility(8);
        } else {
            m26522b();
            m26521a(fVar);
            m26520a(fVar.f24097a);
            m26523b(fVar);
        }
    }

    public UserRankListAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26519a(context);
    }

    public UserRankListAnchorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m26519a(context);
    }
}
