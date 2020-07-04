package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

final class MetadataManager {
    static final MetadataLoader DEFAULT_METADATA_LOADER = new MetadataLoader() {
        public final InputStream loadMetadata(String str) {
            return MetadataManager.class.getResourceAsStream(str);
        }
    };
    private static final Set<Integer> alternateFormatsCountryCodes = AlternateFormatsCountryCodeSet.getCountryCodeSet();
    private static final ConcurrentHashMap<Integer, PhoneMetadata> alternateFormatsMap = new ConcurrentHashMap<>();
    private static final Logger logger = Logger.getLogger(MetadataManager.class.getName());
    private static final ConcurrentHashMap<String, PhoneMetadata> shortNumberMetadataMap = new ConcurrentHashMap<>();
    private static final Set<String> shortNumberMetadataRegionCodes = ShortNumbersRegionCodeSet.getRegionCodeSet();

    static class SingleFileMetadataMaps {
        private final Map<Integer, PhoneMetadata> countryCallingCodeToMetadata;
        private final Map<String, PhoneMetadata> regionCodeToMetadata;

        /* access modifiers changed from: 0000 */
        public PhoneMetadata get(int i) {
            return (PhoneMetadata) this.countryCallingCodeToMetadata.get(Integer.valueOf(i));
        }

        /* access modifiers changed from: 0000 */
        public PhoneMetadata get(String str) {
            return (PhoneMetadata) this.regionCodeToMetadata.get(str);
        }

        private SingleFileMetadataMaps(Map<String, PhoneMetadata> map, Map<Integer, PhoneMetadata> map2) {
            this.regionCodeToMetadata = Collections.unmodifiableMap(map);
            this.countryCallingCodeToMetadata = Collections.unmodifiableMap(map2);
        }

        static SingleFileMetadataMaps load(String str, MetadataLoader metadataLoader) {
            List<PhoneMetadata> metadataFromSingleFileName = MetadataManager.getMetadataFromSingleFileName(str, metadataLoader);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (PhoneMetadata phoneMetadata : metadataFromSingleFileName) {
                String id = phoneMetadata.getId();
                if ("001".equals(id)) {
                    hashMap2.put(Integer.valueOf(phoneMetadata.getCountryCode()), phoneMetadata);
                } else {
                    hashMap.put(id, phoneMetadata);
                }
            }
            return new SingleFileMetadataMaps(hashMap, hashMap2);
        }
    }

    private MetadataManager() {
    }

    static Set<String> getSupportedShortNumberRegions() {
        return Collections.unmodifiableSet(shortNumberMetadataRegionCodes);
    }

    static PhoneMetadata getAlternateFormatsForCountry(int i) {
        if (!alternateFormatsCountryCodes.contains(Integer.valueOf(i))) {
            return null;
        }
        return getMetadataFromMultiFilePrefix(Integer.valueOf(i), alternateFormatsMap, "/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto", DEFAULT_METADATA_LOADER);
    }

    static PhoneMetadata getShortNumberMetadataForRegion(String str) {
        if (!shortNumberMetadataRegionCodes.contains(str)) {
            return null;
        }
        return getMetadataFromMultiFilePrefix(str, shortNumberMetadataMap, "/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto", DEFAULT_METADATA_LOADER);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0038 A[SYNTHETIC, Splitter:B:24:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003e A[Catch:{ IOException -> 0x003c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection loadMetadataAndCloseInput(java.io.InputStream r5) {
        /*
            r0 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x002d }
            r1.<init>(r5)     // Catch:{ IOException -> 0x002d }
            com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection r0 = new com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection     // Catch:{ all -> 0x0026 }
            r0.<init>()     // Catch:{ all -> 0x0026 }
            r0.readExternal(r1)     // Catch:{ IOException -> 0x001d }
            r1.close()     // Catch:{ IOException -> 0x0012 }
            goto L_0x001c
        L_0x0012:
            r5 = move-exception
            java.util.logging.Logger r1 = logger
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "error closing input stream (ignored)"
            r1.log(r2, r3, r5)
        L_0x001c:
            return r0
        L_0x001d:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0026 }
            java.lang.String r3 = "cannot load/parse metadata"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0026 }
            throw r2     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            goto L_0x0036
        L_0x0028:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0036
        L_0x002d:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "cannot load/parse metadata"
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0028 }
            throw r2     // Catch:{ all -> 0x0028 }
        L_0x0036:
            if (r1 == 0) goto L_0x003e
            r1.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x004b
        L_0x003c:
            r5 = move-exception
            goto L_0x0042
        L_0x003e:
            r5.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x004b
        L_0x0042:
            java.util.logging.Logger r1 = logger
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "error closing input stream (ignored)"
            r1.log(r2, r3, r5)
        L_0x004b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.MetadataManager.loadMetadataAndCloseInput(java.io.InputStream):com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection");
    }

    public static List<PhoneMetadata> getMetadataFromSingleFileName(String str, MetadataLoader metadataLoader) {
        InputStream loadMetadata = metadataLoader.loadMetadata(str);
        if (loadMetadata != null) {
            List<PhoneMetadata> metadataList = loadMetadataAndCloseInput(loadMetadata).getMetadataList();
            if (metadataList.size() != 0) {
                return metadataList;
            }
            StringBuilder sb = new StringBuilder("empty metadata: ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("missing metadata: ");
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    static SingleFileMetadataMaps getSingleFileMetadataMaps(AtomicReference<SingleFileMetadataMaps> atomicReference, String str, MetadataLoader metadataLoader) {
        SingleFileMetadataMaps singleFileMetadataMaps = (SingleFileMetadataMaps) atomicReference.get();
        if (singleFileMetadataMaps != null) {
            return singleFileMetadataMaps;
        }
        atomicReference.compareAndSet(null, SingleFileMetadataMaps.load(str, metadataLoader));
        return (SingleFileMetadataMaps) atomicReference.get();
    }

    static <T> PhoneMetadata getMetadataFromMultiFilePrefix(T t, ConcurrentHashMap<T, PhoneMetadata> concurrentHashMap, String str, MetadataLoader metadataLoader) {
        PhoneMetadata phoneMetadata = (PhoneMetadata) concurrentHashMap.get(t);
        if (phoneMetadata != null) {
            return phoneMetadata;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(t);
        String sb2 = sb.toString();
        List metadataFromSingleFileName = getMetadataFromSingleFileName(sb2, metadataLoader);
        if (metadataFromSingleFileName.size() > 1) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            StringBuilder sb3 = new StringBuilder("more than one metadata in file ");
            sb3.append(sb2);
            logger2.log(level, sb3.toString());
        }
        PhoneMetadata phoneMetadata2 = (PhoneMetadata) metadataFromSingleFileName.get(0);
        PhoneMetadata phoneMetadata3 = (PhoneMetadata) concurrentHashMap.putIfAbsent(t, phoneMetadata2);
        if (phoneMetadata3 != null) {
            return phoneMetadata3;
        }
        return phoneMetadata2;
    }
}
