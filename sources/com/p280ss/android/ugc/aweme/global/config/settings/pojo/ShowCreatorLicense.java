package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShowCreatorLicense */
public final class ShowCreatorLicense extends Message<ShowCreatorLicense, Builder> {
    public static final DefaultValueProtoAdapter<ShowCreatorLicense> ADAPTER = new ProtoAdapter_ShowCreatorLicense();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 9)
    public final Integer click_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String popup_content;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer popup_interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String popup_linkText;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String popup_msg;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer popup_times_limit;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String popup_title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String popup_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer show;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShowCreatorLicense$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ShowCreatorLicense, Builder> {
        public Integer click_type;
        public String popup_content;
        public Integer popup_interval;
        public String popup_linkText;
        public String popup_msg;
        public Integer popup_times_limit;
        public String popup_title;
        public String popup_url;
        public Integer show;

        public final ShowCreatorLicense build() {
            ShowCreatorLicense showCreatorLicense = new ShowCreatorLicense(this.show, this.popup_times_limit, this.popup_interval, this.popup_title, this.popup_msg, this.popup_content, this.popup_linkText, this.popup_url, this.click_type, super.buildUnknownFields());
            return showCreatorLicense;
        }

        public final Builder click_type(Integer num) {
            this.click_type = num;
            return this;
        }

        public final Builder popup_content(String str) {
            this.popup_content = str;
            return this;
        }

        public final Builder popup_interval(Integer num) {
            this.popup_interval = num;
            return this;
        }

        public final Builder popup_linkText(String str) {
            this.popup_linkText = str;
            return this;
        }

        public final Builder popup_msg(String str) {
            this.popup_msg = str;
            return this;
        }

        public final Builder popup_times_limit(Integer num) {
            this.popup_times_limit = num;
            return this;
        }

        public final Builder popup_title(String str) {
            this.popup_title = str;
            return this;
        }

        public final Builder popup_url(String str) {
            this.popup_url = str;
            return this;
        }

        public final Builder show(Integer num) {
            this.show = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShowCreatorLicense$ProtoAdapter_ShowCreatorLicense */
    static final class ProtoAdapter_ShowCreatorLicense extends DefaultValueProtoAdapter<ShowCreatorLicense> {
        public final ShowCreatorLicense redact(ShowCreatorLicense showCreatorLicense) {
            return showCreatorLicense;
        }

        public ProtoAdapter_ShowCreatorLicense() {
            super(FieldEncoding.LENGTH_DELIMITED, ShowCreatorLicense.class);
        }

        public final ShowCreatorLicense decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ShowCreatorLicense) null);
        }

        public final int encodedSize(ShowCreatorLicense showCreatorLicense) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, showCreatorLicense.show) + ProtoAdapter.INT32.encodedSizeWithTag(2, showCreatorLicense.popup_times_limit) + ProtoAdapter.INT32.encodedSizeWithTag(3, showCreatorLicense.popup_interval) + ProtoAdapter.STRING.encodedSizeWithTag(4, showCreatorLicense.popup_title) + ProtoAdapter.STRING.encodedSizeWithTag(5, showCreatorLicense.popup_msg) + ProtoAdapter.STRING.encodedSizeWithTag(6, showCreatorLicense.popup_content) + ProtoAdapter.STRING.encodedSizeWithTag(7, showCreatorLicense.popup_linkText) + ProtoAdapter.STRING.encodedSizeWithTag(8, showCreatorLicense.popup_url) + ProtoAdapter.INT32.encodedSizeWithTag(9, showCreatorLicense.click_type) + showCreatorLicense.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ShowCreatorLicense showCreatorLicense) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, showCreatorLicense.show);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, showCreatorLicense.popup_times_limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, showCreatorLicense.popup_interval);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, showCreatorLicense.popup_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, showCreatorLicense.popup_msg);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, showCreatorLicense.popup_content);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, showCreatorLicense.popup_linkText);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, showCreatorLicense.popup_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, showCreatorLicense.click_type);
            protoWriter.writeBytes(showCreatorLicense.unknownFields());
        }

        public final ShowCreatorLicense decode(ProtoReader protoReader, ShowCreatorLicense showCreatorLicense) throws IOException {
            Builder builder;
            ShowCreatorLicense showCreatorLicense2 = (ShowCreatorLicense) C10938a.m32097a().mo26425a(ShowCreatorLicense.class, showCreatorLicense);
            if (showCreatorLicense2 != null) {
                builder = showCreatorLicense2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.show((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.popup_times_limit((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.popup_interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.popup_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.popup_msg((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.popup_content((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.popup_linkText((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.popup_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.click_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (showCreatorLicense2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Integer getClickType() throws NullValueException {
        if (this.click_type != null) {
            return this.click_type;
        }
        throw new NullValueException();
    }

    public final String getPopupContent() throws NullValueException {
        if (this.popup_content != null) {
            return this.popup_content;
        }
        throw new NullValueException();
    }

    public final Integer getPopupInterval() throws NullValueException {
        if (this.popup_interval != null) {
            return this.popup_interval;
        }
        throw new NullValueException();
    }

    public final String getPopupLinkText() throws NullValueException {
        if (this.popup_linkText != null) {
            return this.popup_linkText;
        }
        throw new NullValueException();
    }

    public final String getPopupMsg() throws NullValueException {
        if (this.popup_msg != null) {
            return this.popup_msg;
        }
        throw new NullValueException();
    }

    public final Integer getPopupTimesLimit() throws NullValueException {
        if (this.popup_times_limit != null) {
            return this.popup_times_limit;
        }
        throw new NullValueException();
    }

    public final String getPopupTitle() throws NullValueException {
        if (this.popup_title != null) {
            return this.popup_title;
        }
        throw new NullValueException();
    }

    public final String getPopupUrl() throws NullValueException {
        if (this.popup_url != null) {
            return this.popup_url;
        }
        throw new NullValueException();
    }

    public final Integer getShow() throws NullValueException {
        if (this.show != null) {
            return this.show;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.show = this.show;
        builder.popup_times_limit = this.popup_times_limit;
        builder.popup_interval = this.popup_interval;
        builder.popup_title = this.popup_title;
        builder.popup_msg = this.popup_msg;
        builder.popup_content = this.popup_content;
        builder.popup_linkText = this.popup_linkText;
        builder.popup_url = this.popup_url;
        builder.click_type = this.click_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.hashCode;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i10 = 0;
        if (this.show != null) {
            i = this.show.hashCode();
        } else {
            i = 0;
        }
        int i11 = (hashCode + i) * 37;
        if (this.popup_times_limit != null) {
            i2 = this.popup_times_limit.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 37;
        if (this.popup_interval != null) {
            i3 = this.popup_interval.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 37;
        if (this.popup_title != null) {
            i4 = this.popup_title.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 37;
        if (this.popup_msg != null) {
            i5 = this.popup_msg.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 37;
        if (this.popup_content != null) {
            i6 = this.popup_content.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 37;
        if (this.popup_linkText != null) {
            i7 = this.popup_linkText.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 37;
        if (this.popup_url != null) {
            i8 = this.popup_url.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 37;
        if (this.click_type != null) {
            i10 = this.click_type.hashCode();
        }
        int i19 = i18 + i10;
        this.hashCode = i19;
        return i19;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show != null) {
            sb.append(", show=");
            sb.append(this.show);
        }
        if (this.popup_times_limit != null) {
            sb.append(", popup_times_limit=");
            sb.append(this.popup_times_limit);
        }
        if (this.popup_interval != null) {
            sb.append(", popup_interval=");
            sb.append(this.popup_interval);
        }
        if (this.popup_title != null) {
            sb.append(", popup_title=");
            sb.append(this.popup_title);
        }
        if (this.popup_msg != null) {
            sb.append(", popup_msg=");
            sb.append(this.popup_msg);
        }
        if (this.popup_content != null) {
            sb.append(", popup_content=");
            sb.append(this.popup_content);
        }
        if (this.popup_linkText != null) {
            sb.append(", popup_linkText=");
            sb.append(this.popup_linkText);
        }
        if (this.popup_url != null) {
            sb.append(", popup_url=");
            sb.append(this.popup_url);
        }
        if (this.click_type != null) {
            sb.append(", click_type=");
            sb.append(this.click_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ShowCreatorLicense{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShowCreatorLicense)) {
            return false;
        }
        ShowCreatorLicense showCreatorLicense = (ShowCreatorLicense) obj;
        if (!unknownFields().equals(showCreatorLicense.unknownFields()) || !Internal.equals(this.show, showCreatorLicense.show) || !Internal.equals(this.popup_times_limit, showCreatorLicense.popup_times_limit) || !Internal.equals(this.popup_interval, showCreatorLicense.popup_interval) || !Internal.equals(this.popup_title, showCreatorLicense.popup_title) || !Internal.equals(this.popup_msg, showCreatorLicense.popup_msg) || !Internal.equals(this.popup_content, showCreatorLicense.popup_content) || !Internal.equals(this.popup_linkText, showCreatorLicense.popup_linkText) || !Internal.equals(this.popup_url, showCreatorLicense.popup_url) || !Internal.equals(this.click_type, showCreatorLicense.click_type)) {
            return false;
        }
        return true;
    }

    public ShowCreatorLicense(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, Integer num4) {
        this(num, num2, num3, str, str2, str3, str4, str5, num4, ByteString.EMPTY);
    }

    public ShowCreatorLicense(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show = num;
        this.popup_times_limit = num2;
        this.popup_interval = num3;
        this.popup_title = str;
        this.popup_msg = str2;
        this.popup_content = str3;
        this.popup_linkText = str4;
        this.popup_url = str5;
        this.click_type = num4;
    }
}
