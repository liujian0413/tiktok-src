package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.NumberParseException.ErrorType;
import com.google.i18n.phonenumbers.Phonemetadata.NumberFormat;
import com.google.i18n.phonenumbers.Phonemetadata.NumberFormat.Builder;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource;
import com.google.i18n.phonenumbers.internal.MatcherApi;
import com.google.i18n.phonenumbers.internal.RegexBasedMatcher;
import com.google.i18n.phonenumbers.internal.RegexCache;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberUtil {
    private static final Map<Character, Character> ALL_PLUS_NUMBER_GROUPING_SYMBOLS;
    private static final Map<Character, Character> ALPHA_MAPPINGS;
    private static final Map<Character, Character> ALPHA_PHONE_MAPPINGS;
    private static final Pattern CAPTURING_DIGIT_PATTERN = Pattern.compile("(\\p{Nd})");
    private static final Map<Character, Character> DIALLABLE_CHAR_MAPPINGS;
    private static final Pattern EXTN_PATTERN;
    static final String EXTN_PATTERNS_FOR_MATCHING;
    private static final String EXTN_PATTERNS_FOR_PARSING;
    private static final Pattern FIRST_GROUP_ONLY_PREFIX_PATTERN = Pattern.compile("\\(?\\$1\\)?");
    private static final Pattern FIRST_GROUP_PATTERN = Pattern.compile("(\\$\\d)");
    private static final Set<Integer> GEO_MOBILE_COUNTRIES;
    private static final Set<Integer> GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES;
    private static final Map<Integer, String> MOBILE_TOKEN_MAPPINGS;
    static final Pattern NON_DIGITS_PATTERN = Pattern.compile("(\\D+)");
    static final Pattern PLUS_CHARS_PATTERN = Pattern.compile("[+＋]+");
    static final Pattern SECOND_NUMBER_START_PATTERN = Pattern.compile("[\\\\/] *x");
    private static final Pattern SEPARATOR_PATTERN = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    private static final Pattern SINGLE_INTERNATIONAL_PREFIX = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
    static final Pattern UNWANTED_END_CHAR_PATTERN = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    private static final String VALID_ALPHA;
    private static final Pattern VALID_ALPHA_PHONE_PATTERN = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    private static final String VALID_PHONE_NUMBER;
    private static final Pattern VALID_PHONE_NUMBER_PATTERN;
    private static final Pattern VALID_START_CHAR_PATTERN = Pattern.compile("[+＋\\p{Nd}]");
    private static PhoneNumberUtil instance = null;
    private static final Logger logger = Logger.getLogger(PhoneNumberUtil.class.getName());
    private final Map<Integer, List<String>> countryCallingCodeToRegionCodeMap;
    private final Set<Integer> countryCodesForNonGeographicalRegion = new HashSet();
    private final MatcherApi matcherApi = RegexBasedMatcher.create();
    private final MetadataSource metadataSource;
    private final Set<String> nanpaRegions = new HashSet(35);
    private final RegexCache regexCache = new RegexCache(100);
    private final Set<String> supportedRegions = new HashSet(320);

    public enum Leniency {
        POSSIBLE {
            /* access modifiers changed from: 0000 */
            public final boolean verify(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                return phoneNumberUtil.isPossibleNumber(phoneNumber);
            }
        },
        VALID {
            /* access modifiers changed from: 0000 */
            public final boolean verify(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                if (!phoneNumberUtil.isValidNumber(phoneNumber) || !PhoneNumberMatcher.containsOnlyValidXChars(phoneNumber, charSequence.toString(), phoneNumberUtil)) {
                    return false;
                }
                return PhoneNumberMatcher.isNationalPrefixPresentIfRequired(phoneNumber, phoneNumberUtil);
            }
        },
        STRICT_GROUPING {
            /* access modifiers changed from: 0000 */
            public final boolean verify(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                String charSequence2 = charSequence.toString();
                if (!phoneNumberUtil.isValidNumber(phoneNumber) || !PhoneNumberMatcher.containsOnlyValidXChars(phoneNumber, charSequence2, phoneNumberUtil) || PhoneNumberMatcher.containsMoreThanOneSlashInNationalNumber(phoneNumber, charSequence2) || !PhoneNumberMatcher.isNationalPrefixPresentIfRequired(phoneNumber, phoneNumberUtil)) {
                    return false;
                }
                return PhoneNumberMatcher.checkNumberGroupingIsValid(phoneNumber, charSequence, phoneNumberUtil, new NumberGroupingChecker() {
                    public boolean checkGroups(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
                        return PhoneNumberMatcher.allNumberGroupsRemainGrouped(phoneNumberUtil, phoneNumber, sb, strArr);
                    }
                });
            }
        },
        EXACT_GROUPING {
            /* access modifiers changed from: 0000 */
            public final boolean verify(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                String charSequence2 = charSequence.toString();
                if (!phoneNumberUtil.isValidNumber(phoneNumber) || !PhoneNumberMatcher.containsOnlyValidXChars(phoneNumber, charSequence2, phoneNumberUtil) || PhoneNumberMatcher.containsMoreThanOneSlashInNationalNumber(phoneNumber, charSequence2) || !PhoneNumberMatcher.isNationalPrefixPresentIfRequired(phoneNumber, phoneNumberUtil)) {
                    return false;
                }
                return PhoneNumberMatcher.checkNumberGroupingIsValid(phoneNumber, charSequence, phoneNumberUtil, new NumberGroupingChecker() {
                    public boolean checkGroups(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
                        return PhoneNumberMatcher.allNumberGroupsAreExactlyPresent(phoneNumberUtil, phoneNumber, sb, strArr);
                    }
                });
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract boolean verify(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil);
    }

    public enum MatchType {
        NOT_A_NUMBER,
        NO_MATCH,
        SHORT_NSN_MATCH,
        NSN_MATCH,
        EXACT_MATCH
    }

    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    public enum ValidationResult {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    public Set<Integer> getSupportedGlobalNetworkCallingCodes() {
        return Collections.unmodifiableSet(this.countryCodesForNonGeographicalRegion);
    }

    public Set<String> getSupportedRegions() {
        return Collections.unmodifiableSet(this.supportedRegions);
    }

    public Set<Integer> getSupportedCallingCodes() {
        return Collections.unmodifiableSet(this.countryCallingCodeToRegionCodeMap.keySet());
    }

    public static synchronized PhoneNumberUtil getInstance() {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            if (instance == null) {
                setInstance(createInstance(MetadataManager.DEFAULT_METADATA_LOADER));
            }
            phoneNumberUtil = instance;
        }
        return phoneNumberUtil;
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(52), "1");
        hashMap.put(Integer.valueOf(54), "9");
        MOBILE_TOKEN_MAPPINGS = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(86));
        GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(Integer.valueOf(52));
        hashSet2.add(Integer.valueOf(54));
        hashSet2.add(Integer.valueOf(55));
        hashSet2.add(Integer.valueOf(62));
        hashSet2.addAll(hashSet);
        GEO_MOBILE_COUNTRIES = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Character.valueOf('0'), Character.valueOf('0'));
        hashMap2.put(Character.valueOf('1'), Character.valueOf('1'));
        hashMap2.put(Character.valueOf('2'), Character.valueOf('2'));
        hashMap2.put(Character.valueOf('3'), Character.valueOf('3'));
        hashMap2.put(Character.valueOf('4'), Character.valueOf('4'));
        hashMap2.put(Character.valueOf('5'), Character.valueOf('5'));
        hashMap2.put(Character.valueOf('6'), Character.valueOf('6'));
        hashMap2.put(Character.valueOf('7'), Character.valueOf('7'));
        hashMap2.put(Character.valueOf('8'), Character.valueOf('8'));
        hashMap2.put(Character.valueOf('9'), Character.valueOf('9'));
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put(Character.valueOf('A'), Character.valueOf('2'));
        hashMap3.put(Character.valueOf('B'), Character.valueOf('2'));
        hashMap3.put(Character.valueOf('C'), Character.valueOf('2'));
        hashMap3.put(Character.valueOf('D'), Character.valueOf('3'));
        hashMap3.put(Character.valueOf('E'), Character.valueOf('3'));
        hashMap3.put(Character.valueOf('F'), Character.valueOf('3'));
        hashMap3.put(Character.valueOf('G'), Character.valueOf('4'));
        hashMap3.put(Character.valueOf('H'), Character.valueOf('4'));
        hashMap3.put(Character.valueOf('I'), Character.valueOf('4'));
        hashMap3.put(Character.valueOf('J'), Character.valueOf('5'));
        hashMap3.put(Character.valueOf('K'), Character.valueOf('5'));
        hashMap3.put(Character.valueOf('L'), Character.valueOf('5'));
        hashMap3.put(Character.valueOf('M'), Character.valueOf('6'));
        hashMap3.put(Character.valueOf('N'), Character.valueOf('6'));
        hashMap3.put(Character.valueOf('O'), Character.valueOf('6'));
        hashMap3.put(Character.valueOf('P'), Character.valueOf('7'));
        hashMap3.put(Character.valueOf('Q'), Character.valueOf('7'));
        hashMap3.put(Character.valueOf('R'), Character.valueOf('7'));
        hashMap3.put(Character.valueOf('S'), Character.valueOf('7'));
        hashMap3.put(Character.valueOf('T'), Character.valueOf('8'));
        hashMap3.put(Character.valueOf('U'), Character.valueOf('8'));
        hashMap3.put(Character.valueOf('V'), Character.valueOf('8'));
        hashMap3.put(Character.valueOf('W'), Character.valueOf('9'));
        hashMap3.put(Character.valueOf('X'), Character.valueOf('9'));
        hashMap3.put(Character.valueOf('Y'), Character.valueOf('9'));
        hashMap3.put(Character.valueOf('Z'), Character.valueOf('9'));
        ALPHA_MAPPINGS = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(ALPHA_MAPPINGS);
        hashMap4.putAll(hashMap2);
        ALPHA_PHONE_MAPPINGS = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put(Character.valueOf('+'), Character.valueOf('+'));
        hashMap5.put(Character.valueOf('*'), Character.valueOf('*'));
        hashMap5.put(Character.valueOf('#'), Character.valueOf('#'));
        DIALLABLE_CHAR_MAPPINGS = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character charValue : ALPHA_MAPPINGS.keySet()) {
            char charValue2 = charValue.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue2)), Character.valueOf(charValue2));
            hashMap6.put(Character.valueOf(charValue2), Character.valueOf(charValue2));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put(Character.valueOf('-'), Character.valueOf('-'));
        hashMap6.put(Character.valueOf(65293), Character.valueOf('-'));
        hashMap6.put(Character.valueOf(8208), Character.valueOf('-'));
        hashMap6.put(Character.valueOf(8209), Character.valueOf('-'));
        hashMap6.put(Character.valueOf(8210), Character.valueOf('-'));
        hashMap6.put(Character.valueOf(8211), Character.valueOf('-'));
        hashMap6.put(Character.valueOf(8212), Character.valueOf('-'));
        hashMap6.put(Character.valueOf(8213), Character.valueOf('-'));
        hashMap6.put(Character.valueOf(8722), Character.valueOf('-'));
        hashMap6.put(Character.valueOf('/'), Character.valueOf('/'));
        hashMap6.put(Character.valueOf(65295), Character.valueOf('/'));
        hashMap6.put(Character.valueOf(' '), Character.valueOf(' '));
        hashMap6.put(Character.valueOf(12288), Character.valueOf(' '));
        hashMap6.put(Character.valueOf(8288), Character.valueOf(' '));
        hashMap6.put(Character.valueOf('.'), Character.valueOf('.'));
        hashMap6.put(Character.valueOf(65294), Character.valueOf('.'));
        ALL_PLUS_NUMBER_GROUPING_SYMBOLS = Collections.unmodifiableMap(hashMap6);
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(ALPHA_MAPPINGS.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(ALPHA_MAPPINGS.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        VALID_ALPHA = sb.toString();
        StringBuilder sb2 = new StringBuilder("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*");
        sb2.append(VALID_ALPHA);
        sb2.append("\\p{Nd}]*");
        VALID_PHONE_NUMBER = sb2.toString();
        String str = "xｘ#＃~～";
        StringBuilder sb3 = new StringBuilder(",;");
        sb3.append(str);
        EXTN_PATTERNS_FOR_PARSING = createExtnPattern(sb3.toString());
        EXTN_PATTERNS_FOR_MATCHING = createExtnPattern(str);
        StringBuilder sb4 = new StringBuilder("(?:");
        sb4.append(EXTN_PATTERNS_FOR_PARSING);
        sb4.append(")$");
        EXTN_PATTERN = Pattern.compile(sb4.toString(), 66);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(VALID_PHONE_NUMBER);
        sb5.append("(?:");
        sb5.append(EXTN_PATTERNS_FOR_PARSING);
        sb5.append(")?");
        VALID_PHONE_NUMBER_PATTERN = Pattern.compile(sb5.toString(), 66);
    }

    public static String convertAlphaCharactersInNumber(CharSequence charSequence) {
        return normalizeHelper(charSequence, ALPHA_PHONE_MAPPINGS, false);
    }

    public static String normalizeDiallableCharsOnly(CharSequence charSequence) {
        return normalizeHelper(charSequence, DIALLABLE_CHAR_MAPPINGS, true);
    }

    public AsYouTypeFormatter getAsYouTypeFormatter(String str) {
        return new AsYouTypeFormatter(str);
    }

    public PhoneNumber getExampleNumber(String str) {
        return getExampleNumberForType(str, PhoneNumberType.FIXED_LINE);
    }

    public boolean isNANPACountry(String str) {
        return this.nanpaRegions.contains(str);
    }

    public ValidationResult isPossibleNumberWithReason(PhoneNumber phoneNumber) {
        return isPossibleNumberForTypeWithReason(phoneNumber, PhoneNumberType.UNKNOWN);
    }

    private boolean hasValidCountryCallingCode(int i) {
        return this.countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(i));
    }

    private boolean isValidRegionCode(String str) {
        if (str == null || !this.supportedRegions.contains(str)) {
            return false;
        }
        return true;
    }

    public static String normalizeDigitsOnly(CharSequence charSequence) {
        return normalizeDigits(charSequence, false).toString();
    }

    static synchronized void setInstance(PhoneNumberUtil phoneNumberUtil) {
        synchronized (PhoneNumberUtil.class) {
            instance = phoneNumberUtil;
        }
    }

    /* access modifiers changed from: 0000 */
    public PhoneMetadata getMetadataForRegion(String str) {
        if (!isValidRegionCode(str)) {
            return null;
        }
        return this.metadataSource.getMetadataForRegion(str);
    }

    public boolean isNumberGeographical(PhoneNumber phoneNumber) {
        return isNumberGeographical(getNumberType(phoneNumber), phoneNumber.getCountryCode());
    }

    public boolean isValidNumber(PhoneNumber phoneNumber) {
        return isValidNumberForRegion(phoneNumber, getRegionCodeForNumber(phoneNumber));
    }

    private static String createExtnPattern(String str) {
        StringBuilder sb = new StringBuilder(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[");
        sb.append(str);
        sb.append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})");
        sb.append("#?|[- ]+(\\p{Nd}");
        sb.append("{1,5})#");
        return sb.toString();
    }

    public static PhoneNumberUtil createInstance(MetadataLoader metadataLoader) {
        if (metadataLoader != null) {
            return createInstance((MetadataSource) new MultiFileMetadataSourceImpl(metadataLoader));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    private static boolean descHasData(PhoneNumberDesc phoneNumberDesc) {
        if (phoneNumberDesc.hasExampleNumber() || descHasPossibleNumberData(phoneNumberDesc) || phoneNumberDesc.hasNationalNumberPattern()) {
            return true;
        }
        return false;
    }

    private static boolean descHasPossibleNumberData(PhoneNumberDesc phoneNumberDesc) {
        if (phoneNumberDesc.getPossibleLengthCount() == 1 && phoneNumberDesc.getPossibleLength(0) == -1) {
            return false;
        }
        return true;
    }

    static boolean formattingRuleHasFirstGroupOnly(String str) {
        if (str.length() == 0 || FIRST_GROUP_ONLY_PREFIX_PATTERN.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    private int getCountryCodeForValidRegion(String str) {
        PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (metadataForRegion != null) {
            return metadataForRegion.getCountryCode();
        }
        StringBuilder sb = new StringBuilder("Invalid region code: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String getCountryMobileToken(int i) {
        if (MOBILE_TOKEN_MAPPINGS.containsKey(Integer.valueOf(i))) {
            return (String) MOBILE_TOKEN_MAPPINGS.get(Integer.valueOf(i));
        }
        return "";
    }

    static boolean isViablePhoneNumber(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return VALID_PHONE_NUMBER_PATTERN.matcher(charSequence).matches();
    }

    public boolean canBeInternationallyDialled(PhoneNumber phoneNumber) {
        PhoneMetadata metadataForRegion = getMetadataForRegion(getRegionCodeForNumber(phoneNumber));
        if (metadataForRegion != null && isNumberMatchingDesc(getNationalSignificantNumber(phoneNumber), metadataForRegion.getNoInternationalDialling())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public PhoneMetadata getMetadataForNonGeographicalRegion(int i) {
        if (!this.countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return this.metadataSource.getMetadataForNonGeographicalRegion(i);
    }

    public PhoneNumberType getNumberType(PhoneNumber phoneNumber) {
        PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(phoneNumber.getCountryCode(), getRegionCodeForNumber(phoneNumber));
        if (metadataForRegionOrCallingCode == null) {
            return PhoneNumberType.UNKNOWN;
        }
        return getNumberTypeHelper(getNationalSignificantNumber(phoneNumber), metadataForRegionOrCallingCode);
    }

    public String getRegionCodeForCountryCode(int i) {
        List list = (List) this.countryCallingCodeToRegionCodeMap.get(Integer.valueOf(i));
        if (list == null) {
            return "ZZ";
        }
        return (String) list.get(0);
    }

    public List<String> getRegionCodesForCountryCode(int i) {
        List list = (List) this.countryCallingCodeToRegionCodeMap.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList(0);
        }
        return Collections.unmodifiableList(list);
    }

    public boolean isAlphaNumber(CharSequence charSequence) {
        if (!isViablePhoneNumber(charSequence)) {
            return false;
        }
        StringBuilder sb = new StringBuilder(charSequence);
        maybeStripExtension(sb);
        return VALID_ALPHA_PHONE_PATTERN.matcher(sb).matches();
    }

    public boolean isPossibleNumber(PhoneNumber phoneNumber) {
        ValidationResult isPossibleNumberWithReason = isPossibleNumberWithReason(phoneNumber);
        if (isPossibleNumberWithReason == ValidationResult.IS_POSSIBLE || isPossibleNumberWithReason == ValidationResult.IS_POSSIBLE_LOCAL_ONLY) {
            return true;
        }
        return false;
    }

    private static PhoneNumber copyCoreFieldsOnly(PhoneNumber phoneNumber) {
        PhoneNumber phoneNumber2 = new PhoneNumber();
        phoneNumber2.setCountryCode(phoneNumber.getCountryCode());
        phoneNumber2.setNationalNumber(phoneNumber.getNationalNumber());
        if (phoneNumber.getExtension().length() > 0) {
            phoneNumber2.setExtension(phoneNumber.getExtension());
        }
        if (phoneNumber.isItalianLeadingZero()) {
            phoneNumber2.setItalianLeadingZero(true);
            phoneNumber2.setNumberOfLeadingZeros(phoneNumber.getNumberOfLeadingZeros());
        }
        return phoneNumber2;
    }

    private static PhoneNumberUtil createInstance(MetadataSource metadataSource2) {
        if (metadataSource2 != null) {
            return new PhoneNumberUtil(metadataSource2, CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    private Set<PhoneNumberType> getSupportedTypesForMetadata(PhoneMetadata phoneMetadata) {
        PhoneNumberType[] values;
        TreeSet treeSet = new TreeSet();
        for (PhoneNumberType phoneNumberType : PhoneNumberType.values()) {
            if (!(phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE || phoneNumberType == PhoneNumberType.UNKNOWN || !descHasData(getNumberDescByType(phoneMetadata, phoneNumberType)))) {
                treeSet.add(phoneNumberType);
            }
        }
        return Collections.unmodifiableSet(treeSet);
    }

    private boolean hasFormattingPatternForNumber(PhoneNumber phoneNumber) {
        int countryCode = phoneNumber.getCountryCode();
        PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        if (metadataForRegionOrCallingCode == null) {
            return false;
        }
        if (chooseFormattingPatternForNumber(metadataForRegionOrCallingCode.numberFormats(), getNationalSignificantNumber(phoneNumber)) != null) {
            return true;
        }
        return false;
    }

    static StringBuilder normalize(StringBuilder sb) {
        if (VALID_ALPHA_PHONE_PATTERN.matcher(sb).matches()) {
            sb.replace(0, sb.length(), normalizeHelper(sb, ALPHA_PHONE_MAPPINGS, true));
        } else {
            sb.replace(0, sb.length(), normalizeDigitsOnly(sb));
        }
        return sb;
    }

    public int getCountryCodeForRegion(String str) {
        if (isValidRegionCode(str)) {
            return getCountryCodeForValidRegion(str);
        }
        Logger logger2 = logger;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        sb.append(str);
        sb.append(") provided.");
        logger2.log(level, sb.toString());
        return 0;
    }

    public int getLengthOfGeographicalAreaCode(PhoneNumber phoneNumber) {
        PhoneMetadata metadataForRegion = getMetadataForRegion(getRegionCodeForNumber(phoneNumber));
        if (metadataForRegion == null) {
            return 0;
        }
        if (!metadataForRegion.hasNationalPrefix() && !phoneNumber.isItalianLeadingZero()) {
            return 0;
        }
        PhoneNumberType numberType = getNumberType(phoneNumber);
        int countryCode = phoneNumber.getCountryCode();
        if ((numberType != PhoneNumberType.MOBILE || !GEO_MOBILE_COUNTRIES_WITHOUT_MOBILE_AREA_CODES.contains(Integer.valueOf(countryCode))) && isNumberGeographical(numberType, countryCode)) {
            return getLengthOfNationalDestinationCode(phoneNumber);
        }
        return 0;
    }

    public String getNationalSignificantNumber(PhoneNumber phoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phoneNumber.isItalianLeadingZero() && phoneNumber.getNumberOfLeadingZeros() > 0) {
            char[] cArr = new char[phoneNumber.getNumberOfLeadingZeros()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(phoneNumber.getNationalNumber());
        return sb.toString();
    }

    public Set<PhoneNumberType> getSupportedTypesForNonGeoEntity(int i) {
        PhoneMetadata metadataForNonGeographicalRegion = getMetadataForNonGeographicalRegion(i);
        if (metadataForNonGeographicalRegion != null) {
            return getSupportedTypesForMetadata(metadataForNonGeographicalRegion);
        }
        Logger logger2 = logger;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Unknown country calling code for a non-geographical entity provided: ");
        sb.append(i);
        logger2.log(level, sb.toString());
        return Collections.unmodifiableSet(new TreeSet());
    }

    public Set<PhoneNumberType> getSupportedTypesForRegion(String str) {
        if (isValidRegionCode(str)) {
            return getSupportedTypesForMetadata(getMetadataForRegion(str));
        }
        Logger logger2 = logger;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Invalid or unknown region code provided: ");
        sb.append(str);
        logger2.log(level, sb.toString());
        return Collections.unmodifiableSet(new TreeSet());
    }

    public boolean isMobileNumberPortableRegion(String str) {
        PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (metadataForRegion != null) {
            return metadataForRegion.isMobileNumberPortableRegion();
        }
        Logger logger2 = logger;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Invalid or unknown region code provided: ");
        sb.append(str);
        logger2.log(level, sb.toString());
        return false;
    }

    /* access modifiers changed from: 0000 */
    public String maybeStripExtension(StringBuilder sb) {
        Matcher matcher = EXTN_PATTERN.matcher(sb);
        if (matcher.find() && isViablePhoneNumber(sb.substring(0, matcher.start()))) {
            int groupCount = matcher.groupCount();
            for (int i = 1; i <= groupCount; i++) {
                if (matcher.group(i) != null) {
                    String group = matcher.group(i);
                    sb.delete(matcher.start(), sb.length());
                    return group;
                }
            }
        }
        return "";
    }

    public boolean truncateTooLongNumber(PhoneNumber phoneNumber) {
        if (isValidNumber(phoneNumber)) {
            return true;
        }
        PhoneNumber phoneNumber2 = new PhoneNumber();
        phoneNumber2.mergeFrom(phoneNumber);
        long nationalNumber = phoneNumber.getNationalNumber();
        do {
            nationalNumber /= 10;
            phoneNumber2.setNationalNumber(nationalNumber);
            if (isPossibleNumberWithReason(phoneNumber2) == ValidationResult.TOO_SHORT || nationalNumber == 0) {
                return false;
            }
        } while (!isValidNumber(phoneNumber2));
        phoneNumber.setNationalNumber(nationalNumber);
        return true;
    }

    static CharSequence extractPossibleNumber(CharSequence charSequence) {
        Matcher matcher = VALID_START_CHAR_PATTERN.matcher(charSequence);
        if (!matcher.find()) {
            return "";
        }
        CharSequence subSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        Matcher matcher2 = UNWANTED_END_CHAR_PATTERN.matcher(subSequence);
        if (matcher2.find()) {
            subSequence = subSequence.subSequence(0, matcher2.start());
        }
        Matcher matcher3 = SECOND_NUMBER_START_PATTERN.matcher(subSequence);
        if (matcher3.find()) {
            subSequence = subSequence.subSequence(0, matcher3.start());
        }
        return subSequence;
    }

    public PhoneNumber getExampleNumberForType(PhoneNumberType phoneNumberType) {
        for (String exampleNumberForType : getSupportedRegions()) {
            PhoneNumber exampleNumberForType2 = getExampleNumberForType(exampleNumberForType, phoneNumberType);
            if (exampleNumberForType2 != null) {
                return exampleNumberForType2;
            }
        }
        for (Integer intValue : getSupportedGlobalNetworkCallingCodes()) {
            int intValue2 = intValue.intValue();
            PhoneNumberDesc numberDescByType = getNumberDescByType(getMetadataForNonGeographicalRegion(intValue2), phoneNumberType);
            try {
                if (numberDescByType.hasExampleNumber()) {
                    StringBuilder sb = new StringBuilder("+");
                    sb.append(intValue2);
                    sb.append(numberDescByType.getExampleNumber());
                    return parse(sb.toString(), "ZZ");
                }
            } catch (NumberParseException e) {
                logger.log(Level.SEVERE, e.toString());
            }
        }
        return null;
    }

    public PhoneNumber getInvalidExampleNumber(String str) {
        if (!isValidRegionCode(str)) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Invalid or unknown region code provided: ");
            sb.append(str);
            logger2.log(level, sb.toString());
            return null;
        }
        PhoneNumberDesc numberDescByType = getNumberDescByType(getMetadataForRegion(str), PhoneNumberType.FIXED_LINE);
        if (!numberDescByType.hasExampleNumber()) {
            return null;
        }
        String exampleNumber = numberDescByType.getExampleNumber();
        int length = exampleNumber.length();
        while (true) {
            length--;
            if (length < 2) {
                return null;
            }
            try {
                PhoneNumber parse = parse(exampleNumber.substring(0, length), str);
                if (!isValidNumber(parse)) {
                    return parse;
                }
            } catch (NumberParseException unused) {
            }
        }
    }

    public int getLengthOfNationalDestinationCode(PhoneNumber phoneNumber) {
        PhoneNumber phoneNumber2;
        if (phoneNumber.hasExtension()) {
            phoneNumber2 = new PhoneNumber();
            phoneNumber2.mergeFrom(phoneNumber);
            phoneNumber2.clearExtension();
        } else {
            phoneNumber2 = phoneNumber;
        }
        String[] split = NON_DIGITS_PATTERN.split(format(phoneNumber2, PhoneNumberFormat.INTERNATIONAL));
        if (split.length <= 3) {
            return 0;
        }
        if (getNumberType(phoneNumber) != PhoneNumberType.MOBILE || getCountryMobileToken(phoneNumber.getCountryCode()).equals("")) {
            return split[2].length();
        }
        return split[2].length() + split[3].length();
    }

    public String getRegionCodeForNumber(PhoneNumber phoneNumber) {
        int countryCode = phoneNumber.getCountryCode();
        List list = (List) this.countryCallingCodeToRegionCodeMap.get(Integer.valueOf(countryCode));
        if (list == null) {
            Logger logger2 = logger;
            Level level = Level.INFO;
            StringBuilder sb = new StringBuilder("Missing/invalid country_code (");
            sb.append(countryCode);
            sb.append(")");
            logger2.log(level, sb.toString());
            return null;
        } else if (list.size() == 1) {
            return (String) list.get(0);
        } else {
            return getRegionCodeForNumberFromRegionList(phoneNumber, list);
        }
    }

    public PhoneNumber getExampleNumberForNonGeoEntity(int i) {
        PhoneMetadata metadataForNonGeographicalRegion = getMetadataForNonGeographicalRegion(i);
        if (metadataForNonGeographicalRegion != null) {
            for (PhoneNumberDesc phoneNumberDesc : Arrays.asList(new PhoneNumberDesc[]{metadataForNonGeographicalRegion.getMobile(), metadataForNonGeographicalRegion.getTollFree(), metadataForNonGeographicalRegion.getSharedCost(), metadataForNonGeographicalRegion.getVoip(), metadataForNonGeographicalRegion.getVoicemail(), metadataForNonGeographicalRegion.getUan(), metadataForNonGeographicalRegion.getPremiumRate()})) {
                if (phoneNumberDesc != null) {
                    try {
                        if (phoneNumberDesc.hasExampleNumber()) {
                            StringBuilder sb = new StringBuilder("+");
                            sb.append(i);
                            sb.append(phoneNumberDesc.getExampleNumber());
                            return parse(sb.toString(), "ZZ");
                        }
                    } catch (NumberParseException e) {
                        logger.log(Level.SEVERE, e.toString());
                    }
                }
            }
        } else {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            StringBuilder sb2 = new StringBuilder("Invalid or unknown country calling code provided: ");
            sb2.append(i);
            logger2.log(level, sb2.toString());
        }
        return null;
    }

    private ValidationResult testNumberLength(CharSequence charSequence, PhoneMetadata phoneMetadata) {
        return testNumberLength(charSequence, phoneMetadata, PhoneNumberType.UNKNOWN);
    }

    public Iterable<PhoneNumberMatch> findNumbers(CharSequence charSequence, String str) {
        return findNumbers(charSequence, str, Leniency.VALID, Long.MAX_VALUE);
    }

    public boolean isPossibleNumber(CharSequence charSequence, String str) {
        try {
            return isPossibleNumber(parse(charSequence, str));
        } catch (NumberParseException unused) {
            return false;
        }
    }

    public PhoneNumber parse(CharSequence charSequence, String str) throws NumberParseException {
        PhoneNumber phoneNumber = new PhoneNumber();
        parse(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    public PhoneNumber parseAndKeepRawInput(CharSequence charSequence, String str) throws NumberParseException {
        PhoneNumber phoneNumber = new PhoneNumber();
        parseAndKeepRawInput(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    private boolean checkRegionForParsing(CharSequence charSequence, String str) {
        if (isValidRegionCode(str) || (charSequence != null && charSequence.length() != 0 && PLUS_CHARS_PATTERN.matcher(charSequence).lookingAt())) {
            return true;
        }
        return false;
    }

    private PhoneMetadata getMetadataForRegionOrCallingCode(int i, String str) {
        if ("001".equals(str)) {
            return getMetadataForNonGeographicalRegion(i);
        }
        return getMetadataForRegion(str);
    }

    public String formatNationalNumberWithPreferredCarrierCode(PhoneNumber phoneNumber, CharSequence charSequence) {
        if (phoneNumber.getPreferredDomesticCarrierCode().length() > 0) {
            charSequence = phoneNumber.getPreferredDomesticCarrierCode();
        }
        return formatNationalNumberWithCarrierCode(phoneNumber, charSequence);
    }

    public boolean isNumberGeographical(PhoneNumberType phoneNumberType, int i) {
        if (phoneNumberType == PhoneNumberType.FIXED_LINE || phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE || (GEO_MOBILE_COUNTRIES.contains(Integer.valueOf(i)) && phoneNumberType == PhoneNumberType.MOBILE)) {
            return true;
        }
        return false;
    }

    public boolean isPossibleNumberForType(PhoneNumber phoneNumber, PhoneNumberType phoneNumberType) {
        ValidationResult isPossibleNumberForTypeWithReason = isPossibleNumberForTypeWithReason(phoneNumber, phoneNumberType);
        if (isPossibleNumberForTypeWithReason == ValidationResult.IS_POSSIBLE || isPossibleNumberForTypeWithReason == ValidationResult.IS_POSSIBLE_LOCAL_ONLY) {
            return true;
        }
        return false;
    }

    public ValidationResult isPossibleNumberForTypeWithReason(PhoneNumber phoneNumber, PhoneNumberType phoneNumberType) {
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        int countryCode = phoneNumber.getCountryCode();
        if (!hasValidCountryCallingCode(countryCode)) {
            return ValidationResult.INVALID_COUNTRY_CODE;
        }
        return testNumberLength(nationalSignificantNumber, getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode)), phoneNumberType);
    }

    private String getRegionCodeForNumberFromRegionList(PhoneNumber phoneNumber, List<String> list) {
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        for (String str : list) {
            PhoneMetadata metadataForRegion = getMetadataForRegion(str);
            if (metadataForRegion.hasLeadingDigits()) {
                if (this.regexCache.getPatternForRegex(metadataForRegion.getLeadingDigits()).matcher(nationalSignificantNumber).lookingAt()) {
                    return str;
                }
            } else if (getNumberTypeHelper(nationalSignificantNumber, metadataForRegion) != PhoneNumberType.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    private boolean isNationalNumberSuffixOfTheOther(PhoneNumber phoneNumber, PhoneNumber phoneNumber2) {
        String valueOf = String.valueOf(phoneNumber.getNationalNumber());
        String valueOf2 = String.valueOf(phoneNumber2.getNationalNumber());
        if (valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf)) {
            return true;
        }
        return false;
    }

    static StringBuilder normalizeDigits(CharSequence charSequence, boolean z) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (z) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    private boolean parsePrefixAsIdd(Pattern pattern, StringBuilder sb) {
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        int end = matcher.end();
        Matcher matcher2 = CAPTURING_DIGIT_PATTERN.matcher(sb.substring(end));
        if (matcher2.find() && normalizeDigitsOnly(matcher2.group(1)).equals("0")) {
            return false;
        }
        sb.delete(0, end);
        return true;
    }

    static void setItalianLeadingZerosForPhoneNumber(CharSequence charSequence, PhoneNumber phoneNumber) {
        if (charSequence.length() > 1 && charSequence.charAt(0) == '0') {
            phoneNumber.setItalianLeadingZero(true);
            int i = 1;
            while (i < charSequence.length() - 1 && charSequence.charAt(i) == '0') {
                i++;
            }
            if (i != 1) {
                phoneNumber.setNumberOfLeadingZeros(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int extractCountryCode(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() == 0 || sb.charAt(0) == '0') {
            return 0;
        }
        int length = sb.length();
        int i = 1;
        while (i <= 3 && i <= length) {
            int parseInt = Integer.parseInt(sb.substring(0, i));
            if (this.countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(parseInt))) {
                sb2.append(sb.substring(i));
                return parseInt;
            }
            i++;
        }
        return 0;
    }

    public String format(PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat) {
        if (phoneNumber.getNationalNumber() == 0 && phoneNumber.hasRawInput()) {
            String rawInput = phoneNumber.getRawInput();
            if (rawInput.length() > 0) {
                return rawInput;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        format(phoneNumber, phoneNumberFormat, sb);
        return sb.toString();
    }

    public String formatNationalNumberWithCarrierCode(PhoneNumber phoneNumber, CharSequence charSequence) {
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!hasValidCountryCallingCode(countryCode)) {
            return nationalSignificantNumber;
        }
        PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        StringBuilder sb = new StringBuilder(20);
        sb.append(formatNsn(nationalSignificantNumber, metadataForRegionOrCallingCode, PhoneNumberFormat.NATIONAL, charSequence));
        maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, PhoneNumberFormat.NATIONAL, sb);
        prefixNumberWithCountryCallingCode(countryCode, PhoneNumberFormat.NATIONAL, sb);
        return sb.toString();
    }

    public String getNddPrefixForRegion(String str, boolean z) {
        PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (metadataForRegion == null) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Invalid or missing region code (");
            if (str == null) {
                str = TEVideoRecorder.FACE_BEAUTY_NULL;
            }
            sb.append(str);
            sb.append(") provided.");
            logger2.log(level, sb.toString());
            return null;
        }
        String nationalPrefix = metadataForRegion.getNationalPrefix();
        if (nationalPrefix.length() == 0) {
            return null;
        }
        if (z) {
            nationalPrefix = nationalPrefix.replace("~", "");
        }
        return nationalPrefix;
    }

    /* access modifiers changed from: 0000 */
    public boolean isNumberMatchingDesc(String str, PhoneNumberDesc phoneNumberDesc) {
        int length = str.length();
        List possibleLengthList = phoneNumberDesc.getPossibleLengthList();
        if (possibleLengthList.size() <= 0 || possibleLengthList.contains(Integer.valueOf(length))) {
            return this.matcherApi.matchNationalNumber(str, phoneNumberDesc, false);
        }
        return false;
    }

    public boolean isValidNumberForRegion(PhoneNumber phoneNumber, String str) {
        int countryCode = phoneNumber.getCountryCode();
        PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, str);
        if (metadataForRegionOrCallingCode == null || ((!"001".equals(str) && countryCode != getCountryCodeForValidRegion(str)) || getNumberTypeHelper(getNationalSignificantNumber(phoneNumber), metadataForRegionOrCallingCode) == PhoneNumberType.UNKNOWN)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public CountryCodeSource maybeStripInternationalPrefixAndNormalize(StringBuilder sb, String str) {
        if (sb.length() == 0) {
            return CountryCodeSource.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = PLUS_CHARS_PATTERN.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            normalize(sb);
            return CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern patternForRegex = this.regexCache.getPatternForRegex(str);
        normalize(sb);
        if (parsePrefixAsIdd(patternForRegex, sb)) {
            return CountryCodeSource.FROM_NUMBER_WITH_IDD;
        }
        return CountryCodeSource.FROM_DEFAULT_COUNTRY;
    }

    private void buildNationalNumberForParsing(String str, StringBuilder sb) {
        int i;
        int indexOf = str.indexOf(";phone-context=");
        if (indexOf >= 0) {
            int i2 = indexOf + 15;
            if (i2 < str.length() - 1 && str.charAt(i2) == '+') {
                int indexOf2 = str.indexOf(59, i2);
                if (indexOf2 > 0) {
                    sb.append(str.substring(i2, indexOf2));
                } else {
                    sb.append(str.substring(i2));
                }
            }
            int indexOf3 = str.indexOf("tel:");
            if (indexOf3 >= 0) {
                i = indexOf3 + 4;
            } else {
                i = 0;
            }
            sb.append(str.substring(i, indexOf));
        } else {
            sb.append(extractPossibleNumber(str));
        }
        int indexOf4 = sb.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb.delete(indexOf4, sb.length());
        }
    }

    /* access modifiers changed from: 0000 */
    public NumberFormat chooseFormattingPatternForNumber(List<NumberFormat> list, String str) {
        for (NumberFormat numberFormat : list) {
            int leadingDigitsPatternSize = numberFormat.leadingDigitsPatternSize();
            if ((leadingDigitsPatternSize == 0 || this.regexCache.getPatternForRegex(numberFormat.getLeadingDigitsPattern(leadingDigitsPatternSize - 1)).matcher(str).lookingAt()) && this.regexCache.getPatternForRegex(numberFormat.getPattern()).matcher(str).matches()) {
                return numberFormat;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public PhoneNumberDesc getNumberDescByType(PhoneMetadata phoneMetadata, PhoneNumberType phoneNumberType) {
        switch (phoneNumberType) {
            case PREMIUM_RATE:
                return phoneMetadata.getPremiumRate();
            case TOLL_FREE:
                return phoneMetadata.getTollFree();
            case MOBILE:
                return phoneMetadata.getMobile();
            case FIXED_LINE:
            case FIXED_LINE_OR_MOBILE:
                return phoneMetadata.getFixedLine();
            case SHARED_COST:
                return phoneMetadata.getSharedCost();
            case VOIP:
                return phoneMetadata.getVoip();
            case PERSONAL_NUMBER:
                return phoneMetadata.getPersonalNumber();
            case PAGER:
                return phoneMetadata.getPager();
            case UAN:
                return phoneMetadata.getUan();
            case VOICEMAIL:
                return phoneMetadata.getVoicemail();
            default:
                return phoneMetadata.getGeneralDesc();
        }
    }

    public MatchType isNumberMatch(PhoneNumber phoneNumber, PhoneNumber phoneNumber2) {
        PhoneNumber copyCoreFieldsOnly = copyCoreFieldsOnly(phoneNumber);
        PhoneNumber copyCoreFieldsOnly2 = copyCoreFieldsOnly(phoneNumber2);
        if (copyCoreFieldsOnly.hasExtension() && copyCoreFieldsOnly2.hasExtension() && !copyCoreFieldsOnly.getExtension().equals(copyCoreFieldsOnly2.getExtension())) {
            return MatchType.NO_MATCH;
        }
        int countryCode = copyCoreFieldsOnly.getCountryCode();
        int countryCode2 = copyCoreFieldsOnly2.getCountryCode();
        if (countryCode == 0 || countryCode2 == 0) {
            copyCoreFieldsOnly.setCountryCode(countryCode2);
            if (copyCoreFieldsOnly.exactlySameAs(copyCoreFieldsOnly2)) {
                return MatchType.NSN_MATCH;
            }
            if (isNationalNumberSuffixOfTheOther(copyCoreFieldsOnly, copyCoreFieldsOnly2)) {
                return MatchType.SHORT_NSN_MATCH;
            }
            return MatchType.NO_MATCH;
        } else if (copyCoreFieldsOnly.exactlySameAs(copyCoreFieldsOnly2)) {
            return MatchType.EXACT_MATCH;
        } else {
            if (countryCode != countryCode2 || !isNationalNumberSuffixOfTheOther(copyCoreFieldsOnly, copyCoreFieldsOnly2)) {
                return MatchType.NO_MATCH;
            }
            return MatchType.SHORT_NSN_MATCH;
        }
    }

    PhoneNumberUtil(MetadataSource metadataSource2, Map<Integer, List<String>> map) {
        this.metadataSource = metadataSource2;
        this.countryCallingCodeToRegionCodeMap = map;
        for (Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.supportedRegions.addAll(list);
            } else {
                this.countryCodesForNonGeographicalRegion.add(entry.getKey());
            }
        }
        if (this.supportedRegions.remove("001")) {
            logger.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.nanpaRegions.addAll((Collection) map.get(Integer.valueOf(1)));
    }

    private PhoneNumberType getNumberTypeHelper(String str, PhoneMetadata phoneMetadata) {
        if (!isNumberMatchingDesc(str, phoneMetadata.getGeneralDesc())) {
            return PhoneNumberType.UNKNOWN;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getPremiumRate())) {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getTollFree())) {
            return PhoneNumberType.TOLL_FREE;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getSharedCost())) {
            return PhoneNumberType.SHARED_COST;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getVoip())) {
            return PhoneNumberType.VOIP;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getPersonalNumber())) {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getPager())) {
            return PhoneNumberType.PAGER;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getUan())) {
            return PhoneNumberType.UAN;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getVoicemail())) {
            return PhoneNumberType.VOICEMAIL;
        }
        if (isNumberMatchingDesc(str, phoneMetadata.getFixedLine())) {
            if (phoneMetadata.getSameMobileAndFixedLinePattern()) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            if (isNumberMatchingDesc(str, phoneMetadata.getMobile())) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            return PhoneNumberType.FIXED_LINE;
        } else if (phoneMetadata.getSameMobileAndFixedLinePattern() || !isNumberMatchingDesc(str, phoneMetadata.getMobile())) {
            return PhoneNumberType.UNKNOWN;
        } else {
            return PhoneNumberType.MOBILE;
        }
    }

    public String formatInOriginalFormat(PhoneNumber phoneNumber, String str) {
        String str2;
        if (phoneNumber.hasRawInput() && !hasFormattingPatternForNumber(phoneNumber)) {
            return phoneNumber.getRawInput();
        }
        if (!phoneNumber.hasCountryCodeSource()) {
            return format(phoneNumber, PhoneNumberFormat.NATIONAL);
        }
        switch (phoneNumber.getCountryCodeSource()) {
            case FROM_NUMBER_WITH_PLUS_SIGN:
                str2 = format(phoneNumber, PhoneNumberFormat.INTERNATIONAL);
                break;
            case FROM_NUMBER_WITH_IDD:
                str2 = formatOutOfCountryCallingNumber(phoneNumber, str);
                break;
            case FROM_NUMBER_WITHOUT_PLUS_SIGN:
                str2 = format(phoneNumber, PhoneNumberFormat.INTERNATIONAL).substring(1);
                break;
            default:
                String regionCodeForCountryCode = getRegionCodeForCountryCode(phoneNumber.getCountryCode());
                String nddPrefixForRegion = getNddPrefixForRegion(regionCodeForCountryCode, true);
                String format = format(phoneNumber, PhoneNumberFormat.NATIONAL);
                if (!(nddPrefixForRegion == null || nddPrefixForRegion.length() == 0 || rawInputContainsNationalPrefix(phoneNumber.getRawInput(), nddPrefixForRegion, regionCodeForCountryCode))) {
                    PhoneMetadata metadataForRegion = getMetadataForRegion(regionCodeForCountryCode);
                    NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(metadataForRegion.numberFormats(), getNationalSignificantNumber(phoneNumber));
                    if (chooseFormattingPatternForNumber != null) {
                        String nationalPrefixFormattingRule = chooseFormattingPatternForNumber.getNationalPrefixFormattingRule();
                        int indexOf = nationalPrefixFormattingRule.indexOf("$1");
                        if (indexOf > 0 && normalizeDigitsOnly(nationalPrefixFormattingRule.substring(0, indexOf)).length() != 0) {
                            Builder newBuilder = NumberFormat.newBuilder();
                            newBuilder.mergeFrom(chooseFormattingPatternForNumber);
                            newBuilder.clearNationalPrefixFormattingRule();
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(newBuilder);
                            str2 = formatByPattern(phoneNumber, PhoneNumberFormat.NATIONAL, arrayList);
                            break;
                        }
                    }
                }
                str2 = format;
                break;
        }
        String rawInput = phoneNumber.getRawInput();
        if (str2 == null || rawInput.length() <= 0 || normalizeDiallableCharsOnly(str2).equals(normalizeDiallableCharsOnly(rawInput))) {
            rawInput = str2;
        }
        return rawInput;
    }

    public String formatOutOfCountryCallingNumber(PhoneNumber phoneNumber, String str) {
        if (!isValidRegionCode(str)) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Trying to format number from invalid region ");
            sb.append(str);
            sb.append(". International formatting applied.");
            logger2.log(level, sb.toString());
            return format(phoneNumber, PhoneNumberFormat.INTERNATIONAL);
        }
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!hasValidCountryCallingCode(countryCode)) {
            return nationalSignificantNumber;
        }
        if (countryCode == 1) {
            if (isNANPACountry(str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(countryCode);
                sb2.append(" ");
                sb2.append(format(phoneNumber, PhoneNumberFormat.NATIONAL));
                return sb2.toString();
            }
        } else if (countryCode == getCountryCodeForValidRegion(str)) {
            return format(phoneNumber, PhoneNumberFormat.NATIONAL);
        }
        PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        String internationalPrefix = metadataForRegion.getInternationalPrefix();
        String str2 = "";
        if (!SINGLE_INTERNATIONAL_PREFIX.matcher(internationalPrefix).matches()) {
            if (metadataForRegion.hasPreferredInternationalPrefix()) {
                internationalPrefix = metadataForRegion.getPreferredInternationalPrefix();
            } else {
                internationalPrefix = str2;
            }
        }
        PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        StringBuilder sb3 = new StringBuilder(formatNsn(nationalSignificantNumber, metadataForRegionOrCallingCode, PhoneNumberFormat.INTERNATIONAL));
        maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, PhoneNumberFormat.INTERNATIONAL, sb3);
        if (internationalPrefix.length() > 0) {
            sb3.insert(0, " ").insert(0, countryCode).insert(0, " ").insert(0, internationalPrefix);
        } else {
            prefixNumberWithCountryCallingCode(countryCode, PhoneNumberFormat.INTERNATIONAL, sb3);
        }
        return sb3.toString();
    }

    public String formatOutOfCountryKeepingAlphaChars(PhoneNumber phoneNumber, String str) {
        String rawInput = phoneNumber.getRawInput();
        if (rawInput.length() == 0) {
            return formatOutOfCountryCallingNumber(phoneNumber, str);
        }
        int countryCode = phoneNumber.getCountryCode();
        if (!hasValidCountryCallingCode(countryCode)) {
            return rawInput;
        }
        String normalizeHelper = normalizeHelper(rawInput, ALL_PLUS_NUMBER_GROUPING_SYMBOLS, true);
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (nationalSignificantNumber.length() > 3) {
            int indexOf = normalizeHelper.indexOf(nationalSignificantNumber.substring(0, 3));
            if (indexOf != -1) {
                normalizeHelper = normalizeHelper.substring(indexOf);
            }
        }
        PhoneMetadata metadataForRegion = getMetadataForRegion(str);
        if (countryCode == 1) {
            if (isNANPACountry(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(countryCode);
                sb.append(" ");
                sb.append(normalizeHelper);
                return sb.toString();
            }
        } else if (metadataForRegion != null && countryCode == getCountryCodeForValidRegion(str)) {
            NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(metadataForRegion.numberFormats(), nationalSignificantNumber);
            if (chooseFormattingPatternForNumber == null) {
                return normalizeHelper;
            }
            Builder newBuilder = NumberFormat.newBuilder();
            newBuilder.mergeFrom(chooseFormattingPatternForNumber);
            newBuilder.setPattern("(\\d+)(.*)");
            newBuilder.setFormat("$1$2");
            return formatNsnUsingPattern(normalizeHelper, newBuilder, PhoneNumberFormat.NATIONAL);
        }
        String str2 = "";
        if (metadataForRegion != null) {
            str2 = metadataForRegion.getInternationalPrefix();
            if (!SINGLE_INTERNATIONAL_PREFIX.matcher(str2).matches()) {
                str2 = metadataForRegion.getPreferredInternationalPrefix();
            }
        }
        StringBuilder sb2 = new StringBuilder(normalizeHelper);
        maybeAppendFormattedExtension(phoneNumber, getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode)), PhoneNumberFormat.INTERNATIONAL, sb2);
        if (str2.length() > 0) {
            sb2.insert(0, " ").insert(0, countryCode).insert(0, " ").insert(0, str2);
        } else {
            if (!isValidRegionCode(str)) {
                Logger logger2 = logger;
                Level level = Level.WARNING;
                StringBuilder sb3 = new StringBuilder("Trying to format number from invalid region ");
                sb3.append(str);
                sb3.append(". International formatting applied.");
                logger2.log(level, sb3.toString());
            }
            prefixNumberWithCountryCallingCode(countryCode, PhoneNumberFormat.INTERNATIONAL, sb2);
        }
        return sb2.toString();
    }

    public PhoneNumber getExampleNumberForType(String str, PhoneNumberType phoneNumberType) {
        if (!isValidRegionCode(str)) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Invalid or unknown region code provided: ");
            sb.append(str);
            logger2.log(level, sb.toString());
            return null;
        }
        PhoneNumberDesc numberDescByType = getNumberDescByType(getMetadataForRegion(str), phoneNumberType);
        try {
            if (numberDescByType.hasExampleNumber()) {
                return parse(numberDescByType.getExampleNumber(), str);
            }
        } catch (NumberParseException e) {
            logger.log(Level.SEVERE, e.toString());
        }
        return null;
    }

    public MatchType isNumberMatch(PhoneNumber phoneNumber, CharSequence charSequence) {
        try {
            return isNumberMatch(phoneNumber, parse(charSequence, "ZZ"));
        } catch (NumberParseException e) {
            if (e.getErrorType() == ErrorType.INVALID_COUNTRY_CODE) {
                String regionCodeForCountryCode = getRegionCodeForCountryCode(phoneNumber.getCountryCode());
                try {
                    if (!regionCodeForCountryCode.equals("ZZ")) {
                        MatchType isNumberMatch = isNumberMatch(phoneNumber, parse(charSequence, regionCodeForCountryCode));
                        if (isNumberMatch == MatchType.EXACT_MATCH) {
                            return MatchType.NSN_MATCH;
                        }
                        return isNumberMatch;
                    }
                    PhoneNumber phoneNumber2 = new PhoneNumber();
                    parseHelper(charSequence, null, false, false, phoneNumber2);
                    return isNumberMatch(phoneNumber, phoneNumber2);
                } catch (NumberParseException unused) {
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }

    public MatchType isNumberMatch(CharSequence charSequence, CharSequence charSequence2) {
        try {
            return isNumberMatch(parse(charSequence, "ZZ"), charSequence2);
        } catch (NumberParseException e) {
            if (e.getErrorType() == ErrorType.INVALID_COUNTRY_CODE) {
                try {
                    return isNumberMatch(parse(charSequence2, "ZZ"), charSequence);
                } catch (NumberParseException e2) {
                    if (e2.getErrorType() == ErrorType.INVALID_COUNTRY_CODE) {
                        try {
                            PhoneNumber phoneNumber = new PhoneNumber();
                            PhoneNumber phoneNumber2 = new PhoneNumber();
                            parseHelper(charSequence, null, false, false, phoneNumber);
                            parseHelper(charSequence2, null, false, false, phoneNumber2);
                            return isNumberMatch(phoneNumber, phoneNumber2);
                        } catch (NumberParseException unused) {
                            return MatchType.NOT_A_NUMBER;
                        }
                    }
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }

    private String formatNsn(String str, PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat) {
        return formatNsn(str, phoneMetadata, phoneNumberFormat, null);
    }

    /* access modifiers changed from: 0000 */
    public String formatNsnUsingPattern(String str, NumberFormat numberFormat, PhoneNumberFormat phoneNumberFormat) {
        return formatNsnUsingPattern(str, numberFormat, phoneNumberFormat, null);
    }

    private boolean rawInputContainsNationalPrefix(String str, String str2, String str3) {
        String normalizeDigitsOnly = normalizeDigitsOnly(str);
        if (!normalizeDigitsOnly.startsWith(str2)) {
            return false;
        }
        try {
            return isValidNumber(parse(normalizeDigitsOnly.substring(str2.length()), str3));
        } catch (NumberParseException unused) {
            return false;
        }
    }

    public void parse(CharSequence charSequence, String str, PhoneNumber phoneNumber) throws NumberParseException {
        parseHelper(charSequence, str, false, true, phoneNumber);
    }

    public void parseAndKeepRawInput(CharSequence charSequence, String str, PhoneNumber phoneNumber) throws NumberParseException {
        parseHelper(charSequence, str, true, true, phoneNumber);
    }

    private static String normalizeHelper(CharSequence charSequence, Map<Character, Character> map, boolean z) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charAt)));
            if (ch != null) {
                sb.append(ch);
            } else if (!z) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    private void prefixNumberWithCountryCallingCode(int i, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        switch (phoneNumberFormat) {
            case E164:
                sb.insert(0, i).insert(0, '+');
                return;
            case INTERNATIONAL:
                sb.insert(0, " ").insert(0, i).insert(0, '+');
                return;
            case RFC3966:
                sb.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
                return;
            default:
                return;
        }
    }

    public void format(PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        sb.setLength(0);
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (phoneNumberFormat == PhoneNumberFormat.E164) {
            sb.append(nationalSignificantNumber);
            prefixNumberWithCountryCallingCode(countryCode, PhoneNumberFormat.E164, sb);
        } else if (!hasValidCountryCallingCode(countryCode)) {
            sb.append(nationalSignificantNumber);
        } else {
            PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
            sb.append(formatNsn(nationalSignificantNumber, metadataForRegionOrCallingCode, phoneNumberFormat));
            maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, phoneNumberFormat, sb);
            prefixNumberWithCountryCallingCode(countryCode, phoneNumberFormat, sb);
        }
    }

    public String formatByPattern(PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat, List<NumberFormat> list) {
        int countryCode = phoneNumber.getCountryCode();
        String nationalSignificantNumber = getNationalSignificantNumber(phoneNumber);
        if (!hasValidCountryCallingCode(countryCode)) {
            return nationalSignificantNumber;
        }
        PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(countryCode, getRegionCodeForCountryCode(countryCode));
        StringBuilder sb = new StringBuilder(20);
        NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(list, nationalSignificantNumber);
        if (chooseFormattingPatternForNumber == null) {
            sb.append(nationalSignificantNumber);
        } else {
            Builder newBuilder = NumberFormat.newBuilder();
            newBuilder.mergeFrom(chooseFormattingPatternForNumber);
            String nationalPrefixFormattingRule = chooseFormattingPatternForNumber.getNationalPrefixFormattingRule();
            if (nationalPrefixFormattingRule.length() > 0) {
                String nationalPrefix = metadataForRegionOrCallingCode.getNationalPrefix();
                if (nationalPrefix.length() > 0) {
                    newBuilder.setNationalPrefixFormattingRule(nationalPrefixFormattingRule.replace("$NP", nationalPrefix).replace("$FG", "$1"));
                } else {
                    newBuilder.clearNationalPrefixFormattingRule();
                }
            }
            sb.append(formatNsnUsingPattern(nationalSignificantNumber, newBuilder, phoneNumberFormat));
        }
        maybeAppendFormattedExtension(phoneNumber, metadataForRegionOrCallingCode, phoneNumberFormat, sb);
        prefixNumberWithCountryCallingCode(countryCode, phoneNumberFormat, sb);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        r2 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult testNumberLength(java.lang.CharSequence r4, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata r5, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType r6) {
        /*
            r3 = this;
        L_0x0000:
            com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc r0 = r3.getNumberDescByType(r5, r6)
            java.util.List r1 = r0.getPossibleLengthList()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0017
            com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc r1 = r5.getGeneralDesc()
            java.util.List r1 = r1.getPossibleLengthList()
            goto L_0x001b
        L_0x0017:
            java.util.List r1 = r0.getPossibleLengthList()
        L_0x001b:
            java.util.List r0 = r0.getPossibleLengthLocalOnlyList()
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE
            if (r6 != r2) goto L_0x007c
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r6 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE
            com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc r6 = r3.getNumberDescByType(r5, r6)
            boolean r6 = descHasPossibleNumberData(r6)
            if (r6 != 0) goto L_0x0032
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r6 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE
            goto L_0x0000
        L_0x0032:
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType r6 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE
            com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc r6 = r3.getNumberDescByType(r5, r6)
            boolean r2 = descHasPossibleNumberData(r6)
            if (r2 == 0) goto L_0x007c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.List r1 = r6.getPossibleLengthList()
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0056
            com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc r5 = r5.getGeneralDesc()
            java.util.List r5 = r5.getPossibleLengthList()
            goto L_0x005a
        L_0x0056:
            java.util.List r5 = r6.getPossibleLengthList()
        L_0x005a:
            r2.addAll(r5)
            java.util.Collections.sort(r2)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x006b
            java.util.List r0 = r6.getPossibleLengthLocalOnlyList()
            goto L_0x007d
        L_0x006b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.List r6 = r6.getPossibleLengthLocalOnlyList()
            r5.addAll(r6)
            java.util.Collections.sort(r5)
            r0 = r5
            goto L_0x007d
        L_0x007c:
            r2 = r1
        L_0x007d:
            r5 = 0
            java.lang.Object r6 = r2.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1 = -1
            if (r6 != r1) goto L_0x008e
            com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.INVALID_LENGTH
            return r4
        L_0x008e:
            int r4 = r4.length()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x009f
            com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE_LOCAL_ONLY
            return r4
        L_0x009f:
            java.lang.Object r5 = r2.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r4) goto L_0x00ae
            com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE
            return r4
        L_0x00ae:
            if (r5 <= r4) goto L_0x00b3
            com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_SHORT
            return r4
        L_0x00b3:
            int r5 = r2.size()
            r6 = 1
            int r5 = r5 - r6
            java.lang.Object r5 = r2.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 >= r4) goto L_0x00c8
            com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_LONG
            return r4
        L_0x00c8:
            int r5 = r2.size()
            java.util.List r5 = r2.subList(r6, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x00dd
            com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE
            return r4
        L_0x00dd:
            com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.INVALID_LENGTH
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.testNumberLength(java.lang.CharSequence, com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType):com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult");
    }

    /* access modifiers changed from: 0000 */
    public boolean maybeStripNationalPrefixAndCarrierCode(StringBuilder sb, PhoneMetadata phoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String nationalPrefixForParsing = phoneMetadata.getNationalPrefixForParsing();
        if (length == 0 || nationalPrefixForParsing.length() == 0) {
            return false;
        }
        Matcher matcher = this.regexCache.getPatternForRegex(nationalPrefixForParsing).matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        PhoneNumberDesc generalDesc = phoneMetadata.getGeneralDesc();
        boolean matchNationalNumber = this.matcherApi.matchNationalNumber(sb, generalDesc, false);
        int groupCount = matcher.groupCount();
        String nationalPrefixTransformRule = phoneMetadata.getNationalPrefixTransformRule();
        if (nationalPrefixTransformRule != null && nationalPrefixTransformRule.length() != 0 && matcher.group(groupCount) != null) {
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(nationalPrefixTransformRule));
            if (matchNationalNumber && !this.matcherApi.matchNationalNumber(sb3.toString(), generalDesc, false)) {
                return false;
            }
            if (sb2 != null && groupCount > 1) {
                sb2.append(matcher.group(1));
            }
            sb.replace(0, sb.length(), sb3.toString());
            return true;
        } else if (matchNationalNumber && !this.matcherApi.matchNationalNumber(sb.substring(matcher.end()), generalDesc, false)) {
            return false;
        } else {
            if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                sb2.append(matcher.group(1));
            }
            sb.delete(0, matcher.end());
            return true;
        }
    }

    public String formatNumberForMobileDialing(PhoneNumber phoneNumber, String str, boolean z) {
        boolean z2;
        String format;
        int countryCode = phoneNumber.getCountryCode();
        if (hasValidCountryCallingCode(countryCode)) {
            String str2 = "";
            PhoneNumber clearExtension = new PhoneNumber().mergeFrom(phoneNumber).clearExtension();
            String regionCodeForCountryCode = getRegionCodeForCountryCode(countryCode);
            PhoneNumberType numberType = getNumberType(clearExtension);
            boolean z3 = false;
            if (numberType != PhoneNumberType.UNKNOWN) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (str.equals(regionCodeForCountryCode)) {
                if (numberType == PhoneNumberType.FIXED_LINE || numberType == PhoneNumberType.MOBILE || numberType == PhoneNumberType.FIXED_LINE_OR_MOBILE) {
                    z3 = true;
                }
                if (!regionCodeForCountryCode.equals("CO") || numberType != PhoneNumberType.FIXED_LINE) {
                    if (!regionCodeForCountryCode.equals("BR") || !z3) {
                        if (z2 && regionCodeForCountryCode.equals("HU")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(getNddPrefixForRegion(regionCodeForCountryCode, true));
                            sb.append(" ");
                            sb.append(format(clearExtension, PhoneNumberFormat.NATIONAL));
                            str2 = sb.toString();
                        } else if (countryCode == 1) {
                            PhoneMetadata metadataForRegion = getMetadataForRegion(str);
                            if (!canBeInternationallyDialled(clearExtension) || testNumberLength(getNationalSignificantNumber(clearExtension), metadataForRegion) == ValidationResult.TOO_SHORT) {
                                str2 = format(clearExtension, PhoneNumberFormat.NATIONAL);
                            } else {
                                format = format(clearExtension, PhoneNumberFormat.INTERNATIONAL);
                            }
                        } else if ((regionCodeForCountryCode.equals("001") || ((regionCodeForCountryCode.equals("MX") || regionCodeForCountryCode.equals("CL") || regionCodeForCountryCode.equals("UZ")) && z3)) && canBeInternationallyDialled(clearExtension)) {
                            str2 = format(clearExtension, PhoneNumberFormat.INTERNATIONAL);
                        } else {
                            format = format(clearExtension, PhoneNumberFormat.NATIONAL);
                        }
                    } else if (clearExtension.getPreferredDomesticCarrierCode().length() > 0) {
                        format = formatNationalNumberWithPreferredCarrierCode(clearExtension, "");
                    } else {
                        format = "";
                    }
                    str2 = format;
                } else {
                    str2 = formatNationalNumberWithCarrierCode(clearExtension, "3");
                }
            } else if (z2 && canBeInternationallyDialled(clearExtension)) {
                if (z) {
                    return format(clearExtension, PhoneNumberFormat.INTERNATIONAL);
                }
                return format(clearExtension, PhoneNumberFormat.E164);
            }
            if (z) {
                return str2;
            }
            return normalizeDiallableCharsOnly(str2);
        } else if (phoneNumber.hasRawInput()) {
            return phoneNumber.getRawInput();
        } else {
            return "";
        }
    }

    public Iterable<PhoneNumberMatch> findNumbers(CharSequence charSequence, String str, Leniency leniency, long j) {
        final CharSequence charSequence2 = charSequence;
        final String str2 = str;
        final Leniency leniency2 = leniency;
        final long j2 = j;
        C183751 r0 = new Iterable<PhoneNumberMatch>() {
            public Iterator<PhoneNumberMatch> iterator() {
                PhoneNumberMatcher phoneNumberMatcher = new PhoneNumberMatcher(PhoneNumberUtil.this, charSequence2, str2, leniency2, j2);
                return phoneNumberMatcher;
            }
        };
        return r0;
    }

    private String formatNsn(String str, PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, CharSequence charSequence) {
        List list;
        if (phoneMetadata.intlNumberFormats().size() == 0 || phoneNumberFormat == PhoneNumberFormat.NATIONAL) {
            list = phoneMetadata.numberFormats();
        } else {
            list = phoneMetadata.intlNumberFormats();
        }
        NumberFormat chooseFormattingPatternForNumber = chooseFormattingPatternForNumber(list, str);
        if (chooseFormattingPatternForNumber == null) {
            return str;
        }
        return formatNsnUsingPattern(str, chooseFormattingPatternForNumber, phoneNumberFormat, charSequence);
    }

    private void maybeAppendFormattedExtension(PhoneNumber phoneNumber, PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        if (phoneNumber.hasExtension() && phoneNumber.getExtension().length() > 0) {
            if (phoneNumberFormat == PhoneNumberFormat.RFC3966) {
                sb.append(";ext=");
                sb.append(phoneNumber.getExtension());
            } else if (phoneMetadata.hasPreferredExtnPrefix()) {
                sb.append(phoneMetadata.getPreferredExtnPrefix());
                sb.append(phoneNumber.getExtension());
            } else {
                sb.append(" ext. ");
                sb.append(phoneNumber.getExtension());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String formatNsnUsingPattern(java.lang.String r4, com.google.i18n.phonenumbers.Phonemetadata.NumberFormat r5, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat r6, java.lang.CharSequence r7) {
        /*
            r3 = this;
            java.lang.String r0 = r5.getFormat()
            com.google.i18n.phonenumbers.internal.RegexCache r1 = r3.regexCache
            java.lang.String r2 = r5.getPattern()
            java.util.regex.Pattern r1 = r1.getPatternForRegex(r2)
            java.util.regex.Matcher r4 = r1.matcher(r4)
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r1 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL
            if (r6 != r1) goto L_0x003d
            if (r7 == 0) goto L_0x003d
            int r1 = r7.length()
            if (r1 <= 0) goto L_0x003d
            java.lang.String r1 = r5.getDomesticCarrierCodeFormattingRule()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x003d
            java.lang.String r5 = r5.getDomesticCarrierCodeFormattingRule()
            java.lang.String r1 = "$CC"
            java.lang.String r5 = r5.replace(r1, r7)
            java.util.regex.Pattern r7 = FIRST_GROUP_PATTERN
            java.util.regex.Matcher r7 = r7.matcher(r0)
            java.lang.String r0 = r7.replaceFirst(r5)
            goto L_0x005c
        L_0x003d:
            java.lang.String r5 = r5.getNationalPrefixFormattingRule()
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r7 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL
            if (r6 != r7) goto L_0x005c
            if (r5 == 0) goto L_0x005c
            int r7 = r5.length()
            if (r7 <= 0) goto L_0x005c
            java.util.regex.Pattern r7 = FIRST_GROUP_PATTERN
            java.util.regex.Matcher r7 = r7.matcher(r0)
            java.lang.String r5 = r7.replaceFirst(r5)
            java.lang.String r4 = r4.replaceAll(r5)
            goto L_0x0060
        L_0x005c:
            java.lang.String r4 = r4.replaceAll(r0)
        L_0x0060:
            com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.RFC3966
            if (r6 != r5) goto L_0x0080
            java.util.regex.Pattern r5 = SEPARATOR_PATTERN
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r6 = r5.lookingAt()
            if (r6 == 0) goto L_0x0076
            java.lang.String r4 = ""
            java.lang.String r4 = r5.replaceFirst(r4)
        L_0x0076:
            java.util.regex.Matcher r4 = r5.reset(r4)
            java.lang.String r5 = "-"
            java.lang.String r4 = r4.replaceAll(r5)
        L_0x0080:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.formatNsnUsingPattern(java.lang.String, com.google.i18n.phonenumbers.Phonemetadata$NumberFormat, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat, java.lang.CharSequence):java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    public int maybeExtractCountryCode(CharSequence charSequence, PhoneMetadata phoneMetadata, StringBuilder sb, boolean z, PhoneNumber phoneNumber) throws NumberParseException {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = "NonMatch";
        if (phoneMetadata != null) {
            str = phoneMetadata.getInternationalPrefix();
        }
        CountryCodeSource maybeStripInternationalPrefixAndNormalize = maybeStripInternationalPrefixAndNormalize(sb2, str);
        if (z) {
            phoneNumber.setCountryCodeSource(maybeStripInternationalPrefixAndNormalize);
        }
        if (maybeStripInternationalPrefixAndNormalize == CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (phoneMetadata != null) {
                int countryCode = phoneMetadata.getCountryCode();
                String valueOf = String.valueOf(countryCode);
                String sb3 = sb2.toString();
                if (sb3.startsWith(valueOf)) {
                    StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                    PhoneNumberDesc generalDesc = phoneMetadata.getGeneralDesc();
                    maybeStripNationalPrefixAndCarrierCode(sb4, phoneMetadata, null);
                    if ((!this.matcherApi.matchNationalNumber(sb2, generalDesc, false) && this.matcherApi.matchNationalNumber(sb4, generalDesc, false)) || testNumberLength(sb2, phoneMetadata) == ValidationResult.TOO_LONG) {
                        sb.append(sb4);
                        if (z) {
                            phoneNumber.setCountryCodeSource(CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                        }
                        phoneNumber.setCountryCode(countryCode);
                        return countryCode;
                    }
                }
            }
            phoneNumber.setCountryCode(0);
            return 0;
        } else if (sb2.length() > 2) {
            int extractCountryCode = extractCountryCode(sb2, sb);
            if (extractCountryCode != 0) {
                phoneNumber.setCountryCode(extractCountryCode);
                return extractCountryCode;
            }
            throw new NumberParseException(ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        } else {
            throw new NumberParseException(ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
    }

    private void parseHelper(CharSequence charSequence, String str, boolean z, boolean z2, PhoneNumber phoneNumber) throws NumberParseException {
        int i;
        if (charSequence == null) {
            throw new NumberParseException(ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        } else if (charSequence.length() <= 250) {
            StringBuilder sb = new StringBuilder();
            String charSequence2 = charSequence.toString();
            buildNationalNumberForParsing(charSequence2, sb);
            if (!isViablePhoneNumber(sb)) {
                throw new NumberParseException(ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            } else if (!z2 || checkRegionForParsing(sb, str)) {
                if (z) {
                    phoneNumber.setRawInput(charSequence2);
                }
                String maybeStripExtension = maybeStripExtension(sb);
                if (maybeStripExtension.length() > 0) {
                    phoneNumber.setExtension(maybeStripExtension);
                }
                PhoneMetadata metadataForRegion = getMetadataForRegion(str);
                StringBuilder sb2 = new StringBuilder();
                try {
                    i = maybeExtractCountryCode(sb, metadataForRegion, sb2, z, phoneNumber);
                } catch (NumberParseException e) {
                    Matcher matcher = PLUS_CHARS_PATTERN.matcher(sb);
                    if (e.getErrorType() != ErrorType.INVALID_COUNTRY_CODE || !matcher.lookingAt()) {
                        throw new NumberParseException(e.getErrorType(), e.getMessage());
                    }
                    i = maybeExtractCountryCode(sb.substring(matcher.end()), metadataForRegion, sb2, z, phoneNumber);
                    if (i == 0) {
                        throw new NumberParseException(ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                    }
                }
                if (i != 0) {
                    String regionCodeForCountryCode = getRegionCodeForCountryCode(i);
                    if (!regionCodeForCountryCode.equals(str)) {
                        metadataForRegion = getMetadataForRegionOrCallingCode(i, regionCodeForCountryCode);
                    }
                } else {
                    sb2.append(normalize(sb));
                    if (str != null) {
                        phoneNumber.setCountryCode(metadataForRegion.getCountryCode());
                    } else if (z) {
                        phoneNumber.clearCountryCodeSource();
                    }
                }
                if (sb2.length() >= 2) {
                    if (metadataForRegion != null) {
                        StringBuilder sb3 = new StringBuilder();
                        StringBuilder sb4 = new StringBuilder(sb2);
                        maybeStripNationalPrefixAndCarrierCode(sb4, metadataForRegion, sb3);
                        ValidationResult testNumberLength = testNumberLength(sb4, metadataForRegion);
                        if (!(testNumberLength == ValidationResult.TOO_SHORT || testNumberLength == ValidationResult.IS_POSSIBLE_LOCAL_ONLY || testNumberLength == ValidationResult.INVALID_LENGTH)) {
                            if (z && sb3.length() > 0) {
                                phoneNumber.setPreferredDomesticCarrierCode(sb3.toString());
                            }
                            sb2 = sb4;
                        }
                    }
                    int length = sb2.length();
                    if (length < 2) {
                        throw new NumberParseException(ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                    } else if (length <= 17) {
                        setItalianLeadingZerosForPhoneNumber(sb2, phoneNumber);
                        phoneNumber.setNationalNumber(Long.parseLong(sb2.toString()));
                    } else {
                        throw new NumberParseException(ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
                    }
                } else {
                    throw new NumberParseException(ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                }
            } else {
                throw new NumberParseException(ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
            }
        } else {
            throw new NumberParseException(ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
    }
}
