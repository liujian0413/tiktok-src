package com.airbnb.lottie.p055c;

import android.util.JsonReader;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.MergePaths.MergePathsMode;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.c.v */
final class C1740v {
    /* renamed from: a */
    static MergePaths m8316a(JsonReader jsonReader) throws IOException {
        String str = null;
        MergePathsMode mergePathsMode = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 3488) {
                if (hashCode == 3519 && nextName.equals("nm")) {
                    c = 0;
                }
            } else if (nextName.equals("mm")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    mergePathsMode = MergePathsMode.forId(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new MergePaths(str, mergePathsMode);
    }
}
