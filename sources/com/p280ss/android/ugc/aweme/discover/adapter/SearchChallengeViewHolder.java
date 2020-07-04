package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchChallengeAdData;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder */
public class SearchChallengeViewHolder extends AbsSearchViewHolder {

    /* renamed from: c */
    C1293v f69668c;
    ViewStub cardViewStub;

    /* renamed from: d */
    Challenge f69669d;

    /* renamed from: e */
    boolean f69670e;

    /* renamed from: f */
    String f69671f;

    /* renamed from: g */
    public String f69672g;

    /* renamed from: h */
    C26437a f69673h;

    /* renamed from: i */
    private ViewGroup f69674i;

    /* renamed from: j */
    private String f69675j;
    TextView mTvChallengeName;
    TextView mTvPartCnt;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder$a */
    public interface C26437a {
        /* renamed from: a */
        void mo68032a(Challenge challenge, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder$b */
    protected static class C26438b implements OnAttachStateChangeListener, Runnable {

        /* renamed from: a */
        private final View f69679a;

        /* renamed from: b */
        private final String f69680b;

        /* renamed from: c */
        private SearchChallengeAdData f69681c;

        /* renamed from: d */
        private boolean f69682d;

        /* renamed from: e */
        private boolean f69683e;

        public final void run() {
            if (this.f69682d) {
                if (this.f69681c != null) {
                    if (!C23487o.m77156c(this.f69679a)) {
                        this.f69683e = false;
                    } else if (!this.f69683e) {
                        this.f69683e = true;
                    }
                }
                this.f69679a.postDelayed(this, 500);
            }
        }

        public final void onViewAttachedToWindow(View view) {
            this.f69682d = true;
            this.f69683e = false;
            run();
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f69682d = false;
            this.f69683e = false;
            this.f69679a.removeCallbacks(this);
        }

        /* renamed from: a */
        private void m86984a(SearchChallengeAdData searchChallengeAdData) {
            if (this.f69681c != searchChallengeAdData) {
                if (searchChallengeAdData == null) {
                    this.f69681c = null;
                    return;
                }
                this.f69681c = searchChallengeAdData;
                this.f69683e = false;
                run();
            }
        }

        private C26438b(View view, String str) {
            this.f69679a = view;
            this.f69680b = str;
        }

        /* renamed from: a */
        public static void m86983a(View view, String str) {
            C26438b bVar = new C26438b(view, str);
            view.addOnAttachStateChangeListener(bVar);
            view.setTag(R.id.d0k, bVar);
        }

        /* renamed from: a */
        public static void m86982a(View view, SearchChallengeAdData searchChallengeAdData) {
            Object tag = view.getTag(R.id.d0k);
            if (tag instanceof C26438b) {
                ((C26438b) tag).m86984a(searchChallengeAdData);
            }
        }
    }

    /* renamed from: d */
    public final View mo67902d() {
        return this.itemView;
    }

    /* renamed from: e */
    public final Map<String, String> mo67903e() {
        Map<String, String> e = super.mo67903e();
        if (C6399b.m19944t()) {
            e.put("token_type", "hot_challenge");
            e.put("hashtags_name", this.f69669d.getChallengeName());
            e.put("search_result_id", this.f69669d.getCid());
        }
        e.put("is_aladdin", "1");
        return e;
    }

    /* renamed from: f */
    public final Map<String, String> mo67904f() {
        Map<String, String> f = super.mo67904f();
        if (C6399b.m19944t()) {
            f.put("token_type", "hot_challenge");
            f.put("hashtags_name", this.f69669d.getChallengeName());
            f.put("search_result_id", this.f69669d.getCid());
            f.put("search_result_id", this.f69669d.getCid());
        }
        f.put("is_aladdin", "1");
        return f;
    }

    /* renamed from: a */
    public final void mo67897a(Map<String, String> map) {
        super.mo67897a(map);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68028a(SearchChallenge searchChallenge) {
        if (C6399b.m19945u() || !searchChallenge.hasAwemeList()) {
            if (this.f69674i != null) {
                this.f69674i.setVisibility(8);
            }
            return;
        }
        if (this.f69674i == null) {
            this.f69674i = (ViewGroup) this.cardViewStub.inflate();
        }
        if (this.f69674i != null) {
            if (this.f69668c == null) {
                this.f69668c = C37385g.f97617a.getChallendgeAladdinCard(this.f69674i, searchChallenge);
            }
            if (this.f69674i != null) {
                this.f69674i.setVisibility(0);
                this.f69674i.setPadding(0, (int) C9738o.m28708b(mo67898b(), 4.0f), 0, 0);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("token_type", "hot_challenge");
            if (searchChallenge != null) {
                hashMap.put("search_result_id", searchChallenge.getChallenge().getCid());
                hashMap.put("hashtags_name", searchChallenge.getChallenge().getChallengeName());
                hashMap.put("rank", "0");
            }
            mo67897a((Map<String, String>) hashMap);
            this.f69670e = true;
        }
    }

    /* renamed from: a */
    public final void mo68030a(SuggestChallenge suggestChallenge, String str) {
        if (suggestChallenge != null && suggestChallenge.challenge != null) {
            this.f69671f = str;
            this.f69669d = suggestChallenge.challenge;
            this.mTvPartCnt.setText(this.itemView.getContext().getString(R.string.zb, new Object[]{C30537o.m99738a(this.f69669d.getDisplayCount())}));
            this.mTvChallengeName.setText(this.f69669d.getChallengeName());
        }
    }

    /* renamed from: a */
    public void mo68029a(SearchChallenge searchChallenge, String str) {
        if (searchChallenge != null) {
            this.f69671f = str;
            if (searchChallenge.getChallenge() != null) {
                this.f69669d = searchChallenge.getChallenge();
            }
            this.mTvPartCnt.setText(this.itemView.getContext().getString(R.string.zb, new Object[]{C30537o.m99738a(this.f69669d.getDisplayCount())}));
            this.mTvChallengeName.setText(C23472a.m77059a(this.mTvChallengeName.getContext(), this.f69669d.getChallengeName(), searchChallenge.getPosition()));
            C26438b.m86982a(this.itemView, searchChallenge.getAdData());
            mo68028a(searchChallenge);
        }
    }

    public SearchChallengeViewHolder(final View view, final String str, C26437a aVar, String str2) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f69671f = str;
        this.f69673h = aVar;
        this.f69675j = str2;
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                String str;
                int i;
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view)) {
                    C25242ao.m82972a(SearchChallengeViewHolder.this.f69669d);
                    int adapterPosition = SearchChallengeViewHolder.this.getAdapterPosition();
                    String uuid = UUID.randomUUID().toString();
                    if (SearchChallengeViewHolder.this.f69673h == null) {
                        View view2 = view;
                        String b = SearchChallengeViewHolder.this.mo67895a().mo68129b();
                        if (SearchChallengeViewHolder.this.f69405b.f69897a) {
                            i = 3;
                        } else {
                            i = 2;
                        }
                        C26780aa.m87958a(view2, adapterPosition, b, i, SearchChallengeViewHolder.this.f69669d.getRequestId(), SearchChallengeViewHolder.this.f69669d.getCid(), C26780aa.m87952a(str), uuid);
                    } else {
                        SearchChallengeViewHolder.this.f69673h.mo68032a(SearchChallengeViewHolder.this.f69669d, adapterPosition);
                    }
                    C7195s a = C7195s.m22438a();
                    StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                    sb.append(SearchChallengeViewHolder.this.f69669d.getCid());
                    C7203u a2 = C7203u.m22460a(sb.toString()).mo18694a("enter_from", SearchChallengeViewHolder.this.f69672g).mo18694a("process_id", uuid);
                    String str2 = "is_commerce";
                    if (C25242ao.m82976b(SearchChallengeViewHolder.this.f69669d)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    a.mo18682a(a2.mo18694a(str2, str).mo18693a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", SearchChallengeViewHolder.this.f69669d.getSubType()).mo18695a());
                    if (SearchChallengeViewHolder.this.f69670e) {
                        SearchChallengeViewHolder.this.mo67900b(SearchChallengeViewHolder.this.mo67904f());
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static SearchChallengeViewHolder m86973a(ViewGroup viewGroup, String str, C26437a aVar, String str2) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_challenge, viewGroup, false);
        C26438b.m86983a(inflate, str2);
        return new SearchChallengeViewHolder(inflate, str, aVar, str2);
    }
}
