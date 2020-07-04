package com.p280ss.android.ugc.aweme.base.p308ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.support.p029v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25212aa;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28770ac;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.ui.TagLayout */
public class TagLayout extends LinearLayout {

    /* renamed from: a */
    private static final int f61834a = C23486n.m77122a(5.0d);

    /* renamed from: b */
    private Context f61835b;

    /* renamed from: c */
    private String f61836c;

    /* renamed from: d */
    private Aweme f61837d;

    /* renamed from: e */
    private TextView f61838e;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.TagLayout$a */
    public static class C23440a {

        /* renamed from: a */
        public final int f61842a = 7;

        /* renamed from: b */
        public final int f61843b;

        public C23440a(int i, int i2) {
            this.f61843b = i2;
        }
    }

    /* renamed from: a */
    public final void mo61048a(Aweme aweme, List<AwemeLabelModel> list, C23440a aVar) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (((AwemeLabelModel) list.get(i)).getLabelType() != 100) {
                    arrayList.add(list.get(i));
                    break;
                } else {
                    i++;
                }
            }
        }
        mo61050b(aweme, (List<AwemeLabelModel>) arrayList, aVar);
    }

    /* renamed from: a */
    public final void mo61047a() {
        if (this.f61837d != null && this.f61837d.getRelationLabel() != null && this.f61837d.getRelationLabel().isValid() && this.f61838e != null) {
            C6907h.onEvent(MobClick.obtain().setEventName("show").setLabelName("like_banner").setValue(this.f61837d.getAid()).setExtValueString(C6861a.m21337f().getCurUserId()));
        }
    }

    /* renamed from: a */
    private static boolean m76923a(AwemeTextLabelModel awemeTextLabelModel) {
        return C43122ff.m136767b() && awemeTextLabelModel.getLabelType() == 3;
    }

    /* renamed from: c */
    private static LayoutParams m76925c() {
        return new LayoutParams(-2, -1);
    }

    /* renamed from: e */
    private void m76927e() {
        if (this.f61838e != null) {
            removeView(this.f61838e);
        }
    }

    /* renamed from: d */
    private AppCompatTextView m76926d() {
        DmtTextView dmtTextView = new DmtTextView(getContext());
        dmtTextView.setTextSize(0, (float) C23486n.m77122a(13.0d));
        dmtTextView.setTextColor(C23481i.m77088a(R.color.py));
        dmtTextView.setGravity(16);
        dmtTextView.setBackgroundDrawable(C23487o.m77131a(C23481i.m77088a(R.color.yj), (float) C23486n.m77122a(4.0d)));
        dmtTextView.setPadding(f61834a, 0, f61834a, 0);
        dmtTextView.setSingleLine();
        return dmtTextView;
    }

    /* renamed from: b */
    public final void mo61049b() {
        final View a = m76915a(1);
        if (a == null) {
            a = m76915a(11);
            if (a == null) {
                return;
            }
        }
        int indexOfChild = indexOfChild(a);
        final ArrayList arrayList = new ArrayList();
        if (indexOfChild != -1) {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                if (i > indexOfChild) {
                    arrayList.add(getChildAt(i));
                    arrayList2.add(ObjectAnimator.ofFloat(getChildAt(i), "translationX", new float[]{0.0f, (float) ((int) (((float) (-a.getWidth())) - C9738o.m28708b(this.f61835b, 7.0f)))}));
                }
            }
            animatorSet.setDuration(200);
            animatorSet.playSequentially(arrayList2);
            animatorSet.start();
        }
        a.animate().alpha(0.0f).setDuration(150).withEndAction(new Runnable() {
            public final void run() {
                a.setVisibility(8);
                for (View animate : arrayList) {
                    animate.animate().translationX(0.0f).setDuration(0);
                }
            }
        });
    }

    public void setEventType(String str) {
        this.f61836c = str;
    }

    public TagLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private View m76915a(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (i == ((Integer) childAt.getTag()).intValue()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m76921a(RelationDynamicLabel relationDynamicLabel) {
        boolean z;
        int i;
        String str;
        if (relationDynamicLabel != null && relationDynamicLabel.isValid()) {
            if (this.f61838e == null) {
                this.f61838e = m76926d();
            }
            String nickname = relationDynamicLabel.getNickname();
            String labelInfo = relationDynamicLabel.getLabelInfo();
            int i2 = 0;
            if (getChildCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 15;
            } else {
                i = 16;
            }
            if (TextUtils.isEmpty(nickname)) {
                str = C23472a.m77064a(labelInfo, i, "");
            } else {
                StringBuilder sb = new StringBuilder("@");
                sb.append(nickname);
                String a = C23472a.m77063a(sb.toString(), (int) Math.ceil((double) (((float) i) - C23472a.m77058a(labelInfo))));
                if (!TextUtils.isEmpty(a)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a);
                    sb2.append(" ");
                    a = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a);
                sb3.append(labelInfo);
                str = sb3.toString();
            }
            this.f61838e.setText(str);
            LayoutParams c = m76925c();
            if (z) {
                i2 = C23486n.m77122a(6.0d);
            }
            c.leftMargin = i2;
            addView(this.f61838e, c);
        }
    }

    public TagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m76918a(int i, int i2) {
        if (i < i2) {
            while (i < i2) {
                removeView(getChildAt(i));
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m76920a(Aweme aweme, C23440a aVar) {
        if (aweme != null && aweme.getTextVideoLabels() != null) {
            m76918a(aweme.getTextVideoLabels().size(), getChildCount());
            for (int i = 0; i < aweme.getTextVideoLabels().size(); i++) {
                LayoutParams layoutParams = new LayoutParams(-2, (int) C9738o.m28708b(this.f61835b, (float) aVar.f61843b));
                if (i == 0) {
                    layoutParams.leftMargin = (int) C9738o.m28708b(this.f61835b, 0.0f);
                } else {
                    layoutParams.leftMargin = (int) C9738o.m28708b(this.f61835b, (float) aVar.f61842a);
                }
                AwemeTextLabelModel awemeTextLabelModel = (AwemeTextLabelModel) aweme.getTextVideoLabels().get(i);
                if (awemeTextLabelModel != null && !m76923a(awemeTextLabelModel)) {
                    View childAt = getChildAt(i);
                    if (childAt == null) {
                        DmtTextView dmtTextView = new DmtTextView(getContext());
                        addView(dmtTextView, -1, layoutParams);
                        m76916a((TextView) dmtTextView, awemeTextLabelModel, (ViewGroup.LayoutParams) layoutParams);
                    } else if (childAt instanceof TextView) {
                        m76916a((TextView) getChildAt(i), awemeTextLabelModel, (ViewGroup.LayoutParams) layoutParams);
                    } else {
                        removeView(childAt);
                        DmtTextView dmtTextView2 = new DmtTextView(getContext());
                        addView(dmtTextView2, i, layoutParams);
                        m76916a((TextView) dmtTextView2, awemeTextLabelModel, (ViewGroup.LayoutParams) layoutParams);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m76922a(List<AwemeLabelModel> list, C23440a aVar) {
        if (list != null) {
            m76918a(list.size(), getChildCount());
            for (int i = 0; i < list.size(); i++) {
                LayoutParams layoutParams = new LayoutParams(-2, (int) C9738o.m28708b(this.f61835b, (float) aVar.f61843b));
                if (i == 0) {
                    layoutParams.leftMargin = (int) C9738o.m28708b(this.f61835b, 0.0f);
                } else {
                    layoutParams.leftMargin = (int) C9738o.m28708b(this.f61835b, (float) aVar.f61842a);
                }
                AwemeLabelModel awemeLabelModel = (AwemeLabelModel) list.get(i);
                View childAt = getChildAt(i);
                if (childAt != null && !(childAt instanceof RemoteImageView)) {
                    removeView(childAt);
                    childAt = null;
                }
                RemoteImageView remoteImageView = (RemoteImageView) childAt;
                if (awemeLabelModel != null) {
                    if (remoteImageView == null) {
                        remoteImageView = new RemoteImageView(this.f61835b);
                        addView(remoteImageView, i, layoutParams);
                    } else {
                        remoteImageView.setLayoutParams(layoutParams);
                    }
                    remoteImageView.setVisibility(0);
                    remoteImageView.setAlpha(1.0f);
                    m76917a(remoteImageView, awemeLabelModel.getUrlModels(), awemeLabelModel.getLabelType());
                }
            }
        }
    }

    /* renamed from: b */
    private static void m76924b(UrlModel urlModel, int i, RemoteImageView remoteImageView) {
        remoteImageView.setVisibility(8);
    }

    public TagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61835b = context;
    }

    /* renamed from: a */
    private RemoteImageView m76917a(RemoteImageView remoteImageView, UrlModel urlModel, int i) {
        remoteImageView.setTag(Integer.valueOf(i));
        remoteImageView.setScaleType(ScaleType.FIT_XY);
        if (i == 3) {
            m76924b(urlModel, i, remoteImageView);
        } else {
            m76919a(urlModel, i, remoteImageView);
        }
        return remoteImageView;
    }

    /* renamed from: b */
    public final void mo61050b(Aweme aweme, List<AwemeLabelModel> list, C23440a aVar) {
        int i;
        this.f61837d = aweme;
        m76927e();
        if (aweme.getTextVideoLabels() == null || aweme.getTextVideoLabels().size() <= 0) {
            m76922a(list, aVar);
        } else {
            m76920a(aweme, aVar);
        }
        if (getChildCount() <= 0) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
    }

    /* renamed from: c */
    public final void mo61051c(Aweme aweme, List<AwemeLabelModel> list, C23440a aVar) {
        int i;
        this.f61837d = aweme;
        m76927e();
        if (aweme.getTextVideoLabels() == null || aweme.getTextVideoLabels().size() <= 0) {
            m76922a(list, aVar);
            m76921a(aweme.getRelationLabel());
        } else {
            m76920a(aweme, aVar);
        }
        if (getChildCount() <= 0) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
    }

    /* renamed from: a */
    private static TextView m76916a(TextView textView, AwemeTextLabelModel awemeTextLabelModel, ViewGroup.LayoutParams layoutParams) {
        C25212aa.m82904a((View) textView, awemeTextLabelModel);
        textView.setTag(Integer.valueOf(awemeTextLabelModel.getLabelType()));
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, (float) C23486n.m77122a(13.0d));
        textView.setTextColor(Color.parseColor(awemeTextLabelModel.getTextColor()));
        textView.setGravity(16);
        textView.setBackgroundDrawable(C23487o.m77131a(Color.parseColor(awemeTextLabelModel.getBgColor()), (float) C23486n.m77122a(4.0d)));
        textView.setPadding(f61834a, 0, f61834a, 0);
        textView.setSingleLine();
        textView.setMaxEms(20);
        textView.setEllipsize(TruncateAt.END);
        textView.setVisibility(0);
        textView.setAlpha(1.0f);
        return textView;
    }

    /* renamed from: a */
    private void m76919a(UrlModel urlModel, int i, RemoteImageView remoteImageView) {
        C23323e.m76509a(remoteImageView, urlModel, (C13401d<C13648f>) new C28770ac<C13648f>(remoteImageView, this.f61835b));
    }
}
