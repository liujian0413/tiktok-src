package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.commerce.CommerceInfo;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.EnterpriseChallengeLayout */
public class EnterpriseChallengeLayout extends LinearLayout implements C36345an {

    /* renamed from: a */
    View f94611a;

    /* renamed from: b */
    TextView f94612b;

    /* renamed from: c */
    RecyclerView f94613c;

    /* renamed from: d */
    EnterpriseChallengeAdapter f94614d;

    /* renamed from: e */
    List<Challenge> f94615e;

    /* renamed from: f */
    private User f94616f;

    /* renamed from: b */
    public final boolean mo91994b() {
        if (this.f94616f == null) {
            return false;
        }
        return TextUtils.equals(C21115b.m71197a().getCurUserId(), this.f94616f.getUid());
    }

    /* renamed from: a */
    public final void mo91990a() {
        if (!C6307b.m19566a((Collection<T>) this.f94615e)) {
            if (this.f94614d != null) {
                this.f94614d.mo91987a();
            }
            if (!(this.f94616f == null || TextUtils.isEmpty(this.f94616f.getUid()) || this.f94613c == null)) {
                C1273i layoutManager = this.f94613c.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int j = linearLayoutManager.mo5445j();
                    int l = linearLayoutManager.mo5447l();
                    if (j >= 0 && j < this.f94615e.size() && l >= 0 && l < this.f94615e.size()) {
                        while (j <= l) {
                            Challenge challenge = (Challenge) this.f94615e.get(j);
                            if (challenge != null) {
                                mo91992a(challenge);
                                this.f94614d.mo91988a(j);
                            }
                            j++;
                        }
                    }
                }
            }
        }
    }

    public EnterpriseChallengeLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo91992a(Challenge challenge) {
        m116598a("challenge_show", "show_original_tag", challenge);
    }

    /* renamed from: b */
    public final void mo91993b(Challenge challenge) {
        m116598a("challenge_click", "click_original_tag", challenge);
    }

    /* renamed from: a */
    private static List<Challenge> m116597a(User user) {
        if (user == null) {
            return null;
        }
        CommerceInfo commerceInfo = user.getCommerceInfo();
        if (commerceInfo == null) {
            return null;
        }
        return commerceInfo.getChallengeList();
    }

    /* renamed from: b */
    private static List<Challenge> m116599b(User user) {
        if (user != null && user.isStar()) {
            return user.getChallengeList();
        }
        return null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public EnterpriseChallengeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EnterpriseChallengeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f94615e = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.v3, this);
        setOrientation(1);
        this.f94611a = findViewById(R.id.a9o);
        this.f94612b = (TextView) findViewById(R.id.afd);
        this.f94613c = (RecyclerView) findViewById(R.id.afc);
        this.f94613c.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
        this.f94613c.mo5525a((C1272h) new C1272h() {
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                if (recyclerView.getAdapter() != null && RecyclerView.m5892f(view) < recyclerView.getAdapter().getItemCount() - 1) {
                    rect.right = (int) C9738o.m28708b(recyclerView.getContext(), 4.0f);
                }
            }
        });
    }

    /* renamed from: a */
    private void m116598a(String str, String str2, Challenge challenge) {
        String str3;
        if (challenge != null && this.f94616f != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("author_id", this.f94616f.getUid());
            hashMap.put("tag_id", challenge.getCid());
            C6907h.m21524a(str2, (Map) hashMap);
            Context context = getContext();
            if (mo91994b()) {
                str3 = "personal_homepage";
            } else {
                str3 = "others_homepage";
            }
            C6907h.m21521a(context, str, str3, this.f94616f.getUid(), challenge.getCid(), (JSONObject) null);
        }
    }

    /* renamed from: a */
    public final void mo91991a(Activity activity, final User user, boolean z) {
        this.f94616f = user;
        setVisibility(8);
        if (user != null) {
            List<Challenge> a = m116597a(user);
            List<Challenge> b = m116599b(user);
            if (!C6307b.m19566a((Collection<T>) a)) {
                setVisibility(0);
                this.f94612b.setText(R.string.b1e);
                this.f94615e = a;
                this.f94614d = new EnterpriseChallengeAdapter(activity, this.f94615e, new C36688z() {
                    /* renamed from: a */
                    public final void mo91997a(Context context, Challenge challenge) {
                        EnterpriseChallengeLayout.this.mo91992a(challenge);
                    }

                    /* renamed from: b */
                    public final void mo91998b(Context context, Challenge challenge) {
                        EnterpriseChallengeLayout.this.mo91993b(challenge);
                    }

                    /* renamed from: a */
                    public final void mo91996a(Activity activity, Challenge challenge) {
                        String str;
                        String str2;
                        C7195s a = C7195s.m22438a();
                        StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                        sb.append(challenge.getCid());
                        C7203u a2 = C7203u.m22460a(sb.toString());
                        String str3 = "extra_challenge_from";
                        if (EnterpriseChallengeLayout.this.mo91994b()) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        C7203u a3 = a2.mo18694a(str3, str).mo18694a("extra_enterprise_challenge_uid", user.getUid()).mo18693a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType());
                        String str4 = "is_commerce";
                        if (C25242ao.m82976b(challenge)) {
                            str2 = "1";
                        } else {
                            str2 = "0";
                        }
                        a.mo18679a(activity, a3.mo18694a(str4, str2).mo18695a());
                    }
                });
                this.f94613c.setAdapter(this.f94614d);
            } else if (!C6307b.m19566a((Collection<T>) b)) {
                setVisibility(0);
                this.f94615e = b;
                this.f94612b.setText(R.string.de3);
                this.f94614d = new EnterpriseChallengeAdapter(activity, this.f94615e, new C36688z() {
                    /* renamed from: a */
                    public final void mo91997a(Context context, Challenge challenge) {
                    }

                    /* renamed from: b */
                    public final void mo91998b(Context context, Challenge challenge) {
                    }

                    /* renamed from: a */
                    public final void mo91996a(Activity activity, Challenge challenge) {
                        String str;
                        String str2;
                        C7195s a = C7195s.m22438a();
                        StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                        sb.append(challenge.getCid());
                        C7203u a2 = C7203u.m22460a(sb.toString());
                        String str3 = "extra_challenge_from";
                        if (EnterpriseChallengeLayout.this.mo91994b()) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        C7203u a3 = a2.mo18694a(str3, str).mo18693a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType());
                        String str4 = "is_commerce";
                        if (C25242ao.m82976b(challenge)) {
                            str2 = "1";
                        } else {
                            str2 = "0";
                        }
                        a.mo18679a(activity, a3.mo18694a(str4, str2).mo18695a());
                    }
                });
                this.f94613c.setAdapter(this.f94614d);
            }
            if (getVisibility() == 0 && this.f94611a != null && z) {
                this.f94611a.setVisibility(0);
            }
        }
    }
}
