package fakturowniaAPI;

/**
 * Created by Adam on 18.04.2017.
 */


        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Invoice {


    //region VARIABLES
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("app")
    @Expose
    private Object app;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("sell_date")
    @Expose
    private String sellDate;
    @SerializedName("payment_type")
    @Expose
    private String paymentType;
    @SerializedName("price_net")
    @Expose
    private String priceNet;
    @SerializedName("price_gross")
    @Expose
    private String priceGross;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("seller_name")
    @Expose
    private String sellerName;
    @SerializedName("seller_tax_no")
    @Expose
    private String sellerTaxNo;
    @SerializedName("seller_street")
    @Expose
    private String sellerStreet;
    @SerializedName("seller_post_code")
    @Expose
    private String sellerPostCode;
    @SerializedName("seller_city")
    @Expose
    private String sellerCity;
    @SerializedName("seller_country")
    @Expose
    private String sellerCountry;
    @SerializedName("seller_email")
    @Expose
    private String sellerEmail;
    @SerializedName("seller_phone")
    @Expose
    private String sellerPhone;
    @SerializedName("seller_fax")
    @Expose
    private String sellerFax;
    @SerializedName("seller_www")
    @Expose
    private String sellerWww;
    @SerializedName("seller_person")
    @Expose
    private String sellerPerson;
    @SerializedName("seller_bank")
    @Expose
    private String sellerBank;
    @SerializedName("seller_bank_account")
    @Expose
    private String sellerBankAccount;
    @SerializedName("buyer_name")
    @Expose
    private String buyerName;
    @SerializedName("buyer_tax_no")
    @Expose
    private String buyerTaxNo;
    @SerializedName("buyer_post_code")
    @Expose
    private String buyerPostCode;
    @SerializedName("buyer_city")
    @Expose
    private String buyerCity;
    @SerializedName("buyer_street")
    @Expose
    private String buyerStreet;
    @SerializedName("buyer_first_name")
    @Expose
    private Object buyerFirstName;
    @SerializedName("buyer_country")
    @Expose
    private String buyerCountry;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("buyer_email")
    @Expose
    private String buyerEmail;
    @SerializedName("buyer_www")
    @Expose
    private Object buyerWww;
    @SerializedName("buyer_fax")
    @Expose
    private Object buyerFax;
    @SerializedName("buyer_phone")
    @Expose
    private String buyerPhone;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("pattern")
    @Expose
    private String pattern;
    @SerializedName("pattern_nr")
    @Expose
    private Object patternNr;
    @SerializedName("pattern_nr_m")
    @Expose
    private Integer patternNrM;
    @SerializedName("pattern_nr_d")
    @Expose
    private Object patternNrD;
    @SerializedName("client_id")
    @Expose
    private Integer clientId;
    @SerializedName("payment_to")
    @Expose
    private String paymentTo;
    @SerializedName("paid")
    @Expose
    private String paid;
    @SerializedName("seller_bank_account_id")
    @Expose
    private Object sellerBankAccountId;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("issue_date")
    @Expose
    private String issueDate;
    @SerializedName("price_tax")
    @Expose
    private String priceTax;
    @SerializedName("department_id")
    @Expose
    private Integer departmentId;
    @SerializedName("correction")
    @Expose
    private Object correction;
    @SerializedName("buyer_note")
    @Expose
    private String buyerNote;
    @SerializedName("additional_info_desc")
    @Expose
    private String additionalInfoDesc;
    @SerializedName("additional_info")
    @Expose
    private Boolean additionalInfo;
    @SerializedName("product_cache")
    @Expose
    private String productCache;
    @SerializedName("buyer_last_name")
    @Expose
    private Object buyerLastName;
    @SerializedName("from_invoice_id")
    @Expose
    private Object fromInvoiceId;
    @SerializedName("oid")
    @Expose
    private String oid;
    @SerializedName("discount")
    @Expose
    private String discount;
    @SerializedName("show_discount")
    @Expose
    private Boolean showDiscount;
    @SerializedName("sent_time")
    @Expose
    private Object sentTime;
    @SerializedName("print_time")
    @Expose
    private Object printTime;
    @SerializedName("recurring_id")
    @Expose
    private Object recurringId;
    @SerializedName("tax2_visible")
    @Expose
    private Boolean tax2Visible;
    @SerializedName("warehouse_id")
    @Expose
    private Object warehouseId;
    @SerializedName("paid_date")
    @Expose
    private Object paidDate;
    @SerializedName("product_id")
    @Expose
    private Object productId;
    @SerializedName("issue_year")
    @Expose
    private Integer issueYear;
    @SerializedName("internal_note")
    @Expose
    private String internalNote;
    @SerializedName("invoice_id")
    @Expose
    private Object invoiceId;
    @SerializedName("invoice_template_id")
    @Expose
    private Integer invoiceTemplateId;
    @SerializedName("description_long")
    @Expose
    private String descriptionLong;
    @SerializedName("buyer_tax_no_kind")
    @Expose
    private Object buyerTaxNoKind;
    @SerializedName("seller_tax_no_kind")
    @Expose
    private Object sellerTaxNoKind;
    @SerializedName("description_footer")
    @Expose
    private String descriptionFooter;
    @SerializedName("sell_date_kind")
    @Expose
    private Object sellDateKind;
    @SerializedName("payment_to_kind")
    @Expose
    private String paymentToKind;
    @SerializedName("exchange_currency")
    @Expose
    private Object exchangeCurrency;
    @SerializedName("discount_kind")
    @Expose
    private String discountKind;
    @SerializedName("income")
    @Expose
    private Boolean income;
    @SerializedName("from_api")
    @Expose
    private Boolean fromApi;
    @SerializedName("category_id")
    @Expose
    private Object categoryId;
    @SerializedName("warehouse_document_id")
    @Expose
    private Object warehouseDocumentId;
    @SerializedName("exchange_kind")
    @Expose
    private String exchangeKind;
    @SerializedName("exchange_rate")
    @Expose
    private String exchangeRate;
    @SerializedName("use_delivery_address")
    @Expose
    private Boolean useDeliveryAddress;
    @SerializedName("delivery_address")
    @Expose
    private String deliveryAddress;
    @SerializedName("accounting_kind")
    @Expose
    private Object accountingKind;
    @SerializedName("buyer_person")
    @Expose
    private String buyerPerson;
    @SerializedName("buyer_bank_account")
    @Expose
    private Object buyerBankAccount;
    @SerializedName("buyer_bank")
    @Expose
    private Object buyerBank;
    @SerializedName("buyer_mass_payment_code")
    @Expose
    private Object buyerMassPaymentCode;
    @SerializedName("exchange_note")
    @Expose
    private String exchangeNote;
    @SerializedName("client_company")
    @Expose
    private Boolean clientCompany;
    @SerializedName("buyer_company")
    @Expose
    private Boolean buyerCompany;
    @SerializedName("show_attachments")
    @Expose
    private Boolean showAttachments;
    @SerializedName("exchange_currency_rate")
    @Expose
    private Object exchangeCurrencyRate;
    @SerializedName("has_attachments")
    @Expose
    private Boolean hasAttachments;
    @SerializedName("exchange_date")
    @Expose
    private Object exchangeDate;
    @SerializedName("attachments_count")
    @Expose
    private Integer attachmentsCount;
    @SerializedName("delivery_date")
    @Expose
    private String deliveryDate;
    @SerializedName("fiscal_status")
    @Expose
    private Object fiscalStatus;
    @SerializedName("use_moss")
    @Expose
    private Boolean useMoss;
    @SerializedName("transaction_date")
    @Expose
    private String transactionDate;
    @SerializedName("email_status")
    @Expose
    private Object emailStatus;
    @SerializedName("exclude_from_stock_level")
    @Expose
    private Boolean excludeFromStockLevel;
    @SerializedName("exclude_from_accounting")
    @Expose
    private Boolean excludeFromAccounting;
    @SerializedName("exchange_rate_den")
    @Expose
    private String exchangeRateDen;
    @SerializedName("exchange_currency_rate_den")
    @Expose
    private String exchangeCurrencyRateDen;
    @SerializedName("accounting_scheme")
    @Expose
    private Object accountingScheme;
    @SerializedName("exchange_difference")
    @Expose
    private String exchangeDifference;
    @SerializedName("not_cost")
    @Expose
    private Boolean notCost;
    @SerializedName("reverse_charge")
    @Expose
    private Boolean reverseCharge;
    @SerializedName("issuer")
    @Expose
    private Object issuer;
    @SerializedName("use_issuer")
    @Expose
    private Boolean useIssuer;
    @SerializedName("cancelled")
    @Expose
    private Boolean cancelled;
    @SerializedName("recipient_id")
    @Expose
    private Object recipientId;
    @SerializedName("recipient_name")
    @Expose
    private String recipientName;
    @SerializedName("sales_code")
    @Expose
    private String salesCode;

    //endregion


    //region GETTERS & SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Object getApp() {
        return app;
    }

    public void setApp(Object app) {
        this.app = app;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPriceNet() {
        return priceNet;
    }

    public void setPriceNet(String priceNet) {
        this.priceNet = priceNet;
    }

    public String getPriceGross() {
        return priceGross;
    }

    public void setPriceGross(String priceGross) {
        this.priceGross = priceGross;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerTaxNo() {
        return sellerTaxNo;
    }

    public void setSellerTaxNo(String sellerTaxNo) {
        this.sellerTaxNo = sellerTaxNo;
    }

    public String getSellerStreet() {
        return sellerStreet;
    }

    public void setSellerStreet(String sellerStreet) {
        this.sellerStreet = sellerStreet;
    }

    public String getSellerPostCode() {
        return sellerPostCode;
    }

    public void setSellerPostCode(String sellerPostCode) {
        this.sellerPostCode = sellerPostCode;
    }

    public String getSellerCity() {
        return sellerCity;
    }

    public void setSellerCity(String sellerCity) {
        this.sellerCity = sellerCity;
    }

    public String getSellerCountry() {
        return sellerCountry;
    }

    public void setSellerCountry(String sellerCountry) {
        this.sellerCountry = sellerCountry;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone;
    }

    public String getSellerFax() {
        return sellerFax;
    }

    public void setSellerFax(String sellerFax) {
        this.sellerFax = sellerFax;
    }

    public String getSellerWww() {
        return sellerWww;
    }

    public void setSellerWww(String sellerWww) {
        this.sellerWww = sellerWww;
    }

    public String getSellerPerson() {
        return sellerPerson;
    }

    public void setSellerPerson(String sellerPerson) {
        this.sellerPerson = sellerPerson;
    }

    public String getSellerBank() {
        return sellerBank;
    }

    public void setSellerBank(String sellerBank) {
        this.sellerBank = sellerBank;
    }

    public String getSellerBankAccount() {
        return sellerBankAccount;
    }

    public void setSellerBankAccount(String sellerBankAccount) {
        this.sellerBankAccount = sellerBankAccount;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerTaxNo() {
        return buyerTaxNo;
    }

    public void setBuyerTaxNo(String buyerTaxNo) {
        this.buyerTaxNo = buyerTaxNo;
    }

    public String getBuyerPostCode() {
        return buyerPostCode;
    }

    public void setBuyerPostCode(String buyerPostCode) {
        this.buyerPostCode = buyerPostCode;
    }

    public String getBuyerCity() {
        return buyerCity;
    }

    public void setBuyerCity(String buyerCity) {
        this.buyerCity = buyerCity;
    }

    public String getBuyerStreet() {
        return buyerStreet;
    }

    public void setBuyerStreet(String buyerStreet) {
        this.buyerStreet = buyerStreet;
    }

    public Object getBuyerFirstName() {
        return buyerFirstName;
    }

    public void setBuyerFirstName(Object buyerFirstName) {
        this.buyerFirstName = buyerFirstName;
    }

    public String getBuyerCountry() {
        return buyerCountry;
    }

    public void setBuyerCountry(String buyerCountry) {
        this.buyerCountry = buyerCountry;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public Object getBuyerWww() {
        return buyerWww;
    }

    public void setBuyerWww(Object buyerWww) {
        this.buyerWww = buyerWww;
    }

    public Object getBuyerFax() {
        return buyerFax;
    }

    public void setBuyerFax(Object buyerFax) {
        this.buyerFax = buyerFax;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Object getPatternNr() {
        return patternNr;
    }

    public void setPatternNr(Object patternNr) {
        this.patternNr = patternNr;
    }

    public Integer getPatternNrM() {
        return patternNrM;
    }

    public void setPatternNrM(Integer patternNrM) {
        this.patternNrM = patternNrM;
    }

    public Object getPatternNrD() {
        return patternNrD;
    }

    public void setPatternNrD(Object patternNrD) {
        this.patternNrD = patternNrD;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getPaymentTo() {
        return paymentTo;
    }

    public void setPaymentTo(String paymentTo) {
        this.paymentTo = paymentTo;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public Object getSellerBankAccountId() {
        return sellerBankAccountId;
    }

    public void setSellerBankAccountId(Object sellerBankAccountId) {
        this.sellerBankAccountId = sellerBankAccountId;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getPriceTax() {
        return priceTax;
    }

    public void setPriceTax(String priceTax) {
        this.priceTax = priceTax;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Object getCorrection() {
        return correction;
    }

    public void setCorrection(Object correction) {
        this.correction = correction;
    }

    public String getBuyerNote() {
        return buyerNote;
    }

    public void setBuyerNote(String buyerNote) {
        this.buyerNote = buyerNote;
    }

    public String getAdditionalInfoDesc() {
        return additionalInfoDesc;
    }

    public void setAdditionalInfoDesc(String additionalInfoDesc) {
        this.additionalInfoDesc = additionalInfoDesc;
    }

    public Boolean isAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Boolean additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getProductCache() {
        return productCache;
    }

    public void setProductCache(String productCache) {
        this.productCache = productCache;
    }

    public Object getBuyerLastName() {
        return buyerLastName;
    }

    public void setBuyerLastName(Object buyerLastName) {
        this.buyerLastName = buyerLastName;
    }

    public Object getFromInvoiceId() {
        return fromInvoiceId;
    }

    public void setFromInvoiceId(Object fromInvoiceId) {
        this.fromInvoiceId = fromInvoiceId;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Boolean isShowDiscount() {
        return showDiscount;
    }

    public void setShowDiscount(Boolean showDiscount) {
        this.showDiscount = showDiscount;
    }

    public Object getSentTime() {
        return sentTime;
    }

    public void setSentTime(Object sentTime) {
        this.sentTime = sentTime;
    }

    public Object getPrintTime() {
        return printTime;
    }

    public void setPrintTime(Object printTime) {
        this.printTime = printTime;
    }

    public Object getRecurringId() {
        return recurringId;
    }

    public void setRecurringId(Object recurringId) {
        this.recurringId = recurringId;
    }

    public Boolean isTax2Visible() {
        return tax2Visible;
    }

    public void setTax2Visible(Boolean tax2Visible) {
        this.tax2Visible = tax2Visible;
    }

    public Object getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Object warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Object getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Object paidDate) {
        this.paidDate = paidDate;
    }

    public Object getProductId() {
        return productId;
    }

    public void setProductId(Object productId) {
        this.productId = productId;
    }

    public Integer getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(Integer issueYear) {
        this.issueYear = issueYear;
    }

    public String getInternalNote() {
        return internalNote;
    }

    public void setInternalNote(String internalNote) {
        this.internalNote = internalNote;
    }

    public Object getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Object invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getInvoiceTemplateId() {
        return invoiceTemplateId;
    }

    public void setInvoiceTemplateId(Integer invoiceTemplateId) {
        this.invoiceTemplateId = invoiceTemplateId;
    }

    public String getDescriptionLong() {
        return descriptionLong;
    }

    public void setDescriptionLong(String descriptionLong) {
        this.descriptionLong = descriptionLong;
    }

    public Object getBuyerTaxNoKind() {
        return buyerTaxNoKind;
    }

    public void setBuyerTaxNoKind(Object buyerTaxNoKind) {
        this.buyerTaxNoKind = buyerTaxNoKind;
    }

    public Object getSellerTaxNoKind() {
        return sellerTaxNoKind;
    }

    public void setSellerTaxNoKind(Object sellerTaxNoKind) {
        this.sellerTaxNoKind = sellerTaxNoKind;
    }

    public String getDescriptionFooter() {
        return descriptionFooter;
    }

    public void setDescriptionFooter(String descriptionFooter) {
        this.descriptionFooter = descriptionFooter;
    }

    public Object getSellDateKind() {
        return sellDateKind;
    }

    public void setSellDateKind(Object sellDateKind) {
        this.sellDateKind = sellDateKind;
    }

    public String getPaymentToKind() {
        return paymentToKind;
    }

    public void setPaymentToKind(String paymentToKind) {
        this.paymentToKind = paymentToKind;
    }

    public Object getExchangeCurrency() {
        return exchangeCurrency;
    }

    public void setExchangeCurrency(Object exchangeCurrency) {
        this.exchangeCurrency = exchangeCurrency;
    }

    public String getDiscountKind() {
        return discountKind;
    }

    public void setDiscountKind(String discountKind) {
        this.discountKind = discountKind;
    }

    public Boolean isIncome() {
        return income;
    }

    public void setIncome(Boolean income) {
        this.income = income;
    }

    public Boolean isFromApi() {
        return fromApi;
    }

    public void setFromApi(Boolean fromApi) {
        this.fromApi = fromApi;
    }

    public Object getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
    }

    public Object getWarehouseDocumentId() {
        return warehouseDocumentId;
    }

    public void setWarehouseDocumentId(Object warehouseDocumentId) {
        this.warehouseDocumentId = warehouseDocumentId;
    }

    public String getExchangeKind() {
        return exchangeKind;
    }

    public void setExchangeKind(String exchangeKind) {
        this.exchangeKind = exchangeKind;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Boolean isUseDeliveryAddress() {
        return useDeliveryAddress;
    }

    public void setUseDeliveryAddress(Boolean useDeliveryAddress) {
        this.useDeliveryAddress = useDeliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Object getAccountingKind() {
        return accountingKind;
    }

    public void setAccountingKind(Object accountingKind) {
        this.accountingKind = accountingKind;
    }

    public String getBuyerPerson() {
        return buyerPerson;
    }

    public void setBuyerPerson(String buyerPerson) {
        this.buyerPerson = buyerPerson;
    }

    public Object getBuyerBankAccount() {
        return buyerBankAccount;
    }

    public void setBuyerBankAccount(Object buyerBankAccount) {
        this.buyerBankAccount = buyerBankAccount;
    }

    public Object getBuyerBank() {
        return buyerBank;
    }

    public void setBuyerBank(Object buyerBank) {
        this.buyerBank = buyerBank;
    }

    public Object getBuyerMassPaymentCode() {
        return buyerMassPaymentCode;
    }

    public void setBuyerMassPaymentCode(Object buyerMassPaymentCode) {
        this.buyerMassPaymentCode = buyerMassPaymentCode;
    }

    public String getExchangeNote() {
        return exchangeNote;
    }

    public void setExchangeNote(String exchangeNote) {
        this.exchangeNote = exchangeNote;
    }

    public Boolean isClientCompany() {
        return clientCompany;
    }

    public void setClientCompany(Boolean clientCompany) {
        this.clientCompany = clientCompany;
    }

    public Boolean isBuyerCompany() {
        return buyerCompany;
    }

    public void setBuyerCompany(Boolean buyerCompany) {
        this.buyerCompany = buyerCompany;
    }

    public Boolean isShowAttachments() {
        return showAttachments;
    }

    public void setShowAttachments(Boolean showAttachments) {
        this.showAttachments = showAttachments;
    }

    public Object getExchangeCurrencyRate() {
        return exchangeCurrencyRate;
    }

    public void setExchangeCurrencyRate(Object exchangeCurrencyRate) {
        this.exchangeCurrencyRate = exchangeCurrencyRate;
    }

    public Boolean isHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(Boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public Object getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(Object exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    public Integer getAttachmentsCount() {
        return attachmentsCount;
    }

    public void setAttachmentsCount(Integer attachmentsCount) {
        this.attachmentsCount = attachmentsCount;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Object getFiscalStatus() {
        return fiscalStatus;
    }

    public void setFiscalStatus(Object fiscalStatus) {
        this.fiscalStatus = fiscalStatus;
    }

    public Boolean isUseMoss() {
        return useMoss;
    }

    public void setUseMoss(Boolean useMoss) {
        this.useMoss = useMoss;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Object getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(Object emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Boolean isExcludeFromStockLevel() {
        return excludeFromStockLevel;
    }

    public void setExcludeFromStockLevel(Boolean excludeFromStockLevel) {
        this.excludeFromStockLevel = excludeFromStockLevel;
    }

    public Boolean isExcludeFromAccounting() {
        return excludeFromAccounting;
    }

    public void setExcludeFromAccounting(Boolean excludeFromAccounting) {
        this.excludeFromAccounting = excludeFromAccounting;
    }

    public String getExchangeRateDen() {
        return exchangeRateDen;
    }

    public void setExchangeRateDen(String exchangeRateDen) {
        this.exchangeRateDen = exchangeRateDen;
    }

    public String getExchangeCurrencyRateDen() {
        return exchangeCurrencyRateDen;
    }

    public void setExchangeCurrencyRateDen(String exchangeCurrencyRateDen) {
        this.exchangeCurrencyRateDen = exchangeCurrencyRateDen;
    }

    public Object getAccountingScheme() {
        return accountingScheme;
    }

    public void setAccountingScheme(Object accountingScheme) {
        this.accountingScheme = accountingScheme;
    }

    public String getExchangeDifference() {
        return exchangeDifference;
    }

    public void setExchangeDifference(String exchangeDifference) {
        this.exchangeDifference = exchangeDifference;
    }

    public Boolean isNotCost() {
        return notCost;
    }

    public void setNotCost(Boolean notCost) {
        this.notCost = notCost;
    }

    public Boolean isReverseCharge() {
        return reverseCharge;
    }

    public void setReverseCharge(Boolean reverseCharge) {
        this.reverseCharge = reverseCharge;
    }

    public Object getIssuer() {
        return issuer;
    }

    public void setIssuer(Object issuer) {
        this.issuer = issuer;
    }

    public Boolean isUseIssuer() {
        return useIssuer;
    }

    public void setUseIssuer(Boolean useIssuer) {
        this.useIssuer = useIssuer;
    }

    public Boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Object getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Object recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getSalesCode() {
        return salesCode;
    }

    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode;
    }

    //endregion



    @Override
    public String toString()
    {
        return "ClassPojo [seller_tax_no = "+sellerTaxNo+
                ", invoice_template_id = "+invoiceTemplateId+
                ", buyer_tax_no = "+buyerTaxNo+
                ", product_id = "+productId+
                ", exclude_from_stock_level = "+excludeFromStockLevel+
                ", recurring_id = "+recurringId+
                ", buyer_company = "+buyerCompany+
                ", transaction_date = "+transactionDate+
                ", price_gross = "+priceGross+
                ", recipient_name = "+recipientName+
                ", sell_date = "+sellDate+
                ", sales_code = "+salesCode+
                ", income = "+income+
                ", buyer_note = "+buyerNote+
                ", place = "+place+
                ", additional_info_desc = "+additionalInfoDesc+
                ", description_long = "+descriptionLong+
                ", use_delivery_address = "+useDeliveryAddress+
                ", pattern_nr_m = "+patternNrM+
                ", seller_phone = "+sellerPhone+
                ", cancelled = "+cancelled+
                ", sent_time = "+sentTime+
                ", number = "+number+
                ", sell_date_kind = "+sellDateKind+
                ", buyer_bank = "+buyerBank+
                ", discount = "+discount+
                ", payment_to_kind = "+paymentToKind+
                ", buyer_bank_account = "+buyerBankAccount+
                ", seller_fax = "+sellerFax+
                ", delivery_date = "+deliveryDate+
                ", invoice_id = "+invoiceId+
                ", buyer_first_name = "+buyerFirstName+
                ", exclude_from_accounting = "+excludeFromAccounting+
                ", client_company = "+clientCompany+
                ", department_id = "+departmentId+
                ", seller_post_code = "+sellerPostCode+
                ", seller_bank = "+sellerBank+
                ", kind = "+kind+
                ", currency = "+currency+
                ", paid = "+paid +
                ", exchange_difference = "+exchangeDifference+
                ", buyer_street = "+buyerStreet+
                ", token = "+token+
                ", oid = "+oid+
                ", seller_bank_account = "+sellerBankAccount+
                ", seller_www = "+sellerWww+", app = "+app+
                ", exchange_rate = "+exchangeRate+
                ", exchange_note = "+exchangeNote+
                ", additional_info = "+additionalInfo+
                ", seller_city = "+sellerCity+
                ", seller_person = "+sellerPerson+
                ", buyer_name = "+buyerName+
                ", issue_date = "+issueDate+
                ", discount_kind = "+discountKind+
                ", seller_street = "+sellerStreet+
                ", tax2_visible = "+tax2Visible+
                ", buyer_mass_payment_code = "+buyerMassPaymentCode+
                ", reverse_charge = "+reverseCharge+
                ", pattern = "+pattern+
                ", attachments_count = "+attachmentsCount+
                ", seller_country = "+sellerCountry+
                ", seller_email = "+sellerEmail+
                ", exchange_date = "+exchangeDate+
                ", exchange_currency_rate = "+exchangeCurrencyRate+
                ", payment_type = "+paymentType+
                ", seller_name = "+sellerName+
                ", accounting_kind = "+accountingKind+
                ", buyer_fax = "+buyerFax+
                ", description_footer = "+descriptionFooter+
                ", seller_bank_account_id = "+sellerBankAccountId+
                ", accounting_scheme = "+accountingScheme+
                ", buyer_country = "+buyerCountry+
                ", from_invoice_id = "+fromInvoiceId+
                ", description = "+description+
                ", print_time = "+printTime+
                ", client_id = "+clientId+
                ", internal_note = "+internalNote+
                ", show_discount = "+showDiscount+
                ", seller_tax_no_kind = "+sellerTaxNoKind+
                ", from_api = "+fromApi+
                ", warehouse_document_id = "+warehouseDocumentId+
                ", buyer_city = "+buyerCity+
                ", exchange_rate_den = "+exchangeRateDen+
                ", status = "+status+
                ", warehouse_id = "+warehouseId+
                ", exchange_currency_rate_den = "+exchangeCurrencyRateDen+
                ", issue_year = "+issueYear+
                ", delivery_address = "+deliveryAddress+
                ", product_cache = "+productCache+
                ", category_id = "+categoryId+
                ", has_attachments = "+hasAttachments+
                ", updated_at = "+updatedAt+
                ", issuer = "+issuer+
                ", exchange_currency = "+exchangeCurrency+
                ", use_moss = "+useMoss+
                ", use_issuer = "+useIssuer+
                ", paid_date = "+paidDate+
                ", exchange_kind = "+exchangeKind+
                ", recipient_id = "+recipientId+
                ", correction = "+correction+
                ", buyer_last_name = "+buyerLastName+
                ", fiscal_status = "+fiscalStatus+
                ", lang = "+lang+
                ", id = "+id+
                ", buyer_phone = "+buyerPhone+
                ", buyer_email = "+buyerEmail+
                ", buyer_tax_no_kind = "+buyerTaxNoKind+
                ", created_at = "+createdAt+
                ", user_id = "+userId+
                ", price_tax = "+priceTax+
                ", buyer_person = "+buyerPerson+
                ", pattern_nr_d = "+patternNrD+
                ", buyer_post_code = "+buyerPostCode+
                ", email_status = "+emailStatus+
                ", show_attachments = "+showAttachments+
                ", buyer_www = "+buyerWww+
                ", price_net = "+priceNet+
                ", payment_to = "+paymentTo+
                ", not_cost = "+notCost+
                ", pattern_nr = "+patternNr+"]";
    }
}


