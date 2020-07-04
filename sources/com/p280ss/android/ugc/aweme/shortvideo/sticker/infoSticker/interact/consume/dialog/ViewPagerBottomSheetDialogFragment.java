package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetDialogFragment */
public class ViewPagerBottomSheetDialogFragment extends BottomSheetDialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new ViewPagerBottomSheetDialog(getContext(), this.mTheme);
    }
}
