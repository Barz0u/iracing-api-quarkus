package com.basilus.iracing.manager.model.member;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents member information from the iRacing API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MemberInfo {

    @JsonProperty("cust_id")
    private int custId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("username")
    private String username;

    @JsonProperty("display_name")
    private String displayName;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("on_car_name")
    private String onCarName;

    @JsonProperty("member_since")
    private String memberSince;

    @JsonProperty("last_login")
    private String lastLogin;

    @JsonProperty("club_id")
    private int clubId;

    @JsonProperty("club_name")
    private String clubName;

    @JsonProperty("licenses")
    private MemberLicenses licenses;

    @JsonProperty("account_status")
    private String accountStatus;

    @JsonProperty("has_read_tc")
    private boolean hasReadTC;

    @JsonProperty("agreed_to_tc")
    private boolean agreedToTC;

    @JsonProperty("read_pp")
    private boolean readPP;

    @JsonProperty("agreed_to_pp")
    private boolean agreedToPP;

    @JsonProperty("agreed_to_eula")
    private boolean agreedToEula;

    @JsonProperty("status")
    private String status;

    // Getters and setters

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOnCarName() {
        return onCarName;
    }

    public void setOnCarName(String onCarName) {
        this.onCarName = onCarName;
    }

    public String getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public MemberLicenses getLicenses() {
        return licenses;
    }

    public void setLicenses(MemberLicenses licenses) {
        this.licenses = licenses;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public boolean isHasReadTC() {
        return hasReadTC;
    }

    public void setHasReadTC(boolean hasReadTC) {
        this.hasReadTC = hasReadTC;
    }

    public boolean isAgreedToTC() {
        return agreedToTC;
    }

    public void setAgreedToTC(boolean agreedToTC) {
        this.agreedToTC = agreedToTC;
    }

    public boolean isReadPP() {
        return readPP;
    }

    public void setReadPP(boolean readPP) {
        this.readPP = readPP;
    }

    public boolean isAgreedToPP() {
        return agreedToPP;
    }

    public void setAgreedToPP(boolean agreedToPP) {
        this.agreedToPP = agreedToPP;
    }

    public boolean isAgreedToEula() {
        return agreedToEula;
    }

    public void setAgreedToEula(boolean agreedToEula) {
        this.agreedToEula = agreedToEula;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
