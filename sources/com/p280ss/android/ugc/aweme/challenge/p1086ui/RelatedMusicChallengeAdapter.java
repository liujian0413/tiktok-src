package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicDetailActivity;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter */
public class RelatedMusicChallengeAdapter extends C1262a<TagViewHolder> {

    /* renamed from: a */
    List<RelatedChallengeMusic> f62629a;

    /* renamed from: b */
    public String f62630b;

    /* renamed from: c */
    public Context f62631c;

    /* renamed from: d */
    public String f62632d;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter$TagViewHolder */
    static class TagViewHolder extends C1293v {
        LinearLayout llRelated;
        TextView txtName;

        TagViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter$TagViewHolder_ViewBinding */
    public class TagViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private TagViewHolder f62636a;

        public void unbind() {
            TagViewHolder tagViewHolder = this.f62636a;
            if (tagViewHolder != null) {
                this.f62636a = null;
                tagViewHolder.txtName = null;
                tagViewHolder.llRelated = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public TagViewHolder_ViewBinding(TagViewHolder tagViewHolder, View view) {
            this.f62636a = tagViewHolder;
            tagViewHolder.txtName = (TextView) Utils.findRequiredViewAsType(view, R.id.c37, "field 'txtName'", TextView.class);
            tagViewHolder.llRelated = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.crc, "field 'llRelated'", LinearLayout.class);
        }
    }

    public int getItemCount() {
        if (C6307b.m19566a((Collection<T>) this.f62629a)) {
            return 0;
        }
        return this.f62629a.size();
    }

    public int getItemViewType(int i) {
        RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) this.f62629a.get(i);
        if (relatedChallengeMusic != null) {
            int i2 = relatedChallengeMusic.categoryType;
            if (i2 == 1) {
                return 1;
            }
            if (i2 == 2) {
                return 2;
            }
        }
        return super.getItemViewType(i);
    }

    public RelatedMusicChallengeAdapter(List<RelatedChallengeMusic> list, Context context) {
        this.f62629a = list;
        this.f62631c = context;
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m77870a(viewGroup, i);
    }

    /* renamed from: a */
    private static TagViewHolder m77870a(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            view = from.inflate(R.layout.i_, viewGroup, false);
        } else {
            view = from.inflate(R.layout.afg, viewGroup, false);
        }
        return new TagViewHolder(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(TagViewHolder tagViewHolder, int i) {
        final int itemViewType = getItemViewType(i);
        final RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) this.f62629a.get(i);
        if (relatedChallengeMusic != null) {
            if (itemViewType == 2) {
                Challenge challenge = relatedChallengeMusic.challenge;
                if (challenge != null) {
                    tagViewHolder.txtName.setText(challenge.getChallengeName());
                }
            } else if (itemViewType == 1) {
                Music music = relatedChallengeMusic.music;
                if (music != null) {
                    tagViewHolder.txtName.setText(music.getMusicName());
                }
            }
            tagViewHolder.llRelated.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (itemViewType == 1) {
                        Music music = relatedChallengeMusic.music;
                        if (C6399b.m19944t() && music != null) {
                            if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(music.convertToMusicModel(), RelatedMusicChallengeAdapter.this.f62631c, true)) {
                                return;
                            }
                        }
                        if (music != null) {
                            C6907h.onEvent(MobClick.obtain().setEventName("choose_music").setLabelName(RelatedMusicChallengeAdapter.this.f62632d).setValue(music.getMid()).setJsonObject(new C6869c().mo16887a("host", RelatedMusicChallengeAdapter.this.f62630b).mo16888b()));
                            MusicDetailActivity.m109060a(RelatedMusicChallengeAdapter.this.f62631c, music.getMid(), "from_related_tag");
                        }
                        return;
                    }
                    if (itemViewType == 2) {
                        Challenge challenge = relatedChallengeMusic.challenge;
                        if (challenge != null) {
                            C25242ao.m82972a(challenge);
                            C6907h.onEvent(MobClick.obtain().setEventName("choose_challenge").setLabelName(RelatedMusicChallengeAdapter.this.f62632d).setValue(challenge.getCid()).setJsonObject(new C6869c().mo16887a("host", RelatedMusicChallengeAdapter.this.f62630b).mo16888b()));
                            if (C6399b.m19944t()) {
                                ChallengeDetailActivity.m77713a(RelatedMusicChallengeAdapter.this.f62631c, challenge.getCid(), "from_related_tag");
                                return;
                            }
                            ChallengeDetailActivity.m77714a(RelatedMusicChallengeAdapter.this.f62631c, challenge.getCid(), "from_related_tag", challenge.getSubType(), false);
                        }
                    }
                }
            });
        }
    }
}
