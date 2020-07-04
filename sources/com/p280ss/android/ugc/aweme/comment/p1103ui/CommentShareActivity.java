package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.share.C24242c.C24243a;
import com.p280ss.android.ugc.aweme.comment.share.CommentShareVideoWidget;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.ShareChannelBar;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentShareActivity */
public class CommentShareActivity extends AmeBaseActivity {

    /* renamed from: H */
    public static String f64094H = "";

    /* renamed from: I */
    public static final C24271a f64095I = new C24271a(null);

    /* renamed from: A */
    public CommentShareVideoWidget f64096A;

    /* renamed from: B */
    public String f64097B;

    /* renamed from: C */
    public Comment f64098C;

    /* renamed from: D */
    public Integer f64099D;

    /* renamed from: E */
    public ImmersionBar f64100E;

    /* renamed from: F */
    public boolean f64101F;

    /* renamed from: G */
    public float f64102G;

    /* renamed from: b */
    public View f64103b;

    /* renamed from: c */
    public View f64104c;

    /* renamed from: d */
    public Aweme f64105d;

    /* renamed from: e */
    public ShareChannelBar f64106e;

    /* renamed from: q */
    public DmtTextView f64107q;

    /* renamed from: r */
    public DmtTextView f64108r;

    /* renamed from: s */
    public View f64109s;

    /* renamed from: t */
    public View f64110t;

    /* renamed from: u */
    public View f64111u;

    /* renamed from: v */
    public View f64112v;

    /* renamed from: w */
    public ImageView f64113w;

    /* renamed from: x */
    public ImageView f64114x;

    /* renamed from: y */
    public Activity f64115y;

    /* renamed from: z */
    public WidgetManager f64116z;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentShareActivity$a */
    public static final class C24271a {
        private C24271a() {
        }

        /* renamed from: a */
        public static String m79875a() {
            return CommentShareActivity.f64094H;
        }

        public /* synthetic */ C24271a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m79876a(String str) {
            C7573i.m23587b(str, "<set-?>");
            CommentShareActivity.f64094H = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentShareActivity$b */
    static final class C24272b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentShareActivity f64117a;

        C24272b(CommentShareActivity commentShareActivity) {
            this.f64117a = commentShareActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f64117a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentShareActivity$c */
    static final class C24273c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentShareActivity f64118a;

        C24273c(CommentShareActivity commentShareActivity) {
            this.f64118a = commentShareActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f64118a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentShareActivity$d */
    public static final class C24274d implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CommentShareActivity f64119a;

        public final void onGlobalLayout() {
            MarginLayoutParams marginLayoutParams;
            boolean z;
            CharSequence charSequence;
            if (this.f64119a.mo63116n().getWidth() != 0) {
                String str = this.f64119a.f64097B;
                if (str == null) {
                    C7573i.m23580a();
                }
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f64119a.f64102G = C9738o.m28708b((Context) this.f64119a.mo63120r(), 20.0f);
                    Paint paint = new Paint();
                    paint.setTextSize(this.f64119a.f64102G);
                    float measureText = paint.measureText(this.f64119a.f64097B);
                    float width = measureText / ((float) this.f64119a.mo63116n().getWidth());
                    if (width > 1.0f) {
                        this.f64119a.f64102G = C9738o.m28708b((Context) this.f64119a.mo63120r(), 16.0f);
                        paint.setTextSize(this.f64119a.f64102G);
                        measureText = paint.measureText(this.f64119a.f64097B);
                        width = measureText / ((float) this.f64119a.mo63116n().getWidth());
                    }
                    if (width > 2.0f) {
                        this.f64119a.f64102G = C9738o.m28708b((Context) this.f64119a.mo63120r(), 12.0f);
                        paint.setTextSize(this.f64119a.f64102G);
                        measureText = paint.measureText(this.f64119a.f64097B);
                        width = measureText / ((float) this.f64119a.mo63116n().getWidth());
                    }
                    this.f64119a.mo63116n().setTextSize(0, this.f64119a.f64102G);
                    if (width <= 1.0f) {
                        this.f64119a.mo63116n().setGravity(17);
                    } else {
                        this.f64119a.mo63116n().setGravity(19);
                    }
                    if (C6399b.m19945u() && width > 4.0f) {
                        String str2 = this.f64119a.f64097B;
                        if (str2 == null) {
                            C7573i.m23580a();
                        }
                        float width2 = ((float) (this.f64119a.mo63116n().getWidth() * 4)) / (measureText / ((float) str2.length()));
                        CharSequence charSequence2 = "...";
                        try {
                            charSequence = this.f64119a.mo63116n().getText().subSequence(0, ((int) width2) - 3);
                        } catch (Exception unused) {
                            charSequence2 = "";
                            charSequence = this.f64119a.mo63116n().getText();
                        }
                        DmtTextView n = this.f64119a.mo63116n();
                        StringBuilder sb = new StringBuilder();
                        sb.append(charSequence.toString());
                        sb.append(charSequence2.toString());
                        n.setText(sb.toString());
                        this.f64119a.mo63116n().setMaxLines(4);
                    }
                }
            }
            this.f64119a.f64097B = this.f64119a.mo63116n().getText().toString();
            C27608b.m90502a((TextView) this.f64119a.mo63116n());
            float height = ((float) this.f64119a.mo63111i().getHeight()) / 1280.0f;
            float width3 = ((float) this.f64119a.mo63111i().getWidth()) / 1280.0f;
            Video video = this.f64119a.mo63113k().getVideo();
            C7573i.m23582a((Object) video, "mCurrentAweme.video");
            int height2 = video.getHeight();
            Video video2 = this.f64119a.mo63113k().getVideo();
            C7573i.m23582a((Object) video2, "mCurrentAweme.video");
            if (C24243a.m79623a(height2, video2.getWidth())) {
                height = width3;
            }
            if (height > 1.0f) {
                height = 1.0f;
            }
            Video video3 = this.f64119a.mo63113k().getVideo();
            C7573i.m23582a((Object) video3, "mCurrentAweme.video");
            int height3 = video3.getHeight();
            Video video4 = this.f64119a.mo63113k().getVideo();
            C7573i.m23582a((Object) video4, "mCurrentAweme.video");
            if (C24243a.m79623a(height3, video4.getWidth())) {
                LayoutParams layoutParams = this.f64119a.mo63117o().getLayoutParams();
                if (layoutParams != null) {
                    marginLayoutParams = (LinearLayout.LayoutParams) layoutParams;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            } else {
                LayoutParams layoutParams2 = this.f64119a.mo63117o().getLayoutParams();
                if (layoutParams2 != null) {
                    marginLayoutParams = (FrameLayout.LayoutParams) layoutParams2;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
            marginLayoutParams.setMarginStart((int) (((float) marginLayoutParams.getMarginStart()) * height));
            marginLayoutParams.setMarginEnd((int) (((float) marginLayoutParams.getMarginEnd()) * height));
            marginLayoutParams.bottomMargin = (int) (((float) marginLayoutParams.bottomMargin) * height);
            this.f64119a.mo63117o().setPadding((int) (((float) this.f64119a.mo63117o().getPaddingStart()) * height), 0, (int) (((float) this.f64119a.mo63117o().getPaddingEnd()) * height), 0);
            this.f64119a.mo63117o().setLayoutParams(marginLayoutParams);
            LayoutParams layoutParams3 = this.f64119a.mo63118p().getLayoutParams();
            if (layoutParams3 != null) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.height = (int) (((float) layoutParams4.height) * height);
                this.f64119a.mo63118p().setLayoutParams(layoutParams4);
                LayoutParams layoutParams5 = this.f64119a.mo63119q().getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = (int) (((float) layoutParams5.height) * height);
                    layoutParams5.width = (int) (((float) layoutParams5.width) * height);
                    this.f64119a.mo63119q().setLayoutParams(layoutParams5);
                    this.f64119a.mo63115m().setTextSize(0, this.f64119a.mo63115m().getTextSize() * height);
                    this.f64119a.mo63116n().setTextSize(0, this.f64119a.f64102G * height);
                    this.f64119a.mo63116n().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }

        C24274d(CommentShareActivity commentShareActivity) {
            this.f64119a = commentShareActivity;
        }
    }

    /* renamed from: c */
    public void mo58711c() {
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.ag, R.anim.ah);
    }

    /* renamed from: i */
    public final View mo63111i() {
        View view = this.f64103b;
        if (view == null) {
            C7573i.m23583a("mVideoContainerView");
        }
        return view;
    }

    /* renamed from: j */
    public final View mo63112j() {
        View view = this.f64104c;
        if (view == null) {
            C7573i.m23583a("mWidgetRoot");
        }
        return view;
    }

    /* renamed from: k */
    public final Aweme mo63113k() {
        Aweme aweme = this.f64105d;
        if (aweme == null) {
            C7573i.m23583a("mCurrentAweme");
        }
        return aweme;
    }

    /* renamed from: l */
    public final ShareChannelBar mo63114l() {
        ShareChannelBar shareChannelBar = this.f64106e;
        if (shareChannelBar == null) {
            C7573i.m23583a("mShareChannelBar");
        }
        return shareChannelBar;
    }

    /* renamed from: m */
    public final DmtTextView mo63115m() {
        DmtTextView dmtTextView = this.f64107q;
        if (dmtTextView == null) {
            C7573i.m23583a("mAwemeAuthorNameView");
        }
        return dmtTextView;
    }

    /* renamed from: n */
    public final DmtTextView mo63116n() {
        DmtTextView dmtTextView = this.f64108r;
        if (dmtTextView == null) {
            C7573i.m23583a("mCommentContentView");
        }
        return dmtTextView;
    }

    /* renamed from: o */
    public final View mo63117o() {
        View view = this.f64110t;
        if (view == null) {
            C7573i.m23583a("mCommentWaterMarkView");
        }
        return view;
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar immersionBar = this.f64100E;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    /* renamed from: p */
    public final View mo63118p() {
        View view = this.f64111u;
        if (view == null) {
            C7573i.m23583a("mCommentShareTitleView");
        }
        return view;
    }

    /* renamed from: q */
    public final ImageView mo63119q() {
        ImageView imageView = this.f64113w;
        if (imageView == null) {
            C7573i.m23583a("mlogoView");
        }
        return imageView;
    }

    /* renamed from: r */
    public final Activity mo63120r() {
        Activity activity = this.f64115y;
        if (activity == null) {
            C7573i.m23583a("mContext");
        }
        return activity;
    }

    /* renamed from: s */
    public final CommentShareVideoWidget mo63121s() {
        CommentShareVideoWidget commentShareVideoWidget = this.f64096A;
        if (commentShareVideoWidget == null) {
            C7573i.m23583a("commentShareVideoWidget");
        }
        return commentShareVideoWidget;
    }

    public void onResume() {
        super.onResume();
        this.f64100E = ImmersionBar.with((Activity) this).statusBarColor((int) R.color.ac4);
        ImmersionBar immersionBar = this.f64100E;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    /* renamed from: a */
    public final int mo58708a() {
        Aweme aweme = this.f64105d;
        if (aweme == null) {
            C7573i.m23583a("mCurrentAweme");
        }
        Video video = aweme.getVideo();
        C7573i.m23582a((Object) video, "mCurrentAweme.video");
        int height = video.getHeight();
        Aweme aweme2 = this.f64105d;
        if (aweme2 == null) {
            C7573i.m23583a("mCurrentAweme");
        }
        Video video2 = aweme2.getVideo();
        C7573i.m23582a((Object) video2, "mCurrentAweme.video");
        if (C24243a.m79623a(height, video2.getWidth())) {
            return R.layout.b0;
        }
        return R.layout.az;
    }

    /* renamed from: t */
    public final File mo63128t() {
        int i;
        int i2;
        View view = this.f64110t;
        if (view == null) {
            C7573i.m23583a("mCommentWaterMarkView");
        }
        int width = view.getWidth();
        View view2 = this.f64110t;
        if (view2 == null) {
            C7573i.m23583a("mCommentWaterMarkView");
        }
        int height = view2.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        View view3 = this.f64110t;
        if (view3 == null) {
            C7573i.m23583a("mCommentWaterMarkView");
        }
        view3.layout(0, 0, width, height);
        View view4 = this.f64110t;
        if (view4 == null) {
            C7573i.m23583a("mCommentWaterMarkView");
        }
        view4.draw(canvas);
        Aweme aweme = this.f64105d;
        if (aweme == null) {
            C7573i.m23583a("mCurrentAweme");
        }
        Video video = aweme.getVideo();
        C7573i.m23582a((Object) video, "mCurrentAweme.video");
        int height2 = video.getHeight();
        Aweme aweme2 = this.f64105d;
        if (aweme2 == null) {
            C7573i.m23583a("mCurrentAweme");
        }
        Video video2 = aweme2.getVideo();
        C7573i.m23582a((Object) video2, "mCurrentAweme.video");
        if (C24243a.m79623a(height2, video2.getWidth())) {
            Aweme aweme3 = this.f64105d;
            if (aweme3 == null) {
                C7573i.m23583a("mCurrentAweme");
            }
            Video video3 = aweme3.getVideo();
            C7573i.m23582a((Object) video3, "mCurrentAweme.video");
            i = video3.getWidth();
            double d = (double) height;
            double d2 = (double) i;
            Double.isNaN(d2);
            double d3 = d2 * 1.0d;
            double d4 = (double) width;
            Double.isNaN(d4);
            double d5 = d3 / d4;
            Double.isNaN(d);
            i2 = (int) (d * d5);
        } else {
            Aweme aweme4 = this.f64105d;
            if (aweme4 == null) {
                C7573i.m23583a("mCurrentAweme");
            }
            Video video4 = aweme4.getVideo();
            C7573i.m23582a((Object) video4, "mCurrentAweme.video");
            double width2 = (double) video4.getWidth();
            Double.isNaN(width2);
            i = (int) (width2 * 0.9d);
            double d6 = (double) height;
            double d7 = (double) i;
            Double.isNaN(d7);
            double d8 = d7 * 1.0d;
            double d9 = (double) width;
            Double.isNaN(d9);
            double d10 = d8 / d9;
            Double.isNaN(d6);
            i2 = (int) (d6 * d10);
        }
        Bitmap a = C24243a.m79620a(createBitmap, i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        String a2 = C6306c.m19561a(sb.toString());
        C7573i.m23582a((Object) a2, "DigestUtils.md5Hex(\"\" + …stem.currentTimeMillis())");
        return C24243a.m79621a(a, a2);
    }

    /* renamed from: d */
    private final void mo59893d() {
        User user;
        View findViewById = findViewById(R.id.jo);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.back_btn)");
        this.f64114x = (ImageView) findViewById;
        ImageView imageView = this.f64114x;
        if (imageView == null) {
            C7573i.m23583a("mBackView");
        }
        imageView.setOnClickListener(new C24272b(this));
        View findViewById2 = findViewById(R.id.eac);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.video_container)");
        this.f64103b = findViewById2;
        View findViewById3 = findViewById(R.id.eh6);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.widget_root)");
        this.f64104c = findViewById3;
        Integer num = this.f64099D;
        if (num == null || num.intValue() != 0) {
            View view = this.f64104c;
            if (view == null) {
                C7573i.m23583a("mWidgetRoot");
            }
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                Integer num2 = this.f64099D;
                if (num2 == null) {
                    C7573i.m23580a();
                }
                layoutParams.height = num2.intValue();
                View view2 = this.f64104c;
                if (view2 == null) {
                    C7573i.m23583a("mWidgetRoot");
                }
                view2.setLayoutParams(layoutParams);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        FragmentActivity fragmentActivity = this;
        View view3 = this.f64104c;
        if (view3 == null) {
            C7573i.m23583a("mWidgetRoot");
        }
        this.f64116z = WidgetManager.m75869a(fragmentActivity, view3);
        Aweme aweme = this.f64105d;
        if (aweme == null) {
            C7573i.m23583a("mCurrentAweme");
        }
        this.f64096A = new CommentShareVideoWidget(aweme);
        WidgetManager widgetManager = this.f64116z;
        if (widgetManager != null) {
            View view4 = this.f64103b;
            if (view4 == null) {
                C7573i.m23583a("mVideoContainerView");
            }
            CommentShareVideoWidget commentShareVideoWidget = this.f64096A;
            if (commentShareVideoWidget == null) {
                C7573i.m23583a("commentShareVideoWidget");
            }
            widgetManager.mo60152a(view4, (Widget) commentShareVideoWidget);
        }
        View findViewById4 = findViewById(R.id.bse);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.ll_share_container)");
        this.f64106e = (ShareChannelBar) findViewById4;
        mo58711c();
        View findViewById5 = findViewById(R.id.zq);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.comment_share_out_view)");
        this.f64109s = findViewById5;
        View view5 = this.f64109s;
        if (view5 == null) {
            C7573i.m23583a("mCommentShareOutView");
        }
        view5.setOnClickListener(new C24273c(this));
        View findViewById6 = findViewById(R.id.zw);
        C7573i.m23582a((Object) findViewById6, "findViewById(R.id.comment_watermark_view)");
        this.f64110t = findViewById6;
        View findViewById7 = findViewById(R.id.zr);
        C7573i.m23582a((Object) findViewById7, "findViewById(R.id.comment_share_title)");
        this.f64111u = findViewById7;
        View findViewById8 = findViewById(R.id.c_f);
        C7573i.m23582a((Object) findViewById8, "findViewById(R.id.part_line)");
        this.f64112v = findViewById8;
        View findViewById9 = findViewById(R.id.hx);
        C7573i.m23582a((Object) findViewById9, "findViewById(R.id.author_name)");
        this.f64107q = (DmtTextView) findViewById9;
        StringBuilder sb = new StringBuilder("@");
        Comment comment = this.f64098C;
        if (comment != null) {
            user = comment.getUser();
        } else {
            user = null;
        }
        sb.append(C43122ff.m136774e(user));
        sb.append(' ');
        String sb2 = sb.toString();
        String string = getString(R.string.a9_, new Object[]{sb2});
        C7573i.m23582a((Object) string, "authorName");
        CharSequence charSequence = string;
        int a = C7634n.m23730a(charSequence, sb2, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(charSequence);
        Activity activity = this.f64115y;
        if (activity == null) {
            C7573i.m23583a("mContext");
        }
        spannableString.setSpan(new ForegroundColorSpan(activity.getResources().getColor(R.color.az3)), a, sb2.length() + a, 18);
        DmtTextView dmtTextView = this.f64107q;
        if (dmtTextView == null) {
            C7573i.m23583a("mAwemeAuthorNameView");
        }
        dmtTextView.setText(spannableString);
        View findViewById10 = findViewById(R.id.bvu);
        C7573i.m23582a((Object) findViewById10, "findViewById(R.id.logo_icon)");
        this.f64113w = (ImageView) findViewById10;
        if (C6399b.m19945u()) {
            ImageView imageView2 = this.f64113w;
            if (imageView2 == null) {
                C7573i.m23583a("mlogoView");
            }
            imageView2.setImageResource(R.drawable.a6g);
        }
        View findViewById11 = findViewById(R.id.z6);
        C7573i.m23582a((Object) findViewById11, "findViewById(R.id.comment_content)");
        this.f64108r = (DmtTextView) findViewById11;
        DmtTextView dmtTextView2 = this.f64108r;
        if (dmtTextView2 == null) {
            C7573i.m23583a("mCommentContentView");
        }
        dmtTextView2.setText(this.f64097B);
        DmtTextView dmtTextView3 = this.f64108r;
        if (dmtTextView3 == null) {
            C7573i.m23583a("mCommentContentView");
        }
        dmtTextView3.getViewTreeObserver().addOnGlobalLayoutListener(new C24274d(this));
    }

    public final void setMCommentShareOutView(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f64109s = view;
    }

    public final void setMCommentShareTitleView(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f64111u = view;
    }

    public final void setMCommentWaterMarkView(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f64110t = view;
    }

    public final void setMPartLineView(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f64112v = view;
    }

    public final void setMVideoContainerView(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f64103b = view;
    }

    public final void setMWidgetRoot(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f64104c = view;
    }

    public void onCreate(Bundle bundle) {
        Serializable serializable;
        Serializable serializable2;
        String str;
        Intent intent = getIntent();
        Integer num = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("CURRENT_AWEME_FOR_COMMENT");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f64105d = (Aweme) serializable;
            Intent intent2 = getIntent();
            if (intent2 != null) {
                serializable2 = intent2.getSerializableExtra("CURRENT_COMMENT");
            } else {
                serializable2 = null;
            }
            if (serializable2 != null) {
                this.f64098C = (Comment) serializable2;
                Comment comment = this.f64098C;
                if (comment != null) {
                    str = comment.getText();
                } else {
                    str = null;
                }
                this.f64097B = str;
                Intent intent3 = getIntent();
                if (intent3 != null) {
                    num = Integer.valueOf(intent3.getIntExtra("COMMENT_VIEW_HEIGHT", 0));
                }
                this.f64099D = num;
                overridePendingTransition(R.anim.ag, R.anim.ah);
                super.onCreate(bundle);
                this.f64115y = this;
                mo59893d();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.model.Comment");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
    }
}
