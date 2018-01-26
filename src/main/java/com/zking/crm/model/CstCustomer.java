package com.zking.crm.model;

//客户信息表
public class CstCustomer {
    private String custNo;//客户编号

    private String custName;//客户名称

    private String custRegion;//地区数据字典

    private Long custManagerId;//客户经理ID 默认0

    private String custManagerName;//客户经理名字

    private Integer custLevel;//客户级别

    private String custLevelLabel;//客户级别标志

    private Integer custSatisfy;//客户满意度

    private Integer custCredit;//客户信用度

    private String custAddr;//地址

    private String custZip;//邮编

    private String custTel;//电话

    private String custFax;//传真

    private String custWebsite;//网站

    private String custLicenceNo;//营业执照注册号

    private String custChieftain;//法人

    private Long custBankroll;//注册资金

    private Long custTurnover;//年营业额

    private String custBank;//开户银行

    private String custBankAccount;//银行账号

    private String custLocalTaxNo;//地税登记号

    private String custNationalTaxNo;//国税登记号

    private String custStatus;//客户状态 0 正常  1 客户流失

    public CstCustomer(String custNo, String custName, String custRegion, Long custManagerId, String custManagerName, Integer custLevel, String custLevelLabel, Integer custSatisfy, Integer custCredit, String custAddr, String custZip, String custTel, String custFax, String custWebsite, String custLicenceNo, String custChieftain, Long custBankroll, Long custTurnover, String custBank, String custBankAccount, String custLocalTaxNo, String custNationalTaxNo, String custStatus) {
        this.custNo = custNo;
        this.custName = custName;
        this.custRegion = custRegion;
        this.custManagerId = custManagerId;
        this.custManagerName = custManagerName;
        this.custLevel = custLevel;
        this.custLevelLabel = custLevelLabel;
        this.custSatisfy = custSatisfy;
        this.custCredit = custCredit;
        this.custAddr = custAddr;
        this.custZip = custZip;
        this.custTel = custTel;
        this.custFax = custFax;
        this.custWebsite = custWebsite;
        this.custLicenceNo = custLicenceNo;
        this.custChieftain = custChieftain;
        this.custBankroll = custBankroll;
        this.custTurnover = custTurnover;
        this.custBank = custBank;
        this.custBankAccount = custBankAccount;
        this.custLocalTaxNo = custLocalTaxNo;
        this.custNationalTaxNo = custNationalTaxNo;
        this.custStatus = custStatus;
    }

    public CstCustomer() {
        super();
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustRegion() {
        return custRegion;
    }

    public void setCustRegion(String custRegion) {
        this.custRegion = custRegion;
    }

    public Long getCustManagerId() {
        return custManagerId;
    }

    public void setCustManagerId(Long custManagerId) {
        this.custManagerId = custManagerId;
    }

    public String getCustManagerName() {
        return custManagerName;
    }

    public void setCustManagerName(String custManagerName) {
        this.custManagerName = custManagerName;
    }

    public Integer getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(Integer custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustLevelLabel() {
        return custLevelLabel;
    }

    public void setCustLevelLabel(String custLevelLabel) {
        this.custLevelLabel = custLevelLabel;
    }

    public Integer getCustSatisfy() {
        return custSatisfy;
    }

    public void setCustSatisfy(Integer custSatisfy) {
        this.custSatisfy = custSatisfy;
    }

    public Integer getCustCredit() {
        return custCredit;
    }

    public void setCustCredit(Integer custCredit) {
        this.custCredit = custCredit;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip;
    }

    public String getCustTel() {
        return custTel;
    }

    public void setCustTel(String custTel) {
        this.custTel = custTel;
    }

    public String getCustFax() {
        return custFax;
    }

    public void setCustFax(String custFax) {
        this.custFax = custFax;
    }

    public String getCustWebsite() {
        return custWebsite;
    }

    public void setCustWebsite(String custWebsite) {
        this.custWebsite = custWebsite;
    }

    public String getCustLicenceNo() {
        return custLicenceNo;
    }

    public void setCustLicenceNo(String custLicenceNo) {
        this.custLicenceNo = custLicenceNo;
    }

    public String getCustChieftain() {
        return custChieftain;
    }

    public void setCustChieftain(String custChieftain) {
        this.custChieftain = custChieftain;
    }

    public Long getCustBankroll() {
        return custBankroll;
    }

    public void setCustBankroll(Long custBankroll) {
        this.custBankroll = custBankroll;
    }

    public Long getCustTurnover() {
        return custTurnover;
    }

    public void setCustTurnover(Long custTurnover) {
        this.custTurnover = custTurnover;
    }

    public String getCustBank() {
        return custBank;
    }

    public void setCustBank(String custBank) {
        this.custBank = custBank;
    }

    public String getCustBankAccount() {
        return custBankAccount;
    }

    public void setCustBankAccount(String custBankAccount) {
        this.custBankAccount = custBankAccount;
    }

    public String getCustLocalTaxNo() {
        return custLocalTaxNo;
    }

    public void setCustLocalTaxNo(String custLocalTaxNo) {
        this.custLocalTaxNo = custLocalTaxNo;
    }

    public String getCustNationalTaxNo() {
        return custNationalTaxNo;
    }

    public void setCustNationalTaxNo(String custNationalTaxNo) {
        this.custNationalTaxNo = custNationalTaxNo;
    }

    public String getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(String custStatus) {
        this.custStatus = custStatus;
    }
}