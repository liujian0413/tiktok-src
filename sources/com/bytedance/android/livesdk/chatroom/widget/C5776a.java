package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.common.C5857c;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.message.model.C8683p;
import com.bytedance.android.livesdk.message.model.C8683p.C8684a;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9112a;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9113b;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9117f;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9118g;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9119h;
import com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9120i;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.a */
public final class C5776a extends C5857c implements OnClickListener {

    /* renamed from: a */
    public final CommonGuideViewModel f17018a;

    /* renamed from: b */
    private C8683p f17019b;

    /* renamed from: c */
    private HSImageView f17020c;

    /* renamed from: d */
    private TextView f17021d;

    /* renamed from: e */
    private LinearLayout f17022e;

    /* renamed from: g */
    private TextView f17023g;

    /* renamed from: h */
    private HSImageView f17024h;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.a$a */
    public static final class C5777a implements C3405a {

        /* renamed from: a */
        final /* synthetic */ ImageView f17025a;

        /* renamed from: a */
        public final void mo10308a(ImageModel imageModel) {
        }

        /* renamed from: a */
        public final void mo10310a(ImageModel imageModel, Exception exc) {
        }

        C5777a(ImageView imageView) {
            this.f17025a = imageView;
        }

        /* renamed from: a */
        public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
            LayoutParams layoutParams = this.f17025a.getLayoutParams();
            int d = C3358ac.m12526d(R.dimen.o1);
            if (layoutParams != null) {
                layoutParams.height = d;
            }
            if (layoutParams != null) {
                layoutParams.width = (i / i2) * d;
            }
            this.f17025a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private final void m18219a() {
        C8683p pVar = this.f17019b;
        if (pVar != null) {
            m18220a(pVar.f23642d);
            m18221a(pVar.f23640b);
            m18223a(pVar.f23641c);
            m18222a(pVar.f23643e, pVar.f23645g);
        }
    }

    /* renamed from: a */
    private final void m18220a(ImageModel imageModel) {
        C5343e.m17038a(this.f17020c, imageModel);
    }

    /* renamed from: b */
    private static Spannable m18224b(C9505f fVar) {
        String str = null;
        if (fVar == null) {
            return null;
        }
        String str2 = fVar.f26014b;
        if (fVar.f26013a != null) {
            str = C8317b.m25387a().mo21482a(fVar.f26013a);
        }
        if (str == null) {
            str = str2;
        }
        return C4374z.m14751a(str, fVar);
    }

    /* renamed from: a */
    private final void m18221a(C9505f fVar) {
        Spannable b = m18224b(fVar);
        if (b != null) {
            TextView textView = this.f17021d;
            if (textView != null) {
                textView.setText(b);
            }
        }
    }

    public final void onClick(View view) {
        Integer num;
        CommonGuideViewModel commonGuideViewModel = this.f17018a;
        if (commonGuideViewModel != null) {
            String str = null;
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.ath) {
                commonGuideViewModel.f24805a.mo22295a((C9119h) new C9112a());
            } else {
                if (num != null && num.intValue() == R.id.atg) {
                    C9117f fVar = commonGuideViewModel.f24805a;
                    C8683p pVar = this.f17019b;
                    if (pVar != null) {
                        str = pVar.f23644f;
                    }
                    fVar.mo22295a((C9119h) new C9113b(str));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.am1);
        this.f17020c = (HSImageView) findViewById(R.id.atj);
        this.f17021d = (TextView) findViewById(R.id.atp);
        this.f17022e = (LinearLayout) findViewById(R.id.ato);
        this.f17023g = (TextView) findViewById(R.id.atg);
        this.f17024h = (HSImageView) findViewById(R.id.atf);
        View findViewById = findViewById(R.id.ath);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        TextView textView = this.f17023g;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        CommonGuideViewModel commonGuideViewModel = this.f17018a;
        if (commonGuideViewModel != null) {
            C9120i iVar = commonGuideViewModel.f24805a.f24812a;
            if (iVar instanceof C9118g) {
                this.f17019b = ((C9118g) iVar).f24814a;
                m18219a();
            } else {
                dismiss();
            }
        }
    }

    /* renamed from: a */
    private final void m18223a(List<? extends C8684a> list) {
        if (list != null) {
            for (C8684a aVar : list) {
                String str = aVar.f23647a;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -842613072) {
                        if (hashCode == 104387 && str.equals("img")) {
                            ImageModel imageModel = aVar.f23652f;
                            ImageView imageView = new ImageView(getContext());
                            C5343e.m17035a(imageView, imageModel, (C3405a) new C5777a(imageView));
                            LinearLayout linearLayout = this.f17022e;
                            if (linearLayout != null) {
                                linearLayout.addView(imageView, linearLayout.getChildCount());
                            }
                        }
                    } else if (str.equals("rich_text")) {
                        String str2 = aVar.f23649c;
                        int i = aVar.f23650d;
                        String str3 = aVar.f23648b;
                        TextView textView = new TextView(getContext());
                        textView.setText(str3);
                        try {
                            textView.setTextColor(Color.parseColor(str2));
                        } catch (IllegalArgumentException unused) {
                        }
                        textView.setTextSize((float) i);
                        textView.setMaxLines(1);
                        textView.setEllipsize(TruncateAt.END);
                        LinearLayout linearLayout2 = this.f17022e;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(textView, linearLayout2.getChildCount(), new LinearLayout.LayoutParams(-2, -2));
                        }
                    }
                }
            }
        }
    }

    public C5776a(Context context, CommonGuideViewModel commonGuideViewModel) {
        super(context, true);
        this.f17018a = commonGuideViewModel;
    }

    /* renamed from: a */
    private final void m18222a(C9505f fVar, ImageModel imageModel) {
        TextView textView = this.f17023g;
        if (textView != null) {
            textView.setText(m18224b(fVar));
        }
        C5343e.m17038a(this.f17024h, imageModel);
    }
}
