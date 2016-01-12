package common;
///////////////////////////////////////////////////////////////////////////////
// CLASS            : ServiceIds
// PURPOSE          : Defines static constants which map services 
//                    to the menu options
// NOTES            : None
// LAST MODIFIED    :
//  20090209 DIV052 Added REG_FRESH_RC_IN_THE_NAME_OF_FINANCER
//  20040626 SIM021 Added REG_TRANSFER_OF_OWNERSHIP_TO_INSURANCE
//  20040428 NID021 Added REG_INTERCHANGE_VEH_NO
//  20040423 AJS013 Added REP_AUDIT_REPORT
//  20040422 SIM018 Added REG_VEHICLE_MASTER_UPDATION
//  20040329 NID014 Added REG_RECEIPT_CORRECTION 
//  20040227 ASF011 Added REP_ACCOUNT_STATE and Removed FEE_ACCOUNT_STATEMENT
//  20040225 AJS012 Added REP_PRINT_PENDING_LIST
//  20040205 NID012 Added FEE_TRACTOR_REGISTRATION
//  20040130 AJS011 Added REP_PRINT_DEMAND_NOTICE
//  20040129 JIS027 Added TAX_GENERATE_DEFAULTER_LIST
//  20040113 SIM016 Added TAX_INSTALLMENT_PAYMENT1
//  20040113 AKT021 Added REP_VEH_CHECK
//  20040113 PAN013 Added Service Ids for Form Tax Installment Configuration
//  20040113 SIM015 Added FEE_CHOICE_NO
//  20040108 AJS009 Added Service Id for Tax Detach Trailer(TAX_DETACH_TRAILER)
//  20031229 AKT019 Added REP_REG_VEH_SUMMARY, REP_REG_VEH_SUMMARY  and REP_PERMIT_VEH_SUMMARY
//  20031224 GES015 Added Service Id for Reassignment of registration mark
//  20031223 NID007 Added Service Ids for Payment of audit Fee and 
//                  removed Service Ids for modification of audit recovery
//  20031219 AJS006 added TAX_BALANCE_TAX_COLLECTION
//  20031218 SIM014 Added TAX_BALANCE_TAX_ENTRY
//  20031210 SIM013 Added REG_TRAILER_BACKLOG
//  20031209 ASF009 Added REG_CANCEL_RECEIPT
//  20031203 NID004 Added TAX_MANUAL_TAX_CLEARANCE_ENTRY
//  20031017 PAN006 Added VEHICLE_CHECK
//  20031015 CPO012 Added  FEE_ACCOUNT_STATEMENT service ID
//  20031013 NID001 Added REG_ISSUE_TRADE_CERTIFICATE
//  20030827 AKT014 Added STR_EDIT_PROPERTIES
//  20030818 CPO007 Added FIT_PRINT_FITNESS_CERTIFICATE and REG_PRINT_VEHICLE_REGISTER
//  20030813 GUM014 Added VERAPR_ASSIGN_VEHNO 
//  20030804 SIM005 Added Copyright Documentation
//  20030723 GUM011 Added ADM_VIEW_SESSIONS, removed not to be done services
//                  made the serviceIDs in continuos order
//  20030723 PAN002 Changed TAX_CHANGE_OF_ADDRESS_VEHICLE to TAX_INSTRUMENT_RECONCILIATION (JIS/AKS)
//  20030718 AMT002 Modified Ids for Tax Hoilday Configuration
//  20030716 AKT006 Removed Service Id REG_VERIFICATION_OF_REGISTRATION_PROCESSES,
//                  REG_APPROVAL_FOR_REGISTRATION_PROCESSES and added service id 
//                  for VerifyApprove module
//  20030714 RJB006 Changed TAX_NEWLY_REGISTERED_VEHICLE to TAX_PARAMETER_CONFIGURATION
//  20030702 JIS013 Modified Ids for Tax
//  20030620 AKT005 Added FEE_DSA_COLLECTION and ENF_DSA_PENDING
//  20030522 JIS011 Added registration and enforcement constants
//  20030520 JIS010 Modified registration and permit constants
//  20030519 RCN007 Changed to interface. 'public static final' removed. It is implicit.
//  20030429 JIS002 Created
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
 * Provides the constants which map menu options to the services.
 * These constants are used to find out which service is called.
 *
 * SYNC_POINT : The values here must be in sync with the Database
 *              table VSM_SERVICES.
 * 
 * @author JIS
 */
public interface ServiceIds {
    //================================================================
    // TECH_NOTE:    
    // All interface attributes are implicitly "public static final"
    // All interface methods    are implicitly "public abstract"
    //================================================================
    
    //----------------------------------------------------------------
    // 1-50   : System Services (eg Login, Logout, Exit, L&F, Options..
    // 51-900 : Form Services (Fee, Fitness, Registration, Tax, Permit forms)
    //----------------------------------------------------------------
    
    // Start Module
    //........................
    int STR_EDIT_PROPERTIES              = 51;  // STR_ means 'Start' menu
    
    //Admin Module
    //........................     
    int ADM_CONFIGURE_ROLES              = 101; 
    int ADM_CONFIGURE_USERS              = 102; 
    int ADM_CHANGE_PASSWORD              = 103; 
    int ADM_VIEW_SESSIONS                = 104; 
    int ADM_MASTER_TABLE_CHOICE_EDITOR   = 105; 

	/**kml 25.08.08
     *This service id belongs to Offline printing.
     */
    
    int ADM_OFF_LINE_PRINT                = 106; 

    int ADM_SMART_CARD                    = 107;
    
    int ADM_IMPORT_DEALER_DATA            = 108;
    
    //Fee Module
    //........................     
    int FEE_DRIVING_LICENCE             = 201; 
    int FEE_NEW_VEHICLE                 = 202; 
    int FEE_REGISTERED_VEHICLE          = 203; 
    int FEE_FITNESS_TEST                = 204; 
    int FEE_TEMPORARY_REGISTRATION_FEE  = 205; 
    int FEE_VEHICLE_CONVERSION          = 206; 
    int FEE_PERMIT                      = 207; 
    int FEE_TRAILOR_REGISTRATION        = 208;
    int FEE_ENFORCEMENT                 = 209; 
    int FEE_DSA_COLLECTION              = 210;    
    int FEE_PAYMENT_OF_AUDIT            = 212;
    int FEE_TRACTOR_REGISTRATION        = 213;
    int FEE_CHOICE_NO                   = 214;    
    int FEE_ADJUSTMENT                  = 215;
    //Subhasis--13Sep2010-----
      int FEE_TEMPORARY_PERMIT           =216;
    
    //Fitness Module
    //........................     
    int FIT_ISSUE_FITNESS_CERTIFICATE   = 301;  
    int FIT_RENEW_FITNESS_CERTIFICATE   = 302; 
    int FIT_FITNESS_BACKLOG_ENTRY       = 303; 
    int FIT_ENDORSE_FITNESS             = 304; 
    int FIT_PRINT_FITNESS_REGISTER      = 305; 
    int FIT_PRINT_FITNESS_CERTIFICATE   = 306;
    int FIT_DUPLICATE_FITNESS_CERTIFICATE   = 313;

    //Registeration Module
    //........................     
    int REG_OWNER_DETAIL_ENTRY                                          = 401; 
    int REG_REGISTRATION_BACKLOG_ENTRY                                  = 402; 
    int REG_CHANGE_OF_ADDRESS_WITHIN_REGION                             = 403; 
    int REG_PRINT_REGISTRATION_CERTIFICATE                              = 404; 
    int REG_TRANSFER_OF_OWNERSHIP_ON_SALE_WITHIN_REGION                 = 405; 
    int REG_TRANSFER_OF_OWNERSHIP_ON_DEATH                              = 407; 
    int REG_ADDITION_OF_HYPOTHECATION                                   = 408; 
    int REG_TERMINATION_OF_HYPOTHECATION                                = 409; 
    int REG_ENTRY_OF_AUDIT_RECOVERY                                     = 410; 
    int REG_ISSUE_OF_NO_OBJECTION_CERTIFICATE                           = 411; 
    int REG_RENEWAL_OF_REGISTRATION                                     = 412; 
    int REG_PRINT_VEHICLE_PARTICULARS                                   = 413; 
    int REG_SUSPENSION_OR_CANCELLATION_OR_RESTORATION_OF_REGISTRATION   = 414; 
    int REG_ALTERATION_OF_A_VEHICLE                                     = 415; 
    int REG_ADMINISTRATION_OF_REGISTRATION_DATA                         = 416; 
    int REG_CAMP_COLLECTION_DETAILS                                     = 417; 
    int REG_BLOCK_OR_UNBLOCK_THEFT_REPORTED_VEHICLES                    = 418; 
    int REG_BLOCKING_OF_VEHICLE_NUMBER                                  = 419; 
    int REG_INSURANCE_DATA_UPDATION                                     = 420; 
    int REG_RECORD_STOLEN_VEHICLE                                       = 421; 
    int REG_SURRENDER_RELEASE                                           = 422; 
    int REG_POLLUTION_DATA_UPDATION                                     = 423;     
    int REG_REASSIGNMENT_OF_REGISTRATION_MARK                           = 424; 
    int REG_TEMPORARY_REGISTRATION                                      = 425; 
    int REG_RENEWAL_OF_TEMPORARY_REGISTRATION                           = 426;
    int REG_MANAGE_FEE_MASTERS                                          = 427; 
    int REG_MANAGE_RECEIPT_BOOK_MASTER                                  = 428; 
    int REG_NOC_CANCELLATION                                            = 429; 
    int REG_MAKER_MODEL_MASTER                                          = 430;
    int REG_COMPLETE_VEHICLE_STATUS                                     = 431;
    int REG_PRINT_VEHICLE_REGISTER                                      = 432;
    int REG_ISSUE_TRADE_CERTIFICATE                                     = 433;
    int REG_CANCEL_RECEIPT                                              = 434;
    int REG_TRAILER_BACKLOG                                             = 435;
    int REG_REASSIGN_VEH_NO                                             = 436;
    int REG_RECEIPT_CORRECTION                                          = 437;
    int REG_INTERCHANGE_VEH_NO                                          = 439;
    int REG_VEHICLE_MASTER_UPDATION                                     = 438;
    int REG_TRANSFER_OF_OWNERSHIP_TO_INSURANCE                          = 440;
    //VIVEK 30JAN2009
    int REG_DUPLICATE_RC                                                = 442;
    //DIV 09-02-2009
    int REG_FRESH_RC_IN_THE_NAME_OF_FINANCER                            = 443;
    
    int REG_NOC_PRINT                                                   = 444;
    int REG_BACKLOG_DEALER_REGISTRATION                                 = 445;
	
    //Akshey Kotwal 02-09-2009
    int REG_OWNER_ACCEPT_PRINT                                          = 446;
    int REG_OWNER_ACCEPT                                                = 447;
    
    //venkat 03Feb2010
    int REG_TEMP_CERT_PRINT                                             = 448; 
    
    int REG_HSRP_TRANS                                                  = 449;
    int REG_HSRP_UPDATE                                                 = 450;
    int REG_HSRP_DUP_PRINT                                              = 451;
    int REG_HSRP_DUP_FLAT_FILE                                          = 452;
	
    //Tax Module
    //........................     
    int TAX_ROAD_TAX_COLLECTION                     = 501; 
    int TAX_PARAMETER_CONFIGURATION                 = 502; 
    int TAX_INSTRUMENT_RECONCILIATION               = 503;  
    int TAX_HOLIDAY_CONFIGURATION                   = 504; 
    int TAX_GENERATE_TAX_DEMAND_REGISTER_LIST       = 505; 
    int TAX_PENALTY_CONFIGURATION_MASTER            = 506; 
    int TAX_CANCELLATION_OF_TAX_RECEIPT             = 507; 
    int TAX_EXEMPTION_OF_TAX                        = 508; 
    int TAX_TAX_EXEMPTION_CLEARANCE                 = 509; 
    int TAX_BALANCE_ENTRY                           = 510; 
    int TAX_MANUAL_TAX_CLEARANCE_ENTRY              = 511;
    int TAX_BALANCE_TAX_COLLECTION                  = 512;
    int TAX_DETACH_TRAILER                          = 513;
    int TAX_INSTALLMENT_CONFIGURATION               = 514;
    int TAX_INSTALLMENT_PAYMENT                     = 515;
    int TAX_GENERATE_DEFAULTER_LIST                 = 516;
    //DIV
    int TAX_ROAD_TAX_REFUND                         = 517;
    //MohnishKr--29thSept2008
    int TAX_ADJUSTMENT	          		    = 518;
    //kml 30.09.2008
    int TAX_EXEM_CERTIFICATION                      = 519;
    
    //vnkt 09-08-2010
    int TAX_MANUAL_COLLECTION                       = 520;
    int TAX_DUPLICATE_RECEIPT_PRINT                 = 521;

    //Permit Module
    //........................     
    int PMT_GOODS_PERMIT_DETAIL_ENTRY               = 601; 
    int PMT_PASSENGER_PERMIT_DETAIL_ENTRY           = 602; 
    int PMT_DETAIL_ENTRY_OF_TEMPORARY_PERMIT        = 603; 
    int PMT_ISSUE_OF_SPECIAL_PERMIT                 = 604; 
    int PMT_PRINT_PERMIT                            = 605; 
    int PMT_PRINT_PERMIT_REGISTER                   = 606; 
    int PMT_AUTHORIZATION_CERTIFICATE_MODIFICATION  = 607; 
    int PMT_GOODS_PERMIT_BACKLOG                    = 608; 
    int PMT_PASSENGER_PERMIT_BACKLOG                = 609; 
    int PMT_PASSENGER_PERMIT_SURRENDER              = 610; 
    int PMT_GOODS_PERMIT_SURRENDER                  = 611; 
    int PMT_RESTORE_PASSENGER_PERMIT                = 612; 
    int PMT_RESTORE_GOODS_PERMIT                    = 613; 
    int PMT_GOODS_PERMIT_RENEWAL                    = 614; 
    int PMT_PASSENGER_PERMIT_RENEWAL                = 615;
    int PMT_MANAGE_ROUTE_MASTER                     = 616;

    //Enforcement Module
    //........................     
    int ENF_CALCULATE_COMPOUNDING_FEE               = 701; 
    int ENF_RECORD_CHALLAN                          = 702; 
    int ENF_RECORD_COURT_CASES                      = 703; 
    int ENF_SETTLE_CHALLAN                          = 704; 
    int ENF_DSA_PENDING                             = 705;
    
    //VerifyApprove Module
    //........................  
    int VERAPR_VERIFY_OF_PENDING_TRANSACTION        = 801;
    int VERAPR_APPROVE_OF_PENDING_TRANSACTION       = 802;
    int VERAPR_ASSIGN_VEHNO                         = 803; 
    
    //Report Module
    //..................
    int REP_REG_VEH_SUMMARY                         = 901;
    int REP_FIT_VEH_SUMMARY                         = 902;
    int REP_PERMIT_VEH_SUMMARY                      = 903;
    int REP_REG_VEH_SEARCH                          = 904;
    int REP_SPC_VEH_SUMMARY                         = 905;
    int REP_REG_VEH_BACKLOG                         = 906;
    int REP_PRINT_DEMAND_NOTICE                     = 907;
    int REP_PRINT_PENDING_LIST                      = 908;
    int REP_ACCOUNT_STATE                           = 909;
    int REP_AUDIT_REPORT                            = 910;
    int REP_MISC_REPORT                              = 911; //---MohnishKr-----040320008-----//
    //Subhasis--5Aug2010--------
    int REP_DAILY_COMMERCIAL                        = 912;
    int REP_FORM_20_GENERATION                      = 913;  // Prashant--4Aug2010
    int REP_PRINT_ONLINE_TOKEN                      = 914; //venkat for online Tax token print 26Nov2011
    int REP_DETAILS_OF_ONLINE_PAYMENT               = 915; //venkat for online Tax report 29Nov2011
    int REP_HSRP_PRINT                              = 916;
    int REP_SCREEN_REPORT                           = 917;
    // Check a vehicle
    //
    // This serviec is NOT menu based ie the associated form will not be
    // called from the menu. It will be a pop-up form. This is being made a 
    // service as we wanted to use the makeDO() and process() methods.
    //........................  
    int VEHICLE_CHECK                               = 1100;
}