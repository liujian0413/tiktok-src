package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29961b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C31055x;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b.C7053a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31878ax;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog */
public class ImShareDialog extends AppCompatDialog {

    /* renamed from: a */
    public final C7053a f83549a;

    /* renamed from: b */
    public final C7053a f83550b;

    /* renamed from: c */
    public EditText f83551c;

    /* renamed from: d */
    public SharePackage f83552d;

    /* renamed from: e */
    private final IMUser[] f83553e;

    /* renamed from: f */
    private final IMContact[] f83554f;

    /* renamed from: g */
    private RemoteImageView f83555g;

    /* renamed from: h */
    private DmtTextView f83556h;

    /* renamed from: i */
    private ViewGroup f83557i;

    /* renamed from: j */
    private TextView f83558j;

    /* renamed from: k */
    private Button f83559k;

    /* renamed from: l */
    private Button f83560l;

    /* renamed from: m */
    private View f83561m;

    /* renamed from: n */
    private Context f83562n;

    /* renamed from: o */
    private String f83563o;

    /* renamed from: p */
    private int f83564p;

    /* renamed from: q */
    private int f83565q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog$a */
    public static class C31977a {

        /* renamed from: a */
        public Context f83569a;

        /* renamed from: b */
        public IMContact[] f83570b;

        /* renamed from: c */
        public IMUser[] f83571c;

        /* renamed from: d */
        public SharePackage f83572d;

        /* renamed from: e */
        public C7053a f83573e;

        /* renamed from: f */
        public C7053a f83574f;

        /* renamed from: g */
        public String f83575g;

        /* renamed from: h */
        private int f83576h;

        /* renamed from: i */
        private int f83577i;

        /* renamed from: a */
        public final ImShareDialog mo82861a() {
            return new ImShareDialog(this);
        }

        /* renamed from: a */
        public final C31977a mo82856a(C7053a aVar) {
            this.f83573e = aVar;
            return this;
        }

        /* renamed from: b */
        public final C31977a mo82863b(C7053a aVar) {
            this.f83574f = aVar;
            return this;
        }

        public C31977a(Context context) {
            this.f83569a = context;
        }

        /* renamed from: a */
        public final C31977a mo82857a(SharePackage sharePackage) {
            this.f83572d = sharePackage;
            return this;
        }

        /* renamed from: a */
        public final C31977a mo82855a(int i) {
            this.f83576h = C29961b.m98232a(this.f83569a, 416.0f);
            return this;
        }

        /* renamed from: b */
        public final C31977a mo82862b(int i) {
            this.f83577i = C29961b.m98232a(this.f83569a, 335.0f);
            return this;
        }

        /* renamed from: a */
        public final C31977a mo82858a(String str) {
            if (str == null) {
                str = "";
            }
            this.f83575g = str;
            return this;
        }

        /* renamed from: a */
        public final C31977a mo82859a(IMContact[] iMContactArr) {
            this.f83570b = iMContactArr;
            this.f83571c = null;
            return this;
        }

        /* renamed from: a */
        public final C31977a mo82860a(IMUser[] iMUserArr) {
            this.f83571c = iMUserArr;
            this.f83570b = null;
            return this;
        }
    }

    /* renamed from: d */
    private void m103857d() {
        m103852a();
        m103856c();
    }

    public void cancel() {
        m103859f();
        super.cancel();
    }

    public void dismiss() {
        m103859f();
        super.dismiss();
    }

    /* renamed from: a */
    private void m103852a() {
        if (this.f83553e != null && this.f83553e.length > 0) {
            m103854a((T[]) this.f83553e);
        }
    }

    /* renamed from: c */
    private void m103856c() {
        if (this.f83554f != null && this.f83554f.length > 0) {
            m103854a((T[]) this.f83554f);
        }
    }

    /* renamed from: f */
    private void m103859f() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f83551c.getWindowToken(), 0);
        }
    }

    /* renamed from: e */
    private void m103858e() {
        Resources resources = getContext().getResources();
        float f = (((float) this.f83552d.f20186l.getInt("aweme_width")) * 1.0f) / ((float) this.f83552d.f20186l.getInt("aweme_height"));
        if (f <= 0.7516f) {
            this.f83564p = resources.getDimensionPixelSize(R.dimen.g3);
            this.f83565q = resources.getDimensionPixelSize(R.dimen.g4);
        } else if (f >= 1.65f) {
            this.f83564p = resources.getDimensionPixelSize(R.dimen.g4);
            this.f83565q = resources.getDimensionPixelSize(R.dimen.g2);
        } else {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.g4);
            this.f83565q = dimensionPixelSize;
            this.f83564p = dimensionPixelSize;
        }
    }

    private ImShareDialog(C31977a aVar) {
        super(aVar.f83569a, R.style.ue);
        this.f83562n = aVar.f83569a;
        this.f83553e = aVar.f83571c;
        this.f83554f = aVar.f83570b;
        this.f83552d = aVar.f83572d;
        this.f83549a = aVar.f83573e;
        this.f83550b = aVar.f83574f;
        this.f83563o = aVar.f83575g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82849a(TextView textView) {
        if (textView.getWidth() > C29961b.m98232a(getContext(), 90.0f)) {
            LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C29961b.m98232a(C6399b.m19921a(), 90.0f);
            textView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private <T extends IMContact> void m103854a(T[] tArr) {
        this.f83557i.removeAllViews();
        if (tArr.length == 1) {
            this.f83558j.setText(R.string.bpc);
            this.f83560l.setText(R.string.bp9);
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aje, null);
            AvatarImageView avatarImageView = (AvatarImageView) inflate.findViewById(R.id.j0);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.e_q);
            TextView textView = (TextView) inflate.findViewById(R.id.e9m);
            T t = tArr[0];
            C23323e.m76524b(avatarImageView, t.getDisplayAvatar());
            textView.setText(t.getDisplayName());
            if (!C6399b.m19944t()) {
                m103853a(imageView, t);
            } else {
                IMUser a = C6961d.m21661a((IMContact) t);
                if (a != null) {
                    C43126fg.m136801a(getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), textView);
                } else {
                    C43126fg.m136801a(getContext(), "", "", textView);
                }
            }
            this.f83557i.addView(inflate);
            return;
        }
        this.f83558j.setText(R.string.bn5);
        int length = tArr.length;
        for (T t2 : tArr) {
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.ajd, null);
            ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.e_q);
            C23323e.m76524b((AvatarImageView) inflate2.findViewById(R.id.j0), t2.getDisplayAvatar());
            m103853a(imageView2, t2);
            this.f83557i.addView(inflate2);
        }
        Button button = this.f83560l;
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getResources().getText(R.string.bp9));
        sb.append("(");
        sb.append(length);
        sb.append(")");
        button.setText(sb.toString());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        this.f83561m = LayoutInflater.from(this.f83562n).inflate(R.layout.ke, null);
        setContentView(this.f83561m);
        setCancelable(false);
        this.f83558j = (TextView) findViewById(R.id.d3f);
        this.f83557i = (ViewGroup) findViewById(R.id.e9j);
        this.f83555g = (RemoteImageView) findViewById(R.id.d55);
        this.f83556h = (DmtTextView) findViewById(R.id.d61);
        this.f83551c = (EditText) findViewById(R.id.ac9);
        this.f83551c.setText(this.f83563o);
        this.f83551c.setSelection(this.f83551c.getText().length());
        this.f83559k = (Button) findViewById(R.id.d4v);
        this.f83560l = (Button) findViewById(R.id.d50);
        C31878ax.m103576a(this.f83559k);
        C31878ax.m103576a(this.f83560l);
        this.f83559k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ImShareDialog.this.f83549a != null) {
                    ImShareDialog.this.f83549a.onShare(ImShareDialog.this.f83551c.getText().toString());
                }
                ImShareDialog.this.dismiss();
            }
        });
        this.f83560l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (ImShareDialog.this.f83550b != null) {
                    if (TextUtils.equals("story_reply", ImShareDialog.this.f83552d.f20181g) && TextUtils.isEmpty(ImShareDialog.this.f83551c.getText())) {
                        C10761a.m31400c(ImShareDialog.this.getContext(), (int) R.string.bqj, 1).mo25750a();
                    } else if (ImShareDialog.this.f83551c.getText().length() > C31863ai.m103525a()) {
                        C9738o.m28697a(C6399b.m19921a(), C6399b.m19921a().getResources().getString(R.string.bmn));
                    } else {
                        ImShareDialog.this.f83550b.onShare(ImShareDialog.this.f83551c.getText().toString());
                        ImShareDialog.this.dismiss();
                    }
                }
            }
        });
        if ((C7052b.m21960a(this.f83552d) && this.f83552d.f20186l.getInt("aweme_type") == 2) || TextUtils.equals("pic", this.f83552d.f20181g)) {
            m103858e();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f83555g.getLayoutParams();
            layoutParams.width = this.f83564p;
            layoutParams.height = this.f83565q;
            this.f83555g.setLayoutParams(layoutParams);
        }
        if (TextUtils.equals("text", this.f83552d.f20181g) || TextUtils.equals("coupon", this.f83552d.f20181g)) {
            String string = this.f83552d.f20186l.getString("share_text");
            this.f83556h.setText(string);
            this.f83555g.setVisibility(8);
            this.f83556h.setVisibility(0);
            if (string != null && string.length() <= 1024) {
                C27608b.m90502a((TextView) this.f83556h);
            }
        } else {
            this.f83555g.setVisibility(0);
            this.f83556h.setVisibility(8);
            m103855a(this.f83555g, this.f83552d);
        }
        String str = this.f83552d.f20181g;
        String str2 = this.f83552d.f20183i;
        String string2 = this.f83552d.f20186l.getString("name");
        if (TextUtils.equals("good", str) || TextUtils.equals("good_window", str)) {
            TextView textView = (TextView) findViewById(R.id.d58);
            if (TextUtils.equals("good", str) && !TextUtils.isEmpty(str2)) {
                findViewById(R.id.bsf).setVisibility(0);
                findViewById(R.id.d59).setVisibility(8);
                textView.setText(str2);
                textView.setVisibility(0);
                LayoutParams layoutParams2 = this.f83555g.getLayoutParams();
                layoutParams2.width = C29961b.m98232a(C6399b.m19921a(), 165.0f);
                layoutParams2.height = C29961b.m98232a(C6399b.m19921a(), 165.0f);
                this.f83555g.setLayoutParams(layoutParams2);
                RoundingParams roundingParams = new RoundingParams();
                roundingParams.mo32879a(C9738o.m28708b(C6399b.m19921a(), 2.0f));
                ((C13438a) this.f83555g.getHierarchy()).mo32897a(roundingParams);
                ((C13438a) this.f83555g.getHierarchy()).mo32898b((int) R.drawable.b7k);
            } else if (TextUtils.equals("good_window", str) && !TextUtils.isEmpty(string2)) {
                findViewById(R.id.bsf).setVisibility(0);
                textView.setText(string2);
                textView.setVisibility(0);
                textView.post(new C31993h(this, textView));
                LayoutParams layoutParams3 = this.f83555g.getLayoutParams();
                layoutParams3.width = C29961b.m98232a(C6399b.m19921a(), 120.0f);
                layoutParams3.height = C29961b.m98232a(C6399b.m19921a(), 120.0f);
                this.f83555g.setLayoutParams(layoutParams3);
                RoundingParams roundingParams2 = new RoundingParams();
                roundingParams2.mo32884a(true);
                ((C13438a) this.f83555g.getHierarchy()).mo32897a(roundingParams2);
                ((C13438a) this.f83555g.getHierarchy()).mo32898b((int) R.drawable.b7l);
            }
        }
        this.f83551c.setFilters(new InputFilter[]{new C31055x(C31863ai.m103525a())});
        this.f83551c.setOnKeyListener(new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return i == 66;
            }
        });
        m103857d();
    }

    /* renamed from: a */
    private static <T extends IMContact> void m103853a(ImageView imageView, T t) {
        C31889bb.m103601a(imageView, C6961d.m21661a((IMContact) t));
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m103855a(com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView r8, com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x01e8
            if (r9 != 0) goto L_0x0007
            goto L_0x01e8
        L_0x0007:
            java.lang.String r1 = r9.f20181g
            if (r1 != 0) goto L_0x0017
            android.os.Bundle r9 = r9.f20186l
            java.lang.String r1 = "video_cover"
            java.lang.String r9 = r9.getString(r1)
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r8, r9)
            return r0
        L_0x0017:
            com.facebook.drawee.c.b r1 = r8.getHierarchy()
            com.facebook.drawee.generic.a r1 = (com.facebook.drawee.generic.C13438a) r1
            r2 = 2131231121(0x7f080191, float:1.8078314E38)
            r1.mo32898b(r2)
            android.os.Bundle r1 = r9.f20186l
            java.lang.String r2 = "video_cover"
            java.io.Serializable r1 = r1.getSerializable(r2)
            android.os.Bundle r2 = r9.f20186l
            java.lang.String r3 = "thumb_url"
            java.lang.String r2 = r2.getString(r3)
            android.os.Bundle r3 = r9.f20186l
            java.lang.String r4 = "thumb_for_share"
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = r9.f20181g
            r5 = -1
            int r6 = r4.hashCode()
            r7 = 1
            switch(r6) {
                case -1890252483: goto L_0x00af;
                case -913038159: goto L_0x00a4;
                case 102340: goto L_0x009a;
                case 108124: goto L_0x008f;
                case 117588: goto L_0x0085;
                case 3165170: goto L_0x007b;
                case 3322092: goto L_0x0071;
                case 3599307: goto L_0x0067;
                case 104263205: goto L_0x005d;
                case 978111542: goto L_0x0053;
                case 1402633315: goto L_0x0048;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x00ba
        L_0x0048:
            java.lang.String r6 = "challenge"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 0
            goto L_0x00bb
        L_0x0053:
            java.lang.String r6 = "ranking"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 1
            goto L_0x00bb
        L_0x005d:
            java.lang.String r6 = "music"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 2
            goto L_0x00bb
        L_0x0067:
            java.lang.String r6 = "user"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 5
            goto L_0x00bb
        L_0x0071:
            java.lang.String r6 = "live"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 7
            goto L_0x00bb
        L_0x007b:
            java.lang.String r6 = "game"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 3
            goto L_0x00bb
        L_0x0085:
            java.lang.String r6 = "web"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 6
            goto L_0x00bb
        L_0x008f:
            java.lang.String r6 = "mix"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 9
            goto L_0x00bb
        L_0x009a:
            java.lang.String r6 = "gif"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 4
            goto L_0x00bb
        L_0x00a4:
            java.lang.String r6 = "story_video"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 8
            goto L_0x00bb
        L_0x00af:
            java.lang.String r6 = "sticker"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00ba
            r4 = 10
            goto L_0x00bb
        L_0x00ba:
            r4 = -1
        L_0x00bb:
            switch(r4) {
                case 0: goto L_0x01db;
                case 1: goto L_0x01a7;
                case 2: goto L_0x018b;
                case 3: goto L_0x015d;
                case 4: goto L_0x0152;
                case 5: goto L_0x0131;
                case 6: goto L_0x011e;
                case 7: goto L_0x0104;
                case 8: goto L_0x00ef;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00c9;
                default: goto L_0x00be;
            }
        L_0x00be:
            boolean r9 = r1 instanceof com.p280ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x01e7
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31892bd.m103609a(r8, r1)
            goto L_0x01e6
        L_0x00c9:
            boolean r9 = r1 instanceof com.p280ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r8, r1)
            goto L_0x01e6
        L_0x00d4:
            r9 = 2131233832(0x7f080c28, float:1.8083813E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r9)
            goto L_0x01e6
        L_0x00dc:
            boolean r9 = r1 instanceof com.p280ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r8, r1)
            goto L_0x01e6
        L_0x00e7:
            r9 = 2131233824(0x7f080c20, float:1.8083796E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r9)
            goto L_0x01e6
        L_0x00ef:
            r9 = 2131233833(0x7f080c29, float:1.8083815E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r9)
            boolean r9 = r1 instanceof com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.EncryptUrlModel
            if (r9 == 0) goto L_0x01e6
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.EncryptUrlModel r1 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.EncryptUrlModel) r1
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.EncryptUrlModel.convert(r1)
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r8, r9)
            goto L_0x01e6
        L_0x0104:
            boolean r9 = r1 instanceof com.p280ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x010f
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r8, r1)
            goto L_0x01e6
        L_0x010f:
            if (r3 == 0) goto L_0x0116
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r8, r3)
            goto L_0x01e6
        L_0x0116:
            r9 = 2131233825(0x7f080c21, float:1.8083798E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r9)
            goto L_0x01e6
        L_0x011e:
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 != 0) goto L_0x0129
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r8, r2)
            goto L_0x01e6
        L_0x0129:
            r9 = 2131233834(0x7f080c2a, float:1.8083817E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r9)
            goto L_0x01e6
        L_0x0131:
            com.facebook.drawee.c.b r9 = r8.getHierarchy()
            com.facebook.drawee.generic.a r9 = (com.facebook.drawee.generic.C13438a) r9
            com.facebook.drawee.generic.RoundingParams r9 = r9.f35619a
            if (r9 == 0) goto L_0x0147
            r9.mo32884a(r7)
            com.facebook.drawee.c.b r0 = r8.getHierarchy()
            com.facebook.drawee.generic.a r0 = (com.facebook.drawee.generic.C13438a) r0
            r0.mo32897a(r9)
        L_0x0147:
            boolean r9 = r1 instanceof com.p280ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x01e6
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31892bd.m103609a(r8, r1)
            goto L_0x01e6
        L_0x0152:
            boolean r9 = r1 instanceof com.p280ss.android.ugc.aweme.base.model.UrlModel
            if (r9 == 0) goto L_0x01e6
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31892bd.m103614a(r8, r1, r0)
            goto L_0x01e6
        L_0x015d:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0168
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r8, r2)
            goto L_0x01e6
        L_0x0168:
            android.os.Bundle r9 = r9.f20186l
            java.lang.String r0 = "is_game"
            java.lang.String r9 = r9.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x01e6
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0184
            r9 = 2131233827(0x7f080c23, float:1.8083802E38)
            goto L_0x0187
        L_0x0184:
            r9 = 2131233826(0x7f080c22, float:1.80838E38)
        L_0x0187:
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r9)
            goto L_0x01e6
        L_0x018b:
            boolean r0 = r1 instanceof com.p280ss.android.ugc.aweme.base.model.UrlModel
            if (r0 == 0) goto L_0x0195
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = (com.p280ss.android.ugc.aweme.base.model.UrlModel) r1
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31892bd.m103609a(r8, r1)
            goto L_0x01e6
        L_0x0195:
            android.os.Bundle r9 = r9.f20186l
            java.lang.String r0 = "cover_thumb"
            java.lang.String r9 = r9.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x01e6
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r8, r9)
            goto L_0x01e6
        L_0x01a7:
            android.os.Bundle r9 = r9.f20186l
            java.lang.String r0 = "aweme_type"
            int r9 = r9.getInt(r0)
            r0 = 1801(0x709, float:2.524E-42)
            if (r9 != r0) goto L_0x01ba
            r9 = 2131233831(0x7f080c27, float:1.808381E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r9)
            goto L_0x01e6
        L_0x01ba:
            r0 = 1802(0x70a, float:2.525E-42)
            if (r9 != r0) goto L_0x01c5
            r9 = 2131233830(0x7f080c26, float:1.8083809E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r9)
            goto L_0x01e6
        L_0x01c5:
            r0 = 1803(0x70b, float:2.527E-42)
            if (r9 != r0) goto L_0x01d0
            r9 = 2131233829(0x7f080c25, float:1.8083807E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r9)
            goto L_0x01e6
        L_0x01d0:
            r0 = 2301(0x8fd, float:3.224E-42)
            if (r9 != r0) goto L_0x01e6
            r9 = 2131233828(0x7f080c24, float:1.8083805E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r8, r9)
            goto L_0x01e6
        L_0x01db:
            r9 = 2131233217(0x7f0809c1, float:1.8082565E38)
            r8.setImageResource(r9)
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.FIT_CENTER
            r8.setScaleType(r9)
        L_0x01e6:
            return r7
        L_0x01e7:
            return r0
        L_0x01e8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImShareDialog.m103855a(com.ss.android.ugc.aweme.base.ui.RemoteImageView, com.ss.android.ugc.aweme.sharer.ui.SharePackage):boolean");
    }
}
