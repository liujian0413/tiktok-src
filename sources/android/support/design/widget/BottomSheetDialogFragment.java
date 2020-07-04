package android.support.design.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new BottomSheetDialog(getContext(), this.mTheme);
    }
}
