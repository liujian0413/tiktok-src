package com.bytedance.android.livesdk.gift.combo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.gift.holder.BasePanelViewHolder;

public class DouyinGiftCombHelper {
    public static final int REPEAT_SEND_TIMEOUT = ((Integer) C5864b.f17252G.mo10240a()).intValue();
    public boolean animatorCanceled;
    public ObjectAnimator dismissAnimator;
    public boolean isFirstClicked = true;
    private ComboTarget mCombTarget;
    public ObjectAnimator processAnimator;
    public ObjectAnimator showAnimator;

    private void startCombViewClickAnimation(ComboTarget comboTarget) {
        if (comboTarget != null) {
            this.animatorCanceled = false;
            comboTarget.showAll();
            startProcessAnimation(comboTarget);
        }
    }

    private void cancelAnimator(Animator... animatorArr) {
        if (animatorArr != null && animatorArr.length > 0) {
            for (Animator animator : animatorArr) {
                if (animator != null && animator.isRunning()) {
                    this.animatorCanceled = true;
                    animator.cancel();
                }
            }
        }
    }

    public void handleComboClick(BasePanelViewHolder basePanelViewHolder) {
        cancelAnimator(this.showAnimator, this.processAnimator, this.dismissAnimator);
        if (!basePanelViewHolder.mo21165a().equals(this.mCombTarget)) {
            this.isFirstClicked = true;
        }
        if (this.isFirstClicked) {
            this.isFirstClicked = false;
            showCombView(basePanelViewHolder.mo21165a());
            return;
        }
        startCombViewClickAnimation(basePanelViewHolder.mo21165a());
    }

    private void showCombView(ComboTarget comboTarget) {
        if (comboTarget != null) {
            if (this.showAnimator != null && this.showAnimator.isRunning()) {
                this.showAnimator.cancel();
            }
            if (this.mCombTarget != null && !comboTarget.equals(this.mCombTarget)) {
                this.animatorCanceled = true;
                this.mCombTarget.hideAll();
            }
            this.mCombTarget = comboTarget;
            comboTarget.showAll();
            this.animatorCanceled = false;
            if (this.showAnimator == null) {
                this.showAnimator = ObjectAnimator.ofPropertyValuesHolder(comboTarget, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("ComboViewScale", new float[]{0.0f, 1.0f})});
                this.showAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationCancel(Animator animator) {
                        DouyinGiftCombHelper.this.animatorCanceled = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        Object target = DouyinGiftCombHelper.this.showAnimator.getTarget();
                        if (target != null && (target instanceof ComboTarget)) {
                            ComboTarget comboTarget = (ComboTarget) target;
                            if (DouyinGiftCombHelper.this.animatorCanceled) {
                                comboTarget.hideAll();
                            } else {
                                DouyinGiftCombHelper.this.startProcessAnimation(comboTarget);
                            }
                        }
                    }
                });
            }
            comboTarget.asTarget(this.showAnimator);
            this.showAnimator.setDuration(150);
            this.showAnimator.start();
        }
    }

    public void dismissCombView(ComboTarget comboTarget) {
        if (comboTarget != null) {
            if (this.dismissAnimator == null) {
                this.dismissAnimator = ObjectAnimator.ofPropertyValuesHolder(comboTarget, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("ComboViewScale", new float[]{1.0f, 0.0f})});
                this.dismissAnimator.setDuration(150);
                this.dismissAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationCancel(Animator animator) {
                        DouyinGiftCombHelper.this.animatorCanceled = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        Object target = DouyinGiftCombHelper.this.dismissAnimator.getTarget();
                        if (target != null && (target instanceof ComboTarget)) {
                            DouyinGiftCombHelper.this.isFirstClicked = true;
                            ((ComboTarget) target).hideAll();
                        }
                    }
                });
            }
            comboTarget.asTarget(this.dismissAnimator);
            this.dismissAnimator.start();
        }
    }

    public void startProcessAnimation(ComboTarget comboTarget) {
        if (comboTarget != null) {
            if (this.processAnimator == null) {
                this.processAnimator = ObjectAnimator.ofFloat(comboTarget, "ComboViewProgress", new float[]{360.0f, 0.0f});
                this.processAnimator.setDuration(((long) REPEAT_SEND_TIMEOUT) * 1000);
                this.processAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationCancel(Animator animator) {
                        DouyinGiftCombHelper.this.animatorCanceled = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        Object target = DouyinGiftCombHelper.this.processAnimator.getTarget();
                        if (target != null && (target instanceof ComboTarget)) {
                            ComboTarget comboTarget = (ComboTarget) target;
                            if (DouyinGiftCombHelper.this.animatorCanceled) {
                                comboTarget.hideAll();
                            } else {
                                DouyinGiftCombHelper.this.dismissCombView(comboTarget);
                            }
                        }
                    }
                });
            }
            comboTarget.setCountDownTime(REPEAT_SEND_TIMEOUT);
            comboTarget.asTarget(this.processAnimator);
            this.processAnimator.start();
            comboTarget.startComboAnim(((long) REPEAT_SEND_TIMEOUT) * 1000);
        }
    }
}
