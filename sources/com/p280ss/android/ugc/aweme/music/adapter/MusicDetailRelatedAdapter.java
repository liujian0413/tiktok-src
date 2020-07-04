package com.p280ss.android.ugc.aweme.music.adapter;

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
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicDetailRelatedAdapter */
public class MusicDetailRelatedAdapter extends C1262a<TagViewHolder> {

    /* renamed from: a */
    List<RelatedChallengeMusic> f87978a;

    /* renamed from: b */
    public String f87979b;

    /* renamed from: c */
    public Context f87980c;

    /* renamed from: d */
    public String f87981d;

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicDetailRelatedAdapter$TagViewHolder */
    static class TagViewHolder extends C1293v {
        LinearLayout llRelated;
        TextView txtName;

        TagViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicDetailRelatedAdapter$TagViewHolder_ViewBinding */
    public class TagViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private TagViewHolder f87985a;

        public void unbind() {
            TagViewHolder tagViewHolder = this.f87985a;
            if (tagViewHolder != null) {
                this.f87985a = null;
                tagViewHolder.txtName = null;
                tagViewHolder.llRelated = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public TagViewHolder_ViewBinding(TagViewHolder tagViewHolder, View view) {
            this.f87985a = tagViewHolder;
            tagViewHolder.txtName = (TextView) Utils.findRequiredViewAsType(view, R.id.c37, "field 'txtName'", TextView.class);
            tagViewHolder.llRelated = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.crc, "field 'llRelated'", LinearLayout.class);
        }
    }

    public int getItemCount() {
        if (C6307b.m19566a((Collection<T>) this.f87978a)) {
            return 0;
        }
        return this.f87978a.size();
    }

    public int getItemViewType(int i) {
        RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) this.f87978a.get(i);
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

    public MusicDetailRelatedAdapter(List<RelatedChallengeMusic> list, Context context) {
        this.f87978a = list;
        this.f87980c = context;
    }

    public /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m108728a(viewGroup, i);
    }

    /* renamed from: a */
    private static TagViewHolder m108728a(ViewGroup viewGroup, int i) {
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
        final RelatedChallengeMusic relatedChallengeMusic = (RelatedChallengeMusic) this.f87978a.get(i);
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
                            if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(music.convertToMusicModel(), MusicDetailRelatedAdapter.this.f87980c, true)) {
                                return;
                            }
                        }
                        if (music != null) {
                            C6907h.onEvent(MobClick.obtain().setEventName("choose_music").setLabelName(MusicDetailRelatedAdapter.this.f87981d).setValue(music.getMid()).setJsonObject(new C6869c().mo16887a("host", MusicDetailRelatedAdapter.this.f87979b).mo16888b()));
                            SmartRouter.buildRoute(view.getContext(), "aweme://music/detail/").withParam("id", music.getMid()).withParam("extra_music_from", "from_related_tag").open();
                        }
                        return;
                    }
                    if (itemViewType == 2) {
                        Challenge challenge = relatedChallengeMusic.challenge;
                        if (challenge != null) {
                            C25242ao.m82972a(challenge);
                            C6907h.onEvent(MobClick.obtain().setEventName("choose_challenge").setLabelName(MusicDetailRelatedAdapter.this.f87981d).setValue(challenge.getCid()).setJsonObject(new C6869c().mo16887a("host", MusicDetailRelatedAdapter.this.f87979b).mo16888b()));
                            if (C6399b.m19944t()) {
                                SmartRouter.buildRoute(MusicDetailRelatedAdapter.this.f87980c, "//challenge/detail").withParam("aweme_id", "").withParam("id", challenge.getCid()).withParam("extra_challenge_from", "from_related_tag").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("extra_challenge_is_hashtag", false).open();
                                return;
                            }
                            SmartRouter.buildRoute(MusicDetailRelatedAdapter.this.f87980c, "//challenge/detail").withParam("aweme_id", "").withParam("id", challenge.getCid()).withParam("extra_challenge_from", "from_related_tag").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", challenge.getSubType()).withParam("extra_challenge_is_hashtag", false).open();
                        }
                    }
                }
            });
        }
    }
}
