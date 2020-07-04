package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.friends.api.C30030b;
import com.p280ss.android.ugc.aweme.friends.api.RecommendApi;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.friends.p1285ui.RecomendFriendItemView.C30127a;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendFriendActivity */
public class RecommendFriendActivity extends AmeActivity implements OnClickListener, C30127a {

    /* renamed from: a */
    public RecommendFriendAdapter f79289a;

    /* renamed from: b */
    private RecyclerView f79290b;

    /* renamed from: c */
    private TextView f79291c;

    /* renamed from: d */
    private C36031j f79292d;

    /* renamed from: e */
    private ImageView f79293e;

    /* renamed from: f */
    private TextView f79294f;

    /* renamed from: g */
    private List<User> f79295g;

    /* renamed from: h */
    private RecommendApi f79296h;

    public boolean isRegisterEventBus() {
        return true;
    }

    /* renamed from: a */
    private void m98720a() {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                RecommendFriendActivity.this.finish();
                RecommendFriendActivity.this.dismissProgressDialog();
            }
        });
    }

    /* renamed from: c */
    private List<User> m98725c() {
        List subList = this.f79289a.mo62312a().subList(this.f79295g.size(), this.f79289a.mo62312a().size());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < subList.size(); i++) {
            User user = (User) subList.get(i);
            if (user != null && user.getFollowStatus() == 1) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m98726d() {
        if (this.f79289a != null && !C6307b.m19566a((Collection<T>) this.f79289a.mo62312a())) {
            boolean z = false;
            Iterator it = this.f79289a.mo62312a().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((User) it.next()).getFollowStatus() == 1) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                C6907h.onEvent(MobClick.obtain().setEventName("follow_skip").setLabelName("recommend"));
            }
        }
    }

    /* renamed from: b */
    private void m98723b() {
        C6907h.onEvent(MobClick.obtain().setEventName("follow_default_count").setLabelName("recommend").setValue(String.valueOf(m98719a(this.f79295g).size())).setJsonObject(new C6909j().mo16966a("uid", m98722b(m98719a(this.f79295g))).mo16967a()));
        C6907h.onEvent(MobClick.obtain().setEventName("follow_manual_count").setLabelName("recommend").setValue(String.valueOf(m98725c().size())).setJsonObject(new C6909j().mo16966a("uid", m98722b(m98725c())).mo16967a()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo76573a(C1592h hVar) throws Exception {
        m98723b();
        return null;
    }

    /* renamed from: a */
    private static List<User> m98719a(List<User> list) {
        ArrayList arrayList = new ArrayList();
        if (C6307b.m19566a((Collection<T>) list)) {
            return arrayList;
        }
        for (User user : list) {
            if (1 == user.getFollowStatus()) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo76574b(C1592h hVar) throws Exception {
        if (hVar.mo6889d()) {
            m98720a();
        } else {
            final RecommendList recommendList = (RecommendList) hVar.mo6890e();
            this.f79295g = m98719a(recommendList.getUserList());
            if (C6307b.m19566a((Collection<T>) recommendList.getUserList())) {
                m98720a();
                return null;
            }
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    RecommendFriendActivity.this.f79289a.mo58045a(recommendList.getUserList());
                    RecommendFriendActivity.this.dismissProgressDialog();
                }
            });
        }
        return null;
    }

    /* renamed from: b */
    private static String m98722b(List<User> list) {
        StringBuilder sb;
        if (C6307b.m19566a((Collection<T>) list)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (User uid : list) {
            sb2.append(uid.getUid());
            sb2.append(",");
        }
        if (sb2.length() > 0) {
            sb = new StringBuilder(sb2.substring(0, sb2.length() - 1));
        } else {
            sb = sb2;
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static Pair<String, String> m98724c(List<User> list) {
        StringBuilder sb;
        StringBuilder sb2;
        if (C6307b.m19566a((Collection<T>) list)) {
            return new Pair<>("", "");
        }
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        for (User user : list) {
            sb3.append(user.getUid());
            sb3.append(",");
            sb4.append(user.getSecUid());
            sb4.append(",");
        }
        if (sb3.length() > 0) {
            sb = new StringBuilder(sb3.substring(0, sb3.length() - 1));
        } else {
            sb = sb3;
        }
        if (sb4.length() > 0) {
            sb2 = new StringBuilder(sb4.substring(0, sb4.length() - 1));
        } else {
            sb2 = sb4;
        }
        return new Pair<>(sb.toString(), sb2.toString());
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.e6p) {
            m98721a(1, this.f79289a.mo62312a());
            m98720a();
        } else if (id == R.id.d_u) {
            m98720a();
            C6907h.onEvent(MobClick.obtain().setEventName("follow_finish").setLabelName("recommend"));
            m98723b();
            m98726d();
        } else {
            if (id == R.id.b7g) {
                m98720a();
                C6907h.onEvent(MobClick.obtain().setEventName("follow_close").setLabelName("recommend"));
                m98723b();
                m98726d();
            }
        }
    }

    @C7709l
    public void onProfileFollowEvent(C23661d dVar) {
        if (isViewValid() && (dVar.f62380b instanceof User) && this.f79289a != null) {
            User user = (User) dVar.f62380b;
            List a = this.f79289a.mo62312a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                User user2 = (User) a.get(i);
                if (TextUtils.equals(user2.getUid(), user.getUid())) {
                    user2.setFollowStatus(dVar.f62379a);
                    this.f79289a.notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo76564a(User user) {
        int i;
        if (isViewValid()) {
            if (!C30178y.m98804a(this)) {
                C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
                return;
            }
            if (user.getFollowStatus() != 0) {
                i = 1;
            } else {
                i = 0;
            }
            int i2 = i ^ 1;
            if (this.f79292d != null) {
                this.f79292d.mo91679a(new C36034a().mo91684a(user.getUid()).mo91686b(user.getSecUid()).mo91682a(i2).mo91685b(1).mo91689d(user.getFollowerStatus()).mo91681a());
                if (i2 == 0) {
                    C6907h.onEvent(MobClick.obtain().setEventName("follow_cancel").setLabelName("recommend").setValue(user.getUid()));
                } else {
                    C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("recommend").setValue(user.getUid()));
                    new C33280v().mo85341b("recommend").mo85348g(user.getUid()).mo85252e();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.eg);
        this.f79290b = (RecyclerView) findViewById(R.id.cqd);
        this.f79291c = (TextView) findViewById(R.id.e6p);
        this.f79294f = (TextView) findViewById(R.id.d_u);
        this.f79293e = (ImageView) findViewById(R.id.b7g);
        this.f79289a = new RecommendFriendAdapter();
        this.f79289a.f79300a = this;
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        wrapLinearLayoutManager.mo5427b(1);
        this.f79290b.setLayoutManager(wrapLinearLayoutManager);
        this.f79290b.setOverScrollMode(2);
        this.f79290b.setHasFixedSize(true);
        this.f79290b.setAdapter(this.f79289a);
        this.f79291c.setOnClickListener(this);
        this.f79294f.setOnClickListener(this);
        this.f79293e.setOnClickListener(this);
        this.f79292d = new C36031j();
        this.f79296h = C30030b.m98492a();
        showProgressDialog();
        this.f79296h.recommendList(null, null, null, Integer.valueOf(3), null, Integer.valueOf(C43161e.m136882a()), C34202f.m110435a().mo86949b(), Integer.valueOf(C43161e.m136884b()), null).mo6876a((C1591g<TResult, TContinuationResult>) new C30176w<TResult,TContinuationResult>(this), C1592h.f5958b);
        this.f79296h.modifyUser(0);
    }

    /* renamed from: a */
    private void m98721a(int i, List<User> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            finish();
            return;
        }
        Pair c = m98724c(list);
        this.f79296h.followUsers((String) c.first, (String) c.second, 1).mo6886c(new C30177x(this), C1592h.f5958b);
        C6907h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("recommend_all"));
        new C33280v().mo85341b("recommend_all").mo85252e();
    }
}
