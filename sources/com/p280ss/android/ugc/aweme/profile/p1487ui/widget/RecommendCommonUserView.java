package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.experiment.C27689c;
import com.p280ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.profile.C35992k;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapter.C36629a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapter.C36630b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolder.C36634b;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.p337ui.PrivacyActivity;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView */
public class RecommendCommonUserView extends RelativeLayout implements OnClickListener {

    /* renamed from: a */
    public RecyclerView f96107a;

    /* renamed from: b */
    public C36620a f96108b;

    /* renamed from: c */
    public String f96109c;

    /* renamed from: d */
    private ViewStub f96110d;

    /* renamed from: e */
    private View f96111e;

    /* renamed from: f */
    private View f96112f;

    /* renamed from: g */
    private View f96113g;

    /* renamed from: h */
    private View f96114h;

    /* renamed from: i */
    private View f96115i;

    /* renamed from: j */
    private View f96116j;

    /* renamed from: k */
    private View f96117k;

    /* renamed from: l */
    private View f96118l;

    /* renamed from: m */
    private TextView f96119m;

    /* renamed from: n */
    private View f96120n;

    /* renamed from: o */
    private TextView f96121o;

    /* renamed from: p */
    private RecommendUserAdapter f96122p;

    /* renamed from: q */
    private boolean f96123q = true;

    /* renamed from: r */
    private int f96124r;

    /* renamed from: s */
    private List<User> f96125s;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView$a */
    public interface C36620a {
        /* renamed from: a */
        void mo72054a(String str, boolean z);
    }

    public Map<String, Integer> getPosInApiListMap() {
        return getAdapter().f96165g;
    }

    private RecommendUserAdapter getAdapter() {
        if (this.f96122p == null) {
            this.f96122p = new RecommendUserAdapter();
        }
        return this.f96122p;
    }

    /* renamed from: a */
    public final void mo92909a() {
        if (this.f96107a != null) {
            this.f96107a.mo5541b(0);
        }
    }

    public List<User> getData() {
        if (this.f96125s == null) {
            this.f96125s = new ArrayList();
        }
        return this.f96125s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo92913b() {
        getContext().startActivity(new Intent(getContext(), PrivacyActivity.class));
    }

    /* renamed from: c */
    private void m118163c() {
        int i;
        int i2 = 0;
        this.f96121o.setVisibility(0);
        String string = getContext().getResources().getString(R.string.d4m);
        String a = C1642a.m8034a(getContext().getString(R.string.d4l), new Object[]{string});
        String[] split = a.split(string);
        if (split == null || split.length != 2) {
            i = 0;
        } else {
            i2 = split[0].length();
            i = string.length() + i2;
        }
        SpannableString spannableString = new SpannableString(a);
        spannableString.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                RecommendCommonUserView.this.mo92913b();
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(RecommendCommonUserView.this.getResources().getColor(R.color.a2x));
                textPaint.setUnderlineText(false);
            }
        }, i2, i, 33);
        this.f96121o.setText(spannableString);
        this.f96121o.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void setOnLookMoreUserListener(C36620a aVar) {
        this.f96108b = aVar;
    }

    /* renamed from: a */
    public final void mo92910a(FollowStatus followStatus) {
        getAdapter().mo92944a(followStatus);
    }

    public void setOnItemOperationListener(C36630b bVar) {
        getAdapter().f96160b = bVar;
    }

    public void setOnViewAttachedToWindowListener(C25663d<RecommendUserCardViewHolder> dVar) {
        getAdapter().f96162d = dVar;
    }

    public RecommendCommonUserView(Context context) {
        super(context);
        m118161a(context);
    }

    public void setReminderText(int i) {
        if (this.f96119m != null) {
            this.f96119m.setText(i);
        }
    }

    /* renamed from: a */
    private void m118161a(Context context) {
        this.f96110d = new ViewStub(context);
        this.f96110d.setLayoutResource(R.layout.b43);
        this.f96110d.setInflatedId(R.id.bj6);
        addView(this.f96110d);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ViewParent parent = getParent();
        if (parent != null) {
            if (!(parent instanceof RecyclerView)) {
                z = true;
            } else {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setBackgroundResource(int i) {
        m118162b(getContext());
        findViewById(R.id.bj6).setBackgroundResource(i);
    }

    /* renamed from: a */
    public final void mo92912a(boolean z) {
        if (z) {
            this.f96118l.setVisibility(8);
            this.f96117k.setVisibility(0);
            return;
        }
        this.f96118l.setVisibility(0);
        this.f96117k.setVisibility(8);
    }

    public void setShowLookMore(boolean z) {
        int i;
        m118162b(getContext());
        this.f96123q = z;
        View view = this.f96112f;
        int i2 = 4;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
        View view2 = this.f96113g;
        if (z) {
            i2 = 0;
        }
        view2.setVisibility(i2);
        getAdapter().mo66516d(z);
    }

    private void setFindMoreLayout(List<User> list) {
        if (list.size() <= 3) {
            findViewById(R.id.akw).setVisibility(8);
            return;
        }
        AvatarImageView avatarImageView = (AvatarImageView) this.f96115i.findViewById(R.id.aku);
        AvatarImageView avatarImageView2 = (AvatarImageView) this.f96115i.findViewById(R.id.akv);
        C23323e.m76524b((AvatarImageView) this.f96115i.findViewById(R.id.akt), ((User) list.get(3)).getAvatarThumb());
        if (list.size() >= 5) {
            C23323e.m76524b(avatarImageView, ((User) list.get(4)).getAvatarThumb());
            if (list.size() >= 6) {
                C23323e.m76524b(avatarImageView2, ((User) list.get(5)).getAvatarThumb());
            } else {
                avatarImageView2.setVisibility(8);
            }
        } else {
            avatarImageView.setVisibility(8);
            avatarImageView2.setVisibility(8);
        }
    }

    public void setPageType(int i) {
        this.f96124r = i;
        getAdapter().f96164f = i;
        if ((i == 1 || i == 2) && C7213d.m22500a().mo18809i()) {
            this.f96115i.setVisibility(0);
            this.f96114h.setVisibility(8);
        } else {
            this.f96114h.setVisibility(0);
            this.f96115i.setVisibility(8);
        }
        if (i == 0 && C6399b.m19944t()) {
            this.f96114h.setVisibility(8);
            this.f96115i.setVisibility(8);
            this.f96121o.setVisibility(8);
            this.f96116j.setVisibility(8);
            this.f96119m.setText(R.string.d7o);
            setShowLookMore(false);
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.bw1 && this.f96123q && this.f96108b != null) {
            this.f96108b.mo72054a(this.f96109c, true);
        }
        if (view.getId() == R.id.aky && this.f96108b != null) {
            this.f96108b.mo72054a(this.f96109c, true);
        }
        if (view.getId() == R.id.cjt) {
            HashMap hashMap = new HashMap();
            if (this.f96124r == 1) {
                hashMap.put("enter_from", "homepage_follow");
            } else if (this.f96124r == 2) {
                hashMap.put("enter_from", "homepage_friends");
            } else {
                hashMap.put("enter_from", "others_homepage");
            }
            C6907h.m21524a("click_privacy_tips", (Map) hashMap);
            String str = (String) SharePrefCache.inst().getPrivacyReminderH5Url().mo59877d();
            if (str != null) {
                Intent intent = new Intent(getContext(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("use_webview_title", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(str));
                getContext().startActivity(intent);
            }
        }
    }

    /* renamed from: b */
    private void m118162b(final Context context) {
        if (this.f96111e == null) {
            this.f96111e = this.f96110d.inflate();
            this.f96112f = this.f96111e.findViewById(R.id.bw1);
            this.f96113g = this.f96111e.findViewById(R.id.bw2);
            this.f96115i = this.f96111e.findViewById(R.id.aky);
            this.f96114h = this.f96111e.findViewById(R.id.bw3);
            this.f96107a = (RecyclerView) this.f96111e.findViewById(R.id.cqp);
            this.f96107a.setAdapter(getAdapter());
            this.f96120n = this.f96111e.findViewById(R.id.bm8);
            this.f96121o = (TextView) this.f96111e.findViewById(R.id.dzx);
            this.f96116j = this.f96111e.findViewById(R.id.cjt);
            this.f96119m = (TextView) this.f96111e.findViewById(R.id.e0b);
            this.f96118l = this.f96111e.findViewById(R.id.ed7);
            this.f96117k = this.f96111e.findViewById(R.id.ed8);
            ((SimpleItemAnimator) this.f96107a.getItemAnimator()).f5112m = false;
            getAdapter().f96161c = new C36629a() {
                /* renamed from: a */
                public final void mo92925a() {
                    if (RecommendCommonUserView.this.f96108b != null) {
                        RecommendCommonUserView.this.f96108b.mo72054a(RecommendCommonUserView.this.f96109c, false);
                    }
                }
            };
            getAdapter().f96167i = new C36634b() {
                /* renamed from: a */
                public final void mo92926a(int i) {
                    RecommendCommonUserView.this.f96107a.mo5521a((int) C9738o.m28708b(context, 130.0f), 0);
                }
            };
            this.f96107a.setPadding((int) C9738o.m28708b(this.f96107a.getContext(), 8.0f), 0, 0, 0);
            this.f96107a.setClipToPadding(false);
            this.f96107a.mo5525a((C1272h) new DividerItemDecoration(0, (int) C9738o.m28708b(context, 4.0f), 0));
            this.f96107a.setLayoutManager(new WrapLinearLayoutManager(context, 0, false));
            this.f96112f.setOnClickListener(this);
            this.f96115i.setOnClickListener(this);
            if (!C7213d.m22500a().mo18742aE()) {
                this.f96116j.setVisibility(8);
            } else {
                this.f96116j.setVisibility(0);
                this.f96116j.setOnClickListener(this);
            }
            if (!C35992k.m115952b() || (C27689c.m90842b() && !C6861a.m21337f().isLogin())) {
                this.f96121o.setVisibility(8);
            } else {
                m118163c();
            }
            if (C6399b.m19944t()) {
                this.f96115i.setVisibility(8);
            }
        }
    }

    public RecommendCommonUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118161a(context);
    }

    /* renamed from: a */
    public final void mo92911a(List<User> list, String str) {
        if (list != null) {
            m118162b(getContext());
            if (list.size() > 0) {
                mo92912a(false);
            }
            this.f96109c = str;
            this.f96125s = list;
            getAdapter().mo58045a(this.f96125s);
            getAdapter().f96163e = str;
            if (!this.f96123q || this.f96125s.size() < 10) {
                getAdapter().mo66516d(false);
            } else {
                getAdapter().mo66516d(true);
            }
            if ((this.f96124r == 1 || this.f96124r == 2) && C7213d.m22500a().mo18809i() && this.f96125s != null && this.f96125s.size() > 3) {
                setFindMoreLayout(this.f96125s);
            }
        }
    }

    public RecommendCommonUserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118161a(context);
    }
}
