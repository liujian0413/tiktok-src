package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.following.p1265ui.FollowingFollowerActivity.C29667a;
import com.p280ss.android.ugc.aweme.following.p1265ui.SimpleUserFragment.PageType;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendFriendsTitleHolder */
public class RecommendFriendsTitleHolder extends C1293v {

    /* renamed from: a */
    public boolean f79303a;

    /* renamed from: b */
    public TextView f79304b;

    /* renamed from: c */
    public View f79305c;

    /* renamed from: d */
    private View f79306d;

    /* renamed from: e */
    private View f79307e;

    /* renamed from: f */
    private TextView f79308f;

    /* renamed from: g */
    private View f79309g;

    /* renamed from: h */
    private TextView f79310h;

    /* renamed from: b */
    private void m98737b() {
        this.f79304b.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            view.setAlpha(0.5f);
                            break;
                        case 1:
                            break;
                    }
                }
                view.setAlpha(1.0f);
                return false;
            }
        });
    }

    /* renamed from: c */
    private void m98738c() {
        this.f79310h.setVisibility(8);
        this.f79309g.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo76583a() {
        if (C6399b.m19946v()) {
            m98738c();
        } else {
            this.f79307e.setVisibility(4);
        }
    }

    /* renamed from: a */
    private void m98736a(int i) {
        this.f79310h.setText(String.valueOf(i));
        this.f79310h.setVisibility(0);
        this.f79309g.setVisibility(0);
    }

    public RecommendFriendsTitleHolder(View view) {
        super(view);
        this.f79306d = view.findViewById(R.id.c3u);
        this.f79307e = view.findViewById(R.id.c3w);
        this.f79309g = view.findViewById(R.id.c3v);
        this.f79310h = (TextView) view.findViewById(R.id.c3t);
        this.f79308f = (TextView) view.findViewById(R.id.e7c);
        this.f79304b = (TextView) view.findViewById(R.id.fg);
        this.f79305c = view.findViewById(R.id.cjt);
        m98737b();
    }

    /* renamed from: a */
    public final void mo76584a(boolean z, int i, int i2, boolean z2, String str) {
        TextView textView;
        int i3;
        this.f79303a = z;
        if (z2) {
            textView = this.f79308f;
            i3 = R.string.b7w;
        } else {
            textView = this.f79308f;
            if (z) {
                i3 = R.string.ck2;
            } else {
                i3 = R.string.hx;
            }
        }
        textView.setText(i3);
        if (C6399b.m19946v()) {
            this.f79306d.setVisibility(8);
            this.f79307e.setVisibility(4);
            if (z) {
                m98736a(i2);
            } else {
                m98738c();
            }
        } else {
            m98738c();
            if (!z || i == 5 || i == 6) {
                this.f79306d.setVisibility(8);
                this.f79307e.setVisibility(4);
            } else if (z2) {
                this.f79306d.setVisibility(8);
                this.f79307e.setVisibility(8);
            } else {
                this.f79306d.setVisibility(0);
                this.f79307e.setVisibility(0);
            }
            if (z2) {
                this.f79304b.setVisibility(0);
                this.f79304b.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        User curUser = C21115b.m71197a().getCurUser();
                        C29667a aVar = new C29667a(RecommendFriendsTitleHolder.this.f79304b.getContext(), null, C21115b.m71197a().getCurUserId(), true, PageType.follower, 1);
                        aVar.mo75664a(curUser).mo75665a();
                    }
                });
            } else {
                this.f79304b.setOnClickListener(null);
                this.f79304b.setVisibility(8);
            }
            if (!C7213d.m22500a().mo18742aE()) {
                this.f79305c.setVisibility(8);
                return;
            }
            if (!z2) {
                this.f79305c.setVisibility(0);
                this.f79305c.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        HashMap hashMap = new HashMap();
                        hashMap.put("enter_from", "find_friends");
                        C6907h.m21524a("click_privacy_tips", (Map) hashMap);
                        String str = (String) SharePrefCache.inst().getPrivacyReminderH5Url().mo59877d();
                        if (str != null) {
                            Intent intent = new Intent(RecommendFriendsTitleHolder.this.f79305c.getContext(), CrossPlatformActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("show_load_dialog", true);
                            intent.putExtra("hide_nav_bar", false);
                            intent.putExtra("use_webview_title", true);
                            intent.putExtras(bundle);
                            intent.setData(Uri.parse(str));
                            RecommendFriendsTitleHolder.this.f79305c.getContext().startActivity(intent);
                        }
                    }
                });
            }
        }
    }
}
