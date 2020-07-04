package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.C21098ab;
import com.p280ss.android.ugc.aweme.C21780t;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareAwemeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30734b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p1311a.C30567a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p1311a.C30568b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s.C7090a;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.widget.KeepSurfaceTextureView;
import com.p280ss.android.ugc.aweme.p313im.service.C32023i;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareAwemeReceiveAutoPlayViewHolder */
public class ShareAwemeReceiveAutoPlayViewHolder extends BaseViewHolder<ShareAwemeContent> {

    /* renamed from: A */
    private View f81265A;

    /* renamed from: B */
    private ImageView f81266B;

    /* renamed from: C */
    private Message f81267C;

    /* renamed from: D */
    private Animation f81268D;

    /* renamed from: E */
    private C21098ab f81269E;

    /* renamed from: F */
    private C31025a f81270F;

    /* renamed from: m */
    public int f81271m = -1;

    /* renamed from: n */
    public C32023i f81272n;

    /* renamed from: o */
    public Aweme f81273o;

    /* renamed from: p */
    public ShareAwemeContent f81274p;

    /* renamed from: q */
    public Runnable f81275q = new C31048m(this);

    /* renamed from: r */
    private RemoteImageView f81276r;

    /* renamed from: s */
    private TextView f81277s;

    /* renamed from: t */
    private TextView f81278t;

    /* renamed from: u */
    private ImageView f81279u;

    /* renamed from: v */
    private TextView f81280v;

    /* renamed from: w */
    private ImageView f81281w;

    /* renamed from: x */
    private RemoteImageView f81282x;

    /* renamed from: y */
    private ImageView f81283y;

    /* renamed from: z */
    private KeepSurfaceTextureView f81284z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareAwemeReceiveAutoPlayViewHolder$a */
    class C31018a extends C30567a {

        /* renamed from: b */
        private int f81289b = -1;

        public C31018a(int i) {
            this.f81289b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareAwemeReceiveAutoPlayViewHolder$b */
    class C31019b extends C30568b {
        private C31019b() {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return super.onSurfaceTextureDestroyed(surfaceTexture);
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            super.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo81454a(String str) {
        C10761a.m31396b(this.itemView.getContext(), str, 0).mo25750a();
        if (this.f81283y != null) {
            this.f81283y.setVisibility(8);
        }
        m101006b(false);
        if (this.f81266B != null) {
            this.f81266B.setVisibility(0);
        }
    }

    /* renamed from: i */
    private void m101011i() {
        this.f81268D = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.av);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81423b() {
        super.mo81423b();
        this.f81284z.setSurfaceTextureListener(new C31019b());
    }

    /* renamed from: f */
    public final void mo81444f() {
        String str;
        if (this.f81274p != null && this.f81274p != null) {
            String str2 = "client_show";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "chat").mo59973a("author_id", this.f81274p.getUser()).mo59973a("group_id", this.f81274p.getItemId()).mo59973a(C38347c.f99553h, "video").mo59973a("display", "card");
            String str3 = "is_auto_play";
            if (m101003a(this.f81267C)) {
                str = "1";
            } else {
                str = "0";
            }
            C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
        }
    }

    /* renamed from: g */
    public final void mo81457h() {
        if (this.f81274p != null && m101003a(this.f81267C)) {
            m101010d(false);
            m101006b(true);
            if (this.f81273o == null || TextUtils.isEmpty(this.f81273o.getAid()) || !TextUtils.equals(this.f81274p.getItemId(), this.f81273o.getAid())) {
                m101002a(this.f81274p);
                return;
            }
            if (this.f81272n == null && C6956a.m21632a().mo18009f() != null) {
                this.f81272n = C6956a.m21632a().mo18009f().getPlayerProxy();
            }
            this.f81284z.setClipBorder((float) C23486n.m77122a(4.0d));
            if (!(this.f81272n == null || this.f81284z == null || !this.f81284z.f83483c)) {
                this.f81284z.getSurface();
                new C31018a(this.f81271m);
            }
            if (!(this.f81272n == null || this.f81273o == null || this.f81273o.getVideo() == null)) {
                this.f81273o.getVideo().setSourceId(String.valueOf(this.f81267C.getIndex()));
                m101001a(this.f81273o.getVideo(), (TextureView) this.f81284z);
                this.f81273o.getVideo();
                if (C30734b.m100127a() == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f81267C.getMsgId());
                    C31024d.m101259b(sb.toString());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81265A = this.itemView.findViewById(R.id.s2);
        this.f81276r = (RemoteImageView) this.itemView.findViewById(R.id.a1y);
        this.f81277s = (TextView) this.itemView.findViewById(R.id.a2_);
        this.f81282x = (RemoteImageView) this.itemView.findViewById(R.id.a21);
        this.f81197e = this.itemView.findViewById(R.id.a24);
        this.f81278t = (TextView) this.itemView.findViewById(R.id.a28);
        this.f81279u = (ImageView) this.itemView.findViewById(R.id.a2a);
        this.f81280v = (TextView) this.itemView.findViewById(R.id.a2c);
        this.f81283y = (ImageView) this.itemView.findViewById(R.id.bb5);
        this.f81284z = (KeepSurfaceTextureView) this.itemView.findViewById(R.id.eat);
        this.f81281w = (ImageView) this.itemView.findViewById(R.id.dx_);
        this.f81266B = (ImageView) this.itemView.findViewById(R.id.ccb);
        m101007c(this.f81265A);
    }

    /* renamed from: d */
    private void m101010d(boolean z) {
        int i;
        if (this.f81283y != null) {
            ImageView imageView = this.f81283y;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: c */
    private static void m101007c(View view) {
        if (view != null) {
            Drawable background = view.getBackground();
            if (background != null && VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo81455a(boolean z) {
        m101009c(true);
        m101010d(true);
    }

    /* renamed from: a */
    private void m101002a(final ShareAwemeContent shareAwemeContent) {
        if (shareAwemeContent == null || TextUtils.isEmpty(shareAwemeContent.getItemId())) {
            mo81454a(this.itemView.getContext().getString(R.string.brk));
        } else {
            C7077s.m22159a(shareAwemeContent.getItemId(), "chat", (C7090a) new C7090a() {
                /* renamed from: a */
                public final void mo18350a(int i, Exception exc) {
                    ShareAwemeReceiveAutoPlayViewHolder.this.mo81454a(ShareAwemeReceiveAutoPlayViewHolder.this.itemView.getContext().getString(R.string.brk));
                }

                /* renamed from: a */
                public final void mo18351a(int i, Object obj) {
                    if (obj == null || !(obj instanceof Aweme)) {
                        ShareAwemeReceiveAutoPlayViewHolder.this.mo81454a(ShareAwemeReceiveAutoPlayViewHolder.this.itemView.getContext().getString(R.string.brk));
                    }
                    ShareAwemeReceiveAutoPlayViewHolder.this.f81273o = (Aweme) obj;
                    if (TextUtils.isEmpty(ShareAwemeReceiveAutoPlayViewHolder.this.f81273o.getAid()) || !TextUtils.equals(shareAwemeContent.getItemId(), ShareAwemeReceiveAutoPlayViewHolder.this.f81273o.getAid())) {
                        ShareAwemeReceiveAutoPlayViewHolder.this.mo81454a(ShareAwemeReceiveAutoPlayViewHolder.this.itemView.getContext().getString(R.string.brk));
                    }
                    if (TextUtils.equals(shareAwemeContent.getItemId(), ShareAwemeReceiveAutoPlayViewHolder.this.f81274p.getItemId()) && ShareAwemeReceiveAutoPlayViewHolder.this.f81197e != null) {
                        ShareAwemeReceiveAutoPlayViewHolder.this.f81197e.post(ShareAwemeReceiveAutoPlayViewHolder.this.f81275q);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private void m101004b(View view) {
        if (this.f81272n == null || !this.f81272n.mo82990a()) {
            view.setTag(50331652, null);
            view.setTag(50331653, null);
            return;
        }
        long b = this.f81272n.mo82991b();
        Bundle bundle = new Bundle();
        bundle.putSerializable("currentAweme", this.f81273o);
        bundle.putLong("position", b);
        view.setTag(50331652, bundle);
        view.setTag(50331653, this.f81284z);
    }

    /* renamed from: c */
    private void m101009c(boolean z) {
        if (this.f81274p != null && this.f81282x != null) {
            this.f81282x.setVisibility(0);
            C23323e.m76524b(this.f81282x, this.f81274p.getCoverUrl());
        }
    }

    /* renamed from: a */
    private boolean m101003a(Message message) {
        if (C30734b.m100127a() == 2) {
            if (message == null) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f81267C.getMsgId());
            if (!C31024d.m101256a(sb.toString())) {
                return true;
            }
            return false;
        } else if (C30734b.m100127a() == 4) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private void m101006b(boolean z) {
        if (this.f81281w != null) {
            if (z) {
                this.f81281w.setVisibility(0);
                this.f81281w.startAnimation(this.f81268D);
                return;
            }
            this.f81281w.clearAnimation();
            this.f81281w.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81276r.setOnClickListener(onClickListener);
        this.f81277s.setOnClickListener(onClickListener);
        this.f81197e.setOnClickListener(new C31049n(this, onClickListener));
        this.f81202j.mo82725a(this.f81276r, this.f81277s, this.f81197e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo81452a(OnClickListener onClickListener, View view) {
        m101004b(view);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public ShareAwemeReceiveAutoPlayViewHolder(View view, int i) {
        super(view, i);
        m101011i();
    }

    /* renamed from: a */
    private void m101001a(Video video, TextureView textureView) {
        if (textureView != null) {
            if (video == null || video.getWidth() <= 0 || video.getHeight() <= 0) {
                textureView.getLayoutParams().height = -1;
                textureView.getLayoutParams().width = -1;
                textureView.postInvalidate();
            } else if (((double) ((((float) video.getWidth()) * 1.0f) / ((float) video.getHeight()))) > 0.625d) {
                m101005b(video, textureView);
            } else {
                m101008c(video, textureView);
            }
        }
    }

    /* renamed from: b */
    private static void m101005b(Video video, TextureView textureView) {
        float width = ((float) textureView.getWidth()) / ((float) video.getWidth());
        float height = ((float) textureView.getHeight()) / ((float) video.getHeight());
        Matrix matrix = new Matrix();
        float max = Math.max(width, height);
        matrix.preTranslate((float) ((textureView.getWidth() - video.getWidth()) / 2), (float) ((textureView.getHeight() - video.getHeight()) / 2));
        matrix.preScale(((float) video.getWidth()) / ((float) textureView.getWidth()), ((float) video.getHeight()) / ((float) textureView.getHeight()));
        matrix.postScale(max, max, (float) (textureView.getWidth() / 2), (float) (textureView.getHeight() / 2));
        textureView.setTransform(matrix);
        textureView.postInvalidate();
    }

    /* renamed from: c */
    private static void m101008c(Video video, TextureView textureView) {
        float width = ((float) textureView.getWidth()) / ((float) video.getWidth());
        float height = ((float) textureView.getHeight()) / ((float) video.getHeight());
        Matrix matrix = new Matrix();
        float max = Math.max(width, height);
        matrix.preTranslate((float) ((textureView.getWidth() - video.getWidth()) / 2), (float) ((textureView.getHeight() - video.getHeight()) / 2));
        matrix.preScale(((float) video.getWidth()) / ((float) textureView.getWidth()), ((float) video.getHeight()) / ((float) textureView.getHeight()));
        matrix.postScale(max, max, (float) (textureView.getWidth() / 2), (float) (textureView.getHeight() / 2));
        textureView.setTransform(matrix);
        textureView.postInvalidate();
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareAwemeContent shareAwemeContent, int i) {
        super.mo81421a(message, message2, shareAwemeContent, i);
        int awemeType = shareAwemeContent.getAwemeType();
        this.f81274p = shareAwemeContent;
        this.f81198f = shareAwemeContent;
        this.f81271m = i;
        this.f81267C = message;
        if (awemeType == 0 || awemeType == 23) {
            this.f81279u.setVisibility(8);
            if (awemeType == 23) {
                this.f81278t.setVisibility(0);
            }
        } else {
            this.f81279u.setVisibility(0);
        }
        C23323e.m76524b(this.f81282x, shareAwemeContent.getCoverUrl());
        C23323e.m76524b(this.f81276r, shareAwemeContent.getContentThumb());
        this.f81277s.setText(shareAwemeContent.getContentName());
        String title = shareAwemeContent.getTitle();
        if (!TextUtils.isEmpty(title)) {
            this.f81280v.setText(title);
            this.f81280v.setVisibility(0);
        } else {
            this.f81280v.setVisibility(8);
        }
        if (awemeType == 0) {
            this.f81197e.setTag(50331648, Integer.valueOf(2));
            this.f81197e.setTag(67108864, shareAwemeContent.getItemId());
        } else if (awemeType == 2) {
            this.f81197e.setTag(50331648, Integer.valueOf(8));
            this.f81197e.setTag(67108864, shareAwemeContent.getItemId());
        }
        this.f81197e.setTag(50331648, Integer.valueOf(2));
        this.f81197e.setTag(67108864, shareAwemeContent.getItemId());
        this.f81197e.setTag(134217728, message);
        this.f81276r.setTag(50331648, Integer.valueOf(4));
        this.f81276r.setTag(100663296, shareAwemeContent);
        this.f81277s.setTag(50331648, Integer.valueOf(4));
        this.f81277s.setTag(100663296, shareAwemeContent);
        this.f81203k.f81142a = this.f81201i.getConversationId();
        this.f81266B.setVisibility(8);
        this.f81270F = new C31025a(i) {
            /* renamed from: a */
            public final boolean mo81460a() {
                if (ShareAwemeReceiveAutoPlayViewHolder.this.f81272n == null || !ShareAwemeReceiveAutoPlayViewHolder.this.f81272n.mo82990a()) {
                    return false;
                }
                return true;
            }

            /* renamed from: a */
            public final void mo81458a(int i) {
                ShareAwemeReceiveAutoPlayViewHolder.this.mo81457h();
            }

            /* renamed from: b */
            public final void mo81461b(int i) {
                ShareAwemeReceiveAutoPlayViewHolder.this.mo81444f();
            }

            /* renamed from: a */
            public final void mo81459a(boolean z) {
                ShareAwemeReceiveAutoPlayViewHolder.this.mo81455a(z);
            }
        };
        C31024d.m101252a(i, this.f81270F);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.amr);
        if (this.f81269E == null) {
            this.f81269E = C21780t.m72807a().mo57889a(this.itemView.getContext());
            if (this.f81269E != null) {
                frameLayout.addView(this.f81269E.mo56936a());
            }
        }
        if (this.f81269E == null) {
            frameLayout.setVisibility(8);
        } else if (TextUtils.isEmpty(shareAwemeContent.getDiamondGameId())) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            shareAwemeContent.getItemId();
        }
    }
}
