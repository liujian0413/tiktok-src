package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController.PlayerMessage;
import com.facebook.imagepipeline.request.C13842b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.newfollow.live.C34140a;
import com.p280ss.android.ugc.aweme.newfollow.live.C34142b;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.C34283m.C34284a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderB */
public class InsFollowLiveViewHolderB extends InsFollowLiveViewHolderA {

    /* renamed from: e */
    public FrameLayout f89319e;

    /* renamed from: f */
    private C34142b f89320f;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderB$a */
    static final class C34248a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InsFollowLiveViewHolderB f89321a;

        C34248a(InsFollowLiveViewHolderB insFollowLiveViewHolderB) {
            this.f89321a = insFollowLiveViewHolderB;
        }

        public final void run() {
            if (!C7573i.m23585a((Object) this.f89321a.getClass(), (Object) InsFollowLiveViewHolderB.class) && !C7573i.m23585a((Object) this.f89321a.getClass(), (Object) InsFollowLiveViewHolderC.class)) {
                this.f89321a.f89303a = false;
                this.f89321a.mo75236L();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderB$b */
    public static final class C34249b implements C34283m {

        /* renamed from: a */
        final /* synthetic */ InsFollowLiveViewHolderB f89322a;

        C34249b(InsFollowLiveViewHolderB insFollowLiveViewHolderB) {
            this.f89322a = insFollowLiveViewHolderB;
        }

        /* renamed from: a */
        public final void mo87008a(PlayerMessage playerMessage, Object obj) {
            C7573i.m23587b(playerMessage, "message");
            C34284a.m110925a(this, playerMessage, obj);
        }

        /* renamed from: a */
        public final void mo87007a(TextureView textureView, int i, int i2) {
            this.f89322a.mo87005a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo87005a(int i, int i2) {
    }

    /* renamed from: Y */
    public final void mo75249Y() {
        super.mo75249Y();
        C34142b bVar = this.f89320f;
        if (bVar == null) {
            C7573i.m23583a("livePlayHelper");
        }
        bVar.mo86827c();
    }

    /* renamed from: aq */
    public final void mo86959aq() {
        super.mo86959aq();
        C34142b bVar = this.f89320f;
        if (bVar == null) {
            C7573i.m23583a("livePlayHelper");
        }
        bVar.mo86823a();
    }

    /* renamed from: ar */
    public final FrameLayout mo86986ar() {
        FrameLayout frameLayout = this.f89319e;
        if (frameLayout == null) {
            C7573i.m23583a("liveStreamViewContainer");
        }
        return frameLayout;
    }

    /* renamed from: ap */
    public final void mo86958ap() {
        View findViewById = this.itemView.findViewById(R.id.bq2);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.…ve_stream_view_container)");
        this.f89319e = (FrameLayout) findViewById;
        this.f89320f = new C34142b(new C34248a(this), new C34249b(this));
    }

    /* renamed from: L */
    public final void mo75236L() {
        if (mo86957ao().roomCover != null) {
            if (this.f89303a) {
                UrlModel urlModel = mo86957ao().roomCover;
                C7573i.m23582a((Object) urlModel, "mRoom.roomCover");
                float width = ((float) urlModel.getWidth()) * 1.0f;
                RemoteImageView remoteImageView = this.f77551o;
                C7573i.m23582a((Object) remoteImageView, "mCoverView");
                float width2 = width / ((float) remoteImageView.getWidth());
                RemoteImageView remoteImageView2 = this.f77551o;
                UrlModel urlModel2 = mo86957ao().roomCover;
                RemoteImageView remoteImageView3 = this.f77551o;
                C7573i.m23582a((Object) remoteImageView3, "mCoverView");
                int width3 = remoteImageView3.getWidth();
                RemoteImageView remoteImageView4 = this.f77551o;
                C7573i.m23582a((Object) remoteImageView4, "mCoverView");
                C23323e.m76507a(remoteImageView2, urlModel2, width3, remoteImageView4.getHeight(), (C13842b) new C34140a(5, width2, null));
                return;
            }
            RemoteImageView remoteImageView5 = this.f77551o;
            UrlModel urlModel3 = mo86957ao().roomCover;
            RemoteImageView remoteImageView6 = this.f77551o;
            C7573i.m23582a((Object) remoteImageView6, "mCoverView");
            int width4 = remoteImageView6.getWidth();
            RemoteImageView remoteImageView7 = this.f77551o;
            C7573i.m23582a((Object) remoteImageView7, "mCoverView");
            C23323e.m76506a(remoteImageView5, urlModel3, width4, remoteImageView7.getHeight());
        }
    }

    /* renamed from: a */
    public final void mo86993a(RoomStruct roomStruct) {
        C7573i.m23587b(roomStruct, "room");
        super.mo86993a(roomStruct);
        if (!this.f89308c) {
            boolean a = C7573i.m23585a((Object) getClass(), (Object) InsFollowLiveViewHolderD.class);
            C34142b bVar = this.f89320f;
            if (bVar == null) {
                C7573i.m23583a("livePlayHelper");
            }
            LiveRoomStruct liveRoomStruct = roomStruct;
            FrameLayout frameLayout = this.f89319e;
            if (frameLayout == null) {
                C7573i.m23583a("liveStreamViewContainer");
            }
            bVar.mo86825a(a, liveRoomStruct, frameLayout);
        }
    }

    /* renamed from: a */
    public void mo68500a(View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(R.id.dc_);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.a7t);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        mo75253a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(R.layout.a6s);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        mo75253a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(R.layout.a6j);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        mo75255a(view4, 16.0f, 16.0f, 0.0f, 0.0f);
    }

    public InsFollowLiveViewHolderB(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
    }
}
