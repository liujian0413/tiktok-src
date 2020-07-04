package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency;
import com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonemetadata.NumberFormat;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource;
import java.lang.Character.UnicodeBlock;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class PhoneNumberMatcher implements Iterator<PhoneNumberMatch> {
    private static final Pattern[] INNER_MATCHES = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    private static final Pattern LEAD_CLASS;
    private static final Pattern MATCHING_BRACKETS;
    private static final Pattern PATTERN;
    private static final Pattern PUB_PAGES = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    private static final Pattern SLASH_SEPARATED_DATES = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    private static final Pattern TIME_STAMPS = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    private static final Pattern TIME_STAMPS_SUFFIX = Pattern.compile(":[0-5]\\d");
    private PhoneNumberMatch lastMatch;
    private final Leniency leniency;
    private long maxTries;
    private final PhoneNumberUtil phoneUtil;
    private final String preferredRegion;
    private int searchIndex;
    private State state = State.NOT_READY;
    private final CharSequence text;

    interface NumberGroupingChecker {
        boolean checkGroups(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, StringBuilder sb, String[] strArr);
    }

    enum State {
        NOT_READY,
        READY,
        DONE
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final PhoneNumberMatch next() {
        if (hasNext()) {
            PhoneNumberMatch phoneNumberMatch = this.lastMatch;
            this.lastMatch = null;
            this.state = State.NOT_READY;
            return phoneNumberMatch;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        if (this.state == State.NOT_READY) {
            this.lastMatch = find(this.searchIndex);
            if (this.lastMatch == null) {
                this.state = State.DONE;
            } else {
                this.searchIndex = this.lastMatch.end();
                this.state = State.READY;
            }
        }
        if (this.state == State.READY) {
            return true;
        }
        return false;
    }

    static {
        String str = "(\\[（［";
        String str2 = ")\\]）］";
        StringBuilder sb = new StringBuilder("[^");
        sb.append(str);
        sb.append(str2);
        sb.append("]");
        String sb2 = sb.toString();
        String limit = limit(0, 3);
        StringBuilder sb3 = new StringBuilder("(?:[");
        sb3.append(str);
        sb3.append("])?(?:");
        sb3.append(sb2);
        sb3.append("+[");
        sb3.append(str2);
        sb3.append("])?");
        sb3.append(sb2);
        sb3.append("+(?:[");
        sb3.append(str);
        sb3.append("]");
        sb3.append(sb2);
        sb3.append("+[");
        sb3.append(str2);
        sb3.append("])");
        sb3.append(limit);
        sb3.append(sb2);
        sb3.append("*");
        MATCHING_BRACKETS = Pattern.compile(sb3.toString());
        String limit2 = limit(0, 2);
        String limit3 = limit(0, 4);
        String limit4 = limit(0, 20);
        StringBuilder sb4 = new StringBuilder("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]");
        sb4.append(limit3);
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder("\\p{Nd}");
        sb6.append(limit(1, 20));
        String sb7 = sb6.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(str);
        sb8.append("+＋");
        String sb9 = sb8.toString();
        StringBuilder sb10 = new StringBuilder("[");
        sb10.append(sb9);
        sb10.append("]");
        String sb11 = sb10.toString();
        LEAD_CLASS = Pattern.compile(sb11);
        StringBuilder sb12 = new StringBuilder("(?:");
        sb12.append(sb11);
        sb12.append(sb5);
        sb12.append(")");
        sb12.append(limit2);
        sb12.append(sb7);
        sb12.append("(?:");
        sb12.append(sb5);
        sb12.append(sb7);
        sb12.append(")");
        sb12.append(limit4);
        sb12.append("(?:");
        sb12.append(PhoneNumberUtil.EXTN_PATTERNS_FOR_MATCHING);
        sb12.append(")?");
        PATTERN = Pattern.compile(sb12.toString(), 66);
    }

    private static boolean isInvalidPunctuationSymbol(char c) {
        if (c == '%' || Character.getType(c) == 26) {
            return true;
        }
        return false;
    }

    private PhoneNumberMatch find(int i) {
        Matcher matcher = PATTERN.matcher(this.text);
        while (this.maxTries > 0 && matcher.find(i)) {
            int start = matcher.start();
            CharSequence trimAfterFirstMatch = trimAfterFirstMatch(PhoneNumberUtil.SECOND_NUMBER_START_PATTERN, this.text.subSequence(start, matcher.end()));
            PhoneNumberMatch extractMatch = extractMatch(trimAfterFirstMatch, start);
            if (extractMatch != null) {
                return extractMatch;
            }
            i = start + trimAfterFirstMatch.length();
            this.maxTries--;
        }
        return null;
    }

    static boolean isLatinLetter(char c) {
        if (!Character.isLetter(c) && Character.getType(c) != 6) {
            return false;
        }
        UnicodeBlock of = UnicodeBlock.of(c);
        if (of.equals(UnicodeBlock.BASIC_LATIN) || of.equals(UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(UnicodeBlock.LATIN_EXTENDED_A) || of.equals(UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(UnicodeBlock.LATIN_EXTENDED_B) || of.equals(UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
            return true;
        }
        return false;
    }

    private static CharSequence trimAfterFirstMatch(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        if (matcher.find()) {
            return charSequence.subSequence(0, matcher.start());
        }
        return charSequence;
    }

    private static String limit(int i, int i2) {
        if (i < 0 || i2 <= 0 || i2 < i) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    static boolean containsMoreThanOneSlashInNationalNumber(PhoneNumber phoneNumber, String str) {
        boolean z;
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return false;
        }
        int indexOf2 = str.indexOf(47, indexOf + 1);
        if (indexOf2 < 0) {
            return false;
        }
        if (phoneNumber.getCountryCodeSource() == CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN || phoneNumber.getCountryCodeSource() == CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !PhoneNumberUtil.normalizeDigitsOnly(str.substring(0, indexOf)).equals(Integer.toString(phoneNumber.getCountryCode()))) {
            return true;
        }
        return str.substring(indexOf2 + 1).contains("/");
    }

    private PhoneNumberMatch extractInnerMatch(CharSequence charSequence, int i) {
        for (Pattern matcher : INNER_MATCHES) {
            Matcher matcher2 = matcher.matcher(charSequence);
            boolean z = true;
            while (matcher2.find() && this.maxTries > 0) {
                if (z) {
                    PhoneNumberMatch parseAndVerify = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, charSequence.subSequence(0, matcher2.start())), i);
                    if (parseAndVerify != null) {
                        return parseAndVerify;
                    }
                    this.maxTries--;
                    z = false;
                }
                PhoneNumberMatch parseAndVerify2 = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, matcher2.group(1)), matcher2.start(1) + i);
                if (parseAndVerify2 != null) {
                    return parseAndVerify2;
                }
                this.maxTries--;
            }
        }
        return null;
    }

    private PhoneNumberMatch extractMatch(CharSequence charSequence, int i) {
        if (SLASH_SEPARATED_DATES.matcher(charSequence).find()) {
            return null;
        }
        if (TIME_STAMPS.matcher(charSequence).find()) {
            if (TIME_STAMPS_SUFFIX.matcher(this.text.toString().substring(charSequence.length() + i)).lookingAt()) {
                return null;
            }
        }
        PhoneNumberMatch parseAndVerify = parseAndVerify(charSequence, i);
        if (parseAndVerify != null) {
            return parseAndVerify;
        }
        return extractInnerMatch(charSequence, i);
    }

    static boolean isNationalPrefixPresentIfRequired(PhoneNumber phoneNumber, PhoneNumberUtil phoneNumberUtil) {
        if (phoneNumber.getCountryCodeSource() != CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            return true;
        }
        PhoneMetadata metadataForRegion = phoneNumberUtil.getMetadataForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()));
        if (metadataForRegion == null) {
            return true;
        }
        NumberFormat chooseFormattingPatternForNumber = phoneNumberUtil.chooseFormattingPatternForNumber(metadataForRegion.numberFormats(), phoneNumberUtil.getNationalSignificantNumber(phoneNumber));
        if (chooseFormattingPatternForNumber == null || chooseFormattingPatternForNumber.getNationalPrefixFormattingRule().length() <= 0 || chooseFormattingPatternForNumber.getNationalPrefixOptionalWhenFormatting() || PhoneNumberUtil.formattingRuleHasFirstGroupOnly(chooseFormattingPatternForNumber.getNationalPrefixFormattingRule())) {
            return true;
        }
        return phoneNumberUtil.maybeStripNationalPrefixAndCarrierCode(new StringBuilder(PhoneNumberUtil.normalizeDigitsOnly(phoneNumber.getRawInput())), metadataForRegion, null);
    }

    private PhoneNumberMatch parseAndVerify(CharSequence charSequence, int i) {
        try {
            if (MATCHING_BRACKETS.matcher(charSequence).matches()) {
                if (!PUB_PAGES.matcher(charSequence).find()) {
                    if (this.leniency.compareTo(Leniency.VALID) >= 0) {
                        if (i > 0 && !LEAD_CLASS.matcher(charSequence).lookingAt()) {
                            char charAt = this.text.charAt(i - 1);
                            if (isInvalidPunctuationSymbol(charAt) || isLatinLetter(charAt)) {
                                return null;
                            }
                        }
                        int length = charSequence.length() + i;
                        if (length < this.text.length()) {
                            char charAt2 = this.text.charAt(length);
                            if (isInvalidPunctuationSymbol(charAt2) || isLatinLetter(charAt2)) {
                                return null;
                            }
                        }
                    }
                    PhoneNumber parseAndKeepRawInput = this.phoneUtil.parseAndKeepRawInput(charSequence, this.preferredRegion);
                    if ((!this.phoneUtil.getRegionCodeForCountryCode(parseAndKeepRawInput.getCountryCode()).equals("IL") || this.phoneUtil.getNationalSignificantNumber(parseAndKeepRawInput).length() != 4 || (i != 0 && (i <= 0 || this.text.charAt(i - 1) == '*'))) && this.leniency.verify(parseAndKeepRawInput, charSequence, this.phoneUtil)) {
                        parseAndKeepRawInput.clearCountryCodeSource();
                        parseAndKeepRawInput.clearRawInput();
                        parseAndKeepRawInput.clearPreferredDomesticCarrierCode();
                        return new PhoneNumberMatch(i, charSequence.toString(), parseAndKeepRawInput);
                    }
                    return null;
                }
            }
            return null;
        } catch (NumberParseException unused) {
        }
    }

    private static String[] getNationalNumberGroups(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, NumberFormat numberFormat) {
        if (numberFormat != null) {
            return phoneNumberUtil.formatNsnUsingPattern(phoneNumberUtil.getNationalSignificantNumber(phoneNumber), numberFormat, PhoneNumberFormat.RFC3966).split("-");
        }
        String format = phoneNumberUtil.format(phoneNumber, PhoneNumberFormat.RFC3966);
        int indexOf = format.indexOf(59);
        if (indexOf < 0) {
            indexOf = format.length();
        }
        return format.substring(format.indexOf(45) + 1, indexOf).split("-");
    }

    static boolean containsOnlyValidXChars(PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
        int i = 0;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt == 'X') {
                int i2 = i + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'x' || charAt2 == 'X') {
                    if (phoneNumberUtil.isNumberMatch(phoneNumber, (CharSequence) str.substring(i2)) != MatchType.NSN_MATCH) {
                        return false;
                    }
                    i = i2;
                } else if (!PhoneNumberUtil.normalizeDigitsOnly(str.substring(i)).equals(phoneNumber.getExtension())) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    static boolean checkNumberGroupingIsValid(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, NumberGroupingChecker numberGroupingChecker) {
        StringBuilder normalizeDigits = PhoneNumberUtil.normalizeDigits(charSequence, true);
        if (numberGroupingChecker.checkGroups(phoneNumberUtil, phoneNumber, normalizeDigits, getNationalNumberGroups(phoneNumberUtil, phoneNumber, null))) {
            return true;
        }
        PhoneMetadata alternateFormatsForCountry = MetadataManager.getAlternateFormatsForCountry(phoneNumber.getCountryCode());
        if (alternateFormatsForCountry != null) {
            for (NumberFormat nationalNumberGroups : alternateFormatsForCountry.numberFormats()) {
                if (numberGroupingChecker.checkGroups(phoneNumberUtil, phoneNumber, normalizeDigits, getNationalNumberGroups(phoneNumberUtil, phoneNumber, nationalNumberGroups))) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean allNumberGroupsAreExactlyPresent(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
        int i;
        String[] split = PhoneNumberUtil.NON_DIGITS_PATTERN.split(sb.toString());
        if (phoneNumber.hasExtension()) {
            i = split.length - 2;
        } else {
            i = split.length - 1;
        }
        if (split.length == 1 || split[i].contains(phoneNumberUtil.getNationalSignificantNumber(phoneNumber))) {
            return true;
        }
        int length = strArr.length - 1;
        while (length > 0 && i >= 0) {
            if (!split[i].equals(strArr[length])) {
                return false;
            }
            length--;
            i--;
        }
        if (i < 0 || !split[i].endsWith(strArr[0])) {
            return false;
        }
        return true;
    }

    static boolean allNumberGroupsRemainGrouped(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
        int i;
        if (phoneNumber.getCountryCodeSource() != CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            String num = Integer.toString(phoneNumber.getCountryCode());
            i = num.length() + sb.indexOf(num);
        } else {
            i = 0;
        }
        int i2 = i;
        int i3 = 0;
        while (i3 < strArr.length) {
            int indexOf = sb.indexOf(strArr[i3], i2);
            if (indexOf < 0) {
                return false;
            }
            i2 = indexOf + strArr[i3].length();
            if (i3 != 0 || i2 >= sb.length() || phoneNumberUtil.getNddPrefixForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumber.getCountryCode()), true) == null || !Character.isDigit(sb.charAt(i2))) {
                i3++;
            } else {
                return sb.substring(i2 - strArr[i3].length()).startsWith(phoneNumberUtil.getNationalSignificantNumber(phoneNumber));
            }
        }
        return sb.substring(i2).contains(phoneNumber.getExtension());
    }

    PhoneNumberMatcher(PhoneNumberUtil phoneNumberUtil, CharSequence charSequence, String str, Leniency leniency2, long j) {
        if (phoneNumberUtil == null || leniency2 == null) {
            throw new NullPointerException();
        } else if (j >= 0) {
            this.phoneUtil = phoneNumberUtil;
            if (charSequence == null) {
                charSequence = "";
            }
            this.text = charSequence;
            this.preferredRegion = str;
            this.leniency = leniency2;
            this.maxTries = j;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
