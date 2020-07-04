package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.model.suggest.SuggestMusic;
import com.p280ss.android.ugc.aweme.discover.viewmodel.SuggestMusicViewModel;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.search.C37380c;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicIntermediateFragment */
public final class MusicIntermediateFragment extends SearchIntermediateFragment<SuggestMusic> {

    /* renamed from: e */
    private SuggestMusicViewModel f71023e;

    /* renamed from: f */
    private final C0053p<C26568a<List<SuggestMusic>>> f71024f = new C26908a(this);

    /* renamed from: g */
    private HashMap f71025g;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.MusicIntermediateFragment$a */
    static final class C26908a<T> implements C0053p<C26568a<List<? extends SuggestMusic>>> {

        /* renamed from: a */
        final /* synthetic */ MusicIntermediateFragment f71026a;

        C26908a(MusicIntermediateFragment musicIntermediateFragment) {
            this.f71026a = musicIntermediateFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C26568a<List<SuggestMusic>> aVar) {
            if (this.f71026a.isViewValid()) {
                List list = null;
                if (aVar != null && aVar.f70088a) {
                    list = aVar.f70089b;
                }
                this.f71026a.mo69721o().mo68079c(list);
                this.f71026a.mo69615a(list);
            }
        }
    }

    /* renamed from: a */
    public final String mo69547a() {
        return "music";
    }

    /* renamed from: d */
    public final int mo69549d() {
        return C27029ba.f71323e;
    }

    /* renamed from: f */
    public final void mo69551f() {
        if (this.f71025g != null) {
            this.f71025g.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo69551f();
    }

    /* renamed from: e */
    public final void mo69550e() {
        super.mo69550e();
        if (C37380c.m119975b()) {
            SuggestMusicViewModel suggestMusicViewModel = this.f71023e;
            if (suggestMusicViewModel == null) {
                C7573i.m23583a("mSuggestMusicViewModel");
            }
            suggestMusicViewModel.mo70000a();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0063u a = C0069x.m157a((Fragment) this).mo147a(SuggestMusicViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(th…sicViewModel::class.java)");
        this.f71023e = (SuggestMusicViewModel) a;
        SuggestMusicViewModel suggestMusicViewModel = this.f71023e;
        if (suggestMusicViewModel == null) {
            C7573i.m23583a("mSuggestMusicViewModel");
        }
        suggestMusicViewModel.f71767a.observe(this, this.f71024f);
    }

    /* renamed from: a */
    public final void mo69615a(List<SuggestMusic> list) {
        Collection collection = list;
        if (!C6307b.m19566a(collection)) {
            StringBuilder sb = new StringBuilder();
            if (list == null) {
                C7573i.m23580a();
            }
            int size = collection.size();
            for (int i = 0; i < size; i++) {
                Music music = ((SuggestMusic) list.get(i)).music;
                if (music == null) {
                    C7573i.m23580a();
                }
                sb.append(music.getMid());
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
            C6907h.m21524a("search_for_you_show", (Map) C22984d.m75611a().mo59973a("search_type", mo69547a()).mo59973a("music_list", sb.toString()).f60753a);
        }
    }
}
