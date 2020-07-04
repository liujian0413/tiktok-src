package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a;
import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29556e;
import com.p280ss.android.ugc.aweme.following.p1265ui.view.FollowUserBtn;
import com.p280ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeAdapter;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder.C30016a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa;
import com.p280ss.android.ugc.aweme.profile.util.C36768y;
import com.p280ss.android.ugc.aweme.profile.util.C36769z;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.z */
public class C30179z extends RelativeLayout {

    /* renamed from: a */
    protected TextView f79402a;

    /* renamed from: b */
    protected AvatarImageWithVerify f79403b;

    /* renamed from: c */
    protected TextView f79404c;

    /* renamed from: d */
    protected FollowUserBtn f79405d;

    /* renamed from: e */
    protected TextView f79406e;

    /* renamed from: f */
    public C23267h<User> f79407f;

    /* renamed from: g */
    public int f79408g;

    /* renamed from: h */
    public String f79409h;

    /* renamed from: i */
    public int f79410i;

    /* renamed from: j */
    protected int f79411j;

    /* renamed from: k */
    private User f79412k;

    /* renamed from: l */
    private View f79413l;

    /* renamed from: m */
    private RecyclerView f79414m;

    /* renamed from: n */
    private View f79415n;

    /* renamed from: o */
    private ImageView f79416o;

    /* renamed from: p */
    private LinearLayout f79417p;

    /* renamed from: q */
    private C36768y f79418q;

    /* renamed from: r */
    private RelativeUserAvatarListView f79419r;

    /* renamed from: s */
    private int f79420s;

    /* renamed from: t */
    private boolean f79421t;

    /* renamed from: u */
    private C30016a f79422u;

    /* renamed from: v */
    private boolean f79423v;

    /* renamed from: w */
    private HashMap<String, Boolean> f79424w;

    /* renamed from: x */
    private C29548a f79425x;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo76631a(User user) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo76633a() {
        return true;
    }

    public User getData() {
        return this.f79412k;
    }

    /* access modifiers changed from: protected */
    public int getLayoutId() {
        return R.layout.a1k;
    }

    /* renamed from: b */
    private int m98806b() {
        Context context;
        float f;
        float a = (float) C9738o.m28691a(getContext());
        if (this.f79423v) {
            context = getContext();
            f = 210.0f;
        } else {
            context = getContext();
            f = 185.0f;
        }
        return (int) (a - C9738o.m28708b(context, f));
    }

    private String getUserInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(R.string.fss));
        sb.append(":");
        sb.append(C30537o.m99738a((long) this.f79412k.getAwemeCount()));
        sb.append("  ");
        sb.append(getContext().getString(R.string.b94));
        sb.append(":");
        sb.append(C30537o.m99738a((long) this.f79412k.getFollowerCount()));
        return sb.toString();
    }

    public void setEnterFrom(String str) {
        this.f79409h = str;
    }

    public void setFollowFromType(int i) {
        this.f79410i = i;
    }

    public void setListener(C23267h<User> hVar) {
        this.f79407f = hVar;
    }

    public void setPositionInApiList(int i) {
        this.f79408g = i;
    }

    public void setRecommendAwemeClickListener(C30016a aVar) {
        this.f79422u = aVar;
    }

    public void setRecommendUserType(int i) {
        this.f79411j = i;
    }

    public void setNewFriendRecommendMask(boolean z) {
        int i;
        View view = this.f79413l;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76648a(FollowStatus followStatus) {
        if (followStatus != null) {
            this.f79424w.put(this.f79412k.getUid(), Boolean.valueOf(true));
            m98805a(this.f79412k, followStatus.followStatus);
            if (this.f79423v) {
                if (followStatus.followStatus == 0) {
                    this.f79416o.setVisibility(0);
                    return;
                }
                this.f79416o.setVisibility(4);
            }
        }
    }

    /* renamed from: b */
    private void m98807b(User user) {
        if (!C7213d.m22500a().mo18803bo().isRecommendItemShowMoreInfo || !mo76633a()) {
            m98808b(user, this.f79406e);
            mo76647a(this.f79404c, user);
            return;
        }
        mo76632a(user, this.f79406e);
        mo76631a(user);
    }

    public void setData(final User user) {
        if (user != null) {
            this.f79412k = user;
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                this.f79402a.setText(user.getRemarkName());
            } else {
                this.f79402a.setText(user.getNickname());
            }
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f79403b.setUserData(userVerify);
            if (C6399b.m19944t()) {
                this.f79403b.mo60896b();
                C43126fg.m136801a(getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f79402a);
            }
            m98805a(user, user.getFollowStatus());
            this.f79425x.f77866c = new C30150aa(this);
            this.f79425x.mo75558a(user);
            setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C30179z.this.f79407f != null) {
                        C30179z.this.f79407f.mo60535a(BaseNotice.HASHTAG, user, C30179z.this.f79408g, C30179z.this, "click_head");
                    }
                }
            });
            if (this.f79423v) {
                if (user.getFollowStatus() == 0) {
                    this.f79416o.setVisibility(0);
                } else {
                    this.f79416o.setVisibility(4);
                }
                this.f79416o.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (C30179z.this.f79407f != null) {
                            C30179z.this.f79407f.mo60535a(102, user, C30179z.this.f79408g, C30179z.this, "");
                        }
                    }
                });
            }
            this.f79402a.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C30179z.this.f79407f != null) {
                        C30179z.this.f79407f.mo60535a(BaseNotice.HASHTAG, user, C30179z.this.f79408g, C30179z.this, "click_name");
                    }
                }
            });
            if (!C6307b.m19566a((Collection<T>) user.getRecommendAwemeItems())) {
                this.f79414m.setVisibility(0);
                RecommendAwemeAdapter recommendAwemeAdapter = new RecommendAwemeAdapter();
                recommendAwemeAdapter.f78933b = this.f79422u;
                recommendAwemeAdapter.mo58045a(user.getRecommendAwemeItems());
                recommendAwemeAdapter.f78932a = this.f79408g;
                this.f79414m.setAdapter(recommendAwemeAdapter);
            } else {
                this.f79414m.setVisibility(8);
            }
            m98807b(user);
        }
    }

    public C30179z(Context context, HashMap<String, Boolean> hashMap) {
        this(context, (AttributeSet) null, hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76647a(TextView textView, User user) {
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(getUserInfo());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo76632a(User user, TextView textView) {
        if (textView != null) {
            this.f79419r.setVisibility(0);
            textView.setMaxLines(2);
            m98808b(user, textView);
            this.f79419r.mo76615a(user, textView, this.f79421t);
        }
    }

    /* renamed from: a */
    private void m98805a(User user, int i) {
        if (C7213d.m22500a().mo18785ax() == 2 || C7213d.m22500a().mo18785ax() == 3) {
            if (this.f79424w != null && this.f79424w.get(user.getUid()) != null) {
                C36694aa.m118343a(user, i, this.f79402a, this.f79415n, "find_friends", ((Boolean) this.f79424w.get(user.getUid())).booleanValue());
                this.f79424w.put(user.getUid(), Boolean.valueOf(false));
            } else if (this.f79415n != null) {
                this.f79415n.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    protected static void m98808b(User user, TextView textView) {
        textView.setVisibility(0);
        if (!TextUtils.isEmpty(user.getRecommendReason())) {
            textView.setText(user.getRecommendReason());
        } else if (!TextUtils.isEmpty(user.getSignature())) {
            textView.setText(user.getSignature());
        } else if (C6399b.m19944t()) {
            textView.setText(R.string.dun);
        } else {
            textView.setVisibility(8);
        }
    }

    private C30179z(Context context, AttributeSet attributeSet, HashMap<String, Boolean> hashMap) {
        this(context, null, 0, hashMap, false, false);
    }

    public C30179z(Context context, HashMap<String, Boolean> hashMap, boolean z) {
        this(context, null, 0, hashMap, z, false);
    }

    public C30179z(Context context, AttributeSet attributeSet, int i, HashMap<String, Boolean> hashMap, boolean z) {
        this(context, null, 0, hashMap, z, false);
    }

    private C30179z(Context context, AttributeSet attributeSet, int i, HashMap<String, Boolean> hashMap, boolean z, boolean z2) {
        this(context, attributeSet, i, hashMap, z, false, true);
    }

    private C30179z(Context context, AttributeSet attributeSet, int i, HashMap<String, Boolean> hashMap, boolean z, boolean z2, boolean z3) {
        super(context, attributeSet, i);
        this.f79409h = "";
        this.f79410i = 12;
        this.f79424w = new HashMap<>();
        boolean z4 = false;
        this.f79411j = 0;
        this.f79421t = z2;
        LayoutInflater.from(context).inflate(getLayoutId(), this);
        if (!z2) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            setBackgroundResource(typedValue.resourceId);
        }
        this.f79402a = (TextView) findViewById(R.id.e7f);
        this.f79403b = (AvatarImageWithVerify) findViewById(R.id.b64);
        this.f79404c = (TextView) findViewById(R.id.e6q);
        this.f79405d = (FollowUserBtn) findViewById(R.id.q5);
        this.f79406e = (TextView) findViewById(R.id.dt5);
        this.f79415n = findViewById(R.id.b8s);
        this.f79416o = (ImageView) findViewById(R.id.b6m);
        this.f79413l = findViewById(R.id.c3u);
        this.f79414m = (RecyclerView) findViewById(R.id.bnc);
        this.f79414m.mo5525a((C1272h) new DividerItemDecoration(0, (int) C9738o.m28708b(this.f79414m.getContext(), 4.0f), 0));
        this.f79414m.setLayoutManager(new WrapLinearLayoutManager(this.f79414m.getContext(), 0, false) {
            /* renamed from: e */
            public final boolean mo5438e() {
                return false;
            }
        });
        this.f79424w = hashMap;
        if (C7213d.m22500a().mo18818r() && z) {
            z4 = true;
        }
        this.f79423v = z4;
        if (!this.f79423v) {
            this.f79416o.setVisibility(8);
        }
        this.f79425x = new C29548a(this.f79405d, new C29556e() {
            /* renamed from: a */
            public final String mo68099a() {
                return C30179z.this.f79409h;
            }

            /* renamed from: c */
            public final int mo68101c() {
                return C30179z.this.f79410i;
            }

            /* renamed from: a */
            public final void mo67853a(int i, User user) {
                if (C30179z.this.f79407f != null) {
                    C30179z.this.f79407f.mo60535a(100, user, C30179z.this.f79408g, C30179z.this, "");
                }
            }
        });
        this.f79417p = (LinearLayout) findViewById(R.id.dg3);
        this.f79420s = m98806b();
        this.f79418q = new C36769z(this.f79417p, this.f79420s, this.f79421t, true);
        this.f79419r = (RelativeUserAvatarListView) findViewById(R.id.crf);
    }
}
