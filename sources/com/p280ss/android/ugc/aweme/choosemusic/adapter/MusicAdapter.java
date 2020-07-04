package com.p280ss.android.ugc.aweme.choosemusic.adapter;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23844b;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23851c;
import com.p280ss.android.ugc.aweme.choosemusic.p1089c.C23852d;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23963h;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemNoLyricViewHolder;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.SearchMusicWithLyricViewHolder;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.p280ss.android.ugc.aweme.music.p1409c.C33783c;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.music.p1410ui.C34018y.C34026a;
import com.p280ss.android.ugc.aweme.music.service.ISearchMusicDepentService;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.MusicAdapter */
public class MusicAdapter extends BaseAdapter<MusicModel> {

    /* renamed from: A */
    private C1264c f62917A = new C1264c() {
        /* renamed from: a */
        public final void mo5721a() {
            super.mo5721a();
            MusicAdapter.this.mo61890d();
        }

        /* renamed from: a */
        public final void mo5722a(int i, int i2) {
            MusicAdapter.this.mo61890d();
        }

        /* renamed from: b */
        public final void mo5725b(int i, int i2) {
            MusicAdapter.this.mo61890d();
        }

        /* renamed from: c */
        public final void mo5726c(int i, int i2) {
            MusicAdapter.this.mo61890d();
        }

        /* renamed from: a */
        public final void mo5723a(int i, int i2, int i3) {
            MusicAdapter.this.mo61890d();
        }
    };

    /* renamed from: a */
    public C23844b f62918a;

    /* renamed from: b */
    public int f62919b = -1;

    /* renamed from: c */
    public MusicModel f62920c;

    /* renamed from: d */
    public String f62921d;

    /* renamed from: e */
    public C23819a f62922e;

    /* renamed from: f */
    public boolean f62923f;

    /* renamed from: g */
    public boolean f62924g = true;

    /* renamed from: h */
    public int f62925h;

    /* renamed from: i */
    public boolean f62926i;

    /* renamed from: j */
    public boolean f62927j;

    /* renamed from: k */
    String f62928k = "";

    /* renamed from: w */
    private C33746f<C23822c> f62929w;

    /* renamed from: x */
    private RecyclerView f62930x;

    /* renamed from: y */
    private boolean f62931y;

    /* renamed from: z */
    private C23963h f62932z = new C23963h() {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo61893a() {
            MusicAdapter.this.mo61885a(false);
        }

        /* renamed from: a */
        static final /* synthetic */ void m78076a(AVMusic aVMusic, MusicModel musicModel, DialogInterface dialogInterface, int i) {
            String str;
            if (aVMusic == null) {
                str = "";
            } else {
                str = aVMusic.mid;
            }
            C23888c.m78206c(str, musicModel.getMusicId());
        }

        /* renamed from: a */
        public final void mo61894a(MusicItemViewHolder musicItemViewHolder, View view, MusicModel musicModel, int i) {
            String str;
            String str2;
            String str3;
            String str4;
            Bundle bundle;
            if (musicModel != null && view != null && view.getContext() != null) {
                if (!TextUtils.isEmpty(musicModel.getSearchKeyWords())) {
                    MusicSearchHistory musicSearchHistory = new MusicSearchHistory(musicModel.getSearchKeyWords());
                    if (MusicAdapter.this.f62926i) {
                        C23851c.m78120c().mo61932b(musicSearchHistory);
                    } else {
                        C23852d.m78123c().mo61932b(musicSearchHistory);
                    }
                }
                if (!C23841g.m78098a(view.getContext())) {
                    C10761a.m31399c(view.getContext(), (int) R.string.cjs).mo25750a();
                    return;
                }
                int id = view.getId();
                if (id == R.id.bae) {
                    Activity g = C6405d.m19984g();
                    if (g == null) {
                        str3 = "";
                    } else {
                        str3 = g.getString(R.string.b4m);
                    }
                    if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                        Activity g2 = C6405d.m19984g();
                        String a = C23889d.m78217a(i);
                        String str5 = "click_favorite_music";
                        if (C30538p.m99745a() || TextUtils.isEmpty(str3)) {
                            bundle = null;
                        } else {
                            bundle = C42914ab.m136242a().mo104633a("login_title", str3).f111445a;
                        }
                        C32656f.m105743a(g2, a, str5, bundle);
                        return;
                    }
                    musicItemViewHolder.mo62218e();
                    C23888c.m78194a(musicItemViewHolder.f63380a, musicModel.getMusicId(), MusicAdapter.this.f62922e, musicItemViewHolder.f63383d, musicModel.getLogPb());
                    if (MusicAdapter.this.f62926i) {
                        C23888c.m78211d(MusicAdapter.this.f62921d, musicModel.getName(), musicModel.getMusicId());
                    }
                    if (TextUtils.equals("search_music", MusicAdapter.this.f62922e.f62870a) && C6399b.m19944t()) {
                        ISearchMusicDepentService iSearchMusicDepentService = (ISearchMusicDepentService) ServiceManager.get().getService(ISearchMusicDepentService.class);
                        String str6 = MusicAdapter.this.f62922e.f62870a;
                        int position = musicItemViewHolder.getPosition();
                        if (musicItemViewHolder.f63380a) {
                            str4 = "click_favourite_button";
                        } else {
                            str4 = "click_cancel_favourite";
                        }
                        iSearchMusicDepentService.mobClickMusicCardEvent(str6, musicModel, position, str4);
                    }
                    return;
                }
                if (id == R.id.bag) {
                    if (musicModel != null && musicModel.getMusicStatus() == 0 && musicModel.getMusic() != null) {
                        String offlineDesc = musicModel.getMusic().getOfflineDesc();
                        if (TextUtils.isEmpty(offlineDesc)) {
                            offlineDesc = view.getContext().getString(R.string.chd);
                        }
                        C10761a.m31410e(view.getContext(), offlineDesc).mo25750a();
                    } else if (musicModel != null && C33784d.m108931a(musicModel, view.getContext(), true)) {
                        C7195s a2 = C7195s.m22438a();
                        StringBuilder sb = new StringBuilder("aweme://music/detail/");
                        sb.append(musicModel.getMusicId());
                        a2.mo18682a(sb.toString());
                        C23888c.m78186a(MusicAdapter.this.f62922e, musicModel.getMusicId(), false);
                    }
                } else if (id == R.id.bsu) {
                    if (C33784d.m108931a(musicModel, view.getContext(), true)) {
                        if (MusicAdapter.this.f62918a != null) {
                            SharedPreferences a3 = C7285c.m22838a(view.getContext(), "av_settings.xml", 0);
                            if (!MusicAdapter.this.f62926i || !a3.getBoolean("lyric_first_click_use", true) || a3.getInt("lyric_tip_show_count", 0) >= 3) {
                                MusicAdapter.this.f62918a.mo61923b(musicModel);
                                C23888c.m78184a(MusicAdapter.this.f62922e, musicModel.getMusicId(), musicItemViewHolder.getLayoutPosition(), musicModel.getLogPb());
                            } else {
                                MusicAdapter.this.f62918a.mo61921a(musicModel);
                                AVMusic curMusic = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getCurMusic();
                                new C10741a(view.getContext()).mo25657b((int) R.string.aju).mo25658b((int) R.string.w_, (OnClickListener) new C23838d(curMusic, musicModel)).mo25650a((int) R.string.fl5, (OnClickListener) new C23839e(this, musicModel, musicItemViewHolder, curMusic)).mo25656a().mo25637a().show();
                                a3.edit().putBoolean("lyric_first_click_use", false).apply();
                                int i2 = a3.getInt("lyric_tip_show_count", 0);
                                if (i2 < 3) {
                                    a3.edit().putInt("lyric_tip_show_count", i2 + 1).apply();
                                }
                                if (curMusic == null) {
                                    str2 = "";
                                } else {
                                    str2 = curMusic.mid;
                                }
                                C23888c.m78200b(str2, musicModel.getMusicId());
                            }
                        }
                        if (MusicAdapter.this.f62926i) {
                            C23888c.m78207c(MusicAdapter.this.f62921d, musicModel.getName(), musicModel.getMusicId());
                        }
                    }
                } else if (id == R.id.bs2) {
                    if (MusicAdapter.this.f62919b == musicItemViewHolder.getPosition()) {
                        if (MusicAdapter.this.f62918a != null) {
                            MusicAdapter.this.al_();
                        }
                    } else if (MusicAdapter.this.f62918a != null) {
                        MusicAdapter.this.al_();
                        if (musicModel.getMusicType() == MusicType.LOCAL) {
                            MusicAdapter.m78067a(musicItemViewHolder, musicModel);
                        } else {
                            MusicAdapter.this.f62918a.mo61920a((C34026a) new C23840f(this));
                            MusicAdapter.this.f62918a.mo61922a(musicModel, MusicAdapter.this.f62922e);
                            C23888c.m78181a(musicItemViewHolder.getPosition());
                        }
                        MusicAdapter.this.f62919b = musicItemViewHolder.getPosition();
                    }
                    MusicAdapter.this.f62920c = musicModel;
                    if (TextUtils.equals("search_music", MusicAdapter.this.f62922e.f62870a) && C6399b.m19944t()) {
                        ISearchMusicDepentService iSearchMusicDepentService2 = (ISearchMusicDepentService) ServiceManager.get().getService(ISearchMusicDepentService.class);
                        String str7 = MusicAdapter.this.f62922e.f62870a;
                        int position2 = musicItemViewHolder.getPosition();
                        if (MusicAdapter.this.f62927j) {
                            str = "click_pause_music";
                        } else {
                            str = "click_play_music";
                        }
                        iSearchMusicDepentService2.mobClickMusicCardEvent(str7, musicModel, position2, str);
                    }
                    MusicAdapter.this.f62927j = !MusicAdapter.this.f62927j;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo61895a(MusicModel musicModel, MusicItemViewHolder musicItemViewHolder, AVMusic aVMusic, DialogInterface dialogInterface, int i) {
            String str;
            MusicAdapter.this.f62918a.mo61923b(musicModel);
            C23888c.m78184a(MusicAdapter.this.f62922e, musicModel.getMusicId(), musicItemViewHolder.getLayoutPosition(), musicModel.getLogPb());
            if (aVMusic == null) {
                str = "";
            } else {
                str = aVMusic.mid;
            }
            C23888c.m78210d(str, musicModel.getMusicId());
        }
    };

    public final void ah_() {
        super.ah_();
        C6907h.m21524a("music_search_feedback_show", (Map) C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").f60753a);
    }

    /* renamed from: d */
    public final void mo61890d() {
        if (this.f62920c == null || mo62312a() == null) {
            this.f62919b = -1;
        } else {
            this.f62919b = mo62312a().indexOf(this.f62920c);
        }
    }

    public final void al_() {
        if (this.f62919b >= 0) {
            MediaPlayer a = C33783c.m108916a();
            if (this.f62919b != -1) {
                C1293v f = this.f62930x.mo5575f(this.f62919b);
                if (f instanceof MusicItemViewHolder) {
                    ((MusicItemViewHolder) f).mo62214a(false, false);
                }
                this.f62919b = -1;
                this.f62920c = null;
            }
            if (a != null && a.isPlaying()) {
                a.pause();
            }
            if (this.f62918a != null) {
                this.f62918a.mo61921a((MusicModel) null);
            }
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f62930x = recyclerView;
        registerAdapterDataObserver(this.f62917A);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        unregisterAdapterDataObserver(this.f62917A);
        this.f62930x = null;
    }

    /* renamed from: a */
    public final void mo61885a(boolean z) {
        if (this.f62919b >= 0) {
            this.f62930x.post(new C23837c(this, false));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo61889b(boolean z) {
        if (this.f62930x != null) {
            C1293v f = this.f62930x.mo5575f(this.f62919b);
            if (f instanceof MusicItemViewHolder) {
                ((MusicItemViewHolder) f).mo62214a(z, true);
            }
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (this.f62926i && TextUtils.isEmpty(((MusicModel) this.f67539l.get(i)).getLrcUrl())) {
            return 1;
        }
        if (this.f62926i || !this.f62931y || !C6399b.m19945u()) {
            return 0;
        }
        return 2;
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        boolean z;
        int i;
        try {
            z = C30199h.m98861a().getShowMusicFeedbackEntrance().booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (!this.f62931y || !z) {
            return super.mo61886a_(viewGroup);
        }
        C1293v a_ = super.mo61886a_(viewGroup);
        try {
            this.f62928k = C30199h.m98861a().getFeConfigCollection().getMusicFaq().getSchema();
        } catch (Exception unused2) {
        }
        SpannableString spannableString = new SpannableString(viewGroup.getContext().getString(R.string.dka));
        C238311 r3 = new ClickableSpan() {
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }

            public final void onClick(View view) {
                C33787a a = C33786f.m108941a(MusicAdapter.this.f62928k);
                a.mo86195a("enter_from", "video_shoot_page");
                C7195s.m22438a().mo18682a(a.mo86194a().toString());
                C6907h.m21524a("music_search_feedback_click", (Map) C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").f60753a);
            }
        };
        if (spannableString.length() > 9) {
            spannableString.setSpan(r3, 9, spannableString.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(C0683b.m2912c(viewGroup.getContext(), R.color.a4q)), 9, spannableString.length(), 33);
        }
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2x, null);
        textView.setText(spannableString, BufferType.SPANNABLE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.f62926i) {
            i = Color.parseColor("#80ffffff");
        } else {
            i = C0683b.m2912c(viewGroup.getContext(), R.color.sp);
        }
        textView.setTextColor(i);
        textView.setPadding(0, 20, 0, 0);
        DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
        dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25963b((View) textView));
        return a_;
    }

    /* renamed from: a */
    static final /* synthetic */ void m78066a(MusicItemViewHolder musicItemViewHolder, MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        musicItemViewHolder.mo62214a(false, true);
    }

    public MusicAdapter(C23844b bVar, C33746f<C23822c> fVar) {
        this.f62929w = fVar;
    }

    /* renamed from: a */
    public static void m78067a(MusicItemViewHolder musicItemViewHolder, MusicModel musicModel) {
        MediaPlayer a = C33783c.m108916a();
        try {
            a.reset();
            a.setDataSource(musicModel.getPath());
            a.setAudioStreamType(3);
            a.prepareAsync();
            a.setOnPreparedListener(new C23835a(musicItemViewHolder));
            a.setOnErrorListener(C23836b.f62946a);
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            MusicItemViewHolder musicItemViewHolder = new MusicItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zc, viewGroup, false), this.f62925h);
            musicItemViewHolder.mo62210a(this.f62932z, this.f62929w);
            return musicItemViewHolder;
        } else if (i != 2) {
            return new MusicItemNoLyricViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zk, viewGroup, false));
        } else {
            SearchMusicWithLyricViewHolder searchMusicWithLyricViewHolder = new SearchMusicWithLyricViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2o, viewGroup, false), this.f62925h);
            searchMusicWithLyricViewHolder.mo62210a(this.f62932z, this.f62929w);
            return searchMusicWithLyricViewHolder;
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        boolean z;
        boolean z2;
        MusicModel musicModel = (MusicModel) mo62312a().get(i);
        if (vVar instanceof MusicItemViewHolder) {
            MusicItemViewHolder musicItemViewHolder = (MusicItemViewHolder) vVar;
            String str = this.f62921d;
            boolean z3 = this.f62923f;
            if (i == this.f62919b) {
                z2 = true;
            } else {
                z2 = false;
            }
            musicItemViewHolder.mo62212a(musicModel, str, z3, z2, false, 0, 0, i, this.f62922e, this.f62926i);
            if (this.f62926i) {
                C23888c.m78192a(this.f62921d, musicModel.getName(), musicModel.getMusicId());
            }
        } else if (vVar instanceof MusicItemNoLyricViewHolder) {
            MusicItemNoLyricViewHolder musicItemNoLyricViewHolder = (MusicItemNoLyricViewHolder) vVar;
            String str2 = this.f62921d;
            boolean z4 = this.f62923f;
            if (i == this.f62919b) {
                z = true;
            } else {
                z = false;
            }
            musicItemNoLyricViewHolder.mo62208a(musicModel, str2, z4, z, false, 0, 0, i, this.f62922e, this.f62926i);
            if (this.f62926i) {
                C23888c.m78201b(this.f62921d, musicModel.getName(), musicModel.getMusicId());
            }
        }
        C23888c.m78185a(this.f62922e, musicModel.getMusicId(), i, this.f62924g);
    }

    public MusicAdapter(C23844b bVar, C33746f<C23822c> fVar, boolean z, boolean z2) {
        this.f62929w = fVar;
        this.f62931y = z;
        this.f62926i = z2;
    }
}
