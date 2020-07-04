package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.detail.p1167ui.LiveDetailActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28511z;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28826b;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29369d;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.flowfeed.p970c.C21754e;
import com.p280ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.live.feedpage.C32517b;
import com.p280ss.android.ugc.aweme.newfollow.adapter.FollowFlowItemVideoViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA */
public class InsFollowLiveViewHolderA extends FollowFlowItemVideoViewHolder {

    /* renamed from: a */
    public boolean f89303a = true;

    /* renamed from: aW */
    private final TextView f89304aW;

    /* renamed from: aX */
    private final View f89305aX;

    /* renamed from: aY */
    private final TextView f89306aY;

    /* renamed from: b */
    public RoomStruct f89307b;

    /* renamed from: c */
    public boolean f89308c;

    /* renamed from: d */
    public final View f89309d;

    /* renamed from: e */
    private String f89310e = "";

    /* renamed from: f */
    private final RemoteImageView f89311f;

    /* renamed from: g */
    private final View f89312g;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA$a */
    static final class C34242a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsFollowLiveViewHolderA f89313a;

        C34242a(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f89313a = insFollowLiveViewHolderA;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89313a.mo86996d(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA$b */
    static final class C34243b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsFollowLiveViewHolderA f89314a;

        C34243b(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f89314a = insFollowLiveViewHolderA;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89314a.f77550n.mo58080a((View) this.f89314a.f77559w, this.f89314a.itemView, this.f89314a.mo86957ao().owner);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA$c */
    static final class C34244c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InsFollowLiveViewHolderA f89315a;

        C34244c(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f89315a = insFollowLiveViewHolderA;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C21747e eVar = this.f89315a.f77550n;
            if (eVar != null) {
                eVar.mo58080a((View) this.f89315a.f77554r, this.f89315a.itemView, this.f89315a.mo86957ao().owner);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA$d */
    static final class C34245d<T> implements C7326g<C32517b> {

        /* renamed from: a */
        final /* synthetic */ InsFollowLiveViewHolderA f89316a;

        C34245d(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f89316a = insFollowLiveViewHolderA;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C32517b bVar) {
            if (TextUtils.equals(this.f89316a.mo86957ao().owner.getUid(), String.valueOf(bVar.f84785a))) {
                if (bVar.f84786b == 0) {
                    this.f89316a.mo86957ao().status = 4;
                    this.f89316a.f77549m.mo74073b();
                    this.f89316a.mo86995a(Integer.valueOf(4));
                    RemoteImageView remoteImageView = this.f89316a.f77554r;
                    User user = this.f89316a.mo86957ao().owner;
                    C7573i.m23582a((Object) user, "mRoom.owner");
                    C23323e.m76506a(remoteImageView, user.getAvatarThumb(), this.f89316a.f77501Q, this.f89316a.f77501Q);
                    return;
                }
                this.f89316a.mo86957ao().status = 2;
                this.f89316a.mo86957ao().f75166id = bVar.f84786b;
                this.f89316a.mo86957ao().owner.roomId = bVar.f84786b;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA$e */
    static final class C34246e implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ InsFollowLiveViewHolderA f89317a;

        C34246e(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f89317a = insFollowLiveViewHolderA;
        }

        public final void onShow(DialogInterface dialogInterface) {
            this.f89317a.mo86959aq();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA$f */
    static final class C34247f implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ InsFollowLiveViewHolderA f89318a;

        C34247f(InsFollowLiveViewHolderA insFollowLiveViewHolderA) {
            this.f89318a = insFollowLiveViewHolderA;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f89318a.mo86993a(this.f89318a.mo86957ao());
        }
    }

    /* renamed from: R */
    public final void mo75242R() {
        mo75238N();
    }

    /* renamed from: T */
    public final void mo75244T() {
    }

    /* renamed from: U */
    public final void mo75245U() {
    }

    /* renamed from: X */
    public final void mo75248X() {
        mo86959aq();
    }

    /* renamed from: Z */
    public final void mo75250Z() {
        mo75238N();
    }

    /* renamed from: a */
    public void mo86993a(RoomStruct roomStruct) {
        C7573i.m23587b(roomStruct, "room");
    }

    /* renamed from: af */
    public final void mo75307af() {
        mo86958ap();
    }

    /* renamed from: ai */
    public final void mo75311ai() {
        mo86959aq();
    }

    /* renamed from: ap */
    public void mo86958ap() {
    }

    /* renamed from: aq */
    public void mo86959aq() {
    }

    /* renamed from: q */
    public final boolean mo75289q() {
        return true;
    }

    /* renamed from: S */
    public final void mo75243S() {
        mo75311ai();
        mo75239O();
    }

    /* renamed from: as */
    private float m110622as() {
        if (mo86986ar()) {
            return 0.0f;
        }
        return 16.0f;
    }

    /* renamed from: at */
    private float m110623at() {
        if (mo86986ar()) {
            return 16.0f;
        }
        return 20.0f;
    }

    /* renamed from: ax */
    private static int m110627ax() {
        if (C29369d.m96464b()) {
            return LiveRoomStruct.ROOM_LONGTIME_NO_NET;
        }
        return 1008;
    }

    /* renamed from: C */
    public final void mo75227C() {
        View view = this.f77508X;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: O */
    public final void mo75239O() {
        if (this.f77549m != null) {
            this.f77549m.mo74075d();
        }
    }

    /* renamed from: ao */
    public final RoomStruct mo86957ao() {
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        return roomStruct;
    }

    /* renamed from: m */
    public final void mo68532m() {
        C23487o.m77140a((View) this.f77507W, 8);
    }

    /* renamed from: ar */
    private static boolean mo86986ar() {
        if (C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8) == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: aw */
    private final String m110626aw() {
        String str = "homepage_follow";
        if (TextUtils.equals(this.f89310e, "extra_follow_type_friend")) {
            return "homepage_friends";
        }
        return str;
    }

    /* renamed from: t */
    public void mo75292t() {
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        if (roomStruct != null) {
            mo68503a(this.f89309d, 0, 0);
        }
    }

    /* renamed from: J */
    public final List<String> mo75234J() {
        ArrayList arrayList = new ArrayList();
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        if (!C21740a.m72686b(roomStruct.owner)) {
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            if (C43122ff.m136786q(roomStruct2.owner)) {
                arrayList.add(mo75261ab().getString(R.string.fll));
            }
        }
        return arrayList;
    }

    /* renamed from: K */
    public final void mo75235K() {
        List J = mo75234J();
        if (this.f77550n != null) {
            C21747e eVar = this.f77550n;
            RoomStruct roomStruct = this.f89307b;
            if (roomStruct == null) {
                C7573i.m23583a("mRoom");
            }
            eVar.mo58085a(roomStruct.owner, J, (OnShowListener) new C34246e(this), (OnDismissListener) new C34247f(this));
        }
    }

    /* renamed from: L */
    public void mo75236L() {
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        if (roomStruct.roomCover != null) {
            RemoteImageView remoteImageView = this.f77551o;
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            UrlModel urlModel = roomStruct2.roomCover;
            RemoteImageView remoteImageView2 = this.f77551o;
            C7573i.m23582a((Object) remoteImageView2, "mCoverView");
            int width = remoteImageView2.getWidth();
            RemoteImageView remoteImageView3 = this.f77551o;
            C7573i.m23582a((Object) remoteImageView3, "mCoverView");
            C23323e.m76506a(remoteImageView, urlModel, width, remoteImageView3.getHeight());
        }
    }

    /* renamed from: N */
    public final void mo75238N() {
        if (this.f77549m != null) {
            RoomStruct roomStruct = this.f89307b;
            if (roomStruct == null) {
                C7573i.m23583a("mRoom");
            }
            User user = roomStruct.owner;
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            user.roomId = roomStruct2.f75166id;
            this.f77549m.mo74074c();
        }
    }

    /* renamed from: a */
    public void mo68499a() {
        mo75296x();
        mo75236L();
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        mo86995a(Integer.valueOf(roomStruct.status));
        RoomStruct roomStruct2 = this.f89307b;
        if (roomStruct2 == null) {
            C7573i.m23583a("mRoom");
        }
        m110628b(Integer.valueOf(roomStruct2.user_count));
        mo68525j();
        mo75233I();
        mo75227C();
        mo68504d();
    }

    /* renamed from: d */
    public final void mo68504d() {
        if (this.f89309d != null && !C29369d.m96464b() && VERSION.SDK_INT >= 21) {
            View view = this.f89309d;
            Context ab = mo75261ab();
            C7573i.m23582a((Object) ab, "context");
            view.setOutlineProvider(new C43070ds(ab.getResources().getDimensionPixelOffset(R.dimen.hf)));
            this.f89309d.setClipToOutline(true);
        }
    }

    /* renamed from: y */
    public final void mo75297y() {
        if (this.f77509Y != null) {
            RoomStruct roomStruct = this.f89307b;
            if (roomStruct == null) {
                C7573i.m23583a("mRoom");
            }
            if (C21740a.m72686b(roomStruct.owner)) {
                ImageView imageView = this.f77509Y;
                C7573i.m23582a((Object) imageView, "mIvExtraBtn");
                imageView.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f77509Y;
            C7573i.m23582a((Object) imageView2, "mIvExtraBtn");
            imageView2.setVisibility(0);
        }
    }

    /* renamed from: av */
    private final void m110625av() {
        String str = "livesdk_live_show";
        C22984d a = C22984d.m75611a().mo59970a("scene_id", m110627ax()).mo59973a("enter_method", "live_cell").mo59973a("action_type", "click");
        String str2 = "anchor_id";
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        User user = roomStruct.owner;
        C7573i.m23582a((Object) user, "mRoom.owner");
        C22984d a2 = a.mo59973a(str2, user.getUid());
        String str3 = "room_id";
        RoomStruct roomStruct2 = this.f89307b;
        if (roomStruct2 == null) {
            C7573i.m23583a("mRoom");
        }
        C22984d a3 = a2.mo59971a(str3, roomStruct2.f75166id).mo59973a("enter_from_merge", m110626aw());
        String str4 = "request_id";
        RoomStruct roomStruct3 = this.f89307b;
        if (roomStruct3 == null) {
            C7573i.m23583a("mRoom");
        }
        C6907h.m21524a(str, (Map) a3.mo59973a(str4, roomStruct3.getRequestId()).f60753a);
    }

    /* renamed from: I */
    public final void mo75233I() {
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        if (roomStruct != null) {
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            if (roomStruct2.owner != null) {
                if (this.f77556t != null) {
                    this.f77556t.setOnClickListener(new C34242a(this));
                }
                if (this.f77559w != null) {
                    this.f77559w.setOnClickListener(new C34243b(this));
                }
                AvatarImageView avatarImageView = this.f77554r;
                if (avatarImageView != null) {
                    avatarImageView.setOnClickListener(new C34244c(this));
                }
            }
        }
    }

    /* renamed from: aa */
    public final void mo75260aa() {
        if (!C27326a.m89578a(this.f89309d)) {
            if (!C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false) || !C6384b.m19835a().mo15292a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", C6384b.m19835a().mo15295d().enable_live_in_follow_feed_full_screen, false)) {
                mo86996d(false);
            } else {
                m110624au();
            }
        }
    }

    /* renamed from: j */
    public final void mo68525j() {
        this.f77487C.setMaxSize(C28511z.m93720a());
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        if (!TextUtils.isEmpty(roomStruct.title)) {
            MentionTextView mentionTextView = this.f77487C;
            C7573i.m23582a((Object) mentionTextView, "mDescView");
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            mentionTextView.setText(roomStruct2.title);
            MentionTextView mentionTextView2 = this.f77487C;
            C7573i.m23582a((Object) mentionTextView2, "mDescView");
            mentionTextView2.setVisibility(0);
            MentionTextView mentionTextView3 = this.f77487C;
            C7573i.m23582a((Object) mentionTextView3, "mDescView");
            mentionTextView3.setSpanSize(C9738o.m28690a(mo75261ab(), 15.0f));
            return;
        }
        MentionTextView mentionTextView4 = this.f77487C;
        C7573i.m23582a((Object) mentionTextView4, "mDescView");
        mentionTextView4.setVisibility(8);
    }

    /* renamed from: au */
    private final void m110624au() {
        int i;
        int i2;
        C21747e eVar = this.f77550n;
        C7573i.m23582a((Object) eVar, "mInteractListener");
        C28503s.m93679a(eVar.mo58089c());
        if (C6384b.m19835a().mo15292a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", C6384b.m19835a().mo15295d().enable_live_in_follow_feed_full_screen, false)) {
            Context ab = mo75261ab();
            RoomStruct roomStruct = this.f89307b;
            if (roomStruct == null) {
                C7573i.m23583a("mRoom");
            }
            String valueOf = String.valueOf(roomStruct.f75166id);
            String r = mo75290r();
            String h = mo68523h();
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            User user = roomStruct2.owner;
            if (user != null) {
                i2 = user.getCommerceUserLevel();
            } else {
                i2 = 0;
            }
            LiveDetailActivity.m86174b(ab, valueOf, r, h, i2, mo68524i(), mo75315am(), this.f89309d);
            return;
        }
        Context ab2 = mo75261ab();
        RoomStruct roomStruct3 = this.f89307b;
        if (roomStruct3 == null) {
            C7573i.m23583a("mRoom");
        }
        String valueOf2 = String.valueOf(roomStruct3.f75166id);
        String r2 = mo75290r();
        String h2 = mo68523h();
        RoomStruct roomStruct4 = this.f89307b;
        if (roomStruct4 == null) {
            C7573i.m23583a("mRoom");
        }
        User user2 = roomStruct4.owner;
        if (user2 != null) {
            i = user2.getCommerceUserLevel();
        } else {
            i = 0;
        }
        DetailActivity.m86053a(ab2, valueOf2, r2, h2, i, mo68524i(), mo75315am(), this.f89309d);
    }

    /* renamed from: x */
    public final void mo75296x() {
        mo75297y();
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        if (roomStruct.owner != null) {
            View view = this.f77552p;
            C7573i.m23582a((Object) view, "mHeaderLayout");
            boolean z = false;
            view.setVisibility(0);
            if (this.f77549m == null) {
                RoomStruct roomStruct2 = this.f89307b;
                if (roomStruct2 == null) {
                    C7573i.m23583a("mRoom");
                }
                if (roomStruct2.f75166id > 0) {
                    z = true;
                }
                this.f77549m = new C28826b(z, this.f77556t, this.f77554r, this.f77557u);
            }
            AvatarImageView avatarImageView = this.f77554r;
            C7573i.m23582a((Object) avatarImageView, "mAvatarView");
            avatarImageView.setVisibility(4);
            RemoteImageView remoteImageView = this.f77556t;
            RoomStruct roomStruct3 = this.f89307b;
            if (roomStruct3 == null) {
                C7573i.m23583a("mRoom");
            }
            User user = roomStruct3.owner;
            C7573i.m23582a((Object) user, "mRoom.owner");
            C23323e.m76506a(remoteImageView, user.getAvatarThumb(), this.f77501Q, this.f77501Q);
            RoomStruct roomStruct4 = this.f89307b;
            if (roomStruct4 == null) {
                C7573i.m23583a("mRoom");
            }
            User user2 = roomStruct4.owner;
            C7573i.m23582a((Object) user2, "mRoom.owner");
            if (!TextUtils.isEmpty(user2.getRemarkName())) {
                TextView textView = this.f77559w;
                C7573i.m23582a((Object) textView, "mHeadUserNameView");
                RoomStruct roomStruct5 = this.f89307b;
                if (roomStruct5 == null) {
                    C7573i.m23583a("mRoom");
                }
                User user3 = roomStruct5.owner;
                C7573i.m23582a((Object) user3, "mRoom.owner");
                textView.setText(user3.getRemarkName());
            } else {
                TextView textView2 = this.f77559w;
                C7573i.m23582a((Object) textView2, "mHeadUserNameView");
                RoomStruct roomStruct6 = this.f89307b;
                if (roomStruct6 == null) {
                    C7573i.m23583a("mRoom");
                }
                User user4 = roomStruct6.owner;
                C7573i.m23582a((Object) user4, "mRoom.owner");
                textView2.setText(user4.getNickname());
            }
            RoomStruct roomStruct7 = this.f89307b;
            if (roomStruct7 == null) {
                C7573i.m23583a("mRoom");
            }
            User user5 = roomStruct7.owner;
            RoomStruct roomStruct8 = this.f89307b;
            if (roomStruct8 == null) {
                C7573i.m23583a("mRoom");
            }
            user5.roomId = roomStruct8.f75166id;
            C28826b bVar = this.f77549m;
            RoomStruct roomStruct9 = this.f89307b;
            if (roomStruct9 == null) {
                C7573i.m23583a("mRoom");
            }
            bVar.mo74071a(roomStruct9.owner, getClass(), new C34245d(this));
        }
    }

    /* renamed from: j */
    public final void mo86997j(String str) {
        C7573i.m23587b(str, "enterFrom");
        this.f89310e = str;
    }

    public void onViewAttachedToWindow(View view) {
        this.f77521aj = true;
        this.f77517af.mo75115a(this.f77531at);
        C42961az.m136382c(this);
    }

    /* renamed from: b */
    private final void m110628b(Integer num) {
        String str;
        TextView textView = this.f89304aW;
        if (num != null) {
            str = String.valueOf(num.intValue());
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* renamed from: d */
    public final void mo75317d(Aweme aweme) {
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        if (roomStruct != null) {
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            mo86993a(roomStruct2);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        this.f77521aj = false;
        mo75311ai();
        this.f77517af.mo75117b(this.f77531at);
        this.f77518ag.removeCallbacksAndMessages(null);
        mo75239O();
        C42961az.m136383d(this);
    }

    /* renamed from: b */
    public final void mo75264b(int i) {
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        if (roomStruct != null) {
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            if (roomStruct2.owner != null) {
                m110625av();
            }
        }
        switch (i) {
            case 0:
            case 1:
                mo75310ah();
                return;
            default:
                return;
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
            viewStub3.setLayoutResource(R.layout.a6i);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        mo75255a(view4, m110623at(), m110623at(), m110622as(), m110622as());
    }

    @C7709l
    public final void onFollowLiveStatusChange(RoomStatusEvent roomStatusEvent) {
        C7573i.m23587b(roomStatusEvent, "event");
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        if (roomStruct != null) {
            long j = roomStatusEvent.f7644a;
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            if (j == roomStruct2.f75166id) {
                if (roomStatusEvent.f7646c) {
                    this.f89308c = true;
                    mo86995a(Integer.valueOf(4));
                    RoomStruct roomStruct3 = this.f89307b;
                    if (roomStruct3 == null) {
                        C7573i.m23583a("mRoom");
                    }
                    roomStruct3.status = 4;
                    return;
                }
                this.f89308c = false;
                mo86995a(Integer.valueOf(2));
                m110628b(Integer.valueOf(roomStatusEvent.f7647d));
            }
        }
    }

    @C7709l
    public final void onUnFollowUser(C21754e eVar) {
        C7573i.m23587b(eVar, "event");
        RoomStruct roomStruct = this.f89307b;
        if (roomStruct == null) {
            C7573i.m23583a("mRoom");
        }
        if (roomStruct != null) {
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            if (roomStruct2.owner != null) {
                CharSequence charSequence = eVar.f58264a;
                RoomStruct roomStruct3 = this.f89307b;
                if (roomStruct3 == null) {
                    C7573i.m23583a("mRoom");
                }
                User user = roomStruct3.owner;
                C7573i.m23582a((Object) user, "mRoom.owner");
                if (TextUtils.equals(charSequence, user.getUid())) {
                    mo86959aq();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo86996d(boolean z) {
        if (this.f77550n != null) {
            RoomStruct roomStruct = this.f89307b;
            if (roomStruct == null) {
                C7573i.m23583a("mRoom");
            }
            User user = roomStruct.owner;
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            user.roomId = roomStruct2.f75166id;
            RoomStruct roomStruct3 = this.f89307b;
            if (roomStruct3 == null) {
                C7573i.m23583a("mRoom");
            }
            if (roomStruct3.isFinish()) {
                C21747e eVar = this.f77550n;
                View view = this.f77559w;
                View view2 = this.itemView;
                RoomStruct roomStruct4 = this.f89307b;
                if (roomStruct4 == null) {
                    C7573i.m23583a("mRoom");
                }
                eVar.mo58080a(view, view2, roomStruct4.owner);
                return;
            }
            String str = "homepage_follow";
            String str2 = "live_cell";
            if (TextUtils.equals(this.f89310e, "extra_follow_type_friend")) {
                str = "homepage_friends";
            }
            String str3 = str;
            if (z) {
                str2 = "video_head";
            }
            String str4 = str2;
            RoomStruct roomStruct5 = this.f89307b;
            if (roomStruct5 == null) {
                C7573i.m23583a("mRoom");
            }
            User user2 = roomStruct5.owner;
            C7573i.m23582a((Object) user2, "mRoom.owner");
            RoomStruct roomStruct6 = this.f89307b;
            if (roomStruct6 == null) {
                C7573i.m23583a("mRoom");
            }
            user2.setRequestId(roomStruct6.getRequestId());
            C21747e eVar2 = this.f77550n;
            View view3 = this.f89309d;
            View view4 = this.itemView;
            RoomStruct roomStruct7 = this.f89307b;
            if (roomStruct7 == null) {
                C7573i.m23583a("mRoom");
            }
            eVar2.mo58081a(view3, view4, roomStruct7.owner, str3, str4);
        }
    }

    /* renamed from: a */
    public final void mo86995a(Integer num) {
        if (num != null && num.intValue() == 4) {
            TextView textView = this.f77558v;
            if (textView == null) {
                C7573i.m23580a();
            }
            textView.setText(mo75261ab().getString(R.string.b8o));
            return;
        }
        TextView textView2 = this.f77558v;
        if (textView2 == null) {
            C7573i.m23580a();
        }
        textView2.setText(mo75261ab().getString(R.string.b8i));
    }

    /* renamed from: a */
    public final void mo86994a(RoomStruct roomStruct, C21747e eVar) {
        C7573i.m23587b(eVar, "interactListener");
        if (roomStruct != null) {
            this.f77550n = eVar;
            this.f89307b = roomStruct;
            RoomStruct roomStruct2 = this.f89307b;
            if (roomStruct2 == null) {
                C7573i.m23583a("mRoom");
            }
            User user = roomStruct2.owner;
            RoomStruct roomStruct3 = this.f89307b;
            if (roomStruct3 == null) {
                C7573i.m23583a("mRoom");
            }
            user.roomId = roomStruct3.f75166id;
            mo75292t();
            mo68499a();
        }
    }

    /* renamed from: a */
    public void mo86992a(int i, float f, int[] iArr) {
        C7573i.m23587b(iArr, "dstSize");
        iArr[0] = i;
        iArr[1] = iArr[0];
    }

    /* renamed from: a */
    public void mo68503a(View view, int i, int i2) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            mo86992a((int) (((float) C9738o.m28691a(mo75261ab())) - (C9738o.m28708b(mo75261ab(), m110622as()) * 2.0f)), 0.0f, iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public InsFollowLiveViewHolderA(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
        View findViewById = this.itemView.findViewById(R.id.bhk);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.…follow_feed_live_content)");
        this.f89309d = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.b7x);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.iv_cover)");
        this.f89311f = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.brt);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.ll_live_tag_container)");
        this.f89312g = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.dz1);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.tv_online_count)");
        this.f89304aW = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.am_);
        C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.….fl_enter_live_container)");
        this.f89305aX = findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.du5);
        C7573i.m23582a((Object) findViewById6, "itemView.findViewById(R.id.tv_enter_live)");
        this.f89306aY = (TextView) findViewById6;
    }
}
