package com.facebook.react.views.imagehelper;

import com.facebook.imagepipeline.p717d.C13606i;
import com.facebook.imagepipeline.p717d.C13622l;
import java.util.List;

public class MultiSourceHelper {

    public static class MultiSourceResult {
        private final ImageSource bestResult;
        private final ImageSource bestResultInCache;

        public ImageSource getBestResult() {
            return this.bestResult;
        }

        public ImageSource getBestResultInCache() {
            return this.bestResultInCache;
        }

        private MultiSourceResult(ImageSource imageSource, ImageSource imageSource2) {
            this.bestResult = imageSource;
            this.bestResultInCache = imageSource2;
        }
    }

    public static MultiSourceResult getBestSourceForSize(int i, int i2, List<ImageSource> list) {
        return getBestSourceForSize(i, i2, list, 1.0d);
    }

    public static MultiSourceResult getBestSourceForSize(int i, int i2, List<ImageSource> list, double d) {
        if (list.isEmpty()) {
            return new MultiSourceResult(null, null);
        }
        if (list.size() == 1) {
            return new MultiSourceResult((ImageSource) list.get(0), null);
        }
        if (i <= 0 || i2 <= 0) {
            return new MultiSourceResult(null, null);
        }
        C13606i d2 = C13622l.m40095a().mo33208d();
        double d3 = (double) (i * i2);
        Double.isNaN(d3);
        double d4 = d3 * d;
        double d5 = Double.MAX_VALUE;
        double d6 = Double.MAX_VALUE;
        ImageSource imageSource = null;
        ImageSource imageSource2 = null;
        for (ImageSource imageSource3 : list) {
            double abs = Math.abs(1.0d - (imageSource3.getSize() / d4));
            if (abs < d5) {
                imageSource2 = imageSource3;
                d5 = abs;
            }
            if (abs < d6 && (d2.mo33184c(imageSource3.getUri()) || d2.mo33187d(imageSource3.getUri()))) {
                imageSource = imageSource3;
                d6 = abs;
            }
        }
        if (!(imageSource == null || imageSource2 == null || !imageSource.getSource().equals(imageSource2.getSource()))) {
            imageSource = null;
        }
        return new MultiSourceResult(imageSource2, imageSource);
    }
}
