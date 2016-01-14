package common;
///////////////////////////////////////////////////////////////////////////////
// CLASS            : TableConstants
// PURPOSE          : Defines constants specific to database table structure.
// NOTES            : None
// LAST MODIFIED    :
//  20040521 GES017 Added VM_FUEL_CNG_TYPE
//  20040210 AMT008 Added VT_VEH_TAX_EXEMPTION
//  20040205 NID012 Added VM_VEH_CLASS_CD_TRACTOR_AGRICULTURE
//  20040101 AKT020 Fixed VB0865
//  20031224 GES015 Added VM_TRANSACTION_MAST_REASSIGN_REGN_NO
//  20031223 NID007 Added VM_TRANSACTION_MAST_AUDIT_RECOVERY
//  20031117 JIS022 Added constants for permit
//  20031013 NID001 Added Table constant VM_TRADE_CERT_MAST_CERTNO
//  20030903 GES012 Corrected javadoc
//  20030813 GES007 Added constant for Public carrier permit
//  20030807 GES006 Added constant for New Commercial Vehicle
//  20030807 JIS014 Added Constants for Administration module
//  20030804 CPO006 Added constants for owner details
//  20030804 SIM005 Added Copyright Documentation
//  20030730 AJS004 Changed doc 'Special Permit'
//  20030728 AKT009 Added Constants from Trailors Vehicle class
//  20030725 AKT008 Changed to make sync with VM_VEH_TYPE table
//  20030724 GUM011 Added Constants for VST_BACKLOG
//  20030719 AKT007 Added Table Constant VM_VEH_TYPE_PASS, VM_VEH_TYPE_GOODS
//                        VM_VEH_TYPE_OTHERS
//  20030716 AKT006 Added Table Constant VM_VEH_TYPE_PVTVM_, VM_VEH_TYPE_COMMERCIAL
//  20030708 RJB005 Added Table Constant VM_TRANSACTION_MAST_TO_DEATH
//  20030630 AKS005 Added Table Constant VM_PMT_MAST_TMP
//  20030630 SIM003 Added Table Constant VM_OWCODE_STATE_GOVT
//  20030626 RJB004 Added Table Constants VM_TRANSACTION_MAST_CONT_HYPO
//  20030624 AJS003 Added constant for Temp registration
//  20030623 GES002 Added constants for permit fee
//  20030619 AJS002 Added  constants for Paction, Special Permit Transaction
//  20030604 SIM001 Added constants for NOC Details
//  20030603 AJS001 Added constrants for Temporary Vehicle Registration
//  20030602 AKS003 Added constants for Permit section
//  20030531 AKT003 Added constants for Fee Temporary Registration
//  20030529 APR001 Added new constants for Permit Modules, formatted document.
//                  IDX_VM_XXXXX_CODE and IDX_VM_XXXXX_DESCR added.
//  20030527 GES001 Added constants for Fee for registered vehicles screen
//  20030526 RJB001 Added Table Constants IDX_VM_VHCLASS_CD_DESCR,IDX_VM_STATE_CD_DESCR
//  20030519 RCN007 Changed to interface. 'public static final' removed. It is implicit.
//  20030516 GUM004 Added new constants for fee processing (Special fields category)
//  20030511 GUM002 Created
//////////////////////////////////////////////////////////////////////////////
// Copyright 2003 National Informatics Centre, NIC. http://www.nic.in
// All Rights Reserved.
//////////////////////////////////////////////////////////////////////////////
//
// Importing standard java packages/classes
//
// NONE
//
// Importing Common java packages/classes
//
// NONE

/**
 * Defines constants specific to database table structure. SYNC_POINT : The
 * values here must be in sync with the Database/ Table Structures.
 *
 * @author GUM
 */
public interface TableConstants {

    // COLUMN INDEX
    // <IDX>_<TABLE_NAME>_<COLUMN_NAME> : Tells at wthat index the column
    // is in the database table
    // e.g. IDX_VM_VEH_CATG_FEE = 2 : Index of column 'FEE' in table
    //      'VM_VEH_CATG' is 2
    //......................................................................
    /**
     * Column index for CODE in VM_xxxxx tables
     */
    int IDX_VM_XXXXX_CODE = 0;          //<---- Common to all VM_xxxxx tables

    /**
     * Column index for DESCR in VM_xxxxx tables
     */
    int IDX_VM_XXXXX_DESCR = 1;          //<---- Common to all VM_xxxxx tables

    /**
     * Column index for Fee in VM_VEH_CATG
     */
    int IDX_VM_VEH_CATG_FEE = 2;

    /**
     * Column index for Fee in VM_ACTION
     */
    int IDX_VM_ACTION_FEE = 2;

    /**
     * Column index for Permit type in VM_PMT_MAST
     */
    int IDX_VM_PMT_MAST_TYPE = 0;

    /**
     * Column index for A_VHCD in VM_ACTION
     */
    int IDX_VM_ACTION_A_VHCD = 3;

    /**
     * Column index for Lower Vehicle class in VM_PMT_MAST
     */
    int IDX_VM_PMT_MAST_LCLASS = 2;

    /**
     * Column index for Upper Vehicle class in VM_PMT_MAST
     */
    int IDX_VM_PMT_MAST_UCLASS = 3;

    /**
     * Column index for Validity period in VM_PMT_MAST
     */
    int IDX_VM_PMT_MAST_VAL = 4;

    //----MohnishKr------28thAug2008-------------Started--------//
    /**
     * Column index for Choice Number for VSM_FANCY_NUM
     */
    int IDX_VM_FANCY_LRANGE = 0;

    /**
     * Column index for Validity period in VSM_FANCY_NUM
     */
    int IDX_VM_FANCY_URANGE = 1;

    /**
     * Column index for Validity period in VVSM_FANCY_NUM
     */
    int IDX_VM_FANCY_FEES = 2;

    //----MohnishKr------28thAug2008-------------Ended--------//
    // SPECIAL FEILDS etc
    //......................................................................
    /**
     * Receipt number master table contains a special User ID for all ie "-All-"
     */
    String VSM_RCPTNO_MAST_USER_ID_ALL = "-All-";

    /**
     * Fee code for issue of issue of NOC
     */
    int VM_TRANSACTION_MAST_NOC = 1;

    /* For NOC cancel */
    int VM_TRANSACTION_MAST_NOC_CANCEL = 2;

    /**
     * Fee code for issue of fitness certificate
     */
    int VM_TRANSACTION_MAST_FIT_CERT = 11;

    /**
     * Fee code for New vehicle
     */
    int VM_TRANSACTION_MAST_NEW_VEHICLE = 19;

    /**
     * Fee code for Renewal of registration
     */
    int VM_TRANSACTION_MAST_REN_REG = 20;

    /**
     * Fee code for Reassignment of registration number
     */
    int VM_TRANSACTION_MAST_REASSIGN_REGN_NO = 21;

    /**
     * Fee code for duplicate RC
     */
    int VM_TRANSACTION_MAST_DUP_RC = 29;

    /**
     * Fee code for Transfer of ownership
     */
    int VM_TRANSACTION_MAST_TO = 39;

    /**
     * Fee code for addition of hypothecation
     */
    int VM_TRANSACTION_MAST_ADD_HYPO = 50;

    /**
     * Fee code for removal of hypothecation
     */
    int VM_TRANSACTION_MAST_REM_HYPO = 51;

    /**
     * Fee code for continuance of hypothecation
     */
    int VM_TRANSACTION_MAST_CONT_HYPO = 52;

    /**
     * Fee code for change of address
     */
    int VM_TRANSACTION_MAST_CHG_ADD = 54;

    /**
     * Fee code for vehicle alteration
     */
    int VM_TRANSACTION_MAST_VEH_ALTER = 55;

    /**
     * Fee code for vehicle Conversion
     */
    int VM_TRANSACTION_MAST_CONVERSION = 57;//DIV1may2009

    /**
     * Fee code for RC surrender
     */
    int VM_TRANSACTION_MAST_RC_SURR = 65;

    /**
     * Fee code for RC release
     */
    int VM_TRANSACTION_MAST_RC_REL = 66;

    /**
     * Fee code for vehicle particulars
     */
    int VM_TRANSACTION_MAST_VEH_PART = 66;
    /**
     * temp registration
     */
    int VM_TRANSACTION_MAST_TEMP_REG = 67;

    /**
     * Code for Transfer of ownership on death
     */
    int VM_TRANSACTION_MAST_TO_DEATH = 68;

    /**
     * Code for Audit Recovery
     */
    int VM_TRANSACTION_MAST_AUDIT_RECOVERY = 61;

    //venkat
    int VM_TRANSACTION_MAST_DUP_FC = 100;

    //DIV 09-02-2009
    /**
     * Fresh Rc In The Name Of Financer
     */
    int VM_TRANSACTION_MAST_FRESH_RC = 74;

    /**
     * Purpose Code of backlog Dealer Registration
     */
    int VM_TRANSACTION_MAST_DEALER_REG = 888;

    /*purpose code for dealer tax*/
    int VM_TRANSACTION_MAST_DEALER_TAX = 58;

    /*purpose code for Choice no*/
    int VM_TRANSACTION_MAST_CHOICE_NO = 60;

    int VM_TRANSACTION_MAST_GRANT_NEW = 101;
    int VM_TRANSACTION_MAST_RENEWAL = 102;

    int VM_TRANSACTION_MAST_TEMPORARY_PERMIT = 103;
    int VM_TRANSACTION_MAST_SMART_FEE = 22;

    /**
     * Permit fee action - NEW
     */
    String VM_PACTION_NEW = "NEW";

    /**
     * Permit fee action - Renewal
     */
    String VM_PACTION_REN = "REN";

    /**
     * Permit fee action - Duplicate
     */
    String VM_PACTION_DUP = "DUP";

    /**
     * Permit fee action - Transfer
     */
    String VM_PACTION_TFR = "TFR";

    /**
     * Permit fee action - Transfer on death
     */
    String VM_PACTION_TFD = "TFD";

    /**
     * Permit fee action - Replacement
     */
    String VM_PACTION_REP = "REP";

    /**
     * Permit fee action - Fresh authorization
     */
    String VM_PACTION_AFR = "AFR";
    /**
     * Permit fee action - Renewal of Authorization
     */
    String VM_PACTION_ARN = "ARN";

    /**
     * Permit fee action - Add New State in Authorization
     */
    String VM_PACTION_ANS = "ANS";

    /**
     * Permit fee action - Surrender of Permit
     */
    String VM_PACTION_SUR = "SUR";
    String VM_PACTION_AIF = "AIF";
    String VM_PACTION_AIR = "AIR";

    String VM_PACTION_APL = "APL";

    String AITP_HPV = "5";

    /**
     * Permit status - Surrendered for tax exemption
     */
    String VM_PMTSUR_PURPOS_TAX = "B";

    /**
     * Permit status - Surrendered for vehicle replacement
     */
    String VM_PMTSUR_PURPOS_VEH = "C";

    /**
     * Permit status - Surrendered for permit transfer
     */
    String VM_PMTSUR_PURPOS_TRN = "D";

    /**
     * Permit status - Surrendered for suspension
     */
    String VM_PMTSUR_PURPOS_SUS = "E";

    /**
     * Verification flag for VT_VERIFY_DTLS
     */
    String VT_VERIFY_DTLS_VERIFY = "V";

    /**
     * Approval flag for VT_VERIFY_DTLS
     */
    String VT_VERIFY_DTLS_APPROVE = "A";

    /**
     * Fails verification flag for VT_VERIFY_DTLS
     */
    String VT_VERIFY_DTLS_FAIL = "N";

    /**
     * Pass verification flag for VT_VERIFY_DTLS
     */
    String VT_VERIFY_DTLS_PASS = "Y";

    /**
     * Yes flag for VT_HYPTH
     */
    String VT_HYPTH_YES = "Y";

    /**
     * No flag for VT_HYPTH
     */
    String VT_HYPTH_NO = "N";

    /**
     * IMPORTED flag for VT_VEH_CATG
     */
    String VT_VEH_CATG_IMPORTED = "I";

    /**
     * TEMP REG flag for VT_VEH_CATG
     */
    String VT_VEH_CATG_TEMP_REG = "T";

    /**
     * EX_ARMY flag for VT_VEH_CATG
     */
    String VT_VEH_CATG_EX_ARMY = "A";

    /**
     * OTHER STATE flag for VT_VEH_CATG
     */
    String VT_VEH_CATG_OTHER_STATE = "O";

    /**
     * TAX EXEMPTION flag for VT_VEH_CATG
     */
    String VT_VEH_TAX_EXEMPTION = "E";

    /**
     * Fitness status
     */
    String VT_FIT_RESULT_PASS = "P";

    /**
     * Fitness status
     */
    String VT_FIT_RESULT_FAIL = "F";

    /**
     * Permit status in permit transaction tables - SUSPENDED
     */
    String VT_PERMIT_STATUS_SUR = "SUR";

    /**
     * Permit status in permit transaction tables - SURRENDERED
     */
    String VT_PERMIT_STATUS_SUS = "SUS";

    /**
     * Permit Type Stage Carriage
     */
    int VM_PMT_MAST_SC = 101;

    /**
     * Permit Type Contract Carriage
     */
    int VM_PMT_MAST_CC = 102;

    /**
     * Permit Type All india tourist permit
     */
    int VM_PMT_MAST_AITP = 103;

    /**
     * Permit Type Education Institution
     */
    int VM_PMT_MAST_EI = 106;

    /**
     * Permit Type Private Service
     */
    int VM_PMT_MAST_PS = 107;

    /**
     * Permit Type Goods Carrier Local
     */
    int VM_PMT_MAST_GP = 111;

    /**
     * Permit Type National Permit
     */
    int VM_PMT_MAST_NP = 112;

    /**
     * Permit Type Interstate
     */
    int VM_PMT_MAST_IS = 113;

    /**
     * Permit Type Interstate Stage Carriage
     */
    int VM_PMT_MAST_ISS = 114;

    int VM_PMT_MAST_GP_PVT = 150;

    /**
     * Permit Type Temporary Permit
     */
    int VM_PMT_MAST_TMP = 115;

    /**
     * Permit Type Special Permit
     */
    int VM_PMT_MAST_SPL = 120;

    /**
     * category column in VSM_RUNNIG_NO_MAST - Temp Number
     */
    String VSM_RUNNING_NO_MAST_CATG_TEMP_NO = "T";

    /**
     * category column in VSM_RUNNIG_NO_MAST - Application No
     */
    String VSM_RUNNING_NO_MAST_CATG_APPL_NO = "R";

    /**
     * category column in VSM_TEMP_MAST - Temp Number
     */
    String VSM_TEMP_MAST_CATG_TEMP_NO = "A";

    /**
     * category column in VSM_UP_MAST - Category
     */
    String VSM_UP_MAST_CATG_GOODS = "G";
    String VSM_UP_MAST_CATG_TRANS = "T";
    String VSM_UP_MAST_CATG_PSNGR = "P";
    String VSM_UP_MAST_CATG_OTHER = "O";

    /**
     * Private Vehicle Class Code Start Number
     */
    int VM_VEH_CLASS_CD_PVT_START = 1;

    /**
     * Private Vehicle Class Code End Number
     */
    int VM_VEH_CLASS_CD_PVT_END = 50;

    /**
     * Passenger Vehicle Class Code Start Number
     */
    int VM_VEH_CLASS_CD_PASS_START = 51;

    /**
     * Passenger Vehicle Class Code End Number
     */
    int VM_VEH_CLASS_CD_PASS_END = 100;

    /**
     * Goods Vehicle Class Code Start Number
     */
    int VM_VEH_CLASS_CD_GOODS_START = 101;

    /**
     * Goods Vehicle Class Code End Number
     */
    int VM_VEH_CLASS_CD_GOODS_END = 150;

    /**
     * Special Permit Transaction Identifier
     */
    int VM_TRANSACTION_MAST_ISS_SPL_PMT = 101;

    /**
     * Temporary Permit Transaction Identifier
     */
    int VM_TRANSACTION_MAST_ISS_TMP_PMT = 102;

    /**
     * Vehicle Class Trailor Commercial
     */
    int VM_VEH_CLASS_CD_TRAILOR_COMMERCIAL = 104;

    /**
     * Vehicle Class Tractor Agriculture
     */
    int VM_VEH_CLASS_CD_TRACTOR_AGRICULTURE = 103;

    /**
     * Vehicle Class Trailor Agriculture
     */
    int VM_VEH_CLASS_CD_TRAILOR_AGRICULTURE = 119;

    /**
     * Permit type in VM_PMTFEE_MAST
     */
    int VM_PMTFEE_MAST_PCATG = 1;

    /**
     * Permit type in VM_PMTFEE_MAST
     */
    int VM_PMTFEE_MAST_PCODE = 0;

    /**
     * Permit type in VM_PMTFEE_MAST
     */
    int VM_PMTFEE_MAST_PACTION = 4;

    /**
     * Permit type in VM_PMTFEE_MAST
     */
    int VM_PMTFEE_MAST_FEE = 5;

    /**
     * Owner Code in VM_OWCODE
     */
    int VM_OWCODE_STATE_GOVT = 5;

    /**
     * Fee Code
     */
    int VM_ACTION_FEE_CODE = 0;

    /**
     * Private Vehicle Type in VM_VEH_TYPE
     */
    int VM_VEH_TYPE_COMMERCIAL = 2;

    /*verify approve for backlog*/
    int BACKLOG_ENTRY_VERIFICATION = 71;//venkat 

    int VM_TRANSACTION_MAST_DUP_TAX = 77;

    /**
     * Private Vehicle Type in VM_VEH_TYPE
     */
    String VM_VEH_TYPE_PVT = "PV";

    /**
     * Passenger Vehicle Type in VM_VEH_TYPE
     */
    String VM_VEH_TYPE_PASS = "PS";

    /**
     * Goods Vehicle Type in VM_VEH_TYPE
     */
    String VM_VEH_TYPE_GOODS = "GD";

    /**
     * Special Vehicle Type in VM_VEH_TYPE
     */
    String VM_VEH_TYPE_SPECIAL = "SP";

    /**
     * Others Vehicle Type in VM_VEH_TYPE
     */
    int VM_VEH_TYPE_OTHERS = 4;

    /*
     * Following constant string are used to display in the
     * Admin roles form.
     */
    /**
     * Admin module
     */
    String ADMINISTRATION = "ADM";

    /**
     * Fee module
     */
    String FEE = "FEE";

    /**
     * Fitness module
     */
    String FITNESS = "FIT";

    /**
     * Registration module
     */
    String REGISTRATION = "REG";

    /**
     * Tax module
     */
    String TAX = "TAX";

    /**
     * Permit module
     */
    String PERMIT = "PMT";

    /**
     * Enforcement module
     */
    String ENFORCEMENT = "ENF";

    /**
     * Verify and approve module
     */
    String VERIFY = "VER";

    /**
     * Report module
     */
    String REPORT = "REP";

    /**
     * Serice IDs range values
     */
    /**
     * Lower limit for admin module
     */
    int ADMIN_LOWER_LIMIT = 1;

    /**
     * Upper limit for admin module
     */
    int ADMIN_UPPER_LIMIT = 200;

    /**
     * Lower limit for fee module
     */
    int FEE_LOWER_LIMIT = 201;

    /**
     * Upper limit for fee module
     */
    int FEE_UPPER_LIMIT = 300;

    /**
     * Lower limit for Fitness module
     */
    int FITNESS_LOWER_LIMIT = 301;

    /**
     * Upper limit for Fitness module
     */
    int FITNESS_UPPER_LIMIT = 400;

    /**
     * Lower limit for Registration module
     */
    int REGISTRATION_LOWER_LIMIT = 401;

    /**
     * Upper limit for Registration module
     */
    int REGISTRATION_UPPER_LIMIT = 500;

    /**
     * Lower limit for Tax module
     */
    int TAX_LOWER_LIMIT = 501;

    /**
     * Upper limit for Tax module
     */
    int TAX_UPPER_LIMIT = 600;

    /**
     * Lower limit for Permit module
     */
    int PERMIT_LOWER_LIMIT = 601;

    /**
     * Upper limit for Permit module
     */
    int PERMIT_UPPER_LIMIT = 700;

    /**
     * Lower limit for Enforcement module
     */
    int ENFORCEMENT_LOWER_LIMIT = 701;

    /**
     * Upper limit for Enforcement module
     */
    int ENFORCEMENT_UPPER_LIMIT = 800;

    /**
     * Lower limit for Verify module
     */
    int VERIFY_LOWER_LIMIT = 801;

    /**
     * Upper limit for Verify module
     */
    int VERIFY_UPPER_LIMIT = 900;

    /**
     * Lower limit for Report module
     */
    int REPORT_LOWER_LIMIT = 901;

    /**
     * Upper limit for Report module
     */
    int REPORT_UPPER_LIMIT = 999;

    /**
     * Size of user id field in database
     */
    int MAX_USER_ID_LENGTH = 35;

    /**
     * Size of user password field in database
     */
    int MAX_PASSWORD_LENGTH = 32;

    /**
     * Flag for backlog of registration record
     */
    String VST_BACKLOG_REGISTRATION = "R";

    /**
     * Flag for backlog of goods permit record
     */
    String VST_BACKLOG_GD_PMT = "G";

    /**
     * Flag for backlog of passenger permit record
     */
    String VST_BACKLOG_PAS_PMT = "P";

    /**
     * Flag for backlog of fitness record
     */
    String VST_BACKLOG_FITNESS = "F";

    /**
     * Vehicle Registration type New
     */
    String VM_REGN_TYPE_NEW = "N";

    /**
     * Vehicle Registration type Other State
     */
    String VM_REGN_TYPE_OTHER_STATE = "O";

    /**
     * Vehicle Registration type Ex-Army
     */
    String VM_REGN_TYPE_EXARMY = "A";

    /**
     * Vehicle registration type - Temporary Registration
     */
    String VM_REGN_TYPE_TEMP = "T";

    /**
     * Vehicle Registration Type Imported
     */
    String VM_REGN_TYPE_IMPORTED = "I";

    /**
     * Vehicle Number given to a new commercial vehicle without a number - NEW
     */
    String VM_FITNESS_NEW = "NEW";

    /**
     * Issue Trade Certficate - Certficate No.
     */
    String VM_TRADE_CERT_MAST_CERTNO = "TC";

    /**
     * Fuel Type CNG
     */
    int VM_FUEL_CNG_TYPE = 6;

    //-------------MohnishKr--------22Sept2008----//
    /**
     * Seating Capacity For
     */
    int SEATING_CAPACITY_FOR_REGN_NO = 6;

    //kml 14-10-2008
    int DEAL_CD_LENGTH = 10; // Length of Deal_CD used in Smart Card Update.
    //DIV Fitness Adjstment Fees
    String ADJUSTMENT_FITNESS_FEE = "0";

    //DIV 09-02-2009 Start
    //RC Details
    String VM_FRC_REASON_RC_DETAILS = "1";

    //NOTICE Details
    String VM_FRC_REASON_NOTICE_DETAILS = "2";

    //FIR DETAILS
    String VM_FRC_REASON_FIR_DETAILS = "3";
    //DIV 09-02-2009  End

    /**
     * Reg Vah
     */
    String VM_REG_VEH = "RVH";

    //venkat 220409 Delimiters used in the table VT_TEMP_APPROVE
    String DELIMITERS = "###";

    String DELIMITERS_NEW = "**";

    String DELIMITERS_HYP = "@@@";

    /**
     * Description of backlog Dealer Registration
     */
    String VT_BACKLG_DLR_REG_DSR = "BACKLOG DEALER REGISTRATION";

    String BACKLOG_REGISTRATION = "BACKLOG ENTRY VERIFICATION";

    //Fee for the vehicle number which is not in the fancy num list
    String CHOICE_NUM_FEE = "5000";
    String CHOICE_NUM_FEE_11000 = "11000";

    // To store the Purpose for Transfer Of Owner.
    String SALE = "SALE";

    // To store the Purpose for Transfer Of Owner.
    String SUCCESSION_ON = "SUCCESSION ON";
    //Akshey VT_OWNER_DECLARE PRINT_FLAG values
    String PRINT_OWNER_ACCEPTANCE_FORM = "'Y'";

    String RECEIVE_OWNER_ACCEPTANCE_FORM = "'V'";
    //end Akshey

    int VM_GREEN_TAX_CD = 69;

    String PMT_AUTH_HOME_STATE = "BR";

    /**
     * All Over India
     */
    String VM_STATE_CD_AI = "AI";

    String STAGE_CAR = "Y";

    String NEW_BOTH = "NB";
    String DAMAGED_FRONT = "DF";
    String DAMAGED_REAR = "DR";
    String DAMAGED_BOTH = "DB";

    int JEEP_TAXI = 52;

    String FOUR_WHEELER = "FOUR";
    String TWO_WHEELER = "TWO";

}
