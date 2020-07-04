package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.p115a.C2319a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.p394i.C8306a;
import java.util.Arrays;
import java.util.List;

@C2319a(mo8127a = 5)
public class TTCjInitTask extends C8306a {
    public List<Integer> preTasks() {
        return Arrays.asList(new Integer[]{Integer.valueOf(2)});
    }

    public void run() {
        if (C3358ac.m12528e() != null) {
            IWalletService iWalletService = (IWalletService) C3596c.m13172a(IWalletService.class);
            if (iWalletService != null) {
                iWalletService.setCJStatisticCallback();
                iWalletService.startCJBackgroundTask(C3358ac.m12528e());
            }
        }
    }
}
