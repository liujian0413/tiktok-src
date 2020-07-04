package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24142b;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24151g;
import com.p280ss.android.ugc.aweme.detail.p1167ui.FadeImageView.C26187a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.DetailKeyboardDialogFragment */
public class DetailKeyboardDialogFragment extends KeyboardDialogFragment {
    View tabDivider;

    public void dismiss() {
        m79881q();
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo63133a() {
        if (this.mEmojiView.isSelected()) {
            return R.drawable.aca;
        }
        return R.drawable.ac_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo63134b() {
        if (this.mEmojiView.isSelected()) {
            return R.drawable.acd;
        }
        return R.drawable.acc;
    }

    /* renamed from: q */
    private void m79881q() {
        this.mEditText.setCursorVisible(false);
        this.mAtView.mo67763a();
        this.mEmojiView.mo67763a();
        this.mAtView.setSelected(false);
        this.mEmojiView.setSelected(false);
    }

    /* renamed from: r */
    private void m79882r() {
        this.mAtView.mo67763a();
        this.mEmojiView.mo67763a();
        this.mAtView.setSelected(true);
        this.mEmojiView.setSelected(true);
    }

    public void onShow(DialogInterface dialogInterface) {
        super.onShow(dialogInterface);
        m79882r();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getDialog().getWindow().setLayout(-1, -1);
        getDialog().setCanceledOnTouchOutside(false);
        this.mAtView.setListener(new C26187a() {
            /* renamed from: a */
            public final void mo63136a(ImageView imageView) {
                if (DetailKeyboardDialogFragment.this.getContext() != null && !DetailKeyboardDialogFragment.this.mDetached) {
                    if (imageView.isSelected()) {
                        imageView.setImageDrawable(DetailKeyboardDialogFragment.this.getResources().getDrawable(R.drawable.ac7));
                        return;
                    }
                    imageView.setImageDrawable(DetailKeyboardDialogFragment.this.getResources().getDrawable(R.drawable.ac6));
                }
            }
        });
        this.mEmojiView.setListener(new C26187a() {
            /* renamed from: a */
            public final void mo63136a(ImageView imageView) {
                if (DetailKeyboardDialogFragment.this.getContext() != null && !DetailKeyboardDialogFragment.this.mDetached) {
                    if (DetailKeyboardDialogFragment.this.f64168j) {
                        imageView.setImageResource(DetailKeyboardDialogFragment.this.mo63134b());
                        return;
                    }
                    imageView.setImageResource(DetailKeyboardDialogFragment.this.mo63133a());
                }
            }
        });
        this.mPublishView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C24151g.m79360a(DetailKeyboardDialogFragment.this.getContext(), (C24142b) new C24142b() {
                    /* renamed from: a */
                    public final void mo62571a(boolean z) {
                        DetailKeyboardDialogFragment.this.mo63165c();
                    }
                });
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_input_detail, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }
}
