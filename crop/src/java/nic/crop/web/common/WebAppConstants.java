package nic.crop.web.common;

public class WebAppConstants {
	public static final String INPUT_OBJECT = "client_context";
	public static final String EMAIL_ID = "emailid";
	public static final String USER_ID = "userid";
	public static final String CASE_TYPE = "caseType";
	public static final String CR_TYPE = "crType";
	public static final String CASE_REF_NO = "caseRefNum";

	public static class CreateUserBeanConstants {
		public static int ID_PROOF_NOT_SELECTED = 1;
		public static int ID_PROOF_NUMBER_EMPTY = 2;
		// public static int FILE_NOT_UPLOADED = 2;
	}

	public static class OtpConstants {

		public static final int OTP_LENGTH = 7;

	}

	public static class AddressTypeConstants {
		public static String COMPLAINANT_ADDRESS = "C";
		public static String RESPONDENT_ADDRESS = "R";
		public static String COMPLAINANT_ADVOCATE_ADDRESS = "CA";
		public static String RESPONDENT_ADVOCATE_ADDRESS = "RA";
	}

	/**
	 * If updating values in casefiling constants then make same changes in
	 * service layers, ServiceConstans.java also to keep both values in sync.
	 * 
	 * @author ambrish
	 *
	 */
	public static class CaseFilingStages {
		// Pending Draft Consumer is Still not finalized the case
		public static final String PENDDRAFT = "PENDDRAFT";
		// Pending Payment Consumer has finalized the case and pending for
		// payment
		public static final String PENDPYMNT = "PENDPYMNT";
		// Pending for approval - case details has beeen entered and payment
		// done by consume, now case is pending for forum user to review and
		// accept/reject/forward to other forum
		public static final String PENDAPPRV = "PENDAPPRV";
		// case is approved/accepted by the forum
		public static final String APPROVED = "APPROVED";
		public static final String REVERT = "REVERT";
		public static final String FORWARD = "FORWARD";
		public static final String FRCASE = "FRCASE";
		public static final String NA = "N/A";

	}

	/**
	 * this constants is used to identified user type. i.e Consumer / Forum
	 * user.
	 * 
	 * @author ambrish
	 *
	 */
	public static class UserType {
		// Pending Draft Consumer is Still not finalized the case
		public static final String CONSUMER = "CONSUMMER";
		// Pending Payment Consumer has finalized the case and pending for
		// payment
		public static final String FORUM = "FORUM";

	}

	/**
	 * BankPaymentStatus is used to identified bank send status in the response
	 * of a 'payment' / 'payment status check' request
	 * */
	public static class BankPaymentStatus {
		public static String PENDING = "P";
		public static String SUCCESSFUL = "S";
		public static String FAILED = "F";

	}
}
