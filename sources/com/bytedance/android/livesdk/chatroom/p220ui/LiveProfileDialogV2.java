package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.C2341d;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C2378j;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C3913e;
import com.bytedance.android.livesdk.chatroom.event.C4439i;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.presenter.C4953ao;
import com.bytedance.android.livesdk.chatroom.presenter.C4953ao.C4955b;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p188b.C3917a;
import com.bytedance.android.livesdk.p188b.C3922f;
import com.bytedance.android.livesdk.share.C8940a;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.utils.C9032ab;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.bytedance.android.livesdkapi.depend.share.C9389b.C9391a;
import com.bytedance.android.livesdkapi.p435b.C9290a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 */
public class LiveProfileDialogV2 extends LiveDialogFragment implements OnClickListener, C3922f, C4955b {

    /* renamed from: a */
    public static final String f14932a = "LiveProfileDialogV2";

    /* renamed from: A */
    public final C47562b f14933A = new C47562b();

    /* renamed from: B */
    private C4953ao f14934B;

    /* renamed from: C */
    private C3917a f14935C;

    /* renamed from: D */
    private User f14936D;

    /* renamed from: E */
    private boolean f14937E;

    /* renamed from: F */
    private String f14938F;

    /* renamed from: G */
    private String f14939G = "";

    /* renamed from: H */
    private View f14940H;

    /* renamed from: I */
    private View f14941I;

    /* renamed from: J */
    private ViewGroup f14942J;

    /* renamed from: K */
    private HSImageView f14943K;

    /* renamed from: L */
    private ImageView f14944L;

    /* renamed from: M */
    private boolean f14945M;

    /* renamed from: N */
    private View f14946N;

    /* renamed from: O */
    private View f14947O;

    /* renamed from: P */
    private List<C2341d> f14948P;

    /* renamed from: Q */
    private boolean f14949Q = true;

    /* renamed from: b */
    public int f14950b;

    /* renamed from: c */
    public C9032ab f14951c;

    /* renamed from: d */
    public long f14952d;

    /* renamed from: e */
    public User f14953e;

    /* renamed from: f */
    public Room f14954f;

    /* renamed from: g */
    public boolean f14955g;

    /* renamed from: h */
    public boolean f14956h;

    /* renamed from: i */
    public boolean f14957i;

    /* renamed from: k */
    public boolean f14958k;

    /* renamed from: l */
    public boolean f14959l;

    /* renamed from: m */
    public boolean f14960m;

    /* renamed from: n */
    public boolean f14961n;

    /* renamed from: o */
    public View f14962o;

    /* renamed from: p */
    public View f14963p;

    /* renamed from: q */
    public TextView f14964q;

    /* renamed from: r */
    public View f14965r;

    /* renamed from: s */
    public TextView f14966s;

    /* renamed from: t */
    public HSImageView f14967t;

    /* renamed from: u */
    public LivingView f14968u;

    /* renamed from: v */
    public View f14969v;

    /* renamed from: w */
    public HSImageView f14970w;

    /* renamed from: x */
    public Activity f14971x;

    /* renamed from: y */
    public DataCenter f14972y;

    /* renamed from: z */
    public LiveProfileDetailFragment f14973z;

    /* renamed from: a */
    public final void mo12953a() {
        dismiss();
    }

    /* renamed from: a */
    public final void mo13330a(String str) {
        if (this.f14973z != null) {
            this.f14973z.f14903f = str;
        }
    }

    /* renamed from: a */
    public final void mo12955a(Throwable th) {
        if (this.f14937E) {
            if (this.f14941I.getVisibility() == 8) {
                this.f14940H.setVisibility(8);
                this.f14941I.setVisibility(0);
            } else if (th instanceof ApiServerException) {
                C9049ap.m27028a(((ApiServerException) th).getPrompt());
            } else {
                C9049ap.m27022a((int) R.string.ezu);
            }
        }
    }

    /* renamed from: a */
    public final void mo12956a(List<C2341d> list) {
        if (list != null && list.size() > 0) {
            this.f14948P = list;
            if (this.f14973z != null) {
                this.f14973z.f14905h = list;
            }
            this.f14966s.setVisibility(0);
            if (this.f14964q.getVisibility() == 0) {
                this.f14965r.setVisibility(0);
                return;
            }
            this.f14965r.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo11472a(boolean z) {
        if (this.f14937E) {
            if (this.f14953e.getUserAttr() == null) {
                this.f14953e.setUserAttr(new C2378j());
            }
            this.f14953e.getUserAttr().f7829a = z;
            this.f14964q.setText(z ? R.string.ezy : R.string.f05);
        }
    }

    /* renamed from: c */
    private void m16601c() {
        this.f14963p.setVisibility(8);
        this.f14942J.setVisibility(0);
    }

    /* renamed from: d */
    private void m16602d() {
        if (this.f14954f != null && this.f14953e != null) {
            this.f14942J.setVisibility(4);
            this.f14940H.setVisibility(4);
            this.f14942J.post(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:29:0x012a  */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x012f  */
                /* JADX WARNING: Removed duplicated region for block: B:37:0x0178  */
                /* JADX WARNING: Removed duplicated region for block: B:38:0x0180  */
                /* JADX WARNING: Removed duplicated region for block: B:88:0x027d  */
                /* JADX WARNING: Removed duplicated region for block: B:91:0x0292  */
                /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r11 = this;
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14963p
                        r1 = 0
                        r0.setVisibility(r1)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f14967t
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f14953e
                        com.bytedance.android.live.base.model.ImageModel r2 = r2.getAvatarThumb()
                        com.bytedance.android.livesdk.chatroom.utils.C5343e.m17038a(r0, r2)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.app.Activity r0 = r0.f14971x
                        r2 = 0
                        r4 = 8
                        if (r0 == 0) goto L_0x009c
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.app.Activity r0 = r0.f14971x
                        int r0 = r0.getRequestedOrientation()
                        if (r0 != 0) goto L_0x009c
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        long r5 = r0.getLiveRoomId()
                        int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                        if (r0 == 0) goto L_0x0045
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        r0.getId()
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.f14954f
                        r0.getOwnerUserId()
                    L_0x0045:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        com.bytedance.android.live.base.model.user.f r0 = r0.getBorder()
                        if (r0 == 0) goto L_0x0077
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14969v
                        com.bytedance.common.utility.C9738o.m28712b(r0, r4)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f14967t
                        r0.setPadding(r1, r1, r1, r1)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f14967t
                        r0.setBackgroundResource(r1)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f14970w
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f14953e
                        com.bytedance.android.live.base.model.user.f r2 = r2.getBorder()
                        com.bytedance.android.live.base.model.ImageModel r2 = r2.f7818a
                        com.bytedance.android.live.core.utils.C3393m.m12633b(r0, r2)
                        goto L_0x00ed
                    L_0x0077:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14969v
                        com.bytedance.common.utility.C9738o.m28712b(r0, r4)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f14967t
                        r2 = 1084227584(0x40a00000, float:5.0)
                        int r2 = com.bytedance.android.live.core.utils.C3358ac.m12510a(r2)
                        r3 = 1088421888(0x40e00000, float:7.0)
                        int r3 = com.bytedance.android.live.core.utils.C3358ac.m12510a(r3)
                        r0.setPadding(r1, r2, r1, r3)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f14967t
                        r2 = 2131233978(0x7f080cba, float:1.8084109E38)
                        r0.setBackgroundResource(r2)
                        goto L_0x00ed
                    L_0x009c:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14969v
                        com.bytedance.common.utility.C9738o.m28712b(r0, r1)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        long r5 = r0.getLiveRoomId()
                        int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                        if (r0 == 0) goto L_0x00bd
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        r0.getId()
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.f14954f
                        r0.getOwnerUserId()
                    L_0x00bd:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14969v
                        if (r0 == 0) goto L_0x00ed
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        com.bytedance.android.live.base.model.user.f r0 = r0.getBorder()
                        if (r0 == 0) goto L_0x00e6
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14969v
                        com.bytedance.common.utility.C9738o.m28712b(r0, r4)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f14970w
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f14953e
                        com.bytedance.android.live.base.model.user.f r2 = r2.getBorder()
                        com.bytedance.android.live.base.model.ImageModel r2 = r2.f7818a
                        com.bytedance.android.live.core.utils.C3393m.m12633b(r0, r2)
                        goto L_0x00ed
                    L_0x00e6:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14969v
                        com.bytedance.common.utility.C9738o.m28712b(r0, r1)
                    L_0x00ed:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.core.widget.HSImageView r0 = r0.f14967t
                        r2 = 2131296591(0x7f09014f, float:1.8211103E38)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r3 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r3 = r3.f14953e
                        r0.setTag(r2, r3)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.f14954f
                        com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
                        r2 = 1
                        if (r0 != 0) goto L_0x0109
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        goto L_0x0121
                    L_0x0109:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r3 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f14954f
                        com.bytedance.android.live.base.model.user.User r3 = r3.getOwner()
                        long r5 = r3.getId()
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r3 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        long r7 = r3.f14952d
                        int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                        if (r3 != 0) goto L_0x0121
                        r3 = 1
                        goto L_0x0122
                    L_0x0121:
                        r3 = 0
                    L_0x0122:
                        r0.f14956h = r3
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14956h
                        if (r0 == 0) goto L_0x012f
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        r0.f14957i = r2
                        goto L_0x015b
                    L_0x012f:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        if (r0 == 0) goto L_0x015b
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        com.bytedance.android.live.base.model.user.j r0 = r0.getUserAttr()
                        if (r0 == 0) goto L_0x015b
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f14953e
                        com.bytedance.android.live.base.model.user.j r2 = r2.getUserAttr()
                        boolean r2 = r2.f7830b
                        r0.f14957i = r2
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r2 = r2.f14953e
                        com.bytedance.android.live.base.model.user.j r2 = r2.getUserAttr()
                        boolean r2 = r2.f7831c
                        r0.f14958k = r2
                    L_0x015b:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.utils.ab r5 = r0.f14951c
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        long r6 = r0.f14952d
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r8 = r0.f14956h
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r9 = r0.f14956h
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r10 = r0.f14955g
                        r5.mo22231a(r6, r8, r9, r10)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14955g
                        if (r0 == 0) goto L_0x0180
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14962o
                        r0.setVisibility(r4)
                        goto L_0x0193
                    L_0x0180:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14962o
                        r0.setVisibility(r1)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14962o
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2$1$1 r2 = new com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2$1$1
                        r2.<init>()
                        r0.setOnClickListener(r2)
                    L_0x0193:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14956h
                        if (r0 != 0) goto L_0x0243
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14958k
                        if (r0 == 0) goto L_0x01a5
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14955g
                        if (r0 == 0) goto L_0x0243
                    L_0x01a5:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14960m
                        if (r0 != 0) goto L_0x01b1
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14961n
                        if (r0 == 0) goto L_0x0243
                    L_0x01b1:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14959l
                        if (r0 != 0) goto L_0x01c3
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14961n
                        if (r0 != 0) goto L_0x01c3
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14957i
                        if (r0 != 0) goto L_0x0243
                    L_0x01c3:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14959l
                        if (r0 != 0) goto L_0x01d5
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14961n
                        if (r0 != 0) goto L_0x01d5
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14955g
                        if (r0 != 0) goto L_0x0243
                    L_0x01d5:
                        com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m13782a()
                        long r2 = r0.f11667e
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        long r5 = r0.getId()
                        int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                        if (r0 == 0) goto L_0x0243
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        int r0 = r0.f14950b
                        r2 = 2
                        if (r0 != r2) goto L_0x01ef
                        goto L_0x0243
                    L_0x01ef:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14959l
                        if (r0 != 0) goto L_0x0228
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        boolean r0 = r0.f14961n
                        if (r0 == 0) goto L_0x01fc
                        goto L_0x0228
                    L_0x01fc:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        com.bytedance.android.live.base.model.user.j r0 = r0.getUserAttr()
                        if (r0 == 0) goto L_0x021d
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        com.bytedance.android.live.base.model.user.j r0 = r0.getUserAttr()
                        boolean r0 = r0.f7829a
                        if (r0 == 0) goto L_0x021d
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.f14964q
                        r2 = 2131828417(0x7f111ec1, float:1.9289774E38)
                        r0.setText(r2)
                        goto L_0x0232
                    L_0x021d:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.f14964q
                        r2 = 2131828424(0x7f111ec8, float:1.9289788E38)
                        r0.setText(r2)
                        goto L_0x0232
                    L_0x0228:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.f14964q
                        r2 = 2131828414(0x7f111ebe, float:1.9289768E38)
                        r0.setText(r2)
                    L_0x0232:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.f14964q
                        r0.setVisibility(r1)
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.f14964q
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r2 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        r0.setOnClickListener(r2)
                        goto L_0x024a
                    L_0x0243:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.f14964q
                        r0.setVisibility(r4)
                    L_0x024a:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.f14964q
                        int r0 = r0.getVisibility()
                        if (r0 != 0) goto L_0x0270
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14962o
                        int r0 = r0.getVisibility()
                        if (r0 == 0) goto L_0x0268
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.widget.TextView r0 = r0.f14966s
                        int r0 = r0.getVisibility()
                        if (r0 != 0) goto L_0x0270
                    L_0x0268:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14965r
                        r0.setVisibility(r1)
                        goto L_0x0277
                    L_0x0270:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        android.view.View r0 = r0.f14965r
                        r0.setVisibility(r4)
                    L_0x0277:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment r0 = r0.f14973z
                        if (r0 == 0) goto L_0x0288
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDetailFragment r0 = r0.f14973z
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r1 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r1 = r1.f14953e
                        r0.mo13306a(r1)
                    L_0x0288:
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r0 = r0.f14953e
                        com.bytedance.android.live.base.model.ImageModel r0 = r0.getPersonalCard()
                        if (r0 == 0) goto L_0x029f
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r0 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.livesdk.chatroom.ui.LiveProfileDialogV2 r1 = com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.this
                        com.bytedance.android.live.base.model.user.User r1 = r1.f14953e
                        com.bytedance.android.live.base.model.ImageModel r1 = r1.getPersonalCard()
                        r0.mo13329a(r1)
                    L_0x029f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p220ui.LiveProfileDialogV2.C51271.run():void");
                }
            });
        }
    }

    public void onDestroy() {
        if (this.f14934B != null) {
            this.f14934B.mo8963a();
        }
        if (this.f14935C != null) {
            this.f14935C.f11735a = null;
        }
        this.f14937E = false;
        this.f14933A.mo119660a();
        super.onDestroy();
    }

    /* renamed from: e */
    private void m16603e() {
        C9738o.m28701a((View) this.f14943K, -3, (int) C9738o.m28708b(C3358ac.m12528e(), 106.0f));
        C9738o.m28702a((View) this.f14943K, -3, (int) C9738o.m28708b(C3358ac.m12528e(), 25.0f), -3, -3);
        this.f14943K.setVisibility(0);
        C13438a aVar = (C13438a) this.f14943K.getHierarchy();
        aVar.mo32896a(C13423b.f35593a);
        this.f14943K.setHierarchy(aVar);
        C9738o.m28702a((View) this.f14944L, -3, (int) C9738o.m28708b(C3358ac.m12528e(), 75.0f), -3, -3);
        this.f14944L.setVisibility(0);
        this.f14944L.setBackgroundColor(-1);
        if (this.f14947O != null) {
            this.f14947O.setBackgroundColor(0);
        }
    }

    /* renamed from: i */
    private void m16605i() {
        FansClubData fansClubData;
        dismiss();
        if (this.f14955g && this.f14972y != null) {
            C4439i iVar = new C4439i();
            iVar.f12888b = this.f14948P;
            if (!(this.f14953e == null || this.f14953e.getFansClub() == null)) {
                FansClubMember fansClub = this.f14953e.getFansClub();
                if (fansClub.getPreferData() == null || fansClub.getPreferData().size() <= 0) {
                    fansClubData = null;
                } else {
                    fansClubData = (FansClubData) fansClub.getPreferData().get(Integer.valueOf(0));
                }
                iVar.f12887a = fansClubData;
            }
            this.f14972y.lambda$put$1$DataCenter("cmd_show_fans_club_setting", iVar);
        }
    }

    /* renamed from: f */
    private void m16604f() {
        String str;
        if (this.f14954f != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("target_uid", String.valueOf(this.f14952d));
            hashMap.put("sec_target_uid", TTLiveSDKContext.getHostService().mo22367h().mo22172a(this.f14952d));
            hashMap.put("packed_level", "2");
            hashMap.put("current_room_id", String.valueOf(this.f14954f.getId()));
            hashMap.put("request_from", "live_push_settings");
            String str2 = "anchor_id";
            if (this.f14954f.getOwner() != null) {
                str = String.valueOf(this.f14954f.getOwner().getId());
            } else {
                str = "0";
            }
            hashMap.put(str2, str);
            hashMap.put("sec_anchor_id", TTLiveSDKContext.getHostService().mo22367h().mo22172a(this.f14954f.getOwnerUserId()));
            if (this.f14934B != null) {
                this.f14934B.mo12941a(hashMap);
            }
        }
    }

    /* renamed from: j */
    private void m16606j() {
        boolean z;
        boolean z2;
        if (this.f14954f != null) {
            if (!C5245cl.m16887a(getContext())) {
                C9049ap.m27022a((int) R.string.efp);
                return;
            }
            if (this.f14959l || this.f14961n) {
                dismiss();
                if (this.f14936D == null || this.f14953e == null || this.f14936D.getId() != this.f14953e.getId()) {
                    z = false;
                } else {
                    z = true;
                }
                int intValue = ((Integer) LiveSettingKeys.LIVE_PROFILE_MANAGE_DIALOG_STYLE.mo10240a()).intValue();
                if (this.f14961n || intValue == 0) {
                    C5246cm cmVar = new C5246cm(getContext(), this.f14954f, this.f14953e, z, this.f14945M);
                    cmVar.show();
                } else {
                    C5247cn cnVar = new C5247cn(getContext(), this.f14954f, this.f14953e, z, this.f14945M);
                    cnVar.show();
                }
            } else if (this.f14960m) {
                if (this.f14953e.getUserAttr() == null || !this.f14953e.getUserAttr().f7829a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f14935C != null) {
                    this.f14935C.mo11467a(z2, this.f14954f.getId(), this.f14952d);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo13331b() {
        long j;
        if (this.f14954f != null) {
            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.f14971x, C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.efb)).mo22188a(-1).mo22193d("live_detail").mo22194e("user_report").mo22192c("popup").mo22190a()).mo19189a((C7498y<? super T>) new C8986g<IUser>() {
                    public final void onSubscribe(C7321c cVar) {
                        super.onSubscribe(cVar);
                        LiveProfileDialogV2.this.f14933A.mo119661a(cVar);
                    }
                });
            } else if (!C5245cl.m16887a(getContext())) {
                C9049ap.m27022a((int) R.string.efp);
            } else {
                C8940a e = TTLiveSDKContext.getHostService().mo22364e();
                if (e != null) {
                    String str = "user";
                    long j2 = this.f14952d;
                    long j3 = this.f14952d;
                    if (this.f14956h) {
                        str = "live";
                        if (this.f14954f != null) {
                            j2 = this.f14954f.getId();
                        } else {
                            j2 = this.f14952d;
                        }
                    }
                    if (TextUtils.equals(UserProfileEvent.SOURCE_COMMENT, this.f14939G)) {
                        str = UserProfileEvent.SOURCE_COMMENT;
                    }
                    TextUtils.equals(UserProfileEvent.SOURCE_BARRAGE, this.f14939G);
                    C9391a a = C9389b.m27847a(j2, j3);
                    if (this.f14954f == null) {
                        j = 0;
                    } else {
                        j = this.f14954f.getId();
                    }
                    a.f25849b = j;
                    e.mo22111a(this.f14971x, a.mo23102a(), str);
                }
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    /* renamed from: b */
    public final void mo13332b(String str) {
        this.f14938F = str;
        if (this.f14973z != null) {
            this.f14973z.f14904g = str;
        }
    }

    /* renamed from: a */
    private void m16599a(Fragment fragment) {
        if (fragment != null) {
            C0633q a = getChildFragmentManager().mo2645a();
            a.mo2599b(R.id.ckc, fragment);
            a.mo2606d();
        }
    }

    /* renamed from: b */
    public final void mo12957b(Throwable th) {
        if (!(th instanceof ApiServerException)) {
            C9076n.m27095a(getContext(), th);
        }
    }

    /* renamed from: a */
    private void m16598a(int i) {
        this.f14973z = LiveProfileDetailFragment.m16565a(this.f14971x, this.f14953e, this.f14954f, this.f14945M, this.f14950b, this.f14934B, this.f14972y);
        if (this.f14934B != null) {
            this.f14934B.f14159a = this.f14973z;
        }
        m16599a((Fragment) this.f14973z);
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            if (!this.f14945M) {
                window.setGravity(8388693);
                window.setLayout(-2, -1);
                window.setBackgroundDrawable(new ColorDrawable(0));
                return;
            }
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f14945M) {
            i = R.style.xv;
        } else {
            i = R.style.xw;
        }
        setStyle(1, i);
        this.f14937E = true;
        if (this.f14934B != null) {
            this.f14934B.mo9142a((C4955b) this);
        }
        if (this.f14935C != null) {
            this.f14935C.f11735a = this;
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ic) {
            if (view.getTag(R.id.ic) instanceof User) {
                if (!(this.f14953e == null || this.f14954f == null || this.f14953e.getLiveRoomId() == 0)) {
                    this.f14953e.getId();
                    this.f14954f.getOwnerUserId();
                }
                if (!this.f14959l) {
                    m16600a((User) view.getTag(R.id.ic));
                    dismiss();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        if (id == R.id.csg) {
            this.f14940H.setVisibility(0);
            this.f14941I.setVisibility(8);
            m16604f();
        } else if (id == R.id.bwr) {
            m16606j();
        } else if (id == R.id.ai7) {
            m16605i();
        } else {
            if (id == R.id.bpf) {
                dismiss();
            }
        }
    }

    /* renamed from: a */
    private void m16600a(User user) {
        if (this.f14954f != null) {
            if (((Integer) C3913e.m13800a().f11699b).intValue() == 2) {
                C9049ap.m27022a((int) R.string.euo);
                return;
            }
            if (this.f14956h) {
                this.f14951c.mo22232a("live_audience_c_anchor", user.getId());
            } else {
                this.f14951c.mo22232a("live_audience_c_audience", user.getId());
            }
            HashMap hashMap = new HashMap(1);
            if (this.f14972y != null) {
                hashMap.put("log_enter_live_source", this.f14972y.get("log_enter_live_source"));
            } else {
                hashMap.put("log_enter_live_source", this.f14939G);
            }
            hashMap.put("sec_user_id", user.getSecUid());
            TTLiveSDKContext.getHostService().mo22365f().mo22043a(user.getId(), (Map<String, String>) hashMap);
            dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13328a(Bitmap bitmap) throws Exception {
        if (bitmap != null && this.f14937E) {
            this.f14943K.setBackgroundDrawable(new BitmapDrawable(bitmap));
            m16603e();
        }
    }

    /* renamed from: a */
    public final void mo13329a(ImageModel imageModel) {
        if (imageModel != null && this.f14947O != null && this.f14943K != null && this.f14944L != null) {
            C5343e.m17028a(imageModel).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C5243cj<Object>(this), C5244ck.f15343a);
        }
    }

    /* renamed from: a */
    public final void mo12954a(IUser iUser) {
        if (this.f14937E) {
            if (iUser == null || iUser.getId() <= 0) {
                mo12955a((Throwable) new IllegalArgumentException("User is invalid"));
            } else {
                this.f14953e = User.from(iUser);
                m16602d();
                if (this.f14953e.getFollowInfo() != null && this.f14956h) {
                    this.f14972y.lambda$put$1$DataCenter("data_xt_followed_change", Long.valueOf(this.f14953e.getFollowInfo().getFollowerCount()));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo11473b(boolean z, Exception exc) {
        if (this.f14937E) {
            C9076n.m27096a(getContext(), (Throwable) exc, (int) R.string.ezj);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f14954f != null) {
            this.f14963p = view.findViewById(R.id.bpf);
            this.f14963p.setOnClickListener(this);
            this.f14947O = view.findViewById(R.id.cki);
            this.f14947O.setOnClickListener(this);
            this.f14942J = (ViewGroup) view.findViewById(R.id.bu9);
            this.f14940H = view.findViewById(R.id.cky);
            this.f14941I = view.findViewById(R.id.csg);
            this.f14941I.setOnClickListener(this);
            boolean z = false;
            this.f14940H.setVisibility(0);
            this.f14941I.setVisibility(8);
            this.f14962o = view.findViewById(R.id.crz);
            this.f14964q = (TextView) view.findViewById(R.id.bwr);
            this.f14965r = view.findViewById(R.id.bwt);
            this.f14966s = (TextView) view.findViewById(R.id.ai7);
            this.f14966s.setOnClickListener(this);
            this.f14966s.setVisibility(8);
            this.f14967t = (HSImageView) view.findViewById(R.id.ic);
            this.f14968u = (LivingView) view.findViewById(R.id.bqa);
            this.f14969v = view.findViewById(R.id.b6_);
            this.f14970w = (HSImageView) view.findViewById(R.id.b65);
            this.f14943K = (HSImageView) view.findViewById(R.id.apt);
            this.f14944L = (ImageView) view.findViewById(R.id.aps);
            this.f14967t.setOnClickListener(this);
            m16598a(100);
            if (this.f14953e == null) {
                m16601c();
            } else {
                m16602d();
            }
            long b = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
            if (this.f14954f.getOwner() != null && b == this.f14954f.getOwner().getId()) {
                z = true;
            }
            this.f14959l = z;
            if (this.f14959l) {
                this.f14960m = true;
            } else if (!(this.f14936D == null || this.f14936D.getUserAttr() == null)) {
                this.f14961n = this.f14936D.getUserAttr().f7831c;
                this.f14960m = this.f14936D.getUserAttr().f7830b;
            }
            m16604f();
            if (this.f14949Q && this.f14955g && !C9290a.f25466a && this.f14934B != null) {
                this.f14934B.mo12943b();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f14946N = layoutInflater.inflate(R.layout.aoc, viewGroup, false);
        return this.f14946N;
    }

    /* renamed from: a */
    public static LiveProfileDialogV2 m16597a(Context context, boolean z, long j, Room room, User user, String str) {
        return m16596a(context, z, j, room, user, 1, str);
    }

    /* renamed from: a */
    private static LiveProfileDialogV2 m16596a(Context context, boolean z, long j, Room room, User user, int i, String str) {
        boolean z2;
        LiveProfileDialogV2 liveProfileDialogV2 = new LiveProfileDialogV2();
        liveProfileDialogV2.f14945M = z;
        liveProfileDialogV2.f14952d = j;
        if (TTLiveSDKContext.getHostService().mo22367h().mo22179b() == j) {
            z2 = true;
        } else {
            z2 = false;
        }
        liveProfileDialogV2.f14955g = z2;
        liveProfileDialogV2.f14954f = room;
        liveProfileDialogV2.f14936D = user;
        liveProfileDialogV2.f14934B = new C4953ao();
        liveProfileDialogV2.f14951c = new C9032ab(context, room, j);
        liveProfileDialogV2.f14935C = new C3917a();
        liveProfileDialogV2.f14950b = 1;
        liveProfileDialogV2.f14939G = str;
        liveProfileDialogV2.f14971x = (Activity) context;
        return liveProfileDialogV2;
    }
}
