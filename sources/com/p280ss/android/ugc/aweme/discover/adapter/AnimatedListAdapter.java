package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.p1084c.C23671a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.discover.model.Category;
import com.p280ss.android.ugc.aweme.discover.speed.C26874a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.music.presenter.C33809j;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.AnimatedListAdapter */
public class AnimatedListAdapter extends AnimatedAdapter implements C23685d {

    /* renamed from: e */
    public C26373b f69408e;

    /* renamed from: f */
    public Category f69409f;

    /* renamed from: g */
    public int f69410g;

    /* renamed from: h */
    public String f69411h;

    /* renamed from: i */
    public boolean f69412i = true;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.AnimatedListAdapter$a */
    static class C26371a extends C1293v {
        C26371a(View view, final C26373b bVar) {
            super(view);
            view.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (bVar != null) {
                        bVar.mo67906a();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.AnimatedListAdapter$b */
    public interface C26373b {
        /* renamed from: a */
        void mo67906a();
    }

    /* renamed from: a */
    public final void mo62313a(C1293v vVar) {
    }

    /* renamed from: f */
    private String m86723f() {
        StringBuilder sb = new StringBuilder();
        if (!C6307b.m19566a((Collection<T>) this.f67539l)) {
            for (int i = 0; i < this.f67539l.size(); i++) {
                Aweme aweme = (Aweme) this.f67539l.get(i);
                if (aweme != null) {
                    if (i < this.f67539l.size() - 1) {
                        sb.append(aweme.getAid());
                        sb.append(",");
                    } else {
                        sb.append(aweme.getAid());
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        if (!C43122ff.m136767b()) {
            return new C26371a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ub, viewGroup, false), this.f69408e);
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new LayoutParams((int) C9738o.m28708b(viewGroup.getContext(), 14.0f), -1));
        return new C26371a(view, null);
    }

    /* renamed from: b */
    public final C1293v mo61146b(ViewGroup viewGroup, int i) {
        return new CoverViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.t9, viewGroup, false), this);
    }

    /* renamed from: b */
    public final void mo61148b(C1293v vVar, int i) {
        CoverViewHolder coverViewHolder = (CoverViewHolder) vVar;
        coverViewHolder.mo66491a((Aweme) this.f67539l.get(i), i);
        coverViewHolder.mo66497c(this.f69412i);
    }

    /* renamed from: a */
    public final void mo61615a(View view, Aweme aweme, String str) {
        String str2;
        int i;
        C25673a aVar;
        String str3;
        String str4;
        String str5;
        if (aweme != null) {
            if (this.f69410g == 2) {
                if (C43122ff.m136767b()) {
                    str2 = "from_challenge_children_mode";
                } else {
                    str2 = "from_discovery_challenge";
                }
                str3 = "challenge_id";
                aVar = new C23671a();
                C26874a.m88182a(aVar, this.f67539l);
                if (this.f69409f != null && this.f69409f.isAd()) {
                    C24976t.m82043a(view.getContext(), this.f69409f, aweme.getAid());
                }
                i = 2;
            } else {
                if (C43122ff.m136767b()) {
                    str5 = "from_music_children_mode";
                } else {
                    str5 = "from_music";
                }
                str2 = str5;
                str3 = "music_id";
                i = 0;
                aVar = new C33809j();
                C26874a.m88182a(aVar, this.f67539l);
            }
            if (this.f69409f != null) {
                if (this.f69410g == 2 && this.f69409f.getChallenge() != null) {
                    C6907h.m21524a("feed_enter", (Map) new C22984d().mo59973a("enter_from", "discovery").mo59973a("tag_id", this.f69409f.getChallenge().getCid()).f60753a);
                } else if (this.f69410g == 1 && this.f69409f.getMusic() != null) {
                    C6907h.m21524a("feed_enter", (Map) new C22984d().mo59973a("enter_from", "discovery").mo59973a("music_id", this.f69409f.getMusic().getMid()).f60753a);
                }
            }
            C28503s.m93679a(aVar);
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(aweme.getAid());
            C7203u a = C7203u.m22460a(sb.toString()).mo18694a("refer", "discovery").mo18694a("video_from", str2).mo18693a("video_type", i).mo18693a("profile_enterprise_type", aweme.getEnterpriseType()).mo18694a(str3, this.f69411h);
            if (C43122ff.m136767b()) {
                a.mo18694a("ids", m86723f());
            }
            C7195s.m22438a().mo18682a(a.mo18695a());
            if (TextUtils.equals(str2, "from_discovery_challenge")) {
                str4 = "challenge";
            } else {
                str4 = "music";
            }
            C6907h.onEvent(MobClick.obtain().setEventName("cell_click").setLabelName("video_click").setValue(aweme.getAid()).setJsonObject(new C6869c().mo16887a("cell_type", str4).mo16888b()));
        }
    }
}
