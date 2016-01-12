package common;
///////////////////////////////////////////////////////////////////////////////
// CLASS            : OperationIds
// PURPOSE          : Defines static constants which map operation Ids 
//                    for ServerHandler.handleProcess(), ServerHandler.makeDO()
// NOTES            : None
// LAST MODIFIED    :
//  20090209 DIV052 Added OperationIDS P_REG_FRESH_RC_SAVE and M_REG_FRESH_RC for FormRegistrationFreshRcInTheNameOfFinancer
//  20050401 DIV011 Added OperationIDS for Form Road Tax Refund   
//  20040627 SIM021 Added OperationIds for Form Registration Transfer of Owner Insurance
//  20040505 NID022 Delhi Changes IIIint P_REG_INTERCHANGE_VEH
//  20040428 NID021 Added OperationIds for Form Interchange of Vehicle Numbers
//  20040422 SIM018 Added OperationIds for Form Vehicle Master Updation
//  20040329 NID014 Added Operation Ids for Form Registration Receipt correction
//  20040227 ASF011 Added Operation Ids for Day-End Account Statement Report and 
//                  Removed  Day-End Account Statement for printing
//  20040205 GES019 Added Operation Ids P_VER_ASSIGN_MANUAL_CHOICE, M_VER_ASSIGN_VEHNO_GET_CHOICE_NO 
//  20040205 NID012 Added Operation Ids for Tractor Registration
//  20040129 JIS027 Added Operation Id for Tax Defaulter List
//  20040115 AMT007 Added Operation Ids for Disposal of Challan
//  20040113 SIM016 Added Operation Ids for Tax Installment Payment
//  20040113 PAN013 Added Operation Id for Tax installment configuration
//  20040113 SIM015 Added Operation Ids for Fee Choice No.
//  20040109 AMT006 Added Operation Id M_ENF_COLL_FEE_PAID
//  20040108 AJS009 Added Operation Id for Detach Trailer
//  20031224 GES015 Added Operation Id for reassignment of registration mark
//  20031223 AJS007 Added Operation Ids for edit case for RC Surrender and RC Release
//  20031223 NID007 Added Operation Ids for Payment of audit Fee and 
//                  removed Operation Ids for modification of audit recovery
//  20031219 AJS006 Added Operation Ids P_TAX_BALANCE_TAX_COLLECTION, M_TAX_BALANCE_TAX_COLLECTION 
//  20031218 SIM014 Added Operation Ids for Tax Balance Entry
//  20031210 SIM013 Added Operation Ids for Backlog / Data Completion of Trailer
//  20031209 ASF009 Added Operation Ids for Fee Receipt Cancellation
//  20031204 NID004 Added Operation Ids for Manual Tax Clearance Entry
//  20031117 JIS022 Added Operation Ids M_TAX_FEE_NEWVEH_TAX_PARAM_GET
//  20031017 PAN006 Added Operation Ids for FormVehicleCheck
//  20031015 CPO012 Added  P_FEE_DAY_END_CASH_STATEMENT operastion ID
//  20031013 NID001 Added Operation Ids for Issue of Trade Certificate
//  20030822 PAN004 Added Operation Ids for Enforcement New Challan
//  20030821 AKT013 Added Ids for Approve Pending Transaction
//  20030813 GUM014 Added Ids for Assignment of new registration mark
//  20030808 GUM013 Changed "M_" operationIds to "P_" for process case
//  20030806 ASF005 Fixed VB0291 and VB0219
//  20030804 CPO006 Added Operation Ids for Owner detail entry
//  20030804 SIM005 Added Copyright Documentation
//  20030804 PAN003 Added Operation Ids for registration suspension and restoration
//  20030731 ASF004 Added Operation Ids for fitness cancellation
//  20030730 AJS004 Added Operation Ids for Complete vehicle status
//  20030729 SIM004 Added Operation Ids for Renewal of Temporary Registration
//  20030728 AKT009 Added Operation Ids for Trailor Registration
//  20030723 PAN002 Added Operation Ids for Tax Instrument Reconciliation (JIS/AKS)
//  20030719 AKT007 Added Operation Ids for FormFeeNewVehicle
//  20030718 AMT002 Added Operation Ids for Tax Holiday Configuration
//  20030716 AKT006 Added Operation Ids for Verification of Pending Transactions
//  20030714 RJB006 Added Operation Id for Tax Parameter Configuration
//  20030712 ASF003 Added Operation Ids for permit route master
//  20030711 AMT001 Added Operation Ids for tax Exemption
//  20030710 PAN001 Added Operation Ids for tax Exemption Clearance
//  20030710 AKS006 Added Operation Ids for Tax Penalty Configuration
//  20030702 JIS013 Added Ids for Tax Calculation
//  20030708 RJB005 Added Operation Ids for Transfer of Ownership on Sale & on Death
//  20030630 AKS005 Added Operation Ids for Temporary Permit
//  20030624 ASF002 Added Operation Ids for FormRegistrationUpdateInsurance,
//                  FormRegistrationHypothecationRemove, FormRegistrationTheftCases 
//                  and FormRegistrationVehicleNo
//  20030627 GES003 Added Ids for Hypothecation addition
//  20030626 RJB004 Added Operation Ids for Registration Backlog Entry
//  20030625 CPO005 Added Ids for Manage Fee Masters
//  20030624 AJS003 Added Operation Ids for Temp Owner
//  20030625 SIM002 Added Operation Ids for ReAssignVehicle no and Manage receipt book
//  20030623 GES002 Added Ids for Permit Fee
//  20030621 CPO004 Added Operation Ids for Reg Owner admin,fitness backlog
//  20030620 AKT005 Added Operation Ids for DSA Collection and DSA Pending cases
//  20030617 AJS002 Added operation ids for Rc Surrender and special permit
//  20030614 RJB003 Added M_REG_MODIFY_AUDIT_RECOVERY, P_REG_MODIFY_AUDIT_RECOVERY
//  20030614 AKS004 Added OperationIds for Permit Backlog Entry forms
//  20030604 SIM001 Added Operation Ids for NOC Details
//  20030605 APR002 Added Operation Ids for Goods Permit Surrender & Restore,
//  20030604 CPO003 Added OperationIds  for Vehicle Alteration, Renewal of Registration
//  20030604 RJB002 Added OperationIds for theft report
//  20030603 AKS001 Added Operation ids for FormEnforcementCollectionEntry
//                  and FormRegistrationTempRegistration
//  20030603 AKT004 Added M_REG_FEE_VEHICLE_CONVERSION
//  20030602 AKS003 Added OperationIDs for Permit section
//  20030531 AKT003 Added Operation Ids for FormFeeTemporaryRegistration
//  20030529 ASF001 Added for PUCC, Maker Model Master and camp fee (GUM, TRU)
//  20030529 APR001 Added Operation Ids for Passenger Permit Surrender & Restore,
//                  FormRegistrationRenewRegistration
//  20030527 GES001 Added Ids for FeeForRegisteredVehicles and Change of address
//  20030526 RJB001 Added P_REG_AUDIT_RECOVERY,P_REG_NOC_CANCEL,M_REG_AUDIT_VEH_NO,
//                  M_REG_CANCEL_NOC_VEH_NO 
//  20030519 RCN007 Changed to interface. 'public static final' removed. It is implicit.
//  20030510 GUM002 Created
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
 * Defines static constants which map operation Ids 
 * for ServerHandler.handleProcess(), ServerHandler.makeDO()
 * 
 * @author GUM
 */
public interface OperationIds {
    //================================================================
    // TECH_NOTE:    
    // All interface attributes are implicitly "public static final"
    // All interface methods    are implicitly "public abstract"
    //================================================================
    
    
    //////////////////////////////////////////////////////////////////////////
    // handleProcess() operation Ids
    //////////////////////////////////////////////////////////////////////////
    //........................
    //Fitness Module
    //........................
    //FormFitnessFee    
    int P_FIT_FEE_NEW_VEH                   = 1; 
    int P_FIT_FEE_OLD_VEH                   = 2; 

    //FormFitnessTestEntry
    int P_FIT_TEST_ENTER                    = 1; 
    int P_FIT_TEST_EDIT                     = 2; 
    int P_FIT_TEST_VERIFY                   = 3; 
    int P_FIT_TEST_APPROVE                  = 4; 
    int P_FIT_TEST_VERIFY_OWN               = 5; 
    int P_FIT_TEST_APPROVE_OWN              = 6; 

    //FormFitnessBacklog
    int P_FIT_BACKLOG                       = 1;

    //FormFitnessCancellation
    int P_FIT_CANCEL                        = 1;
    int P_FIT_SUSP                          = 2;
    int P_FIT_RESTORE                       = 3;

    
    //........................
    //Enforcement Module
    //........................   
    //FormEnforcementCollectionEntry
    int P_ENF_COLL_ENTER                    = 1; 

    //FormEnforcementDSAPendingEntry
    int P_ENF_DSA_PENDING_ENTER             = 1;
    
    // FormEnforcementNewChallan
    int P_ENF_NEW_CHALLAN_INS               = 1;
    
    // FormEnforcementDispoaseChallan
    int P_ENF_DIS_VEH_IMPND_CHANGES         = 1;
    int P_ENF_DIS_DOC_IMPND_CHANGES         = 2;
    int P_ENF_DIS_CONT_TRANS_CHANGES        = 3;
    int P_ENF_DIS_OFFENCES_CHALLAN_CHANGES  = 4;
    int P_ENF_DIS_OFFENCES_REMOVED          = 5;
    //........................
    //Registration Module
    //........................
    //FormRegistrationNOCIssue
    int P_REG_NOC_ISSUE_ENTER               = 1;
    int P_REG_NOC_ISSUE_EDIT                = 2;

    //FormRegistrationAuditRecovery
    int P_REG_AUDIT_RECOVERY                = 1;

    //FormRegistrationCancelNOC
    int P_REG_NOC_CANCEL                    = 1;

    //FormRegistrationRenewRegistration
    int P_REG_RENEWAL_OF_REGISTRATION       = 1;
    int P_REG_RENEWAL_OF_REGISTRATION_EDIT  = 2;

    //FormRegistrationVehicleAlteration
    int P_REG_ALTERATION_OF_A_VEHICLE       = 1; 
    int P_REG_ALTERATION_OF_A_VEHICLE_EDIT  = 2; 

    //FormRegistrationPUCC
    int P_REG_PUCC_VEH_NO                   = 1;

    //FormRegistrationMakerModel
    int P_REG_NEW_MANUFACTURER              = 1;
    int P_REG_NEW_MODEL                     = 2;
    int P_REG_MODIFY_MODEL                  = 3;

    //FormFeeCampFee    
    int P_REG_CAMPFEE                       = 1;

    //FormRegistrationBacklogEntry
    int P_REG_BACKLOG_ENTRY                 = 1;

    //FromRegistrationTransferOwnerSale
    int P_REG_TO_SALE                       = 1;
    int P_REG_TO_SALE_EDIT                  = 2;

    //FormRegistrationTheftReport
    int P_REG_THEFT_REPORT                  = 1;

    //FormFeeVehicleConversion
    int P_REG_FEE_VEHICLE_CONVERSION        = 1;

    //FormRegistrationTempRagistration
    int P_REG_TEMP_REG                      = 1;
    int P_REG_TEMP_REG_EDIT                 = 2;

    //FormRegistrationReassignVehicleNo
    int P_REG_REASSIGN_VEH_NO               = 1;

    //FormRegistrationManageReceiptBook
    int P_REG_MANAGE_RCPT_BOOK              = 1;
    int P_REG_MANAGE_EXPIRE_BOOK            = 2;

    //FormRegistrationOwnerAdmin
    int P_REG_OWNER_ADMIN_UPDATE            = 1;

    //FormRegistrationOwnerDetail
    int P_REG_OWNER_DETAIL_ENTER            = 1;
    int P_REG_OWNER_DETAIL_EDIT             = 2;

    //FormRegistrationRCSurrender
    int P_REG_RC_SURRENDER                  = 1;
    int P_REG_RC_CANCELLATION               = 2;
    int P_REG_RC_RELEASE                    = 3;
    int P_REG_EDIT_RC_SURRENDER             = 4;
    int P_REG_EDIT_RC_RELEASE               = 6;
    
    //FormFeeCollectionDSA
    int P_REG_FEE_DSA_COLLECTION            = 1;

    //Form Hypothecation Addition
    int P_HYPOTH_ADD_RCPT_NO                = 1;  
  
    //FormRegistrationFeeMaster
    int P_REG_FEE_MAST_UPD_REG              = 1; 
    int P_REG_FEE_MAST_UPD_FIT              = 2; 
    int P_REG_FEE_MAST_UPD_PMT              = 3; 
    int P_REG_FEE_MAST_UPD_GEN              = 4; 

    //FormRegistrationTheftCases
    int P_REG_THEFT_CASES_BLOCKED           = 1;
    int P_REG_THEFT_CASES_UNBLOCKED         = 2;

    //FormRegistrationBlockVehicleNo
    int P_REG_BLOCK_SERIES                  = 1;
    int P_REG_BLOCK_VEHICLE                 = 2;

    //FormRegistraionHypothecationRemove
    int P_REG_HYPOTH_REMOVE_ENTER           = 1;
    int P_REG_HYPOTH_REMOVE_EDIT            = 2;

    //FormRegistrationUpdationInsurance
    int P_REG_UPDATE_INSURANCE              = 1;
    int P_HYPOTH_ADD_RCPT_NO_EDIT           = 2;

    //FromRegistrationTransferOwnerDeath
    int P_REG_TO_DEATH                      = 1;
    int P_REG_TO_DEATH_EDIT                 = 2;

    //FormFeeNewVehicle
    int P_REG_FEE_NEWVEH_FEE_TAX_OR_FEE     = 1;
    int P_REG_FEE_NEWVEH_TAX                = 2;

    //FormRegistrationTempRegRenewal
    int P_REG_RENEWAL_OF_TEMP_REG           = 1;

    //FormFeeTailor Registration
    int P_REG_FEE_TRAILOR_REGISTRATION      = 1;

    //FormSuspentionAndRestorationOfRegistration
    int P_REG_SUSPENTION_REGISTRATION_INS   = 1;
    int P_REG_RESTORATION_REGISTRATION_INS  = 2;
    
    //Form Temporary Registration Fee
    int P_REG_FEE_TEMP_REG_ENTER            = 1;

    //FormRegistrationAddressChange
    int P_REG_ADD_CHG_RCPT_NO_ENTER         = 1; 
    int P_REG_ADD_CHG_RCPT_NO_EDIT_SAVE     = 2;
    
    //FormRegistrationIssueTradeCertificate
    int P_REG_ISSUE_TRADE_CERT_ENTER        = 1;

    // FormFeeReceiptCancellation
    int P_REG_CANCEL_RECEIPT                = 1;
    
    //FormRegistrationTrailerBacklog
    int P_REG_TRAILER_BACKLOG               = 1;
    
    //FormPaymentOfAudit
    int P_REG_FEE_PAYMENT_OF_AUDIT          = 1;
    
    //FormFeeChoiceNo
    int P_FEE_CHOICE_NO                     = 1;
    
    //FormFeeTractorRegistration
    int P_REG_FEE_TRACTOR_REG               = 1;
    
    //FormRegVehicleMasterUpdation
    int P_REG_ADD_VH_CLASS                  = 1; 
    int P_REG_EDIT_VH_CLASS                 = 2;
    
    //FormRegistrationReceiptCorrection
    int P_REG_FITNESS_RCPT_CORRECTION       = 1;
    int P_REG_TAX_RCPT_CORRECTION           = 2;
    int P_REG_PERMIT_RCPT_CORRECTION        = 3;
    int P_REG_VEH_RCPT_CORRECTION           = 4;
    
    //FormRegistrationInterchangeVehNo
    int P_REG_INTERCHANGE_VEH               = 1;

    // FormRegistrationTransferOwnerInsurance
    int P_REG_TO_INSURANCE                  = 1;
    int P_REG_TO_INSURANCE_EDIT             = 2;
    
    //vivek 30jan2009
    //Form Duplicate Registration Certificate
    int P_REG_DUPLICATE_RC                  = 1;
    
    //FormFeeAdjustment -Registration
    int P_FEE_ADJUSTMENT_SAVE               = 1;
    //FormFeeAdjustment - Fitness
    int P_FEE_ADJUSTMENT_FITNESS_SAVE       = 2;
    
    //DIV 09-02-2009
    //FormRegistrationFreshRcInTheNameOfFinancer
    int P_REG_FRESH_RC_SAVE                 = 1;
    int P_REG_FRESH_RC_SAVE_EDIT            = 2;  //----MohnishKr----05062009----Added for edit case.
    //........................
    //Permit Module
    //........................    
    //FormPermitRestorePassengerPermit  
    int P_PMT_PSN_RSTR_PMT_NO_GET           = 1; 
    int P_PMT_PSN_RSTR_PMT_NO_INS           = 2; 

    //FormPermitSurrenderPassengerPermit
    int P_PMT_PSN_SURR_PMT_NO_GET           = 1;
    int P_PMT_PSN_SURR_PMT_NO_INS           = 2;

    //FormPermitSurrenderGoodsPermit
    int P_PMT_GD_SURR_PMT_NO                = 1;

    //FormPermitRestoreGoodsPermit
    int P_PMT_GD_RSTR_PMT_NO_GET            = 1;    
    int P_PMT_GD_RSTR_PMT_NO_INS            = 2;

    //FormPermitSurrenderGoodsPermit
    int P_PMT_GD_SURR_PMT_NO_GET            = 1;    
    int P_PMT_GD_SURR_PMT_NO_INS            = 2;
    int M_PMT_FEE_VEH_NO_NEW                = 2;
    int M_PMT_FEE_VEH_NO_AFR               = 7;
    int M_PMT_FEE_VEH_NO_AIR               = 5; 
    int M_PMT_FEE_VEH_NO_ARN               = 8;
    int    M_PMT_FEE_VEH_CHKSURR       = 10;
    int M_PMT_FEE_VEH_NO_REN               = 4;
    int M_PMT_FEE_RECPT_CHK = 11;
     int  P_VERAPR_VERIFY_PENDING_VERIFY_PMT = 12;
        




    //FormPermitPassengerPmtDetails
    int P_PMT_PASS_DTLS_ENTER_NEW           = 1;
    int P_PMT_PASS_DTLS_ENTER_RENEW         = 2;

    //FormPermitGoodsPermitDetails
    int P_PMT_GOODS_DTLS_ENTER_NEW          = 1;
    int P_PMT_GOODS_DTLS_ENTER_RENEW        = 2;
    int P_PMT_GOODS_DTLS_ENTER_AUTH_REN     =3;

    //FormPermitGoodsPermitBacklog
    int P_PMT_GOODS_DTLS_BACKLOG            = 1;

    //FormPermitPassengerPermitBacklog
    int P_PMT_PASS_DTLS_BACKLOG             = 1;

    //FormPermitAuthorizationModification
    int P_PMT_AUTH_DTLS_MODIFY              = 1;    

    //FormPermitIssueSpecialPermit
    int P_PMT_ISSUE_SPECIAL_PERMIT          = 1;
    int P_PMT_ISSUE_SPECIAL_PERMIT_EDIT     = 2;

    //From Permit fee 
    int P_PMT_FEE_VEH_NO                    = 1;

    //FormPermitTemporaryPermit
    int P_PMT_ISSUE_TMP_PERMIT              = 1;
    int P_PMT_ISSUE_TMP_PERMIT_EDIT         = 2;

    //FormPermitRouteMaster
    int P_PMT_ROUTE_MAST_ADD                = 1;
    int P_PMT_ROUTE_MAST_MODIFY             = 2;
    int P_PMT_ROUTE_MAST_DEL                = 3;

    
    //........................
    //Tax Module
    //........................
    //FormTaxPenaltyConfiguration
    int P_TAX_PENALTY_SLAB_SAVE             = 1;
    int P_TAX_PENALTY_SLAB_EXPIRE           = 2;    

    //FormTaxCollection
    int P_TAX_TAX_DETAIL_GET                = 1;
    int P_TAX_TAX_DETAIL_INS                = 2;
    int P_TAX_TAX_DETAIL                    = 3;

    //FormTaxExemptionClearence
    int P_TAX_EXEPT_CLEAR_INS               = 1;

    //FormTaxExemption
    int P_TAX_EXEMPTION_SAVE                = 1;

    //FormTaxParameterConfiguration
    int P_TAX_PARAM_CONFIG_SAVE             = 1;

    //FormHolidayConfiguration
    int P_TAX_HOLIDAY_CONFIGURATION         = 1; 

    //FormInstrumentReconciliation
    int P_TAX_INSTRUMENT_RECONCILIATION_UPD = 1;
    
    //FormTaxManualTaxClearanceEntry
    int P_TAX_MANUAL_TAX_CLEARANCE_ENTRY    = 1;
	 
    //FormTaxBalanceEntry
    int P_TAX_BALANCE_ENTRY                 = 1;

    //FormTaxBalanceTaxCollection
    int P_TAX_BALANCE_TAX_COLLECTION        = 1;
    
    //FormTaxInstallmentPayment
    int P_TAX_INSTALLMENT_PAYMENT           = 1;
    
    //FormTaxDetachTrailer
    int P_TAX_DETACH_TRAILER                = 1;

    //FormTaxInstallmentConfiguration
    int P_TAX_INSTALLMENT_CONFIGURATION     = 1;
    
    int P_TAX_ADJUSTMENT_SAVE               =1;

	//kml 30.09.2008
	//FormTaxExemptionCertification
    int P_TAX_EXEM_CERTIFICATION            = 1;

    //DIV
    //FormTaxRefund
   /* int P_TAX_REFUND_DETAIL_GET                = 1;
    int P_TAX_REFUND_DETAIL_INS                = 2;*/
    //........................
    //VerifyApprove Module
    //........................
    //FormVerifyPendingTransactions
    int P_VERAPR_VERIFY_PENDING_NOTVERIFY   = 1;
    int P_VERAPR_VERIFY_PENDING_VERIFY      = 2;    
    int P_VERAPR_APPROVE_PENDING_NOTAPPROVE = 3;
    int P_VERAPR_APPROVE_PENDING_APPROVE    = 4;
    
    //FormVerifyApproveAssignmentOfRegistrationMark
    int P_VER_ASSIGN_MANUAL                 = 1;
    int P_VER_ASSIGN_AUTOMATIC              = 2;
    int P_VER_ASSIGN_MANUAL_CHOICE          = 3;
    
    //venkat
     int P_DUPLICATE_FITNESS_CERTIFICATE    = 1;
    //Akshey Kotwal
     int P_OWNER_ACCEPT_PRINT               = 1;
     int P_OWNER_ACCEPT                     = 2;
    
    //........................
    //VehicleCheck
    //........................    
    //FormVehicleCheck
    int P_VEHICLE_CHECK_SAVE_DATA           = 1;
    
    //................
    // Smart Card : Kamal 14 Oct 2008
    //................
    //FormSmartCard
    int P_SMART_CARD_SAVE_DATA              = 1;
    
    //////////////////////////////////////////////////////////////////////////
    // makeDO() operation Ids
    //////////////////////////////////////////////////////////////////////////
    //........................
    //Fitness Module
    //........................    
    //FormFitnessFee
    int M_FIT_FEE_VEH_NO                    = 1; 
    int M_FIT_FEE_CHASI_NO                  = 2; 

    //FormFitnessTestEntry
    int M_FIT_TEST_ENTER                    = 1; 
    int M_FIT_TEST_EDIT                     = 2; 
    int M_FIT_TEST_VERIFY                   = 3; 
    int M_FIT_TEST_APPROVE                  = 4; 
    int M_FIT_TEST_FITNESS_DTLS             = 5; 
    int M_FIT_TEST_OWNER_DTLS               = 6; 
    int M_FIT_TEST_VERIFY_DTLS              = 7; 
    int M_FIT_TEST_APPROVE_DTLS             = 8; 
    int M_FIT_TEST_MODEL_DTLS               = 9; 

    //FormFitnessBacklog
    int M_FIT_BACKLOG_VEH_NO                = 1;
    int M_FIT_BACKLOG_CHASI_NO              = 2;

    //FormFitnessCancellation
    int M_FIT_CANCELLATION_CANCEL           = 1;
    int M_FIT_CANCELLATION_SUSP             = 2;
    int M_FIT_CANCELLATION_RESTORE          = 3;    

    
    //..........................
    //Enforcement Module
    //..........................
    //FormEnforcementCollectionEntry
    int M_ENF_COLL_VEH_NO                   = 1;
    int M_ENF_COLL_FEE_PAID                 = 2;   
    // FormEnforcementNewChallan
    int M_ENF_NEW_CHALLAN_GET               = 1;
    
    // FormEnforcementDisposeChallan
    int M_ENF_DIS_CHAL_ACCTG                = 1;
    int M_ENF_DIS_CHAL_DETAILS              = 2;   
    int M_ENF_DIS_VEH_IMPND_DETAILS         = 3;
    int M_ENF_DIS_DOC_IMPND_NUM             = 4;
    int M_ENF_DIS_DOC_IMPND_DETAILS         = 5;
    int M_ENF_DIS_VEH_OFFENCES_DETAILS      = 6;
    int M_ENF_DIS_CHAL_BY                   = 7;
    int M_ENF_DIS_VEH_FEE_DETAILS           = 8;
    //........................
    //Registration Module
    //........................    
    //FormRegistrationNOCIssue
    int M_REG_NOC_ISSUE_ENTER               = 1;
    int M_REG_NOC_ISSUE_EDIT                = 2;

    //FormFeeRegisteredVehicle
    int M_REG_FEE_REGVEH_VEH_NO             = 1;
    int M_REG_FEE_REGVEH_CHASI_NO           = 2;

    //FormRegistrationAddressChange
    int M_REG_ADD_CHG_RCPT_NO_ENTER         = 1;
    int M_REG_ADD_CHG_RCPT_NO_EDIT          = 2;

    //FormRegistrationAuditRecovery
    int M_REG_AUDIT_VEH_NO                  = 1;

    //FormRegistrationCancelNOC
    int M_REG_CANCEL_NOC_VEH_NO             = 1;

    //Form Temporary Registration Fee
    int M_REG_FEE_TEMPREG_CHASI_NO          = 1;   

    //FormRegistrationVehicleAlteration
    int M_REG_ALTERATION_OF_A_VEHICLE       = 1;     
    int M_REG_ALTERATION_OF_A_VEHICLE_EDIT  = 2;

    //Form RegistrationRenewRegistration
    int M_REG_RENEWAL_OF_REGISTRATION       = 1;
    int M_REG_RENEWAL_OF_REGISTRATION_EDIT  = 2;

    //FormRegistrationPUCC
    int M_REG_PUCC_VEH_NO                   = 1;

    //FormRegistrationMakerModel
    int M_REG_MODIFY_MODEL                  = 1;

    //FormRegistrationBackLogEntry
    int M_REG_BACKLOG_VEH_NO                = 1;
    int M_REG_BACKLOG_CHASI_NO              = 2;

    //FromRegistrationTransferOwnerSale
    int M_REG_TO_SALE_VEH_NO                = 1;
    int M_REG_TO_SALE_VEH_NO_EDIT           = 2;

    //FormRegistrationTheftReport
    int M_REG_THEFT_VEH_NO                  = 1;

    //FormFeeVehicleConversion
    int M_REG_FEE_VEHICLE_CONVERSION        = 1;

    //FormRegistrationTempRagistration
    int M_REG_TEMP_REG                      = 1;
    int M_REG_TEMP_REG_EDIT                 = 2;

    //FormRegistrationReassignVehicleNo
    int M_REG_REASSIGN_VEH_NO               = 1;
    int M_REG_CHECK_REASSIGN_VEH_EXIST      = 2;
    int M_REG_ASSIGN_VEHNO_GET_CHOICE_NO    = 3;//DIV29thApril2009
    
    //FormRegistrationManageReceiptBook
    int M_REG_MANAGE_RCPT_BOOK              = 1;
    int M_REG_MANAGE_EXPIRE_BOOK            = 2;

    //FormRegistrationOwnerAdmin
    int M_REG_OWNER_ADMIN_VEH_NO            = 1;

    //FormRegistrationRCSurrender
    int M_REG_RC_SURRENDER                  = 1;
    int M_REG_RC_CANCELLATION               = 2;
    int M_REG_RC_RELEASE                    = 3;
    int M_REG_EDIT_RC_SURRENDER             = 4;
    int M_REG_EDIT_RC_RELEASE               = 6;
    
    //FormFeeCollectionDSA
    int M_REG_FEE_DSA_VEH_NO                = 1;    
    
    //FormRegistrationFeeMaster
    int M_REG_FEE_MAST_UPD_REG              = 1; 
    int M_REG_FEE_MAST_UPD_FIT              = 2; 
    int M_REG_FEE_MAST_UPD_PMT              = 3; 
    int M_REG_FEE_MAST_UPD_GEN              = 4; 

    //Form Hyothecation Addition
    int M_HYPOTH_ADD_RCPT_NO                = 1;

    //FormRegistrationTheftCases
    int M_REG_THEFT_CASES_BLOCKED           = 1;
    int M_REG_THEFT_CASES_UNBLOCKED         = 2;

     //FormRegistrationBlockVehicleNo       
    int M_REG_BLOCK_VEHICLE_TABLE           = 1;
    int M_REG_BLOCK_VEHICLE_SERIES          = 2;
    int M_REG_BLOCK_VEHICLE_NO              = 3;
    int M_REG_BLOCK_SERIES_CHECK            = 4;
    int M_REG_BLOCK_VEHICLE_CHECK           = 5;

    //FormRegistrationHypothecationRemove
    int M_REG_HYPOTH_TERM_ENTER             = 1;
    int M_REG_HYPOTH_TERM_EDIT             =  2;

    //FormRegistrationUpdationInsurance
    int M_REG_UPDATE_INSURANCE              = 1;
    int M_HYPOTH_ADD_RCPT_NO_EDIT           = 2;

    //FromRegistrationTransferOwnerDeath
    int M_REG_TO_DEATH_VEH_NO               = 1;
    int M_REG_TO_DEATH_VEH_NO_EDIT          = 2;

    //FormNewVehicle
    int M_REG_NEW_VEHICLE                   = 1;
    int M_REG_NEW_VEHICLE_CHASI_NO          = 2;
    int M_REG_NEW_VEHICLE_RCPT_NO           = 3;
    int M_REG_NEW_TEMP_VEHICLE              = 4;//kml 23/03/2009
    int M_REG_NEW_CHOICE_FEE                = 5;

    //FormRegistrationTempRegRenewal
    int M_REG_RENEWAL_OF_TEMP_REG           = 1;
    
    //FormFeeTrailorRegistration
    int M_REG_FEE_TRAILOR_LINK_CHASI_NO     = 1;
    int M_REG_FEE_TRAILOR_REG_CHASI_NO      = 2; 

    //FormCompleteRegistrationForm          
    int M_REG_COMPLETE_STATUS               = 1;

    //FormRegistrationOwnerDetail
    int M_REG_OWNER_DETAIL_ENTER            = 1;
    int M_REG_OWNER_DETAIL_EDIT             = 2;
    int M_REG_COVER_NOTE_NUMBER             = 3; //--MohnishKr---For CoverNote--17112009---

    //FormSuspentionAndRestorationOfRegistration
    int M_REG_SUSPENTION_REGISTRATION_GET   = 1;
    int M_REG_RESTORATION_REGISTRATION_GET  = 2;    

    // FormFeeReceiptCancellation
    int M_REG_CANCEL_NEW_FEE                = 1;
    int M_REG_CANCEL_OLD_FEE                = 2;
    int M_REG_CANCEL_FIT_FEE                = 3;
    int M_REG_CANCEL_PMT_FEE                = 4;
    int M_REG_CANCEL_TAX_FEE                = 5;
    int M_REG_CANCEL_CHOICE_NUM_FEE         = 6;
    int M_REG_CANCEL_TEMP_REGN_FEE          = 7;

    //FormRegistrationTrailerBacklog
    int M_REG_TRAILER_BACKLOG               = 1;
    int M_REG_TRAILER_BACKLOG_ENTER         = 2;
    
     //FormOwnerAcceptance
    int M_REG_ACCEPT_PRINT_FORM             = 1;
    int M_REG_ACCEPT                        = 2;
    
    //FormPaymentOfAudit
    int M_REG_FEE_PAYMENT_OF_AUDIT          = 1;
    
    //FormFeeChoiceNo
    int M_FEE_CHOICE_NO_PRM                 = 1;
    int M_FEE_CHOICE_NO_NPRM                = 2;
    int M_FEE_CHOICE_NO_CHASSIS             = 3;
    
    //FormFeeTractorRegistration
    int M_REG_FEE_TRACTOR_REG_CHECK         = 1;
    
    //FormRegVehicleMasterUpdation
    int M_REG_ADD_VH_CLASS                  = 1;
    int M_REG_EDIT_VH_CLASS                 = 2;
    int M_REG_VH_CLASS                      = 3;
    int M_REG_VH_CLASS_DTLS                 = 4;
    
    //FormRegistrationReceiptCorrection
    int M_REG_FITNESS_RCPT_CORRECTION       = 1;
    int M_REG_VEH_RCPT_CORRECTION           = 2;
    int M_REG_PERMIT_RCPT_CORRECTION        = 3;
    int M_REG_TAX_RCPT_CORRECTION           = 4;
    int M_REG_CHECK_VEH_EXIST               = 5;
   
    //FormRegistrationIntercahngeVehNo    
    int M_REG_INTERCHANGE                   = 1;
    int M_REG_INTERCHANGE2                  = 2; 

    // FormRegistrationTransferOwnerInsurance
    int M_REG_TO_INSURANCE_VEH_NO           = 1;
    int M_REG_TO_INSURANCE_VEH_NO_EDIT      = 2;
    
    //FormFeeAdjustment
    int M_FEE_ADJUSTMENT_VEH_NO             = 1;
    int M_FEE_ADJUSTMENT_CHASI_NO           = 2;
    
    //vivek 30jan2009
    //Form Duplicate Registration Certificate
    int M_REG_DUPLICATE_RC                  = 1;
    int M_REG_DUPLICATE_RC_EDIT             = 2;
    
   //DIV 09-02-2009
    //FormRegistrationFreshRcInTheNameOfFinancer
    int M_REG_FRESH_RC                      = 1;
    int M_REG_FRESH_RC_EDIT                 = 2;  //----MohnishKr-----05062009-----Added for edit case. 
    //........................
    //Permit Module
    //........................    
    ////FormPermitRestorePassengerPermit  
    int M_PMT_PSN_RSTR_PMT_NO_GET           = 1;
    int M_PMT_PSN_RSTR_PMT_NO_INS           = 2; 

    //FormPermitSurrenderPassengerPermit
    int M_PMT_PSN_SURR_PMT_NO_GET           = 1;
    int M_PMT_PSN_SURR_PMT_NO_INS           = 2;

    //FormPermitRestoreGoodsPermit
    int M_PMT_GD_RSTR_PMT_NO_GET            = 1;    
    int M_PMT_GD_RSTR_PMT_NO_INS            = 2;

    //FormPermitSurrenderGoodsPermit
    int M_PMT_GD_SURR_PMT_NO_GET            = 1;    
    int M_PMT_GD_SURR_PMT_NO_INS            = 2;

    //FormPermitPassengerPmtDetails
    int M_PMT_PASS_FEE_ENTER                = 1;
     int M_PMT_PASS_FEE_EDIT               = 2;
     int M_PMT_FEE_VEH_NO_AIF    =3;
    

    //FormPermitGoodsPerrmitDetails
    int M_PMT_GOODS_FEE_ENTER               = 1;

    //FormPermitPassengerBacklog
    int M_PMT_PASS_BACKLOG_VEH_DETAILS_GET  = 1;
    int M_PMT_PASS_BACKLOG_PMT_DETAILS_GET  = 2;

    //FormPermitGoodsBacklog
    int M_PMT_GOODS_BACKLOG_VEH_DETAILS_GET = 1;
    int M_PMT_GOODS_BACKLOG_PMT_DETAILS_GET = 2;

    //FormPermitAuthorizationModification
    int M_PMT_AUTH_VEH_DETAILS_GET          = 1;
    int M_PMT_AUTH_PMT_DETAILS_GET          = 2;  
  
    //FormPermitIssueSpecialPermit
    int M_PMT_ISSUE_SPECIAL_PERMIT          = 1;
    int M_PMT_ISSUE_SPECIAL_PERMIT_EDIT     = 2;

    //FormFeePermitFee
    int M_PMT_FEE_VEH_NO                    = 1;   
 
    //FormPermitTemporaryPermit
    int M_PMT_ISS_TMP_RCPT_NO_ENTER         = 1;        
    int M_PMT_ISS_TMP_RCPT_NO_EDIT          = 2;

    //FormPermitRouteMaster
    int M_PMT_ROUTE_MAST_ROUTE_CODE         = 1;
    int M_PMT_ROUTE_MAST_ROUTE_CODE_MODI    = 2;
    int M_PMT_ROUTE_MAST_ROUTE_CODE_DEL     = 3;
    
    
    //........................
    //Tax Module
    //........................
    //FormTaxPenaltyConfiguration
    int M_TAX_PENALTY_SLAB_GET              = 1;
    int M_TAX_PENALTY_SLAB_CHECK            = 2;

    //FormTaxCollection
    int M_TAX_REGN_NO_DETAIL_GET            = 1;
    //(Used in FormFeeNewVehicle)
    int M_TAX_FEE_NEWVEH_TAX_PARAM_GET      = 2;
    
    //FormTaxExemptionClearence
    int M_TAX_EXEPT_CLEAR_GET               = 1;

    //FormTaxExemption  
    int M_TAX_EXEMPTION_REGNNO_CHECK        = 1;
    int M_TAX_EXEMPTION_MAXDATE_GET         = 2;

    //FormHolidayConfiguration
    int M_TAX_HOLIDAY_COFIGURATION          = 1;

    //FormInstrumentReconciliation
    int M_TAX_INSTRUMENT_RECONCILIATION_GET = 1;    
    
    //FormTaxManualTaxClearanceEntry
    int M_TAX_MANUAL_TAX_CLEARANCE_ENTRY    = 1;    

    //FormTaxBalanceEntry
    int M_TAX_BALANCE_ENTRY                 = 1;
 
    //FromtaxBalanceTaxCollection
    int M_TAX_BALANCE_TAX_COLLECTION        = 1;
    
    //FormTaxInstallmentPayment
    int M_TAX_INSTALLMENT_PAYMENT           = 1;

    //FormTaxDetachTrailer
    int M_TAX_DETACH_TRAILER                = 1;

    //FormTaxInstallmentConfiguration
    int M_TAX_INSTALLMENT_CONFIGURATION     = 1;
    int M_TAX_INSTALLMENT_GET_TAX_DETAILS   = 2;
    
    //FormTaxDefaulterList
    int M_TAX_GET_DEFAULTER_LIST            = 1;
   
    int M_TAX_ADJUSTMENT_REGNNO_CHECK          =1;

	//kml 30.09.08
    int M_TAX_EXEM_CERTIFICATION            = 1;

    //DIV
    //FormTaxCollection
    //int M_TAX_REFUND_REGN_NO_DETAIL_GET            = 1;
    //........................
    //VerifyApprove Module
    //........................    
    //FormVerifyPendingTransactions
    int M_VERAPR_VERIFY_PENDING             = 1;       
    //FormVerifyApproveAssignmentOfRegistrationMark
    int M_VER_ASSIGN_VEHNO_NO_FANCY         = 1;
    int M_VER_ASSIGN_VEHNO_FANCY            = 2;
    int M_VER_ASSIGN_VEHNO_BLOCK_CHK        = 3;
    int M_VER_ASSIGN_VEHNO_GET_BLOCK_LIST   = 4;
    int M_VER_ASSIGN_VEHNO_GET_CHOICE_NO    = 5;
    
    
    //........................
    //VehicleCheck
    //........................    
    //FormVehicleCheck
    int M_VEHICLE_CHECK_GET_DATA            = 1;
    int M_CHECK_CHASSIS_GET_DATA            = 2;   
    
    
    //........................
    //Report Module
    //........................    
    //FormFeeReportDayEndCashStatement
    int P_REP_DAY_END_CASH_STATEMENT        = 1;
    int P_REP_DAY_END_CONSOLIDATE_STATE     = 2;
    
    int P_REP_ONLINE_TAX_TOKEN_PRINT        = 1;//vnkt 26Nov2011
    
    int P_REP_POSTAL_CHARGE_REPORT     = 1;//vnkt 29Nov2011
    
     //................
    // Smart Card : Kamal 14 Oct 2008
    //................
    //FormSmartCard
    int M_SMART_CARD_GET_DATA              = 1; // for one record;
    int M_SMART_CARD_GET_DATA_MANY         = 2; // for multiple records;
    int M_SMART_CARD_GET_DATA_ON_DEMAND    = 3; // For producing SmartCard on Demand without checking its Status.
    
    // For Smart Card Update with Pupose Code      Start
    int M_SMART_CARD_UPDATE_TAX_DETAILS               = 58;
    int M_SMART_CARD_UPDATE_ADD_HYPOTHECATION         = 50;  
    int M_SMART_CARD_UPDATE_CANCEL_HYPOTHECATION      = 51;  
    int M_SMART_CARD_UPDATE_FITNESS_DETAILS           = 11;  
    int M_SMART_CARD_UPDATE_NOC_DETAILS               = 1;  
    // For Smart Card Update with Pupose Code       End
    
      int M_DUPLICATE_FITNESS_CERTIFICATE    = 1;
      
      //venkat--02July2009---for Import Dealer Registration Data.
    int P_IMPORT_DEALER_TMP_DTLS                 = 1;
    int M_CHECK_DEALER_TMP_DTLS                  = 2;
    int M_CHECK_DEALER_VEHICLE_DTLS              = 3;
    int M_DEALER_COVER_NOTE_NUMBER               = 4;
    //venkat--02July2009---for Import Backlog Dealer Registration Data.
    int M_GET_DEALER_REG_BACKLOG_DTLS            = 1;
    int P_IMPORT_BACKLOG_DEALER_REG_DTLS         = 2;
    
    
     int M_GET_REG_BACKLOG_DTLS            = 3;
     
     ////Subhasis--3Sep2010--
      int M_FEE_TEMPORARY_PERMIT              =1;
      int P_FEE_TEMPORARY_PERMIT              = 2;
      //Prashant-For Printing-3Sep2010   
       int  M_PMT_PERMIT_VEH_NO =3;   
       
        //HSRP Save
    int P_HSRP_TRANS = 1;
    int M_HSRP_TRANS = 1;
    int P_HSRP_UPDATE = 1;
    int M_HSRP_UPDATE = 1;
    int P_HSRP_PRINT = 1;
    int P_HSRP_PRINT_OLD = 2;
    int M_HSRP_PRINT = 1;
    int P_HSRP_DUP_PRINT = 1;
    int P_HSRP_DUP_FLAT_FILE = 1;
    int P_HSRP_DUP_FLAT_FILE_NEW = 2;
    
    
    
    //Dup Tax print
    int P_DUP_TAX_PRINT = 1;
    int M_DUP_TAX_PRINT = 2;
    
}